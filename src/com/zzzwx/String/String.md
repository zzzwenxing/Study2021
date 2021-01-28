# String Pool
## new String("abc")
### 场景一
使用这种方式一共会创建两个字符串对象,（前提是 String Pool 中还没有 "abc" 字符串对象）。   
``` java 
public class Main { 
    public static void main(String[] args) {   
        String a = new String("1");  
        a.intern();  
        String b = "1"; 
        System.out.println(a == b); 
    }
}
```
* String a = new String(“1”); 这一行，创建了两个对象，一个在常量池中，一个在堆中，a 指向了堆中的 String 对象。
* a.intern(); 这一行，是把 a 这个字符串对象放入到常量池中，这里注意，前面已经在常量池进行了存储，所以这里是不会再把 a 放入到常量池中。
* String b = “1”; 这个 b 是指向了常量池中。
* System.out.println(a == b); 通过上面的分析，相信很容易看出是false，因为 a 和 b 不是同一个对象，一个指向的是堆中的，一个指向的是常量池中。

### 场景二
``` java
public class Main {  
    public static void main(String[] args) { 
        String a = new String("1").intern();  
        String b = "1";  
        System.out.println(a == b); 
    }
}
```
* String a = new String(“1”).intern(); 首先在这里，还是创建了两个对象，然后调用了 intern() 方法，在前面介绍 intern 的定义的时候，当调用 intern 方法的时候，会返回在常量池中的对象，所以这时候 a 其实指向的是常量池中的。

* String b = “1”; 这没什么好说的，也是指向常量池中。

* System.out.println(a == b); 那么两个都是指向同一个地方，肯定为true。

* 这里需要注意一点，我们就是当任意一个字符串，a.equals(b) 的时候，a.intern() == b.intern() 为 true。
### 场景三
``` java
public class Main { 
    public static void main(String[] args) { 
        String a = new String("1") + new String("2");   
        a.intern(); 
        String b = "12";  
        System.out.println(a == b); 
    }
}
```

这里可能有的人会输出 false，有的人输出 true，这是为什么呢？  
其实这是因为不同版本(具体是 jdk7 之前和 jdk6 以后)的 java 内存划分有所区别，导致了输出的内容也有所差异，下面让我们来分析下上面的代码

* String a = new String(“1”) + new String(“2”); 这里其实创建了 5 个对象，常量池中的 “1” 和 “2” 对象以及堆中的 “1”, “2” 以及 “12” 对象,这里为什么常量池中没有 “12” 这个字符串对象呢，其实是因为当我们使用变量拼接的时候，java 会帮我们优化成 StringBuilder 对象进行append,最后在调用 toString 返回一个对象给我们，所以常量池中是没有这个字符串对象的。
* a.intern(); 这里会把 a 字符串对象存储到常量池中(注意，这时候常量池中是没有 “12” 这个字符串对象的)。在 jdk7 之前，常量池是在 perm space 中的，也就是常说的永久代或者方法区中，当我们调用 intern() 的时候，其实是重新把 a 的值 copy 到常量池中，这时候，因为 a 指向的是堆中的引用，而 b 是常量池中那份 copy 过来的值，所以肯定是不相等的。在 jdk6 以后，常量池是移出了 perm space 放入到堆中了，并且调用 intern 方法的时候是直接存储了堆中的引用，所以 b 和 a 比较是 true。
### 场景四
``` java
public class Main {  
	public static void main(String[] args) { 
        String a = new String("1") + new String("2");
        String b = "12"; 
        a.intern();  
        System.out.println(a == b);
    }
}
```
* String a = new String(“1”) + new String(“2”); 这里跟之前一样就不过多分析了
* String b = “12”; 这里其实会在常量池中存储一个字符串对象
* a.intern(); 调用intern() 方法
* 最后输出是 false，相信看了之前那么多分析，也明白清楚了，因为 a 指向的是堆中的，而 b 是在常量池中的，虽然调用 a.intern 方法，但是由于常量池中已经存在了，所以不会再去存储一份，自然而然输出也是 false。

### Q：下列程序的输出结果：
``` java
String s1 = “abc”;
final String s2 = “a”;
final String s3 = “bc”;
String s4 = s2 + s3;
System.out.println(s1 == s4);
```

true，因为final变量在编译后会直接替换成对应的值，所以实际上等于s4=”a”+”bc”，而这种情况下，编译器会直接合并为s4=”abc”，所以最终s1==s4。
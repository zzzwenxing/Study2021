package com.zzzwx.Generic;

import java.util.Random;

/**
 * @author zhuwenxing
 * @ClassName FruitGeneratorV1
 * @date 2021-04-20 14:28
 * @description: FruitGeneratorV1
 * @version: 1.0
 */
public class FruitGeneratorV1 implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}

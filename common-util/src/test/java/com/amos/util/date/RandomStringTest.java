package com.amos.util.date;

import com.amos.util.random.RandomStringUtils;

/**
 * DESCRIPTION: RandomStringTest
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class RandomStringTest {

    public static void main(String[] args) {
        System.out.println(RandomStringUtils.zero(10));
        System.out.println(RandomStringUtils.number(10));
        System.out.println(RandomStringUtils.letter(10));
        System.out.println(RandomStringUtils.letterLower(10));
        System.out.println(RandomStringUtils.letterUpper(10));
        System.out.println(RandomStringUtils.numberAndLetter(10));
    }

}

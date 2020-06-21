package com.amos.common.util.random;

import java.util.Random;

/**
 * DESCRIPTION: SpringBeanUtils
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class RandomStringUtils {

    private static final String NUM_AND_LETTER = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ONLY_LETTER = "abcdefghijkllmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ONLY_NUM = "0123456789";

    /**
     * 返回一个定长的随机字符串(只包含大小写字母、数字)
     *
     * @param length 随机串长度
     * @return 随机字符串
     */
    public static String numberAndLetter(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(NUM_AND_LETTER.charAt(random.nextInt(NUM_AND_LETTER.length())));
        }
        return sb.toString();
    }

    /**
     * 返回一个定长的随机數字字符串(只包含数字)
     *
     * @param length 随机串长度
     * @return 随机字符串
     */
    public static String number(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(ONLY_NUM.charAt(random.nextInt(ONLY_NUM.length())));
        }
        return sb.toString();
    }

    /**
     * 返回一个定长的随机纯字母字符串(只包含大小写字母)
     *
     * @param length 随机串长度
     * @return 随机字符串
     */
    public static String letter(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(ONLY_LETTER.charAt(random.nextInt(ONLY_LETTER.length())));
        }
        return sb.toString();
    }

    /**
     * 返回一个定长的随机纯大写字母字符串(只包含小写字母)
     *
     * @param length 随机串长度
     * @return 随机字符串
     */
    public static String letterLower(int length) {
        return letter(length).toLowerCase();
    }

    /**
     * 返回一个定长的随机纯小写字母字符串(只包含大写字母)
     *
     * @param length 随机串长度
     * @return 随机字符串
     */
    public static String letterUpper(int length) {
        return letter(length).toUpperCase();
    }

    /**
     * 生成一个定长的纯 0字符串
     *
     * @param length 随机串长度
     * @return 纯0字符串
     */
    public static String zero(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append('0');
        }
        return sb.toString();
    }

}

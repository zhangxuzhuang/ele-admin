package com.ruoyi.common.utils;


import org.springframework.util.Base64Utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;

/**
 * @author qiurui
 * @Date 2016年3月8日下午5:27:49
 */
public class AESUtil {

    private final static String CHAR_ENCODING = "UTF-8";
    private final static String AES_ALGORITHM = "AES/ECB/PKCS5Padding";

    public final static String AES_KEY = "YafyuNHCEMDDAaTT";
    /**
     * AES加密
     *
     * @param data
     * @param key
     * @return
     * @throws UnsupportedEncodingException
     * @author qiurui
     * @Date 2015-8-24
     */
    public static String encryptToBase64(String data, String key) {
        try {
            byte[] valueByte = encrypt(data.getBytes(CHAR_ENCODING), key.getBytes(CHAR_ENCODING));
            return new String(Base64Utils.encode(valueByte));
        } catch (UnsupportedEncodingException e) {

        }
        return null;
    }

    /**
     * AES解密
     *
     * @param data
     * @param key
     * @return
     * @author qiurui
     * @Date 2015-8-24
     */
    public static String decryptFromBase64(String data, String key) {
        try {
            byte[] originalData = Base64Utils.decode(data.getBytes(CHAR_ENCODING));
            byte[] valueByte = decrypt(originalData, key.getBytes(CHAR_ENCODING));
            return new String(valueByte, CHAR_ENCODING);
        } catch (UnsupportedEncodingException e) {

        } catch (Exception e) {

        }
        return null;
    }

    private static byte[] encrypt(byte[] data, byte[] key) {
        if (key.length != 16) {
            throw new RuntimeException("Invalid AES key length (must be 16 bytes)");
        }
        try {
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec seckey = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);// 创建密码器
            cipher.init(Cipher.ENCRYPT_MODE, seckey);// 初始化
            byte[] result = cipher.doFinal(data);
            return result; // 加密
        } catch (Exception e) {

        }
        return null;
    }

    private static byte[] decrypt(byte[] data, byte[] key) {
        if (key.length != 16) {
            throw new RuntimeException("Invalid AES key length (must be 16 bytes)");
        }
        try {
            SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec seckey = new SecretKeySpec(enCodeFormat, "AES");
            Cipher cipher = Cipher.getInstance(AES_ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, seckey);
            return cipher.doFinal(data);
        } catch (Exception e) {

        }
        return null;
    }
}

package com.xq.account.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/26 15:49
 */
public class FileUtils {

    private static final Logger log = LoggerFactory.getLogger(FileUtils.class);

    /**
     * 根据云图片路径生成byte字节数组
     *
     * @param img 阿里云图片路径
     * @return 返回图片的字节数组
     */
    public byte[] imgPathBytes(String img) {

        // 设置参数
        InputStream in = null;
        ByteArrayOutputStream byteArrOps = null;
        int length;
        byte[] buffer = new byte[1024 * 5];
        byte[] data = null;

        try {
            URL url = new URL(img);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(1000 * 60);
            if (urlConnection.getResponseCode() == 200) {
                in = urlConnection.getInputStream();
                byteArrOps = new ByteArrayOutputStream();
                while ((length = in.read(buffer)) != -1) {
                    byteArrOps.write(buffer, 0, length);
                }
                byteArrOps.flush();
                data = byteArrOps.toByteArray();
                // 下载大小: data.length
            }
        } catch (Exception e) {
            log.error("图片上传出现异常: {}, url为： {}", e, img);
            return null;
        } finally {
            try {
                if (byteArrOps != null) {
                    byteArrOps.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                log.error("关闭异常", e);
            }
        }
        return data;
    }

    /**
     * 合并字节数组
     */
    public byte[] byteMerger(byte[]... byteList) {
        int lengthByte = 0;
        for (int i = 0; i < byteList.length; i++) {
            lengthByte += byteList[i].length;
        }
        byte[] allByte = new byte[lengthByte];
        int countLength = 0;
        for (int i = 0; i < byteList.length; i++) {
            byte[] b = byteList[i];
            System.arraycopy(b, 0, allByte, countLength, b.length);
            countLength += b.length;
        }
        return allByte;
    }
}

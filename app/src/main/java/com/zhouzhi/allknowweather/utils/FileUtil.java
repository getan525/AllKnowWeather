package com.zhouzhi.allknowweather.utils;

import android.content.Context;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {
    public static String readAssets(Context context,String fileName){
        String content = "";
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(fileName);
            if (inputStream!=null){
                byte[] buffer = new byte[1024];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true){
                    int readLine = inputStream.read(buffer);
                    if (readLine==-1) break;
                    byteArrayOutputStream.write(buffer,0,readLine);
                }
               inputStream.close();
                byteArrayOutputStream.close();
                content = new String(byteArrayOutputStream.toByteArray());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return content;
    }
}

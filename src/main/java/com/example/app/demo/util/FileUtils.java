package com.example.app.demo.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtils {
	public static void main(String[] args) {
		/**
		 * 1.先将文件中的内容读入到缓冲输入流中 2.将输入流中的数据通过缓冲输出流写入到目标文件中 3.关闭输入流和输出流
		 */
		try {
			long begin = System.currentTimeMillis();
			FileInputStream fis = new FileInputStream("D:\\\\ZIP\\A\\jdk-8u152-windows-x64.exe");
			BufferedInputStream bis = new BufferedInputStream(fis);

			FileOutputStream fos = new FileOutputStream("D:\\\\ZIP\\B\\jdk-8u152-windows-x64.exe");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			int size = 0;
			byte[] buffer = new byte[1024*10];
			while ((size = bis.read(buffer)) != -1) {
				System.out.println(size);
				bos.write(buffer, 0, size);
			}
			// 刷新此缓冲的输出流，保证数据全部都能写出
			bos.flush();
			bos.close();
			bis.close();
			long end = System.currentTimeMillis();
			System.out.println("使用缓冲输出流和缓冲输入流实现文件的复制完毕！耗时：" + (end - begin) + "毫秒");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

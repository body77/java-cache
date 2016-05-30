package com.ict.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 直接读取跟加入缓冲区的读取
 * @author Administrator
 *
 */
public class BufferedWriterDemo {
	
	public static void main(String[] args) throws IOException {
		BufferedFileWriterMethod();
		FileWriterMethod();
	}
	
	/**
	 * 
	 * 带有缓冲区的读取
	 * 把数据先放到漏斗里然后在放到容器里
	 * 速度快，
	 * @throws IOException
	 */
	private static void BufferedFileWriterMethod() throws IOException{
		String str = "D:\\temp\\map.text";
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(str)));
		long begin = System.currentTimeMillis();
		for(int i = 0;i < 100000; i++){
			bw.write(i);
			
		}
		bw.close();
		System.out.println("testFileWriter:"+(System.currentTimeMillis()-begin));
	}

	/**
	 * 不带缓冲区的读取
	 * 把数据直接放到容器里
	 * 速度慢
	 * @throws IOException
	 */
	private static void FileWriterMethod() throws IOException {
		String str = "D:\\temp\\map.text";
		Writer writer = new FileWriter(new File(str));
		long begin = System.currentTimeMillis();
		for(int i = 0;i < 100000; i++){
			writer.write(i);
			
		}
		writer.close();
		System.out.println("testFileWriter:"+(System.currentTimeMillis()-begin));
	}

}

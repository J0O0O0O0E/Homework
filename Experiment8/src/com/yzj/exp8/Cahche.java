package com.yzj.exp8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class IOTest {

	public static void main(String[] args) {
		String fileName = "C:/example/from.txt";

		/*
		 * System.out.println("----- 创建文件 ------"); createFile(fileName);
		 * 
		 * System.out.println("-----  将字符串写入文件 -------"); // \r\n在txt文本中换行 String str =
		 * "白日依山尽\r\n" + "黄河入海流\r\n" + "欲穷千里目\r\n" + "更上一层楼\r\n"; writeToFile(fileName,
		 * str);
		 */

		// System.out.println("--------- 基于基本IO流实现文件的复制 ----------");
		String toFile = "C:/example/to.txt";
		// copyByIO(fileName, toFile);

		// System.out.println("--------- 基于NIO实现文件的复制 ----------");
		// String toFile2 = "C:/example/nio/to.txt";
		// copyByNIO(fileName, toFile2);

		// System.out.println("---------- 删除指定文件 -------------");
		// deleteFile(toFile);
		System.out.println("---------- 遍历指定目录文件 -------------");
		String dir = "C:/example";
		walkDirectories(dir);
	}

	/**
	 * 基于指定文件名称创建目录及文件 如果文件已经存在，则忽略
	 *
	 * @param fileName
	 */
	private static void createFile(String fileName) {

		Path file = Paths.get(fileName);
		try {
			Files.createDirectories(file.getParent());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.createFile(file);
			System.out.println("文件创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 提示：文件以字节操作，因此可以 字符串，转字节数组，直接基于Files写入文件
	 *
	 * @param fileName
	 * @param content
	 */
	private static void writeToFile(String fileName, String content) {

		byte[] buffer = content.getBytes();
		Path file = Paths.get(fileName);
		try {
			Files.write(file, buffer, StandardOpenOption.APPEND);
			System.out.println("写入成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 基于基本IO，以及字节数组缓冲区，复制文件 打印显示循环读写循环次数
	 *
	 * @param sourceFile
	 * @param targetFile
	 */
	private static void copyByIO(String sourceFile, String targetFile) {

		int count = 0;
		try (FileInputStream in = new FileInputStream(sourceFile);
				FileOutputStream out = new FileOutputStream(targetFile);) {

			byte[] buffer = new byte[10];
			int c = 0;
			while ((c = in.read()) != -1) {

				out.write(c);
				count++;
			}
			System.out.println("复制成功,循环读写了" + count + '次');
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 基于NIO，实现文件的复制
	 *
	 * @param sourceFile
	 * @param targetFile
	 */
	private static void copyByNIO(String sourceFile, String targetFile) {

		Path source = Paths.get(sourceFile);
		Path target = Paths.get(targetFile);
		try {
			Files.createDirectories(target.getParent());
			Files.copy(source, target);
			System.out.println("复制成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 删除文件
	 *
	 * @param fileName
	 */
	private static void deleteFile(String fileName) {

		Path file = Paths.get(fileName);
		try {
			boolean b = Files.deleteIfExists(file);
			if (b)
				System.out.println("删除成功");
			else
				System.out.println("文件不存在,删除失败");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 遍历打印指定目录下全部目录/文件名称
	 *
	 * @param dir
	 */
	private static void walkDirectories(String dir) {

		Path dirs = Paths.get(dir);
		try {
			Files.walk(dirs).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("打印完毕");
		}

	}
}

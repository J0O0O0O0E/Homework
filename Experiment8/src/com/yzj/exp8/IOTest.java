package com.yzj.exp8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class IOTest {
	public static void main(String[] args) {
		String fileName = "C:/Users/joe42/Desktop/Exp8/yzj_exp8.txt";

		System.out.println("--------- 创建文件---------");
		createFile(fileName);

		System.out.println("--------- 将字符串写入文件 ---------");
		String str = "白日依山尽\r\n" + "黄河入海流\r\n" + "欲穷千里目\r\n" + "更上一层楼\r\n";
		writeToFile(fileName, str);

		System.out.println("--------- 基于基本IO流实现文件的复制 ---------");
		String toFile = "C:/Users/joe42/Desktop/Exp8/yzj_exp8_Copy_IO.txt";
		copyByIO(fileName, toFile);

		System.out.println("--------- 基于NIO实现文件的复制 ---------");
		String toFile2 = "C:/Users/joe42/Desktop/Exp8/yzj_exp8_Copy_NIO.txt";
		copyByNIO(fileName, toFile2);

		System.out.println("--------- 删除指定文件 ---------");
		deleteFile(toFile);
		System.out.println("--------- 遍历指定目录文件 ---------");
		String dir = "C:/Users/joe42/Desktop/Exp8";
		walkDirectories(dir);
	}

	/**
	 * 基于指定文件名称创建目录及文件 如果文件已经存在，则忽略
	 *
	 * @param fileName
	 */
	private static void createFile(String fileName) {
		try {
			Files.createDirectory(Paths.get(fileName).getParent());
			System.out.println("目录创建完成");
		} catch (FileAlreadyExistsException e) {
			System.err.println("目录已存在,不再创建目录");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Files.createFile(Paths.get(fileName));
			System.out.println("文件创建完成");
		} catch (FileAlreadyExistsException e) {
			System.err.println("文件已存在,不再创建文件");
		} catch (IOException e) {
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
		try {
			Files.write(Paths.get(fileName), buffer, StandardOpenOption.APPEND);
			System.out.println("文本追加完成");
		} catch (IOException e) {
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
		int counter = 0;
		try (var in = new FileInputStream(sourceFile); var out = new FileOutputStream(targetFile)) {
			byte[] buffer = new byte[4];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
				counter++;
			}
			System.out.println("IO流方式复制完成,循环次数(4Byte):" + counter);
		} catch (IOException e) {
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
		try {
			Files.copy(Paths.get(sourceFile), Paths.get(targetFile), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("NIO方式复制完成");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除文件
	 *
	 * @param fileName
	 */
	private static void deleteFile(String fileName) {
		try {
			if (Files.deleteIfExists(Paths.get(fileName))) {

				System.out.println("文件删除完成");
			} else {

				System.out.println("文件不存在,未删除任何文件");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 遍历打印指定目录下全部目录/文件名称
	 *
	 * @param dir
	 */
	private static void walkDirectories(String dir) {
		try {
			Files.walk(Paths.get(dir)).forEach(System.out::println);
			System.out.println("已列出所有文件");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

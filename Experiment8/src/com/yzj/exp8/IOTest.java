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

		System.out.println("--------- �����ļ�---------");
		createFile(fileName);

		System.out.println("--------- ���ַ���д���ļ� ---------");
		String str = "������ɽ��\r\n" + "�ƺ��뺣��\r\n" + "����ǧ��Ŀ\r\n" + "����һ��¥\r\n";
		writeToFile(fileName, str);

		System.out.println("--------- ���ڻ���IO��ʵ���ļ��ĸ��� ---------");
		String toFile = "C:/Users/joe42/Desktop/Exp8/yzj_exp8_Copy_IO.txt";
		copyByIO(fileName, toFile);

		System.out.println("--------- ����NIOʵ���ļ��ĸ��� ---------");
		String toFile2 = "C:/Users/joe42/Desktop/Exp8/yzj_exp8_Copy_NIO.txt";
		copyByNIO(fileName, toFile2);

		System.out.println("--------- ɾ��ָ���ļ� ---------");
		deleteFile(toFile);
		System.out.println("--------- ����ָ��Ŀ¼�ļ� ---------");
		String dir = "C:/Users/joe42/Desktop/Exp8";
		walkDirectories(dir);
	}

	/**
	 * ����ָ���ļ����ƴ���Ŀ¼���ļ� ����ļ��Ѿ����ڣ������
	 *
	 * @param fileName
	 */
	private static void createFile(String fileName) {
		try {
			Files.createDirectory(Paths.get(fileName).getParent());
			System.out.println("Ŀ¼�������");
		} catch (FileAlreadyExistsException e) {
			System.err.println("Ŀ¼�Ѵ���,���ٴ���Ŀ¼");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Files.createFile(Paths.get(fileName));
			System.out.println("�ļ��������");
		} catch (FileAlreadyExistsException e) {
			System.err.println("�ļ��Ѵ���,���ٴ����ļ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ʾ���ļ����ֽڲ�������˿��� �ַ�����ת�ֽ����飬ֱ�ӻ���Filesд���ļ�
	 *
	 * @param fileName
	 * @param content
	 */
	private static void writeToFile(String fileName, String content) {
		byte[] buffer = content.getBytes();
		try {
			Files.write(Paths.get(fileName), buffer, StandardOpenOption.APPEND);
			System.out.println("�ı�׷�����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ���ڻ���IO���Լ��ֽ����黺�����������ļ� ��ӡ��ʾѭ����дѭ������
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
			System.out.println("IO����ʽ�������,ѭ������(4Byte):" + counter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ����NIO��ʵ���ļ��ĸ���
	 *
	 * @param sourceFile
	 * @param targetFile
	 */
	private static void copyByNIO(String sourceFile, String targetFile) {
		try {
			Files.copy(Paths.get(sourceFile), Paths.get(targetFile), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("NIO��ʽ�������");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ɾ���ļ�
	 *
	 * @param fileName
	 */
	private static void deleteFile(String fileName) {
		try {
			if (Files.deleteIfExists(Paths.get(fileName))) {

				System.out.println("�ļ�ɾ�����");
			} else {

				System.out.println("�ļ�������,δɾ���κ��ļ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ������ӡָ��Ŀ¼��ȫ��Ŀ¼/�ļ�����
	 *
	 * @param dir
	 */
	private static void walkDirectories(String dir) {
		try {
			Files.walk(Paths.get(dir)).forEach(System.out::println);
			System.out.println("���г������ļ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

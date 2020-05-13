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
		 * System.out.println("----- �����ļ� ------"); createFile(fileName);
		 * 
		 * System.out.println("-----  ���ַ���д���ļ� -------"); // \r\n��txt�ı��л��� String str =
		 * "������ɽ��\r\n" + "�ƺ��뺣��\r\n" + "����ǧ��Ŀ\r\n" + "����һ��¥\r\n"; writeToFile(fileName,
		 * str);
		 */

		// System.out.println("--------- ���ڻ���IO��ʵ���ļ��ĸ��� ----------");
		String toFile = "C:/example/to.txt";
		// copyByIO(fileName, toFile);

		// System.out.println("--------- ����NIOʵ���ļ��ĸ��� ----------");
		// String toFile2 = "C:/example/nio/to.txt";
		// copyByNIO(fileName, toFile2);

		// System.out.println("---------- ɾ��ָ���ļ� -------------");
		// deleteFile(toFile);
		System.out.println("---------- ����ָ��Ŀ¼�ļ� -------------");
		String dir = "C:/example";
		walkDirectories(dir);
	}

	/**
	 * ����ָ���ļ����ƴ���Ŀ¼���ļ� ����ļ��Ѿ����ڣ������
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
			System.out.println("�ļ������ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
		Path file = Paths.get(fileName);
		try {
			Files.write(file, buffer, StandardOpenOption.APPEND);
			System.out.println("д��ɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

		int count = 0;
		try (FileInputStream in = new FileInputStream(sourceFile);
				FileOutputStream out = new FileOutputStream(targetFile);) {

			byte[] buffer = new byte[10];
			int c = 0;
			while ((c = in.read()) != -1) {

				out.write(c);
				count++;
			}
			System.out.println("���Ƴɹ�,ѭ����д��" + count + '��');
		} catch (IOException e) {
			// TODO Auto-generated catch block
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

		Path source = Paths.get(sourceFile);
		Path target = Paths.get(targetFile);
		try {
			Files.createDirectories(target.getParent());
			Files.copy(source, target);
			System.out.println("���Ƴɹ�");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * ɾ���ļ�
	 *
	 * @param fileName
	 */
	private static void deleteFile(String fileName) {

		Path file = Paths.get(fileName);
		try {
			boolean b = Files.deleteIfExists(file);
			if (b)
				System.out.println("ɾ���ɹ�");
			else
				System.out.println("�ļ�������,ɾ��ʧ��");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * ������ӡָ��Ŀ¼��ȫ��Ŀ¼/�ļ�����
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
			System.out.println("��ӡ���");
		}

	}
}

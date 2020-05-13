package com.yzj.exp8;

public class IOTest {
	public static void main(String[] args) {
		String fileName = "C:/example/from.txt";

		System.out.println("----- �����ļ� ------");
		createFile(fileName);

		System.out.println("-----  ���ַ���д���ļ� -------");
		// \r\n��txt�ı��л���
		String str = "������ɽ��\r\n" + "�ƺ��뺣��\r\n" + "����ǧ��Ŀ\r\n" + "����һ��¥\r\n";
		writeToFile(str, fileName);

		System.out.println("--------- ���ڻ���IO��ʵ���ļ��ĸ��� ----------");
		String toFile = "C:/example/to.txt";
		copyByIO(fileName, toFile);

		System.out.println("--------- ����NIOʵ���ļ��ĸ��� ----------");
		String toFile2 = "C:/example/nio/to.txt";
		copyByIO(fileName, toFile2);

		System.out.println("---------- ɾ��ָ���ļ� -------------");
		deleteFile(toFile);
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

	}

	/**
	 * ��ʾ���ļ����ֽڲ�������˿��� �ַ�����ת�ֽ����飬ֱ�ӻ���Filesд���ļ�
	 *
	 * @param fileName
	 * @param content
	 */
	private static void writeToFile(String fileName, String content) {
	}

	/**
	 * ���ڻ���IO���Լ��ֽ����黺�����������ļ� ��ӡ��ʾѭ����дѭ������
	 *
	 * @param sourceFile
	 * @param targetFile
	 */
	private static void copyByIO(String sourceFile, String targetFile) {

	}

	/**
	 * ����NIO��ʵ���ļ��ĸ���
	 *
	 * @param sourceFile
	 * @param targetFile
	 */
	private static void copyByNIO(String sourceFile, String targetFile) {

	}

	/**
	 * ɾ���ļ�
	 *
	 * @param fileName
	 */
	private static void deleteFile(String fileName) {

	}

	/**
	 * ������ӡָ��Ŀ¼��ȫ��Ŀ¼/�ļ�����
	 *
	 * @param dir
	 */
	private static void walkDirectories(String dir) {

	}
}

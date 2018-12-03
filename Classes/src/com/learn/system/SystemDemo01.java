package com.learn.system;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import org.junit.Test;

public class SystemDemo01 {

	/**
	 * ��Junit���Եķ���������Ȩ�ޱ���Ϊ public������initializationError
	 * hamcrest-core-1.3.jar + junit4.1*.jar��JDK1.8�µ���Ч���
	 */
	@Test
	public void testJunit() {
		System.out.println(123);

	}

	/**
	 * System.out����׼���������Ӧ��׼������豸:����̨
	 * 
	 * System.in����׼����������Ӧ�ı�׼�����豸������
	 */
	@Test
	public void testSystemPros() {
		// PrintStream ��ӡ��
		System.out.println("����������ӡ���");

		System.err.println("�����쳣��ӡ���");

		// "��׼"������ InputStream
		System.out.print("���������ݣ�");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input;
			if ((input = scanner.nextLine()).equals("end")) {
				System.out.println("������������ݣ�" + input);
				break;
			} else {
				System.out.println("������������ݣ�" + input);
				System.out.print("���������ݣ�");
			}
		}
	}

	@Test
	public void testSet() {
		File srcFile = new File("resource/poem.txt");
		File destFile = new File("log/out.txt");
		BufferedInputStream bis = null;
		PrintStream bos = null;
		try {
			// �޸ı�׼�����λ��
			System.setIn(new FileInputStream(srcFile));
			bos = new PrintStream(new BufferedOutputStream(new FileOutputStream(destFile, true)));
			// �޸Ĵ�ӡ�������λ��
			System.setOut(bos);
			// �ӱ�׼�������ж�������
			bis = new BufferedInputStream(System.in);
			byte[] flush = new byte[1024];
			int len = 0;
			while (-1 != (len = bis.read(flush))) {
				System.out.println(new String(flush, 0, len));
			}
			// �޸Ĵ�ӡ�������λ��
			System.setErr(bos);
			System.err.println("�����쳣��ӡ���");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != bis) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (null != bos) {
				bos.close();
			}
		}
	}

	@Test
	public void testTime() {
		long currentTime = System.currentTimeMillis();
		System.out.println("��ǰϵͳʱ�䣺" + System.currentTimeMillis());

		Date currentDate = new Date(currentTime);
		System.out.println(currentDate);

		// �Լ�ָ����ʽ
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy*MM*dd//kk**mm**ss");
		System.out.println(dateFormat.format(currentDate));
	}

	@Test
	public void testGetProps() {
		System.out.println("java.version:" + System.getProperty("java.version"));
		System.out.println("java.home:" + System.getProperty("java.home"));
		System.out.println("os.name:" + System.getProperty("os.name"));
		System.out.println("os.version:" + System.getProperty("os.version"));
		System.out.println("user.name:" + System.getProperty("user.name"));
		System.out.println("user.home:" + System.getProperty("user.home"));
		System.out.println("user.dir:" + System.getProperty("user.dir"));
	}

	@Test
	public void testSystemArrayCopy() {
		// ��ʼ����������
		User[] users = new User[] { new User(1, "admin", "admin@qq.com"), new User(2, "maco", "maco@qq,com"),
				new User(3, "kitty", "kitty@qq,com") };
		// �½�һ��Ŀ���������
		User[] target = new User[users.length];
		// ʵ��"ǳ"����
		System.arraycopy(users, 0, target, 0, users.length);
		// ǳ���ƣ��������������ǵĶ��󣬶��������������õĶ���
		// ��ƣ���ư�Ҫ���ƵĶ��������õĶ��󶼸�����һ�顣
		System.out.println("Դ������Ŀ�����������ַ�Ƿ�һ����" + (users[0] == target[0] ? "ǳ����" : "���"));
		target[0].setEmail("admin@sina.com");
		System.out.println("�޸�Ŀ����������ֵ��Դ����users��");
		for (User user : users) {
			System.out.println(user);
		}
	}

	class User {
		private Integer id;
		private String username;
		private String email;

		public User() {
		}

		public User(Integer id, String username, String email) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", email=" + email + "]";
		}
	}
}

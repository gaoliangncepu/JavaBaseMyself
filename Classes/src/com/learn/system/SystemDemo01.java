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
	 * 用Junit测试的方法，访问权限必须为 public，否则报initializationError
	 * hamcrest-core-1.3.jar + junit4.1*.jar是JDK1.8下的有效组合
	 */
	@Test
	public void testJunit() {
		System.out.println(123);

	}

	/**
	 * System.out：标准输出流，对应标准的输出设备:控制台
	 * 
	 * System.in：标准输入流，对应的标准输入设备：键盘
	 */
	@Test
	public void testSystemPros() {
		// PrintStream 打印流
		System.out.println("我是正常打印语句");

		System.err.println("我是异常打印语句");

		// "标准"输入流 InputStream
		System.out.print("请输入内容：");
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String input;
			if ((input = scanner.nextLine()).equals("end")) {
				System.out.println("键盘输入的内容：" + input);
				break;
			} else {
				System.out.println("键盘输入的内容：" + input);
				System.out.print("请输入内容：");
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
			// 修改标准输入的位置
			System.setIn(new FileInputStream(srcFile));
			bos = new PrintStream(new BufferedOutputStream(new FileOutputStream(destFile, true)));
			// 修改打印流的输出位置
			System.setOut(bos);
			// 从标准输入流中读入内容
			bis = new BufferedInputStream(System.in);
			byte[] flush = new byte[1024];
			int len = 0;
			while (-1 != (len = bis.read(flush))) {
				System.out.println(new String(flush, 0, len));
			}
			// 修改打印流的输出位置
			System.setErr(bos);
			System.err.println("我是异常打印语句");

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
		System.out.println("当前系统时间：" + System.currentTimeMillis());

		Date currentDate = new Date(currentTime);
		System.out.println(currentDate);

		// 自己指定格式
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
		// 初始化对象数组
		User[] users = new User[] { new User(1, "admin", "admin@qq.com"), new User(2, "maco", "maco@qq,com"),
				new User(3, "kitty", "kitty@qq,com") };
		// 新建一个目标对象数组
		User[] target = new User[users.length];
		// 实现"浅"复制
		System.arraycopy(users, 0, target, 0, users.length);
		// 浅复制：仅仅复制所考虑的对象，而不复制它所引用的对象。
		// 深复制：深复制把要复制的对象所引用的对象都复制了一遍。
		System.out.println("源对象与目标对象的物理地址是否一样：" + (users[0] == target[0] ? "浅复制" : "深复制"));
		target[0].setEmail("admin@sina.com");
		System.out.println("修改目标对象的属性值后源对象users：");
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

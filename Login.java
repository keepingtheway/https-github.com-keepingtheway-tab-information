package day18.Zuoye.Entity;

import java.util.Scanner;

import day18.Zuoye.BIZ.Userbiz;

public class Login {
		private static Userbiz userbiz=new Userbiz();
		public static boolean Lod(){
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名");
			String name=sc.next();
			System.out.println("请输入密码");
			String password=sc.next();
			if(userbiz.log(new User(name,password))){
				System.out.println("登录成功");
				return true;
			}
			return false;
		}
}

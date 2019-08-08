package day18.Zuoye;

import java.util.Scanner;
import day18.Zuoye.Entity.Behaviour;
import day18.Zuoye.Entity.Login;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("欢迎进入班级管理系统");
		System.out.println("1.登录系统\t\t 2.退出");
		int num =sc.nextInt();
		switch(num){
		case 1:
			if(Login.Lod()){
				Behaviour.Behav();
			}else{
				System.out.println("输入有误请重新输入");
				Test.main(args);
			};
			break;
		case 2:
			System.out.println("欢迎下次使用");
			return;
		default:
				break;
		}
			}

}

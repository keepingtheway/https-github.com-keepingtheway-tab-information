package day18.Zuoye.Entity;

import java.util.List;
import java.util.Scanner;

import day18.Zuoye.BIZ.ClassBiz;

public class Behaviour {
		private static ClassBiz classb=new ClassBiz();
		public static void Behav(){
			Scanner sc=new Scanner(System.in);
			System.out.println("1.查询信息\t2.删除信息\t3.修改信息\t4.增加信息\t5.退出");
			System.out.println("请输入选择");
			int n=sc.nextInt();
			switch(n){
			case 1:
				List<Classroom> list=classb.quaryAll();
				for(Classroom c:list){
					System.out.println(c);
				}
				break;
			case 2:
				System.out.println("输入要删除的信息的id");
				int m=sc.nextInt();
				if(classb.delete(m)){
					System.out.println("删除成功");
				};
				break;
			case 3:
				System.out.println("请输入要修改的id");
				n=sc.nextInt();
				System.out.println("输入修改的班级名");
				String c=sc.next();
				System.out.println("输入修改的班级人数");
				int num=sc.nextInt();
				if(classb.update(new Classroom(n, c, num))){
					System.out.println("修改成功");
				};
				break;
			case 4:
				System.out.println("输入班级名");
				String clas=sc.next();
				System.out.println("输入班级人数");
				int nume=sc.nextInt();
				if(classb.add(new Classroom(clas,nume))){
					System.out.println("修改成功");
				};
				break;
			case 5:
				System.out.println("退出成功");
				return;
			}
		}
}

import java.util.Scanner;
class MultiplicationTable{ 
	public synchronized void print(int num) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(num+ "*" +i+ "="+num*i);
		}
	}
}
class MyThread1 extends Thread{
	MultiplicationTable mult;
	int num1;
	public MyThread1(MultiplicationTable mult,int num1) 
	 {
		this.mult=mult;
		this.num1=num1;
	}
	public void run() {
		mult.print(num1);
	}
}
class MyThread2 extends Thread{
	MultiplicationTable mult;
	int num2;
	public MyThread2(MultiplicationTable mult,int num2) 
	 {
		this.mult=mult;
		this.num2=num2;
	}
	public void run() {
		mult.print(num2);
	}
}
class MyThread3 extends Thread{
	MultiplicationTable mult;
	int num3;
	public MyThread3(MultiplicationTable mult,int num3) 
	 {
		this.mult=mult;
		this.num3=num3;
	}
	public void run() {
		mult.print(num3);
	}
}


public class ThreadMultiplicationTable {
    public static void main(String[]args) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the table you want to run by thread 1");
    		int numb1=sc.nextInt();
    		System.out.println("Enter the table you want to run by thread 2");
    		int numb2=sc.nextInt();
    		System.out.println("Enter the table you want to run by thread 3");
    		int numb3=sc.nextInt();
    		MultiplicationTable m=new MultiplicationTable();
    		MyThread1 t1=new MyThread1(m, numb1);
    		MyThread2 t2=new MyThread2(m,numb2);
    		MyThread3 t3=new MyThread3(m,numb3);
    		t1.start();
    		t2.start();
    		t3.start();
    }
}

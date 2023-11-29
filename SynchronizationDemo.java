package default_package;
class MultiplicationTable{
	void printMultiplicationTable(int number) {
		for(int i=1;i<=10;i++) {
				System.out.println(i+"x"+number+"="+i*number);
		}
	}
}
class MyThread1 extends Thread{
	MultiplicationTable t=new MultiplicationTable();
	MyThread1(MultiplicationTable t){
		
	}
}
public class SynchronizationDemo {
	public static void main(String[]args) {
		MultiplicationTable m=new MultiplicationTable();
		m.printMultiplicationTable(5);	
	}
}



public class greatestOf3Nos {
	public static void main(String [] args) {
		int firstNumber=100,secondNumber=20,thirdNumber=30;
		if(firstNumber>secondNumber && firstNumber>thirdNumber) {
			System.out.println("Big Number:"+firstNumber);
		}
		else if(secondNumber>thirdNumber) {
			System.out.println("Big Numnber:"+secondNumber);
		}
		else {
			System.out.println("Big Number:"+thirdNumber);
		}
	}
}


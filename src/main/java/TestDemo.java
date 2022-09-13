import java.util.Random;

public class TestDemo {
	
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			int sumOfPositives = a + b;
			
			System.out.println(sumOfPositives);
			return sumOfPositives;
		}//end IF
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}//end ELSE
	}//end METHOD addPositive

	
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}//end METHOD getRandomInt
	
	public int randomNumberSquared() {
		int random = getRandomInt();
		int randomSquared = random * random;
		
		System.out.println(randomSquared);
		return randomSquared;
	}//end METHOD randomNumberSquared
	
}//end CLASS

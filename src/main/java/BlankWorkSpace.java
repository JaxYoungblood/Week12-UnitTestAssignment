import java.util.Random;

public class BlankWorkSpace {
	public static void main(String[] args) {	
	}//end METHOD main
	
	
	
	int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}//end METHOD getRandomInt
	
	public int randomNumberSquared() {

		return getRandomInt() * getRandomInt();
	}//end METHOD randomNumberSquared
	
	
	
}//end CLASS

import java.util.Random;

public class Lotto {
/*
 * �ٲٰ����ϴ� �� �巡��  + alt + shift + L : �ν��Ͻ� ���� ���� 
 * �ٲٰ����ϴ� �� �巡��  + alt + shift + M : �޼ҵ� ����
 * alt + shift + a : ���� ���� 
 * 
 * 
 * 
 * 
 */
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Random random = new Random();
		printLotto();

	}

	public void printLotto() {
		for (int i = 0; i < 6; i++) {	
			System.out.println(getNumber() + 1);
		}
	}
	
	Random random = new Random();
	
	private int getNumber() {
		return random.nextInt(45);
	}

}

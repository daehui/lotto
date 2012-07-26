import java.util.Random;

public class Lotto {
/*
 * 바꾸고자하는 것 드래그  + alt + shift + L : 인스턴스 변수 생성 
 * 바꾸고자하는 것 드래그  + alt + shift + M : 메소드 생성
 * alt + shift + a : 구간 선택 
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

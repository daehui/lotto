import java.util.Random;

public class Lotto {
	/*
	 * 바꾸고자하는 것 드래그 + alt + shift + L : 인스턴스 변수 생성 
	 * 바꾸고자하는 것 드래그 + alt + shift + M : 메소드 생성
	 *  alt + shift + a : 구간 선택
	 *  alt + shift + r ; 해당 단어 전체 찾아 바꾸기
	 */

	public static void main(String[] args) {
		new Lotto().getLotto();

	}

	public int[] getLotto() {
		int[] numbers = new int[6];
		for (int i = 0; i < 6; i++) {
			numbers[i] = getNumber();
		}
		return numbers;
	}

	Random random = new Random();

	private int getNumber() {
		return random.nextInt(45) + 1;
	}

}

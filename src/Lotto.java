import java.util.Random;

public class Lotto {
	/*
	 * �ٲٰ����ϴ� �� �巡�� + alt + shift + L : �ν��Ͻ� ���� ���� 
	 * �ٲٰ����ϴ� �� �巡�� + alt + shift + M : �޼ҵ� ����
	 *  alt + shift + a : ���� ����
	 *  alt + shift + r ; �ش� �ܾ� ��ü ã�� �ٲٱ�
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

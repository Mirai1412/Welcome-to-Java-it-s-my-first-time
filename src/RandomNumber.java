import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수의 합 계산하기
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.print("난수의 개수 : ");
		int count = sc.nextInt();
		int sum = 0;

		for (int i = 0; i < count; i++) {
			int number = generator.nextInt(100);
			sum += number;

		}
		System.out.print("난수 " + count + "개의 합은 " + sum);

	}

}

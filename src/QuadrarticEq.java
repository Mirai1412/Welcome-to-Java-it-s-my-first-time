
public class QuadrarticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 2차 방정식 근을 계산하는 코드
		
		double b = -3.0;
		double c = 2.0;
		
		double disc = b * b - 4.0 * c;
		double sqr = Math.sqrt(disc);
		
		double r1 = (-b + sqr) / 2.0;
		double r2  = (-b - sqr) / 2.0;
		
		System.out.println("근은" +  r1);
		System.out.println("근은" + r2 );
	}

}

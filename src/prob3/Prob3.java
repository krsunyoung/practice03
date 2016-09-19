package prob3;

public class Prob3 {

	public static void main(String[] args) {
		CurrencyConverter.setRate( 1118.70 );

		double dollor = CurrencyConverter.toDollar( 1000000 );
		System.out.println( "백만원은 " + dollor + "달러입니다." );
		
		double krw = CurrencyConverter.toKRW( 100 );
		System.out.println( "백달러는 " + krw + "원 입니다." );		
		
		//static 클래스 변수가 하나 더 있다.
	}
}

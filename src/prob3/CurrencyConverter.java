package prob3;

public class CurrencyConverter {
	private static double rate;




	public static double toKRW(double dollor) {
		// 달러를 한국 원화로 변환
		dollor = (double) dollor * rate;
		return dollor;
	}

	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		CurrencyConverter.rate=rate; //this가 안되는 이유는 static을 사용하기 때문에. 클래스 명을 써줘야 한다.
		
	}
	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환

		double dollor = (double)won / rate ;
		return dollor;
		
	}
	public static void getRate(){
		
	}
}

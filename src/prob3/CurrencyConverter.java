package prob3;

public class CurrencyConverter {
	private static double rate;




	public static double toKRW(double dollor) {
		// 달러를 한국 원화로 변환
		return dollor;
	}

	public static void setRate(double rate) {
		// 환율 설정(KRW/$1)
		//this.rate = rate;
		System.out.println(rate);
		
	}
	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
System.out.println(rate);
		double dollor = (double)won /rate ;
		return dollor;
		
	}
	public static void getRate(){
		
	}
}

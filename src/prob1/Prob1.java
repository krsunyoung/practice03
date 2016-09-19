package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		

	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] c = str.toCharArray();
		char[] newArray = new char[c.length];
		for(int i =0; i<c.length;i++){

			if(i < c.length/2){
				newArray[c.length+i] = c[i];				
			}else if(i > c.length/2 ){
				newArray[c.length-i] = c[i];
			}else {
				newArray[i] = c[i];				
			}
			
		}
		for(int j = 0; j<c.length; j++){
		System.out.print(newArray);
		}
		return c;
		
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */		
		
	}
}

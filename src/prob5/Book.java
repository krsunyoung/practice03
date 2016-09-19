package prob5;

public class Book {
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(int bookNo, String author, String title){
		this.bookNo=bookNo;
		this.author=author;
		this.title=title;		
	}
	public Book(){
		
	}
	public void rent(){
		stateCode=1;
		System.out.println(title+"이(가) 대여 됐습니다.");
	}
	public void print(){
		if(stateCode==0){
			System.out.println("책 제목 : "+title+", 작가 : "+author+", 대여가능");			
		}else{
			System.out.println("책 제목 : "+title+", 작가 : "+author+", 대여중");
		}

		
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	

}

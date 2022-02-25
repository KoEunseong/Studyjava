package object;
class Document{
	static int count = 0;
	String bookName;
	public Document() {
		this("제목없음"+ ++count);
	}
	
	public Document(String bookName) {
		this.bookName = bookName;
		System.out.println("\""+this.bookName+"\"이 생성됨");
	}
}
public class DocumentTest {
	public static void main(String[] args) {
		Document d1 = new Document();
		Document d2 = new Document("자바를 자바");
		Document d3 = new Document();
		Document d4 = new Document();

	}
}

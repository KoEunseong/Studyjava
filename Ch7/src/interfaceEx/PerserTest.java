package interfaceEx;
interface Parseable {
	public abstract void parse(String fileName);
}
class ParserManager {
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}
		else 
			return new HTMLParser();
	}
}
class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " XML");
	}
	
}

class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(fileName + " HTML");
	}
}
public class PerserTest {
	public static void main(String[] args) {
		Parseable p = ParserManager.getParser("XML");
		p.parse("a.xml");
	}
}

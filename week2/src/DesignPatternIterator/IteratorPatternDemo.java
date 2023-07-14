package DesignPatternIterator;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameRepository nameResository = new NameRepository();
		
		for(Iterator iter = nameResository.getIterator(); iter.hasNext();) {
			String name = (String)iter.next();
			System.out.println("name: " + name);
		}
	}
}

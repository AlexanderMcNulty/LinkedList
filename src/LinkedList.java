
public class LinkedList {
	Link firstLink;
	
	public LinkedList() {
		this.firstLink = null;
	}
	
	public void addLink(String mystring, int myint) {
		Link tempNext = null;
		if(firstLink != null) {
			tempNext = firstLink;
		}
		firstLink = new Link(mystring, myint);
		if(tempNext != null) {
			firstLink.setNext(tempNext);
		}
	}
	
	public void printList() {
		System.out.println(firstLink.toString());
	}
	
}

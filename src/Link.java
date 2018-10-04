
public class Link {
	private String name;
	private int points;
	private Link nextLink;
	
	public Link(String name, int points) {
		this.name = name;
		this.points = points;
	}
	public Link getNext() {
		if (nextLink != null) {
			return nextLink;	
		}
		return null;
	}
	public void setNext(Link nextLink) {
		this.nextLink = nextLink;
	}
	public String getName() {
		return name; 
	}
	public String toString() {
		if(nextLink != null) {
			return "[ " + name + ", " + points + "]" + nextLink.toString();
		}
		return "[ " + name + ", " + points + "]";
	}
}


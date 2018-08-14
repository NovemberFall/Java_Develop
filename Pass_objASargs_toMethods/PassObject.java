public class PassObject{
	public static void main(String[] args){
		Rectangle box = new Rectangle(12.0, 5.0);

		display(box);
	}

	public static void display(Rectangle r){
		System.out.println("Length : " + r.getLength() +
		" Width : " + r.getWidth());
	}
}
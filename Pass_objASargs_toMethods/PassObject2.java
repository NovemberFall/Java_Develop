public class PassObject2{
	public static void main(String[] args){
		Rectangle box = new Rectangle(12.0, 5.0);

		System.out.println("Contents of the box object:");
		System.out.println("Length : "+box.getLength() +
			"Width : "+box.getWidth());

		changeRectangle(box);
		System.out.println("\nNow the contents of the " +
			"box object are:");

		System.out.println("Length : " + box.getLength() +
			" Width : " + box.getWidth());
	}

	public static void changeRectangle(Rectangle r){
		r.setLength(0.0);
		r.setWidth(0.0);
	}
}
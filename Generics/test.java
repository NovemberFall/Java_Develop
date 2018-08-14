public class test{
	public static void main(String[] args){
		OrderedPair<String> fruit = new OrderedPair<>("apple", "banana");
		System.out.println(fruit);
		fruit.changeOrder();
		System.out.println(fruit);
		String firstFruit = fruit.getFirst();
		System.out.println(firstFruit + " has length "+firstFruit.length());

		OrderedPair<Integer> intPair = new OrderedPair<>(1, 9);

		System.out.println(intPair);
		intPair.changeOrder();
		System.out.println(intPair);
	}
}
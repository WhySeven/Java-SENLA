package Test_6;

public class Test_6 {

	public static void main(String[] args) {
		Backpack backpack = new Backpack(10);
		ItemsSet items = new ItemsSet();
		items.ExampleOfItems();
		items.DeleteOverWeightItems(backpack);
		items.Out();
		items.MaxCoast(backpack);
	}
}

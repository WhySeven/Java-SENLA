package Test_6;
import java.util.ArrayList;
public class ItemsSet {
	
	ArrayList<Item> items;
	ItemsSet()
	{
		items = new ArrayList<Item>();
	}
	ItemsSet(ArrayList<Item> items)
	{
		this.items = items;
	}
	void ExampleOfItems()
	{
		items.add(new Item(5,10));
		items.add(new Item(4,15));
		items.add(new Item(7,11));
		items.add(new Item(2,12));
		items.add(new Item(11,30));
		items.add(new Item(17,40));
	}
	void AddItem(int weight, int cost)
	{
		items.add(new Item(weight,cost));
	}
	void DeleteOverWeightItems(Backpack backpack)
	{
		int maxWeight = backpack.capacity;
		for(int i = 0; i < items.size();i++)
		{
			if(items.get(i).weight>maxWeight)
			{
				items.remove(i);
				i--;
			}
		}
	}
	void Out()
	{
		if(!items.isEmpty())
		{
			System.out.println("List of all items:");
			int place = 1;
			for(Item item : items)
			{
				System.out.printf("%d: Weight = %d; Cost = %d;\n",place,item.weight,item.cost);
				place++;
			}
		}
		else
			System.out.println("Empty");
	}
	void MaxCoast (Backpack backpack)
	{
		if(!items.isEmpty())
		{
			int maxWeight = backpack.capacity;
			int numberOfItems = items.size();
			int [][] table = new int [numberOfItems][maxWeight+1];
			int a;
			int b;
			for(int i = 0; i < numberOfItems; i++)
				for(int j = 1; j <= maxWeight;j++)
				{
					if(i==0) 
					{
						if(items.get(i).weight<j)
							table[i][j] = items.get(i).cost;
						else
							table[i][j] = 0;
					}
					else
					{	if(j-items.get(i).weight<1)
							table[i][j] = table[i-1][j-1];
						else
						{
							a = table[i-1][j-items.get(i).weight]+items.get(i).cost;
							b = table[i-1][j-1];
							table[i][j] = Math.max(a, b);
						}
					}
				}
			System.out.printf("Max cost: %d",table[numberOfItems-1][maxWeight]);
		}
	}
}

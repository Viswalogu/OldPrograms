package Assignment;


import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <String> name = new HashSet<>();
		name.add("Loganathan");
		name.add("Saraswathi");
		name.add("Viswanathan");
		name.add("Viswanathan");
		name.add("Tharani");
		name.add("Shobana");
		for(String result:name)
		{
			System.out.println(result);
		}
		
	}

	}


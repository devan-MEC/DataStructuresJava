import java.util.HashMap;

public class hashclass
{
	public static void main(String[] args){
		//create a HashMap object called capitalCities
		HashMap<String,String> capitalCities = new HashMap<String, String>();
		
		//Add keys and values(Country,City) using put()
		capitalCities.put("England","London");
		capitalCities.put("Germany","Berlin");
		capitalCities.put("Norway","Oslo");
		capitalCities.put("USA","Washington DC");

		//print out the whole thing as such
		System.out.println(capitalCities);

		//Access an item
		System.out.println(capitalCities.get("England")); //Returns value under the key named England

		//remove an item
		capitalCities.remove("England"); //removes the key-val pair with key england
		System.out.println(capitalCities);

		// to find out the size
		System.out.println(capitalCities.size());

		System.out.println();
		//ITERATION WITH FOR-EACH LOOP

		//Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

		//print keys
		for(String i:capitalCities.keySet()){
			System.out.println(i);
		}
		System.out.println();

		//print values
		for(String i:capitalCities.values()){
			System.out.println(i);
		}
		System.out.println();

		//print both key and values
		for(String i:capitalCities.keySet()){
			System.out.println("Key is "+ i +" and value is "+capitalCities.get(i));
		}

		//to clear out the whole hashmap
		capitalCities.clear();
		System.out.println("Hashmap now: "+capitalCities); //shows empty hashmap
	}
}
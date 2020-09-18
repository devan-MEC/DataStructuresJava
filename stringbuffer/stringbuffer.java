
class stringbuffer{
	public static void main(String[] args){
		StringBuffer s=new StringBuffer("GeeksForGeeks");
		//you can alternatively say
		//StringBuffer s=new StringBuffer(); and append from scratch
		int p=s.length();
		int q=s.capacity();
		System.out.println("The length is "+p+" and the capacity is "+q);

		s.append("java");//appends to the end
		System.out.println(s);

		s.insert(1,"middle");//inserts the second paramter into the 1st index 
		System.out.println(s);
		
		s.replace(4,6,"welp");//The replace() method replaces the given string from the specified beginIndex and endIndex. 
							  //endIndex is not inclusive
		System.out.println(s);

		s.delete(1,3); //deleted bw specified indices. endIndes is not inclusive
		System.out.println(s);	

		s.reverse();//reverses a string duh
		System.out.println(s);
	}
}
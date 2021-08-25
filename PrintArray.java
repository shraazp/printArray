package printarray;

public class PrintArray {

	//@method to display  values using generic approach
	public static <E> void toPrint(E[] inputArray)     
	{
		for(E element:inputArray)
		{
			System.out.printf("%s ",element);
		}
		System.out.println();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArray= {1,2,3,4,5};  //integer array
		Double[] doubleArray= {1.1,2.2,3.3,4.4};//double array
		Character[] charArray= {'H','E','L','L','O'}; //array of char type
		
		//call the functions 
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);

}
}
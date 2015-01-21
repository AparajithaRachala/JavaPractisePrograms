
public class ArrayAdd {
	
	static int[][] firstArray = {{1,2,3},{4,5,6}};
	static int[][] secondArray={{10,11,12},{13,14,15},{16,17,18}};
	static int[][] addArray = new int[3][3];

	public static void main(String[] args) {
		
		
		if (firstArray.length > secondArray.length)
			
		{
			int newArray[][] = new int[firstArray.length][3];
			for(int row=0;row<secondArray.length;row++)
	    	{
	    		for(int col = 0;col<3;col++)
	    		{
	    			newArray[row][col] = secondArray[row][col];
	    		}
	    	}
			for(int index=secondArray.length ; index < firstArray.length ; index++)
			{
				newArray[index][0] = 0;
				newArray[index][1] = 0;
				newArray[index][2] = 0;
			}
			add(newArray, firstArray, 3);
		}
		else if(firstArray.length < secondArray.length)
		{
			int newArray[][] = new int[secondArray.length][3];
			for(int row=0;row<firstArray.length;row++)
	    	{
	    		for(int col = 0;col<3;col++)
	    		{
	    			newArray[row][col] = firstArray[row][col];
	    		}
	    	}
			for(int index=firstArray.length ; index < secondArray.length ; index++)
			{
				newArray[index][0] = 0;
				newArray[index][1] = 0;
				newArray[index][2] = 0;
			}
			add(newArray, secondArray, 3);
		}
		else
		{
			add(firstArray,secondArray,3);
		}
		
		for(int row=0;row<3;row++)
    	{
    		for(int col = 0;col<3;col++)
    		{
    			System.out.println(addArray[row][col]+" \t"); 
    		}
    		System.out.println("\n");
    	}
		
		if(firstArray[0].length>secondArray[0].length)
		{
			int[][] newArray2 = new int[3][firstArray[0].length];
			
			for(int row=0;row<3;row++)
			{
				for(int col=0;col<secondArray[row].length;col++)
				{
					newArray2[row][col]= secondArray[row][col];
				}
			}
			for(int row=0;row<3;row++)
			{
				for(int col=secondArray[row].length;col<firstArray[row].length; col++)
				{
					newArray2[row][col]=0;
				}
			}
			add(firstArray,newArray2,firstArray[0].length);
		}   
		else if(secondArray[0].length > firstArray[0].length)
		{
			int[][] newArray3= new int[3][secondArray[0].length];
			
			for(int row=0;row<3;row++)
			{
				for(int col=0;col<firstArray[row].length;col++)
				{
					newArray3[row][col]=firstArray[row][col];
				}
			}
			
			for(int row=0;row<3;row++)
			{
				for(int col=firstArray[row].length;col<secondArray[row].length;col++)
				{
					newArray3[row][col]=0;
				}
			}
			add(newArray3,secondArray,newArray3[0].length);
		}
		else{
			add(firstArray,secondArray,3);
		}
		for(int row=0;row<3;row++)
    	{
    		for(int col = 0;col<firstArray[row].length;col++)
    		{
    			System.out.println(addArray[row][col]+" \t"); 
    		}
    		System.out.println("\n");
    	}
		
			
		
	}
	
    public static void add(int[][] firArray,int[][] secArray,int cols)	
    {
    	for(int row=0;row<firArray.length;row++)
    	{
    		for(int col = 0;col<cols;col++)
    	
    		{
    		   addArray[row][col]= firArray[row][col]+secArray[row][col];
    		}
    	}
    }
		
}

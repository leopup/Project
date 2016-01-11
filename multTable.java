package Rad;

public class multTable {
	public static void main(String[] args){
	int [] [] multArray = new int [13] [13];
	
	for(int row = 1; row < multArray.length; row++){
		for(int col = 1; col < multArray[row].length; col++){
			multArray [row] [col] = row * col;
			System.out.print(multArray [row] [col] + " ");
		}
		System.out.println();
	}
	}

}

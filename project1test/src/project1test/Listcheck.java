package project1test;

import java.util.LinkedList;

public class Listcheck {
 
	public static void main(String[] args) {

		int[] array ={9,5,52,63,7,52,19,7,5};
		
		LinkedList<Integer> mylist = new LinkedList<>();


		for(int i=0;i<=array.length;i++){
			if(mylist.isEmpty()) 
			
				mylist.add(array[i]);
			
			else if(mylist.contains(array[i]))
			{
				System.out.println(" first repeated value is   "+ array[i]);
				break;
			}
			else 
				mylist.add(array[i]);
			}
	                }	
                        }



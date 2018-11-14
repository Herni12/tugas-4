
// Java program to demonstrate working of Collections. 
// binarySearch() 
import java.util.List; 
import java.util.ArrayList; 
import java.util.Collections; 
  
public class Algoritma_Binary_Search 
{ 
    public static void main(String[] args) 
    { 
        List<Double> al = new ArrayList<Double>(); 
        al.add(1.6); 
        al.add(2.7); 
        al.add(3.6); 
        al.add(10.3); 
        al.add(20.5); 
  
        // 10 is present at index 3. 
        int index = Collections.binarySearch(al, 1.6); 
        System.out.println(index); 
  
        // 13 is not present. 13 would have been inserted 
        // at position 4. So the function returns (-4-1)  
        // which is -5. 
        index = Collections.binarySearch(al, 20.5); 
        System.out.println(index); 
    } 
} 


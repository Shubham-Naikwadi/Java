public class LinearSearch{
public static int linearSearch(int arr[], int key){
   for (int i=0;i<=arr.length;i++){
      if(arr[i]==key){
           return i;
       }
   } 
return -1;
 }
public static void main(String args[]){
  int a1[]={10,20,40,30,50,11};
  int key=50;
   System.out.println("The key is found at:"+linearSearch(a1,key));
  }
}

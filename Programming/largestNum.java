public class largestNum {
   
   static int findMax(int arr[]){
    int max = arr[0];
    for(int i=0; i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    return max;
   }
   
   
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 5, 5};
        System.out.println(findMax(arr));
    }
}

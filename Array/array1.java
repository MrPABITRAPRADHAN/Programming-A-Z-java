class array1{

    static int sum(int n){
        int sum = 0;
        while(n!=0){
            int r = n%10;
            sum = sum+r;
        }
        return sum;
    }

    public static void main(String[] args) {
        // int arr[] = new int[4];
        int arr[] = {2,3,4,6,5};
        
        // find even number

        // for(int i=0; i<=arr.length-1; i++){
        //     if(arr[i]%2==0){
        //         System.out.println(arr[i]);
        //     }
        // }
        
        // wap to define a methos; to find the biggest elem

        // int max = arr[0];
        // for(int i=0; i<=arr.length-1; i++){
        //     if(arr[i]>max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        int a[] = {13, 14, 56, 32};
        for(int i=0; i<a.length; i++){
            a[i] = sum(i);
        }
        System.out.println(a);

        // wap to print the sum of user entered array:
        // wap to sort the array elements in ascending order:
        // wap to defeine a method to impliment linear search:
    }


    

}
class array2{

    //? linear search
    public static void main(String[] args){
      int a[] = {10, 20, 30, 40, 40};
      int n = 40;
      int position = linearSearch(a, n);
      if(position == -1){
        System.out.println("position not found");
      }else{
        System.out.println("position found : "+ position);
      }
    }

    static int linearSearch(int a[], int n){
        for(int i=0; i<a.length; i++){
            if(a[i]== n){
                return i;
            }
        }
        return -1;
    }

   
}
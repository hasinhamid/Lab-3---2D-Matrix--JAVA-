//Task 02: Decryption Process
class Task2{

    //Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix( Integer[][] matrix ){
        int k=0;
        Integer[] arr= new Integer[matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            int sum=0;
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[j][i];
            }
            arr[k++]=sum;
        }
        k--;
        Integer[] dec=new Integer[k];
        int i=0;
        int j=1;
        while(j<=k){
            dec[i]=arr[j++]-arr[i];
            i++;
        }
        return dec;

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            {1,3,1},
            {6,4,2},
            {5,1,7},
            {9,3,3},
            {8,5,4}
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix( matrix );
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
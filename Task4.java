// Task 04: Matrix Compression
class Task4{

    //Complete this method so that it gives the Expected Output
    public static Integer[][] compressMatrix( Integer[][] matrix ){
        Integer[][] arr=new Integer[2][2];
        arr[0][0]=0;
        arr[0][1]=0;        
        arr[1][0]=0;
        arr[1][1]=0;
        int row=matrix.length;
        int column=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i<row/2 && j<column/2){
                    arr[0][0]+=matrix[i][j];
                }
                else if(i<row/2 && j<column){
                    arr[0][1]+=matrix[i][j];
                }
                else if(i<row && j<column/2){
                    arr[1][0]+=matrix[i][j];
                }
                else if(i<row && j<column){
                    arr[1][1]+=matrix[i][j];
                }
            }
        }
        return arr;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
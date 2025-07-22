import java.util.Scanner;
class matrices{
    public static int[][] transpose(int[][] matrix, int rows, int cols){
        int [][] transposed = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int cols = in.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter the value for ["+i+","+j+"]:");
                int element = in.nextInt();
                matrix[i][j] = element;
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transposed = transpose(matrix,rows,cols);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(transposed[i][j]+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
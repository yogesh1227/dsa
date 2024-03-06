package Search.linearSearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
                {1,2,3,4},
                {5,6,7},
                {89,8,10},
                {8,18,11,15,14,13}
        };
        int target = 8;
        search(arr,target);
    }

    private static void search(int[][] arr, int target) {
        int i;
        int j;
        for(i = 0;i <arr.length;i++) {
            for(j = 0; j< arr[i].length;j++) {
                if(target == arr[i][j]) {
                    System.out.println("row "+i+" col "+j);
                }
            }
        }
        System.out.println("not found");
    }
}

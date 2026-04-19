public class example2 {
    public static void main(String[] args) {
        int[][] numbers = {
            {2, 4, 6},
            {1, 3, 5},
            {10, 20, 30}
        };

        int sum = 0;

        for(int[] row : numbers){
            for(int num : row){
                sum += num;
            }
        }

        System.out.println(sum);
    }
}

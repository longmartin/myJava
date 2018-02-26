class Array2sum {
    public static void main (String[] args) {
        int[][] arr = {{22,66,44}, {12,24,36}, {13,26,39}, {15,25,35}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
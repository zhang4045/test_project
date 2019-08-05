public class sort {
    public static void DataSort(int b[]) {
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length-i-1; j++) {
               int temp = 0;
               if(b[j]>b[j+1]){
                 temp = b[j];
                 b[j] = b[j+1];
                 b[j+1] = temp;
               }
            }
        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);
        }
    }
    public static void main(String[] args) {
        int[] b = new int[4];
        b[1] = 1;
        b[2] = 5;
        b[3] = 7;
        b[0] = 4;
        DataSort(b);

    }
}

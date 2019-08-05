public class maopaoSort {

    public static int[] DataSort(int[] date) {
        for (int i = 0; i < date.length; i++) {

            for (int j = 0; j < date.length - i - 1; j++) {

                if (date[j] > date[j + 1]) {
                    int temp = 0;
                    temp = date[j];
                    date[j] = date[j + 1];
                    date[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
           return date;
    }

    public static void main(String[] args) {
        int[] ints = new int[4];
        ints[0]=3;
        ints[1]=1;
        ints[2]=7;
        ints[3]=2;
         DataSort(ints);

    }
}

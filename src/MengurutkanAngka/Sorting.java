package MengurutkanAngka;

public class Sorting {

    public static int[] getascenden(String text, int amount){
        int data, i, j, baru;
        data = amount;
        int ary[] = new int[data];
        String[] exc = text.split(",");
        int a = 0;
        for (String s : exc){
            ary[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < (data - 1); i++) {
            for (j = 0; j < data - i - 1; j++){
                if (ary[j] > ary[j+1]) {

                    baru = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = baru;
                }
            }
        }
        return ary;
    }
    public static int[] getdescenden(String text, int amount){
        int data,i,j,baru;
        data = amount;
        int ary[] = new int[data];
        String[] exc = text.split(",");
        int a = 0;
        for (String s : exc){
            ary[a] = Integer.parseInt(s.trim());
            a++;
        }
        for (i = 0; i < (data - 1); i++) {
            for (j = 0; j < data - i - 1; j++){
                if (ary[j] < ary[j+1]) {

                    baru = ary[j];
                    ary[j] = ary[j+1];
                    ary[j+1] = baru;
                }
            }
        }
        return ary;
    }
}

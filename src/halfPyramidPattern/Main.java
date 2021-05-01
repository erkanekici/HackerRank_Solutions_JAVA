package halfPyramidPattern;

public class Main {

    public static void main(String []args){
        //Verilen satir sayisi kadar * karakteriyle yarim piramit olusturma
        int rows = 5;
        int sequence = 1;
        pattern(rows, sequence);
    }

    static void pattern(int rows, int sequence)
    {
        if (rows == 0)
            return;

        printn(sequence);
        //printn(rows); //reverse

        System.out.println();

        // recursively calling pattern()
        pattern(rows - 1, sequence + 1);
    }

    static void printn(int num){
        if (num == 0)
            return;

        System.out.print ("* ");

        //recursively calling printn()
        printn(num - 1);
    }
}

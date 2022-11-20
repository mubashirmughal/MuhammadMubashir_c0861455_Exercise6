public class Question1Tables {
    public static void main(String[] args)
    {
        //int a=2;
        for (int a=2; a<=10; a++) {
            for (int x=2;x<=10; x++){
                    System.out.printf("Table of %d \n" , x);
                for (int i = 1; i <= 10; i++) {
                    System.out.printf(" %d * %d = %d \n", a, i, a * i);
            }
            }
        }
    }
}

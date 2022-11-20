public class Question1Tables {
    public static void main(String[] args)
    {

        for (int a=2; a<=10; a++) {
            System.out.printf("table of: %d  \n",a);
                for (int i = 1; i <= 10; i++) {
                    System.out.printf(" %d * %d = %d \n", a, i, a * i);
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println(Tickets(new int[] {25, 25,25,50, 100}));
    }
    public static String Tickets(int[] peopleInLine)
    {
        int billNumber25 = 0;
        int billNumber50 = 0;
        for (int j : peopleInLine) {
            if (j == 25) {
                billNumber25++;
            } else if (j == 50 && billNumber25 >= 1) {
                billNumber25--;
                billNumber50++;
            } else if (j == 100 && billNumber25 >= 1 && billNumber50>=1) {
                billNumber25 = billNumber25 - 1;
                billNumber50 = billNumber50 - 1;
            } else if (j == 100 && billNumber25 >= 3) {
                billNumber25 = billNumber25 - 3;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
}

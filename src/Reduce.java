public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int n = 100;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }
            steps++;
        }
        System.out.println("It takes " + steps + " steps for 1000 to reduce to 0.");
    }
}

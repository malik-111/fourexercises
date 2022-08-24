public class l5e1 {
        public l5e1() {
        }

        public static long fib(int num) {
            if (num != 1 && num != 2) {
                long a = 1L;
                long b = 1L;
                long c = 1L;

                for(int i = 3; i <= num; ++i) {
                    c = a + b;
                    a = b;
                    b = c;
                }

                return c;
            } else {
                return 1L;
            }
        }

        public static void main(String[] args) {
            int num = 100;
            System.out.println("Fib sequence of " + num + " numbers; ");

            for(int i = 0; i < num; ++i) {
                System.out.print(fib(i) + ",");
            }

        }
}

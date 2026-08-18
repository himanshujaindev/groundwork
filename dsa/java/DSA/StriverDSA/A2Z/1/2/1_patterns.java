/*

*****
*****
*****
*****
*****  --> (5*5)

 */

 /*

*
**
***
****
*****

 */

 /*

1
12
123
1234
12345

 */

 /*

1
22
333
4444
55555

 */

 /*

*****
**** 
***  
**   
* 

 */

 /*
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
 */

 /*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
class Solution {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print(j + 1);
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j <= i) {
                System.out.print(i + 1);
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < 5 - i) {
                System.out.print("*");
                j++;
            }

            while (j < 5) {
                System.out.print(" ");
                j++;
            }
            System.out.println();
        }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }

            for (int j = 1; j <= n; j++) {
                if (n - j >= i) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(n - j + 1 + " ");
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else if (j - n > n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= 2 * n; j++) {
                if (i > j) {
                    System.out.print("*");
                } else if (j - n - 1 > n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

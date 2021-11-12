



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Divisors_:

/* Escriu tots els divisors d'un nombre N de forma ascendent.

Input Format

N: nombre enter

Constraints

Suposem N major de 0.

Output Format

Escriu un divisor diferent de N en cada línia en ordre ascendent.

Sample Input 0

9
Sample Output 0

1
3
9
Sample Input 1

45
Sample Output 1

1
3
5
9
15
45

 */













public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;

        if (N > 0 )
        {
            while (count <= N)
            {

                if (N % count == 0)
                {
                    System.out.println(count);
                }

                count++;

            }
        }







    }

}

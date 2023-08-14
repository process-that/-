import java.security.PublicKey;
import java.util.Scanner;

 /**完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。

         它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
         例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
         输入n，请输出n以内(含n)完全数的个数。
  **/
//public class HWODTest10 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int count = 0;
//        for (int i = 2; i <= n; i++) {
//            if (isPerfect(i)) count++;
//        }
//        System.out.print(count);
//    }
//
//     public static boolean isPerfect(int num) {
//         int sum = 0;
//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) {
//                 sum += i;
//                 if (num / i != i) {
//                     sum += (num / i);
//                 }
//             }
//         }
//         sum++;
//         return sum == num;
//     }
// }

//任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
//public class HWODTest10 {
//    //判断是否为素数
//     public static boolean isPrime(int number) {
//         for (int i = 2; i <= Math.sqrt(number); i++) {
//             if (number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         int b =0;
//         for (int i = 1; i < n/2; i++) {
//             if (isPrime(i)&&isPrime(n-i)){
//                 a = i;
//                 b = n-i;
//             }
//         }
//         System.out.println(a);
//         System.out.println(b);
//     }
//}

//输入一个正整数，计算它在二进制下的1的个数。
public class HWODTest10 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int res = 0;
         String str = String.valueOf(Integer.toBinaryString(n));
         char[] ch = str.toCharArray();
         for (int i = 0; i <ch.length ; i++) {
             if (ch[i]=='1'){
                 res++;
             }
         }
         System.out.println(res);
     }
}
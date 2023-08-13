import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//输入两个数组，将其合并后降序输出。输入"3,2,1"，"4,5,6"输出"6,5,4,3,2,1"。也就是字符串的处理和对数组排序
//public class ODTest9 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (sc.hasNextInt()){
//            arr.add(sc.nextInt());
//        }
//        Collections.sort(arr);
//        for (Integer num:arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        }
//    }

// 有一种兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子。
//例子：假设一只兔子第3个月出生，那么它第5个月开始会每个月生一只兔子。
//一月的时候有一只兔子，假如兔子都不死，问第n个月的兔子总数为多少？
//public class ODTest9 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k1 = 0;
//        int k2 = 0;
//        int k3 = 0;
//        for (int i = 0; i < n; i++) {
//            k3 = k3 + k2;
//            k2 = k1;
//            if (k3 == 0 && k2 == 0) {
//                k1 = 1;
//            } else if (k3 == 0 && k2 == 1) {
//                k1 = 0;
//            } else {
//                k1 = k3;
//            }
//        }
//        System.out.println(k1 + k2 + k3);
//    }
//}


//输入一行字符，分别统计出包含英文字母、空格、数字和其它字符的个数。
public class ODTest9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                n1++;
            } else if (ch[i] == ' ') {
                n2++;
            } else if (Character.isDigit(ch[i])) {
                n3++;
            } else {
                n4++;
            }
        }
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}


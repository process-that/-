import java.util.Arrays;
import java.util.Scanner;

// 对字符串中的所有单词进行倒排。
//说明：
//1、构成单词的字符只有26个大写或小写英文字母；
//2、非构成单词的字符均视为单词间隔符；
//3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
//4、每个单词最长20个字母；
import java.util.Scanner;

//public class ODTest8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] ch = str.toCharArray();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < ch.length; i++) {
//            if(Character.isLetter(ch[i])){
//                sb.append(ch[i]);
//            }
//            else {
//                sb.append(" ");
//            }
//        }
//        String[] arr = sb.toString().split(" ");
//        for (int i = arr.length-1; i >=0 ; i--) {
//            System.out.print(arr[i]+" ");
//        }
//    }
//}

//按照ASCII码值从小到大排列一串字符
//public class ODTest8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] ch = str.toCharArray();
//        Arrays.sort(ch);
//        for (int i = 0; i < ch.length; i++) {
//            System.out.print(ch[i]);
//        }
//    }
//}

/**蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
例如，当输入5时，应该输出的三角形为：
1 3 6 10 15
2 5 9 14
4 8 13
7 12
11 **/

public class ODTest8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int num = 1;
        // Fill the snake matrix
        for (int i = 0; i < n; i++) {
            int row = i;
            int col = 0;
            while (row >= 0) {
                matrix[row][col] = num++;
                row--;
                col++;
            }
        }
        // Print the snake matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
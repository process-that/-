import java.util.ArrayList;
import java.util.Scanner;

//输入一个整数，将这个整数以字符串的形式逆序输出
//public class HWODTest6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        StringBuffer sb = new StringBuffer();
//        sb.append(str);
//        System.out.println(sb.reverse());
//    }
//}


// 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
//所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
//public class HWODTest6 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] words = str.split(" ");
//        ArrayList<String> arr = new ArrayList<>();
//        for (String word:words)
//        {
//            arr.add(word);
//        }
//        for (int i = arr.size()-1; i >=0 ; i--) {
//            System.out.print(arr.get(i) + " ");
//        }
//    }
//}

//输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数
public class HWODTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String sb = Integer.toBinaryString(num);
        int res = 0;
        char[] arr = sb.toCharArray();
        for (char ch:arr) {
            if(ch=='1'){
                res = res+1;
            }
        }
        System.out.println(res);
    }
}
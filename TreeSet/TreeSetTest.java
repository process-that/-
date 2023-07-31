import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//字符串最后一个单词的长度
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] s = str.split(" ");
//        int length = s[s.length-1].length();
//        System.out.println(length);
//    }
//}

//计算某字符穿线次数大小写不限
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine().toUpperCase();
//        String str2 = sc.nextLine().toUpperCase();
//        String str = str1.replaceAll(str2,"");
//        System.out.println(str1.length()-str.length());
//    }
//}

//随机数排序且去重
//public class TreeSetTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        TreeSet set = new TreeSet();
//        for (int i = 0; i < num; i++) {
//            set.add(sc.nextInt());
//        }
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//    }
//}

//字符串按照固定长度分隔，长度不够则补0
/**
 * 解题思路
 * 1.循环接收输入字符串
 * 2.先判断length大于8时，截取前8位输出，重新填充输入字符串。
 * 3.截到length小于8时，走后面if判断补0，然后截取8位。
 *
 */
//public class TreeSetTest {
    /**
     * 解题思路
     * 1.循环接收输入字符串
     * 2.先判断length大于8时，截取前8位输出，重新填充输入字符串。
     * 3.截到length小于8时，走后面if判断补0，然后截取8位。
     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNext()) {
//            // 接收字符串
//            String str = input.nextLine();
//            // 大于8
//            while (str.length() >= 8) {
//                System.out.println(str.substring(0, 8));
//                str = str.substring(8);
//            }
//            // 此时的str被截取的只剩后面不足8位的字符了
//            if (str.length() < 8 && str.length() > 0) {
//                str = str + "00000000";
//                System.out.println(str.substring(0, 8));
//            }
//
//        }
//    }
//}


//进制转换，将16进制输出为10进制
public class TreeSetTest{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(Integer.parseInt(s.substring(2,s.length()),8));
        }
    }
}




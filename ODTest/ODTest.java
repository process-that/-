import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
//10001
//public class ODTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println(str);
//    }
//}

//public class ODTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        str.toLowerCase();
//
//    }
//}

import java.util.Scanner;

//public class ODTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("请输入一串数字（以空格隔开）：");
//        String str1 = sc.nextLine();
//
//        String[] st = str1.split(" ");
//        int[] arr1 = new int[st.length];
//        for (int i = 0; i < st.length; i++) {
//            arr1[i] = Integer.parseInt(st[i]);
//        }
//        for (int num : arr1) {
//            System.out.println(num);
//        }
//    }
//}

//public class ODTest {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入座位情况（由0和1组成，以空格隔开）：");
//        String input = scanner.nextLine();
//
//        String[] seats = input.split(" ");
//        int availableSeats = 0;
//        int consecutiveEmptySeats = 0;
//
//        for (String seat : seats) {
//            int seatStatus = Integer.parseInt(seat);
//
//            if (seatStatus == 0) {
//                consecutiveEmptySeats++;
//                if (consecutiveEmptySeats == 2) {
//                    availableSeats++;
//                    consecutiveEmptySeats = 0; // 重置连续空位计数
//                }
//            } else {
//                consecutiveEmptySeats = 0; // 重置连续空位计数
//            }
//        }
//
//        System.out.println("可以坐下的座位数：" + availableSeats);
//    }
//}


// 现在有一种密码变换算法。
//九键手机键盘上的数字与字母的对应： 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0，把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.
//而密码中出现的大写字母则变成小写之后往后移一位，如：X ，先变成小写，再往后移一位，变成了 y ，例外：Z 往后移是 a 。
//数字和其它的符号都不做变换。
import java.util.Scanner;

//public class ODTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] arr = new char[str.length()];
//
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = str.charAt(i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            char originalChar = arr[i]; // 存储原始字符
//
//            // 将大写字母转换为小写并向后移一位
//            if (Character.isUpperCase(originalChar)) {
//                char lowerCaseChar = Character.toLowerCase(originalChar);
//                char transformedChar = (char) (lowerCaseChar + 1);
//
//                if (lowerCaseChar == 'z') {
//                    transformedChar = 'a';
//                }
//
//                arr[i] = transformedChar;
//            } else if (Character.isLowerCase(originalChar)) {
//                // 将小写字母转换为对应的数字
//                if ("abc".contains(String.valueOf(originalChar))) {
//                    arr[i] = '2';
//                } else if ("def".contains(String.valueOf(originalChar))) {
//                    arr[i] = '3';
//                } else if ("ghi".contains(String.valueOf(originalChar))) {
//                    arr[i] = '4';
//                } else if ("jkl".contains(String.valueOf(originalChar))) {
//                    arr[i] = '5';
//                } else if ("mno".contains(String.valueOf(originalChar))) {
//                    arr[i] = '6';
//                } else if ("pqrs".contains(String.valueOf(originalChar))) {
//                    arr[i] = '7';
//                } else if ("tuv".contains(String.valueOf(originalChar))) {
//                    arr[i] = '8';
//                } else if ("wxyz".contains(String.valueOf(originalChar))) {
//                    arr[i] = '9';
//                }
//            }
//        }
//
//        // 打印转换后的数组（您可以根据需要进行修改）
//        for (char c : arr) {
//            System.out.print(c);
//        }
//    }
//}




// 某商店规定：三个空汽水瓶可以换一瓶汽水，允许向老板借空汽水瓶（但是必须要归还）。
//小张手上有n个空汽水瓶，她想知道自己最多可以喝到多少瓶汽水。
/*递归函数*/
public class ODTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //遍历测试数据
        while (sc.hasNext()) {
            int num = sc.nextInt();
            //如果输出0则退出遍历
            if (num == 0) {
                break;
            } else {
                countCola(num, 0);
            }
        }
    }

    private static void countCola(int num, int count) {
        int chuShu = num / 3;
        int yuShu = num % 3;
        //这么什么好说的，应该都看得懂
        count = count + chuShu;
        num = chuShu + yuShu;
        //如果除数加余数是1，则借不了汽水，因为喝了你也还不了
        if (num == 1) {
            System.out.println(count);
            return;
        }
        //如果余数加除数是2或者3，那么你可以直接换汽水，或者借一瓶汽水，喝完再还
        if (num == 2 || num == 3) {
            count++;
            System.out.println(count);
            //如果以上情况都不是，接着递归
        } else {
            countCola(num, count);
        }
    }
}
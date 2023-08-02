import java.util.*;


//实现删除字符串中出现次数最少的字符，若出现次数最少的字符有多个，则把出现次数最少的字符都删除。
// 输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
//public class HWODTest2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        HashMap<Character, Integer> map = new HashMap<>();
//     while (sc.hasNext()){
//         String str = sc.nextLine();
//         char[] chars=str.toCharArray();
//         for (char ch: chars) {
//             map.put(ch,(map.getOrDefault(ch,0)+1));
//         }
//         Collection<Integer> values = map.values();
//         Integer min = Collections.min(values);
//         for (Character character: map.keySet()) {
//             if(map.get(character) == min){
//                 str =str.replaceAll(String.valueOf(character),"");
//             }
//         }
//         System.out.println(str);
//     }
//    }
//}


//整数与IP地址间的转换

//public class HWODTest2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            String s = sc.next();
//            if (s.contains(".")) {
//                System.out.println(ip2num(s));
//            } else {
//                System.out.println(num2ip(Long.parseLong(s)));
//            }
//        }
//    }
//
//    public static long ip2num(String ip) {
//        String[] iip = ip.split("\\.");
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 4; i++) {
//            int num = Integer.parseInt(iip[i]);  // 拆分
//            String num2 = Integer.toBinaryString(num);  //转换为二进制
//            while (num2.length() < 8) {
//                num2 = "0" + num2;  // 拼接
//            }
//            sb.append(num2);
//        }
//        return Long.parseLong(sb.toString(), 2);  // 转化为10进制
//    }
//
//    public static String num2ip(long num) {
//        String num2 = Long.toBinaryString(num);  //转换为2进制
//        while (num2.length() < 32) {
//            num2 = "0" + num2;
//        }
//        String[] ans = new String[4];
//        for (int i = 0; i < 4; i++) {
//            String s = num2.substring(8 * i, 8 * i + 8);  //拆分
//            s = Integer.toString(Integer.parseInt(s, 2));  //转化为10进制
//            ans[i] = s;
//        }
//        return String.join(".", ans);  //拼接
//    }
//}


//输入整型数组和排序标识，对其元素按照升序或降序进行排序

//public class HWODTest2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            int num1 = sc.nextInt();
//            int[] arr = new int[num1];
//            for (int i = 0; i < num1; i++) {
//                arr[i] = sc.nextInt();
//            }
//
//            int num2 = sc.nextInt();
//            Arrays.sort(arr);
//            if (num2 == 0) {
//                for (int i = 0; i < arr.length; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                if (num2 == 1) {
//                    for (int i = arr.length - 1; i >= 0; i--) {
//                        System.out.print(arr[i] + " ");
//                    }
//                }
//            }
//        }
//    }
//}

//将一个字符串str的内容颠倒过来，并输出。
public class HWODTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
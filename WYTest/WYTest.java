import java.util.*;

//输入两个数组合并为一个数组并降序输出
//public class WYTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] str1 = sc.nextLine().split(",");
//        String[] str2 = sc.nextLine().split(",");
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (String st:str1) {
//           int num = Integer.parseInt(st);
//           arr.add(num);
//        }
//        for (String st:str2) {
//            int num = Integer.parseInt(st);
//            arr.add(num);
//        }
//        Collections.sort(arr, Collections.reverseOrder());
//        for (Integer n:arr) {
//            System.out.print(n+",");
//        }
//        }
//    }

//字符串中出现最多次数字符的个数
//public class WYTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        HashMap<Character,Integer> map = new HashMap<>();
//        char[] arr = str.toCharArray();
//        for (char ch:arr) {
//            map.put(ch,(map.getOrDefault(ch,0)+1));
//        }
//        Collection<Integer> values = map.values();
//        Integer max = Collections.max(values);
//        for (Character ch:map.keySet()) {
//           if (map.get(ch)==max){
//               System.out.println(ch);
//        }
//        }
//    }
//}

/** 将两个整型数组按照升序合并，并且过滤掉重复数组元素。
输出时相邻两数之间没有空格。
 输入说明，按下列顺序输入：
 1 输入第一个数组的个数
 2 输入第一个数组的数值
 3 输入第二个数组的个数
 4 输入第二个数组的数值**/

/**第一种方法略笨
public class WYTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n1 = sc.nextInt();
        sc.nextLine();
        String[] str1 = sc.nextLine().split(" ");
        int n2 = sc.nextInt();
        sc.nextLine();
        String[] str2 = sc.nextLine().split(" ");
        for (String st:str1) {
            set.add(Integer.valueOf(st));
        }
        for (String st:str2) {
            set.add(Integer.valueOf(st));
        }
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);
        for (Integer n:arrayList) {
            System.out.print(n);
        }
        }
    }
 **/

//第二种方法用treeset,treeset有序
public class WYTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            Set<Long> set = new TreeSet<>();
            //接收第一个整形数组大小
            int size1 = sc.nextInt();
            for (int i = 0; i < size1; i++) {
                set.add(sc.nextLong()); //将该组的整数按数组大小循环添加进 set
            }
            //接收第一个整形数组大小
            int size2 = sc.nextInt();
            for (int i = 0; i < size2; i++) {
                set.add(sc.nextLong());
            }
            //遍历输出
            for (long n : set) {
                System.out.print(n);
            }
            System.out.println();
        }

    }
}

import java.util.*;


// 给定 n 个字符串，请对 n 个字符串按照字典序排列。
//public class HWODTest3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String[] str = new String[num];
//            for (int i = 0; i < num; i++) {
//                str[i] = sc.next();
//            }
//        Arrays.sort(str);
//        for (String st:str) {
//            System.out.println(st);
//        }
//    }
//}


// 定义一个单词的“兄弟单词”为：交换该单词字母顺序（注：可以交换任意次），而不添加、删除、修改原有的字母就能生成的单词。
//兄弟单词要求和原来的单词不同。例如： ab 和 ba 是兄弟单词。 ab 和 ab 则不是兄弟单词。
//现在给定你 n 个单词，另外再给你一个单词 x ，让你寻找 x 的兄弟单词里，按字典序排列后的第 k 个单词是什么？
//3 abc bca cab abc

    /**
     * 功能描述: <br>
     * @Param: 输入：
     * 6 cab ad abcd cba abc bca abc 1
     * 复制
     * 输出：
     * 3
     * bca
     * 复制
     * 说明：
     * abc的兄弟单词有cab cba bca，所以输出3
     * 经字典序排列后，变为bca cab cba，所以第1个字典序兄弟单词为bca
     **/

//public class HWODTest3 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        while (scanner.hasNext()) {
//            String[] ss = scanner.nextLine().split(" ");
//            Integer a = Integer.parseInt(ss[0]);
//            String x = ss[ss.length - 2];
//            Integer k = Integer.parseInt(ss[ss.length - 1]);
//            List<String> list = new ArrayList<>();
//
//            for (int i = 1; i <= a; i++) {
//                if (isBrother(x, ss[i])) {
//                    list.add(ss[i]);
//                }
//            }
//            int size = list.size();
//            System.out.println(size);
//            if (size >= k) {
//                Collections.sort(list);
//                System.out.println(list.get(k - 1));
//            }
//
//        }
//    }
//
//        public static boolean isBrother(String x, String y) {
//            if (x.length() != y.length() || y.equals(x)) {
//                return false;
//            }
//            char[] s = x.toCharArray();
//            char[] j = y.toCharArray();
//            Arrays.sort(s);
//            Arrays.sort(j);
//            return new String(s).equals(new String(j));
//        }
//    }


//成绩排序
/**
 3
0
fang 90
yang 50
ning 70   **/
public class HWODTest3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        while(sc.hasNextLine()){
            int n = Integer.parseInt(sc.nextLine());
            int flag = Integer.parseInt(sc.nextLine());//1是升序，0是降序
            int[][] score = new int[n][2];//姓名编号，成绩
            for(int i=0;i<n;i++){
                String[] nameAndScore = sc.nextLine().split("\\s+");
                score[i][0] = i;
                score[i][1] = Integer.parseInt(nameAndScore[1]);
                map.put(i,nameAndScore[0]);
            }

            Arrays.sort(score,(o1,o2) ->{
                if(flag==0){
                    return o2[1] - o1[1];//按第二列降序排列,如果相等的话，返回0，顺序不变
                }else{
                    return o1[1] - o2[1];//按第二列升序
                }
            });
            for(int i=0;i<n;i++){
                System.out.println(map.get(score[i][0]) + " " + score[i][1]);
            }
        }
    }
}
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

//给出一个仅包含字符'(',')','{','}','['和']',的字符串，判断给出的字符串是否是合法的括号序列
//括号必须以正确的顺序关闭，"()"和"()[]{}"都是合法的括号序列，但"(]"和"([)]"不合法。
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
//public class HWODTest4 {
//        public boolean isValid(String s) {
//            // write code here
//            if (s == null) {
//                return false;
//            }
//            Stack<Character> temp = new Stack<>();
//            for (char item : s.toCharArray()) {
//                if (item == '[') {
//                    temp.push(']');
//                } else if (item == '{') {
//                    temp.push('}');
//                } else if (item == '(') {
//                    temp.push(')');
//                } else if (temp.isEmpty() || temp.pop() != item) {
//                    //如果 还有数据 并且不是 [ { (  ,那么temp就是空的，不符合要求，或者弹出的元素不等于当前的 也不是
//                    return false;
//                }
//            }
//            return temp.isEmpty();
//        }
//    }


//提取不重复的整数
//输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
//逆序排列
//逆序排列

//逆序排列
public class HWODTest4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder stringBuilder = new StringBuilder(sc.nextLine()).reverse();
            String str = stringBuilder.toString();

            //结果集
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == i) {
                    result.append(str.charAt(i));
                }
            }
            System.out.println(result.toString());
        }
}



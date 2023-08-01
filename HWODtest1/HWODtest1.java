import java.util.*;

//输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
//public class HWODtest1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long num = sc.nextLong();
//        long k = (long) Math.sqrt(num);
//        for (long i = 2; i <= k; i++) {
//            while (num % i == 0) {
//                System.out.print(i + " ");
//                num = num / i;
//            }
//        }
//    }
//}

//接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。



//public class HWODtest1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double num = sc.nextDouble();
//        System.out.println(Math.round(num));
//    }
//}

// 数据表记录包含表索引index和数值value（int范围的正整数），请对表索引相同的记录进行合并，
// 即将相同索引的数值进行求和运算，输出按照index值升序进行输出。

//public class HWODtest1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int records = in.nextInt();
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>(records);
//        while (records > 0) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            Integer rtn = map.put(a, b);  //key不存在时返回null, 否则替换原值再返回原值
//            if (rtn != null) {
//                map.put(a, rtn + b);
//            }
//            records--;
//        }
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey());
//        for (Integer key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }
//    }
//}


// 给出一个整型数组 numbers 和一个目标值 target，请在数组中找出两个加起来等于目标值的数的下标，返回的下标按升序排列。
//（注：返回的数组下标从1开始算起，保证target一定可以由数组里面2个数字相加得到）


//方法一直接 暴力解两层循环遍历
//public class HWODtest1 {
//        public int[] twoSum(int[] numbers, int target) {
//            // write code here
//            int n = numbers.length;
//            int[] res = {-1, -1};
//            for (int i = 0; i < n; i++) {
//                for (int j = i + 1; j < n; j++) {
//                    if (numbers[i] + numbers[j] == target) {
//                        res[0] = i + 1;
//                        res[1] = j + 1;
//                        return res;
//                    }
//                }
//            }
//            return res;
//        }
//    }

//方法二哈希表


//public class HWODtest1 {
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> m = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (m.get(target - nums[i]) != null) {
//                return new int[]{m.get(target - nums[i]) + 1, i + 1};
//            }
//            m.put(nums[i], i);
//        }
//        return new int[]{0, 0};
//    }
//}

//统计字符个数，重复的字符只算一个
//public class HWODtest1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        HashSet<Character> set = new HashSet<>();
//        for(int i =0;i<str.length();i++){
//            set.add(str.charAt(i));
//        }
//        System.out.println(set.size());
//    }
//}


//坐标移动
//public class HWODtest1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] arr = str.split(";");
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].matches("[AWSD][0-9]*")) {
//                String first = arr[i].substring(0, 1);
//                Integer num = Integer.valueOf(arr[i].substring(1));
//                if ("A".equals(first)) {
//                    x = x - num;
//                } else if ("D".equals(first)) {
//                    x = x + num;
//                } else if ("W".equals(first)) {
//                    y = y + num;
//                } else if ("S".equals(first)) {
//                    y = y - num;
//                }
//            }
//        }
//        System.out.println(x + "," + y);
//    }
//}

//密码格式是否正确




public class HWODtest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String input = in.nextLine();
            System.out.println(ifOK(input));
        }

    }

    public static String ifOK(String input) {
        String result = new String();
        int charTypeNum = 0;

        //密码长度
        if (input.length() < 9) {
            result = "NG";
            return result;
        }

        //符号种类
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                charTypeNum++;
                break;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                charTypeNum++;
                break;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                charTypeNum++;
                break;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                continue;
            }
            if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                continue;
            }
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                continue;
            }
            if (input.charAt(i) == ' ' || input.charAt(i) == '\n') {
                continue;
            }
            charTypeNum++;
            break;
        }
        if (charTypeNum < 3) {
            result = "NG";
            return result;
        }

        //子串
        for (int i = 0; i < input.length() - 3; i++) {
            String tempStr = input.substring(i, i + 3);
            String tempStr2 = input.substring(i + 3, input.length());
            if (tempStr2.contains(tempStr)) {
                result = "NG";
                return result;
            }
        }

        result = "OK";
        return result;
    }
}
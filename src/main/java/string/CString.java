package string;


import java.util.Arrays;

/**
 * 字符转换方法
 *
 */
public class CString {
    public static void main(String[] args) {
        //字符串反转 "asdfgh"->"hgfdsa"
        // String reverse
        String asdfgh = null;
        try {
            asdfgh = reverse("asdfgh",2,3);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(asdfgh);
    }

    /**
     * 字符串倒叙
     * @param str 要倒叙的字符串
     * @param start 从第几个字符开始最小为0
     * @param end   从第几个字符结束最大为字符串长-1
     * @return
     * @throws IllegalAccessException 参数异常捕获
     */
    private static String reverse(String str,int start,int end) throws IllegalAccessException {
        //判断非法参数 验证参数
        // 思路1 列出所有错误的表达式(容易遗漏)
        // 思路2 先写正确的参数再取反(牢记目的,思路清晰)
        if (str==null||str.equals("") ||start == end||start > end || start < 0 || end > str.length() - 1) {
          throw  new IllegalAccessException("非法参数");
        }
        //把String转为char[]
        char[] chars = str.toCharArray();
        //双向遍历数组
        for (int i = start, j = end; i < j; i++, j--) {
            //双向交换
            char a = chars[i];
            chars[i] = chars[j];
            chars[j] = a;
        }
        //转回String类型
        //从新拼接成String用new String()方式
        // Arrays.toString是以字符串形式输出数组
        return new String(chars);
    }
}

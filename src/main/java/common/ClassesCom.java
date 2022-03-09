package common;

import java.util.Arrays;

public class ClassesCom {
    public static void main(String[] args) {
        //字符串 String "" 或者new 在堆堆再通过value指向字符序列
        // 常用方法 忽略大小写比较 索引获取 最后索引 截取子串 清除前后空格 索引字符
        String s = "ddee wwerw ";
        System.out.println("s.indexOf(2) = " + s.indexOf("e"));
        System.out.println("s.charAt(2) = " + s.charAt(2));
        String trim = s.trim();
        System.out.println("trim = " + trim);
        //String不可变 可变字符StringBuilder效率高  StringBuffer安全
        //Arrays数组工具类 方法:复制（目标，需要的数量） 填充fill（数组，值）
        // 比较equals（数组1，数组2） asList，数组转为list
        //System.arraycopy(src,0,dest,0,3);src 从0复制到dest的0开始 复制3位
        int[] src = {1, 2, 3};
        int[] dest = {2,0,0};
        System.arraycopy(src,1,dest,1,2);
        System.out.println("dest = " + Arrays.toString(dest));
        System.currentTimeMillis();
    }
    /**
     * jdk5 后自动拆箱装箱包装类 都实现了Comparable
     * Character
     * Byte
     * Short
     * Integer
     * Long
     * Float
     * Double
     */
}

package string;

import java.util.Objects;

public class NameOutFormat {
    public static void main(String[] args) {
        String s = "Willian jefferson Clinton";
        String s1 = nameOutFormat(s);
        System.out.println("s1 = " + s1);
        //偷入字符串,判断里面有多少个大写字母,多少个小写字母,多少个数字

        howMany(s);
    }

    /**
     *   * 大写字母ASCLL码 65-90
     *   * 小写字母ASCLL码 97-122
     *   * 数字ASCLL码 48-57
     *
     * @param str
     */
    private static void howMany(String str) {
        //校验
        if (Objects.equals(str, "")||str == null) {
            try {
                throw new IllegalAccessException("参数不能为空");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //有多少个大写字母,多少个小写字母,多少个数字
        char[] chars = str.toCharArray();
        int UpCase=0,dumpCase=0,number= 0;
        for (char aChar : chars) {
            if (aChar >= 65 && aChar <= 90) {
                UpCase++;
            }
            if (aChar >= 97 && aChar <= 122) {
                dumpCase++;
            }
            if (aChar >= 48 && aChar <= 57) {
                number++;
            }
        }
        System.out.println("有" + UpCase + "个大写字母," + dumpCase + "个小写字母," + number + "个数字" );
    }

    /**
     * 名称转换 *1* *2* *3* 转换成 *3*.*1*.(*3*的首字母大写)
     * @param name
     * @return
     */
    private static String nameOutFormat(String name) {
        //校验
        if (Objects.equals(name, "")||name == null) {
            try {
                throw new IllegalAccessException("参数不能为空");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //分割
        String[] strings = name.split(" ");
        if (strings.length != 3) {
            try {
                throw new IllegalAccessException("参数格式不正确");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        //拼接 截取substring[0,>0) 大写 toUpperCase
        //String s = new String(strings[2] + "." + strings[0] + "." + strings[1].substring(0,1).toUpperCase());
        String format = String.format("%s,%s .%c", strings[2], strings[0], strings[1].toUpperCase().charAt(0));
        return format;


    }
}

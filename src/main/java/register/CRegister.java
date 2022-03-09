package register;

public class CRegister {
    public static void main(String[] args) {
        //用户名2到4位
        //密码
        //邮箱
        try {
            System.out.println(userRegister("你好文某", "123332", "1@ema.il"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 登录验证
     * @param name  用户名称2-4位
     * @param password  6位纯数字
     * @param email 格式为*@*.*
     * @return
     * @throws IllegalAccessException
     */
    private static boolean userRegister(String name, String password, String email) throws IllegalAccessException {
        //验证
        //思路2 先检测正确的
        int i = name.length();
        int length = password.length();
        char[] chars = email.toCharArray();
        if (!(i >= 2 && i <= 4)) {
            throw new IllegalAccessException("用户名有误");
        }
        if (!(length==6&&isDigital(password))) {
            throw new IllegalAccessException("密码有误");
        }
        int i1 = email.indexOf("@");
        int i2 = email.indexOf(".");
        if (!(i1>0&&i2>i1)) {
            throw new IllegalAccessException("邮箱有误");
        }
        return true;
    }

    /**
     * 检测密码是否是纯数字
     * @param password 密码
     * @return 返回true,password视为纯数字
     */
    private static boolean isDigital(String password) {
        char[] chars = password.toCharArray();
        for (char aChar : chars) {
            if (!(aChar > '0' && aChar < '9')) {
                return false;
            }
        }
        return true;
    }


}

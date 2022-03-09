package calender;

import java.util.Calendar;

public class CCalender {

    public static void main(String[] args) {
       // public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar>
        //  构造私有化 抽象类
        //  可序列化，可克隆，可比较。
        //  维护大量的静态常量
        //  月是从0开始计算的要+1显示
        //  没有专门的格式化方法,需要程序员自行组合
        //  获取某个日历信息需要用get方法，加上Calendar类常量做参数
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println("年"+calendar.get(Calendar.YEAR));
        System.out.println("月"+(calendar.get(Calendar.MONTH)+1));
        System.out.println("年"+calendar.get(Calendar.DAY_OF_MONTH));
    }
}

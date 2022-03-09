package calender;

import sun.util.locale.provider.LocaleProviderAdapter;
import sun.util.resources.LocaleData;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;

public class Calender8 {
    public static void main(String[] args) {
        //第三代日期类 plus增加某些时间  minus减少某些时间
        LocalDateTime localeData; //检查重复事件 是否闰年 增加日期某个部分 plus测试增加某个部分
        //minus检查前一年和后一年日期
        localeData = LocalDateTime.now();
        System.out.println("localeData = " + localeData);
        Instant now = Instant.now();
        System.out.println("now = " + now);
        //Instant parse = Instant.parse("2012-03-04T11:30:46.339Z");
        long l = 3;
        TemporalAmount temporalAmount = Duration.ofSeconds(2, l);

        LocalDateTime minus = localeData.minus(temporalAmount);
        System.out.println("minus = " + minus);
        //  LocalDateTime new()当前年月日时分秒 localeData年月日
        //  LocalTime时分秒
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd/w W=F H k HH:mm:ss");
        String format = dateTimeFormatter.format(localeData);
        System.out.println("format = " + format);

        System.out.println("now = " + now);
    }
}

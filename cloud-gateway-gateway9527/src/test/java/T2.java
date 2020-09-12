import java.time.ZonedDateTime;

/**
 * @author yanglin
 * @version V1.0
 * @Package com.yl.springcloud
 * @date 2020/9/12 20:30
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2020-09-12T20:46:50.477+08:00[Asia/Shanghai]
    }
}

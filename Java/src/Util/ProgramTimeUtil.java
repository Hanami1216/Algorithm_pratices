package Util;

import java.util.concurrent.TimeUnit;

/**
 * @Description :
 * @Author : YokiWare
 * @Date: 2023/3/16  14:36
 */
public class ProgramTimeUtil {
    public static long time(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return TimeUnit.MILLISECONDS.convert(endTime - startTime, TimeUnit.NANOSECONDS);
    }
}

package p428pu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: pu.b */
/* loaded from: classes4.dex */
public abstract class AbstractC24910b {
    /* renamed from: a */
    public static String m129570a(long j11, String str) {
        return new SimpleDateFormat(str).format(new Date(j11));
    }

    /* renamed from: b */
    public static long m129571b(int i11, int i12) {
        int i13;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        if (i12 != 0) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        for (int i14 = calendar.get(7); i14 != i11; i14 = calendar.get(7)) {
            calendar.add(5, i13);
        }
        return calendar.getTimeInMillis();
    }

    /* renamed from: c */
    public static boolean m129572c(long j11, long j12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j12);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (timeInMillis != calendar.getTimeInMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m129573d(long j11, long j12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        int i11 = calendar.get(7);
        calendar.setTimeInMillis(j12);
        if (i11 == calendar.get(7)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m129574e(long j11, long j12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        int i11 = calendar.get(7);
        calendar.set(7, 2);
        int i12 = calendar.get(1);
        int i13 = calendar.get(3);
        if (i11 == 1) {
            i13--;
        }
        calendar.setTimeInMillis(j12);
        int i14 = calendar.get(7);
        calendar.set(7, 2);
        int i15 = calendar.get(1);
        int i16 = calendar.get(3);
        if (i14 == 1) {
            i16--;
        }
        if (i12 == i15 && i13 == i16) {
            return true;
        }
        return false;
    }
}

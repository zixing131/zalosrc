package me0;

import com.zing.zalocore.connection.socket.AbstractC17522a;
import ho0.AbstractC20110a;
import java.util.ArrayList;

/* renamed from: me0.k5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23121k5 {
    /* renamed from: a */
    public static int m118603a(long j11) {
        long j12;
        if (j11 <= 2147483647L) {
            return (int) j11;
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (true) {
                j12 = 0;
                if (j11 <= 0) {
                    break;
                }
                arrayList.add(Integer.valueOf((int) (j11 % 10)));
                j11 /= 10;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                double d11 = j12;
                double d12 = i11;
                if ((((Integer) arrayList.get(i11)).intValue() * Math.pow(10.0d, d12)) + d11 >= 2.147483647E9d) {
                    break;
                }
                j12 = (long) (d11 + (((Integer) arrayList.get(i11)).intValue() * Math.pow(10.0d, d12)));
            }
            return (int) j12;
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: b */
    public static float m118604b(float f11, float f12, float f13) {
        return Math.min(f12, Math.max(f11, f13));
    }

    /* renamed from: c */
    public static int m118605c(int i11, int i12, int i13) {
        return Math.min(i12, Math.max(i11, i13));
    }

    /* renamed from: d */
    public static long m118606d(long j11, long j12, long j13) {
        return Math.min(j12, Math.max(j11, j13));
    }

    /* renamed from: e */
    public static int m118607e(long j11, int i11) {
        if (j11 >= -2147483648L && j11 <= 2147483647L) {
            return (int) j11;
        }
        try {
            return AbstractC17522a.m93349l(AbstractC17522a.m93346i(j11), 0);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return i11;
        }
    }

    /* renamed from: f */
    public static int m118608f(int i11, int i12) {
        return i11;
    }
}

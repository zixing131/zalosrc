package p280jx;

import java.util.Arrays;
import mm0.AbstractC23350e;
import p220hx.AbstractC20164b;

/* renamed from: jx.e */
/* loaded from: classes4.dex */
public abstract class AbstractC21380e extends AbstractC20164b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m110837a(C21379d c21379d, long[] jArr, int i11) {
        c21379d.f104262p += jArr[i11 | 3];
        c21379d.f104263q += jArr[i11 | 2];
        c21379d.f104264r += jArr[i11 | 1];
        c21379d.f104265s += jArr[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m110838b(long[] jArr, long[] jArr2) {
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (jArr[i11] < jArr2[i11]) {
                AbstractC23350e.m122774d("NetworkMetricsCollector", "Network Bytes decreased from " + Arrays.toString(jArr2) + " to " + Arrays.toString(jArr));
                return false;
            }
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m110839c(C21379d c21379d) {
        c21379d.f104262p = 0L;
        c21379d.f104263q = 0L;
        c21379d.f104264r = 0L;
        c21379d.f104265s = 0L;
    }
}

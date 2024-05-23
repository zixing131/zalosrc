package au;

import com.zing.zalo.utils.cryptology.BlowFish;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19512f;

/* renamed from: au.a0 */
/* loaded from: classes4.dex */
public abstract class AbstractC2336a0 {

    /* renamed from: a */
    private static BlowFish f9832a;

    /* renamed from: a */
    public static long m12292a(long j11) {
        if (f9832a == null) {
            f9832a = new BlowFish(AbstractC19512f.m101984c(CoreUtility.f89225a));
        }
        return f9832a.m89290a(j11);
    }

    /* renamed from: b */
    public static long m12293b(long j11) {
        if (f9832a == null) {
            f9832a = new BlowFish(AbstractC19512f.m101984c(CoreUtility.f89225a));
        }
        return f9832a.m89291b(j11);
    }
}

package p280jx;

import android.content.Context;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jx.c */
/* loaded from: classes4.dex */
public abstract class AbstractC21378c {
    /* renamed from: a */
    public static AbstractC21378c m110831a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C21391p(context);
        }
        C21392q c21392q = new C21392q();
        if (c21392q.mo110833c(new long[8])) {
            return c21392q;
        }
        return null;
    }

    /* renamed from: b */
    public static long[] m110832b() {
        return new long[8];
    }

    /* renamed from: c */
    public abstract boolean mo110833c(long[] jArr);

    /* renamed from: d */
    public abstract long mo110834d(C21377b c21377b, C21376a c21376a, long j11, long j12);

    /* renamed from: e */
    public abstract boolean mo110835e();

    /* renamed from: f */
    public abstract void mo110836f(C21377b c21377b, C21376a c21376a);
}

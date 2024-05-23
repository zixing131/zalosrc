package p568v5;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: v5.l */
/* loaded from: classes2.dex */
public abstract class AbstractC27541l {
    /* renamed from: a */
    public static Looper m140744a(Looper looper) {
        if (looper != null) {
            return looper;
        }
        return m140745b();
    }

    /* renamed from: b */
    public static Looper m140745b() {
        boolean z11;
        if (Looper.myLooper() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19727p(z11, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}

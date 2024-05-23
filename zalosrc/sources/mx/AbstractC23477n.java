package mx;

import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23052e2;
import zw.AbstractC32562b;
import zw.C32561a;
import zw.C32563c;
import zw.C32564d;
import zw.C32565e;
import zw.C32566f;
import zw.C32568h;
import zw.C32569i;
import zw.C32570j;

/* renamed from: mx.n */
/* loaded from: classes4.dex */
public abstract class AbstractC23477n {
    /* renamed from: a */
    public static AbstractC32562b m123253a(byte b11, byte b12, String str, String str2, long j11, long j12) {
        return new C32563c(b11, b12, str, str2, j11, j12, CoreUtility.f89233i, 9);
    }

    /* renamed from: b */
    public static AbstractC32562b m123254b(long j11, long j12, String str, int i11, byte b11, byte b12, byte b13) {
        return C32564d.m157677h(j11, j12, str, i11, 5, b11, CoreUtility.f89233i, b12, b13);
    }

    /* renamed from: c */
    public static AbstractC32562b m123255c(String str, long j11, long j12, int i11, int i12) {
        String str2;
        double d11 = (j11 / 1024.0d) / 1024.0d;
        if (j12 > 0) {
            str2 = AbstractC23052e2.m118265a((((float) j11) * 1.0f) / ((float) j12), 5);
        } else {
            str2 = "-1";
        }
        return C32565e.m157683h(System.currentTimeMillis(), str, AbstractC23052e2.m118265a(d11, 2), i11, i12, 4, CoreUtility.f89233i, str2);
    }

    /* renamed from: d */
    public static AbstractC32562b m123256d(long j11, int i11, int i12, int i13, int i14) {
        return new C32566f(j11, i11, i12, i13, i14, CoreUtility.f89233i, 10);
    }

    /* renamed from: e */
    public static AbstractC32562b m123257e(long j11, int i11, int i12, String str, int i13, int i14, byte b11, String str2, byte b12) {
        return C32568h.m157689h(j11, i11, i12, str, i13, i14, 3, b11, CoreUtility.f89233i, str2, b12);
    }

    /* renamed from: f */
    public static AbstractC32562b m123258f(long j11, long j12, String str, int i11, byte b11, int i12, byte b12, C32561a c32561a, int i13, int i14) {
        return C32569i.m157697h(j11, j12, str, i11, 6, CoreUtility.f89233i, b11, i12, b12, c32561a, i13, i14);
    }

    /* renamed from: g */
    public static AbstractC32562b m123259g(long j11, int i11, String str, long j12, long j13, String str2, boolean z11, String str3) {
        return C32570j.m157705h(j11, i11, str, j12, j13, CoreUtility.f89233i, 8, str2, z11, str3);
    }

    /* renamed from: h */
    public static String m123260h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "-";
        }
        return str.replace("\n", " ").replace("\r", " ").replace("\t", " ");
    }
}

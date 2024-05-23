package p405ov;

import com.zing.zalo.common.C7853b;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;

/* renamed from: ov.a */
/* loaded from: classes4.dex */
public final class C24559a {

    /* renamed from: a */
    public static final C24559a f118248a = new C24559a();

    private C24559a() {
    }

    /* renamed from: a */
    public static final void m127931a(int i11, Exception exc) {
        Exception exc2;
        if (i11 == 0) {
            return;
        }
        try {
            long m127932b = f118248a.m127932b();
            if (m127932b - AbstractC23309i.m120891E6() > 86400000) {
                AbstractC23309i.m121840dr(m127932b);
                if (exc != null) {
                    exc2 = new Exception("Download photo failed: reason " + i11, exc);
                } else {
                    exc2 = new Exception("Download photo failed: reason " + i11);
                }
                CoreUtility.m93148a().mo100074a(exc2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatLog", e11);
        }
    }

    /* renamed from: b */
    private final long m127932b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public static final void m127933c(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119291t0(f118248a.m127932b()) + "] " + str2, new Object[0]);
    }

    /* renamed from: d */
    public static final void m127934d() {
        try {
            long m127932b = f118248a.m127932b();
            if (m127932b - AbstractC23309i.m120891E6() > 86400000) {
                AbstractC23309i.m121840dr(m127932b);
                CoreUtility.m93148a().mo100074a(new Exception("E2EE Photo Url Invalid"));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatLog", e11);
        }
    }

    /* renamed from: e */
    public static final void m127935e(String str, String str2, Throwable th2) {
        AbstractC19074t.m100208f(str, "errCode");
        try {
            if (f118248a.m127932b() - AbstractC23309i.m120928F6() > 86400000) {
                if (th2 == null) {
                    th2 = new Exception("Error code: " + str);
                }
                C7853b m40150a = C7853b.Companion.m40150a();
                if (str2 == null) {
                    str2 = "";
                }
                m40150a.m40148t0(str2, 0L, th2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatLog", e11);
        }
    }
}

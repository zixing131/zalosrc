package p042bx;

import android.content.Context;
import android.os.Looper;
import me0.AbstractC23122k6;
import p042bx.C3150e;

/* renamed from: bx.c */
/* loaded from: classes4.dex */
public final class C3148c {

    /* renamed from: c */
    private static C3148c f13302c;

    /* renamed from: d */
    private static C3150e.b f13303d;

    /* renamed from: a */
    private C3150e f13304a;

    /* renamed from: b */
    private boolean f13305b = false;

    private C3148c() {
        C3150e.m15859j(AbstractC3149d.m15845c());
        C3150e m15857g = C3150e.m15857g();
        this.f13304a = m15857g;
        m15857g.m15864c(AbstractC3149d.m15845c());
    }

    /* renamed from: a */
    public static synchronized C3148c m15840a() {
        C3148c c3148c;
        synchronized (C3148c.class) {
            try {
                if (f13302c == null) {
                    C3148c c3148c2 = new C3148c();
                    f13302c = c3148c2;
                    c3148c2.m15843d(f13303d);
                }
                c3148c = f13302c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c3148c;
    }

    /* renamed from: b */
    public static C3148c m15841b(Context context, AbstractC3149d abstractC3149d, C3150e.b bVar) {
        AbstractC3149d.m15846d(context, abstractC3149d);
        f13303d = (C3150e.b) AbstractC23122k6.m118609a(bVar);
        return m15840a();
    }

    /* renamed from: c */
    public static void m15842c(String str) {
        f13303d.mo15866a(5000L, str);
    }

    /* renamed from: d */
    public void m15843d(C3150e.b bVar) {
        if (this.f13304a != null) {
            C3150e.m15861l(bVar);
        }
    }

    /* renamed from: e */
    public void m15844e() {
        if (!this.f13305b) {
            this.f13305b = true;
            Looper.getMainLooper().setMessageLogging(this.f13304a.f13310a);
        }
    }
}

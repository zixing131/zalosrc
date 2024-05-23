package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: com.google.android.gms.internal.ads.id */
/* loaded from: classes2.dex */
public final class C4608id {

    /* renamed from: c */
    private static final ConditionVariable f22143c = new ConditionVariable();

    /* renamed from: d */
    protected static volatile t13 f22144d = null;

    /* renamed from: e */
    private static volatile Random f22145e = null;

    /* renamed from: a */
    private final C4719le f22146a;

    /* renamed from: b */
    protected volatile Boolean f22147b;

    public C4608id(C4719le c4719le) {
        this.f22146a = c4719le;
        c4719le.m24248k().execute(new RunnableC4571hd(this));
    }

    /* renamed from: d */
    public static final int m23225d() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return m23226e().nextInt();
        }
    }

    /* renamed from: e */
    private static Random m23226e() {
        if (f22145e == null) {
            synchronized (C4608id.class) {
                try {
                    if (f22145e == null) {
                        f22145e = new Random();
                    }
                } finally {
                }
            }
        }
        return f22145e;
    }

    /* renamed from: c */
    public final void m23227c(int i11, int i12, long j11, String str, Exception exc) {
        try {
            f22143c.block();
            if (this.f22147b.booleanValue() && f22144d != null) {
                C4383ca m22747F = C4568ha.m22747F();
                m22747F.m20843q(this.f22146a.f23865a.getPackageName());
                m22747F.m20847v(j11);
                if (str != null) {
                    m22747F.m20844r(str);
                }
                if (exc != null) {
                    StringWriter stringWriter = new StringWriter();
                    exc.printStackTrace(new PrintWriter(stringWriter));
                    m22747F.m20848w(stringWriter.toString());
                    m22747F.m20846u(exc.getClass().getName());
                }
                s13 m26536a = f22144d.m26536a(((C4568ha) m22747F.m25898n()).mo27346a());
                m26536a.m26221a(i11);
                if (i12 != -1) {
                    m26536a.m26222b(i12);
                }
                m26536a.m26223c();
            }
        } catch (Exception unused) {
        }
    }
}

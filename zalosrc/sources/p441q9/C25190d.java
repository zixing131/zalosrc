package p441q9;

import android.content.Context;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p319l9.C22152a;
import p476r9.AbstractC25706n;
import p476r9.C25693a;
import p476r9.C25701i;
import p476r9.EnumC25695c;
import p507s9.C26192i;
import p507s9.C26194k;
import p507s9.EnumC26195l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q9.d */
/* loaded from: classes3.dex */
public final class C25190d {

    /* renamed from: a */
    private final C6662a f120876a;

    /* renamed from: b */
    private final float f120877b;

    /* renamed from: c */
    private final float f120878c;

    /* renamed from: d */
    private a f120879d;

    /* renamed from: e */
    private a f120880e;

    /* renamed from: f */
    private boolean f120881f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q9.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: k */
        private static final C22152a f120882k = C22152a.m115524e();

        /* renamed from: l */
        private static final long f120883l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        private final C25693a f120884a;

        /* renamed from: b */
        private final boolean f120885b;

        /* renamed from: c */
        private Timer f120886c;

        /* renamed from: d */
        private C25701i f120887d;

        /* renamed from: e */
        private long f120888e;

        /* renamed from: f */
        private double f120889f;

        /* renamed from: g */
        private C25701i f120890g;

        /* renamed from: h */
        private C25701i f120891h;

        /* renamed from: i */
        private long f120892i;

        /* renamed from: j */
        private long f120893j;

        a(C25701i c25701i, long j11, C25693a c25693a, C6662a c6662a, String str, boolean z11) {
            this.f120884a = c25693a;
            this.f120888e = j11;
            this.f120887d = c25701i;
            this.f120889f = j11;
            this.f120886c = c25693a.m132598a();
            m130397g(c6662a, str, z11);
            this.f120885b = z11;
        }

        /* renamed from: c */
        private static long m130393c(C6662a c6662a, String str) {
            if (str == "Trace") {
                return c6662a.m34056E();
            }
            return c6662a.m34068q();
        }

        /* renamed from: d */
        private static long m130394d(C6662a c6662a, String str) {
            if (str == "Trace") {
                return c6662a.m34071t();
            }
            return c6662a.m34071t();
        }

        /* renamed from: e */
        private static long m130395e(C6662a c6662a, String str) {
            if (str == "Trace") {
                return c6662a.m34057F();
            }
            return c6662a.m34069r();
        }

        /* renamed from: f */
        private static long m130396f(C6662a c6662a, String str) {
            if (str == "Trace") {
                return c6662a.m34071t();
            }
            return c6662a.m34071t();
        }

        /* renamed from: g */
        private void m130397g(C6662a c6662a, String str, boolean z11) {
            long m130396f = m130396f(c6662a, str);
            long m130395e = m130395e(c6662a, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C25701i c25701i = new C25701i(m130395e, m130396f, timeUnit);
            this.f120890g = c25701i;
            this.f120892i = m130395e;
            if (z11) {
                f120882k.m115526b("Foreground %s logging rate:%f, burst capacity:%d", str, c25701i, Long.valueOf(m130395e));
            }
            long m130394d = m130394d(c6662a, str);
            long m130393c = m130393c(c6662a, str);
            C25701i c25701i2 = new C25701i(m130393c, m130394d, timeUnit);
            this.f120891h = c25701i2;
            this.f120893j = m130393c;
            if (z11) {
                f120882k.m115526b("Background %s logging rate:%f, capacity:%d", str, c25701i2, Long.valueOf(m130393c));
            }
        }

        /* renamed from: a */
        synchronized void m130398a(boolean z11) {
            C25701i c25701i;
            long j11;
            try {
                if (z11) {
                    c25701i = this.f120890g;
                } else {
                    c25701i = this.f120891h;
                }
                this.f120887d = c25701i;
                if (z11) {
                    j11 = this.f120892i;
                } else {
                    j11 = this.f120893j;
                }
                this.f120888e = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: b */
        synchronized boolean m130399b(C26192i c26192i) {
            try {
                Timer m132598a = this.f120884a.m132598a();
                double m34293d = (this.f120886c.m34293d(m132598a) * this.f120887d.m132615a()) / f120883l;
                if (m34293d > 0.0d) {
                    this.f120889f = Math.min(this.f120889f + m34293d, this.f120888e);
                    this.f120886c = m132598a;
                }
                double d11 = this.f120889f;
                if (d11 >= 1.0d) {
                    this.f120889f = d11 - 1.0d;
                    return true;
                }
                if (this.f120885b) {
                    f120882k.m115533j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C25190d(Context context, C25701i c25701i, long j11) {
        this(c25701i, j11, new C25693a(), m130383b(), m130383b(), C6662a.m34042g());
        this.f120881f = AbstractC25706n.m132621b(context);
    }

    /* renamed from: b */
    static float m130383b() {
        return new Random().nextFloat();
    }

    /* renamed from: c */
    private boolean m130384c(List list) {
        if (list.size() <= 0 || ((C26194k) list.get(0)).m134709R() <= 0 || ((C26194k) list.get(0)).m134708Q(0) != EnumC26195l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m130385d() {
        if (this.f120878c < this.f120876a.m34063f()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m130386e() {
        if (this.f120877b < this.f120876a.m34070s()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m130387f() {
        if (this.f120877b < this.f120876a.m34058G()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m130388a(boolean z11) {
        this.f120879d.m130398a(z11);
        this.f120880e.m130398a(z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m130389g(C26192i c26192i) {
        if (!m130392j(c26192i)) {
            return false;
        }
        if (c26192i.mo134692c()) {
            return !this.f120880e.m130399b(c26192i);
        }
        if (!c26192i.mo134694i()) {
            return true;
        }
        return !this.f120879d.m130399b(c26192i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean m130390h(C26192i c26192i) {
        if (c26192i.mo134694i() && !m130387f() && !m130384c(c26192i.mo134695j().m134748k0())) {
            return false;
        }
        if (m130391i(c26192i) && !m130385d() && !m130384c(c26192i.mo134695j().m134748k0())) {
            return false;
        }
        if (c26192i.mo134692c() && !m130386e() && !m130384c(c26192i.mo134693e().m134643g0())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    protected boolean m130391i(C26192i c26192i) {
        if (c26192i.mo134694i() && c26192i.mo134695j().m134747j0().startsWith("_st_") && c26192i.mo134695j().m134742Z("Hosting_activity")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    boolean m130392j(C26192i c26192i) {
        if ((c26192i.mo134694i() && ((c26192i.mo134695j().m134747j0().equals(EnumC25695c.FOREGROUND_TRACE_NAME.toString()) || c26192i.mo134695j().m134747j0().equals(EnumC25695c.BACKGROUND_TRACE_NAME.toString())) && c26192i.mo134695j().m134743c0() > 0)) || c26192i.mo134691a()) {
            return false;
        }
        return true;
    }

    C25190d(C25701i c25701i, long j11, C25693a c25693a, float f11, float f12, C6662a c6662a) {
        this.f120879d = null;
        this.f120880e = null;
        boolean z11 = false;
        this.f120881f = false;
        AbstractC25706n.m132620a(0.0f <= f11 && f11 < 1.0f, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        if (0.0f <= f12 && f12 < 1.0f) {
            z11 = true;
        }
        AbstractC25706n.m132620a(z11, "Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        this.f120877b = f11;
        this.f120878c = f12;
        this.f120876a = c6662a;
        this.f120879d = new a(c25701i, j11, c25693a, c6662a, "Trace", this.f120881f);
        this.f120880e = new a(c25701i, j11, c25693a, c6662a, "Network", this.f120881f);
    }
}

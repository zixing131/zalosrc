package vg;

import ag0.AbstractC0837p0;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import bo.C3020p0;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p348mi.AbstractC23309i;
import p716zh.C31854b6;
import tg.C26657h;
import tg.C26674y;

/* renamed from: vg.e4 */
/* loaded from: classes3.dex */
public class C28051e4 {

    /* renamed from: a */
    private final Object f130941a;

    /* renamed from: b */
    private final Set f130942b;

    /* renamed from: c */
    private HandlerThread f130943c;

    /* renamed from: d */
    private Handler f130944d;

    /* renamed from: vg.e4$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        static C28051e4 f130945a = new C28051e4();
    }

    /* synthetic */ C28051e4(AbstractC28061f4 abstractC28061f4) {
        this();
    }

    /* renamed from: d */
    private void m141512d(String str) {
        if (m141526s(str)) {
            m141524q(str);
            m141522n(str);
        }
    }

    /* renamed from: e */
    private int m141513e() {
        int i11;
        synchronized (this.f130941a) {
            try {
                Set set = this.f130942b;
                if (set != null) {
                    i11 = set.size();
                } else {
                    i11 = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    /* renamed from: f */
    public static C28051e4 m141514f() {
        return a.f130945a;
    }

    /* renamed from: g */
    private void m141515g(int i11, String str, String str2) {
        m141525r(str);
        if (i11 == 0 && C28111k4.m141588d().m141595i()) {
            C28111k4.m141588d().m141596j(str, str2);
        }
    }

    /* renamed from: h */
    private void m141516h() {
        try {
            HandlerThread handlerThread = new HandlerThread("Z:FeedEffectLoader");
            this.f130943c = handlerThread;
            handlerThread.start();
            this.f130944d = new Handler(this.f130943c.getLooper());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    private boolean m141517i(String str) {
        boolean z11;
        synchronized (this.f130941a) {
            try {
                Set set = this.f130942b;
                if (set != null && set.contains(str)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    /* renamed from: j */
    public /* synthetic */ void m141518j(int i11, String str, String str2, C26657h c26657h) {
        m141515g(i11, str, str2);
    }

    /* renamed from: k */
    public /* synthetic */ void m141519k(String str) {
        C26674y.m136865t().m136877n(str, System.currentTimeMillis() + "", new C26674y.b() { // from class: vg.d4
            public /* synthetic */ C28041d4() {
            }

            @Override // tg.C26674y.b
            /* renamed from: a */
            public final void mo15759a(int i11, String str2, String str3, C26657h c26657h) {
                C28051e4.this.m141518j(i11, str2, str3, c26657h);
            }
        }, (byte) 1);
    }

    /* renamed from: m */
    public void m141520l(String str) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.c4

            /* renamed from: q */
            public final /* synthetic */ String f130883q;

            public /* synthetic */ RunnableC28031c4(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28051e4.this.m141519k(r2);
            }
        });
    }

    /* renamed from: n */
    private void m141522n(String str) {
        if (this.f130944d != null && !TextUtils.isEmpty(str) && !this.f130944d.postDelayed(new Runnable() { // from class: vg.b4

            /* renamed from: q */
            public final /* synthetic */ String f130668q;

            public /* synthetic */ RunnableC28021b4(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28051e4.this.m141520l(r2);
            }
        }, 500L)) {
            m141525r(str2);
        }
    }

    /* renamed from: o */
    private void m141523o(C3020p0 c3020p0) {
        C31854b6 c31854b6;
        int i11;
        Map map = null;
        if (c3020p0 != null) {
            try {
                c31854b6 = c3020p0.f12051e0;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        } else {
            c31854b6 = null;
        }
        if (c31854b6 != null) {
            map = c31854b6.f146276a;
        }
        if (map != null && !map.isEmpty()) {
            for (C28202u5 c28202u5 : map.values()) {
                if (c28202u5 != null && (i11 = c28202u5.f131403a) > 0) {
                    m141512d(String.valueOf(i11));
                }
            }
        }
    }

    /* renamed from: q */
    private void m141524q(String str) {
        Set set;
        synchronized (this.f130941a) {
            try {
                if (!TextUtils.isEmpty(str) && (set = this.f130942b) != null) {
                    set.add(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private void m141525r(String str) {
        Set set;
        synchronized (this.f130941a) {
            try {
                if (!TextUtils.isEmpty(str) && (set = this.f130942b) != null) {
                    set.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    private boolean m141526s(String str) {
        if (!TextUtils.isEmpty(str) && !m141517i(str) && m141513e() < 10 && AbstractC23309i.m122429tf()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void m141527p(C3020p0 c3020p0) {
        m141523o(c3020p0);
    }

    private C28051e4() {
        this.f130941a = new Object();
        this.f130942b = new HashSet();
        m141516h();
    }
}

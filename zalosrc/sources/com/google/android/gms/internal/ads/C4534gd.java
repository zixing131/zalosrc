package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import s00.AbstractC26080o;

/* renamed from: com.google.android.gms.internal.ads.gd */
/* loaded from: classes2.dex */
public final class C4534gd implements InterfaceC4681kd {

    /* renamed from: E */
    private static C4534gd f20541E;

    /* renamed from: B */
    private volatile boolean f20543B;

    /* renamed from: D */
    private final int f20545D;

    /* renamed from: p */
    private final Context f20546p;

    /* renamed from: q */
    private final j13 f20547q;

    /* renamed from: r */
    private final o13 f20548r;

    /* renamed from: s */
    private final p13 f20549s;

    /* renamed from: t */
    private final C4461ee f20550t;

    /* renamed from: u */
    private final xz2 f20551u;

    /* renamed from: v */
    private final Executor f20552v;

    /* renamed from: w */
    private final n13 f20553w;

    /* renamed from: y */
    private final C5091ve f20555y;

    /* renamed from: z */
    volatile long f20556z = 0;

    /* renamed from: A */
    private final Object f20542A = new Object();

    /* renamed from: C */
    private volatile boolean f20544C = false;

    /* renamed from: x */
    private final CountDownLatch f20554x = new CountDownLatch(1);

    C4534gd(Context context, xz2 xz2Var, j13 j13Var, o13 o13Var, p13 p13Var, C4461ee c4461ee, Executor executor, sz2 sz2Var, int i11, C5091ve c5091ve) {
        this.f20546p = context;
        this.f20551u = xz2Var;
        this.f20547q = j13Var;
        this.f20548r = o13Var;
        this.f20549s = p13Var;
        this.f20550t = c4461ee;
        this.f20552v = executor;
        this.f20545D = i11;
        this.f20555y = c5091ve;
        this.f20553w = new C4460ed(this, sz2Var);
    }

    /* renamed from: a */
    public static synchronized C4534gd m22414a(String str, Context context, boolean z11, boolean z12) {
        C4534gd m22415b;
        synchronized (C4534gd.class) {
            m22415b = m22415b(str, context, Executors.newCachedThreadPool(), z11, z12);
        }
        return m22415b;
    }

    /* renamed from: b */
    public static synchronized C4534gd m22415b(String str, Context context, Executor executor, boolean z11, boolean z12) {
        C4534gd c4534gd;
        C4942rd c4942rd;
        C5091ve c5091ve;
        synchronized (C4534gd.class) {
            try {
                if (f20541E == null) {
                    yz2 m28671a = zz2.m28671a();
                    m28671a.mo20776a(str);
                    m28671a.mo20778c(z11);
                    zz2 mo20779d = m28671a.mo20779d();
                    xz2 m28090a = xz2.m28090a(context, executor, z12);
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20944B2)).booleanValue()) {
                        c4942rd = C4942rd.m26068c(context);
                    } else {
                        c4942rd = null;
                    }
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20954C2)).booleanValue()) {
                        c5091ve = C5091ve.m27210d(context, executor);
                    } else {
                        c5091ve = null;
                    }
                    r03 m25926e = r03.m25926e(context, executor, m28090a, mo20779d);
                    zzapx zzapxVar = new zzapx(context);
                    C4461ee c4461ee = new C4461ee(mo20779d, m25926e, new ViewOnAttachStateChangeListenerC4980se(context, zzapxVar), zzapxVar, c4942rd, c5091ve);
                    int m19957b = a13.m19957b(context, m28090a);
                    sz2 sz2Var = new sz2();
                    C4534gd c4534gd2 = new C4534gd(context, m28090a, new j13(context, m19957b), new o13(context, m19957b, new C4423dd(m28090a), ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21113S1)).booleanValue()), new p13(context, c4461ee, m28090a, sz2Var), c4461ee, executor, sz2Var, m19957b, c5091ve);
                    f20541E = c4534gd2;
                    c4534gd2.m22423g();
                    f20541E.m22424h();
                }
                c4534gd = f20541E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c4534gd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m22419f(C4534gd c4534gd) {
        String str;
        String str2;
        CountDownLatch countDownLatch;
        boolean m23505b;
        long currentTimeMillis = System.currentTimeMillis();
        i13 m22422l = c4534gd.m22422l(1);
        if (m22422l != null) {
            String m24284O = m22422l.m23110a().m24284O();
            str2 = m22422l.m23110a().m24283N();
            str = m24284O;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                zzfoq m23102a = i03.m23102a(c4534gd.f20546p, 1, c4534gd.f20545D, str, str2, "1", c4534gd.f20551u);
                byte[] bArr = m23102a.f32127q;
                if (bArr != null && bArr.length != 0) {
                    try {
                        C4611ig m23243G = C4611ig.m23243G(mt3.m24726I(bArr), gu3.m22615a());
                        if (!m23243G.m23244H().m24284O().isEmpty() && !m23243G.m23244H().m24283N().isEmpty() && m23243G.m23245I().m24738k().length != 0) {
                            i13 m22422l2 = c4534gd.m22422l(1);
                            if (m22422l2 != null) {
                                C4721lg m23110a = m22422l2.m23110a();
                                if (m23243G.m23244H().m24284O().equals(m23110a.m24284O())) {
                                    if (!m23243G.m23244H().m24283N().equals(m23110a.m24283N())) {
                                    }
                                }
                            }
                            n13 n13Var = c4534gd.f20553w;
                            int i11 = m23102a.f32128r;
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21093Q1)).booleanValue()) {
                                if (i11 == 3) {
                                    m23505b = c4534gd.f20548r.m25063a(m23243G);
                                } else {
                                    if (i11 == 4) {
                                        m23505b = c4534gd.f20548r.m25064b(m23243G, n13Var);
                                    }
                                    c4534gd.f20551u.m28095d(4009, System.currentTimeMillis() - currentTimeMillis);
                                    countDownLatch = c4534gd.f20554x;
                                }
                            } else {
                                m23505b = c4534gd.f20547q.m23505b(m23243G, n13Var);
                            }
                            if (m23505b) {
                                i13 m22422l3 = c4534gd.m22422l(1);
                                if (m22422l3 != null) {
                                    if (c4534gd.f20549s.m25380c(m22422l3)) {
                                        c4534gd.f20544C = true;
                                    }
                                    c4534gd.f20556z = System.currentTimeMillis() / 1000;
                                }
                                countDownLatch = c4534gd.f20554x;
                            }
                            c4534gd.f20551u.m28095d(4009, System.currentTimeMillis() - currentTimeMillis);
                            countDownLatch = c4534gd.f20554x;
                        }
                        c4534gd.f20551u.m28095d(5010, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = c4534gd.f20554x;
                    } catch (NullPointerException unused) {
                        c4534gd.f20551u.m28095d(2030, System.currentTimeMillis() - currentTimeMillis);
                        countDownLatch = c4534gd.f20554x;
                    }
                } else {
                    c4534gd.f20551u.m28095d(5009, System.currentTimeMillis() - currentTimeMillis);
                    countDownLatch = c4534gd.f20554x;
                }
            } catch (zzgrq e11) {
                c4534gd.f20551u.m28094c(4002, System.currentTimeMillis() - currentTimeMillis, e11);
                countDownLatch = c4534gd.f20554x;
            }
            countDownLatch.countDown();
        } catch (Throwable th2) {
            c4534gd.f20554x.countDown();
            throw th2;
        }
    }

    /* renamed from: k */
    private final void m22421k() {
        C5091ve c5091ve = this.f20555y;
        if (c5091ve != null) {
            c5091ve.m27216h();
        }
    }

    /* renamed from: l */
    private final i13 m22422l(int i11) {
        if (!a13.m19956a(this.f20545D)) {
            return null;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21093Q1)).booleanValue()) {
            return this.f20548r.m25065c(1);
        }
        return this.f20547q.m23507d(1);
    }

    /* renamed from: g */
    final synchronized void m22423g() {
        long currentTimeMillis = System.currentTimeMillis();
        i13 m22422l = m22422l(1);
        if (m22422l != null) {
            if (this.f20549s.m25380c(m22422l)) {
                this.f20544C = true;
                this.f20554x.countDown();
                return;
            }
            return;
        }
        this.f20551u.m28095d(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    /* renamed from: h */
    public final void m22424h() {
        if (!this.f20543B) {
            synchronized (this.f20542A) {
                try {
                    if (!this.f20543B) {
                        if ((System.currentTimeMillis() / 1000) - this.f20556z < 3600) {
                            return;
                        }
                        i13 m25379b = this.f20549s.m25379b();
                        if ((m25379b == null || m25379b.m23113d(3600L)) && a13.m19956a(this.f20545D)) {
                            this.f20552v.execute(new RunnableC4497fd(this));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: j */
    public final synchronized boolean m22425j() {
        return this.f20544C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzf(Context context, String str, View view, Activity activity) {
        m22421k();
        m22424h();
        b03 m25378a = this.f20549s.m25378a();
        if (m25378a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo20366d = m25378a.mo20366d(context, null, str, view, activity);
            this.f20551u.m28097f(AbstractC26080o.a.f124275b, System.currentTimeMillis() - currentTimeMillis, mo20366d, null);
            return mo20366d;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzg(Context context) {
        m22421k();
        m22424h();
        b03 m25378a = this.f20549s.m25378a();
        if (m25378a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo20365c = m25378a.mo20365c(context, null);
            this.f20551u.m28097f(5001, System.currentTimeMillis() - currentTimeMillis, mo20365c, null);
            return mo20365c;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final String zzh(Context context, View view, Activity activity) {
        m22421k();
        m22424h();
        b03 m25378a = this.f20549s.m25378a();
        if (m25378a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo20364b = m25378a.mo20364b(context, null, view, activity);
            this.f20551u.m28097f(5002, System.currentTimeMillis() - currentTimeMillis, mo20364b, null);
            return mo20364b;
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzk(MotionEvent motionEvent) {
        b03 m25378a = this.f20549s.m25378a();
        if (m25378a != null) {
            try {
                m25378a.mo20363a(null, motionEvent);
            } catch (zzfou e11) {
                this.f20551u.m28094c(e11.m28814a(), -1L, e11);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzl(int i11, int i12, int i13) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4681kd
    public final void zzn(View view) {
        this.f20550t.m21699a(view);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class pf4 {

    /* renamed from: a */
    public final int f26205a;

    /* renamed from: b */
    public final gf4 f26206b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f26207c;

    private pf4(CopyOnWriteArrayList copyOnWriteArrayList, int i11, gf4 gf4Var, long j11) {
        this.f26207c = copyOnWriteArrayList;
        this.f26205a = i11;
        this.f26206b = gf4Var;
    }

    /* renamed from: n */
    private static final long m25440n(long j11) {
        long m22352j0 = g92.m22352j0(j11);
        if (m22352j0 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m22352j0;
    }

    /* renamed from: a */
    public final pf4 m25441a(int i11, gf4 gf4Var, long j11) {
        return new pf4(this.f26207c, i11, gf4Var, 0L);
    }

    /* renamed from: b */
    public final void m25442b(Handler handler, qf4 qf4Var) {
        qf4Var.getClass();
        this.f26207c.add(new of4(handler, qf4Var));
    }

    /* renamed from: c */
    public final void m25443c(cf4 cf4Var) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            g92.m22367y(of4Var.f25621a, new Runnable() { // from class: com.google.android.gms.internal.ads.jf4

                /* renamed from: q */
                public final /* synthetic */ qf4 f22803q;

                /* renamed from: r */
                public final /* synthetic */ cf4 f22804r;

                public /* synthetic */ jf4(qf4 qf4Var, cf4 cf4Var2) {
                    r2 = qf4Var;
                    r3 = cf4Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pf4 pf4Var = pf4.this;
                    r2.mo24557H(pf4Var.f26205a, pf4Var.f26206b, r3);
                }
            });
        }
    }

    /* renamed from: d */
    public final void m25444d(int i11, C4671k3 c4671k3, int i12, Object obj, long j11) {
        m25443c(new cf4(1, i11, c4671k3, 0, null, m25440n(j11), -9223372036854775807L));
    }

    /* renamed from: e */
    public final void m25445e(we4 we4Var, cf4 cf4Var) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            g92.m22367y(of4Var.f25621a, new Runnable() { // from class: com.google.android.gms.internal.ads.kf4

                /* renamed from: q */
                public final /* synthetic */ qf4 f23309q;

                /* renamed from: r */
                public final /* synthetic */ we4 f23310r;

                /* renamed from: s */
                public final /* synthetic */ cf4 f23311s;

                public /* synthetic */ kf4(qf4 qf4Var, we4 we4Var2, cf4 cf4Var2) {
                    r2 = qf4Var;
                    r3 = we4Var2;
                    r4 = cf4Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pf4 pf4Var = pf4.this;
                    r2.mo24558L(pf4Var.f26205a, pf4Var.f26206b, r3, r4);
                }
            });
        }
    }

    /* renamed from: f */
    public final void m25446f(we4 we4Var, int i11, int i12, C4671k3 c4671k3, int i13, Object obj, long j11, long j12) {
        m25445e(we4Var, new cf4(1, -1, null, 0, null, m25440n(j11), m25440n(j12)));
    }

    /* renamed from: g */
    public final void m25447g(we4 we4Var, cf4 cf4Var) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            g92.m22367y(of4Var.f25621a, new Runnable() { // from class: com.google.android.gms.internal.ads.nf4

                /* renamed from: q */
                public final /* synthetic */ qf4 f25172q;

                /* renamed from: r */
                public final /* synthetic */ we4 f25173r;

                /* renamed from: s */
                public final /* synthetic */ cf4 f25174s;

                public /* synthetic */ nf4(qf4 qf4Var, we4 we4Var2, cf4 cf4Var2) {
                    r2 = qf4Var;
                    r3 = we4Var2;
                    r4 = cf4Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pf4 pf4Var = pf4.this;
                    r2.mo24555C(pf4Var.f26205a, pf4Var.f26206b, r3, r4);
                }
            });
        }
    }

    /* renamed from: h */
    public final void m25448h(we4 we4Var, int i11, int i12, C4671k3 c4671k3, int i13, Object obj, long j11, long j12) {
        m25447g(we4Var, new cf4(1, -1, null, 0, null, m25440n(j11), m25440n(j12)));
    }

    /* renamed from: i */
    public final void m25449i(we4 we4Var, cf4 cf4Var, IOException iOException, boolean z11) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            g92.m22367y(of4Var.f25621a, new Runnable() { // from class: com.google.android.gms.internal.ads.lf4

                /* renamed from: q */
                public final /* synthetic */ qf4 f23907q;

                /* renamed from: r */
                public final /* synthetic */ we4 f23908r;

                /* renamed from: s */
                public final /* synthetic */ cf4 f23909s;

                /* renamed from: t */
                public final /* synthetic */ IOException f23910t;

                /* renamed from: u */
                public final /* synthetic */ boolean f23911u;

                public /* synthetic */ lf4(qf4 qf4Var, we4 we4Var2, cf4 cf4Var2, IOException iOException2, boolean z112) {
                    r2 = qf4Var;
                    r3 = we4Var2;
                    r4 = cf4Var2;
                    r5 = iOException2;
                    r6 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pf4 pf4Var = pf4.this;
                    r2.mo24559z(pf4Var.f26205a, pf4Var.f26206b, r3, r4, r5, r6);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m25450j(we4 we4Var, int i11, int i12, C4671k3 c4671k3, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
        m25449i(we4Var, new cf4(1, -1, null, 0, null, m25440n(j11), m25440n(j12)), iOException, z11);
    }

    /* renamed from: k */
    public final void m25451k(we4 we4Var, cf4 cf4Var) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            g92.m22367y(of4Var.f25621a, new Runnable() { // from class: com.google.android.gms.internal.ads.mf4

                /* renamed from: q */
                public final /* synthetic */ qf4 f24501q;

                /* renamed from: r */
                public final /* synthetic */ we4 f24502r;

                /* renamed from: s */
                public final /* synthetic */ cf4 f24503s;

                public /* synthetic */ mf4(qf4 qf4Var, we4 we4Var2, cf4 cf4Var2) {
                    r2 = qf4Var;
                    r3 = we4Var2;
                    r4 = cf4Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    pf4 pf4Var = pf4.this;
                    r2.mo24556G(pf4Var.f26205a, pf4Var.f26206b, r3, r4);
                }
            });
        }
    }

    /* renamed from: l */
    public final void m25452l(we4 we4Var, int i11, int i12, C4671k3 c4671k3, int i13, Object obj, long j11, long j12) {
        m25451k(we4Var, new cf4(1, -1, null, 0, null, m25440n(j11), m25440n(j12)));
    }

    /* renamed from: m */
    public final void m25453m(qf4 qf4Var) {
        Iterator it = this.f26207c.iterator();
        while (it.hasNext()) {
            of4 of4Var = (of4) it.next();
            if (of4Var.f25622b == qf4Var) {
                this.f26207c.remove(of4Var);
            }
        }
    }

    public pf4() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }
}

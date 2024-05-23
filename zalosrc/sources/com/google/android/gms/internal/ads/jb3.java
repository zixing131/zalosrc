package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class jb3 extends ob3 {

    /* renamed from: D */
    private static final Logger f22746D = Logger.getLogger(jb3.class.getName());

    /* renamed from: A */
    private x73 f22747A;

    /* renamed from: B */
    private final boolean f22748B;

    /* renamed from: C */
    private final boolean f22749C;

    public jb3(x73 x73Var, boolean z11, boolean z12) {
        super(x73Var.size());
        this.f22747A = x73Var;
        this.f22748B = z11;
        this.f22749C = z12;
    }

    /* renamed from: K */
    private final void m23582K(int i11, Future future) {
        try {
            mo23588P(i11, kc3.m23884p(future));
        } catch (Error e11) {
            e = e11;
            m23584M(e);
        } catch (RuntimeException e12) {
            e = e12;
            m23584M(e);
        } catch (ExecutionException e13) {
            m23584M(e13.getCause());
        }
    }

    /* renamed from: L */
    public final void m23592T(x73 x73Var) {
        boolean z11;
        int m25116E = m25116E();
        int i11 = 0;
        if (m25116E >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        j53.m23539i(z11, "Less than 0 remaining futures");
        if (m25116E == 0) {
            if (x73Var != null) {
                ba3 mo20838k = x73Var.mo20838k();
                while (mo20838k.hasNext()) {
                    Future future = (Future) mo20838k.next();
                    if (!future.isCancelled()) {
                        m23582K(i11, future);
                    }
                    i11++;
                }
            }
            m25118I();
            mo23589Q();
            mo23593U(2);
        }
    }

    /* renamed from: M */
    private final void m23584M(Throwable th2) {
        th2.getClass();
        if (this.f22748B && !mo20864h(th2) && m23586O(m25117H(), th2)) {
            m23585N(th2);
        } else if (th2 instanceof Error) {
            m23585N(th2);
        }
    }

    /* renamed from: N */
    private static void m23585N(Throwable th2) {
        String str;
        if (true != (th2 instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        f22746D.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th2);
    }

    /* renamed from: O */
    private static boolean m23586O(Set set, Throwable th2) {
        while (th2 != null) {
            if (!set.add(th2)) {
                return false;
            }
            th2 = th2.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ob3
    /* renamed from: J */
    final void mo23587J(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable mo24524a = mo24524a();
            mo24524a.getClass();
            m23586O(set, mo24524a);
        }
    }

    /* renamed from: P */
    abstract void mo23588P(int i11, Object obj);

    /* renamed from: Q */
    abstract void mo23589Q();

    /* renamed from: R */
    public final void m23590R() {
        x73 x73Var;
        x73 x73Var2 = this.f22747A;
        x73Var2.getClass();
        if (x73Var2.isEmpty()) {
            mo23589Q();
            return;
        }
        if (this.f22748B) {
            ba3 mo20838k = this.f22747A.mo20838k();
            int i11 = 0;
            while (mo20838k.hasNext()) {
                tc3 tc3Var = (tc3) mo20838k.next();
                tc3Var.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.hb3

                    /* renamed from: q */
                    public final /* synthetic */ tc3 f21614q;

                    /* renamed from: r */
                    public final /* synthetic */ int f21615r;

                    public /* synthetic */ hb3(tc3 tc3Var2, int i112) {
                        r2 = tc3Var2;
                        r3 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        jb3.this.m23591S(r2, r3);
                    }
                }, xb3.INSTANCE);
                i112++;
            }
            return;
        }
        if (this.f22749C) {
            x73Var = this.f22747A;
        } else {
            x73Var = null;
        }
        ib3 ib3Var = new Runnable() { // from class: com.google.android.gms.internal.ads.ib3

            /* renamed from: q */
            public final /* synthetic */ x73 f22134q;

            public /* synthetic */ ib3(x73 x73Var3) {
                r2 = x73Var3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                jb3.this.m23592T(r2);
            }
        };
        ba3 mo20838k2 = this.f22747A.mo20838k();
        while (mo20838k2.hasNext()) {
            ((tc3) mo20838k2.next()).zzc(ib3Var, xb3.INSTANCE);
        }
    }

    /* renamed from: S */
    public final /* synthetic */ void m23591S(tc3 tc3Var, int i11) {
        try {
            if (tc3Var.isCancelled()) {
                this.f22747A = null;
                cancel(false);
            } else {
                m23582K(i11, tc3Var);
            }
            m23592T(null);
        } catch (Throwable th2) {
            m23592T(null);
            throw th2;
        }
    }

    /* renamed from: U */
    public void mo23593U(int i11) {
        this.f22747A = null;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        x73 x73Var = this.f22747A;
        if (x73Var != null) {
            x73Var.toString();
            return "futures=".concat(x73Var.toString());
        }
        return super.mo22403e();
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: f */
    protected final void mo22404f() {
        x73 x73Var = this.f22747A;
        boolean z11 = true;
        mo23593U(1);
        boolean isCancelled = isCancelled();
        if (x73Var == null) {
            z11 = false;
        }
        if (z11 & isCancelled) {
            boolean m24528x = m24528x();
            ba3 mo20838k = x73Var.mo20838k();
            while (mo20838k.hasNext()) {
                ((Future) mo20838k.next()).cancel(m24528x);
            }
        }
    }
}

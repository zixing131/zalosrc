package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class gb3 extends zb3 implements Runnable {

    /* renamed from: y */
    public static final /* synthetic */ int f20525y = 0;

    /* renamed from: w */
    tc3 f20526w;

    /* renamed from: x */
    Object f20527x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gb3(tc3 tc3Var, Object obj) {
        tc3Var.getClass();
        this.f20526w = tc3Var;
        obj.getClass();
        this.f20527x = obj;
    }

    /* renamed from: E */
    abstract Object mo21684E(Object obj, Object obj2);

    /* renamed from: F */
    abstract void mo21685F(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        String str;
        tc3 tc3Var = this.f20526w;
        Object obj = this.f20527x;
        String mo22403e = super.mo22403e();
        if (tc3Var != null) {
            str = "inputFuture=[" + tc3Var + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        }
        if (mo22403e != null) {
            return str.concat(mo22403e);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: f */
    protected final void mo22404f() {
        m24526u(this.f20526w);
        this.f20526w = null;
        this.f20527x = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        tc3 tc3Var = this.f20526w;
        Object obj = this.f20527x;
        boolean isCancelled = isCancelled();
        boolean z12 = true;
        if (tc3Var == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = isCancelled | z11;
        if (obj != null) {
            z12 = false;
        }
        if (z13 | z12) {
            return;
        }
        this.f20526w = null;
        if (tc3Var.isCancelled()) {
            m24527w(tc3Var);
            return;
        }
        try {
            try {
                Object mo21684E = mo21684E(obj, kc3.m23884p(tc3Var));
                this.f20527x = null;
                mo21685F(mo21684E);
            } catch (Throwable th2) {
                try {
                    bd3.m20479a(th2);
                    mo20864h(th2);
                } finally {
                    this.f20527x = null;
                }
            }
        } catch (Error e11) {
            mo20864h(e11);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e12) {
            mo20864h(e12);
        } catch (ExecutionException e13) {
            mo20864h(e13.getCause());
        }
    }
}

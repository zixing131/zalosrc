package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
abstract class la3 extends zb3 implements Runnable {

    /* renamed from: w */
    tc3 f23806w;

    /* renamed from: x */
    Class f23807x;

    /* renamed from: y */
    Object f23808y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public la3(tc3 tc3Var, Class cls, Object obj) {
        tc3Var.getClass();
        this.f23806w = tc3Var;
        this.f23807x = cls;
        obj.getClass();
        this.f23808y = obj;
    }

    /* renamed from: E */
    abstract Object mo23579E(Object obj, Throwable th2);

    /* renamed from: F */
    abstract void mo23580F(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        String str;
        tc3 tc3Var = this.f23806w;
        Class cls = this.f23807x;
        Object obj = this.f23808y;
        String mo22403e = super.mo22403e();
        if (tc3Var != null) {
            str = "inputFuture=[" + tc3Var + "], ";
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
        }
        if (mo22403e != null) {
            return str.concat(mo22403e);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: f */
    protected final void mo22404f() {
        m24526u(this.f23806w);
        this.f23806w = null;
        this.f23807x = null;
        this.f23808y = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z11;
        boolean z12;
        Throwable e11;
        Object obj;
        tc3 tc3Var = this.f23806w;
        Class cls = this.f23807x;
        Object obj2 = this.f23808y;
        boolean z13 = false;
        if (tc3Var == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (cls == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z14 = z11 | z12;
        if (obj2 == null) {
            z13 = true;
        }
        if (!(z13 | z14) && !isCancelled()) {
            this.f23806w = null;
            try {
                if (tc3Var instanceof nd3) {
                    e11 = ((nd3) tc3Var).mo24524a();
                } else {
                    e11 = null;
                }
            } catch (Error e12) {
                e11 = e12;
            } catch (RuntimeException e13) {
                e11 = e13;
            } catch (ExecutionException e14) {
                Throwable cause = e14.getCause();
                if (cause == null) {
                    cause = new NullPointerException("Future type " + tc3Var.getClass() + " threw " + e14.getClass() + " without a cause");
                }
                e11 = cause;
            }
            if (e11 == null) {
                obj = kc3.m23884p(tc3Var);
                if (e11 != null) {
                    mo20863g(obj);
                    return;
                }
                if (cls.isInstance(e11)) {
                    try {
                        Object mo23579E = mo23579E(obj2, e11);
                        this.f23807x = null;
                        this.f23808y = null;
                        mo23580F(mo23579E);
                        return;
                    } catch (Throwable th2) {
                        try {
                            bd3.m20479a(th2);
                            mo20864h(th2);
                            return;
                        } finally {
                            this.f23807x = null;
                            this.f23808y = null;
                        }
                    }
                }
                m24527w(tc3Var);
                return;
            }
            obj = null;
            if (e11 != null) {
            }
        }
    }
}

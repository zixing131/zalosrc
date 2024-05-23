package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma3;

/* loaded from: classes2.dex */
final class ta3 extends na3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ta3(ma3.C4753a c4753a) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: a */
    public final qa3 mo24875a(ma3 ma3Var, qa3 qa3Var) {
        qa3 qa3Var2;
        synchronized (ma3Var) {
            try {
                qa3Var2 = ma3Var.f24456q;
                if (qa3Var2 != qa3Var) {
                    ma3Var.f24456q = qa3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qa3Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: b */
    public final xa3 mo24876b(ma3 ma3Var, xa3 xa3Var) {
        xa3 xa3Var2;
        synchronized (ma3Var) {
            try {
                xa3Var2 = ma3Var.f24457r;
                if (xa3Var2 != xa3Var) {
                    ma3Var.f24457r = xa3Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xa3Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: c */
    public final void mo24877c(xa3 xa3Var, xa3 xa3Var2) {
        xa3Var.f30403b = xa3Var2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: d */
    public final void mo24878d(xa3 xa3Var, Thread thread) {
        xa3Var.f30402a = thread;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: e */
    public final boolean mo24879e(ma3 ma3Var, qa3 qa3Var, qa3 qa3Var2) {
        qa3 qa3Var3;
        synchronized (ma3Var) {
            try {
                qa3Var3 = ma3Var.f24456q;
                if (qa3Var3 == qa3Var) {
                    ma3Var.f24456q = qa3Var2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: f */
    public final boolean mo24880f(ma3 ma3Var, Object obj, Object obj2) {
        Object obj3;
        synchronized (ma3Var) {
            try {
                obj3 = ma3Var.f24455p;
                if (obj3 == obj) {
                    ma3Var.f24455p = obj2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.na3
    /* renamed from: g */
    public final boolean mo24881g(ma3 ma3Var, xa3 xa3Var, xa3 xa3Var2) {
        xa3 xa3Var3;
        synchronized (ma3Var) {
            try {
                xa3Var3 = ma3Var.f24457r;
                if (xa3Var3 == xa3Var) {
                    ma3Var.f24457r = xa3Var2;
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

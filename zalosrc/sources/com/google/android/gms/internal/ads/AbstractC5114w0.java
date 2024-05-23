package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w0 */
/* loaded from: classes2.dex */
abstract class AbstractC5114w0 {

    /* renamed from: a */
    protected final InterfaceC4928r f29649a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5114w0(InterfaceC4928r interfaceC4928r) {
        this.f29649a = interfaceC4928r;
    }

    /* renamed from: a */
    protected abstract boolean mo26217a(x02 x02Var);

    /* renamed from: b */
    protected abstract boolean mo26218b(x02 x02Var, long j11);

    /* renamed from: c */
    public final boolean m27440c(x02 x02Var, long j11) {
        if (mo26217a(x02Var) && mo26218b(x02Var, j11)) {
            return true;
        }
        return false;
    }
}

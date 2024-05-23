package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class p82 implements c32 {

    /* renamed from: a */
    private final InterfaceC4407cy f26105a;

    /* renamed from: b */
    private final uc3 f26106b;

    /* renamed from: c */
    private final hv2 f26107c;

    /* renamed from: d */
    private final y82 f26108d;

    public p82(hv2 hv2Var, uc3 uc3Var, InterfaceC4407cy interfaceC4407cy, y82 y82Var, byte[] bArr) {
        this.f26107c = hv2Var;
        this.f26106b = uc3Var;
        this.f26105a = interfaceC4407cy;
        this.f26108d = y82Var;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        mq2 mq2Var;
        if (this.f26105a != null && (mq2Var = iq2Var.f22348t) != null && mq2Var.f24721a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(tq2 tq2Var, iq2 iq2Var) {
        pl0 pl0Var = new pl0();
        u82 u82Var = new u82();
        u82Var.m26873a(new o82(this, pl0Var, tq2Var, iq2Var, u82Var));
        mq2 mq2Var = iq2Var.f22348t;
        final BinderC5148wx binderC5148wx = new BinderC5148wx(u82Var, mq2Var.f24722b, mq2Var.f24721a);
        hv2 hv2Var = this.f26107c;
        return qu2.m25891d(new ku2() { // from class: com.google.android.gms.internal.ads.n82
            @Override // com.google.android.gms.internal.ads.ku2
            public final void zza() {
                p82.this.m25421c(binderC5148wx);
            }
        }, this.f26106b, bv2.CUSTOM_RENDER_SYN, hv2Var).m28019b(bv2.CUSTOM_RENDER_ACK).m28021d(pl0Var).m28018a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m25421c(BinderC5148wx binderC5148wx) {
        this.f26105a.mo21237Y2(binderC5148wx);
    }
}

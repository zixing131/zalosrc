package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class k82 implements c32 {

    /* renamed from: a */
    private final Context f23184a;

    /* renamed from: b */
    private final p21 f23185b;

    /* renamed from: c */
    private final InterfaceC4407cy f23186c;

    /* renamed from: d */
    private final uc3 f23187d;

    /* renamed from: e */
    private final hv2 f23188e;

    public k82(Context context, p21 p21Var, hv2 hv2Var, uc3 uc3Var, InterfaceC4407cy interfaceC4407cy) {
        this.f23184a = context;
        this.f23185b = p21Var;
        this.f23188e = hv2Var;
        this.f23187d = uc3Var;
        this.f23186c = interfaceC4407cy;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: a */
    public final boolean mo20789a(tq2 tq2Var, iq2 iq2Var) {
        mq2 mq2Var;
        if (this.f23186c != null && (mq2Var = iq2Var.f22348t) != null && mq2Var.f24721a != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.c32
    /* renamed from: b */
    public final tc3 mo20790b(tq2 tq2Var, iq2 iq2Var) {
        t11 mo21153a = this.f23185b.mo21153a(new k41(tq2Var, iq2Var, null), new i82(this, new View(this.f23184a), null, new t31() { // from class: com.google.android.gms.internal.ads.g82
            @Override // com.google.android.gms.internal.ads.t31
            public final com.google.android.gms.ads.internal.client.zzdk zza() {
                return null;
            }
        }, (jq2) iq2Var.f22350v.get(0)));
        j82 mo26533k = mo21153a.mo26533k();
        mq2 mq2Var = iq2Var.f22348t;
        final BinderC5148wx binderC5148wx = new BinderC5148wx(mo26533k, mq2Var.f24722b, mq2Var.f24721a);
        hv2 hv2Var = this.f23188e;
        return qu2.m25891d(new ku2() { // from class: com.google.android.gms.internal.ads.h82
            @Override // com.google.android.gms.internal.ads.ku2
            public final void zza() {
                k82.this.m23855c(binderC5148wx);
            }
        }, this.f23187d, bv2.CUSTOM_RENDER_SYN, hv2Var).m28019b(bv2.CUSTOM_RENDER_ACK).m28021d(kc3.m23877i(mo21153a.mo26530h())).m28018a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m23855c(BinderC5148wx binderC5148wx) {
        this.f23186c.mo21237Y2(binderC5148wx);
    }
}

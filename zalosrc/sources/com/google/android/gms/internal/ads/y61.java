package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class y61 implements l91, r81 {

    /* renamed from: p */
    private final Context f30815p;

    /* renamed from: q */
    private final iq2 f30816q;

    /* renamed from: r */
    private final td0 f30817r;

    public y61(Context context, iq2 iq2Var, td0 td0Var, byte[] bArr) {
        this.f30815p = context;
        this.f30816q = iq2Var;
        this.f30817r = td0Var;
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: r */
    public final void mo20722r(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: t */
    public final void mo20723t(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: z */
    public final void mo20724z(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        ud0 ud0Var = this.f30816q.f22322e0;
        if (ud0Var != null && ud0Var.f28834a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f30816q.f22322e0.f28835b.isEmpty()) {
                arrayList.add(this.f30816q.f22322e0.f28835b);
            }
        }
    }
}

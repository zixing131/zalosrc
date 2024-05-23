package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
final class h52 implements sh1 {

    /* renamed from: a */
    private final iq2 f21544a;

    /* renamed from: b */
    private final pb0 f21545b;

    /* renamed from: c */
    private final boolean f21546c;

    /* renamed from: d */
    private o81 f21547d = null;

    public h52(iq2 iq2Var, pb0 pb0Var, boolean z11) {
        this.f21544a = iq2Var;
        this.f21545b = pb0Var;
        this.f21546c = z11;
    }

    @Override // com.google.android.gms.internal.ads.sh1
    /* renamed from: a */
    public final void mo21616a(boolean z11, Context context, j81 j81Var) {
        boolean mo20063W0;
        try {
            if (this.f21546c) {
                mo20063W0 = this.f21545b.mo20069r(BinderC4273d.m19913I3(context));
            } else {
                mo20063W0 = this.f21545b.mo20063W0(BinderC4273d.m19913I3(context));
            }
            if (mo20063W0) {
                if (this.f21547d == null) {
                    return;
                }
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21338p1)).booleanValue() && this.f21544a.f22312Z == 2) {
                    this.f21547d.zza();
                    return;
                }
                return;
            }
            throw new zzdmo("Adapter failed to show.");
        } catch (Throwable th2) {
            throw new zzdmo(th2);
        }
    }

    /* renamed from: b */
    public final void m22709b(o81 o81Var) {
        this.f21547d = o81Var;
    }
}

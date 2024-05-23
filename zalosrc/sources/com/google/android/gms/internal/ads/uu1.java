package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class uu1 implements du1 {

    /* renamed from: a */
    private final long f29045a;

    /* renamed from: b */
    private final iu1 f29046b;

    /* renamed from: c */
    private final zp2 f29047c;

    public uu1(long j11, Context context, iu1 iu1Var, vs0 vs0Var, String str) {
        this.f29045a = j11;
        this.f29046b = iu1Var;
        bq2 mo22612x = vs0Var.mo22612x();
        mo22612x.mo20644a(context);
        mo22612x.zza(str);
        this.f29047c = mo22612x.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.du1
    /* renamed from: a */
    public final void mo21544a(zzl zzlVar) {
        try {
            this.f29047c.zzf(zzlVar, new su1(this));
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.du1
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.du1
    public final void zzc() {
        try {
            this.f29047c.zzk(new tu1(this));
            this.f29047c.zzm(BinderC4273d.m19913I3(null));
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }
}

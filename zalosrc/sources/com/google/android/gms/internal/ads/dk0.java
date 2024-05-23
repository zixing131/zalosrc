package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class dk0 extends zzb {

    /* renamed from: a */
    final /* synthetic */ hk0 f19283a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dk0(hk0 hk0Var) {
        this.f19283a = hk0Var;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcgv zzcgvVar;
        Object obj;
        C4738lx c4738lx;
        hk0 hk0Var = this.f19283a;
        context = hk0Var.f21806e;
        zzcgvVar = hk0Var.f21807f;
        C4664jx c4664jx = new C4664jx(context, zzcgvVar.f32030p);
        obj = this.f19283a.f21802a;
        synchronized (obj) {
            try {
                zzt.zze();
                c4738lx = this.f19283a.f21808g;
                C4776mx.m24772a(c4738lx, c4664jx);
            } catch (IllegalArgumentException e11) {
                yk0.zzk("Cannot config CSI reporter.", e11);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zze;

/* loaded from: classes2.dex */
public final class ab2 {

    /* renamed from: a */
    private final hk1 f16986a;

    /* renamed from: b */
    private final na2 f16987b;

    /* renamed from: c */
    private final z71 f16988c;

    public ab2(hk1 hk1Var, rv2 rv2Var) {
        this.f16986a = hk1Var;
        final na2 na2Var = new na2(rv2Var);
        this.f16987b = na2Var;
        final v60 m22954g = hk1Var.m22954g();
        this.f16988c = new z71() { // from class: com.google.android.gms.internal.ads.za2
            @Override // com.google.android.gms.internal.ads.z71
            /* renamed from: a */
            public final void mo20715a(zze zzeVar) {
                na2 na2Var2 = na2.this;
                v60 v60Var = m22954g;
                na2Var2.mo20715a(zzeVar);
                if (v60Var != null) {
                    try {
                        v60Var.zzf(zzeVar);
                    } catch (RemoteException e11) {
                        yk0.zzl("#007 Could not call remote method.", e11);
                    }
                }
                if (v60Var != null) {
                    try {
                        v60Var.zze(zzeVar.zza);
                    } catch (RemoteException e12) {
                        yk0.zzl("#007 Could not call remote method.", e12);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final z71 m20048a() {
        return this.f16988c;
    }

    /* renamed from: b */
    public final l91 m20049b() {
        return this.f16987b;
    }

    /* renamed from: c */
    public final bi1 m20050c() {
        return new bi1(this.f16986a, this.f16987b.m24870g());
    }

    /* renamed from: d */
    public final na2 m20051d() {
        return this.f16987b;
    }

    /* renamed from: e */
    public final void m20052e(zzbf zzbfVar) {
        this.f16987b.m24872o(zzbfVar);
    }
}

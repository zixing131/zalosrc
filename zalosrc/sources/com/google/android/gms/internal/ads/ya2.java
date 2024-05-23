package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzl;

/* loaded from: classes2.dex */
public final class ya2 {

    /* renamed from: a */
    private final db2 f30858a;

    /* renamed from: b */
    private final String f30859b;

    /* renamed from: c */
    private zzdh f30860c;

    public ya2(db2 db2Var, String str) {
        this.f30858a = db2Var;
        this.f30859b = str;
    }

    /* renamed from: a */
    public final synchronized String m28169a() {
        String str;
        str = null;
        try {
            zzdh zzdhVar = this.f30860c;
            if (zzdhVar != null) {
                str = zzdhVar.zzg();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String m28170b() {
        String str;
        str = null;
        try {
            zzdh zzdhVar = this.f30860c;
            if (zzdhVar != null) {
                str = zzdhVar.zzg();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void m28171d(zzl zzlVar, int i11) {
        this.f30860c = null;
        this.f30858a.mo21338a(zzlVar, this.f30859b, new eb2(i11), new xa2(this));
    }

    /* renamed from: e */
    public final synchronized boolean m28172e() {
        return this.f30858a.zza();
    }
}

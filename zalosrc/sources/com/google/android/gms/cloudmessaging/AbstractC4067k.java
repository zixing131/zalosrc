package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import p342m6.C22890k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.cloudmessaging.k */
/* loaded from: classes2.dex */
public abstract class AbstractC4067k {

    /* renamed from: a */
    final int f16126a;

    /* renamed from: b */
    final C22890k f16127b = new C22890k();

    /* renamed from: c */
    final int f16128c;

    /* renamed from: d */
    final Bundle f16129d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4067k(int i11, int i12, Bundle bundle) {
        this.f16126a = i11;
        this.f16128c = i12;
        this.f16129d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo19170a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo19171b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m19172c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
        }
        this.f16127b.m117595b(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m19173d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
        }
        this.f16127b.m117596c(obj);
    }

    public final String toString() {
        int i11 = this.f16128c;
        int i12 = this.f16126a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i11);
        sb2.append(" id=");
        sb2.append(i12);
        sb2.append(" oneWay=");
        sb2.append(mo19171b());
        sb2.append("}");
        return sb2.toString();
    }
}

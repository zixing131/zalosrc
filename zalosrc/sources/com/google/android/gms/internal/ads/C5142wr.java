package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wr */
/* loaded from: classes2.dex */
public final class C5142wr implements AbstractC4172d.b {

    /* renamed from: p */
    final /* synthetic */ C5179xr f30069p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5142wr(C5179xr c5179xr) {
        this.f30069p = c5179xr;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        Object obj;
        C5253zr c5253zr;
        Object obj2;
        obj = this.f30069p.f30590c;
        synchronized (obj) {
            try {
                this.f30069p.f30593f = null;
                C5179xr c5179xr = this.f30069p;
                c5253zr = c5179xr.f30591d;
                if (c5253zr != null) {
                    c5179xr.f30591d = null;
                }
                obj2 = this.f30069p.f30590c;
                obj2.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

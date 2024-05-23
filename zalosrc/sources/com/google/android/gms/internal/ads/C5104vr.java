package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC4172d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vr */
/* loaded from: classes2.dex */
public final class C5104vr implements AbstractC4172d.a {

    /* renamed from: p */
    final /* synthetic */ C5179xr f29453p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5104vr(C5179xr c5179xr) {
        this.f29453p = c5179xr;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        Object obj;
        Object obj2;
        C5253zr c5253zr;
        C5253zr c5253zr2;
        obj = this.f29453p.f30590c;
        synchronized (obj) {
            try {
                C5179xr c5179xr = this.f29453p;
                c5253zr = c5179xr.f30591d;
                if (c5253zr != null) {
                    c5253zr2 = c5179xr.f30591d;
                    c5179xr.f30593f = c5253zr2.m28589h();
                }
            } catch (DeadObjectException e11) {
                yk0.zzh("Unable to obtain a cache service instance.", e11);
                C5179xr.m27989h(this.f29453p);
            }
            obj2 = this.f29453p.f30590c;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        Object obj;
        Object obj2;
        obj = this.f29453p.f30590c;
        synchronized (obj) {
            this.f29453p.f30593f = null;
            obj2 = this.f29453p.f30590c;
            obj2.notifyAll();
        }
    }
}

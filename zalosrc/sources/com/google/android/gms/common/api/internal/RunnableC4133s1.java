package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* loaded from: classes2.dex */
final class RunnableC4133s1 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ LifecycleCallback f16442p;

    /* renamed from: q */
    final /* synthetic */ String f16443q;

    /* renamed from: r */
    final /* synthetic */ zzb f16444r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4133s1(zzb zzbVar, LifecycleCallback lifecycleCallback, String str) {
        this.f16444r = zzbVar;
        this.f16442p = lifecycleCallback;
        this.f16443q = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        zzb zzbVar = this.f16444r;
        i11 = zzbVar.f16475q;
        if (i11 > 0) {
            LifecycleCallback lifecycleCallback = this.f16442p;
            bundle = zzbVar.f16476r;
            if (bundle != null) {
                bundle3 = zzbVar.f16476r;
                bundle2 = bundle3.getBundle(this.f16443q);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo19292f(bundle2);
        }
        i12 = this.f16444r.f16475q;
        if (i12 >= 2) {
            this.f16442p.mo19296j();
        }
        i13 = this.f16444r.f16475q;
        if (i13 >= 3) {
            this.f16442p.mo19294h();
        }
        i14 = this.f16444r.f16475q;
        if (i14 >= 4) {
            this.f16442p.mo19297k();
        }
        i15 = this.f16444r.f16475q;
        if (i15 >= 5) {
            this.f16442p.m19293g();
        }
    }
}

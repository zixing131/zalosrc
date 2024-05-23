package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* loaded from: classes2.dex */
final class RunnableC6000g9 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34044p;

    /* renamed from: q */
    final /* synthetic */ String f34045q = "_err";

    /* renamed from: r */
    final /* synthetic */ Bundle f34046r;

    /* renamed from: s */
    final /* synthetic */ C6022i9 f34047s;

    public RunnableC6000g9(C6022i9 c6022i9, String str, String str2, Bundle bundle) {
        this.f34047s = c6022i9;
        this.f34044p = str;
        this.f34046r = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34047s.f34092a.m31090j((zzaw) AbstractC4205o.m19722k(this.f34047s.f34092a.m31087h0().m31361y0(this.f34044p, this.f34045q, this.f34046r, "auto", this.f34047s.f34092a.mo31031a().mo105913a(), false, true)), this.f34044p);
    }
}

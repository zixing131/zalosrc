package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Callable;
import p230i6.C20307b;
import p230i6.EnumC20305a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.f9 */
/* loaded from: classes.dex */
public final class CallableC5989f9 implements Callable {

    /* renamed from: a */
    final /* synthetic */ zzq f34005a;

    /* renamed from: b */
    final /* synthetic */ C6055l9 f34006b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5989f9(C6055l9 c6055l9, zzq zzqVar) {
        this.f34006b = c6055l9;
        this.f34005a = zzqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C20307b m31073V = this.f34006b.m31073V((String) AbstractC4205o.m19722k(this.f34005a.f34702p));
        EnumC20305a enumC20305a = EnumC20305a.ANALYTICS_STORAGE;
        if (m31073V.m106014i(enumC20305a) && C20307b.m106004b(this.f34005a.f34697K).m106014i(enumC20305a)) {
            return this.f34006b.m31070S(this.f34005a).m31250j0();
        }
        this.f34006b.mo31033c().m31201u().m31108a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}

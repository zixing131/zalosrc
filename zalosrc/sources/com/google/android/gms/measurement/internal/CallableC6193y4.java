package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
/* loaded from: classes2.dex */
final class CallableC6193y4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f34612a;

    /* renamed from: b */
    final /* synthetic */ String f34613b;

    /* renamed from: c */
    final /* synthetic */ String f34614c;

    /* renamed from: d */
    final /* synthetic */ BinderC6040k5 f34615d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6193y4(BinderC6040k5 binderC6040k5, String str, String str2, String str3) {
        this.f34615d = binderC6040k5;
        this.f34612a = str;
        this.f34613b = str2;
        this.f34614c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f34615d.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f34615d.f34135p;
        return c6055l92.m31074W().m30998a0(this.f34612a, this.f34613b, this.f34614c);
    }
}

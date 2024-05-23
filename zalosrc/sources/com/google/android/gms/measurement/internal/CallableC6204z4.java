package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.z4 */
/* loaded from: classes2.dex */
final class CallableC6204z4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f34646a;

    /* renamed from: b */
    final /* synthetic */ String f34647b;

    /* renamed from: c */
    final /* synthetic */ String f34648c;

    /* renamed from: d */
    final /* synthetic */ BinderC6040k5 f34649d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6204z4(BinderC6040k5 binderC6040k5, String str, String str2, String str3) {
        this.f34649d = binderC6040k5;
        this.f34646a = str;
        this.f34647b = str2;
        this.f34648c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f34649d.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f34649d.f34135p;
        return c6055l92.m31074W().m30998a0(this.f34646a, this.f34647b, this.f34648c);
    }
}

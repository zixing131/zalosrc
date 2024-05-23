package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.w4 */
/* loaded from: classes2.dex */
final class CallableC6171w4 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f34553a;

    /* renamed from: b */
    final /* synthetic */ String f34554b;

    /* renamed from: c */
    final /* synthetic */ String f34555c;

    /* renamed from: d */
    final /* synthetic */ BinderC6040k5 f34556d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6171w4(BinderC6040k5 binderC6040k5, String str, String str2, String str3) {
        this.f34556d = binderC6040k5;
        this.f34553a = str;
        this.f34554b = str2;
        this.f34555c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f34556d.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f34556d.f34135p;
        return c6055l92.m31074W().m31001d0(this.f34553a, this.f34554b, this.f34555c);
    }
}

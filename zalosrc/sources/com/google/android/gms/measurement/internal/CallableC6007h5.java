package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.h5 */
/* loaded from: classes2.dex */
final class CallableC6007h5 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f34057a;

    /* renamed from: b */
    final /* synthetic */ BinderC6040k5 f34058b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC6007h5(BinderC6040k5 binderC6040k5, String str) {
        this.f34058b = binderC6040k5;
        this.f34057a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        c6055l9 = this.f34058b.f34135p;
        c6055l9.m31080d();
        c6055l92 = this.f34058b.f34135p;
        return c6055l92.m31074W().m31000c0(this.f34057a);
    }
}

package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.j5 */
/* loaded from: classes.dex */
final class RunnableC6029j5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34102p;

    /* renamed from: q */
    final /* synthetic */ String f34103q;

    /* renamed from: r */
    final /* synthetic */ String f34104r;

    /* renamed from: s */
    final /* synthetic */ long f34105s;

    /* renamed from: t */
    final /* synthetic */ BinderC6040k5 f34106t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6029j5(BinderC6040k5 binderC6040k5, String str, String str2, String str3, long j11) {
        this.f34106t = binderC6040k5;
        this.f34102p = str;
        this.f34103q = str2;
        this.f34104r = str3;
        this.f34105s = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6055l9 c6055l9;
        C6055l9 c6055l92;
        String str = this.f34102p;
        if (str == null) {
            c6055l92 = this.f34106t.f34135p;
            c6055l92.m31104w(this.f34103q, null);
        } else {
            C6184x6 c6184x6 = new C6184x6(this.f34104r, str, this.f34105s);
            c6055l9 = this.f34106t.f34135p;
            c6055l9.m31104w(this.f34103q, c6184x6);
        }
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.y5 */
/* loaded from: classes2.dex */
public final class RunnableC6194y5 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f34616p;

    /* renamed from: q */
    final /* synthetic */ String f34617q;

    /* renamed from: r */
    final /* synthetic */ Object f34618r;

    /* renamed from: s */
    final /* synthetic */ long f34619s;

    /* renamed from: t */
    final /* synthetic */ C6129s6 f34620t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC6194y5(C6129s6 c6129s6, String str, String str2, Object obj, long j11) {
        this.f34620t = c6129s6;
        this.f34616p = str;
        this.f34617q = str2;
        this.f34618r = obj;
        this.f34619s = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34620t.m31420M(this.f34616p, this.f34617q, this.f34618r, this.f34619s);
    }
}

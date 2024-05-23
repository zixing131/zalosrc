package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes2.dex */
public final class RunnableC5921a implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f33754p;

    /* renamed from: q */
    final /* synthetic */ long f33755q;

    /* renamed from: r */
    final /* synthetic */ C6179x1 f33756r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC5921a(C6179x1 c6179x1, String str, long j11) {
        this.f33756r = c6179x1;
        this.f33754p = str;
        this.f33755q = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6179x1.m31475h(this.f33756r, this.f33754p, this.f33755q);
    }
}

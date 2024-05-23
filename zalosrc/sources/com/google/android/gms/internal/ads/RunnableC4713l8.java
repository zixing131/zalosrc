package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.l8 */
/* loaded from: classes2.dex */
public final class RunnableC4713l8 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f23780p;

    /* renamed from: q */
    final /* synthetic */ long f23781q;

    /* renamed from: r */
    final /* synthetic */ AbstractC4788n8 f23782r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4713l8(AbstractC4788n8 abstractC4788n8, String str, long j11) {
        this.f23782r = abstractC4788n8;
        this.f23780p = str;
        this.f23781q = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5011t8 c5011t8;
        C5011t8 c5011t82;
        c5011t8 = this.f23782r.zza;
        c5011t8.m26586a(this.f23780p, this.f23781q);
        AbstractC4788n8 abstractC4788n8 = this.f23782r;
        c5011t82 = abstractC4788n8.zza;
        c5011t82.m26587b(abstractC4788n8.toString());
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.e8 */
/* loaded from: classes2.dex */
public final class RunnableC4455e8 implements Runnable {

    /* renamed from: p */
    private final AbstractC4788n8 f19553p;

    /* renamed from: q */
    private final C4937r8 f19554q;

    /* renamed from: r */
    private final Runnable f19555r;

    public RunnableC4455e8(AbstractC4788n8 abstractC4788n8, C4937r8 c4937r8, Runnable runnable) {
        this.f19553p = abstractC4788n8;
        this.f19554q = c4937r8;
        this.f19555r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19553p.zzw();
        C4937r8 c4937r8 = this.f19554q;
        if (c4937r8.m25992c()) {
            this.f19553p.zzo(c4937r8.f27133a);
        } else {
            this.f19553p.zzn(c4937r8.f27135c);
        }
        if (this.f19554q.f27136d) {
            this.f19553p.zzm("intermediate-response");
        } else {
            this.f19553p.zzp("done");
        }
        Runnable runnable = this.f19555r;
        if (runnable != null) {
            runnable.run();
        }
    }
}

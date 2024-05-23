package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC5469l2 implements Runnable {

    /* renamed from: p */
    final long f32471p;

    /* renamed from: q */
    final long f32472q;

    /* renamed from: r */
    final boolean f32473r;

    /* renamed from: s */
    final /* synthetic */ C5656w2 f32474s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC5469l2(C5656w2 c5656w2, boolean z11) {
        this.f32474s = c5656w2;
        this.f32471p = c5656w2.f32874b.mo105913a();
        this.f32472q = c5656w2.f32874b.mo105914b();
        this.f32473r = z11;
    }

    /* renamed from: a */
    abstract void mo28858a();

    /* renamed from: b */
    protected void mo28859b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        z11 = this.f32474s.f32879g;
        if (z11) {
            mo28859b();
            return;
        }
        try {
            mo28858a();
        } catch (Exception e11) {
            this.f32474s.m29818j(e11, false, this.f32473r);
            mo28859b();
        }
    }
}

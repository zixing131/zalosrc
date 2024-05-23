package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class yc3 extends va3 implements Runnable {

    /* renamed from: w */
    private final Runnable f30907w;

    public yc3(Runnable runnable) {
        runnable.getClass();
        this.f30907w = runnable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ma3
    /* renamed from: e */
    public final String mo22403e() {
        return "task=[" + this.f30907w + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30907w.run();
        } catch (Error | RuntimeException e11) {
            mo20864h(e11);
            throw e11;
        }
    }
}

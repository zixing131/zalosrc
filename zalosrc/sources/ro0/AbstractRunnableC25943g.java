package ro0;

import bp0.AbstractC3082b0;

/* renamed from: ro0.g */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC25943g implements Runnable {
    /* renamed from: a */
    protected abstract void mo66462a();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo66462a();
        } catch (Throwable unused) {
            AbstractC3082b0.m15422d("NativeRunnable", "Not done from same thread");
        }
    }
}

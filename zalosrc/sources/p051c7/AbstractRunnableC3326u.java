package p051c7;

import p342m6.C22890k;

/* renamed from: c7.u */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC3326u implements Runnable {

    /* renamed from: p */
    private final C22890k f14143p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC3326u() {
        this.f14143p = null;
    }

    /* renamed from: a */
    protected abstract void mo16750a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C22890k m16802b() {
        return this.f14143p;
    }

    /* renamed from: c */
    public final void m16803c(Exception exc) {
        C22890k c22890k = this.f14143p;
        if (c22890k != null) {
            c22890k.m117597d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo16750a();
        } catch (Exception e11) {
            m16803c(e11);
        }
    }

    public AbstractRunnableC3326u(C22890k c22890k) {
        this.f14143p = c22890k;
    }
}

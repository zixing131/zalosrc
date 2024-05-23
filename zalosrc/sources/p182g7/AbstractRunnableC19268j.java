package p182g7;

import p342m6.C22890k;

/* renamed from: g7.j */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC19268j implements Runnable {

    /* renamed from: p */
    private final C22890k f95762p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC19268j() {
        this.f95762p = null;
    }

    /* renamed from: a */
    protected abstract void mo33379a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C22890k m100983b() {
        return this.f95762p;
    }

    /* renamed from: c */
    public final void m100984c(Exception exc) {
        C22890k c22890k = this.f95762p;
        if (c22890k != null) {
            c22890k.m117597d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo33379a();
        } catch (Exception e11) {
            m100984c(e11);
        }
    }

    public AbstractRunnableC19268j(C22890k c22890k) {
        this.f95762p = c22890k;
    }
}

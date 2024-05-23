package p291k7;

import p342m6.C22890k;

/* renamed from: k7.r1 */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC21539r1 implements Runnable {

    /* renamed from: p */
    private final C22890k f104575p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC21539r1() {
        this.f104575p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C22890k m111201a() {
        return this.f104575p;
    }

    /* renamed from: b */
    public final void m111202b(Exception exc) {
        C22890k c22890k = this.f104575p;
        if (c22890k != null) {
            c22890k.m117597d(exc);
        }
    }

    /* renamed from: c */
    protected abstract void mo109504c();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo109504c();
        } catch (Exception e11) {
            m111202b(e11);
        }
    }

    public AbstractRunnableC21539r1(C22890k c22890k) {
        this.f104575p = c22890k;
    }
}

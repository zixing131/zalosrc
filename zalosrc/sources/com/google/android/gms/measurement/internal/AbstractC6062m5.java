package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.m5 */
/* loaded from: classes.dex */
public abstract class AbstractC6062m5 extends AbstractC6051l5 {

    /* renamed from: b */
    private boolean f34216b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6062m5(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34158a.m31388h();
    }

    /* renamed from: h */
    protected void mo30815h() {
    }

    /* renamed from: i */
    protected abstract boolean mo30816i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m31140j() {
        if (m31143m()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: k */
    public final void m31141k() {
        if (!this.f34216b) {
            if (!mo30816i()) {
                this.f34158a.m31386e();
                this.f34216b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: l */
    public final void m31142l() {
        if (!this.f34216b) {
            mo30815h();
            this.f34158a.m31386e();
            this.f34216b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m31143m() {
        return this.f34216b;
    }
}

package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
/* loaded from: classes.dex */
public abstract class AbstractC6148u3 extends AbstractC6191y2 {

    /* renamed from: b */
    private boolean f34505b;

    public AbstractC6148u3(C6127s4 c6127s4) {
        super(c6127s4);
        this.f34158a.m31388h();
    }

    /* renamed from: h */
    public final void m31455h() {
        if (m31458l()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: i */
    public final void m31456i() {
        if (!this.f34505b) {
            if (!mo30852m()) {
                this.f34158a.m31386e();
                this.f34505b = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: j */
    public final void m31457j() {
        if (!this.f34505b) {
            mo30936k();
            this.f34158a.m31386e();
            this.f34505b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: k */
    protected void mo30936k() {
    }

    /* renamed from: l */
    public final boolean m31458l() {
        return this.f34505b;
    }

    /* renamed from: m */
    protected abstract boolean mo30852m();
}

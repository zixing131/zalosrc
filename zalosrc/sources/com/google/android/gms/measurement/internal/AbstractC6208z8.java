package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z8 */
/* loaded from: classes.dex */
public abstract class AbstractC6208z8 extends AbstractC6197y8 {

    /* renamed from: c */
    private boolean f34659c;

    public AbstractC6208z8(C6055l9 c6055l9) {
        super(c6055l9);
        this.f34628b.m31099q();
    }

    /* renamed from: h */
    public final void m31504h() {
        if (m31506j()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: i */
    public final void m31505i() {
        if (!this.f34659c) {
            mo30801k();
            this.f34628b.m31093l();
            this.f34659c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: j */
    public final boolean m31506j() {
        return this.f34659c;
    }

    /* renamed from: k */
    protected abstract boolean mo30801k();
}

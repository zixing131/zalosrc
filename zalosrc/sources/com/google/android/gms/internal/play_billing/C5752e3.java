package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.e3 */
/* loaded from: classes2.dex */
final class C5752e3 extends AbstractC5764g3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5752e3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: a */
    public final double mo30212a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f33321a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: b */
    public final float mo30213b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f33321a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: c */
    public final void mo30214c(Object obj, long j11, boolean z11) {
        if (AbstractC5770h3.f33332h) {
            AbstractC5770h3.m30251d(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC5770h3.m30252e(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: d */
    public final void mo30215d(Object obj, long j11, byte b11) {
        if (AbstractC5770h3.f33332h) {
            AbstractC5770h3.m30251d(obj, j11, b11);
        } else {
            AbstractC5770h3.m30252e(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: e */
    public final void mo30216e(Object obj, long j11, double d11) {
        this.f33321a.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: f */
    public final void mo30217f(Object obj, long j11, float f11) {
        this.f33321a.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5764g3
    /* renamed from: g */
    public final boolean mo30218g(Object obj, long j11) {
        if (AbstractC5770h3.f33332h) {
            return AbstractC5770h3.m30272y(obj, j11);
        }
        return AbstractC5770h3.m30273z(obj, j11);
    }
}

package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.tb */
/* loaded from: classes.dex */
final class C5614tb extends AbstractC5631ub {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5614tb(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: a */
    public final double mo29596a(Object obj, long j11) {
        return Double.longBitsToDouble(this.f32840a.getLong(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: b */
    public final float mo29597b(Object obj, long j11) {
        return Float.intBitsToFloat(this.f32840a.getInt(obj, j11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: c */
    public final void mo29598c(Object obj, long j11, boolean z11) {
        if (AbstractC5648vb.f32861h) {
            AbstractC5648vb.m29784d(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            AbstractC5648vb.m29785e(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: d */
    public final void mo29599d(Object obj, long j11, byte b11) {
        if (AbstractC5648vb.f32861h) {
            AbstractC5648vb.m29784d(obj, j11, b11);
        } else {
            AbstractC5648vb.m29785e(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: e */
    public final void mo29600e(Object obj, long j11, double d11) {
        this.f32840a.putLong(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: f */
    public final void mo29601f(Object obj, long j11, float f11) {
        this.f32840a.putInt(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5631ub
    /* renamed from: g */
    public final boolean mo29602g(Object obj, long j11) {
        if (AbstractC5648vb.f32861h) {
            return AbstractC5648vb.m29805y(obj, j11);
        }
        return AbstractC5648vb.m29806z(obj, j11);
    }
}

package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class gx3 extends hx3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public gx3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: a */
    public final byte mo22201a(long j11) {
        return Memory.peekByte(j11);
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: b */
    public final double mo22202b(Object obj, long j11) {
        return Double.longBitsToDouble(m23072m(obj, j11));
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: c */
    public final float mo22203c(Object obj, long j11) {
        return Float.intBitsToFloat(m23071l(obj, j11));
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: d */
    public final void mo22204d(long j11, byte[] bArr, long j12, long j13) {
        Memory.peekByteArray(j11, bArr, (int) j12, (int) j13);
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: e */
    public final void mo22205e(Object obj, long j11, boolean z11) {
        if (ix3.f22548i) {
            ix3.m23445g(obj, j11, r3 ? (byte) 1 : (byte) 0);
        } else {
            ix3.m23446h(obj, j11, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: f */
    public final void mo22206f(Object obj, long j11, byte b11) {
        if (ix3.f22548i) {
            ix3.m23445g(obj, j11, b11);
        } else {
            ix3.m23446h(obj, j11, b11);
        }
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: g */
    public final void mo22207g(Object obj, long j11, double d11) {
        m23076q(obj, j11, Double.doubleToLongBits(d11));
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: h */
    public final void mo22208h(Object obj, long j11, float f11) {
        m23075p(obj, j11, Float.floatToIntBits(f11));
    }

    @Override // com.google.android.gms.internal.ads.hx3
    /* renamed from: i */
    public final boolean mo22209i(Object obj, long j11) {
        if (ix3.f22548i) {
            return ix3.m23435E(obj, j11);
        }
        return ix3.m23436F(obj, j11);
    }
}

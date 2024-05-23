package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class hx3 {

    /* renamed from: a */
    final Unsafe f21950a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hx3(Unsafe unsafe) {
        this.f21950a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo22201a(long j11);

    /* renamed from: b */
    public abstract double mo22202b(Object obj, long j11);

    /* renamed from: c */
    public abstract float mo22203c(Object obj, long j11);

    /* renamed from: d */
    public abstract void mo22204d(long j11, byte[] bArr, long j12, long j13);

    /* renamed from: e */
    public abstract void mo22205e(Object obj, long j11, boolean z11);

    /* renamed from: f */
    public abstract void mo22206f(Object obj, long j11, byte b11);

    /* renamed from: g */
    public abstract void mo22207g(Object obj, long j11, double d11);

    /* renamed from: h */
    public abstract void mo22208h(Object obj, long j11, float f11);

    /* renamed from: i */
    public abstract boolean mo22209i(Object obj, long j11);

    /* renamed from: j */
    public final int m23069j(Class cls) {
        return this.f21950a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int m23070k(Class cls) {
        return this.f21950a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int m23071l(Object obj, long j11) {
        return this.f21950a.getInt(obj, j11);
    }

    /* renamed from: m */
    public final long m23072m(Object obj, long j11) {
        return this.f21950a.getLong(obj, j11);
    }

    /* renamed from: n */
    public final long m23073n(Field field) {
        return this.f21950a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object m23074o(Object obj, long j11) {
        return this.f21950a.getObject(obj, j11);
    }

    /* renamed from: p */
    public final void m23075p(Object obj, long j11, int i11) {
        this.f21950a.putInt(obj, j11, i11);
    }

    /* renamed from: q */
    public final void m23076q(Object obj, long j11, long j12) {
        this.f21950a.putLong(obj, j11, j12);
    }

    /* renamed from: r */
    public final void m23077r(Object obj, long j11, Object obj2) {
        this.f21950a.putObject(obj, j11, obj2);
    }
}

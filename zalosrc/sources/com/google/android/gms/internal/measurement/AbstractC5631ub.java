package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ub */
/* loaded from: classes.dex */
public abstract class AbstractC5631ub {

    /* renamed from: a */
    final Unsafe f32840a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5631ub(Unsafe unsafe) {
        this.f32840a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo29596a(Object obj, long j11);

    /* renamed from: b */
    public abstract float mo29597b(Object obj, long j11);

    /* renamed from: c */
    public abstract void mo29598c(Object obj, long j11, boolean z11);

    /* renamed from: d */
    public abstract void mo29599d(Object obj, long j11, byte b11);

    /* renamed from: e */
    public abstract void mo29600e(Object obj, long j11, double d11);

    /* renamed from: f */
    public abstract void mo29601f(Object obj, long j11, float f11);

    /* renamed from: g */
    public abstract boolean mo29602g(Object obj, long j11);
}

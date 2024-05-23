package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class f40 {

    /* renamed from: a */
    private boolean f19993a = false;

    /* renamed from: b */
    private boolean f19994b = false;

    /* renamed from: c */
    private float f19995c = 0.0f;

    /* renamed from: d */
    private final AtomicBoolean f19996d = new AtomicBoolean(false);

    /* renamed from: a */
    public final synchronized float m21941a() {
        return this.f19995c;
    }

    /* renamed from: b */
    public final synchronized void m21942b(boolean z11, float f11) {
        this.f19994b = z11;
        this.f19995c = f11;
    }

    /* renamed from: c */
    public final synchronized void m21943c(boolean z11) {
        this.f19993a = z11;
        this.f19996d.set(true);
    }

    /* renamed from: d */
    public final synchronized boolean m21944d() {
        return this.f19994b;
    }

    /* renamed from: e */
    public final synchronized boolean m21945e(boolean z11) {
        if (this.f19996d.get()) {
            return this.f19993a;
        }
        return z11;
    }
}

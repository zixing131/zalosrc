package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import p229i5.InterfaceC20285f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* loaded from: classes.dex */
public final class C6164v8 {

    /* renamed from: a */
    private final InterfaceC20285f f34541a;

    /* renamed from: b */
    private long f34542b;

    public C6164v8(InterfaceC20285f interfaceC20285f) {
        AbstractC4205o.m19722k(interfaceC20285f);
        this.f34541a = interfaceC20285f;
    }

    /* renamed from: a */
    public final void m31467a() {
        this.f34542b = 0L;
    }

    /* renamed from: b */
    public final void m31468b() {
        this.f34542b = this.f34541a.mo105914b();
    }

    /* renamed from: c */
    public final boolean m31469c(long j11) {
        if (this.f34542b == 0 || this.f34541a.mo105914b() - this.f34542b >= 3600000) {
            return true;
        }
        return false;
    }
}

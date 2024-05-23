package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.f3 */
/* loaded from: classes2.dex */
final class C4487f3 extends AbstractC4561h3 {

    /* renamed from: b */
    public final long f19943b;

    /* renamed from: c */
    public final List f19944c;

    /* renamed from: d */
    public final List f19945d;

    public C4487f3(int i11, long j11) {
        super(i11);
        this.f19943b = j11;
        this.f19944c = new ArrayList();
        this.f19945d = new ArrayList();
    }

    /* renamed from: c */
    public final C4487f3 m21870c(int i11) {
        int size = this.f19945d.size();
        for (int i12 = 0; i12 < size; i12++) {
            C4487f3 c4487f3 = (C4487f3) this.f19945d.get(i12);
            if (c4487f3.f21515a == i11) {
                return c4487f3;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C4524g3 m21871d(int i11) {
        int size = this.f19944c.size();
        for (int i12 = 0; i12 < size; i12++) {
            C4524g3 c4524g3 = (C4524g3) this.f19944c.get(i12);
            if (c4524g3.f21515a == i11) {
                return c4524g3;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m21872e(C4487f3 c4487f3) {
        this.f19945d.add(c4487f3);
    }

    /* renamed from: f */
    public final void m21873f(C4524g3 c4524g3) {
        this.f19944c.add(c4524g3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4561h3
    public final String toString() {
        return AbstractC4561h3.m22690b(this.f21515a) + " leaves: " + Arrays.toString(this.f19944c.toArray()) + " containers: " + Arrays.toString(this.f19945d.toArray());
    }
}

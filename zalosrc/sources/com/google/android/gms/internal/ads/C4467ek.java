package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ek */
/* loaded from: classes2.dex */
final class C4467ek extends AbstractC4541gk {

    /* renamed from: P0 */
    public final long f19652P0;

    /* renamed from: Q0 */
    public final List f19653Q0;

    /* renamed from: R0 */
    public final List f19654R0;

    public C4467ek(int i11, long j11) {
        super(i11);
        this.f19652P0 = j11;
        this.f19653Q0 = new ArrayList();
        this.f19654R0 = new ArrayList();
    }

    /* renamed from: d */
    public final C4467ek m21732d(int i11) {
        int size = this.f19654R0.size();
        for (int i12 = 0; i12 < size; i12++) {
            C4467ek c4467ek = (C4467ek) this.f19654R0.get(i12);
            if (c4467ek.f20713a == i11) {
                return c4467ek;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C4504fk m21733e(int i11) {
        int size = this.f19653Q0.size();
        for (int i12 = 0; i12 < size; i12++) {
            C4504fk c4504fk = (C4504fk) this.f19653Q0.get(i12);
            if (c4504fk.f20713a == i11) {
                return c4504fk;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m21734f(C4467ek c4467ek) {
        this.f19654R0.add(c4467ek);
    }

    /* renamed from: g */
    public final void m21735g(C4504fk c4504fk) {
        this.f19653Q0.add(c4504fk);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4541gk
    public final String toString() {
        return AbstractC4541gk.m22462c(this.f20713a) + " leaves: " + Arrays.toString(this.f19653Q0.toArray()) + " containers: " + Arrays.toString(this.f19654R0.toArray());
    }
}

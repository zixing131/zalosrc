package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class bh4 {

    /* renamed from: c */
    private final zb1 f17753c;

    /* renamed from: b */
    private final SparseArray f17752b = new SparseArray();

    /* renamed from: a */
    private int f17751a = -1;

    public bh4(zb1 zb1Var) {
        this.f17753c = zb1Var;
    }

    /* renamed from: a */
    public final Object m20518a(int i11) {
        if (this.f17751a == -1) {
            this.f17751a = 0;
        }
        while (true) {
            int i12 = this.f17751a;
            if (i12 > 0 && i11 < this.f17752b.keyAt(i12)) {
                this.f17751a--;
            }
        }
        while (this.f17751a < this.f17752b.size() - 1 && i11 >= this.f17752b.keyAt(this.f17751a + 1)) {
            this.f17751a++;
        }
        return this.f17752b.valueAt(this.f17751a);
    }

    /* renamed from: b */
    public final Object m20519b() {
        return this.f17752b.valueAt(r0.size() - 1);
    }

    /* renamed from: c */
    public final void m20520c(int i11, Object obj) {
        boolean z11;
        boolean z12 = true;
        if (this.f17751a == -1) {
            if (this.f17752b.size() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            v71.m27175f(z11);
            this.f17751a = 0;
        }
        if (this.f17752b.size() > 0) {
            int keyAt = this.f17752b.keyAt(r0.size() - 1);
            if (i11 < keyAt) {
                z12 = false;
            }
            v71.m27173d(z12);
            if (keyAt == i11) {
                ug4.m26929A((sg4) this.f17752b.valueAt(r0.size() - 1));
            }
        }
        this.f17752b.append(i11, obj);
    }

    /* renamed from: d */
    public final void m20521d() {
        for (int i11 = 0; i11 < this.f17752b.size(); i11++) {
            ug4.m26929A((sg4) this.f17752b.valueAt(i11));
        }
        this.f17751a = -1;
        this.f17752b.clear();
    }

    /* renamed from: e */
    public final void m20522e(int i11) {
        int i12 = 0;
        while (i12 < this.f17752b.size() - 1) {
            int i13 = i12 + 1;
            if (i11 >= this.f17752b.keyAt(i13)) {
                ug4.m26929A((sg4) this.f17752b.valueAt(i12));
                this.f17752b.removeAt(i12);
                int i14 = this.f17751a;
                if (i14 > 0) {
                    this.f17751a = i14 - 1;
                }
                i12 = i13;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean m20523f() {
        if (this.f17752b.size() == 0) {
            return true;
        }
        return false;
    }
}

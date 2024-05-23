package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class t44 {

    /* renamed from: a */
    private final C4336b f28199a;

    /* renamed from: b */
    private final SparseArray f28200b;

    public t44(C4336b c4336b, SparseArray sparseArray) {
        this.f28199a = c4336b;
        SparseArray sparseArray2 = new SparseArray(c4336b.m20360b());
        for (int i11 = 0; i11 < c4336b.m20360b(); i11++) {
            int m20359a = c4336b.m20359a(i11);
            s44 s44Var = (s44) sparseArray.get(m20359a);
            s44Var.getClass();
            sparseArray2.append(m20359a, s44Var);
        }
        this.f28200b = sparseArray2;
    }

    /* renamed from: a */
    public final int m26564a(int i11) {
        return this.f28199a.m20359a(i11);
    }

    /* renamed from: b */
    public final int m26565b() {
        return this.f28199a.m20360b();
    }

    /* renamed from: c */
    public final s44 m26566c(int i11) {
        s44 s44Var = (s44) this.f28200b.get(i11);
        s44Var.getClass();
        return s44Var;
    }

    /* renamed from: d */
    public final boolean m26567d(int i11) {
        return this.f28199a.m20361c(i11);
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p11 {

    /* renamed from: e */
    public static final g94 f26025e = new g94() { // from class: com.google.android.gms.internal.ads.o01
    };

    /* renamed from: a */
    public final int f26026a;

    /* renamed from: b */
    private final jt0 f26027b;

    /* renamed from: c */
    private final int[] f26028c;

    /* renamed from: d */
    private final boolean[] f26029d;

    public p11(jt0 jt0Var, boolean z11, int[] iArr, boolean[] zArr) {
        int i11 = jt0Var.f22986a;
        this.f26026a = 1;
        this.f26027b = jt0Var;
        this.f26028c = (int[]) iArr.clone();
        this.f26029d = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public final int m25373a() {
        return this.f26027b.f22988c;
    }

    /* renamed from: b */
    public final C4671k3 m25374b(int i11) {
        return this.f26027b.m23747b(i11);
    }

    /* renamed from: c */
    public final boolean m25375c() {
        for (boolean z11 : this.f26029d) {
            if (z11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m25376d(int i11) {
        return this.f26029d[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p11.class == obj.getClass()) {
            p11 p11Var = (p11) obj;
            if (this.f26027b.equals(p11Var.f26027b) && Arrays.equals(this.f26028c, p11Var.f26028c) && Arrays.equals(this.f26029d, p11Var.f26029d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f26027b.hashCode() * 961) + Arrays.hashCode(this.f26028c)) * 31) + Arrays.hashCode(this.f26029d);
    }
}

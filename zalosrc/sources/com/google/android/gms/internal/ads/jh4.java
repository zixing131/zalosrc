package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class jh4 implements ui4 {

    /* renamed from: a */
    protected final jt0 f22824a;

    /* renamed from: b */
    protected final int f22825b;

    /* renamed from: c */
    protected final int[] f22826c;

    /* renamed from: d */
    private final C4671k3[] f22827d;

    /* renamed from: e */
    private int f22828e;

    public jh4(jt0 jt0Var, int[] iArr, int i11) {
        boolean z11;
        int length = iArr.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27175f(z11);
        jt0Var.getClass();
        this.f22824a = jt0Var;
        this.f22825b = length;
        this.f22827d = new C4671k3[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f22827d[i12] = jt0Var.m23747b(iArr[i12]);
        }
        Arrays.sort(this.f22827d, new Comparator() { // from class: com.google.android.gms.internal.ads.ih4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C4671k3) obj2).f23095h - ((C4671k3) obj).f23095h;
            }
        });
        this.f22826c = new int[this.f22825b];
        for (int i13 = 0; i13 < this.f22825b; i13++) {
            this.f22826c[i13] = jt0Var.m23746a(this.f22827d[i13]);
        }
    }

    @Override // com.google.android.gms.internal.ads.yi4
    /* renamed from: a */
    public final int mo23616a(int i11) {
        return this.f22826c[0];
    }

    @Override // com.google.android.gms.internal.ads.yi4
    /* renamed from: c */
    public final C4671k3 mo23617c(int i11) {
        return this.f22827d[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jh4 jh4Var = (jh4) obj;
            if (this.f22824a == jh4Var.f22824a && Arrays.equals(this.f22826c, jh4Var.f22826c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f22828e;
        if (i11 == 0) {
            int identityHashCode = (System.identityHashCode(this.f22824a) * 31) + Arrays.hashCode(this.f22826c);
            this.f22828e = identityHashCode;
            return identityHashCode;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final int zzb(int i11) {
        for (int i12 = 0; i12 < this.f22825b; i12++) {
            if (this.f22826c[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final int zzc() {
        return this.f22826c.length;
    }

    @Override // com.google.android.gms.internal.ads.yi4
    public final jt0 zze() {
        return this.f22824a;
    }
}

package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.zm */
/* loaded from: classes2.dex */
public abstract class AbstractC5248zm {

    /* renamed from: a */
    protected final C5099vm f31561a;

    /* renamed from: b */
    protected final int[] f31562b;

    /* renamed from: c */
    private final zzasw[] f31563c;

    /* renamed from: d */
    private int f31564d;

    public AbstractC5248zm(C5099vm c5099vm, int... iArr) {
        c5099vm.getClass();
        this.f31561a = c5099vm;
        this.f31563c = new zzasw[1];
        for (int i11 = 0; i11 <= 0; i11++) {
            this.f31563c[i11] = c5099vm.m27307b(iArr[i11]);
        }
        Arrays.sort(this.f31563c, new C5211ym(null));
        this.f31562b = new int[1];
        for (int i12 = 0; i12 <= 0; i12++) {
            this.f31562b[i12] = c5099vm.m27306a(this.f31563c[i12]);
        }
    }

    /* renamed from: a */
    public final int m28543a(int i11) {
        return this.f31562b[0];
    }

    /* renamed from: b */
    public final int m28544b() {
        int length = this.f31562b.length;
        return 1;
    }

    /* renamed from: c */
    public final zzasw m28545c(int i11) {
        return this.f31563c[i11];
    }

    /* renamed from: d */
    public final C5099vm m28546d() {
        return this.f31561a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC5248zm abstractC5248zm = (AbstractC5248zm) obj;
            if (this.f31561a == abstractC5248zm.f31561a && Arrays.equals(this.f31562b, abstractC5248zm.f31562b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f31564d;
        if (i11 == 0) {
            int identityHashCode = (System.identityHashCode(this.f31561a) * 31) + Arrays.hashCode(this.f31562b);
            this.f31564d = identityHashCode;
            return identityHashCode;
        }
        return i11;
    }
}

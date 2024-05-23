package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wm */
/* loaded from: classes2.dex */
public final class C5137wm {

    /* renamed from: d */
    public static final C5137wm f30004d = new C5137wm(new C5099vm[0]);

    /* renamed from: a */
    public final int f30005a;

    /* renamed from: b */
    private final C5099vm[] f30006b;

    /* renamed from: c */
    private int f30007c;

    public C5137wm(C5099vm... c5099vmArr) {
        this.f30006b = c5099vmArr;
        this.f30005a = c5099vmArr.length;
    }

    /* renamed from: a */
    public final int m27654a(C5099vm c5099vm) {
        for (int i11 = 0; i11 < this.f30005a; i11++) {
            if (this.f30006b[i11] == c5099vm) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C5099vm m27655b(int i11) {
        return this.f30006b[i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5137wm.class == obj.getClass()) {
            C5137wm c5137wm = (C5137wm) obj;
            if (this.f30005a == c5137wm.f30005a && Arrays.equals(this.f30006b, c5137wm.f30006b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f30007c;
        if (i11 == 0) {
            int hashCode = Arrays.hashCode(this.f30006b);
            this.f30007c = hashCode;
            return hashCode;
        }
        return i11;
    }
}

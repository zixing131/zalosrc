package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class jt0 {

    /* renamed from: f */
    public static final g94 f22985f = ks0.f23465a;

    /* renamed from: a */
    public final int f22986a = 1;

    /* renamed from: b */
    public final String f22987b;

    /* renamed from: c */
    public final int f22988c;

    /* renamed from: d */
    private final C4671k3[] f22989d;

    /* renamed from: e */
    private int f22990e;

    public jt0(String str, C4671k3... c4671k3Arr) {
        this.f22987b = str;
        this.f22989d = c4671k3Arr;
        int m23844b = k70.m23844b(c4671k3Arr[0].f23099l);
        this.f22988c = m23844b == -1 ? k70.m23844b(c4671k3Arr[0].f23098k) : m23844b;
        m23745d(c4671k3Arr[0].f23090c);
        int i11 = c4671k3Arr[0].f23092e;
    }

    /* renamed from: d */
    private static String m23745d(String str) {
        if (str != null && !str.equals("und")) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    public final int m23746a(C4671k3 c4671k3) {
        for (int i11 = 0; i11 <= 0; i11++) {
            if (c4671k3 == this.f22989d[i11]) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C4671k3 m23747b(int i11) {
        return this.f22989d[i11];
    }

    /* renamed from: c */
    public final jt0 m23748c(String str) {
        return new jt0(str, this.f22989d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jt0.class == obj.getClass()) {
            jt0 jt0Var = (jt0) obj;
            if (this.f22987b.equals(jt0Var.f22987b) && Arrays.equals(this.f22989d, jt0Var.f22989d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f22990e;
        if (i11 == 0) {
            int hashCode = ((this.f22987b.hashCode() + 527) * 31) + Arrays.hashCode(this.f22989d);
            this.f22990e = hashCode;
            return hashCode;
        }
        return i11;
    }
}

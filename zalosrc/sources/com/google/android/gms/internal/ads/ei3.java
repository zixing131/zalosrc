package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class ei3 {
    /* renamed from: a */
    public static xh3 m21723a(ap3 ap3Var) {
        if (ap3Var.m20217I() == 3) {
            return new uh3(16);
        }
        if (ap3Var.m20217I() == 4) {
            return new uh3(32);
        }
        if (ap3Var.m20217I() == 5) {
            return new vh3();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    public static bi3 m21724b(ap3 ap3Var) {
        if (ap3Var.m20219K() == 3) {
            return new oi3(new wh3("HmacSha256"));
        }
        if (ap3Var.m20219K() == 4) {
            return mi3.m24606b(1);
        }
        if (ap3Var.m20219K() == 5) {
            return mi3.m24606b(2);
        }
        if (ap3Var.m20219K() == 6) {
            return mi3.m24606b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    public static wh3 m21725c(ap3 ap3Var) {
        if (ap3Var.m20218J() == 3) {
            return new wh3("HmacSha256");
        }
        if (ap3Var.m20218J() == 4) {
            return new wh3("HmacSha384");
        }
        if (ap3Var.m20218J() == 5) {
            return new wh3("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}

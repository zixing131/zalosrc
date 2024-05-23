package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l */
/* loaded from: classes2.dex */
public final class C4704l {

    /* renamed from: a */
    public final C4816o f23656a;

    /* renamed from: b */
    public final C4816o f23657b;

    public C4704l(C4816o c4816o, C4816o c4816o2) {
        this.f23656a = c4816o;
        this.f23657b = c4816o2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4704l.class == obj.getClass()) {
            C4704l c4704l = (C4704l) obj;
            if (this.f23656a.equals(c4704l.f23656a) && this.f23657b.equals(c4704l.f23657b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f23656a.hashCode() * 31) + this.f23657b.hashCode();
    }

    public final String toString() {
        String concat;
        String obj = this.f23656a.toString();
        if (this.f23656a.equals(this.f23657b)) {
            concat = "";
        } else {
            concat = ", ".concat(this.f23657b.toString());
        }
        return "[" + obj + concat + "]";
    }
}

package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o */
/* loaded from: classes2.dex */
public final class C4816o {

    /* renamed from: c */
    public static final C4816o f25384c = new C4816o(0, 0);

    /* renamed from: a */
    public final long f25385a;

    /* renamed from: b */
    public final long f25386b;

    public C4816o(long j11, long j12) {
        this.f25385a = j11;
        this.f25386b = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4816o.class == obj.getClass()) {
            C4816o c4816o = (C4816o) obj;
            if (this.f25385a == c4816o.f25385a && this.f25386b == c4816o.f25386b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f25385a) * 31) + ((int) this.f25386b);
    }

    public final String toString() {
        return "[timeUs=" + this.f25385a + ", position=" + this.f25386b + "]";
    }
}

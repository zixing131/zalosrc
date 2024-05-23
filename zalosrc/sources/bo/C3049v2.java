package bo;

import androidx.work.AbstractC2147g0;

/* renamed from: bo.v2 */
/* loaded from: classes4.dex */
public final class C3049v2 {

    /* renamed from: a */
    private long f12295a;

    /* renamed from: b */
    private int f12296b;

    /* renamed from: c */
    private int f12297c;

    public C3049v2(long j11, int i11, int i12) {
        this.f12295a = j11;
        this.f12296b = i11;
        this.f12297c = i12;
    }

    /* renamed from: a */
    public final int m14634a() {
        return this.f12297c;
    }

    /* renamed from: b */
    public final long m14635b() {
        return this.f12295a;
    }

    /* renamed from: c */
    public final int m14636c() {
        return this.f12296b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3049v2)) {
            return false;
        }
        C3049v2 c3049v2 = (C3049v2) obj;
        return this.f12295a == c3049v2.f12295a && this.f12296b == c3049v2.f12296b && this.f12297c == c3049v2.f12297c;
    }

    public int hashCode() {
        return (((AbstractC2147g0.m11521a(this.f12295a) * 31) + this.f12296b) * 31) + this.f12297c;
    }

    public String toString() {
        return "OriginalSizeData(photoId=" + this.f12295a + ", width=" + this.f12296b + ", height=" + this.f12297c + ")";
    }
}

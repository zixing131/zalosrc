package xh0;

/* renamed from: xh0.f0 */
/* loaded from: classes7.dex */
public final class C29645f0 {

    /* renamed from: a */
    public final int f136895a;

    /* renamed from: b */
    public final int f136896b;

    public C29645f0(int i11, int i12) {
        this.f136895a = i11;
        this.f136896b = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29645f0)) {
            return false;
        }
        C29645f0 c29645f0 = (C29645f0) obj;
        return this.f136895a == c29645f0.f136895a && this.f136896b == c29645f0.f136896b;
    }

    public int hashCode() {
        return (this.f136895a * 31) + this.f136896b;
    }

    public String toString() {
        return "ZCameraSize(width=" + this.f136895a + ", height=" + this.f136896b + ')';
    }
}

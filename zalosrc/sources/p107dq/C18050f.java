package p107dq;

/* renamed from: dq.f */
/* loaded from: classes4.dex */
public final class C18050f {

    /* renamed from: a */
    private final int f91339a;

    /* renamed from: b */
    private final int f91340b;

    public C18050f(int i11, int i12) {
        this.f91339a = i11;
        this.f91340b = i12;
    }

    /* renamed from: a */
    public final int m95933a() {
        return this.f91339a;
    }

    /* renamed from: b */
    public final int m95934b() {
        return this.f91340b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18050f)) {
            return false;
        }
        C18050f c18050f = (C18050f) obj;
        return this.f91339a == c18050f.f91339a && this.f91340b == c18050f.f91340b;
    }

    public int hashCode() {
        return (this.f91339a * 31) + this.f91340b;
    }

    public String toString() {
        return "LayoutDataInfo(layoutId=" + this.f91339a + ", themeId=" + this.f91340b + ")";
    }
}

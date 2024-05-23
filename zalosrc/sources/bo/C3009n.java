package bo;

/* renamed from: bo.n */
/* loaded from: classes4.dex */
public final class C3009n {

    /* renamed from: a */
    private int f11982a;

    public C3009n(int i11) {
        this.f11982a = i11;
    }

    /* renamed from: a */
    public final int m14425a() {
        return this.f11982a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3009n) && this.f11982a == ((C3009n) obj).f11982a;
    }

    public int hashCode() {
        return this.f11982a;
    }

    public String toString() {
        return "AlbumRowSkeletonData(skeletonType=" + this.f11982a + ")";
    }
}

package im;

/* renamed from: im.p */
/* loaded from: classes3.dex */
public final class C20625p extends AbstractC20613d {

    /* renamed from: a */
    private final int f101449a;

    /* renamed from: b */
    private final int f101450b;

    public C20625p(int i11, int i12) {
        super(null);
        this.f101449a = i11;
        this.f101450b = i12;
    }

    /* renamed from: a */
    public final int m107383a() {
        return this.f101450b;
    }

    /* renamed from: b */
    public final int m107384b() {
        return this.f101449a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20625p)) {
            return false;
        }
        C20625p c20625p = (C20625p) obj;
        return this.f101449a == c20625p.f101449a && this.f101450b == c20625p.f101450b;
    }

    public int hashCode() {
        return (this.f101449a * 31) + this.f101450b;
    }

    public String toString() {
        return "VideoTrimContent(start=" + this.f101449a + ", end=" + this.f101450b + ")";
    }
}

package im;

import androidx.work.AbstractC2144f;

/* renamed from: im.j */
/* loaded from: classes3.dex */
public final class C20619j extends AbstractC20613d {

    /* renamed from: a */
    private final int f101397a;

    /* renamed from: b */
    private final int f101398b;

    /* renamed from: c */
    private final boolean f101399c;

    public C20619j(int i11, int i12, boolean z11) {
        super(null);
        this.f101397a = i11;
        this.f101398b = i12;
        this.f101399c = z11;
    }

    /* renamed from: a */
    public final int m107328a() {
        return this.f101397a;
    }

    /* renamed from: b */
    public final boolean m107329b() {
        return this.f101399c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20619j)) {
            return false;
        }
        C20619j c20619j = (C20619j) obj;
        return this.f101397a == c20619j.f101397a && this.f101398b == c20619j.f101398b && this.f101399c == c20619j.f101399c;
    }

    public int hashCode() {
        return (((this.f101397a * 31) + this.f101398b) * 31) + AbstractC2144f.m11520a(this.f101399c);
    }

    public String toString() {
        return "LocationFilterContent(id=" + this.f101397a + ", type=" + this.f101398b + ", promoted=" + this.f101399c + ")";
    }
}

package im;

import androidx.work.AbstractC2144f;

/* renamed from: im.l */
/* loaded from: classes3.dex */
public final class C20621l extends AbstractC20613d {

    /* renamed from: a */
    private final boolean f101438a;

    /* renamed from: b */
    private final boolean f101439b;

    public C20621l(boolean z11, boolean z12) {
        super(null);
        this.f101438a = z11;
        this.f101439b = z12;
    }

    /* renamed from: a */
    public final boolean m107372a() {
        return this.f101438a;
    }

    /* renamed from: b */
    public final boolean m107373b() {
        return this.f101439b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20621l)) {
            return false;
        }
        C20621l c20621l = (C20621l) obj;
        return this.f101438a == c20621l.f101438a && this.f101439b == c20621l.f101439b;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f101438a) * 31) + AbstractC2144f.m11520a(this.f101439b);
    }

    public String toString() {
        return "PhotoSuggestContent(firstOpen=" + this.f101438a + ", hasUnread=" + this.f101439b + ")";
    }
}

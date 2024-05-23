package p134el;

import androidx.work.AbstractC2144f;

/* renamed from: el.i */
/* loaded from: classes3.dex */
public final class C18470i {

    /* renamed from: a */
    private final boolean f93039a;

    /* renamed from: b */
    private final int f93040b;

    public C18470i(boolean z11, int i11) {
        this.f93039a = z11;
        this.f93040b = i11;
    }

    /* renamed from: a */
    public final int m97805a() {
        return this.f93040b;
    }

    /* renamed from: b */
    public final boolean m97806b() {
        return this.f93039a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18470i)) {
            return false;
        }
        C18470i c18470i = (C18470i) obj;
        return this.f93039a == c18470i.f93039a && this.f93040b == c18470i.f93040b;
    }

    public int hashCode() {
        return (AbstractC2144f.m11520a(this.f93039a) * 31) + this.f93040b;
    }

    public String toString() {
        return "PageScrollStateChangedParam(isIdling=" + this.f93039a + ", firstCompletelyVisibleItem=" + this.f93040b + ")";
    }
}

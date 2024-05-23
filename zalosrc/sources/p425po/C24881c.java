package p425po;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: po.c */
/* loaded from: classes4.dex */
public final class C24881c {

    /* renamed from: a */
    private boolean f119382a;

    /* renamed from: b */
    private boolean f119383b;

    /* renamed from: c */
    private boolean f119384c;

    /* renamed from: d */
    private boolean f119385d;

    public C24881c() {
        this(false, false, false, false, 15, null);
    }

    /* renamed from: a */
    public final boolean m129381a() {
        return this.f119382a;
    }

    /* renamed from: b */
    public final boolean m129382b() {
        return this.f119383b;
    }

    /* renamed from: c */
    public final boolean m129383c() {
        return this.f119385d;
    }

    /* renamed from: d */
    public final boolean m129384d() {
        return this.f119384c;
    }

    /* renamed from: e */
    public final void m129385e(boolean z11) {
        this.f119382a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24881c)) {
            return false;
        }
        C24881c c24881c = (C24881c) obj;
        return this.f119382a == c24881c.f119382a && this.f119383b == c24881c.f119383b && this.f119384c == c24881c.f119384c && this.f119385d == c24881c.f119385d;
    }

    /* renamed from: f */
    public final void m129386f(boolean z11) {
        this.f119383b = z11;
    }

    /* renamed from: g */
    public final void m129387g(boolean z11) {
        this.f119385d = z11;
    }

    /* renamed from: h */
    public final void m129388h(boolean z11) {
        this.f119384c = z11;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f119382a) * 31) + AbstractC2144f.m11520a(this.f119383b)) * 31) + AbstractC2144f.m11520a(this.f119384c)) * 31) + AbstractC2144f.m11520a(this.f119385d);
    }

    public String toString() {
        return "FeedOption(enable=" + this.f119382a + ", enableHide=" + this.f119383b + ", enableRestrict=" + this.f119384c + ", enableMove=" + this.f119385d + ")";
    }

    public C24881c(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f119382a = z11;
        this.f119383b = z12;
        this.f119384c = z13;
        this.f119385d = z14;
    }

    public /* synthetic */ C24881c(boolean z11, boolean z12, boolean z13, boolean z14, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? true : z14);
    }
}

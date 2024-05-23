package p619wr;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: wr.e */
/* loaded from: classes4.dex */
public final class C29198e implements InterfaceC29195b {

    /* renamed from: a */
    private final String f135267a;

    /* renamed from: b */
    private final String f135268b;

    /* renamed from: c */
    private final String f135269c;

    /* renamed from: d */
    private final int f135270d;

    /* renamed from: e */
    private boolean f135271e;

    /* renamed from: f */
    private boolean f135272f;

    /* renamed from: g */
    private final String f135273g;

    public C29198e(String str, String str2, String str3, int i11, boolean z11, boolean z12, String str4) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "avt");
        AbstractC19074t.m100208f(str3, "dpn");
        AbstractC19074t.m100208f(str4, "titleName");
        this.f135267a = str;
        this.f135268b = str2;
        this.f135269c = str3;
        this.f135270d = i11;
        this.f135271e = z11;
        this.f135272f = z12;
        this.f135273g = str4;
    }

    /* renamed from: a */
    public final String m145763a() {
        return this.f135268b;
    }

    /* renamed from: b */
    public final boolean m145764b() {
        return this.f135272f;
    }

    /* renamed from: c */
    public final boolean m145765c() {
        return this.f135271e;
    }

    /* renamed from: d */
    public final int m145766d() {
        return this.f135270d;
    }

    /* renamed from: e */
    public final String m145767e() {
        return this.f135273g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29198e)) {
            return false;
        }
        C29198e c29198e = (C29198e) obj;
        return AbstractC19074t.m100204b(this.f135267a, c29198e.f135267a) && AbstractC19074t.m100204b(this.f135268b, c29198e.f135268b) && AbstractC19074t.m100204b(this.f135269c, c29198e.f135269c) && this.f135270d == c29198e.f135270d && this.f135271e == c29198e.f135271e && this.f135272f == c29198e.f135272f && AbstractC19074t.m100204b(this.f135273g, c29198e.f135273g);
    }

    /* renamed from: f */
    public final String m145768f() {
        return this.f135267a;
    }

    /* renamed from: g */
    public final void m145769g(boolean z11) {
        this.f135272f = z11;
    }

    /* renamed from: h */
    public final void m145770h(boolean z11) {
        this.f135271e = z11;
    }

    public int hashCode() {
        return (((((((((((this.f135267a.hashCode() * 31) + this.f135268b.hashCode()) * 31) + this.f135269c.hashCode()) * 31) + this.f135270d) * 31) + AbstractC2144f.m11520a(this.f135271e)) * 31) + AbstractC2144f.m11520a(this.f135272f)) * 31) + this.f135273g.hashCode();
    }

    public String toString() {
        return "FeedReactionViewerData(uid=" + this.f135267a + ", avt=" + this.f135268b + ", dpn=" + this.f135269c + ", reactionId=" + this.f135270d + ", hasStory=" + this.f135271e + ", enableStory=" + this.f135272f + ", titleName=" + this.f135273g + ")";
    }
}

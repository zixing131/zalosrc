package er;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;

/* renamed from: er.m */
/* loaded from: classes4.dex */
public final class C18589m {

    /* renamed from: a */
    private final int f93395a;

    /* renamed from: b */
    private final String f93396b;

    /* renamed from: c */
    private final boolean f93397c;

    /* renamed from: d */
    private final boolean f93398d;

    public C18589m(int i11, String str, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "requestedStoryId");
        this.f93395a = i11;
        this.f93396b = str;
        this.f93397c = z11;
        this.f93398d = z12;
    }

    /* renamed from: a */
    public final boolean m98127a() {
        return this.f93397c;
    }

    /* renamed from: b */
    public final boolean m98128b() {
        return this.f93398d;
    }

    /* renamed from: c */
    public final String m98129c() {
        return this.f93396b;
    }

    /* renamed from: d */
    public final int m98130d() {
        return this.f93395a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18589m)) {
            return false;
        }
        C18589m c18589m = (C18589m) obj;
        return this.f93395a == c18589m.f93395a && AbstractC19074t.m100204b(this.f93396b, c18589m.f93396b) && this.f93397c == c18589m.f93397c && this.f93398d == c18589m.f93398d;
    }

    public int hashCode() {
        return (((((this.f93395a * 31) + this.f93396b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f93397c)) * 31) + AbstractC2144f.m11520a(this.f93398d);
    }

    public String toString() {
        return "StoryClickInfo(userStoryPosition=" + this.f93395a + ", requestedStoryId=" + this.f93396b + ", hasMoreBackward=" + this.f93397c + ", hasMoreForward=" + this.f93398d + ")";
    }
}

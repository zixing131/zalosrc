package gr;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: gr.b */
/* loaded from: classes4.dex */
public final class C19590b {

    /* renamed from: a */
    private String f97322a;

    /* renamed from: b */
    private String f97323b;

    /* renamed from: c */
    private String f97324c;

    /* renamed from: d */
    private List f97325d;

    /* renamed from: e */
    private boolean f97326e;

    /* renamed from: f */
    private boolean f97327f;

    /* renamed from: g */
    private String f97328g;

    /* renamed from: h */
    private boolean f97329h;

    /* renamed from: i */
    private boolean f97330i;

    /* renamed from: j */
    private int f97331j;

    /* renamed from: k */
    private int f97332k;

    public C19590b(String str, String str2, String str3, List list, boolean z11, boolean z12, String str4, boolean z13, boolean z14, int i11, int i12) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "avt");
        AbstractC19074t.m100208f(str3, "dpn");
        AbstractC19074t.m100208f(list, "storyList");
        AbstractC19074t.m100208f(str4, "lastStoryId");
        this.f97322a = str;
        this.f97323b = str2;
        this.f97324c = str3;
        this.f97325d = list;
        this.f97326e = z11;
        this.f97327f = z12;
        this.f97328g = str4;
        this.f97329h = z13;
        this.f97330i = z14;
        this.f97331j = i11;
        this.f97332k = i12;
    }

    /* renamed from: a */
    public final String m102547a() {
        return this.f97323b;
    }

    /* renamed from: b */
    public final String m102548b() {
        return this.f97324c;
    }

    /* renamed from: c */
    public final int m102549c() {
        return this.f97331j;
    }

    /* renamed from: d */
    public final boolean m102550d() {
        return this.f97329h;
    }

    /* renamed from: e */
    public final String m102551e() {
        return this.f97328g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19590b)) {
            return false;
        }
        C19590b c19590b = (C19590b) obj;
        return AbstractC19074t.m100204b(this.f97322a, c19590b.f97322a) && AbstractC19074t.m100204b(this.f97323b, c19590b.f97323b) && AbstractC19074t.m100204b(this.f97324c, c19590b.f97324c) && AbstractC19074t.m100204b(this.f97325d, c19590b.f97325d) && this.f97326e == c19590b.f97326e && this.f97327f == c19590b.f97327f && AbstractC19074t.m100204b(this.f97328g, c19590b.f97328g) && this.f97329h == c19590b.f97329h && this.f97330i == c19590b.f97330i && this.f97331j == c19590b.f97331j && this.f97332k == c19590b.f97332k;
    }

    /* renamed from: f */
    public final List m102552f() {
        return this.f97325d;
    }

    /* renamed from: g */
    public final int m102553g() {
        return this.f97332k;
    }

    /* renamed from: h */
    public final String m102554h() {
        return this.f97322a;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f97322a.hashCode() * 31) + this.f97323b.hashCode()) * 31) + this.f97324c.hashCode()) * 31) + this.f97325d.hashCode()) * 31) + AbstractC2144f.m11520a(this.f97326e)) * 31) + AbstractC2144f.m11520a(this.f97327f)) * 31) + this.f97328g.hashCode()) * 31) + AbstractC2144f.m11520a(this.f97329h)) * 31) + AbstractC2144f.m11520a(this.f97330i)) * 31) + this.f97331j) * 31) + this.f97332k;
    }

    /* renamed from: i */
    public final boolean m102555i() {
        return this.f97327f;
    }

    /* renamed from: j */
    public final boolean m102556j() {
        return this.f97326e;
    }

    /* renamed from: k */
    public final boolean m102557k() {
        return this.f97330i;
    }

    public String toString() {
        return "StoryArchiveResponseData(uid=" + this.f97322a + ", avt=" + this.f97323b + ", dpn=" + this.f97324c + ", storyList=" + this.f97325d + ", isLoadMore=" + this.f97326e + ", isLoadBackward=" + this.f97327f + ", lastStoryId=" + this.f97328g + ", hasMore=" + this.f97329h + ", isSuccess=" + this.f97330i + ", errorCode=" + this.f97331j + ", totalStoryItem=" + this.f97332k + ")";
    }

    public /* synthetic */ C19590b(String str, String str2, String str3, List list, boolean z11, boolean z12, String str4, boolean z13, boolean z14, int i11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, str2, str3, list, z11, z12, str4, z13, (i13 & 256) != 0 ? true : z14, (i13 & 512) != 0 ? 0 : i11, (i13 & 1024) != 0 ? -1 : i12);
    }
}

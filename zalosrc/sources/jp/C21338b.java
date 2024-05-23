package jp;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25332a0;

/* renamed from: jp.b */
/* loaded from: classes4.dex */
public final class C21338b {

    /* renamed from: a */
    private String f103931a;

    /* renamed from: b */
    private int f103932b;

    /* renamed from: c */
    private List f103933c;

    /* renamed from: d */
    private int f103934d;

    /* renamed from: e */
    private String f103935e;

    /* renamed from: f */
    private boolean f103936f;

    /* renamed from: g */
    private int f103937g;

    public C21338b(String str, int i11, List list, int i12, String str2, boolean z11, int i13) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(list, "listLikeContacts");
        AbstractC19074t.m100208f(str2, "lastUidLoaded");
        this.f103931a = str;
        this.f103932b = i11;
        this.f103933c = list;
        this.f103934d = i12;
        this.f103935e = str2;
        this.f103936f = z11;
        this.f103937g = i13;
    }

    /* renamed from: c */
    public static /* synthetic */ C21338b m110528c(C21338b c21338b, String str, int i11, List list, int i12, String str2, boolean z11, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = c21338b.f103931a;
        }
        if ((i14 & 2) != 0) {
            i11 = c21338b.f103932b;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            list = c21338b.f103933c;
        }
        List list2 = list;
        if ((i14 & 8) != 0) {
            i12 = c21338b.f103934d;
        }
        int i16 = i12;
        if ((i14 & 16) != 0) {
            str2 = c21338b.f103935e;
        }
        String str3 = str2;
        if ((i14 & 32) != 0) {
            z11 = c21338b.f103936f;
        }
        boolean z12 = z11;
        if ((i14 & 64) != 0) {
            i13 = c21338b.f103937g;
        }
        return c21338b.m110530b(str, i15, list2, i16, str3, z12, i13);
    }

    /* renamed from: a */
    public final C21338b m110529a(List list, boolean z11, int i11, String str, int i12) {
        List m131222v0;
        List m131187O0;
        AbstractC19074t.m100208f(list, "newLikeContacts");
        AbstractC19074t.m100208f(str, "lastUidLoaded");
        m131222v0 = AbstractC25332a0.m131222v0(this.f103933c, list);
        m131187O0 = AbstractC25332a0.m131187O0(m131222v0);
        return m110528c(this, null, i12, m131187O0, i11, str, z11, 0, 65, null);
    }

    /* renamed from: b */
    public final C21338b m110530b(String str, int i11, List list, int i12, String str2, boolean z11, int i13) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(list, "listLikeContacts");
        AbstractC19074t.m100208f(str2, "lastUidLoaded");
        return new C21338b(str, i11, list, i12, str2, z11, i13);
    }

    /* renamed from: d */
    public final boolean m110531d() {
        return this.f103936f;
    }

    /* renamed from: e */
    public final String m110532e() {
        return this.f103931a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21338b)) {
            return false;
        }
        C21338b c21338b = (C21338b) obj;
        return AbstractC19074t.m100204b(this.f103931a, c21338b.f103931a) && this.f103932b == c21338b.f103932b && AbstractC19074t.m100204b(this.f103933c, c21338b.f103933c) && this.f103934d == c21338b.f103934d && AbstractC19074t.m100204b(this.f103935e, c21338b.f103935e) && this.f103936f == c21338b.f103936f && this.f103937g == c21338b.f103937g;
    }

    /* renamed from: f */
    public final String m110533f() {
        return this.f103935e;
    }

    /* renamed from: g */
    public final List m110534g() {
        return this.f103933c;
    }

    /* renamed from: h */
    public final int m110535h() {
        return this.f103937g;
    }

    public int hashCode() {
        return (((((((((((this.f103931a.hashCode() * 31) + this.f103932b) * 31) + this.f103933c.hashCode()) * 31) + this.f103934d) * 31) + this.f103935e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f103936f)) * 31) + this.f103937g;
    }

    /* renamed from: i */
    public final int m110536i() {
        return this.f103934d;
    }

    /* renamed from: j */
    public final int m110537j() {
        return this.f103932b;
    }

    /* renamed from: k */
    public final void m110538k(boolean z11) {
        this.f103936f = z11;
    }

    /* renamed from: l */
    public final void m110539l(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103931a = str;
    }

    /* renamed from: m */
    public final void m110540m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103935e = str;
    }

    /* renamed from: n */
    public final void m110541n(int i11) {
        this.f103934d = i11;
    }

    /* renamed from: o */
    public final void m110542o(int i11) {
        this.f103932b = i11;
    }

    public String toString() {
        return "LikeDetailInfo(id=" + this.f103931a + ", totalLike=" + this.f103932b + ", listLikeContacts=" + this.f103933c + ", page=" + this.f103934d + ", lastUidLoaded=" + this.f103935e + ", hasMore=" + this.f103936f + ", numRetryLoad=" + this.f103937g + ")";
    }

    public /* synthetic */ C21338b(String str, int i11, List list, int i12, String str2, boolean z11, int i13, int i14, AbstractC19060k abstractC19060k) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0 : i11, (i14 & 4) != 0 ? new ArrayList() : list, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) == 0 ? str2 : "", (i14 & 32) != 0 ? true : z11, (i14 & 64) != 0 ? 0 : i13);
    }
}

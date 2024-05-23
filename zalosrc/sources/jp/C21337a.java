package jp;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25332a0;

/* renamed from: jp.a */
/* loaded from: classes4.dex */
public final class C21337a {

    /* renamed from: a */
    private String f103921a;

    /* renamed from: b */
    private int f103922b;

    /* renamed from: c */
    private List f103923c;

    /* renamed from: d */
    private String f103924d;

    /* renamed from: e */
    private String f103925e;

    /* renamed from: f */
    private int f103926f;

    /* renamed from: g */
    private int f103927g;

    /* renamed from: h */
    private int f103928h;

    /* renamed from: i */
    private String f103929i;

    /* renamed from: j */
    private boolean f103930j;

    public C21337a(String str, int i11, List list, String str2, String str3, int i12, int i13, int i14, String str4, boolean z11) {
        AbstractC19074t.m100208f(str, "cmtId");
        AbstractC19074t.m100208f(list, "listLikeContacts");
        AbstractC19074t.m100208f(str2, "feedId");
        AbstractC19074t.m100208f(str3, "picId");
        AbstractC19074t.m100208f(str4, "lastUidLoaded");
        this.f103921a = str;
        this.f103922b = i11;
        this.f103923c = list;
        this.f103924d = str2;
        this.f103925e = str3;
        this.f103926f = i12;
        this.f103927g = i13;
        this.f103928h = i14;
        this.f103929i = str4;
        this.f103930j = z11;
    }

    /* renamed from: c */
    public static /* synthetic */ C21337a m110508c(C21337a c21337a, String str, int i11, List list, String str2, String str3, int i12, int i13, int i14, String str4, boolean z11, int i15, Object obj) {
        return c21337a.m110510b((i15 & 1) != 0 ? c21337a.f103921a : str, (i15 & 2) != 0 ? c21337a.f103922b : i11, (i15 & 4) != 0 ? c21337a.f103923c : list, (i15 & 8) != 0 ? c21337a.f103924d : str2, (i15 & 16) != 0 ? c21337a.f103925e : str3, (i15 & 32) != 0 ? c21337a.f103926f : i12, (i15 & 64) != 0 ? c21337a.f103927g : i13, (i15 & 128) != 0 ? c21337a.f103928h : i14, (i15 & 256) != 0 ? c21337a.f103929i : str4, (i15 & 512) != 0 ? c21337a.f103930j : z11);
    }

    /* renamed from: a */
    public final C21337a m110509a(List list, boolean z11, int i11, String str, int i12) {
        List m131222v0;
        List m131187O0;
        AbstractC19074t.m100208f(list, "newLikeContacts");
        AbstractC19074t.m100208f(str, "lastUid");
        m131222v0 = AbstractC25332a0.m131222v0(this.f103923c, list);
        m131187O0 = AbstractC25332a0.m131187O0(m131222v0);
        return m110508c(this, null, i12, m131187O0, null, null, 0, i11, 0, str, z11, 185, null);
    }

    /* renamed from: b */
    public final C21337a m110510b(String str, int i11, List list, String str2, String str3, int i12, int i13, int i14, String str4, boolean z11) {
        AbstractC19074t.m100208f(str, "cmtId");
        AbstractC19074t.m100208f(list, "listLikeContacts");
        AbstractC19074t.m100208f(str2, "feedId");
        AbstractC19074t.m100208f(str3, "picId");
        AbstractC19074t.m100208f(str4, "lastUidLoaded");
        return new C21337a(str, i11, list, str2, str3, i12, i13, i14, str4, z11);
    }

    /* renamed from: d */
    public final String m110511d() {
        return this.f103921a;
    }

    /* renamed from: e */
    public final String m110512e() {
        return this.f103924d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21337a)) {
            return false;
        }
        C21337a c21337a = (C21337a) obj;
        return AbstractC19074t.m100204b(this.f103921a, c21337a.f103921a) && this.f103922b == c21337a.f103922b && AbstractC19074t.m100204b(this.f103923c, c21337a.f103923c) && AbstractC19074t.m100204b(this.f103924d, c21337a.f103924d) && AbstractC19074t.m100204b(this.f103925e, c21337a.f103925e) && this.f103926f == c21337a.f103926f && this.f103927g == c21337a.f103927g && this.f103928h == c21337a.f103928h && AbstractC19074t.m100204b(this.f103929i, c21337a.f103929i) && this.f103930j == c21337a.f103930j;
    }

    /* renamed from: f */
    public final boolean m110513f() {
        return this.f103930j;
    }

    /* renamed from: g */
    public final String m110514g() {
        return this.f103929i;
    }

    /* renamed from: h */
    public final List m110515h() {
        return this.f103923c;
    }

    public int hashCode() {
        return (((((((((((((((((this.f103921a.hashCode() * 31) + this.f103922b) * 31) + this.f103923c.hashCode()) * 31) + this.f103924d.hashCode()) * 31) + this.f103925e.hashCode()) * 31) + this.f103926f) * 31) + this.f103927g) * 31) + this.f103928h) * 31) + this.f103929i.hashCode()) * 31) + AbstractC2144f.m11520a(this.f103930j);
    }

    /* renamed from: i */
    public final int m110516i() {
        return this.f103926f;
    }

    /* renamed from: j */
    public final int m110517j() {
        return this.f103927g;
    }

    /* renamed from: k */
    public final int m110518k() {
        return this.f103928h;
    }

    /* renamed from: l */
    public final String m110519l() {
        return this.f103925e;
    }

    /* renamed from: m */
    public final int m110520m() {
        return this.f103922b;
    }

    /* renamed from: n */
    public final void m110521n(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103921a = str;
    }

    /* renamed from: o */
    public final void m110522o(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103924d = str;
    }

    /* renamed from: p */
    public final void m110523p(boolean z11) {
        this.f103930j = z11;
    }

    /* renamed from: q */
    public final void m110524q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103929i = str;
    }

    /* renamed from: r */
    public final void m110525r(int i11) {
        this.f103927g = i11;
    }

    /* renamed from: s */
    public final void m110526s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f103925e = str;
    }

    /* renamed from: t */
    public final void m110527t(int i11) {
        this.f103922b = i11;
    }

    public String toString() {
        return "CommentLikeDetailInfo(cmtId=" + this.f103921a + ", totalLike=" + this.f103922b + ", listLikeContacts=" + this.f103923c + ", feedId=" + this.f103924d + ", picId=" + this.f103925e + ", mode=" + this.f103926f + ", page=" + this.f103927g + ", pageSize=" + this.f103928h + ", lastUidLoaded=" + this.f103929i + ", hasMore=" + this.f103930j + ")";
    }

    public /* synthetic */ C21337a(String str, int i11, List list, String str2, String str3, int i12, int i13, int i14, String str4, boolean z11, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? new ArrayList() : list, (i15 & 8) != 0 ? "" : str2, (i15 & 16) == 0 ? str3 : "", (i15 & 32) != 0 ? 1 : i12, (i15 & 64) == 0 ? i13 : 0, (i15 & 128) != 0 ? 200 : i14, (i15 & 256) != 0 ? "0" : str4, (i15 & 512) == 0 ? z11 : true);
    }
}

package iq;

import androidx.work.AbstractC2144f;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.C23212s8;

/* renamed from: iq.q0 */
/* loaded from: classes4.dex */
public final class C20733q0 {

    /* renamed from: a */
    private String f101890a;

    /* renamed from: b */
    private boolean f101891b;

    /* renamed from: c */
    private int f101892c;

    /* renamed from: d */
    private int f101893d;

    /* renamed from: e */
    private int f101894e;

    /* renamed from: f */
    private int f101895f;

    public C20733q0(String str, boolean z11, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(str, "title");
        this.f101890a = str;
        this.f101891b = z11;
        this.f101892c = i11;
        this.f101893d = i12;
        this.f101894e = i13;
        this.f101895f = i14;
    }

    /* renamed from: a */
    public final int m108164a() {
        return this.f101894e;
    }

    /* renamed from: b */
    public final int m108165b() {
        return this.f101895f;
    }

    /* renamed from: c */
    public final int m108166c() {
        return this.f101893d;
    }

    /* renamed from: d */
    public final String m108167d() {
        return this.f101890a;
    }

    /* renamed from: e */
    public final int m108168e() {
        return this.f101892c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20733q0)) {
            return false;
        }
        C20733q0 c20733q0 = (C20733q0) obj;
        return AbstractC19074t.m100204b(this.f101890a, c20733q0.f101890a) && this.f101891b == c20733q0.f101891b && this.f101892c == c20733q0.f101892c && this.f101893d == c20733q0.f101893d && this.f101894e == c20733q0.f101894e && this.f101895f == c20733q0.f101895f;
    }

    /* renamed from: f */
    public final boolean m108169f() {
        return this.f101891b;
    }

    /* renamed from: g */
    public final void m108170g(int i11) {
        this.f101894e = i11;
    }

    /* renamed from: h */
    public final void m108171h(int i11) {
        this.f101895f = i11;
    }

    public int hashCode() {
        return (((((((((this.f101890a.hashCode() * 31) + AbstractC2144f.m11520a(this.f101891b)) * 31) + this.f101892c) * 31) + this.f101893d) * 31) + this.f101894e) * 31) + this.f101895f;
    }

    /* renamed from: i */
    public final void m108172i(int i11) {
        this.f101893d = i11;
    }

    /* renamed from: j */
    public final void m108173j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f101890a = str;
    }

    /* renamed from: k */
    public final void m108174k(int i11) {
        this.f101892c = i11;
    }

    /* renamed from: l */
    public final void m108175l(boolean z11) {
        this.f101891b = z11;
    }

    public String toString() {
        return "ActionBarData(title=" + this.f101890a + ", isVisibleTitle=" + this.f101891b + ", titleColor=" + this.f101892c + ", lineDividerColor=" + this.f101893d + ", backgroundColor=" + this.f101894e + ", colorIcon=" + this.f101895f + ")";
    }

    public /* synthetic */ C20733q0(String str, boolean z11, int i11, int i12, int i13, int i14, int i15, AbstractC19060k abstractC19060k) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? true : z11, (i15 & 4) != 0 ? C23212s8.m119606n(AbstractC2807a.text_01) : i11, (i15 & 8) != 0 ? C23212s8.m119606n(AbstractC2807a.divider_02) : i12, (i15 & 16) != 0 ? C23212s8.m119606n(AbstractC16781w.PrimaryBackgroundColor) : i13, (i15 & 32) != 0 ? C23212s8.m119606n(AbstractC2807a.icon_01) : i14);
    }
}

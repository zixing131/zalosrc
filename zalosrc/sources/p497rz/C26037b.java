package p497rz;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import nz.C23965b;

/* renamed from: rz.b */
/* loaded from: classes4.dex */
public final class C26037b {

    /* renamed from: a */
    private final String f124165a;

    /* renamed from: b */
    private final Integer f124166b;

    /* renamed from: c */
    private final Integer f124167c;

    /* renamed from: d */
    private boolean f124168d;

    /* renamed from: e */
    private String f124169e;

    /* renamed from: f */
    private boolean f124170f;

    /* renamed from: g */
    private C23965b f124171g;

    public C26037b(String str, Integer num, Integer num2, boolean z11, String str2, boolean z12, C23965b c23965b) {
        AbstractC19074t.m100208f(str, "action");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(c23965b, "actionConfig");
        this.f124165a = str;
        this.f124166b = num;
        this.f124167c = num2;
        this.f124168d = z11;
        this.f124169e = str2;
        this.f124170f = z12;
        this.f124171g = c23965b;
    }

    /* renamed from: a */
    public final String m134107a() {
        return this.f124165a;
    }

    /* renamed from: b */
    public final C23965b m134108b() {
        return this.f124171g;
    }

    /* renamed from: c */
    public final Integer m134109c() {
        return this.f124167c;
    }

    /* renamed from: d */
    public final Integer m134110d() {
        return this.f124166b;
    }

    /* renamed from: e */
    public final String m134111e() {
        return this.f124169e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26037b)) {
            return false;
        }
        C26037b c26037b = (C26037b) obj;
        return AbstractC19074t.m100204b(this.f124165a, c26037b.f124165a) && AbstractC19074t.m100204b(this.f124166b, c26037b.f124166b) && AbstractC19074t.m100204b(this.f124167c, c26037b.f124167c) && this.f124168d == c26037b.f124168d && AbstractC19074t.m100204b(this.f124169e, c26037b.f124169e) && this.f124170f == c26037b.f124170f && AbstractC19074t.m100204b(this.f124171g, c26037b.f124171g);
    }

    /* renamed from: f */
    public final boolean m134112f() {
        return this.f124168d;
    }

    /* renamed from: g */
    public final boolean m134113g() {
        return this.f124170f;
    }

    /* renamed from: h */
    public final void m134114h(boolean z11) {
        this.f124170f = z11;
    }

    public int hashCode() {
        int hashCode = this.f124165a.hashCode() * 31;
        Integer num = this.f124166b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f124167c;
        return ((((((((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + AbstractC2144f.m11520a(this.f124168d)) * 31) + this.f124169e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f124170f)) * 31) + this.f124171g.hashCode();
    }

    public String toString() {
        return "ReportActionItemUiState(action=" + this.f124165a + ", iconResId=" + this.f124166b + ", colorResId=" + this.f124167c + ", isBeforeAction=" + this.f124168d + ", title=" + this.f124169e + ", isShowDivider=" + this.f124170f + ", actionConfig=" + this.f124171g + ")";
    }

    public /* synthetic */ C26037b(String str, Integer num, Integer num2, boolean z11, String str2, boolean z12, C23965b c23965b, int i11, AbstractC19060k abstractC19060k) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? false : z12, c23965b);
    }
}

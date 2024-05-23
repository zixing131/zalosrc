package bo;

import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import p559uv.C27373c;

/* renamed from: bo.y2 */
/* loaded from: classes4.dex */
public final class C3061y2 {

    /* renamed from: a */
    private List f12371a;

    /* renamed from: b */
    private C27373c f12372b;

    /* renamed from: c */
    private boolean f12373c;

    /* renamed from: d */
    private boolean f12374d;

    /* renamed from: e */
    private int f12375e;

    public C3061y2(List list, C27373c c27373c) {
        AbstractC19074t.m100208f(list, "listMedia");
        this.f12371a = list;
        this.f12372b = c27373c;
        this.f12373c = true;
        this.f12374d = true;
        this.f12375e = AbstractC23136l9.m118742r(16.0f);
    }

    /* renamed from: a */
    public final boolean m14712a() {
        return this.f12373c;
    }

    /* renamed from: b */
    public final boolean m14713b() {
        return this.f12374d;
    }

    /* renamed from: c */
    public final List m14714c() {
        return this.f12371a;
    }

    /* renamed from: d */
    public final int m14715d() {
        return this.f12375e;
    }

    /* renamed from: e */
    public final C27373c m14716e() {
        return this.f12372b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3061y2)) {
            return false;
        }
        C3061y2 c3061y2 = (C3061y2) obj;
        return AbstractC19074t.m100204b(this.f12371a, c3061y2.f12371a) && AbstractC19074t.m100204b(this.f12372b, c3061y2.f12372b);
    }

    /* renamed from: f */
    public final boolean m14717f() {
        return !this.f12371a.isEmpty();
    }

    /* renamed from: g */
    public final boolean m14718g() {
        return this.f12372b != null;
    }

    /* renamed from: h */
    public final void m14719h(boolean z11) {
        this.f12373c = z11;
    }

    public int hashCode() {
        int hashCode = this.f12371a.hashCode() * 31;
        C27373c c27373c = this.f12372b;
        return hashCode + (c27373c == null ? 0 : c27373c.hashCode());
    }

    /* renamed from: i */
    public final void m14720i(boolean z11) {
        this.f12374d = z11;
    }

    /* renamed from: j */
    public final void m14721j(int i11) {
        this.f12375e = i11;
    }

    public String toString() {
        return "PreviewGridData(listMedia=" + this.f12371a + ", videoInfo=" + this.f12372b + ")";
    }
}

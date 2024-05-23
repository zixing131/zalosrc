package gp;

import bo.C3023p3;
import com.zing.zalo.zmedia.view.C17391z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: gp.b */
/* loaded from: classes4.dex */
public final class C19529b {

    /* renamed from: a */
    private String f96980a;

    /* renamed from: b */
    private C17391z f96981b;

    /* renamed from: c */
    private C3023p3 f96982c;

    public C19529b(String str, C17391z c17391z, C3023p3 c3023p3) {
        AbstractC19074t.m100208f(str, "feedID");
        this.f96980a = str;
        this.f96981b = c17391z;
        this.f96982c = c3023p3;
    }

    /* renamed from: a */
    public final String m102085a() {
        return this.f96980a;
    }

    /* renamed from: b */
    public final C17391z m102086b() {
        return this.f96981b;
    }

    /* renamed from: c */
    public final C3023p3 m102087c() {
        return this.f96982c;
    }

    /* renamed from: d */
    public final void m102088d(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f96980a = str;
    }

    /* renamed from: e */
    public final void m102089e(C17391z c17391z) {
        this.f96981b = c17391z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C19529b)) {
            return false;
        }
        C19529b c19529b = (C19529b) obj;
        if (!AbstractC19074t.m100204b(this.f96980a, c19529b.f96980a) || !AbstractC19074t.m100204b(this.f96981b, c19529b.f96981b) || !AbstractC19074t.m100204b(this.f96982c, c19529b.f96982c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void m102090f(C3023p3 c3023p3) {
        this.f96982c = c3023p3;
    }

    public int hashCode() {
        int i11;
        C3023p3 c3023p3 = this.f96982c;
        int i12 = 0;
        if (c3023p3 != null) {
            i11 = c3023p3.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = i11 * 31;
        C17391z c17391z = this.f96981b;
        if (c17391z != null) {
            i12 = c17391z.hashCode();
        }
        return i13 + i12;
    }

    public /* synthetic */ C19529b(String str, C17391z c17391z, C3023p3 c3023p3, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : c17391z, (i11 & 4) != 0 ? null : c3023p3);
    }
}

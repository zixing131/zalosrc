package p186gj;

import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.LinkedList;
import java.util.List;
import tj.C26710b;

/* renamed from: gj.a */
/* loaded from: classes3.dex */
public final class C19457a {

    /* renamed from: a */
    private final String f96571a;

    /* renamed from: b */
    private final List f96572b;

    /* renamed from: c */
    private final List f96573c;

    /* renamed from: d */
    private boolean f96574d;

    public C19457a(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        this.f96571a = str;
        this.f96572b = new LinkedList();
        this.f96573c = new LinkedList();
    }

    /* renamed from: a */
    public final void m101753a(C17945a0 c17945a0, C26710b c26710b) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(c26710b, "checkDupInfo");
        this.f96572b.add(c17945a0);
        this.f96573c.add(c26710b);
    }

    /* renamed from: b */
    public final List m101754b() {
        return this.f96573c;
    }

    /* renamed from: c */
    public final List m101755c() {
        return this.f96572b;
    }

    /* renamed from: d */
    public final String m101756d() {
        return this.f96571a;
    }

    /* renamed from: e */
    public final boolean m101757e() {
        return this.f96574d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19457a) && AbstractC19074t.m100204b(this.f96571a, ((C19457a) obj).f96571a);
    }

    /* renamed from: f */
    public final void m101758f(boolean z11) {
        this.f96574d = z11;
    }

    public int hashCode() {
        return this.f96571a.hashCode();
    }

    public String toString() {
        return "BatchingMsg(ownerId=" + this.f96571a + ")";
    }
}

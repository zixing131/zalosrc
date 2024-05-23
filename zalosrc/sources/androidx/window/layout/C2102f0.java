package androidx.window.layout;

import fn0.AbstractC19074t;
import java.util.List;
import qm0.AbstractC25332a0;

/* renamed from: androidx.window.layout.f0 */
/* loaded from: classes2.dex */
public final class C2102f0 {

    /* renamed from: a */
    private final List f8972a;

    public C2102f0(List list) {
        AbstractC19074t.m100208f(list, "displayFeatures");
        this.f8972a = list;
    }

    /* renamed from: a */
    public final List m11337a() {
        return this.f8972a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC19074t.m100204b(C2102f0.class, obj.getClass())) {
            return AbstractC19074t.m100204b(this.f8972a, ((C2102f0) obj).f8972a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8972a.hashCode();
    }

    public String toString() {
        String m131214n0;
        m131214n0 = AbstractC25332a0.m131214n0(this.f8972a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
        return m131214n0;
    }
}

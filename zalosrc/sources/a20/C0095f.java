package a20;

import fn0.AbstractC19074t;

/* renamed from: a20.f */
/* loaded from: classes5.dex */
public final class C0095f extends AbstractC0094e {
    @Override // a20.AbstractC0094e
    /* renamed from: a */
    public boolean mo428a(int i11, Object obj, int i12, Object obj2) {
        AbstractC19074t.m100208f(obj, "oldData");
        AbstractC19074t.m100208f(obj2, "newData");
        return true;
    }

    @Override // a20.AbstractC0094e
    /* renamed from: b */
    public boolean mo429b(int i11, Object obj, int i12, Object obj2) {
        AbstractC19074t.m100208f(obj, "oldData");
        AbstractC19074t.m100208f(obj2, "newData");
        if (i11 != i12) {
            return false;
        }
        if (i11 != 0 && i11 != 4) {
            return true;
        }
        return AbstractC19074t.m100204b((String) obj, (String) obj2);
    }
}

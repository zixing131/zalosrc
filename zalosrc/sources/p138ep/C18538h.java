package p138ep;

import bo.C3028q3;
import fn0.AbstractC19074t;
import p399op.AbstractC24389a;

/* renamed from: ep.h */
/* loaded from: classes4.dex */
public final class C18538h extends AbstractC24389a {
    public C18538h() {
        super(0, null, 3, null);
    }

    /* renamed from: A */
    public C3028q3 m97944A(String str) {
        AbstractC19074t.m100208f(str, "zVidId");
        return (C3028q3) get(str);
    }

    /* renamed from: B */
    public void m97945B(String str, C3028q3 c3028q3) {
        AbstractC19074t.m100208f(str, "zVidId");
        AbstractC19074t.m100208f(c3028q3, "redirectInfo");
        put(str, c3028q3);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C3028q3)) {
            return false;
        }
        return m97946z((C3028q3) obj);
    }

    /* renamed from: z */
    public /* bridge */ boolean m97946z(C3028q3 c3028q3) {
        return super.containsValue(c3028q3);
    }
}

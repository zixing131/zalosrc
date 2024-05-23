package p138ep;

import bo.C3023p3;
import fn0.AbstractC19074t;
import p399op.AbstractC24389a;

/* renamed from: ep.d */
/* loaded from: classes4.dex */
public final class C18534d extends AbstractC24389a implements InterfaceC18532b {
    public C18534d() {
        super(0, null, 3, null);
    }

    @Override // p138ep.InterfaceC18532b
    /* renamed from: c */
    public void mo97924c(C3023p3 c3023p3) {
        AbstractC19074t.m100208f(c3023p3, "video");
        put(c3023p3.m14554k(), c3023p3);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C3023p3)) {
            return false;
        }
        return m97927z((C3023p3) obj);
    }

    @Override // p138ep.InterfaceC18532b
    /* renamed from: f */
    public C3023p3 mo97925f(String str) {
        AbstractC19074t.m100208f(str, "zVidId");
        return (C3023p3) get(str);
    }

    /* renamed from: z */
    public /* bridge */ boolean m97927z(C3023p3 c3023p3) {
        return super.containsValue(c3023p3);
    }
}

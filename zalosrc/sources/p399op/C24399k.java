package p399op;

import fn0.AbstractC19074t;
import p426pp.C24902e;

/* renamed from: op.k */
/* loaded from: classes4.dex */
public final class C24399k extends AbstractC24389a implements InterfaceC24392d {
    public C24399k() {
        super(0, null, 3, null);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C24902e)) {
            return false;
        }
        return m127632z((C24902e) obj);
    }

    @Override // p399op.InterfaceC24392d
    /* renamed from: e */
    public C24902e mo127593e(String str) {
        AbstractC19074t.m100208f(str, "songId");
        return (C24902e) get(str);
    }

    @Override // p399op.InterfaceC24392d
    /* renamed from: p */
    public void mo127594p(C24902e c24902e) {
        AbstractC19074t.m100208f(c24902e, "song");
        put(c24902e.m129490f(), c24902e);
    }

    /* renamed from: z */
    public /* bridge */ boolean m127632z(C24902e c24902e) {
        return super.containsValue(c24902e);
    }
}

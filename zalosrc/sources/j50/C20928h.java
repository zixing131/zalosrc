package j50;

import fn0.AbstractC19074t;
import k50.C21475c;
import p399op.AbstractC24389a;

/* renamed from: j50.h */
/* loaded from: classes5.dex */
public final class C20928h extends AbstractC24389a implements InterfaceC20922b {
    public C20928h() {
        super(0, null, 3, null);
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C21475c)) {
            return false;
        }
        return m109457z((C21475c) obj);
    }

    @Override // j50.InterfaceC20922b
    /* renamed from: e */
    public C21475c mo105985e(String str) {
        AbstractC19074t.m100208f(str, "songId");
        return (C21475c) get(str);
    }

    @Override // j50.InterfaceC20922b
    /* renamed from: l */
    public void mo105992l(C21475c c21475c) {
        AbstractC19074t.m100208f(c21475c, "song");
        put(c21475c.m111085b(), c21475c);
    }

    /* renamed from: z */
    public /* bridge */ boolean m109457z(C21475c c21475c) {
        return super.containsValue(c21475c);
    }
}

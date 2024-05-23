package j50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import k50.C21476d;
import p399op.AbstractC24389a;
import p399op.C24401m;
import p399op.InterfaceC24394f;

/* renamed from: j50.j */
/* loaded from: classes5.dex */
public final class C20930j extends AbstractC24389a implements InterfaceC20924d {

    /* renamed from: r */
    private final InterfaceC24394f f102802r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20930j(InterfaceC24394f interfaceC24394f) {
        super(50, null, 2, null);
        AbstractC19074t.m100208f(interfaceC24394f, "musicHelper");
        this.f102802r = interfaceC24394f;
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C21476d)) {
            return false;
        }
        return m109458z((C21476d) obj);
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: d */
    public C21476d mo105984d(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        if (mo105987g(str)) {
            return (C21476d) get(this.f102802r.mo127600d(str));
        }
        return null;
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: g */
    public boolean mo105987g(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        C21476d c21476d = (C21476d) get(this.f102802r.mo127600d(str));
        if (c21476d != null) {
            return c21476d.m111092d();
        }
        return false;
    }

    @Override // j50.InterfaceC20924d
    /* renamed from: u */
    public void mo105996u(C21476d c21476d) {
        AbstractC19074t.m100208f(c21476d, "searchResult");
        put(this.f102802r.mo127600d(c21476d.m111090a()), c21476d);
    }

    /* renamed from: z */
    public /* bridge */ boolean m109458z(C21476d c21476d) {
        return super.containsValue(c21476d);
    }

    public /* synthetic */ C20930j(InterfaceC24394f interfaceC24394f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24401m.f117816a : interfaceC24394f);
    }
}

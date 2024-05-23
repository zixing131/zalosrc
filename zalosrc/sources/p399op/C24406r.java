package p399op;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p426pp.C24899b;

/* renamed from: op.r */
/* loaded from: classes4.dex */
public final class C24406r extends AbstractC24389a implements InterfaceC24396h {

    /* renamed from: r */
    private final InterfaceC24394f f117878r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24406r(InterfaceC24394f interfaceC24394f) {
        super(50, null, 2, null);
        AbstractC19074t.m100208f(interfaceC24394f, "musicHelper");
        this.f117878r = interfaceC24394f;
    }

    @Override // p399op.AbstractC24389a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C24899b)) {
            return false;
        }
        return m127660z((C24899b) obj);
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: d */
    public C24899b mo127605d(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        if (mo127606g(str)) {
            return (C24899b) get(this.f117878r.mo127600d(str));
        }
        return null;
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: g */
    public boolean mo127606g(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        C24899b c24899b = (C24899b) get(this.f117878r.mo127600d(str));
        if (c24899b != null) {
            return c24899b.m129472d();
        }
        return false;
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: k */
    public void mo127607k(C24899b c24899b) {
        AbstractC19074t.m100208f(c24899b, "searchResult");
        put(this.f117878r.mo127600d(c24899b.m129470a()), c24899b);
    }

    /* renamed from: z */
    public /* bridge */ boolean m127660z(C24899b c24899b) {
        return super.containsValue(c24899b);
    }

    public /* synthetic */ C24406r(InterfaceC24394f interfaceC24394f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24401m.f117816a : interfaceC24394f);
    }
}

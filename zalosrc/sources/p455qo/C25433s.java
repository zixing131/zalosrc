package p455qo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20830x0;
import l30.C22013a0;
import l30.C22021e0;
import p185gc.AbstractC19384h;
import p398oo.C24362i;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p688yo.EnumC31036b;

/* renamed from: qo.s */
/* loaded from: classes4.dex */
public final class C25433s extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC24374o f121745a;

    public /* synthetic */ C25433s(InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }

    /* renamed from: c */
    public final boolean m131724c() {
        if (C22013a0.m114928g() && C22013a0.m114925d() == 0 && C20830x0.f102390a.m108863f() > 0 && !C22021e0.m114963p().f108436d && C22013a0.m114930j()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo13388b(EnumC31036b enumC31036b) {
        boolean z11;
        AbstractC19074t.m100208f(enumC31036b, "params");
        C24362i mo127472d = this.f121745a.mo127472d(enumC31036b.m150864c());
        if (!mo127472d.m127411r() && mo127472d.m127412s() && (mo127472d.m127410q() || C20830x0.f102390a.m108867k(enumC31036b) > 0 || (enumC31036b == EnumC31036b.f143137p && m131724c()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public C25433s(InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121745a = interfaceC24374o;
    }
}

package p455qo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p185gc.AbstractC19384h;
import p398oo.C24362i;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p688yo.EnumC31036b;

/* renamed from: qo.b */
/* loaded from: classes4.dex */
public final class C25399b extends AbstractC19384h {

    /* renamed from: a */
    private final InterfaceC24374o f121601a;

    public C25399b(InterfaceC24374o interfaceC24374o) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        this.f121601a = interfaceC24374o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo13388b(EnumC31036b enumC31036b) {
        boolean z11;
        AbstractC19074t.m100208f(enumC31036b, "params");
        C24362i mo127472d = this.f121601a.mo127472d(enumC31036b.m150864c());
        if (!mo127472d.m127411r() && mo127472d.m127412s()) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }

    public /* synthetic */ C25399b(InterfaceC24374o interfaceC24374o, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o);
    }
}

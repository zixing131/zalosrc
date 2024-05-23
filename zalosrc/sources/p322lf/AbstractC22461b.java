package p322lf;

import androidx.core.util.InterfaceC1479a;
import androidx.window.layout.C2102f0;
import androidx.window.layout.InterfaceC2113l;
import androidx.window.layout.InterfaceC2120r;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p227i3.AbstractC20216t;
import qm0.AbstractC25332a0;

/* renamed from: lf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC22461b implements InterfaceC1479a {
    @Override // androidx.core.util.InterfaceC1479a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(C2102f0 c2102f0) {
        Object m131206f0;
        InterfaceC2120r interfaceC2120r;
        AbstractC19074t.m100208f(c2102f0, AbstractC20216t.f99969a);
        m131206f0 = AbstractC25332a0.m131206f0(c2102f0.m11337a());
        InterfaceC2113l interfaceC2113l = (InterfaceC2113l) m131206f0;
        if (interfaceC2113l != null) {
            AbstractC20110a.f98889a.mo104554k("feature: " + interfaceC2113l, new Object[0]);
            if (interfaceC2113l instanceof InterfaceC2120r) {
                interfaceC2120r = (InterfaceC2120r) interfaceC2113l;
            } else {
                interfaceC2120r = null;
            }
            if (interfaceC2120r != null) {
                mo39144b(interfaceC2120r);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo39144b(InterfaceC2120r interfaceC2120r);
}

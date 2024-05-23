package p021an;

import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.uicontrol.C16555a;
import com.zing.zalo.uicontrol.C16629o;
import ei0.InterfaceC18436a;
import ei0.InterfaceC18437b;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import jg0.InterfaceC21251f;
import mn0.InterfaceC23364b;
import p328ln.InterfaceC22531b;
import p483rh.InterfaceC25792a;
import s10.InterfaceC26090a;
import sh.InterfaceC26248a;

/* renamed from: an.a */
/* loaded from: classes3.dex */
public final class C0952a implements InterfaceC0954c {
    @Override // p021an.InterfaceC0954c
    /* renamed from: b */
    public Object mo4494b(InterfaceC23364b interfaceC23364b) {
        AbstractC19074t.m100208f(interfaceC23364b, "cls");
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC25792a.class))) {
            return new C0953b();
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC26248a.class))) {
            C7760a c7760a = C7760a.f41634a;
            AbstractC19074t.m100206d(c7760a, "null cannot be cast to non-null type T of com.zing.zalo.di.AppDependenciesProvider.getDependency");
            return c7760a;
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC21251f.class))) {
            return new C0957f();
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC26090a.class))) {
            C0956e c0956e = C0956e.f3453a;
            AbstractC19074t.m100206d(c0956e, "null cannot be cast to non-null type T of com.zing.zalo.di.AppDependenciesProvider.getDependency");
            return c0956e;
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC22531b.class))) {
            C0960i c0960i = C0960i.f3458a;
            AbstractC19074t.m100206d(c0960i, "null cannot be cast to non-null type T of com.zing.zalo.di.AppDependenciesProvider.getDependency");
            return c0960i;
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC18436a.class))) {
            return new C16555a();
        }
        if (AbstractC19074t.m100204b(interfaceC23364b, AbstractC19061k0.m100169b(InterfaceC18437b.class))) {
            return new C16629o();
        }
        throw new Exception("Update AppDependenciesProvider class to provide your dependency " + interfaceC23364b.mo100163c());
    }
}

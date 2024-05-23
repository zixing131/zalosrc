package gl0;

import fl0.C18990a;
import fl0.C18991b;
import fl0.C18992c;
import fl0.C18993d;
import fl0.C18996g;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.AbstractC20602y;
import ik0.InterfaceC20587j;
import jk0.C21282a;

/* renamed from: gl0.j */
/* loaded from: classes7.dex */
public final class C19488j {

    /* renamed from: a */
    public static final C19488j f96704a = new C19488j();

    /* renamed from: gl0.j$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC20602y {
        a() {
            super(null);
        }
    }

    /* renamed from: gl0.j$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC20602y {
        b(InterfaceC20587j interfaceC20587j) {
            super(interfaceC20587j);
        }
    }

    private C19488j() {
    }

    /* renamed from: a */
    private static final boolean m101905a(C19489k c19489k) {
        AbstractC20601x.b mo107096o = c19489k.m99746a().mo107096o();
        if (mo107096o != null && mo107096o.mo107125j() != 0 && c19489k.m99746a().mo107097p() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static final void m101906b(C19489k c19489k) {
        C18992c c18992c = new C18992c(0, 0, 0, 0, null, 0, null, 0.0f, 0.0f, 0.0f, 0, 2047, null);
        C18990a c18990a = new C18990a(false);
        C18991b c18991b = null;
        new C19485g(new C19482d(c19489k.m101910c(), new C18996g(c18991b, c19489k.m101916i(), c19489k.m101917j(), c19489k.m101915h(), c19489k.m101918k(), c19489k.m101914g(), new C18993d(c19489k.m101911d(), null, 2, null), 1, null), c18992c, c18990a, new a(), new C19486h(c19489k.m101912e()), new C19487i(c19489k.m101913f()), c19489k.m99746a())).m101901b();
    }

    /* renamed from: c */
    private static final void m101907c(C19489k c19489k) {
        c19489k.m99746a().mo107096o();
        c19489k.m99746a().mo107097p();
        AbstractC20601x.b mo107096o = c19489k.m99746a().mo107096o();
        AbstractC19074t.m100206d(mo107096o, "null cannot be cast to non-null type com.zing.zalo.zinstant.loader.ZinstantRequest.Target");
        C21282a mo107097p = c19489k.m99746a().mo107097p();
        AbstractC19074t.m100206d(mo107097p, "null cannot be cast to non-null type com.zing.zalo.zinstant.loader.layout.TargetDevice");
        C18992c c18992c = new C18992c(mo107096o.mo107125j(), mo107096o.mo107117b(), mo107096o.mo107121f(), mo107096o.mo107122g(), mo107096o.mo107119d(), mo107096o.mo107124i(), mo107096o.mo107118c(), mo107097p.m110232c(), mo107097p.m110234e(), mo107097p.m110233d(), mo107097p.m110231a());
        C18990a c18990a = new C18990a(false);
        C18991b c18991b = null;
        new C19485g(new C19482d(c19489k.m101910c(), new C18996g(c18991b, c19489k.m101916i(), c19489k.m101917j(), c19489k.m101915h(), c19489k.m101918k(), c19489k.m101914g(), new C18993d(c19489k.m101911d(), null, 2, null), 1, null), c18992c, c18990a, new b(c19489k.m101909b()), new C19486h(c19489k.m101912e()), null, c19489k.m99746a(), 64, null)).m101900a();
    }

    /* renamed from: d */
    public static final void m101908d(C19489k c19489k) {
        AbstractC19074t.m100208f(c19489k, "info");
        if (m101905a(c19489k)) {
            m101906b(c19489k);
        } else {
            m101907c(c19489k);
        }
    }
}

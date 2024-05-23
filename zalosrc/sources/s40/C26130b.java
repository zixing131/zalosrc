package s40;

import ac.C0732w;
import ch0.AbstractC3489d;
import fn0.AbstractC19074t;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19966e;

/* renamed from: s40.b */
/* loaded from: classes5.dex */
public final class C26130b extends AbstractC19962a implements InterfaceC19966e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26130b(InterfaceC26129a interfaceC26129a) {
        super(interfaceC26129a);
        AbstractC19074t.m100208f(interfaceC26129a, "mvpView");
    }

    /* renamed from: Ip */
    public void m134495Ip() {
        String str;
        C0732w m1189a = C0732w.Companion.m1189a();
        if (AbstractC3489d.m17514v()) {
            str = "zcloud_restore_select_64key";
        } else {
            str = "restore_bk_pick_pw_type_64key";
        }
        C0732w.m1177r(m1189a, str, null, null, null, 14, null);
        ((InterfaceC26129a) m103742Dp()).mo57775w2();
    }

    /* renamed from: Jp */
    public void m134496Jp() {
        String str;
        C0732w m1189a = C0732w.Companion.m1189a();
        if (AbstractC3489d.m17514v()) {
            str = "zcloud_restore_select_pin";
        } else {
            str = "restore_bk_pick_pw_type_pin";
        }
        C0732w.m1177r(m1189a, str, null, null, null, 14, null);
        ((InterfaceC26129a) m103742Dp()).mo57774h4();
    }
}

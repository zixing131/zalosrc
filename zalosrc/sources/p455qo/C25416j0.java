package p455qo;

import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3034s;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.j0 */
/* loaded from: classes4.dex */
public final class C25416j0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121674a;

    public C25416j0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121674a = c24371m0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(C3034s c3034s) {
        List<C3020p0> list;
        C3025q0 c3025q0;
        AbstractC19074t.m100208f(c3034s, "params");
        for (C3000l0 c3000l0 : this.f121674a.m127477m()) {
            if (c3000l0.f11893p == 2) {
                int m14588a = c3034s.m14588a();
                if (m14588a != 0) {
                    if (m14588a == 1 && (list = c3000l0.f11899s) != null) {
                        for (C3020p0 c3020p0 : list) {
                            if (c3020p0 != null) {
                                c3025q0 = c3020p0.f12023C;
                            } else {
                                c3025q0 = null;
                            }
                            if (c3025q0 != null && c3025q0.f12096E == c3034s.m14589b()) {
                                c3000l0.m14298H1();
                            }
                        }
                    }
                } else {
                    c3000l0.m14298H1();
                }
            }
        }
    }

    public /* synthetic */ C25416j0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}

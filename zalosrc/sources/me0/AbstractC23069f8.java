package me0;

import dj.C17945a0;
import dj.C17949b1;
import java.util.List;
import p105dn.EnumC18030a;
import p471r3.C25630b;
import p588vw.C28644j;
import p647xj.C29675a;
import tj.C26712d;
import tj.C26713e;

/* renamed from: me0.f8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23069f8 {
    /* renamed from: a */
    public static boolean m118371a(C17945a0 c17945a0, EnumC18030a enumC18030a, C29675a c29675a) {
        C25630b m95397g;
        boolean z11;
        if (!c17945a0.m95110d8() || (m95397g = ((C17949b1) c17945a0.m94929K2()).m95397g()) == null) {
            return false;
        }
        C25630b m143290W = C28644j.m143233Y().m143290W(m95397g.m132429g() + "");
        if (m143290W.m132427f() >= 0) {
            m95397g = m143290W;
        }
        if (c29675a != null && c29675a.m147602c(m95397g.m132429g(), enumC18030a)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!m95397g.m132399G() && !m118372b(c17945a0, c17945a0.m95071Z3()) && ((!c17945a0.m94987Q7() || !z11) && !C25630b.m132391I(m95397g))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m118372b(C17945a0 c17945a0, C26713e c26713e) {
        if (c26713e != null && c26713e.m137362g() && !c26713e.m137358c().isEmpty()) {
            List m137358c = c26713e.m137358c();
            for (int i11 = 0; i11 < m137358c.size(); i11++) {
                C26712d c26712d = (C26712d) m137358c.get(i11);
                if (c26712d.m137348p() && AbstractC23214t.m119615b(c17945a0, c26712d) && c26712d.m137347o()) {
                    return true;
                }
                if (i11 == 0 && c26712d.m137344l() == 0) {
                    break;
                }
            }
        }
        return false;
    }
}

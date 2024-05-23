package wa0;

import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import dj.C17945a0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p348mi.AbstractC23306f;
import p487rl.C25821b;

/* renamed from: wa0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC28862a {
    /* renamed from: a */
    public static final List m144302a(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        ArrayList<C13380a> arrayList = new ArrayList();
        for (Object obj : list) {
            C13380a c13380a = (C13380a) obj;
            if (c13380a.m75089k() != null || c13380a.m75082d() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C13380a c13380a2 : arrayList) {
            C17945a0 m75089k = c13380a2.m75089k();
            if (m75089k == null) {
                C25821b m75082d = c13380a2.m75082d();
                if (m75082d != null) {
                    m75089k = AbstractC23306f.m120584H0().m2635r(m75082d.m133146i());
                    if (m75089k == null) {
                        C17945a0.w wVar = new C17945a0.w(m75082d.m133146i(), m75082d.m133147j());
                        wVar.m95359K(m75082d.m133150m());
                        C17945a0 m95365a = wVar.m95365a();
                        AbstractC19074t.m100207e(m95365a, "build(...)");
                        m75089k = m95365a;
                    }
                } else {
                    m75089k = null;
                }
            }
            if (m75089k != null) {
                arrayList2.add(m75089k);
            }
        }
        return arrayList2;
    }
}

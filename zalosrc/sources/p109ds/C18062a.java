package p109ds;

import bo.C3051w0;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p109ds.C18064c;
import p348mi.AbstractC23304d;
import p691yr.C31060j;
import p691yr.C31063m;
import p726zr.C32546b;
import qm0.AbstractC25332a0;

/* renamed from: ds.a */
/* loaded from: classes4.dex */
public final class C18062a {
    /* renamed from: c */
    public static /* synthetic */ List m96025c(C18062a c18062a, boolean z11, int i11, C3051w0 c3051w0, C32546b c32546b, C31063m.a aVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            aVar = C31063m.a.f143215u;
        }
        return c18062a.m96027b(z11, i11, c3051w0, c32546b, aVar);
    }

    /* renamed from: a */
    public final List m96026a(boolean z11, int i11, C3051w0 c3051w0, C32546b c32546b) {
        return m96025c(this, z11, i11, c3051w0, c32546b, null, 16, null);
    }

    /* renamed from: b */
    public final List m96027b(boolean z11, int i11, C3051w0 c3051w0, C32546b c32546b, C31063m.a aVar) {
        boolean z12;
        List m131179G0;
        List m157606b;
        ContactProfile contactProfile;
        Object m131205e0;
        AbstractC19074t.m100208f(aVar, "viewMode");
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        if (aVar != C31063m.a.f143214t && aVar != C31063m.a.f143212r) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c3051w0 != null && c3051w0.m14637a() && z12) {
            List list = c3051w0.f12301a;
            AbstractC19074t.m100207e(list, "recentlyLikeUser");
            m131205e0 = AbstractC25332a0.m131205e0(list);
            AbstractC19074t.m100207e(m131205e0, "first(...)");
            arrayList.add(new C18064c.f((ContactProfile) m131205e0, aVar));
        }
        if (z11 && i11 == 1) {
            z13 = true;
        }
        if (arrayList.isEmpty() && (contactProfile = AbstractC23304d.f113368c0) != null && z13 && z12) {
            AbstractC19074t.m100207e(contactProfile, "userInfo");
            arrayList.add(new C18064c.f(contactProfile, aVar));
        }
        ArrayList arrayList2 = new ArrayList();
        if (c32546b != null && (m157606b = c32546b.m157606b()) != null) {
            Iterator it = m157606b.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C18064c.g(((Number) it.next()).intValue(), aVar));
            }
        }
        m131179G0 = AbstractC25332a0.m131179G0(arrayList2, C31060j.f143193a.m150946u());
        arrayList.addAll(m131179G0);
        return arrayList;
    }
}

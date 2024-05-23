package c50;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.AbstractC21317c;
import jn0.AbstractC21318d;
import ln0.C22534c;
import ln0.C22537f;
import qm0.AbstractC25332a0;
import qm0.AbstractC25351j0;
import qm0.AbstractC25370t;

/* renamed from: c50.d */
/* loaded from: classes5.dex */
public final class C3293d {

    /* renamed from: a */
    public static final C3293d f14092a = new C3293d();

    /* renamed from: c50.d$a */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14093a;

        static {
            int[] iArr = new int[EnumC3292c.values().length];
            try {
                iArr[EnumC3292c.f14089p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14093a = iArr;
        }
    }

    private C3293d() {
    }

    /* renamed from: a */
    public final String m16712a(EnumC3292c enumC3292c) {
        List m131221u0;
        int m131511r;
        String m131214n0;
        AbstractC19074t.m100208f(enumC3292c, "mode");
        m131221u0 = AbstractC25332a0.m131221u0(new C22534c('A', 'F'), new C22534c('0', '9'));
        AbstractC21317c m110381a = AbstractC21318d.m110381a(System.currentTimeMillis());
        if (a.f14093a[enumC3292c.ordinal()] == 1) {
            C22537f c22537f = new C22537f(1, 64);
            m131511r = AbstractC25370t.m131511r(c22537f, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = c22537f.iterator();
            while (it.hasNext()) {
                ((AbstractC25351j0) it).mo116552a();
                arrayList.add(Character.valueOf(((Character) m131221u0.get(m110381a.mo110373e(m131221u0.size()))).charValue()));
            }
            m131214n0 = AbstractC25332a0.m131214n0(arrayList, "", null, null, 0, null, null, 62, null);
            return m131214n0;
        }
        return "";
    }
}

package ag0;

import ag0.AbstractC0840r;
import com.androidquery.util.AbstractC3987t;
import hu.C20131e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p379o3.AbstractC24006q;
import p471r3.C25630b;
import p588vw.C28644j;

/* renamed from: ag0.q */
/* loaded from: classes6.dex */
public class C0838q extends AbstractC0840r {
    public C0838q(AbstractC0840r.j jVar, Object obj) {
        super(jVar, obj);
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: r */
    protected void mo2216r() {
        List list = ((List[]) this.f2963b.f2981a)[0];
        this.f2962a = "";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f2962a += ((C25630b) it.next()).m132429g() + "_";
        }
    }

    /* renamed from: u */
    void m2244u(HashMap hashMap) {
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0840r.j jVar = (AbstractC0840r.j) hashMap.get(it.next());
                if (jVar != null) {
                    jVar.mo2269a();
                }
            }
        }
    }

    /* renamed from: v */
    void m2245v(HashMap hashMap, List list) {
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0840r.j jVar = (AbstractC0840r.j) hashMap.get(it.next());
                if (jVar != null && (jVar instanceof AbstractC0840r.f)) {
                    ((AbstractC0840r.f) jVar).mo2266c(list);
                }
            }
        }
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: w */
    public Void mo2215f(List... listArr) {
        try {
            List<C25630b> list = listArr[0];
            ArrayList arrayList = new ArrayList();
            String m104942a0 = C20131e.f99303a.m104942a0();
            for (C25630b c25630b : list) {
                C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
                if (m143290W.m132427f() != -1) {
                    arrayList.add(m143290W);
                } else {
                    c25630b.m132419b(C28644j.m143232X(), C28644j.m143248i0());
                    if (c25630b.m132427f() == -1) {
                        c25630b.m132404N(c25630b.m132432j());
                    }
                    if (c25630b.m132432j() > 0) {
                        c25630b.m132407Q("");
                    }
                    c25630b.m132411U((m104942a0 + c25630b.m132432j() + "/") + c25630b.m132429g() + ".amr");
                    AbstractC24006q.m125840K1(c25630b.m132446x());
                    AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
                    C28644j.m143233Y().m143297a1(c25630b);
                    arrayList.add(c25630b);
                }
            }
            m2245v(m2257l(), arrayList);
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            m2244u(m2257l());
            return null;
        }
    }
}

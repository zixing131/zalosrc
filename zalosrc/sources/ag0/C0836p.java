package ag0;

import ag0.AbstractC0840r;
import com.androidquery.util.AbstractC3987t;
import hu.C20131e;
import java.util.HashMap;
import java.util.Iterator;
import p379o3.AbstractC24006q;
import p471r3.C25630b;
import p588vw.C28644j;

/* renamed from: ag0.p */
/* loaded from: classes6.dex */
public class C0836p extends AbstractC0840r {
    public C0836p(AbstractC0840r.e eVar, Object obj) {
        super(eVar, obj);
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: r */
    protected void mo2216r() {
        C25630b c25630b = ((C25630b[]) this.f2963b.f2981a)[0];
        this.f2962a = c25630b.m132427f() + "_" + c25630b.m132429g();
    }

    /* renamed from: u */
    void m2217u(HashMap hashMap) {
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
    void m2218v(HashMap hashMap, C25630b c25630b) {
        if (hashMap != null) {
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0840r.j jVar = (AbstractC0840r.j) hashMap.get(it.next());
                if (jVar != null && (jVar instanceof AbstractC0840r.e)) {
                    ((AbstractC0840r.e) jVar).mo2265c(c25630b);
                }
            }
        }
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: w */
    public Void mo2215f(C25630b... c25630bArr) {
        try {
            C25630b c25630b = c25630bArr[0];
            C25630b m143290W = C28644j.m143233Y().m143290W(c25630b.m132429g() + "");
            if (m143290W.m132427f() != -1) {
                m2218v(m2257l(), m143290W);
                return null;
            }
            c25630b.m132419b(C28644j.m143232X(), C28644j.m143248i0());
            if (c25630b.m132427f() == -1) {
                c25630b.m132404N(c25630b.m132432j());
            }
            if (c25630b.m132432j() > 0) {
                c25630b.m132407Q("");
            }
            c25630b.m132411U((C20131e.f99303a.m104942a0() + c25630b.m132432j() + "/") + c25630b.m132429g() + ".amr");
            AbstractC24006q.m125840K1(c25630b.m132446x());
            AbstractC3987t.m18881d(c25630b.m132436n(), c25630b);
            C28644j.m143233Y().m143297a1(c25630b);
            m2218v(m2257l(), c25630b);
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            m2217u(m2257l());
            return null;
        }
    }
}

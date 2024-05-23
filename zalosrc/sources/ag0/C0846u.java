package ag0;

import ag0.AbstractC0840r;
import c30.C3245i;
import java.util.HashMap;
import java.util.Iterator;
import p588vw.C28644j;

/* renamed from: ag0.u */
/* loaded from: classes6.dex */
public class C0846u extends AbstractC0840r {
    public C0846u(AbstractC0840r.j jVar, Object obj) {
        super(jVar, obj);
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: r */
    protected void mo2216r() {
        StringBuilder sb2 = new StringBuilder();
        int length = ((C3245i[]) this.f2963b.f2981a).length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(((C3245i[]) this.f2963b.f2981a)[i11].f13854b);
            sb2.append(" ");
        }
        this.f2962a = sb2.toString();
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: u */
    public Void mo2215f(C3245i... c3245iArr) {
        for (C3245i c3245i : c3245iArr) {
            C28644j.m143233Y().m143279K0(c3245i);
        }
        HashMap m2257l = m2257l();
        if (m2257l != null) {
            Iterator it = m2257l.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0840r.j jVar = (AbstractC0840r.j) m2257l.get(it.next());
                if (jVar != null) {
                    jVar.mo2270b();
                }
            }
            return null;
        }
        return null;
    }
}

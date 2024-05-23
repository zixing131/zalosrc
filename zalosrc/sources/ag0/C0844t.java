package ag0;

import ag0.AbstractC0840r;
import java.util.HashMap;
import java.util.Iterator;
import p588vw.C28644j;

/* renamed from: ag0.t */
/* loaded from: classes6.dex */
public class C0844t extends AbstractC0840r {
    public C0844t(AbstractC0840r.j jVar, Object obj) {
        super(jVar, obj);
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: r */
    protected void mo2216r() {
        StringBuilder sb2 = new StringBuilder();
        int length = ((String[]) this.f2963b.f2981a).length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(((String[]) this.f2963b.f2981a)[i11]);
            sb2.append(" ");
        }
        this.f2962a = sb2.toString();
    }

    @Override // ag0.AbstractC0840r
    /* renamed from: u */
    public Void mo2215f(String... strArr) {
        for (String str : strArr) {
            int parseInt = Integer.parseInt(str);
            if (!C28644j.m143233Y().m143278K(parseInt)) {
                C28644j.m143233Y().m143277J0(parseInt);
            }
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

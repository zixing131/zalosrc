package p596w3;

import java.util.List;
import p516t3.C26467a;
import p566v3.C27502j;
import p566v3.C27505m;
import p631x3.AbstractC29305f;

/* renamed from: w3.h */
/* loaded from: classes2.dex */
public class C28710h extends AbstractC28708f {
    private C28710h(List list, float[][][] fArr) {
        super(list, fArr);
    }

    /* renamed from: e */
    public static C28710h m143784e(C27502j c27502j) {
        return new C28710h(c27502j.m140621g(), c27502j.m140626l());
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27505m c27505m, C27505m c27505m2, float f11, C26467a c26467a) {
        if (c27505m2 != null && f11 != 0.0f) {
            C27505m.b m140636b = c27505m.m140636b();
            C27505m.b m140636b2 = c27505m2.m140636b();
            int size = m140636b.m140639b().size();
            for (int i11 = 0; i11 < size; i11++) {
                ((AbstractC29305f) m140636b.m140639b().get(i11)).mo146412h((AbstractC29305f) m140636b2.m140639b().get(i11), f11, c26467a);
            }
            return;
        }
        c27505m.m140636b().m140638a(c26467a);
    }

    public C28710h(C28710h c28710h) {
        super(c28710h);
    }
}

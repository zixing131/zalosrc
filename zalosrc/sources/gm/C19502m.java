package gm;

import fm.AbstractC19014q;
import fm.AbstractC19015r;
import java.util.Iterator;
import java.util.Vector;
import p602w9.C28825a;

/* renamed from: gm.m */
/* loaded from: classes3.dex */
public class C19502m {

    /* renamed from: a */
    Vector f96833a = new Vector();

    /* renamed from: a */
    public void m101950a(C19501l c19501l) {
        this.f96833a.add(c19501l);
    }

    /* renamed from: b */
    public byte[] m101951b() {
        C28825a c28825a = new C28825a(1024);
        Vector vector = new Vector();
        Iterator it = this.f96833a.iterator();
        while (it.hasNext()) {
            C19501l c19501l = (C19501l) it.next();
            vector.add(Integer.valueOf(AbstractC19014q.m100013m(c28825a, c19501l.f96829b, c19501l.f96828a, c19501l.f96830c, c28825a.mo101957o(c19501l.f96832e), c19501l.f96831d)));
        }
        int[] iArr = new int[vector.size()];
        for (int i11 = 0; i11 < vector.size(); i11++) {
            iArr[i11] = ((Integer) vector.get(i11)).intValue();
        }
        c28825a.m144103r(AbstractC19015r.m100017j(c28825a, AbstractC19015r.m100016i(c28825a, iArr)));
        return c28825a.m144082F();
    }
}

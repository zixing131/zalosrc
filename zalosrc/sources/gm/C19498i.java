package gm;

import fm.AbstractC19005h;
import fm.AbstractC19020w;
import java.util.Iterator;
import java.util.Vector;
import p602w9.C28825a;

/* renamed from: gm.i */
/* loaded from: classes3.dex */
public class C19498i {

    /* renamed from: a */
    Vector f96815a = new Vector();

    /* renamed from: a */
    public void m101942a(C19497h c19497h) {
        this.f96815a.add(c19497h);
    }

    /* renamed from: b */
    public C19497h m101943b(int i11) {
        return (C19497h) this.f96815a.get(i11);
    }

    /* renamed from: c */
    public int m101944c() {
        Vector vector = this.f96815a;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    /* renamed from: d */
    public byte[] m101945d() {
        C28825a c28825a = new C28825a(1024);
        Vector vector = new Vector();
        Iterator it = this.f96815a.iterator();
        while (it.hasNext()) {
            C19497h c19497h = (C19497h) it.next();
            vector.add(Integer.valueOf(AbstractC19005h.m99912k(c28825a, c19497h.f96812a, c19497h.f96813b, c19497h.f96814c)));
        }
        int[] iArr = new int[vector.size()];
        for (int i11 = 0; i11 < vector.size(); i11++) {
            iArr[i11] = ((Integer) vector.get(i11)).intValue();
        }
        c28825a.m144103r(AbstractC19020w.m100054j(c28825a, AbstractC19020w.m100053i(c28825a, iArr)));
        return c28825a.m144082F();
    }
}

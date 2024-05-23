package gm;

import fm.AbstractC18999b;
import fm.AbstractC19018u;
import java.util.Iterator;
import java.util.Vector;
import p602w9.C28825a;

/* renamed from: gm.e */
/* loaded from: classes3.dex */
public class C19494e {

    /* renamed from: a */
    Vector f96798a = new Vector();

    /* renamed from: gm.e$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f96799a = "";

        /* renamed from: b */
        public long f96800b;

        /* renamed from: c */
        public byte f96801c;
    }

    /* renamed from: a */
    public void m101935a(a aVar) {
        this.f96798a.add(aVar);
    }

    /* renamed from: b */
    public byte[] m101936b() {
        C28825a c28825a = new C28825a(1024);
        Vector vector = new Vector();
        Iterator it = this.f96798a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            vector.add(Integer.valueOf(AbstractC18999b.m99819k(c28825a, c28825a.mo101957o(aVar.f96799a), aVar.f96800b, aVar.f96801c)));
        }
        int[] iArr = new int[vector.size()];
        for (int i11 = 0; i11 < vector.size(); i11++) {
            iArr[i11] = ((Integer) vector.get(i11)).intValue();
        }
        c28825a.m144103r(AbstractC19018u.m100043j(c28825a, AbstractC19018u.m100042i(c28825a, iArr)));
        return c28825a.m144082F();
    }
}

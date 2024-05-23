package gm;

import fm.AbstractC19010m;
import fm.AbstractC19021x;
import java.util.Iterator;
import java.util.Vector;
import p602w9.C28825a;

/* renamed from: gm.j */
/* loaded from: classes3.dex */
public class C19499j {

    /* renamed from: a */
    Vector f96816a = new Vector();

    /* renamed from: gm.j$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f96817a;

        /* renamed from: b */
        public String f96818b;
    }

    /* renamed from: a */
    public void m101946a(a aVar) {
        this.f96816a.add(aVar);
    }

    /* renamed from: b */
    public byte[] m101947b() {
        int i11;
        C28825a c28825a = new C28825a(1024);
        Vector vector = new Vector();
        Iterator it = this.f96816a.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            a aVar = (a) it.next();
            int mo101957o = c28825a.mo101957o(aVar.f96817a);
            String str = aVar.f96818b;
            if (str != null) {
                i11 = c28825a.mo101957o(str);
            }
            vector.add(Integer.valueOf(AbstractC19010m.m99976j(c28825a, mo101957o, i11)));
        }
        int[] iArr = new int[vector.size()];
        while (i11 < vector.size()) {
            iArr[i11] = ((Integer) vector.get(i11)).intValue();
            i11++;
        }
        c28825a.m144103r(AbstractC19021x.m100058j(c28825a, AbstractC19021x.m100057i(c28825a, iArr)));
        return c28825a.m144082F();
    }
}

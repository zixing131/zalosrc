package p088d1;

import java.util.ArrayList;
import java.util.Iterator;
import p045c1.C3182a;
import p045c1.C3185d;
import p045c1.C3186e;
import p045c1.C3187f;
import p045c1.C3188g;
import p045c1.C3189h;
import p045c1.C3191j;
import p088d1.C17693b;

/* renamed from: d1.i */
/* loaded from: classes2.dex */
public abstract class AbstractC17700i {
    /* renamed from: a */
    public static C17706o m93748a(C3186e c3186e, int i11, ArrayList arrayList, C17706o c17706o) {
        int i12;
        int m16239v1;
        if (i11 == 0) {
            i12 = c3186e.f13511R0;
        } else {
            i12 = c3186e.f13513S0;
        }
        int i13 = 0;
        if (i12 != -1 && (c17706o == null || i12 != c17706o.f89763b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                C17706o c17706o2 = (C17706o) arrayList.get(i14);
                if (c17706o2.m93765c() == i12) {
                    if (c17706o != null) {
                        c17706o.m93768g(i11, c17706o2);
                        arrayList.remove(c17706o);
                    }
                    c17706o = c17706o2;
                } else {
                    i14++;
                }
            }
        } else if (i12 != -1) {
            return c17706o;
        }
        if (c17706o == null) {
            if ((c3186e instanceof C3191j) && (m16239v1 = ((C3191j) c3186e).m16239v1(i11)) != -1) {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        break;
                    }
                    C17706o c17706o3 = (C17706o) arrayList.get(i15);
                    if (c17706o3.m93765c() == m16239v1) {
                        c17706o = c17706o3;
                        break;
                    }
                    i15++;
                }
            }
            if (c17706o == null) {
                c17706o = new C17706o(i11);
            }
            arrayList.add(c17706o);
        }
        if (c17706o.m93763a(c3186e)) {
            if (c3186e instanceof C3189h) {
                C3189h c3189h = (C3189h) c3186e;
                C3185d m16229u1 = c3189h.m16229u1();
                if (c3189h.m16230v1() == 0) {
                    i13 = 1;
                }
                m16229u1.m16000c(i13, arrayList, c17706o);
            }
            if (i11 == 0) {
                c3186e.f13511R0 = c17706o.m93765c();
                c3186e.f13508Q.m16000c(i11, arrayList, c17706o);
                c3186e.f13512S.m16000c(i11, arrayList, c17706o);
            } else {
                c3186e.f13513S0 = c17706o.m93765c();
                c3186e.f13510R.m16000c(i11, arrayList, c17706o);
                c3186e.f13515U.m16000c(i11, arrayList, c17706o);
                c3186e.f13514T.m16000c(i11, arrayList, c17706o);
            }
            c3186e.f13518X.m16000c(i11, arrayList, c17706o);
        }
        return c17706o;
    }

    /* renamed from: b */
    private static C17706o m93749b(ArrayList arrayList, int i11) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            C17706o c17706o = (C17706o) arrayList.get(i12);
            if (i11 == c17706o.f89763b) {
                return c17706o;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038d  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m93750c(C3187f c3187f, C17693b.b bVar) {
        C17706o c17706o;
        C17706o c17706o2;
        ArrayList m16264u1 = c3187f.m16264u1();
        int size = m16264u1.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C3186e c3186e = (C3186e) m16264u1.get(i12);
            if (!m93751d(c3187f.m16029C(), c3187f.m16064V(), c3186e.m16029C(), c3186e.m16064V()) || (c3186e instanceof C3188g)) {
                return false;
            }
        }
        int i13 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i13 < size) {
            C3186e c3186e2 = (C3186e) m16264u1.get(i13);
            if (!m93751d(c3187f.m16029C(), c3187f.m16064V(), c3186e2.m16029C(), c3186e2.m16064V())) {
                C3187f.m16139V1(i11, c3186e2, bVar, c3187f.f13609y1, C17693b.a.f89699k);
            }
            boolean z11 = c3186e2 instanceof C3189h;
            if (z11) {
                C3189h c3189h = (C3189h) c3186e2;
                if (c3189h.m16230v1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c3189h);
                }
                if (c3189h.m16230v1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c3189h);
                }
            }
            if (c3186e2 instanceof C3191j) {
                if (c3186e2 instanceof C3182a) {
                    C3182a c3182a = (C3182a) c3186e2;
                    if (c3182a.m15979A1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c3182a);
                    }
                    if (c3182a.m15979A1() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c3182a);
                    }
                } else {
                    C3191j c3191j = (C3191j) c3186e2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c3191j);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c3191j);
                }
            }
            if (c3186e2.f13508Q.f13460f == null && c3186e2.f13512S.f13460f == null && !z11 && !(c3186e2 instanceof C3182a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(c3186e2);
            }
            if (c3186e2.f13510R.f13460f == null && c3186e2.f13514T.f13460f == null && c3186e2.f13515U.f13460f == null && !z11 && !(c3186e2 instanceof C3182a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c3186e2);
            }
            i13++;
            i11 = 0;
        }
        ArrayList arrayList7 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m93748a((C3189h) it.next(), 0, arrayList7, null);
            }
        }
        int i14 = 0;
        C17706o c17706o3 = null;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C3191j c3191j2 = (C3191j) it2.next();
                C17706o m93748a = m93748a(c3191j2, i14, arrayList7, c17706o3);
                c3191j2.m16238u1(arrayList7, i14, m93748a);
                m93748a.m93764b(arrayList7);
                i14 = 0;
                c17706o3 = null;
            }
        }
        C3185d mo16112q = c3187f.mo16112q(C3185d.b.LEFT);
        if (mo16112q.m16001d() != null) {
            Iterator it3 = mo16112q.m16001d().iterator();
            while (it3.hasNext()) {
                m93748a(((C3185d) it3.next()).f13458d, 0, arrayList7, null);
            }
        }
        C3185d mo16112q2 = c3187f.mo16112q(C3185d.b.RIGHT);
        if (mo16112q2.m16001d() != null) {
            Iterator it4 = mo16112q2.m16001d().iterator();
            while (it4.hasNext()) {
                m93748a(((C3185d) it4.next()).f13458d, 0, arrayList7, null);
            }
        }
        C3185d mo16112q3 = c3187f.mo16112q(C3185d.b.CENTER);
        if (mo16112q3.m16001d() != null) {
            Iterator it5 = mo16112q3.m16001d().iterator();
            while (it5.hasNext()) {
                m93748a(((C3185d) it5.next()).f13458d, 0, arrayList7, null);
            }
        }
        C17706o c17706o4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                m93748a((C3186e) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                m93748a((C3189h) it7.next(), 1, arrayList7, null);
            }
        }
        int i15 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                C3191j c3191j3 = (C3191j) it8.next();
                C17706o m93748a2 = m93748a(c3191j3, i15, arrayList7, c17706o4);
                c3191j3.m16238u1(arrayList7, i15, m93748a2);
                m93748a2.m93764b(arrayList7);
                i15 = 1;
                c17706o4 = null;
            }
        }
        C3185d mo16112q4 = c3187f.mo16112q(C3185d.b.TOP);
        if (mo16112q4.m16001d() != null) {
            Iterator it9 = mo16112q4.m16001d().iterator();
            while (it9.hasNext()) {
                m93748a(((C3185d) it9.next()).f13458d, 1, arrayList7, null);
            }
        }
        C3185d mo16112q5 = c3187f.mo16112q(C3185d.b.BASELINE);
        if (mo16112q5.m16001d() != null) {
            Iterator it10 = mo16112q5.m16001d().iterator();
            while (it10.hasNext()) {
                m93748a(((C3185d) it10.next()).f13458d, 1, arrayList7, null);
            }
        }
        C3185d mo16112q6 = c3187f.mo16112q(C3185d.b.BOTTOM);
        if (mo16112q6.m16001d() != null) {
            Iterator it11 = mo16112q6.m16001d().iterator();
            while (it11.hasNext()) {
                m93748a(((C3185d) it11.next()).f13458d, 1, arrayList7, null);
            }
        }
        C3185d mo16112q7 = c3187f.mo16112q(C3185d.b.CENTER);
        if (mo16112q7.m16001d() != null) {
            Iterator it12 = mo16112q7.m16001d().iterator();
            while (it12.hasNext()) {
                m93748a(((C3185d) it12.next()).f13458d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                m93748a((C3186e) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i16 = 0; i16 < size; i16++) {
            C3186e c3186e3 = (C3186e) m16264u1.get(i16);
            if (c3186e3.m16124u0()) {
                C17706o m93749b = m93749b(arrayList7, c3186e3.f13511R0);
                C17706o m93749b2 = m93749b(arrayList7, c3186e3.f13513S0);
                if (m93749b != null && m93749b2 != null) {
                    m93749b.m93768g(0, m93749b2);
                    m93749b2.m93770i(2);
                    arrayList7.remove(m93749b);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (c3187f.m16029C() == C3186e.b.WRAP_CONTENT) {
            Iterator it14 = arrayList7.iterator();
            c17706o = null;
            int i17 = 0;
            while (it14.hasNext()) {
                C17706o c17706o5 = (C17706o) it14.next();
                if (c17706o5.m93766d() != 1) {
                    c17706o5.m93769h(false);
                    int m93767f = c17706o5.m93767f(c3187f.m16150N1(), 0);
                    if (m93767f > i17) {
                        c17706o = c17706o5;
                        i17 = m93767f;
                    }
                }
            }
            if (c17706o != null) {
                c3187f.m16059S0(C3186e.b.FIXED);
                c3187f.m16106n1(i17);
                c17706o.m93769h(true);
                if (c3187f.m16064V() != C3186e.b.WRAP_CONTENT) {
                    Iterator it15 = arrayList7.iterator();
                    C17706o c17706o6 = null;
                    int i18 = 0;
                    while (it15.hasNext()) {
                        C17706o c17706o7 = (C17706o) it15.next();
                        if (c17706o7.m93766d() != 0) {
                            c17706o7.m93769h(false);
                            int m93767f2 = c17706o7.m93767f(c3187f.m16150N1(), 1);
                            if (m93767f2 > i18) {
                                c17706o6 = c17706o7;
                                i18 = m93767f2;
                            }
                        }
                    }
                    if (c17706o6 != null) {
                        c3187f.m16095j1(C3186e.b.FIXED);
                        c3187f.m16053O0(i18);
                        c17706o6.m93769h(true);
                        c17706o2 = c17706o6;
                        if (c17706o != null && c17706o2 == null) {
                            return false;
                        }
                        return true;
                    }
                }
                c17706o2 = null;
                if (c17706o != null) {
                }
                return true;
            }
        }
        c17706o = null;
        if (c3187f.m16064V() != C3186e.b.WRAP_CONTENT) {
        }
        c17706o2 = null;
        if (c17706o != null) {
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m93751d(C3186e.b bVar, C3186e.b bVar2, C3186e.b bVar3, C3186e.b bVar4) {
        boolean z11;
        boolean z12;
        C3186e.b bVar5;
        C3186e.b bVar6;
        C3186e.b bVar7 = C3186e.b.FIXED;
        if (bVar3 != bVar7 && bVar3 != (bVar6 = C3186e.b.WRAP_CONTENT) && (bVar3 != C3186e.b.MATCH_PARENT || bVar == bVar6)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (bVar4 != bVar7 && bVar4 != (bVar5 = C3186e.b.WRAP_CONTENT) && (bVar4 != C3186e.b.MATCH_PARENT || bVar2 == bVar5)) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 || z12) {
            return true;
        }
        return false;
    }
}

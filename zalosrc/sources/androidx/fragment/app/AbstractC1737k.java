package androidx.fragment.app;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC1563j0;
import androidx.fragment.app.AbstractC1736j;
import androidx.transition.C2007d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p665y0.C30239a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1737k {

    /* renamed from: a */
    private static final int[] f7147a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final AbstractC1739m f7148b = new C1738l();

    /* renamed from: c */
    private static final AbstractC1739m f7149c = m9165w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ ArrayList f7150p;

        a(ArrayList arrayList) {
            this.f7150p = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1737k.m9141A(this.f7150p, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$b */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Object f7151p;

        /* renamed from: q */
        final /* synthetic */ AbstractC1739m f7152q;

        /* renamed from: r */
        final /* synthetic */ View f7153r;

        /* renamed from: s */
        final /* synthetic */ Fragment f7154s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f7155t;

        /* renamed from: u */
        final /* synthetic */ ArrayList f7156u;

        /* renamed from: v */
        final /* synthetic */ ArrayList f7157v;

        /* renamed from: w */
        final /* synthetic */ Object f7158w;

        b(Object obj, AbstractC1739m abstractC1739m, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f7151p = obj;
            this.f7152q = abstractC1739m;
            this.f7153r = view;
            this.f7154s = fragment;
            this.f7155t = arrayList;
            this.f7156u = arrayList2;
            this.f7157v = arrayList3;
            this.f7158w = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f7151p;
            if (obj != null) {
                this.f7152q.mo9178p(obj, this.f7153r);
                this.f7156u.addAll(AbstractC1737k.m9153k(this.f7152q, this.f7151p, this.f7154s, this.f7155t, this.f7153r));
            }
            if (this.f7157v != null) {
                if (this.f7158w != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f7153r);
                    this.f7152q.mo9179q(this.f7158w, this.f7157v, arrayList);
                }
                this.f7157v.clear();
                this.f7157v.add(this.f7153r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$c */
    /* loaded from: classes2.dex */
    public static class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Fragment f7159p;

        /* renamed from: q */
        final /* synthetic */ Fragment f7160q;

        /* renamed from: r */
        final /* synthetic */ boolean f7161r;

        /* renamed from: s */
        final /* synthetic */ C30239a f7162s;

        /* renamed from: t */
        final /* synthetic */ View f7163t;

        /* renamed from: u */
        final /* synthetic */ AbstractC1739m f7164u;

        /* renamed from: v */
        final /* synthetic */ Rect f7165v;

        c(Fragment fragment, Fragment fragment2, boolean z11, C30239a c30239a, View view, AbstractC1739m abstractC1739m, Rect rect) {
            this.f7159p = fragment;
            this.f7160q = fragment2;
            this.f7161r = z11;
            this.f7162s = c30239a;
            this.f7163t = view;
            this.f7164u = abstractC1739m;
            this.f7165v = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1737k.m9148f(this.f7159p, this.f7160q, this.f7161r, this.f7162s, false);
            View view = this.f7163t;
            if (view != null) {
                this.f7164u.m9192k(view, this.f7165v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$d */
    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: A */
        final /* synthetic */ Rect f7166A;

        /* renamed from: p */
        final /* synthetic */ AbstractC1739m f7167p;

        /* renamed from: q */
        final /* synthetic */ C30239a f7168q;

        /* renamed from: r */
        final /* synthetic */ Object f7169r;

        /* renamed from: s */
        final /* synthetic */ e f7170s;

        /* renamed from: t */
        final /* synthetic */ ArrayList f7171t;

        /* renamed from: u */
        final /* synthetic */ View f7172u;

        /* renamed from: v */
        final /* synthetic */ Fragment f7173v;

        /* renamed from: w */
        final /* synthetic */ Fragment f7174w;

        /* renamed from: x */
        final /* synthetic */ boolean f7175x;

        /* renamed from: y */
        final /* synthetic */ ArrayList f7176y;

        /* renamed from: z */
        final /* synthetic */ Object f7177z;

        d(AbstractC1739m abstractC1739m, C30239a c30239a, Object obj, e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z11, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f7167p = abstractC1739m;
            this.f7168q = c30239a;
            this.f7169r = obj;
            this.f7170s = eVar;
            this.f7171t = arrayList;
            this.f7172u = view;
            this.f7173v = fragment;
            this.f7174w = fragment2;
            this.f7175x = z11;
            this.f7176y = arrayList2;
            this.f7177z = obj2;
            this.f7166A = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C30239a m9150h = AbstractC1737k.m9150h(this.f7167p, this.f7168q, this.f7169r, this.f7170s);
            if (m9150h != null) {
                this.f7171t.addAll(m9150h.values());
                this.f7171t.add(this.f7172u);
            }
            AbstractC1737k.m9148f(this.f7173v, this.f7174w, this.f7175x, m9150h, false);
            Object obj = this.f7169r;
            if (obj != null) {
                this.f7167p.mo9185z(obj, this.f7176y, this.f7171t);
                View m9161s = AbstractC1737k.m9161s(m9150h, this.f7170s, this.f7177z, this.f7175x);
                if (m9161s != null) {
                    this.f7167p.m9192k(m9161s, this.f7166A);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.k$e */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a */
        public Fragment f7178a;

        /* renamed from: b */
        public boolean f7179b;

        /* renamed from: c */
        public C1727a f7180c;

        /* renamed from: d */
        public Fragment f7181d;

        /* renamed from: e */
        public boolean f7182e;

        /* renamed from: f */
        public C1727a f7183f;

        e() {
        }
    }

    /* renamed from: A */
    static void m9141A(ArrayList arrayList, int i11) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m9142B(LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h, ArrayList arrayList, ArrayList arrayList2, int i11, int i12, boolean z11) {
        if (layoutInflaterFactory2C1734h.f7055E < 1) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        for (int i13 = i11; i13 < i12; i13++) {
            C1727a c1727a = (C1727a) arrayList.get(i13);
            if (((Boolean) arrayList2.get(i13)).booleanValue()) {
                m9147e(c1727a, sparseArray, z11);
            } else {
                m9145c(c1727a, sparseArray, z11);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(layoutInflaterFactory2C1734h.f7056F.m8988e());
            int size = sparseArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                int keyAt = sparseArray.keyAt(i14);
                C30239a m9146d = m9146d(keyAt, arrayList, arrayList2, i11, i12);
                e eVar = (e) sparseArray.valueAt(i14);
                if (z11) {
                    m9157o(layoutInflaterFactory2C1734h, keyAt, eVar, view, m9146d);
                } else {
                    m9156n(layoutInflaterFactory2C1734h, keyAt, eVar, view, m9146d);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9143a(ArrayList arrayList, C30239a c30239a, Collection collection) {
        for (int size = c30239a.size() - 1; size >= 0; size--) {
            View view = (View) c30239a.m149167o(size);
            if (collection.contains(AbstractC1579n0.m7832Q(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0097, code lost:            if (r10.f6930N == false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0041, code lost:            if (r10.f6965z != false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0043, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005a, code lost:            r1 = true;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m9144b(C1727a c1727a, AbstractC1736j.a aVar, SparseArray sparseArray, boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        e eVar;
        LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h;
        Fragment fragment = aVar.f7140b;
        if (fragment == null || (i11 = fragment.f6928L) == 0) {
            return;
        }
        if (z11) {
            i12 = f7147a[aVar.f7139a];
        } else {
            i12 = aVar.f7139a;
        }
        boolean z17 = false;
        if (i12 != 1) {
            if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        if (i12 != 6) {
                            if (i12 != 7) {
                                z14 = false;
                                z16 = false;
                                z15 = false;
                                e eVar2 = (e) sparseArray.get(i11);
                                if (z17) {
                                    eVar2 = m9158p(eVar2, sparseArray, i11);
                                    eVar2.f7178a = fragment;
                                    eVar2.f7179b = z11;
                                    eVar2.f7180c = c1727a;
                                }
                                eVar = eVar2;
                                if (!z12 && z14) {
                                    if (eVar != null && eVar.f7181d == fragment) {
                                        eVar.f7181d = null;
                                    }
                                    layoutInflaterFactory2C1734h = c1727a.f7024s;
                                    if (fragment.f6955p < 1 && layoutInflaterFactory2C1734h.f7055E >= 1 && !c1727a.f7137q) {
                                        layoutInflaterFactory2C1734h.m9063L0(fragment);
                                        layoutInflaterFactory2C1734h.m9076T0(fragment, 1, 0, 0, false);
                                    }
                                }
                                if (z15 && (eVar == null || eVar.f7181d == null)) {
                                    eVar = m9158p(eVar, sparseArray, i11);
                                    eVar.f7181d = fragment;
                                    eVar.f7182e = z11;
                                    eVar.f7183f = c1727a;
                                }
                                if (!z12 && z16 && eVar != null && eVar.f7178a == fragment) {
                                    eVar.f7178a = null;
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        if (z12) {
                            if (fragment.f6945c0) {
                                if (!fragment.f6930N) {
                                }
                            }
                            z13 = false;
                            z17 = z13;
                            z14 = true;
                            z16 = false;
                            z15 = false;
                            e eVar22 = (e) sparseArray.get(i11);
                            if (z17) {
                            }
                            eVar = eVar22;
                            if (!z12) {
                                if (eVar != null) {
                                    eVar.f7181d = null;
                                }
                                layoutInflaterFactory2C1734h = c1727a.f7024s;
                                if (fragment.f6955p < 1) {
                                    layoutInflaterFactory2C1734h.m9063L0(fragment);
                                    layoutInflaterFactory2C1734h.m9076T0(fragment, 1, 0, 0, false);
                                }
                            }
                            if (z15) {
                                eVar = m9158p(eVar, sparseArray, i11);
                                eVar.f7181d = fragment;
                                eVar.f7182e = z11;
                                eVar.f7183f = c1727a;
                            }
                            if (!z12) {
                                return;
                            } else {
                                return;
                            }
                        }
                        z13 = fragment.f6930N;
                        z17 = z13;
                        z14 = true;
                        z16 = false;
                        z15 = false;
                        e eVar222 = (e) sparseArray.get(i11);
                        if (z17) {
                        }
                        eVar = eVar222;
                        if (!z12) {
                        }
                        if (z15) {
                        }
                        if (!z12) {
                        }
                    }
                } else {
                    boolean z18 = !z12 ? false : false;
                    z15 = z18;
                    z14 = false;
                    z16 = true;
                    e eVar2222 = (e) sparseArray.get(i11);
                    if (z17) {
                    }
                    eVar = eVar2222;
                    if (!z12) {
                    }
                    if (z15) {
                    }
                    if (!z12) {
                    }
                }
            }
            if (!z12) {
            }
            z15 = z18;
            z14 = false;
            z16 = true;
            e eVar22222 = (e) sparseArray.get(i11);
            if (z17) {
            }
            eVar = eVar22222;
            if (!z12) {
            }
            if (z15) {
            }
            if (!z12) {
            }
        }
        if (z12) {
            z13 = fragment.f6944b0;
            z17 = z13;
            z14 = true;
            z16 = false;
            z15 = false;
            e eVar222222 = (e) sparseArray.get(i11);
            if (z17) {
            }
            eVar = eVar222222;
            if (!z12) {
            }
            if (z15) {
            }
            if (!z12) {
            }
        } else {
            if (!fragment.f6965z) {
            }
            z13 = false;
            z17 = z13;
            z14 = true;
            z16 = false;
            z15 = false;
            e eVar2222222 = (e) sparseArray.get(i11);
            if (z17) {
            }
            eVar = eVar2222222;
            if (!z12) {
            }
            if (z15) {
            }
            if (!z12) {
            }
        }
    }

    /* renamed from: c */
    public static void m9145c(C1727a c1727a, SparseArray sparseArray, boolean z11) {
        int size = c1727a.f7121a.size();
        for (int i11 = 0; i11 < size; i11++) {
            m9144b(c1727a, (AbstractC1736j.a) c1727a.f7121a.get(i11), sparseArray, false, z11);
        }
    }

    /* renamed from: d */
    private static C30239a m9146d(int i11, ArrayList arrayList, ArrayList arrayList2, int i12, int i13) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        C30239a c30239a = new C30239a();
        for (int i14 = i13 - 1; i14 >= i12; i14--) {
            C1727a c1727a = (C1727a) arrayList.get(i14);
            if (c1727a.m8946p(i11)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i14)).booleanValue();
                ArrayList arrayList5 = c1727a.f7135o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c1727a.f7135o;
                        arrayList4 = c1727a.f7136p;
                    } else {
                        ArrayList arrayList6 = c1727a.f7135o;
                        arrayList3 = c1727a.f7136p;
                        arrayList4 = arrayList6;
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        String str = (String) arrayList4.get(i15);
                        String str2 = (String) arrayList3.get(i15);
                        String str3 = (String) c30239a.remove(str2);
                        if (str3 != null) {
                            c30239a.put(str, str3);
                        } else {
                            c30239a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c30239a;
    }

    /* renamed from: e */
    public static void m9147e(C1727a c1727a, SparseArray sparseArray, boolean z11) {
        if (!c1727a.f7024s.f7057G.mo8898c()) {
            return;
        }
        for (int size = c1727a.f7121a.size() - 1; size >= 0; size--) {
            m9144b(c1727a, (AbstractC1736j.a) c1727a.f7121a.get(size), sparseArray, true, z11);
        }
    }

    /* renamed from: f */
    static void m9148f(Fragment fragment, Fragment fragment2, boolean z11, C30239a c30239a, boolean z12) {
        if (z11) {
            fragment2.m8872p();
        } else {
            fragment.m8872p();
        }
    }

    /* renamed from: g */
    private static boolean m9149g(AbstractC1739m abstractC1739m, List list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!abstractC1739m.mo9174e(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C30239a m9150h(AbstractC1739m abstractC1739m, C30239a c30239a, Object obj, e eVar) {
        ArrayList arrayList;
        Fragment fragment = eVar.f7178a;
        View m8799H = fragment.m8799H();
        if (!c30239a.isEmpty() && obj != null && m8799H != null) {
            C30239a c30239a2 = new C30239a();
            abstractC1739m.m9191j(c30239a2, m8799H);
            C1727a c1727a = eVar.f7180c;
            if (eVar.f7179b) {
                fragment.m8876r();
                arrayList = c1727a.f7135o;
            } else {
                fragment.m8872p();
                arrayList = c1727a.f7136p;
            }
            if (arrayList != null) {
                c30239a2.m149098q(arrayList);
                c30239a2.m149098q(c30239a.values());
            }
            m9166x(c30239a, c30239a2);
            return c30239a2;
        }
        c30239a.clear();
        return null;
    }

    /* renamed from: i */
    private static C30239a m9151i(AbstractC1739m abstractC1739m, C30239a c30239a, Object obj, e eVar) {
        ArrayList arrayList;
        if (!c30239a.isEmpty() && obj != null) {
            Fragment fragment = eVar.f7181d;
            C30239a c30239a2 = new C30239a();
            abstractC1739m.m9191j(c30239a2, fragment.m8832Y0());
            C1727a c1727a = eVar.f7183f;
            if (eVar.f7182e) {
                fragment.m8872p();
                arrayList = c1727a.f7136p;
            } else {
                fragment.m8876r();
                arrayList = c1727a.f7135o;
            }
            c30239a2.m149098q(arrayList);
            c30239a.m149098q(c30239a2.keySet());
            return c30239a2;
        }
        c30239a.clear();
        return null;
    }

    /* renamed from: j */
    private static AbstractC1739m m9152j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m8874q = fragment.m8874q();
            if (m8874q != null) {
                arrayList.add(m8874q);
            }
            Object m8789C = fragment.m8789C();
            if (m8789C != null) {
                arrayList.add(m8789C);
            }
            Object m8793E = fragment.m8793E();
            if (m8793E != null) {
                arrayList.add(m8793E);
            }
        }
        if (fragment2 != null) {
            Object m8870o = fragment2.m8870o();
            if (m8870o != null) {
                arrayList.add(m8870o);
            }
            Object m8892z = fragment2.m8892z();
            if (m8892z != null) {
                arrayList.add(m8892z);
            }
            Object m8791D = fragment2.m8791D();
            if (m8791D != null) {
                arrayList.add(m8791D);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1739m abstractC1739m = f7148b;
        if (abstractC1739m != null && m9149g(abstractC1739m, arrayList)) {
            return abstractC1739m;
        }
        AbstractC1739m abstractC1739m2 = f7149c;
        if (abstractC1739m2 != null && m9149g(abstractC1739m2, arrayList)) {
            return abstractC1739m2;
        }
        if (abstractC1739m == null && abstractC1739m2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList m9153k(AbstractC1739m abstractC1739m, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj != null) {
            ArrayList arrayList2 = new ArrayList();
            View m8799H = fragment.m8799H();
            if (m8799H != null) {
                abstractC1739m.m9190f(arrayList2, m8799H);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC1739m.mo9172b(obj, arrayList2);
                return arrayList2;
            }
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    private static Object m9154l(AbstractC1739m abstractC1739m, ViewGroup viewGroup, View view, C30239a c30239a, e eVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object m9162t;
        C30239a c30239a2;
        Object obj3;
        Rect rect;
        Fragment fragment = eVar.f7178a;
        Fragment fragment2 = eVar.f7181d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z11 = eVar.f7179b;
        if (c30239a.isEmpty()) {
            c30239a2 = c30239a;
            m9162t = null;
        } else {
            m9162t = m9162t(abstractC1739m, fragment, fragment2, z11);
            c30239a2 = c30239a;
        }
        C30239a m9151i = m9151i(abstractC1739m, c30239a2, m9162t, eVar);
        if (c30239a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m9151i.values());
            obj3 = m9162t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m9148f(fragment, fragment2, z11, m9151i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC1739m.mo9184y(obj3, view, arrayList);
            m9168z(abstractC1739m, obj3, obj2, m9151i, eVar.f7182e, eVar.f7183f);
            if (obj != null) {
                abstractC1739m.mo9182u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(viewGroup, new d(abstractC1739m, c30239a, obj3, eVar, arrayList2, view, fragment, fragment2, z11, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m9155m(AbstractC1739m abstractC1739m, ViewGroup viewGroup, View view, C30239a c30239a, e eVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object m9162t;
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = eVar.f7178a;
        Fragment fragment2 = eVar.f7181d;
        if (fragment != null) {
            fragment.m8832Y0().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z11 = eVar.f7179b;
        if (c30239a.isEmpty()) {
            m9162t = null;
        } else {
            m9162t = m9162t(abstractC1739m, fragment, fragment2, z11);
        }
        C30239a m9151i = m9151i(abstractC1739m, c30239a, m9162t, eVar);
        C30239a m9150h = m9150h(abstractC1739m, c30239a, m9162t, eVar);
        if (c30239a.isEmpty()) {
            if (m9151i != null) {
                m9151i.clear();
            }
            if (m9150h != null) {
                m9150h.clear();
            }
            obj3 = null;
        } else {
            m9143a(arrayList, m9151i, c30239a.keySet());
            m9143a(arrayList2, m9150h, c30239a.values());
            obj3 = m9162t;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m9148f(fragment, fragment2, z11, m9151i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC1739m.mo9184y(obj3, view, arrayList);
            m9168z(abstractC1739m, obj3, obj2, m9151i, eVar.f7182e, eVar.f7183f);
            Rect rect2 = new Rect();
            View m9161s = m9161s(m9150h, eVar, obj, z11);
            if (m9161s != null) {
                abstractC1739m.mo9182u(obj, rect2);
            }
            rect = rect2;
            view2 = m9161s;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(viewGroup, new c(fragment, fragment2, z11, m9150h, view2, abstractC1739m, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m9156n(LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h, int i11, e eVar, View view, C30239a c30239a) {
        ViewGroup viewGroup;
        Fragment fragment;
        Fragment fragment2;
        AbstractC1739m m9152j;
        Object obj;
        Object obj2;
        if (layoutInflaterFactory2C1734h.f7057G.mo8898c()) {
            viewGroup = (ViewGroup) layoutInflaterFactory2C1734h.f7057G.mo8897b(i11);
        } else {
            viewGroup = null;
        }
        if (viewGroup == null || (m9152j = m9152j((fragment2 = eVar.f7181d), (fragment = eVar.f7178a))) == null) {
            return;
        }
        boolean z11 = eVar.f7179b;
        boolean z12 = eVar.f7182e;
        Object m9159q = m9159q(m9152j, fragment, z11);
        Object m9160r = m9160r(m9152j, fragment2, z12);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object m9154l = m9154l(m9152j, viewGroup, view, c30239a, eVar, arrayList, arrayList2, m9159q, m9160r);
        if (m9159q == null && m9154l == null) {
            obj = m9160r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m9160r;
        }
        ArrayList m9153k = m9153k(m9152j, obj, fragment2, arrayList, view);
        if (m9153k != null && !m9153k.isEmpty()) {
            obj2 = obj;
        } else {
            obj2 = null;
        }
        m9152j.mo9171a(m9159q, view);
        Object m9163u = m9163u(m9152j, m9159q, obj2, m9154l, fragment, eVar.f7179b);
        if (m9163u != null) {
            ArrayList arrayList3 = new ArrayList();
            m9152j.mo9181t(m9163u, m9159q, arrayList3, obj2, m9153k, m9154l, arrayList2);
            m9167y(m9152j, viewGroup, fragment, view, arrayList2, m9159q, arrayList3, obj2, m9153k);
            m9152j.m9195w(viewGroup, arrayList2, c30239a);
            m9152j.mo9173c(viewGroup, m9163u);
            m9152j.m9194s(viewGroup, arrayList2, c30239a);
        }
    }

    /* renamed from: o */
    private static void m9157o(LayoutInflaterFactory2C1734h layoutInflaterFactory2C1734h, int i11, e eVar, View view, C30239a c30239a) {
        ViewGroup viewGroup;
        Fragment fragment;
        Fragment fragment2;
        AbstractC1739m m9152j;
        Object obj;
        if (layoutInflaterFactory2C1734h.f7057G.mo8898c()) {
            viewGroup = (ViewGroup) layoutInflaterFactory2C1734h.f7057G.mo8897b(i11);
        } else {
            viewGroup = null;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 == null || (m9152j = m9152j((fragment2 = eVar.f7181d), (fragment = eVar.f7178a))) == null) {
            return;
        }
        boolean z11 = eVar.f7179b;
        boolean z12 = eVar.f7182e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object m9159q = m9159q(m9152j, fragment, z11);
        Object m9160r = m9160r(m9152j, fragment2, z12);
        Object m9155m = m9155m(m9152j, viewGroup2, view, c30239a, eVar, arrayList2, arrayList, m9159q, m9160r);
        if (m9159q == null && m9155m == null) {
            obj = m9160r;
            if (obj == null) {
                return;
            }
        } else {
            obj = m9160r;
        }
        ArrayList m9153k = m9153k(m9152j, obj, fragment2, arrayList2, view);
        ArrayList m9153k2 = m9153k(m9152j, m9159q, fragment, arrayList, view);
        m9141A(m9153k2, 4);
        Object m9163u = m9163u(m9152j, m9159q, obj, m9155m, fragment, z11);
        if (m9163u != null) {
            m9164v(m9152j, obj, fragment2, m9153k);
            ArrayList m9193o = m9152j.m9193o(arrayList);
            m9152j.mo9181t(m9163u, m9159q, m9153k2, obj, m9153k, m9155m, arrayList);
            m9152j.mo9173c(viewGroup2, m9163u);
            m9152j.m9196x(viewGroup2, arrayList2, arrayList, m9193o, c30239a);
            m9141A(m9153k2, 0);
            m9152j.mo9185z(m9155m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static e m9158p(e eVar, SparseArray sparseArray, int i11) {
        if (eVar == null) {
            e eVar2 = new e();
            sparseArray.put(i11, eVar2);
            return eVar2;
        }
        return eVar;
    }

    /* renamed from: q */
    private static Object m9159q(AbstractC1739m abstractC1739m, Fragment fragment, boolean z11) {
        Object m8870o;
        if (fragment == null) {
            return null;
        }
        if (z11) {
            m8870o = fragment.m8892z();
        } else {
            m8870o = fragment.m8870o();
        }
        return abstractC1739m.mo9175g(m8870o);
    }

    /* renamed from: r */
    private static Object m9160r(AbstractC1739m abstractC1739m, Fragment fragment, boolean z11) {
        Object m8874q;
        if (fragment == null) {
            return null;
        }
        if (z11) {
            m8874q = fragment.m8789C();
        } else {
            m8874q = fragment.m8874q();
        }
        return abstractC1739m.mo9175g(m8874q);
    }

    /* renamed from: s */
    static View m9161s(C30239a c30239a, e eVar, Object obj, boolean z11) {
        ArrayList arrayList;
        String str;
        C1727a c1727a = eVar.f7180c;
        if (obj != null && c30239a != null && (arrayList = c1727a.f7135o) != null && !arrayList.isEmpty()) {
            if (z11) {
                str = (String) c1727a.f7135o.get(0);
            } else {
                str = (String) c1727a.f7136p.get(0);
            }
            return (View) c30239a.get(str);
        }
        return null;
    }

    /* renamed from: t */
    private static Object m9162t(AbstractC1739m abstractC1739m, Fragment fragment, Fragment fragment2, boolean z11) {
        Object m8791D;
        if (fragment != null && fragment2 != null) {
            if (z11) {
                m8791D = fragment2.m8793E();
            } else {
                m8791D = fragment.m8791D();
            }
            return abstractC1739m.mo9170A(abstractC1739m.mo9175g(m8791D));
        }
        return null;
    }

    /* renamed from: u */
    private static Object m9163u(AbstractC1739m abstractC1739m, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z11) {
        boolean m8855i;
        if (obj != null && obj2 != null && fragment != null) {
            if (z11) {
                m8855i = fragment.m8858j();
            } else {
                m8855i = fragment.m8855i();
            }
            if (!m8855i) {
                return abstractC1739m.mo9176m(obj2, obj, obj3);
            }
        }
        return abstractC1739m.mo9177n(obj2, obj, obj3);
    }

    /* renamed from: v */
    private static void m9164v(AbstractC1739m abstractC1739m, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.f6965z && fragment.f6930N && fragment.f6945c0) {
            fragment.m8846e1(true);
            abstractC1739m.mo9180r(obj, fragment.m8799H(), arrayList);
            ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(fragment.f6937U, new a(arrayList));
        }
    }

    /* renamed from: w */
    private static AbstractC1739m m9165w() {
        try {
            return (AbstractC1739m) C2007d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: x */
    private static void m9166x(C30239a c30239a, C30239a c30239a2) {
        for (int size = c30239a.size() - 1; size >= 0; size--) {
            if (!c30239a2.containsKey((String) c30239a.m149167o(size))) {
                c30239a.m149165l(size);
            }
        }
    }

    /* renamed from: y */
    private static void m9167y(AbstractC1739m abstractC1739m, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        ViewTreeObserverOnPreDrawListenerC1563j0.m7780a(viewGroup, new b(obj, abstractC1739m, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: z */
    private static void m9168z(AbstractC1739m abstractC1739m, Object obj, Object obj2, C30239a c30239a, boolean z11, C1727a c1727a) {
        String str;
        ArrayList arrayList = c1727a.f7135o;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z11) {
                str = (String) c1727a.f7136p.get(0);
            } else {
                str = (String) c1727a.f7135o.get(0);
            }
            View view = (View) c30239a.get(str);
            abstractC1739m.mo9183v(obj, view);
            if (obj2 != null) {
                abstractC1739m.mo9183v(obj2, view);
            }
        }
    }
}

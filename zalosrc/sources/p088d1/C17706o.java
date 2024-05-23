package p088d1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p045c1.AbstractC3183b;
import p045c1.C3186e;
import p045c1.C3187f;
import p700z0.C31133d;

/* renamed from: d1.o */
/* loaded from: classes2.dex */
public class C17706o {

    /* renamed from: g */
    static int f89761g;

    /* renamed from: b */
    int f89763b;

    /* renamed from: d */
    int f89765d;

    /* renamed from: a */
    ArrayList f89762a = new ArrayList();

    /* renamed from: c */
    boolean f89764c = false;

    /* renamed from: e */
    ArrayList f89766e = null;

    /* renamed from: f */
    private int f89767f = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d1.o$a */
    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a */
        WeakReference f89768a;

        /* renamed from: b */
        int f89769b;

        /* renamed from: c */
        int f89770c;

        /* renamed from: d */
        int f89771d;

        /* renamed from: e */
        int f89772e;

        /* renamed from: f */
        int f89773f;

        /* renamed from: g */
        int f89774g;

        public a(C3186e c3186e, C31133d c31133d, int i11) {
            this.f89768a = new WeakReference(c3186e);
            this.f89769b = c31133d.m151281x(c3186e.f13508Q);
            this.f89770c = c31133d.m151281x(c3186e.f13510R);
            this.f89771d = c31133d.m151281x(c3186e.f13512S);
            this.f89772e = c31133d.m151281x(c3186e.f13514T);
            this.f89773f = c31133d.m151281x(c3186e.f13515U);
            this.f89774g = i11;
        }
    }

    public C17706o(int i11) {
        int i12 = f89761g;
        f89761g = i12 + 1;
        this.f89763b = i12;
        this.f89765d = i11;
    }

    /* renamed from: e */
    private String m93761e() {
        int i11 = this.f89765d;
        return i11 == 0 ? "Horizontal" : i11 == 1 ? "Vertical" : i11 == 2 ? "Both" : "Unknown";
    }

    /* renamed from: j */
    private int m93762j(C31133d c31133d, ArrayList arrayList, int i11) {
        int m151281x;
        int m151281x2;
        C3187f c3187f = (C3187f) ((C3186e) arrayList.get(0)).m16048M();
        c31133d.m151263D();
        c3187f.mo15984g(c31133d, false);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ((C3186e) arrayList.get(i12)).mo15984g(c31133d, false);
        }
        if (i11 == 0 && c3187f.f13590f1 > 0) {
            AbstractC3183b.m15994b(c3187f, c31133d, arrayList, 0);
        }
        if (i11 == 1 && c3187f.f13591g1 > 0) {
            AbstractC3183b.m15994b(c3187f, c31133d, arrayList, 1);
        }
        try {
            c31133d.m151282z();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f89766e = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            this.f89766e.add(new a((C3186e) arrayList.get(i13), c31133d, i11));
        }
        if (i11 == 0) {
            m151281x = c31133d.m151281x(c3187f.f13508Q);
            m151281x2 = c31133d.m151281x(c3187f.f13512S);
            c31133d.m151263D();
        } else {
            m151281x = c31133d.m151281x(c3187f.f13510R);
            m151281x2 = c31133d.m151281x(c3187f.f13514T);
            c31133d.m151263D();
        }
        return m151281x2 - m151281x;
    }

    /* renamed from: a */
    public boolean m93763a(C3186e c3186e) {
        if (this.f89762a.contains(c3186e)) {
            return false;
        }
        this.f89762a.add(c3186e);
        return true;
    }

    /* renamed from: b */
    public void m93764b(ArrayList arrayList) {
        int size = this.f89762a.size();
        if (this.f89767f != -1 && size > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                C17706o c17706o = (C17706o) arrayList.get(i11);
                if (this.f89767f == c17706o.f89763b) {
                    m93768g(this.f89765d, c17706o);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public int m93765c() {
        return this.f89763b;
    }

    /* renamed from: d */
    public int m93766d() {
        return this.f89765d;
    }

    /* renamed from: f */
    public int m93767f(C31133d c31133d, int i11) {
        if (this.f89762a.size() == 0) {
            return 0;
        }
        return m93762j(c31133d, this.f89762a, i11);
    }

    /* renamed from: g */
    public void m93768g(int i11, C17706o c17706o) {
        Iterator it = this.f89762a.iterator();
        while (it.hasNext()) {
            C3186e c3186e = (C3186e) it.next();
            c17706o.m93763a(c3186e);
            if (i11 == 0) {
                c3186e.f13511R0 = c17706o.m93765c();
            } else {
                c3186e.f13513S0 = c17706o.m93765c();
            }
        }
        this.f89767f = c17706o.f89763b;
    }

    /* renamed from: h */
    public void m93769h(boolean z11) {
        this.f89764c = z11;
    }

    /* renamed from: i */
    public void m93770i(int i11) {
        this.f89765d = i11;
    }

    public String toString() {
        String str = m93761e() + " [" + this.f89763b + "] <";
        Iterator it = this.f89762a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((C3186e) it.next()).m16125v();
        }
        return str + " >";
    }
}

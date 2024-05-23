package p566v3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p566v3.C27495c;
import p596w3.C28705c;
import p596w3.C28709g;
import p596w3.C28710h;
import p596w3.C28711i;
import p596w3.C28712j;
import p631x3.AbstractC29301b;
import p631x3.AbstractC29302c;
import p631x3.AbstractC29304e;

/* renamed from: v3.j */
/* loaded from: classes2.dex */
public class C27502j {

    /* renamed from: a */
    private final String f129354a;

    /* renamed from: b */
    private final int f129355b;

    /* renamed from: c */
    private final int f129356c;

    /* renamed from: d */
    private final float f129357d;

    /* renamed from: e */
    private final float f129358e;

    /* renamed from: f */
    private final float f129359f;

    /* renamed from: g */
    private final List f129360g;

    /* renamed from: h */
    private final float[][][] f129361h;

    /* renamed from: i */
    private final int f129362i;

    /* renamed from: j */
    private final Paint.Cap f129363j;

    /* renamed from: k */
    private final C27502j f129364k;

    /* renamed from: l */
    final C27495c f129365l;

    /* renamed from: m */
    final List f129366m;

    /* renamed from: n */
    final C27495c f129367n;

    /* renamed from: o */
    private final C27495c f129368o;

    /* renamed from: p */
    final C27495c f129369p;

    /* renamed from: q */
    final C27495c f129370q;

    /* renamed from: r */
    private final C27503k f129371r;

    /* renamed from: s */
    private final String f129372s;

    /* renamed from: t */
    private final C28710h f129373t;

    /* renamed from: v3.j$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public String f129374a;

        /* renamed from: b */
        public int f129375b;

        /* renamed from: c */
        public int f129376c;

        /* renamed from: d */
        public float f129377d;

        /* renamed from: g */
        public List f129380g;

        /* renamed from: h */
        public float[][][] f129381h;

        /* renamed from: i */
        public int f129382i;

        /* renamed from: k */
        public C27502j f129384k;

        /* renamed from: l */
        public List f129385l;

        /* renamed from: m */
        public float[] f129386m;

        /* renamed from: n */
        public C27503k f129387n;

        /* renamed from: o */
        public String f129388o;

        /* renamed from: e */
        public float f129378e = 0.0f;

        /* renamed from: f */
        public float f129379f = Float.MAX_VALUE;

        /* renamed from: j */
        public Paint.Cap f129383j = Paint.Cap.ROUND;

        /* renamed from: a */
        public C27502j m140633a() {
            return new C27502j(this.f129374a, this.f129375b, this.f129376c, this.f129377d, this.f129378e, this.f129379f, this.f129380g, this.f129381h, this.f129382i, this.f129383j, this.f129384k, this.f129385l, this.f129386m, this.f129387n, this.f129388o);
        }
    }

    public C27502j(C27502j c27502j) {
        this.f129354a = c27502j.f129354a;
        this.f129355b = c27502j.f129355b;
        this.f129356c = c27502j.f129356c;
        this.f129357d = c27502j.f129357d;
        this.f129358e = c27502j.f129358e;
        this.f129359f = c27502j.f129359f;
        if (c27502j.f129360g != null) {
            this.f129360g = new ArrayList();
            Iterator it = c27502j.f129360g.iterator();
            while (it.hasNext()) {
                this.f129360g.add(new C27505m((C27505m) it.next()));
            }
        } else {
            this.f129360g = null;
        }
        float[][][] fArr = c27502j.f129361h;
        if (fArr != null) {
            this.f129361h = new float[fArr.length][];
            int length = c27502j.f129361h.length;
            for (int i11 = 0; i11 < length; i11++) {
                float[][][] fArr2 = this.f129361h;
                float[][][] fArr3 = c27502j.f129361h;
                fArr2[i11] = new float[fArr3[i11].length];
                int length2 = fArr3[i11].length;
                for (int i12 = 0; i12 < length2; i12++) {
                    float[][] fArr4 = this.f129361h[i11];
                    float[][][] fArr5 = c27502j.f129361h;
                    fArr4[i12] = new float[fArr5[i11][i12].length];
                    int length3 = fArr5[i11][i12].length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        this.f129361h[i11][i12][i13] = c27502j.f129361h[i11][i12][i13];
                    }
                }
            }
        } else {
            this.f129361h = null;
        }
        this.f129362i = c27502j.f129362i;
        this.f129363j = c27502j.f129363j;
        C27502j c27502j2 = c27502j.f129364k;
        if (c27502j2 != null) {
            this.f129364k = new C27502j(c27502j2);
        } else {
            this.f129364k = null;
        }
        if (c27502j.f129365l != null) {
            this.f129365l = new C27495c(c27502j.f129365l);
        } else {
            this.f129365l = null;
        }
        if (c27502j.f129369p != null) {
            this.f129369p = new C27495c(c27502j.f129369p);
        } else {
            this.f129369p = null;
        }
        if (c27502j.f129370q != null) {
            this.f129370q = new C27495c(c27502j.f129370q);
        } else {
            this.f129370q = null;
        }
        if (c27502j.f129367n != null) {
            this.f129367n = new C27495c(c27502j.f129367n);
        } else {
            this.f129367n = null;
        }
        if (c27502j.f129368o != null) {
            this.f129368o = new C27495c(c27502j.f129368o);
        } else {
            this.f129368o = null;
        }
        if (c27502j.f129366m != null) {
            this.f129366m = new ArrayList();
            Iterator it2 = c27502j.f129366m.iterator();
            while (it2.hasNext()) {
                this.f129366m.add(new C27495c((C27495c) it2.next()));
            }
        } else {
            this.f129366m = null;
        }
        C27503k c27503k = c27502j.f129371r;
        if (c27503k != null) {
            this.f129371r = new C27503k(c27503k);
        } else {
            this.f129371r = null;
        }
        this.f129372s = c27502j.f129372s;
        List list = this.f129360g;
        if (list != null) {
            this.f129373t = list.isEmpty() ? null : C28710h.m143784e(this);
            return;
        }
        C28710h c28710h = c27502j.f129373t;
        if (c28710h != null) {
            this.f129373t = new C28710h(c28710h);
        } else {
            this.f129373t = null;
        }
    }

    /* renamed from: a */
    public int m140615a() {
        return this.f129362i;
    }

    /* renamed from: b */
    public String m140616b() {
        return this.f129372s;
    }

    /* renamed from: c */
    public C27503k m140617c() {
        return this.f129371r;
    }

    /* renamed from: d */
    public C27502j m140618d() {
        return this.f129364k;
    }

    /* renamed from: e */
    public int m140619e() {
        return this.f129355b;
    }

    /* renamed from: f */
    public float m140620f() {
        return this.f129358e;
    }

    /* renamed from: g */
    public List m140621g() {
        return this.f129360g;
    }

    /* renamed from: h */
    public String m140622h() {
        return this.f129354a;
    }

    /* renamed from: i */
    public C28710h m140623i() {
        return this.f129373t;
    }

    /* renamed from: j */
    public int m140624j() {
        return this.f129356c;
    }

    /* renamed from: k */
    public Paint.Cap m140625k() {
        return this.f129363j;
    }

    /* renamed from: l */
    public float[][][] m140626l() {
        return this.f129361h;
    }

    /* renamed from: m */
    public float m140627m() {
        return this.f129359f;
    }

    /* renamed from: n */
    public void m140628n(Matrix matrix, float f11) {
        if (matrix == null) {
            return;
        }
        matrix.reset();
        if (this.f129366m == null) {
            return;
        }
        C27495c c27495c = this.f129367n;
        if (c27495c != null) {
            c27495c.m140597c().m143779a(f11, matrix);
        }
        int size = this.f129366m.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((C27495c) this.f129366m.get(i11)).m140597c().m143779a(f11, matrix);
        }
    }

    /* renamed from: o */
    public void m140629o(C28705c.a aVar, float f11) {
        C27495c c27495c;
        if (aVar != null && (c27495c = this.f129370q) != null) {
            c27495c.m140597c().m143779a(f11, aVar);
        }
    }

    /* renamed from: p */
    public void m140630p(C28709g.a aVar, float f11) {
        C27495c c27495c;
        if (aVar != null && (c27495c = this.f129368o) != null) {
            c27495c.m140597c().m143779a(f11, aVar);
        }
    }

    /* renamed from: q */
    public void m140631q(C28711i.a aVar, float f11) {
        C27495c c27495c;
        if (aVar != null && (c27495c = this.f129369p) != null) {
            c27495c.m140597c().m143779a(f11, aVar);
        }
    }

    /* renamed from: r */
    public void m140632r(C28712j.a aVar, float f11) {
        if (aVar == null) {
            return;
        }
        aVar.m143795c(this.f129357d);
        C27495c c27495c = this.f129365l;
        if (c27495c == null) {
            return;
        }
        c27495c.m140597c().m143779a(f11, aVar);
    }

    public C27502j(String str, int i11, int i12, float f11, float f12, float f13, List list, float[][][] fArr, int i13, Paint.Cap cap, C27502j c27502j, List list2, float[] fArr2, C27503k c27503k, String str2) {
        this.f129354a = str;
        this.f129355b = i11;
        this.f129356c = i12;
        this.f129357d = f11;
        this.f129358e = f12;
        this.f129359f = f13;
        List m146402a = AbstractC29304e.m146402a(list);
        this.f129360g = m146402a;
        this.f129361h = (float[][][]) AbstractC29302c.m146400b(fArr, AbstractC29302c.m146401c(fArr, m146402a.size()), "timing_curves");
        this.f129362i = i13;
        this.f129363j = cap;
        this.f129364k = c27502j;
        this.f129365l = AbstractC29301b.m146398a(list2, C27495c.b.STROKE_WIDTH);
        this.f129369p = AbstractC29301b.m146398a(list2, C27495c.b.STROKE_COLOR);
        this.f129370q = AbstractC29301b.m146398a(list2, C27495c.b.FILL_COLOR);
        this.f129367n = AbstractC29301b.m146398a(list2, C27495c.b.ANCHOR_POINT);
        this.f129368o = AbstractC29301b.m146398a(list2, C27495c.b.OPACITY);
        AbstractC29304e.m146403b(list2, C27495c.f129316f);
        this.f129366m = AbstractC29304e.m146402a(list2);
        this.f129371r = c27503k;
        this.f129372s = str2;
        this.f129373t = m146402a.isEmpty() ? null : C28710h.m143784e(this);
    }
}

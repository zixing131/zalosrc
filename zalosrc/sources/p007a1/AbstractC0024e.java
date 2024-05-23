package p007a1;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import p664y.AbstractC30228a;

/* renamed from: a1.e */
/* loaded from: classes2.dex */
public abstract class AbstractC0024e {

    /* renamed from: a */
    private AbstractC0021b f69a;

    /* renamed from: b */
    private b f70b;

    /* renamed from: c */
    private String f71c;

    /* renamed from: d */
    private int f72d = 0;

    /* renamed from: e */
    private String f73e = null;

    /* renamed from: f */
    public int f74f = 0;

    /* renamed from: g */
    ArrayList f75g = new ArrayList();

    /* renamed from: a1.e$a */
    /* loaded from: classes2.dex */
    class a implements Comparator {
        a() {
        }

        /* renamed from: a */
        public int m71a(c cVar, c cVar2) {
            throw null;
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            AbstractC30228a.m149044a(obj);
            AbstractC30228a.m149044a(obj2);
            return m71a(null, null);
        }
    }

    /* renamed from: a1.e$b */
    /* loaded from: classes2.dex */
    static class b {

        /* renamed from: a */
        private final int f77a;

        /* renamed from: b */
        C0027h f78b;

        /* renamed from: c */
        private final int f79c;

        /* renamed from: d */
        private final int f80d;

        /* renamed from: e */
        private final int f81e;

        /* renamed from: f */
        float[] f82f;

        /* renamed from: g */
        double[] f83g;

        /* renamed from: h */
        float[] f84h;

        /* renamed from: i */
        float[] f85i;

        /* renamed from: j */
        float[] f86j;

        /* renamed from: k */
        float[] f87k;

        /* renamed from: l */
        int f88l;

        /* renamed from: m */
        AbstractC0021b f89m;

        /* renamed from: n */
        double[] f90n;

        /* renamed from: o */
        double[] f91o;

        /* renamed from: p */
        float f92p;

        b(int i11, String str, int i12, int i13) {
            C0027h c0027h = new C0027h();
            this.f78b = c0027h;
            this.f79c = 0;
            this.f80d = 1;
            this.f81e = 2;
            this.f88l = i11;
            this.f77a = i12;
            c0027h.m85g(i11, str);
            this.f82f = new float[i13];
            this.f83g = new double[i13];
            this.f84h = new float[i13];
            this.f85i = new float[i13];
            this.f86j = new float[i13];
            this.f87k = new float[i13];
        }

        /* renamed from: a */
        public double m72a(float f11) {
            AbstractC0021b abstractC0021b = this.f89m;
            if (abstractC0021b != null) {
                double d11 = f11;
                abstractC0021b.mo44g(d11, this.f91o);
                this.f89m.mo41d(d11, this.f90n);
            } else {
                double[] dArr = this.f91o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d12 = f11;
            double m83e = this.f78b.m83e(d12, this.f90n[1]);
            double m82d = this.f78b.m82d(d12, this.f90n[1], this.f91o[1]);
            double[] dArr2 = this.f91o;
            return dArr2[0] + (m83e * dArr2[2]) + (m82d * this.f90n[2]);
        }

        /* renamed from: b */
        public double m73b(float f11) {
            AbstractC0021b abstractC0021b = this.f89m;
            if (abstractC0021b != null) {
                abstractC0021b.mo41d(f11, this.f90n);
            } else {
                double[] dArr = this.f90n;
                dArr[0] = this.f85i[0];
                dArr[1] = this.f86j[0];
                dArr[2] = this.f82f[0];
            }
            double[] dArr2 = this.f90n;
            return dArr2[0] + (this.f78b.m83e(f11, dArr2[1]) * this.f90n[2]);
        }

        /* renamed from: c */
        public void m74c(float f11) {
            this.f92p = f11;
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, this.f83g.length, 3);
            float[] fArr = this.f82f;
            this.f90n = new double[fArr.length + 2];
            this.f91o = new double[fArr.length + 2];
            if (this.f83g[0] > 0.0d) {
                this.f78b.m79a(0.0d, this.f84h[0]);
            }
            double[] dArr2 = this.f83g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f78b.m79a(1.0d, this.f84h[length]);
            }
            for (int i11 = 0; i11 < dArr.length; i11++) {
                double[] dArr3 = dArr[i11];
                dArr3[0] = this.f85i[i11];
                dArr3[1] = this.f86j[i11];
                dArr3[2] = this.f82f[i11];
                this.f78b.m79a(this.f83g[i11], this.f84h[i11]);
            }
            this.f78b.m84f();
            double[] dArr4 = this.f83g;
            if (dArr4.length > 1) {
                this.f89m = AbstractC0021b.m57a(0, dArr4, dArr);
            } else {
                this.f89m = null;
            }
        }
    }

    /* renamed from: a1.e$c */
    /* loaded from: classes2.dex */
    static class c {
    }

    /* renamed from: a */
    public float m66a(float f11) {
        return (float) this.f70b.m73b(f11);
    }

    /* renamed from: b */
    public float m67b(float f11) {
        return (float) this.f70b.m72a(f11);
    }

    /* renamed from: c */
    public void m68c(String str) {
        this.f71c = str;
    }

    /* renamed from: d */
    public void m69d(float f11) {
        int size = this.f75g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.f75g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 3);
        this.f70b = new b(this.f72d, this.f73e, this.f74f, size);
        Iterator it = this.f75g.iterator();
        if (!it.hasNext()) {
            this.f70b.m74c(f11);
            this.f69a = AbstractC0021b.m57a(0, dArr, dArr2);
        } else {
            AbstractC30228a.m149044a(it.next());
            throw null;
        }
    }

    /* renamed from: e */
    public boolean m70e() {
        return this.f74f == 1;
    }

    public String toString() {
        String str = this.f71c;
        new DecimalFormat("##.##");
        Iterator it = this.f75g.iterator();
        if (!it.hasNext()) {
            return str;
        }
        AbstractC30228a.m149044a(it.next());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("[");
        throw null;
    }
}

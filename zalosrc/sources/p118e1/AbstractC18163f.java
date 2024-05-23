package p118e1;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C1293a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p007a1.AbstractC0021b;
import p007a1.AbstractC0034o;
import p007a1.C0023d;

/* renamed from: e1.f */
/* loaded from: classes2.dex */
public abstract class AbstractC18163f extends AbstractC0034o {

    /* renamed from: e1.f$a */
    /* loaded from: classes2.dex */
    static class a extends AbstractC18163f {
        a() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setAlpha(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$b */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC18163f {

        /* renamed from: l */
        String f91837l;

        /* renamed from: m */
        SparseArray f91838m;

        /* renamed from: n */
        SparseArray f91839n = new SparseArray();

        /* renamed from: o */
        float[] f91840o;

        /* renamed from: p */
        float[] f91841p;

        public b(String str, SparseArray sparseArray) {
            this.f91837l = str.split(",")[1];
            this.f91838m = sparseArray;
        }

        @Override // p007a1.AbstractC0034o
        /* renamed from: d */
        public void mo108d(int i11) {
            int size = this.f91838m.size();
            int m6410g = ((C1293a) this.f91838m.valueAt(0)).m6410g();
            double[] dArr = new double[size];
            int i12 = m6410g + 2;
            this.f91840o = new float[i12];
            this.f91841p = new float[m6410g];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i12);
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = this.f91838m.keyAt(i13);
                C1293a c1293a = (C1293a) this.f91838m.valueAt(i13);
                float[] fArr = (float[]) this.f91839n.valueAt(i13);
                dArr[i13] = keyAt * 0.01d;
                c1293a.m6408e(this.f91840o);
                int i14 = 0;
                while (true) {
                    if (i14 < this.f91840o.length) {
                        dArr2[i13][i14] = r7[i14];
                        i14++;
                    }
                }
                double[] dArr3 = dArr2[i13];
                dArr3[m6410g] = fArr[0];
                dArr3[m6410g + 1] = fArr[1];
            }
            this.f146a = AbstractC0021b.m57a(i11, dArr, dArr2);
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            boolean z11;
            this.f146a.mo42e(f11, this.f91840o);
            float[] fArr = this.f91840o;
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            long j12 = j11 - this.f154i;
            if (Float.isNaN(this.f155j)) {
                float m64a = c0023d.m64a(view, this.f91837l, 0);
                this.f155j = m64a;
                if (Float.isNaN(m64a)) {
                    this.f155j = 0.0f;
                }
            }
            float f14 = (float) ((this.f155j + ((j12 * 1.0E-9d) * f12)) % 1.0d);
            this.f155j = f14;
            this.f154i = j11;
            float m105a = m105a(f14);
            this.f153h = false;
            int i11 = 0;
            while (true) {
                float[] fArr2 = this.f91841p;
                if (i11 >= fArr2.length) {
                    break;
                }
                boolean z12 = this.f153h;
                float f15 = this.f91840o[i11];
                if (f15 != 0.0d) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f153h = z12 | z11;
                fArr2[i11] = (f15 * m105a) + f13;
                i11++;
            }
            AbstractC18158a.m96455b((C1293a) this.f91838m.valueAt(0), view, this.f91841p);
            if (f12 != 0.0f) {
                this.f153h = true;
            }
            return this.f153h;
        }
    }

    /* renamed from: e1.f$c */
    /* loaded from: classes2.dex */
    static class c extends AbstractC18163f {
        c() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setElevation(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$d */
    /* loaded from: classes2.dex */
    public static class d extends AbstractC18163f {
        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            return this.f153h;
        }

        /* renamed from: i */
        public boolean m96471i(View view, C0023d c0023d, float f11, long j11, double d11, double d12) {
            view.setRotation(m96469e(f11, j11, view, c0023d) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$e */
    /* loaded from: classes2.dex */
    static class e extends AbstractC18163f {

        /* renamed from: l */
        boolean f91842l = false;

        e() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m96469e(f11, j11, view, c0023d));
            } else {
                if (this.f91842l) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f91842l = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(m96469e(f11, j11, view, c0023d)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f153h;
        }
    }

    /* renamed from: e1.f$f */
    /* loaded from: classes2.dex */
    static class f extends AbstractC18163f {
        f() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setRotation(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$g */
    /* loaded from: classes2.dex */
    static class g extends AbstractC18163f {
        g() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setRotationX(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$h */
    /* loaded from: classes2.dex */
    static class h extends AbstractC18163f {
        h() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setRotationY(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$i */
    /* loaded from: classes2.dex */
    static class i extends AbstractC18163f {
        i() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setScaleX(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$j */
    /* loaded from: classes2.dex */
    static class j extends AbstractC18163f {
        j() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setScaleY(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$k */
    /* loaded from: classes2.dex */
    static class k extends AbstractC18163f {
        k() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setTranslationX(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$l */
    /* loaded from: classes2.dex */
    static class l extends AbstractC18163f {
        l() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setTranslationY(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: e1.f$m */
    /* loaded from: classes2.dex */
    static class m extends AbstractC18163f {
        m() {
        }

        @Override // p118e1.AbstractC18163f
        /* renamed from: h */
        public boolean mo96470h(View view, float f11, long j11, C0023d c0023d) {
            view.setTranslationZ(m96469e(f11, j11, view, c0023d));
            return this.f153h;
        }
    }

    /* renamed from: f */
    public static AbstractC18163f m96467f(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x009c. Please report as an issue. */
    /* renamed from: g */
    public static AbstractC18163f m96468g(String str, long j11) {
        AbstractC18163f gVar;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c11 = 5;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 7;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 11;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                gVar = new g();
                gVar.m106b(j11);
                return gVar;
            case 1:
                gVar = new h();
                gVar.m106b(j11);
                return gVar;
            case 2:
                gVar = new k();
                gVar.m106b(j11);
                return gVar;
            case 3:
                gVar = new l();
                gVar.m106b(j11);
                return gVar;
            case 4:
                gVar = new m();
                gVar.m106b(j11);
                return gVar;
            case 5:
                gVar = new e();
                gVar.m106b(j11);
                return gVar;
            case 6:
                gVar = new i();
                gVar.m106b(j11);
                return gVar;
            case 7:
                gVar = new j();
                gVar.m106b(j11);
                return gVar;
            case '\b':
                gVar = new f();
                gVar.m106b(j11);
                return gVar;
            case '\t':
                gVar = new c();
                gVar.m106b(j11);
                return gVar;
            case '\n':
                gVar = new d();
                gVar.m106b(j11);
                return gVar;
            case 11:
                gVar = new a();
                gVar.m106b(j11);
                return gVar;
            default:
                return null;
        }
    }

    /* renamed from: e */
    public float m96469e(float f11, long j11, View view, C0023d c0023d) {
        boolean z11;
        this.f146a.mo42e(f11, this.f152g);
        float[] fArr = this.f152g;
        float f12 = fArr[1];
        if (f12 == 0.0f) {
            this.f153h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f155j)) {
            float m64a = c0023d.m64a(view, this.f151f, 0);
            this.f155j = m64a;
            if (Float.isNaN(m64a)) {
                this.f155j = 0.0f;
            }
        }
        float f13 = (float) ((this.f155j + (((j11 - this.f154i) * 1.0E-9d) * f12)) % 1.0d);
        this.f155j = f13;
        c0023d.m65b(view, this.f151f, 0, f13);
        this.f154i = j11;
        float f14 = this.f152g[0];
        float m105a = (m105a(this.f155j) * f14) + this.f152g[2];
        if (f14 == 0.0f && f12 == 0.0f) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f153h = z11;
        return m105a;
    }

    /* renamed from: h */
    public abstract boolean mo96470h(View view, float f11, long j11, C0023d c0023d);
}

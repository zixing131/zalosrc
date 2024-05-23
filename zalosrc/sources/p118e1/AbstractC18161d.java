package p118e1;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C1293a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p007a1.AbstractC0021b;
import p007a1.AbstractC0029j;

/* renamed from: e1.d */
/* loaded from: classes2.dex */
public abstract class AbstractC18161d extends AbstractC0029j {

    /* renamed from: e1.d$a */
    /* loaded from: classes2.dex */
    static class a extends AbstractC18161d {
        a() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setAlpha(m88a(f11));
        }
    }

    /* renamed from: e1.d$b */
    /* loaded from: classes2.dex */
    public static class b extends AbstractC18161d {

        /* renamed from: f */
        String f91833f;

        /* renamed from: g */
        SparseArray f91834g;

        /* renamed from: h */
        float[] f91835h;

        public b(String str, SparseArray sparseArray) {
            this.f91833f = str.split(",")[1];
            this.f91834g = sparseArray;
        }

        @Override // p007a1.AbstractC0029j
        /* renamed from: c */
        public void mo90c(int i11, float f11) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // p007a1.AbstractC0029j
        /* renamed from: e */
        public void mo92e(int i11) {
            int size = this.f91834g.size();
            int m6410g = ((C1293a) this.f91834g.valueAt(0)).m6410g();
            double[] dArr = new double[size];
            this.f91835h = new float[m6410g];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, m6410g);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.f91834g.keyAt(i12);
                C1293a c1293a = (C1293a) this.f91834g.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                c1293a.m6408e(this.f91835h);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f91835h.length) {
                        dArr2[i12][i13] = r6[i13];
                        i13++;
                    }
                }
            }
            this.f113a = AbstractC0021b.m57a(i11, dArr, dArr2);
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            this.f113a.mo42e(f11, this.f91835h);
            AbstractC18158a.m96455b((C1293a) this.f91834g.valueAt(0), view, this.f91835h);
        }

        /* renamed from: i */
        public void m96465i(int i11, C1293a c1293a) {
            this.f91834g.append(i11, c1293a);
        }
    }

    /* renamed from: e1.d$c */
    /* loaded from: classes2.dex */
    static class c extends AbstractC18161d {
        c() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setElevation(m88a(f11));
        }
    }

    /* renamed from: e1.d$d */
    /* loaded from: classes2.dex */
    public static class d extends AbstractC18161d {
        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
        }

        /* renamed from: i */
        public void m96466i(View view, float f11, double d11, double d12) {
            view.setRotation(m88a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }
    }

    /* renamed from: e1.d$e */
    /* loaded from: classes2.dex */
    static class e extends AbstractC18161d {
        e() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setPivotX(m88a(f11));
        }
    }

    /* renamed from: e1.d$f */
    /* loaded from: classes2.dex */
    static class f extends AbstractC18161d {
        f() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setPivotY(m88a(f11));
        }
    }

    /* renamed from: e1.d$g */
    /* loaded from: classes2.dex */
    static class g extends AbstractC18161d {

        /* renamed from: f */
        boolean f91836f = false;

        g() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m88a(f11));
                return;
            }
            if (this.f91836f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f91836f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m88a(f11)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: e1.d$h */
    /* loaded from: classes2.dex */
    static class h extends AbstractC18161d {
        h() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setRotation(m88a(f11));
        }
    }

    /* renamed from: e1.d$i */
    /* loaded from: classes2.dex */
    static class i extends AbstractC18161d {
        i() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setRotationX(m88a(f11));
        }
    }

    /* renamed from: e1.d$j */
    /* loaded from: classes2.dex */
    static class j extends AbstractC18161d {
        j() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setRotationY(m88a(f11));
        }
    }

    /* renamed from: e1.d$k */
    /* loaded from: classes2.dex */
    static class k extends AbstractC18161d {
        k() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setScaleX(m88a(f11));
        }
    }

    /* renamed from: e1.d$l */
    /* loaded from: classes2.dex */
    static class l extends AbstractC18161d {
        l() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setScaleY(m88a(f11));
        }
    }

    /* renamed from: e1.d$m */
    /* loaded from: classes2.dex */
    static class m extends AbstractC18161d {
        m() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setTranslationX(m88a(f11));
        }
    }

    /* renamed from: e1.d$n */
    /* loaded from: classes2.dex */
    static class n extends AbstractC18161d {
        n() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setTranslationY(m88a(f11));
        }
    }

    /* renamed from: e1.d$o */
    /* loaded from: classes2.dex */
    static class o extends AbstractC18161d {
        o() {
        }

        @Override // p118e1.AbstractC18161d
        /* renamed from: h */
        public void mo96464h(View view, float f11) {
            view.setTranslationZ(m88a(f11));
        }
    }

    /* renamed from: f */
    public static AbstractC18161d m96462f(String str, SparseArray sparseArray) {
        return new b(str, sparseArray);
    }

    /* renamed from: g */
    public static AbstractC18161d m96463g(String str) {
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
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = 11;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 14;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = 15;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case '\b':
                return new a();
            case '\t':
                return new e();
            case '\n':
                return new f();
            case 11:
                return new h();
            case '\f':
                return new c();
            case '\r':
                return new d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    /* renamed from: h */
    public abstract void mo96464h(View view, float f11);
}

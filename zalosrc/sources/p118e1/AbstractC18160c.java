package p118e1;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C1293a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p007a1.AbstractC0024e;

/* renamed from: e1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC18160c extends AbstractC0024e {

    /* renamed from: e1.c$a */
    /* loaded from: classes2.dex */
    static class a extends AbstractC18160c {
        a() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setAlpha(m66a(f11));
        }
    }

    /* renamed from: e1.c$b */
    /* loaded from: classes2.dex */
    static class b extends AbstractC18160c {

        /* renamed from: h */
        float[] f91830h = new float[1];

        /* renamed from: i */
        protected C1293a f91831i;

        b() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            this.f91830h[0] = m66a(f11);
            AbstractC18158a.m96455b(this.f91831i, view, this.f91830h);
        }
    }

    /* renamed from: e1.c$c */
    /* loaded from: classes2.dex */
    static class c extends AbstractC18160c {
        c() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setElevation(m66a(f11));
        }
    }

    /* renamed from: e1.c$d */
    /* loaded from: classes2.dex */
    public static class d extends AbstractC18160c {
        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
        }

        /* renamed from: h */
        public void m96461h(View view, float f11, double d11, double d12) {
            view.setRotation(m66a(f11) + ((float) Math.toDegrees(Math.atan2(d12, d11))));
        }
    }

    /* renamed from: e1.c$e */
    /* loaded from: classes2.dex */
    static class e extends AbstractC18160c {

        /* renamed from: h */
        boolean f91832h = false;

        e() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m66a(f11));
                return;
            }
            if (this.f91832h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f91832h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m66a(f11)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    /* renamed from: e1.c$f */
    /* loaded from: classes2.dex */
    static class f extends AbstractC18160c {
        f() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setRotation(m66a(f11));
        }
    }

    /* renamed from: e1.c$g */
    /* loaded from: classes2.dex */
    static class g extends AbstractC18160c {
        g() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setRotationX(m66a(f11));
        }
    }

    /* renamed from: e1.c$h */
    /* loaded from: classes2.dex */
    static class h extends AbstractC18160c {
        h() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setRotationY(m66a(f11));
        }
    }

    /* renamed from: e1.c$i */
    /* loaded from: classes2.dex */
    static class i extends AbstractC18160c {
        i() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setScaleX(m66a(f11));
        }
    }

    /* renamed from: e1.c$j */
    /* loaded from: classes2.dex */
    static class j extends AbstractC18160c {
        j() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setScaleY(m66a(f11));
        }
    }

    /* renamed from: e1.c$k */
    /* loaded from: classes2.dex */
    static class k extends AbstractC18160c {
        k() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setTranslationX(m66a(f11));
        }
    }

    /* renamed from: e1.c$l */
    /* loaded from: classes2.dex */
    static class l extends AbstractC18160c {
        l() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setTranslationY(m66a(f11));
        }
    }

    /* renamed from: e1.c$m */
    /* loaded from: classes2.dex */
    static class m extends AbstractC18160c {
        m() {
        }

        @Override // p118e1.AbstractC18160c
        /* renamed from: g */
        public void mo96460g(View view, float f11) {
            view.setTranslationZ(m66a(f11));
        }
    }

    /* renamed from: f */
    public static AbstractC18160c m96459f(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals("rotation")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c11 = 11;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case '\b':
                return new a();
            case '\t':
                return new f();
            case '\n':
                return new c();
            case 11:
                return new d();
            case '\f':
                return new a();
            case '\r':
                return new a();
            default:
                return null;
        }
    }

    /* renamed from: g */
    public abstract void mo96460g(View view, float f11);
}

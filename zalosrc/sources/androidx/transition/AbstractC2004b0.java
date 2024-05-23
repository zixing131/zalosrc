package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.AbstractC1579n0;

/* renamed from: androidx.transition.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2004b0 {

    /* renamed from: a */
    private static final AbstractC2016h0 f8543a;

    /* renamed from: b */
    static final Property f8544b;

    /* renamed from: c */
    static final Property f8545c;

    /* renamed from: androidx.transition.b0$a */
    /* loaded from: classes2.dex */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(AbstractC2004b0.m10969c(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            AbstractC2004b0.m10974h(view, f11.floatValue());
        }
    }

    /* renamed from: androidx.transition.b0$b */
    /* loaded from: classes2.dex */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Rect get(View view) {
            return AbstractC1579n0.m7911y(view);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Rect rect) {
            AbstractC1579n0.m7815H0(view, rect);
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f8543a = new C2014g0();
        } else if (i11 >= 23) {
            f8543a = new C2012f0();
        } else if (i11 >= 22) {
            f8543a = new C2010e0();
        } else {
            f8543a = new C2008d0();
        }
        f8544b = new a(Float.class, "translationAlpha");
        f8545c = new b(Rect.class, "clipBounds");
    }

    /* renamed from: a */
    public static void m10967a(View view) {
        f8543a.mo10983a(view);
    }

    /* renamed from: b */
    public static InterfaceC2002a0 m10968b(View view) {
        return new C2036z(view);
    }

    /* renamed from: c */
    public static float m10969c(View view) {
        return f8543a.mo10984c(view);
    }

    /* renamed from: d */
    public static InterfaceC2020j0 m10970d(View view) {
        return new C2018i0(view);
    }

    /* renamed from: e */
    public static void m10971e(View view) {
        f8543a.mo10985d(view);
    }

    /* renamed from: f */
    public static void m10972f(View view, Matrix matrix) {
        f8543a.mo10988e(view, matrix);
    }

    /* renamed from: g */
    public static void m10973g(View view, int i11, int i12, int i13, int i14) {
        f8543a.mo10992f(view, i11, i12, i13, i14);
    }

    /* renamed from: h */
    public static void m10974h(View view, float f11) {
        f8543a.mo10986g(view, f11);
    }

    /* renamed from: i */
    public static void m10975i(View view, int i11) {
        f8543a.mo11000h(view, i11);
    }

    /* renamed from: j */
    public static void m10976j(View view, Matrix matrix) {
        f8543a.mo10989i(view, matrix);
    }

    /* renamed from: k */
    public static void m10977k(View view, Matrix matrix) {
        f8543a.mo10990j(view, matrix);
    }
}

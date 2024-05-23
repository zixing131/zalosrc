package q20;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import s20.AbstractC26103e;
import ui0.C27280g;

/* renamed from: q20.h */
/* loaded from: classes5.dex */
public final class C25085h {

    /* renamed from: a */
    public static final C25085h f120485a = new C25085h();

    private C25085h() {
    }

    /* renamed from: c */
    public static /* synthetic */ Drawable m130019c(C25085h c25085h, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        if ((i17 & 1) != 0) {
            i18 = 0;
        } else {
            i18 = i11;
        }
        if ((i17 & 2) != 0) {
            i19 = 0;
        } else {
            i19 = i12;
        }
        if ((i17 & 4) != 0) {
            i21 = 0;
        } else {
            i21 = i13;
        }
        if ((i17 & 16) != 0) {
            i22 = 0;
        } else {
            i22 = i15;
        }
        if ((i17 & 32) != 0) {
            i23 = 0;
        } else {
            i23 = i16;
        }
        return c25085h.m130022a(i18, i19, i21, i14, i22, i23);
    }

    /* renamed from: g */
    public static /* synthetic */ Drawable m130020g(C25085h c25085h, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if ((i18 & 1) != 0) {
            i19 = 0;
        } else {
            i19 = i11;
        }
        if ((i18 & 2) != 0) {
            i21 = 0;
        } else {
            i21 = i12;
        }
        if ((i18 & 4) != 0) {
            i22 = 0;
        } else {
            i22 = i13;
        }
        if ((i18 & 8) != 0) {
            i23 = 0;
        } else {
            i23 = i14;
        }
        if ((i18 & 32) != 0) {
            i24 = 0;
        } else {
            i24 = i16;
        }
        if ((i18 & 64) != 0) {
            i25 = 0;
        } else {
            i25 = i17;
        }
        return c25085h.m130026f(i19, i21, i22, i23, i15, i24, i25);
    }

    /* renamed from: i */
    public static /* synthetic */ Drawable m130021i(C25085h c25085h, int i11, float f11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i15 & 4) != 0) {
            i12 = 0;
        }
        if ((i15 & 8) != 0) {
            i13 = 0;
        }
        if ((i15 & 16) != 0) {
            i14 = 872415231;
        }
        return c25085h.m130027h(i11, f11, i12, i13, i14);
    }

    /* renamed from: a */
    public final Drawable m130022a(int i11, int i12, int i13, int i14, int i15, int i16) {
        int m134327a;
        int m134327a2;
        int m134328b;
        Drawable m139659b;
        int m134328b2;
        if (i11 == 0) {
            m134327a = 0;
        } else {
            m134327a = AbstractC26103e.m134327a(CoreUtility.getAppContext(), i11);
        }
        if (i12 == 0) {
            m134327a2 = 0;
        } else {
            m134327a2 = AbstractC26103e.m134327a(CoreUtility.getAppContext(), i12);
        }
        if (i13 == 0) {
            m134328b = 0;
        } else {
            m134328b = AbstractC26103e.m134328b(CoreUtility.getAppContext(), i13);
        }
        if (i15 == 0) {
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            m139659b = C27280g.m139658a(appContext, i15);
            if (m139659b == null) {
                return null;
            }
        } else {
            Context appContext2 = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext2, "getAppContext(...)");
            m139659b = C27280g.m139659b(appContext2, i14, i15);
            if (m139659b == null) {
                return null;
            }
        }
        Drawable drawable = m139659b;
        if (i16 == 0) {
            m134328b2 = 0;
        } else {
            m134328b2 = AbstractC26103e.m134328b(CoreUtility.getAppContext(), i16);
        }
        return m130023b(m134327a, m134327a2, m134328b, drawable, m134328b2);
    }

    /* renamed from: b */
    public final Drawable m130023b(int i11, int i12, int i13, Drawable drawable, int i14) {
        AbstractC19074t.m100208f(drawable, "icon");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i11);
        gradientDrawable.setStroke(i13, i12);
        return m130024d(gradientDrawable, drawable, i14);
    }

    /* renamed from: d */
    public final Drawable m130024d(Drawable drawable, Drawable drawable2, int i11) {
        AbstractC19074t.m100208f(drawable, "shape");
        AbstractC19074t.m100208f(drawable2, "icon");
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerInset(1, i11, i11, i11, i11);
        return layerDrawable;
    }

    /* renamed from: e */
    public final Drawable m130025e(int i11, float f11, int i12, int i13, Drawable drawable, int i14) {
        AbstractC19074t.m100208f(drawable, "icon");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setStroke(i13, i12);
        return m130024d(gradientDrawable, drawable, i14);
    }

    /* renamed from: f */
    public final Drawable m130026f(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int m134327a;
        float m134329c;
        int m134327a2;
        int m134328b;
        Drawable m139659b;
        int m134328b2;
        if (i11 == 0) {
            m134327a = 0;
        } else {
            m134327a = AbstractC26103e.m134327a(CoreUtility.getAppContext(), i11);
        }
        if (i12 == 0) {
            m134329c = 0.0f;
        } else {
            m134329c = AbstractC26103e.m134329c(CoreUtility.getAppContext(), i12);
        }
        if (i13 == 0) {
            m134327a2 = 0;
        } else {
            m134327a2 = AbstractC26103e.m134327a(CoreUtility.getAppContext(), i13);
        }
        if (i14 == 0) {
            m134328b = 0;
        } else {
            m134328b = AbstractC26103e.m134328b(CoreUtility.getAppContext(), i14);
        }
        if (i16 == 0) {
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext(...)");
            m139659b = C27280g.m139658a(appContext, i16);
            if (m139659b == null) {
                return null;
            }
        } else {
            Context appContext2 = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext2, "getAppContext(...)");
            m139659b = C27280g.m139659b(appContext2, i15, i16);
            if (m139659b == null) {
                return null;
            }
        }
        Drawable drawable = m139659b;
        if (i17 == 0) {
            m134328b2 = 0;
        } else {
            m134328b2 = AbstractC26103e.m134328b(CoreUtility.getAppContext(), i17);
        }
        return m130025e(m134327a, m134329c, m134327a2, m134328b, drawable, m134328b2);
    }

    /* renamed from: h */
    public final Drawable m130027h(int i11, float f11, int i12, int i13, int i14) {
        ColorStateList valueOf = ColorStateList.valueOf(i14);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i11);
        gradientDrawable.setCornerRadius(f11);
        gradientDrawable.setStroke(i13, i12);
        float[] fArr = new float[8];
        for (int i15 = 0; i15 < 8; i15++) {
            fArr[i15] = f11;
        }
        return new RippleDrawable(valueOf, gradientDrawable, new ShapeDrawable(new RoundRectShape(fArr, null, null)));
    }
}

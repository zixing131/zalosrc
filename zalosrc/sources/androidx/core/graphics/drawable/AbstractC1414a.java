package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public abstract class AbstractC1414a {

    /* renamed from: a */
    private static Method f6213a;

    /* renamed from: b */
    private static boolean f6214b;

    /* renamed from: c */
    private static Method f6215c;

    /* renamed from: d */
    private static boolean f6216d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static int m7201a(Drawable drawable) {
            return drawable.getAlpha();
        }

        /* renamed from: b */
        static Drawable m7202b(DrawableContainer.DrawableContainerState drawableContainerState, int i11) {
            return drawableContainerState.getChild(i11);
        }

        /* renamed from: c */
        static Drawable m7203c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        /* renamed from: d */
        static boolean m7204d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        /* renamed from: e */
        static void m7205e(Drawable drawable, boolean z11) {
            drawable.setAutoMirrored(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        static void m7206a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        /* renamed from: b */
        static boolean m7207b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        /* renamed from: c */
        static ColorFilter m7208c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* renamed from: d */
        static void m7209d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: e */
        static void m7210e(Drawable drawable, float f11, float f12) {
            drawable.setHotspot(f11, f12);
        }

        /* renamed from: f */
        static void m7211f(Drawable drawable, int i11, int i12, int i13, int i14) {
            drawable.setHotspotBounds(i11, i12, i13, i14);
        }

        /* renamed from: g */
        static void m7212g(Drawable drawable, int i11) {
            drawable.setTint(i11);
        }

        /* renamed from: h */
        static void m7213h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* renamed from: i */
        static void m7214i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes2.dex */
    public static class c {
        /* renamed from: a */
        static int m7215a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        /* renamed from: b */
        static boolean m7216b(Drawable drawable, int i11) {
            return drawable.setLayoutDirection(i11);
        }
    }

    /* renamed from: a */
    public static void m7183a(Drawable drawable, Resources.Theme theme) {
        b.m7206a(drawable, theme);
    }

    /* renamed from: b */
    public static boolean m7184b(Drawable drawable) {
        return b.m7207b(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m7185c(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m7185c(a.m7203c((InsetDrawable) drawable));
            return;
        }
        if (drawable instanceof InterfaceC1417d) {
            m7185c(((InterfaceC1417d) drawable).mo7221a());
            return;
        }
        if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                Drawable m7202b = a.m7202b(drawableContainerState, i11);
                if (m7202b != null) {
                    m7185c(m7202b);
                }
            }
        }
    }

    /* renamed from: d */
    public static int m7186d(Drawable drawable) {
        return a.m7201a(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m7187e(Drawable drawable) {
        return b.m7208c(drawable);
    }

    /* renamed from: f */
    public static int m7188f(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m7215a(drawable);
        }
        if (!f6216d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f6215c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6216d = true;
        }
        Method method = f6215c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f6215c = null;
            }
        }
        return 0;
    }

    /* renamed from: g */
    public static void m7189g(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b.m7209d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: h */
    public static boolean m7190h(Drawable drawable) {
        return a.m7204d(drawable);
    }

    /* renamed from: i */
    public static void m7191i(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: j */
    public static void m7192j(Drawable drawable, boolean z11) {
        a.m7205e(drawable, z11);
    }

    /* renamed from: k */
    public static void m7193k(Drawable drawable, float f11, float f12) {
        b.m7210e(drawable, f11, f12);
    }

    /* renamed from: l */
    public static void m7194l(Drawable drawable, int i11, int i12, int i13, int i14) {
        b.m7211f(drawable, i11, i12, i13, i14);
    }

    /* renamed from: m */
    public static boolean m7195m(Drawable drawable, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.m7216b(drawable, i11);
        }
        if (!f6214b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f6213a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f6214b = true;
        }
        Method method = f6213a;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i11));
                return true;
            } catch (Exception unused2) {
                f6213a = null;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static void m7196n(Drawable drawable, int i11) {
        b.m7212g(drawable, i11);
    }

    /* renamed from: o */
    public static void m7197o(Drawable drawable, ColorStateList colorStateList) {
        b.m7213h(drawable, colorStateList);
    }

    /* renamed from: p */
    public static void m7198p(Drawable drawable, PorterDuff.Mode mode) {
        b.m7214i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static Drawable m7199q(Drawable drawable) {
        if (drawable instanceof InterfaceC1417d) {
            return ((InterfaceC1417d) drawable).mo7221a();
        }
        return drawable;
    }

    /* renamed from: r */
    public static Drawable m7200r(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof InterfaceC1416c)) {
            return new C1419f(drawable);
        }
        return drawable;
    }
}

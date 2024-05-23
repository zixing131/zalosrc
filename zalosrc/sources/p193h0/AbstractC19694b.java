package p193h0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.C1181j1;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1396c;
import java.util.WeakHashMap;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public abstract class AbstractC19694b {

    /* renamed from: a */
    private static final ThreadLocal f97701a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f97702b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f97703c = new Object();

    /* renamed from: h0.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        final ColorStateList f97704a;

        /* renamed from: b */
        final Configuration f97705b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.f97704a = colorStateList;
            this.f97705b = configuration;
        }
    }

    /* renamed from: a */
    private static void m103333a(Context context, int i11, ColorStateList colorStateList) {
        synchronized (f97703c) {
            try {
                WeakHashMap weakHashMap = f97702b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(i11, new a(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    private static ColorStateList m103334b(Context context, int i11) {
        a aVar;
        synchronized (f97703c) {
            try {
                SparseArray sparseArray = (SparseArray) f97702b.get(context);
                if (sparseArray != null && sparseArray.size() > 0 && (aVar = (a) sparseArray.get(i11)) != null) {
                    if (aVar.f97705b.equals(context.getResources().getConfiguration())) {
                        return aVar.f97704a;
                    }
                    sparseArray.remove(i11);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public static ColorStateList m103335c(Context context, int i11) {
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList = context.getColorStateList(i11);
            return colorStateList;
        }
        ColorStateList m103334b = m103334b(context, i11);
        if (m103334b != null) {
            return m103334b;
        }
        ColorStateList m103338f = m103338f(context, i11);
        if (m103338f != null) {
            m103333a(context, i11, m103338f);
            return m103338f;
        }
        return AbstractC1388a.m6962d(context, i11);
    }

    /* renamed from: d */
    public static Drawable m103336d(Context context, int i11) {
        return C1181j1.m5584h().m5593j(context, i11);
    }

    /* renamed from: e */
    private static TypedValue m103337e() {
        ThreadLocal threadLocal = f97701a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: f */
    private static ColorStateList m103338f(Context context, int i11) {
        if (m103339g(context, i11)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return AbstractC1396c.m7030a(resources, resources.getXml(i11), context.getTheme());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m103339g(Context context, int i11) {
        Resources resources = context.getResources();
        TypedValue m103337e = m103337e();
        resources.getValue(i11, m103337e, true);
        int i12 = m103337e.type;
        if (i12 >= 28 && i12 <= 31) {
            return true;
        }
        return false;
    }
}

package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.AbstractC1398e;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.graphics.AbstractC1425i;
import androidx.core.util.AbstractC1482d;
import androidx.core.util.AbstractC1487i;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.h */
/* loaded from: classes.dex */
public abstract class AbstractC1401h {

    /* renamed from: a */
    private static final ThreadLocal f6144a = new ThreadLocal();

    /* renamed from: b */
    private static final WeakHashMap f6145b = new WeakHashMap(0);

    /* renamed from: c */
    private static final Object f6146c = new Object();

    /* renamed from: androidx.core.content.res.h$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static Drawable m7091a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getDrawable(i11, theme);
        }

        /* renamed from: b */
        static Drawable m7092b(Resources resources, int i11, int i12, Resources.Theme theme) {
            return resources.getDrawableForDensity(i11, i12, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static int m7093a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColor(i11, theme);
        }

        /* renamed from: b */
        static ColorStateList m7094b(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        final ColorStateList f6147a;

        /* renamed from: b */
        final Configuration f6148b;

        /* renamed from: c */
        final int f6149c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f6147a = colorStateList;
            this.f6148b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f6149c = hashCode;
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        final Resources f6150a;

        /* renamed from: b */
        final Resources.Theme f6151b;

        d(Resources resources, Resources.Theme theme) {
            this.f6150a = resources;
            this.f6151b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f6150a.equals(dVar.f6150a) && AbstractC1482d.m7475a(this.f6151b, dVar.f6151b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1482d.m7476b(this.f6150a, this.f6151b);
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    /* loaded from: classes.dex */
    public static abstract class e {
        /* renamed from: e */
        public static Handler m7097e(Handler handler) {
            if (handler == null) {
                return new Handler(Looper.getMainLooper());
            }
            return handler;
        }

        /* renamed from: c */
        public final void m7100c(int i11, Handler handler) {
            m7097e(handler).post(new Runnable() { // from class: androidx.core.content.res.j

                /* renamed from: q */
                public final /* synthetic */ int f6158q;

                public /* synthetic */ RunnableC1403j(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1401h.e.this.m7098f(r2);
                }
            });
        }

        /* renamed from: d */
        public final void m7101d(Typeface typeface, Handler handler) {
            m7097e(handler).post(new Runnable() { // from class: androidx.core.content.res.i

                /* renamed from: q */
                public final /* synthetic */ Typeface f6156q;

                public /* synthetic */ RunnableC1402i(Typeface typeface2) {
                    r2 = typeface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC1401h.e.this.m7099g(r2);
                }
            });
        }

        /* renamed from: h */
        public abstract void m7098f(int i11);

        /* renamed from: i */
        public abstract void m7099g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$f */
    /* loaded from: classes2.dex */
    public static final class f {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$a */
        /* loaded from: classes2.dex */
        public static class a {

            /* renamed from: a */
            private static final Object f6152a = new Object();

            /* renamed from: b */
            private static Method f6153b;

            /* renamed from: c */
            private static boolean f6154c;

            /* renamed from: a */
            static void m7103a(Resources.Theme theme) {
                synchronized (f6152a) {
                    if (!f6154c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f6153b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException unused) {
                        }
                        f6154c = true;
                    }
                    Method method = f6153b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                            f6153b = null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$b */
        /* loaded from: classes2.dex */
        public static class b {
            /* renamed from: a */
            static void m7104a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m7102a(Resources.Theme theme) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                b.m7104a(theme);
            } else if (i11 >= 23) {
                a.m7103a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m7077a(d dVar, int i11, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f6146c) {
            try {
                WeakHashMap weakHashMap = f6145b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i11, new c(colorStateList, dVar.f6150a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:            if (r2.f6149c == r5.hashCode()) goto L54;     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ColorStateList m7078b(d dVar, int i11) {
        c cVar;
        synchronized (f6146c) {
            try {
                SparseArray sparseArray = (SparseArray) f6145b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i11)) != null) {
                    if (cVar.f6148b.equals(dVar.f6150a.getConfiguration())) {
                        Resources.Theme theme = dVar.f6151b;
                        if (theme == null) {
                            if (cVar.f6149c != 0) {
                            }
                            return cVar.f6147a;
                        }
                        if (theme != null) {
                        }
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
    public static Typeface m7079c(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m7089m(context, i11, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static int m7080d(Resources resources, int i11, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m7093a(resources, i11, theme);
        }
        return resources.getColor(i11);
    }

    /* renamed from: e */
    public static ColorStateList m7081e(Resources resources, int i11, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList m7078b = m7078b(dVar, i11);
        if (m7078b != null) {
            return m7078b;
        }
        ColorStateList m7087k = m7087k(resources, i11, theme);
        if (m7087k != null) {
            m7077a(dVar, i11, m7087k, theme);
            return m7087k;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return b.m7094b(resources, i11, theme);
        }
        return resources.getColorStateList(i11);
    }

    /* renamed from: f */
    public static Drawable m7082f(Resources resources, int i11, Resources.Theme theme) {
        return a.m7091a(resources, i11, theme);
    }

    /* renamed from: g */
    public static Typeface m7083g(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m7089m(context, i11, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: h */
    public static Typeface m7084h(Context context, int i11, TypedValue typedValue, int i12, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m7089m(context, i11, typedValue, i12, eVar, null, true, false);
    }

    /* renamed from: i */
    public static void m7085i(Context context, int i11, e eVar, Handler handler) {
        AbstractC1487i.m7492g(eVar);
        if (context.isRestricted()) {
            eVar.m7100c(-4, handler);
        } else {
            m7089m(context, i11, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    /* renamed from: j */
    private static TypedValue m7086j() {
        ThreadLocal threadLocal = f6144a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: k */
    private static ColorStateList m7087k(Resources resources, int i11, Resources.Theme theme) {
        if (m7088l(resources, i11)) {
            return null;
        }
        try {
            return AbstractC1396c.m7030a(resources, resources.getXml(i11), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static boolean m7088l(Resources resources, int i11) {
        TypedValue m7086j = m7086j();
        resources.getValue(i11, m7086j, true);
        int i12 = m7086j.type;
        if (i12 >= 28 && i12 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static Typeface m7089m(Context context, int i11, TypedValue typedValue, int i12, e eVar, Handler handler, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        Typeface m7090n = m7090n(context, resources, typedValue, i11, i12, eVar, handler, z11, z12);
        if (m7090n == null && eVar == null && !z12) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
        }
        return m7090n;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface m7090n(Context context, Resources resources, TypedValue typedValue, int i11, int i12, e eVar, Handler handler, boolean z11, boolean z12) {
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith("res/")) {
                if (eVar != null) {
                    eVar.m7100c(-3, handler);
                }
                return null;
            }
            Typeface m7260f = AbstractC1425i.m7260f(resources, i11, charSequence2, typedValue.assetCookie, i12);
            if (m7260f != null) {
                if (eVar != null) {
                    eVar.m7101d(m7260f, handler);
                }
                return m7260f;
            }
            if (z12) {
                return null;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(".xml")) {
                    AbstractC1398e.b m7051b = AbstractC1398e.m7051b(resources.getXml(i11), resources);
                    if (m7051b == null) {
                        if (eVar != null) {
                            eVar.m7100c(-3, handler);
                        }
                        return null;
                    }
                    return AbstractC1425i.m7257c(context, m7051b, resources, i11, charSequence2, typedValue.assetCookie, i12, eVar, handler, z11);
                }
                Typeface m7258d = AbstractC1425i.m7258d(context, resources, i11, charSequence2, typedValue.assetCookie, i12);
                if (eVar != null) {
                    if (m7258d != null) {
                        eVar.m7101d(m7258d, handler);
                    } else {
                        eVar.m7100c(-3, handler);
                    }
                }
                return m7258d;
            } catch (IOException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to read xml resource ");
                sb2.append(charSequence2);
                if (eVar != null) {
                    eVar.m7100c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to parse xml resource ");
                sb3.append(charSequence2);
                if (eVar != null) {
                }
                return null;
            }
        }
        throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i11) + "\" (" + Integer.toHexString(i11) + ") is not a Font: " + typedValue);
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.AbstractC1388a;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.vectordrawable.graphics.drawable.C2040d;
import androidx.vectordrawable.graphics.drawable.C2045i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p224i0.C20172a;
import p251j0.AbstractC20896a;
import p665y0.C30242d;
import p665y0.C30243e;
import p665y0.C30245g;
import p665y0.C30246h;

/* renamed from: androidx.appcompat.widget.j1 */
/* loaded from: classes.dex */
public final class C1181j1 {

    /* renamed from: i */
    private static C1181j1 f4650i;

    /* renamed from: a */
    private WeakHashMap f4652a;

    /* renamed from: b */
    private C30245g f4653b;

    /* renamed from: c */
    private C30246h f4654c;

    /* renamed from: d */
    private final WeakHashMap f4655d = new WeakHashMap(0);

    /* renamed from: e */
    private TypedValue f4656e;

    /* renamed from: f */
    private boolean f4657f;

    /* renamed from: g */
    private e f4658g;

    /* renamed from: h */
    private static final PorterDuff.Mode f4649h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final c f4651j = new c(6);

    /* renamed from: androidx.appcompat.widget.j1$a */
    /* loaded from: classes2.dex */
    public static class a implements d {
        a() {
        }

        @Override // androidx.appcompat.widget.C1181j1.d
        /* renamed from: a */
        public Drawable mo5601a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C20172a.m105194l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j1$b */
    /* loaded from: classes2.dex */
    public static class b implements d {
        b() {
        }

        @Override // androidx.appcompat.widget.C1181j1.d
        /* renamed from: a */
        public Drawable mo5601a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2040d.m11046c(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.j1$c */
    /* loaded from: classes.dex */
    public static class c extends C30243e {
        public c(int i11) {
            super(i11);
        }

        /* renamed from: k */
        private static int m5602k(int i11, PorterDuff.Mode mode) {
            return ((i11 + 31) * 31) + mode.hashCode();
        }

        /* renamed from: l */
        PorterDuffColorFilter m5603l(int i11, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) m149139d(Integer.valueOf(m5602k(i11, mode)));
        }

        /* renamed from: m */
        PorterDuffColorFilter m5604m(int i11, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) m149140e(Integer.valueOf(m5602k(i11, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.j1$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: a */
        Drawable mo5601a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.j1$e */
    /* loaded from: classes2.dex */
    public interface e {
        /* renamed from: a */
        Drawable mo5543a(C1181j1 c1181j1, Context context, int i11);

        /* renamed from: b */
        ColorStateList mo5544b(Context context, int i11);

        /* renamed from: c */
        boolean mo5545c(Context context, int i11, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo5546d(int i11);

        /* renamed from: e */
        boolean mo5547e(Context context, int i11, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.j1$f */
    /* loaded from: classes2.dex */
    public static class f implements d {
        f() {
        }

        @Override // androidx.appcompat.widget.C1181j1.d
        /* renamed from: a */
        public Drawable mo5601a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2045i.m11074d(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m5577a(String str, d dVar) {
        if (this.f4653b == null) {
            this.f4653b = new C30245g();
        }
        this.f4653b.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m5578b(Context context, long j11, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C30242d c30242d = (C30242d) this.f4655d.get(context);
                if (c30242d == null) {
                    c30242d = new C30242d();
                    this.f4655d.put(context, c30242d);
                }
                c30242d.m149132j(j11, new WeakReference(constantState));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    private void m5579c(Context context, int i11, ColorStateList colorStateList) {
        if (this.f4652a == null) {
            this.f4652a = new WeakHashMap();
        }
        C30246h c30246h = (C30246h) this.f4652a.get(context);
        if (c30246h == null) {
            c30246h = new C30246h();
            this.f4652a.put(context, c30246h);
        }
        c30246h.m149169a(i11, colorStateList);
    }

    /* renamed from: d */
    private void m5580d(Context context) {
        if (this.f4657f) {
            return;
        }
        this.f4657f = true;
        Drawable m5593j = m5593j(context, AbstractC20896a.abc_vector_test);
        if (m5593j != null && m5589q(m5593j)) {
            return;
        }
        this.f4657f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    /* renamed from: e */
    private static long m5581e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m5582f(Context context, int i11) {
        Drawable mo5543a;
        if (this.f4656e == null) {
            this.f4656e = new TypedValue();
        }
        TypedValue typedValue = this.f4656e;
        context.getResources().getValue(i11, typedValue, true);
        long m5581e = m5581e(typedValue);
        Drawable m5585i = m5585i(context, m5581e);
        if (m5585i != null) {
            return m5585i;
        }
        e eVar = this.f4658g;
        if (eVar == null) {
            mo5543a = null;
        } else {
            mo5543a = eVar.mo5543a(this, context, i11);
        }
        if (mo5543a != null) {
            mo5543a.setChangingConfigurations(typedValue.changingConfigurations);
            m5578b(context, m5581e, mo5543a);
        }
        return mo5543a;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m5583g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return m5586l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    /* renamed from: h */
    public static synchronized C1181j1 m5584h() {
        C1181j1 c1181j1;
        synchronized (C1181j1.class) {
            try {
                if (f4650i == null) {
                    C1181j1 c1181j12 = new C1181j1();
                    f4650i = c1181j12;
                    m5588p(c1181j12);
                }
                c1181j1 = f4650i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1181j1;
    }

    /* renamed from: i */
    private synchronized Drawable m5585i(Context context, long j11) {
        C30242d c30242d = (C30242d) this.f4655d.get(context);
        if (c30242d == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c30242d.m149128f(j11);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c30242d.m149133k(j11);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m5586l(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter m5603l;
        synchronized (C1181j1.class) {
            c cVar = f4651j;
            m5603l = cVar.m5603l(i11, mode);
            if (m5603l == null) {
                m5603l = new PorterDuffColorFilter(i11, mode);
                cVar.m5604m(i11, mode, m5603l);
            }
        }
        return m5603l;
    }

    /* renamed from: n */
    private ColorStateList m5587n(Context context, int i11) {
        C30246h c30246h;
        WeakHashMap weakHashMap = this.f4652a;
        if (weakHashMap == null || (c30246h = (C30246h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c30246h.m149172f(i11);
    }

    /* renamed from: p */
    private static void m5588p(C1181j1 c1181j1) {
        if (Build.VERSION.SDK_INT < 24) {
            c1181j1.m5577a("vector", new f());
            c1181j1.m5577a("animated-vector", new b());
            c1181j1.m5577a("animated-selector", new a());
        }
    }

    /* renamed from: q */
    private static boolean m5589q(Drawable drawable) {
        if (!(drawable instanceof C2045i) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private Drawable m5590r(Context context, int i11) {
        int next;
        C30245g c30245g = this.f4653b;
        if (c30245g == null || c30245g.isEmpty()) {
            return null;
        }
        C30246h c30246h = this.f4654c;
        if (c30246h != null) {
            String str = (String) c30246h.m149172f(i11);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f4653b.get(str) == null)) {
                return null;
            }
        } else {
            this.f4654c = new C30246h();
        }
        if (this.f4656e == null) {
            this.f4656e = new TypedValue();
        }
        TypedValue typedValue = this.f4656e;
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        long m5581e = m5581e(typedValue);
        Drawable m5585i = m5585i(context, m5581e);
        if (m5585i != null) {
            return m5585i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i11);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f4654c.m149169a(i11, name);
                    d dVar = (d) this.f4653b.get(name);
                    if (dVar != null) {
                        m5585i = dVar.mo5601a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m5585i != null) {
                        m5585i.setChangingConfigurations(typedValue.changingConfigurations);
                        m5578b(context, m5581e, m5585i);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (m5585i == null) {
            this.f4654c.m149169a(i11, "appcompat_skip_skip");
        }
        return m5585i;
    }

    /* renamed from: v */
    private Drawable m5591v(Context context, int i11, boolean z11, Drawable drawable) {
        ColorStateList m5595m = m5595m(context, i11);
        if (m5595m != null) {
            if (AbstractC1225y0.m5769a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m7200r = AbstractC1414a.m7200r(drawable);
            AbstractC1414a.m7197o(m7200r, m5595m);
            PorterDuff.Mode m5596o = m5596o(i11);
            if (m5596o != null) {
                AbstractC1414a.m7198p(m7200r, m5596o);
                return m7200r;
            }
            return m7200r;
        }
        e eVar = this.f4658g;
        if ((eVar == null || !eVar.mo5547e(context, i11, drawable)) && !m5600x(context, i11, drawable) && z11) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    public static void m5592w(Drawable drawable, C1205r1 c1205r1, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        if (AbstractC1225y0.m5769a(drawable) && drawable.mutate() != drawable) {
            return;
        }
        boolean z11 = c1205r1.f4718d;
        if (!z11 && !c1205r1.f4717c) {
            drawable.clearColorFilter();
        } else {
            if (z11) {
                colorStateList = c1205r1.f4715a;
            } else {
                colorStateList = null;
            }
            if (c1205r1.f4717c) {
                mode = c1205r1.f4716b;
            } else {
                mode = f4649h;
            }
            drawable.setColorFilter(m5583g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m5593j(Context context, int i11) {
        return m5594k(context, i11, false);
    }

    /* renamed from: k */
    public synchronized Drawable m5594k(Context context, int i11, boolean z11) {
        Drawable m5590r;
        try {
            m5580d(context);
            m5590r = m5590r(context, i11);
            if (m5590r == null) {
                m5590r = m5582f(context, i11);
            }
            if (m5590r == null) {
                m5590r = AbstractC1388a.m6964f(context, i11);
            }
            if (m5590r != null) {
                m5590r = m5591v(context, i11, z11, m5590r);
            }
            if (m5590r != null) {
                AbstractC1225y0.m5770b(m5590r);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return m5590r;
    }

    /* renamed from: m */
    public synchronized ColorStateList m5595m(Context context, int i11) {
        ColorStateList m5587n;
        m5587n = m5587n(context, i11);
        if (m5587n == null) {
            e eVar = this.f4658g;
            if (eVar == null) {
                m5587n = null;
            } else {
                m5587n = eVar.mo5544b(context, i11);
            }
            if (m5587n != null) {
                m5579c(context, i11, m5587n);
            }
        }
        return m5587n;
    }

    /* renamed from: o */
    PorterDuff.Mode m5596o(int i11) {
        e eVar = this.f4658g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo5546d(i11);
    }

    /* renamed from: s */
    public synchronized void m5597s(Context context) {
        C30242d c30242d = (C30242d) this.f4655d.get(context);
        if (c30242d != null) {
            c30242d.m149126b();
        }
    }

    /* renamed from: t */
    public synchronized Drawable m5598t(Context context, C1229z1 c1229z1, int i11) {
        try {
            Drawable m5590r = m5590r(context, i11);
            if (m5590r == null) {
                m5590r = c1229z1.m5795c(i11);
            }
            if (m5590r != null) {
                return m5591v(context, i11, false, m5590r);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    public synchronized void m5599u(e eVar) {
        this.f4658g = eVar;
    }

    /* renamed from: x */
    public boolean m5600x(Context context, int i11, Drawable drawable) {
        e eVar = this.f4658g;
        if (eVar != null && eVar.mo5545c(context, i11, drawable)) {
            return true;
        }
        return false;
    }
}

package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import dn0.AbstractC18031a;
import en0.InterfaceC18494a;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import mn0.InterfaceC23364b;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: androidx.window.layout.t */
/* loaded from: classes2.dex */
public final class C2122t {

    /* renamed from: a */
    public static final C2122t f9003a = new C2122t();

    /* renamed from: b */
    private static final InterfaceC24854k f9004b;

    /* renamed from: androidx.window.layout.t$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ClassLoader f9005q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ClassLoader classLoader) {
            super(0);
            this.f9005q = classLoader;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            C2122t c2122t = C2122t.f9003a;
            Class m11387l = c2122t.m11387l(this.f9005q);
            boolean z11 = false;
            Method method = m11387l.getMethod("getBounds", new Class[0]);
            Method method2 = m11387l.getMethod("getType", new Class[0]);
            Method method3 = m11387l.getMethod("getState", new Class[0]);
            AbstractC19074t.m100207e(method, "getBoundsMethod");
            if (c2122t.m11386k(method, AbstractC19061k0.m100169b(Rect.class)) && c2122t.m11389o(method)) {
                AbstractC19074t.m100207e(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (c2122t.m11386k(method2, AbstractC19061k0.m100169b(cls)) && c2122t.m11389o(method2)) {
                    AbstractC19074t.m100207e(method3, "getStateMethod");
                    if (c2122t.m11386k(method3, AbstractC19061k0.m100169b(cls)) && c2122t.m11389o(method3)) {
                        z11 = true;
                    }
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: androidx.window.layout.t$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ClassLoader f9006q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f9006q = classLoader;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            C2122t c2122t = C2122t.f9003a;
            boolean z11 = false;
            Method method = c2122t.m11394t(this.f9006q).getMethod("getWindowLayoutComponent", new Class[0]);
            Class m11396v = c2122t.m11396v(this.f9006q);
            AbstractC19074t.m100207e(method, "getWindowLayoutComponentMethod");
            if (c2122t.m11389o(method)) {
                AbstractC19074t.m100207e(m11396v, "windowLayoutComponentClass");
                if (c2122t.m11385j(method, m11396v)) {
                    z11 = true;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: androidx.window.layout.t$c */
    /* loaded from: classes2.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ClassLoader f9007q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ClassLoader classLoader) {
            super(0);
            this.f9007q = classLoader;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            C2122t c2122t = C2122t.f9003a;
            Class m11396v = c2122t.m11396v(this.f9007q);
            boolean z11 = false;
            Method method = m11396v.getMethod("addWindowLayoutInfoListener", Activity.class, AbstractC2123u.m11403a());
            Method method2 = m11396v.getMethod("removeWindowLayoutInfoListener", AbstractC2123u.m11403a());
            AbstractC19074t.m100207e(method, "addListenerMethod");
            if (c2122t.m11389o(method)) {
                AbstractC19074t.m100207e(method2, "removeListenerMethod");
                if (c2122t.m11389o(method2)) {
                    z11 = true;
                }
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: androidx.window.layout.t$d */
    /* loaded from: classes2.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ClassLoader f9008q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ClassLoader classLoader) {
            super(0);
            this.f9008q = classLoader;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            C2122t c2122t = C2122t.f9003a;
            boolean z11 = false;
            Method declaredMethod = c2122t.m11395u(this.f9008q).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class m11394t = c2122t.m11394t(this.f9008q);
            AbstractC19074t.m100207e(declaredMethod, "getWindowExtensionsMethod");
            AbstractC19074t.m100207e(m11394t, "windowExtensionsClass");
            if (c2122t.m11385j(declaredMethod, m11394t) && c2122t.m11389o(declaredMethod)) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: androidx.window.layout.t$e */
    /* loaded from: classes2.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f9009q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final WindowLayoutComponent mo12V4() {
            ClassLoader classLoader = C2122t.class.getClassLoader();
            if (classLoader != null && C2122t.f9003a.m11384i(classLoader)) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(e.f9009q);
        f9004b = m129210a;
    }

    private C2122t() {
    }

    /* renamed from: i */
    public final boolean m11384i(ClassLoader classLoader) {
        if (Build.VERSION.SDK_INT < 24 || !m11392r(classLoader) || !m11390p(classLoader) || !m11391q(classLoader) || !m11388n(classLoader)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m11385j(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    /* renamed from: k */
    public final boolean m11386k(Method method, InterfaceC23364b interfaceC23364b) {
        return m11385j(method, AbstractC18031a.m95868a(interfaceC23364b));
    }

    /* renamed from: l */
    public final Class m11387l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* renamed from: n */
    private final boolean m11388n(ClassLoader classLoader) {
        return m11393s(new a(classLoader));
    }

    /* renamed from: o */
    public final boolean m11389o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* renamed from: p */
    private final boolean m11390p(ClassLoader classLoader) {
        return m11393s(new b(classLoader));
    }

    /* renamed from: q */
    private final boolean m11391q(ClassLoader classLoader) {
        return m11393s(new c(classLoader));
    }

    /* renamed from: r */
    private final boolean m11392r(ClassLoader classLoader) {
        return m11393s(new d(classLoader));
    }

    /* renamed from: s */
    private final boolean m11393s(InterfaceC18494a interfaceC18494a) {
        try {
            return ((Boolean) interfaceC18494a.mo12V4()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final Class m11394t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* renamed from: u */
    public final Class m11395u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* renamed from: v */
    public final Class m11396v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    /* renamed from: m */
    public final WindowLayoutComponent m11397m() {
        return (WindowLayoutComponent) f9004b.getValue();
    }
}

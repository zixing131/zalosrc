package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C1421e;
import androidx.core.util.AbstractC1482d;
import androidx.core.util.AbstractC1487i;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.n1 */
/* loaded from: classes.dex */
public class C1580n1 {

    /* renamed from: b */
    public static final C1580n1 f6524b;

    /* renamed from: a */
    private final l f6525a;

    /* renamed from: androidx.core.view.n1$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private static Field f6526a;

        /* renamed from: b */
        private static Field f6527b;

        /* renamed from: c */
        private static Field f6528c;

        /* renamed from: d */
        private static boolean f6529d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f6526a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f6527b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f6528c = declaredField3;
                declaredField3.setAccessible(true);
                f6529d = true;
            } catch (ReflectiveOperationException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to get visible insets from AttachInfo ");
                sb2.append(e11.getMessage());
            }
        }

        /* renamed from: a */
        public static C1580n1 m8072a(View view) {
            if (f6529d && view.isAttachedToWindow()) {
                try {
                    Object obj = f6526a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f6527b.get(obj);
                        Rect rect2 = (Rect) f6528c.get(obj);
                        if (rect != null && rect2 != null) {
                            C1580n1 m8073a = new b().m8075c(C1421e.m7231c(rect)).m8076d(C1421e.m7231c(rect2)).m8073a();
                            m8073a.m8069v(m8073a);
                            m8073a.m8052d(view.getRootView());
                            return m8073a;
                        }
                    }
                } catch (IllegalAccessException e11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to get insets from AttachInfo. ");
                    sb2.append(e11.getMessage());
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        e() {
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: c */
        void mo8084c(int i11, C1421e c1421e) {
            this.f6537c.setInsets(n.m8119a(i11), c1421e.m7234f());
        }

        e(C1580n1 c1580n1) {
            super(c1580n1);
        }
    }

    /* renamed from: androidx.core.view.n1$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        private final C1580n1 f6538a;

        /* renamed from: b */
        C1421e[] f6539b;

        f() {
            this(new C1580n1((C1580n1) null));
        }

        /* renamed from: a */
        protected final void m8085a() {
            C1421e[] c1421eArr = this.f6539b;
            if (c1421eArr != null) {
                C1421e c1421e = c1421eArr[m.m8115c(1)];
                C1421e c1421e2 = this.f6539b[m.m8115c(2)];
                if (c1421e2 == null) {
                    c1421e2 = this.f6538a.m8054f(2);
                }
                if (c1421e == null) {
                    c1421e = this.f6538a.m8054f(1);
                }
                mo8080g(C1421e.m7229a(c1421e, c1421e2));
                C1421e c1421e3 = this.f6539b[m.m8115c(16)];
                if (c1421e3 != null) {
                    mo8082f(c1421e3);
                }
                C1421e c1421e4 = this.f6539b[m.m8115c(32)];
                if (c1421e4 != null) {
                    mo8081d(c1421e4);
                }
                C1421e c1421e5 = this.f6539b[m.m8115c(64)];
                if (c1421e5 != null) {
                    mo8083h(c1421e5);
                }
            }
        }

        /* renamed from: b */
        abstract C1580n1 mo8078b();

        /* renamed from: c */
        void mo8084c(int i11, C1421e c1421e) {
            if (this.f6539b == null) {
                this.f6539b = new C1421e[9];
            }
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    this.f6539b[m.m8115c(i12)] = c1421e;
                }
            }
        }

        /* renamed from: d */
        void mo8081d(C1421e c1421e) {
        }

        /* renamed from: e */
        abstract void mo8079e(C1421e c1421e);

        /* renamed from: f */
        void mo8082f(C1421e c1421e) {
        }

        /* renamed from: g */
        abstract void mo8080g(C1421e c1421e);

        /* renamed from: h */
        void mo8083h(C1421e c1421e) {
        }

        f(C1580n1 c1580n1) {
            this.f6538a = c1580n1;
        }
    }

    /* renamed from: androidx.core.view.n1$g */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h */
        private static boolean f6540h = false;

        /* renamed from: i */
        private static Method f6541i;

        /* renamed from: j */
        private static Class f6542j;

        /* renamed from: k */
        private static Field f6543k;

        /* renamed from: l */
        private static Field f6544l;

        /* renamed from: c */
        final WindowInsets f6545c;

        /* renamed from: d */
        private C1421e[] f6546d;

        /* renamed from: e */
        private C1421e f6547e;

        /* renamed from: f */
        private C1580n1 f6548f;

        /* renamed from: g */
        C1421e f6549g;

        g(C1580n1 c1580n1, WindowInsets windowInsets) {
            super(c1580n1);
            this.f6547e = null;
            this.f6545c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: A */
        private static void m8086A() {
            try {
                f6541i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f6542j = cls;
                f6543k = cls.getDeclaredField("mVisibleInsets");
                f6544l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f6543k.setAccessible(true);
                f6544l.setAccessible(true);
            } catch (ReflectiveOperationException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to get visible insets. (Reflection error). ");
                sb2.append(e11.getMessage());
            }
            f6540h = true;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: v */
        private C1421e m8087v(int i11, boolean z11) {
            C1421e c1421e = C1421e.f6229e;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0) {
                    c1421e = C1421e.m7229a(c1421e, m8101w(i12, z11));
                }
            }
            return c1421e;
        }

        /* renamed from: x */
        private C1421e m8088x() {
            C1580n1 c1580n1 = this.f6548f;
            if (c1580n1 != null) {
                return c1580n1.m8057i();
            }
            return C1421e.f6229e;
        }

        /* renamed from: y */
        private C1421e m8089y(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f6540h) {
                    m8086A();
                }
                Method method = f6541i;
                if (method != null && f6542j != null && f6543k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f6543k.get(f6544l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return C1421e.m7231c(rect);
                    } catch (ReflectiveOperationException e11) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Failed to get visible insets. (Reflection error). ");
                        sb2.append(e11.getMessage());
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: d */
        void mo8090d(View view) {
            C1421e m8089y = m8089y(view);
            if (m8089y == null) {
                m8089y = C1421e.f6229e;
            }
            mo8099s(m8089y);
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: e */
        void mo8091e(C1580n1 c1580n1) {
            c1580n1.m8069v(this.f6548f);
            c1580n1.m8068u(this.f6549g);
        }

        @Override // androidx.core.view.C1580n1.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f6549g, ((g) obj).f6549g);
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: g */
        public C1421e mo8092g(int i11) {
            return m8087v(i11, false);
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: h */
        public C1421e mo8093h(int i11) {
            return m8087v(i11, true);
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: l */
        final C1421e mo8094l() {
            if (this.f6547e == null) {
                this.f6547e = C1421e.m7230b(this.f6545c.getSystemWindowInsetLeft(), this.f6545c.getSystemWindowInsetTop(), this.f6545c.getSystemWindowInsetRight(), this.f6545c.getSystemWindowInsetBottom());
            }
            return this.f6547e;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: n */
        C1580n1 mo8095n(int i11, int i12, int i13, int i14) {
            b bVar = new b(C1580n1.m8047y(this.f6545c));
            bVar.m8076d(C1580n1.m8046p(mo8094l(), i11, i12, i13, i14));
            bVar.m8075c(C1580n1.m8046p(mo8105j(), i11, i12, i13, i14));
            return bVar.m8073a();
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: p */
        boolean mo8096p() {
            return this.f6545c.isRound();
        }

        @Override // androidx.core.view.C1580n1.l
        @SuppressLint({"WrongConstant"})
        /* renamed from: q */
        boolean mo8097q(int i11) {
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i11 & i12) != 0 && !m8102z(i12)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: r */
        public void mo8098r(C1421e[] c1421eArr) {
            this.f6546d = c1421eArr;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: s */
        void mo8099s(C1421e c1421e) {
            this.f6549g = c1421e;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: t */
        void mo8100t(C1580n1 c1580n1) {
            this.f6548f = c1580n1;
        }

        /* renamed from: w */
        protected C1421e m8101w(int i11, boolean z11) {
            int i12;
            C1594r mo8109f;
            if (i11 != 1) {
                C1421e c1421e = null;
                if (i11 != 2) {
                    if (i11 != 8) {
                        if (i11 != 16) {
                            if (i11 != 32) {
                                if (i11 != 64) {
                                    if (i11 != 128) {
                                        return C1421e.f6229e;
                                    }
                                    C1580n1 c1580n1 = this.f6548f;
                                    if (c1580n1 != null) {
                                        mo8109f = c1580n1.m8053e();
                                    } else {
                                        mo8109f = mo8109f();
                                    }
                                    if (mo8109f != null) {
                                        return C1421e.m7230b(mo8109f.m8159b(), mo8109f.m8161d(), mo8109f.m8160c(), mo8109f.m8158a());
                                    }
                                    return C1421e.f6229e;
                                }
                                return mo8112m();
                            }
                            return mo8110i();
                        }
                        return mo8111k();
                    }
                    C1421e[] c1421eArr = this.f6546d;
                    if (c1421eArr != null) {
                        c1421e = c1421eArr[m.m8115c(8)];
                    }
                    if (c1421e != null) {
                        return c1421e;
                    }
                    C1421e mo8094l = mo8094l();
                    C1421e m8088x = m8088x();
                    int i13 = mo8094l.f6233d;
                    if (i13 > m8088x.f6233d) {
                        return C1421e.m7230b(0, 0, 0, i13);
                    }
                    C1421e c1421e2 = this.f6549g;
                    if (c1421e2 != null && !c1421e2.equals(C1421e.f6229e) && (i12 = this.f6549g.f6233d) > m8088x.f6233d) {
                        return C1421e.m7230b(0, 0, 0, i12);
                    }
                    return C1421e.f6229e;
                }
                if (z11) {
                    C1421e m8088x2 = m8088x();
                    C1421e mo8105j = mo8105j();
                    return C1421e.m7230b(Math.max(m8088x2.f6230a, mo8105j.f6230a), 0, Math.max(m8088x2.f6232c, mo8105j.f6232c), Math.max(m8088x2.f6233d, mo8105j.f6233d));
                }
                C1421e mo8094l2 = mo8094l();
                C1580n1 c1580n12 = this.f6548f;
                if (c1580n12 != null) {
                    c1421e = c1580n12.m8057i();
                }
                int i14 = mo8094l2.f6233d;
                if (c1421e != null) {
                    i14 = Math.min(i14, c1421e.f6233d);
                }
                return C1421e.m7230b(mo8094l2.f6230a, 0, mo8094l2.f6232c, i14);
            }
            if (z11) {
                return C1421e.m7230b(0, Math.max(m8088x().f6231b, mo8094l().f6231b), 0, 0);
            }
            return C1421e.m7230b(0, mo8094l().f6231b, 0, 0);
        }

        /* renamed from: z */
        protected boolean m8102z(int i11) {
            if (i11 != 1 && i11 != 2) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 != 8 && i11 != 128) {
                    return true;
                }
            }
            return !m8101w(i11, false).equals(C1421e.f6229e);
        }

        g(C1580n1 c1580n1, g gVar) {
            this(c1580n1, new WindowInsets(gVar.f6545c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$h */
    /* loaded from: classes.dex */
    public static class h extends g {

        /* renamed from: m */
        private C1421e f6550m;

        h(C1580n1 c1580n1, WindowInsets windowInsets) {
            super(c1580n1, windowInsets);
            this.f6550m = null;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: b */
        C1580n1 mo8103b() {
            return C1580n1.m8047y(this.f6545c.consumeStableInsets());
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: c */
        C1580n1 mo8104c() {
            return C1580n1.m8047y(this.f6545c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: j */
        final C1421e mo8105j() {
            if (this.f6550m == null) {
                this.f6550m = C1421e.m7230b(this.f6545c.getStableInsetLeft(), this.f6545c.getStableInsetTop(), this.f6545c.getStableInsetRight(), this.f6545c.getStableInsetBottom());
            }
            return this.f6550m;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: o */
        boolean mo8106o() {
            return this.f6545c.isConsumed();
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: u */
        public void mo8107u(C1421e c1421e) {
            this.f6550m = c1421e;
        }

        h(C1580n1 c1580n1, h hVar) {
            super(c1580n1, hVar);
            this.f6550m = null;
            this.f6550m = hVar.f6550m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$i */
    /* loaded from: classes.dex */
    public static class i extends h {
        i(C1580n1 c1580n1, WindowInsets windowInsets) {
            super(c1580n1, windowInsets);
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: a */
        C1580n1 mo8108a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f6545c.consumeDisplayCutout();
            return C1580n1.m8047y(consumeDisplayCutout);
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f6545c, iVar.f6545c) && Objects.equals(this.f6549g, iVar.f6549g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: f */
        C1594r mo8109f() {
            DisplayCutout displayCutout;
            displayCutout = this.f6545c.getDisplayCutout();
            return C1594r.m8157e(displayCutout);
        }

        @Override // androidx.core.view.C1580n1.l
        public int hashCode() {
            return this.f6545c.hashCode();
        }

        i(C1580n1 c1580n1, i iVar) {
            super(c1580n1, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$j */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: n */
        private C1421e f6551n;

        /* renamed from: o */
        private C1421e f6552o;

        /* renamed from: p */
        private C1421e f6553p;

        j(C1580n1 c1580n1, WindowInsets windowInsets) {
            super(c1580n1, windowInsets);
            this.f6551n = null;
            this.f6552o = null;
            this.f6553p = null;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: i */
        C1421e mo8110i() {
            Insets mandatorySystemGestureInsets;
            if (this.f6552o == null) {
                mandatorySystemGestureInsets = this.f6545c.getMandatorySystemGestureInsets();
                this.f6552o = C1421e.m7233e(mandatorySystemGestureInsets);
            }
            return this.f6552o;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: k */
        C1421e mo8111k() {
            Insets systemGestureInsets;
            if (this.f6551n == null) {
                systemGestureInsets = this.f6545c.getSystemGestureInsets();
                this.f6551n = C1421e.m7233e(systemGestureInsets);
            }
            return this.f6551n;
        }

        @Override // androidx.core.view.C1580n1.l
        /* renamed from: m */
        C1421e mo8112m() {
            Insets tappableElementInsets;
            if (this.f6553p == null) {
                tappableElementInsets = this.f6545c.getTappableElementInsets();
                this.f6553p = C1421e.m7233e(tappableElementInsets);
            }
            return this.f6553p;
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        /* renamed from: n */
        C1580n1 mo8095n(int i11, int i12, int i13, int i14) {
            WindowInsets inset;
            inset = this.f6545c.inset(i11, i12, i13, i14);
            return C1580n1.m8047y(inset);
        }

        @Override // androidx.core.view.C1580n1.h, androidx.core.view.C1580n1.l
        /* renamed from: u */
        public void mo8107u(C1421e c1421e) {
        }

        j(C1580n1 c1580n1, j jVar) {
            super(c1580n1, jVar);
            this.f6551n = null;
            this.f6552o = null;
            this.f6553p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$k */
    /* loaded from: classes.dex */
    public static class k extends j {

        /* renamed from: q */
        static final C1580n1 f6554q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f6554q = C1580n1.m8047y(windowInsets);
        }

        k(C1580n1 c1580n1, WindowInsets windowInsets) {
            super(c1580n1, windowInsets);
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        /* renamed from: d */
        final void mo8090d(View view) {
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        /* renamed from: g */
        public C1421e mo8092g(int i11) {
            Insets insets;
            insets = this.f6545c.getInsets(n.m8119a(i11));
            return C1421e.m7233e(insets);
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        /* renamed from: h */
        public C1421e mo8093h(int i11) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f6545c.getInsetsIgnoringVisibility(n.m8119a(i11));
            return C1421e.m7233e(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.C1580n1.g, androidx.core.view.C1580n1.l
        /* renamed from: q */
        public boolean mo8097q(int i11) {
            boolean isVisible;
            isVisible = this.f6545c.isVisible(n.m8119a(i11));
            return isVisible;
        }

        k(C1580n1 c1580n1, k kVar) {
            super(c1580n1, kVar);
        }
    }

    /* renamed from: androidx.core.view.n1$l */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b */
        static final C1580n1 f6555b = new b().m8073a().m8049a().m8050b().m8051c();

        /* renamed from: a */
        final C1580n1 f6556a;

        l(C1580n1 c1580n1) {
            this.f6556a = c1580n1;
        }

        /* renamed from: a */
        C1580n1 mo8108a() {
            return this.f6556a;
        }

        /* renamed from: b */
        C1580n1 mo8103b() {
            return this.f6556a;
        }

        /* renamed from: c */
        C1580n1 mo8104c() {
            return this.f6556a;
        }

        /* renamed from: d */
        void mo8090d(View view) {
        }

        /* renamed from: e */
        void mo8091e(C1580n1 c1580n1) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (mo8096p() == lVar.mo8096p() && mo8106o() == lVar.mo8106o() && AbstractC1482d.m7475a(mo8094l(), lVar.mo8094l()) && AbstractC1482d.m7475a(mo8105j(), lVar.mo8105j()) && AbstractC1482d.m7475a(mo8109f(), lVar.mo8109f())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        C1594r mo8109f() {
            return null;
        }

        /* renamed from: g */
        C1421e mo8092g(int i11) {
            return C1421e.f6229e;
        }

        /* renamed from: h */
        C1421e mo8093h(int i11) {
            if ((i11 & 8) == 0) {
                return C1421e.f6229e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return AbstractC1482d.m7476b(Boolean.valueOf(mo8096p()), Boolean.valueOf(mo8106o()), mo8094l(), mo8105j(), mo8109f());
        }

        /* renamed from: i */
        C1421e mo8110i() {
            return mo8094l();
        }

        /* renamed from: j */
        C1421e mo8105j() {
            return C1421e.f6229e;
        }

        /* renamed from: k */
        C1421e mo8111k() {
            return mo8094l();
        }

        /* renamed from: l */
        C1421e mo8094l() {
            return C1421e.f6229e;
        }

        /* renamed from: m */
        C1421e mo8112m() {
            return mo8094l();
        }

        /* renamed from: n */
        C1580n1 mo8095n(int i11, int i12, int i13, int i14) {
            return f6555b;
        }

        /* renamed from: o */
        boolean mo8106o() {
            return false;
        }

        /* renamed from: p */
        boolean mo8096p() {
            return false;
        }

        /* renamed from: q */
        boolean mo8097q(int i11) {
            return true;
        }

        /* renamed from: r */
        public void mo8098r(C1421e[] c1421eArr) {
        }

        /* renamed from: s */
        void mo8099s(C1421e c1421e) {
        }

        /* renamed from: t */
        void mo8100t(C1580n1 c1580n1) {
        }

        /* renamed from: u */
        public void mo8107u(C1421e c1421e) {
        }
    }

    /* renamed from: androidx.core.view.n1$m */
    /* loaded from: classes.dex */
    public static final class m {
        /* renamed from: a */
        public static int m8113a() {
            return 128;
        }

        /* renamed from: b */
        public static int m8114b() {
            return 8;
        }

        /* renamed from: c */
        static int m8115c(int i11) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return 1;
                }
                if (i11 == 4) {
                    return 2;
                }
                if (i11 != 8) {
                    if (i11 == 16) {
                        return 4;
                    }
                    if (i11 != 32) {
                        if (i11 != 64) {
                            if (i11 != 128) {
                                if (i11 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i11);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        /* renamed from: d */
        public static int m8116d() {
            return 2;
        }

        /* renamed from: e */
        public static int m8117e() {
            return 1;
        }

        /* renamed from: f */
        public static int m8118f() {
            return 7;
        }
    }

    /* renamed from: androidx.core.view.n1$n */
    /* loaded from: classes.dex */
    private static final class n {
        /* renamed from: a */
        static int m8119a(int i11) {
            int statusBars;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i11 & i13) != 0) {
                    if (i13 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i12 |= statusBars;
                }
            }
            return i12;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f6524b = k.f6554q;
        } else {
            f6524b = l.f6555b;
        }
    }

    private C1580n1(WindowInsets windowInsets) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            this.f6525a = new k(this, windowInsets);
            return;
        }
        if (i11 >= 29) {
            this.f6525a = new j(this, windowInsets);
        } else if (i11 >= 28) {
            this.f6525a = new i(this, windowInsets);
        } else {
            this.f6525a = new h(this, windowInsets);
        }
    }

    /* renamed from: p */
    public static C1421e m8046p(C1421e c1421e, int i11, int i12, int i13, int i14) {
        int max = Math.max(0, c1421e.f6230a - i11);
        int max2 = Math.max(0, c1421e.f6231b - i12);
        int max3 = Math.max(0, c1421e.f6232c - i13);
        int max4 = Math.max(0, c1421e.f6233d - i14);
        if (max == i11 && max2 == i12 && max3 == i13 && max4 == i14) {
            return c1421e;
        }
        return C1421e.m7230b(max, max2, max3, max4);
    }

    /* renamed from: y */
    public static C1580n1 m8047y(WindowInsets windowInsets) {
        return m8048z(windowInsets, null);
    }

    /* renamed from: z */
    public static C1580n1 m8048z(WindowInsets windowInsets, View view) {
        C1580n1 c1580n1 = new C1580n1((WindowInsets) AbstractC1487i.m7492g(windowInsets));
        if (view != null && AbstractC1579n0.m7862d0(view)) {
            c1580n1.m8069v(AbstractC1579n0.m7824M(view));
            c1580n1.m8052d(view.getRootView());
        }
        return c1580n1;
    }

    /* renamed from: a */
    public C1580n1 m8049a() {
        return this.f6525a.mo8108a();
    }

    /* renamed from: b */
    public C1580n1 m8050b() {
        return this.f6525a.mo8103b();
    }

    /* renamed from: c */
    public C1580n1 m8051c() {
        return this.f6525a.mo8104c();
    }

    /* renamed from: d */
    public void m8052d(View view) {
        this.f6525a.mo8090d(view);
    }

    /* renamed from: e */
    public C1594r m8053e() {
        return this.f6525a.mo8109f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580n1)) {
            return false;
        }
        return AbstractC1482d.m7475a(this.f6525a, ((C1580n1) obj).f6525a);
    }

    /* renamed from: f */
    public C1421e m8054f(int i11) {
        return this.f6525a.mo8092g(i11);
    }

    /* renamed from: g */
    public C1421e m8055g(int i11) {
        return this.f6525a.mo8093h(i11);
    }

    /* renamed from: h */
    public C1421e m8056h() {
        return this.f6525a.mo8110i();
    }

    public int hashCode() {
        l lVar = this.f6525a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    /* renamed from: i */
    public C1421e m8057i() {
        return this.f6525a.mo8105j();
    }

    /* renamed from: j */
    public int m8058j() {
        return this.f6525a.mo8094l().f6233d;
    }

    /* renamed from: k */
    public int m8059k() {
        return this.f6525a.mo8094l().f6230a;
    }

    /* renamed from: l */
    public int m8060l() {
        return this.f6525a.mo8094l().f6232c;
    }

    /* renamed from: m */
    public int m8061m() {
        return this.f6525a.mo8094l().f6231b;
    }

    /* renamed from: n */
    public boolean m8062n() {
        return !this.f6525a.mo8094l().equals(C1421e.f6229e);
    }

    /* renamed from: o */
    public C1580n1 m8063o(int i11, int i12, int i13, int i14) {
        return this.f6525a.mo8095n(i11, i12, i13, i14);
    }

    /* renamed from: q */
    public boolean m8064q() {
        return this.f6525a.mo8106o();
    }

    /* renamed from: r */
    public boolean m8065r(int i11) {
        return this.f6525a.mo8097q(i11);
    }

    /* renamed from: s */
    public C1580n1 m8066s(int i11, int i12, int i13, int i14) {
        return new b(this).m8076d(C1421e.m7230b(i11, i12, i13, i14)).m8073a();
    }

    /* renamed from: t */
    void m8067t(C1421e[] c1421eArr) {
        this.f6525a.mo8098r(c1421eArr);
    }

    /* renamed from: u */
    void m8068u(C1421e c1421e) {
        this.f6525a.mo8099s(c1421e);
    }

    /* renamed from: v */
    public void m8069v(C1580n1 c1580n1) {
        this.f6525a.mo8100t(c1580n1);
    }

    /* renamed from: w */
    void m8070w(C1421e c1421e) {
        this.f6525a.mo8107u(c1421e);
    }

    /* renamed from: x */
    public WindowInsets m8071x() {
        l lVar = this.f6525a;
        if (lVar instanceof g) {
            return ((g) lVar).f6545c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$c */
    /* loaded from: classes2.dex */
    public static class c extends f {

        /* renamed from: e */
        private static Field f6531e = null;

        /* renamed from: f */
        private static boolean f6532f = false;

        /* renamed from: g */
        private static Constructor f6533g = null;

        /* renamed from: h */
        private static boolean f6534h = false;

        /* renamed from: c */
        private WindowInsets f6535c;

        /* renamed from: d */
        private C1421e f6536d;

        c() {
            this.f6535c = m8077i();
        }

        /* renamed from: i */
        private static WindowInsets m8077i() {
            if (!f6532f) {
                try {
                    f6531e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f6532f = true;
            }
            Field field = f6531e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f6534h) {
                try {
                    f6533g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f6534h = true;
            }
            Constructor constructor = f6533g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: b */
        C1580n1 mo8078b() {
            m8085a();
            C1580n1 m8047y = C1580n1.m8047y(this.f6535c);
            m8047y.m8067t(this.f6539b);
            m8047y.m8070w(this.f6536d);
            return m8047y;
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: e */
        void mo8079e(C1421e c1421e) {
            this.f6536d = c1421e;
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: g */
        void mo8080g(C1421e c1421e) {
            WindowInsets windowInsets = this.f6535c;
            if (windowInsets != null) {
                this.f6535c = windowInsets.replaceSystemWindowInsets(c1421e.f6230a, c1421e.f6231b, c1421e.f6232c, c1421e.f6233d);
            }
        }

        c(C1580n1 c1580n1) {
            super(c1580n1);
            this.f6535c = c1580n1.m8071x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n1$d */
    /* loaded from: classes.dex */
    public static class d extends f {

        /* renamed from: c */
        final WindowInsets.Builder f6537c;

        d() {
            this.f6537c = AbstractC1608u1.m8209a();
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: b */
        C1580n1 mo8078b() {
            WindowInsets build;
            m8085a();
            build = this.f6537c.build();
            C1580n1 m8047y = C1580n1.m8047y(build);
            m8047y.m8067t(this.f6539b);
            return m8047y;
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: d */
        void mo8081d(C1421e c1421e) {
            this.f6537c.setMandatorySystemGestureInsets(c1421e.m7234f());
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: e */
        void mo8079e(C1421e c1421e) {
            this.f6537c.setStableInsets(c1421e.m7234f());
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: f */
        void mo8082f(C1421e c1421e) {
            this.f6537c.setSystemGestureInsets(c1421e.m7234f());
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: g */
        void mo8080g(C1421e c1421e) {
            this.f6537c.setSystemWindowInsets(c1421e.m7234f());
        }

        @Override // androidx.core.view.C1580n1.f
        /* renamed from: h */
        void mo8083h(C1421e c1421e) {
            this.f6537c.setTappableElementInsets(c1421e.m7234f());
        }

        d(C1580n1 c1580n1) {
            super(c1580n1);
            WindowInsets.Builder m8209a;
            WindowInsets m8071x = c1580n1.m8071x();
            if (m8071x != null) {
                m8209a = AbstractC1612v1.m8233a(m8071x);
            } else {
                m8209a = AbstractC1608u1.m8209a();
            }
            this.f6537c = m8209a;
        }
    }

    /* renamed from: androidx.core.view.n1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final f f6530a;

        public b() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f6530a = new e();
            } else if (i11 >= 29) {
                this.f6530a = new d();
            } else {
                this.f6530a = new c();
            }
        }

        /* renamed from: a */
        public C1580n1 m8073a() {
            return this.f6530a.mo8078b();
        }

        /* renamed from: b */
        public b m8074b(int i11, C1421e c1421e) {
            this.f6530a.mo8084c(i11, c1421e);
            return this;
        }

        /* renamed from: c */
        public b m8075c(C1421e c1421e) {
            this.f6530a.mo8079e(c1421e);
            return this;
        }

        /* renamed from: d */
        public b m8076d(C1421e c1421e) {
            this.f6530a.mo8080g(c1421e);
            return this;
        }

        public b(C1580n1 c1580n1) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                this.f6530a = new e(c1580n1);
            } else if (i11 >= 29) {
                this.f6530a = new d(c1580n1);
            } else {
                this.f6530a = new c(c1580n1);
            }
        }
    }

    public C1580n1(C1580n1 c1580n1) {
        if (c1580n1 != null) {
            l lVar = c1580n1.f6525a;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30 && (lVar instanceof k)) {
                this.f6525a = new k(this, (k) lVar);
            } else if (i11 >= 29 && (lVar instanceof j)) {
                this.f6525a = new j(this, (j) lVar);
            } else if (i11 >= 28 && (lVar instanceof i)) {
                this.f6525a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f6525a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f6525a = new g(this, (g) lVar);
            } else {
                this.f6525a = new l(this);
            }
            lVar.mo8091e(this);
            return;
        }
        this.f6525a = new l(this);
    }
}

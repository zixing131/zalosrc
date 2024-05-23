package com.zing.zalo.utils.systemui;

import android.app.Dialog;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.zviews.DialogView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.widget.InsetsLayout;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import me0.AbstractC23136l9;
import p227i3.C20218v;
import p542ub.InterfaceC27218a;
import p558uu.InterfaceC27370f;
import pm0.C24848g0;

/* loaded from: classes.dex */
public final class SystemUIUtils {

    /* renamed from: a */
    public static final SystemUIUtils f85039a = new SystemUIUtils();

    /* renamed from: b */
    private static final C16766d f85040b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SystemUIZaloViewLifecycleAwareObserver implements C17487o0.l, InterfaceC1795t {

        /* renamed from: p */
        private final ZaloView f85041p;

        /* renamed from: q */
        private C16759a f85042q;

        /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$SystemUIZaloViewLifecycleAwareObserver$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C16757a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f85043a;

            static {
                int[] iArr = new int[AbstractC1785o.a.values().length];
                try {
                    iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f85043a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$SystemUIZaloViewLifecycleAwareObserver$b */
        /* loaded from: classes4.dex */
        public static final class C16758b extends AbstractC19075u implements InterfaceC18505l {
            C16758b() {
                super(1);
            }

            /* renamed from: a */
            public final void m89461a(boolean z11) {
                if (z11) {
                    SystemUIZaloViewLifecycleAwareObserver.this.m89454d();
                } else {
                    SystemUIZaloViewLifecycleAwareObserver.this.m89455e();
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m89461a(((Boolean) obj).booleanValue());
                return C24848g0.f119245a;
            }
        }

        public SystemUIZaloViewLifecycleAwareObserver(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            this.f85041p = zaloView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final void m89454d() {
            DialogView dialogView;
            InterfaceC16774l m89457g;
            Dialog m79280LK;
            Window window;
            if (m89456k()) {
                return;
            }
            ZaloView zaloView = this.f85041p;
            Window window2 = null;
            if (zaloView instanceof DialogView) {
                dialogView = (DialogView) zaloView;
            } else {
                dialogView = null;
            }
            if (dialogView != null && (m79280LK = dialogView.m79280LK()) != null && (window = m79280LK.getWindow()) != null) {
                window2 = window;
            } else {
                InterfaceC27218a m92676n2 = this.f85041p.m92676n2();
                if (m92676n2 != null) {
                    window2 = m92676n2.getWindow();
                }
            }
            if (window2 != null && (m89457g = m89457g()) != null) {
                m89457g.mo205i9(window2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m89455e() {
            DialogView dialogView;
            InterfaceC16774l m89458j;
            Dialog m79280LK;
            Window window;
            if (m89456k()) {
                return;
            }
            ZaloView zaloView = this.f85041p;
            Window window2 = null;
            if (zaloView instanceof DialogView) {
                dialogView = (DialogView) zaloView;
            } else {
                dialogView = null;
            }
            if (dialogView != null && (m79280LK = dialogView.m79280LK()) != null && (window = m79280LK.getWindow()) != null) {
                window2 = window;
            } else {
                InterfaceC27218a m92676n2 = this.f85041p.m92676n2();
                if (m92676n2 != null) {
                    window2 = m92676n2.getWindow();
                }
            }
            if (window2 != null && (m89458j = m89458j()) != null) {
                m89458j.mo205i9(window2);
            }
        }

        /* renamed from: k */
        private final boolean m89456k() {
            if (this.f85041p.m92674mJ() && !this.f85041p.m92681pJ() && !this.f85041p.m92677nJ()) {
                return false;
            }
            return true;
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            KeyEvent.Callback callback;
            ZaloActivity zaloActivity;
            AbstractC1785o.b bVar;
            KeyEvent.Callback callback2;
            AbstractC1785o lifecycle;
            AbstractC19074t.m100208f(interfaceC1801w, "source");
            AbstractC19074t.m100208f(aVar, "event");
            int i11 = C16757a.f85043a[aVar.ordinal()];
            InsetsLayout insetsLayout = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m89460m();
                        return;
                    }
                    return;
                }
                InterfaceC27218a m92676n2 = this.f85041p.m92676n2();
                if (m92676n2 instanceof ZaloActivity) {
                    zaloActivity = (ZaloActivity) m92676n2;
                } else {
                    zaloActivity = null;
                }
                if (zaloActivity != null && (lifecycle = zaloActivity.getLifecycle()) != null) {
                    bVar = lifecycle.mo9336b();
                } else {
                    bVar = null;
                }
                if (bVar == AbstractC1785o.b.RESUMED) {
                    m89455e();
                    if (!m89456k()) {
                        InterfaceC27218a m92676n22 = this.f85041p.m92676n2();
                        if (m92676n22 != null) {
                            callback2 = m92676n22.mo35585v();
                        } else {
                            callback2 = null;
                        }
                        if (callback2 instanceof InsetsLayout) {
                            insetsLayout = (InsetsLayout) callback2;
                        }
                        if (insetsLayout != null) {
                            insetsLayout.setAllowApplyInsets(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            m89454d();
            InterfaceC27218a m92676n23 = this.f85041p.m92676n2();
            if (m92676n23 != null) {
                callback = m92676n23.mo35585v();
            } else {
                callback = null;
            }
            if (callback instanceof InsetsLayout) {
                insetsLayout = (InsetsLayout) callback;
            }
            if (insetsLayout != null) {
                insetsLayout.setAllowApplyInsets(false);
            }
        }

        /* renamed from: g */
        public final InterfaceC16774l m89457g() {
            C16759a c16759a = this.f85042q;
            if (c16759a != null) {
                return c16759a.m89462a();
            }
            return null;
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
        }

        /* renamed from: j */
        public final InterfaceC16774l m89458j() {
            C16759a c16759a = this.f85042q;
            if (c16759a != null) {
                return c16759a.m89463b();
            }
            return null;
        }

        /* renamed from: l */
        public final C16759a m89459l(InterfaceC16774l interfaceC16774l, InterfaceC16774l interfaceC16774l2) {
            InterfaceC27218a m92676n2;
            Window window;
            C17487o0 m92662fJ;
            AbstractC19074t.m100208f(interfaceC16774l, "enterAppearance");
            AbstractC19074t.m100208f(interfaceC16774l2, "exitAppearance");
            if (m89456k() || (m92676n2 = this.f85041p.m92676n2()) == null || (window = m92676n2.getWindow()) == null || window.isFloating() || (m92662fJ = this.f85041p.m92662fJ()) == null) {
                return null;
            }
            this.f85042q = new C16759a(interfaceC16774l, interfaceC16774l2, new C16758b());
            if (this.f85041p.m92672lJ()) {
                m89454d();
            }
            m92662fJ.m93092y(this);
            this.f85041p.m92657cJ().getLifecycle().mo9335a(this);
            return this.f85042q;
        }

        /* renamed from: m */
        public final void m89460m() {
            try {
                this.f85042q = null;
                try {
                    C17487o0 m92662fJ = this.f85041p.m92662fJ();
                    if (m92662fJ != null) {
                        m92662fJ.m93008I1(this);
                    }
                    this.f85041p.m92657cJ().getLifecycle().mo9338d(this);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
            View view;
            AbstractC19074t.m100208f(zaloView, "zaloView");
            if (AbstractC19074t.m100204b(this.f85041p, zaloView)) {
                m89455e();
                if (!m89456k()) {
                    InterfaceC27218a m92676n2 = zaloView.m92676n2();
                    InsetsLayout insetsLayout = null;
                    if (m92676n2 != null) {
                        view = m92676n2.mo35585v();
                    } else {
                        view = null;
                    }
                    if (view instanceof InsetsLayout) {
                        insetsLayout = (InsetsLayout) view;
                    }
                    if (insetsLayout != null) {
                        insetsLayout.setAllowApplyInsets(true);
                    }
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$a */
    /* loaded from: classes4.dex */
    public static final class C16759a {

        /* renamed from: a */
        private final InterfaceC18505l f85045a;

        /* renamed from: b */
        private InterfaceC16774l f85046b;

        /* renamed from: c */
        private InterfaceC16774l f85047c;

        public C16759a(InterfaceC16774l interfaceC16774l, InterfaceC16774l interfaceC16774l2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC16774l, "enterAppearance");
            AbstractC19074t.m100208f(interfaceC16774l2, "exitAppearance");
            AbstractC19074t.m100208f(interfaceC18505l, "onChanged");
            this.f85045a = interfaceC18505l;
            this.f85046b = interfaceC16774l;
            this.f85047c = interfaceC16774l2;
        }

        /* renamed from: a */
        public final InterfaceC16774l m89462a() {
            return this.f85046b;
        }

        /* renamed from: b */
        public final InterfaceC16774l m89463b() {
            return this.f85047c;
        }

        /* renamed from: c */
        public final void m89464c(InterfaceC16774l interfaceC16774l) {
            AbstractC19074t.m100208f(interfaceC16774l, "value");
            this.f85046b = interfaceC16774l;
            this.f85045a.mo205i9(Boolean.TRUE);
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$b */
    /* loaded from: classes4.dex */
    public static final class C16760b implements C17487o0.l {

        /* renamed from: p */
        final /* synthetic */ ZaloView f85048p;

        /* renamed from: q */
        final /* synthetic */ SystemUI f85049q;

        /* renamed from: r */
        final /* synthetic */ C19051f0 f85050r;

        /* renamed from: s */
        final /* synthetic */ C17487o0 f85051s;

        C16760b(ZaloView zaloView, SystemUI systemUI, C19051f0 c19051f0, C17487o0 c17487o0) {
            this.f85048p = zaloView;
            this.f85049q = systemUI;
            this.f85050r = c19051f0;
            this.f85051s = c17487o0;
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: gp */
        public void mo35571gp(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "targetZaloView");
            if (AbstractC19074t.m100204b(this.f85048p, zaloView)) {
                this.f85051s.m93008I1(this);
                if (this.f85050r.f94928p && !this.f85049q.m89417F() && !this.f85049q.m89418H()) {
                    this.f85049q.m89425S(true);
                }
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: o7 */
        public void mo35578o7(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "targetZaloView");
        }

        @Override // com.zing.zalo.zview.C17487o0.l
        /* renamed from: r5 */
        public void mo35582r5(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "targetZaloView");
            if (AbstractC19074t.m100204b(this.f85048p, zaloView) && this.f85049q.m89418H() && this.f85049q.m89417F()) {
                this.f85050r.f94928p = true;
                this.f85049q.m89425S(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$c */
    /* loaded from: classes4.dex */
    public static final class C16761c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Integer f85052q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16761c(Integer num) {
            super(1);
            this.f85052q = num;
        }

        /* renamed from: a */
        public final void m89465a(SystemUI systemUI) {
            AbstractC19074t.m100208f(systemUI, "$this$doOnNavigationBarModeChanged");
            systemUI.m89427V(this.f85052q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m89465a((SystemUI) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.systemui.SystemUIUtils$d */
    /* loaded from: classes4.dex */
    public static final class C16762d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ Integer f85053q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16762d(Integer num) {
            super(1);
            this.f85053q = num;
        }

        /* renamed from: a */
        public final void m89466a(SystemUI systemUI) {
            AbstractC19074t.m100208f(systemUI, "$this$doOnNavigationBarModeChanged");
            systemUI.m89427V(this.f85053q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m89466a((SystemUI) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f85040b = new C16766d(bool, bool, -16777216, null, bool, bool, bool, 0);
    }

    private SystemUIUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m89442c(SystemUI systemUI, int i11, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, C1580n1 c1580n1) {
        WindowInsets rootWindowInsets;
        C1421e c1421e;
        C1580n1 m8047y;
        AbstractC19074t.m100208f(systemUI, "$this_doOnNavigationBarModeChanged");
        AbstractC19074t.m100208f(interfaceC18505l, "$onGestureMode");
        AbstractC19074t.m100208f(interfaceC18505l2, "$onButtonMode");
        AbstractC19074t.m100208f(c1580n1, "it");
        rootWindowInsets = systemUI.m89416D().getRootWindowInsets();
        if (rootWindowInsets == null || (m8047y = C1580n1.m8047y(rootWindowInsets)) == null || (c1421e = m8047y.m8054f(C1580n1.m.m8118f())) == null) {
            c1421e = C1421e.f6229e;
        }
        AbstractC19074t.m100205c(c1421e);
        int i12 = c1421e.f6233d;
        if (i12 != 0) {
            if (i12 <= i11) {
                interfaceC18505l.mo205i9(systemUI);
            } else {
                interfaceC18505l2.mo205i9(systemUI);
            }
        }
    }

    /* renamed from: f */
    public static final C16766d m89443f() {
        return f85040b;
    }

    /* renamed from: g */
    public static final void m89444g(SystemUI systemUI, ZaloView zaloView) {
        C17487o0 m92662fJ;
        AbstractC19074t.m100208f(systemUI, "<this>");
        if (zaloView == null || zaloView.mo60294yp() || (m92662fJ = zaloView.m92662fJ()) == null) {
            return;
        }
        m92662fJ.m93092y(new C16760b(zaloView, systemUI, new C19051f0(), m92662fJ));
    }

    /* renamed from: j */
    public static final C16759a m89445j(ZaloView zaloView, InterfaceC16774l interfaceC16774l, InterfaceC16774l interfaceC16774l2) {
        AbstractC19074t.m100208f(zaloView, "<this>");
        AbstractC19074t.m100208f(interfaceC16774l, "enterAppearance");
        AbstractC19074t.m100208f(interfaceC16774l2, "exitAppearance");
        return new SystemUIZaloViewLifecycleAwareObserver(zaloView).m89459l(interfaceC16774l, interfaceC16774l2);
    }

    /* renamed from: k */
    public static /* synthetic */ C16759a m89446k(ZaloView zaloView, InterfaceC16774l interfaceC16774l, InterfaceC16774l interfaceC16774l2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC16774l2 = f85040b;
        }
        return m89445j(zaloView, interfaceC16774l, interfaceC16774l2);
    }

    /* renamed from: b */
    public final void m89447b(final SystemUI systemUI, final InterfaceC18505l interfaceC18505l, final InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(systemUI, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "onButtonMode");
        AbstractC19074t.m100208f(interfaceC18505l2, "onGestureMode");
        if (Build.VERSION.SDK_INT >= 26) {
            final int m118712h = AbstractC23136l9.m118712h(systemUI.m89416D().getContext(), 32.0f);
            systemUI.m89431o(new InterfaceC27370f() { // from class: com.zing.zalo.utils.systemui.k
                @Override // p558uu.InterfaceC27370f
                /* renamed from: d */
                public final void mo89428d(C1580n1 c1580n1) {
                    SystemUIUtils.m89442c(SystemUI.this, m118712h, interfaceC18505l2, interfaceC18505l, c1580n1);
                }
            });
        } else {
            interfaceC18505l.mo205i9(systemUI);
        }
    }

    /* renamed from: d */
    public final C1421e m89448d(C1580n1 c1580n1) {
        AbstractC19074t.m100208f(c1580n1, "windowInsets");
        C1421e m8054f = c1580n1.m8054f(C1580n1.m.m8118f());
        AbstractC19074t.m100207e(m8054f, "getInsets(...)");
        if (m8054f.f6233d != 0 && c1580n1.m8065r(C1580n1.m.m8114b()) && c1580n1.m8058j() > m8054f.f6233d) {
            m8054f = C1421e.m7230b(m8054f.f6230a, m8054f.f6231b, m8054f.f6232c, 0);
        }
        AbstractC19074t.m100205c(m8054f);
        return m8054f;
    }

    /* renamed from: e */
    public final C1580n1 m89449e(View view, C1580n1 c1580n1) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        AbstractC19074t.m100208f(c1580n1, "windowInsets");
        C1421e m8054f = c1580n1.m8054f(C1580n1.m.m8118f());
        AbstractC19074t.m100207e(m8054f, "getInsets(...)");
        if (c1580n1.m8058j() != 0 && m8054f.f6233d != 0 && (!c1580n1.m8065r(C1580n1.m.m8114b()) || c1580n1.m8058j() == m8054f.f6233d)) {
            c1580n1 = c1580n1.m8066s(c1580n1.m8059k(), c1580n1.m8061m(), c1580n1.m8060l(), 0);
        }
        AbstractC19074t.m100205c(c1580n1);
        C1580n1 m7888m0 = AbstractC1579n0.m7888m0(view, c1580n1);
        AbstractC19074t.m100207e(m7888m0, "onApplyWindowInsets(...)");
        return m7888m0;
    }

    /* renamed from: h */
    public final boolean m89450h(View view) {
        AbstractC19074t.m100208f(view, "view");
        if (view.findViewById(AbstractC6918a0.zalo_view_container) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m89451i(SystemUI systemUI, Integer num, Integer num2) {
        AbstractC19074t.m100208f(systemUI, "<this>");
        m89447b(systemUI, new C16761c(num), new C16762d(num2));
    }
}

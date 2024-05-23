package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.InterfaceC1207s0;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1617x0;
import androidx.core.view.C1611v0;
import androidx.core.view.InterfaceC1614w0;
import androidx.core.view.InterfaceC1620y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19187j;
import p310l0.AbstractC21981b;
import p310l0.C21980a;
import p310l0.C21986g;
import p310l0.C21987h;
import p664y.AbstractC30228a;

/* renamed from: androidx.appcompat.app.o */
/* loaded from: classes2.dex */
public class C1065o extends ActionBar implements ActionBarOverlayLayout.InterfaceC1085d {

    /* renamed from: E */
    private static final Interpolator f3876E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f3877F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f3878A;

    /* renamed from: a */
    Context f3882a;

    /* renamed from: b */
    private Context f3883b;

    /* renamed from: c */
    private Activity f3884c;

    /* renamed from: d */
    ActionBarOverlayLayout f3885d;

    /* renamed from: e */
    ActionBarContainer f3886e;

    /* renamed from: f */
    InterfaceC1207s0 f3887f;

    /* renamed from: g */
    ActionBarContextView f3888g;

    /* renamed from: h */
    View f3889h;

    /* renamed from: i */
    ScrollingTabContainerView f3890i;

    /* renamed from: l */
    private boolean f3893l;

    /* renamed from: m */
    d f3894m;

    /* renamed from: n */
    AbstractC21981b f3895n;

    /* renamed from: o */
    AbstractC21981b.a f3896o;

    /* renamed from: p */
    private boolean f3897p;

    /* renamed from: r */
    private boolean f3899r;

    /* renamed from: u */
    boolean f3902u;

    /* renamed from: v */
    boolean f3903v;

    /* renamed from: w */
    private boolean f3904w;

    /* renamed from: y */
    C21987h f3906y;

    /* renamed from: z */
    private boolean f3907z;

    /* renamed from: j */
    private ArrayList f3891j = new ArrayList();

    /* renamed from: k */
    private int f3892k = -1;

    /* renamed from: q */
    private ArrayList f3898q = new ArrayList();

    /* renamed from: s */
    private int f3900s = 0;

    /* renamed from: t */
    boolean f3901t = true;

    /* renamed from: x */
    private boolean f3905x = true;

    /* renamed from: B */
    final InterfaceC1614w0 f3879B = new a();

    /* renamed from: C */
    final InterfaceC1614w0 f3880C = new b();

    /* renamed from: D */
    final InterfaceC1620y0 f3881D = new c();

    /* renamed from: androidx.appcompat.app.o$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC1617x0 {
        a() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            View view2;
            C1065o c1065o = C1065o.this;
            if (c1065o.f3901t && (view2 = c1065o.f3889h) != null) {
                view2.setTranslationY(0.0f);
                C1065o.this.f3886e.setTranslationY(0.0f);
            }
            C1065o.this.f3886e.setVisibility(8);
            C1065o.this.f3886e.setTransitioning(false);
            C1065o c1065o2 = C1065o.this;
            c1065o2.f3906y = null;
            c1065o2.m4950w();
            ActionBarOverlayLayout actionBarOverlayLayout = C1065o.this.f3885d;
            if (actionBarOverlayLayout != null) {
                AbstractC1579n0.m7910x0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.o$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC1617x0 {
        b() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            C1065o c1065o = C1065o.this;
            c1065o.f3906y = null;
            c1065o.f3886e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.o$c */
    /* loaded from: classes2.dex */
    class c implements InterfaceC1620y0 {
        c() {
        }

        @Override // androidx.core.view.InterfaceC1620y0
        /* renamed from: a */
        public void mo4953a(View view) {
            ((View) C1065o.this.f3886e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.o$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractC21981b implements C1072e.a {

        /* renamed from: r */
        private final Context f3911r;

        /* renamed from: s */
        private final C1072e f3912s;

        /* renamed from: t */
        private AbstractC21981b.a f3913t;

        /* renamed from: u */
        private WeakReference f3914u;

        public d(Context context, AbstractC21981b.a aVar) {
            this.f3911r = context;
            this.f3913t = aVar;
            C1072e m5069W = new C1072e(context).m5069W(1);
            this.f3912s = m5069W;
            m5069W.mo5068V(this);
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: a */
        public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
            AbstractC21981b.a aVar = this.f3913t;
            if (aVar != null) {
                return aVar.mo4852a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1072e.a
        /* renamed from: b */
        public void mo4807b(C1072e c1072e) {
            if (this.f3913t == null) {
                return;
            }
            mo4960k();
            C1065o.this.f3888g.m5158l();
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: c */
        public void mo4954c() {
            C1065o c1065o = C1065o.this;
            if (c1065o.f3894m != this) {
                return;
            }
            if (!C1065o.m4936v(c1065o.f3902u, c1065o.f3903v, false)) {
                C1065o c1065o2 = C1065o.this;
                c1065o2.f3895n = this;
                c1065o2.f3896o = this.f3913t;
            } else {
                this.f3913t.mo4855d(this);
            }
            this.f3913t = null;
            C1065o.this.m4949u(false);
            C1065o.this.f3888g.m5154g();
            C1065o.this.f3887f.mo5702l().sendAccessibilityEvent(32);
            C1065o c1065o3 = C1065o.this;
            c1065o3.f3885d.setHideOnContentScrollEnabled(c1065o3.f3878A);
            C1065o.this.f3894m = null;
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: d */
        public View mo4955d() {
            WeakReference weakReference = this.f3914u;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: e */
        public Menu mo4956e() {
            return this.f3912s;
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: f */
        public MenuInflater mo4957f() {
            return new C21986g(this.f3911r);
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: g */
        public CharSequence mo4958g() {
            return C1065o.this.f3888g.getSubtitle();
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: i */
        public CharSequence mo4959i() {
            return C1065o.this.f3888g.getTitle();
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: k */
        public void mo4960k() {
            if (C1065o.this.f3894m != this) {
                return;
            }
            this.f3912s.m5085h0();
            try {
                this.f3913t.mo4854c(this, this.f3912s);
            } finally {
                this.f3912s.m5083g0();
            }
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: l */
        public boolean mo4961l() {
            return C1065o.this.f3888g.m5156j();
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: m */
        public void mo4962m(View view) {
            C1065o.this.f3888g.setCustomView(view);
            this.f3914u = new WeakReference(view);
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: n */
        public void mo4963n(int i11) {
            mo4964o(C1065o.this.f3882a.getResources().getString(i11));
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: o */
        public void mo4964o(CharSequence charSequence) {
            C1065o.this.f3888g.setSubtitle(charSequence);
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: q */
        public void mo4965q(int i11) {
            mo4966r(C1065o.this.f3882a.getResources().getString(i11));
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: r */
        public void mo4966r(CharSequence charSequence) {
            C1065o.this.f3888g.setTitle(charSequence);
        }

        @Override // p310l0.AbstractC21981b
        /* renamed from: s */
        public void mo4967s(boolean z11) {
            super.mo4967s(z11);
            C1065o.this.f3888g.setTitleOptional(z11);
        }

        /* renamed from: t */
        public boolean m4968t() {
            this.f3912s.m5085h0();
            try {
                return this.f3913t.mo4853b(this, this.f3912s);
            } finally {
                this.f3912s.m5083g0();
            }
        }
    }

    public C1065o(Activity activity, boolean z11) {
        this.f3884c = activity;
        View decorView = activity.getWindow().getDecorView();
        m4931C(decorView);
        if (z11) {
            return;
        }
        this.f3889h = decorView.findViewById(R.id.content);
    }

    /* renamed from: B */
    private void m4930B() {
        if (this.f3904w) {
            this.f3904w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f3885d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m4935L(false);
        }
    }

    /* renamed from: C */
    private void m4931C(View view) {
        boolean z11;
        boolean z12;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC19183f.decor_content_parent);
        this.f3885d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f3887f = m4937z(view.findViewById(AbstractC19183f.action_bar));
        this.f3888g = (ActionBarContextView) view.findViewById(AbstractC19183f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC19183f.action_bar_container);
        this.f3886e = actionBarContainer;
        InterfaceC1207s0 interfaceC1207s0 = this.f3887f;
        if (interfaceC1207s0 != null && this.f3888g != null && actionBarContainer != null) {
            this.f3882a = interfaceC1207s0.getContext();
            if ((this.f3887f.mo5709s() & 4) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.f3893l = true;
            }
            C21980a m114787b = C21980a.m114787b(this.f3882a);
            if (!m114787b.m114788a() && !z11) {
                z12 = false;
            } else {
                z12 = true;
            }
            m4943I(z12);
            m4932G(m114787b.m114793g());
            TypedArray obtainStyledAttributes = this.f3882a.obtainStyledAttributes(null, AbstractC19187j.ActionBar, AbstractC19178a.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(AbstractC19187j.ActionBar_hideOnContentScroll, false)) {
                m4942H(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC19187j.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                m4941F(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: G */
    private void m4932G(boolean z11) {
        boolean z12;
        boolean z13;
        this.f3899r = z11;
        if (!z11) {
            this.f3887f.mo5707q(null);
            this.f3886e.setTabContainer(this.f3890i);
        } else {
            this.f3886e.setTabContainer(null);
            this.f3887f.mo5707q(this.f3890i);
        }
        boolean z14 = true;
        if (m4938A() == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        ScrollingTabContainerView scrollingTabContainerView = this.f3890i;
        if (scrollingTabContainerView != null) {
            if (z12) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3885d;
                if (actionBarOverlayLayout != null) {
                    AbstractC1579n0.m7910x0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        InterfaceC1207s0 interfaceC1207s0 = this.f3887f;
        if (!this.f3899r && z12) {
            z13 = true;
        } else {
            z13 = false;
        }
        interfaceC1207s0.mo5705o(z13);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3885d;
        if (this.f3899r || !z12) {
            z14 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z14);
    }

    /* renamed from: J */
    private boolean m4933J() {
        return AbstractC1579n0.m7865e0(this.f3886e);
    }

    /* renamed from: K */
    private void m4934K() {
        if (!this.f3904w) {
            this.f3904w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f3885d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m4935L(false);
        }
    }

    /* renamed from: L */
    private void m4935L(boolean z11) {
        if (m4936v(this.f3902u, this.f3903v, this.f3904w)) {
            if (!this.f3905x) {
                this.f3905x = true;
                m4952y(z11);
                return;
            }
            return;
        }
        if (this.f3905x) {
            this.f3905x = false;
            m4951x(z11);
        }
    }

    /* renamed from: v */
    static boolean m4936v(boolean z11, boolean z12, boolean z13) {
        if (z13) {
            return true;
        }
        return (z11 || z12) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private InterfaceC1207s0 m4937z(View view) {
        String str;
        if (view instanceof InterfaceC1207s0) {
            return (InterfaceC1207s0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != 0) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: A */
    public int m4938A() {
        return this.f3887f.mo5700j();
    }

    /* renamed from: D */
    public void m4939D(boolean z11) {
        int i11;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        m4940E(i11, 4);
    }

    /* renamed from: E */
    public void m4940E(int i11, int i12) {
        int mo5709s = this.f3887f.mo5709s();
        if ((i12 & 4) != 0) {
            this.f3893l = true;
        }
        this.f3887f.mo5699i((i11 & i12) | ((~i12) & mo5709s));
    }

    /* renamed from: F */
    public void m4941F(float f11) {
        AbstractC1579n0.m7817I0(this.f3886e, f11);
    }

    /* renamed from: H */
    public void m4942H(boolean z11) {
        if (z11 && !this.f3885d.m5186y()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f3878A = z11;
        this.f3885d.setHideOnContentScrollEnabled(z11);
    }

    /* renamed from: I */
    public void m4943I(boolean z11) {
        this.f3887f.mo5703m(z11);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    /* renamed from: a */
    public void mo4944a() {
        if (this.f3903v) {
            this.f3903v = false;
            m4935L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    /* renamed from: b */
    public void mo4945b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    /* renamed from: c */
    public void mo4946c(boolean z11) {
        this.f3901t = z11;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    /* renamed from: d */
    public void mo4947d() {
        if (!this.f3903v) {
            this.f3903v = true;
            m4935L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    /* renamed from: e */
    public void mo4948e() {
        C21987h c21987h = this.f3906y;
        if (c21987h != null) {
            c21987h.m114817a();
            this.f3906y = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo4695g() {
        InterfaceC1207s0 interfaceC1207s0 = this.f3887f;
        if (interfaceC1207s0 != null && interfaceC1207s0.mo5698h()) {
            this.f3887f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public void mo4696h(boolean z11) {
        if (z11 == this.f3897p) {
            return;
        }
        this.f3897p = z11;
        if (this.f3898q.size() <= 0) {
            return;
        }
        AbstractC30228a.m149044a(this.f3898q.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public int mo4697i() {
        return this.f3887f.mo5709s();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public Context mo4698j() {
        if (this.f3883b == null) {
            TypedValue typedValue = new TypedValue();
            this.f3882a.getTheme().resolveAttribute(AbstractC19178a.actionBarWidgetTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                this.f3883b = new ContextThemeWrapper(this.f3882a, i11);
            } else {
                this.f3883b = this.f3882a;
            }
        }
        return this.f3883b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public void mo4700l(Configuration configuration) {
        m4932G(C21980a.m114787b(this.f3882a).m114793g());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public boolean mo4702n(int i11, KeyEvent keyEvent) {
        Menu mo4956e;
        int i12;
        d dVar = this.f3894m;
        if (dVar == null || (mo4956e = dVar.mo4956e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i12 = keyEvent.getDeviceId();
        } else {
            i12 = -1;
        }
        boolean z11 = true;
        if (KeyCharacterMap.load(i12).getKeyboardType() == 1) {
            z11 = false;
        }
        mo4956e.setQwertyMode(z11);
        return mo4956e.performShortcut(i11, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC1085d
    public void onWindowVisibilityChanged(int i11) {
        this.f3900s = i11;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public void mo4705q(boolean z11) {
        if (!this.f3893l) {
            m4939D(z11);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo4706r(boolean z11) {
        C21987h c21987h;
        this.f3907z = z11;
        if (!z11 && (c21987h = this.f3906y) != null) {
            c21987h.m114817a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo4707s(CharSequence charSequence) {
        this.f3887f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public AbstractC21981b mo4708t(AbstractC21981b.a aVar) {
        d dVar = this.f3894m;
        if (dVar != null) {
            dVar.mo4954c();
        }
        this.f3885d.setHideOnContentScrollEnabled(false);
        this.f3888g.m5157k();
        d dVar2 = new d(this.f3888g.getContext(), aVar);
        if (dVar2.m4968t()) {
            this.f3894m = dVar2;
            dVar2.mo4960k();
            this.f3888g.m5155h(dVar2);
            m4949u(true);
            this.f3888g.sendAccessibilityEvent(32);
            return dVar2;
        }
        return null;
    }

    /* renamed from: u */
    public void m4949u(boolean z11) {
        C1611v0 mo5701k;
        C1611v0 mo5153f;
        if (z11) {
            m4934K();
        } else {
            m4930B();
        }
        if (m4933J()) {
            if (z11) {
                mo5153f = this.f3887f.mo5701k(4, 100L);
                mo5701k = this.f3888g.mo5153f(0, 200L);
            } else {
                mo5701k = this.f3887f.mo5701k(0, 200L);
                mo5153f = this.f3888g.mo5153f(8, 100L);
            }
            C21987h c21987h = new C21987h();
            c21987h.m114820d(mo5153f, mo5701k);
            c21987h.m114824h();
            return;
        }
        if (z11) {
            this.f3887f.setVisibility(4);
            this.f3888g.setVisibility(0);
        } else {
            this.f3887f.setVisibility(0);
            this.f3888g.setVisibility(8);
        }
    }

    /* renamed from: w */
    void m4950w() {
        AbstractC21981b.a aVar = this.f3896o;
        if (aVar != null) {
            aVar.mo4855d(this.f3895n);
            this.f3895n = null;
            this.f3896o = null;
        }
    }

    /* renamed from: x */
    public void m4951x(boolean z11) {
        View view;
        C21987h c21987h = this.f3906y;
        if (c21987h != null) {
            c21987h.m114817a();
        }
        if (this.f3900s == 0 && (this.f3907z || z11)) {
            this.f3886e.setAlpha(1.0f);
            this.f3886e.setTransitioning(true);
            C21987h c21987h2 = new C21987h();
            float f11 = -this.f3886e.getHeight();
            if (z11) {
                this.f3886e.getLocationInWindow(new int[]{0, 0});
                f11 -= r5[1];
            }
            C1611v0 m8227p = AbstractC1579n0.m7864e(this.f3886e).m8227p(f11);
            m8227p.m8224m(this.f3881D);
            c21987h2.m114819c(m8227p);
            if (this.f3901t && (view = this.f3889h) != null) {
                c21987h2.m114819c(AbstractC1579n0.m7864e(view).m8227p(f11));
            }
            c21987h2.m114822f(f3876E);
            c21987h2.m114821e(250L);
            c21987h2.m114823g(this.f3879B);
            this.f3906y = c21987h2;
            c21987h2.m114824h();
            return;
        }
        this.f3879B.mo4848b(null);
    }

    /* renamed from: y */
    public void m4952y(boolean z11) {
        View view;
        View view2;
        C21987h c21987h = this.f3906y;
        if (c21987h != null) {
            c21987h.m114817a();
        }
        this.f3886e.setVisibility(0);
        if (this.f3900s == 0 && (this.f3907z || z11)) {
            this.f3886e.setTranslationY(0.0f);
            float f11 = -this.f3886e.getHeight();
            if (z11) {
                this.f3886e.getLocationInWindow(new int[]{0, 0});
                f11 -= r5[1];
            }
            this.f3886e.setTranslationY(f11);
            C21987h c21987h2 = new C21987h();
            C1611v0 m8227p = AbstractC1579n0.m7864e(this.f3886e).m8227p(0.0f);
            m8227p.m8224m(this.f3881D);
            c21987h2.m114819c(m8227p);
            if (this.f3901t && (view2 = this.f3889h) != null) {
                view2.setTranslationY(f11);
                c21987h2.m114819c(AbstractC1579n0.m7864e(this.f3889h).m8227p(0.0f));
            }
            c21987h2.m114822f(f3877F);
            c21987h2.m114821e(250L);
            c21987h2.m114823g(this.f3880C);
            this.f3906y = c21987h2;
            c21987h2.m114824h();
        } else {
            this.f3886e.setAlpha(1.0f);
            this.f3886e.setTranslationY(0.0f);
            if (this.f3901t && (view = this.f3889h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f3880C.mo4848b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3885d;
        if (actionBarOverlayLayout != null) {
            AbstractC1579n0.m7910x0(actionBarOverlayLayout);
        }
    }

    public C1065o(Dialog dialog) {
        m4931C(dialog.getWindow().getDecorView());
    }
}

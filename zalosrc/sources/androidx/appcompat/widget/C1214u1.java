package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1617x0;
import androidx.core.view.C1611v0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19182e;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19185h;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p336m0.C22697a;

/* renamed from: androidx.appcompat.widget.u1 */
/* loaded from: classes2.dex */
public class C1214u1 implements InterfaceC1207s0 {

    /* renamed from: a */
    Toolbar f4725a;

    /* renamed from: b */
    private int f4726b;

    /* renamed from: c */
    private View f4727c;

    /* renamed from: d */
    private View f4728d;

    /* renamed from: e */
    private Drawable f4729e;

    /* renamed from: f */
    private Drawable f4730f;

    /* renamed from: g */
    private Drawable f4731g;

    /* renamed from: h */
    private boolean f4732h;

    /* renamed from: i */
    CharSequence f4733i;

    /* renamed from: j */
    private CharSequence f4734j;

    /* renamed from: k */
    private CharSequence f4735k;

    /* renamed from: l */
    Window.Callback f4736l;

    /* renamed from: m */
    boolean f4737m;

    /* renamed from: n */
    private ActionMenuPresenter f4738n;

    /* renamed from: o */
    private int f4739o;

    /* renamed from: p */
    private int f4740p;

    /* renamed from: q */
    private Drawable f4741q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.u1$a */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: p */
        final C22697a f4742p;

        a() {
            this.f4742p = new C22697a(C1214u1.this.f4725a.getContext(), 0, R.id.home, 0, 0, C1214u1.this.f4733i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1214u1 c1214u1 = C1214u1.this;
            Window.Callback callback = c1214u1.f4736l;
            if (callback != null && c1214u1.f4737m) {
                callback.onMenuItemSelected(0, this.f4742p);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u1$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC1617x0 {

        /* renamed from: a */
        private boolean f4744a = false;

        /* renamed from: b */
        final /* synthetic */ int f4745b;

        b(int i11) {
            this.f4745b = i11;
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: a */
        public void mo5454a(View view) {
            this.f4744a = true;
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            if (!this.f4744a) {
                C1214u1.this.f4725a.setVisibility(this.f4745b);
            }
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            C1214u1.this.f4725a.setVisibility(0);
        }
    }

    public C1214u1(Toolbar toolbar, boolean z11) {
        this(toolbar, z11, AbstractC19185h.abc_action_bar_up_description, AbstractC19182e.abc_ic_ab_back_material);
    }

    /* renamed from: D */
    private void m5739D(CharSequence charSequence) {
        this.f4733i = charSequence;
        if ((this.f4726b & 8) != 0) {
            this.f4725a.setTitle(charSequence);
        }
    }

    /* renamed from: E */
    private void m5740E() {
        if ((this.f4726b & 4) != 0) {
            if (TextUtils.isEmpty(this.f4735k)) {
                this.f4725a.setNavigationContentDescription(this.f4740p);
            } else {
                this.f4725a.setNavigationContentDescription(this.f4735k);
            }
        }
    }

    /* renamed from: F */
    private void m5741F() {
        if ((this.f4726b & 4) != 0) {
            Toolbar toolbar = this.f4725a;
            Drawable drawable = this.f4731g;
            if (drawable == null) {
                drawable = this.f4741q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f4725a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: G */
    private void m5742G() {
        Drawable drawable;
        int i11 = this.f4726b;
        if ((i11 & 2) != 0) {
            if ((i11 & 1) != 0) {
                drawable = this.f4730f;
                if (drawable == null) {
                    drawable = this.f4729e;
                }
            } else {
                drawable = this.f4729e;
            }
        } else {
            drawable = null;
        }
        this.f4725a.setLogo(drawable);
    }

    /* renamed from: u */
    private int m5743u() {
        if (this.f4725a.getNavigationIcon() != null) {
            this.f4741q = this.f4725a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m5744A(Drawable drawable) {
        this.f4731g = drawable;
        m5741F();
    }

    /* renamed from: B */
    public void m5745B(CharSequence charSequence) {
        this.f4734j = charSequence;
        if ((this.f4726b & 8) != 0) {
            this.f4725a.setSubtitle(charSequence);
        }
    }

    /* renamed from: C */
    public void m5746C(CharSequence charSequence) {
        this.f4732h = true;
        m5739D(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: a */
    public boolean mo5691a() {
        return this.f4725a.m5431d();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: b */
    public boolean mo5692b() {
        return this.f4725a.m5439y();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: c */
    public boolean mo5693c() {
        return this.f4725a.m5429P();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void collapseActionView() {
        this.f4725a.m5432e();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: d */
    public void mo5694d(Menu menu, InterfaceC1077j.a aVar) {
        if (this.f4738n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f4725a.getContext());
            this.f4738n = actionMenuPresenter;
            actionMenuPresenter.m5002t(AbstractC19183f.action_menu_presenter);
        }
        this.f4738n.mo4993h(aVar);
        this.f4725a.m5426K((C1072e) menu, this.f4738n);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: e */
    public boolean mo5695e() {
        return this.f4725a.m5423C();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: f */
    public void mo5696f() {
        this.f4737m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: g */
    public boolean mo5697g() {
        return this.f4725a.m5422B();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public Context getContext() {
        return this.f4725a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public CharSequence getTitle() {
        return this.f4725a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: h */
    public boolean mo5698h() {
        return this.f4725a.m5438x();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: i */
    public void mo5699i(int i11) {
        View view;
        int i12 = this.f4726b ^ i11;
        this.f4726b = i11;
        if (i12 != 0) {
            if ((i12 & 4) != 0) {
                if ((i11 & 4) != 0) {
                    m5740E();
                }
                m5741F();
            }
            if ((i12 & 3) != 0) {
                m5742G();
            }
            if ((i12 & 8) != 0) {
                if ((i11 & 8) != 0) {
                    this.f4725a.setTitle(this.f4733i);
                    this.f4725a.setSubtitle(this.f4734j);
                } else {
                    this.f4725a.setTitle((CharSequence) null);
                    this.f4725a.setSubtitle((CharSequence) null);
                }
            }
            if ((i12 & 16) != 0 && (view = this.f4728d) != null) {
                if ((i11 & 16) != 0) {
                    this.f4725a.addView(view);
                } else {
                    this.f4725a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: j */
    public int mo5700j() {
        return this.f4739o;
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: k */
    public C1611v0 mo5701k(int i11, long j11) {
        float f11;
        C1611v0 m7864e = AbstractC1579n0.m7864e(this.f4725a);
        if (i11 == 0) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        return m7864e.m8215b(f11).m8220h(j11).m8222j(new b(i11));
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: l */
    public ViewGroup mo5702l() {
        return this.f4725a;
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: m */
    public void mo5703m(boolean z11) {
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: n */
    public void mo5704n() {
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: o */
    public void mo5705o(boolean z11) {
        this.f4725a.setCollapsible(z11);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: p */
    public void mo5706p() {
        this.f4725a.m5433f();
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: q */
    public void mo5707q(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f4727c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f4725a;
            if (parent == toolbar) {
                toolbar.removeView(this.f4727c);
            }
        }
        this.f4727c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f4739o == 2) {
            this.f4725a.addView(scrollingTabContainerView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f4727c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
            layoutParams.f3623a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: r */
    public void mo5708r(int i11) {
        Drawable drawable;
        if (i11 != 0) {
            drawable = AbstractC19694b.m103336d(getContext(), i11);
        } else {
            drawable = null;
        }
        m5749x(drawable);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: s */
    public int mo5709s() {
        return this.f4726b;
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void setIcon(int i11) {
        setIcon(i11 != 0 ? AbstractC19694b.m103336d(getContext(), i11) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void setVisibility(int i11) {
        this.f4725a.setVisibility(i11);
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void setWindowCallback(Window.Callback callback) {
        this.f4736l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f4732h) {
            m5739D(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    /* renamed from: t */
    public void mo5710t() {
    }

    /* renamed from: v */
    public void m5747v(View view) {
        View view2 = this.f4728d;
        if (view2 != null && (this.f4726b & 16) != 0) {
            this.f4725a.removeView(view2);
        }
        this.f4728d = view;
        if (view != null && (this.f4726b & 16) != 0) {
            this.f4725a.addView(view);
        }
    }

    /* renamed from: w */
    public void m5748w(int i11) {
        if (i11 == this.f4740p) {
            return;
        }
        this.f4740p = i11;
        if (TextUtils.isEmpty(this.f4725a.getNavigationContentDescription())) {
            m5750y(this.f4740p);
        }
    }

    /* renamed from: x */
    public void m5749x(Drawable drawable) {
        this.f4730f = drawable;
        m5742G();
    }

    /* renamed from: y */
    public void m5750y(int i11) {
        String string;
        if (i11 == 0) {
            string = null;
        } else {
            string = getContext().getString(i11);
        }
        m5751z(string);
    }

    /* renamed from: z */
    public void m5751z(CharSequence charSequence) {
        this.f4735k = charSequence;
        m5740E();
    }

    public C1214u1(Toolbar toolbar, boolean z11, int i11, int i12) {
        Drawable drawable;
        this.f4739o = 0;
        this.f4740p = 0;
        this.f4725a = toolbar;
        this.f4733i = toolbar.getTitle();
        this.f4734j = toolbar.getSubtitle();
        this.f4732h = this.f4733i != null;
        this.f4731g = toolbar.getNavigationIcon();
        C1211t1 m5716v = C1211t1.m5716v(toolbar.getContext(), null, AbstractC19187j.ActionBar, AbstractC19178a.actionBarStyle, 0);
        this.f4741q = m5716v.m5723g(AbstractC19187j.ActionBar_homeAsUpIndicator);
        if (z11) {
            CharSequence m5732p = m5716v.m5732p(AbstractC19187j.ActionBar_title);
            if (!TextUtils.isEmpty(m5732p)) {
                m5746C(m5732p);
            }
            CharSequence m5732p2 = m5716v.m5732p(AbstractC19187j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m5732p2)) {
                m5745B(m5732p2);
            }
            Drawable m5723g = m5716v.m5723g(AbstractC19187j.ActionBar_logo);
            if (m5723g != null) {
                m5749x(m5723g);
            }
            Drawable m5723g2 = m5716v.m5723g(AbstractC19187j.ActionBar_icon);
            if (m5723g2 != null) {
                setIcon(m5723g2);
            }
            if (this.f4731g == null && (drawable = this.f4741q) != null) {
                m5744A(drawable);
            }
            mo5699i(m5716v.m5727k(AbstractC19187j.ActionBar_displayOptions, 0));
            int m5730n = m5716v.m5730n(AbstractC19187j.ActionBar_customNavigationLayout, 0);
            if (m5730n != 0) {
                m5747v(LayoutInflater.from(this.f4725a.getContext()).inflate(m5730n, (ViewGroup) this.f4725a, false));
                mo5699i(this.f4726b | 16);
            }
            int m5729m = m5716v.m5729m(AbstractC19187j.ActionBar_height, 0);
            if (m5729m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f4725a.getLayoutParams();
                layoutParams.height = m5729m;
                this.f4725a.setLayoutParams(layoutParams);
            }
            int m5721e = m5716v.m5721e(AbstractC19187j.ActionBar_contentInsetStart, -1);
            int m5721e2 = m5716v.m5721e(AbstractC19187j.ActionBar_contentInsetEnd, -1);
            if (m5721e >= 0 || m5721e2 >= 0) {
                this.f4725a.m5425J(Math.max(m5721e, 0), Math.max(m5721e2, 0));
            }
            int m5730n2 = m5716v.m5730n(AbstractC19187j.ActionBar_titleTextStyle, 0);
            if (m5730n2 != 0) {
                Toolbar toolbar2 = this.f4725a;
                toolbar2.m5428M(toolbar2.getContext(), m5730n2);
            }
            int m5730n3 = m5716v.m5730n(AbstractC19187j.ActionBar_subtitleTextStyle, 0);
            if (m5730n3 != 0) {
                Toolbar toolbar3 = this.f4725a;
                toolbar3.m5427L(toolbar3.getContext(), m5730n3);
            }
            int m5730n4 = m5716v.m5730n(AbstractC19187j.ActionBar_popupTheme, 0);
            if (m5730n4 != 0) {
                this.f4725a.setPopupTheme(m5730n4);
            }
        } else {
            this.f4726b = m5743u();
        }
        m5716v.m5736w();
        m5748w(i11);
        this.f4735k = this.f4725a.getNavigationContentDescription();
        this.f4725a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.InterfaceC1207s0
    public void setIcon(Drawable drawable) {
        this.f4729e = drawable;
        m5742G();
    }
}

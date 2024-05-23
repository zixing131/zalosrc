package com.zing.zalo.utils.systemui;

import android.view.View;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import androidx.lifecycle.AbstractC1759b1;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p227i3.C20218v;
import p558uu.C27366b;
import p558uu.C27369e;
import p558uu.InterfaceC27367c;
import p558uu.InterfaceC27368d;
import p558uu.InterfaceC27370f;

/* loaded from: classes.dex */
public final class SystemUI implements InterfaceC1795t, InterfaceC27367c, InterfaceC27370f {
    public static final C16752b Companion = new C16752b(null);

    /* renamed from: A */
    private Boolean f85012A;

    /* renamed from: B */
    private Integer f85013B;

    /* renamed from: C */
    private Integer f85014C;

    /* renamed from: D */
    private String f85015D;

    /* renamed from: E */
    private C16772j f85016E;

    /* renamed from: F */
    private AbstractC1785o f85017F;

    /* renamed from: G */
    private C27366b f85018G;

    /* renamed from: H */
    private C27369e f85019H;

    /* renamed from: p */
    private final View f85020p;

    /* renamed from: q */
    private boolean f85021q;

    /* renamed from: r */
    private boolean f85022r;

    /* renamed from: s */
    private boolean f85023s;

    /* renamed from: t */
    private boolean f85024t;

    /* renamed from: u */
    private Integer f85025u;

    /* renamed from: v */
    private Integer f85026v;

    /* renamed from: w */
    private Integer f85027w;

    /* renamed from: x */
    private Boolean f85028x;

    /* renamed from: y */
    private Boolean f85029y;

    /* renamed from: z */
    private Boolean f85030z;

    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$a */
    /* loaded from: classes.dex */
    public static final class ViewOnAttachStateChangeListenerC16751a implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC16751a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            SystemUI.this.m89404R(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            SystemUI.this.m89404R(false);
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$b */
    /* loaded from: classes.dex */
    public static final class C16752b {
        private C16752b() {
        }

        public /* synthetic */ C16752b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final SystemUI m89438a(View view) {
            SystemUI systemUI = new SystemUI(view);
            view.setTag(AbstractC6918a0.tag_system_ui, systemUI);
            return systemUI;
        }

        /* renamed from: b */
        public final SystemUI m89439b(View view) {
            SystemUI systemUI;
            AbstractC19074t.m100208f(view, "view");
            Object tag = view.getTag(AbstractC6918a0.tag_system_ui);
            if (tag instanceof SystemUI) {
                systemUI = (SystemUI) tag;
            } else {
                systemUI = null;
            }
            if (systemUI == null) {
                return m89438a(view);
            }
            return systemUI;
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16753c {

        /* renamed from: com.zing.zalo.utils.systemui.SystemUI$c$a */
        /* loaded from: classes.dex */
        public static final class a implements InterfaceC16753c {

            /* renamed from: a */
            public static final a f85032a = new a();

            private a() {
            }
        }

        /* renamed from: com.zing.zalo.utils.systemui.SystemUI$c$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC16753c {

            /* renamed from: a */
            public static final b f85033a = new b();

            private b() {
            }
        }

        /* renamed from: com.zing.zalo.utils.systemui.SystemUI$c$c */
        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC16753c {

            /* renamed from: a */
            public static final c f85034a = new c();

            private c() {
            }
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$d */
    /* loaded from: classes.dex */
    public /* synthetic */ class C16754d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85035a;

        static {
            int[] iArr = new int[AbstractC1785o.a.values().length];
            try {
                iArr[AbstractC1785o.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f85035a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$e */
    /* loaded from: classes4.dex */
    public static final class C16755e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C16755e f85036q = new C16755e();

        C16755e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1421e mo205i9(C1580n1 c1580n1) {
            AbstractC19074t.m100208f(c1580n1, "it");
            C1421e c1421e = C1421e.f6229e;
            AbstractC19074t.m100207e(c1421e, Image.SCALE_TYPE_NONE);
            return c1421e;
        }
    }

    /* renamed from: com.zing.zalo.utils.systemui.SystemUI$f */
    /* loaded from: classes.dex */
    public static final class ViewOnAttachStateChangeListenerC16756f implements View.OnAttachStateChangeListener {

        /* renamed from: p */
        final /* synthetic */ View f85037p;

        /* renamed from: q */
        final /* synthetic */ SystemUI f85038q;

        public ViewOnAttachStateChangeListenerC16756f(View view, SystemUI systemUI) {
            this.f85037p = view;
            this.f85038q = systemUI;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC1785o lifecycle;
            AbstractC19074t.m100208f(view, "view");
            this.f85037p.removeOnAttachStateChangeListener(this);
            InterfaceC1801w m9259a = AbstractC1759b1.m9259a(this.f85038q.m89416D());
            if (m9259a != null && (lifecycle = m9259a.getLifecycle()) != null) {
                lifecycle.mo9335a(this.f85038q);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, "view");
        }
    }

    public SystemUI(View view) {
        AbstractC1785o lifecycle;
        AbstractC19074t.m100208f(view, "view");
        this.f85020p = view;
        this.f85021q = true;
        m89404R(view.isAttachedToWindow());
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC16751a());
        if (AbstractC1579n0.m7862d0(view)) {
            InterfaceC1801w m9259a = AbstractC1759b1.m9259a(m89416D());
            if (m9259a != null && (lifecycle = m9259a.getLifecycle()) != null) {
                lifecycle.mo9335a(this);
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC16756f(view, this));
    }

    /* renamed from: E */
    private final InterfaceC27368d m89401E() {
        C27369e c27369e = this.f85019H;
        if (c27369e == null) {
            C27369e c27369e2 = new C27369e();
            this.f85019H = c27369e2;
            m89408j();
            return c27369e2;
        }
        return c27369e;
    }

    /* renamed from: N */
    private final void m89402N(InterfaceC16753c interfaceC16753c) {
        C16772j c16772j;
        if ((this.f85024t || AbstractC19074t.m100204b(interfaceC16753c, InterfaceC16753c.a.f85032a)) && (c16772j = this.f85016E) != null) {
            C16772j.m89512n(c16772j, this, interfaceC16753c, false, 4, null);
        }
    }

    /* renamed from: Q */
    private final void m89403Q(boolean z11) {
        if (this.f85024t != z11) {
            this.f85024t = z11;
            m89402N(InterfaceC16753c.a.f85032a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public final void m89404R(boolean z11) {
        if (this.f85023s != z11) {
            this.f85023s = z11;
            m89409k();
        }
    }

    /* renamed from: T */
    private final void m89405T(boolean z11) {
        if (this.f85022r != z11) {
            this.f85022r = z11;
            m89409k();
        }
    }

    /* renamed from: g */
    private final void m89407g() {
        C27366b c27366b;
        C16772j c16772j = this.f85016E;
        if (c16772j == null) {
            return;
        }
        c16772j.m89523j().mo140206b(this);
        if (!AbstractC19074t.m100204b(c16772j.m89523j().mo140207c(), m89432r()) && (c27366b = this.f85018G) != null) {
            c27366b.m140208e(c16772j.m89523j().mo140207c());
        }
    }

    /* renamed from: j */
    private final void m89408j() {
        C16772j c16772j = this.f85016E;
        if (c16772j == null) {
            return;
        }
        c16772j.m89525l().mo140210a(this);
        C1580n1 mo140211b = c16772j.m89525l().mo140211b();
        if (mo140211b != null) {
            mo89428d(mo140211b);
        }
    }

    /* renamed from: k */
    private final void m89409k() {
        boolean z11;
        if (this.f85021q && this.f85022r) {
            z11 = true;
        } else {
            z11 = false;
        }
        m89403Q(z11);
    }

    /* renamed from: l */
    private final void m89410l() {
        C16772j m89534a;
        AbstractC1785o abstractC1785o;
        if (this.f85016E == null && (m89534a = C16772j.Companion.m89534a(this.f85020p)) != null) {
            this.f85016E = m89534a;
            InterfaceC1801w m9259a = AbstractC1759b1.m9259a(m89534a.m89524k());
            if (m9259a != null) {
                abstractC1785o = m9259a.getLifecycle();
            } else {
                abstractC1785o = null;
            }
            this.f85017F = abstractC1785o;
            C16772j.m89512n(m89534a, this, null, false, 6, null);
            if (this.f85019H != null) {
                m89408j();
            }
            if (this.f85018G != null) {
                m89407g();
            }
        }
    }

    /* renamed from: m */
    private final void m89411m() {
        C16772j c16772j = this.f85016E;
        if (c16772j == null) {
            return;
        }
        this.f85016E = null;
        this.f85017F = null;
        c16772j.m89530x(this);
        if (this.f85019H != null) {
            c16772j.m89525l().mo140212d(this);
        }
        if (this.f85018G != null) {
            c16772j.m89523j().mo140205a(this);
        }
    }

    /* renamed from: p */
    public static final SystemUI m89412p(View view) {
        return Companion.m89439b(view);
    }

    /* renamed from: w */
    private final C27366b m89413w() {
        C27366b c27366b = this.f85018G;
        if (c27366b == null) {
            C27366b c27366b2 = new C27366b(C16755e.f85036q);
            this.f85018G = c27366b2;
            m89407g();
            return c27366b2;
        }
        return c27366b;
    }

    /* renamed from: B */
    public final Integer m89414B() {
        return this.f85026v;
    }

    /* renamed from: C */
    public final Integer m89415C() {
        return this.f85013B;
    }

    /* renamed from: D */
    public final View m89416D() {
        return this.f85020p;
    }

    /* renamed from: F */
    public final boolean m89417F() {
        return this.f85024t;
    }

    /* renamed from: H */
    public final boolean m89418H() {
        return this.f85021q;
    }

    /* renamed from: I */
    public final Boolean m89419I() {
        return this.f85012A;
    }

    /* renamed from: J */
    public final Boolean m89420J() {
        return this.f85030z;
    }

    /* renamed from: K */
    public final Boolean m89421K() {
        return this.f85029y;
    }

    /* renamed from: M */
    public final Boolean m89422M() {
        return this.f85028x;
    }

    /* renamed from: O */
    public final int m89423O(C16772j c16772j) {
        AbstractC19074t.m100208f(c16772j, "systemUISubject");
        int m89522i = c16772j.m89522i();
        this.f85014C = Integer.valueOf(m89522i);
        return m89522i;
    }

    /* renamed from: P */
    public final void m89424P() {
        this.f85014C = null;
    }

    /* renamed from: S */
    public final void m89425S(boolean z11) {
        if (this.f85021q != z11) {
            this.f85021q = z11;
            m89409k();
        }
    }

    /* renamed from: U */
    public final void m89426U(Boolean bool) {
        if (!AbstractC19074t.m100204b(this.f85029y, bool)) {
            this.f85029y = bool;
            m89402N(InterfaceC16753c.b.f85033a);
        }
    }

    /* renamed from: V */
    public final void m89427V(Integer num) {
        if (!AbstractC19074t.m100204b(this.f85025u, num)) {
            this.f85025u = num;
            m89402N(InterfaceC16753c.c.f85034a);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1795t
    /* renamed from: X6 */
    public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
        AbstractC1785o.b bVar;
        AbstractC19074t.m100208f(interfaceC1801w, "source");
        AbstractC19074t.m100208f(aVar, "event");
        int i11 = C16754d.f85035a[aVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        interfaceC1801w.getLifecycle().mo9338d(this);
                        m89411m();
                        return;
                    }
                    return;
                }
                AbstractC1785o abstractC1785o = this.f85017F;
                if (abstractC1785o != null) {
                    if (abstractC1785o != null) {
                        bVar = abstractC1785o.mo9336b();
                    } else {
                        bVar = null;
                    }
                    if (bVar != AbstractC1785o.b.RESUMED) {
                        return;
                    }
                }
                m89405T(false);
                return;
            }
            m89405T(true);
            return;
        }
        m89410l();
    }

    @Override // p558uu.InterfaceC27367c
    /* renamed from: b */
    public void mo87294b(C1421e c1421e) {
        C27366b c27366b;
        AbstractC19074t.m100208f(c1421e, "insets");
        if (!AbstractC19074t.m100204b(c1421e, m89432r()) && (c27366b = this.f85018G) != null) {
            c27366b.m140208e(c1421e);
        }
    }

    @Override // p558uu.InterfaceC27370f
    /* renamed from: d */
    public void mo89428d(C1580n1 c1580n1) {
        AbstractC19074t.m100208f(c1580n1, "insets");
        C27369e c27369e = this.f85019H;
        if (c27369e != null) {
            c27369e.m140213e(c1580n1);
        }
    }

    /* renamed from: e */
    public final void m89429e(InterfaceC27367c interfaceC27367c) {
        AbstractC19074t.m100208f(interfaceC27367c, "watcher");
        m89413w().mo140206b(interfaceC27367c);
    }

    /* renamed from: n */
    public final void m89430n(InterfaceC27367c interfaceC27367c) {
        AbstractC19074t.m100208f(interfaceC27367c, "watcher");
        m89429e(interfaceC27367c);
        if (!AbstractC19074t.m100204b(m89432r(), C1421e.f6229e)) {
            interfaceC27367c.mo87294b(m89432r());
        }
    }

    /* renamed from: o */
    public final void m89431o(InterfaceC27370f interfaceC27370f) {
        AbstractC19074t.m100208f(interfaceC27370f, "watcher");
        m89401E().mo140210a(interfaceC27370f);
        C1580n1 mo140211b = m89401E().mo140211b();
        if (mo140211b != null) {
            interfaceC27370f.mo89428d(mo140211b);
        }
    }

    /* renamed from: r */
    public final C1421e m89432r() {
        return m89413w().mo140207c();
    }

    /* renamed from: s */
    public final C1580n1 m89433s() {
        return m89401E().mo140211b();
    }

    /* renamed from: u */
    public final String m89434u() {
        return this.f85015D;
    }

    /* renamed from: x */
    public final Integer m89435x() {
        return this.f85014C;
    }

    /* renamed from: y */
    public final Integer m89436y() {
        return this.f85025u;
    }

    /* renamed from: z */
    public final Integer m89437z() {
        return this.f85027w;
    }
}

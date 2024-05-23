package com.zing.zalo.libbubbleview;

import ac.C0708i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.libbubbleview.AbstractC8950c;
import com.zing.zalo.libbubbleview.FloatingItemView;
import com.zing.zalo.libbubbleview.p066ui.RoundedImageView;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p363nh.C23744a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import yt.AbstractC31072b;
import yt.AbstractC31078h;
import yt.C31071a;
import yt.C31073c;
import yt.C31081k;
import yt.InterfaceC31077g;

/* renamed from: com.zing.zalo.libbubbleview.c */
/* loaded from: classes.dex */
public abstract class AbstractC8950c implements C23744a.c {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final b f47819A;

    /* renamed from: B */
    private float f47820B;

    /* renamed from: C */
    private float f47821C;

    /* renamed from: p */
    private C31071a f47822p;

    /* renamed from: q */
    private C8949b f47823q;

    /* renamed from: r */
    private C31081k f47824r;

    /* renamed from: s */
    private ZaloActivity f47825s;

    /* renamed from: t */
    private boolean f47826t;

    /* renamed from: u */
    private InterfaceC31077g f47827u;

    /* renamed from: v */
    private boolean f47828v = true;

    /* renamed from: w */
    private boolean f47829w;

    /* renamed from: x */
    private float f47830x;

    /* renamed from: y */
    private float f47831y;

    /* renamed from: z */
    private final InterfaceC24854k f47832z;

    /* renamed from: com.zing.zalo.libbubbleview.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m47819a(AbstractC8950c abstractC8950c) {
            if (abstractC8950c == null) {
                return;
            }
            abstractC8950c.mo47806h();
            abstractC8950c.m47800U(true);
            abstractC8950c.m47801V(false);
            abstractC8950c.m47807i();
            C23744a.Companion.m124119a().m124117e(abstractC8950c, 9006);
        }
    }

    /* renamed from: com.zing.zalo.libbubbleview.c$b */
    /* loaded from: classes.dex */
    public static final class b implements FloatingItemView.InterfaceC8946b {
        b() {
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: a */
        public float mo47734a() {
            return AbstractC8950c.this.m47771B();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: b */
        public RoundedImageView mo47735b() {
            C8949b m47814u = AbstractC8950c.this.m47814u();
            if (m47814u != null) {
                return m47814u.m47764h();
            }
            return null;
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: c */
        public float mo47736c() {
            return AbstractC8950c.this.m47770A();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: d */
        public float mo47737d() {
            return AbstractC8950c.this.m47773D();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: e */
        public float mo47738e() {
            return AbstractC8950c.this.m47816w();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: f */
        public void mo47739f(float f11, float f12) {
            AbstractC8950c.this.mo47796Q(f11, f12);
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: g */
        public float mo47740g() {
            return AbstractC8950c.this.m47815v();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: h */
        public void mo47741h(AbstractC31072b abstractC31072b) {
            AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
            if (AbstractC8950c.this.m47790K() != null) {
                AbstractC8950c.this.mo47794O(abstractC31072b);
            }
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: i */
        public float mo47742i() {
            return AbstractC8950c.this.m47772C();
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: j */
        public C0708i mo47743j(AbstractC31072b abstractC31072b) {
            AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
            return AbstractC8950c.this.mo47811p(abstractC31072b);
        }

        @Override // com.zing.zalo.libbubbleview.FloatingItemView.InterfaceC8946b
        /* renamed from: k */
        public void mo47744k(AbstractC31072b abstractC31072b) {
            AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
            AbstractC8950c.Companion.m47819a(AbstractC8950c.this);
            AbstractC8950c.this.mo47808j(abstractC31072b);
        }
    }

    /* renamed from: com.zing.zalo.libbubbleview.c$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f47834q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C31073c mo12V4() {
            return new C31073c(null, 1, null);
        }
    }

    public AbstractC8950c() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(c.f47834q);
        this.f47832z = m129210a;
        this.f47819A = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final float m47770A() {
        Context context;
        float f11 = 0.0f;
        if (this.f47821C <= 0.0f) {
            m47782o();
        }
        ZaloActivity zaloActivity = this.f47825s;
        if (zaloActivity == null || (context = zaloActivity.getContext()) == null) {
            return 0.0f;
        }
        float f12 = this.f47821C;
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        C31071a c31071a = this.f47822p;
        if (c31071a != null) {
            f11 = c31071a.m150980g();
        }
        return f12 - aVar.m47751c(context, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public final float m47771B() {
        float f11;
        int m47751c;
        int m47751c2;
        float f12 = 0.0f;
        if (this.f47820B <= 0.0f) {
            m47782o();
        }
        float f13 = this.f47820B;
        ZaloActivity zaloActivity = this.f47825s;
        if (zaloActivity != null) {
            if (m47792M()) {
                AbstractC8948a.a aVar = AbstractC8948a.Companion;
                m47751c = aVar.m47750b(zaloActivity, AbstractC31078h.height_tab_main);
                C31071a c31071a = this.f47822p;
                if (c31071a != null) {
                    f12 = c31071a.m150979f();
                }
                m47751c2 = aVar.m47751c(zaloActivity, f12);
            } else {
                AbstractC8948a.a aVar2 = AbstractC8948a.Companion;
                C31071a c31071a2 = this.f47822p;
                if (c31071a2 != null) {
                    f11 = c31071a2.m150985l();
                } else {
                    f11 = 0.0f;
                }
                m47751c = aVar2.m47751c(zaloActivity, f11);
                C31071a c31071a3 = this.f47822p;
                if (c31071a3 != null) {
                    f12 = c31071a3.m150992s();
                }
                m47751c2 = aVar2.m47751c(zaloActivity, f12);
            }
            f12 = m47751c + m47751c2;
        }
        return f13 - f12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final float m47772C() {
        ZaloActivity zaloActivity = this.f47825s;
        float f11 = 0.0f;
        if (zaloActivity == null) {
            return 0.0f;
        }
        AbstractC8948a.a aVar = AbstractC8948a.Companion;
        AbstractC19074t.m100207e(zaloActivity.getContext(), "getContext(...)");
        C31071a c31071a = this.f47822p;
        if (c31071a != null) {
            f11 = c31071a.m150989p();
        }
        return aVar.m47751c(r0, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final float m47773D() {
        ZaloActivity zaloActivity = this.f47825s;
        float f11 = 0.0f;
        if (zaloActivity == null) {
            return 0.0f;
        }
        if (m47792M()) {
            AbstractC8948a.a aVar = AbstractC8948a.Companion;
            float m47752e = aVar.m47752e() + zaloActivity.getContext().getResources().getDimensionPixelSize(AbstractC17454d.action_bar_default_height);
            AbstractC19074t.m100207e(zaloActivity.getContext(), "getContext(...)");
            C31071a c31071a = this.f47822p;
            if (c31071a != null) {
                f11 = c31071a.m150981h();
            }
            return m47752e + aVar.m47751c(r0, f11);
        }
        AbstractC8948a.a aVar2 = AbstractC8948a.Companion;
        AbstractC19074t.m100207e(zaloActivity.getContext(), "getContext(...)");
        C31071a c31071a2 = this.f47822p;
        if (c31071a2 != null) {
            f11 = c31071a2.m150992s();
        }
        return aVar2.m47751c(r0, f11);
    }

    /* renamed from: H */
    private final void m47774H() {
        View view;
        int i11;
        Window window;
        ZaloActivity zaloActivity = this.f47825s;
        if (zaloActivity != null && (window = zaloActivity.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        int i12 = 0;
        if (view != null) {
            i11 = view.getHeight();
        } else {
            i11 = 0;
        }
        this.f47830x = i11;
        if (view != null) {
            i12 = view.getWidth();
        }
        this.f47831y = i12;
    }

    /* renamed from: l */
    public static /* synthetic */ void m47780l(AbstractC8950c abstractC8950c, ZaloActivity zaloActivity, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                zaloActivity = null;
            }
            abstractC8950c.mo47809k(zaloActivity);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m47781m(AbstractC8950c abstractC8950c) {
        AbstractC19074t.m100208f(abstractC8950c, "this$0");
        View m47783r = abstractC8950c.m47783r();
        if (m47783r != null && (m47783r instanceof FloatingItemView)) {
            ((FloatingItemView) m47783r).m47731f();
        }
    }

    /* renamed from: o */
    private final void m47782o() {
        View mo35570g0;
        Rect rect = new Rect();
        ZaloActivity zaloActivity = this.f47825s;
        if (zaloActivity != null && (mo35570g0 = zaloActivity.mo35570g0()) != null) {
            mo35570g0.getWindowVisibleDisplayFrame(rect);
        }
        this.f47820B = rect.bottom;
        this.f47821C = rect.right;
    }

    /* renamed from: r */
    private final View m47783r() {
        C31081k m47767k;
        C8949b c8949b = this.f47823q;
        if (c8949b != null && (m47767k = c8949b.m47767k()) != null) {
            return m47767k.m151009l();
        }
        return null;
    }

    /* renamed from: t */
    private final C31073c m47784t() {
        return (C31073c) this.f47832z.getValue();
    }

    /* renamed from: E */
    public final InterfaceC31077g m47785E() {
        return this.f47827u;
    }

    /* renamed from: F */
    public final boolean m47786F() {
        return this.f47828v;
    }

    /* renamed from: G */
    public final float m47787G() {
        float f11 = this.f47830x;
        if (f11 <= 0.0f) {
            m47774H();
            return this.f47830x;
        }
        return f11;
    }

    /* renamed from: I */
    public final float m47788I() {
        float f11 = this.f47831y;
        if (f11 <= 0.0f) {
            m47774H();
            return this.f47831y;
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final C31081k m47789J() {
        return this.f47824r;
    }

    /* renamed from: K */
    public final ZaloActivity m47790K() {
        return this.f47825s;
    }

    /* renamed from: L */
    public final C31071a m47791L() {
        return this.f47822p;
    }

    /* renamed from: M */
    public final boolean m47792M() {
        if (this.f47820B <= 0.0f || this.f47821C <= 0.0f) {
            m47782o();
        }
        if (this.f47820B > this.f47821C) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final boolean m47793N() {
        return this.f47829w;
    }

    /* renamed from: O */
    public void mo47794O(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
    }

    /* renamed from: P */
    public final void m47795P() {
        C31081k m47767k;
        C8949b c8949b = this.f47823q;
        if (c8949b != null && (m47767k = c8949b.m47767k()) != null) {
            m47767k.m151012p();
        }
    }

    /* renamed from: Q */
    public abstract void mo47796Q(float f11, float f12);

    /* renamed from: R */
    public final void m47797R(boolean z11) {
        this.f47826t = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public final void m47798S(C8949b c8949b) {
        this.f47823q = c8949b;
    }

    /* renamed from: T */
    public final void m47799T(InterfaceC31077g interfaceC31077g) {
        this.f47827u = interfaceC31077g;
    }

    /* renamed from: U */
    public final void m47800U(boolean z11) {
        this.f47828v = z11;
    }

    /* renamed from: V */
    public final void m47801V(boolean z11) {
        this.f47829w = z11;
    }

    /* renamed from: W */
    public void mo47802W(ZaloActivity zaloActivity) {
        AbstractC19074t.m100208f(zaloActivity, "zaloActivity");
        this.f47825s = zaloActivity;
        this.f47822p = mo47812q();
        C23744a.Companion.m124119a().m124115b(this, 9006);
        Context context = zaloActivity.getContext();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        AbstractC19074t.m100205c(context);
        C31081k c31081k = new C31081k(context, relativeLayout);
        this.f47824r = c31081k;
        AbstractC19074t.m100205c(c31081k);
        b bVar = this.f47819A;
        C31071a c31071a = this.f47822p;
        AbstractC19074t.m100205c(c31071a);
        this.f47823q = new C8949b(context, c31081k, bVar, c31071a);
        this.f47826t = true;
    }

    /* renamed from: X */
    public final void m47803X(ZaloActivity zaloActivity) {
        this.f47825s = zaloActivity;
    }

    /* renamed from: f */
    public void mo47804f(Object obj, boolean z11) {
        ZaloActivity zaloActivity;
        AbstractC19074t.m100208f(obj, "itemInfo");
        if (!this.f47826t && (zaloActivity = this.f47825s) != null) {
            mo47802W(zaloActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final void m47805g() {
        View view;
        C17487o0 mo35579p;
        ZaloActivity zaloActivity;
        if (AbstractC19074t.m100204b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            if (!this.f47826t && (zaloActivity = this.f47825s) != null) {
                mo47802W(zaloActivity);
            }
            C31073c m47784t = m47784t();
            C8949b c8949b = this.f47823q;
            if (c8949b != null) {
                view = c8949b.m47766j();
            } else {
                view = null;
            }
            m47784t.m150994b(view);
            ZaloActivity zaloActivity2 = this.f47825s;
            if (zaloActivity2 != null && (mo35579p = zaloActivity2.mo35579p()) != null) {
                mo35579p.m93086w(m47784t().m150993a(), 998, null);
            }
        }
    }

    /* renamed from: h */
    public void mo47806h() {
    }

    /* renamed from: i */
    public final void m47807i() {
        ZaloActivity zaloActivity;
        C17487o0 mo35579p;
        if (AbstractC19074t.m100204b(Looper.getMainLooper().getThread(), Thread.currentThread()) && (zaloActivity = this.f47825s) != null && (mo35579p = zaloActivity.mo35579p()) != null) {
            mo35579p.m93000F1(m47784t().m150993a());
        }
    }

    /* renamed from: j */
    public void mo47808j(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
    }

    /* renamed from: k */
    public void mo47809k(ZaloActivity zaloActivity) {
        Companion.m47819a(this);
        ZaloActivity zaloActivity2 = this.f47825s;
        if (zaloActivity2 != null && zaloActivity2.equals(zaloActivity)) {
            this.f47825s = null;
            this.f47826t = false;
        }
    }

    /* renamed from: n */
    public final Bitmap m47810n() {
        InterfaceC31077g interfaceC31077g = this.f47827u;
        if (interfaceC31077g != null) {
            return interfaceC31077g.mo57008t();
        }
        return null;
    }

    /* renamed from: p */
    public C0708i mo47811p(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        return null;
    }

    /* renamed from: q */
    public abstract C31071a mo47812q();

    /* renamed from: s */
    public final FloatingItemView.InterfaceC8946b m47813s() {
        return this.f47819A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final C8949b m47814u() {
        return this.f47823q;
    }

    /* renamed from: v */
    public final float m47815v() {
        float m47770A = m47770A();
        float mo47817y = mo47817y() * m47770A;
        if (mo47817y > 0.0f) {
            return mo47817y;
        }
        return m47770A;
    }

    /* renamed from: w */
    public final float m47816w() {
        float m47771B = m47771B();
        float mo47818z = mo47818z() * m47771B;
        if (mo47818z <= 0.0f) {
            return m47771B / 2;
        }
        return mo47818z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // p363nh.C23744a.c
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo17795x(int i11, Object... objArr) {
        View m150993a;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 9006) {
            float f11 = this.f47821C;
            if (f11 > 0.0f) {
                float f12 = this.f47820B;
                if (f12 > 0.0f) {
                    this.f47820B = f11;
                    this.f47821C = f12;
                    m150993a = m47784t().m150993a();
                    if (m150993a == null) {
                        m150993a.post(new Runnable() { // from class: yt.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC8950c.m47781m(AbstractC8950c.this);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            m47782o();
            m150993a = m47784t().m150993a();
            if (m150993a == null) {
            }
        }
    }

    /* renamed from: y */
    public abstract float mo47817y();

    /* renamed from: z */
    public abstract float mo47818z();
}

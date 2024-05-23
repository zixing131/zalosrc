package com.zing.zalo.zinstant;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ck0.C3568b;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.C20592o;
import java.util.ArrayList;
import java.util.List;
import lk0.InterfaceC22508f;
import nj0.AbstractC23803b;
import nk0.C23855s0;
import ok0.InterfaceC24284a;
import p133ek.AbstractC18458a;
import p161fg.C18922m;
import p542ub.InterfaceC27218a;
import p667y2.C30268e;
import pj0.AbstractC24788n;
import pj0.InterfaceC24785k;
import pj0.InterfaceC24787m;
import pm0.C24860q;
import vg.AbstractC28207v1;

/* loaded from: classes7.dex */
public class ZaloZinstantCommonLayout extends ZaloZinstantRootLayout {

    /* renamed from: a0 */
    private C20592o f87441a0;

    /* renamed from: b0 */
    private C17174q f87442b0;

    /* renamed from: c0 */
    private InterfaceC24787m f87443c0;

    /* renamed from: d0 */
    private InterfaceC24284a f87444d0;

    /* renamed from: e0 */
    private InterfaceC17107c1 f87445e0;

    /* renamed from: f0 */
    private InterfaceC17246y0 f87446f0;

    /* renamed from: g0 */
    private Integer f87447g0;

    /* renamed from: h0 */
    private Integer f87448h0;

    /* renamed from: i0 */
    private final List f87449i0;

    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantCommonLayout$a */
    /* loaded from: classes7.dex */
    public static final class C17093a implements C3568b.b {

        /* renamed from: b */
        final /* synthetic */ InterfaceC22508f f87451b;

        C17093a(InterfaceC22508f interfaceC22508f) {
            this.f87451b = interfaceC22508f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m91440e(ZaloZinstantCommonLayout zaloZinstantCommonLayout, InterfaceC22508f interfaceC22508f) {
            ViewGroup.LayoutParams layoutParams;
            AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
            if (!AbstractC19074t.m100204b(zaloZinstantCommonLayout.getZinstantDataModel(), interfaceC22508f)) {
                if (zaloZinstantCommonLayout.getZinstantDataModel() != null) {
                    zaloZinstantCommonLayout.m91973J0();
                }
                Integer num = zaloZinstantCommonLayout.f87447g0;
                Integer num2 = zaloZinstantCommonLayout.f87448h0;
                if (num != null && num2 != null && (layoutParams = zaloZinstantCommonLayout.getLayoutParams()) != null) {
                    layoutParams.width = num.intValue();
                    layoutParams.height = num2.intValue();
                }
            }
            zaloZinstantCommonLayout.setZinstantDataModel(interfaceC22508f);
            if (zaloZinstantCommonLayout.getZinstantDataModel() == null) {
                zaloZinstantCommonLayout.m91425g1(new Exception("Null ZinstantDataModel"));
            } else {
                zaloZinstantCommonLayout.mo91437z0();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m91441f(ZaloZinstantCommonLayout zaloZinstantCommonLayout, Exception exc) {
            AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
            AbstractC19074t.m100208f(exc, "$e");
            zaloZinstantCommonLayout.m91425g1(exc);
        }

        @Override // ck0.C3568b.b
        /* renamed from: c */
        public void mo18129c(final Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            final ZaloZinstantCommonLayout zaloZinstantCommonLayout = ZaloZinstantCommonLayout.this;
            zaloZinstantCommonLayout.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.m0
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloZinstantCommonLayout.C17093a.m91441f(ZaloZinstantCommonLayout.this, exc);
                }
            });
        }

        @Override // ck0.C3568b.b
        /* renamed from: d */
        public void mo18130d(C3568b c3568b) {
            AbstractC19074t.m100208f(c3568b, "zinstantDagger");
            final ZaloZinstantCommonLayout zaloZinstantCommonLayout = ZaloZinstantCommonLayout.this;
            final InterfaceC22508f interfaceC22508f = this.f87451b;
            zaloZinstantCommonLayout.m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.l0
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloZinstantCommonLayout.C17093a.m91440e(ZaloZinstantCommonLayout.this, interfaceC22508f);
                }
            });
        }
    }

    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantCommonLayout$b */
    /* loaded from: classes7.dex */
    public static final class C17094b extends AbstractC24788n {
        C17094b() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            ZaloZinstantCommonLayout.this.m91435m1(str, str2, interfaceC24785k);
        }
    }

    /* renamed from: com.zing.zalo.zinstant.ZaloZinstantCommonLayout$c */
    /* loaded from: classes7.dex */
    public static final class C17095c extends AbstractC23803b {
        C17095c() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            ZaloZinstantCommonLayout.this.m91435m1(str3, str4, null);
        }
    }

    public ZaloZinstantCommonLayout(Context context) {
        super(context);
        this.f87449i0 = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public final void m91425g1(Exception exc) {
        InterfaceC17107c1 interfaceC17107c1 = this.f87445e0;
        if (interfaceC17107c1 != null) {
            interfaceC17107c1.mo72973c(exc);
        }
        mo44259k1(exc);
    }

    private final InterfaceC27218a getZaloActivity() {
        InterfaceC27218a interfaceC27218a;
        Object context = getContext();
        if (context instanceof InterfaceC27218a) {
            interfaceC27218a = (InterfaceC27218a) context;
        } else {
            interfaceC27218a = null;
        }
        if (interfaceC27218a != null) {
            return interfaceC27218a;
        }
        if (!C18922m.m99141t().m99164y()) {
            return null;
        }
        return C18922m.m99141t().m99159s();
    }

    /* renamed from: h1 */
    private final void m91426h1() {
        InterfaceC17107c1 interfaceC17107c1 = this.f87445e0;
        if (interfaceC17107c1 != null) {
            interfaceC17107c1.mo72972a();
        }
        mo35796l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static final void m91427i1(ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
        zaloZinstantCommonLayout.mo91437z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public static final void m91428j1(ZaloZinstantCommonLayout zaloZinstantCommonLayout, Exception exc) {
        AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
        AbstractC19074t.m100208f(exc, "$exception");
        zaloZinstantCommonLayout.m91425g1(exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m91429o1(ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
        zaloZinstantCommonLayout.m91425g1(new Exception("ZinstantDataModel is null"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m91430p1(ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
        zaloZinstantCommonLayout.setZinstantRootView(zaloZinstantCommonLayout.f87812s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m91431q1(ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        AbstractC19074t.m100208f(zaloZinstantCommonLayout, "this$0");
        zaloZinstantCommonLayout.m91425g1(new Exception("input invalid"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.ZaloZinstantRootLayout, com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: H */
    public void mo91432H() {
        super.mo91432H();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f87441a0 = new C20592o(context, C17210v.f87767a);
        this.f87442b0 = new C17174q();
        this.f87443c0 = new C17094b();
        this.f87444d0 = new C17095c();
        C20592o c20592o = this.f87441a0;
        InterfaceC24787m interfaceC24787m = null;
        if (c20592o == null) {
            AbstractC19074t.m100223u("mImageLoader");
            c20592o = null;
        }
        setImageLoader(c20592o);
        C17174q c17174q = this.f87442b0;
        if (c17174q == null) {
            AbstractC19074t.m100223u("mLayoutGateway");
            c17174q = null;
        }
        setLayoutGateway(c17174q);
        InterfaceC24284a interfaceC24284a = this.f87444d0;
        if (interfaceC24284a == null) {
            AbstractC19074t.m100223u("mOnClickListener");
            interfaceC24284a = null;
        }
        setOnZinstantClickListener(interfaceC24284a);
        InterfaceC24787m interfaceC24787m2 = this.f87443c0;
        if (interfaceC24787m2 == null) {
            AbstractC19074t.m100223u("mScriptListener");
        } else {
            interfaceC24787m = interfaceC24787m2;
        }
        setExternalScriptListener(interfaceC24787m);
        setUseProgressLoading(false);
    }

    /* renamed from: f1 */
    public final void m91433f1(InterfaceC22508f interfaceC22508f) {
        C3568b.m18124b().m18127d(new C17093a(interfaceC22508f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: i0 */
    public void mo91434i0(AbstractC20601x abstractC20601x, final Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        super.mo91434i0(abstractC20601x, exc);
        m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.g0
            @Override // java.lang.Runnable
            public final void run() {
                ZaloZinstantCommonLayout.m91428j1(ZaloZinstantCommonLayout.this, exc);
            }
        });
    }

    /* renamed from: k1 */
    public void mo44259k1(Exception exc) {
        AbstractC19074t.m100208f(exc, C30268e.f140632a);
    }

    /* renamed from: l1 */
    public void mo35796l1() {
        for (C24860q c24860q : this.f87449i0) {
            m91999q0((String) c24860q.m129213a(), (String) c24860q.m129214b());
        }
        this.f87449i0.clear();
    }

    /* renamed from: m1 */
    public final void m91435m1(String str, String str2, InterfaceC24785k interfaceC24785k) {
        InterfaceC17246y0 interfaceC17246y0 = this.f87446f0;
        if (interfaceC17246y0 != null) {
            interfaceC17246y0.mo44293a(str, str2, interfaceC24785k);
        } else {
            m91436n1(str, str2, interfaceC24785k);
        }
    }

    /* renamed from: n1 */
    public final void m91436n1(String str, String str2, InterfaceC24785k interfaceC24785k) {
        InterfaceC27218a zaloActivity = getZaloActivity();
        if (zaloActivity != null) {
            AbstractC28207v1.m141989h3(str, 2, zaloActivity, null, str2, m91448V0(str, str2, interfaceC24785k), "", null, null);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(new Runnable() { // from class: com.zing.zalo.zinstant.h0
            @Override // java.lang.Runnable
            public final void run() {
                ZaloZinstantCommonLayout.m91427i1(ZaloZinstantCommonLayout.this);
            }
        });
    }

    public final void setActionDelegate(InterfaceC17246y0 interfaceC17246y0) {
        AbstractC19074t.m100208f(interfaceC17246y0, "listener");
        this.f87446f0 = interfaceC17246y0;
    }

    public final void setActions(List<C24860q> list) {
        AbstractC19074t.m100208f(list, "listAction");
        this.f87449i0.clear();
        this.f87449i0.addAll(list);
    }

    public final void setLayoutCallback(InterfaceC17107c1 interfaceC17107c1) {
        AbstractC19074t.m100208f(interfaceC17107c1, "layoutCallback");
        this.f87445e0 = interfaceC17107c1;
    }

    public final void setZinstantLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC19074t.m100208f(layoutParams, "lps");
        this.f87447g0 = Integer.valueOf(layoutParams.width);
        this.f87448h0 = Integer.valueOf(layoutParams.height);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = layoutParams.width;
            layoutParams2.height = layoutParams.height;
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantRootLayout, com.zing.zalo.zinstant.view.ZinstantLayout
    public void setZinstantRootView(C23855s0 c23855s0) {
        super.setZinstantRootView(c23855s0);
        if (c23855s0 != null) {
            m91426h1();
        }
    }

    @Override // com.zing.zalo.zinstant.view.ZinstantLayout
    /* renamed from: z0 */
    public void mo91437z0() {
        super.mo91437z0();
        InterfaceC22508f zinstantDataModel = getZinstantDataModel();
        if (zinstantDataModel == null) {
            m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.i0
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloZinstantCommonLayout.m91429o1(ZaloZinstantCommonLayout.this);
                }
            });
            return;
        }
        C23855s0 c23855s0 = this.f87812s;
        if (c23855s0 != null && c23855s0.m124626G() && c23855s0.checkIntegrity(getPreferredWidth(), getPreferredHeight(), AbstractC18458a.f93019a, AbstractC17148f0.m91684c(), AbstractC17148f0.m91685d(), zinstantDataModel.mo116353c())) {
            m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.j0
                @Override // java.lang.Runnable
                public final void run() {
                    ZaloZinstantCommonLayout.m91430p1(ZaloZinstantCommonLayout.this);
                }
            });
            return;
        }
        if (getContextProvider() == null && getVisibility() == 8 && getPreferredWidth() <= 0) {
            throw new IllegalArgumentException("Required ContextProvider");
        }
        if (m92008x0()) {
            return;
        }
        m91975K0(new Runnable() { // from class: com.zing.zalo.zinstant.k0
            @Override // java.lang.Runnable
            public final void run() {
                ZaloZinstantCommonLayout.m91431q1(ZaloZinstantCommonLayout.this);
            }
        });
    }

    public ZaloZinstantCommonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87449i0 = new ArrayList();
    }

    public ZaloZinstantCommonLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f87449i0 = new ArrayList();
    }
}

package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.InterfaceC17107c1;
import com.zing.zalo.zinstant.InterfaceC17246y0;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import java.util.ArrayList;
import java.util.List;
import kd0.C21697g;
import l80.C22122a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public class ZInstantFullscreenViewHolder extends RecyclerView.AbstractC1876c0 {
    public static final C13031a Companion = new C13031a(null);

    /* renamed from: Q */
    private static final int f67311Q = View.generateViewId();

    /* renamed from: R */
    private static final int f67312R = View.generateViewId();

    /* renamed from: I */
    private final InterfaceC18319c f67313I;

    /* renamed from: J */
    private final C13040i f67314J;

    /* renamed from: K */
    private final C13039h f67315K;

    /* renamed from: L */
    private final C13038g f67316L;

    /* renamed from: M */
    private final ZaloZinstantCommonLayout f67317M;

    /* renamed from: N */
    private final View f67318N;

    /* renamed from: O */
    private final C13032b f67319O;

    /* renamed from: P */
    private AbstractC28275a.a0 f67320P;

    /* loaded from: classes6.dex */
    public static final class TouchMonitorFrameLayout extends FrameLayout {

        /* renamed from: p */
        private InterfaceC13030a f67321p;

        /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$TouchMonitorFrameLayout$a */
        /* loaded from: classes6.dex */
        public interface InterfaceC13030a {
            /* renamed from: a */
            boolean mo73267a(MotionEvent motionEvent);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TouchMonitorFrameLayout(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
            AbstractC19074t.m100208f(context, "context");
        }

        /* renamed from: a */
        public final void m73266a(InterfaceC13030a interfaceC13030a) {
            this.f67321p = interfaceC13030a;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "ev");
            InterfaceC13030a interfaceC13030a = this.f67321p;
            if (interfaceC13030a != null) {
                interfaceC13030a.mo73267a(motionEvent);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public /* synthetic */ TouchMonitorFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TouchMonitorFrameLayout(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            AbstractC19074t.m100208f(context, "context");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$a */
    /* loaded from: classes6.dex */
    public static final class C13031a {
        private C13031a() {
        }

        public /* synthetic */ C13031a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final View m73269b(ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TouchMonitorFrameLayout touchMonitorFrameLayout = new TouchMonitorFrameLayout(context, null, 0, 4, null);
            touchMonitorFrameLayout.setBackgroundColor(C23212s8.m119607o(touchMonitorFrameLayout.getContext(), AbstractC2807a.page_background_02));
            touchMonitorFrameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            Context context2 = touchMonitorFrameLayout.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            C13032b c13032b = new C13032b(context2);
            c13032b.setId(ZInstantFullscreenViewHolder.f67312R);
            touchMonitorFrameLayout.addView(c13032b);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(ZInstantFullscreenViewHolder.f67311Q);
            frameLayout.setVisibility(8);
            frameLayout.setBackgroundColor(C23212s8.m119607o(touchMonitorFrameLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            Context context3 = touchMonitorFrameLayout.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            frameLayout.addView(new C13033c(context3), -1, -1);
            touchMonitorFrameLayout.addView(frameLayout, -1, -1);
            return touchMonitorFrameLayout;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$b */
    /* loaded from: classes6.dex */
    public static final class C13032b extends ModulesView {

        /* renamed from: K */
        private final C16719g f67322K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13032b(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            setClickable(true);
            setFocusable(true);
            setBackgroundColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
            m88987U(-1, -1);
            int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
            C22122a0 c22122a0 = new C22122a0(context);
            c22122a0.mo111926w1(AbstractC16803z.emptystate_discovery_presearch);
            c22122a0.m89106L().m89028L(AbstractC23136l9.m118712h(context, 56.0f), AbstractC23136l9.m118712h(context, 56.0f)).m89031O(AbstractC23136l9.m118712h(context, 64.0f)).m89026J(true);
            mo69681L(c22122a0);
            C21697g c21697g = new C21697g(context);
            c21697g.m111958F1(AbstractC8020f0.str_global_search_presearch_tab_recovery_error_text);
            c21697g.mo111964L1(AbstractC23136l9.m118712h(context, 15.0f));
            c21697g.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            c21697g.m89106L().m89028L(-1, -2).m89032P(m118712h, AbstractC23136l9.m118712h(context, 136.0f), m118712h, 0);
            c21697g.m111961I1(Layout.Alignment.ALIGN_CENTER);
            mo69681L(c21697g);
            C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonSmall_Tertiary);
            c17023o.setIdTracking("discoveryPreSearchErrorButton");
            c17023o.m91114u1(AbstractC8020f0.str_try_again_button);
            c17023o.m91111q1(AbstractC23322a.zds_ic_retry_line_16);
            c17023o.m89106L().m89036T(AbstractC23136l9.m118712h(context, 4.0f)).m89026J(true).m89033Q(AbstractC23136l9.m118712h(context, 64.0f)).m89023G(c21697g);
            mo69681L(c17023o);
            this.f67322K = c17023o;
        }

        /* renamed from: V */
        public final C16719g m73270V() {
            return this.f67322K;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$c */
    /* loaded from: classes6.dex */
    public static final class C13033c extends ModulesView {

        /* renamed from: K */
        private ValueAnimator f67323K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13033c(Context context) {
            super(context);
            int i11;
            List m131506n;
            AbstractC19074t.m100208f(context, "context");
            setClickable(true);
            setFocusable(true);
            m88987U(-1, -1);
            if (C23212s8.m119603k()) {
                i11 = AbstractC2808b.ng10;
            } else {
                i11 = AbstractC2808b.ng90;
            }
            int m118641B = AbstractC23136l9.m118641B(context, i11);
            float m118712h = AbstractC23136l9.m118712h(context, 4.0f);
            int m118712h2 = AbstractC23136l9.m118712h(context, 16.0f);
            int m118712h3 = AbstractC23136l9.m118712h(context, 18.0f);
            int m118712h4 = AbstractC23136l9.m118712h(context, 28.0f);
            int m118712h5 = AbstractC23136l9.m118712h(context, 68.0f);
            int m118712h6 = AbstractC23136l9.m118712h(context, 122.0f);
            PaintDrawable paintDrawable = new PaintDrawable(m118641B);
            paintDrawable.setCornerRadius(m118712h);
            C24848g0 c24848g0 = C24848g0.f119245a;
            PaintDrawable paintDrawable2 = new PaintDrawable(m118641B);
            paintDrawable2.setCornerRadius(m118712h);
            m131506n = AbstractC25368s.m131506n(paintDrawable, paintDrawable2);
            ArrayList arrayList = new ArrayList(3);
            int i12 = 0;
            for (int i13 = 3; i12 < i13; i13 = 3) {
                C16719g c16719g = new C16719g(context);
                c16719g.m89085A0((Drawable) m131506n.get(0));
                int i14 = m118712h6 * i12;
                c16719g.m89106L().m89028L(-1, m118712h3).m89032P(m118712h2, m118712h2 + i14, m118712h2, 0);
                mo69681L(c16719g);
                C16719g c16719g2 = new C16719g(context);
                c16719g2.m89085A0((Drawable) m131506n.get(1));
                c16719g2.m89106L().m89028L(-1, m118712h5).m89032P(m118712h2, m118712h2 + m118712h4 + i14, m118712h2, 0);
                mo69681L(c16719g2);
                arrayList.add(c16719g2);
                i12++;
            }
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.b0
                public /* synthetic */ ViewOnLayoutChangeListenerC13044b0() {
                }

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
                    ZInstantFullscreenViewHolder.C13033c.m73272W(ZInstantFullscreenViewHolder.C13033c.this, view, i15, i16, i17, i18, i19, i21, i22, i23);
                }
            });
        }

        /* renamed from: W */
        public static final void m73272W(C13033c c13033c, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(c13033c, "this$0");
            if (view.getVisibility() == 0) {
                c13033c.m73273X();
            } else {
                c13033c.m73274Y();
            }
        }

        /* renamed from: X */
        private final void m73273X() {
            ValueAnimator valueAnimator = this.f67323K;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                setAlpha(0.0f);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.33f, 1.0f);
                if (ofFloat != null) {
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setDuration(750L);
                    if (ScanQRUIUtils.f49155a.m49639x()) {
                        setLayerType(2, null);
                    }
                    ofFloat.start();
                } else {
                    ofFloat = null;
                }
                this.f67323K = ofFloat;
            }
        }

        /* renamed from: Y */
        private final void m73274Y() {
            ValueAnimator valueAnimator = this.f67323K;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.f67323K = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$d */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13034d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67324a;

        static {
            int[] iArr = new int[AbstractC1785o.b.values().length];
            try {
                iArr[AbstractC1785o.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f67324a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$e */
    /* loaded from: classes6.dex */
    public static final class C13035e implements TouchMonitorFrameLayout.InterfaceC13030a {

        /* renamed from: a */
        private final int f67325a;

        /* renamed from: b */
        private float f67326b;

        /* renamed from: d */
        final /* synthetic */ C19051f0 f67328d;

        C13035e(C19051f0 c19051f0) {
            this.f67328d = c19051f0;
            this.f67325a = ViewConfiguration.get(ZInstantFullscreenViewHolder.this.f7784p.getContext()).getScaledTouchSlop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:            if (r0 != 3) goto L37;     */
        @Override // com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder.TouchMonitorFrameLayout.InterfaceC13030a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo73267a(MotionEvent motionEvent) {
            AbstractC19074t.m100208f(motionEvent, "ev");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (!this.f67328d.f94928p && Math.abs(this.f67326b - motionEvent.getRawY()) > this.f67325a) {
                            ZInstantFullscreenViewHolder.this.m73260w0();
                            this.f67328d.f94928p = true;
                        }
                    }
                }
                this.f67328d.f94928p = false;
            } else {
                this.f67328d.f94928p = false;
                this.f67326b = motionEvent.getRawY();
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$f */
    /* loaded from: classes6.dex */
    public static final class ViewOnAttachStateChangeListenerC13037f implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC13037f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            InterfaceC18319c m73263v0 = ZInstantFullscreenViewHolder.this.m73263v0();
            if (m73263v0 != null) {
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            InterfaceC18319c m73263v0 = ZInstantFullscreenViewHolder.this.m73263v0();
            if (m73263v0 != null) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$g */
    /* loaded from: classes6.dex */
    public static final class C13038g extends C17170o {
        C13038g() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return ZInstantFullscreenViewHolder.this.f7784p.getWidth();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: m */
        public int mo72953m() {
            return ZInstantFullscreenViewHolder.this.f7784p.getHeight();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$h */
    /* loaded from: classes6.dex */
    public static final class C13039h implements InterfaceC17107c1 {
        C13039h() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: a */
        public void mo72972a() {
            ZInstantFullscreenViewHolder.this.m73265y0();
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: c */
        public void mo72973c(Exception exc) {
            ZInstantFullscreenViewHolder.this.m73264x0();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$i */
    /* loaded from: classes6.dex */
    public static final class C13040i implements InterfaceC17246y0 {
        C13040i() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17246y0
        /* renamed from: a */
        public void mo44293a(String str, String str2, InterfaceC24785k interfaceC24785k) {
            ZInstantFullscreenViewHolder.this.m73247B0(str, str2, interfaceC24785k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZInstantFullscreenViewHolder(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73269b(viewGroup));
        TouchMonitorFrameLayout touchMonitorFrameLayout;
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67313I = interfaceC18319c;
        C13040i c13040i = new C13040i();
        this.f67314J = c13040i;
        C13039h c13039h = new C13039h();
        this.f67315K = c13039h;
        C13038g c13038g = new C13038g();
        this.f67316L = c13038g;
        ZaloZinstantCommonLayout zaloZinstantCommonLayout = new ZaloZinstantCommonLayout(viewGroup.getContext());
        this.f67317M = zaloZinstantCommonLayout;
        View findViewById = this.f7784p.findViewById(f67311Q);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f67318N = findViewById;
        View findViewById2 = this.f7784p.findViewById(f67312R);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        C13032b c13032b = (C13032b) findViewById2;
        this.f67319O = c13032b;
        m73257s0();
        m73259u0();
        m73258t0();
        View view = this.f7784p;
        if (view instanceof TouchMonitorFrameLayout) {
            touchMonitorFrameLayout = (TouchMonitorFrameLayout) view;
        } else {
            touchMonitorFrameLayout = null;
        }
        if (touchMonitorFrameLayout != null) {
            touchMonitorFrameLayout.addView(zaloZinstantCommonLayout);
        }
        zaloZinstantCommonLayout.setZinstantLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        zaloZinstantCommonLayout.setActionDelegate(c13040i);
        zaloZinstantCommonLayout.setLayoutCallback(c13039h);
        zaloZinstantCommonLayout.setContextProvider(c13038g);
        c13032b.m73270V().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.z
            public /* synthetic */ C13069z() {
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ZInstantFullscreenViewHolder.m73250k0(ZInstantFullscreenViewHolder.this, c16719g);
            }
        });
        findViewById.setVisibility(0);
        c13032b.setVisibility(8);
    }

    /* renamed from: A0 */
    private final void m73246A0(String str, String str2) {
        this.f67317M.m91999q0(str, str2);
    }

    /* renamed from: B0 */
    public final void m73247B0(String str, String str2, InterfaceC24785k interfaceC24785k) {
        InterfaceC18319c interfaceC18319c;
        InterfaceC18319c interfaceC18319c2 = this.f67313I;
        if ((interfaceC18319c2 == null || ((C18316b) interfaceC18319c2.mo205i9(new C18316b("Search.ProcessZinstantFeatureCommonAction", str, str2, this.f67320P))) == null) && (interfaceC18319c = this.f67313I) != null) {
        }
    }

    /* renamed from: k0 */
    public static final void m73250k0(ZInstantFullscreenViewHolder zInstantFullscreenViewHolder, C16719g c16719g) {
        AbstractC19074t.m100208f(zInstantFullscreenViewHolder, "this$0");
        zInstantFullscreenViewHolder.f67319O.setVisibility(8);
        zInstantFullscreenViewHolder.f67318N.setVisibility(0);
        zInstantFullscreenViewHolder.f67317M.mo91437z0();
    }

    /* renamed from: r0 */
    private final void m73256r0() {
        Object obj;
        AbstractC1785o abstractC1785o;
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f67313I;
        AbstractC1785o.b bVar = null;
        if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.Lifecycle", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof AbstractC1785o) {
            abstractC1785o = (AbstractC1785o) obj;
        } else {
            abstractC1785o = null;
        }
        if (abstractC1785o != null) {
            bVar = abstractC1785o.mo9336b();
        }
        if (bVar != null && C13034d.f67324a[bVar.ordinal()] == 1) {
            this.f67317M.onStart();
        }
    }

    /* renamed from: s0 */
    private final void m73257s0() {
        TouchMonitorFrameLayout touchMonitorFrameLayout;
        C19051f0 c19051f0 = new C19051f0();
        View view = this.f7784p;
        if (view instanceof TouchMonitorFrameLayout) {
            touchMonitorFrameLayout = (TouchMonitorFrameLayout) view;
        } else {
            touchMonitorFrameLayout = null;
        }
        if (touchMonitorFrameLayout != null) {
            touchMonitorFrameLayout.m73266a(new C13035e(c19051f0));
        }
    }

    /* renamed from: t0 */
    private final void m73258t0() {
        Object obj;
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f67313I;
        AbstractC1785o abstractC1785o = null;
        if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.Lifecycle", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof AbstractC1785o) {
            abstractC1785o = (AbstractC1785o) obj;
        }
        if (abstractC1785o != null) {
            abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$ensureItemViewBindToLifecycle$1

                /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.ZInstantFullscreenViewHolder$ensureItemViewBindToLifecycle$1$a */
                /* loaded from: classes6.dex */
                public /* synthetic */ class C13036a {

                    /* renamed from: a */
                    public static final /* synthetic */ int[] f67330a;

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
                        f67330a = iArr;
                    }
                }

                public ZInstantFullscreenViewHolder$ensureItemViewBindToLifecycle$1() {
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    ZaloZinstantCommonLayout zaloZinstantCommonLayout;
                    ZaloZinstantCommonLayout zaloZinstantCommonLayout2;
                    AbstractC19074t.m100208f(interfaceC1801w, "source");
                    AbstractC19074t.m100208f(aVar, "event");
                    int i11 = C13036a.f67330a[aVar.ordinal()];
                    if (i11 == 1) {
                        zaloZinstantCommonLayout = ZInstantFullscreenViewHolder.this.f67317M;
                        zaloZinstantCommonLayout.onStart();
                    } else if (i11 == 2) {
                        zaloZinstantCommonLayout2 = ZInstantFullscreenViewHolder.this.f67317M;
                        zaloZinstantCommonLayout2.onStop();
                    } else if (i11 == 3) {
                        interfaceC1801w.getLifecycle().mo9338d(this);
                    }
                }
            });
        }
    }

    /* renamed from: u0 */
    private final void m73259u0() {
        this.f7784p.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13037f());
    }

    /* renamed from: w0 */
    public final void m73260w0() {
        InterfaceC18319c interfaceC18319c = this.f67313I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: z0 */
    public static final void m73261z0(ZInstantFullscreenViewHolder zInstantFullscreenViewHolder) {
        AbstractC19074t.m100208f(zInstantFullscreenViewHolder, "this$0");
        zInstantFullscreenViewHolder.f67319O.setVisibility(8);
    }

    /* renamed from: q0 */
    public final void m73262q0(AbstractC28275a.a0 a0Var) {
        InterfaceC22508f interfaceC22508f;
        C17244x0 m142466a;
        AbstractC19074t.m100208f(a0Var, "data");
        this.f67320P = a0Var;
        if (a0Var != null && (m142466a = a0Var.m142466a()) != null) {
            interfaceC22508f = m142466a.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (interfaceC22508f != null) {
            this.f67317M.m91433f1(interfaceC22508f);
        } else {
            m73264x0();
        }
        if (a0Var.m142467b() != null) {
            m73246A0(a0Var.m142467b(), a0Var.m142468c());
        }
    }

    /* renamed from: v0 */
    public final InterfaceC18319c m73263v0() {
        return this.f67313I;
    }

    /* renamed from: x0 */
    public void m73264x0() {
        this.f67317M.setVisibility(8);
        this.f67318N.setVisibility(8);
        this.f67319O.setVisibility(0);
    }

    /* renamed from: y0 */
    public void m73265y0() {
        String m142467b;
        this.f67317M.setVisibility(0);
        this.f67318N.setVisibility(8);
        if (this.f67319O.getVisibility() != 8) {
            this.f67319O.animate().alpha(0.0f).setDuration(125L).withEndAction(new Runnable() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.a0
                public /* synthetic */ RunnableC13042a0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ZInstantFullscreenViewHolder.m73261z0(ZInstantFullscreenViewHolder.this);
                }
            });
        }
        AbstractC28275a.a0 a0Var = this.f67320P;
        if (a0Var != null && (m142467b = a0Var.m142467b()) != null) {
            m73246A0(m142467b, a0Var.m142468c());
        }
        m73256r0();
    }
}

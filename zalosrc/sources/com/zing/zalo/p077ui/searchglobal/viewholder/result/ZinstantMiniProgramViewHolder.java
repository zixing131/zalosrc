package com.zing.zalo.p077ui.searchglobal.viewholder.result;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
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
import com.zing.zalo.p077ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.utils.ToastUtils;
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
import java.util.ArrayList;
import java.util.List;
import kd0.C21697g;
import l80.C22122a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p612wk.AbstractC29069a;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class ZinstantMiniProgramViewHolder extends RecyclerView.AbstractC1876c0 {
    public static final C13070a Companion = new C13070a(null);

    /* renamed from: S */
    private static final int f67414S = View.generateViewId();

    /* renamed from: T */
    private static final int f67415T = View.generateViewId();

    /* renamed from: U */
    private static final int f67416U = View.generateViewId();

    /* renamed from: V */
    private static final Integer f67417V = null;

    /* renamed from: I */
    private final InterfaceC18319c f67418I;

    /* renamed from: J */
    private final C13077g f67419J;

    /* renamed from: K */
    private final C13076f f67420K;

    /* renamed from: L */
    private final String f67421L;

    /* renamed from: M */
    private final C13074e f67422M;

    /* renamed from: N */
    private final ZaloZinstantCommonLayout f67423N;

    /* renamed from: O */
    private final TextView f67424O;

    /* renamed from: P */
    private final View f67425P;

    /* renamed from: Q */
    private final C13071b f67426Q;

    /* renamed from: R */
    private AbstractC29069a.z f67427R;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$a */
    /* loaded from: classes6.dex */
    public static final class C13070a {
        private C13070a() {
        }

        public /* synthetic */ C13070a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final View m73386b(ViewGroup viewGroup) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext(), null);
            frameLayout.setBackgroundColor(C23212s8.m119607o(frameLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            Context context = frameLayout.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C13071b c13071b = new C13071b(context);
            c13071b.setId(ZinstantMiniProgramViewHolder.f67415T);
            frameLayout.addView(c13071b);
            FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
            frameLayout2.setId(ZinstantMiniProgramViewHolder.f67414S);
            frameLayout2.setVisibility(8);
            frameLayout2.setBackgroundColor(C23212s8.m119607o(frameLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            Context context2 = frameLayout.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            frameLayout2.addView(new C13072c(context2), -1, -2);
            frameLayout.addView(frameLayout2, -1, -2);
            ZaloZinstantCommonLayout zaloZinstantCommonLayout = new ZaloZinstantCommonLayout(viewGroup.getContext());
            zaloZinstantCommonLayout.setId(ZinstantMiniProgramViewHolder.f67416U);
            frameLayout.addView(zaloZinstantCommonLayout);
            if (ZinstantMiniProgramViewHolder.f67417V != null) {
                Context context3 = viewGroup.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                RobotoTextView robotoTextView = new RobotoTextView(context3);
                robotoTextView.setId(ZinstantMiniProgramViewHolder.f67417V.intValue());
                robotoTextView.setTextColor(-65536);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 85;
                frameLayout.addView(robotoTextView, layoutParams);
            }
            return frameLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$b */
    /* loaded from: classes6.dex */
    public static final class C13071b extends ModulesView {

        /* renamed from: K */
        private final C16719g f67428K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13071b(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            setClickable(true);
            setFocusable(true);
            setBackgroundColor(C23212s8.m119607o(context, AbstractC2807a.ui_background));
            m88987U(-1, -2);
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
            this.f67428K = c17023o;
        }

        /* renamed from: V */
        public final C16719g m73387V() {
            return this.f67428K;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$c */
    /* loaded from: classes6.dex */
    public static final class C13072c extends ModulesView {

        /* renamed from: K */
        private ValueAnimator f67429K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13072c(Context context) {
            super(context);
            int i11;
            List m131506n;
            AbstractC19074t.m100208f(context, "context");
            setClickable(true);
            setFocusable(true);
            m88987U(-1, -2);
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
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.result.a
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i15, int i16, int i17, int i18, int i19, int i21, int i22, int i23) {
                    ZinstantMiniProgramViewHolder.C13072c.m73389W(ZinstantMiniProgramViewHolder.C13072c.this, view, i15, i16, i17, i18, i19, i21, i22, i23);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public static final void m73389W(C13072c c13072c, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(c13072c, "this$0");
            if (view.getVisibility() == 0) {
                c13072c.m73390X();
            } else {
                c13072c.m73391Y();
            }
        }

        /* renamed from: X */
        private final void m73390X() {
            ValueAnimator valueAnimator = this.f67429K;
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
                this.f67429K = ofFloat;
            }
        }

        /* renamed from: Y */
        private final void m73391Y() {
            ValueAnimator valueAnimator = this.f67429K;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.f67429K = null;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$d */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13073d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67430a;

        static {
            int[] iArr = new int[AbstractC1785o.b.values().length];
            try {
                iArr[AbstractC1785o.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f67430a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$e */
    /* loaded from: classes6.dex */
    public static final class C13074e extends C17170o {
        C13074e() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: l */
        public String mo44290l() {
            return ZinstantMiniProgramViewHolder.this.f67421L;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$f */
    /* loaded from: classes6.dex */
    public static final class C13076f implements InterfaceC17107c1 {
        C13076f() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: a */
        public void mo72972a() {
            ZinstantMiniProgramViewHolder.this.m73384y0();
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17107c1
        /* renamed from: c */
        public void mo72973c(Exception exc) {
            ZinstantMiniProgramViewHolder.this.m73383x0();
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$g */
    /* loaded from: classes6.dex */
    public static final class C13077g implements InterfaceC17246y0 {
        C13077g() {
        }

        @Override // com.zing.zalo.zinstant.InterfaceC17246y0
        /* renamed from: a */
        public void mo44293a(String str, String str2, InterfaceC24785k interfaceC24785k) {
            ZinstantMiniProgramViewHolder.this.m73366B0(str, str2, interfaceC24785k);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZinstantMiniProgramViewHolder(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73386b(viewGroup));
        TextView textView;
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67418I = interfaceC18319c;
        C13077g c13077g = new C13077g();
        this.f67419J = c13077g;
        C13076f c13076f = new C13076f();
        this.f67420K = c13076f;
        this.f67421L = "ZinstantMiniProgram-" + View.generateViewId();
        C13074e c13074e = new C13074e();
        this.f67422M = c13074e;
        View findViewById = this.f7784p.findViewById(f67416U);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        ZaloZinstantCommonLayout zaloZinstantCommonLayout = (ZaloZinstantCommonLayout) findViewById;
        this.f67423N = zaloZinstantCommonLayout;
        Integer num = f67417V;
        if (num != null) {
            textView = (TextView) this.f7784p.findViewById(num.intValue());
        } else {
            textView = null;
        }
        this.f67424O = textView;
        View findViewById2 = this.f7784p.findViewById(f67414S);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f67425P = findViewById2;
        View findViewById3 = this.f7784p.findViewById(f67415T);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        C13071b c13071b = (C13071b) findViewById3;
        this.f67426Q = c13071b;
        m73380w0();
        zaloZinstantCommonLayout.setZinstantLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        zaloZinstantCommonLayout.setActionDelegate(c13077g);
        zaloZinstantCommonLayout.setLayoutCallback(c13076f);
        zaloZinstantCommonLayout.setContextProvider(c13074e);
        c13071b.m73387V().mo89109M0(new C16719g.c() { // from class: ja0.u0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ZinstantMiniProgramViewHolder.m73370l0(ZinstantMiniProgramViewHolder.this, c16719g);
            }
        });
        findViewById2.setVisibility(0);
        c13071b.setVisibility(8);
        if (textView != null) {
            textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ja0.v0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m73371m0;
                    m73371m0 = ZinstantMiniProgramViewHolder.m73371m0(ZinstantMiniProgramViewHolder.this, view);
                    return m73371m0;
                }
            });
        }
    }

    /* renamed from: A0 */
    private final void m73365A0(String str, String str2) {
        this.f67423N.m91999q0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m73366B0(String str, String str2, InterfaceC24785k interfaceC24785k) {
        AbstractC29069a.h hVar;
        InterfaceC18319c interfaceC18319c = this.f67418I;
        if (interfaceC18319c != null) {
            AbstractC29069a.z zVar = this.f67427R;
            if (zVar != null) {
                hVar = new AbstractC29069a.h(zVar, m9929A());
            } else {
                hVar = null;
            }
            if (((C18316b) interfaceC18319c.mo205i9(new C18316b("Search.ProcessZinstantFeatureCommonAction", str, str2, hVar))) != null) {
                return;
            }
        }
        InterfaceC18319c interfaceC18319c2 = this.f67418I;
        if (interfaceC18319c2 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m73370l0(ZinstantMiniProgramViewHolder zinstantMiniProgramViewHolder, C16719g c16719g) {
        AbstractC19074t.m100208f(zinstantMiniProgramViewHolder, "this$0");
        zinstantMiniProgramViewHolder.f67426Q.setVisibility(8);
        zinstantMiniProgramViewHolder.f67425P.setVisibility(0);
        zinstantMiniProgramViewHolder.f67423N.mo91437z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final boolean m73371m0(ZinstantMiniProgramViewHolder zinstantMiniProgramViewHolder, View view) {
        String str;
        AbstractC29069a.a0 m145234d;
        AbstractC19074t.m100208f(zinstantMiniProgramViewHolder, "this$0");
        AbstractC29069a.z zVar = zinstantMiniProgramViewHolder.f67427R;
        if (zVar != null && (m145234d = zVar.m145234d()) != null) {
            str = m145234d.m145168f();
        } else {
            str = null;
        }
        ToastUtils.showMess(String.valueOf(str));
        return false;
    }

    /* renamed from: v0 */
    private final void m73379v0() {
        Object obj;
        AbstractC1785o abstractC1785o;
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f67418I;
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
        if (bVar != null && C13073d.f67430a[bVar.ordinal()] == 1) {
            this.f67423N.onStart();
        }
    }

    /* renamed from: w0 */
    private final void m73380w0() {
        Object obj;
        C18316b c18316b;
        InterfaceC18319c interfaceC18319c = this.f67418I;
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
            abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$ensureItemViewBindToLifecycle$1

                /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.result.ZinstantMiniProgramViewHolder$ensureItemViewBindToLifecycle$1$a */
                /* loaded from: classes6.dex */
                public /* synthetic */ class C13075a {

                    /* renamed from: a */
                    public static final /* synthetic */ int[] f67433a;

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
                        f67433a = iArr;
                    }
                }

                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    ZaloZinstantCommonLayout zaloZinstantCommonLayout;
                    ZaloZinstantCommonLayout zaloZinstantCommonLayout2;
                    AbstractC19074t.m100208f(interfaceC1801w, "source");
                    AbstractC19074t.m100208f(aVar, "event");
                    int i11 = C13075a.f67433a[aVar.ordinal()];
                    if (i11 == 1) {
                        zaloZinstantCommonLayout = ZinstantMiniProgramViewHolder.this.f67423N;
                        zaloZinstantCommonLayout.onStart();
                    } else if (i11 == 2) {
                        zaloZinstantCommonLayout2 = ZinstantMiniProgramViewHolder.this.f67423N;
                        zaloZinstantCommonLayout2.onStop();
                    } else if (i11 == 3) {
                        interfaceC1801w.getLifecycle().mo9338d(this);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m73381z0(ZinstantMiniProgramViewHolder zinstantMiniProgramViewHolder) {
        AbstractC19074t.m100208f(zinstantMiniProgramViewHolder, "this$0");
        zinstantMiniProgramViewHolder.f67426Q.setVisibility(8);
    }

    /* renamed from: u0 */
    public final void m73382u0(AbstractC29069a.z zVar) {
        InterfaceC22508f interfaceC22508f;
        AbstractC29069a.a0 m145234d;
        C17244x0 m145170h;
        AbstractC19074t.m100208f(zVar, "data");
        this.f67427R = zVar;
        if (zVar != null && (m145234d = zVar.m145234d()) != null && (m145170h = m145234d.m145170h()) != null) {
            interfaceC22508f = m145170h.m92064b();
        } else {
            interfaceC22508f = null;
        }
        if (interfaceC22508f != null) {
            this.f67423N.m91433f1(interfaceC22508f);
        } else {
            m73383x0();
        }
        if (zVar.m145234d().m145167e() != null) {
            m73365A0(zVar.m145234d().m145167e(), zVar.m145234d().m145168f());
        }
        TextView textView = this.f67424O;
        if (textView != null) {
            textView.setText(String.valueOf(zVar.m145234d().m145166d()));
        }
    }

    /* renamed from: x0 */
    public final void m73383x0() {
        this.f67423N.setVisibility(8);
        this.f67425P.setVisibility(8);
        this.f67426Q.setVisibility(0);
    }

    /* renamed from: y0 */
    public final void m73384y0() {
        AbstractC29069a.a0 m145234d;
        String m145167e;
        this.f67423N.setVisibility(0);
        this.f67425P.setVisibility(8);
        if (this.f67426Q.getVisibility() != 8) {
            this.f67426Q.animate().alpha(0.0f).setDuration(125L).withEndAction(new Runnable() { // from class: ja0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    ZinstantMiniProgramViewHolder.m73381z0(ZinstantMiniProgramViewHolder.this);
                }
            });
        }
        AbstractC29069a.z zVar = this.f67427R;
        if (zVar != null && (m145234d = zVar.m145234d()) != null && (m145167e = m145234d.m145167e()) != null) {
            m73365A0(m145167e, m145234d.m145168f());
        }
        m73379v0();
    }
}

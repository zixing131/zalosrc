package zm.voip.p721ui.views.callconfig;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bp0.AbstractC3096i0;
import bp0.AbstractC3104p;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import mi0.C23314b;
import mj0.AbstractC23322a;
import p649xl.C29918m0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import ui0.C27280g;
import vg.AbstractC28025b8;
import vg.C28212v6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zm.voip.p721ui.views.callconfig.CallConfigViewBottomSheet;
import zo0.C32532a;
import zo0.C32538g;
import zo0.C32539h;
import zo0.EnumC32540i;

/* loaded from: classes7.dex */
public final class CallConfigViewBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    private final InterfaceC24854k f149866b1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C32538g.class), new C32476d(new C32475c(this)), new C32477e());

    /* renamed from: c1 */
    private C29918m0 f149867c1;

    /* renamed from: d1 */
    private Switch f149868d1;

    /* renamed from: e1 */
    private ProgressBar f149869e1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$a */
    /* loaded from: classes7.dex */
    public static final class C32473a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f149870t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$a$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f149872t;

            /* renamed from: u */
            final /* synthetic */ CallConfigViewBottomSheet f149873u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33068a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ CallConfigViewBottomSheet f149874p;

                C33068a(CallConfigViewBottomSheet callConfigViewBottomSheet) {
                    this.f149874p = callConfigViewBottomSheet;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C32532a c32532a, Continuation continuation) {
                    this.f149874p.m157258mM(c32532a.m157502f());
                    this.f149874p.m157257lM(c32532a.m157501e());
                    this.f149874p.m157256kM(c32532a.m157499c());
                    if (c32532a.m157500d()) {
                        this.f149874p.close();
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CallConfigViewBottomSheet callConfigViewBottomSheet, Continuation continuation) {
                super(2, continuation);
                this.f149873u = callConfigViewBottomSheet;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f149873u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f149872t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m157511U = this.f149873u.m157243XL().m157511U();
                    C33068a c33068a = new C33068a(this.f149873u);
                    this.f149872t = 1;
                    if (m157511U.mo97893a(c33068a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C32473a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C32473a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f149870t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = CallConfigViewBottomSheet.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(CallConfigViewBottomSheet.this, null);
                this.f149870t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C32473a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$b */
    /* loaded from: classes7.dex */
    public static final class C32474b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f149875t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$b$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f149877t;

            /* renamed from: u */
            final /* synthetic */ CallConfigViewBottomSheet f149878u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33069a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ CallConfigViewBottomSheet f149879p;

                C33069a(CallConfigViewBottomSheet callConfigViewBottomSheet) {
                    this.f149879p = callConfigViewBottomSheet;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C28212v6 c28212v6, Continuation continuation) {
                    this.f149879p.m157254iM(c28212v6);
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CallConfigViewBottomSheet callConfigViewBottomSheet, Continuation continuation) {
                super(2, continuation);
                this.f149878u = callConfigViewBottomSheet;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f149878u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f149877t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m157512V = this.f149878u.m157243XL().m157512V();
                    C33069a c33069a = new C33069a(this.f149878u);
                    this.f149877t = 1;
                    if (m157512V.mo97893a(c33069a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C32474b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C32474b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f149875t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = CallConfigViewBottomSheet.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(CallConfigViewBottomSheet.this, null);
                this.f149875t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C32474b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$c */
    /* loaded from: classes7.dex */
    public static final class C32475c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f149880q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32475c(ZaloView zaloView) {
            super(0);
            this.f149880q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f149880q;
        }
    }

    /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$d */
    /* loaded from: classes7.dex */
    public static final class C32476d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f149881q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32476d(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f149881q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f149881q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: zm.voip.ui.views.callconfig.CallConfigViewBottomSheet$e */
    /* loaded from: classes7.dex */
    static final class C32477e extends AbstractC19075u implements InterfaceC18494a {
        C32477e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return CallConfigViewBottomSheet.this.m157244YL();
        }
    }

    /* renamed from: TL */
    private final ZAppCompatImageView m157239TL(int i11, int i12) {
        ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(getContext());
        Context context = zAppCompatImageView.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        zAppCompatImageView.setImageDrawable(C27280g.m139660c(context, i11, i12));
        return zAppCompatImageView;
    }

    /* renamed from: UL */
    static /* synthetic */ ZAppCompatImageView m157240UL(CallConfigViewBottomSheet callConfigViewBottomSheet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = AbstractC2807a.icon_primary;
        }
        return callConfigViewBottomSheet.m157239TL(i11, i12);
    }

    /* renamed from: VL */
    private final View m157241VL() {
        FrameLayout frameLayout = new FrameLayout(m92689tK());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        Switch r12 = new Switch(m92689tK);
        this.f149868d1 = r12;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        r12.setLayoutParams(layoutParams);
        r12.m90685e(AbstractC2814h.Switch_Medium);
        r12.setOnClickListener(new View.OnClickListener() { // from class: zo0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallConfigViewBottomSheet.m157242WL(CallConfigViewBottomSheet.this, view);
            }
        });
        frameLayout.addView(r12);
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        ProgressBar progressBar = new ProgressBar(m92689tK2);
        this.f149869e1 = progressBar;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        progressBar.setLayoutParams(layoutParams2);
        Context context = frameLayout.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        progressBar.m90610b(C23314b.m122698a(context, AbstractC2814h.ProgressBar_Size24_Blue));
        progressBar.setIndeterminate(true);
        frameLayout.addView(progressBar);
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WL */
    public static final void m157242WL(CallConfigViewBottomSheet callConfigViewBottomSheet, View view) {
        AbstractC19074t.m100208f(callConfigViewBottomSheet, "this$0");
        callConfigViewBottomSheet.m157247bM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XL */
    public final C32538g m157243XL() {
        return (C32538g) this.f149866b1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YL */
    public final C32539h m157244YL() {
        Bundle bundle;
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            bundle = m92650VI.m92642L3();
        } else {
            bundle = null;
        }
        return new C32539h(this, bundle);
    }

    /* renamed from: ZL */
    private final void m157245ZL() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C32473a(null), 3, null);
        InterfaceC1801w m92657cJ2 = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ2), null, null, new C32474b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public static final void m157246aM(CallConfigViewBottomSheet callConfigViewBottomSheet) {
        AbstractC19074t.m100208f(callConfigViewBottomSheet, "this$0");
        C29918m0 c29918m0 = callConfigViewBottomSheet.f149867c1;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        c29918m0.f138632q.setPadding(0, 0, 0, AbstractC3104p.m15696y());
    }

    /* renamed from: bM */
    private final void m157247bM() {
        m157243XL().m157514Z(!m157243XL().m157513X());
        C29918m0 c29918m0 = this.f149867c1;
        C29918m0 c29918m02 = null;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        if (c29918m0.f138634s.getBadgeTitle().getVisibility() == 0) {
            C29918m0 c29918m03 = this.f149867c1;
            if (c29918m03 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29918m02 = c29918m03;
            }
            c29918m02.f138634s.getBadgeTitle().setVisibility(8);
            m157243XL().m157510T("tip.videocall.filter_skin");
        }
    }

    /* renamed from: cM */
    private final void m157248cM() {
        m157243XL().m157515a0();
    }

    /* renamed from: dM */
    private final void m157249dM() {
        boolean z11;
        C32538g m157243XL = m157243XL();
        if (((C32532a) m157243XL().m157511U().getValue()).m157502f() == EnumC32540i.f150298s) {
            z11 = true;
        } else {
            z11 = false;
        }
        m157243XL.m157516b0(z11);
    }

    /* renamed from: eM */
    private final void m157250eM() {
        C29918m0 c29918m0 = this.f149867c1;
        C29918m0 c29918m02 = null;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        ListItem listItem = c29918m0.f138633r;
        listItem.m90587c(m157240UL(this, AbstractC23322a.zds_ic_speaker_line_24, 0, 2, null));
        listItem.m90591l(AbstractC23136l9.m118745s(listItem.getContext(), 56.0f), 0, 0, 0);
        listItem.getIconChevronRight().setVisibility(0);
        listItem.setOnClickListener(new View.OnClickListener() { // from class: zo0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallConfigViewBottomSheet.m157251fM(CallConfigViewBottomSheet.this, view);
            }
        });
        C29918m0 c29918m03 = this.f149867c1;
        if (c29918m03 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m03 = null;
        }
        ListItem listItem2 = c29918m03.f138635t;
        listItem2.m90587c(m157240UL(this, AbstractC23322a.zds_ic_split_screen_line_24, 0, 2, null));
        listItem2.m90591l(AbstractC23136l9.m118745s(listItem2.getContext(), 56.0f), 0, 0, 0);
        listItem2.setOnClickListener(new View.OnClickListener() { // from class: zo0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallConfigViewBottomSheet.m157252gM(CallConfigViewBottomSheet.this, view);
            }
        });
        C29918m0 c29918m04 = this.f149867c1;
        if (c29918m04 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m04 = null;
        }
        ListItem listItem3 = c29918m04.f138634s;
        listItem3.m90587c(m157240UL(this, AbstractC23322a.zds_ic_face_filter_line_24, 0, 2, null));
        listItem3.m90592m(false);
        listItem3.m90589e(m157241VL());
        listItem3.setOnClickListener(new View.OnClickListener() { // from class: zo0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallConfigViewBottomSheet.m157253hM(CallConfigViewBottomSheet.this, view);
            }
        });
        C29918m0 c29918m05 = this.f149867c1;
        if (c29918m05 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29918m02 = c29918m05;
        }
        c29918m02.f138632q.setPadding(0, 0, 0, AbstractC3104p.m15696y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fM */
    public static final void m157251fM(CallConfigViewBottomSheet callConfigViewBottomSheet, View view) {
        AbstractC19074t.m100208f(callConfigViewBottomSheet, "this$0");
        callConfigViewBottomSheet.m157248cM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m157252gM(CallConfigViewBottomSheet callConfigViewBottomSheet, View view) {
        AbstractC19074t.m100208f(callConfigViewBottomSheet, "this$0");
        callConfigViewBottomSheet.m157249dM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m157253hM(CallConfigViewBottomSheet callConfigViewBottomSheet, View view) {
        AbstractC19074t.m100208f(callConfigViewBottomSheet, "this$0");
        Switch r02 = callConfigViewBottomSheet.f149868d1;
        if (r02 == null) {
            AbstractC19074t.m100223u("filterSwitch");
            r02 = null;
        }
        r02.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final void m157254iM(C28212v6 c28212v6) {
        if (c28212v6 != null && AbstractC19074t.m100204b(c28212v6.f131577c, "tip.videocall.filter_skin")) {
            m157255jM(c28212v6);
        }
    }

    /* renamed from: jM */
    private final void m157255jM(C28212v6 c28212v6) {
        if (c28212v6.m142167f() && c28212v6.f131580f) {
            C29918m0 c29918m0 = this.f149867c1;
            if (c29918m0 == null) {
                AbstractC19074t.m100223u("binding");
                c29918m0 = null;
            }
            Badge badgeTitle = c29918m0.f138634s.getBadgeTitle();
            Context context = badgeTitle.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            C16974f c16974f = new C16974f(context);
            c16974f.m90974x(EnumC16991i.FEATURE_DOT);
            badgeTitle.m90493g(c16974f);
            badgeTitle.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public final void m157256kM(int i11) {
        C29918m0 c29918m0 = null;
        if (i11 == 2) {
            C29918m0 c29918m02 = this.f149867c1;
            if (c29918m02 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29918m0 = c29918m02;
            }
            ListItem listItem = c29918m0.f138633r;
            String m92652XI = m92652XI(AbstractC8020f0.str_call_blu_speaker_select);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            listItem.setTitle(m92652XI);
            return;
        }
        C29918m0 c29918m03 = this.f149867c1;
        if (c29918m03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29918m0 = c29918m03;
        }
        ListItem listItem2 = c29918m0.f138633r;
        String m92652XI2 = m92652XI(AbstractC8020f0.str_call_ex_speaker_select);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        listItem2.setTitle(m92652XI2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final void m157257lM(EnumC32540i enumC32540i) {
        int i11;
        boolean z11;
        int i12;
        C29918m0 c29918m0 = this.f149867c1;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        ListItem listItem = c29918m0.f138634s;
        int i13 = 8;
        boolean z12 = false;
        if (enumC32540i == EnumC32540i.f150295p) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        listItem.setVisibility(i11);
        Switch r22 = this.f149868d1;
        if (r22 == null) {
            AbstractC19074t.m100223u("filterSwitch");
            r22 = null;
        }
        if (enumC32540i == EnumC32540i.f150299t) {
            z11 = true;
        } else {
            z11 = false;
        }
        r22.m90686i(z11, false);
        Switch r23 = this.f149868d1;
        if (r23 == null) {
            AbstractC19074t.m100223u("filterSwitch");
            r23 = null;
        }
        EnumC32540i enumC32540i2 = EnumC32540i.f150297r;
        if (enumC32540i == enumC32540i2) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        r23.setVisibility(i12);
        ProgressBar progressBar = this.f149869e1;
        if (progressBar == null) {
            AbstractC19074t.m100223u("filterLoading");
            progressBar = null;
        }
        if (enumC32540i == enumC32540i2) {
            i13 = 0;
        }
        progressBar.setVisibility(i13);
        if (enumC32540i == EnumC32540i.f150296q) {
            listItem.setEnabled(false);
            listItem.m90587c(m157239TL(AbstractC23322a.zds_ic_face_filter_line_24, AbstractC2807a.icon_disabled));
        } else {
            listItem.setEnabled(true);
            listItem.m90587c(m157240UL(this, AbstractC23322a.zds_ic_face_filter_line_24, 0, 2, null));
        }
        if (enumC32540i != enumC32540i2) {
            z12 = true;
        }
        listItem.setClickable(z12);
        if (enumC32540i == EnumC32540i.f150300u) {
            AbstractC3096i0.m15522W0(m92652XI(AbstractC8020f0.str_filter_call_v2_init_fail));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final void m157258mM(EnumC32540i enumC32540i) {
        int i11;
        int i12;
        String m92652XI;
        boolean z11;
        C29918m0 c29918m0 = this.f149867c1;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        ListItem listItem = c29918m0.f138635t;
        EnumC32540i enumC32540i2 = EnumC32540i.f150295p;
        boolean z12 = false;
        if (enumC32540i == enumC32540i2) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        listItem.setVisibility(i11);
        if (enumC32540i == EnumC32540i.f150299t) {
            listItem.m90587c(m157240UL(this, AbstractC23322a.zds_ic_full_view_line_24, 0, 2, null));
            m92652XI = m92652XI(AbstractC8020f0.str_call_top_menu_full_view);
            AbstractC19074t.m100205c(m92652XI);
        } else {
            int i13 = AbstractC23322a.zds_ic_split_screen_line_24;
            if (enumC32540i == EnumC32540i.f150296q) {
                i12 = AbstractC2807a.icon_disabled;
            } else {
                i12 = AbstractC2807a.icon_primary;
            }
            listItem.m90587c(m157239TL(i13, i12));
            m92652XI = m92652XI(AbstractC8020f0.str_call_split_view_mode);
            AbstractC19074t.m100205c(m92652XI);
        }
        listItem.setTitle(m92652XI);
        if (((C32532a) m157243XL().m157511U().getValue()).m157501e() != enumC32540i2) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItem.m90592m(z11);
        if (enumC32540i != EnumC32540i.f150296q) {
            z12 = true;
        }
        listItem.setEnabled(z12);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        List m131381c0;
        super.mo37111CJ(bundle);
        m157243XL().m157517c0();
        C32538g m157243XL = m157243XL();
        String[] strArr = AbstractC28025b8.f130833J;
        AbstractC19074t.m100207e(strArr, "ARR_CALL_CONFIG_SCREEN_TIPS");
        m131381c0 = AbstractC25358n.m131381c0(strArr);
        m157243XL.m157509R(m131381c0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        m157243XL().m157518e0();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29918m0 m148224c = C29918m0.m148224c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148224c, "inflate(...)");
        this.f149867c1 = m148224c;
        m157250eM();
        m90533zL(EnumC17017m.HUG_CONTENT);
        m157245ZL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C29918m0 c29918m0 = this.f149867c1;
        if (c29918m0 == null) {
            AbstractC19074t.m100223u("binding");
            c29918m0 = null;
        }
        c29918m0.f138632q.post(new Runnable() { // from class: zo0.b
            @Override // java.lang.Runnable
            public final void run() {
                CallConfigViewBottomSheet.m157246aM(CallConfigViewBottomSheet.this);
            }
        });
    }
}

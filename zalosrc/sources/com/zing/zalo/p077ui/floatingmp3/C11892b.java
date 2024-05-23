package com.zing.zalo.p077ui.floatingmp3;

import am.AbstractC0924m0;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import androidx.core.text.AbstractC1463b;
import androidx.lifecycle.AbstractC1791r;
import androidx.lifecycle.AbstractC1803x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.libbubbleview.AbstractC8948a;
import com.zing.zalo.libbubbleview.C8949b;
import com.zing.zalo.libbubbleview.FloatingItemView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.zdesign.component.TooltipView;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qi0.C25297f;
import qi0.EnumC25293b;
import qi0.EnumC25294c;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import yt.AbstractC31072b;
import yt.C31071a;
import yt.C31081k;
import z60.InterfaceC31703f;

/* renamed from: com.zing.zalo.ui.floatingmp3.b */
/* loaded from: classes5.dex */
public final class C11892b extends C8949b {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private TooltipView f61961g;

    /* renamed from: h */
    private final InterfaceC24854k f61962h;

    /* renamed from: i */
    private Boolean f61963i;

    /* renamed from: j */
    private boolean f61964j;

    /* renamed from: k */
    private final f f61965k;

    /* renamed from: com.zing.zalo.ui.floatingmp3.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f61966q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f61966q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1791r mo12V4() {
            Context context = this.f61966q;
            AbstractC19074t.m100206d(context, "null cannot be cast to non-null type com.zing.zalo.activity.ZaloActivity");
            return AbstractC1803x.m9388a((ZaloActivity) context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.floatingmp3.b$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f61967t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f61967t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145339a(AbstractC0924m0.m3747db());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends TooltipView.AbstractC16939c {
        d() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.AbstractC16939c
        /* renamed from: a */
        public void mo60330a() {
            super.mo60330a();
            TooltipView tooltipView = C11892b.this.f61961g;
            if (tooltipView != null) {
                tooltipView.m90727Q();
            }
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Tooltip dismissed", new Object[0]);
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.AbstractC16939c
        /* renamed from: b */
        public void mo60331b() {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Tooltip shown", new Object[0]);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.b$e */
    /* loaded from: classes5.dex */
    public static final class e implements TooltipView.InterfaceC16938b {

        /* renamed from: com.zing.zalo.ui.floatingmp3.b$e$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f61970t;

            a(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f61970t == 0) {
                    AbstractC24862s.m129228b(obj);
                    AbstractC0924m0.m3376Qk(false);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        e() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            AbstractC20110a.f98889a.m104564x("ZingMp3Sdk").mo104548a("Tooltip finished", new Object[0]);
            C11892b.this.f61963i = Boolean.FALSE;
            BuildersKt__Builders_commonKt.m112540d(C11892b.this.m66106w(), Dispatchers.m112680b(), null, new a(null), 2, null);
        }
    }

    /* renamed from: com.zing.zalo.ui.floatingmp3.b$f */
    /* loaded from: classes5.dex */
    public static final class f implements InterfaceC31703f {

        /* renamed from: com.zing.zalo.ui.floatingmp3.b$f$a */
        /* loaded from: classes5.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f61972t;

            /* renamed from: u */
            int f61973u;

            /* renamed from: v */
            final /* synthetic */ C11892b f61974v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C11892b c11892b, Continuation continuation) {
                super(2, continuation);
                this.f61974v = c11892b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f61974v, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C11892b c11892b;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f61973u;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            this.f61974v.m66108z();
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c11892b = (C11892b) this.f61972t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (this.f61974v.f61963i == null) {
                        c11892b = this.f61974v;
                        this.f61972t = c11892b;
                        this.f61973u = 1;
                        obj = c11892b.m66107x(this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    if (AbstractC19074t.m100204b(this.f61974v.f61963i, AbstractC29094b.m145339a(true))) {
                        this.f61972t = null;
                        this.f61973u = 2;
                        if (DelayKt.m112666b(250L, this) == m142578e) {
                            return m142578e;
                        }
                        this.f61974v.m66108z();
                    }
                    return C24848g0.f119245a;
                }
                c11892b.f61963i = (Boolean) obj;
                if (AbstractC19074t.m100204b(this.f61974v.f61963i, AbstractC29094b.m145339a(true))) {
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        f() {
        }

        @Override // z60.InterfaceC31703f
        /* renamed from: a */
        public void mo66115a() {
            C11891a.Companion.m66084d();
        }

        @Override // z60.InterfaceC31703f
        /* renamed from: b */
        public void mo66116b() {
            BuildersKt__Builders_commonKt.m112540d(C11892b.this.m66106w(), null, null, new a(C11892b.this, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11892b(Context context, C31081k c31081k, FloatingItemView.InterfaceC8946b interfaceC8946b, C31071a c31071a) {
        super(context, c31081k, interfaceC8946b, c31071a);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c31081k, "windowManagerContainer");
        AbstractC19074t.m100208f(interfaceC8946b, "mAButtonListener");
        AbstractC19074t.m100208f(c31071a, "floatingConfig");
        m129210a = AbstractC24856m.m129210a(new b(context));
        this.f61962h = m129210a;
        this.f61965k = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final CoroutineScope m66106w() {
        return (CoroutineScope) this.f61962h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public final Object m66107x(Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new c(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m66108z() {
        if (MainTabView.m67645lM() != null && MainTabView.m67645lM().f63219I1 != null && !MainTabView.m67645lM().f63219I1.m74707p() && MainTabView.m67645lM().m92672lJ()) {
            View m151009l = m47767k().m151009l();
            AbstractC19074t.m100206d(m151009l, "null cannot be cast to non-null type com.zing.zalo.ui.floatingmp3.FloatingMp3PlayerView");
            FloatingMp3PlayerView floatingMp3PlayerView = (FloatingMp3PlayerView) m151009l;
            if (floatingMp3PlayerView.getPlayerView().getVisibility() == 0 && floatingMp3PlayerView.getPlayerView().getIvThumb().getVisibility() == 0 && !this.f61964j) {
                TooltipView tooltipView = this.f61961g;
                if (tooltipView == null || !tooltipView.isShown()) {
                    this.f61964j = true;
                    C25297f m130959a = C25297f.Companion.m130959a(m47761e());
                    m130959a.m130925c0(floatingMp3PlayerView.getPlayerView().getIvThumb());
                    Spanned m7440a = AbstractC1463b.m7440a(m47761e().getString(AbstractC8020f0.str_floating_mp3_feature_intro), 63);
                    AbstractC19074t.m100207e(m7440a, "fromHtml(...)");
                    m130959a.m130927d0(m7440a);
                    String string = m47761e().getString(AbstractC8020f0.str_floating_mp3_feature_got_it);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    m130959a.m130911Q(string);
                    m130959a.m130918X(EnumC25294c.TOP);
                    m130959a.m130920Z(true);
                    m130959a.m130912R(EnumC25293b.RECTANGLE);
                    m130959a.m130923b0(AbstractC8948a.Companion.m47751c(m47761e(), 8.0f));
                    m130959a.m130943l0(0);
                    TooltipView tooltipView2 = new TooltipView(m47761e());
                    tooltipView2.setConfigs(m130959a);
                    C13306b c13306b = MainTabView.m67645lM().f63219I1;
                    AbstractC19074t.m100207e(c13306b, "mShowcaseManager");
                    tooltipView2.setTooltipManager(c13306b);
                    tooltipView2.setOnTooltipShowHideListener(new d());
                    tooltipView2.setOnTooltipFinishedListener(new e());
                    tooltipView2.m90733c0();
                    this.f61961g = tooltipView2;
                }
            }
        }
    }

    /* renamed from: v */
    public final void m66109v(AbstractC31072b abstractC31072b) {
        AbstractC19074t.m100208f(abstractC31072b, "floatingItemData");
        m47767k().m151012p();
        m47767k().m151003d(new FloatingMp3PlayerView(this, m47761e(), abstractC31072b, m47765i(), m47763g(), this.f61965k), C31081k.m151001i(m47767k(), -2, -2, 8388615, 0, 0, 0, 48, null));
    }

    /* renamed from: y */
    public final boolean m66110y() {
        TooltipView tooltipView = this.f61961g;
        if (tooltipView != null) {
            return tooltipView.isShown();
        }
        return false;
    }
}

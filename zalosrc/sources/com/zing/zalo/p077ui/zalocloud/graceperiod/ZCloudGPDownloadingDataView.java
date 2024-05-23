package com.zing.zalo.p077ui.zalocloud.graceperiod;

import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import k30.C21459a;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p205hc.C19965d;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p649xl.AbstractC30090ve;
import p664y.AbstractC30228a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import vl0.AbstractC28291a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import zb0.AbstractC31776e;
import zb0.AbstractC31778g;
import zb0.C31774c;
import zb0.C31777f;

/* loaded from: classes6.dex */
public final class ZCloudGPDownloadingDataView extends BaseZCloudView<AbstractC30090ve> {
    public static final C13843a Companion = new C13843a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f71557R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71558S0;

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$a */
    /* loaded from: classes6.dex */
    public static final class C13843a {
        private C13843a() {
        }

        public /* synthetic */ C13843a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$b */
    /* loaded from: classes6.dex */
    public static final class C13844b extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18494a f71559p;

        C13844b(InterfaceC18494a interfaceC18494a) {
            this.f71559p = interfaceC18494a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            this.f71559p.mo12V4();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(AbstractC23136l9.m118641B(MainApplication.Companion.m35500c(), AbstractC16801x.cLink1));
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$c */
    /* loaded from: classes6.dex */
    static final class C13845c extends AbstractC19075u implements InterfaceC18494a {
        C13845c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31774c mo12V4() {
            ZaloView m92690uK = ZCloudGPDownloadingDataView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C31774c) new C1802w0(m92690uK).m9378a(C31774c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$d */
    /* loaded from: classes6.dex */
    static final class C13846d extends AbstractC19075u implements InterfaceC18494a {
        C13846d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31777f mo12V4() {
            return (C31777f) new C1802w0(ZCloudGPDownloadingDataView.this).m9378a(C31777f.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$e */
    /* loaded from: classes6.dex */
    static final class C13847e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$e$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f71563q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final Long mo12V4() {
                return Long.valueOf(AbstractC0924m0.m4104p8());
            }
        }

        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$e$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ ZCloudGPDownloadingDataView f71564q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ZCloudGPDownloadingDataView zCloudGPDownloadingDataView) {
                super(0);
                this.f71564q = zCloudGPDownloadingDataView;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m77167a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m77167a() {
                AbstractC0924m0.m2977Cr(this.f71564q.m77757mM().mo124314i());
            }
        }

        C13847e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77165a(AbstractC31776e abstractC31776e) {
            AbstractC19074t.m100208f(abstractC31776e, "event");
            if (AbstractC19074t.m100204b(abstractC31776e, AbstractC31776e.a.f145909a)) {
                ZCloudGPDownloadingDataView zCloudGPDownloadingDataView = ZCloudGPDownloadingDataView.this;
                zCloudGPDownloadingDataView.m77754gM(a.f71563q, new b(zCloudGPDownloadingDataView));
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_download_start", null, null, null, 14, null);
                if (!AbstractC23306f.m120627V1().m90248s()) {
                    C31777f.m152799R(ZCloudGPDownloadingDataView.this.m77161yM(), false, 1, null);
                    return;
                }
                return;
            }
            if (abstractC31776e instanceof AbstractC31776e.b) {
                int m90208a = ((AbstractC31776e.b) abstractC31776e).m152798a().m90208a();
                if (m90208a == 4) {
                    ZCloudGPDownloadingDataView.this.m77154DM(2);
                } else if (m90208a != 5) {
                    ZCloudGPDownloadingDataView.this.m77154DM(3);
                } else {
                    ZCloudGPDownloadingDataView.this.m77154DM(1);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77165a((AbstractC31776e) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$f */
    /* loaded from: classes6.dex */
    static final class C13848f extends AbstractC19075u implements InterfaceC18505l {
        C13848f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77168a(AbstractC31778g abstractC31778g) {
            throw null;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            AbstractC30228a.m149044a(obj);
            m77168a(null);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$g */
    /* loaded from: classes6.dex */
    static final class C13849g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71566t;

        /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$g$a */
        /* loaded from: classes6.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ ZCloudGPDownloadingDataView f71568p;

            a(ZCloudGPDownloadingDataView zCloudGPDownloadingDataView) {
                this.f71568p = zCloudGPDownloadingDataView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(ZaloCloudRecoverCloudMediaWorker.AbstractC16884f abstractC16884f, Continuation continuation) {
                if (!AbstractC19074t.m100204b(abstractC16884f, ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.c.f85905b)) {
                    if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) {
                        if (((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d) abstractC16884f).m90211b() == 1) {
                            this.f71568p.m77161yM().m152803P(abstractC16884f);
                        }
                    } else if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) {
                        this.f71568p.m77162zM(((ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.a) abstractC16884f).m90209b(), false);
                        this.f71568p.m77151AM(AbstractC16889b.c.f85930d);
                    } else if (abstractC16884f instanceof ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) {
                        ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b bVar = (ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.b) abstractC16884f;
                        this.f71568p.m77162zM(bVar.m90210b().m90259b(), true);
                        this.f71568p.m77151AM(bVar.m90210b());
                    }
                }
                return C24848g0.f119245a;
            }
        }

        C13849g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13849g(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71566t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m152802O = ZCloudGPDownloadingDataView.this.m77161yM().m152802O();
                a aVar = new a(ZCloudGPDownloadingDataView.this);
                this.f71566t = 1;
                if (m152802O.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13849g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$h */
    /* loaded from: classes6.dex */
    static final class C13850h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71569p;

        C13850h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71569p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71569p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f71569p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$i */
    /* loaded from: classes6.dex */
    public static final class C13851i extends AbstractC19075u implements InterfaceC18494a {
        C13851i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77171a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77171a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_full_storage_resolve", null, null, null, 14, null);
            AbstractC23152n3.m119078x0(ZCloudGPDownloadingDataView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$j */
    /* loaded from: classes6.dex */
    public static final class C13852j extends AbstractC19075u implements InterfaceC18494a {
        C13852j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77172a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77172a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_full_storage_help", null, null, null, 14, null);
            AbstractC23152n3.m119050j0(ZCloudGPDownloadingDataView.this.m92689tK(), C21275a.Companion.m110211a().m110204g().m116313e());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$k */
    /* loaded from: classes6.dex */
    public static final class C13853k extends AbstractC19075u implements InterfaceC18494a {
        C13853k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77173a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77173a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_full_storage", null, null, null, 14, null);
            ZCloudGPDownloadingDataView.this.m77161yM().m152804Q(true);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadingDataView$l */
    /* loaded from: classes6.dex */
    public static final class C13854l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f71573q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13854l(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f71573q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77174a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77174a() {
            this.f71573q.mo12V4();
        }
    }

    public ZCloudGPDownloadingDataView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C13846d());
        this.f71557R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13845c());
        this.f71558S0 = m129210a2;
    }

    /* renamed from: AM */
    public final void m77151AM(AbstractC16889b abstractC16889b) {
        int i11;
        String m92652XI;
        AbstractC16889b.c cVar = AbstractC16889b.c.f85930d;
        boolean m100204b = AbstractC19074t.m100204b(abstractC16889b, cVar);
        boolean z11 = !m100204b;
        RelativeLayout relativeLayout = ((AbstractC30090ve) m77756kM()).f139721Q;
        AbstractC19074t.m100207e(relativeLayout, "errorContainer");
        int i12 = 8;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        relativeLayout.setVisibility(i11);
        RobotoTextView robotoTextView = ((AbstractC30090ve) m77756kM()).f139727W;
        if (z11) {
            Context context = getContext();
            if (context != null) {
                m92652XI = context.getString(AbstractC8020f0.str_pausing);
            } else {
                m92652XI = null;
            }
        } else {
            m92652XI = m92652XI(AbstractC8020f0.downloading);
        }
        robotoTextView.setText(m92652XI);
        RobotoTextView robotoTextView2 = ((AbstractC30090ve) m77756kM()).f139730Z;
        AbstractC19074t.m100207e(robotoTextView2, "tvProgress");
        if (m100204b) {
            i12 = 0;
        }
        robotoTextView2.setVisibility(i12);
        if (!AbstractC19074t.m100204b(abstractC16889b, cVar)) {
            if (abstractC16889b instanceof AbstractC16889b.d) {
                if (AbstractC23152n3.m119051k(getContext())) {
                    RobotoTextView robotoTextView3 = ((AbstractC30090ve) m77756kM()).f139728X;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m92652XI2 = m92652XI(AbstractC8020f0.str_err_storage);
                    AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                    AbstractC16889b.d dVar = (AbstractC16889b.d) abstractC16889b;
                    String format = String.format(m92652XI2, Arrays.copyOf(new Object[]{C21459a.m111038f(dVar.m90260c(), 0, 2, null)}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    String m92652XI3 = m92652XI(AbstractC8020f0.str_clean_up_storage);
                    AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                    robotoTextView3.setText(m77152BM(format, m92652XI3, C21459a.m111038f(dVar.m90260c(), 0, 2, null), new C13851i()));
                    return;
                }
                RobotoTextView robotoTextView4 = ((AbstractC30090ve) m77756kM()).f139728X;
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m92652XI4 = m92652XI(AbstractC8020f0.str_err_storage);
                AbstractC19074t.m100207e(m92652XI4, "getString(...)");
                AbstractC16889b.d dVar2 = (AbstractC16889b.d) abstractC16889b;
                String format2 = String.format(m92652XI4, Arrays.copyOf(new Object[]{C21459a.m111038f(dVar2.m90260c(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(format2, "format(...)");
                String m92652XI5 = m92652XI(AbstractC8020f0.str_view_instructions);
                AbstractC19074t.m100207e(m92652XI5, "getString(...)");
                robotoTextView4.setText(m77152BM(format2, m92652XI5, C21459a.m111038f(dVar2.m90260c(), 0, 2, null), new C13852j()));
                return;
            }
            if (abstractC16889b instanceof AbstractC16889b.a) {
                ((AbstractC30090ve) m77756kM()).f139728X.setText(m92652XI(AbstractC8020f0.str_err_battery));
                return;
            }
            if (abstractC16889b instanceof AbstractC16889b.b) {
                ((AbstractC30090ve) m77756kM()).f139728X.setText(m92652XI(AbstractC8020f0.str_err_wifi));
                return;
            }
            RobotoTextView robotoTextView5 = ((AbstractC30090ve) m77756kM()).f139728X;
            String m92652XI6 = m92652XI(AbstractC8020f0.str_err_unknown);
            AbstractC19074t.m100207e(m92652XI6, "getString(...)");
            String m92652XI7 = m92652XI(AbstractC8020f0.str_continue_download);
            AbstractC19074t.m100207e(m92652XI7, "getString(...)");
            robotoTextView5.setText(m77153CM(this, m92652XI6, m92652XI7, null, new C13853k(), 4, null));
        }
    }

    /* renamed from: BM */
    private final SpannableStringBuilder m77152BM(String str, String str2, String str3, InterfaceC18494a interfaceC18494a) {
        int m127173b0;
        SpannableString spannableString = new SpannableString(str);
        m127173b0 = AbstractC24342w.m127173b0(spannableString, str3, 0, false, 6, null);
        spannableString.setSpan(new StyleSpan(1), m127173b0, str3.length() + m127173b0, 0);
        SpannableString spannableString2 = new SpannableString(str2);
        spannableString2.setSpan(m77160xM(new C13854l(interfaceC18494a)), 0, str2.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString2);
        return spannableStringBuilder;
    }

    /* renamed from: CM */
    static /* synthetic */ SpannableStringBuilder m77153CM(ZCloudGPDownloadingDataView zCloudGPDownloadingDataView, String str, String str2, String str3, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        return zCloudGPDownloadingDataView.m77152BM(str, str2, str3, interfaceC18494a);
    }

    /* renamed from: DM */
    public final void m77154DM(int i11) {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            int i12 = AbstractC6918a0.container;
            Bundle bundle = new Bundle();
            bundle.putInt("ARG_MODE", i11);
            C24848g0 c24848g0 = C24848g0.f119245a;
            m92662fJ.m93062f2(i12, ZCloudGPDownloadCompleteDataView.class, bundle, 1, true);
        }
    }

    /* renamed from: xM */
    private final ClickableSpan m77160xM(InterfaceC18494a interfaceC18494a) {
        return new C13844b(interfaceC18494a);
    }

    /* renamed from: yM */
    public final C31777f m77161yM() {
        return (C31777f) this.f71557R0.getValue();
    }

    /* renamed from: zM */
    public final void m77162zM(float f11, boolean z11) {
        if (z11) {
            ProgressBar progressBar = ((AbstractC30090ve) m77756kM()).f139724T;
            progressBar.setProgressIndicatorColor(C23212s8.m119606n(AbstractC28291a.storage_legend_paused));
            progressBar.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.storage_legend_empty));
        } else {
            ProgressBar progressBar2 = ((AbstractC30090ve) m77756kM()).f139724T;
            progressBar2.setProgressIndicatorColor(C23212s8.m119606n(AbstractC2807a.progress_indicator_blue));
            progressBar2.setProgressBackgroundColor(C23212s8.m119606n(AbstractC2807a.progress_track_background_black));
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        ((AbstractC30090ve) m77756kM()).f139730Z.setText(decimalFormat.format(Float.valueOf(f11)) + "%");
        ProgressBar progressBar3 = ((AbstractC30090ve) m77756kM()).f139724T;
        AbstractC19074t.m100207e(progressBar3, "progressBar");
        ProgressBar.m90609f(progressBar3, f11, false, 2, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudGraceDownloadFullscreen";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_gp_downloading_data_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC30090ve) m77756kM()).f139728X.setMovementMethod(LinkMovementMethod.getInstance());
        ((AbstractC30090ve) m77756kM()).f139729Y.setText(C21459a.m111038f(AbstractC23306f.m120627V1().m90236f(), 0, 2, null));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77161yM().m152800M().m9219j(m92657cJ(), new C19965d(new C13847e()));
        m77161yM().m152801N().m9219j(m92657cJ(), new C13850h(new C13848f()));
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), null, null, new C13849g(null), 3, null);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        C24848g0 c24848g0;
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_back_btn ", null, null, null, 14, null);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            finish();
        }
    }
}

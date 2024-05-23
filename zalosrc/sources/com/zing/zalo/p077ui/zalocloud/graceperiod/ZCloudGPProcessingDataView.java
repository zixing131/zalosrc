package com.zing.zalo.p077ui.zalocloud.graceperiod;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0900b0;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.graceperiod.ZCloudGPProcessingDataView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import hu.C20128b;
import java.util.Arrays;
import k30.C21459a;
import ln0.AbstractC22543l;
import me0.AbstractC23152n3;
import me0.C23055e5;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24342w;
import p205hc.C19965d;
import p269jj.C21275a;
import p363nh.C23744a;
import p649xl.AbstractC30158ze;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import ui0.C27280g;
import zb0.AbstractC31779h;
import zb0.C31772a;
import zb0.C31774c;
import zb0.C31775d;
import zb0.C31780i;
import zb0.C31781j;

/* loaded from: classes6.dex */
public final class ZCloudGPProcessingDataView extends BaseZCloudView<AbstractC30158ze> {
    public static final C13857a Companion = new C13857a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f71578R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71579S0;

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$a */
    /* loaded from: classes6.dex */
    public static final class C13857a {
        private C13857a() {
        }

        public /* synthetic */ C13857a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$b */
    /* loaded from: classes6.dex */
    static final class C13858b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13858b f71580q = new C13858b();

        C13858b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Long mo12V4() {
            return Long.valueOf(AbstractC0924m0.m4074o8());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$c */
    /* loaded from: classes6.dex */
    static final class C13859c extends AbstractC19075u implements InterfaceC18494a {
        C13859c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77196a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77196a() {
            AbstractC0924m0.m2948Br(ZCloudGPProcessingDataView.this.m77757mM().mo124314i());
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$d */
    /* loaded from: classes6.dex */
    static final class C13860d extends AbstractC19075u implements InterfaceC18494a {
        C13860d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31774c mo12V4() {
            ZaloView m92690uK = ZCloudGPProcessingDataView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C31774c) new C1802w0(m92690uK).m9378a(C31774c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$e */
    /* loaded from: classes6.dex */
    static final class C13861e extends AbstractC19075u implements InterfaceC18494a {
        C13861e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31780i mo12V4() {
            return (C31780i) new C1802w0(ZCloudGPProcessingDataView.this).m9378a(C31780i.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$f */
    /* loaded from: classes6.dex */
    static final class C13862f extends AbstractC19075u implements InterfaceC18505l {
        C13862f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77199a(AbstractC31779h abstractC31779h) {
            AbstractC19074t.m100208f(abstractC31779h, "event");
            if (AbstractC19074t.m100204b(abstractC31779h, AbstractC31779h.a.f145914a)) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_download_analyze_start", null, null, null, 14, null);
                ZCloudGPProcessingDataView.this.m77194zM().m152789i();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77199a((AbstractC31779h) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$g */
    /* loaded from: classes6.dex */
    static final class C13863g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C13863g f71585q = new C13863g();

        C13863g() {
            super(1);
        }

        /* renamed from: a */
        public final void m77200a(C31781j c31781j) {
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77200a((C31781j) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$h */
    /* loaded from: classes6.dex */
    static final class C13864h extends AbstractC19075u implements InterfaceC18505l {
        C13864h() {
            super(1);
        }

        /* renamed from: a */
        public final void m77201a(C31775d c31775d) {
            ZCloudGPProcessingDataView.this.m77184EM(c31775d.m152796c());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77201a((C31775d) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPProcessingDataView$i */
    /* loaded from: classes6.dex */
    static final class C13865i implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71587p;

        C13865i(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71587p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71587p;
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
            this.f71587p.mo205i9(obj);
        }
    }

    public ZCloudGPProcessingDataView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C13861e());
        this.f71578R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13860d());
        this.f71579S0 = m129210a2;
    }

    /* renamed from: AM */
    private final C31780i m77180AM() {
        return (C31780i) this.f71578R0.getValue();
    }

    /* renamed from: BM */
    public static final void m77181BM(ZCloudGPProcessingDataView zCloudGPProcessingDataView, View view) {
        AbstractC19074t.m100208f(zCloudGPProcessingDataView, "this$0");
        if (AbstractC23152n3.m119051k(zCloudGPProcessingDataView.getContext())) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_free_storage", null, null, null, 14, null);
            AbstractC23152n3.m119078x0(zCloudGPProcessingDataView.getContext());
        } else {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_free_storage_help", null, null, null, 14, null);
            AbstractC23152n3.m119050j0(zCloudGPProcessingDataView.m92689tK(), C21275a.Companion.m110211a().m110204g().m116313e());
        }
    }

    /* renamed from: CM */
    public static final void m77182CM(ZCloudGPProcessingDataView zCloudGPProcessingDataView, View view) {
        AbstractC19074t.m100208f(zCloudGPProcessingDataView, "this$0");
        if (!C23055e5.m118270e()) {
            ToastUtils.showMess(zCloudGPProcessingDataView.m92652XI(AbstractC8020f0.str_err_wifi));
        } else if (!ZaloCloudRecoverCloudMediaWorker.Companion.m90202l()) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_ready_state", null, null, null, 14, null);
            ToastUtils.showMess(zCloudGPProcessingDataView.m92652XI(AbstractC8020f0.str_err_battery));
        } else {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_start_btn", null, null, null, 14, null);
            zCloudGPProcessingDataView.m77185FM();
        }
    }

    /* renamed from: DM */
    public static final void m77183DM(ZCloudGPProcessingDataView zCloudGPProcessingDataView, View view) {
        AbstractC19074t.m100208f(zCloudGPProcessingDataView, "this$0");
        zCloudGPProcessingDataView.m77194zM().m152787a0();
    }

    /* renamed from: EM */
    public final void m77184EM(C31772a c31772a) {
        boolean z11;
        int i11;
        int i12;
        if (c31772a != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        FrameLayout frameLayout = ((AbstractC30158ze) m77756kM()).f140155T;
        AbstractC19074t.m100207e(frameLayout, "calculatingContainer");
        int i13 = 8;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        frameLayout.setVisibility(i11);
        LinearLayout linearLayout = ((AbstractC30158ze) m77756kM()).f140151P;
        AbstractC19074t.m100207e(linearLayout, "bottomContainer");
        if (z11) {
            i13 = 0;
        }
        linearLayout.setVisibility(i13);
        LinearLayout linearLayout2 = ((AbstractC30158ze) m77756kM()).f140156U;
        AbstractC19074t.m100207e(linearLayout2, "detailsContainer");
        if (!z11) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        linearLayout2.setVisibility(i12);
        ((AbstractC30158ze) m77756kM()).f140153R.setEnabled(z11);
        if (c31772a != null) {
            ((AbstractC30158ze) m77756kM()).f140166e0.setText(C21459a.m111038f(c31772a.m152768e(), 0, 2, null));
            RobotoTextView robotoTextView = ((AbstractC30158ze) m77756kM()).f140165d0;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_need_download);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C21459a.m111038f(c31772a.m152766c(), 0, 2, null)}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            robotoTextView.setText(m77193yM(format, C21459a.m111038f(c31772a.m152766c(), 0, 2, null)));
            RobotoTextView robotoTextView2 = ((AbstractC30158ze) m77756kM()).f140164c0;
            String m92652XI2 = m92652XI(AbstractC8020f0.str_data_size_downloaded);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{C21459a.m111038f(c31772a.m152764a(), 0, 2, null)}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            robotoTextView2.setText(m77193yM(format2, C21459a.m111038f(c31772a.m152764a(), 0, 2, null)));
            long m152766c = c31772a.m152766c() - C20128b.m104764k();
            if (m152766c > 0) {
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                c0708i.m1073d("free_storage_missing", C21459a.m111034b(m152766c));
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "zcloud_grace_download_not_ready_state", null, c0708i, null, 10, null);
                RobotoTextView robotoTextView3 = ((AbstractC30158ze) m77756kM()).f140167f0;
                String m92652XI3 = m92652XI(AbstractC8020f0.str_your_device_needs_more_free_space);
                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                String format3 = String.format(m92652XI3, Arrays.copyOf(new Object[]{C21459a.m111038f(m152766c, 0, 2, null)}, 1));
                AbstractC19074t.m100207e(format3, "format(...)");
                robotoTextView3.setText(m77193yM(format3, C21459a.m111038f(m152766c, 0, 2, null)));
                m77186GM(true);
                return;
            }
            m77186GM(false);
        }
    }

    /* renamed from: FM */
    private final void m77185FM() {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93062f2(AbstractC6918a0.container, ZCloudGPDownloadingDataView.class, new Bundle(), 1, true);
        }
    }

    /* renamed from: GM */
    private final void m77186GM(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = ((AbstractC30158ze) m77756kM()).f140163b0;
        AbstractC19074t.m100207e(robotoTextView, "tvAvailable");
        int i12 = 8;
        if (!z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        RelativeLayout relativeLayout = ((AbstractC30158ze) m77756kM()).f140157V;
        AbstractC19074t.m100207e(relativeLayout, "errorContainer");
        if (z11) {
            i12 = 0;
        }
        relativeLayout.setVisibility(i12);
        ((AbstractC30158ze) m77756kM()).f140154S.setEnabled(!z11);
    }

    /* renamed from: yM */
    private final SpannableStringBuilder m77193yM(String str, String str2) {
        int m127173b0;
        int m116580c;
        int m116584g;
        int m116584g2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            m127173b0 = AbstractC24342w.m127173b0(str, str2, 0, false, 6, null);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_secondary));
            m116580c = AbstractC22543l.m116580c(m127173b0, 0);
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, m116580c, 17);
            m116584g = AbstractC22543l.m116584g(str2.length() + m127173b0, str.length());
            spannableStringBuilder.setSpan(new StyleSpan(1), m127173b0, m116584g, 17);
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C23212s8.m119606n(AbstractC2807a.text_secondary));
            m116584g2 = AbstractC22543l.m116584g(m116584g + 1, str.length());
            spannableStringBuilder.setSpan(foregroundColorSpan2, m116584g2, str.length(), 17);
        } catch (Exception e11) {
            AbstractC0900b0.m2786b("CommonZaloview", ((Object) spannableStringBuilder) + " - " + e11);
        }
        return spannableStringBuilder;
    }

    /* renamed from: zM */
    public final C31774c m77194zM() {
        return (C31774c) this.f71579S0.getValue();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 150802);
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
        return AbstractC7409c0.z_cloud_gp_processing_data_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        m77754gM(C13858b.f71580q, new C13859c());
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        if (!AbstractC23152n3.m119051k(getContext())) {
            ((AbstractC30158ze) m77756kM()).f140152Q.setText(m92652XI(AbstractC8020f0.str_view_instructions));
        }
        ((AbstractC30158ze) m77756kM()).f140152Q.setOnClickListener(new View.OnClickListener() { // from class: yb0.d
            public /* synthetic */ ViewOnClickListenerC30894d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudGPProcessingDataView.m77181BM(ZCloudGPProcessingDataView.this, view);
            }
        });
        ((AbstractC30158ze) m77756kM()).f140154S.setOnClickListener(new View.OnClickListener() { // from class: yb0.e
            public /* synthetic */ ViewOnClickListenerC30895e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudGPProcessingDataView.m77182CM(ZCloudGPProcessingDataView.this, view);
            }
        });
        ((AbstractC30158ze) m77756kM()).f140153R.setOnClickListener(new View.OnClickListener() { // from class: yb0.f
            public /* synthetic */ ViewOnClickListenerC30896f() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudGPProcessingDataView.m77183DM(ZCloudGPProcessingDataView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m77194zM().m152786Z();
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77180AM().m152805M().m9219j(m92657cJ(), new C19965d(new C13862f()));
        m77180AM().m152806N().m9219j(m92657cJ(), new C13865i(C13863g.f71585q));
        m77194zM().m152785Y().m9219j(m92657cJ(), new C13865i(new C13864h()));
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

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 150802) {
            m77194zM().m152789i();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 150802);
    }
}

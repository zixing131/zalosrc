package com.zing.zalo.report_v2.reportsummary;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import com.zing.zalo.report_v2.reportattachment.ReportAttachmentView;
import com.zing.zalo.report_v2.reportsuccess.ReportSuccessActionView;
import com.zing.zalo.report_v2.reportsummary.AbstractC9350e;
import com.zing.zalo.report_v2.reportsummary.C9347b;
import com.zing.zalo.report_v2.reportsummary.ReportSummaryView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p205hc.InterfaceC19968g;
import p409oz.C24585b;
import p458qr.C25470c;
import p458qr.C25471d;
import p542ub.InterfaceC27218a;
import p649xl.C30018ra;
import sz.InterfaceC26425b;

/* loaded from: classes4.dex */
public final class ReportSummaryView extends SlidableZaloView implements InterfaceC26425b {
    public static final C9343a Companion = new C9343a(null);

    /* renamed from: P0 */
    private C30018ra f49477P0;

    /* renamed from: Q0 */
    private C9347b f49478Q0;

    /* renamed from: R0 */
    private InterfaceC9349d f49479R0;

    /* renamed from: S0 */
    private C9348c f49480S0;

    /* renamed from: T0 */
    private LinearLayoutManager f49481T0;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryView$a */
    /* loaded from: classes4.dex */
    public static final class C9343a {
        private C9343a() {
        }

        public /* synthetic */ C9343a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryView$b */
    /* loaded from: classes4.dex */
    public static final class C9344b extends ZdsActionBar.AbstractC16987c {
        C9344b() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            InterfaceC9349d interfaceC9349d = ReportSummaryView.this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            if (!interfaceC9349d.mo50339w9() && !ReportSummaryView.this.m92681pJ() && !ReportSummaryView.this.m92677nJ()) {
                ReportSummaryView.this.finish();
            }
        }
    }

    /* renamed from: com.zing.zalo.report_v2.reportsummary.ReportSummaryView$c */
    /* loaded from: classes4.dex */
    public static final class C9345c implements C9347b.h {
        C9345c() {
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.h
        /* renamed from: V2 */
        public void mo50311V2(AbstractC9350e.f.b bVar, String str) {
            AbstractC19074t.m100208f(bVar, "itemData");
            AbstractC19074t.m100208f(str, "contentReasonOther");
            InterfaceC9349d interfaceC9349d = ReportSummaryView.this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            interfaceC9349d.mo50333V2(bVar, str);
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.h
        /* renamed from: W2 */
        public void mo50312W2(AbstractC9350e.f fVar) {
            AbstractC19074t.m100208f(fVar, "itemReason");
            InterfaceC9349d interfaceC9349d = ReportSummaryView.this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            interfaceC9349d.mo50338pc(fVar);
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.h
        /* renamed from: X2 */
        public void mo50313X2(int i11) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_report_input_reason_others_exceeds_limit, Integer.valueOf(i11)));
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.h
        /* renamed from: Y2 */
        public void mo50314Y2() {
            InterfaceC9349d interfaceC9349d = ReportSummaryView.this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            interfaceC9349d.mo50336kb();
        }

        @Override // com.zing.zalo.report_v2.reportsummary.C9347b.h
        /* renamed from: m1 */
        public boolean mo50315m1(AbstractC9350e.f fVar) {
            AbstractC19074t.m100208f(fVar, "itemReason");
            InterfaceC9349d interfaceC9349d = ReportSummaryView.this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            return interfaceC9349d.mo50337m1(fVar);
        }
    }

    /* renamed from: lM */
    public static final void m50295lM(ReportSummaryView reportSummaryView, List list) {
        AbstractC19074t.m100208f(reportSummaryView, "this$0");
        AbstractC19074t.m100208f(list, "$listData");
        C9347b c9347b = reportSummaryView.f49478Q0;
        if (c9347b == null) {
            AbstractC19074t.m100223u("adapter");
            c9347b = null;
        }
        c9347b.m50323O(list);
    }

    /* renamed from: mM */
    public static final void m50296mM(ReportSummaryView reportSummaryView, String str) {
        AbstractC19074t.m100208f(reportSummaryView, "this$0");
        AbstractC19074t.m100208f(str, "$title");
        ZdsActionBar m87077NK = reportSummaryView.m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: nM */
    public static final void m50297nM(ReportSummaryView reportSummaryView) {
        AbstractC19074t.m100208f(reportSummaryView, "this$0");
        reportSummaryView.mo78936E(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
        reportSummaryView.finish();
    }

    /* renamed from: oM */
    private final C9346a m50298oM(Bundle bundle) {
        int i11;
        C25470c m131954b;
        if (bundle != null) {
            i11 = bundle.getInt("EXTRA_DATA_RETAIN_KEY", -1);
        } else {
            i11 = -1;
        }
        if (i11 != -1 && (m131954b = C25471d.m131951c().m131954b(i11)) != null) {
            return C9346a.Companion.m50318a(m131954b);
        }
        return null;
    }

    /* renamed from: pM */
    private final void m50299pM() {
        C9347b c9347b = this.f49478Q0;
        C30018ra c30018ra = null;
        if (c9347b == null) {
            AbstractC19074t.m100223u("adapter");
            c9347b = null;
        }
        c9347b.m50322N(new C9345c());
        C30018ra c30018ra2 = this.f49477P0;
        if (c30018ra2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30018ra = c30018ra2;
        }
        c30018ra.f139226q.setOnClickListener(new View.OnClickListener() { // from class: sz.h
            public /* synthetic */ ViewOnClickListenerC26431h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReportSummaryView.m50300qM(ReportSummaryView.this, view);
            }
        });
    }

    /* renamed from: qM */
    public static final void m50300qM(ReportSummaryView reportSummaryView, View view) {
        AbstractC19074t.m100208f(reportSummaryView, "this$0");
        InterfaceC9349d interfaceC9349d = reportSummaryView.f49479R0;
        if (interfaceC9349d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC9349d = null;
        }
        interfaceC9349d.mo50332D0();
    }

    /* renamed from: rM */
    private final void m50301rM() {
        this.f49478Q0 = new C9347b();
        C30018ra c30018ra = this.f49477P0;
        C30018ra c30018ra2 = null;
        if (c30018ra == null) {
            AbstractC19074t.m100223u("binding");
            c30018ra = null;
        }
        RecyclerView recyclerView = c30018ra.f139228s;
        C9347b c9347b = this.f49478Q0;
        if (c9347b == null) {
            AbstractC19074t.m100223u("adapter");
            c9347b = null;
        }
        recyclerView.setAdapter(c9347b);
        this.f49481T0 = new LinearLayoutManager(getContext(), 1, false);
        C30018ra c30018ra3 = this.f49477P0;
        if (c30018ra3 == null) {
            AbstractC19074t.m100223u("binding");
            c30018ra3 = null;
        }
        RecyclerView recyclerView2 = c30018ra3.f139228s;
        LinearLayoutManager linearLayoutManager = this.f49481T0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C30018ra c30018ra4 = this.f49477P0;
        if (c30018ra4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30018ra2 = c30018ra4;
        }
        c30018ra2.f139226q.setIdTracking("REPORT_SUMMARY_BTN_DONE");
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: Bw */
    public void mo50302Bw(boolean z11) {
        C30018ra c30018ra = this.f49477P0;
        if (c30018ra == null) {
            AbstractC19074t.m100223u("binding");
            c30018ra = null;
        }
        c30018ra.f139226q.setEnabled(z11);
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: C */
    public void mo50303C() {
        View view;
        try {
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                view = m92676n2.getCurrentFocus();
            } else {
                view = null;
            }
            AbstractC2379w.m12430d(view);
        } catch (Exception e11) {
            AbstractC23350e.m122774d("CommonZaloview", e11.toString());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f49479R0 = new C9351f(this, C24585b.Companion.m128049a());
        this.f49480S0 = C9348c.Companion.m50331a(this.f72421L0.m92642L3());
        InterfaceC9349d interfaceC9349d = this.f49479R0;
        if (interfaceC9349d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC9349d = null;
        }
        interfaceC9349d.mo995Nd(this.f49480S0, m50298oM(bundle));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30018ra m148453c = C30018ra.m148453c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148453c, "inflate(...)");
        this.f49477P0 = m148453c;
        m50301rM();
        m50299pM();
        C30018ra c30018ra = this.f49477P0;
        if (c30018ra == null) {
            AbstractC19074t.m100223u("binding");
            c30018ra = null;
        }
        return c30018ra.getRoot();
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: I */
    public void mo50304I() {
        mo70710wy(new Runnable() { // from class: sz.g
            public /* synthetic */ RunnableC26430g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReportSummaryView.m50297nM(ReportSummaryView.this);
            }
        });
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: JG */
    public void mo50305JG(ReportInfoCollected reportInfoCollected, int i11) {
        AbstractC19074t.m100208f(reportInfoCollected, "reportInfoCollected");
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("report_info", reportInfoCollected);
            bundle.putInt("source_action", i11);
            m92662fJ.m93066i2(ReportAttachmentView.class, bundle, 1001, 1, true);
        }
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: Nc */
    public void mo50306Nc(String str) {
        AbstractC19074t.m100208f(str, "title");
        mo70710wy(new Runnable() { // from class: sz.j

            /* renamed from: q */
            public final /* synthetic */ String f125603q;

            public /* synthetic */ RunnableC26433j(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReportSummaryView.m50296mM(ReportSummaryView.this, r2);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setLeadingFunctionCallback(new C9344b());
        }
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: Pq */
    public void mo50307Pq() {
        C9347b c9347b = this.f49478Q0;
        if (c9347b == null) {
            AbstractC19074t.m100223u("adapter");
            c9347b = null;
        }
        c9347b.m10008p();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        InterfaceC9349d interfaceC9349d = this.f49479R0;
        if (interfaceC9349d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC9349d = null;
        }
        InterfaceC19968g mo50381fi = interfaceC9349d.mo50381fi();
        if (mo50381fi != null && (mo50381fi instanceof C9346a)) {
            C25470c c25470c = new C25470c();
            C9346a.Companion.m50319b(c25470c, (C9346a) mo50381fi);
            bundle.putInt("EXTRA_DATA_RETAIN_KEY", C25471d.m131951c().m131953a(c25470c));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        mo50303C();
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: YD */
    public void mo50308YD(String str, String str2) {
        AbstractC19074t.m100208f(str, "reportUid");
        AbstractC19074t.m100208f(str2, "reportObjectName");
        Bundle bundle = new Bundle();
        bundle.putString("report_uid", str);
        bundle.putString("object_name", str2);
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ReportSuccessActionView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        InterfaceC9349d interfaceC9349d = this.f49479R0;
        if (interfaceC9349d == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC9349d = null;
        }
        interfaceC9349d.mo50334d();
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: Zw */
    public void mo50309Zw(List list) {
        AbstractC19074t.m100208f(list, "listData");
        mo70710wy(new Runnable() { // from class: sz.i

            /* renamed from: q */
            public final /* synthetic */ List f125601q;

            public /* synthetic */ RunnableC26432i(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ReportSummaryView.m50295lM(ReportSummaryView.this, r2);
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ReportSummaryView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        ReportInfoCollected reportInfoCollected;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1001 && i12 == -1 && intent != null && (reportInfoCollected = (ReportInfoCollected) intent.getParcelableExtra("report_info")) != null) {
            InterfaceC9349d interfaceC9349d = this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            interfaceC9349d.mo50335ip(reportInfoCollected);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            InterfaceC9349d interfaceC9349d = this.f49479R0;
            if (interfaceC9349d == null) {
                AbstractC19074t.m100223u("presenter");
                interfaceC9349d = null;
            }
            if (interfaceC9349d.mo50339w9()) {
                return true;
            }
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // sz.InterfaceC26425b
    /* renamed from: up */
    public void mo50310up(boolean z11) {
        C30018ra c30018ra = null;
        if (z11) {
            C30018ra c30018ra2 = this.f49477P0;
            if (c30018ra2 == null) {
                AbstractC19074t.m100223u("binding");
                c30018ra2 = null;
            }
            c30018ra2.f139227r.setVisibility(0);
            C30018ra c30018ra3 = this.f49477P0;
            if (c30018ra3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30018ra = c30018ra3;
            }
            c30018ra.f139227r.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        C30018ra c30018ra4 = this.f49477P0;
        if (c30018ra4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30018ra = c30018ra4;
        }
        c30018ra.f139227r.setVisibility(8);
    }
}

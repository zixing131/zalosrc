package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.lifecycle.AbstractC1785o;
import com.zing.zalo.shortvideo.p072ui.view.ReportView;
import com.zing.zalo.shortvideo.p072ui.widget.et.NestedEditText;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19727k;
import i20.C20196i;
import m20.InterfaceC22739e1;
import p542ub.InterfaceC27218a;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25046q1;
import q20.C25097t;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class ReportView extends SimpleView implements InterfaceC22739e1 {
    public static final C10360a Companion = new C10360a(null);

    /* renamed from: B0 */
    private final InterfaceC24854k f53122B0;

    /* renamed from: C0 */
    private final InterfaceC24854k f53123C0;

    /* renamed from: D0 */
    private InterfaceC19727k f53124D0;

    /* renamed from: E0 */
    private C25046q1 f53125E0;

    /* renamed from: F0 */
    private C20196i f53126F0;

    /* renamed from: G0 */
    private int f53127G0;

    /* renamed from: H0 */
    private String f53128H0;

    /* renamed from: I0 */
    private Integer f53129I0;

    /* renamed from: J0 */
    private boolean f53130J0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$a */
    /* loaded from: classes5.dex */
    public static final class C10360a {
        private C10360a() {
        }

        public /* synthetic */ C10360a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$b */
    /* loaded from: classes5.dex */
    static final class C10361b extends AbstractC19075u implements InterfaceC18511r {
        C10361b() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54715a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54715a(CharSequence charSequence, int i11, int i12, int i13) {
            if (charSequence == null || charSequence.length() == 0 || charSequence.length() < 10) {
                ReportView.this.m54711kL(false);
            } else if (charSequence.length() <= 1000) {
                ReportView.this.m54711kL(true);
            } else {
                C25097t.f120556a.m130154o(ReportView.this.m92689tK(), ReportView.this.m92652XI(AbstractC27413h.zch_page_feedback_limit_max_length));
                ReportView.this.m54711kL(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$c */
    /* loaded from: classes5.dex */
    static final class C10362c extends AbstractC19075u implements InterfaceC18505l {
        C10362c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54716a(View view) {
            AbstractC19074t.m100208f(view, "it");
            int i11 = ReportView.this.f53127G0;
            C25046q1 c25046q1 = ReportView.this.f53125E0;
            InterfaceC19727k interfaceC19727k = null;
            if (c25046q1 == null) {
                AbstractC19074t.m100223u("binding");
                c25046q1 = null;
            }
            String valueOf = String.valueOf(c25046q1.f120201x.getText());
            String str = ReportView.this.f53128H0;
            Integer num = ReportView.this.f53129I0;
            if (i11 >= 0) {
                if ((i11 != 6 || valueOf.length() >= 10) && str != null && str.length() != 0 && num != null) {
                    InterfaceC19727k interfaceC19727k2 = ReportView.this.f53124D0;
                    if (interfaceC19727k2 == null) {
                        AbstractC19074t.m100223u("presenter");
                    } else {
                        interfaceC19727k = interfaceC19727k2;
                    }
                    interfaceC19727k.mo53373Qx(num.toString(), str, String.valueOf(i11), valueOf);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54716a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$d */
    /* loaded from: classes5.dex */
    static final class C10363d extends AbstractC19075u implements InterfaceC18509p {
        C10363d() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m54718c(ReportView reportView) {
            AbstractC19074t.m100208f(reportView, "this$0");
            C25046q1 c25046q1 = reportView.f53125E0;
            if (c25046q1 == null) {
                AbstractC19074t.m100223u("binding");
                c25046q1 = null;
            }
            c25046q1.f120203z.fullScroll(130);
        }

        /* renamed from: b */
        public final void m54719b(int i11, float f11) {
            C25046q1 c25046q1 = null;
            if (i11 <= 0 || f11 != 1.0f) {
                C25046q1 c25046q12 = ReportView.this.f53125E0;
                if (c25046q12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c25046q12 = null;
                }
                c25046q12.f120194q.getLayoutParams().height = 0;
                C25046q1 c25046q13 = ReportView.this.f53125E0;
                if (c25046q13 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c25046q1 = c25046q13;
                }
                View view = c25046q1.f120194q;
                AbstractC19074t.m100207e(view, "bottomView");
                AbstractC26112n.m134367H(view);
                return;
            }
            C25046q1 c25046q14 = ReportView.this.f53125E0;
            if (c25046q14 == null) {
                AbstractC19074t.m100223u("binding");
                c25046q14 = null;
            }
            c25046q14.f120194q.getLayoutParams().height = i11;
            C25046q1 c25046q15 = ReportView.this.f53125E0;
            if (c25046q15 == null) {
                AbstractC19074t.m100223u("binding");
                c25046q15 = null;
            }
            View view2 = c25046q15.f120194q;
            AbstractC19074t.m100207e(view2, "bottomView");
            AbstractC26112n.m134431w0(view2);
            C25046q1 c25046q16 = ReportView.this.f53125E0;
            if (c25046q16 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25046q1 = c25046q16;
            }
            ScrollView scrollView = c25046q1.f120203z;
            final ReportView reportView = ReportView.this;
            scrollView.post(new Runnable() { // from class: com.zing.zalo.shortvideo.ui.view.d
                @Override // java.lang.Runnable
                public final void run() {
                    ReportView.C10363d.m54718c(ReportView.this);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54719b(((Number) obj).intValue(), ((Number) obj2).floatValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$e */
    /* loaded from: classes5.dex */
    static final class C10364e extends AbstractC19075u implements InterfaceC18494a {
        C10364e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(ReportView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_4dp));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.ReportView$f */
    /* loaded from: classes5.dex */
    static final class C10365f extends AbstractC19075u implements InterfaceC18494a {
        C10365f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(ReportView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_8dp));
        }
    }

    public ReportView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C10365f());
        this.f53122B0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10364e());
        this.f53123C0 = m129210a2;
        this.f53127G0 = -1;
    }

    /* renamed from: hL */
    private final float m54708hL() {
        return ((Number) this.f53123C0.getValue()).floatValue();
    }

    /* renamed from: iL */
    private final float m54709iL() {
        return ((Number) this.f53122B0.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jL */
    public static final void m54710jL(ReportView reportView, C25046q1 c25046q1, RadioGroup radioGroup, int i11) {
        AbstractC19074t.m100208f(reportView, "this$0");
        AbstractC19074t.m100208f(c25046q1, "$this_with");
        if (i11 == AbstractC27409d.rb_1) {
            reportView.f53127G0 = 1;
            NestedEditText nestedEditText = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText, "reportEdt");
            AbstractC26112n.m134369J(nestedEditText);
            reportView.m54712lL(false);
            reportView.m54711kL(true);
            return;
        }
        if (i11 == AbstractC27409d.rb_2) {
            reportView.f53127G0 = 2;
            NestedEditText nestedEditText2 = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText2, "reportEdt");
            AbstractC26112n.m134369J(nestedEditText2);
            reportView.m54712lL(false);
            reportView.m54711kL(true);
            return;
        }
        if (i11 == AbstractC27409d.rb_3) {
            reportView.f53127G0 = 3;
            NestedEditText nestedEditText3 = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText3, "reportEdt");
            AbstractC26112n.m134369J(nestedEditText3);
            reportView.m54712lL(false);
            reportView.m54711kL(true);
            return;
        }
        if (i11 == AbstractC27409d.rb_4) {
            reportView.f53127G0 = 4;
            NestedEditText nestedEditText4 = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText4, "reportEdt");
            AbstractC26112n.m134369J(nestedEditText4);
            reportView.m54712lL(false);
            reportView.m54711kL(true);
            return;
        }
        if (i11 == AbstractC27409d.rb_5) {
            reportView.f53127G0 = 5;
            NestedEditText nestedEditText5 = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText5, "reportEdt");
            AbstractC26112n.m134369J(nestedEditText5);
            reportView.m54712lL(false);
            reportView.m54711kL(true);
            return;
        }
        if (i11 == AbstractC27409d.rb_6) {
            reportView.f53127G0 = 6;
            reportView.m54712lL(true);
            reportView.m54711kL(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kL */
    public final void m54711kL(boolean z11) {
        if (this.f53130J0 == z11) {
            return;
        }
        this.f53130J0 = z11;
        SimpleShadowTextView simpleShadowTextView = m55011UK().f120342r.f119959q;
        if (z11) {
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_active), m54708hL());
        } else {
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54708hL());
        }
    }

    /* renamed from: lL */
    private final void m54712lL(boolean z11) {
        C25046q1 c25046q1 = null;
        if (z11) {
            C25046q1 c25046q12 = this.f53125E0;
            if (c25046q12 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c25046q1 = c25046q12;
            }
            NestedEditText nestedEditText = c25046q1.f120201x;
            AbstractC19074t.m100207e(nestedEditText, "reportEdt");
            AbstractC26112n.m134431w0(nestedEditText);
            return;
        }
        C25046q1 c25046q13 = this.f53125E0;
        if (c25046q13 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c25046q1 = c25046q13;
        }
        NestedEditText nestedEditText2 = c25046q1.f120201x;
        AbstractC19074t.m100207e(nestedEditText2, "reportEdt");
        AbstractC26112n.m134367H(nestedEditText2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC19727k m143666C = AbstractC28684a.Companion.m143666C();
        this.f53124D0 = m143666C;
        InterfaceC19727k interfaceC19727k = null;
        if (m143666C == null) {
            AbstractC19074t.m100223u("presenter");
            m143666C = null;
        }
        m143666C.mo52965Lb(this);
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19727k interfaceC19727k2 = this.f53124D0;
        if (interfaceC19727k2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC19727k = interfaceC19727k2;
        }
        lifecycle.mo9335a(interfaceC19727k);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        final C25046q1 m129922a = C25046q1.m129922a(m55010SK());
        AbstractC19074t.m100207e(m129922a, "bind(...)");
        this.f53125E0 = m129922a;
        if (m129922a == null) {
            AbstractC19074t.m100223u("binding");
            m129922a = null;
        }
        NestedEditText nestedEditText = m129922a.f120201x;
        AbstractC19074t.m100205c(nestedEditText);
        AbstractC26112n.m134391c0(nestedEditText, AbstractC26112n.m134426u(nestedEditText, AbstractC27406a.zch_control_background), m54709iL());
        AbstractC26112n.m134414o(nestedEditText, new C10361b());
        m129922a.f120202y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: m20.f1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                ReportView.m54710jL(ReportView.this, m129922a, radioGroup, i11);
            }
        });
        SimpleShadowTextView simpleShadowTextView = m55011UK().f120342r.f119959q;
        AbstractC19074t.m100205c(simpleShadowTextView);
        AbstractC26112n.m134431w0(simpleShadowTextView);
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10362c());
        simpleShadowTextView.setText(AbstractC26112n.m134366G(simpleShadowTextView, AbstractC27413h.zch_page_feedback_send, new Object[0]));
        AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54708hL());
        return mo37483GJ;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19727k interfaceC19727k = this.f53124D0;
        if (interfaceC19727k == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19727k = null;
        }
        lifecycle.mo9338d(interfaceC19727k);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        C25046q1 c25046q1 = this.f53125E0;
        if (c25046q1 == null) {
            AbstractC19074t.m100223u("binding");
            c25046q1 = null;
        }
        NestedEditText nestedEditText = c25046q1.f120201x;
        AbstractC19074t.m100207e(nestedEditText, "reportEdt");
        AbstractC26112n.m134369J(nestedEditText);
        super.mo37484JJ();
    }

    @Override // m20.InterfaceC22739e1
    /* renamed from: Ry */
    public void mo54713Ry(Throwable th2) {
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_report;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        C20196i c20196i = this.f53126F0;
        if (c20196i != null) {
            C20196i.m105317q(c20196i, null, 1, null);
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C20196i c20196i = this.f53126F0;
        if (c20196i != null) {
            c20196i.m105321s();
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_report_header_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        Bundle m92642L3 = m92642L3();
        Integer num = null;
        if (m92642L3 != null) {
            str = m92642L3.getString("REPORT_OBJECT_ID");
        } else {
            str = null;
        }
        this.f53128H0 = str;
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null) {
            num = Integer.valueOf(m92642L32.getInt("REPORT_OBJECT_TYPE"));
        }
        this.f53129I0 = num;
        this.f53126F0 = new C20196i(this, false, new C10363d(), 2, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(48);
        }
    }

    @Override // m20.InterfaceC22739e1
    /* renamed from: uE */
    public void mo54714uE() {
        C25046q1 c25046q1 = this.f53125E0;
        if (c25046q1 == null) {
            AbstractC19074t.m100223u("binding");
            c25046q1 = null;
        }
        NestedEditText nestedEditText = c25046q1.f120201x;
        AbstractC19074t.m100207e(nestedEditText, "reportEdt");
        AbstractC26112n.m134369J(nestedEditText);
        C25097t.f120556a.m130154o(m92689tK(), m92652XI(AbstractC27413h.zch_report_success_msg));
        finish();
    }
}

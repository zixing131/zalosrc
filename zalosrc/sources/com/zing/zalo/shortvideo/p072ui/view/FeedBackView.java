package com.zing.zalo.shortvideo.p072ui.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1785o;
import com.zing.zalo.p077ui.widget.RobotoEditText;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18511r;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import h20.InterfaceC19723g;
import m20.InterfaceC22733d0;
import p667y2.C30268e;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25005f1;
import q20.C25097t;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public final class FeedBackView extends SimpleView implements InterfaceC22733d0 {

    /* renamed from: B0 */
    private C25005f1 f52798B0;

    /* renamed from: C0 */
    private InterfaceC19723g f52799C0;

    /* renamed from: D0 */
    private final InterfaceC24854k f52800D0;

    /* renamed from: E0 */
    private final InterfaceC24854k f52801E0;

    /* renamed from: F0 */
    private boolean f52802F0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FeedBackView$a */
    /* loaded from: classes5.dex */
    static final class C10231a extends AbstractC19075u implements InterfaceC18511r {
        C10231a() {
            super(4);
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m54312a((CharSequence) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54312a(CharSequence charSequence, int i11, int i12, int i13) {
            if (charSequence == null || charSequence.length() == 0 || charSequence.length() < 10) {
                FeedBackView.this.m54309fL(false);
            } else if (charSequence.length() <= 1000) {
                FeedBackView.this.m54309fL(true);
            } else {
                C25097t.f120556a.m130154o(FeedBackView.this.m92689tK(), FeedBackView.this.m92652XI(AbstractC27413h.zch_page_feedback_limit_max_length));
                FeedBackView.this.m54309fL(false);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FeedBackView$b */
    /* loaded from: classes5.dex */
    static final class C10232b extends AbstractC19075u implements InterfaceC18505l {
        C10232b() {
            super(1);
        }

        /* renamed from: a */
        public final void m54313a(View view) {
            AbstractC19074t.m100208f(view, "it");
            C25005f1 c25005f1 = FeedBackView.this.f52798B0;
            InterfaceC19723g interfaceC19723g = null;
            if (c25005f1 == null) {
                AbstractC19074t.m100223u("binding");
                c25005f1 = null;
            }
            String valueOf = String.valueOf(c25005f1.f119899q.getText());
            if (valueOf.length() >= 10) {
                InterfaceC19723g interfaceC19723g2 = FeedBackView.this.f52799C0;
                if (interfaceC19723g2 == null) {
                    AbstractC19074t.m100223u("presenter");
                } else {
                    interfaceC19723g = interfaceC19723g2;
                }
                interfaceC19723g.mo53188Sy(valueOf);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54313a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FeedBackView$c */
    /* loaded from: classes5.dex */
    static final class C10233c extends AbstractC19075u implements InterfaceC18494a {
        C10233c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(FeedBackView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_6dp));
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.FeedBackView$d */
    /* loaded from: classes5.dex */
    static final class C10234d extends AbstractC19075u implements InterfaceC18494a {
        C10234d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo12V4() {
            return Float.valueOf(FeedBackView.this.m92651WI().getDimension(AbstractC27407b.zch_radius_8dp));
        }
    }

    public FeedBackView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C10233c());
        this.f52800D0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C10234d());
        this.f52801E0 = m129210a2;
    }

    /* renamed from: dL */
    private final float m54307dL() {
        return ((Number) this.f52800D0.getValue()).floatValue();
    }

    /* renamed from: eL */
    private final float m54308eL() {
        return ((Number) this.f52801E0.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public final void m54309fL(boolean z11) {
        if (this.f52802F0 == z11) {
            return;
        }
        this.f52802F0 = z11;
        SimpleShadowTextView simpleShadowTextView = m55011UK().f120342r.f119959q;
        if (z11) {
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_active), m54307dL());
        } else {
            AbstractC19074t.m100205c(simpleShadowTextView);
            AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54307dL());
        }
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC19723g m143688v = AbstractC28684a.Companion.m143688v();
        this.f52799C0 = m143688v;
        InterfaceC19723g interfaceC19723g = null;
        if (m143688v == null) {
            AbstractC19074t.m100223u("presenter");
            m143688v = null;
        }
        m143688v.mo52965Lb(this);
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19723g interfaceC19723g2 = this.f52799C0;
        if (interfaceC19723g2 == null) {
            AbstractC19074t.m100223u("presenter");
        } else {
            interfaceC19723g = interfaceC19723g2;
        }
        lifecycle.mo9335a(interfaceC19723g);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        C25005f1 m129810a = C25005f1.m129810a(m55010SK());
        AbstractC19074t.m100207e(m129810a, "bind(...)");
        this.f52798B0 = m129810a;
        if (m129810a == null) {
            AbstractC19074t.m100223u("binding");
            m129810a = null;
        }
        m129810a.f119900r.setText(m92653YI(AbstractC27413h.zch_page_feedback_name, C27417l.f129055a.m140378b().m51235h()));
        RobotoEditText robotoEditText = m129810a.f119899q;
        AbstractC19074t.m100205c(robotoEditText);
        AbstractC26112n.m134391c0(robotoEditText, AbstractC26112n.m134426u(robotoEditText, AbstractC27406a.zch_control_background), m54308eL());
        AbstractC26112n.m134414o(robotoEditText, new C10231a());
        SimpleShadowTextView simpleShadowTextView = m55011UK().f120342r.f119959q;
        AbstractC19074t.m100205c(simpleShadowTextView);
        AbstractC26112n.m134431w0(simpleShadowTextView);
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10232b());
        simpleShadowTextView.setText(AbstractC26112n.m134366G(simpleShadowTextView, AbstractC27413h.zch_page_feedback_send, new Object[0]));
        AbstractC26112n.m134391c0(simpleShadowTextView, AbstractC26112n.m134426u(simpleShadowTextView, AbstractC27406a.zch_control_background), m54307dL());
        return mo37483GJ;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        AbstractC1785o lifecycle = getLifecycle();
        InterfaceC19723g interfaceC19723g = this.f52799C0;
        if (interfaceC19723g == null) {
            AbstractC19074t.m100223u("presenter");
            interfaceC19723g = null;
        }
        lifecycle.mo9338d(interfaceC19723g);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        C25005f1 c25005f1 = this.f52798B0;
        if (c25005f1 == null) {
            AbstractC19074t.m100223u("binding");
            c25005f1 = null;
        }
        RobotoEditText robotoEditText = c25005f1.f119899q;
        AbstractC19074t.m100207e(robotoEditText, "edt");
        AbstractC26112n.m134369J(robotoEditText);
        super.mo37484JJ();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_feedback;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_feedback_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // m20.InterfaceC22733d0
    /* renamed from: ie */
    public void mo54310ie(Throwable th2) {
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // m20.InterfaceC22733d0
    /* renamed from: jo */
    public void mo54311jo() {
        C25005f1 c25005f1 = this.f52798B0;
        if (c25005f1 == null) {
            AbstractC19074t.m100223u("binding");
            c25005f1 = null;
        }
        RobotoEditText robotoEditText = c25005f1.f119899q;
        AbstractC19074t.m100207e(robotoEditText, "edt");
        AbstractC26112n.m134369J(robotoEditText);
        C25097t.f120556a.m130154o(m92689tK(), m92652XI(AbstractC27413h.zch_page_feedback_send_success));
        finish();
    }
}

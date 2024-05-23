package com.zing.zalo.shortvideo.p072ui.component.popup;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.AbstractC1438d;
import com.zing.zalo.shortvideo.p072ui.component.popup.LivestreamConfirmPopupView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25073z1;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27406a;

/* loaded from: classes5.dex */
public final class LivestreamConfirmPopupView extends BasePopupView {
    public static final C9541a Companion = new C9541a(null);

    /* renamed from: F0 */
    private InterfaceC18494a f50508F0 = C9544d.f50513q;

    /* renamed from: G0 */
    private InterfaceC18494a f50509G0 = C9542b.f50511q;

    /* renamed from: H0 */
    private InterfaceC18494a f50510H0 = C9543c.f50512q;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.LivestreamConfirmPopupView$a */
    /* loaded from: classes5.dex */
    public static final class C9541a {
        private C9541a() {
        }

        public /* synthetic */ C9541a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ LivestreamConfirmPopupView m52004b(C9541a c9541a, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z11, boolean z12, int i11, Object obj6) {
            if ((i11 & 1) != 0) {
                obj = null;
            }
            if ((i11 & 2) != 0) {
                obj2 = null;
            }
            if ((i11 & 4) != 0) {
                obj3 = null;
            }
            if ((i11 & 8) != 0) {
                obj4 = null;
            }
            if ((i11 & 16) != 0) {
                obj5 = null;
            }
            if ((i11 & 32) != 0) {
                z11 = false;
            }
            if ((i11 & 64) != 0) {
                z12 = false;
            }
            return c9541a.m52005a(obj, obj2, obj3, obj4, obj5, z11, z12);
        }

        /* renamed from: a */
        public final LivestreamConfirmPopupView m52005a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z11, boolean z12) {
            LivestreamConfirmPopupView livestreamConfirmPopupView = new LivestreamConfirmPopupView();
            livestreamConfirmPopupView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SRC_TITLE", obj), AbstractC24866w.m129235a("SRC_MESSAGE", obj2), AbstractC24866w.m129235a("SRC_POSITIVE", obj3), AbstractC24866w.m129235a("SRC_NEGATIVE", obj4), AbstractC24866w.m129235a("SRC_NEUTRAL", obj5), AbstractC24866w.m129235a("DLG_IMPORTANT", Boolean.valueOf(z11)), AbstractC24866w.m129235a("IS_LANDSCAPE", Boolean.valueOf(z12))));
            return livestreamConfirmPopupView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.LivestreamConfirmPopupView$b */
    /* loaded from: classes5.dex */
    static final class C9542b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9542b f50511q = new C9542b();

        C9542b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52006a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52006a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.LivestreamConfirmPopupView$c */
    /* loaded from: classes5.dex */
    static final class C9543c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9543c f50512q = new C9543c();

        C9543c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52007a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52007a() {
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.LivestreamConfirmPopupView$d */
    /* loaded from: classes5.dex */
    static final class C9544d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9544d f50513q = new C9544d();

        C9544d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m52008a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m52008a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hL */
    public static final void m52000hL(LivestreamConfirmPopupView livestreamConfirmPopupView, View view) {
        AbstractC19074t.m100208f(livestreamConfirmPopupView, "this$0");
        livestreamConfirmPopupView.dismiss();
        livestreamConfirmPopupView.f50510H0.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iL */
    public static final void m52001iL(LivestreamConfirmPopupView livestreamConfirmPopupView, View view) {
        AbstractC19074t.m100208f(livestreamConfirmPopupView, "this$0");
        livestreamConfirmPopupView.dismiss();
        livestreamConfirmPopupView.f50508F0.mo12V4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jL */
    public static final void m52002jL(LivestreamConfirmPopupView livestreamConfirmPopupView, View view) {
        AbstractC19074t.m100208f(livestreamConfirmPopupView, "this$0");
        livestreamConfirmPopupView.dismiss();
        livestreamConfirmPopupView.f50509G0.mo12V4();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("IS_LANDSCAPE", false);
        }
        m51980bL(z11);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView
    /* renamed from: UK */
    public View mo51975UK(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<SimpleShadowTextView> m131500h;
        int i11;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        CharSequence charSequence;
        int m131504l;
        Object obj5;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C25073z1 m129987c = C25073z1.m129987c(layoutInflater, viewGroup, false);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (obj5 = m92642L3.get("SRC_TITLE")) != null) {
            if (obj5 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView = m129987c.f120447v;
                AbstractC19074t.m100205c(obj5);
                simpleShadowTextView.setText(((Number) obj5).intValue());
            } else if (obj5 instanceof CharSequence) {
                m129987c.f120447v.setText((CharSequence) obj5);
            }
            SimpleShadowTextView simpleShadowTextView2 = m129987c.f120447v;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtTitle");
            AbstractC26112n.m134431w0(simpleShadowTextView2);
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null && (obj4 = m92642L32.get("SRC_MESSAGE")) != null) {
            if (obj4 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView3 = m129987c.f120446u;
                AbstractC19074t.m100205c(obj4);
                simpleShadowTextView3.setText(((Number) obj4).intValue());
            } else if (obj4 instanceof CharSequence) {
                m129987c.f120446u.setText((CharSequence) obj4);
            } else if (obj4 instanceof List) {
                m129987c.f120446u.setGravity(3);
                SimpleShadowTextView simpleShadowTextView4 = m129987c.f120446u;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AbstractC19074t.m100205c(obj4);
                int i12 = 0;
                for (Object obj6 : (Iterable) obj4) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    if (obj6 instanceof Integer) {
                        charSequence = m92652XI(((Number) obj6).intValue());
                    } else if (obj6 instanceof CharSequence) {
                        charSequence = (CharSequence) obj6;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    SpannableString spannableString = new SpannableString(charSequence);
                    spannableString.setSpan(new BulletSpan(20), 0, spannableString.length(), 17);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    m131504l = AbstractC25368s.m131504l((List) obj4);
                    if (i12 < m131504l) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    i12 = i13;
                }
                simpleShadowTextView4.setText(spannableStringBuilder);
            }
            m129987c.f120446u.setMovementMethod(LinkMovementMethod.getInstance());
            m129987c.f120446u.setHighlightColor(0);
            SimpleShadowTextView simpleShadowTextView5 = m129987c.f120446u;
            AbstractC19074t.m100207e(simpleShadowTextView5, "txtMessage");
            AbstractC26112n.m134431w0(simpleShadowTextView5);
        }
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null && (obj3 = m92642L33.get("SRC_POSITIVE")) != null) {
            if (obj3 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView6 = m129987c.f120444s;
                AbstractC19074t.m100205c(obj3);
                simpleShadowTextView6.setText(((Number) obj3).intValue());
            } else if (obj3 instanceof CharSequence) {
                m129987c.f120444s.setText((CharSequence) obj3);
            }
            Bundle m92642L34 = m92642L3();
            if (m92642L34 != null && m92642L34.getBoolean("DLG_IMPORTANT")) {
                SimpleShadowTextView simpleShadowTextView7 = m129987c.f120444s;
                AbstractC19074t.m100207e(simpleShadowTextView7, "btnPositive");
                AbstractC26112n.m134425t0(simpleShadowTextView7, AbstractC27406a.zch_text_accent_red);
            }
            m129987c.f120444s.setOnClickListener(new View.OnClickListener() { // from class: x10.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LivestreamConfirmPopupView.m52001iL(LivestreamConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView8 = m129987c.f120444s;
            AbstractC19074t.m100207e(simpleShadowTextView8, "btnPositive");
            AbstractC26112n.m134431w0(simpleShadowTextView8);
        }
        Bundle m92642L35 = m92642L3();
        if (m92642L35 != null && (obj2 = m92642L35.get("SRC_NEGATIVE")) != null) {
            if (obj2 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView9 = m129987c.f120442q;
                AbstractC19074t.m100205c(obj2);
                simpleShadowTextView9.setText(((Number) obj2).intValue());
            } else if (obj2 instanceof CharSequence) {
                m129987c.f120442q.setText((CharSequence) obj2);
            }
            m129987c.f120442q.setOnClickListener(new View.OnClickListener() { // from class: x10.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LivestreamConfirmPopupView.m52002jL(LivestreamConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView10 = m129987c.f120442q;
            AbstractC19074t.m100207e(simpleShadowTextView10, "btnNegative");
            AbstractC26112n.m134431w0(simpleShadowTextView10);
        }
        Bundle m92642L36 = m92642L3();
        if (m92642L36 != null && (obj = m92642L36.get("SRC_NEUTRAL")) != null) {
            if (obj instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView11 = m129987c.f120443r;
                AbstractC19074t.m100205c(obj);
                simpleShadowTextView11.setText(((Number) obj).intValue());
            } else if (obj instanceof CharSequence) {
                m129987c.f120443r.setText((CharSequence) obj);
            }
            m129987c.f120443r.setOnClickListener(new View.OnClickListener() { // from class: x10.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LivestreamConfirmPopupView.m52000hL(LivestreamConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView12 = m129987c.f120443r;
            AbstractC19074t.m100207e(simpleShadowTextView12, "btnNeutral");
            AbstractC26112n.m134431w0(simpleShadowTextView12);
        }
        m131500h = AbstractC25368s.m131500h(m129987c.f120444s, m129987c.f120442q, m129987c.f120443r);
        if ((m131500h instanceof Collection) && m131500h.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 0;
            for (SimpleShadowTextView simpleShadowTextView13 : m131500h) {
                AbstractC19074t.m100205c(simpleShadowTextView13);
                if (AbstractC26112n.m134380U(simpleShadowTextView13) && (i11 = i11 + 1) < 0) {
                    AbstractC25368s.m131508p();
                }
            }
        }
        if (i11 == 2) {
            m129987c.f120445t.setOrientation(0);
            m129987c.f120445t.setLayoutDirection(1);
        }
        LinearLayout root = m129987c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: kL */
    public final void m52003kL(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "<set-?>");
        this.f50508F0 = interfaceC18494a;
    }
}

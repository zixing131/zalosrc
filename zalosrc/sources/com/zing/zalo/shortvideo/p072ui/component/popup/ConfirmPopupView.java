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
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
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
import q10.C25034m2;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import v00.AbstractC27406a;

/* loaded from: classes5.dex */
public final class ConfirmPopupView extends BasePopupView {
    public static final C9537a Companion = new C9537a(null);

    /* renamed from: F0 */
    private InterfaceC18494a f50502F0 = C9540d.f50507q;

    /* renamed from: G0 */
    private InterfaceC18494a f50503G0 = C9538b.f50505q;

    /* renamed from: H0 */
    private InterfaceC18494a f50504H0 = C9539c.f50506q;

    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.ConfirmPopupView$a */
    /* loaded from: classes5.dex */
    public static final class C9537a {
        private C9537a() {
        }

        public /* synthetic */ C9537a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ConfirmPopupView m51992b(C9537a c9537a, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z11, boolean z12, int i11, Object obj6) {
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
            return c9537a.m51993a(obj, obj2, obj3, obj4, obj5, z11, z12);
        }

        /* renamed from: a */
        public final ConfirmPopupView m51993a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z11, boolean z12) {
            ConfirmPopupView confirmPopupView = new ConfirmPopupView();
            confirmPopupView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("SRC_TITLE", obj), AbstractC24866w.m129235a("SRC_MESSAGE", obj2), AbstractC24866w.m129235a("SRC_POSITIVE", obj3), AbstractC24866w.m129235a("SRC_NEGATIVE", obj4), AbstractC24866w.m129235a("SRC_NEUTRAL", obj5), AbstractC24866w.m129235a("DLG_IMPORTANT", Boolean.valueOf(z11)), AbstractC24866w.m129235a("IS_LANDSCAPE", Boolean.valueOf(z12))));
            return confirmPopupView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.ConfirmPopupView$b */
    /* loaded from: classes5.dex */
    public static final class C9538b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9538b f50505q = new C9538b();

        C9538b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51994a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51994a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.ConfirmPopupView$c */
    /* loaded from: classes5.dex */
    public static final class C9539c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9539c f50506q = new C9539c();

        C9539c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51995a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51995a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.component.popup.ConfirmPopupView$d */
    /* loaded from: classes5.dex */
    public static final class C9540d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9540d f50507q = new C9540d();

        C9540d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m51996a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m51996a() {
        }
    }

    /* renamed from: hL */
    public static final void m51987hL(ConfirmPopupView confirmPopupView, View view) {
        AbstractC19074t.m100208f(confirmPopupView, "this$0");
        confirmPopupView.dismiss();
        confirmPopupView.f50504H0.mo12V4();
    }

    /* renamed from: iL */
    public static final void m51988iL(ConfirmPopupView confirmPopupView, View view) {
        AbstractC19074t.m100208f(confirmPopupView, "this$0");
        confirmPopupView.dismiss();
        confirmPopupView.f50502F0.mo12V4();
    }

    /* renamed from: jL */
    public static final void m51989jL(ConfirmPopupView confirmPopupView, View view) {
        AbstractC19074t.m100208f(confirmPopupView, "this$0");
        confirmPopupView.dismiss();
        confirmPopupView.f50503G0.mo12V4();
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
        C25034m2 m129891c = C25034m2.m129891c(layoutInflater, viewGroup, false);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (obj5 = m92642L3.get("SRC_TITLE")) != null) {
            if (obj5 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView = m129891c.f120117v;
                AbstractC19074t.m100205c(obj5);
                simpleShadowTextView.setText(((Number) obj5).intValue());
            } else if (obj5 instanceof CharSequence) {
                m129891c.f120117v.setText((CharSequence) obj5);
            }
            SimpleShadowTextView simpleShadowTextView2 = m129891c.f120117v;
            AbstractC19074t.m100207e(simpleShadowTextView2, "txtTitle");
            AbstractC26112n.m134431w0(simpleShadowTextView2);
        }
        Bundle m92642L32 = m92642L3();
        if (m92642L32 != null && (obj4 = m92642L32.get("SRC_MESSAGE")) != null) {
            if (obj4 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView3 = m129891c.f120116u;
                AbstractC19074t.m100205c(obj4);
                simpleShadowTextView3.setText(((Number) obj4).intValue());
            } else if (obj4 instanceof CharSequence) {
                m129891c.f120116u.setText((CharSequence) obj4);
            } else if (obj4 instanceof List) {
                m129891c.f120116u.setGravity(3);
                SimpleShadowTextView simpleShadowTextView4 = m129891c.f120116u;
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
            m129891c.f120116u.setMovementMethod(LinkMovementMethod.getInstance());
            m129891c.f120116u.setHighlightColor(0);
            SimpleShadowTextView simpleShadowTextView5 = m129891c.f120116u;
            AbstractC19074t.m100207e(simpleShadowTextView5, "txtMessage");
            AbstractC26112n.m134431w0(simpleShadowTextView5);
        }
        Bundle m92642L33 = m92642L3();
        if (m92642L33 != null && (obj3 = m92642L33.get("SRC_POSITIVE")) != null) {
            if (obj3 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView6 = m129891c.f120114s;
                AbstractC19074t.m100205c(obj3);
                simpleShadowTextView6.setText(((Number) obj3).intValue());
            } else if (obj3 instanceof CharSequence) {
                m129891c.f120114s.setText((CharSequence) obj3);
            }
            Bundle m92642L34 = m92642L3();
            if (m92642L34 != null && m92642L34.getBoolean("DLG_IMPORTANT")) {
                SimpleShadowTextView simpleShadowTextView7 = m129891c.f120114s;
                AbstractC19074t.m100207e(simpleShadowTextView7, "btnPositive");
                AbstractC26112n.m134425t0(simpleShadowTextView7, AbstractC27406a.zch_text_accent_red);
            }
            m129891c.f120114s.setOnClickListener(new View.OnClickListener() { // from class: x10.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmPopupView.m51988iL(ConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView8 = m129891c.f120114s;
            AbstractC19074t.m100207e(simpleShadowTextView8, "btnPositive");
            AbstractC26112n.m134431w0(simpleShadowTextView8);
        }
        Bundle m92642L35 = m92642L3();
        if (m92642L35 != null && (obj2 = m92642L35.get("SRC_NEGATIVE")) != null) {
            if (obj2 instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView9 = m129891c.f120112q;
                AbstractC19074t.m100205c(obj2);
                simpleShadowTextView9.setText(((Number) obj2).intValue());
            } else if (obj2 instanceof CharSequence) {
                m129891c.f120112q.setText((CharSequence) obj2);
            }
            m129891c.f120112q.setOnClickListener(new View.OnClickListener() { // from class: x10.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmPopupView.m51989jL(ConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView10 = m129891c.f120112q;
            AbstractC19074t.m100207e(simpleShadowTextView10, "btnNegative");
            AbstractC26112n.m134431w0(simpleShadowTextView10);
        }
        Bundle m92642L36 = m92642L3();
        if (m92642L36 != null && (obj = m92642L36.get("SRC_NEUTRAL")) != null) {
            if (obj instanceof Integer) {
                SimpleShadowTextView simpleShadowTextView11 = m129891c.f120113r;
                AbstractC19074t.m100205c(obj);
                simpleShadowTextView11.setText(((Number) obj).intValue());
            } else if (obj instanceof CharSequence) {
                m129891c.f120113r.setText((CharSequence) obj);
            }
            m129891c.f120113r.setOnClickListener(new View.OnClickListener() { // from class: x10.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmPopupView.m51987hL(ConfirmPopupView.this, view);
                }
            });
            SimpleShadowTextView simpleShadowTextView12 = m129891c.f120113r;
            AbstractC19074t.m100207e(simpleShadowTextView12, "btnNeutral");
            AbstractC26112n.m134431w0(simpleShadowTextView12);
        }
        m131500h = AbstractC25368s.m131500h(m129891c.f120114s, m129891c.f120112q, m129891c.f120113r);
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
            m129891c.f120115t.setOrientation(0);
            m129891c.f120115t.setLayoutDirection(1);
        }
        LinearLayout root = m129891c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: kL */
    public final void m51990kL(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "<set-?>");
        this.f50503G0 = interfaceC18494a;
    }

    /* renamed from: lL */
    public final void m51991lL(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "<set-?>");
        this.f50502F0 = interfaceC18494a;
    }
}

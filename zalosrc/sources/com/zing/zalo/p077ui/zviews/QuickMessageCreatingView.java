package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import bi0.AbstractC2808b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.QuickMessageCreatingView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zdesign.component.inputfield.EnumC17006h;
import com.zing.zalo.zdesign.component.inputfield.EnumC17007i;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23211s7;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p542ub.InterfaceC27218a;
import p649xl.C29856ia;
import p732zy.C32595k;
import p732zy.C32608x;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;

/* loaded from: classes6.dex */
public final class QuickMessageCreatingView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {
    public static final C14880a Companion = new C14880a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f76790P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C32595k.class), new C14902w(new C14901v(this)), C14883d.f76801q);

    /* renamed from: Q0 */
    private C29856ia f76791Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f76792R0;

    /* renamed from: S0 */
    private final Handler f76793S0;

    /* renamed from: T0 */
    private String f76794T0;

    /* renamed from: U0 */
    private int f76795U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f76796V0;

    /* renamed from: W0 */
    private boolean f76797W0;

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$a */
    /* loaded from: classes6.dex */
    public static final class C14880a {
        private C14880a() {
        }

        public /* synthetic */ C14880a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$b */
    /* loaded from: classes6.dex */
    static final class C14881b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$b$a */
        /* loaded from: classes6.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ QuickMessageCreatingView f76799l1;

            a(QuickMessageCreatingView quickMessageCreatingView) {
                this.f76799l1 = quickMessageCreatingView;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                if (AbstractC19074t.m100204b(str, this.f76799l1.f76794T0)) {
                    super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                    if (c3979l == null || !c3979l.m18849m() || c23995f == null || c23995f.m125657h() != 200) {
                        QuickMessageCreatingView quickMessageCreatingView = this.f76799l1;
                        quickMessageCreatingView.f76795U0++;
                        quickMessageCreatingView.m83392DM(quickMessageCreatingView.f76795U0);
                    }
                }
            }
        }

        C14881b() {
            super(0);
        }

        /* renamed from: c */
        public static final void m83436c(QuickMessageCreatingView quickMessageCreatingView) {
            AbstractC19074t.m100208f(quickMessageCreatingView, "this$0");
            C24003n m120068F = C23278z2.m120068F();
            C23528a m83398JM = quickMessageCreatingView.m83398JM();
            C29856ia c29856ia = quickMessageCreatingView.f76791Q0;
            if (c29856ia == null) {
                AbstractC19074t.m100223u("binding");
                c29856ia = null;
            }
            ((C23528a) m83398JM.m123612r(c29856ia.f138178w)).m123579C(quickMessageCreatingView.f76794T0, m120068F, new a(quickMessageCreatingView));
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b */
        public final Runnable mo12V4() {
            return new Runnable() { // from class: com.zing.zalo.ui.zviews.ia0
                public /* synthetic */ ia0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    QuickMessageCreatingView.C14881b.m83436c(QuickMessageCreatingView.this);
                }
            };
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$c */
    /* loaded from: classes6.dex */
    static final class C14882c extends AbstractC19075u implements InterfaceC18494a {
        C14882c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(QuickMessageCreatingView.this.getContext());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$d */
    /* loaded from: classes6.dex */
    static final class C14883d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14883d f76801q = new C14883d();

        C14883d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            return new C32608x();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14884e extends C19071q implements InterfaceC18505l {
        C14884e(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "onPhotoUpdateChanged", "onPhotoUpdateChanged(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83440h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageCreatingView) this.f94922q).m83402NM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83440h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14885f extends C19071q implements InterfaceC18505l {
        C14885f(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "showHideLoadingView", "showHideLoadingView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83441h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83414c3(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83441h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14886g extends C19071q implements InterfaceC18505l {
        C14886g(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "warningInvalidKeyword", "warningInvalidKeyword(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83442h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83413YM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83442h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14887h extends C19071q implements InterfaceC18505l {
        C14887h(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "setMaxCharMessage", "setMaxCharMessage(I)V", 0);
        }

        /* renamed from: h */
        public final void m83443h(int i11) {
            ((QuickMessageCreatingView) this.f94922q).m83405QM(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83443h(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14888i extends C19071q implements InterfaceC18505l {
        C14888i(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "changeDoneItemStatus", "changeDoneItemStatus(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83444h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83394FM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83444h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14889j extends C19071q implements InterfaceC18505l {
        C14889j(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "updateKeywordEditText", "updateKeywordEditText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83445h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageCreatingView) this.f94922q).m83411WM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83445h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$k */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14890k extends C19071q implements InterfaceC18505l {
        C14890k(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "updateMessageEditText", "updateMessageEditText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83446h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageCreatingView) this.f94922q).m83412XM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83446h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$l */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14891l extends C19071q implements InterfaceC18505l {
        C14891l(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "closeView", "closeView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83447h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83395GM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83447h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$m */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14892m extends C19071q implements InterfaceC18505l {
        C14892m(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83448h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageCreatingView) this.f94922q).m83409UM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83448h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$n */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14893n extends C19071q implements InterfaceC18505l {
        C14893n(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "showBtnDelete", "showBtnDelete(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83449h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83407SM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83449h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$o */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14894o extends C19071q implements InterfaceC18505l {
        C14894o(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "showDialogConfirmDeleteQuickMessage", "showDialogConfirmDeleteQuickMessage(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83450h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83408TM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83450h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$p */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14895p extends C19071q implements InterfaceC18505l {
        C14895p(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "callSetActionBarTitle", "callSetActionBarTitle(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m83451h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((QuickMessageCreatingView) this.f94922q).m83393EM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83451h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$q */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14896q extends C19071q implements InterfaceC18505l {
        C14896q(Object obj) {
            super(1, obj, QuickMessageCreatingView.class, "openMediaPickerView", "openMediaPickerView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m83452h(boolean z11) {
            ((QuickMessageCreatingView) this.f94922q).m83404PM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83452h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$r */
    /* loaded from: classes6.dex */
    static final class C14897r implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f76802p;

        C14897r(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f76802p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f76802p;
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
            this.f76802p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$s */
    /* loaded from: classes6.dex */
    public static final class C14898s implements TextWatcher {
        public C14898s() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C32595k m83399KM = QuickMessageCreatingView.this.m83399KM();
            C29856ia c29856ia = QuickMessageCreatingView.this.f76791Q0;
            if (c29856ia == null) {
                AbstractC19074t.m100223u("binding");
                c29856ia = null;
            }
            m83399KM.m157799J0(String.valueOf(c29856ia.f138175t.getEditText().getText()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$t */
    /* loaded from: classes6.dex */
    public static final class C14899t implements TextWatcher {
        public C14899t() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C32595k m83399KM = QuickMessageCreatingView.this.m83399KM();
            C29856ia c29856ia = QuickMessageCreatingView.this.f76791Q0;
            if (c29856ia == null) {
                AbstractC19074t.m100223u("binding");
                c29856ia = null;
            }
            m83399KM.m157800K0(String.valueOf(c29856ia.f138176u.getEditText().getText()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$u */
    /* loaded from: classes6.dex */
    public static final class C14900u implements BaseInputField.InterfaceC16995c {
        C14900u() {
        }

        @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField.InterfaceC16995c
        /* renamed from: a */
        public void mo50287a() {
            QuickMessageCreatingView quickMessageCreatingView = QuickMessageCreatingView.this;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_reach_message_limit_char);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(QuickMessageCreatingView.this.m83399KM().m157817s0())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            quickMessageCreatingView.m83409UM(format);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$v */
    /* loaded from: classes6.dex */
    public static final class C14901v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f76806q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14901v(ZaloView zaloView) {
            super(0);
            this.f76806q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloView mo12V4() {
            return this.f76806q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QuickMessageCreatingView$w */
    /* loaded from: classes6.dex */
    public static final class C14902w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f76807q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14902w(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f76807q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f76807q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    public QuickMessageCreatingView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C14882c());
        this.f76792R0 = m129210a;
        this.f76793S0 = new Handler(Looper.getMainLooper());
        this.f76794T0 = "";
        m129210a2 = AbstractC24856m.m129210a(new C14881b());
        this.f76796V0 = m129210a2;
    }

    /* renamed from: DM */
    public final void m83392DM(int i11) {
        this.f76793S0.removeCallbacks(m83397IM());
        if (i11 <= 6) {
            this.f76793S0.postDelayed(m83397IM(), AbstractC23160o0.m119261j0(i11, 1000L));
        }
    }

    /* renamed from: EM */
    public final void m83393EM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: FM */
    public final void m83394FM(boolean z11) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setEnableTrailingButton(z11);
        }
    }

    /* renamed from: GM */
    public final void m83395GM(boolean z11) {
        if (z11) {
            finish();
        }
    }

    /* renamed from: HM */
    private final void m83396HM() {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                C29856ia c29856ia = this.f76791Q0;
                if (c29856ia == null) {
                    AbstractC19074t.m100223u("binding");
                    c29856ia = null;
                }
                c29856ia.f138175t.setForceOffAutoFill(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: IM */
    private final Runnable m83397IM() {
        return (Runnable) this.f76796V0.getValue();
    }

    /* renamed from: JM */
    public final C23528a m83398JM() {
        return (C23528a) this.f76792R0.getValue();
    }

    /* renamed from: KM */
    public final C32595k m83399KM() {
        return (C32595k) this.f76790P0.getValue();
    }

    /* renamed from: LM */
    private final void m83400LM() {
        m83399KM().m157795C0(m92642L3());
    }

    /* renamed from: MM */
    public static final void m83401MM(QuickMessageCreatingView quickMessageCreatingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(quickMessageCreatingView, "this$0");
        interfaceC17463d.dismiss();
        quickMessageCreatingView.m83399KM().m157796F0();
    }

    /* renamed from: NM */
    public final void m83402NM(String str) {
        this.f76794T0 = str;
        this.f76795U0 = 0;
        this.f76793S0.removeCallbacks(m83397IM());
        C29856ia c29856ia = null;
        if (str.length() == 0) {
            C29856ia c29856ia2 = this.f76791Q0;
            if (c29856ia2 == null) {
                AbstractC19074t.m100223u("binding");
                c29856ia2 = null;
            }
            c29856ia2.f138178w.setVisibility(8);
            C29856ia c29856ia3 = this.f76791Q0;
            if (c29856ia3 == null) {
                AbstractC19074t.m100223u("binding");
                c29856ia3 = null;
            }
            c29856ia3.f138177v.setVisibility(8);
            C29856ia c29856ia4 = this.f76791Q0;
            if (c29856ia4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29856ia = c29856ia4;
            }
            c29856ia.f138174s.setVisibility(0);
            return;
        }
        C29856ia c29856ia5 = this.f76791Q0;
        if (c29856ia5 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia5 = null;
        }
        c29856ia5.f138178w.setVisibility(0);
        C29856ia c29856ia6 = this.f76791Q0;
        if (c29856ia6 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia6 = null;
        }
        c29856ia6.f138177v.setVisibility(0);
        C29856ia c29856ia7 = this.f76791Q0;
        if (c29856ia7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29856ia = c29856ia7;
        }
        c29856ia.f138174s.setVisibility(8);
        m83392DM(0);
    }

    /* renamed from: OM */
    public static final void m83403OM(QuickMessageCreatingView quickMessageCreatingView, View view) {
        AbstractC19074t.m100208f(quickMessageCreatingView, "this$0");
        quickMessageCreatingView.m83399KM().m157798I0();
    }

    /* renamed from: PM */
    public final void m83404PM(boolean z11) {
        if (z11) {
            Bundle bundle = new Bundle();
            bundle.putInt("extra_photo_type", 28);
            bundle.putString("EXTRA_SUBTITLE_ACTIONBAR", m92652XI(AbstractC8020f0.str_qm_gallery_subtitle));
            AbstractC23211s7.m119590w(m92676n2(), 1, bundle);
        }
    }

    /* renamed from: QM */
    public final void m83405QM(int i11) {
        C29856ia c29856ia = this.f76791Q0;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        c29856ia.f138176u.setMaxLength(i11);
    }

    /* renamed from: RM */
    private final void m83406RM() {
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C29856ia c29856ia = this.f76791Q0;
        C29856ia c29856ia2 = null;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        c29856ia.f138175t.setMaxLength(20);
        C29856ia c29856ia3 = this.f76791Q0;
        if (c29856ia3 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia3 = null;
        }
        c29856ia3.f138175t.m91046E(true);
        C29856ia c29856ia4 = this.f76791Q0;
        if (c29856ia4 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia4 = null;
        }
        c29856ia4.f138175t.m91045D(true);
        C29856ia c29856ia5 = this.f76791Q0;
        if (c29856ia5 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia5 = null;
        }
        TextField textField = c29856ia5.f138175t;
        EnumC17006h enumC17006h = EnumC17006h.Never;
        textField.setClearIconMode(enumC17006h);
        C29856ia c29856ia6 = this.f76791Q0;
        if (c29856ia6 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia6 = null;
        }
        TextField textField2 = c29856ia6.f138175t;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_qm_warning_invalid_keyword);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        textField2.setErrorText(m118743r0);
        C29856ia c29856ia7 = this.f76791Q0;
        if (c29856ia7 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia7 = null;
        }
        TextField textField3 = c29856ia7.f138175t;
        RobotoTextView robotoTextView = new RobotoTextView(m92689tK);
        robotoTextView.setPadding(AbstractC23136l9.m118742r(8.0f), 0, AbstractC23136l9.m118742r(8.0f), 0);
        robotoTextView.setLineHeight(AbstractC23136l9.m118742r(24.0f));
        robotoTextView.setTextSize(1, 18.0f);
        robotoTextView.setFontStyle(7);
        robotoTextView.setText("/");
        robotoTextView.setTextColor(AbstractC23136l9.m118641B(m92689tK, AbstractC2808b.ng60));
        robotoTextView.setBackground(AbstractC23136l9.m118665N(m92689tK, AbstractC16803z.frame_5526));
        textField3.setLeadingView(robotoTextView);
        C29856ia c29856ia8 = this.f76791Q0;
        if (c29856ia8 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia8 = null;
        }
        c29856ia8.f138175t.getEditText().addTextChangedListener(new C14898s());
        C29856ia c29856ia9 = this.f76791Q0;
        if (c29856ia9 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia9 = null;
        }
        c29856ia9.f138176u.m91045D(true);
        C29856ia c29856ia10 = this.f76791Q0;
        if (c29856ia10 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia10 = null;
        }
        c29856ia10.f138176u.setClearIconMode(enumC17006h);
        C29856ia c29856ia11 = this.f76791Q0;
        if (c29856ia11 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia11 = null;
        }
        c29856ia11.f138176u.setPasteTextLengthExceedListener(new C14900u());
        C29856ia c29856ia12 = this.f76791Q0;
        if (c29856ia12 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia12 = null;
        }
        c29856ia12.f138176u.getEditText().addTextChangedListener(new C14899t());
        C29856ia c29856ia13 = this.f76791Q0;
        if (c29856ia13 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia13 = null;
        }
        c29856ia13.f138172q.setOnClickListener(this);
        C29856ia c29856ia14 = this.f76791Q0;
        if (c29856ia14 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia14 = null;
        }
        c29856ia14.f138173r.setOnClickListener(this);
        C29856ia c29856ia15 = this.f76791Q0;
        if (c29856ia15 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29856ia2 = c29856ia15;
        }
        c29856ia2.f138177v.setOnClickListener(this);
    }

    /* renamed from: SM */
    public final void m83407SM(boolean z11) {
        int i11;
        C29856ia c29856ia = this.f76791Q0;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        RobotoTextView robotoTextView = c29856ia.f138172q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: TM */
    public final void m83408TM(boolean z11) {
        if (z11) {
            showDialog(0);
        }
    }

    /* renamed from: UM */
    public final void m83409UM(String str) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.ga0

            /* renamed from: p */
            public final /* synthetic */ String f80452p;

            public /* synthetic */ ga0(String str2) {
                r1 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                QuickMessageCreatingView.m83410VM(r1);
            }
        });
    }

    /* renamed from: VM */
    public static final void m83410VM(String str) {
        AbstractC19074t.m100208f(str, "$msg");
        ToastUtils.showMess(str);
    }

    /* renamed from: WM */
    public final void m83411WM(String str) {
        C29856ia c29856ia = this.f76791Q0;
        C29856ia c29856ia2 = null;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        c29856ia.f138175t.getEditText().setText(str);
        C29856ia c29856ia3 = this.f76791Q0;
        if (c29856ia3 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia3 = null;
        }
        Editable text = c29856ia3.f138175t.getEditText().getText();
        if (text != null) {
            C29856ia c29856ia4 = this.f76791Q0;
            if (c29856ia4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29856ia2 = c29856ia4;
            }
            c29856ia2.f138175t.getEditText().setSelection(text.length());
        }
    }

    /* renamed from: XM */
    public final void m83412XM(String str) {
        C29856ia c29856ia = this.f76791Q0;
        C29856ia c29856ia2 = null;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        c29856ia.f138176u.getEditText().setText(str);
        C29856ia c29856ia3 = this.f76791Q0;
        if (c29856ia3 == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia3 = null;
        }
        Editable text = c29856ia3.f138176u.getEditText().getText();
        if (text != null) {
            C29856ia c29856ia4 = this.f76791Q0;
            if (c29856ia4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29856ia2 = c29856ia4;
            }
            c29856ia2.f138176u.getEditText().setSelection(text.length());
        }
    }

    /* renamed from: YM */
    public final void m83413YM(boolean z11) {
        EnumC17007i enumC17007i;
        if (this.f76797W0 == z11) {
            return;
        }
        this.f76797W0 = z11;
        C29856ia c29856ia = this.f76791Q0;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        TextField textField = c29856ia.f138175t;
        if (this.f76797W0) {
            enumC17007i = EnumC17007i.ERROR;
        } else {
            enumC17007i = EnumC17007i.NORMAL;
        }
        textField.setFieldState(enumC17007i);
    }

    /* renamed from: c3 */
    public final void m83414c3(boolean z11) {
        if (z11) {
            if (!m78935DL()) {
                mo46829Y();
                return;
            }
            return;
        }
        mo49315c4();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
        m83399KM().m157814m0().m9219j(this, new C14897r(new C14888i(this)));
        m83399KM().m157815o0().m9219j(this, new C14897r(new C14889j(this)));
        m83399KM().m157816p0().m9219j(this, new C14897r(new C14890k(this)));
        m83399KM().m157813j0().m9219j(this, new C14897r(new C14891l(this)));
        m83399KM().m157809X0().m9219j(this, new C14897r(new C14892m(this)));
        m83399KM().m157806U0().m9219j(this, new C14897r(new C14893n(this)));
        m83399KM().m157807V0().m9219j(this, new C14897r(new C14894o(this)));
        m83399KM().m157812e0().m9219j(this, new C14897r(new C14895p(this)));
        m83399KM().m157803N0().m9219j(this, new C14897r(new C14896q(this)));
        m83399KM().m157811c0().m9219j(this, new C14897r(new C14884e(this)));
        m83399KM().m157808W0().m9219j(this, new C14897r(new C14885f(this)));
        m83399KM().m157810Z0().m9219j(this, new C14897r(new C14886g(this)));
        m83399KM().m157804Q0().m9219j(this, new C14897r(new C14887h(this)));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 == 0) {
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_quick_message_dialog_delete_this_title)).m43173v(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.fa0
                public /* synthetic */ fa0() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    QuickMessageCreatingView.m83401MM(QuickMessageCreatingView.this, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29856ia m148080c = C29856ia.m148080c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148080c, "inflate(...)");
        this.f76791Q0 = m148080c;
        m83406RM();
        m83396HM();
        C29856ia c29856ia = this.f76791Q0;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        KeyboardFrameLayout root = c29856ia.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ha0
                public /* synthetic */ ha0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QuickMessageCreatingView.m83403OM(QuickMessageCreatingView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(162, 163);
        return m131506n;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C29856ia c29856ia = this.f76791Q0;
        if (c29856ia == null) {
            AbstractC19074t.m100223u("binding");
            c29856ia = null;
        }
        AbstractC2379w.m12430d(c29856ia.f138176u);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "QuickMessageCreatingView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m83399KM().onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.btn_delete;
        if (num != null && num.intValue() == i11) {
            m83399KM().m157797G0();
            return;
        }
        int i12 = AbstractC6918a0.btn_upload;
        if (num != null && num.intValue() == i12) {
            m83399KM().m157802M0();
            return;
        }
        int i13 = AbstractC6918a0.remove_attachment_btn;
        if (num != null && num.intValue() == i13) {
            m83399KM().m157801L0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m83399KM().m157819v0(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m83400LM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("STR_SOURCE_START_VIEW")) {
                String string = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                C0697c0.b bVar = C0697c0.Companion;
                String trackingKey = getTrackingKey();
                AbstractC19074t.m100205c(string);
                bVar.m1054h(trackingKey, "src", string);
                m83399KM().m157805T0(string);
            }
            if (m92642L3.containsKey("EXTRA_QUICK_MESSAGE_ID")) {
                C0697c0.Companion.m1054h(getTrackingKey(), "isEdit", Boolean.TRUE);
            }
        }
        C0697c0.Companion.m1054h(getTrackingKey(), "sessionId", m83399KM().m157818u0());
    }
}

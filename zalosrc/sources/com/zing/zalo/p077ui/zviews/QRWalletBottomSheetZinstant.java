package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.QRWalletBottomSheetZinstant;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import com.zing.zalo.zinstant.exception.ZinstantException;
import com.zing.zalo.zinstant.view.ZinstantLayout;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23283z7;
import mj0.AbstractC23322a;
import nj0.AbstractC23803b;
import org.json.JSONObject;
import p405ov.C24561c;
import p542ub.InterfaceC27218a;
import p590vy.C28672a;
import p590vy.C28674c;
import p649xl.C29820ga;
import pj0.AbstractC24788n;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24785k;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qe0.AbstractC25247c;
import ui0.C27280g;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public final class QRWalletBottomSheetZinstant extends BottomSheet {

    /* renamed from: b1 */
    private C29820ga f76546b1;

    /* renamed from: c1 */
    private final InterfaceC24854k f76547c1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C28674c.class), new C14828l(new C14827k(this)), C14829m.f76562q);

    /* renamed from: d1 */
    private final C17170o f76548d1 = new C14817a();

    /* renamed from: e1 */
    private boolean f76549e1;

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$a */
    /* loaded from: classes6.dex */
    public static final class C14817a extends C17170o {
        C14817a() {
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            C29820ga c29820ga = QRWalletBottomSheetZinstant.this.f76546b1;
            if (c29820ga == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga = null;
            }
            return c29820ga.getRoot().getWidth();
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: m */
        public int mo72953m() {
            C29820ga c29820ga = QRWalletBottomSheetZinstant.this.f76546b1;
            if (c29820ga == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga = null;
            }
            return c29820ga.getRoot().getHeight();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$b */
    /* loaded from: classes6.dex */
    public static final class C14818b extends AbstractC23803b {
        C14818b() {
        }

        @Override // nj0.AbstractC23803b, ok0.InterfaceC24284a
        /* renamed from: i */
        public void mo43842i(ZinstantLayout zinstantLayout, String str, String str2, String str3, String str4, ZOMInsight zOMInsight, String str5) {
            if (!QRWalletBottomSheetZinstant.this.m83149UL().m143607g0(str3, str4)) {
                QRWalletBottomSheetZinstant.this.m83158dM(str3, str4, null);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$c */
    /* loaded from: classes6.dex */
    public static final class C14819c extends AbstractC24788n {
        C14819c() {
        }

        @Override // pj0.AbstractC24788n, pj0.InterfaceC24787m
        /* renamed from: a */
        public void mo61862a(String str, String str2, boolean z11, InterfaceC24785k interfaceC24785k) {
            super.mo61862a(str, str2, z11, interfaceC24785k);
            if (!QRWalletBottomSheetZinstant.this.m83149UL().m143607g0(str, str2)) {
                QRWalletBottomSheetZinstant.this.m83158dM(str, str2, interfaceC24785k);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$d */
    /* loaded from: classes6.dex */
    public static final class C14820d implements InterfaceC24775a {
        C14820d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m83167d(QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant, Exception exc) {
            AbstractC19074t.m100208f(qRWalletBottomSheetZinstant, "this$0");
            qRWalletBottomSheetZinstant.m83154ZL(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m83168f(QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant) {
            AbstractC19074t.m100208f(qRWalletBottomSheetZinstant, "this$0");
            qRWalletBottomSheetZinstant.m83156bM();
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: c */
        public void mo15338c(final Exception exc) {
            int i11;
            if (exc instanceof ZinstantException) {
                i11 = ((ZinstantException) exc).m91676a();
            } else {
                i11 = -999;
            }
            C24561c.m127942b("QRWalletBottomSheet", "initZinstantLayout errorCode=" + i11);
            if (AbstractC19444a.m101693a()) {
                QRWalletBottomSheetZinstant.this.m83154ZL(exc);
            } else {
                final QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
                qRWalletBottomSheetZinstant.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.s80
                    @Override // java.lang.Runnable
                    public final void run() {
                        QRWalletBottomSheetZinstant.C14820d.m83167d(QRWalletBottomSheetZinstant.this, exc);
                    }
                });
            }
        }

        @Override // pj0.InterfaceC24775a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            C24561c.m127942b("QRWalletBottomSheet", "initZinstantLayout success");
            if (AbstractC19444a.m101693a()) {
                QRWalletBottomSheetZinstant.this.m83156bM();
            } else {
                final QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
                qRWalletBottomSheetZinstant.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.r80
                    @Override // java.lang.Runnable
                    public final void run() {
                        QRWalletBottomSheetZinstant.C14820d.m83168f(QRWalletBottomSheetZinstant.this);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$e */
    /* loaded from: classes6.dex */
    public static final class C14821e extends AbstractC19075u implements InterfaceC18505l {
        C14821e() {
            super(1);
        }

        /* renamed from: a */
        public final void m83170a(String str) {
            QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
            AbstractC19074t.m100205c(str);
            qRWalletBottomSheetZinstant.m83162hM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83170a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$f */
    /* loaded from: classes6.dex */
    public static final class C14822f extends AbstractC19075u implements InterfaceC18505l {
        C14822f() {
            super(1);
        }

        /* renamed from: a */
        public final void m83171a(Boolean bool) {
            QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
            AbstractC19074t.m100205c(bool);
            qRWalletBottomSheetZinstant.m83161gM(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83171a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$g */
    /* loaded from: classes6.dex */
    public static final class C14823g extends AbstractC19075u implements InterfaceC18505l {
        C14823g() {
            super(1);
        }

        /* renamed from: a */
        public final void m83172a(C24848g0 c24848g0) {
            QRWalletBottomSheetZinstant.this.m83163iM();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83172a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$h */
    /* loaded from: classes6.dex */
    public static final class C14824h extends AbstractC19075u implements InterfaceC18505l {
        C14824h() {
            super(1);
        }

        /* renamed from: a */
        public final void m83173a(Boolean bool) {
            QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
            AbstractC19074t.m100205c(bool);
            qRWalletBottomSheetZinstant.m83164jM(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83173a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$i */
    /* loaded from: classes6.dex */
    public static final class C14825i extends AbstractC19075u implements InterfaceC18505l {
        C14825i() {
            super(1);
        }

        /* renamed from: a */
        public final void m83174a(InterfaceC22508f interfaceC22508f) {
            QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant = QRWalletBottomSheetZinstant.this;
            AbstractC19074t.m100205c(interfaceC22508f);
            qRWalletBottomSheetZinstant.m83152XL(interfaceC22508f);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m83174a((InterfaceC22508f) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$j */
    /* loaded from: classes6.dex */
    public static final class C14826j implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f76559p;

        C14826j(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f76559p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f76559p;
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
            this.f76559p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$k */
    /* loaded from: classes6.dex */
    public static final class C14827k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f76560q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14827k(ZaloView zaloView) {
            super(0);
            this.f76560q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f76560q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$l */
    /* loaded from: classes6.dex */
    public static final class C14828l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f76561q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14828l(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f76561q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f76561q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.QRWalletBottomSheetZinstant$m */
    /* loaded from: classes6.dex */
    static final class C14829m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14829m f76562q = new C14829m();

        C14829m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C28674c.e();
        }
    }

    /* renamed from: TL */
    private final void m83148TL() {
        m83157cM("js.action.qrwallet.finish_send", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UL */
    public final C28674c m83149UL() {
        return (C28674c) this.f76547c1.getValue();
    }

    /* renamed from: VL */
    private final void m83150VL() {
        m90533zL(EnumC17017m.HUG_CONTENT);
        m90523rL((int) (AbstractC23136l9.m118713h0() * 0.6f));
        m90527vL(0);
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        MultiStateView multiStateView = c29820ga.f137883q;
        multiStateView.setLoadingLayoutResourceId(AbstractC7409c0.layout_qr_wallet_skeleton_loading);
        multiStateView.setErrorLayoutResourceId(AbstractC7409c0.layout_error_qrwallet_attach);
        multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
    }

    /* renamed from: WL */
    private final boolean m83151WL(Exception exc) {
        if (exc instanceof ZinstantException) {
            return ((ZinstantException) exc).m91678c();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XL */
    public final void m83152XL(InterfaceC22508f interfaceC22508f) {
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        ZaloZinstantLayout zaloZinstantLayout = c29820ga.f137884r;
        zaloZinstantLayout.m91447b1(interfaceC22508f, null);
        zaloZinstantLayout.setOnZinstantClickListener(new C14818b());
        zaloZinstantLayout.setExternalScriptListener(new C14819c());
        zaloZinstantLayout.m91445Y0(this.f76548d1, new C14820d());
    }

    /* renamed from: YL */
    private final void m83153YL() {
        m83149UL().m143602X().m9219j(this, new C14826j(new C14821e()));
        m83149UL().m143600U().m9219j(this, new C14826j(new C14822f()));
        m83149UL().m143603Y().m9219j(this, new C14826j(new C14823g()));
        m83149UL().m143601W().m9219j(this, new C14826j(new C14824h()));
        m83149UL().m143604Z().m9219j(this, new C14826j(new C14825i()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public final void m83154ZL(Exception exc) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C29820ga c29820ga = null;
        if (m83151WL(exc)) {
            C29820ga c29820ga2 = this.f76546b1;
            if (c29820ga2 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga2 = null;
            }
            c29820ga2.f137883q.setEnableImageErrorView(true);
            C29820ga c29820ga3 = this.f76546b1;
            if (c29820ga3 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga3 = null;
            }
            c29820ga3.f137883q.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
            C29820ga c29820ga4 = this.f76546b1;
            if (c29820ga4 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga4 = null;
            }
            c29820ga4.f137883q.setErrorTitleString(m92652XI(AbstractC8020f0.str_qr_wallet_load_data_error_network));
            C29820ga c29820ga5 = this.f76546b1;
            if (c29820ga5 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga5 = null;
            }
            MultiStateView multiStateView = c29820ga5.f137883q;
            if (C23212s8.m119603k()) {
                i11 = AbstractC16803z.zillus_error_nointernet_qrwallet_light;
            } else {
                i11 = AbstractC16803z.zillus_error_nointernet_qrwallet_dark;
            }
            multiStateView.setErrorImageResource(i11);
            C29820ga c29820ga6 = this.f76546b1;
            if (c29820ga6 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga6 = null;
            }
            TextView tvError = c29820ga6.f137883q.getTvError();
            if (tvError != null) {
                ViewGroup.LayoutParams layoutParams = tvError.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams2 = null;
                }
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = AbstractC23136l9.m118712h(tvError.getContext(), 16.0f);
                    tvError.setLayoutParams(marginLayoutParams2);
                }
            }
        } else {
            C29820ga c29820ga7 = this.f76546b1;
            if (c29820ga7 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga7 = null;
            }
            c29820ga7.f137883q.setEnableImageErrorView(false);
            C29820ga c29820ga8 = this.f76546b1;
            if (c29820ga8 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga8 = null;
            }
            c29820ga8.f137883q.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            C29820ga c29820ga9 = this.f76546b1;
            if (c29820ga9 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga9 = null;
            }
            c29820ga9.f137883q.setErrorTitleString(m92652XI(AbstractC8020f0.str_qr_wallet_load_data_error_general));
            C29820ga c29820ga10 = this.f76546b1;
            if (c29820ga10 == null) {
                AbstractC19074t.m100223u("binding");
                c29820ga10 = null;
            }
            TextView tvError2 = c29820ga10.f137883q.getTvError();
            if (tvError2 != null) {
                ViewGroup.LayoutParams layoutParams2 = tvError2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = AbstractC23136l9.m118712h(tvError2.getContext(), 152.0f);
                    tvError2.setLayoutParams(marginLayoutParams);
                }
            }
        }
        C29820ga c29820ga11 = this.f76546b1;
        if (c29820ga11 == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga11 = null;
        }
        c29820ga11.f137883q.setState(MultiStateView.EnumC15914e.ERROR);
        C29820ga c29820ga12 = this.f76546b1;
        if (c29820ga12 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29820ga = c29820ga12;
        }
        Button buttonRetry = c29820ga.f137883q.getButtonRetry();
        buttonRetry.setVisibility(0);
        buttonRetry.setText(m92652XI(AbstractC8020f0.str_qr_wallet_load_data_btn_retry));
        buttonRetry.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.q80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QRWalletBottomSheetZinstant.m83155aM(QRWalletBottomSheetZinstant.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public static final void m83155aM(QRWalletBottomSheetZinstant qRWalletBottomSheetZinstant, View view) {
        AbstractC19074t.m100208f(qRWalletBottomSheetZinstant, "this$0");
        qRWalletBottomSheetZinstant.m83160fM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public final void m83156bM() {
        C29820ga c29820ga = this.f76546b1;
        C29820ga c29820ga2 = null;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        c29820ga.f137883q.setState(MultiStateView.EnumC15914e.CONTENT);
        C29820ga c29820ga3 = this.f76546b1;
        if (c29820ga3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29820ga2 = c29820ga3;
        }
        c29820ga2.f137884r.onStart();
    }

    /* renamed from: cM */
    private final void m83157cM(String str, String str2) {
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        c29820ga.f137884r.m91999q0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dM */
    public final void m83158dM(String str, String str2, InterfaceC24785k interfaceC24785k) {
        int i11;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (this.f76549e1) {
                i11 = 1056;
            } else {
                i11 = 1006;
            }
            jSONObject.put("sourceOpen", i11);
            str2 = jSONObject.toString();
        } catch (Exception unused) {
        }
        String str3 = str2;
        InterfaceC27218a m92676n2 = m92676n2();
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        AbstractC28207v1.m141989h3(str, 2, m92676n2, this, str3, c29820ga.f137884r.m91448V0(str, str3, interfaceC24785k), null, null, null);
    }

    /* renamed from: eM */
    private final void m83159eM() {
        m83157cM("js.action.qrwallet.refresh", "");
    }

    /* renamed from: fM */
    private final void m83160fM() {
        C29820ga c29820ga = this.f76546b1;
        C29820ga c29820ga2 = null;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        c29820ga.f137883q.setState(MultiStateView.EnumC15914e.LOADING);
        C29820ga c29820ga3 = this.f76546b1;
        if (c29820ga3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29820ga2 = c29820ga3;
        }
        c29820ga2.f137884r.mo91437z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final void m83161gM(boolean z11) {
        ZdsModalBottomSheet zdsModalBottomSheet;
        int i11;
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof ZdsModalBottomSheet) {
            zdsModalBottomSheet = (ZdsModalBottomSheet) m92650VI;
        } else {
            zdsModalBottomSheet = null;
        }
        if (zdsModalBottomSheet != null) {
            if (z11) {
                i11 = -1;
            } else {
                i11 = 0;
            }
            zdsModalBottomSheet.mo50035CK(i11, null);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final void m83162hM(String str) {
        InterfaceC27218a m92676n2 = m92676n2();
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C23283z7.m120379l(m92676n2, str, C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.f150829r50), Integer.valueOf(AbstractC23136l9.m118742r(84.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final void m83163iM() {
        ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
        finish();
        BottomSheet.AbstractC16910a m130674b = AbstractC25247c.m130674b(this);
        if (m130674b != null) {
            m130674b.mo45955a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final void m83164jM(boolean z11) {
        if (!z11) {
            m83148TL();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m83149UL().m143605c0(C28672a.Companion.m143585a(m92642L3()));
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        ZaloZinstantLayout zaloZinstantLayout = c29820ga.f137884r;
        AbstractC19074t.m100207e(zaloZinstantLayout, "zinstantLayout");
        return zaloZinstantLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        c29820ga.f137884r.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        super.mo37122XJ(z11, z12);
        if (z11) {
            m83149UL().m143606e0();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m83153YL();
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("is.group.chat", false);
        }
        this.f76549e1 = z11;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29820ga m147993c = C29820ga.m147993c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m147993c, "inflate(...)");
        this.f76546b1 = m147993c;
        m83150VL();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C29820ga c29820ga = this.f76546b1;
        if (c29820ga == null) {
            AbstractC19074t.m100223u("binding");
            c29820ga = null;
        }
        c29820ga.f137884r.onStart();
        m83159eM();
    }
}

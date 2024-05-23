package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.UpdateInfoConfig;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import pm0.C24848g0;
import q10.C25064w1;
import v00.AbstractC27413h;
import v00.C27417l;

/* loaded from: classes5.dex */
public final class SuggestUpdateView extends ZchBaseView implements ZaloView.InterfaceC17421f {

    /* renamed from: z0 */
    private boolean f53390z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$a */
    /* loaded from: classes5.dex */
    static final class C10480a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53391q;

        /* renamed from: r */
        final /* synthetic */ SuggestUpdateView f53392r;

        /* renamed from: s */
        final /* synthetic */ UpdateInfoConfig f53393s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10480a(ConfirmPopupView confirmPopupView, SuggestUpdateView suggestUpdateView, UpdateInfoConfig updateInfoConfig) {
            super(0);
            this.f53391q = confirmPopupView;
            this.f53392r = suggestUpdateView;
            this.f53393s = updateInfoConfig;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55019a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55019a() {
            String m92652XI = this.f53391q.m92652XI(AbstractC27413h.zch_action_key_update_force_confirm);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            this.f53392r.m55018UK(this.f53393s.m51496f());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$b */
    /* loaded from: classes5.dex */
    static final class C10481b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ ConfirmPopupView f53395r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10481b(ConfirmPopupView confirmPopupView) {
            super(0);
            this.f53395r = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55020a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55020a() {
            SuggestUpdateView.this.f53390z0 = false;
            String m92652XI = this.f53395r.m92652XI(AbstractC27413h.zch_action_key_update_force_close);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            C10631i.Companion.m55602a().m55600q();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$c */
    /* loaded from: classes5.dex */
    static final class C10482c extends AbstractC19075u implements InterfaceC18494a {
        C10482c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55021a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55021a() {
            SuggestUpdateView.this.f53390z0 = true;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$d */
    /* loaded from: classes5.dex */
    static final class C10483d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53397q;

        /* renamed from: r */
        final /* synthetic */ SuggestUpdateView f53398r;

        /* renamed from: s */
        final /* synthetic */ UpdateInfoConfig f53399s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10483d(ConfirmPopupView confirmPopupView, SuggestUpdateView suggestUpdateView, UpdateInfoConfig updateInfoConfig) {
            super(0);
            this.f53397q = confirmPopupView;
            this.f53398r = suggestUpdateView;
            this.f53399s = updateInfoConfig;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55022a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55022a() {
            String m92652XI = this.f53397q.m92652XI(AbstractC27413h.zch_action_key_update_optional_confirm);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            this.f53398r.m55018UK(this.f53399s.m51496f());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$e */
    /* loaded from: classes5.dex */
    static final class C10484e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53400q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10484e(ConfirmPopupView confirmPopupView) {
            super(0);
            this.f53400q = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55023a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55023a() {
            String m92652XI = this.f53400q.m92652XI(AbstractC27413h.zch_action_key_update_optional_ignore);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$f */
    /* loaded from: classes5.dex */
    static final class C10485f extends AbstractC19075u implements InterfaceC18494a {
        C10485f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55024a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55024a() {
            SuggestUpdateView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$g */
    /* loaded from: classes5.dex */
    static final class C10486g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53402q;

        /* renamed from: r */
        final /* synthetic */ SuggestUpdateView f53403r;

        /* renamed from: s */
        final /* synthetic */ UpdateInfoConfig f53404s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10486g(ConfirmPopupView confirmPopupView, SuggestUpdateView suggestUpdateView, UpdateInfoConfig updateInfoConfig) {
            super(0);
            this.f53402q = confirmPopupView;
            this.f53403r = suggestUpdateView;
            this.f53404s = updateInfoConfig;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55025a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55025a() {
            String m92652XI = this.f53402q.m92652XI(AbstractC27413h.zch_action_key_update_force_confirm);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            this.f53403r.m55018UK(this.f53404s.m51496f());
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$h */
    /* loaded from: classes5.dex */
    static final class C10487h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ConfirmPopupView f53405q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10487h(ConfirmPopupView confirmPopupView) {
            super(0);
            this.f53405q = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55026a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55026a() {
            String m92652XI = this.f53405q.m92652XI(AbstractC27413h.zch_action_key_update_force_close);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
            C10631i.Companion.m55602a().m55600q();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SuggestUpdateView$i */
    /* loaded from: classes5.dex */
    static final class C10488i extends AbstractC19075u implements InterfaceC18494a {
        C10488i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m55027a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m55027a() {
            SuggestUpdateView.this.f53390z0 = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UK */
    public final void m55018UK(String str) {
        try {
            m92641HK(Intent.createChooser(new Intent("android.intent.action.VIEW", Uri.parse(str)), "Mở bằng"));
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UpdateInfoConfig updateInfoConfig;
        Integer num;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25064w1 m129965c = C25064w1.m129965c(layoutInflater);
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null) {
            updateInfoConfig = m140381e.m51429f();
        } else {
            updateInfoConfig = null;
        }
        if (updateInfoConfig != null) {
            num = updateInfoConfig.m51495e();
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, updateInfoConfig.m51494d(), updateInfoConfig.m51493c(), updateInfoConfig.m51492b(), updateInfoConfig.m51491a(), null, false, false, 80, null);
            m51992b.m51991lL(new C10480a(m51992b, this, updateInfoConfig));
            m51992b.m51990kL(new C10481b(m51992b));
            m51992b.m51976XK(new C10482c());
            m51992b.m51978ZK(true);
            m51992b.m51977YK(false);
            m51992b.m51979aL(false);
            C17487o0 m92693xK = m92693xK();
            AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
            BasePopupView.m51974dL(m51992b, m92693xK, null, 2, null);
            String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_update_force);
            C19205a c19205a = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI);
            c19205a.m100713L(m92652XI, null);
        } else if (num != null && num.intValue() == 2) {
            ConfirmPopupView m51992b2 = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, updateInfoConfig.m51494d(), updateInfoConfig.m51493c(), updateInfoConfig.m51492b(), updateInfoConfig.m51491a(), null, false, false, 80, null);
            m51992b2.m51991lL(new C10483d(m51992b2, this, updateInfoConfig));
            m51992b2.m51990kL(new C10484e(m51992b2));
            m51992b2.m51976XK(new C10485f());
            m51992b2.m51978ZK(true);
            C17487o0 m92693xK2 = m92693xK();
            AbstractC19074t.m100207e(m92693xK2, "requireZaloViewManager(...)");
            BasePopupView.m51974dL(m51992b2, m92693xK2, null, 2, null);
            String m92652XI2 = m92652XI(AbstractC27413h.zch_action_key_show_update_optional);
            C19205a c19205a2 = C19205a.f95429a;
            AbstractC19074t.m100205c(m92652XI2);
            c19205a2.m100713L(m92652XI2, null);
        } else {
            finish();
        }
        FrameLayout root = m129965c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        UpdateInfoConfig updateInfoConfig;
        Integer m51495e;
        super.mo37584UJ();
        if (this.f53390z0) {
            this.f53390z0 = false;
            ChannelConfig m140381e = C27417l.f129055a.m140381e();
            if (m140381e != null) {
                updateInfoConfig = m140381e.m51429f();
            } else {
                updateInfoConfig = null;
            }
            if (updateInfoConfig != null && (m51495e = updateInfoConfig.m51495e()) != null && m51495e.intValue() == 1) {
                ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, updateInfoConfig.m51494d(), updateInfoConfig.m51493c(), updateInfoConfig.m51492b(), updateInfoConfig.m51491a(), null, false, false, 80, null);
                m51992b.m51991lL(new C10486g(m51992b, this, updateInfoConfig));
                m51992b.m51990kL(new C10487h(m51992b));
                m51992b.m51976XK(new C10488i());
                m51992b.m51978ZK(true);
                m51992b.m51977YK(false);
                m51992b.m51979aL(false);
                C17487o0 m92693xK = m92693xK();
                AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
                BasePopupView.m51974dL(m51992b, m92693xK, null, 2, null);
                String m92652XI = m92652XI(AbstractC27413h.zch_action_key_show_update_force);
                C19205a c19205a = C19205a.f95429a;
                AbstractC19074t.m100205c(m92652XI);
                c19205a.m100713L(m92652XI, null);
            }
        }
    }
}

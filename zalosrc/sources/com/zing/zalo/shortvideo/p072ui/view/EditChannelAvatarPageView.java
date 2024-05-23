package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Intent;
import android.os.Bundle;
import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import com.zing.zalo.shortvideo.data.model.config.EditProfileConfig;
import com.zing.zalo.shortvideo.p072ui.component.popup.BasePopupView;
import com.zing.zalo.shortvideo.p072ui.component.popup.ConfirmPopupView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19721e;
import m20.InterfaceC22723b0;
import pm0.C24848g0;
import q20.C25097t;
import s20.AbstractC26105g;
import v00.AbstractC27413h;
import v00.C27417l;
import w00.AbstractC28684a;

/* loaded from: classes5.dex */
public class EditChannelAvatarPageView extends UploadCropImagePageView implements InterfaceC22723b0 {
    public static final C10206a Companion = new C10206a(null);

    /* renamed from: E0 */
    private final InterfaceC19721e f52752E0 = AbstractC28684a.Companion.m143686t();

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditChannelAvatarPageView$a */
    /* loaded from: classes5.dex */
    public static final class C10206a {
        private C10206a() {
        }

        public /* synthetic */ C10206a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditChannelAvatarPageView$b */
    /* loaded from: classes5.dex */
    static final class C10207b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f52753q;

        /* renamed from: r */
        final /* synthetic */ ConfirmPopupView f52754r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10207b(InterfaceC18505l interfaceC18505l, ConfirmPopupView confirmPopupView) {
            super(0);
            this.f52753q = interfaceC18505l;
            this.f52754r = confirmPopupView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54245a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54245a() {
            this.f52753q.mo205i9(Boolean.TRUE);
            C19205a c19205a = C19205a.f95429a;
            String m92652XI = this.f52754r.m92652XI(AbstractC27413h.zch_action_key_change_avatar_confirm);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            c19205a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.EditChannelAvatarPageView$c */
    /* loaded from: classes5.dex */
    static final class C10208c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f52755q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10208c(InterfaceC18505l interfaceC18505l) {
            super(0);
            this.f52755q = interfaceC18505l;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54246a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54246a() {
            this.f52755q.mo205i9(Boolean.FALSE);
        }
    }

    /* renamed from: gL */
    private final C17487o0 m54240gL() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof EditChannelAvatarPageView) {
            C17487o0 m92649TI = ((EditChannelAvatarPageView) m92650VI).m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            return m92649TI;
        }
        C17487o0 m92649TI2 = super.m92649TI();
        AbstractC19074t.m100207e(m92649TI2, "getChildZaloViewManager(...)");
        return m92649TI2;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CropImagePageView, com.zing.zalo.shortvideo.p072ui.view.AbstractC10623a, com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f52752E0.mo52965Lb(this);
    }

    @Override // m20.InterfaceC22723b0
    /* renamed from: Cg */
    public void mo54241Cg(String str) {
        AbstractC19074t.m100208f(str, "avatar");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_EDIT_CHANNEL_AVATAR", str);
        C24848g0 c24848g0 = C24848g0.f119245a;
        mo50035CK(-1, intent);
        finish();
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.CropImagePageView
    /* renamed from: WK */
    public void mo54231WK(InterfaceC18505l interfaceC18505l) {
        String str;
        EditProfileConfig m51426c;
        Long m51465b;
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        ChannelConfig m140381e = C27417l.f129055a.m140381e();
        if (m140381e != null && (m51426c = m140381e.m51426c()) != null && (m51465b = m51426c.m51465b()) != null) {
            str = AbstractC26105g.m134339f(m51465b.longValue(), getContext());
        } else {
            str = null;
        }
        ConfirmPopupView m51992b = ConfirmPopupView.C9537a.m51992b(ConfirmPopupView.Companion, m92652XI(AbstractC27413h.zch_popup_change_avatar_title), m92653YI(AbstractC27413h.zch_popup_change_avatar_message, str), m92652XI(AbstractC27413h.zch_popup_change_avatar_positive), m92652XI(AbstractC27413h.zch_popup_change_avatar_negative), null, false, false, 80, null);
        m51992b.m51991lL(new C10207b(interfaceC18505l, m51992b));
        m51992b.m51990kL(new C10208c(interfaceC18505l));
        m51992b.m51978ZK(true);
        BasePopupView.m51974dL(m51992b, m54240gL(), null, 2, null);
    }

    @Override // m20.InterfaceC22723b0
    /* renamed from: d5 */
    public void mo54242d5(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.UploadCropImagePageView
    /* renamed from: eL */
    public boolean mo54243eL(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130155r(getContext(), th2);
        return true;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.UploadCropImagePageView
    /* renamed from: fL */
    public boolean mo54244fL(String str) {
        AbstractC19074t.m100208f(str, "zmcId");
        this.f52752E0.mo53166ua(str);
        return true;
    }
}

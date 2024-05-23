package com.zing.zalo.p077ui.settings.subsettings;

import ae.C0766k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.subsettings.SettingDisplayMessage;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.C23055e5;
import p019aj.C0872f;
import p227i3.C20218v;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class SettingDisplayMessage extends SlidableZaloView implements View.OnClickListener {

    /* renamed from: P0 */
    private LinearLayout f68217P0;

    /* renamed from: Q0 */
    private ImageView f68218Q0;

    /* renamed from: R0 */
    private LinearLayout f68219R0;

    /* renamed from: S0 */
    private ImageView f68220S0;

    /* renamed from: T0 */
    private final InterfaceC24854k f68221T0;

    /* renamed from: U0 */
    private boolean f68222U0;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingDisplayMessage$a */
    /* loaded from: classes6.dex */
    static final class C13258a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13258a f68223q = new C13258a();

        C13258a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0872f mo12V4() {
            C0872f m120562A = AbstractC23306f.m120562A();
            AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
            return m120562A;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingDisplayMessage$b */
    /* loaded from: classes6.dex */
    public static final class C13259b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ boolean f68225b;

        C13259b(boolean z11) {
            this.f68225b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m74496e(SettingDisplayMessage settingDisplayMessage) {
            AbstractC19074t.m100208f(settingDisplayMessage, "this$0");
            settingDisplayMessage.m74491lM();
            settingDisplayMessage.f68222U0 = false;
            settingDisplayMessage.mo49315c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m74497f(SettingDisplayMessage settingDisplayMessage) {
            AbstractC19074t.m100208f(settingDisplayMessage, "this$0");
            settingDisplayMessage.f68222U0 = false;
            settingDisplayMessage.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            if (c20096c.m104491c() == 515) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            }
            final SettingDisplayMessage settingDisplayMessage = SettingDisplayMessage.this;
            settingDisplayMessage.mo70710wy(new Runnable() { // from class: oa0.r
                @Override // java.lang.Runnable
                public final void run() {
                    SettingDisplayMessage.C13259b.m74497f(SettingDisplayMessage.this);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            SettingDisplayMessage.this.m74489jM().m2547l0(this.f68225b);
            final SettingDisplayMessage settingDisplayMessage = SettingDisplayMessage.this;
            settingDisplayMessage.mo70710wy(new Runnable() { // from class: oa0.q
                @Override // java.lang.Runnable
                public final void run() {
                    SettingDisplayMessage.C13259b.m74496e(SettingDisplayMessage.this);
                }
            });
        }
    }

    public SettingDisplayMessage() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C13258a.f68223q);
        this.f68221T0 = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public final C0872f m74489jM() {
        return (C0872f) this.f68221T0.getValue();
    }

    /* renamed from: kM */
    private final void m74490kM(View view) {
        View findViewById = view.findViewById(AbstractC6918a0.ll_display_msg_newest);
        AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f68217P0 = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.ll_display_msg_first_unread);
        AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        this.f68219R0 = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(AbstractC6918a0.iv_enable_display_msg_newest);
        AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type android.widget.ImageView");
        this.f68218Q0 = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(AbstractC6918a0.iv_enable_display_msg_first_unread);
        AbstractC19074t.m100206d(findViewById4, "null cannot be cast to non-null type android.widget.ImageView");
        this.f68220S0 = (ImageView) findViewById4;
        LinearLayout linearLayout = this.f68217P0;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC19074t.m100223u("llDisplayNewest");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout3 = this.f68219R0;
        if (linearLayout3 == null) {
            AbstractC19074t.m100223u("llDisplayFirstUnread");
        } else {
            linearLayout2 = linearLayout3;
        }
        linearLayout2.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final void m74491lM() {
        ImageView imageView = null;
        if (m74489jM().m2525T()) {
            ImageView imageView2 = this.f68218Q0;
            if (imageView2 == null) {
                AbstractC19074t.m100223u("ivEnableDisplayNewest");
                imageView2 = null;
            }
            imageView2.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            ImageView imageView3 = this.f68220S0;
            if (imageView3 == null) {
                AbstractC19074t.m100223u("ivEnableDisplayFirstUnread");
            } else {
                imageView = imageView3;
            }
            imageView.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
            return;
        }
        ImageView imageView4 = this.f68218Q0;
        if (imageView4 == null) {
            AbstractC19074t.m100223u("ivEnableDisplayNewest");
            imageView4 = null;
        }
        imageView4.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
        ImageView imageView5 = this.f68220S0;
        if (imageView5 == null) {
            AbstractC19074t.m100223u("ivEnableDisplayFirstUnread");
        } else {
            imageView = imageView5;
        }
        imageView.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
    }

    /* renamed from: mM */
    private final void m74492mM(boolean z11) {
        if (this.f68222U0 || !C23055e5.m118272g(true)) {
            return;
        }
        this.f68222U0 = true;
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13259b(z11));
        c0766k.mo1699o3(40, z11 ? 1 : 0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_display_msg, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        m74490kM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_display_msg));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingDisplayMessage";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.ll_display_msg_newest) {
            m74492mM(false);
        } else if (id2 == AbstractC6918a0.ll_display_msg_first_unread) {
            m74492mM(true);
        }
        m74491lM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m74491lM();
    }
}

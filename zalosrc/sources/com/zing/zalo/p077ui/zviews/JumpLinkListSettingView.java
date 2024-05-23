package com.zing.zalo.p077ui.zviews;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b40.C2526d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p649xl.C30046t4;

/* loaded from: classes6.dex */
public final class JumpLinkListSettingView extends SlidableZaloView {
    public static final C14500a Companion = new C14500a(null);

    /* renamed from: P0 */
    private C30046t4 f74549P0;

    /* renamed from: Q0 */
    private int f74550Q0 = 1;

    /* renamed from: com.zing.zalo.ui.zviews.JumpLinkListSettingView$a */
    /* loaded from: classes6.dex */
    public static final class C14500a {
        private C14500a() {
        }

        public /* synthetic */ C14500a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: jM */
    private final void m81026jM() {
        this.f74550Q0 = AbstractC0924m0.m2893A1();
        m81029mM();
        C30046t4 c30046t4 = this.f74549P0;
        C30046t4 c30046t42 = null;
        if (c30046t4 == null) {
            AbstractC19074t.m100223u("binding");
            c30046t4 = null;
        }
        c30046t4.f139381t.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.os
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpLinkListSettingView.m81027kM(JumpLinkListSettingView.this, view);
            }
        });
        C30046t4 c30046t43 = this.f74549P0;
        if (c30046t43 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30046t42 = c30046t43;
        }
        c30046t42.f139380s.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.ps
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JumpLinkListSettingView.m81028lM(JumpLinkListSettingView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public static final void m81027kM(JumpLinkListSettingView jumpLinkListSettingView, View view) {
        AbstractC19074t.m100208f(jumpLinkListSettingView, "this$0");
        jumpLinkListSettingView.m81030nM(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m81028lM(JumpLinkListSettingView jumpLinkListSettingView, View view) {
        AbstractC19074t.m100208f(jumpLinkListSettingView, "this$0");
        jumpLinkListSettingView.m81030nM(0);
    }

    /* renamed from: mM */
    private final void m81029mM() {
        int i11 = this.f74550Q0;
        C30046t4 c30046t4 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                C30046t4 c30046t42 = this.f74549P0;
                if (c30046t42 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30046t42 = null;
                }
                c30046t42.f139378q.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                C30046t4 c30046t43 = this.f74549P0;
                if (c30046t43 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30046t4 = c30046t43;
                }
                c30046t4.f139379r.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                return;
            }
            return;
        }
        C30046t4 c30046t44 = this.f74549P0;
        if (c30046t44 == null) {
            AbstractC19074t.m100223u("binding");
            c30046t44 = null;
        }
        c30046t44.f139378q.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
        C30046t4 c30046t45 = this.f74549P0;
        if (c30046t45 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30046t4 = c30046t45;
        }
        c30046t4.f139379r.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
    }

    /* renamed from: nM */
    private final void m81030nM(int i11) {
        if (this.f74550Q0 != i11) {
            this.f74550Q0 = i11;
            m81029mM();
            AbstractC0924m0.m4292vi(this.f74550Q0);
            C2526d.f10270a.m12731w0("0", "setting_privacy", this.f74550Q0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_setting_title));
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "JumpLinkListSettingView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: iM, reason: merged with bridge method [inline-methods] */
    public LinearLayout mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30046t4 m148519c = C30046t4.m148519c(layoutInflater);
        AbstractC19074t.m100205c(m148519c);
        this.f74549P0 = m148519c;
        m81026jM();
        LinearLayout root = m148519c.getRoot();
        AbstractC19074t.m100207e(root, "run(...)");
        return root;
    }
}

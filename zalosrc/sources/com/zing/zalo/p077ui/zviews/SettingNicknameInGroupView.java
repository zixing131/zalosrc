package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.activity.ZaloActivity;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import p363nh.C23744a;
import p716zh.C31973j5;

/* loaded from: classes6.dex */
public class SettingNicknameInGroupView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC0733x {

    /* renamed from: P0 */
    View f77525P0;

    /* renamed from: Q0 */
    View f77526Q0;

    /* renamed from: R0 */
    ImageView f77527R0;

    /* renamed from: S0 */
    View f77528S0;

    /* renamed from: T0 */
    ImageView f77529T0;

    /* renamed from: U0 */
    String f77530U0;

    /* renamed from: V0 */
    C31973j5 f77531V0;

    /* renamed from: W0 */
    boolean f77532W0;

    /* renamed from: X0 */
    boolean f77533X0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingNicknameInGroupView$a */
    /* loaded from: classes6.dex */
    public class C15039a implements InterfaceC20094a {
        C15039a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            C31973j5 c31973j5 = SettingNicknameInGroupView.this.f77531V0;
            if (c31973j5 != null && c31973j5.m153747Y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC23161o1.m119321f(c20096c, z11);
            SettingNicknameInGroupView.this.f72421L0.mo49315c4();
            SettingNicknameInGroupView.this.f77533X0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingNicknameInGroupView.this.f72421L0.mo49315c4();
            SettingNicknameInGroupView.this.f77533X0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public /* synthetic */ void m84175iM() {
        m84177jM(this.f77532W0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f77525P0 = layoutInflater.inflate(AbstractC7409c0.setting_nickname_group_layout, viewGroup, false);
        m84178kM();
        return this.f77525P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 113);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingNicknameInGroupView";
    }

    /* renamed from: hM */
    void m84176hM() {
        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f77530U0);
        this.f77531V0 = m4472f;
        if (m4472f != null) {
            this.f77532W0 = m4472f.m153766j0();
        }
    }

    /* renamed from: jM */
    void m84177jM(boolean z11) {
        Drawable m118665N = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_form_radio_unchecked);
        Drawable m118665N2 = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.icn_form_radio_checked);
        if (z11) {
            this.f77527R0.setImageDrawable(m118665N2);
            this.f77529T0.setImageDrawable(m118665N);
        } else {
            this.f77527R0.setImageDrawable(m118665N);
            this.f77529T0.setImageDrawable(m118665N2);
        }
    }

    /* renamed from: kM */
    void m84178kM() {
        View findViewById = this.f77525P0.findViewById(AbstractC6918a0.only_admin);
        this.f77526Q0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f77527R0 = (ImageView) this.f77525P0.findViewById(AbstractC6918a0.only_admin_checkbox);
        View findViewById2 = this.f77525P0.findViewById(AbstractC6918a0.all_member);
        this.f77528S0 = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f77529T0 = (ImageView) this.f77525P0.findViewById(AbstractC6918a0.all_member_checkbox);
    }

    /* renamed from: lM */
    void m84179lM(boolean z11) {
        if (this.f77533X0) {
            return;
        }
        this.f77533X0 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C15039a());
        c0766k.mo1412D7(this.f77530U0, 9, z11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.only_admin) {
            this.f77532W0 = true;
            m84179lM(true);
        } else if (id2 == AbstractC6918a0.all_member) {
            this.f77532W0 = false;
            m84179lM(false);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 113) {
            try {
                if (TextUtils.equals((String) objArr[0], this.f77530U0)) {
                    this.f77532W0 = this.f77531V0.m153766j0();
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.li0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingNicknameInGroupView.this.m84175iM();
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f77530U0 = m92642L3.getString("extra_group_id");
        }
        m84176hM();
        m84177jM(this.f77532W0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 113);
    }
}

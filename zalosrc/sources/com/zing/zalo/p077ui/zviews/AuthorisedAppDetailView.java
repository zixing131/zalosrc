package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.thirdparty.model.AuthorisedApp;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;

/* loaded from: classes6.dex */
public class AuthorisedAppDetailView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: j1 */
    protected static final String f72163j1 = "AuthorisedAppDetailView";

    /* renamed from: R0 */
    AuthorisedApp f72166R0;

    /* renamed from: S0 */
    C23528a f72167S0;

    /* renamed from: T0 */
    View f72168T0;

    /* renamed from: U0 */
    StencilSwitch f72169U0;

    /* renamed from: V0 */
    View f72170V0;

    /* renamed from: W0 */
    StencilSwitch f72171W0;

    /* renamed from: X0 */
    View f72172X0;

    /* renamed from: Y0 */
    StencilSwitch f72173Y0;

    /* renamed from: Z0 */
    View f72174Z0;

    /* renamed from: a1 */
    StencilSwitch f72175a1;

    /* renamed from: b1 */
    RecyclingImageView f72176b1;

    /* renamed from: c1 */
    TextView f72177c1;

    /* renamed from: d1 */
    TextView f72178d1;

    /* renamed from: e1 */
    C8009j f72179e1;

    /* renamed from: f1 */
    TextView f72180f1;

    /* renamed from: g1 */
    View f72181g1;

    /* renamed from: P0 */
    InterfaceC0765j f72164P0 = new C0766k();

    /* renamed from: Q0 */
    InterfaceC0765j f72165Q0 = new C0766k();

    /* renamed from: h1 */
    InterfaceC20094a f72182h1 = new C14037a();

    /* renamed from: i1 */
    InterfaceC20094a f72183i1 = new C14038b();

    /* renamed from: com.zing.zalo.ui.zviews.AuthorisedAppDetailView$a */
    /* loaded from: classes6.dex */
    class C14037a implements InterfaceC20094a {
        C14037a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = AuthorisedAppDetailView.f72163j1;
            c20096c.m104492d();
            ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_save_error, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = AuthorisedAppDetailView.f72163j1;
            obj.toString();
            ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_save_done, new Object[0]);
            AuthorisedAppDetailView.this.f72421L0.mo50035CK(-1, null);
            AuthorisedAppDetailView.this.finish();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AuthorisedAppDetailView$b */
    /* loaded from: classes6.dex */
    class C14038b implements InterfaceC20094a {
        C14038b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = AuthorisedAppDetailView.f72163j1;
            c20096c.m104492d();
            ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_unauthorize_error, new Object[0]);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = AuthorisedAppDetailView.f72163j1;
            obj.toString();
            ToastUtils.m89266n(AbstractC8020f0.authorised_app_detail_unauthorize_done, new Object[0]);
            AuthorisedAppDetailView.this.f72421L0.mo50035CK(-1, null);
            AuthorisedAppDetailView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public /* synthetic */ void m78117lM(CompoundButton compoundButton, boolean z11) {
        AuthorisedApp authorisedApp = this.f72166R0;
        if (authorisedApp != null && !authorisedApp.m56626g()) {
            this.f72166R0.m56637t(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m78118mM(CompoundButton compoundButton, boolean z11) {
        AuthorisedApp authorisedApp = this.f72166R0;
        if (authorisedApp != null && !authorisedApp.m56632m()) {
            this.f72166R0.m56639w(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m78119nM(CompoundButton compoundButton, boolean z11) {
        AuthorisedApp authorisedApp = this.f72166R0;
        if (authorisedApp != null && !authorisedApp.m56625f()) {
            this.f72166R0.m56636q(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m78120oM(CompoundButton compoundButton, boolean z11) {
        AuthorisedApp authorisedApp = this.f72166R0;
        if (authorisedApp != null && !authorisedApp.m56631l()) {
            this.f72166R0.m56638u(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m78121pM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        this.f72165Q0.mo1569X3(this.f72166R0.m56620a());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72167S0 = new C23528a(this.f72421L0.m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f72181g1 = layoutInflater.inflate(AbstractC7409c0.authorised_app_detail_view, (ViewGroup) null);
        this.f72164P0.mo1704o8(this.f72182h1);
        this.f72165Q0.mo1704o8(this.f72183i1);
        this.f72176b1 = (RecyclingImageView) this.f72181g1.findViewById(AbstractC6918a0.authorised_app_detail_logo);
        this.f72177c1 = (TextView) this.f72181g1.findViewById(AbstractC6918a0.authorised_app_detail_name);
        this.f72178d1 = (TextView) this.f72181g1.findViewById(AbstractC6918a0.authorised_app_detail_company);
        this.f72169U0 = (StencilSwitch) this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_access_profile_checkbox);
        this.f72171W0 = (StencilSwitch) this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_send_message_checkbox);
        this.f72173Y0 = (StencilSwitch) this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_access_friend_list_checkbox);
        this.f72175a1 = (StencilSwitch) this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_push_feed_checkbox);
        this.f72168T0 = this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_access_profile_layout);
        this.f72170V0 = this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_send_message_layout);
        this.f72172X0 = this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_access_friend_list_layout);
        this.f72174Z0 = this.f72181g1.findViewById(AbstractC6918a0.authorization_app_permission_name_push_feed_layout);
        this.f72168T0.setOnClickListener(this);
        this.f72170V0.setOnClickListener(this);
        this.f72172X0.setOnClickListener(this);
        this.f72174Z0.setOnClickListener(this);
        this.f72169U0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AuthorisedAppDetailView.this.m78117lM(compoundButton, z11);
            }
        });
        this.f72171W0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.m0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AuthorisedAppDetailView.this.m78118mM(compoundButton, z11);
            }
        });
        this.f72173Y0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.n0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AuthorisedAppDetailView.this.m78119nM(compoundButton, z11);
            }
        });
        this.f72175a1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.o0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AuthorisedAppDetailView.this.m78120oM(compoundButton, z11);
            }
        });
        this.f72181g1.findViewById(AbstractC6918a0.authorised_app_detail_action_save_btn).setOnClickListener(this);
        TextView textView = (TextView) this.f72181g1.findViewById(AbstractC6918a0.authorised_app_detail_action_unauthen_btn);
        this.f72180f1 = textView;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        this.f72180f1.setOnClickListener(this);
        try {
            this.f72166R0 = (AuthorisedApp) this.f72421L0.m92642L3().getParcelable("extra_data");
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f72163j1, e11);
        }
        if (this.f72166R0 == null) {
            this.f72421L0.mo50035CK(0, null);
            finish();
        }
        m78122S1();
        return this.f72181g1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            this.f72421L0.mo50035CK(0, null);
            finish();
            return true;
        }
        return true;
    }

    /* renamed from: S1 */
    void m78122S1() {
        if (this.f72166R0 == null) {
            return;
        }
        this.f72168T0.setEnabled(!r0.m56626g());
        this.f72169U0.setEnabled(!this.f72166R0.m56626g());
        this.f72170V0.setEnabled(!this.f72166R0.m56632m());
        this.f72171W0.setEnabled(!this.f72166R0.m56632m());
        this.f72172X0.setEnabled(!this.f72166R0.m56625f());
        this.f72173Y0.setEnabled(!this.f72166R0.m56625f());
        this.f72174Z0.setEnabled(!this.f72166R0.m56631l());
        this.f72175a1.setEnabled(!this.f72166R0.m56631l());
        this.f72169U0.setChecked(this.f72166R0.m56628i());
        this.f72171W0.setChecked(this.f72166R0.m56630k());
        this.f72173Y0.setChecked(this.f72166R0.m56627h());
        this.f72175a1.setChecked(this.f72166R0.m56629j());
        this.f72177c1.setText(this.f72166R0.m56623d());
        this.f72178d1.setText(this.f72166R0.m56621b());
        ((C23528a) this.f72167S0.m123612r(this.f72176b1)).m123618x(this.f72166R0.m56622c(), C23278z2.m120107Y0());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.authorised_app_detail_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C8009j c8009j = this.f72179e1;
        if (c8009j != null && c8009j.m92868m()) {
            this.f72179e1.dismiss();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f72163j1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.authorization_app_permission_name_access_profile_layout) {
                AuthorisedApp authorisedApp = this.f72166R0;
                if (authorisedApp != null && !authorisedApp.m56626g()) {
                    this.f72166R0.m56637t(!r4.m56628i());
                    m78122S1();
                }
            } else if (id2 == AbstractC6918a0.authorization_app_permission_name_send_message_layout) {
                AuthorisedApp authorisedApp2 = this.f72166R0;
                if (authorisedApp2 != null && !authorisedApp2.m56632m()) {
                    this.f72166R0.m56639w(!r4.m56630k());
                    m78122S1();
                }
            } else if (id2 == AbstractC6918a0.authorization_app_permission_name_access_friend_list_layout) {
                AuthorisedApp authorisedApp3 = this.f72166R0;
                if (authorisedApp3 != null && !authorisedApp3.m56625f()) {
                    this.f72166R0.m56636q(!r4.m56627h());
                    m78122S1();
                }
            } else if (id2 == AbstractC6918a0.authorization_app_permission_name_push_feed_layout) {
                AuthorisedApp authorisedApp4 = this.f72166R0;
                if (authorisedApp4 != null && !authorisedApp4.m56631l()) {
                    this.f72166R0.m56638u(!r4.m56629j());
                    m78122S1();
                }
            } else if (id2 == AbstractC6918a0.authorised_app_detail_action_save_btn) {
                this.f72164P0.mo1525R7(this.f72166R0.m56620a(), this.f72166R0.m56624e());
            } else if (id2 == AbstractC6918a0.authorised_app_detail_action_unauthen_btn) {
                m78123qM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    void m78123qM() {
        AuthorisedApp authorisedApp = this.f72166R0;
        if (authorisedApp != null && !authorisedApp.m56633n()) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(5).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.authorised_app_detail_unauthorize_warning_message)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.p0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                        AuthorisedAppDetailView.this.m78121pM(interfaceC17463d, i11);
                    }
                });
                C8009j c8009j = this.f72179e1;
                if (c8009j != null && c8009j.m92868m()) {
                    this.f72179e1.dismiss();
                }
                C8009j m43152a = aVar.m43152a();
                this.f72179e1 = m43152a;
                m43152a.mo13822K();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f72163j1, e11);
            }
        }
    }
}

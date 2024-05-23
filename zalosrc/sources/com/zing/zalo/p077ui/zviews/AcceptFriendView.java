package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView;
import com.zing.zalo.p077ui.zviews.AcceptFriendView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23006a0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23216t1;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.C21912a;
import p304ks.C21927m;
import p304ks.C21933s;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p716zh.C32006l8;
import t00.C26446c;
import y60.C30802d;

/* loaded from: classes6.dex */
public class AcceptFriendView extends SlidableZaloView implements ZaloView.InterfaceC17417b, View.OnClickListener, CustomRelativeLayout.InterfaceC13484a, InterfaceC0733x, C23744a.c {

    /* renamed from: P0 */
    private ContactProfile f72068P0;

    /* renamed from: Q0 */
    StencilSwitch f72069Q0;

    /* renamed from: R0 */
    CustomRelativeLayout f72070R0;

    /* renamed from: S0 */
    ScrollView f72071S0;

    /* renamed from: T0 */
    View f72072T0;

    /* renamed from: U0 */
    AutoMeasureTextView f72073U0;

    /* renamed from: V0 */
    TextView f72074V0;

    /* renamed from: W0 */
    TextView f72075W0;

    /* renamed from: X0 */
    TextView f72076X0;

    /* renamed from: Y0 */
    GroupAvatarView f72077Y0;

    /* renamed from: Z0 */
    MultiStateView f72078Z0;

    /* renamed from: a1 */
    View f72079a1;

    /* renamed from: b1 */
    View f72080b1;

    /* renamed from: c1 */
    private int f72081c1 = 0;

    /* renamed from: d1 */
    private int f72082d1 = 1;

    /* renamed from: e1 */
    private boolean f72083e1 = false;

    /* renamed from: f1 */
    private boolean f72084f1 = false;

    /* renamed from: g1 */
    private boolean f72085g1 = false;

    /* renamed from: h1 */
    Runnable f72086h1 = new RunnableC14019a();

    /* renamed from: i1 */
    boolean f72087i1 = false;

    /* renamed from: j1 */
    boolean f72088j1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.AcceptFriendView$a */
    /* loaded from: classes6.dex */
    class RunnableC14019a implements Runnable {
        RunnableC14019a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AcceptFriendView acceptFriendView = AcceptFriendView.this;
            ScrollView scrollView = acceptFriendView.f72071S0;
            if (scrollView != null) {
                scrollView.removeCallbacks(acceptFriendView.f72086h1);
                AcceptFriendView.this.f72071S0.fullScroll(130);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AcceptFriendView$b */
    /* loaded from: classes6.dex */
    public class C14020b implements AutoMeasureTextView.InterfaceC13795a {
        C14020b() {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: a */
        public void mo43324a(CharSequence charSequence) {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: b */
        public void mo43325b() {
            if (AcceptFriendView.this.f72068P0 != null) {
                AcceptFriendView.this.f72421L0.m92676n2().mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(AcceptFriendView.this.f72068P0.f42434r, AcceptFriendView.this.f72068P0.f42437s, 707, new SensitiveData("phonebook_update_alias_on_accept_friend", "phonebook_update")), 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AcceptFriendView$c */
    /* loaded from: classes6.dex */
    public class C14021c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72091a;

        C14021c(String str) {
            this.f72091a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m77989e(C32006l8 c32006l8) {
            try {
                if (AcceptFriendView.this.f72081c1 != 0) {
                    AcceptFriendView.this.f72068P0 = c32006l8.m154300a();
                    AcceptFriendView.this.m77984vM(0);
                } else {
                    AcceptFriendView.this.m77986xM(c32006l8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m77990f() {
            if (AcceptFriendView.this.f72081c1 != 0) {
                AcceptFriendView.this.m77984vM(1);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (AcceptFriendView.this.f72421L0.m92676n2() != null) {
                AcceptFriendView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AcceptFriendView.C14021c.this.m77990f();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final C32006l8 c32006l8 = new C32006l8((JSONObject) obj);
            c32006l8.f147278e = this.f72091a;
            if (AcceptFriendView.this.f72421L0.m92676n2() != null) {
                AcceptFriendView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AcceptFriendView.C14021c.this.m77989e(c32006l8);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AcceptFriendView$d */
    /* loaded from: classes6.dex */
    public class C14022d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f72093a;

        /* renamed from: b */
        final /* synthetic */ String f72094b;

        C14022d(boolean z11, String str) {
            this.f72093a = z11;
            this.f72094b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m77993e(String str) {
            AcceptFriendView.this.m77979mM(str, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m77994f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (!AbstractC23216t1.m119643h(AcceptFriendView.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.zviews.e
                        @Override // me0.AbstractC23216t1.d
                        /* renamed from: a */
                        public final void mo68088a(String str) {
                            AcceptFriendView.C14022d.m77994f(str);
                        }
                    })) {
                        if (c20096c.m104491c() == 50001) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_option_update_error));
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AcceptFriendView acceptFriendView = AcceptFriendView.this;
                acceptFriendView.f72087i1 = false;
                acceptFriendView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                AcceptFriendView acceptFriendView2 = AcceptFriendView.this;
                acceptFriendView2.f72087i1 = false;
                acceptFriendView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Handler handler;
            Runnable runnable;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (!jSONObject2.isNull("code")) {
                            int i11 = jSONObject2.getInt("code");
                            if (i11 == 0) {
                                if (this.f72093a) {
                                    C21912a.m114159g().m114162b(AcceptFriendView.this.f72068P0);
                                } else {
                                    C21912a.m114159g().m114172n(AcceptFriendView.this.f72068P0);
                                }
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_option_updated));
                            } else if (!AbstractC23216t1.m119641f(AcceptFriendView.this.f72421L0, i11, true)) {
                                ToastUtils.m89259g(i11);
                            }
                        }
                    }
                    AcceptFriendView acceptFriendView = AcceptFriendView.this;
                    acceptFriendView.f72087i1 = false;
                    acceptFriendView.f72421L0.mo78960q3();
                    handler = AcceptFriendView.this.f72827B0;
                    final String str = this.f72094b;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            AcceptFriendView.C14022d.this.m77993e(str);
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AcceptFriendView acceptFriendView2 = AcceptFriendView.this;
                    acceptFriendView2.f72087i1 = false;
                    acceptFriendView2.f72421L0.mo78960q3();
                    handler = AcceptFriendView.this.f72827B0;
                    final String str2 = this.f72094b;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            AcceptFriendView.C14022d.this.m77993e(str2);
                        }
                    };
                }
                handler.post(runnable);
            } catch (Throwable th2) {
                AcceptFriendView acceptFriendView3 = AcceptFriendView.this;
                acceptFriendView3.f72087i1 = false;
                acceptFriendView3.f72421L0.mo78960q3();
                Handler handler2 = AcceptFriendView.this.f72827B0;
                final String str3 = this.f72094b;
                handler2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        AcceptFriendView.C14022d.this.m77993e(str3);
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AcceptFriendView$e */
    /* loaded from: classes6.dex */
    public class C14023e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f72096a;

        /* renamed from: b */
        final /* synthetic */ boolean f72097b;

        C14023e(String str, boolean z11) {
            this.f72096a = str;
            this.f72097b = z11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m77996d(String str) {
            AcceptFriendView.this.m77979mM(str, true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r3v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestFail));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                AcceptFriendView acceptFriendView = AcceptFriendView.this;
                acceptFriendView.f72088j1 = z11;
                acceptFriendView.f72421L0.mo78960q3();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Handler handler;
            Runnable runnable;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (!jSONObject2.isNull("code")) {
                            int i11 = jSONObject2.getInt("code");
                            if (i11 == 0) {
                                AbstractC23059e9.m118317F(this.f72096a);
                                C21927m.m114302u().m114337i(this.f72096a);
                                AbstractC23063f2.m118365q(this.f72096a);
                                C21933s.m114404I().m114421H0(this.f72096a);
                                if (this.f72097b) {
                                    C21912a.m114159g().m114162b(AcceptFriendView.this.f72068P0);
                                } else {
                                    C21912a.m114159g().m114172n(AcceptFriendView.this.f72068P0);
                                }
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_acceptFriendRequestSuccess));
                                C21933s.m114404I().m114454a(this.f72096a);
                                AbstractC23074g2.m118375a(0, this.f72096a, "", 4);
                            } else if (!AbstractC23216t1.m119641f(AcceptFriendView.this.f72421L0, i11, true)) {
                                ToastUtils.m89259g(i11);
                            }
                        }
                    }
                    AcceptFriendView acceptFriendView = AcceptFriendView.this;
                    acceptFriendView.f72088j1 = false;
                    acceptFriendView.f72421L0.mo78960q3();
                    handler = AcceptFriendView.this.f72827B0;
                    final String str = this.f72096a;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AcceptFriendView.C14023e.this.m77996d(str);
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    AcceptFriendView acceptFriendView2 = AcceptFriendView.this;
                    acceptFriendView2.f72088j1 = false;
                    acceptFriendView2.f72421L0.mo78960q3();
                    handler = AcceptFriendView.this.f72827B0;
                    final String str2 = this.f72096a;
                    runnable = new Runnable() { // from class: com.zing.zalo.ui.zviews.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AcceptFriendView.C14023e.this.m77996d(str2);
                        }
                    };
                }
                handler.post(runnable);
            } catch (Throwable th2) {
                AcceptFriendView acceptFriendView3 = AcceptFriendView.this;
                acceptFriendView3.f72088j1 = false;
                acceptFriendView3.f72421L0.mo78960q3();
                Handler handler2 = AcceptFriendView.this.f72827B0;
                final String str3 = this.f72096a;
                handler2.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        AcceptFriendView.C14023e.this.m77996d(str3);
                    }
                });
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m77974qM() {
        try {
            m77977uM(true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static /* synthetic */ void m77975rM(CompoundButton compoundButton, boolean z11) {
        String str;
        if (z11) {
            str = "39103";
        } else {
            str = "39104";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: sM */
    private void m77976sM() {
        int i11;
        try {
            String str = this.f72068P0.f42434r;
            ContactProfile m118353e = AbstractC23063f2.m118353e(str);
            if (m118353e != null) {
                if (TextUtils.isEmpty(this.f72068P0.m40378N()) && !TextUtils.isEmpty(m118353e.m40378N())) {
                    this.f72068P0.m40401d1(m118353e.m40378N());
                }
                ContactProfile contactProfile = this.f72068P0;
                if (contactProfile.f42373R0 <= 0 && (i11 = m118353e.f42373R0) > 0) {
                    contactProfile.f42373R0 = i11;
                }
            }
            m77977uM(true);
            TextView textView = this.f72075W0;
            ContactProfile contactProfile2 = this.f72068P0;
            textView.setText(AbstractC23059e9.m118339r(2, contactProfile2.f42373R0, contactProfile2.f42455y));
            ContactProfile contactProfile3 = this.f72068P0;
            if (m77981oM(contactProfile3.f42434r, contactProfile3.f42373R0)) {
                this.f72072T0.setVisibility(0);
            } else {
                this.f72072T0.setVisibility(8);
            }
            if (this.f72082d1 == 2) {
                this.f72076X0.setVisibility(8);
                this.f72079a1.setVisibility(8);
                this.f72080b1.setVisibility(8);
            } else {
                if (TextUtils.isEmpty(this.f72068P0.m40378N())) {
                    this.f72076X0.setVisibility(8);
                } else {
                    this.f72076X0.setVisibility(0);
                    this.f72076X0.setText(this.f72068P0.m40378N());
                }
                this.f72079a1.setVisibility(0);
                this.f72080b1.setVisibility(0);
            }
            this.f72069Q0.setChecked(C21912a.m114159g().m114169j(str));
            this.f72077Y0.m75731c(this.f72068P0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    private void m77977uM(boolean z11) {
        if (this.f72081c1 == 0) {
            if (z11 || this.f72085g1) {
                this.f72085g1 = false;
                String m40383Q = this.f72068P0.m40383Q(true, false);
                if (m40383Q.equals(this.f72068P0.mo2475c())) {
                    this.f72073U0.setText(m40383Q);
                    this.f72074V0.setVisibility(8);
                } else {
                    this.f72073U0.setText(m40383Q);
                    this.f72074V0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zalo_name_title), this.f72068P0.mo2475c()));
                    this.f72074V0.setVisibility(0);
                }
                if (this.f72082d1 == 2) {
                    this.f72074V0.setVisibility(0);
                    this.f72074V0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_option_already_friend));
                }
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.accept_friend_view, viewGroup, false);
        m77982pM(inflate);
        AbstractC23647d.m123897g("39100");
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
    /* renamed from: Og */
    public void mo75644Og(int i11, int i12) {
        if (this.f72071S0 != null && this.f72421L0.m92676n2().mo35576n3()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f72071S0.getLayoutParams();
            layoutParams.bottomMargin = 0;
            this.f72071S0.setLayoutParams(layoutParams);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            this.f72083e1 = true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        C23744a.m124114c().m124117e(this, 6075);
        this.f72085g1 = true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (this.f72082d1 == 2) {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_friend_request_option));
                } else {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_friend_request));
                }
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        if (!this.f72084f1) {
            if (this.f72083e1) {
                AbstractC23647d.m123897g("39105");
            } else {
                AbstractC23647d.m123897g("39106");
            }
        }
        super.finish();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AcceptFriendView";
    }

    /* renamed from: lM */
    public void m77978lM(String str, boolean z11) {
        if (this.f72088j1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f72088j1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14023e(str, z11));
        c0766k.mo1711p7(str, z11, false, "");
    }

    /* renamed from: mM */
    void m77979mM(String str, boolean z11) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putBoolean("result.accept_friend", z11);
        bundle.putString("result.accept_friend_uid", str);
        intent.putExtras(bundle);
        mo50035CK(-1, intent);
        this.f72084f1 = true;
        finish();
    }

    @Override // com.zing.zalo.p077ui.widget.CustomRelativeLayout.InterfaceC13484a
    /* renamed from: n8 */
    public void mo75645n8(int i11, int i12) {
        if (this.f72071S0 != null) {
            if (this.f72421L0.m92676n2().mo35576n3()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f72071S0.getLayoutParams();
                layoutParams.bottomMargin = i11;
                this.f72071S0.setLayoutParams(layoutParams);
            }
            this.f72071S0.post(this.f72086h1);
        }
    }

    /* renamed from: nM */
    public void m77980nM(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                m77984vM(1);
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14021c(str));
            c0766k.mo1587Z5(str, AbstractC23006a0.m117905e(), C21927m.m114302u().m114307E(str), true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x002d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0030. Please report as an issue. */
    /* renamed from: oM */
    boolean m77981oM(String str, int i11) {
        if (i11 != -1 && i11 != 25 && i11 != 44) {
            if (i11 != 47) {
                if (i11 != 51 && i11 != 80) {
                    if (i11 != 90) {
                        if (i11 != 92) {
                            if (i11 != 342 && i11 != 20) {
                                if (i11 != 21) {
                                    switch (i11) {
                                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                            break;
                                        case 31:
                                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                            break;
                                        default:
                                            switch (i11) {
                                                case 40:
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                                                    break;
                                                case 42:
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 83:
                                                        case 84:
                                                            break;
                                                        case 85:
                                                        case 86:
                                                            break;
                                                        default:
                                                            if (!C26446c.m136326b().m136331f() || !C21933s.m114404I().m114492t0(str)) {
                                                                return false;
                                                            }
                                                            return true;
                                                    }
                                            }
                                    }
                                }
                            }
                        }
                    } else {
                        return C26446c.m136326b().m136331f();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.btnAccept) {
                AbstractC23647d.m123897g("39102");
                if (this.f72082d1 == 2) {
                    m77985wM(this.f72068P0.f42434r, this.f72069Q0.isChecked());
                } else {
                    m77978lM(this.f72068P0.f42434r, this.f72069Q0.isChecked());
                }
            } else if (id2 == AbstractC6918a0.btnSetting) {
                AbstractC23647d.m123897g("39101");
                this.f72421L0.m92662fJ().m93069k2(SettingManageSourceFriendView.class, null, 1, true);
            } else if (id2 == AbstractC6918a0.btn_refresh) {
                m77983tM();
            } else if (id2 == AbstractC6918a0.ll_allow_view_social) {
                this.f72069Q0.setChecked(!r4.isChecked());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            m77977uM(false);
            C23744a.m124114c().m124115b(this, 6075);
            if (this.f72421L0.m92676n2() instanceof ZaloActivity) {
                this.f72421L0.m92676n2().mo35554O(18);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: pM */
    void m77982pM(View view) {
        try {
            Bundle m92642L3 = m92642L3();
            this.f72068P0 = new ContactProfile(new JSONObject(m92642L3.getString("data")));
            String string = m92642L3.getString("message", "");
            if (TextUtils.isEmpty(string)) {
                string = AbstractC23063f2.m118356h(this.f72068P0.f42434r);
            }
            if (m92642L3.containsKey("accept_mode")) {
                this.f72082d1 = m92642L3.getInt("accept_mode", 1);
            } else {
                this.f72082d1 = 1;
            }
            this.f72068P0.m40401d1(string);
            this.f72070R0 = (CustomRelativeLayout) view.findViewById(AbstractC6918a0.ll_swipeable_view);
            AutoMeasureTextView autoMeasureTextView = (AutoMeasureTextView) view.findViewById(AbstractC6918a0.tvName);
            this.f72073U0 = autoMeasureTextView;
            autoMeasureTextView.setDrawableSize(AbstractC23222t7.f112514B);
            this.f72073U0.setDrawableMarginLeft(AbstractC23222t7.f112566j);
            this.f72073U0.setClickListener(new C14020b());
            this.f72074V0 = (TextView) view.findViewById(AbstractC6918a0.tvNameZalo);
            this.f72075W0 = (TextView) view.findViewById(AbstractC6918a0.tvSrc);
            this.f72076X0 = (TextView) view.findViewById(AbstractC6918a0.tvMessage);
            this.f72077Y0 = (GroupAvatarView) view.findViewById(AbstractC6918a0.avatar);
            this.f72072T0 = view.findViewById(AbstractC6918a0.btnSetting);
            this.f72069Q0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_view_social);
            this.f72071S0 = (ScrollView) view.findViewById(AbstractC6918a0.scroll_container_view);
            view.findViewById(AbstractC6918a0.btnAccept).setOnClickListener(this);
            C30802d c30802d = new C30802d(AbstractC23136l9.m118742r(30.0f), AbstractC23136l9.m118742r(0.5f), C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
            c30802d.m149869b(C23212s8.m119607o(view.getContext(), AbstractC16781w.PopupBackgroundColor));
            c30802d.m149868a(true);
            AbstractC23136l9.m118696b1(this.f72076X0, c30802d);
            this.f72078Z0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
            this.f72079a1 = view.findViewById(AbstractC6918a0.split_source);
            this.f72080b1 = view.findViewById(AbstractC6918a0.source_container);
            View errorView = this.f72078Z0.getErrorView();
            if (errorView != null) {
                errorView.findViewById(AbstractC6918a0.btn_refresh).setOnClickListener(this);
                errorView.setVisibility(8);
            }
            this.f72069Q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.zviews.a
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    AcceptFriendView.m77975rM(compoundButton, z11);
                }
            });
            AbstractC23136l9.m118726l1(getContext(), this.f72072T0);
            this.f72072T0.setOnClickListener(this);
            view.findViewById(AbstractC6918a0.ll_allow_view_social).setOnClickListener(this);
            this.f72070R0.setLayoutChangeListener(this);
            m77984vM(-1);
            m77983tM();
            this.f72072T0.requestFocus();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    void m77983tM() {
        if (!TextUtils.isEmpty(this.f72068P0.f42437s) && !TextUtils.isEmpty(this.f72068P0.f42446v)) {
            m77984vM(0);
        } else {
            m77984vM(-1);
        }
        m77980nM(this.f72068P0.f42434r);
    }

    /* renamed from: vM */
    void m77984vM(int i11) {
        this.f72081c1 = i11;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f72078Z0.setState(MultiStateView.EnumC15914e.ERROR);
                    this.f72078Z0.setVisibility(0);
                    this.f72071S0.setVisibility(8);
                    return;
                }
                return;
            }
            m77976sM();
            this.f72071S0.setVisibility(0);
            this.f72078Z0.setVisibility(8);
            this.f72078Z0.setState(MultiStateView.EnumC15914e.CONTENT);
            return;
        }
        this.f72078Z0.setState(MultiStateView.EnumC15914e.LOADING);
        this.f72078Z0.setVisibility(0);
        this.f72071S0.setVisibility(8);
    }

    /* renamed from: wM */
    public void m77985wM(String str, boolean z11) {
        if (this.f72087i1) {
            return;
        }
        this.f72087i1 = true;
        if (z11 == C21912a.m114159g().m114169j(str)) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_view_accept_option_updated));
            this.f72087i1 = false;
            m77979mM(str, true);
        } else {
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14022d(z11, str));
            c0766k.mo1424F3(str, z11, false, "");
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6075) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.b
                @Override // java.lang.Runnable
                public final void run() {
                    AcceptFriendView.this.m77974qM();
                }
            });
        }
    }

    /* renamed from: xM */
    void m77986xM(C32006l8 c32006l8) {
        if (c32006l8 == null) {
            return;
        }
        try {
            int i11 = c32006l8.f147287n;
            if (i11 >= 0) {
                this.f72068P0.f42373R0 = i11;
            }
            if (TextUtils.isEmpty(this.f72068P0.f42455y) && !TextUtils.isEmpty(c32006l8.f147275b)) {
                this.f72068P0.f42455y = c32006l8.f147275b;
            }
            TextView textView = this.f72075W0;
            ContactProfile contactProfile = this.f72068P0;
            textView.setText(AbstractC23059e9.m118339r(2, contactProfile.f42373R0, contactProfile.f42455y));
            ContactProfile contactProfile2 = this.f72068P0;
            if (m77981oM(contactProfile2.f42434r, contactProfile2.f42373R0)) {
                this.f72072T0.setVisibility(0);
            } else {
                this.f72072T0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

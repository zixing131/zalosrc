package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import am.AbstractC0906d0;
import am.C0943w;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;
import au.AbstractC2347g;
import au.AbstractC2364o0;
import au.AbstractC2379w;
import au.C2343e;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.alias.ChangeAliasBottomSheetView;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView;
import com.zing.zalo.p077ui.zviews.WriteInvitationView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23028c0;
import me0.AbstractC23063f2;
import me0.AbstractC23074g2;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23216t1;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.C21912a;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p354n3.C23528a;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p716zh.C31973j5;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class WriteInvitationView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, View.OnTouchListener, InterfaceC0733x, C23744a.c {

    /* renamed from: p1 */
    static final String f79484p1 = "WriteInvitationView";

    /* renamed from: P0 */
    TextView f79485P0;

    /* renamed from: Q0 */
    CustomEditText f79486Q0;

    /* renamed from: R0 */
    TextView f79487R0;

    /* renamed from: S0 */
    AvatarImageView f79488S0;

    /* renamed from: T0 */
    AutoMeasureTextView f79489T0;

    /* renamed from: U0 */
    View f79490U0;

    /* renamed from: V0 */
    StencilSwitch f79491V0;

    /* renamed from: W0 */
    View f79492W0;

    /* renamed from: X0 */
    ScrollView f79493X0;

    /* renamed from: i1 */
    private ContactProfile f79504i1;

    /* renamed from: m1 */
    String f79508m1;

    /* renamed from: Y0 */
    private String f79494Y0 = "";

    /* renamed from: Z0 */
    private String f79495Z0 = "";

    /* renamed from: a1 */
    private String f79496a1 = "";

    /* renamed from: b1 */
    private String f79497b1 = "";

    /* renamed from: c1 */
    private int f79498c1 = 0;

    /* renamed from: d1 */
    private String f79499d1 = "";

    /* renamed from: e1 */
    private final Handler f79500e1 = new Handler();

    /* renamed from: f1 */
    private int f79501f1 = -1;

    /* renamed from: g1 */
    private String f79502g1 = "";

    /* renamed from: h1 */
    private boolean f79503h1 = false;

    /* renamed from: j1 */
    boolean f79505j1 = false;

    /* renamed from: k1 */
    InterfaceC0765j f79506k1 = new C0766k();

    /* renamed from: l1 */
    InterfaceC20094a f79507l1 = new C15376b();

    /* renamed from: n1 */
    boolean f79509n1 = false;

    /* renamed from: o1 */
    TextWatcher f79510o1 = new C15377c();

    /* renamed from: com.zing.zalo.ui.zviews.WriteInvitationView$a */
    /* loaded from: classes6.dex */
    public class C15375a implements AutoMeasureTextView.InterfaceC13795a {
        C15375a() {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: a */
        public void mo43324a(CharSequence charSequence) {
        }

        @Override // com.zing.zalo.p077ui.widget.textview.AutoMeasureTextView.InterfaceC13795a
        /* renamed from: b */
        public void mo43325b() {
            if (WriteInvitationView.this.f79504i1 != null) {
                WriteInvitationView.this.f72421L0.m92676n2().mo35573l4(FrameLayoutKeepBtmSheetZaloView.class, ChangeAliasBottomSheetView.m37078GM(WriteInvitationView.this.f79504i1.f42434r, WriteInvitationView.this.f79504i1.f42437s, 706, new SensitiveData("phonebook_update_alias_on_add_friend", "phonebook_update")), 1, true);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WriteInvitationView$b */
    /* loaded from: classes6.dex */
    public class C15376b implements InterfaceC20094a {
        C15376b() {
        }

        /* renamed from: i */
        public /* synthetic */ void m86892i() {
            WriteInvitationView.this.f72421L0.mo50035CK(-1, new Intent());
            WriteInvitationView.this.f72421L0.finish();
        }

        /* renamed from: j */
        public /* synthetic */ void m86893j() {
            if (WriteInvitationView.this.f72421L0.m92681pJ()) {
                return;
            }
            if (!AbstractC0906d0.m2796b(WriteInvitationView.this.f72421L0.m92648SI().getApplicationContext(), WriteInvitationView.this.f79495Z0)) {
                WriteInvitationView.this.f72421L0.showDialog(1);
                WriteInvitationView.this.f79503h1 = false;
            } else {
                WriteInvitationView.this.f79500e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.o51
                    public /* synthetic */ o51() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WriteInvitationView.C15376b.this.m86892i();
                    }
                }, 500L);
            }
        }

        /* renamed from: k */
        public /* synthetic */ void m86894k() {
            WriteInvitationView.this.f72421L0.mo50035CK(-1, new Intent());
            WriteInvitationView.this.f72421L0.finish();
        }

        /* renamed from: l */
        public /* synthetic */ void m86895l() {
            WriteInvitationView.this.finish();
        }

        /* renamed from: m */
        public /* synthetic */ void m86896m() {
            WriteInvitationView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.n51
                public /* synthetic */ n51() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WriteInvitationView.C15376b.this.m86895l();
                }
            });
        }

        /* renamed from: n */
        public /* synthetic */ void m86897n() {
            TextView textView = WriteInvitationView.this.f79485P0;
            if (textView != null) {
                textView.setEnabled(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            WriteInvitationView writeInvitationView = WriteInvitationView.this;
            writeInvitationView.f79505j1 = false;
            writeInvitationView.m86881CM(false);
            if (WriteInvitationView.this.f72421L0.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestFail));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    WriteInvitationView.this.m86881CM(false);
                    JSONObject jSONObject = (JSONObject) obj;
                    new JSONObject();
                    if (!jSONObject.isNull("data")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        if (!jSONObject2.isNull("code")) {
                            int i11 = jSONObject2.getInt("code");
                            if (i11 == 0) {
                                if (WriteInvitationView.this.f72421L0.m92672lJ()) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_sendFriendRequestSuccessNew));
                                }
                                if (WriteInvitationView.this.f79509n1) {
                                    C21912a.m114159g().m114162b(WriteInvitationView.this.f79504i1);
                                } else {
                                    C21912a.m114159g().m114172n(WriteInvitationView.this.f79504i1);
                                }
                                C21933s.m114404I().m114438Q0(WriteInvitationView.this.f79508m1);
                                AbstractC23074g2.m118375a(0, WriteInvitationView.this.f79508m1, "", 8);
                                AbstractC23063f2.m118349a(WriteInvitationView.this.f79504i1);
                                if (WriteInvitationView.this.f79503h1 && WriteInvitationView.this.f79501f1 == 40 && !TextUtils.isEmpty(WriteInvitationView.this.f79495Z0) && !TextUtils.isEmpty(WriteInvitationView.this.f79496a1)) {
                                    WriteInvitationView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j51
                                        public /* synthetic */ j51() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WriteInvitationView.C15376b.this.m86893j();
                                        }
                                    });
                                } else {
                                    WriteInvitationView.this.f79500e1.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.k51
                                        public /* synthetic */ k51() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WriteInvitationView.C15376b.this.m86894k();
                                        }
                                    }, 500L);
                                }
                            } else {
                                if (i11 == -4) {
                                    AbstractC23063f2.m118358j(i11, WriteInvitationView.this.f79504i1.f42434r, new Runnable() { // from class: com.zing.zalo.ui.zviews.l51
                                        public /* synthetic */ l51() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WriteInvitationView.C15376b.this.m86896m();
                                        }
                                    });
                                    WriteInvitationView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.m51
                                        public /* synthetic */ m51() {
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            WriteInvitationView.C15376b.this.m86897n();
                                        }
                                    });
                                }
                                if (i11 != -40 && i11 != -41 && i11 != -42 && i11 != -43 && i11 != -44) {
                                    if (!AbstractC23216t1.m119641f(WriteInvitationView.this.f72421L0, i11, false)) {
                                        ToastUtils.m89259g(i11);
                                    }
                                }
                                WriteInvitationView.this.f79499d1 = AbstractC23161o1.m119317b(i11);
                                AbstractC2364o0.m12373p(WriteInvitationView.this, 100);
                            }
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                WriteInvitationView.this.f79505j1 = false;
            } catch (Throwable th2) {
                WriteInvitationView.this.f79505j1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WriteInvitationView$c */
    /* loaded from: classes6.dex */
    class C15377c extends AbstractC18391a {
        C15377c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11;
            WriteInvitationView writeInvitationView = WriteInvitationView.this;
            View view = writeInvitationView.f79492W0;
            if (writeInvitationView.f79486Q0.length() > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            WriteInvitationView writeInvitationView2 = WriteInvitationView.this;
            writeInvitationView2.f79487R0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_character_invitation, Integer.valueOf(writeInvitationView2.f79486Q0.getText().length()), 150));
            if (editable.length() >= 150) {
                ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.str_error_invitationoutoflength, 150));
            }
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            try {
                super.onTextChanged(charSequence, i11, i12, i13);
                String charSequence2 = charSequence.toString();
                if (charSequence.length() > 150) {
                    WriteInvitationView.this.f79486Q0.setText(charSequence2.substring(0, 150));
                    WriteInvitationView.this.f79486Q0.setSelection(150);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: AM */
    public /* synthetic */ void m86862AM(String str, String str2, boolean z11) {
        this.f79506k1.mo1704o8(this.f79507l1);
        int i11 = this.f79501f1;
        if (i11 == -1 || i11 == 30 || i11 == 10) {
            String m42229P6 = C7960e.m41971c6().m42229P6(str);
            if (!TextUtils.isEmpty(m42229P6)) {
                try {
                    this.f79501f1 = new JSONObject(m42229P6).optInt("srcType", this.f79501f1);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
        this.f79506k1.mo1738sa(str, this.f79501f1, str2, this.f79502g1, z11, false, "");
    }

    /* renamed from: BM */
    private void m86863BM() {
        ContactProfile contactProfile;
        AutoMeasureTextView autoMeasureTextView = this.f79489T0;
        if (autoMeasureTextView != null && (contactProfile = this.f79504i1) != null) {
            autoMeasureTextView.setText(contactProfile.m40383Q(true, false));
        }
    }

    /* renamed from: wM */
    public /* synthetic */ void m86877wM() {
        try {
            m86863BM();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: xM */
    public /* synthetic */ void m86878xM(View view, boolean z11) {
        int i11;
        View view2 = this.f79492W0;
        if (this.f79486Q0.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view2.setVisibility(i11);
    }

    /* renamed from: yM */
    public /* synthetic */ void m86879yM() {
        CustomEditText customEditText = this.f79486Q0;
        if (customEditText != null) {
            AbstractC2379w.m12432f(customEditText);
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m86880zM(boolean z11) {
        ActionBarMenu actionBarMenu = this.f88763d0;
        if (actionBarMenu != null) {
            actionBarMenu.m92750r();
            if (z11) {
                this.f88763d0.m92744k(0, AbstractC7409c0.holo_circular_progress_bar_abs);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        String str3;
        int i11;
        ContactProfile m141811g;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        AbstractC23304d.f113385g = true;
        if (m92642L3 != null) {
            String str4 = "";
            if (!m92642L3.containsKey("uid")) {
                str = "";
            } else {
                str = m92642L3.getString("uid");
            }
            this.f79494Y0 = str;
            if (!m92642L3.containsKey("phone")) {
                str2 = "";
            } else {
                str2 = m92642L3.getString("phone");
            }
            this.f79495Z0 = str2;
            if (!m92642L3.containsKey("dpn")) {
                str3 = "";
            } else {
                str3 = m92642L3.getString("dpn");
            }
            this.f79496a1 = str3;
            if (m92642L3.containsKey("avatar")) {
                str4 = m92642L3.getString("avatar");
            }
            this.f79497b1 = str4;
            if (m92642L3.containsKey("inviteFrom")) {
                i11 = m92642L3.getInt("inviteFrom");
            } else {
                i11 = 0;
            }
            this.f79498c1 = i11;
            if (i11 == 4) {
                AbstractC23775p0.m124197b("suggest_profile_from_phone_number");
            }
            if (TextUtils.isEmpty(this.f79495Z0) && (m141811g = C28203u6.f131407a.m141811g(this.f79494Y0)) != null && !TextUtils.isEmpty(m141811g.f42455y)) {
                this.f79495Z0 = m141811g.f42455y;
            }
            ContactProfile contactProfile = new ContactProfile(this.f79494Y0);
            this.f79504i1 = contactProfile;
            contactProfile.f42455y = this.f79495Z0;
            contactProfile.f42437s = this.f79496a1;
            contactProfile.f42446v = this.f79497b1;
        }
    }

    /* renamed from: CM */
    void m86881CM(boolean z11) {
        if (this.f88763d0 != null && this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h51

                /* renamed from: q */
                public final /* synthetic */ boolean f80551q;

                public /* synthetic */ h51(boolean z112) {
                    r2 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WriteInvitationView.this.m86880zM(r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 100) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(5).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_send_friend_request_error)).m43162k(this.f79499d1).m43164m(AbstractC8020f0.str_tv_sendmes, this).m43169r(AbstractC8020f0.str_btn_dialog_send_friend_request_error, new InterfaceC17463d.b());
            return aVar.m43152a();
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        aVar2.m43171t(AbstractC8020f0.str_titleDlg9).m43159h(4);
        aVar2.m43161j(AbstractC8020f0.phone_contact_add_number_dialog_message);
        aVar2.m43164m(AbstractC8020f0.str_no, this);
        aVar2.m43169r(AbstractC8020f0.str_yes, this);
        return aVar2.m43152a();
    }

    /* renamed from: DM */
    public void m86882DM(String str, String str2, boolean z11) {
        if (this.f79505j1) {
            return;
        }
        this.f79505j1 = true;
        m86881CM(true);
        this.f79508m1 = str;
        this.f79509n1 = z11;
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.e51

            /* renamed from: q */
            public final /* synthetic */ String f80213q;

            /* renamed from: r */
            public final /* synthetic */ String f80214r;

            /* renamed from: s */
            public final /* synthetic */ boolean f80215s;

            public /* synthetic */ e51(String str3, String str22, boolean z112) {
                r2 = str3;
                r3 = str22;
                r4 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WriteInvitationView.this.m86862AM(r2, r3, r4);
            }
        });
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.write_invitation_view, viewGroup, false);
        try {
            m86885vM(inflate);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f == 100 && i11 == -2) {
                    interfaceC17463d.dismiss();
                    if (!TextUtils.isEmpty(this.f79494Y0)) {
                        ContactProfile contactProfile = new ContactProfile(this.f79494Y0);
                        contactProfile.f42446v = this.f79497b1;
                        contactProfile.f42455y = this.f79495Z0;
                        contactProfile.f42437s = this.f79496a1;
                        contactProfile.f42437s = contactProfile.m40383Q(true, false);
                        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                        if (this.f72421L0.m92676n2() != null) {
                            this.f72421L0.m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
                        }
                    }
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                Intent intent = new Intent("android.intent.action.INSERT");
                intent.setType("vnd.android.cursor.dir/contact");
                intent.putExtra("name", this.f79496a1);
                intent.putExtra("phone", this.f79495Z0);
                this.f72421L0.m92641HK(intent);
                this.f72421L0.finish();
            } else if (i11 == -2) {
                interfaceC17463d.dismiss();
                this.f72421L0.finish();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        AbstractC23304d.f113385g = false;
        C23744a.m124114c().m124117e(this, 6075);
        AbstractC2379w.m12430d(this.f79486Q0);
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_writeInvitation));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                m92637BK(true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f79484p1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnSendInvitation) {
            String obj = this.f79486Q0.getText().toString();
            if (obj.trim().length() > 0) {
                m86882DM(this.f79494Y0, obj, this.f79491V0.isChecked());
                return;
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_mustInputTextFirst));
                return;
            }
        }
        if (id2 == AbstractC6918a0.btn_delete_invite) {
            this.f79486Q0.setText("");
            this.f79486Q0.setSelection(0);
        } else if (id2 == AbstractC6918a0.edtInvitationFriend) {
            AbstractC2379w.m12432f(this.f79486Q0);
        } else if (id2 == AbstractC6918a0.ll_allow_view_timeline || id2 == AbstractC6918a0.sw_deny_view_timeline) {
            this.f79491V0.setChecked(!r3.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        try {
            AbstractC23304d.f113385g = true;
            super.onResume();
            m86863BM();
            C23744a.m124114c().m124115b(this, 6075);
            if (this.f72421L0.m92676n2() instanceof Activity) {
                this.f72421L0.m92676n2().mo35554O(18);
            }
            CustomEditText customEditText = this.f79486Q0;
            if (customEditText != null) {
                customEditText.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.i51
                    public /* synthetic */ i51() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WriteInvitationView.this.m86879yM();
                    }
                }, 200L);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (view.getId() == AbstractC6918a0.edtInvitationFriend && view.hasFocus() && view.getParent() != null) {
                ViewParent parent = view.getParent();
                parent.requestDisallowInterceptTouchEvent(true);
                if ((motionEvent.getAction() & 255) == 8) {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:            return java.lang.String.format(me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.str_dfriendrequest_phone_number), r2);     */
    /* renamed from: tM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String m86883tM(int i11, TrackingSource trackingSource) {
        boolean z11;
        String str;
        String str2 = "";
        try {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            String str3 = contactProfile.f42437s;
            if (contactProfile.f42357M > 0.2d) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (trackingSource != null) {
                String str4 = null;
                if (i11 != 21) {
                    if (i11 != 25) {
                        if (i11 != 41) {
                            if (i11 != 47) {
                                if (i11 != 80) {
                                    if (i11 != 31) {
                                        if (i11 != 32) {
                                            if (i11 != 85) {
                                                if (i11 == 86) {
                                                    str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_uname), str3) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_uname_low);
                                                }
                                            } else {
                                                str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_phone_number), str3) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_phone_number_low);
                                            }
                                        } else {
                                            int m12315a = AbstractC2347g.m12315a(trackingSource.m40679l("shareSource"), 0);
                                            String m12317c = AbstractC2347g.m12317c(trackingSource.m40679l("uidTo"));
                                            if (m12315a == 0) {
                                                if (m12317c != null && !TextUtils.isEmpty(m12317c) && !m12317c.equals(AbstractC23304d.f113368c0.f42434r)) {
                                                    ContactProfile m141811g = C28203u6.f131407a.m141811g(m12317c);
                                                    String m12317c2 = AbstractC2347g.m12317c(trackingSource.m40679l("nameHolder"));
                                                    if (m141811g != null) {
                                                        m12317c2 = m141811g.f42437s;
                                                    }
                                                    if (!TextUtils.isEmpty(m12317c2)) {
                                                        str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_contact_card_single), str3, m12317c2) : String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_contact_card_single_low), m12317c2);
                                                    }
                                                }
                                            } else if (m12315a == 1) {
                                                C31973j5 m4473g = C0943w.m4462l().m4473g(m12317c);
                                                if (m4473g != null) {
                                                    str4 = m4473g.m153793y();
                                                }
                                                if (!TextUtils.isEmpty(str4)) {
                                                    str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_contact_card_group), str3, str4) : String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_contact_card_group_low), str4);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_people_nearby), str3) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_people_nearby_low);
                                }
                            } else {
                                str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_qrcode), str3) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_qrcode_low);
                            }
                        } else {
                            str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_friend_native), str3) : AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_friend_native_low);
                        }
                    } else {
                        String m12317c3 = AbstractC2347g.m12317c(trackingSource.m40679l("nameHolder"));
                        if (!TextUtils.isEmpty(m12317c3)) {
                            str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_room), str3, m12317c3) : String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_room_low), m12317c3);
                        }
                    }
                }
                Object m40679l = trackingSource.m40679l("groupId");
                if (m40679l != null) {
                    str = AbstractC2347g.m12317c(m40679l);
                } else {
                    str = null;
                }
                C31973j5 m4473g2 = C0943w.m4462l().m4473g(str);
                Object m40679l2 = trackingSource.m40679l("nameHolder");
                if (m40679l2 != null) {
                    str4 = AbstractC2347g.m12317c(m40679l2);
                }
                if (TextUtils.isEmpty(str4) && m4473g2 != null && !TextUtils.isEmpty(m4473g2.m153793y())) {
                    str4 = m4473g2.m153793y();
                }
                if (!TextUtils.isEmpty(str4)) {
                    str2 = z11 ? String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_group), str3, str4) : String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_group_low), str4);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                int i12 = this.f79498c1;
                if (i12 != 3 && i12 != 4) {
                    if (z11) {
                        return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_usource_contact_user_info), str3);
                    }
                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_usource_contact_user_info_low);
                }
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_dfriendrequest_phone_number_low);
            }
            return str2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return "";
        }
    }

    /* renamed from: uM */
    void m86884uM() {
        try {
            if (this.f79505j1) {
                return;
            }
            m86881CM(false);
            this.f79487R0.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_count_character_invitation, Integer.valueOf(this.f79486Q0.getText().length()), 150));
            this.f79501f1 = C21927m.m114302u().m114307E(this.f79494Y0);
            TrackingSource m114310H = C21927m.m114302u().m114310H(this.f79494Y0);
            if (m114310H != null) {
                this.f79502g1 = m114310H.m40682o();
            }
            String m86883tM = m86883tM(this.f79501f1, m114310H);
            if (!TextUtils.isEmpty(m86883tM)) {
                this.f79486Q0.setText(m86883tM);
                CustomEditText customEditText = this.f79486Q0;
                customEditText.setSelection(customEditText.length());
            }
            if (!TextUtils.isEmpty(this.f79497b1)) {
                if (C23302b.f113247a.m120523d(this.f79497b1) && !CoreUtility.f89233i.equals(this.f79494Y0)) {
                    this.f79488S0.setImageDrawable(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(this.f79496a1), C2343e.m12307a(this.f79494Y0, false)));
                } else {
                    ((C23528a) new C23528a(this.f72421L0.m92648SI()).m123612r(this.f79488S0)).m123618x(this.f79497b1, C23278z2.m120143n());
                }
            }
            try {
                this.f79486Q0.requestFocus();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f79484p1, e11);
            }
            this.f79490U0.setVisibility(0);
            this.f79491V0.setChecked(C21912a.m114159g().m114169j(this.f79494Y0));
        } catch (Exception unused) {
        }
    }

    /* renamed from: vM */
    void m86885vM(View view) {
        this.f79485P0 = (TextView) view.findViewById(AbstractC6918a0.btnSendInvitation);
        this.f79492W0 = view.findViewById(AbstractC6918a0.btn_delete_invite);
        this.f79493X0 = (ScrollView) view.findViewById(AbstractC6918a0.scroll_container);
        this.f79486Q0 = (CustomEditText) view.findViewById(AbstractC6918a0.edtInvitationFriend);
        this.f79487R0 = (TextView) view.findViewById(AbstractC6918a0.tv_character_count);
        this.f79488S0 = (AvatarImageView) view.findViewById(AbstractC6918a0.buddy_dp);
        AutoMeasureTextView autoMeasureTextView = (AutoMeasureTextView) view.findViewById(AbstractC6918a0.tvName);
        this.f79489T0 = autoMeasureTextView;
        autoMeasureTextView.setDrawableSize(AbstractC23222t7.f112514B);
        this.f79489T0.setDrawableMarginLeft(AbstractC23222t7.f112566j);
        this.f79489T0.setClickListener(new C15375a());
        this.f79490U0 = view.findViewById(AbstractC6918a0.ll_allow_view_timeline);
        this.f79491V0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_deny_view_timeline);
        this.f79485P0.setOnClickListener(this);
        this.f79492W0.setOnClickListener(this);
        this.f79490U0.setOnClickListener(this);
        this.f79491V0.setOnClickListener(this);
        this.f79486Q0.setOnClickListener(this);
        this.f79486Q0.setOnTouchListener(this);
        this.f79486Q0.setForceHideClearBtn(true);
        this.f79486Q0.addTextChangedListener(this.f79510o1);
        this.f79486Q0.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.ui.zviews.f51
            public /* synthetic */ f51() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                WriteInvitationView.this.m86878xM(view2, z11);
            }
        });
        m86884uM();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6075) {
            mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.g51
                public /* synthetic */ g51() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WriteInvitationView.this.m86877wM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle == null) {
            this.f79503h1 = true;
        }
    }
}

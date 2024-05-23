package com.zing.zalo.register;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.BaseZaloActivity;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.register.UserUpdateAvatarRegisterView;
import com.zing.zalo.register.bottomsheet.RegisterLayoutBottomSheet;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import i40.C20275e;
import is.C20834z0;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import lb.AbstractC22393f;
import lb.C22392e;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.AbstractC23238v2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import od0.InterfaceC24223a;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p140ev.C18613b;
import p248iy.AbstractC20887g;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p458qr.C25487t;
import p542ub.InterfaceC27218a;
import p649xl.C29806fe;
import pd0.C24730d;
import pd0.EnumC24734h;
import pm0.C24848g0;
import wh0.C29046a;

/* loaded from: classes4.dex */
public final class UserUpdateAvatarRegisterView extends SlidableZaloView {
    public static final C9309a Companion = new C9309a(null);

    /* renamed from: P0 */
    private C29806fe f49348P0;

    /* renamed from: R0 */
    private boolean f49350R0;

    /* renamed from: S0 */
    private boolean f49351S0;

    /* renamed from: U0 */
    private File f49353U0;

    /* renamed from: Q0 */
    private String f49349Q0 = "";

    /* renamed from: T0 */
    private int f49352T0 = -1;

    /* renamed from: V0 */
    private final C9311c f49354V0 = new C9311c();

    /* renamed from: com.zing.zalo.register.UserUpdateAvatarRegisterView$a */
    /* loaded from: classes4.dex */
    public static final class C9309a {
        private C9309a() {
        }

        public /* synthetic */ C9309a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.register.UserUpdateAvatarRegisterView$b */
    /* loaded from: classes4.dex */
    static final class C9310b extends AbstractC19075u implements InterfaceC18494a {
        C9310b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m49999a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m49999a() {
            UserUpdateAvatarRegisterView.this.m49966DM("");
        }
    }

    /* renamed from: com.zing.zalo.register.UserUpdateAvatarRegisterView$c */
    /* loaded from: classes4.dex */
    public static final class C9311c implements InterfaceC24223a {
        C9311c() {
        }

        /* renamed from: g */
        public static final void m50003g(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, Intent intent) {
            AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
            AbstractC19074t.m100208f(intent, "$intent");
            try {
                userUpdateAvatarRegisterView.m78954jL();
                String stringExtra = intent.getStringExtra("urlUploaded");
                AbstractC19074t.m100205c(stringExtra);
                userUpdateAvatarRegisterView.f49349Q0 = stringExtra;
                userUpdateAvatarRegisterView.m49976NM(userUpdateAvatarRegisterView.f49349Q0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public static final void m50004h(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView) {
            AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
            userUpdateAvatarRegisterView.m78954jL();
        }

        /* renamed from: i */
        public static final void m50005i(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, String str) {
            AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
            AbstractC19074t.m100208f(str, "$errorText");
            userUpdateAvatarRegisterView.m78954jL();
            ToastUtils.showMess(str);
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: a */
        public void mo50006a(Intent intent) {
            AbstractC19074t.m100208f(intent, "intent");
            String m121120Kd = AbstractC23309i.m121120Kd();
            if (!TextUtils.isEmpty(m121120Kd)) {
                try {
                    JSONObject jSONObject = new JSONObject(m121120Kd);
                    jSONObject.put("is_set_avatar", true);
                    AbstractC23309i.m122037iz(jSONObject.toString());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            String m121046Id = AbstractC23309i.m121046Id();
            if (!TextUtils.isEmpty(m121046Id)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(m121046Id);
                    jSONObject2.put("needUpdateInfo", 0);
                    AbstractC23309i.m121962gz(jSONObject2.toString());
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
            }
            UserUpdateAvatarRegisterView.this.f49350R0 = true;
            InterfaceC27218a m92676n2 = UserUpdateAvatarRegisterView.this.m92676n2();
            if (m92676n2 != null) {
                m92676n2.runOnUiThread(new Runnable() { // from class: cz.q2

                    /* renamed from: q */
                    public final /* synthetic */ Intent f89641q;

                    public /* synthetic */ RunnableC17653q2(Intent intent2) {
                        r2 = intent2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserUpdateAvatarRegisterView.C9311c.m50003g(UserUpdateAvatarRegisterView.this, r2);
                    }
                });
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: b */
        public void mo50007b(String str) {
            AbstractC19074t.m100208f(str, "errorText");
            try {
                AbstractC19444a.m101697e(new Runnable() { // from class: cz.p2

                    /* renamed from: q */
                    public final /* synthetic */ String f89637q;

                    public /* synthetic */ RunnableC17649p2(String str2) {
                        r2 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserUpdateAvatarRegisterView.C9311c.m50005i(UserUpdateAvatarRegisterView.this, r2);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // od0.InterfaceC24223a
        /* renamed from: c */
        public void mo50008c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                AbstractC19444a.m101697e(new Runnable() { // from class: cz.o2
                    public /* synthetic */ RunnableC17645o2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserUpdateAvatarRegisterView.C9311c.m50004h(UserUpdateAvatarRegisterView.this);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: AM */
    public static final void m49963AM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        interfaceC17463d.dismiss();
        userUpdateAvatarRegisterView.m49993uM();
        AbstractC23647d.m123897g("38557");
    }

    /* renamed from: BM */
    private final void m49964BM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_IS_SET_AVATAR", this.f49351S0);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TAG", 4);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35581q(RegisterLayoutBottomSheet.class, bundle, 4, 1, true);
        }
    }

    /* renamed from: CM */
    private final void m49965CM() {
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67701oN();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putBoolean("EXTRA_REQUESTED_CONTACT_PERMISSION_REGISTER", true);
        bundle.putInt("SHOW_WITH_FLAGS", 50331648);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(MainTabView.class, bundle, 1, true);
        }
    }

    /* renamed from: DM */
    public final void m49966DM(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f49349Q0 = str;
                m49969GM(str);
                C29806fe c29806fe = this.f49348P0;
                if (c29806fe == null) {
                    AbstractC19074t.m100223u("binding");
                    c29806fe = null;
                }
                c29806fe.f137800q.m90479n(this.f49349Q0);
                this.f49351S0 = true;
                AbstractC19444a.m101697e(new Runnable() { // from class: cz.i2
                    public /* synthetic */ RunnableC17621i2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        UserUpdateAvatarRegisterView.m49967EM(UserUpdateAvatarRegisterView.this);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: EM */
    public static final void m49967EM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        userUpdateAvatarRegisterView.m49971IM();
    }

    /* renamed from: FM */
    private final void m49968FM() {
        if (AbstractC23238v2.m119727l()) {
            CameraInputParams m39210w = CameraInputParams.m39210w();
            AbstractC19074t.m100207e(m39210w, "newSocialOpenDefaultCameraInputParams(...)");
            C29046a.f134547b = "UserUpdateAvatarRegisterView";
            AbstractC22470k.m116167s(m92676n2(), 1, 1, m39210w);
            return;
        }
        ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
    }

    /* renamed from: GM */
    private final void m49969GM(String str) {
        if (C23055e5.m118272g(true)) {
            m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
            C24730d.m128465h().m128477p(str, EnumC24734h.AVATAR, 0, false, "", null, this.f49354V0);
        } else {
            m78954jL();
        }
    }

    /* renamed from: HM */
    private final void m49970HM() {
        try {
            String[] m118177s = AbstractC23034c6.m118177s();
            AbstractC19074t.m100207e(m118177s, "getCaptureCameraPermissions(...)");
            if (AbstractC23034c6.m118167n(m92686rK(), m118177s) != 0) {
                AbstractC23034c6.m118184v0(this, m118177s, 111);
            } else {
                m49968FM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: IM */
    private final void m49971IM() {
        C29806fe c29806fe = null;
        if (!TextUtils.isEmpty(this.f49349Q0)) {
            C29806fe c29806fe2 = this.f49348P0;
            if (c29806fe2 == null) {
                AbstractC19074t.m100223u("binding");
                c29806fe2 = null;
            }
            Button button = c29806fe2.f137802s;
            button.setOnClickListener(new View.OnClickListener() { // from class: cz.j2
                public /* synthetic */ ViewOnClickListenerC17625j2() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserUpdateAvatarRegisterView.m49975MM(UserUpdateAvatarRegisterView.this, view);
                }
            });
            button.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_continue_title));
            C29806fe c29806fe3 = this.f49348P0;
            if (c29806fe3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29806fe = c29806fe3;
            }
            Button button2 = c29806fe.f137801r;
            button2.setOnClickListener(new View.OnClickListener() { // from class: cz.k2

                /* renamed from: q */
                public final /* synthetic */ UserUpdateAvatarRegisterView f89616q;

                public /* synthetic */ ViewOnClickListenerC17629k2(UserUpdateAvatarRegisterView this) {
                    r2 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UserUpdateAvatarRegisterView.m49972JM(Button.this, r2, view);
                }
            });
            button2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_change_picture_title));
            return;
        }
        C29806fe c29806fe4 = this.f49348P0;
        if (c29806fe4 == null) {
            AbstractC19074t.m100223u("binding");
            c29806fe4 = null;
        }
        Button button3 = c29806fe4.f137802s;
        button3.setOnClickListener(new View.OnClickListener() { // from class: cz.l2
            public /* synthetic */ ViewOnClickListenerC17633l2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserUpdateAvatarRegisterView.m49973KM(UserUpdateAvatarRegisterView.this, view);
            }
        });
        button3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_update_title));
        C29806fe c29806fe5 = this.f49348P0;
        if (c29806fe5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29806fe = c29806fe5;
        }
        Button button4 = c29806fe.f137801r;
        button4.setOnClickListener(new View.OnClickListener() { // from class: cz.m2
            public /* synthetic */ ViewOnClickListenerC17637m2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserUpdateAvatarRegisterView.m49974LM(UserUpdateAvatarRegisterView.this, view);
            }
        });
        button4.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_user_update_avatar_button_skip_title));
    }

    /* renamed from: JM */
    public static final void m49972JM(Button button, UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, View view) {
        AbstractC19074t.m100208f(button, "$this_apply");
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        button.getBottom();
        userUpdateAvatarRegisterView.m49964BM();
    }

    /* renamed from: KM */
    public static final void m49973KM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, View view) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        userUpdateAvatarRegisterView.m49964BM();
    }

    /* renamed from: LM */
    public static final void m49974LM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, View view) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        if (userUpdateAvatarRegisterView.f49350R0) {
            userUpdateAvatarRegisterView.m49993uM();
            AbstractC23647d.m123897g("38556");
        } else {
            userUpdateAvatarRegisterView.showDialog(0);
        }
    }

    /* renamed from: MM */
    public static final void m49975MM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, View view) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("{type : %s}", Arrays.copyOf(new Object[]{Integer.valueOf(userUpdateAvatarRegisterView.f49352T0)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        AbstractC20887g.m109248z(510070, format);
        if (userUpdateAvatarRegisterView.m49997yM()) {
            C17487o0 m92662fJ = userUpdateAvatarRegisterView.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(SuggestAllowAccessNativeContactRegisterView.class, null, 1, true);
                return;
            }
            return;
        }
        userUpdateAvatarRegisterView.m49965CM();
    }

    /* renamed from: NM */
    public final void m49976NM(String str) {
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        contactProfile.f42446v = str;
        contactProfile.f42323A1 = str;
        C29806fe c29806fe = this.f49348P0;
        if (c29806fe == null) {
            AbstractC19074t.m100223u("binding");
            c29806fe = null;
        }
        Avatar avatar = c29806fe.f137800q;
        String str2 = AbstractC23304d.f113368c0.f42446v;
        AbstractC19074t.m100207e(str2, "avt");
        avatar.m90479n(str2);
        this.f49349Q0 = "";
        C20834z0.f102412a.m108925d(true);
        C25487t.f122084a.m132028c(C25487t.a.f122086A);
        try {
            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (m92672lJ()) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_toast_updateAvtSuccess));
        }
    }

    /* renamed from: OM */
    private final void m49977OM() {
        boolean m127126v;
        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
            m127126v = AbstractC24341v.m127126v(CoreUtility.f89233i, "null", true);
            if (!m127126v) {
                Bundle bundle = new Bundle();
                bundle.putString("avatarPhoto", "1");
                bundle.putString("userId", CoreUtility.f89233i);
                bundle.putString("defaultAvatar", AbstractC23304d.f113368c0.f42446v);
                bundle.putInt("EXTRA_INT_IMAGE_VIEWER_TYPE", 6);
                bundle.putBoolean("viewOnly", true);
                C20275e c20275e = new C20275e();
                c20275e.m105883v(true);
                c20275e.m105885x(false);
                try {
                    InterfaceC27218a m92676n2 = m92676n2();
                    AbstractC19074t.m100206d(m92676n2, "null cannot be cast to non-null type com.zing.zalo.ui.BaseZaloActivity");
                    ((BaseZaloActivity) m92676n2).mo35556V(null, null, bundle, c20275e, 0);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: oc */
    private final void m49987oc() {
        try {
            if (AbstractC23238v2.m119727l()) {
                AbstractC23211s7.m119587t(m92676n2(), 2, 1);
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* renamed from: uM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m49993uM() {
        boolean z11;
        try {
            C22392e m115809a = AbstractC22393f.m115809a();
            if (m115809a != null && m115809a.m115808c()) {
                String m115807b = m115809a.m115807b();
                if (TextUtils.isEmpty(m115807b)) {
                    m115807b = "https://jp.zaloapp.com/zverify-lp-newuser";
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_FEATURE_ID", C18613b.f93599r);
                bundle.putString("EXTRA_WEB_URL", m115807b);
                InterfaceC27218a m92676n2 = m92676n2();
                if (m92676n2 != null) {
                    m92676n2.mo35581q(ZaloWebView.class, bundle, ZAbstractBase.ZVU_BLEND_GEN_THUMB, 1, true);
                }
                try {
                    mo78955kl(new Runnable() { // from class: cz.n2
                        public /* synthetic */ RunnableC17641n2() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            UserUpdateAvatarRegisterView.m49994vM(UserUpdateAvatarRegisterView.this);
                        }
                    }, 200L);
                    return;
                } catch (Exception e11) {
                    e = e11;
                    z11 = false;
                    AbstractC20110a.f98889a.mo104552e(e);
                    if (!z11) {
                        return;
                    }
                    AbstractC20887g.m109217D(510071, null, 2, null);
                    if (!m49997yM()) {
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            z11 = true;
        }
        AbstractC20887g.m109217D(510071, null, 2, null);
        if (!m49997yM()) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(SuggestAllowAccessNativeContactRegisterView.class, null, 1, true);
                return;
            }
            return;
        }
        m49965CM();
    }

    /* renamed from: vM */
    public static final void m49994vM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        try {
            String[] m118177s = AbstractC23034c6.m118177s();
            AbstractC19074t.m100207e(m118177s, "getCaptureCameraPermissions(...)");
            if (AbstractC23034c6.m118167n(userUpdateAvatarRegisterView.m92689tK(), m118177s) != 0) {
                AbstractC23034c6.m118184v0(userUpdateAvatarRegisterView.f72421L0, m118177s, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    private final void m49995wM() {
        C29806fe c29806fe = this.f49348P0;
        C29806fe c29806fe2 = null;
        if (c29806fe == null) {
            AbstractC19074t.m100223u("binding");
            c29806fe = null;
        }
        RelativeLayout root = c29806fe.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29806fe c29806fe3 = this.f49348P0;
        if (c29806fe3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29806fe2 = c29806fe3;
        }
        Avatar avatar = c29806fe2.f137800q;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        avatar.m90481x(m92689tK, EnumC16949e.SIZE_128);
        String m40418n0 = AbstractC23304d.f113368c0.m40418n0();
        AbstractC19074t.m100207e(m40418n0, "getShortDpnAvt(...)");
        avatar.setShortDpn(m40418n0);
        avatar.setOnClickListener(new View.OnClickListener() { // from class: cz.f2
            public /* synthetic */ ViewOnClickListenerC17609f2() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserUpdateAvatarRegisterView.m49996xM(UserUpdateAvatarRegisterView.this, view);
            }
        });
        m49971IM();
    }

    /* renamed from: xM */
    public static final void m49996xM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, View view) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        userUpdateAvatarRegisterView.m49964BM();
    }

    /* renamed from: yM */
    private final boolean m49997yM() {
        return !AbstractC23034c6.m118116D(m92689tK(), AbstractC23034c6.f112032i);
    }

    /* renamed from: zM */
    public static final void m49998zM(UserUpdateAvatarRegisterView userUpdateAvatarRegisterView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(userUpdateAvatarRegisterView, "this$0");
        interfaceC17463d.dismiss();
        userUpdateAvatarRegisterView.m49964BM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 0) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_skip_update_avt_content);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a aVar = new C16972e0.a(m92689tK);
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
            aVar.m90918B(m118743r0);
            aVar.m90949z(m118743r02);
            aVar.m90921E(true);
            aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_update_avatar);
            AbstractC19074t.m100207e(m118743r03, "getString(...)");
            aVar.m90943t(m118743r03, new InterfaceC17463d.d() { // from class: cz.g2
                public /* synthetic */ C17613g2() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    UserUpdateAvatarRegisterView.m49998zM(UserUpdateAvatarRegisterView.this, interfaceC17463d, i12);
                }
            });
            aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_button_confirm_no);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String upperCase = m118743r04.toUpperCase(locale);
            AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
            aVar.m90934k(upperCase, new InterfaceC17463d.d() { // from class: cz.h2
                public /* synthetic */ C17617h2() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    UserUpdateAvatarRegisterView.m49963AM(UserUpdateAvatarRegisterView.this, interfaceC17463d, i12);
                }
            });
            return aVar.m90927d();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29806fe m147961c = C29806fe.m147961c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147961c, "inflate(...)");
        this.f49348P0 = m147961c;
        m49995wM();
        C29806fe c29806fe = this.f49348P0;
        if (c29806fe == null) {
            AbstractC19074t.m100223u("binding");
            c29806fe = null;
        }
        RelativeLayout root = c29806fe.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        try {
            File file = this.f49353U0;
            if (file != null) {
                AbstractC19074t.m100205c(file);
                bundle.putString("cameraImageUri", file.getPath());
            }
            bundle.putString("avatar_path", this.f49349Q0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UserUpdateAvatarRegisterView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 4 && i12 == -1 && intent != null) {
            if (AbstractC19074t.m100204b(intent.getStringExtra("BOTTOM_SHEET_SELECTION"), "SELECT_TAKE_NEW_PHOTO")) {
                m49970HM();
            } else if (AbstractC19074t.m100204b(intent.getStringExtra("BOTTOM_SHEET_SELECTION"), "SELECT_CHOOSE_FROM_DEVICE")) {
                m49987oc();
            } else if (AbstractC19074t.m100204b(intent.getStringExtra("BOTTOM_SHEET_SELECTION"), "SELECT_VIEW_PROFILE_AVATAR")) {
                m49977OM();
            }
        }
        if (i11 == 1 && i12 == -1 && intent != null) {
            try {
                String stringExtra = intent.getStringExtra("extra_result_output_path");
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra2 = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra2)) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                    } else {
                        ToastUtils.showMess(stringExtra2);
                    }
                } else if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    this.f49352T0 = 0;
                    m49966DM(stringExtra);
                }
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (i11 == 2 && i12 == -1 && intent != null) {
            try {
                if (intent.getBooleanExtra("EXTRA_IS_ERROR", false)) {
                    String stringExtra3 = intent.getStringExtra("EXTRA_ERROR_MSG");
                    if (TextUtils.isEmpty(stringExtra3)) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                        return;
                    } else {
                        ToastUtils.showMess(stringExtra3);
                        return;
                    }
                }
                List m71478a = GalleryPickerView.Companion.m71478a(intent);
                if (!m71478a.isEmpty()) {
                    MediaItem mediaItem = (MediaItem) m71478a.get(0);
                    String str = "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        str = mediaItem.m41113N();
                    } else if (!TextUtils.isEmpty(mediaItem.mo41081Q())) {
                        str = mediaItem.mo41081Q();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f49352T0 = 1;
                        m49966DM(str);
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyUp(i11, keyEvent);
        }
        return true;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 111 && AbstractC23034c6.m118167n(MainApplication.Companion.m35500c(), AbstractC23034c6.m118177s()) == 0) {
            m49968FM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            if (bundle.containsKey("cameraImageUri")) {
                this.f49353U0 = new File(String.valueOf(bundle.getString("cameraImageUri")));
            }
            String string = bundle.getString("avatar_path");
            if (string != null) {
                m49966DM(string);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } else {
                new C9310b();
            }
        }
    }
}

package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import au.AbstractC2364o0;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collection;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;
import y30.C30283a;
import z30.C31215d;

/* loaded from: classes6.dex */
public class AuthorizationAppView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: l1 */
    public static final String f72201l1 = "AuthorizationAppView";

    /* renamed from: P0 */
    C30283a f72205P0;

    /* renamed from: Q0 */
    long f72206Q0;

    /* renamed from: S0 */
    String f72208S0;

    /* renamed from: T0 */
    String f72209T0;

    /* renamed from: U0 */
    private String f72210U0;

    /* renamed from: V0 */
    private String f72211V0;

    /* renamed from: W0 */
    private String f72212W0;

    /* renamed from: X0 */
    C23528a f72213X0;

    /* renamed from: Y0 */
    View f72214Y0;

    /* renamed from: Z0 */
    TextView f72215Z0;

    /* renamed from: a1 */
    ListView f72216a1;

    /* renamed from: b1 */
    C31215d f72217b1;

    /* renamed from: c1 */
    RecyclingImageView f72218c1;

    /* renamed from: d1 */
    RecyclingImageView f72219d1;

    /* renamed from: e1 */
    View f72220e1;

    /* renamed from: i1 */
    View f72224i1;

    /* renamed from: M0 */
    InterfaceC0765j f72202M0 = new C0766k();

    /* renamed from: N0 */
    InterfaceC0765j f72203N0 = new C0766k();

    /* renamed from: O0 */
    InterfaceC0765j f72204O0 = new C0766k();

    /* renamed from: R0 */
    String f72207R0 = "";

    /* renamed from: f1 */
    boolean f72221f1 = false;

    /* renamed from: g1 */
    boolean f72222g1 = false;

    /* renamed from: h1 */
    Handler f72223h1 = new HandlerC14041a(Looper.getMainLooper());

    /* renamed from: j1 */
    InterfaceC20094a f72225j1 = new C14042b();

    /* renamed from: k1 */
    InterfaceC20094a f72226k1 = new C14043c();

    /* renamed from: com.zing.zalo.ui.zviews.AuthorizationAppView$a */
    /* loaded from: classes6.dex */
    class HandlerC14041a extends Handler {
        HandlerC14041a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1001:
                    View view = AuthorizationAppView.this.f72214Y0;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = AuthorizationAppView.this.f72220e1;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        return;
                    }
                    return;
                case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                    View view3 = AuthorizationAppView.this.f72214Y0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    View view4 = AuthorizationAppView.this.f72220e1;
                    if (view4 != null) {
                        view4.setVisibility(0);
                        return;
                    }
                    return;
                case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                    AuthorizationAppView.this.m78147S1();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AuthorizationAppView$b */
    /* loaded from: classes6.dex */
    class C14042b implements InterfaceC20094a {
        C14042b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = AuthorizationAppView.f72201l1;
            c20096c.toString();
            AuthorizationAppView.this.m78151kM(false);
            ToastUtils.m89266n(AbstractC8020f0.authorization_app_message_error, new Object[0]);
            Intent intent = new Intent();
            intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, c20096c.m104491c());
            AuthorizationAppView.this.f72421L0.mo50035CK(-1, intent);
            AuthorizationAppView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AuthorizationAppView.this.m78151kM(false);
            try {
                String obj2 = obj.toString();
                String str = AuthorizationAppView.f72201l1;
                JSONObject jSONObject = new JSONObject(obj2);
                Intent intent = new Intent();
                if (!AuthorizationAppView.this.f72222g1) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    String string = jSONObject2.getString("code");
                    intent.putExtra("uid", jSONObject2.optLong("uid"));
                    intent.putExtra("code", string);
                }
                intent.putExtra("data", obj2);
                intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
                AuthorizationAppView.this.f72421L0.mo50035CK(-1, intent);
                AuthorizationAppView.this.finish();
            } catch (Exception e11) {
                AuthorizationAppView.this.m78151kM(false);
                AbstractC23350e.m122776f(AuthorizationAppView.f72201l1, e11);
                ToastUtils.m89266n(AbstractC8020f0.authorization_app_message_error, new Object[0]);
                AuthorizationAppView.this.m78150jM(1);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AuthorizationAppView$c */
    /* loaded from: classes6.dex */
    class C14043c implements InterfaceC20094a {
        C14043c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str = AuthorizationAppView.f72201l1;
            c20096c.toString();
            ToastUtils.m89266n(AbstractC8020f0.authorization_app_message_error, new Object[0]);
            Intent intent = new Intent();
            intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, c20096c.m104491c());
            AuthorizationAppView.this.f72421L0.mo50035CK(-1, intent);
            AuthorizationAppView.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str = AuthorizationAppView.f72201l1;
            obj.toString();
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                AuthorizationAppView authorizationAppView = AuthorizationAppView.this;
                authorizationAppView.f72205P0 = new C30283a(authorizationAppView.f72206Q0, jSONObject.getJSONObject("data"));
                if (AuthorizationAppView.this.f72205P0.m149425g()) {
                    AuthorizationAppView authorizationAppView2 = AuthorizationAppView.this;
                    if (!authorizationAppView2.f72222g1) {
                        authorizationAppView2.f72223h1.sendEmptyMessage(1001);
                        AuthorizationAppView.this.m78148fM(true);
                    }
                }
                AuthorizationAppView.this.f72223h1.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
                AuthorizationAppView.this.f72223h1.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                AuthorizationAppView.this.m78148fM(false);
            } catch (Exception e11) {
                AbstractC23350e.m122776f(AuthorizationAppView.f72201l1, e11);
                ToastUtils.m89266n(AbstractC8020f0.authorization_app_message_error, new Object[0]);
                AuthorizationAppView.this.f72421L0.mo50035CK(0, null);
                AuthorizationAppView.this.finish();
            }
        }
    }

    /* renamed from: eM */
    private String m78142eM(String str) {
        Signature[] signatureArr;
        SigningInfo signingInfo;
        JSONObject jSONObject = new JSONObject();
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = m92648SI().getPackageManager().getPackageInfo(str, 134217728).signingInfo;
                signatureArr = signingInfo.getApkContentsSigners();
            } else {
                signatureArr = m92648SI().getPackageManager().getPackageInfo(str, 64).signatures;
            }
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(new String(Base64.encode(signature.toByteArray(), 0)));
            }
            jSONObject.put("pkg", str);
            jSONObject.put("signatures", new JSONArray((Collection) arrayList));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: gM */
    private String m78143gM() {
        return ((Activity) m92648SI()).getCallingPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public /* synthetic */ void m78144iM(Bundle bundle) {
        this.f72421L0.m92693xK().mo57057c2(R.id.content, ChangePasswordView.class, bundle, 1001, null, 1, true);
    }

    /* renamed from: lM */
    public static void m78145lM(Context context) {
        Intent intent = new Intent("com.zing.zalo.action.ZALO_LOGIN_SUCCESSFUL_FOR_AUTHORIZATION_APP");
        intent.putExtra("loginSuccessful", true);
        context.sendBroadcast(intent);
    }

    /* renamed from: mM */
    public static void m78146mM(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 4);
        activity.setResult(-1, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C23212s8.m119598e(getContext());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate:");
        sb2.append(bundle);
        this.f72213X0 = new C23528a(this.f72421L0.m92648SI());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        super.mo37482FJ(actionBarMenu);
        View m92744k = actionBarMenu.m92744k(0, AbstractC7409c0.holo_circular_progress_bar_abs);
        this.f72224i1 = m92744k;
        m92744k.setVisibility(8);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.authorization_app_view, viewGroup, false);
        this.f72214Y0 = inflate.findViewById(AbstractC6918a0.empty_view);
        this.f72220e1 = inflate.findViewById(AbstractC6918a0.authorization_app_activity_data_layout);
        this.f72218c1 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.authorization_app_avatar_user);
        this.f72219d1 = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.authorization_app_logo_app);
        if (AbstractC23304d.f113368c0 != null) {
            ((C23528a) this.f72213X0.m123612r(this.f72218c1)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
        }
        this.f72215Z0 = (TextView) inflate.findViewById(AbstractC6918a0.authorization_app_request_permission_message_textview);
        this.f72216a1 = (ListView) inflate.findViewById(AbstractC6918a0.authorization_app_permission_list);
        C31215d c31215d = new C31215d(this.f72421L0.m92648SI());
        this.f72217b1 = c31215d;
        this.f72216a1.setAdapter((ListAdapter) c31215d);
        TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.authorization_app_action_cancel_btn);
        textView.setOnClickListener(this);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        inflate.findViewById(AbstractC6918a0.authorization_app_action_accept_btn).setOnClickListener(this);
        this.f72202M0.mo1704o8(this.f72226k1);
        this.f72204O0.mo1704o8(this.f72225j1);
        this.f72203N0.mo1704o8(this.f72226k1);
        if (this.f72421L0.m92642L3() != null) {
            this.f72222g1 = "com.zing.zalo.intent.action.THIRD_PARTY_REQ_PERM".equals(this.f72421L0.m92642L3().getString("app_action"));
            long j11 = this.f72421L0.m92642L3().getLong("android.intent.extra.UID", 0L);
            this.f72206Q0 = j11;
            if (j11 == 0 && this.f72421L0.m92642L3().containsKey("app_id")) {
                try {
                    this.f72206Q0 = Long.parseLong(this.f72421L0.m92642L3().getString("app_id"));
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f72201l1, e11);
                }
            }
            String string = this.f72421L0.m92642L3().getString("oauth");
            this.f72208S0 = string;
            if (string == null) {
                this.f72208S0 = "";
            }
            String string2 = this.f72421L0.m92642L3().getString("permission");
            this.f72209T0 = string2;
            if (string2 == null) {
                this.f72209T0 = "";
            }
            String string3 = this.f72421L0.m92642L3().getString("android.intent.extra.TEXT");
            this.f72207R0 = string3;
            if (string3 == null) {
                this.f72207R0 = "";
            }
            String string4 = this.f72421L0.m92642L3().getString("state");
            this.f72212W0 = string4;
            if (string4 == null) {
                this.f72212W0 = "";
            }
            String string5 = this.f72421L0.m92642L3().getString("ext_info");
            this.f72211V0 = string5;
            if (string5 == null) {
                this.f72211V0 = "";
            }
            String string6 = this.f72421L0.m92642L3().getString("code_challenge");
            this.f72210U0 = string6;
            if (string6 == null) {
                this.f72210U0 = "";
            }
        }
        if (bundle == null) {
            this.f72223h1.sendEmptyMessage(1001);
            if (this.f72222g1) {
                this.f72203N0.mo1752u8(this.f72206Q0, this.f72208S0, this.f72209T0, this.f72207R0, m78142eM(m78143gM()), AbstractC18458a.f93019a);
            } else {
                this.f72202M0.mo1765w5(this.f72206Q0, this.f72207R0, m78142eM(m78143gM()), AbstractC18458a.f93019a);
            }
        } else {
            C30283a c30283a = (C30283a) bundle.getSerializable("mCurrentApp");
            this.f72205P0 = c30283a;
            if (c30283a != null && this.f72206Q0 > 0) {
                this.f72223h1.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                if (this.f72221f1 && this.f72205P0.m149425g()) {
                    m78148fM(true);
                }
            }
        }
        this.f72221f1 = false;
        m92637BK(true);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m78150jM(2);
            return true;
        }
        return true;
    }

    /* renamed from: S1 */
    void m78147S1() {
        C30283a c30283a = this.f72205P0;
        if (c30283a == null) {
            return;
        }
        if (c30283a.m149423e() && !this.f72222g1) {
            this.f72216a1.setVisibility(8);
            this.f72215Z0.setText(this.f72205P0.m149422d());
        } else {
            this.f72215Z0.setText(this.f72205P0.m149422d());
            this.f72217b1.m35953b();
            this.f72217b1.m35952a(this.f72205P0.m149420b());
            this.f72216a1.setVisibility(0);
        }
        if (AbstractC23304d.f113368c0 != null) {
            ((C23528a) this.f72213X0.m123612r(this.f72218c1)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
        }
        ((C23528a) this.f72213X0.m123612r(this.f72219d1)).m123618x(this.f72205P0.m149419a(), C23278z2.m120107Y0());
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        bundle.putSerializable("mCurrentApp", this.f72205P0);
        super.mo37118SJ(bundle);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.authorization_app_title));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: fM */
    void m78148fM(boolean z11) {
        C30283a c30283a = this.f72205P0;
        if (c30283a == null) {
            m78150jM(1);
            return;
        }
        if (c30283a.m149424f() && AbstractC23309i.m121666Z4() != 1) {
            try {
                final Bundle bundle = new Bundle();
                bundle.putInt("password_mode", 4);
                AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AuthorizationAppView.this.m78144iM(bundle);
                    }
                });
                return;
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f72201l1, e11);
                m78150jM(5);
                return;
            }
        }
        if (z11) {
            m78149hM();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f72201l1;
    }

    /* renamed from: hM */
    void m78149hM() {
        m78151kM(true);
        if (this.f72222g1) {
            this.f72204O0.mo1640fb(this.f72206Q0, this.f72208S0, this.f72209T0, this.f72207R0, m78142eM(m78143gM()), AbstractC18458a.f93019a);
            return;
        }
        String[] strArr = new String[this.f72205P0.m149420b().size()];
        String[] strArr2 = new String[this.f72205P0.m149420b().size()];
        int i11 = 0;
        for (C30283a.b bVar : this.f72205P0.m149420b()) {
            strArr[i11] = bVar.m149428a();
            strArr2[i11] = String.valueOf(bVar.m149431d());
            i11++;
        }
        this.f72204O0.mo1657i4(this.f72206Q0, this.f72210U0, this.f72211V0, this.f72205P0.m149421c(), this.f72212W0, strArr, strArr2);
    }

    /* renamed from: jM */
    void m78150jM(int i11) {
        Intent intent = new Intent();
        intent.putExtra(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, i11);
        this.f72421L0.mo50035CK(-1, intent);
        finish();
    }

    /* renamed from: kM */
    void m78151kM(boolean z11) {
        int i11;
        if (this.f72421L0.m92676n2() != null && this.f72421L0.m92672lJ()) {
            InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
            View view = this.f72224i1;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            AbstractC2364o0.m12372o(m92676n2, view, i11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1001) {
            if (i12 == -1) {
                C30283a c30283a = this.f72205P0;
                if (c30283a != null && c30283a.m149425g()) {
                    m78149hM();
                } else {
                    this.f72221f1 = true;
                    this.f72223h1.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
                }
            } else {
                m78150jM(6);
            }
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.authorization_app_action_cancel_btn) {
            m78150jM(3);
        } else if (id2 == AbstractC6918a0.authorization_app_action_accept_btn) {
            if (this.f72205P0 != null) {
                m78148fM(true);
            } else {
                m78150jM(1);
            }
        }
    }
}

package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ag0.C0815e1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import au.AbstractC2351i;
import au.AbstractC2379w;
import com.google.android.gms.common.api.Status;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityView;
import com.zing.zalo.p077ui.zviews.VerifyChangePhoneNumberView;
import com.zing.zalo.receiver.SMSReceiver;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import ed0.AbstractC18391a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.C23055e5;
import me0.C23212s8;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p342m6.AbstractC22888j;
import p342m6.InterfaceC22882g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p472r4.AbstractC25644a;
import y60.C30801c;

/* loaded from: classes6.dex */
public class VerifyChangePhoneNumberView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    View f79276P0;

    /* renamed from: Q0 */
    TextView f79277Q0;

    /* renamed from: R0 */
    EditText f79278R0;

    /* renamed from: S0 */
    TextView f79279S0;

    /* renamed from: T0 */
    TextView f79280T0;

    /* renamed from: U0 */
    View f79281U0;

    /* renamed from: V0 */
    TextView[] f79282V0;

    /* renamed from: W0 */
    C30801c[] f79283W0;

    /* renamed from: X0 */
    SMSReceiver f79284X0;

    /* renamed from: Y0 */
    private final int f79285Y0 = 0;

    /* renamed from: Z0 */
    private final int f79286Z0 = 0;

    /* renamed from: a1 */
    boolean f79287a1 = false;

    /* renamed from: b1 */
    boolean f79288b1 = false;

    /* renamed from: c1 */
    boolean f79289c1 = false;

    /* renamed from: d1 */
    boolean f79290d1 = false;

    /* renamed from: e1 */
    boolean f79291e1 = false;

    /* renamed from: f1 */
    boolean f79292f1 = false;

    /* renamed from: g1 */
    boolean f79293g1 = false;

    /* renamed from: h1 */
    boolean f79294h1 = false;

    /* renamed from: i1 */
    boolean f79295i1 = false;

    /* renamed from: j1 */
    boolean f79296j1 = false;

    /* renamed from: k1 */
    boolean f79297k1 = false;

    /* renamed from: l1 */
    String f79298l1 = "";

    /* renamed from: m1 */
    String f79299m1 = "";

    /* renamed from: n1 */
    boolean f79300n1 = false;

    /* renamed from: o1 */
    long f79301o1 = 0;

    /* renamed from: p1 */
    int f79302p1 = 1;

    /* renamed from: q1 */
    boolean f79303q1 = true;

    /* renamed from: r1 */
    boolean f79304r1 = false;

    /* renamed from: s1 */
    int f79305s1 = 0;

    /* renamed from: t1 */
    boolean f79306t1 = false;

    /* renamed from: u1 */
    private BroadcastReceiver f79307u1;

    /* renamed from: com.zing.zalo.ui.zviews.VerifyChangePhoneNumberView$a */
    /* loaded from: classes6.dex */
    public class C15332a extends AbstractC18391a {
        C15332a() {
        }

        /* renamed from: b */
        public /* synthetic */ void m86502b() {
            VerifyChangePhoneNumberView.this.m86495lM();
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i11 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= 4) {
                    break;
                }
                C30801c[] c30801cArr = VerifyChangePhoneNumberView.this.f79283W0;
                if (c30801cArr[i11] == null) {
                    c30801cArr[i11] = new C30801c();
                }
                if (i11 < editable.length()) {
                    VerifyChangePhoneNumberView.this.f79282V0[i11].setText(String.valueOf(editable.charAt(i11)));
                    C30801c c30801c = VerifyChangePhoneNumberView.this.f79283W0[i11];
                    if (i11 != editable.length() - 1) {
                        z11 = false;
                    }
                    c30801c.m149867a(z11);
                } else {
                    VerifyChangePhoneNumberView.this.f79283W0[i11].m149867a(false);
                    VerifyChangePhoneNumberView.this.f79282V0[i11].setText("");
                }
                VerifyChangePhoneNumberView verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
                AbstractC23136l9.m118696b1(verifyChangePhoneNumberView.f79282V0[i11], verifyChangePhoneNumberView.f79283W0[i11]);
                i11++;
            }
            VerifyChangePhoneNumberView.this.m86500wM(editable.length());
            if (editable.length() >= 4) {
                VerifyChangePhoneNumberView verifyChangePhoneNumberView2 = VerifyChangePhoneNumberView.this;
                if (verifyChangePhoneNumberView2.f79303q1) {
                    verifyChangePhoneNumberView2.f79278R0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.g31
                        public /* synthetic */ g31() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            VerifyChangePhoneNumberView.C15332a.this.m86502b();
                        }
                    });
                }
            }
            VerifyChangePhoneNumberView.this.f79303q1 = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VerifyChangePhoneNumberView$b */
    /* loaded from: classes6.dex */
    public class C15333b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f79309a;

        C15333b(String str) {
            this.f79309a = str;
        }

        /* renamed from: e */
        public /* synthetic */ void m86505e(Bundle bundle) {
            try {
                VerifyChangePhoneNumberView.this.f72421L0.m92676n2().mo35579p().m93069k2(ChangePhoneNumberSuccessView.class, bundle, 1, true);
                if (VerifyChangePhoneNumberView.this.f72421L0.m92650VI() != null) {
                    VerifyChangePhoneNumberView.this.f72421L0.m92650VI().finish();
                } else {
                    VerifyChangePhoneNumberView.this.f72421L0.finish();
                }
                int i11 = ChangePhoneAccountExistView.f72648Y0;
                if (i11 == 1) {
                    C0815e1.m2075D().m2099U(3, 0, 29, "8");
                } else if (i11 == 2) {
                    C0815e1.m2075D().m2099U(3, 0, 29, "5");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m86506f() {
            VerifyChangePhoneNumberView verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
            EditText editText = verifyChangePhoneNumberView.f79278R0;
            if (editText != null) {
                verifyChangePhoneNumberView.m86500wM(editText.length());
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            VerifyChangePhoneNumberView verifyChangePhoneNumberView;
            i31 i31Var;
            try {
                try {
                    ToastUtils.m89263k(c20096c);
                    VerifyChangePhoneNumberView verifyChangePhoneNumberView2 = VerifyChangePhoneNumberView.this;
                    verifyChangePhoneNumberView2.f79304r1 = false;
                    verifyChangePhoneNumberView2.f72421L0.mo49315c4();
                    verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
                    i31Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.i31
                        public /* synthetic */ i31() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            VerifyChangePhoneNumberView.C15333b.this.m86506f();
                        }
                    };
                } catch (Exception e11) {
                    e11.printStackTrace();
                    VerifyChangePhoneNumberView.this.f79304r1 = false;
                    VerifyChangePhoneNumberView.this.f72421L0.mo49315c4();
                    verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
                    i31Var = new Runnable() { // from class: com.zing.zalo.ui.zviews.i31
                        public /* synthetic */ i31() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            VerifyChangePhoneNumberView.C15333b.this.m86506f();
                        }
                    };
                }
                verifyChangePhoneNumberView.mo70710wy(i31Var);
            } catch (Throwable th2) {
                VerifyChangePhoneNumberView verifyChangePhoneNumberView3 = VerifyChangePhoneNumberView.this;
                verifyChangePhoneNumberView3.f79304r1 = false;
                verifyChangePhoneNumberView3.f72421L0.mo49315c4();
                VerifyChangePhoneNumberView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.i31
                    public /* synthetic */ i31() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VerifyChangePhoneNumberView.C15333b.this.m86506f();
                    }
                });
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            String str2;
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.optInt("error_code", -999) == 0) {
                        SettingAccountAndSecurityView.f67618A1 = false;
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        String str3 = "";
                        if (optJSONObject == null) {
                            str = "";
                        } else {
                            str = optJSONObject.optString("phone");
                            if (!TextUtils.isEmpty(str) && !str.startsWith("+")) {
                                str = "+" + str;
                            }
                        }
                        if (TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                            str2 = "";
                        } else {
                            str2 = AbstractC23056e6.m118281g(AbstractC23304d.f113394i0, AbstractC23309i.m121742b5());
                            if (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                str2 = AbstractC23304d.f113394i0;
                            }
                        }
                        if (!TextUtils.isEmpty(VerifyChangePhoneNumberView.this.f79298l1)) {
                            str3 = AbstractC23056e6.m118281g(VerifyChangePhoneNumberView.this.f79298l1, AbstractC23309i.m121742b5());
                            if (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                str3 = VerifyChangePhoneNumberView.this.f79298l1;
                            }
                        }
                        Bundle bundle = new Bundle();
                        bundle.putString("STR_EXTRA_NEW_PHONE_NUMBER", str3);
                        bundle.putString("STR_EXTRA_OLD_PHONE_NUMBER", str2);
                        bundle.putBoolean("STR_EXTRA_CHANGE_BYPASS_WAY", false);
                        bundle.putInt("source_type_change_phone", VerifyChangePhoneNumberView.this.f79302p1);
                        VerifyChangePhoneNumberView verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
                        if (TextUtils.isEmpty(str)) {
                            str = this.f79309a;
                        }
                        verifyChangePhoneNumberView.m86498tM(str);
                        AbstractC23309i.m121541Vr(0L);
                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                        if (contactProfile != null) {
                            contactProfile.f42341G1 = 0;
                            String m118285k = AbstractC23056e6.m118285k(VerifyChangePhoneNumberView.this.f79298l1);
                            if (TextUtils.isEmpty(m118285k) || m118285k.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                                m118285k = VerifyChangePhoneNumberView.this.f79298l1;
                            }
                            if (!TextUtils.isEmpty(m118285k)) {
                                AbstractC23304d.f113368c0.f42455y = m118285k;
                            }
                            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                        }
                        if (VerifyChangePhoneNumberView.this.f72421L0.m92676n2() != null && VerifyChangePhoneNumberView.this.f72421L0.m92676n2().mo35579p() != null) {
                            VerifyChangePhoneNumberView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.h31

                                /* renamed from: q */
                                public final /* synthetic */ Bundle f80539q;

                                public /* synthetic */ h31(Bundle bundle2) {
                                    r2 = bundle2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    VerifyChangePhoneNumberView.C15333b.this.m86505e(r2);
                                }
                            });
                        }
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                VerifyChangePhoneNumberView verifyChangePhoneNumberView2 = VerifyChangePhoneNumberView.this;
                verifyChangePhoneNumberView2.f79304r1 = false;
                verifyChangePhoneNumberView2.f72421L0.mo49315c4();
            } catch (Throwable th2) {
                VerifyChangePhoneNumberView verifyChangePhoneNumberView3 = VerifyChangePhoneNumberView.this;
                verifyChangePhoneNumberView3.f79304r1 = false;
                verifyChangePhoneNumberView3.f72421L0.mo49315c4();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VerifyChangePhoneNumberView$c */
    /* loaded from: classes6.dex */
    public class CountDownTimerC15334c extends CountDownTimer {
        CountDownTimerC15334c(long j11, long j12) {
            super(j11, j12);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            VerifyChangePhoneNumberView verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
            verifyChangePhoneNumberView.f79305s1 = 0;
            verifyChangePhoneNumberView.f79279S0.setText("");
            VerifyChangePhoneNumberView.this.f79279S0.setVisibility(8);
            VerifyChangePhoneNumberView.this.f79277Q0.setEnabled(true);
            TextView textView = VerifyChangePhoneNumberView.this.f79277Q0;
            textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC16781w.AppPrimaryColor));
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j11) {
            VerifyChangePhoneNumberView verifyChangePhoneNumberView = VerifyChangePhoneNumberView.this;
            int i11 = (int) (j11 / 1000);
            verifyChangePhoneNumberView.f79305s1 = i11;
            verifyChangePhoneNumberView.f79279S0.setText(String.format("%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(VerifyChangePhoneNumberView.this.f79305s1 % 60)));
            VerifyChangePhoneNumberView.this.f79279S0.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VerifyChangePhoneNumberView$d */
    /* loaded from: classes6.dex */
    public class C15335d implements InterfaceC20094a {
        C15335d() {
        }

        /* renamed from: d */
        public /* synthetic */ void m86508d() {
            try {
                VerifyChangePhoneNumberView.this.m86499uM(3, 30000L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    ToastUtils.m89263k(c20096c);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                VerifyChangePhoneNumberView.this.f79306t1 = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (((JSONObject) obj).optInt("error_code", -999) == 0) {
                        if (VerifyChangePhoneNumberView.this.f72421L0.m92676n2() != null) {
                            VerifyChangePhoneNumberView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.j31
                                public /* synthetic */ j31() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    VerifyChangePhoneNumberView.C15335d.this.m86508d();
                                }
                            });
                        }
                    } else {
                        ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message));
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                VerifyChangePhoneNumberView.this.f79306t1 = false;
            } catch (Throwable th2) {
                VerifyChangePhoneNumberView.this.f79306t1 = false;
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.VerifyChangePhoneNumberView$e */
    /* loaded from: classes6.dex */
    public class C15336e extends BroadcastReceiver {
        C15336e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).m19220F() == 0) {
                    try {
                        String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                        if (!TextUtils.isEmpty(str)) {
                            Matcher matcher = Pattern.compile("([0-9]{4,8})").matcher(str);
                            if (matcher.find()) {
                                VerifyChangePhoneNumberView.this.f79278R0.setText(matcher.group(0).trim());
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: oM */
    public /* synthetic */ void m86489oM(View view) {
        AbstractC2379w.m12432f(this.f79278R0);
    }

    /* renamed from: pM */
    public /* synthetic */ void m86490pM(View view) {
        String str;
        try {
            EditText editText = this.f79278R0;
            if (editText != null && editText.getText() != null) {
                str = this.f79278R0.getText().toString();
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                m86495lM();
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.verify_code_change_phone_number));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m86491qM(View view) {
        m86496mM();
    }

    /* renamed from: rM */
    public /* synthetic */ boolean m86492rM(Message message) {
        String str;
        if (message.what == 0) {
            try {
                if (!TextUtils.isEmpty((String) message.obj)) {
                    this.f79303q1 = false;
                    this.f79278R0.setText((String) message.obj);
                    EditText editText = this.f79278R0;
                    if (editText != null && editText.getText() != null) {
                        str = this.f79278R0.getText().toString();
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        this.f79278R0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.f31
                            public /* synthetic */ f31() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                VerifyChangePhoneNumberView.this.m86495lM();
                            }
                        });
                        return true;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.verify_code_change_phone_number));
                    return true;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: sM */
    public /* synthetic */ void m86493sM(Void r42) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        AbstractC2351i.m12327a(MainApplication.getAppContext(), this.f79307u1, intentFilter, true);
    }

    /* renamed from: vM */
    private void m86494vM() {
        this.f79307u1 = new C15336e();
        AbstractC22888j mo132539w = AbstractC25644a.m132538a(MainApplication.getAppContext()).mo132539w();
        mo132539w.mo117578g(new InterfaceC22882g() { // from class: com.zing.zalo.ui.zviews.a31
            public /* synthetic */ a31() {
            }

            @Override // p342m6.InterfaceC22882g
            public final void onSuccess(Object obj) {
                VerifyChangePhoneNumberView.this.m86493sM((Void) obj);
            }
        });
        mo132539w.mo117576e(new C16048q9());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f79288b1 = m92642L3.getBoolean("isFromStartUp");
            this.f79295i1 = m92642L3.getBoolean("isForgetPassword");
            this.f79294h1 = m92642L3.getBoolean("isSupportVoiceCall");
            this.f79296j1 = m92642L3.getBoolean("isCallToActive");
            this.f79297k1 = m92642L3.getBoolean("isFromVerifyPhoneNumber");
            this.f79302p1 = m92642L3.getInt("source_type_change_phone", 1);
            if (m92642L3.containsKey("STR_EXTRA_NEW_PHONE_NUMBER")) {
                str = m92642L3.getString("STR_EXTRA_NEW_PHONE_NUMBER");
            } else {
                str = "";
            }
            this.f79298l1 = str;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.activity_verify_change_phone_number, viewGroup, false);
        this.f79281U0 = inflate;
        m86497nM(inflate);
        return this.f79281U0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        try {
            this.f72421L0.m92648SI().unregisterReceiver(this.f79284X0);
            EditText editText = this.f79278R0;
            if (editText != null) {
                AbstractC2379w.m12430d(editText);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            try {
                bundle.putString("mNewPhoneNumber", this.f79298l1);
                bundle.putLong("timeCountDown", System.currentTimeMillis() + (this.f79305s1 * 1000));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "VerifyChangePhoneNumberView";
    }

    /* renamed from: lM */
    public void m86495lM() {
        String str;
        if (!C23055e5.m118272g(true) || this.f79304r1) {
            return;
        }
        EditText editText = this.f79278R0;
        if (editText == null || editText.getText() == null) {
            str = "";
        } else {
            str = this.f79278R0.getText().toString();
        }
        String m121742b5 = AbstractC23309i.m121742b5();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(m121742b5)) {
            String m118277c = AbstractC23056e6.m118277c(this.f79298l1);
            if (!TextUtils.isEmpty(m118277c) && !m118277c.equals(AbstractC23056e6.f112062a)) {
                this.f79276P0.setEnabled(false);
                this.f72421L0.mo46829Y();
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15333b(m118277c));
                this.f79304r1 = true;
                c0766k.mo1697n9(m121742b5, m118277c, str, this.f79302p1);
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
        }
    }

    /* renamed from: mM */
    void m86496mM() {
        if (!C23055e5.m118272g(true) || this.f79306t1) {
            return;
        }
        String m121742b5 = AbstractC23309i.m121742b5();
        if (!TextUtils.isEmpty(this.f79298l1) && !TextUtils.isEmpty(m121742b5)) {
            String m118277c = AbstractC23056e6.m118277c(this.f79298l1);
            if (!TextUtils.isEmpty(m118277c) && !m118277c.equals(AbstractC23056e6.f112062a)) {
                if (this.f79292f1) {
                    ToastUtils.showMess(AbstractC23161o1.m119318c(2012, ""));
                    return;
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15335d());
                this.f79306t1 = true;
                c0766k.mo1707p3(m121742b5, m118277c, this.f79302p1, false);
                return;
            }
            ToastUtils.showMess(AbstractC23161o1.m119318c(ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, ""));
        }
    }

    /* renamed from: nM */
    void m86497nM(View view) {
        this.f79278R0 = (EditText) view.findViewById(AbstractC6918a0.etActivationCode);
        this.f79280T0 = (TextView) view.findViewById(AbstractC6918a0.tvHint);
        this.f79279S0 = (TextView) view.findViewById(AbstractC6918a0.tvDurationGetActiveCode);
        this.f79277Q0 = (TextView) view.findViewById(AbstractC6918a0.btnGetActivationCode);
        this.f79276P0 = view.findViewById(AbstractC6918a0.btnSubmitActivationCode);
        TextView[] textViewArr = new TextView[4];
        this.f79282V0 = textViewArr;
        boolean z11 = false;
        textViewArr[0] = (TextView) view.findViewById(AbstractC6918a0.tv1);
        this.f79282V0[1] = (TextView) view.findViewById(AbstractC6918a0.tv2);
        this.f79282V0[2] = (TextView) view.findViewById(AbstractC6918a0.tv3);
        this.f79282V0[3] = (TextView) view.findViewById(AbstractC6918a0.tv4);
        this.f79283W0 = new C30801c[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.f79283W0[i11] = new C30801c();
            AbstractC23136l9.m118696b1(this.f79282V0[i11], this.f79283W0[i11]);
            this.f79282V0[i11].setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.b31
                public /* synthetic */ b31() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    VerifyChangePhoneNumberView.this.m86489oM(view2);
                }
            });
        }
        this.f79278R0.addTextChangedListener(new C15332a());
        this.f79276P0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.c31
            public /* synthetic */ c31() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VerifyChangePhoneNumberView.this.m86490pM(view2);
            }
        });
        this.f79278R0.setTypeface(Typeface.DEFAULT);
        this.f79277Q0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.d31
            public /* synthetic */ d31() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                VerifyChangePhoneNumberView.this.m86491qM(view2);
            }
        });
        this.f79284X0 = new SMSReceiver(new Handler(new Handler.Callback() { // from class: com.zing.zalo.ui.zviews.e31
            public /* synthetic */ e31() {
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m86492rM;
                m86492rM = VerifyChangePhoneNumberView.this.m86492rM(message);
                return m86492rM;
            }
        }));
        View view2 = this.f79276P0;
        if (view2 != null) {
            if (this.f79278R0.length() > 0) {
                z11 = true;
            }
            view2.setEnabled(z11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (this.f72421L0.m92648SI() != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PHONE_STATE");
                intentFilter.setPriority(Integer.MAX_VALUE);
                AbstractC2351i.m12327a(this.f72421L0.m92648SI(), this.f79284X0, intentFilter, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f79301o1 = System.currentTimeMillis();
    }

    /* renamed from: tM */
    void m86498tM(String str) {
        try {
            AbstractC23304d.f113394i0 = str;
            AbstractC23304d.f113414n0 = 123226;
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            String str2 = AbstractC23304d.f113394i0;
            contactProfile.f42455y = str2;
            AbstractC23309i.m121396Ru(str2);
            AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m86499uM(int i11, long j11) {
        try {
            this.f79277Q0.setEnabled(false);
            TextView textView = this.f79277Q0;
            textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC16781w.TextColor3));
            new CountDownTimerC15334c(j11, 1000L).start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: wM */
    void m86500wM(int i11) {
        boolean z11;
        try {
            View view = this.f79276P0;
            if (i11 >= 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            view.setEnabled(z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        super.mo37135xJ(bundle);
        try {
            m86494vM();
            if (bundle != null) {
                if (bundle.containsKey("mNewPhoneNumber")) {
                    str = bundle.getString("mNewPhoneNumber");
                } else {
                    str = "";
                }
                this.f79298l1 = str;
                if (!TextUtils.isEmpty(str)) {
                    long j11 = bundle.getLong("timeCountDown", 0L) - System.currentTimeMillis();
                    if (j11 > 1000) {
                        m86499uM(3, j11);
                    }
                }
            } else if (!TextUtils.isEmpty(this.f79298l1)) {
                m86499uM(3, 30000L);
            }
            m86500wM(this.f79278R0.length());
            if (this.f79280T0 != null) {
                int i11 = 0;
                if (!TextUtils.isEmpty(this.f79298l1)) {
                    String m118281g = AbstractC23056e6.m118281g(this.f79298l1, AbstractC23309i.m121742b5());
                    if (TextUtils.isEmpty(m118281g) || m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        m118281g = this.f79298l1;
                    }
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_hint_verify_change_phone, m118281g);
                    SpannableString spannableString = new SpannableString(m118746s0);
                    int indexOf = m118746s0.indexOf(m118281g);
                    spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f79280T0.getContext(), AbstractC21196a.TextColor1)), indexOf, m118281g.length() + indexOf, 33);
                    this.f79280T0.setText(spannableString);
                }
                TextView textView = this.f79280T0;
                if (TextUtils.isEmpty(this.f79298l1)) {
                    i11 = 8;
                }
                textView.setVisibility(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

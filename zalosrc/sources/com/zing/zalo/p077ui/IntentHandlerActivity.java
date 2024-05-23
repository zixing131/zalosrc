package com.zing.zalo.p077ui;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0939u;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ap0.C2279a;
import au.C2343e;
import bp0.AbstractC3096i0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.IntentHandlerActivity;
import com.zing.zalo.p077ui.searchglobal.SearchGlobalView;
import com.zing.zalo.p077ui.settings.SettingNotificationV2View;
import com.zing.zalo.p077ui.settings.SwitchAccountView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.AddFriendView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.WebBaseView;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uicontrol.CircleImage;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import gm0.AbstractC19509c;
import h40.C19840q0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Set;
import ls.C22643c;
import ly.C22688w;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.AbstractC23244v8;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23055e5;
import me0.C23278z2;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONException;
import org.json.JSONObject;
import p140ev.C18620i;
import p161fg.C18922m;
import p189gv.C19609h;
import p207he.C20011e;
import p207he.C20024r;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p320ld.C22438j;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C32150v9;
import pm0.C24848g0;
import sy.AbstractC26412d;
import th.AbstractC26683d;
import v50.C27870vb;
import vg.C28023b6;
import vg.C28203u6;

/* loaded from: classes5.dex */
public class IntentHandlerActivity extends IntentHandlerBaseActivity implements View.OnClickListener {

    /* renamed from: c0 */
    public static final String f55225c0 = "IntentHandlerActivity";

    /* renamed from: d0 */
    static String f55226d0;

    /* renamed from: Z */
    private int f55229Z;

    /* renamed from: X */
    private ContactProfile f55227X = null;

    /* renamed from: Y */
    private String f55228Y = null;

    /* renamed from: a0 */
    private String f55230a0 = "";

    /* renamed from: b0 */
    private ContactProfile f55231b0 = null;

    /* renamed from: com.zing.zalo.ui.IntentHandlerActivity$a */
    /* loaded from: classes5.dex */
    class C10933a extends C22688w.b {

        /* renamed from: f */
        final /* synthetic */ C22688w f55232f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10933a(BaseZaloView baseZaloView, InterfaceC27218a interfaceC27218a, boolean z11, C22688w c22688w) {
            super(baseZaloView, interfaceC27218a, z11);
            this.f55232f = c22688w;
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: a */
        public void mo49370a(int i11) {
            try {
                IntentHandlerActivity.f55226d0 = null;
                this.f55232f.m117349g();
                AbstractC20110a.m104535d("handleIntent onFinish: %d", Integer.valueOf(i11));
                IntentHandlerActivity.this.setResult(i11);
                IntentHandlerActivity.this.finish();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }

        @Override // ly.C22688w.b, ly.InterfaceC22668c
        /* renamed from: b */
        public void mo49371b() {
            IntentHandlerActivity.f55226d0 = null;
            IntentHandlerActivity.this.setResult(-1);
            IntentHandlerActivity.this.finish();
        }

        @Override // ly.C22688w.b, ly.InterfaceC22668c
        /* renamed from: e */
        public void mo49372e(C20096c c20096c) {
            IntentHandlerActivity.f55226d0 = null;
            IntentHandlerActivity.this.setResult(c20096c.m104491c());
            IntentHandlerActivity.this.finish();
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: f */
        public void mo49373f(C19609h c19609h, C18620i c18620i) {
            IntentHandlerActivity.f55226d0 = null;
            WebBaseView.m86649WQ(mo49367R(), c19609h, IntentHandlerActivity.this.getIntent().getExtras(), c18620i);
            IntentHandlerActivity.this.setResult(0);
            IntentHandlerActivity.this.finish();
        }

        @Override // ly.C22688w.b, ly.InterfaceC22668c
        /* renamed from: i */
        public void mo49376i(int i11) {
            IntentHandlerActivity.f55226d0 = null;
            IntentHandlerActivity.this.setResult(i11);
            IntentHandlerActivity.this.finish();
        }

        @Override // ly.InterfaceC22668c
        /* renamed from: u */
        public void mo49386u(Class cls, Bundle bundle, int i11) {
            try {
                try {
                    try {
                        IntentHandlerActivity.f55226d0 = null;
                        AbstractC20110a.m104535d("handleIntent: RESULT_CODE_SUCCESSFUL", new Object[0]);
                        IntentHandlerActivity.this.setResult(0);
                        IntentHandlerActivity.this.finish();
                        Intent m119012O = AbstractC23152n3.m119012O(cls, bundle);
                        m119012O.addFlags(268435456);
                        IntentHandlerActivity.this.getApplicationContext().startActivity(m119012O);
                        this.f55232f.m117349g();
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                        try {
                            IntentHandlerActivity.this.setResult(1);
                            IntentHandlerActivity.this.finish();
                        } catch (Exception unused) {
                        }
                        this.f55232f.m117349g();
                    }
                } catch (Throwable th2) {
                    try {
                        this.f55232f.m117349g();
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                    throw th2;
                }
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerActivity$b */
    /* loaded from: classes5.dex */
    public class C10934b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ WeakReference f55234a;

        C10934b(WeakReference weakReference) {
            this.f55234a = weakReference;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC23350e.m122774d(IntentHandlerActivity.f55225c0, c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C22643c m117217a = C22643c.m117217a((JSONObject) obj);
                RobotoButton robotoButton = (RobotoButton) this.f55234a.get();
                if (m117217a != null && m117217a.f111048d == 1 && m117217a.f111045a == 0) {
                    robotoButton.setAlpha(1.0f);
                    robotoButton.setEnabled(true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.IntentHandlerActivity$c */
    /* loaded from: classes5.dex */
    class C10935c extends AbstractC0939u {
        C10935c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42152I7(IntentHandlerActivity.this.f55231b0.f42434r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerActivity$d */
    /* loaded from: classes5.dex */
    public class C10936d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f55237a;

        /* renamed from: b */
        final /* synthetic */ String f55238b;

        C10936d(String str, String str2) {
            this.f55237a = str;
            this.f55238b = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m56797g(ContactProfile contactProfile) {
            IntentHandlerActivity.this.startActivity(AbstractC23152n3.m119010N(contactProfile.f42434r, false, ""));
            IntentHandlerActivity.this.finish();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m56798h(ContactProfile contactProfile, String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("contact", contactProfile);
            bundle.putString("phone_number", str);
            bundle.putString("converted_phone_number", str2);
            IntentHandlerActivity.this.m35549B2(2, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m56799i(ContactProfile contactProfile, String str, String str2) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("contact", contactProfile);
            bundle.putString("phone_number", str);
            bundle.putString("converted_phone_number", str2);
            IntentHandlerActivity.this.m35549B2(2, bundle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m56800j(Bundle bundle) {
            IntentHandlerActivity.this.m35549B2(4, bundle);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            final ContactProfile m141809c;
            IntentHandlerActivity.this.m56815c4();
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.error_message);
            int m104491c = c20096c.m104491c();
            if (m104491c != 102) {
                if (m104491c != 1001) {
                    if (m104491c != 2027) {
                        if (m104491c != 50001) {
                            switch (m104491c) {
                                case 1010:
                                case 1011:
                                    C31901e8 m2800f = AbstractC0906d0.m2800f(IntentHandlerActivity.this.mo35575n1(), this.f55238b);
                                    if (m2800f != null && m2800f.m153300r() > 0 && (m141809c = C28203u6.f131407a.m141809c(String.valueOf(m2800f.m153300r()))) != null) {
                                        IntentHandlerActivity intentHandlerActivity = IntentHandlerActivity.this;
                                        final String str = this.f55237a;
                                        final String str2 = this.f55238b;
                                        intentHandlerActivity.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.c
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                IntentHandlerActivity.C10936d.this.m56799i(m141809c, str, str2);
                                            }
                                        });
                                        return;
                                    }
                                    AbstractC23350e.m122774d(IntentHandlerActivity.f55225c0, c20096c.m104492d());
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                                    break;
                                case 1012:
                                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_search_phone_error_2_desc);
                                    break;
                            }
                        } else {
                            AbstractC23350e.m122774d(IntentHandlerActivity.f55225c0, c20096c.m104492d());
                            AbstractC23152n3.m119005K0(IntentHandlerActivity.this.mo35575n1(), this.f55237a);
                            IntentHandlerActivity.this.finish();
                            return;
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.TOO_MANY_REQUEST_MSG);
                    }
                } else {
                    try {
                        if (!TextUtils.isEmpty(c20096c.m104490b())) {
                            JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                            final Bundle bundle = new Bundle();
                            bundle.putString("reach_limit_content", C23024b7.m118048i(jSONObject));
                            IntentHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.d
                                @Override // java.lang.Runnable
                                public final void run() {
                                    IntentHandlerActivity.C10936d.this.m56800j(bundle);
                                }
                            });
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        return;
                    }
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_error_login);
            }
            ToastUtils.m89271s(m118743r0, 400L);
            IntentHandlerActivity.this.finish();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            IntentHandlerActivity.this.m56815c4();
            if (obj != null) {
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (jSONObject2.isNull("data")) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(jSONObject2.getString("data"));
                    }
                    final ContactProfile contactProfile = new ContactProfile(jSONObject);
                    if (CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        IntentHandlerActivity.this.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                IntentHandlerActivity.C10936d.this.m56797g(contactProfile);
                            }
                        });
                        return;
                    }
                    IntentHandlerActivity intentHandlerActivity = IntentHandlerActivity.this;
                    final String str = this.f55237a;
                    final String str2 = this.f55238b;
                    intentHandlerActivity.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            IntentHandlerActivity.C10936d.this.m56798h(contactProfile, str, str2);
                        }
                    });
                    return;
                } catch (NullPointerException e11) {
                    e = e11;
                    AbstractC23350e.m122774d(IntentHandlerActivity.f55225c0, e.getMessage());
                    ToastUtils.m89271s(IntentHandlerActivity.this.getString(AbstractC8020f0.error_general), 400L);
                    IntentHandlerActivity.this.finish();
                    return;
                } catch (JSONException e12) {
                    e = e12;
                    AbstractC23350e.m122774d(IntentHandlerActivity.f55225c0, e.getMessage());
                    ToastUtils.m89271s(IntentHandlerActivity.this.getString(AbstractC8020f0.error_general), 400L);
                    IntentHandlerActivity.this.finish();
                    return;
                }
            }
            ToastUtils.m89271s(IntentHandlerActivity.this.getString(AbstractC8020f0.error_general), 400L);
            IntentHandlerActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.IntentHandlerActivity$e */
    /* loaded from: classes5.dex */
    public class C10937e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f55240a;

        C10937e(String str) {
            this.f55240a = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                AbstractC23152n3.m118993E0(IntentHandlerActivity.this.mo35575n1(), this.f55240a, String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s)));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                String str = "";
                if (!jSONObject.isNull("data")) {
                    str = new JSONObject(jSONObject.getString("data")).optString("text");
                }
                if (TextUtils.isEmpty(str)) {
                    str = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.bodyinvite), AbstractC23262x6.m120002o(AbstractC23304d.f113368c0.f42437s));
                }
                AbstractC23152n3.m118993E0(IntentHandlerActivity.this.mo35575n1(), this.f55240a, str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public IntentHandlerActivity() {
        this.f37914M = new C19840q0();
    }

    /* renamed from: B5 */
    private boolean m56743B5(ContactProfile contactProfile, int i11, String str) {
        boolean z11 = true;
        try {
            if (!AbstractC23057e7.m118300g(this) && C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                        C20024r.m103949w();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                    }
                } else if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                    this.f55227X = contactProfile;
                    this.f55229Z = i11;
                    this.f55230a0 = str;
                    AbstractC23034c6.m118186w0(this, new String[]{"android.permission.RECORD_AUDIO"}, 117);
                    z11 = false;
                } else {
                    AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, i11, str));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return z11;
    }

    /* renamed from: D5 */
    private boolean m56744D5(ContactProfile contactProfile, int i11, String str) {
        boolean z11 = true;
        try {
            if (!AbstractC23057e7.m118300g(this) && C23055e5.m118272g(true)) {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                        C20024r.m103949w();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                    }
                } else {
                    Context appContext = MainApplication.getAppContext();
                    String[] strArr = AbstractC23034c6.f112033j;
                    if (AbstractC23034c6.m118167n(appContext, strArr) != 0) {
                        this.f55227X = contactProfile;
                        this.f55229Z = i11;
                        this.f55230a0 = str;
                        AbstractC23034c6.m118186w0(this, strArr, 113);
                        z11 = false;
                    } else {
                        AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, true, i11, str));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return z11;
    }

    /* renamed from: E5 */
    private boolean m56746E5(ContactProfile contactProfile, int i11, int i12) {
        this.f55229Z = i11;
        boolean z11 = true;
        try {
            if (AbstractC23057e7.m118300g(this) || !C23055e5.m118272g(true)) {
                return true;
            }
            try {
                if (C20024r.m103941j()) {
                    if (TextUtils.equals(String.valueOf(C20024r.m103938d()), contactProfile.f42434r)) {
                        C20024r.m103949w();
                        finish();
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_make_newcall_while_calling));
                        return true;
                    }
                } else {
                    if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) != 0) {
                        try {
                            AbstractC23136l9.m118735o1(this);
                        } catch (Exception unused) {
                        }
                        this.f55227X = contactProfile;
                        AbstractC23034c6.m118186w0(this, new String[]{"android.permission.RECORD_AUDIO"}, i12);
                        return false;
                    }
                    if (AbstractC23165o5.m119333b()) {
                        AbstractC23152n3.m119058n0(this, contactProfile, false, i11);
                    } else {
                        this.f55227X = null;
                        AbstractC23306f.m120722w0().m101508a(new C2279a.a(contactProfile.f42434r, contactProfile.m40383Q(true, false), contactProfile.f42446v, false, i11));
                    }
                    finish();
                }
                return false;
            } catch (Exception e11) {
                e = e11;
                z11 = false;
                e.printStackTrace();
                return z11;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F4 */
    public /* synthetic */ void m56747F4(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H4 */
    public /* synthetic */ void m56749H4(InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile = this.f55227X;
        if (contactProfile != null && m56744D5(contactProfile, this.f55229Z, this.f55230a0)) {
            finish();
        }
    }

    /* renamed from: M5 */
    private KeyEventCallbackC17462c m56752M5(ContactProfile contactProfile) {
        this.f55231b0 = contactProfile;
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(AbstractC7409c0.dialog_hint_user_create_shortcut_call, (ViewGroup) null);
        linearLayout.findViewById(AbstractC6918a0.btn_create_now).setOnClickListener(this);
        linearLayout.findViewById(AbstractC6918a0.btn_remind_later).setOnClickListener(this);
        C8009j.a aVar = new C8009j.a(this);
        aVar.m43177z(linearLayout).m43157f(0).m43155d(true).m43167p(new InterfaceC17463d.c() { // from class: h40.w
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                IntentHandlerActivity.this.m56769i5(interfaceC17463d);
            }
        });
        C8009j m43152a = aVar.m43152a();
        if (m43152a != null) {
            m43152a.m92855F(new InterfaceC17463d.e() { // from class: h40.x
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.e
                /* renamed from: Tv */
                public final void mo12457Tv(InterfaceC17463d interfaceC17463d) {
                    IntentHandlerActivity.this.m56773o5(interfaceC17463d);
                }
            });
        }
        return m43152a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N4 */
    public /* synthetic */ void m56753N4(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O4 */
    public /* synthetic */ void m56754O4(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* renamed from: R5 */
    private KeyEventCallbackC17462c m56756R5(ContactProfile contactProfile, String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(AbstractC7409c0.dialog_user_info_call, (ViewGroup) null);
        CircleImage circleImage = (CircleImage) linearLayout.findViewById(AbstractC6918a0.img_avatar);
        RobotoTextView robotoTextView = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_phone_number);
        RobotoTextView robotoTextView2 = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_name);
        RobotoButton robotoButton = (RobotoButton) linearLayout.findViewById(AbstractC6918a0.btn_video_call);
        RobotoButton robotoButton2 = (RobotoButton) linearLayout.findViewById(AbstractC6918a0.btn_add_friend);
        C23528a c23528a = new C23528a((Activity) this);
        this.f55227X = contactProfile;
        this.f55228Y = str;
        linearLayout.findViewById(AbstractC6918a0.btn_call_native).setOnClickListener(this);
        linearLayout.findViewById(AbstractC6918a0.btn_chat).setOnClickListener(this);
        linearLayout.findViewById(AbstractC6918a0.btn_voice_call).setOnClickListener(this);
        robotoButton.setOnClickListener(this);
        robotoButton2.setOnClickListener(this);
        boolean m114558y = AbstractC21935u.m114558y(contactProfile.f42434r);
        int i11 = 8;
        if (m114558y) {
            robotoButton2.setVisibility(8);
            if (C20011e.f98374a.m103841b(58)) {
                i11 = 0;
            }
            robotoButton.setVisibility(i11);
        } else {
            robotoButton2.setVisibility(0);
            robotoButton.setVisibility(8);
            m56790a6(contactProfile, new WeakReference(robotoButton2));
        }
        if (!TextUtils.isEmpty(contactProfile.f42446v) && !contactProfile.f42446v.equalsIgnoreCase("null") && !C23302b.f113247a.m120523d(contactProfile.f42446v)) {
            ((C23528a) c23528a.m123612r(circleImage)).m123618x(contactProfile.f42446v, C23278z2.m120143n());
        } else {
            ((C23528a) c23528a.m123612r(circleImage)).m123615u(C16640q2.m88404a().mo88412f(contactProfile.m40418n0(), C2343e.m12308b(contactProfile.f42434r, false, true)));
        }
        robotoTextView2.setText(AbstractC23244v8.m119743g(contactProfile.m40383Q(true, false), 16));
        robotoTextView.setText(str);
        C8009j.a aVar = new C8009j.a(this);
        aVar.m43177z(linearLayout).m43157f(0).m43155d(true).m43167p(new InterfaceC17463d.c() { // from class: h40.y
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                IntentHandlerActivity.this.m56775s5(interfaceC17463d);
            }
        });
        m56777t4(true, m114558y, !TextUtils.isEmpty(contactProfile.m40371J()));
        return aVar.m43152a();
    }

    /* renamed from: S5 */
    private KeyEventCallbackC17462c m56757S5(String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(AbstractC7409c0.dialog_user_info_invite, (ViewGroup) null);
        RobotoTextView robotoTextView = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_main_info);
        RobotoTextView robotoTextView2 = (RobotoTextView) linearLayout.findViewById(AbstractC6918a0.tv_sub_info);
        CircleImage circleImage = (CircleImage) linearLayout.findViewById(AbstractC6918a0.img_avatar);
        this.f55227X = null;
        this.f55228Y = str;
        linearLayout.findViewById(AbstractC6918a0.btn_call_native).setOnClickListener(this);
        linearLayout.findViewById(AbstractC6918a0.btn_invite).setOnClickListener(this);
        C31901e8 m2800f = AbstractC0906d0.m2800f(this, str2);
        if (m2800f != null) {
            robotoTextView.setText(AbstractC23244v8.m119743g(m2800f.m153295h(), 16));
            robotoTextView2.setText(str);
            if (AbstractC23034c6.m118167n(this, new String[]{"android.permission.READ_CONTACTS"}) == 0 && C8937j0.m47663l("phonebook_query_photo_for_non_zalo_user")) {
                ((C23528a) new C23528a((Activity) this).m123612r(circleImage)).m123615u(AbstractC23028c0.m118092l(this, str, AbstractC16803z.ava_stranger, new SensitiveData("phonebook_query_photo_for_non_zalo_user", "social_friend")));
            }
        } else {
            robotoTextView.setText(str);
        }
        C8009j.a aVar = new C8009j.a(this);
        boolean z11 = true;
        aVar.m43177z(linearLayout).m43157f(0).m43155d(true).m43167p(new InterfaceC17463d.c() { // from class: h40.u
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
            /* renamed from: p7 */
            public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                IntentHandlerActivity.this.m56779u5(interfaceC17463d);
            }
        });
        if (m2800f == null) {
            z11 = false;
        }
        m56777t4(false, false, z11);
        return aVar.m43152a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V4 */
    public /* synthetic */ void m56760V4(InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile = this.f55227X;
        if (contactProfile != null) {
            m56746E5(contactProfile, this.f55229Z, 146);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m56762Y2(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a5 */
    public /* synthetic */ void m56763a5(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b3 */
    public /* synthetic */ void m56764b3(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23034c6.m118186w0(this, AbstractC23034c6.f112030g, 124);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d3 */
    public /* synthetic */ void m56765d3(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d5 */
    public /* synthetic */ void m56766d5(InterfaceC17463d interfaceC17463d, int i11) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e5 */
    public /* synthetic */ void m56767e5(InterfaceC17463d interfaceC17463d, int i11) {
        ContactProfile contactProfile = this.f55227X;
        if (contactProfile != null && m56743B5(contactProfile, this.f55229Z, this.f55230a0)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i5 */
    public /* synthetic */ void m56769i5(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* renamed from: m4 */
    private void m56771m4(String str) {
        m56814B8(null, false);
        AbstractC23136l9.m118738p1(this);
        if (str.startsWith("%")) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
            }
        }
        String m118285k = AbstractC23056e6.m118285k(str);
        if (!TextUtils.isEmpty(m118285k) && !m118285k.equals(AbstractC23056e6.f112062a)) {
            String m121704a5 = AbstractC23309i.m121704a5();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C10936d(str, m118285k));
            c0766k.mo1416E3(m118285k, m121704a5, 4, true);
            return;
        }
        m56815c4();
        AbstractC23152n3.m119005K0(mo35575n1(), str);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o5 */
    public /* synthetic */ void m56773o5(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s5 */
    public /* synthetic */ void m56775s5(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* renamed from: t4 */
    private void m56777t4(boolean z11, boolean z12, boolean z13) {
        String str;
        if (z11) {
            if (z12) {
                if (z13) {
                    str = "400605";
                } else {
                    str = "400604";
                }
            } else if (z13) {
                str = "400603";
            } else {
                str = "400602";
            }
        } else if (z13) {
            str = "400601";
        } else {
            str = "400600";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: u4 */
    private boolean m56778u4() {
        return AbstractC23306f.m120567B1().m99703h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u5 */
    public /* synthetic */ void m56779u5(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public static /* synthetic */ void m56781v4(Intent intent, C22688w c22688w) {
        int i11;
        try {
            boolean hasExtra = intent.hasExtra("ZALO_INTENT_SOURCE");
            String str = f55226d0;
            if (hasExtra) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            c22688w.m117350h(str, i11);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y4 */
    public /* synthetic */ C24848g0 m56784y4() {
        finish();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z4 */
    public /* synthetic */ void m56786z4(InterfaceC17463d interfaceC17463d) {
        finish();
    }

    /* renamed from: H5 */
    void m56787H5(String str) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C10937e(str));
        c0766k.m1810G(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a5, code lost:            if (r5 == false) goto L151;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012a, code lost:            if (r5 == false) goto L80;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cc, code lost:            if (r6 != false) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0219, code lost:            if (r6 != false) goto L122;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0267, code lost:            if (r5 == false) goto L137;     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04fd A[Catch: Exception -> 0x0040, TryCatch #1 {Exception -> 0x0040, blocks: (B:12:0x0027, B:13:0x002f, B:18:0x00ef, B:20:0x00f4, B:22:0x00f9, B:25:0x012c, B:26:0x0134, B:28:0x0100, B:31:0x0125, B:37:0x0121, B:38:0x0139, B:41:0x01ce, B:42:0x01d6, B:44:0x0141, B:46:0x01c7, B:63:0x01c4, B:64:0x01db, B:67:0x021b, B:68:0x0223, B:70:0x01e2, B:72:0x0214, B:82:0x0211, B:83:0x0228, B:86:0x0269, B:87:0x0271, B:89:0x022f, B:92:0x0262, B:98:0x025e, B:99:0x0276, B:102:0x02a7, B:103:0x02af, B:105:0x027d, B:108:0x02a0, B:114:0x029c, B:115:0x02b4, B:117:0x02ba, B:119:0x02c0, B:121:0x02c8, B:126:0x02de, B:128:0x02e4, B:130:0x02ee, B:132:0x02f7, B:134:0x02fc, B:136:0x0301, B:138:0x030a, B:140:0x0312, B:162:0x0390, B:163:0x039c, B:165:0x03a9, B:168:0x03db, B:167:0x03ca, B:174:0x03c7, B:175:0x03e0, B:223:0x04ef, B:178:0x04fd, B:180:0x0504, B:181:0x050c, B:226:0x0511, B:228:0x0517, B:230:0x0521, B:232:0x052a, B:234:0x0548, B:236:0x056c, B:238:0x0572, B:241:0x057b, B:243:0x059d, B:245:0x0551, B:247:0x055d, B:250:0x05ab, B:253:0x0034, B:256:0x0043, B:259:0x004e, B:262:0x005a, B:265:0x0066, B:268:0x0072, B:271:0x007c, B:274:0x0086, B:277:0x0090, B:280:0x009a, B:283:0x00a4, B:286:0x00ae, B:289:0x00b9, B:292:0x00c4, B:295:0x00ce, B:34:0x0108, B:143:0x0318, B:145:0x031e, B:147:0x0324, B:149:0x034f, B:151:0x0357, B:152:0x0361, B:154:0x036d, B:157:0x0372, B:158:0x037c, B:159:0x0386, B:95:0x0237, B:75:0x01ea, B:77:0x01f0, B:111:0x0285, B:171:0x03b1, B:49:0x0149, B:51:0x014f, B:53:0x0163, B:55:0x0169, B:57:0x01a3, B:59:0x01ae, B:60:0x01ba), top: B:11:0x0027, inners: #0, #2, #3, #4, #5, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0504 A[Catch: Exception -> 0x0040, TryCatch #1 {Exception -> 0x0040, blocks: (B:12:0x0027, B:13:0x002f, B:18:0x00ef, B:20:0x00f4, B:22:0x00f9, B:25:0x012c, B:26:0x0134, B:28:0x0100, B:31:0x0125, B:37:0x0121, B:38:0x0139, B:41:0x01ce, B:42:0x01d6, B:44:0x0141, B:46:0x01c7, B:63:0x01c4, B:64:0x01db, B:67:0x021b, B:68:0x0223, B:70:0x01e2, B:72:0x0214, B:82:0x0211, B:83:0x0228, B:86:0x0269, B:87:0x0271, B:89:0x022f, B:92:0x0262, B:98:0x025e, B:99:0x0276, B:102:0x02a7, B:103:0x02af, B:105:0x027d, B:108:0x02a0, B:114:0x029c, B:115:0x02b4, B:117:0x02ba, B:119:0x02c0, B:121:0x02c8, B:126:0x02de, B:128:0x02e4, B:130:0x02ee, B:132:0x02f7, B:134:0x02fc, B:136:0x0301, B:138:0x030a, B:140:0x0312, B:162:0x0390, B:163:0x039c, B:165:0x03a9, B:168:0x03db, B:167:0x03ca, B:174:0x03c7, B:175:0x03e0, B:223:0x04ef, B:178:0x04fd, B:180:0x0504, B:181:0x050c, B:226:0x0511, B:228:0x0517, B:230:0x0521, B:232:0x052a, B:234:0x0548, B:236:0x056c, B:238:0x0572, B:241:0x057b, B:243:0x059d, B:245:0x0551, B:247:0x055d, B:250:0x05ab, B:253:0x0034, B:256:0x0043, B:259:0x004e, B:262:0x005a, B:265:0x0066, B:268:0x0072, B:271:0x007c, B:274:0x0086, B:277:0x0090, B:280:0x009a, B:283:0x00a4, B:286:0x00ae, B:289:0x00b9, B:292:0x00c4, B:295:0x00ce, B:34:0x0108, B:143:0x0318, B:145:0x031e, B:147:0x0324, B:149:0x034f, B:151:0x0357, B:152:0x0361, B:154:0x036d, B:157:0x0372, B:158:0x037c, B:159:0x0386, B:95:0x0237, B:75:0x01ea, B:77:0x01f0, B:111:0x0285, B:171:0x03b1, B:49:0x0149, B:51:0x014f, B:53:0x0163, B:55:0x0169, B:57:0x01a3, B:59:0x01ae, B:60:0x01ba), top: B:11:0x0027, inners: #0, #2, #3, #4, #5, #6, #9 }] */
    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity
    /* renamed from: Q2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void mo56788Q2(final Intent intent) {
        char c11;
        if (intent == null || C32150v9.f148254a.m155132g()) {
            return;
        }
        String action = intent.getAction();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("action:");
        sb2.append(action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        String str = null;
        f55226d0 = null;
        try {
            boolean z11 = false;
            boolean z12 = true;
            switch (action.hashCode()) {
                case -1906461158:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_OPEN_BACKUP_RESTORE")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1775491510:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_CALL")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1550042623:
                    if (action.equals("com.zing.zalo.action.NOTI_CALLBACK")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1408275932:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_SCAN_QRCODE")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1173745501:
                    if (action.equals("android.intent.action.CALL")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1173708363:
                    if (action.equals("android.intent.action.DIAL")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1173447682:
                    if (action.equals("android.intent.action.MAIN")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1173171990:
                    if (action.equals("android.intent.action.VIEW")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1149384406:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_CALENDAR")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1034970958:
                    if (action.equals("android.intent.action.ACTION_SHOW_CREATE_SHORTCUT_CALL")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 212250862:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_SWITCH_ACCOUNT")) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 286132056:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_GLOBAL_SEARCH")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 389590948:
                    if (action.equals("com.zing.zalo.action.MAKE_CALL_IN_APP")) {
                        c11 = 14;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 796927444:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_MINI_CHAT")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1994017137:
                    if (action.equals("com.zing.zalo.action.SHORTCUT_POST_FEED")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    String dataString = intent.getDataString();
                    if (dataString != null) {
                        if (dataString.toLowerCase().startsWith("tel:")) {
                            m56771m4(dataString.substring(4));
                            return;
                        }
                        URI uri = new URI(dataString);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("dataString:");
                        sb3.append(dataString);
                        if ("zalo".equalsIgnoreCase(uri.getScheme())) {
                            str = dataString.replaceFirst("zalo://", "http://");
                        } else if ("http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme())) {
                            str = dataString;
                        }
                        if (str != null && str.length() != 0 && !str.equals(f55226d0)) {
                            f55226d0 = str;
                            final C22688w c22688w = new C22688w();
                            c22688w.mo117295a(new C10933a(null, this, false, c22688w));
                            AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: h40.v
                                @Override // java.lang.Runnable
                                public final void run() {
                                    IntentHandlerActivity.m56781v4(intent, c22688w);
                                }
                            });
                            return;
                        }
                        AbstractC20110a.m104535d("handleIntent: RESULT_CODE_UNKNOWN_ERROR", new Object[0]);
                        setResult(1);
                        finish();
                        return;
                    }
                    finish();
                    return;
                case 1:
                    if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                        try {
                            if (AbstractC23152n3.m119023T0(intent)) {
                                String trim = new String(AESUtils.m39915a(CoreUtility.f89225a, AbstractC19509c.m101978a(intent.getExtras().getString(ZinstantMetaConstant.TARGET_VIEWPORT)))).trim();
                                String string = intent.getExtras().getString("owner");
                                boolean z13 = intent.getExtras().getBoolean("from_dynamic_shortcut", false);
                                try {
                                    if (AbstractC23352g.m122788d(CoreUtility.f89233i).equals(string)) {
                                        ContactProfile contactProfile = new ContactProfile(trim);
                                        if (contactProfile.m40374K0()) {
                                            C31973j5 m40389U = contactProfile.m40389U();
                                            if (m40389U == null) {
                                                ToastUtils.m89270r(getString(AbstractC8020f0.str_delete_group_message));
                                                z11 = true;
                                            } else {
                                                contactProfile.f42437s = m40389U.m153793y();
                                                contactProfile.f42440t = m40389U.m153795z();
                                                contactProfile.f42446v = m40389U.m153756e();
                                                contactProfile.f42428p = 1;
                                            }
                                        } else {
                                            ContactProfile m141809c = C28203u6.f131407a.m141809c(contactProfile.f42434r);
                                            if (m141809c != null) {
                                                contactProfile = m141809c;
                                            }
                                            contactProfile.f42428p = 0;
                                        }
                                        if (!z11 && (!C21927m.m114302u().m114345m(contactProfile.f42434r) || TextUtils.isEmpty(AbstractC23309i.m122303q0()))) {
                                            if (C18922m.m99140n(contactProfile) && AbstractC23034c6.m118126L(MainApplication.getAppContext()) && AbstractC23309i.m121966h2() && !AbstractC26683d.f126391B) {
                                                Bundle m140776b = new C27870vb(trim).m140780g(contactProfile).m140776b();
                                                m140776b.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                                m140776b.putBoolean("from_dynamic_shortcut", z13);
                                                C18922m.m99141t().m99148R(m140776b, contactProfile);
                                                AbstractC23136l9.m118678T0(mo35575n1());
                                            } else {
                                                Bundle m140776b2 = new C27870vb(trim).m140780g(contactProfile).m140776b();
                                                m140776b2.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                                m140776b2.putBoolean("from_dynamic_shortcut", z13);
                                                startActivity(AbstractC23152n3.m119002J(m140776b2));
                                            }
                                        }
                                        z12 = z11;
                                    } else {
                                        ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                                    }
                                    z11 = z13;
                                } catch (Exception e11) {
                                    e = e11;
                                    z11 = z13;
                                    e.printStackTrace();
                                    ToastUtils.m89270r(getString(AbstractC8020f0.error_general));
                                    if (z11) {
                                    }
                                    if (z12) {
                                    }
                                    finish();
                                    return;
                                }
                            } else {
                                ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    }
                    if (z11) {
                        AbstractC23647d.m123897g("38143");
                    }
                    if (z12) {
                        startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    }
                    finish();
                    return;
                case 2:
                    if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                        try {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                            bundle.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 4);
                            startActivity(AbstractC23152n3.m119000I(bundle));
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        finish();
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_open_shortcut_fail));
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case 3:
                    if (!TextUtils.isEmpty(CoreUtility.f89233i) && !m56778u4()) {
                        try {
                            if (AbstractC23152n3.m119023T0(intent)) {
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    String trim2 = new String(AESUtils.m39915a(CoreUtility.f89225a, AbstractC19509c.m101978a(extras.getString(ZinstantMetaConstant.TARGET_VIEWPORT)))).trim();
                                    if (AbstractC23352g.m122788d(CoreUtility.f89233i).equals(intent.getExtras().getString("owner"))) {
                                        ContactProfile m141809c2 = C28203u6.f131407a.m141809c(trim2);
                                        if (m141809c2 == null) {
                                            m141809c2 = new ContactProfile(trim2);
                                            m141809c2.f42428p = 0;
                                        }
                                        this.f55231b0 = m141809c2;
                                        if (m56746E5(m141809c2, 54, 124)) {
                                            finish();
                                            return;
                                        }
                                        return;
                                    }
                                    ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                                } else {
                                    ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                                }
                            } else {
                                ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                            }
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            ToastUtils.m89270r(getString(AbstractC8020f0.error_general));
                        }
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case 4:
                    m35549B2(3, intent.getExtras());
                    return;
                case 5:
                case 6:
                    String dataString2 = intent.getDataString();
                    if (dataString2 != null) {
                        if (dataString2.toLowerCase().startsWith("tel:")) {
                            m56771m4(dataString2.substring(4));
                            return;
                        } else {
                            m56771m4(dataString2);
                            return;
                        }
                    }
                    finish();
                    return;
                case 7:
                    Set<String> categories = intent.getCategories();
                    if (categories != null && categories.size() > 0 && categories.contains("android.intent.category.NOTIFICATION_PREFERENCES")) {
                        startActivity(AbstractC23152n3.m119012O(SettingNotificationV2View.class, null));
                        finish();
                        AbstractC23647d.m123906p("37200");
                        AbstractC23647d.m123893c();
                        return;
                    }
                    return;
                case '\b':
                    if (AbstractC23309i.m122490v2()) {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            try {
                                Bundle bundle2 = new Bundle();
                                bundle2.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                bundle2.putBoolean("from_dynamic_shortcut", true);
                                bundle2.putInt("SHOW_WITH_FLAGS", 16777216);
                                startActivity(C22438j.m115950r(bundle2, false));
                            } catch (Exception e15) {
                                e15.printStackTrace();
                            }
                            AbstractC23647d.m123897g("38144");
                            break;
                        }
                        z11 = true;
                        AbstractC23647d.m123897g("38144");
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case '\t':
                    if (AbstractC23309i.m122490v2()) {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            try {
                                Bundle bundle3 = new Bundle();
                                bundle3.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                bundle3.putBoolean("from_dynamic_shortcut", true);
                                bundle3.putInt("SHOW_WITH_FLAGS", 16777216);
                                bundle3.putString("EXTRA_OPEN_SOURCE_POSITION", "6");
                                bundle3.putString("EXTRA_OPEN_SOURCE_ACTION", "0");
                                startActivity(AbstractC23152n3.m119020S(SearchGlobalView.class, bundle3, false));
                            } catch (Exception e16) {
                                e16.printStackTrace();
                            }
                            AbstractC23647d.m123897g("38145");
                            break;
                        }
                        z11 = true;
                        AbstractC23647d.m123897g("38145");
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case '\n':
                    if (AbstractC23309i.m122490v2()) {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            try {
                                if (AbstractC22470k.m116151c()) {
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                    bundle4.putBoolean("from_dynamic_shortcut", true);
                                    bundle4.putInt("extra_src", 4);
                                    startActivity(AbstractC23152n3.m119020S(AbstractC26412d.m136218g(), bundle4, false));
                                } else {
                                    z11 = true;
                                }
                                z12 = z11;
                            } catch (Exception e17) {
                                e17.printStackTrace();
                            }
                        }
                        AbstractC23647d.m123897g("38146");
                        break;
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case 11:
                    if (AbstractC23309i.m122490v2()) {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            try {
                                if (AbstractC23152n3.m119021S0(intent)) {
                                    if (AbstractC23352g.m122788d(CoreUtility.f89233i).equals(intent.getExtras().getString("owner"))) {
                                        if (AbstractC23309i.m121529Vf()) {
                                            String trim3 = new String(AESUtils.m39915a(CoreUtility.f89225a, AbstractC19509c.m101978a(intent.getExtras().getString(ZinstantMetaConstant.TARGET_VIEWPORT)))).trim();
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                            bundle5.putBoolean("from_dynamic_shortcut", true);
                                            bundle5.putString("EXTRA_SHORTCUT_SWITCH_ACCOUNT_UID", trim3);
                                            bundle5.putInt("SHOW_WITH_FLAGS", 16777216);
                                            startActivity(AbstractC23152n3.m119020S(SwitchAccountView.class, bundle5, false));
                                            z12 = z11;
                                        } else {
                                            ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_type_feature_off));
                                        }
                                    } else {
                                        ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                                    }
                                    z11 = true;
                                    z12 = z11;
                                } else {
                                    ToastUtils.m89270r(getString(AbstractC8020f0.str_shortcut_mini_chat_error_target_user));
                                }
                            } catch (Exception e18) {
                                e18.printStackTrace();
                            }
                        }
                        AbstractC23647d.m123897g("38147");
                        break;
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case '\f':
                    if (AbstractC23309i.m122490v2()) {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            try {
                                Bundle bundle6 = new Bundle();
                                bundle6.putBoolean("ACTION_SHOW_ZALOVIEW_FROM_SHORTCUT", true);
                                bundle6.putBoolean("from_dynamic_shortcut", true);
                                bundle6.putInt("SHOW_WITH_FLAGS", 16777216);
                                startActivity(AbstractC23152n3.m119020S(UpdateStatusView.class, bundle6, false));
                            } catch (Exception e19) {
                                e19.printStackTrace();
                            }
                            AbstractC23647d.m123897g("38148");
                            break;
                        }
                        z11 = true;
                        AbstractC23647d.m123897g("38148");
                    }
                    startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
                    finish();
                    return;
                case '\r':
                    m56791e4(intent);
                    return;
                case 14:
                    m56789X3(intent);
                    return;
                default:
                    return;
            }
        } catch (Exception e21) {
            AbstractC20110a.m104539h(e21);
        }
        AbstractC20110a.m104539h(e21);
    }

    /* renamed from: X3 */
    void m56789X3(Intent intent) {
        boolean m56743B5;
        try {
            if (!TextUtils.isEmpty(CoreUtility.f89233i) && intent != null) {
                String stringExtra = intent.getStringExtra("uid");
                String stringExtra2 = intent.getStringExtra("call_param");
                boolean booleanExtra = intent.getBooleanExtra("isVideoCall", false);
                int intExtra = intent.getIntExtra("source_call", 0);
                ContactProfile contactProfile = new ContactProfile(stringExtra);
                if (stringExtra2 != null) {
                    if (booleanExtra) {
                        m56743B5 = m56744D5(contactProfile, intExtra, stringExtra2);
                    } else {
                        m56743B5 = m56743B5(contactProfile, intExtra, stringExtra2);
                    }
                    if (!m56743B5) {
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.m89270r(getString(AbstractC8020f0.error_general));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity
    /* renamed from: a2 */
    public KeyEventCallbackC17462c mo35560a2(int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return super.mo35560a2(i11, bundle);
                    }
                    return AddFriendView.Companion.m78064c(this, bundle.getString("reach_limit_content"), new InterfaceC18494a() { // from class: h40.q
                        @Override // en0.InterfaceC18494a
                        /* renamed from: V4 */
                        public final Object mo12V4() {
                            C24848g0 m56784y4;
                            m56784y4 = IntentHandlerActivity.this.m56784y4();
                            return m56784y4;
                        }
                    });
                }
                try {
                    AbstractC23136l9.m118738p1(this);
                    ContactProfile contactProfile = (ContactProfile) bundle.getParcelable("EXTRA_CONTACT");
                    if (contactProfile != null) {
                        return m56752M5(contactProfile);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else {
                ContactProfile contactProfile2 = (ContactProfile) bundle.getParcelable("contact");
                String string = bundle.getString("phone_number");
                String string2 = bundle.getString("converted_phone_number");
                if (contactProfile2 != null && !TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    return m56756R5(contactProfile2, string, string2);
                }
            }
        } else {
            String string3 = bundle.getString("phone_number");
            String string4 = bundle.getString("converted_phone_number");
            if (!TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4)) {
                return m56757S5(string3, string4);
            }
        }
        return null;
    }

    /* renamed from: a6 */
    public void m56790a6(ContactProfile contactProfile, WeakReference weakReference) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C10934b(weakReference));
            c0766k.mo1615ca(contactProfile.f42434r);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.activity.ZaloActivity
    /* renamed from: c2 */
    public void mo35565c2(int i11, KeyEventCallbackC17462c keyEventCallbackC17462c, Bundle bundle) {
        super.mo35565c2(i11, keyEventCallbackC17462c, bundle);
        if (i11 == 3) {
            try {
                ContactProfile contactProfile = (ContactProfile) bundle.getParcelable("EXTRA_CONTACT");
                if (contactProfile != null) {
                    m56792f6(keyEventCallbackC17462c, contactProfile);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e4 */
    void m56791e4(Intent intent) {
        int i11;
        boolean m56746E5;
        try {
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                AbstractC3096i0.m15552n();
                if (intent != null) {
                    ContactProfile contactProfile = (ContactProfile) intent.getParcelableExtra("contactProfile");
                    String stringExtra = intent.getStringExtra("notiType");
                    String stringExtra2 = intent.getStringExtra("subType");
                    boolean booleanExtra = intent.getBooleanExtra("callType", false);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        C28023b6.m141250h0().m141296K(stringExtra, stringExtra2);
                    }
                    if (contactProfile != null) {
                        if (intent.hasExtra("sourceType")) {
                            i11 = intent.getIntExtra("sourceType", 0);
                        } else if (C28023b6.m141250h0().m141297K0(stringExtra)) {
                            AbstractC23647d.m123897g("1608602");
                            i11 = 11;
                        } else {
                            i11 = 9;
                        }
                        if (booleanExtra) {
                            m56746E5 = m56816f3(i11, contactProfile.f42434r, 0);
                        } else {
                            m56746E5 = m56746E5(contactProfile, i11, 146);
                        }
                        if (!m56746E5) {
                            return;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            ToastUtils.m89270r(getString(AbstractC8020f0.error_general));
        }
        finish();
    }

    /* renamed from: f6 */
    void m56792f6(KeyEventCallbackC17462c keyEventCallbackC17462c, ContactProfile contactProfile) {
        RobotoTextView robotoTextView;
        RobotoTextView robotoTextView2;
        this.f55231b0 = contactProfile;
        View m92864h = keyEventCallbackC17462c.m92864h(AbstractC6918a0.txt_description);
        View m92864h2 = keyEventCallbackC17462c.m92864h(AbstractC6918a0.btn_create_now);
        View m92864h3 = keyEventCallbackC17462c.m92864h(AbstractC6918a0.btn_remind_later);
        RobotoTextView robotoTextView3 = null;
        if (m92864h instanceof RobotoTextView) {
            robotoTextView = (RobotoTextView) m92864h;
        } else {
            robotoTextView = null;
        }
        if (m92864h2 instanceof RobotoTextView) {
            robotoTextView2 = (RobotoTextView) m92864h2;
        } else {
            robotoTextView2 = null;
        }
        if (m92864h3 instanceof RobotoTextView) {
            robotoTextView3 = (RobotoTextView) m92864h3;
        }
        ContactProfile contactProfile2 = this.f55231b0;
        if (contactProfile2 != null && robotoTextView != null && robotoTextView2 != null && robotoTextView3 != null) {
            String m40383Q = contactProfile2.m40383Q(true, false);
            if (!TextUtils.isEmpty(m40383Q) && m40383Q.length() > 10) {
                m40383Q = m40383Q.substring(0, 10).concat("…");
            }
            robotoTextView.setText(new SpannableString(Html.fromHtml(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_description), m40383Q))));
            robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_create));
            robotoTextView3.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_remind_later));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_call_native) {
            String[] strArr = AbstractC23034c6.f112035l;
            if (AbstractC23034c6.m118116D(this, strArr)) {
                if (!TextUtils.isEmpty(this.f55228Y)) {
                    AbstractC23152n3.m118996G(this, this.f55228Y);
                    finish();
                    return;
                }
                return;
            }
            AbstractC23034c6.m118186w0(this, strArr, 123);
            return;
        }
        if (id2 == AbstractC6918a0.btn_invite) {
            if (!TextUtils.isEmpty(this.f55228Y)) {
                m56787H5(this.f55228Y);
                finish();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_chat) {
            ContactProfile contactProfile = this.f55227X;
            if (contactProfile != null) {
                startActivity(AbstractC23152n3.m119002J(new C27870vb(contactProfile.mo2478b()).m140780g(this.f55227X).m140776b()));
                finish();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_voice_call) {
            ContactProfile contactProfile2 = this.f55227X;
            if (contactProfile2 != null) {
                m56746E5(contactProfile2, 57, 146);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_video_call) {
            ContactProfile contactProfile3 = this.f55227X;
            if (contactProfile3 != null) {
                m56816f3(58, contactProfile3.f42434r, 0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_add_friend) {
            ContactProfile contactProfile4 = this.f55227X;
            if (contactProfile4 != null) {
                startActivity(AbstractC23152n3.m119006L(contactProfile4, 3));
                finish();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_create_now) {
            ContactProfile contactProfile5 = this.f55231b0;
            if (contactProfile5 != null) {
                AbstractC23152n3.m119061p(this, contactProfile5.f42434r, contactProfile5.m40383Q(true, false), this.f55231b0.f42446v);
            }
            finish();
            return;
        }
        if (id2 == AbstractC6918a0.btn_remind_later) {
            ContactProfile contactProfile6 = this.f55231b0;
            if (contactProfile6 != null) {
                AbstractC23304d.f113321R.put(contactProfile6.f42434r, Boolean.TRUE);
                C0824j.m2153b(new C10935c());
            }
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        AbstractC23304d.m120531b();
        super.onCreate(bundle);
        if (C32150v9.f148254a.m155132g()) {
            startActivity(new Intent(this, (Class<?>) ZaloLauncherActivity.class));
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.IntentHandlerBaseActivity, com.zing.zalo.activity.ZaloActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (i11 != 113) {
            if (i11 != 117) {
                if (i11 != 146) {
                    if (i11 != 123) {
                        if (i11 == 124) {
                            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) == 0) {
                                ContactProfile contactProfile = this.f55231b0;
                                if (contactProfile == null || m56746E5(contactProfile, 54, 124)) {
                                    finish();
                                }
                            } else {
                                AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: h40.z
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        IntentHandlerActivity.this.m56762Y2(interfaceC17463d, i12);
                                    }
                                }, new InterfaceC17463d.d() { // from class: h40.c0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                                    /* renamed from: K8 */
                                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                                        IntentHandlerActivity.this.m56764b3(interfaceC17463d, i12);
                                    }
                                }, new InterfaceC17463d.c() { // from class: h40.d0
                                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                                    /* renamed from: p7 */
                                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                                        IntentHandlerActivity.this.m56765d3(interfaceC17463d);
                                    }
                                });
                            }
                        }
                    } else if (AbstractC23034c6.m118116D(this, AbstractC23034c6.f112035l) && !TextUtils.isEmpty(this.f55228Y)) {
                        AbstractC23152n3.m118996G(this, this.f55228Y);
                        finish();
                    }
                } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) == 0) {
                    ContactProfile contactProfile2 = this.f55227X;
                    if (contactProfile2 == null || m56746E5(contactProfile2, this.f55229Z, 146)) {
                        finish();
                    }
                } else {
                    AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: h40.e0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            IntentHandlerActivity.this.m56754O4(interfaceC17463d, i12);
                        }
                    }, new InterfaceC17463d.d() { // from class: h40.f0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                            IntentHandlerActivity.this.m56760V4(interfaceC17463d, i12);
                        }
                    }, new InterfaceC17463d.c() { // from class: h40.g0
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                        /* renamed from: p7 */
                        public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                            IntentHandlerActivity.this.m56763a5(interfaceC17463d);
                        }
                    });
                }
            } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(MainApplication.getAppContext(), new String[]{"android.permission.RECORD_AUDIO"}) == 0) {
                ContactProfile contactProfile3 = this.f55227X;
                if (contactProfile3 == null || m56743B5(contactProfile3, this.f55229Z, this.f55230a0)) {
                    finish();
                }
            } else {
                AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: h40.h0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        IntentHandlerActivity.this.m56766d5(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.d() { // from class: h40.r
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        IntentHandlerActivity.this.m56767e5(interfaceC17463d, i12);
                    }
                }, new InterfaceC17463d.c() { // from class: h40.s
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                    /* renamed from: p7 */
                    public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                        IntentHandlerActivity.this.m56786z4(interfaceC17463d);
                    }
                });
            }
        } else if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112033j) == 0) {
            ContactProfile contactProfile4 = this.f55227X;
            if (contactProfile4 == null || m56744D5(contactProfile4, this.f55229Z, this.f55230a0)) {
                finish();
            }
        } else {
            AbstractC23034c6.m118164l0(this, new InterfaceC17463d.d() { // from class: h40.t
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    IntentHandlerActivity.this.m56747F4(interfaceC17463d, i12);
                }
            }, new InterfaceC17463d.d() { // from class: h40.a0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    IntentHandlerActivity.this.m56749H4(interfaceC17463d, i12);
                }
            }, new InterfaceC17463d.c() { // from class: h40.b0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.c
                /* renamed from: p7 */
                public final void mo13013p7(InterfaceC17463d interfaceC17463d) {
                    IntentHandlerActivity.this.m56753N4(interfaceC17463d);
                }
            });
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }
}

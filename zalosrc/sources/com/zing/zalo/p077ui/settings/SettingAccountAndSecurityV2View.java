package com.zing.zalo.p077ui.settings;

import ac.C0697c0;
import ae.C0766k;
import am.AbstractC0924m0;
import am.C0927o;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.BiometricWrapper;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.CancelDeactivateAccountView;
import com.zing.zalo.p077ui.zviews.ChangePasswordView;
import com.zing.zalo.p077ui.zviews.ChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.DeactivateAccountView;
import com.zing.zalo.p077ui.zviews.HistoryLoginView;
import com.zing.zalo.p077ui.zviews.NotChangePhoneNumberView;
import com.zing.zalo.p077ui.zviews.PassCodeSettingView;
import com.zing.zalo.p077ui.zviews.PasscodeView;
import com.zing.zalo.p077ui.zviews.QRCodeViewerView;
import com.zing.zalo.p077ui.zviews.SettingSecurityView;
import com.zing.zalo.p077ui.zviews.UserInfoDetailView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import la0.C22229g7;
import me0.AbstractC23056e6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import me0.AbstractC23216t1;
import me0.C23212s8;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONArray;
import org.json.JSONObject;
import p00.C24594a;
import p133ek.AbstractC18458a;
import p173fz.C19172a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;
import p649xl.C29839hb;
import p649xl.C29866j2;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import s00.C26071f;
import s00.C26076k;
import ui0.C27280g;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* loaded from: classes6.dex */
public final class SettingAccountAndSecurityV2View extends BaseSettingView {

    /* renamed from: j1 */
    private static boolean f67574j1;

    /* renamed from: T0 */
    public C29839hb f67576T0;

    /* renamed from: U0 */
    private Deferred f67577U0;

    /* renamed from: V0 */
    private Badge f67578V0;

    /* renamed from: Y0 */
    private int f67581Y0;

    /* renamed from: Z0 */
    private BiometricWrapper f67582Z0;

    /* renamed from: a1 */
    private int f67583a1;

    /* renamed from: c1 */
    private boolean f67585c1;

    /* renamed from: d1 */
    private boolean f67586d1;

    /* renamed from: e1 */
    private int f67587e1;

    /* renamed from: g1 */
    private boolean f67589g1;

    /* renamed from: h1 */
    private boolean f67590h1;
    public static final C13115a Companion = new C13115a(null);

    /* renamed from: i1 */
    private static int f67573i1 = -1;

    /* renamed from: k1 */
    private static final C24329j f67575k1 = new C24329j("^(https)://(www\\.)?[a-zA-Z0-9._\\-@:]{2,256}\\.[a-z]{2,6}\\b([a-zA-Z0-9@:%_+\\-.~#?&/=]*)$");

    /* renamed from: W0 */
    private EnumC13116b f67579W0 = EnumC13116b.f67591q;

    /* renamed from: X0 */
    private String f67580X0 = "";

    /* renamed from: b1 */
    private String f67584b1 = "";

    /* renamed from: f1 */
    private final Object f67588f1 = new Object();

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$a */
    /* loaded from: classes6.dex */
    public static final class C13115a {
        private C13115a() {
        }

        public /* synthetic */ C13115a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m73671a() {
            return SettingAccountAndSecurityV2View.f67573i1;
        }

        /* renamed from: b */
        public final C24329j m73672b() {
            return SettingAccountAndSecurityV2View.f67575k1;
        }

        /* renamed from: c */
        public final void m73673c(int i11) {
            SettingAccountAndSecurityV2View.f67573i1 = i11;
        }

        /* renamed from: d */
        public final void m73674d(boolean z11) {
            SettingAccountAndSecurityV2View.f67574j1 = z11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$b */
    /* loaded from: classes6.dex */
    public static final class EnumC13116b {
        public static final a Companion;

        /* renamed from: q */
        public static final EnumC13116b f67591q = new EnumC13116b("DEFAULT", 0, 0);

        /* renamed from: r */
        public static final EnumC13116b f67592r = new EnumC13116b("STRONG", 1, 1);

        /* renamed from: s */
        public static final EnumC13116b f67593s = new EnumC13116b("MEDIUM", 2, 2);

        /* renamed from: t */
        public static final EnumC13116b f67594t = new EnumC13116b("WEAK", 3, 3);

        /* renamed from: u */
        public static final EnumC13116b f67595u = new EnumC13116b("CRITICAL", 4, 4);

        /* renamed from: v */
        private static final /* synthetic */ EnumC13116b[] f67596v;

        /* renamed from: w */
        private static final /* synthetic */ InterfaceC30165a f67597w;

        /* renamed from: p */
        private final int f67598p;

        /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$b$a */
        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final EnumC13116b m73676a(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    return EnumC13116b.f67591q;
                                }
                                return EnumC13116b.f67595u;
                            }
                            return EnumC13116b.f67594t;
                        }
                        return EnumC13116b.f67593s;
                    }
                    return EnumC13116b.f67592r;
                }
                return EnumC13116b.f67591q;
            }
        }

        static {
            EnumC13116b[] m73675b = m73675b();
            f67596v = m73675b;
            f67597w = AbstractC30166b.m148796a(m73675b);
            Companion = new a(null);
        }

        private EnumC13116b(String str, int i11, int i12) {
            this.f67598p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ EnumC13116b[] m73675b() {
            return new EnumC13116b[]{f67591q, f67592r, f67593s, f67594t, f67595u};
        }

        public static EnumC13116b valueOf(String str) {
            return (EnumC13116b) Enum.valueOf(EnumC13116b.class, str);
        }

        public static EnumC13116b[] values() {
            return (EnumC13116b[]) f67596v.clone();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$c */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13117c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f67599a;

        static {
            int[] iArr = new int[EnumC13116b.values().length];
            try {
                iArr[EnumC13116b.f67591q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13116b.f67592r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC13116b.f67593s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC13116b.f67594t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC13116b.f67595u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f67599a = iArr;
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$d */
    /* loaded from: classes6.dex */
    public static final class C13118d implements InterfaceC20094a {
        C13118d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:            if (r1 != false) goto L15;     */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void m73678d(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            boolean m127126v;
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            try {
                ContactProfile contactProfile = AbstractC23304d.f113368c0;
                if (contactProfile.f42341G1 == 1) {
                    settingAccountAndSecurityV2View.m73668eN().f138038t.setSubtitle("");
                    return;
                }
                String str = contactProfile.f42455y;
                if (!TextUtils.isEmpty(str)) {
                    str = AbstractC23056e6.m118281g(str, AbstractC23309i.m121704a5());
                }
                if (!TextUtils.isEmpty(str)) {
                    m127126v = AbstractC24341v.m127126v(str, AbstractC23056e6.f112062a, true);
                }
                str = AbstractC23304d.f113368c0.f42455y;
                ListItemSetting listItemSetting = settingAccountAndSecurityV2View.m73668eN().f138038t;
                AbstractC19074t.m100205c(str);
                listItemSetting.setSubtitle(str);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    AbstractC23304d.f113368c0.f42341G1 = optJSONObject.optInt("unmap_profile", 0);
                }
                final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: la0.a1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingAccountAndSecurityV2View.C13118d.m73678d(SettingAccountAndSecurityV2View.this);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$e */
    /* loaded from: classes6.dex */
    public static final class C13119e implements InterfaceC20094a {
        C13119e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m73681e(JSONObject jSONObject, SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            try {
                if (jSONObject.optInt("unmap_profile", 0) == 1) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap_deactivate_account);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    settingAccountAndSecurityV2View.m73662EN(m118743r0);
                    settingAccountAndSecurityV2View.showDialog(3);
                    return;
                }
                if (AbstractC23304d.f113346X0 == 1) {
                    int optInt = jSONObject.optInt("deactivate_status", 0);
                    if (optInt != 0) {
                        if (optInt != 1) {
                            if (optInt == 2) {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.acccount_has_been_deactivated));
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("36020");
                        long optLong = jSONObject.optLong("deactivate_datetime");
                        String optString = jSONObject.optString("deactivate_msg");
                        long optLong2 = jSONObject.optLong("confirm_time");
                        long optLong3 = jSONObject.optLong("current_time");
                        if (optLong2 > 0 && optLong > 0) {
                            Bundle bundle = new Bundle();
                            bundle.putString("EXTRA_DEACTIVATE_MESSAGE", optString);
                            bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_DATETIME", optLong);
                            bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CONFIRMTIME", optLong2);
                            bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME", optLong3);
                            bundle.putLong("EXTRA_DEACTIVATE_ACCOUNT_CURRENT_TIME_CLIENT", SystemClock.uptimeMillis());
                            bundle.putInt("source_action_cancel_deactivate", 0);
                            InterfaceC27218a m92676n2 = settingAccountAndSecurityV2View.m92676n2();
                            if (m92676n2 != null) {
                                m92676n2.mo35573l4(CancelDeactivateAccountView.class, bundle, 1, true);
                                return;
                            }
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.UNKNOWN_EXCEPTION_MSG));
                        return;
                    }
                    InterfaceC27218a m92676n22 = settingAccountAndSecurityV2View.m92676n2();
                    if (m92676n22 != null) {
                        m92676n22.mo35573l4(DeactivateAccountView.class, null, 1, true);
                        return;
                    }
                    return;
                }
                settingAccountAndSecurityV2View.removeDialog(1);
                settingAccountAndSecurityV2View.showDialog(1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m73682f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (!SettingAccountAndSecurityV2View.this.f72421L0.m92677nJ() && !SettingAccountAndSecurityV2View.this.f72421L0.m92681pJ() && !AbstractC23216t1.m119643h(SettingAccountAndSecurityV2View.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: la0.c1
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingAccountAndSecurityV2View.C13119e.m73682f(str);
                    }
                })) {
                    ToastUtils.m89265m(c20096c);
                }
            } finally {
                SettingAccountAndSecurityV2View.this.m73665HN(false);
                SettingAccountAndSecurityV2View.this.f72421L0.mo49315c4();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    final JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    int optInt = jSONObject.optInt("is_set");
                    AbstractC23304d.f113346X0 = optInt;
                    AbstractC23309i.m122550wp(optInt);
                    final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                    settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: la0.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingAccountAndSecurityV2View.C13119e.m73681e(jSONObject, settingAccountAndSecurityV2View);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingAccountAndSecurityV2View.this.m73665HN(false);
                SettingAccountAndSecurityV2View.this.f72421L0.mo49315c4();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$f */
    /* loaded from: classes6.dex */
    public static final class C13120f implements InterfaceC20094a {
        C13120f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m73685e(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, boolean z11, boolean z12, boolean z13, JSONArray jSONArray) {
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            try {
                if (!settingAccountAndSecurityV2View.f72421L0.m92677nJ() && !settingAccountAndSecurityV2View.f72421L0.m92681pJ()) {
                    if (z11) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("is_unmap_profile", z12);
                        bundle.putBoolean("is_bypass_password", z13);
                        bundle.putInt("source_type_change_phone", 1);
                        InterfaceC27218a m92676n2 = settingAccountAndSecurityV2View.m92676n2();
                        if (m92676n2 != null) {
                            m92676n2.mo35573l4(ChangePhoneNumberView.class, bundle, 1, true);
                            return;
                        }
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    if (jSONArray != null) {
                        bundle2.putString("EXTRA_VALID_ERROR", jSONArray.toString());
                    }
                    InterfaceC27218a m92676n22 = settingAccountAndSecurityV2View.m92676n2();
                    if (m92676n22 != null) {
                        m92676n22.mo35573l4(NotChangePhoneNumberView.class, bundle2, 1, true);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m73686f(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                Object m73670hN = SettingAccountAndSecurityV2View.this.m73670hN();
                SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                synchronized (m73670hN) {
                    settingAccountAndSecurityV2View.m73663FN(false);
                    settingAccountAndSecurityV2View.f72421L0.mo49315c4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                if (SettingAccountAndSecurityV2View.this.f72421L0.m92677nJ() || SettingAccountAndSecurityV2View.this.f72421L0.m92681pJ() || AbstractC23216t1.m119643h(SettingAccountAndSecurityV2View.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: la0.e1
                    @Override // me0.AbstractC23216t1.d
                    /* renamed from: a */
                    public final void mo68088a(String str) {
                        SettingAccountAndSecurityV2View.C13120f.m73686f(str);
                    }
                })) {
                    return;
                }
                ToastUtils.m89263k(c20096c);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            final boolean z11;
            final boolean z12;
            final boolean z13;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                Object m73670hN = SettingAccountAndSecurityV2View.this.m73670hN();
                SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                synchronized (m73670hN) {
                    settingAccountAndSecurityV2View.m73663FN(false);
                    settingAccountAndSecurityV2View.f72421L0.mo49315c4();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
                JSONObject jSONObject = (JSONObject) obj;
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (jSONObject.optInt("error_code", -999) == 0 && optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("isset_pwd");
                    AbstractC23304d.f113346X0 = optBoolean ? 1 : 0;
                    AbstractC23309i.m122550wp(optBoolean ? 1 : 0);
                    if (optJSONObject.optInt("allow_change_phonenumber", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (optJSONObject.optInt("unmap_profile", 0) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (optJSONObject.optInt("bypass_verify_pwd", 0) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    final JSONArray optJSONArray = optJSONObject.optJSONArray("valid_error");
                    final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View2 = SettingAccountAndSecurityV2View.this;
                    settingAccountAndSecurityV2View2.mo70710wy(new Runnable() { // from class: la0.d1
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingAccountAndSecurityV2View.C13120f.m73685e(SettingAccountAndSecurityV2View.this, z11, z12, z13, optJSONArray);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$g */
    /* loaded from: classes6.dex */
    public static final class C13121g implements InterfaceC20094a {
        C13121g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73688d(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            settingAccountAndSecurityV2View.m73618LN();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            SettingAccountAndSecurityV2View.this.m73664GN(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("subTitle");
                        if (optJSONObject2 != null) {
                            AbstractC19074t.m100205c(optJSONObject2);
                            if (optJSONObject2.has(AbstractC18458a.f93019a)) {
                                String optString = optJSONObject2.optString(AbstractC18458a.f93019a, "");
                                AbstractC19074t.m100207e(optString, "optString(...)");
                                settingAccountAndSecurityV2View.f67580X0 = optString;
                            }
                        }
                        settingAccountAndSecurityV2View.f67579W0 = EnumC13116b.Companion.m73676a(optJSONObject.optInt("warningType"));
                        AbstractC0924m0.m4242tq(optJSONObject.toString());
                        settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: la0.f1
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingAccountAndSecurityV2View.C13121g.m73688d(SettingAccountAndSecurityV2View.this);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingAccountAndSecurityV2View.this.m73664GN(false);
            } catch (Throwable th2) {
                SettingAccountAndSecurityV2View.this.m73664GN(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$h */
    /* loaded from: classes6.dex */
    static final class C13122h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f67604t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$h$a */
        /* loaded from: classes6.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f67606q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m73690a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m73690a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$h$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f67607q = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m73691a(C20096c c20096c) {
                AbstractC19074t.m100208f(c20096c, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m73691a((C20096c) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$h$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ SettingAccountAndSecurityV2View f67608q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
                super(0);
                this.f67608q = settingAccountAndSecurityV2View;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: c */
            public static final void m73693c(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
                AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
                settingAccountAndSecurityV2View.m73616KN();
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m73694b();
                return C24848g0.f119245a;
            }

            /* renamed from: b */
            public final void m73694b() {
                final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = this.f67608q;
                settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.settings.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingAccountAndSecurityV2View.C13122h.c.m73693c(SettingAccountAndSecurityV2View.this);
                    }
                });
            }
        }

        C13122h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13122h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f67604t == 0) {
                AbstractC24862s.m129228b(obj);
                SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
                settingAccountAndSecurityV2View.m73622NN(a.f67606q, b.f67607q, new c(settingAccountAndSecurityV2View));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13122h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$i */
    /* loaded from: classes6.dex */
    public static final class C13123i extends AbstractC19075u implements InterfaceC18494a {
        C13123i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73695a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m73695a() {
            SettingAccountAndSecurityV2View.this.mo46829Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$j */
    /* loaded from: classes6.dex */
    public static final class C13124j extends AbstractC19075u implements InterfaceC18505l {
        C13124j() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m73698d(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            settingAccountAndSecurityV2View.mo49315c4();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m73699e(String str) {
            if (!TextUtils.isEmpty(str)) {
                ToastUtils.showMess(str);
            }
        }

        /* renamed from: c */
        public final void m73700c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
            settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.settings.c
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAccountAndSecurityV2View.C13124j.m73698d(SettingAccountAndSecurityV2View.this);
                }
            });
            if (!AbstractC23216t1.m119643h(SettingAccountAndSecurityV2View.this.f72421L0, c20096c, new AbstractC23216t1.d() { // from class: com.zing.zalo.ui.settings.d
                @Override // me0.AbstractC23216t1.d
                /* renamed from: a */
                public final void mo68088a(String str) {
                    SettingAccountAndSecurityV2View.C13124j.m73699e(str);
                }
            })) {
                ToastUtils.m89263k(c20096c);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m73700c((C20096c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$k */
    /* loaded from: classes6.dex */
    public static final class C13125k extends AbstractC19075u implements InterfaceC18494a {
        C13125k() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m73702c(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
            settingAccountAndSecurityV2View.mo49315c4();
            settingAccountAndSecurityV2View.m73606CN();
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m73703b();
            return C24848g0.f119245a;
        }

        /* renamed from: b */
        public final void m73703b() {
            final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
            settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.settings.e
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAccountAndSecurityV2View.C13125k.m73702c(SettingAccountAndSecurityV2View.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$l */
    /* loaded from: classes6.dex */
    public static final class C13126l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f67612t;

        C13126l(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m73705t(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
            settingAccountAndSecurityV2View.m73606CN();
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C13126l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f67612t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                Deferred deferred = SettingAccountAndSecurityV2View.this.f67577U0;
                if (deferred != null) {
                    this.f67612t = 1;
                    if (deferred.mo112598E(this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            final SettingAccountAndSecurityV2View settingAccountAndSecurityV2View = SettingAccountAndSecurityV2View.this;
            settingAccountAndSecurityV2View.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.settings.f
                @Override // java.lang.Runnable
                public final void run() {
                    SettingAccountAndSecurityV2View.C13126l.m73705t(SettingAccountAndSecurityV2View.this);
                }
            });
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C13126l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$m */
    /* loaded from: classes6.dex */
    public static final class C13127m extends BiometricWrapper.AbstractC7309a {
        C13127m() {
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: a */
        public void mo37276a(int i11, CharSequence charSequence) {
            super.mo37276a(i11, charSequence);
            if (i11 != 5 && i11 != 10) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo));
            }
            SettingAccountAndSecurityV2View.this.f67581Y0 = 0;
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: b */
        public void mo37277b() {
            BiometricWrapper biometricWrapper;
            super.mo37277b();
            SettingAccountAndSecurityV2View.this.f67581Y0++;
            if (SettingAccountAndSecurityV2View.this.f67581Y0 >= 3 && (biometricWrapper = SettingAccountAndSecurityV2View.this.f67582Z0) != null) {
                biometricWrapper.m37274c();
            }
        }

        @Override // com.zing.zalo.biometric.BiometricWrapper.AbstractC7309a
        /* renamed from: c */
        public void mo37278c(BiometricWrapper.C7310b c7310b) {
            AbstractC19074t.m100208f(c7310b, "authenticationResult");
            super.mo37278c(c7310b);
            SettingAccountAndSecurityV2View.this.f67581Y0 = 0;
            SettingAccountAndSecurityV2View.this.m73620MN();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingAccountAndSecurityV2View$n */
    /* loaded from: classes6.dex */
    public static final class C13128n implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f67615a;

        /* renamed from: b */
        final /* synthetic */ SettingAccountAndSecurityV2View f67616b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18494a f67617c;

        C13128n(InterfaceC18505l interfaceC18505l, SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, InterfaceC18494a interfaceC18494a) {
            this.f67615a = interfaceC18505l;
            this.f67616b = settingAccountAndSecurityV2View;
            this.f67617c = interfaceC18494a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    InterfaceC18505l interfaceC18505l = this.f67615a;
                    if (interfaceC18505l != null) {
                        interfaceC18505l.mo205i9(c20096c);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                this.f67616b.m73666IN(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int i11;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt("is_set");
                        this.f67616b.f67587e1 = optJSONObject.optInt("unmap_profile", 0);
                    } else {
                        i11 = 0;
                    }
                    AbstractC23304d.f113346X0 = i11;
                    AbstractC23309i.m122550wp(i11);
                    SettingAccountAndSecurityV2View.Companion.m73674d(true);
                    InterfaceC18494a interfaceC18494a = this.f67617c;
                    if (interfaceC18494a != null) {
                        interfaceC18494a.mo12V4();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                this.f67616b.m73666IN(false);
            } catch (Throwable th2) {
                this.f67616b.m73666IN(false);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AN */
    public static final void m73602AN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("password_mode", 1);
        C17487o0 m92662fJ = settingAccountAndSecurityV2View.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(ChangePasswordView.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BN */
    public static final void m73604BN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (settingAccountAndSecurityV2View.f67583a1 == 1 && C24594a.m128083d(false, 1, null) == 1) {
            settingAccountAndSecurityV2View.m73614JN();
            return;
        }
        if (settingAccountAndSecurityV2View.f67583a1 == 2 && C24594a.m128083d(false, 1, null) == 2) {
            Bundle bundle = new Bundle();
            bundle.putInt("case_passcode_process", 3);
            C17487o0 m92662fJ = settingAccountAndSecurityV2View.m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93066i2(PasscodeView.class, bundle, 1001, 1, true);
                return;
            }
            return;
        }
        settingAccountAndSecurityV2View.m73620MN();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CN */
    public final void m73606CN() {
        try {
            if (this.f67587e1 == 1) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_dialog_unmap_change_pass);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                this.f67584b1 = m118743r0;
                showDialog(3);
            } else {
                Bundle bundle = new Bundle();
                int i11 = AbstractC23304d.f113346X0;
                if (i11 == 1) {
                    bundle.putInt("password_mode", 3);
                } else if (i11 == 0) {
                    bundle.putInt("password_mode", 1);
                }
                C17487o0 m92662fJ = m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(ChangePasswordView.class, bundle, 1, true);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f72421L0.mo49315c4();
    }

    /* renamed from: JN */
    private final void m73614JN() {
        BiometricWrapper biometricWrapper;
        try {
            this.f67582Z0 = new BiometricWrapper(m92689tK(), AbstractC1388a.m6967i(m92689tK()), new C13127m());
            if ((m92648SI() instanceof ZaloActivity) && (biometricWrapper = this.f67582Z0) != null) {
                ZaloActivity zaloActivity = (ZaloActivity) m92648SI();
                AbstractC19074t.m100205c(zaloActivity);
                biometricWrapper.m37275d(zaloActivity.getLifecycle());
            }
            BiometricWrapper.C7312d m37291a = new BiometricWrapper.C7312d.a().m37297g(AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric)).m37294d("").m37296f(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel)).m37293c(false).m37298h(true).m37291a();
            AbstractC19074t.m100207e(m37291a, "build(...)");
            BiometricWrapper biometricWrapper2 = this.f67582Z0;
            if (biometricWrapper2 != null) {
                biometricWrapper2.m37273a(m37291a, null, false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.fingerprint_acquired_general_zalo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KN */
    public final void m73616KN() {
        String str;
        ListItemSetting listItemSetting = m73668eN().f138037s;
        if (AbstractC23309i.m121666Z4() == 0) {
            str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_security_item_password_state_not_set);
        } else {
            str = "";
        }
        listItemSetting.setStateSetting(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LN */
    public final void m73618LN() {
        int m119607o;
        ListItemSetting listItemSetting = m73668eN().f138032C;
        int i11 = C13117c.f67599a[this.f67579W0.ordinal()];
        Badge badge = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            m119607o = C23212s8.m119607o(listItemSetting.getContext(), AbstractC2807a.error_text);
                            Context context = listItemSetting.getContext();
                            AbstractC19074t.m100207e(context, "getContext(...)");
                            C16974f c16974f = new C16974f(context);
                            c16974f.m90974x(EnumC16991i.SYSTEM_STATUS_DANGER);
                            Badge badge2 = this.f67578V0;
                            if (badge2 == null) {
                                AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                                badge2 = null;
                            }
                            badge2.setBackground(null);
                            Badge badge3 = this.f67578V0;
                            if (badge3 == null) {
                                AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                                badge3 = null;
                            }
                            badge3.m90493g(c16974f);
                            Badge badge4 = this.f67578V0;
                            if (badge4 == null) {
                                AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                            } else {
                                badge = badge4;
                            }
                            badge.setVisibility(0);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        m119607o = C23212s8.m119607o(listItemSetting.getContext(), AbstractC2807a.accent_orange_text);
                        Context context2 = listItemSetting.getContext();
                        AbstractC19074t.m100207e(context2, "getContext(...)");
                        C16974f c16974f2 = new C16974f(context2);
                        c16974f2.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
                        c16974f2.m90971u(EnumC16980h.SIZE_16);
                        Badge badge5 = this.f67578V0;
                        if (badge5 == null) {
                            AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                            badge5 = null;
                        }
                        badge5.m90493g(c16974f2);
                        Badge badge6 = this.f67578V0;
                        if (badge6 == null) {
                            AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                            badge6 = null;
                        }
                        Context context3 = listItemSetting.getContext();
                        AbstractC19074t.m100207e(context3, "getContext(...)");
                        badge6.setBackground(C27280g.m139660c(context3, AbstractC2810d.bg_badge_triangle_16, AbstractC2807a.accent_orange_icon));
                        Badge badge7 = this.f67578V0;
                        if (badge7 == null) {
                            AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                        } else {
                            badge = badge7;
                        }
                        badge.setVisibility(0);
                    }
                } else {
                    m119607o = C23212s8.m119607o(listItemSetting.getContext(), AbstractC2807a.warning_text);
                    Context context4 = listItemSetting.getContext();
                    AbstractC19074t.m100207e(context4, "getContext(...)");
                    C16974f c16974f3 = new C16974f(context4);
                    c16974f3.m90974x(EnumC16991i.SYSTEM_STATUS_WARNING);
                    Badge badge8 = this.f67578V0;
                    if (badge8 == null) {
                        AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                        badge8 = null;
                    }
                    badge8.setBackground(null);
                    Badge badge9 = this.f67578V0;
                    if (badge9 == null) {
                        AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                        badge9 = null;
                    }
                    badge9.m90493g(c16974f3);
                    Badge badge10 = this.f67578V0;
                    if (badge10 == null) {
                        AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                    } else {
                        badge = badge10;
                    }
                    badge.setVisibility(0);
                }
            } else {
                m119607o = C23212s8.m119607o(listItemSetting.getContext(), AbstractC2807a.success_text);
                Context context5 = listItemSetting.getContext();
                AbstractC19074t.m100207e(context5, "getContext(...)");
                C16974f c16974f4 = new C16974f(context5);
                c16974f4.m90974x(EnumC16991i.SYSTEM_STATUS_SUCCESS);
                Badge badge11 = this.f67578V0;
                if (badge11 == null) {
                    AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                    badge11 = null;
                }
                badge11.setBackground(null);
                Badge badge12 = this.f67578V0;
                if (badge12 == null) {
                    AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                    badge12 = null;
                }
                badge12.m90493g(c16974f4);
                Badge badge13 = this.f67578V0;
                if (badge13 == null) {
                    AbstractC19074t.m100223u("securityCheckUpWarningBadge");
                } else {
                    badge = badge13;
                }
                badge.setVisibility(0);
            }
        } else {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.setting_security_checkup_subtitle);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            this.f67580X0 = m118743r0;
            m119607o = C23212s8.m119607o(listItemSetting.getContext(), AbstractC2807a.list_item_subtitle);
            Badge badge14 = this.f67578V0;
            if (badge14 == null) {
                AbstractC19074t.m100223u("securityCheckUpWarningBadge");
            } else {
                badge = badge14;
            }
            badge.setVisibility(8);
        }
        listItemSetting.setSubtitleColor(m119607o);
        listItemSetting.setSubtitle(this.f67580X0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MN */
    public final void m73620MN() {
        m73668eN().f138035q.setSwitch(false);
        m73556pM().mo74387o3(43, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NN */
    public final void m73622NN(InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, InterfaceC18494a interfaceC18494a2) {
        String str;
        ContactProfile contactProfile;
        if (this.f67586d1) {
            return;
        }
        C0766k c0766k = new C0766k();
        if (interfaceC18494a != null) {
            interfaceC18494a.mo12V4();
        }
        c0766k.mo1704o8(new C13128n(interfaceC18505l, this, interfaceC18494a2));
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23304d.f113394i0;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
            str = AbstractC23304d.f113368c0.f42455y;
        }
        this.f67586d1 = true;
        c0766k.mo1402C5(str, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
    }

    /* renamed from: dN */
    private final void m73638dN() {
        String str;
        ContactProfile contactProfile;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13118d());
        if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
            str = AbstractC23304d.f113394i0;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
            str = AbstractC23304d.f113368c0.f42455y;
        }
        c0766k.mo1402C5(str, AbstractC23309i.m121704a5(), AbstractC23309i.m121477U0());
    }

    /* renamed from: gN */
    private final CharSequence m73639gN(int i11) {
        String m118743r0;
        int m127173b0;
        int m127173b02;
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_desc);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        if (i11 != 1) {
            if (i11 != 2) {
                m118743r0 = "";
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_passcode_security);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_biometric_security);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
        }
        if (!TextUtils.isEmpty(m118743r0)) {
            String str = m118743r02 + "\n\n";
            int length = str.length();
            String str2 = str + AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_note);
            m127173b0 = AbstractC24342w.m127173b0(str2, "#x#", 0, false, 6, null);
            if (m127173b0 >= 0) {
                str2 = AbstractC24341v.m127114D(str2, "#x#", "", false, 4, null);
            }
            m127173b02 = AbstractC24342w.m127173b0(str2, "%1$s", 0, false, 6, null);
            if (m127173b02 >= 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                str2 = String.format(str2, Arrays.copyOf(new Object[]{m118743r0}, 1));
                AbstractC19074t.m100207e(str2, "format(...)");
            }
            SpannableString spannableString = new SpannableString(str2);
            if (m127173b0 >= 0) {
                spannableString.setSpan(new StyleSpan(1), length, m127173b0, 33);
            }
            if (m127173b02 >= 0) {
                spannableString.setSpan(new StyleSpan(1), m127173b02, m118743r0.length() + m127173b02, 33);
            }
            return spannableString;
        }
        return m118743r02;
    }

    /* renamed from: iN */
    private final void m73640iN() {
        if (this.f67590h1) {
            return;
        }
        this.f67590h1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C13121g());
        c0766k.mo1776x7(3);
    }

    /* renamed from: jN */
    private final String m73641jN() {
        String m100608s = C19172a.m100608s("features@setting@account@verify_link", null, 2, null);
        if (m100608s.length() == 0) {
            return null;
        }
        if (f67575k1.m127018f(m100608s)) {
            return m100608s;
        }
        return "https://jp.zaloapp.com/zverify/lp?utm_src=account_setting";
    }

    /* renamed from: kN */
    private final void m73642kN() {
        String m4281v7 = AbstractC0924m0.m4281v7();
        AbstractC19074t.m100205c(m4281v7);
        if (m4281v7.length() == 0) {
            m73640iN();
            return;
        }
        JSONObject jSONObject = new JSONObject(m4281v7);
        this.f67579W0 = EnumC13116b.Companion.m73676a(jSONObject.optInt("warningType"));
        JSONObject optJSONObject = jSONObject.optJSONObject("subTitle");
        if (optJSONObject != null) {
            AbstractC19074t.m100205c(optJSONObject);
            String optString = optJSONObject.optString(AbstractC18458a.f93019a, "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f67580X0 = optString;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lN */
    public static final void m73643lN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mN */
    public static final void m73644mN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nN */
    public static final void m73645nN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oN */
    public static final void m73646oN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pN */
    public static final void m73647pN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qN */
    public static final void m73648qN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rN */
    public static final void m73649rN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sN */
    public static final void m73650sN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null) {
            if (contactProfile.m40357A0()) {
                Bundle bundle = new Bundle();
                bundle.putString("extra_contact_uid", contactProfile.f42434r);
                C17487o0 m92662fJ = settingAccountAndSecurityV2View.m92662fJ();
                if (m92662fJ != null) {
                    m92662fJ.m93069k2(UserInfoDetailView.class, bundle, 1, true);
                }
                if (AbstractC23304d.f113368c0.m40387S0()) {
                    AbstractC23647d.m123906p("8210");
                    AbstractC23647d.m123893c();
                    return;
                }
                return;
            }
            C17487o0 m92662fJ2 = settingAccountAndSecurityV2View.m92662fJ();
            if (m92662fJ2 != null) {
                m92662fJ2.m93069k2(PersonalInformationView.class, null, 1, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tN */
    public static final void m73651tN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uN */
    public static final void m73652uN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, ListItemSetting listItemSetting, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        settingAccountAndSecurityV2View.m73653vN(listItemSetting, false);
    }

    /* renamed from: vN */
    private final void m73653vN(ListItemSetting listItemSetting, boolean z11) {
        if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138038t)) {
            m73667a7();
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138037s)) {
            Deferred deferred = this.f67577U0;
            if (deferred != null && (deferred == null || !deferred.mo112737f())) {
                mo46829Y();
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C13126l(null), 3, null);
            } else {
                m73622NN(new C13123i(), new C13124j(), new C13125k());
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138033D)) {
            Bundle bundle = new Bundle();
            String m73641jN = m73641jN();
            bundle.putString("EXTRA_WEB_URL", m73641jN);
            ZaloWebView.C15403a c15403a = ZaloWebView.Companion;
            InterfaceC27218a m92692wK = m92692wK();
            AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
            c15403a.m87171F(m92692wK, m73641jN, bundle);
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138039u)) {
            m73669fN();
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138032C)) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(SettingSecurityView.class, null, 1, true);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138040v)) {
            if (AbstractC23057e7.m118299f()) {
                AbstractC23057e7.m118306m(m92676n2());
            } else {
                C17487o0 m92662fJ2 = m92662fJ();
                if (m92662fJ2 != null) {
                    m92662fJ2.m93069k2(HistoryLoginView.class, null, 1, true);
                }
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138042x)) {
            if (AbstractC23165o5.m119333b()) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("case_passcode_process", 2);
                C17487o0 m92662fJ3 = m92662fJ();
                if (m92662fJ3 != null) {
                    m92662fJ3.m93069k2(PasscodeView.class, bundle2, 1, true);
                }
            } else {
                C17487o0 m92662fJ4 = m92662fJ();
                if (m92662fJ4 != null) {
                    m92662fJ4.m93069k2(PassCodeSettingView.class, null, 1, true);
                }
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138035q)) {
            if (z11) {
                m73556pM().mo74387o3(43, 1);
            } else {
                m73668eN().f138035q.post(new Runnable() { // from class: la0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingAccountAndSecurityV2View.m73654wN(SettingAccountAndSecurityV2View.this);
                    }
                });
                showDialog(4);
            }
        } else if (AbstractC19074t.m100204b(listItemSetting, m73668eN().f138041w)) {
            Bundle bundle3 = new Bundle();
            bundle3.putSerializable("qrcode_type_view", QRCodeViewerView.EnumC14816e.MY_QRCODE);
            C17487o0 m92662fJ5 = m92662fJ();
            if (m92662fJ5 != null) {
                m92662fJ5.m93069k2(QRCodeViewerView.class, bundle3, 1, true);
            }
        }
        m73556pM().mo74383a6(listItemSetting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wN */
    public static final void m73654wN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        settingAccountAndSecurityV2View.m73668eN().f138035q.setSwitch(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xN */
    public static final void m73656xN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        settingAccountAndSecurityV2View.removeDialog(3);
        AbstractC23647d.m123897g("199720");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yN */
    public static final void m73658yN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        settingAccountAndSecurityV2View.removeDialog(3);
        settingAccountAndSecurityV2View.m73667a7();
        AbstractC23647d.m123897g("199719");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zN */
    public static final void m73660zN(SettingAccountAndSecurityV2View settingAccountAndSecurityV2View, View view) {
        AbstractC19074t.m100208f(settingAccountAndSecurityV2View, "this$0");
        settingAccountAndSecurityV2View.removeDialog(3);
        InterfaceC27218a m92676n2 = settingAccountAndSecurityV2View.m92676n2();
        if (m92676n2 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_WEB_URL", AbstractC23306f.m120583H().m110204g().f110080o);
            ZaloWebView.Companion.m87171F(m92676n2, AbstractC23306f.m120583H().m110204g().f110080o, bundle);
            AbstractC23647d.m123897g("199718");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        CharSequence charSequence;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 != 4) {
                    return null;
                }
                if (AbstractC0924m0.m3298O0() != 1) {
                    z11 = false;
                }
                try {
                    int m128082c = C24594a.m128082c(z11);
                    this.f67583a1 = m128082c;
                    charSequence = m73639gN(m128082c);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    charSequence = "";
                }
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(4).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_title)).m43173v(3).m43162k(charSequence).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_negative_btn), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_2fa_login_dialog_confirm_off_positive_btn), new InterfaceC17463d.d() { // from class: la0.u0
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        SettingAccountAndSecurityV2View.m73604BN(SettingAccountAndSecurityV2View.this, interfaceC17463d, i12);
                    }
                });
                return aVar.m43152a();
            }
            C8009j.a aVar2 = new C8009j.a(m92648SI());
            C29866j2 m148102c = C29866j2.m148102c(LayoutInflater.from(getContext()));
            if (!TextUtils.isEmpty(this.f67584b1)) {
                m148102c.f138239t.setText(this.f67584b1);
            }
            m148102c.f138237r.setOnClickListener(new View.OnClickListener() { // from class: la0.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingAccountAndSecurityV2View.m73656xN(SettingAccountAndSecurityV2View.this, view);
                }
            });
            m148102c.f138236q.setOnClickListener(new View.OnClickListener() { // from class: la0.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingAccountAndSecurityV2View.m73658yN(SettingAccountAndSecurityV2View.this, view);
                }
            });
            m148102c.f138238s.setOnClickListener(new View.OnClickListener() { // from class: la0.s0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingAccountAndSecurityV2View.m73660zN(SettingAccountAndSecurityV2View.this, view);
                }
            });
            AbstractC19074t.m100207e(m148102c, "also(...)");
            aVar2.m43177z(m148102c.getRoot());
            return aVar2.m43152a();
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_deactive_account)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: la0.t0
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                SettingAccountAndSecurityV2View.m73602AN(SettingAccountAndSecurityV2View.this, interfaceC17463d, i12);
            }
        });
        return aVar3.m43152a();
    }

    /* renamed from: DN */
    public final void m73661DN(C29839hb c29839hb) {
        AbstractC19074t.m100208f(c29839hb, "<set-?>");
        this.f67576T0 = c29839hb;
    }

    /* renamed from: EN */
    public final void m73662EN(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f67584b1 = str;
    }

    /* renamed from: FN */
    public final void m73663FN(boolean z11) {
        this.f67589g1 = z11;
    }

    /* renamed from: GN */
    public final void m73664GN(boolean z11) {
        this.f67590h1 = z11;
    }

    /* renamed from: HN */
    public final void m73665HN(boolean z11) {
        this.f67585c1 = z11;
    }

    /* renamed from: IN */
    public final void m73666IN(boolean z11) {
        this.f67586d1 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        f67573i1 = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_account_title);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a7 */
    public final void m73667a7() {
        try {
            synchronized (this.f67588f1) {
                if (this.f67589g1) {
                    this.f72421L0.mo46829Y();
                    return;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                synchronized (this.f67588f1) {
                    this.f67589g1 = true;
                    this.f72421L0.mo46829Y();
                }
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C13120f());
                c0766k.mo1743t7(1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: eN */
    public final C29839hb m73668eN() {
        C29839hb c29839hb = this.f67576T0;
        if (c29839hb != null) {
            return c29839hb;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: fN */
    public final void m73669fN() {
        if (this.f67585c1) {
            return;
        }
        try {
            if (!this.f72421L0.m78935DL()) {
                this.f72421L0.mo49282B8(null, false);
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13119e());
            this.f67585c1 = true;
            c0766k.mo1488Ma();
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f67585c1 = false;
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingAccountAndSecurityView";
    }

    /* renamed from: hN */
    public final Object m73670hN() {
        return this.f67588f1;
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: mM */
    public int mo73522mM() {
        return 38;
    }

    @Override // la0.InterfaceC22275m
    /* renamed from: od */
    public C22229g7[] mo73523od() {
        ListItemSetting listItemSetting = m73668eN().f138038t;
        AbstractC19074t.m100207e(listItemSetting, "itemChangePhone");
        ListItemSetting listItemSetting2 = m73668eN().f138033D;
        AbstractC19074t.m100207e(listItemSetting2, "itemVerifyAccount");
        ListItemSetting listItemSetting3 = m73668eN().f138041w;
        AbstractC19074t.m100207e(listItemSetting3, "itemMyQR");
        ListItemSetting listItemSetting4 = m73668eN().f138032C;
        AbstractC19074t.m100207e(listItemSetting4, "itemSecurityCheckup");
        ListItemSetting listItemSetting5 = m73668eN().f138042x;
        AbstractC19074t.m100207e(listItemSetting5, "itemPasscode");
        ListItemSetting listItemSetting6 = m73668eN().f138035q;
        AbstractC19074t.m100207e(listItemSetting6, "item2fa");
        ListItemSetting listItemSetting7 = m73668eN().f138040v;
        AbstractC19074t.m100207e(listItemSetting7, "itemLoginHistory");
        ListItemSetting listItemSetting8 = m73668eN().f138037s;
        AbstractC19074t.m100207e(listItemSetting8, "itemChangePassword");
        ListItemSetting listItemSetting9 = m73668eN().f138039u;
        AbstractC19074t.m100207e(listItemSetting9, "itemDeleteAccount");
        return new C22229g7[]{new C22229g7(listItemSetting, 51), new C22229g7(listItemSetting2, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_444), new C22229g7(listItemSetting3, 148), new C22229g7(listItemSetting4, 121), new C22229g7(listItemSetting5, 55), new C22229g7(listItemSetting6, 126), new C22229g7(listItemSetting7, 53), new C22229g7(listItemSetting8, 54), new C22229g7(listItemSetting9, 52)};
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        try {
            if (i11 == 1001 && i12 == -1) {
                m73620MN();
            } else {
                super.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        String str;
        String str2;
        super.onResume();
        m73642kN();
        mo73526uM();
        int i11 = f67573i1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    str = "";
                } else {
                    str = "review";
                }
            } else {
                str = "verified";
            }
        } else {
            str = "unverified";
        }
        C0697c0.b bVar = C0697c0.Companion;
        bVar.m1052f(this, "ekyc_status", str);
        String str3 = "off";
        if (!AbstractC23165o5.m119333b()) {
            str2 = "off";
        } else {
            str2 = "on";
        }
        bVar.m1052f(this, "lock_zalo", str2);
        if (AbstractC0924m0.m3240M0() == 1) {
            str3 = "on";
        }
        bVar.m1052f(this, "two_factor_authentication", str3);
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: qM */
    public void mo73524qM() {
        Deferred m112538b;
        TrackingRelativeLayout trackingRelativeLayout = m73668eN().f138043y;
        trackingRelativeLayout.setIdTracking("account_security_profile");
        Avatar avatar = m73668eN().f138036r;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        avatar.m90481x(m92689tK, EnumC16949e.SIZE_48);
        AppCompatImageView appCompatImageView = m73668eN().f138044z;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        appCompatImageView.setImageDrawable(C27280g.m139660c(m92689tK2, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        m73668eN().f138030A.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_account_security_item_profile_title));
        trackingRelativeLayout.setOnClickListener(new View.OnClickListener() { // from class: la0.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73650sN(SettingAccountAndSecurityV2View.this, view);
            }
        });
        final ListItemSetting listItemSetting = m73668eN().f138038t;
        listItemSetting.setIdTracking("account_security_change_phone_number");
        listItemSetting.setShowChevronRight(true);
        AbstractC19074t.m100205c(listItemSetting);
        ListItemSetting.m74603F(listItemSetting, AbstractC23322a.zds_ic_call_line_24, null, 0, 6, null);
        listItemSetting.setOnClickListener(new View.OnClickListener() { // from class: la0.w0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73651tN(SettingAccountAndSecurityV2View.this, listItemSetting, view);
            }
        });
        final ListItemSetting listItemSetting2 = m73668eN().f138033D;
        listItemSetting2.setIdTracking("account_security_verify_account");
        AbstractC19074t.m100205c(listItemSetting2);
        ListItemSetting.m74603F(listItemSetting2, AbstractC23322a.zds_ic_user_check_line_24, null, 0, 6, null);
        if (m73641jN() == null) {
            listItemSetting2.setVisibility(8);
        } else {
            listItemSetting2.setShowChevronRight(true);
            listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: la0.x0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingAccountAndSecurityV2View.m73652uN(SettingAccountAndSecurityV2View.this, listItemSetting2, view);
                }
            });
        }
        final ListItemSetting listItemSetting3 = m73668eN().f138041w;
        listItemSetting3.setIdTracking("account_security_my_qr");
        listItemSetting3.setShowChevronRight(true);
        AbstractC19074t.m100205c(listItemSetting3);
        ListItemSetting.m74603F(listItemSetting3, AbstractC23322a.zds_ic_qr_line_24, null, 0, 6, null);
        listItemSetting3.m90592m(false);
        listItemSetting3.setOnClickListener(new View.OnClickListener() { // from class: la0.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73643lN(SettingAccountAndSecurityV2View.this, listItemSetting3, view);
            }
        });
        final ListItemSetting listItemSetting4 = m73668eN().f138032C;
        listItemSetting4.setIdTracking("account_security_security_checkup");
        listItemSetting4.setShowChevronRight(true);
        AbstractC19074t.m100205c(listItemSetting4);
        ListItemSetting.m74603F(listItemSetting4, AbstractC23322a.zds_ic_shield_line_24, null, 0, 6, null);
        C26071f m134221r = C26076k.m134208q().m134221r(121);
        if (m134221r != null) {
            m134221r.f124239n = false;
        }
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        this.f67578V0 = new Badge(m92689tK3);
        LinearLayout llRight = listItemSetting4.getLlRight();
        Badge badge = this.f67578V0;
        if (badge == null) {
            AbstractC19074t.m100223u("securityCheckUpWarningBadge");
            badge = null;
        }
        llRight.addView(badge);
        listItemSetting4.setOnClickListener(new View.OnClickListener() { // from class: la0.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73644mN(SettingAccountAndSecurityV2View.this, listItemSetting4, view);
            }
        });
        final ListItemSetting listItemSetting5 = m73668eN().f138042x;
        listItemSetting5.setIdTracking("account_security_lock_zalo");
        listItemSetting5.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
        listItemSetting5.setShowChevronRight(true);
        listItemSetting5.m90592m(false);
        AbstractC19074t.m100205c(listItemSetting5);
        ListItemSetting.m74603F(listItemSetting5, AbstractC23322a.zds_ic_passcode_line_24, null, 0, 6, null);
        listItemSetting5.setOnClickListener(new View.OnClickListener() { // from class: la0.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73645nN(SettingAccountAndSecurityV2View.this, listItemSetting5, view);
            }
        });
        final ListItemSetting listItemSetting6 = m73668eN().f138035q;
        listItemSetting6.setIdTracking("account_security_two_factor_authentication");
        listItemSetting6.setSwitch(true);
        AbstractC19074t.m100205c(listItemSetting6);
        ListItemSetting.m74603F(listItemSetting6, AbstractC23322a.zds_ic_shield_star_line_24, null, 0, 6, null);
        listItemSetting6.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: la0.m0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                SettingAccountAndSecurityV2View.m73646oN(SettingAccountAndSecurityV2View.this, listItemSetting6, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting7 = m73668eN().f138040v;
        listItemSetting7.setIdTracking("account_security_manage_logged_in_devices");
        listItemSetting7.setShowChevronRight(true);
        AbstractC19074t.m100205c(listItemSetting7);
        ListItemSetting.m74603F(listItemSetting7, AbstractC23322a.zds_ic_device_unknown_line_24, null, 0, 6, null);
        listItemSetting7.setOnClickListener(new View.OnClickListener() { // from class: la0.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73647pN(SettingAccountAndSecurityV2View.this, listItemSetting7, view);
            }
        });
        final ListItemSetting listItemSetting8 = m73668eN().f138037s;
        listItemSetting8.setIdTracking("account_security_change_password");
        listItemSetting8.setShowChevronRight(true);
        AbstractC19074t.m100205c(listItemSetting8);
        ListItemSetting.m74603F(listItemSetting8, AbstractC23322a.zds_ic_lock_line_24, null, 0, 6, null);
        listItemSetting8.m90592m(false);
        listItemSetting8.setOnClickListener(new View.OnClickListener() { // from class: la0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73648qN(SettingAccountAndSecurityV2View.this, listItemSetting8, view);
            }
        });
        final ListItemSetting listItemSetting9 = m73668eN().f138039u;
        listItemSetting9.setIdTracking("account_security_delete_account");
        listItemSetting9.setShowChevronRight(true);
        listItemSetting9.m90592m(false);
        listItemSetting9.setOnClickListener(new View.OnClickListener() { // from class: la0.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingAccountAndSecurityV2View.m73649rN(SettingAccountAndSecurityV2View.this, listItemSetting9, view);
            }
        });
        if (!f67574j1) {
            m112538b = BuildersKt__Builders_commonKt.m112538b(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new C13122h(null), 3, null);
            this.f67577U0 = m112538b;
        }
        m73556pM().mo74381Xi();
        m73642kN();
        m73638dN();
    }

    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: rM */
    public View mo73525rM(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        AbstractC19074t.m100208f(viewGroup, "container");
        C29839hb m148042b = C29839hb.m148042b(layoutInflater, viewGroup);
        AbstractC19074t.m100207e(m148042b, "inflate(...)");
        m73661DN(m148042b);
        View root = m73668eN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x012d, code lost:            if (r1 != false) goto L59;     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014d A[Catch: Exception -> 0x0100, TRY_LEAVE, TryCatch #0 {Exception -> 0x0100, blocks: (B:21:0x00e2, B:23:0x00e6, B:25:0x00ec, B:28:0x00f3, B:29:0x0102, B:31:0x0106, B:33:0x010a, B:36:0x0111, B:38:0x0117, B:40:0x0127, B:42:0x0133, B:43:0x0149, B:45:0x014d, B:50:0x012f, B:51:0x0140), top: B:20:0x00e2 }] */
    @Override // com.zing.zalo.p077ui.settings.BaseSettingView
    /* renamed from: uM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo73526uM() {
        boolean z11;
        String str;
        ContactProfile contactProfile;
        ContactProfile contactProfile2;
        String str2;
        boolean m127126v;
        String m121675Zd;
        ListItemSetting listItemSetting = m73668eN().f138035q;
        if (AbstractC0924m0.m3240M0() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        listItemSetting.setSwitch(z11);
        ListItemSetting listItemSetting2 = m73668eN().f138033D;
        int i11 = f67573i1;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_verify_account_in_review));
                        RobotoTextView tvState = listItemSetting2.getTvState();
                        if (tvState != null) {
                            tvState.setTextColor(AbstractC23136l9.m118639A(AbstractC2808b.f150840y70));
                        }
                        RobotoTextView tvState2 = listItemSetting2.getTvState();
                        if (tvState2 != null) {
                            tvState2.setCompoundDrawables(null, null, null, null);
                            tvState2.setCompoundDrawablePadding(0);
                        }
                    }
                } else {
                    listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_verify_account_verified));
                    RobotoTextView tvState3 = listItemSetting2.getTvState();
                    if (tvState3 != null) {
                        Context m92689tK = m92689tK();
                        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                        tvState3.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139659b(m92689tK, AbstractC2810d.zds_ic_check_circle_solid_16, AbstractC2808b.gr70), (Drawable) null, (Drawable) null, (Drawable) null);
                        tvState3.setCompoundDrawablePadding(AbstractC23136l9.m118742r(8.0f));
                        tvState3.setTextColor(AbstractC23136l9.m118639A(AbstractC2808b.gr70));
                    }
                }
            } else {
                listItemSetting2.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_verify_account_unverified));
                RobotoTextView tvState4 = listItemSetting2.getTvState();
                if (tvState4 != null) {
                    tvState4.setTextColor(AbstractC23136l9.m118639A(AbstractC2808b.ng60));
                }
                RobotoTextView tvState5 = listItemSetting2.getTvState();
                if (tvState5 != null) {
                    tvState5.setCompoundDrawables(null, null, null, null);
                    tvState5.setCompoundDrawablePadding(0);
                }
            }
        } else {
            listItemSetting2.setStateSetting(null);
            RobotoTextView tvState6 = listItemSetting2.getTvState();
            if (tvState6 != null) {
                tvState6.setCompoundDrawables(null, null, null, null);
                tvState6.setCompoundDrawablePadding(0);
            }
        }
        m73618LN();
        ListItemSetting listItemSetting3 = m73668eN().f138042x;
        if (AbstractC23165o5.m119333b()) {
            listItemSetting3.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_on));
            str = "• • • •";
        } else {
            listItemSetting3.setStateSetting(AbstractC23136l9.m118743r0(AbstractC8020f0.setting_value_off));
            str = "";
        }
        listItemSetting3.setSubtitle(str);
        try {
            if (AbstractC23304d.f113368c0 == null && (m121675Zd = AbstractC23309i.m121675Zd()) != null && m121675Zd.length() != 0) {
                AbstractC23304d.f113368c0 = new ContactProfile(new JSONObject(m121675Zd));
            }
            contactProfile = AbstractC23304d.f113368c0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (contactProfile != null && (str2 = contactProfile.f42455y) != null && str2.length() != 0) {
            ContactProfile contactProfile3 = AbstractC23304d.f113368c0;
            if (contactProfile3.f42341G1 == 0) {
                String m118282h = AbstractC23056e6.m118282h(contactProfile3.f42455y, AbstractC23309i.m121704a5(), true);
                if (!TextUtils.isEmpty(m118282h)) {
                    m127126v = AbstractC24341v.m127126v(m118282h, AbstractC23056e6.f112062a, true);
                }
                m118282h = AbstractC23304d.f113368c0.f42455y;
                ListItemSetting listItemSetting4 = m73668eN().f138038t;
                AbstractC19074t.m100205c(m118282h);
                listItemSetting4.setSubtitle(m118282h);
                contactProfile2 = AbstractC23304d.f113368c0;
                if (contactProfile2 != null) {
                    Avatar avatar = m73668eN().f138036r;
                    C16948d m40361D = contactProfile2.m40361D();
                    AbstractC19074t.m100207e(m40361D, "getAvatarProperties(...)");
                    avatar.m90478m(m40361D);
                    m73668eN().f138031B.setText(contactProfile2.m40383Q(true, false));
                }
                m73616KN();
            }
        }
        m73668eN().f138038t.setSubtitle("");
        contactProfile2 = AbstractC23304d.f113368c0;
        if (contactProfile2 != null) {
        }
        m73616KN();
    }
}

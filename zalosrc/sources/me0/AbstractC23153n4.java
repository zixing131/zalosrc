package me0;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0832n;
import am.AbstractC0924m0;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import au.AbstractC2373t;
import au.C2352i0;
import au.EnumC2381y;
import b40.C2535j;
import b40.C2549x;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.gifplayer.C8917b;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.nativecommon.NetworkHelper;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendContact;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.CaptchaView;
import com.zing.zalo.p077ui.zviews.ConfirmCodeView;
import com.zing.zalo.p077ui.zviews.JoinSecurityQuestionView;
import com.zing.zalo.p077ui.zviews.LoginSecurityQuestionWebView;
import com.zing.zalo.p077ui.zviews.LoginSuccessView;
import com.zing.zalo.p077ui.zviews.LoginView;
import com.zing.zalo.p077ui.zviews.SwitchAccountSuccessView;
import com.zing.zalo.p077ui.zviews.UpdateGenderAndBirthdayView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.register.EnterOtpView;
import com.zing.zalo.register.UserUpdateAvatarRegisterView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.C17171o0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zotp.VerifyByAnotherDeviceView;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import cz.C17667v0;
import de0.C17908f;
import en0.InterfaceC18494a;
import f90.C18826a;
import fi.C18953k;
import ga0.C19322f1;
import gg0.AbstractC19444a;
import gq.C19587j;
import gw.AbstractC19646n0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.C20127a;
import is.C20791e;
import is.C20793f;
import is.C20795g;
import is.C20797h;
import java.util.concurrent.Callable;
import kn.AbstractC21777d;
import kz.AbstractC21970a;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22037m0;
import me0.AbstractC23153n4;
import mm0.AbstractC23350e;
import mx.C23476m;
import nh0.C23793c;
import od0.C24226d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p055ce.C3432a;
import p111du.AbstractC18069a;
import p142ey.C18631a;
import p142ey.C18634d;
import p142ey.C18644n;
import p162fh.C18932a;
import p162fh.C18935d;
import p171fx.AbstractC19164e;
import p217hs.C20120e;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p279jw.C21373a;
import p304ks.AbstractC21935u;
import p320ld.C22438j;
import p320ld.C22447s;
import p325lj.C22494a;
import p325lj.C22499f;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p398oo.C24361h0;
import p398oo.C24380u;
import p401or.C24417g;
import p405ov.C24559a;
import p405ov.C24561c;
import p455qo.C25432r0;
import p542ub.InterfaceC27218a;
import p550ul.C27301g;
import p551um.AbstractC27308a;
import p583vq.C28570b;
import p588vw.C28644j;
import p588vw.C28646l;
import p589vx.C28669n;
import p604wb.C28905e;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p698yz.AbstractC31111g;
import p716zh.C31849b1;
import p716zh.C31892e;
import p716zh.C31930g7;
import p716zh.C31986k3;
import p716zh.C31994kb;
import p716zh.C31999l1;
import p716zh.C32037n9;
import p716zh.C32044o1;
import p716zh.C32091r6;
import p716zh.C32163w8;
import p716zh.C32190y7;
import p725zq.C32543a;
import pe0.AbstractC24743a;
import pm0.C24848g0;
import rh0.C25801i;
import s00.AbstractC26080o;
import si.C26263i;
import su.AbstractC26389c;
import sx.C26400b;
import t00.C26444a;
import t00.C26446c;
import th.AbstractC26684e;
import th.AbstractC26685f;
import th.AbstractC26689j;
import th.C26688i;
import th.C26691l;
import tn.C26761p;
import u00.C26939u;
import vg.C28176r6;
import ws.C29210k;
import xh0.C29643e0;
import yf0.C30946k;

/* renamed from: me0.n4 */
/* loaded from: classes4.dex */
public abstract class AbstractC23153n4 {

    /* renamed from: a */
    private static final String f112288a = "n4";

    /* renamed from: b */
    public static int f112289b;

    /* renamed from: me0.n4$a */
    /* loaded from: classes4.dex */
    class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ BaseZaloView f112290a;

        /* renamed from: b */
        final /* synthetic */ String f112291b;

        /* renamed from: c */
        final /* synthetic */ Callable f112292c;

        a(BaseZaloView baseZaloView, String str, Callable callable) {
            this.f112290a = baseZaloView;
            this.f112291b = str;
            this.f112292c = callable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ void m119166d(C20096c c20096c, BaseZaloView baseZaloView) {
            int m104491c = c20096c.m104491c();
            if (m104491c != 2003 && m104491c != 2065) {
                ToastUtils.showMess(c20096c.m104492d());
            } else {
                C17667v0.f89659a.m93646b(baseZaloView, c20096c.m104492d()).mo13822K();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            BaseZaloView baseZaloView = this.f112290a;
            if (baseZaloView != null) {
                baseZaloView.m78954jL();
            }
            try {
                this.f112292c.call();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            final BaseZaloView baseZaloView2 = this.f112290a;
            AbstractC19444a.m101697e(new Runnable() { // from class: me0.m4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23153n4.a.m119166d(C20096c.this, baseZaloView2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                if (this.f112290a != null) {
                    AbstractC0924m0.m3691bf("");
                    AbstractC0924m0.m2972Cm(0);
                    AbstractC23153n4.m119163z(this.f112290a.m92676n2(), obj, this.f112291b, 0L, false, 0, false, true, false, null, true);
                    this.f112290a.m78948cM(Boolean.TRUE, AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_create_account_successfully));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.n4$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
        }
    }

    /* renamed from: A */
    public static void m119085A(JSONObject jSONObject, boolean z11, boolean z12) {
        try {
            AbstractC27308a.m139837a(jSONObject);
            if (!jSONObject.isNull("settings")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                if (jSONObject2.length() == 0) {
                    return;
                }
                m119134k0(jSONObject2);
                m119132j0(jSONObject2);
                JSONObject m119118c0 = m119118c0(jSONObject2);
                m119138m0(jSONObject2);
                m119116b0(jSONObject2);
                m119146q0(jSONObject2);
                m119144p0(jSONObject2);
                m119107U(jSONObject2);
                m119120d0(jSONObject2);
                m119130i0(jSONObject2);
                JSONObject m119108V = m119108V(jSONObject2);
                m119111Y(z11, z12, jSONObject2, m119118c0);
                m119152t0(jSONObject2);
                m119142o0(jSONObject2);
                m119154u0(jSONObject2);
                m119150s0(jSONObject2);
                m119114a0(jSONObject2);
                m119109W(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject2.has("jpegQuality")) {
                    jSONObject3.put("jpegQuality", jSONObject2.opt("jpegQuality"));
                }
                m119103Q(m119149s(m119118c0), m119108V, m119110X(jSONObject2, jSONObject3), m119112Z(jSONObject2, jSONObject3), m119148r0(jSONObject2, jSONObject3), m119140n0(jSONObject2), m119158w0(jSONObject2));
                m119102P(jSONObject3);
                m119156v0(jSONObject2);
                m119160x0(jSONObject2);
                m119136l0(jSONObject2);
                m119128h0(jSONObject2);
                m119126g0(jSONObject2);
                C26691l.m137137l(jSONObject2);
                m119122e0(jSONObject2);
                if (z12) {
                    AbstractC23306f.m120643a2().m89841k(jSONObject.optJSONObject("zalo_cloud"));
                }
                C27301g.m139818a().m139820c(jSONObject.optString("cloud_viewer_key"));
                AbstractC23306f.m120633X1().m89805t(jSONObject2.optJSONObject("zalo_cloud"), z12);
                if (z12 && !z11) {
                    AbstractC23306f.m120633X1().m89797c();
                }
                m119124f0(jSONObject2);
                m119101O(jSONObject2);
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: A0 */
    private static void m119086A0(InterfaceC27218a interfaceC27218a) {
        interfaceC27218a.mo35573l4(SwitchAccountSuccessView.class, null, 1, true);
    }

    /* renamed from: B */
    public static void m119087B(final InterfaceC27218a interfaceC27218a, final int i11, String str, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("existAccount");
        String optString = jSONObject.optString("sessionToken", "");
        final Bundle bundle = new Bundle();
        bundle.putString("EXTRA_PHONE_NUMBER", m119145q(str));
        bundle.putInt("EXTRA_EXIST_ACCOUNT", optInt);
        bundle.putString("EXTRA_SESSION_TOKEN", optString);
        interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.b4
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC27218a.this.mo35581q(EnterOtpView.class, bundle, i11, 1, true);
            }
        });
    }

    /* renamed from: B0 */
    private static void m119088B0(final InterfaceC27218a interfaceC27218a, boolean z11, final boolean z12, final boolean z13) {
        final boolean z14;
        C24561c.m127942b(f112288a, "startPostLoginFlow(): hasBackup=" + z11 + ", showSwitchAccSuccess=" + z12 + ", showLoginSuccess=" + z13);
        if (z13) {
            m119162y0(interfaceC27218a);
        } else {
            if (C7967l.m42727z().m42734K()) {
                C7967l.m42727z().m42735T(interfaceC27218a);
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14 && AbstractC23306f.m120564A1().m105694c(interfaceC27218a.mo35579p())) {
                z14 = true;
            }
            if (AbstractC3489d.m17509q() && !AbstractC3489d.m17512t()) {
                C22438j.f109770a.m115960m().set(false);
                C22438j.m115938c(new InterfaceC18494a() { // from class: me0.h4
                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        C24848g0 m119100N;
                        m119100N = AbstractC23153n4.m119100N(InterfaceC27218a.this, z14, z12, z13);
                        return m119100N;
                    }
                });
                return;
            } else {
                AbstractC23306f.m120636Y1().m128521c();
                AbstractC23306f.m120667g2().m144758L(0, true, false);
                if (!C22438j.m115940g(interfaceC27218a.mo35579p(), z14, z11) && !z14) {
                    m119164z0(interfaceC27218a);
                }
            }
        }
        if (z12) {
            m119086A0(interfaceC27218a);
        }
        AbstractC23306f.m120632X0().m101508a(new C17908f.b(z12, z13));
    }

    /* renamed from: C */
    public static void m119089C(InterfaceC27218a interfaceC27218a, Object obj, String str, long j11, int i11, C2352i0 c2352i0) {
        m119163z(interfaceC27218a, obj, str, j11, true, i11, true, false, false, c2352i0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static /* synthetic */ void m119095I(InterfaceC27218a interfaceC27218a, Bundle bundle, boolean z11) {
        int i11;
        if (z11) {
            i11 = 2210;
        } else {
            i11 = 0;
        }
        interfaceC27218a.mo35581q(ConfirmCodeView.class, bundle, i11, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ void m119097K(boolean z11, InterfaceC27218a interfaceC27218a) {
        Bundle bundle = new Bundle();
        if (z11) {
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
            interfaceC27218a.mo35573l4(UserUpdateAvatarRegisterView.class, bundle, 1, true);
        } else {
            bundle.putBoolean("fromVerifyCode", true);
            bundle.putBoolean("isNewUser", true);
            bundle.putInt("SHOW_WITH_FLAGS", 50331648);
            interfaceC27218a.mo35573l4(UpdateGenderAndBirthdayView.class, bundle, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ void m119098L(InterfaceC27218a interfaceC27218a, boolean z11, boolean z12, boolean z13) {
        try {
            m119088B0(interfaceC27218a, z11, z12, z13);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ C24848g0 m119100N(InterfaceC27218a interfaceC27218a, boolean z11, boolean z12, boolean z13) {
        m119143p(interfaceC27218a);
        if (!C22438j.m115942i(z11, interfaceC27218a.mo35579p())) {
            m119164z0(interfaceC27218a);
        }
        if (z12) {
            m119086A0(interfaceC27218a);
        }
        AbstractC23306f.m120632X0().m101508a(new C17908f.b(z12, z13));
        return null;
    }

    /* renamed from: O */
    private static void m119101O(JSONObject jSONObject) {
        C22494a.f110026a.m116286a(jSONObject.optJSONObject("ai_avatar"));
    }

    /* renamed from: P */
    private static void m119102P(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        AbstractC23309i.m121470Tu(jSONObject2);
        AbstractC26689j.m137090Q(jSONObject2);
    }

    /* renamed from: Q */
    private static void m119103Q(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
        try {
            JSONObject jSONObject8 = new JSONObject();
            if (jSONObject3 != null) {
                jSONObject8.put("chat", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject8.put("feed", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject8.put("story", jSONObject5);
            }
            if (jSONObject6 != null) {
                jSONObject8.put("recommendedLink", jSONObject6);
            }
            if (jSONObject != null) {
                jSONObject8.put("group", jSONObject);
            }
            if (jSONObject2 != null) {
                jSONObject8.put("gif", jSONObject2);
            }
            if (jSONObject7 != null) {
                jSONObject8.put("zchannel", jSONObject7);
            }
            String jSONObject9 = jSONObject8.toString();
            AbstractC23309i.m121860eA(jSONObject9);
            ZMediaPlayerSettings.initZMediaPlayerSettings(jSONObject9);
            AbstractC26689j.m137091R(jSONObject9);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R */
    private static void m119104R(JSONObject jSONObject) {
        C0872f m120562A = AbstractC23306f.m120562A();
        JSONObject optJSONObject = jSONObject.optJSONObject("jump_csc");
        if (optJSONObject != null) {
            boolean z11 = true;
            if (optJSONObject.optInt("jump_first_unread", 1) != 1) {
                z11 = false;
            }
            m120562A.m2549m0(z11);
        }
    }

    /* renamed from: S */
    public static void m119105S(JSONObject jSONObject, boolean z11) {
        try {
            if (z11) {
                AbstractC23304d.f113395i1 = jSONObject.optInt("timeout", 0) * 1000;
                AbstractC23304d.f113391h1 = jSONObject.optInt("delayedTime", 0) * 1000;
                String optString = jSONObject.optString("phoneFroms");
                if (!TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray = new JSONArray(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString));
                    AbstractC23304d.f113289J.clear();
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        AbstractC23304d.f113289J.add(jSONArray.optString(i11));
                    }
                    return;
                }
                return;
            }
            AbstractC23304d.f113450w0 = jSONObject.optString("title", "");
            AbstractC23304d.f113454x0 = jSONObject.optString("sms_content_hint", "");
            AbstractC23304d.f113458y0 = jSONObject.optString("sms_format", "");
            AbstractC23304d.f113446v0 = String.valueOf(jSONObject.optInt("sms_gateway"));
        } catch (Exception unused) {
        }
    }

    /* renamed from: T */
    private static void m119106T(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        int i11;
        boolean z11;
        boolean z12;
        JSONObject optJSONObject;
        boolean z13;
        boolean z14;
        int m3472U0 = AbstractC0924m0.m3472U0();
        AbstractC0924m0.m3722cg(jSONObject.optInt("enableCloudMsg"));
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2.optJSONObject("pullOfflineMsg");
        } else {
            jSONObject3 = null;
        }
        boolean z15 = false;
        if (jSONObject3 != null) {
            i11 = jSONObject3.optInt("enable", 0);
            AbstractC0924m0.m3546Wg(i11);
            AbstractC0924m0.m3000Dl(jSONObject3.optInt("preloadPage", 3));
            AbstractC0924m0.m3575Xg(jSONObject3.optInt("enablePush1991", 0));
            AbstractC0924m0.m4323wk(jSONObject3.optInt("maxMembers", 200));
            AbstractC0924m0.m4319wg(jSONObject3.optInt("enableLoadHttpPreview", 0));
        } else {
            i11 = 0;
        }
        if (i11 != m3472U0 && C29210k.m145804c0().m145859a0()) {
            C29210k.m145804c0().m145840K0();
        }
        if (jSONObject.has("chat_extra_db") && (optJSONObject = jSONObject.optJSONObject("chat_extra_db")) != null) {
            if (optJSONObject.optInt("enable", 0) == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            AbstractC23309i.m122215nn(z13);
            if (z13 && optJSONObject.optInt("enable_for_group", 0) >= 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            AbstractC0924m0.m4142qg(z14);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("databases");
        if (optJSONObject2 != null) {
            int optInt = optJSONObject2.optInt("log_level", 2);
            if (optJSONObject2.optInt("remove_old_db", 0) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (optJSONObject2.optInt("make_index_enable", 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            int optInt2 = optJSONObject2.optInt("make_index_db_size", 50);
            if (optJSONObject2.optInt("renew_on_corrupt", 0) == 1) {
                z15 = true;
            }
            AbstractC0924m0.m3884hs(optInt);
            AbstractC0924m0.m4124ps(z11);
            AbstractC0924m0.m3944js(z12);
            AbstractC0924m0.m3914is(optInt2);
            AbstractC0924m0.m4154qs(z15);
        }
    }

    /* renamed from: U */
    private static void m119107U(JSONObject jSONObject) {
        try {
            if (jSONObject.has("ads")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("ads");
                int i11 = jSONObject2.getInt("click_timeout");
                int i12 = jSONObject2.getInt("impr_timeout");
                int i13 = jSONObject2.getInt("install_check_time");
                int i14 = jSONObject2.getInt("submit_time");
                int i15 = jSONObject2.getInt("close_menu");
                C28905e.m144363N(MainApplication.getAppContext(), i11 * 1000);
                C28905e.m144364O(MainApplication.getAppContext(), i12 * 1000);
                C28905e.m144365P(MainApplication.getAppContext(), i13 * 1000);
                C28905e.m144366Q(MainApplication.getAppContext(), i14 * 1000);
                C28905e.m144367R(MainApplication.getAppContext(), i15);
                C28905e.m144373n().m144394p(MainApplication.getAppContext(), new C31999l1(), new C31892e());
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: V */
    private static JSONObject m119108V(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        int i11;
        boolean z31;
        boolean z32;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z41;
        String str;
        boolean z42;
        boolean z43;
        boolean z44;
        boolean z45;
        boolean z46;
        boolean z47;
        boolean z48;
        boolean z49;
        boolean z51;
        boolean z52;
        boolean z53;
        JSONObject optJSONObject3;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        JSONObject jSONObject2 = null;
        try {
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (!jSONObject.has("android")) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("android");
        C24561c.m127942b(f112288a, "parseSettingAndroid(): " + jSONObject3);
        if (jSONObject3.has("video")) {
            jSONObject2 = jSONObject3.optJSONObject("video");
        }
        boolean z58 = false;
        if (jSONObject3.has("aquery_config")) {
            JSONObject jSONObject4 = jSONObject3.getJSONObject("aquery_config");
            if (jSONObject4.has("trigger_size")) {
                AbstractC23309i.m121124Kh(AbstractC18069a.m96087f(jSONObject4, "trigger_size"));
            }
            if (jSONObject4.has("target_size")) {
                AbstractC23309i.m121087Jh(AbstractC18069a.m96087f(jSONObject4, "target_size"));
            }
            if (jSONObject4.has("save_photo_group")) {
                if (AbstractC18069a.m96085d(jSONObject4, "save_photo_group") == 1) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                AbstractC23309i.m120796Bm(z57);
            }
        }
        if (jSONObject3.has("check_resolution_changed")) {
            if (jSONObject3.optInt("check_resolution_changed") == 1) {
                z56 = true;
            } else {
                z56 = false;
            }
            AbstractC23309i.m122284pi(z56);
        }
        if (jSONObject3.has("gif_config")) {
            JSONObject jSONObject5 = jSONObject3.getJSONObject("gif_config");
            if (jSONObject5.optInt("video_gif_enable") == 1) {
                z54 = true;
            } else {
                z54 = false;
            }
            AbstractC23309i.m121327Pz(z54);
            if (jSONObject5.optInt("video_gif_high_quality") == 1) {
                z55 = true;
            } else {
                z55 = false;
            }
            AbstractC23309i.m121364Qz(z55);
            if (jSONObject5.has("max_preview_size")) {
                int m96085d = AbstractC18069a.m96085d(jSONObject5, "max_preview_size");
                AbstractC23309i.m122145lt(m96085d);
                C8917b.m47605n(m96085d);
            }
            if (jSONObject5.has("max_chat_size")) {
                int m96085d2 = AbstractC18069a.m96085d(jSONObject5, "max_chat_size");
                AbstractC23309i.m121020Ho(m96085d2);
                C8917b.m47606o(m96085d2);
            }
            if (jSONObject5.has("max_feed_size")) {
                int m96085d3 = AbstractC18069a.m96085d(jSONObject5, "max_feed_size");
                AbstractC23309i.m121057Io(m96085d3);
                C8917b.m47607p(m96085d3);
            }
        }
        if (jSONObject3.has("isCheckScrolling") && (optJSONObject3 = jSONObject3.optJSONObject("isCheckScrolling")) != null) {
            AbstractC23309i.m122321qi(optJSONObject3.toString());
            AbstractC23304d.m120546q();
        }
        JSONObject optJSONObject4 = jSONObject3.optJSONObject("pref_config");
        if (optJSONObject4 != null) {
            if (optJSONObject4.has("pref_insert_in_bg")) {
                AbstractC0924m0.m3459Tg(optJSONObject4.optBoolean("pref_insert_in_bg", true));
            }
            if (optJSONObject4.has("enable_leveldb")) {
                if (optJSONObject4.optInt("enable_leveldb", 0) == 1) {
                    z53 = true;
                } else {
                    z53 = false;
                }
                AbstractC0924m0.m3488Ug(z53);
            }
        }
        if (jSONObject3.has("permission_monitor")) {
            if (jSONObject3.optInt("permission_monitor") == 1) {
                z52 = true;
            } else {
                z52 = false;
            }
            AbstractC23309i.m121285Ou(z52);
        }
        if (jSONObject3.has("chat_head_config")) {
            JSONObject jSONObject6 = jSONObject3.getJSONObject("chat_head_config");
            if (jSONObject6.has("chat_head_activated_spam_time")) {
                AbstractC23309i.m121983hi(jSONObject6.optInt("chat_head_activated_spam_time"));
            }
            if (jSONObject6.has("chat_head_expired_spam_time")) {
                AbstractC23309i.m122021ii(jSONObject6.optInt("chat_head_expired_spam_time"));
            }
            if (jSONObject6.has("chat_head_spam_count")) {
                AbstractC23309i.m122058ji(jSONObject6.optInt("chat_head_spam_count"));
            }
            if (jSONObject6.has("chat_head_rotation_enable")) {
                if (jSONObject6.optInt("chat_head_rotation_enable") == 1) {
                    z51 = true;
                } else {
                    z51 = false;
                }
                AbstractC23309i.m122619yk(z51);
            }
            if (jSONObject6.has("remind_minichat_popup_interval")) {
                AbstractC23309i.m121434Sv(jSONObject6.optInt("remind_minichat_popup_interval", 86400) * 1000);
            }
            if (jSONObject6.has("remind_minichat_popup_limit_count")) {
                AbstractC23309i.m121471Tv(jSONObject6.optInt("remind_minichat_popup_limit_count", 6));
            }
        }
        if (jSONObject3.has("use_handler_connection")) {
            if (AbstractC18069a.m96085d(jSONObject3, "use_handler_connection") == 1) {
                z49 = true;
            } else {
                z49 = false;
            }
            AbstractC23309i.m122375rz(z49);
        } else {
            AbstractC23309i.m122375rz(true);
        }
        if (jSONObject3.has("wakeup_device_handler")) {
            if (AbstractC18069a.m96085d(jSONObject3, "wakeup_device_handler") == 1) {
                z48 = true;
            } else {
                z48 = false;
            }
            AbstractC23309i.m120920Ez(z48);
        } else {
            AbstractC23309i.m120920Ez(false);
        }
        if (jSONObject3.has("time_wakeup_service")) {
            long m96088g = AbstractC18069a.m96088g(jSONObject3, "time_wakeup_service", 0L);
            if (m96088g > 300000) {
                AbstractC23309i.m122254op(m96088g);
            }
        }
        if (AbstractC18069a.m96086e(jSONObject3, "use_zalo_handler_connection", 1) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC23309i.m120957Fz(z11);
        if (AbstractC18069a.m96086e(jSONObject3, "check_connection_available", 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC23309i.m122227nz(z12);
        if (AbstractC18069a.m96085d(jSONObject3, "ashMem_inBitmap") == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        AbstractC23309i.m122472ul(z13);
        C23999j.m125683C3(z13);
        C23278z2.m120142m1();
        if (jSONObject3.has("shrink_cache")) {
            if (AbstractC18069a.m96085d(jSONObject3, "shrink_cache") == 1) {
                z47 = true;
            } else {
                z47 = false;
            }
            AbstractC23309i.m121385Rj(z47);
            C23999j.m125756z3(z47);
        }
        if (jSONObject3.has("aquery_max_size_config_sample")) {
            AbstractC23309i.m121050Ih(jSONObject3.getJSONObject("aquery_max_size_config_sample").toString());
        }
        AbstractC23309i.m122072jw(AbstractC18069a.m96088g(jSONObject3, "backup_time_interval", 3600000L));
        AbstractC23309i.m122521vx(AbstractC18069a.m96086e(jSONObject3, "sqlite_exception", 2));
        if (AbstractC18069a.m96085d(jSONObject3, "aquery_device_class") == 1) {
            z14 = true;
        } else {
            z14 = false;
        }
        AbstractC23309i.m121760bm(z14);
        C23999j.m125737m3(z14);
        if (jSONObject3.has("video_playmode")) {
            int m96085d4 = AbstractC18069a.m96085d(jSONObject3, "video_playmode");
            AbstractC23309i.m121401Rz(m96085d4);
            ZMediaPlayerSettings.playMode = m96085d4;
        }
        if (jSONObject3.has("gif_auto_repeat")) {
            if (AbstractC18069a.m96085d(jSONObject3, "gif_auto_repeat") == 1) {
                z46 = true;
            } else {
                z46 = false;
            }
            AbstractC23309i.m120946Fo(z46);
            C8917b.m47603l(z46);
        }
        if (jSONObject3.has("lua_checksum")) {
            if (AbstractC18069a.m96085d(jSONObject3, "lua_checksum") == 1) {
                z45 = true;
            } else {
                z45 = false;
            }
            AbstractC23309i.m120757Ak(z45);
        }
        if (jSONObject3.has("cached_location")) {
            if (AbstractC18069a.m96085d(jSONObject3, "cached_location") == 1) {
                z44 = true;
            } else {
                z44 = false;
            }
            AbstractC23309i.m122212nk(z44);
        }
        if (jSONObject3.has("keep_layout_suggest_sticker")) {
            int m96085d5 = AbstractC18069a.m96085d(jSONObject3, "keep_layout_suggest_sticker");
            AbstractC23309i.m120947Fp(m96085d5);
            C18953k m99340R = C18953k.m99340R();
            if (m96085d5 == 1) {
                z43 = true;
            } else {
                z43 = false;
            }
            m99340R.m99384H0(z43);
        }
        if (jSONObject3.has("enable_emoji_keyframes")) {
            if (jSONObject3.optInt("enable_emoji_keyframes") == 1) {
                z42 = true;
            } else {
                z42 = false;
            }
            AbstractC0924m0.m3645a(z42);
        }
        if (AbstractC18069a.m96086e(jSONObject3, "camera_share_surface", 1) == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        C29643e0.f136888a.m147397f(z15);
        AbstractC0924m0.m4020me(AbstractC18069a.m96086e(jSONObject3, "camera_delay_release_time", AbstractC26080o.a.f124275b));
        if (AbstractC18069a.m96086e(jSONObject3, "native_loader", 1) == 1) {
            z16 = true;
        } else {
            z16 = false;
        }
        AbstractC23309i.m121321Pt(z16);
        if (AbstractC18069a.m96086e(jSONObject3, "fts_search", 1) == 1) {
            z17 = true;
        } else {
            z17 = false;
        }
        AbstractC23309i.m122631yw(z17);
        if (jSONObject3.has("quicksticker_download")) {
            AbstractC23309i.m121027Hv(AbstractC18069a.m96085d(jSONObject3, "quicksticker_download"));
        }
        AbstractC23309i.m120806Bw(AbstractC18069a.m96086e(jSONObject3, "auto_upload_image", 0));
        if (!jSONObject3.isNull("new_rule_parse_emo")) {
            AbstractC23309i.m122449tz(jSONObject3.optInt("new_rule_parse_emo"));
        }
        if (jSONObject3.has("auto_open_conn_upload_photo")) {
            AbstractC23309i.m121272Oh(jSONObject3.optInt("auto_open_conn_upload_photo"));
        }
        if (AbstractC18069a.m96086e(jSONObject3, "socket_upload_video", 1) == 1) {
            z18 = true;
        } else {
            z18 = false;
        }
        AbstractC23309i.m121351Qm(z18);
        if (AbstractC18069a.m96086e(jSONObject3, "use_two_db_parallel", 1) == 1) {
            z19 = true;
        } else {
            z19 = false;
        }
        AbstractC23309i.m120809Bz(z19);
        int i12 = 8388608;
        int m96086e = AbstractC18069a.m96086e(jSONObject3, "soft_heap_limit", 8388608);
        if (m96086e >= 0 && (m96086e <= 0 || m96086e >= 8388608)) {
            i12 = m96086e;
        }
        AbstractC0924m0.m4180ro(i12);
        if (System.currentTimeMillis() - AbstractC23309i.m122456u5() > 259200000) {
            JSONObject m96091j = AbstractC18069a.m96091j(jSONObject3, "zam");
            if (m96091j == null) {
                str = "";
            } else {
                str = m96091j.toString();
            }
            C23476m m123249g = C23476m.m123249g(str);
            boolean m123251b = m123249g.m123251b();
            AbstractC23309i.m121204Mn(m123251b);
            AbstractC23309i.m121241Nn(m123249g.m123252c());
            AbstractC23309i.m122060jk(m123249g.m123250a());
            AbstractC19164e.m100540z(m123251b);
            if (C23476m.m123246d()) {
                AbstractC19164e.m100527m(MainApplication.getAppContext(), C25801i.m132957d().m132960c(), AbstractC7306b.f40031a, AbstractC7306b.f40033c, AbstractC26684e.f126413f);
            }
            AbstractC19164e.m100510B(m123249g.m123252c());
        }
        if (AbstractC18069a.m96086e(jSONObject3, "image_qr_detection", 1) == 1) {
            z21 = true;
        } else {
            z21 = false;
        }
        AbstractC23309i.m122512vo(z21);
        if (AbstractC18069a.m96086e(jSONObject3, "preload_webview", 1) == 1) {
            z22 = true;
        } else {
            z22 = false;
        }
        AbstractC23309i.m121882ev(z22);
        if (AbstractC18069a.m96086e(jSONObject3, "cache_normal_webview", 1) == 1) {
            z23 = true;
        } else {
            z23 = false;
        }
        AbstractC23309i.m122364ro(z23);
        if (jSONObject3.has("enable_headup_notification") && !jSONObject3.isNull("enable_headup_notification")) {
            AbstractC23309i.m122324ql(jSONObject3.optInt("enable_headup_notification", 1));
        }
        if (AbstractC18069a.m96086e(jSONObject3, "resume_download", 1) == 1) {
            z24 = true;
        } else {
            z24 = false;
        }
        AbstractC23309i.m121732aw(z24);
        if (AbstractC18069a.m96086e(jSONObject3, "kickout_by_imei", 1) == 1) {
            z25 = true;
        } else {
            z25 = false;
        }
        AbstractC23309i.m120758Al(z25);
        if (jSONObject3.has("enable_auto_get_timeline")) {
            if (AbstractC18069a.m96085d(jSONObject3, "enable_auto_get_timeline") == 1) {
                z41 = true;
            } else {
                z41 = false;
            }
            AbstractC23309i.m121758bk(z41);
        }
        AbstractC23309i.m121349Qk(jSONObject3.optInt("enableExpandNoti", 1));
        AbstractC23309i.m121250Nw(AbstractC18069a.m96086e(jSONObject3, "show_big_photo_notify", 1));
        if (jSONObject3.optInt("allow_quick_exit_app", 1) == 1) {
            z26 = true;
        } else {
            z26 = false;
        }
        AbstractC23309i.m122653zh(z26);
        if (AbstractC18069a.m96086e(jSONObject3, "sms_reply", 1) == 1) {
            z27 = true;
        } else {
            z27 = false;
        }
        AbstractC23309i.m122262ox(z27);
        if (jSONObject3.has("enable_anim_main_tab")) {
            if (jSONObject3.optInt("enable_anim_main_tab") == 1) {
                z39 = true;
            } else {
                z39 = false;
            }
            AbstractC23309i.m121496Uj(z39);
        }
        if (jSONObject3.has("enable_firebase_crashlytic")) {
            if (AbstractC18069a.m96085d(jSONObject3, "enable_firebase_crashlytic") == 1) {
                z38 = true;
            } else {
                z38 = false;
            }
            AbstractC0924m0.m4172rg(z38);
        }
        if (jSONObject3.has("connection_config")) {
            JSONObject optJSONObject5 = jSONObject3.optJSONObject("connection_config");
            if (optJSONObject5 != null) {
                AbstractC23309i.m121606Xi(optJSONObject5.toString());
            } else {
                AbstractC23309i.m121606Xi("");
            }
        } else {
            AbstractC23309i.m121606Xi("");
        }
        AbstractC26685f.m137051b(AbstractC23309i.m121218N0());
        if (jSONObject3.has("use_stock_wrapper")) {
            if (AbstractC18069a.m96085d(jSONObject3, "use_stock_wrapper") == 1) {
                z37 = true;
            } else {
                z37 = false;
            }
            AbstractC23309i.m122671zz(z37);
        }
        if (jSONObject3.has("voip_timeout_await")) {
            AbstractC23309i.m121660Yz(AbstractC18069a.m96085d(jSONObject3, "voip_timeout_await"));
        }
        if (AbstractC18069a.m96086e(jSONObject3, "video_encode_async", 1) == 1) {
            z28 = true;
        } else {
            z28 = false;
        }
        AbstractC0924m0.m4291vh(z28);
        if (AbstractC18069a.m96086e(jSONObject3, "use_do_not_disturb", 1) == 1) {
            z29 = true;
        } else {
            z29 = false;
        }
        AbstractC23309i.m122438to(z29);
        if (jSONObject3.has("zbrowser_preload")) {
            if (jSONObject3.optInt("zbrowser_preload", 0) == 1) {
                z36 = true;
            } else {
                z36 = false;
            }
            AbstractC23309i.m121167Ln(z36);
        }
        if (jSONObject3.has("timeout_reset_socket_recv_firebase_call_ms")) {
            i11 = jSONObject3.optInt("timeout_reset_socket_recv_firebase_call_ms", 0);
        } else {
            i11 = 0;
        }
        AbstractC23309i.m121141Ky(i11);
        if (jSONObject3.optInt("notification_manager_manual_sound_vibration", 0) == 1) {
            z31 = true;
        } else {
            z31 = false;
        }
        AbstractC23309i.m122070ju(z31);
        if (jSONObject3.has("mediaStoreSystem") && (optJSONObject = jSONObject3.optJSONObject("mediaStoreSystem")) != null && optJSONObject.has("insertUsePreAndroidQLogic") && (optJSONObject2 = optJSONObject.optJSONObject("insertUsePreAndroidQLogic")) != null) {
            if (optJSONObject2.optInt("photo", 0) == 1) {
                z33 = true;
            } else {
                z33 = false;
            }
            AbstractC23309i.m121990hp(z33);
            if (optJSONObject2.optInt("video", 0) == 1) {
                z34 = true;
            } else {
                z34 = false;
            }
            AbstractC23309i.m122028ip(z34);
            if (optJSONObject2.optInt("file", 0) == 1) {
                z35 = true;
            } else {
                z35 = false;
            }
            AbstractC23309i.m121952gp(z35);
        }
        AbstractC0924m0.m3226Lf(jSONObject3.optString("embed_hidden_gallery_key"));
        if (jSONObject3.has("enable_kfimage_cache")) {
            if (jSONObject3.optInt("enable_kfimage_cache", 0) == 1) {
                z32 = true;
            } else {
                z32 = false;
            }
            AbstractC0924m0.m4290vg(z32);
        }
        if (jSONObject3.has("device_fold")) {
            if (jSONObject3.optInt("device_fold") == 1) {
                z58 = true;
            }
            AbstractC0924m0.m3961kf(z58);
        }
        return jSONObject2;
    }

    /* renamed from: W */
    private static void m119109W(JSONObject jSONObject) {
        boolean z11;
        JSONObject optJSONObject;
        boolean z12;
        String str;
        try {
            if (jSONObject.has("camera_zalo")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("camera_zalo");
                if (jSONObject2.has("record_video_extra_time")) {
                    AbstractC23309i.m121756bi(jSONObject2.optInt("record_video_extra_time"));
                }
                if (jSONObject2.has("no_camera_delay_release_time_device_list")) {
                    JSONArray optJSONArray = jSONObject2.optJSONArray("no_camera_delay_release_time_device_list");
                    if (optJSONArray != null) {
                        str = optJSONArray.toString();
                    } else {
                        str = "";
                    }
                    AbstractC23309i.m121718ai(str);
                }
                boolean z13 = true;
                if (jSONObject2.has("editor_config") && (optJSONObject = jSONObject2.optJSONObject("editor_config")) != null) {
                    if (optJSONObject.optInt("enable_doodle_blur", 0) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC23309i.m121835dm(z12);
                }
                if (jSONObject2.has("enable_gallery_picker_in_camera_chat")) {
                    if (jSONObject2.optInt("enable_gallery_picker_in_camera_chat", 0) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC23309i.m121872el(z11);
                }
                if (jSONObject2.has("enable_camera_immersive_sticky_mode")) {
                    if (jSONObject2.optInt("enable_camera_immersive_sticky_mode", 0) != 1) {
                        z13 = false;
                    }
                    AbstractC23309i.m122471uk(z13);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: X */
    private static JSONObject m119110X(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z11;
        boolean z12;
        JSONObject jSONObject3 = null;
        try {
            if (jSONObject.has("chat")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("chat");
                JSONObject optJSONObject = jSONObject4.optJSONObject("sticker_store");
                if (optJSONObject != null) {
                    AbstractC23309i.m120881Dx(optJSONObject.optInt("align"));
                }
                JSONObject optJSONObject2 = jSONObject4.optJSONObject("photo");
                if (optJSONObject2 != null) {
                    jSONObject2.put("chat", optJSONObject2);
                    if (optJSONObject2.has("auto_load_hd")) {
                        AbstractC23309i.m120829Ci(AbstractC18069a.m96086e(optJSONObject2, "auto_load_hd", 2));
                    }
                }
                jSONObject3 = jSONObject4.optJSONObject("video");
                JSONObject optJSONObject3 = jSONObject4.optJSONObject("notification");
                boolean z13 = false;
                if (optJSONObject3 != null && optJSONObject3.has("group_mention_stack")) {
                    if (optJSONObject3.optInt("group_mention_stack") == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC23309i.m122213nl(z12);
                }
                if (jSONObject4.has("pinBoard")) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("pinBoard");
                    if (jSONObject5.optInt("enable", 1) >= 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC0924m0.m3314Og(z11);
                    AbstractC0924m0.m4084oi(jSONObject5.optLong("syncTime", 86400000L));
                    if (jSONObject5.optInt("enablePinEntryPoint", 0) >= 1) {
                        z13 = true;
                    }
                    AbstractC0924m0.m3343Pg(z13);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject3;
    }

    /* JADX WARN: Removed duplicated region for block: B:856:0x0e64 A[Catch: JSONException -> 0x0030, TryCatch #0 {JSONException -> 0x0030, blocks: (B:3:0x0010, B:5:0x0018, B:8:0x002c, B:9:0x0037, B:11:0x003f, B:12:0x0046, B:14:0x0050, B:17:0x005b, B:19:0x005e, B:21:0x0066, B:24:0x0071, B:26:0x0074, B:28:0x007c, B:31:0x0087, B:33:0x008a, B:35:0x0092, B:37:0x009a, B:38:0x00a1, B:40:0x00a9, B:41:0x00b0, B:44:0x00bb, B:46:0x00c6, B:47:0x00d4, B:49:0x00dc, B:52:0x00e7, B:54:0x00ea, B:56:0x00f2, B:57:0x0100, B:59:0x0108, B:62:0x0113, B:65:0x0121, B:68:0x012f, B:72:0x013b, B:74:0x0143, B:77:0x014e, B:79:0x0151, B:81:0x0159, B:84:0x0164, B:86:0x0167, B:88:0x016f, B:91:0x017a, B:93:0x017d, B:95:0x0185, B:98:0x0190, B:100:0x0193, B:102:0x019b, B:105:0x01a6, B:107:0x01a9, B:109:0x01b1, B:112:0x01bc, B:114:0x01bf, B:116:0x01c7, B:117:0x01d0, B:119:0x01d8, B:122:0x01e3, B:124:0x01e9, B:126:0x01f1, B:127:0x01fe, B:129:0x0206, B:132:0x0211, B:134:0x0214, B:136:0x021c, B:139:0x0227, B:141:0x022a, B:143:0x0232, B:146:0x023d, B:148:0x0240, B:150:0x0248, B:153:0x0253, B:155:0x0256, B:157:0x025e, B:160:0x0269, B:162:0x026c, B:165:0x0276, B:167:0x027e, B:169:0x0296, B:172:0x029f, B:174:0x02a2, B:176:0x02aa, B:178:0x02b2, B:180:0x02ba, B:183:0x02c5, B:185:0x02c8, B:187:0x02d0, B:190:0x02db, B:192:0x02de, B:194:0x02e6, B:195:0x02f3, B:197:0x02fb, B:200:0x0306, B:202:0x0309, B:204:0x0311, B:207:0x031c, B:209:0x031f, B:211:0x0325, B:213:0x032b, B:215:0x0337, B:218:0x0342, B:220:0x0345, B:222:0x034d, B:225:0x0358, B:227:0x035b, B:229:0x0363, B:232:0x036e, B:235:0x0376, B:236:0x037d, B:238:0x0380, B:240:0x0388, B:242:0x0390, B:243:0x03a1, B:245:0x03aa, B:247:0x03b2, B:250:0x03bb, B:252:0x03c7, B:254:0x03cf, B:256:0x03d7, B:259:0x03e2, B:261:0x03ed, B:262:0x03f8, B:265:0x0407, B:267:0x0412, B:270:0x0419, B:272:0x0421, B:274:0x0429, B:277:0x0432, B:280:0x0440, B:283:0x0443, B:285:0x044c, B:287:0x0454, B:290:0x045d, B:292:0x048b, B:294:0x0496, B:296:0x049e, B:299:0x04a7, B:301:0x04b3, B:303:0x04bb, B:305:0x04c3, B:306:0x04f6, B:308:0x04fe, B:310:0x0506, B:313:0x0512, B:315:0x0515, B:317:0x051d, B:319:0x0525, B:322:0x052f, B:324:0x0532, B:326:0x053a, B:328:0x0542, B:331:0x054e, B:333:0x0551, B:336:0x055d, B:339:0x056b, B:342:0x0578, B:344:0x0595, B:347:0x05a1, B:349:0x05a4, B:351:0x05ac, B:354:0x05b8, B:356:0x05bb, B:358:0x05c1, B:360:0x05c7, B:361:0x05cf, B:363:0x05d5, B:365:0x05db, B:368:0x05e5, B:370:0x05e8, B:372:0x05ee, B:374:0x05f4, B:375:0x0603, B:377:0x060d, B:379:0x0613, B:381:0x0619, B:383:0x0621, B:384:0x062a, B:386:0x0632, B:389:0x063e, B:391:0x0641, B:393:0x0649, B:396:0x0655, B:398:0x0658, B:400:0x0660, B:403:0x066a, B:404:0x066d, B:406:0x0673, B:408:0x067d, B:409:0x0684, B:411:0x068c, B:415:0x06a5, B:417:0x06aa, B:419:0x06b0, B:421:0x06b6, B:422:0x06be, B:425:0x06c6, B:427:0x06cc, B:429:0x06d2, B:431:0x06da, B:434:0x06e6, B:436:0x06e9, B:438:0x06f1, B:439:0x06fa, B:441:0x0702, B:442:0x070b, B:444:0x0713, B:445:0x071c, B:447:0x0724, B:448:0x072d, B:450:0x0735, B:451:0x073e, B:453:0x0746, B:454:0x074f, B:456:0x0761, B:457:0x076a, B:459:0x0772, B:460:0x077b, B:462:0x0783, B:463:0x078c, B:465:0x0794, B:466:0x079e, B:468:0x07a6, B:469:0x07b0, B:471:0x07b8, B:472:0x07c2, B:474:0x07ca, B:475:0x07d4, B:477:0x07dc, B:478:0x07e6, B:480:0x07ee, B:481:0x07f7, B:483:0x07ff, B:484:0x0809, B:486:0x0811, B:487:0x081b, B:489:0x0823, B:490:0x082d, B:492:0x0835, B:493:0x083f, B:495:0x0847, B:498:0x0854, B:500:0x0857, B:502:0x085f, B:505:0x086c, B:507:0x086f, B:509:0x0877, B:512:0x0884, B:514:0x0887, B:516:0x088f, B:519:0x089c, B:521:0x089f, B:523:0x08a7, B:526:0x08b3, B:528:0x08b6, B:530:0x08be, B:533:0x08ca, B:535:0x08cd, B:536:0x08e4, B:538:0x08ec, B:540:0x08f2, B:541:0x08f9, B:543:0x0901, B:545:0x0909, B:548:0x0916, B:556:0x093b, B:561:0x0944, B:563:0x094f, B:564:0x0958, B:566:0x0960, B:568:0x0968, B:569:0x0972, B:571:0x097a, B:574:0x0986, B:576:0x0989, B:578:0x0991, B:581:0x099d, B:583:0x09a0, B:585:0x09a8, B:587:0x09b6, B:588:0x09c2, B:590:0x09ca, B:592:0x09d2, B:593:0x09dc, B:595:0x09e4, B:597:0x09ec, B:598:0x09f6, B:600:0x09fe, B:602:0x0a06, B:603:0x0a10, B:605:0x0a18, B:606:0x0a22, B:608:0x0a2a, B:611:0x0a36, B:613:0x0a39, B:615:0x0a41, B:618:0x0a4d, B:620:0x0a50, B:622:0x0a58, B:624:0x0a60, B:625:0x0a67, B:626:0x0a6f, B:628:0x0a77, B:631:0x0a83, B:633:0x0a86, B:635:0x0a8e, B:638:0x0a9a, B:640:0x0a9d, B:642:0x0aa5, B:643:0x0aaf, B:645:0x0ab7, B:648:0x0ac3, B:650:0x0ac6, B:652:0x0ace, B:653:0x0ad7, B:655:0x0adf, B:658:0x0aeb, B:660:0x0aee, B:662:0x0af6, B:665:0x0b02, B:667:0x0b05, B:669:0x0b0d, B:672:0x0b1a, B:674:0x0b1d, B:676:0x0b25, B:679:0x0b31, B:681:0x0b34, B:683:0x0b3c, B:684:0x0b50, B:686:0x0b58, B:687:0x0b61, B:689:0x0b69, B:690:0x0b72, B:692:0x0b7a, B:695:0x0b8c, B:698:0x0b9a, B:701:0x0ba8, B:704:0x0bb6, B:707:0x0bc4, B:713:0x0bc7, B:715:0x0bcf, B:718:0x0bdb, B:720:0x0bde, B:722:0x0be6, B:723:0x0bf0, B:725:0x0bf8, B:728:0x0c04, B:730:0x0c07, B:732:0x0c0f, B:735:0x0c1b, B:737:0x0c1e, B:739:0x0c26, B:741:0x0c2e, B:743:0x0c3a, B:746:0x0c44, B:748:0x0c50, B:750:0x0c58, B:752:0x0c60, B:755:0x0c6c, B:758:0x0c78, B:761:0x0c89, B:763:0x0c91, B:766:0x0c9d, B:768:0x0ca0, B:770:0x0ca8, B:772:0x0cb0, B:775:0x0cd9, B:778:0x0ce4, B:781:0x0cf9, B:785:0x0d07, B:787:0x0d0f, B:790:0x0d1b, B:792:0x0d1e, B:794:0x0d26, B:797:0x0d32, B:799:0x0d35, B:801:0x0d3d, B:802:0x0d64, B:804:0x0d6c, B:805:0x0d75, B:807:0x0d7d, B:810:0x0d89, B:812:0x0d8c, B:814:0x0d94, B:816:0x0d9c, B:819:0x0db9, B:822:0x0dc4, B:825:0x0dd5, B:827:0x0ddd, B:829:0x0de5, B:831:0x0ded, B:832:0x0df0, B:833:0x0dfa, B:835:0x0e02, B:837:0x0e0a, B:840:0x0e16, B:843:0x0e2e, B:846:0x0e3a, B:848:0x0e42, B:850:0x0e4e, B:854:0x0e59, B:856:0x0e64, B:857:0x0e6c, B:860:0x0e6f, B:862:0x0e77, B:865:0x0e83, B:867:0x0e86, B:869:0x0e90, B:871:0x0e9e, B:873:0x0ead, B:874:0x0eb0, B:876:0x0eb8, B:877:0x0ec1, B:879:0x0ec9, B:880:0x0ed2, B:882:0x0eda, B:883:0x0ee3, B:885:0x0ef9, B:886:0x0f04, B:888:0x0f0c, B:889:0x0f16, B:891:0x0f1e, B:892:0x0f28, B:894:0x0f30, B:895:0x0f3a, B:897:0x0f42, B:898:0x0f4c, B:900:0x0f54, B:903:0x0f61, B:905:0x0f64, B:907:0x0f6c, B:908:0x0f77, B:910:0x0f7f, B:911:0x0f87, B:913:0x0f95, B:916:0x0fa2, B:917:0x0faa, B:919:0x0fb2, B:921:0x0fba, B:924:0x0fce, B:926:0x0fd4, B:928:0x0fe4, B:930:0x0fea, B:932:0x1014, B:934:0x101c, B:937:0x102c, B:939:0x1034, B:941:0x1040, B:944:0x104a, B:946:0x104d, B:948:0x1053, B:950:0x105b, B:951:0x105e, B:953:0x1066, B:955:0x106e, B:957:0x107a, B:960:0x1084, B:962:0x1087, B:964:0x108d, B:966:0x1095, B:967:0x1098, B:969:0x10a0, B:971:0x10a8, B:973:0x10b4, B:976:0x10be, B:978:0x10c1, B:980:0x10c7, B:982:0x10cf, B:983:0x10d2, B:985:0x10da, B:987:0x10e2, B:990:0x10ee, B:993:0x10fc, B:996:0x110a, B:1000:0x110d, B:1002:0x1117, B:1004:0x111f, B:1007:0x112a, B:1009:0x114e, B:1011:0x1155, B:1013:0x115d, B:1014:0x1167, B:1016:0x116f, B:1018:0x1177, B:1019:0x1196, B:1021:0x119e, B:1023:0x11a6, B:1026:0x11b5, B:1029:0x11c1, B:1032:0x11da, B:1034:0x11e2, B:1036:0x11ea, B:1037:0x11f4, B:1039:0x11fc, B:1042:0x1209, B:1044:0x120c, B:1046:0x121a, B:1048:0x1222, B:1049:0x122c, B:1051:0x1234, B:1052:0x1237, B:1054:0x123f, B:1056:0x1247, B:1059:0x1251, B:1060:0x1254, B:1062:0x125c, B:1064:0x1264, B:1065:0x12a2, B:1067:0x12aa, B:1070:0x12b5, B:1071:0x12b8, B:1073:0x12c3, B:1075:0x12cb, B:1078:0x12ed, B:1081:0x12f5, B:1084:0x12fd, B:1087:0x1341, B:1089:0x1352, B:1095:0x1361, B:1096:0x1366, B:1098:0x136e, B:1100:0x1376, B:1101:0x1381, B:1103:0x1389, B:1104:0x1393, B:1106:0x139b, B:1108:0x13a3, B:1111:0x13c4, B:1113:0x1402, B:1115:0x140a, B:1116:0x1414, B:1118:0x1442, B:1120:0x144a, B:1122:0x1452, B:1125:0x145e, B:1128:0x146c, B:1131:0x1491, B:1134:0x14a0, B:1139:0x14a3, B:1141:0x14ab, B:1144:0x14b8, B:1145:0x14c0, B:1147:0x14c8, B:1149:0x14d0, B:1152:0x14dc, B:1155:0x14ea, B:1158:0x14ed, B:1160:0x14f5, B:1162:0x14fd, B:1164:0x1503, B:1167:0x150e, B:1169:0x1513, B:1171:0x1516, B:1173:0x151e, B:1176:0x152b, B:1178:0x152e, B:1180:0x1536, B:1183:0x1543, B:1185:0x1546, B:1187:0x154e, B:1190:0x155b, B:1192:0x155e, B:1194:0x156a, B:1195:0x1570, B:1197:0x157b, B:1200:0x1588, B:1201:0x1590, B:1203:0x1598, B:1205:0x15a0, B:1208:0x15ad, B:1210:0x15b0, B:1212:0x15b8, B:1215:0x15c4, B:1217:0x15c7, B:1219:0x15cf, B:1221:0x15d7, B:1222:0x160c, B:1224:0x163d, B:1225:0x1647, B:1227:0x164f, B:1230:0x165b, B:1232:0x165e, B:1234:0x1666, B:1237:0x1673, B:1239:0x1676, B:1241:0x168f, B:1243:0x1697, B:1246:0x16a6, B:1249:0x16b4, B:1252:0x16c2, B:1254:0x16c7, B:1258:0x16ca, B:1260:0x16d2, B:1261:0x16e2, B:1263:0x16f0, B:1265:0x16f8, B:1268:0x1702, B:1270:0x172f, B:1272:0x1737, B:1274:0x173f, B:1277:0x174a, B:1279:0x177f, B:1281:0x1787, B:1283:0x178f, B:1284:0x179f, B:1286:0x17a7, B:1288:0x17af, B:1290:0x17b7, B:1293:0x17c4, B:1295:0x17c7, B:1297:0x17cf, B:1300:0x17dc, B:1302:0x17df, B:1304:0x17e7, B:1307:0x17f4, B:1309:0x17f7, B:1310:0x1808, B:1312:0x1810, B:1314:0x1818, B:1316:0x181e, B:1319:0x1829, B:1321:0x182c, B:1323:0x1834, B:1325:0x183c, B:1327:0x1844, B:1328:0x184f, B:1330:0x185f, B:1332:0x1865, B:1334:0x186d, B:1337:0x187e, B:1340:0x1892, B:1342:0x18a0, B:1344:0x18a8, B:1346:0x18b0, B:1347:0x18b7, B:1349:0x18bf, B:1351:0x18c7, B:1354:0x18d1, B:1356:0x18dc, B:1358:0x18e4, B:1359:0x18ed, B:1361:0x18f5, B:1363:0x18fd, B:1364:0x1909, B:1366:0x1911, B:1367:0x191b, B:1369:0x1923, B:1371:0x192b, B:1374:0x1935, B:1376:0x1953, B:1378:0x197d, B:1381:0x1989, B:1384:0x1994, B:1387:0x19a0, B:1391:0x19ae, B:1392:0x19b4, B:1396:0x19c5, B:1398:0x19cd, B:1401:0x19d9, B:1403:0x19dc, B:1405:0x19e4, B:1408:0x19f1, B:1410:0x19f4, B:1412:0x19fc, B:1415:0x1a0d, B:1417:0x1a15, B:1419:0x1a1d, B:1421:0x1a25, B:1424:0x1a31, B:1427:0x1a3c, B:1430:0x1a47, B:1433:0x1a52, B:1436:0x1a5d, B:1439:0x1a80, B:1442:0x1a8b, B:1445:0x1a9b, B:1448:0x1aa8, B:1451:0x1ab3, B:1454:0x1ad8, B:1457:0x1ae3, B:1460:0x1af2, B:1462:0x1afa, B:1465:0x1b07, B:1468:0x1b17, B:1471:0x1b2d, B:1474:0x1b3b, B:1479:0x1b9f, B:1481:0x1baf, B:1483:0x1bbb, B:1485:0x1bc5, B:1487:0x1bcd, B:1491:0x1bdc, B:1493:0x1bf7, B:1495:0x1bff, B:1496:0x1c06, B:1498:0x1c0e, B:1500:0x1c16, B:1504:0x1c2c, B:1505:0x1c32, B:1508:0x1c43, B:1510:0x1c4e, B:1512:0x1c56, B:1521:0x1bb5, B:1544:0x158c, B:1547:0x14bc, B:1554:0x0fa6, B:1557:0x0a6b, B:1561:0x039b, B:1562:0x01fb, B:1564:0x0034), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:858:0x0e6b  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m119111Y(boolean z11, boolean z12, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        int i11;
        int i12;
        JSONObject jSONObject4;
        boolean z13;
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        boolean z14;
        int i13;
        boolean z15;
        int i14;
        boolean z16;
        JSONObject optJSONObject5;
        JSONObject optJSONObject6;
        JSONObject optJSONObject7;
        JSONObject optJSONObject8;
        JSONObject optJSONObject9;
        JSONObject optJSONObject10;
        JSONObject optJSONObject11;
        JSONObject optJSONObject12;
        JSONObject optJSONObject13;
        JSONObject optJSONObject14;
        JSONObject optJSONObject15;
        JSONObject optJSONObject16;
        JSONObject optJSONObject17;
        JSONObject optJSONObject18;
        JSONObject optJSONObject19;
        JSONObject optJSONObject20;
        JSONObject optJSONObject21;
        JSONObject optJSONObject22;
        JSONArray optJSONArray2;
        JSONObject optJSONObject23;
        JSONObject optJSONObject24;
        JSONObject optJSONObject25;
        JSONObject optJSONObject26;
        JSONObject optJSONObject27;
        JSONObject optJSONObject28;
        JSONObject optJSONObject29;
        JSONObject optJSONObject30;
        JSONObject optJSONObject31;
        JSONObject optJSONObject32;
        JSONObject optJSONObject33;
        boolean z17;
        JSONObject optJSONObject34;
        JSONObject optJSONObject35;
        JSONObject optJSONObject36;
        JSONObject optJSONObject37;
        JSONObject optJSONObject38;
        JSONObject optJSONObject39;
        JSONObject optJSONObject40;
        JSONObject optJSONObject41;
        JSONObject optJSONObject42;
        JSONObject optJSONObject43;
        JSONObject optJSONObject44;
        JSONObject optJSONObject45;
        JSONObject optJSONObject46;
        JSONObject optJSONObject47;
        JSONObject optJSONObject48;
        JSONObject optJSONObject49;
        JSONObject optJSONObject50;
        JSONObject optJSONObject51;
        JSONObject optJSONObject52;
        try {
            if (jSONObject.has("features")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("features");
                String optString = jSONObject5.optString("notification_config");
                if (!TextUtils.isEmpty(optString)) {
                    AbstractC23309i.m122032iu(optString);
                } else {
                    AbstractC23309i.m122032iu("");
                }
                JSONObject optJSONObject53 = jSONObject5.optJSONObject("multiPhotoSuggest");
                if (optJSONObject53 != null) {
                    AbstractC23309i.m121173Lt(optJSONObject53.toString());
                }
                if (jSONObject5.has("mutual_feed_1_1")) {
                    AbstractC23309i.m121722am(jSONObject5.optInt("mutual_feed_1_1") == 1);
                }
                if (jSONObject5.has("populate_story_mini_chat")) {
                    AbstractC23309i.m121573Wm(jSONObject5.optInt("populate_story_mini_chat") == 1);
                }
                if (jSONObject5.has("extend_profile")) {
                    AbstractC23309i.m121386Rk(jSONObject5.optInt("extend_profile") == 1);
                }
                if (jSONObject5.has("quick_comment") && (optJSONObject52 = jSONObject5.optJSONObject("quick_comment")) != null) {
                    C28570b.m142996a().m142999d(optJSONObject52);
                }
                JSONObject optJSONObject54 = jSONObject5.optJSONObject("photoNotifySetting");
                if (optJSONObject54 != null) {
                    AbstractC23309i.m121507Uu(optJSONObject54.toString());
                }
                AbstractC23309i.m121796cl(jSONObject5.optInt("force_jump_to_seasonal_tab") == 1);
                JSONObject optJSONObject55 = jSONObject5.optJSONObject("media_group_info");
                if (optJSONObject55 != null) {
                    AbstractC23309i.m122480ut(optJSONObject55.toString());
                    C32091r6.m154832b().m154839h();
                }
                if (jSONObject5.has("redownload_chat_media")) {
                    AbstractC23309i.m121101Jv(jSONObject5.optInt("redownload_chat_media") == 1);
                }
                JSONObject optJSONObject56 = jSONObject5.optJSONObject("retry_msg_config");
                if (optJSONObject56 != null) {
                    AbstractC23309i.m121807cw(optJSONObject56.toString());
                    C32163w8.m155135a().m155141g();
                }
                JSONObject optJSONObject57 = jSONObject5.optJSONObject("live_emoji_config");
                if (optJSONObject57 != null) {
                    AbstractC23309i.m120906El(optJSONObject57.optInt("setting_feature") == 1);
                    AbstractC23309i.m120980Gl(optJSONObject57.optInt("setting_conversation") == 1);
                    AbstractC23309i.m121017Hl(optJSONObject57.optInt("enable_in_chat_head") == 1);
                    AbstractC23309i.m122433tj(optJSONObject57.optString("default_emoji"));
                }
                if (jSONObject5.has("enable_flipping_bg_timeline")) {
                    AbstractC23309i.m121759bl(jSONObject5.optInt("enable_flipping_bg_timeline") == 1);
                }
                if (jSONObject5.has("suggested_sticker")) {
                    AbstractC23309i.m121028Hw(jSONObject5.optInt("suggested_sticker") == 1);
                }
                if (jSONObject5.has("suggest_sticker_with_one_emoji")) {
                    AbstractC23309i.m122177mn(jSONObject5.optInt("suggest_sticker_with_one_emoji") == 1);
                }
                if (jSONObject5.has("suggest_location")) {
                    AbstractC23309i.m121988hn(jSONObject5.optInt("suggest_location") == 1);
                }
                if (jSONObject5.has("suggest_promotion")) {
                    AbstractC23309i.m122101kn(jSONObject5.optInt("suggest_promotion") == 1);
                }
                if (jSONObject5.has("suggest_action")) {
                    AbstractC23309i.m121761bn(jSONObject5.optInt("suggest_action") == 1);
                }
                if (!jSONObject5.isNull("onlineFriend")) {
                    AbstractC23309i.m121472Tw(jSONObject5.optInt("onlineFriend", 0));
                }
                if (jSONObject5.has("gif")) {
                    boolean z18 = jSONObject5.optInt("gif") == 1;
                    AbstractC23309i.m120983Go(z18);
                    C8917b.m47604m(z18);
                }
                if (jSONObject5.has("discover")) {
                    AbstractC23309i.m120978Gj(jSONObject5.optInt("discover"));
                } else {
                    AbstractC23309i.m120978Gj(0);
                }
                if (jSONObject5.has("story")) {
                    AbstractC23309i.m121462Tm(jSONObject5.optInt("story") == 1);
                }
                if (jSONObject5.has("group_link")) {
                    AbstractC23309i.m122175ml(jSONObject5.optInt("group_link") == 1);
                }
                if (jSONObject5.has("video_call")) {
                    AbstractC23309i.m120908En(jSONObject5.optInt("video_call") == 1);
                }
                if (jSONObject5.has("camera_live_preview")) {
                    AbstractC23309i.m122508vk(jSONObject5.optInt("camera_live_preview") == 1);
                }
                if (jSONObject5.has("enable_suggest_chat_profile")) {
                    AbstractC23309i.m121836dn(jSONObject5.optInt("enable_suggest_chat_profile") == 1);
                }
                if (jSONObject5.has("miss_call_config") && (optJSONObject51 = jSONObject5.optJSONObject("miss_call_config")) != null) {
                    AbstractC23309i.m121162Li(optJSONObject51.toString());
                    C31930g7.m153408g().m153425s(optJSONObject51.toString());
                    AbstractC23309i.m122584xm(!optJSONObject51.isNull("enable") && optJSONObject51.optInt("enable") == 1);
                }
                if (jSONObject5.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION) && (optJSONObject50 = jSONObject5.optJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) != null) {
                    if (optJSONObject50.has("enable_feed_location_picker")) {
                        AbstractC23309i.m121091Jl(optJSONObject50.optInt("enable_feed_location_picker") == 1);
                    }
                    if (optJSONObject50.has("enable_map_view_overlay")) {
                        AbstractC23309i.m121239Nl(optJSONObject50.optInt("enable_map_view_overlay") == 1);
                    }
                    if (optJSONObject50.has("map_view")) {
                        AbstractC23309i.m121357Qs(optJSONObject50.optJSONObject("map_view").toString());
                    }
                    if (optJSONObject50.has("enable_chat_nearby_picker")) {
                        AbstractC23309i.m121054Il(optJSONObject50.optInt("enable_chat_nearby_picker") == 1);
                    }
                    if (optJSONObject50.has("enable_map_view_picker")) {
                        AbstractC23309i.m121276Ol(optJSONObject50.optInt("enable_map_view_picker") > 0);
                    }
                }
                if (jSONObject5.has("username") && !jSONObject5.isNull("username")) {
                    JSONObject jSONObject6 = jSONObject5.getJSONObject("username");
                    if (jSONObject6.has("enable_create_username")) {
                        AbstractC23309i.m122251om(jSONObject6.optInt("enable_create_username") == 1);
                    }
                    if (jSONObject6.has("visible_create_username_signup")) {
                        AbstractC23309i.m121438Sz(jSONObject6.optInt("visible_create_username_signup") == 1);
                    }
                }
                if (jSONObject5.has("hook_contact_app")) {
                    boolean z19 = jSONObject5.optInt("hook_contact_app") == 1;
                    boolean m120851D3 = AbstractC23309i.m120851D3();
                    if (!z19 && m120851D3) {
                        C31849b1.m153097n().m153108j();
                    }
                    AbstractC23309i.m122363rn(z19);
                }
                if (jSONObject5.has("sg_chat")) {
                    JSONObject optJSONObject58 = jSONObject5.optJSONObject("sg_chat");
                    if (optJSONObject58 != null) {
                        AbstractC23309i.m121657Yw(optJSONObject58.toString());
                        AbstractC23304d.m120551v();
                    }
                } else {
                    AbstractC23309i.m121657Yw("");
                    AbstractC23304d.m120551v();
                }
                if (jSONObject5.has("in_app_notification") && (optJSONObject49 = jSONObject5.optJSONObject("in_app_notification")) != null) {
                    AbstractC23309i.m122435tl(optJSONObject49.optInt("enable") == 1);
                    AbstractC23309i.m122226ny(optJSONObject49.optInt("time_display", 5));
                }
                if (jSONObject5.has("chat_sticker") && (optJSONObject48 = jSONObject5.optJSONObject("chat_sticker")) != null) {
                    AbstractC23309i.m120942Fk(optJSONObject48.optInt("search_after_recent") == 1);
                    JSONObject optJSONObject59 = optJSONObject48.optJSONObject("group_sticker_layout");
                    if (optJSONObject59 != null) {
                        AbstractC23306f.m120726x1().mo150749m(optJSONObject59.toString());
                    }
                    AbstractC23306f.m120726x1().mo150739c(optJSONObject48.optInt("enable_reply_msg_by_sticker") == 1);
                    JSONObject optJSONObject60 = optJSONObject48.optJSONObject("ai_sticker");
                    if (optJSONObject60 != null) {
                        AbstractC23306f.m120726x1().mo150732E(optJSONObject60);
                    }
                }
                if (jSONObject5.has("trending_sticker") && (optJSONObject47 = jSONObject5.optJSONObject("trending_sticker")) != null) {
                    AbstractC23309i.m120760An(optJSONObject47.optInt("enable") == 1);
                    AbstractC23309i.m120979Gk(optJSONObject47.optInt("after_recent") == 1);
                }
                if (jSONObject5.has("voice_aac") && (optJSONObject46 = jSONObject5.optJSONObject("voice_aac")) != null) {
                    AbstractC23309i.m120982Gn(optJSONObject46.optInt("enable") == 1);
                    AbstractC23309i.m122470uj(optJSONObject46.optInt("max_size", 16));
                    AbstractC23309i.m121945gi(optJSONObject46.optInt("channel", 2));
                    AbstractC23309i.m122110kw(optJSONObject46.optInt("sampling_rate", 16000));
                    AbstractC23309i.m121494Uh(optJSONObject46.optInt("bit_rate", 64000));
                }
                if (jSONObject5.has("chat_photo_slider") && (optJSONObject45 = jSONObject5.optJSONObject("chat_photo_slider")) != null) {
                    AbstractC23309i.m122656zk(optJSONObject45.optInt("enable") == 1);
                    AbstractC23309i.m122096ki(optJSONObject45.optLong("stay_duration", 3000L));
                }
                if (jSONObject5.has("chat_download_file_config") && (optJSONObject44 = jSONObject5.optJSONObject("chat_download_file_config")) != null) {
                    AbstractC23309i.m120903Ei(optJSONObject44.optInt("enable_auto_open", 0));
                    AbstractC23309i.m121199Mi(optJSONObject44.optInt("pre_download_network_config", 0));
                    AbstractC23309i.m122257os(optJSONObject44.optInt("pre_download_limit_size", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));
                    AbstractC23309i.m121088Ji(optJSONObject44.optLong("auto_open_min_time_view_file", 3000L));
                    AbstractC23309i.m120866Di(optJSONObject44.optLong("auto_open_disable_duration", 3600000L));
                }
                if (jSONObject5.has("document_scanner") && (optJSONObject43 = jSONObject5.optJSONObject("document_scanner")) != null) {
                    AbstractC23309i.m122434tk(optJSONObject43.optInt("enabled", 1) == 1);
                }
                if (jSONObject5.has("webp_animation") && (optJSONObject42 = jSONObject5.optJSONObject("webp_animation")) != null) {
                    AbstractC23309i.m121093Jn(optJSONObject42.optInt("enable", 1) == 1);
                }
                if (jSONObject5.has("status_story") && (optJSONObject41 = jSONObject5.optJSONObject("status_story")) != null) {
                    AbstractC23309i.m121987hm(optJSONObject41.optInt("enable_post_bg_feed_on_story") == 1);
                }
                AbstractC23309i.m122668zw(AbstractC18069a.m96086e(jSONObject5, "secrete_msg", 1) == 1);
                AbstractC23304d.f113420o2 = jSONObject5.optInt("isShowLikeCommentProfile") == 1;
                AbstractC23304d.f113424p2 = jSONObject5.optInt("isShowLikeCommentTimeline") == 1;
                AbstractC23309i.m121361Qw(AbstractC23304d.f113420o2);
                AbstractC23309i.m121398Rw(AbstractC23304d.f113424p2);
                AbstractC23309i.m122597xz(jSONObject5.optInt("search_msg_global"));
                if (jSONObject5.has("cameraAnimFilter")) {
                    AbstractC23309i.m121422Sj(jSONObject5.getInt("cameraAnimFilter") == 1);
                }
                if (jSONObject5.has("enable_capture_image_by_volume_key")) {
                    AbstractC23309i.m122401so(jSONObject5.getInt("enable_capture_image_by_volume_key") == 1);
                }
                if (jSONObject5.has("fingerprint") && !jSONObject5.isNull("fingerprint")) {
                    AbstractC23309i.m121509Uw(jSONObject5.optInt("fingerprint", 1));
                }
                if (jSONObject5.has("friend_nearby") && !jSONObject5.isNull("friend_nearby")) {
                    AbstractC23309i.m121498Ul(jSONObject5.getInt("friend_nearby") == 1);
                }
                if (jSONObject5.has("zalo_pay") && !jSONObject5.isNull("zalo_pay")) {
                    AbstractC23306f.m120583H().m110209o(C22499f.m116325a(jSONObject5.getString("zalo_pay")));
                }
                if (jSONObject5.has("gallery") && !jSONObject5.isNull("gallery") && (optJSONObject40 = jSONObject5.optJSONObject("gallery")) != null) {
                    if (optJSONObject40.has("max_photo_chat_send")) {
                        AbstractC0924m0.m4352xk(optJSONObject40.getInt("max_photo_chat_send"));
                    }
                    if (optJSONObject40.has("enable_swipe_to_multi_select")) {
                        AbstractC23309i.m121910fl(optJSONObject40.optInt("enable_swipe_to_multi_select", 1) == 1);
                    }
                    if (optJSONObject40.has("enable_prefer_local_path_over_uri")) {
                        AbstractC23309i.m122025im(optJSONObject40.optInt("enable_prefer_local_path_over_uri", 1) == 1);
                    }
                    if (optJSONObject40.has("recommend_send_photo_hd_count")) {
                        int optInt = optJSONObject40.optInt("recommend_send_photo_hd_count", 3);
                        if (optInt >= -1 && optInt <= 10) {
                            AbstractC23309i.m121212Mv(optInt);
                        }
                        int m121376Ra = AbstractC23309i.m121376Ra();
                        if (m121376Ra == 0) {
                            AbstractC23309i.m121129Km(true);
                            AbstractC23309i.m121949gm(true);
                        } else if (m121376Ra == -1) {
                            AbstractC23309i.m121129Km(false);
                            AbstractC23309i.m121726aq(false);
                        }
                    }
                    if (optJSONObject40.has("enable_support_heic")) {
                        boolean m119946e = AbstractC23258x2.m119946e(optJSONObject40.optInt("enable_support_heic", 2));
                        AbstractC23309i.m122252on(m119946e);
                        AbstractC23258x2.f112740a = Build.VERSION.SDK_INT >= 28 && m119946e;
                        C18826a.m98813b();
                    }
                }
                if (jSONObject5.has("badge_noti") && !jSONObject5.isNull("badge_noti")) {
                    AbstractC23309i.m122023ik(jSONObject5.optInt("badge_noti", 1));
                }
                if (jSONObject5.has("voip") && !jSONObject5.isNull("voip")) {
                    JSONObject optJSONObject61 = jSONObject5.optJSONObject("voip");
                    if (optJSONObject61 != null) {
                        if (optJSONObject61.has("timeout_call")) {
                            AbstractC23309i.m121056In(optJSONObject61.optInt("timeout_call") == 1);
                        }
                        if (optJSONObject61.has("timeout_caller")) {
                            AbstractC23309i.m121697Zz(optJSONObject61.optInt("timeout_caller"));
                        }
                        if (optJSONObject61.has("preselect_enable")) {
                            AbstractC23309i.m121549Vz(optJSONObject61.optInt("preselect_enable"));
                        }
                        if (optJSONObject61.has("preselect_threshold_message_call")) {
                            AbstractC23309i.m121623Xz(optJSONObject61.optInt("preselect_threshold_message_call"));
                        }
                        if (optJSONObject61.has("preselect_time_expire")) {
                            AbstractC23309i.m121586Wz(optJSONObject61.optInt("preselect_time_expire"));
                        }
                        if (optJSONObject61.has("preselect_last_miss_call")) {
                            AbstractC23309i.m121512Uz(optJSONObject61.optInt("preselect_last_miss_call"));
                        }
                        if (optJSONObject61.has("bluetooth_ui")) {
                            AbstractC23309i.m121475Tz(optJSONObject61.optInt("bluetooth_ui"));
                        }
                        AbstractC23309i.m122286pk(optJSONObject61.optInt("enable_callback_chatlist", 1));
                        if (optJSONObject61.has("hold_call_interrupt_time_out")) {
                            AbstractC23309i.m121575Wo(optJSONObject61.optInt("hold_call_interrupt_time_out"));
                        }
                        if (optJSONObject61.has("hold_call_receive_time_out")) {
                            AbstractC23309i.m121538Vo(optJSONObject61.optInt("hold_call_receive_time_out"));
                        }
                        if (optJSONObject61.has("enable_text_support")) {
                            AbstractC23309i.m122360rk(optJSONObject61.optInt("enable_text_support"));
                        }
                        if (optJSONObject61.has("enable_scale_mode")) {
                            AbstractC23309i.m120833Cm(optJSONObject61.optInt("enable_scale_mode", 1));
                        }
                        if (optJSONObject61.has("enable_timeout_not_ringing_voice")) {
                            AbstractC23309i.m121019Hn(optJSONObject61.optInt("enable_timeout_not_ringing_voice", 1));
                        }
                        if (optJSONObject61.has("enable_log_timber_in_voip")) {
                            AbstractC23309i.m121165Ll(optJSONObject61.optInt("enable_log_timber_in_voip", 0));
                        }
                        if (optJSONObject61.has("enable_call_via_zalo_in_phone_number_popup")) {
                            AbstractC23309i.m122397sk(optJSONObject61.optInt("enable_call_via_zalo_in_phone_number_popup", 0));
                        }
                        if (optJSONObject61.has("enable_call_action_social_feed")) {
                            AbstractC23309i.m122249ok(optJSONObject61.optInt("enable_call_action_social_feed", 0));
                        }
                        if (optJSONObject61.has("list_prefix_phone_number")) {
                            AbstractC23309i.m120802Bs(optJSONObject61.optString("list_prefix_phone_number"));
                        }
                        if (optJSONObject61.has("enable_stranger_label_for_call")) {
                            AbstractC23309i.m120795Bl(optJSONObject61.optInt("enable_stranger_label_for_call", 1));
                        }
                        if (optJSONObject61.has("enable_call_via_zalo_in_action_list_of_group")) {
                            AbstractC23309i.m121099Jt(optJSONObject61.optInt("enable_call_via_zalo_in_action_list_of_group", 0));
                        }
                        if (optJSONObject61.has("enable_custom_notification_call")) {
                            AbstractC23309i.m121053Ik(optJSONObject61.optInt("enable_custom_notification_call", 0));
                        }
                        if (optJSONObject61.has("enable_boost_volume_incall")) {
                            AbstractC23309i.m122136lk(optJSONObject61.optInt("enable_boost_volume_incall", 0));
                        }
                        if (optJSONObject61.has("display_groupcall_entry_in_group_header")) {
                            AbstractC23309i.m122099kl(optJSONObject61.optInt("display_groupcall_entry_in_group_header", 0) == 1);
                        }
                        if (optJSONObject61.has("display_groupcall_entry_in_chattab_header_more")) {
                            AbstractC23309i.m122061jl(optJSONObject61.optInt("display_groupcall_entry_in_chattab_header_more", 0) == 1);
                        }
                        if (optJSONObject61.has("display_groupcall_entry_in_grouptab_row")) {
                            AbstractC23309i.m122137ll(optJSONObject61.optInt("display_groupcall_entry_in_grouptab_row", 0) == 1);
                        }
                        if (optJSONObject61.has("enable_poor_connection_popup_new")) {
                            AbstractC0924m0.m3372Qg(optJSONObject61.optInt("enable_poor_connection_popup_new", 0) == 1);
                        }
                        if (optJSONObject61.has("keep_flags_wake_up_screen_when_lock")) {
                            AbstractC0924m0.m4408zi(optJSONObject61.optInt("keep_flags_wake_up_screen_when_lock", 1) != 0);
                        }
                        if (optJSONObject61.has("switch_video_confirm")) {
                            AbstractC0924m0.m3380Qo(optJSONObject61.optInt("switch_video_confirm", 1) != 0);
                        }
                        AbstractC23309i.m122294ps(optJSONObject61.optInt("limit_member_in_groupcall", 10));
                        AbstractC23309i.m122331qs(optJSONObject61.optInt("limit_member_in_groupcall_entry_in_group", 100));
                        AbstractC23304d.m120529A(optJSONObject61);
                    }
                    JSONObject optJSONObject62 = jSONObject5.optJSONObject("callgroup");
                    if (optJSONObject62 != null && optJSONObject62.has("timeout")) {
                        AbstractC23309i.m121316Po(optJSONObject62.optInt("timeout"));
                    }
                }
                if (jSONObject5.has("qr") && (optJSONObject39 = jSONObject5.optJSONObject("qr")) != null) {
                    AbstractC0924m0.m4021mf(optJSONObject39.optInt("display_openlink_popup", 0) == 1);
                    int optInt2 = optJSONObject39.optInt("view_photo_entrypoint", 1);
                    int optInt3 = optJSONObject39.optInt("photo_footer_entrypoint", 1);
                    int optInt4 = optJSONObject39.optInt("scan_qr_photo_setting", 1);
                    if (optInt2 < 0 || optInt2 > 2) {
                        optInt2 = 1;
                    }
                    if (optInt3 < 0 || optInt3 > 1) {
                        optInt3 = 1;
                    }
                    if (optInt4 < 0 || optInt4 > 1) {
                        optInt4 = 1;
                    }
                    AbstractC0924m0.m4111pf(optInt2);
                    AbstractC0924m0.m4051nf(optInt3);
                    AbstractC0924m0.m4081of(optInt4);
                }
                C26691l.m137135j(jSONObject5);
                if (jSONObject5.has("group_name_color")) {
                    AbstractC23309i.m122250ol(jSONObject5.optInt("group_name_color"));
                }
                if (jSONObject5.has("call_contact_tab") && !jSONObject5.isNull("call_contact_tab")) {
                    AbstractC23309i.m121436Sx(jSONObject5.optInt("call_contact_tab", 1));
                }
                if (jSONObject5.has("reaction_setting")) {
                    AbstractC23309i.m122362rm(jSONObject5.optInt("reaction_setting") == 1);
                }
                if (jSONObject5.has("reaction_notification_setting")) {
                    AbstractC23309i.m122399sm(jSONObject5.optInt("reaction_notification_setting") == 1);
                }
                if (jSONObject5.has("reaction_config")) {
                    JSONObject jSONObject7 = jSONObject5.getJSONObject("reaction_config");
                    if (jSONObject7.has("quick_react_notif_setting")) {
                        AbstractC23309i.m120990Gv(jSONObject7.optString("quick_react_notif_setting"));
                        AbstractC23304d.m120549t();
                    }
                }
                if (jSONObject5.has("search_phone_global_search") && !jSONObject5.isNull("search_phone_global_search")) {
                    AbstractC23309i.m120907Em(jSONObject5.optInt("search_phone_global_search", 0));
                }
                if (jSONObject5.has("mini_profile") && !jSONObject5.isNull("mini_profile")) {
                    AbstractC23309i.m121424Sl(jSONObject5.optInt("mini_profile", 0));
                }
                if (jSONObject5.has("enable_suggest_chat") && !jSONObject5.isNull("enable_suggest_chat")) {
                    AbstractC23309i.m121798cn(jSONObject5.optInt("enable_suggest_chat", 0));
                }
                if (jSONObject5.has("msg_ttl")) {
                    AbstractC23309i.m120797Bn(jSONObject5.optInt("msg_ttl", 0));
                }
                if (jSONObject5.has("chat_head")) {
                    AbstractC23309i.m122582xk(jSONObject5.optInt("chat_head") == 1);
                }
                if (jSONObject5.has("default_chat_head")) {
                    AbstractC23309i.m122618yj(jSONObject5.optInt("default_chat_head") == 1);
                }
                if (jSONObject5.has("bubble_chat")) {
                    JSONObject optJSONObject63 = jSONObject5.optJSONObject("bubble_chat");
                    AbstractC0924m0.m3662ag(optJSONObject63 != null ? optJSONObject63.optInt("enable", 0) : 0);
                } else {
                    AbstractC0924m0.m3662ag(0);
                }
                if (jSONObject5.has("mini_call")) {
                    AbstractC23309i.m121387Rl(jSONObject5.optInt("mini_call") == 1);
                }
                if (jSONObject5.has("comment_photo_sticker")) {
                    AbstractC23309i.m120905Ek(jSONObject5.optInt("comment_photo_sticker") == 1);
                }
                if (jSONObject5.has("sync_sticker")) {
                    AbstractC23309i.m122437tn(jSONObject5.optInt("sync_sticker", 0));
                }
                if (jSONObject5.has("image_keyboard")) {
                    AbstractC23309i.m122398sl(jSONObject5.optInt("image_keyboard") == 1);
                }
                if (jSONObject5.has("populate_mention")) {
                    AbstractC23309i.m120870Dm(jSONObject5.optInt("populate_mention"));
                }
                if (jSONObject5.has("edit_feed")) {
                    AbstractC23309i.m121127Kk(jSONObject5.optInt("edit_feed") == 1);
                }
                if (jSONObject5.has("enable_bg_feed")) {
                    AbstractC23309i.m121460Tk(jSONObject5.optInt("enable_bg_feed") == 1);
                }
                if (jSONObject5.has("feed_video")) {
                    AbstractC23309i.m121721al(jSONObject5.optInt("feed_video", 0) == 1);
                }
                if (jSONObject5.has("reset_unread_number_offline")) {
                    AbstractC23309i.m122473um(jSONObject5.optInt("reset_unread_number_offline", 1) == 1);
                }
                if (jSONObject5.has("groupPoll")) {
                    AbstractC23309i.m121581Wu(jSONObject5.optJSONObject("groupPoll").toString());
                    C28176r6.m141702d().m141710k();
                }
                if (jSONObject5.has("groupTab")) {
                    AbstractC23309i.m122287pl(jSONObject5.optInt("groupTab"));
                }
                if (jSONObject5.has("media_store_right_menu")) {
                    AbstractC23309i.m121352Qn(jSONObject5.optString("media_store_right_menu"));
                }
                if (jSONObject5.has("feedRemind")) {
                    JSONObject jSONObject8 = jSONObject5.getJSONObject("feedRemind");
                    AbstractC23309i.m122064jo(jSONObject8.optInt("promotePhoto") == 1);
                    AbstractC23309i.m122102ko(jSONObject8.optInt("promoteVideo") == 1);
                    AbstractC23309i.m121989ho(jSONObject8.optInt("promoteBackground") == 1);
                    AbstractC23309i.m122027io(jSONObject8.optInt("promoteMemory") == 1);
                    AbstractC0924m0.m3170Jh(jSONObject8.optInt("promoteAlbum") == 1);
                }
                if (jSONObject5.has("story_multi_select")) {
                    AbstractC23309i.m121536Vm(jSONObject5.optInt("story_multi_select") == 1);
                }
                if (jSONObject5.has("setting_autofriend")) {
                    AbstractC23309i.m121644Yj(jSONObject5.optInt("setting_autofriend", 0));
                }
                if (jSONObject5.has("setting_shortcut_mini_chat")) {
                    AbstractC23309i.m121203Mm(jSONObject5.optInt("setting_shortcut_mini_chat") == 1);
                }
                if (jSONObject5.has("enable_keyword_mapping")) {
                    AbstractC23309i.m122657zl(jSONObject5.optInt("enable_keyword_mapping") == 1);
                }
                if (jSONObject5.has("video_big_size") && !jSONObject5.isNull("video_big_size")) {
                    JSONObject jSONObject9 = jSONObject5.getJSONObject("video_big_size");
                    if (jSONObject9.has("enable")) {
                        AbstractC23309i.m120871Dn(jSONObject9.optInt("enable") == 1);
                        AbstractC26689j.f126436b = AbstractC23309i.m121905fg();
                        AbstractC26689j.f126435a = false;
                    }
                }
                if (jSONObject5.has("typo_chat") && (optJSONObject38 = jSONObject5.optJSONObject("typo_chat")) != null) {
                    boolean z21 = optJSONObject38.optInt("setting_feature", 1) == 1;
                    boolean z22 = optJSONObject38.optInt("show_list_typo", 0) == 1;
                    int optInt5 = optJSONObject38.optInt("char_num_limit", 30);
                    AbstractC23309i.m122134li(z21);
                    AbstractC23309i.m121884ex(z22);
                    AbstractC23309i.m122210ni(optInt5);
                }
                if (jSONObject5.has("allowChangingAppTextSize")) {
                    AbstractC23309i.m122542wh(jSONObject5.getInt("allowChangingAppTextSize") == 1);
                }
                if (jSONObject5.has("parse_message_detail") && (optJSONObject37 = jSONObject5.optJSONObject("parse_message_detail")) != null) {
                    int optInt6 = optJSONObject37.optInt("parse_link", 2);
                    int optInt7 = optJSONObject37.optInt("parse_phone_number", 2);
                    int optInt8 = optJSONObject37.optInt("parse_phone_number_max_limit", 100);
                    int optInt9 = optJSONObject37.optInt("parse_link_max_limit", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
                    boolean z23 = optJSONObject37.optInt("auto_parse_background", 1) == 1;
                    int optInt10 = optJSONObject37.optInt("parse_link_client", 1);
                    if (optInt10 > 1 || optInt10 < 0) {
                        optInt10 = 1;
                    }
                    AbstractC23309i.m120841Cu(optInt6);
                    AbstractC23309i.m120915Eu(optInt7);
                    AbstractC23309i.m120878Du(optInt8);
                    AbstractC23309i.m120804Bu(optInt9);
                    AbstractC23309i.m121309Ph(z23);
                    AbstractC0924m0.m3198Kg(optInt10 == 1);
                    AbstractC0924m0.m3319Ol(optJSONObject37.optInt("max_delay_send", 1000));
                }
                if (jSONObject5.has("ignore_mute_mention")) {
                    AbstractC23309i.m121800cp(jSONObject5.optInt("ignore_mute_mention") == 1);
                }
                if (jSONObject5.has("capture_video_frame")) {
                    AbstractC23309i.m121869ei(jSONObject5.optInt("capture_video_frame") == 1);
                }
                if (jSONObject5.has("zalo_instant")) {
                    JSONObject jSONObject10 = jSONObject5.getJSONObject("zalo_instant");
                    AbstractC23309i.m122103kp(AbstractC18069a.m96086e(jSONObject10, "zinstant_config_interval_clean_cache", C17171o0.f87720c));
                    AbstractC23309i.m122405ss(AbstractC18069a.m96086e(jSONObject10, "zinstant_config_max_size_cache_total", C17171o0.f87721d));
                    AbstractC23309i.m122069jt(AbstractC18069a.m96086e(jSONObject10, "zinstant_config_max_percent_of_free_storage", C17171o0.f87722e));
                }
                if (jSONObject5.has("new_chat_bar")) {
                    AbstractC23309i.m121580Wt(jSONObject5.optString("new_chat_bar"));
                }
                if (jSONObject5.has("room_public_group")) {
                    AbstractC23309i.m122034iw(jSONObject5.optInt("room_public_group") == 1);
                }
                if (jSONObject5.has("display_name_config") && (optJSONObject36 = jSONObject5.optJSONObject("display_name_config")) != null) {
                    int optInt11 = optJSONObject36.optInt("enable_stranger_alias", 0);
                    int optInt12 = optJSONObject36.optInt("enable_feature_alias", 0);
                    AbstractC23309i.m121610Xm(optInt11);
                    AbstractC23309i.m121423Sk(optInt12);
                    C18631a.m98446i().f93749a = optInt12 == 1;
                    C18631a.m98446i().f93750b = optInt11 == 1;
                    C18631a.m98446i().m98463v(optJSONObject36.optInt("max_alias_length", 40));
                }
                if (jSONObject5.has("group_calendar") && (optJSONObject35 = jSONObject5.optJSONObject("group_calendar")) != null) {
                    int optInt13 = optJSONObject35.optInt("show_range_delta");
                    if (optInt13 > 0) {
                        AbstractC23309i.m121605Xh(optInt13);
                    }
                    AbstractC0924m0.m4383ym(optJSONObject35.optInt("remindFor", 0));
                }
                if (jSONObject5.has("reminder_from_message") && (optJSONObject34 = jSONObject5.optJSONObject("reminder_from_message")) != null) {
                    AbstractC23309i.m121315Pn(optJSONObject34.optInt("enable_detect_date_time") == 1);
                    AbstractC23309i.m122447tx(optJSONObject34.optInt("src_msg_detect"));
                    AbstractC23309i.m121278On(optJSONObject34.optInt("enable_attach_footer") == 1);
                    AbstractC23309i.m122410sx(optJSONObject34.optInt("src_attach_footer"));
                }
                if (jSONObject5.has("inviteGroupMulti")) {
                    JSONObject jSONObject11 = jSONObject5.getJSONObject("inviteGroupMulti");
                    if (jSONObject11.has("enable") && jSONObject11.getInt("enable") != 1) {
                        z17 = false;
                        AbstractC23309i.m122583xl(z17);
                        AbstractC23309i.m122221nt(!jSONObject11.has("maxSelectCount") ? jSONObject11.getInt("maxSelectCount") : 3);
                    }
                    z17 = true;
                    AbstractC23309i.m122583xl(z17);
                    AbstractC23309i.m122221nt(!jSONObject11.has("maxSelectCount") ? jSONObject11.getInt("maxSelectCount") : 3);
                }
                if (jSONObject5.has("createGroupFrom11")) {
                    AbstractC23309i.m121016Hk(jSONObject5.getInt("createGroupFrom11") == 1);
                }
                if (jSONObject5.has("comm4work")) {
                    JSONObject jSONObject12 = jSONObject5.getJSONObject("comm4work");
                    if (jSONObject12.has("chat_label")) {
                        JSONObject jSONObject13 = jSONObject12.getJSONObject("chat_label");
                        if (jSONObject13.optInt("enable_chat_label_view") == 1) {
                            AbstractC0924m0.m3229Li(0L);
                        }
                        if (jSONObject13.has("read_later_label_id")) {
                            AbstractC0924m0.m3998lm(jSONObject13.getInt("read_later_label_id"));
                        }
                        if (jSONObject13.has("refresh_label_interval")) {
                            AbstractC0924m0.m4148qm(jSONObject13.getInt("refresh_label_interval"));
                        }
                        if (jSONObject13.has("enable_popup_after_mute")) {
                            AbstractC0924m0.m3401Rg(jSONObject13.getInt("enable_popup_after_mute"));
                        }
                        AbstractC0924m0.m2906Ae(jSONObject13.toString());
                        C18932a c18932a = C18932a.f94442a;
                        c18932a.m99190p();
                        if (c18932a.m99180d().m104197d()) {
                            AbstractC0924m0.m3258Mi(0L);
                            C18935d.m99214s().m99222K(false);
                        }
                    }
                }
                if (jSONObject5.has("enable_expand_noti_media")) {
                    AbstractC23309i.m121312Pk(jSONObject5.optInt("enable_expand_noti_media", 1));
                }
                if (jSONObject5.has("enable_show_preview_sticker")) {
                    AbstractC23309i.m121277Om(jSONObject5.optInt("enable_show_preview_sticker", 1));
                }
                if (jSONObject5.has("enable_show_preview_video")) {
                    AbstractC23309i.m121314Pm(jSONObject5.optInt("enable_show_preview_video", 1));
                }
                if (jSONObject5.has("enable_show_preview_photo")) {
                    AbstractC23309i.m121240Nm(jSONObject5.optInt("enable_show_preview_photo", 1));
                }
                if (jSONObject5.has("enable_refresh_suggest_chat_in_bg")) {
                    AbstractC23309i.m122436tm(jSONObject5.optInt("enable_refresh_suggest_chat_in_bg", 0) == 1);
                }
                if (jSONObject5.has("chat_mute_banner_expired_time")) {
                    AbstractC0924m0.m4200se(jSONObject5.optInt("chat_mute_banner_expired_time", 72));
                }
                AbstractC23309i.m121061Is(jSONObject5.has("live_location") ? jSONObject5.optString("live_location") : "");
                C8967m.m47885d0();
                if (jSONObject5.has("encrypt_http_params_turnoff")) {
                    AbstractC23309i.m121201Mk(jSONObject5.optInt("encrypt_http_params_turnoff", 0) != 1);
                } else {
                    AbstractC23309i.m121201Mk(true);
                }
                if (jSONObject5.has("pin_setting") && (optJSONObject33 = jSONObject5.optJSONObject("pin_setting")) != null) {
                    AbstractC23309i.m121653Ys(optJSONObject33.optInt("maxPin", 0));
                    int optInt14 = optJSONObject33.optInt("version", -1);
                    if (optInt14 <= 0) {
                        optInt14 = 1;
                    }
                    if (AbstractC0924m0.m3796f0() < optInt14 && System.currentTimeMillis() > AbstractC23309i.m122083k6() + 10000) {
                        AbstractC0924m0.m3399Re(optInt14);
                        AbstractC23309i.m121059Iq(0L);
                    }
                }
                AbstractC23309i.m122658zm(true);
                AbstractC23309i.m121921fw(2628000000L);
                AbstractC23309i.m120759Am(true);
                AbstractC23309i.m121959gw(2628000000L);
                AbstractC23309i.m122621ym(true);
                AbstractC23309i.m121883ew(2628000000L);
                if (jSONObject5.has("reuse_file") && !jSONObject5.isNull("reuse_file")) {
                    JSONObject jSONObject14 = jSONObject5.getJSONObject("reuse_file");
                    if (jSONObject14.has("reuse_chat_photo") && !jSONObject14.isNull("reuse_chat_photo")) {
                        JSONObject jSONObject15 = jSONObject14.getJSONObject("reuse_chat_photo");
                        if (jSONObject15.has("enable")) {
                            AbstractC23309i.m122658zm(jSONObject15.optInt("enable") == 1);
                        }
                        if (jSONObject15.has("expired_time")) {
                            long optLong = jSONObject15.optLong("expired_time");
                            if (optLong > 0) {
                                AbstractC23309i.m121921fw(optLong);
                            }
                        }
                    }
                    if (jSONObject14.has("reuse_chat_video") && !jSONObject14.isNull("reuse_chat_video")) {
                        JSONObject jSONObject16 = jSONObject14.getJSONObject("reuse_chat_video");
                        if (jSONObject16.has("enable")) {
                            AbstractC23309i.m120759Am(jSONObject16.optInt("enable") == 1);
                        }
                        if (jSONObject16.has("expired_time")) {
                            long optLong2 = jSONObject16.optLong("expired_time");
                            if (optLong2 > 0) {
                                AbstractC23309i.m121959gw(optLong2);
                            }
                        }
                    }
                    if (jSONObject14.has("reuse_chat_file") && !jSONObject14.isNull("reuse_chat_file")) {
                        JSONObject jSONObject17 = jSONObject14.getJSONObject("reuse_chat_file");
                        if (jSONObject17.has("enable")) {
                            AbstractC23309i.m122621ym(jSONObject17.optInt("enable") == 1);
                        }
                        if (jSONObject17.has("expired_time")) {
                            long optLong3 = jSONObject17.optLong("expired_time");
                            if (optLong3 > 0) {
                                AbstractC23309i.m121883ew(optLong3);
                            }
                        }
                    }
                }
                if (jSONObject5.has("phonebook") && (optJSONObject32 = jSONObject5.optJSONObject("phonebook")) != null) {
                    AbstractC23309i.m122585xn(optJSONObject32.optInt("enable_convert_tool") == 1);
                    AbstractC23309i.m122622yn(optJSONObject32.optInt("enable_revert_tool") == 1);
                    AbstractC23309i.m122326qn(optJSONObject32.optInt("sync_contact_behavior") == 1);
                }
                if (jSONObject5.has("suggest_remove_friend") && (optJSONObject31 = jSONObject5.optJSONObject("suggest_remove_friend")) != null) {
                    boolean z24 = optJSONObject31.optInt("enable", 0) == 1;
                    AbstractC23309i.m122139ln(z24);
                    AbstractC23309i.m122369rt(optJSONObject31.optInt("max_sync_delete", 10));
                    AbstractC23309i.m121067Iy(optJSONObject31.optLong("suggest_valid_time", 0L) * 1000);
                    AbstractC23309i.m121648Yn(optJSONObject31.optLong("banner_expire_time", 0L) * 1000);
                    if (!z24) {
                        AbstractC23309i.m122361rl(false);
                        AbstractC23309i.m120765As("");
                    }
                }
                if (jSONObject5.has("show_bubble_call_native")) {
                    AbstractC23309i.m121808cx(jSONObject5.optInt("show_bubble_call_native", 1));
                }
                if (jSONObject5.has("bubble_call_native") && (optJSONObject30 = jSONObject5.optJSONObject("bubble_call_native")) != null) {
                    AbstractC23309i.m121052Ij(optJSONObject30.optInt("duration", 300));
                    AbstractC23309i.m121394Rs(optJSONObject30.optInt("max_bubble", 30));
                    AbstractC23309i.m121431Ss(optJSONObject30.optInt("max_bubble_success_incoming", 10));
                }
                if (jSONObject5.has("switch_account") && (optJSONObject29 = jSONObject5.optJSONObject("switch_account")) != null) {
                    AbstractC23309i.m121164Lk(optJSONObject29.optInt("edit_phone", 0) == 1);
                    AbstractC23309i.m122289pn(optJSONObject29.optInt("enable", 0) == 1);
                    AbstractC23309i.m122332qt(optJSONObject29.optInt("max_account", 5));
                    AbstractC23309i.m122485uy(optJSONObject29.optLong("expire_time", 300000L));
                }
                if (jSONObject5.has("reminder") && (optJSONObject28 = jSONObject5.optJSONObject("reminder")) != null) {
                    AbstractC23309i.m121534Vk(optJSONObject28.optInt("notify_message_banner", 1));
                }
                if (jSONObject5.has("enable_new_resize_photo_logic")) {
                    AbstractC23309i.m121535Vl(jSONObject5.optInt("enable_new_resize_photo_logic", 0) == 1);
                }
                AbstractC23009a3.f111957a = AbstractC23309i.m122131lf();
                if (jSONObject5.has("global_search_setting") && (optJSONObject27 = jSONObject5.optJSONObject("global_search_setting")) != null) {
                    AbstractC23309i.m121608Xk(optJSONObject27.optInt("enable_search_phonebook", 0));
                }
                if (jSONObject5.has("globalsearch")) {
                    C19322f1.m101118J(jSONObject5);
                }
                if (jSONObject5.has("messages") && (optJSONObject26 = jSONObject5.optJSONObject("messages")) != null) {
                    int optInt15 = optJSONObject26.optInt("offCountUnreadMsg", 0);
                    if (optInt15 < 0) {
                        optInt15 = 0;
                    }
                    AbstractC23309i.m121571Wk(optInt15);
                }
                if (jSONObject5.has("call") && (optJSONObject25 = jSONObject5.optJSONObject("call")) != null) {
                    AbstractC23309i.m121275Ok(optJSONObject25.optInt("enable_entry_call_profile", 0));
                    AbstractC23309i.m121238Nk(optJSONObject25.optInt("enable_entry_call_global_search", 0));
                    C19322f1.m101120L().reset();
                    long optLong4 = optJSONObject25.optLong("call_shortcut_range_time", 604800000L);
                    int optInt16 = optJSONObject25.optInt("call_shortcut_callee_count", 5);
                    int optInt17 = optJSONObject25.optInt("enable_callshortcut_feature", 0);
                    AbstractC23309i.m121064Iv(optLong4);
                    AbstractC23309i.m121679Zh(optInt16);
                    C26444a.m136319a().m136322d(optInt17);
                }
                if (jSONObject5.has("global_item_mode")) {
                    int optInt18 = jSONObject5.optInt("global_item_mode", 1);
                    if (optInt18 == 3) {
                        optInt18 = 0;
                    }
                    AbstractC23309i.m121094Jo(optInt18);
                }
                if (!jSONObject5.has("suggestion") || (optJSONObject24 = jSONObject5.optJSONObject("suggestion")) == null) {
                    jSONObject3 = jSONObject5;
                } else {
                    AbstractC23309i.m120868Dk(optJSONObject24.optInt("collapse_if_possible", 0));
                    int optInt19 = optJSONObject24.optInt("show_suggestion_phonebook_contact", 1);
                    int optInt20 = optJSONObject24.optInt("show_suggestion_phonebook_find_friend", 1);
                    int optInt21 = optJSONObject24.optInt("show_suggestion_phonebook_message", 1);
                    AbstractC23309i.m122586xo(optInt20 == 1);
                    AbstractC23309i.m122623yo(optInt19 == 1);
                    AbstractC23309i.m122125lA(optInt21 == 1);
                    AbstractC23309i.m120794Bk(optJSONObject24.optInt("enable_clear_badge_suggestion_friend", 0));
                    jSONObject3 = jSONObject5;
                    AbstractC23309i.m122263oy(optJSONObject24.optLong("time_clear_badge_new_friend", 259200L) * 1000);
                    AbstractC23309i.m122300py(optJSONObject24.optLong("time_clear_badge_suggestion_friend", 259200L) * 1000);
                    AbstractC23309i.m122150ly(optJSONObject24.optLong("time_clear_suggestion_friend_recent_update", 604800L) * 1000);
                    AbstractC0924m0.m3227Lg(optJSONObject24.optInt("enable_pasteboard_suggestion_type", 1) != 0);
                    long optLong5 = optJSONObject24.optLong("time_clear_badge_friend_request", -1L);
                    if (optLong5 != 0) {
                        optLong5 *= 1000;
                        if (optLong5 < 0) {
                            optLong5 = 259200000;
                        } else if (optLong5 < 86400000) {
                            optLong5 = 86400000;
                        }
                    }
                    AbstractC23309i.m122112ky(optLong5);
                }
                if (jSONObject3.has("linkSuggestSetting") && (optJSONObject23 = jSONObject3.optJSONObject("linkSuggestSetting")) != null) {
                    C32190y7.m155216t().m155223E(optJSONObject23.toString());
                }
                if (jSONObject3.has("enable_popup_quick_reply")) {
                    AbstractC23309i.m121911fm(jSONObject3.optInt("enable_popup_quick_reply", 0));
                }
                if (jSONObject3.has("friend") && (optJSONObject22 = jSONObject3.optJSONObject("friend")) != null) {
                    AbstractC23309i.m122633yy(optJSONObject22.optLong("time_interval_allow_friend_request_headup", 3600000L) * 1000);
                    int optInt22 = optJSONObject22.optInt("accept_friend_mode", 0);
                    boolean z25 = optJSONObject22.optInt("enable_show_setting_see_feed_form_auto_friend", 1) == 1;
                    C26446c.m136326b().m136335j(optInt22);
                    C26446c.m136326b().m136333h(z25);
                    AbstractC23309i.m122063jn(optJSONObject22.optInt("enable_show_setting_suggest_me_src_datamining", 1));
                    AbstractC23309i.m122295pt(optJSONObject22.optInt("max_close_friend", 6));
                    AbstractC23309i.m121834dl(optJSONObject22.optInt("enable_force_sync_discover_for_friend_request", 0));
                    AbstractC23309i.m121435Sw(optJSONObject22.optInt("enable_new_friend_section", 1));
                    JSONObject optJSONObject64 = optJSONObject22.optJSONObject("force_set_friend_request_msg");
                    if (optJSONObject64 != null && (optJSONArray2 = optJSONObject64.optJSONArray("screen_srcs")) != null) {
                        AbstractC0924m0.m3547Wh(optJSONArray2.toString());
                        AbstractC21935u.m114521K(optJSONArray2);
                    }
                    AbstractC0924m0.m3642Zp(optJSONObject22.optInt("username_at_contacts_tab", 1));
                    AbstractC0924m0.m3672aq(optJSONObject22.optInt("username_at_mention", 1));
                    AbstractC0924m0.m3348Pl(optJSONObject22.optInt("contactname_at_profile", 1));
                    AbstractC0924m0.m3696bk(optJSONObject22.optString("limit_friend_popup_text_main", ""));
                    AbstractC0924m0.m3666ak(optJSONObject22.optString("limit_friend_popup_text_cta", ""));
                }
                if (jSONObject3.has("sync_delete") && (optJSONObject21 = jSONObject3.optJSONObject("sync_delete")) != null) {
                    AbstractC23309i.m121510Ux(optJSONObject21.optInt("enable_sync_delete_from_PC", 1) == 1);
                    AbstractC23309i.m122655zj(optJSONObject21.optInt("enable_delete_for_everyone", 1) == 1);
                    AbstractC23309i.m122443tt(optJSONObject21.optLong("max_time_delete_for_everyone", 1800L));
                    AbstractC23309i.m122406st(optJSONObject21.optLong("max_time_delete_for_admin", 1800L));
                    AbstractC23309i.m122432ti(optJSONObject21.optInt("client_control_notif_delete_msg", 1) == 1);
                    AbstractC23309i.m122035ix(optJSONObject21.optInt("should_show_popup_when_delete", 0) == 1);
                }
                if (jSONObject3.has("show_dialog_permission_contact")) {
                    AbstractC23309i.m121310Pi(jSONObject3.optInt("show_dialog_permission_contact", 0) == 1);
                } else {
                    AbstractC23309i.m121310Pi(false);
                }
                if (jSONObject3.has("unread_count") && (optJSONObject20 = jSONObject3.optJSONObject("unread_count")) != null) {
                    AbstractC23309i.m121886ez(optJSONObject20.optInt("enable_for_stranger", 1) == 1);
                    AbstractC23309i.m121848dz(optJSONObject20.optInt("enable_for_muted_conversation", 1) == 1);
                }
                if (jSONObject3.has("profile_music") && (optJSONObject19 = jSONObject3.optJSONObject("profile_music")) != null) {
                    if (optJSONObject19.has("enable")) {
                        boolean z26 = optJSONObject19.optInt("enable", 0) == 1;
                        AbstractC23309i.m122176mm(z26);
                        if (z26) {
                            AbstractC0924m0.m2995Dg(true);
                        }
                    }
                    if (optJSONObject19.has("auto_play_my_music")) {
                        AbstractC23309i.m121346Qh(optJSONObject19.optInt("auto_play_my_music", 0) == 1);
                    }
                    if (optJSONObject19.has("auto_play_user_music")) {
                        AbstractC23309i.m121383Rh(optJSONObject19.optInt("auto_play_user_music", 0) == 1);
                    }
                }
                if (jSONObject3.has("preview_layout_postfeed")) {
                    AbstractC23309i.m122138lm(jSONObject3.optInt("preview_layout_postfeed", 0) == 1);
                }
                JSONObject optJSONObject65 = jSONObject3.optJSONObject("sticker_promote");
                AbstractC23306f.m120726x1().mo150747k(optJSONObject65 != null ? optJSONObject65.toString() : "");
                if (jSONObject3.has("enable_todo_task")) {
                    AbstractC23309i.m122548wn(jSONObject3.optInt("enable_todo_task", 0) == 1);
                } else {
                    AbstractC23309i.m122548wn(false);
                }
                if (jSONObject3.has("promote_labankey") && (optJSONObject18 = jSONObject3.optJSONObject("promote_labankey")) != null) {
                    AbstractC23309i.m122325qm(optJSONObject18.optInt("enable_in_setting_change_theme", 0) == 1);
                }
                if (jSONObject3.has("like_comment_feed")) {
                    AbstractC23309i.m120869Dl(jSONObject3.optInt("like_comment_feed") == 1);
                }
                if (jSONObject3.has("userOnlineStatus") && (optJSONObject17 = jSONObject3.optJSONObject("userOnlineStatus")) != null) {
                    AbstractC23309i.m120832Cl(optJSONObject17.optInt("enable_last_seen", 0));
                    AbstractC23309i.m122179mp(optJSONObject17.optLong("refresh_last_seen_interval", 0L));
                    AbstractC23309i.m122328qp(optJSONObject17.optLong("online_interval", 180L));
                    AbstractC23309i.m121092Jm(optJSONObject17.optInt("enable_setting_online_status", 0));
                    AbstractC0924m0.m4144qi(optJSONObject17.optLong("refresh_last_online_time_interval", 0L));
                }
                AbstractC23306f.m120676j().m128390G(jSONObject3.optJSONObject("sync_messages"), jSONObject3.optJSONObject("backup_media"), jSONObject.optJSONObject("android"), z12);
                AbstractC23306f.m120676j().m128409d();
                AbstractC23306f.m120732z1().m109403h(jSONObject3);
                if (jSONObject3.has("notify_thread_hidden_mute")) {
                    AbstractC23309i.m121247Nt(jSONObject3.optInt("notify_thread_hidden_mute", 0));
                }
                if (jSONObject3.has("searchMsgV2")) {
                    AbstractC0924m0.m3843gh(jSONObject3.optInt("searchMsgV2", 1) == 1);
                }
                if (jSONObject3.has("enable_security_hub")) {
                    AbstractC0924m0.m3873hh(jSONObject3.optInt("enable_security_hub", 0) == 1);
                }
                AbstractC23306f.m120652d().m109859M0(jSONObject3.optString("chat_media_auto_download", ""), false);
                AbstractC31111g.m151134o(jSONObject3);
                if (jSONObject3.has("contacttab") && (optJSONObject16 = jSONObject3.optJSONObject("contacttab")) != null) {
                    AbstractC0924m0.m3140Ig(optJSONObject16.optInt("friendlist", 0) == 1);
                    AbstractC0924m0.m4377yg(optJSONObject16.optInt("makefriend", 0) == 1);
                    AbstractC0924m0.m4232tg(optJSONObject16.optInt("friendrequest", 1) == 1);
                    if (!z11) {
                        ZaloListView.m86959QN();
                    }
                }
                JSONObject optJSONObject66 = jSONObject3.optJSONObject("2fa_setting");
                if (optJSONObject66 != null) {
                    i12 = optJSONObject66.optInt("enable_entrypoint", 0);
                    i11 = optJSONObject66.optInt("enable_biometric", 0);
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                AbstractC0924m0.m3903ih(i12);
                AbstractC0924m0.m3487Uf(i11);
                if (jSONObject3.has("quickMess") && (optJSONObject15 = jSONObject3.optJSONObject("quickMess")) != null) {
                    AbstractC0924m0.m3758dm(optJSONObject15.optInt("enable", 1) >= 1);
                    AbstractC0924m0.m3728cm(optJSONObject15.optLong("sync_time", 86400000L));
                    AbstractC0924m0.m3788em(optJSONObject15.optInt("max_qm", 50));
                    AbstractC0924m0.m3698bm(optJSONObject15.optInt("max_char", 1500));
                    AbstractC0924m0.m3668am(optJSONObject15.optInt("max_byte", 2800));
                }
                if (jSONObject3.has("autoReply") && (optJSONObject14 = jSONObject3.optJSONObject("autoReply")) != null) {
                    AbstractC0924m0.m3369Qd(optJSONObject14.optInt("enable", 0) >= 1);
                    AbstractC0924m0.m3340Pd(optJSONObject14.optLong("syncTime", 86400000L));
                    AbstractC0924m0.m3514Vd(optJSONObject14.optInt("maxSetting", 0));
                    AbstractC0924m0.m3427Sd(optJSONObject14.optInt("maxActive", 0));
                    AbstractC0924m0.m3485Ud(optJSONObject14.optInt("maxChar", 1200));
                    AbstractC0924m0.m3456Td(optJSONObject14.optInt("maxByte", ZAbstractBase.ZVU_PROCESS_FLUSH));
                }
                if (jSONObject3.has("product_catalog") && (optJSONObject13 = jSONObject3.optJSONObject("product_catalog")) != null) {
                    AbstractC0924m0.m3493Ul(optJSONObject13.toString());
                    C28669n.Companion.m143559a().m143557r0(optJSONObject13);
                }
                if (jSONObject3.has("tracking_log_chat") && (optJSONObject12 = jSONObject3.optJSONObject("tracking_log_chat")) != null) {
                    if (optJSONObject12.has("enable_tl_suggest_sticker")) {
                        AbstractC23309i.m121723an(optJSONObject12.optInt("enable_tl_suggest_sticker", 0) == 1);
                    }
                    if (optJSONObject12.has("enable_tl_sticker_panel")) {
                        AbstractC23309i.m121684Zm(optJSONObject12.optInt("enable_tl_sticker_panel", 0) == 1);
                    }
                    if (optJSONObject12.has("enable_tl_model_suggestion")) {
                        AbstractC23309i.m121647Ym(optJSONObject12.optInt("enable_tl_model_suggestion", 0) == 1);
                    }
                    C2535j.f10308a.m12776x(optJSONObject12);
                    C2549x.f10397a.m12854j(optJSONObject12.optJSONObject("tl_rolled_media_detect"), true);
                }
                if (jSONObject3.has("search_setting") && (optJSONObject11 = jSONObject3.optJSONObject("search_setting")) != null && optJSONObject11.has("enable")) {
                    AbstractC23309i.m120944Fm(optJSONObject11.optInt("enable", 0) == 1);
                }
                if (jSONObject3.has("chat_multi_selection") && (optJSONObject10 = jSONObject3.optJSONObject("chat_multi_selection")) != null && optJSONObject10.has("max_number_of_selected_messages")) {
                    AbstractC23309i.m121994ht(optJSONObject10.optInt("max_number_of_selected_messages", 50));
                }
                m119106T(jSONObject3, jSONObject2);
                m119104R(jSONObject3);
                if (jSONObject3.has("zalo_shortcuts") && Build.VERSION.SDK_INT >= 25 && (optJSONObject9 = jSONObject3.optJSONObject("zalo_shortcuts")) != null) {
                    boolean m122490v2 = AbstractC23309i.m122490v2();
                    AbstractC23309i.m121497Uk(optJSONObject9.optInt("enabled", 0) == 1);
                    AbstractC23309i.m121622Xy(optJSONObject9.optInt("type_data_dynamic_shortcut_app", 1));
                    if (!AbstractC21777d.m112317h() && m122490v2) {
                        C26939u.m138770q().m138777B();
                        C26939u.m138770q().m138780i();
                    }
                }
                if (jSONObject3.has("verify_account_with_identity_card") && (optJSONObject8 = jSONObject3.optJSONObject("verify_account_with_identity_card")) != null) {
                    AbstractC23309i.m121179Lz(optJSONObject8.toString());
                }
                if (jSONObject3.has("chat") && (optJSONObject7 = jSONObject3.optJSONObject("chat")) != null) {
                    int optInt23 = optJSONObject7.optInt("max_thread_allow_share");
                    if (optInt23 <= 0) {
                        optInt23 = 20;
                    }
                    AbstractC0924m0.m4410zk(optInt23);
                    JSONObject optJSONObject67 = optJSONObject7.optJSONObject("log");
                    if (optJSONObject67 != null && optJSONObject67.has("load_msg_csc")) {
                        AbstractC0924m0.m3996lk(optJSONObject67.optInt("load_msg_csc"));
                    }
                }
                if (jSONObject3.has("suggest_comment") && (optJSONObject6 = jSONObject3.optJSONObject("suggest_comment")) != null) {
                    AbstractC0924m0.m3206Ko(optJSONObject6.toString());
                    C20120e.f99217a.m104725e();
                }
                if (jSONObject3.has("sound_manager_player_type")) {
                    AbstractC0924m0.m4150qo(jSONObject3.optInt("sound_manager_player_type", 0));
                }
                if (jSONObject3.has("undo_delete_conversation") && (optJSONObject5 = jSONObject3.optJSONObject("undo_delete_conversation")) != null) {
                    boolean z27 = optJSONObject5.optInt("enable", 1) != 0;
                    long optLong6 = optJSONObject5.optLong("timeout", 5000L);
                    AbstractC0924m0.m3410Rp(z27);
                    AbstractC0924m0.m3439Sp(Math.min(Math.max(optLong6, 2000L), 15000L));
                    C32044o1.f147550j = AbstractC0924m0.m3653a7();
                }
                C20795g.f102172a.m108504i(jSONObject3.optJSONObject("tabme"), true);
                C20793f.f102166a.m108495e(jSONObject3.optJSONObject("tabdiscovery"), true);
                C20797h.f102195a.m108527c(jSONObject3.optJSONObject("tabmore"));
                JSONObject optJSONObject68 = jSONObject3.optJSONObject("self_delete_conversation");
                if (optJSONObject68 != null) {
                    boolean z28 = optJSONObject68.optInt("enable_11", 0) != 0;
                    boolean z29 = optJSONObject68.optInt("enable_group", 0) != 0;
                    boolean z31 = optJSONObject68.optInt("ttl_rotate_desc_csc", 1) != 0;
                    AbstractC0924m0.m4355xn(z28);
                    AbstractC0924m0.m4384yn(z29);
                    AbstractC0924m0.m3294Np(z31);
                    if (!z28 && !z29) {
                        C32037n9.f147516a.m154554l();
                    }
                    AbstractC0924m0.m4413zn(optJSONObject68.optString("time_frames", ""));
                    C32037n9 c32037n9 = C32037n9.f147516a;
                    c32037n9.m154549B();
                    c32037n9.m154553k();
                }
                if (jSONObject3.has("enable_social_hide_block_setting")) {
                    AbstractC0924m0.m3574Xf(jSONObject3.optInt("enable_social_hide_block_setting", 1) == 1);
                }
                if (jSONObject3.has("enable_social_hide_block_privacy_setting")) {
                    AbstractC0924m0.m3545Wf(jSONObject3.optInt("enable_social_hide_block_privacy_setting", 0) == 1);
                }
                if (jSONObject3.has("realtime_like_comment_timeline")) {
                    AbstractC0924m0.m3633Zg(jSONObject3.getJSONObject("realtime_like_comment_timeline").optInt("enable", 0) == 1);
                    C32543a.f150389a.m157596h();
                }
                if (!jSONObject3.has("e2ee") || (optJSONObject4 = jSONObject3.optJSONObject("e2ee")) == null) {
                    jSONObject4 = jSONObject3;
                } else {
                    boolean z32 = optJSONObject4.optInt("enable_11") == 1;
                    boolean z33 = optJSONObject4.optInt("enable_group") == 1;
                    boolean z34 = optJSONObject4.optInt("enable_group_new", 1) == 1;
                    boolean z35 = optJSONObject4.optInt("enable_entry_point_group") == 1;
                    boolean z36 = optJSONObject4.optInt("allowStranger") == 1;
                    int optInt24 = optJSONObject4.optInt("group_limit", 10);
                    long optLong7 = optJSONObject4.optLong("init_response_timeout", 3000L);
                    int optInt25 = optJSONObject4.optInt("init_max_failed_attempt", 3);
                    boolean z37 = optJSONObject4.optInt("enable_suggest_sticker") == 1;
                    boolean z38 = optJSONObject4.optInt("enable_suggestion_footer") == 1;
                    jSONObject4 = jSONObject3;
                    boolean z39 = optJSONObject4.optInt("beta") == 1;
                    boolean z41 = optJSONObject4.optInt("enable_group_evict_reinit", 1) == 1;
                    boolean z42 = optJSONObject4.optInt("enable_group_refresh_11", 1) == 1;
                    int optInt26 = optJSONObject4.optInt("limit_counter_11", ZAbstractBase.ZVU_PROCESS_FLUSH);
                    int optInt27 = optJSONObject4.optInt("limit_counter_group", ZAbstractBase.ZVU_PROCESS_FLUSH);
                    boolean z43 = optJSONObject4.optInt("default_11", 0) == 1;
                    boolean z44 = optJSONObject4.optInt("default_11_allow_downgrade", 1) == 1;
                    boolean z45 = optJSONObject4.optInt("default_11_allow_unencrypted_msg", 0) == 1;
                    JSONObject optJSONObject69 = optJSONObject4.optJSONObject("default_11_banner");
                    if (optJSONObject69 != null) {
                        z14 = z45;
                        boolean z46 = optJSONObject69.optInt("enable", 0) == 1;
                        int optInt28 = optJSONObject69.optInt("frequency", 0);
                        i14 = optInt28 < 0 ? 0 : optInt28;
                        int optInt29 = optJSONObject69.optInt("remind", 0);
                        if (optInt29 < 0) {
                            z15 = z46;
                            i13 = 0;
                        } else {
                            i13 = optInt29;
                            z15 = z46;
                        }
                    } else {
                        z14 = z45;
                        i13 = 0;
                        z15 = false;
                        i14 = 0;
                    }
                    int i15 = i13;
                    boolean z47 = optJSONObject4.optInt("enable_reset_session_11", 1) == 1;
                    boolean m4254u9 = AbstractC0924m0.m4254u9();
                    boolean m4341x9 = AbstractC0924m0.m4341x9();
                    AbstractC0924m0.m3872hg(z32);
                    AbstractC0924m0.m4022mg(z33);
                    AbstractC0924m0.m3962kg(z34);
                    AbstractC0924m0.m4112pg(z35);
                    AbstractC0924m0.m2965Cf(z36);
                    AbstractC0924m0.m4294vk(optInt24);
                    AbstractC0924m0.m3110Hf(optLong7);
                    AbstractC0924m0.m3139If(optInt25);
                    AbstractC0924m0.m2936Bf(z37);
                    AbstractC0924m0.m2907Af(z38);
                    AbstractC0924m0.m2994Df(z39);
                    AbstractC0924m0.m3992lg(z41);
                    AbstractC0924m0.m4052ng(z42);
                    C31986k3 c31986k3 = C31986k3.f147083a;
                    c31986k3.m154099L2(optInt26, optInt27);
                    AbstractC0924m0.m3902ig(z43);
                    AbstractC0924m0.m3195Kd(z44);
                    AbstractC0924m0.m3169Jg(z14);
                    AbstractC0924m0.m3932jg(z15);
                    AbstractC0924m0.m3576Xh(i14);
                    AbstractC0924m0.m4325wm(i15);
                    AbstractC0924m0.m3753dh(z47);
                    c31986k3.m154100M2();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("HandleLogin SocketConnection.nativeSetE2ee ");
                    if (!z32 && !z34) {
                        z16 = false;
                        sb2.append(z16);
                        C24559a.m127933c("[E2EE]", sb2.toString());
                        if (m4254u9 == AbstractC0924m0.m4254u9() || m4341x9 != AbstractC0924m0.m4341x9()) {
                            c31986k3.m154089G0();
                        }
                    }
                    z16 = true;
                    sb2.append(z16);
                    C24559a.m127933c("[E2EE]", sb2.toString());
                    if (m4254u9 == AbstractC0924m0.m4254u9()) {
                    }
                    c31986k3.m154089G0();
                }
                JSONObject jSONObject18 = jSONObject4;
                if (!jSONObject18.has("name_card") || (optJSONObject3 = jSONObject18.optJSONObject("name_card")) == null) {
                    z13 = true;
                } else {
                    z13 = optJSONObject3.optInt("qr_enable", 1) != 0;
                }
                AbstractC0924m0.m3024Eg(z13);
                ChatRowRecommendContact.Companion.m61604m(z13);
                C3432a.f14402a.m17246o(jSONObject18.optJSONObject("business_account"));
                if (jSONObject18.has("transfer_msg2pc") && (optJSONObject2 = jSONObject18.optJSONObject("transfer_msg2pc")) != null) {
                    AbstractC23306f.m120594K1().m93893f(optJSONObject2);
                }
                if (jSONObject18.has("server_maintenance") && (optJSONObject = jSONObject18.optJSONObject("server_maintenance")) != null) {
                    long optLong8 = optJSONObject.optLong("startTime");
                    long optLong9 = optJSONObject.optLong("endTime");
                    if (optLong8 > 0 && optLong9 > 0) {
                        AbstractC0924m0.m3002Dn(optLong8);
                        AbstractC0924m0.m2973Cn(optLong9);
                    }
                }
                AbstractC23306f.m120723w1().m18145n(jSONObject18.optInt("enable_search_gif_in_panel", 0) == 1);
                if (!jSONObject18.has("jumplink_domain_required") || (optJSONArray = jSONObject18.optJSONArray("jumplink_domain_required")) == null) {
                    return;
                }
                AbstractC0924m0.m4379yi(optJSONArray.toString());
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    private static JSONObject m119112Z(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = null;
        try {
            if (jSONObject.has("feed")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("feed");
                jSONObject3 = jSONObject4.optJSONObject("video");
                JSONObject optJSONObject = jSONObject4.optJSONObject("photo");
                if (optJSONObject != null) {
                    jSONObject2.put("feed", optJSONObject);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject3;
    }

    /* renamed from: a0 */
    private static void m119114a0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("file")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("file");
                if (jSONObject2.has("FileMaxSize")) {
                    AbstractC23309i.m122151lz(jSONObject2.optInt("FileMaxSize"));
                }
                if (jSONObject2.has("max_file_count")) {
                    AbstractC23309i.m122368rs(jSONObject2.optInt("max_file_count"));
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b0 */
    private static void m119116b0(JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("gamecenter")) {
                AbstractC23309i.m121102Jw(AbstractC18069a.m96085d(jSONObject.getJSONObject("gamecenter"), "page_html"));
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c0 */
    private static JSONObject m119118c0(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        int i11;
        int i12;
        int i13;
        JSONObject jSONObject2 = null;
        try {
            if (jSONObject.isNull("group")) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("group");
            try {
                if (!jSONObject3.isNull("max_member") && (i13 = jSONObject3.getInt("max_member")) > 0) {
                    AbstractC23309i.m121014Hi(i13);
                }
                if (!jSONObject3.isNull("max_member_invite") && (i12 = jSONObject3.getInt("max_member_invite")) > 0) {
                    AbstractC23309i.m120977Gi(i12);
                }
                if (!jSONObject3.isNull("max_user_group") && (i11 = jSONObject3.getInt("max_user_group")) > 0) {
                    AbstractC23309i.m121051Ii(i11);
                }
                boolean z26 = false;
                if (!jSONObject3.isNull("swap_sharedmedia_and_search")) {
                    if (jSONObject3.optInt("swap_sharedmedia_and_search", 1) == 1) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    AbstractC23309i.m121131Ko(z25);
                }
                if (!jSONObject3.isNull("max_stranger_invite")) {
                    int i14 = jSONObject3.getInt("max_stranger_invite");
                    if (i14 < 0) {
                        i14 = 0;
                    }
                    AbstractC23309i.m122258ot(i14);
                }
                if (jSONObject3.optInt("enable_clone_group", 0) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC23309i.m120831Ck(z11);
                AbstractC23309i.m121542Vs(jSONObject3.optInt("max_clone_group_member", 50));
                if (jSONObject3.has("genGreetingMsg")) {
                    if (jSONObject3.optInt("genGreetingMsg") == 1) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    AbstractC23309i.m121948gl(z24);
                }
                if (jSONObject3.has("dynamic_group_name")) {
                    if (jSONObject3.optInt("dynamic_group_name") == 1) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    AbstractC23309i.m121090Jk(z23);
                }
                if (jSONObject3.has("refresh_group_interval")) {
                    AbstractC23309i.m121286Ov(jSONObject3.optInt("refresh_group_interval"));
                }
                if (jSONObject3.has("mentionAll")) {
                    if (jSONObject3.optInt("mentionAll") == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    AbstractC23309i.m121350Ql(z22);
                }
                if (jSONObject3.has("enable_block_invite_me")) {
                    if (jSONObject3.optInt("enable_block_invite_me") == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    AbstractC23309i.m122098kk(z21);
                }
                if (jSONObject3.has("enable_assign_owner")) {
                    if (jSONObject3.optInt("enable_assign_owner") == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    AbstractC23309i.m121607Xj(z19);
                }
                if (jSONObject3.has("invite_phone_list")) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("invite_phone_list");
                    if (jSONObject4.optInt("enable") == 1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    AbstractC23309i.m122546wl(z18);
                    int optInt = jSONObject4.optInt("max_phones_support");
                    if (optInt > 0) {
                        AbstractC23309i.m122107kt(optInt);
                    }
                    int optInt2 = jSONObject4.optInt("limit_top_section");
                    if (optInt2 > 0) {
                        AbstractC23309i.m122479us(optInt2);
                    }
                }
                if (jSONObject3.has("customNickName")) {
                    AbstractC23309i.m121572Wl(jSONObject3.optInt("customNickName"));
                }
                if (jSONObject3.has("selectBubble")) {
                    AbstractC23309i.m120981Gm(jSONObject3.optInt("selectBubble"));
                }
                if (jSONObject3.has("undoInviteeTime")) {
                    AbstractC23309i.m121772bz(jSONObject3.optLong("undoInviteeTime"));
                }
                if (jSONObject3.has("event_oa")) {
                    if (jSONObject3.optInt("event_oa") == 1) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    AbstractC23309i.m121202Ml(z17);
                }
                if (jSONObject3.has("populate_clone_group")) {
                    if (jSONObject3.optInt("populate_clone_group") == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    AbstractC23309i.m121873em(z16);
                }
                if (jSONObject3.has("inviteBox")) {
                    if (jSONObject3.optInt("inviteBox") == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    AbstractC23309i.m122509vl(z15);
                }
                if (jSONObject3.has("pinBoard")) {
                    JSONObject jSONObject5 = jSONObject3.getJSONObject("pinBoard");
                    if (jSONObject5.optInt("enable", 1) >= 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AbstractC0924m0.m3285Ng(z13);
                    AbstractC0924m0.m4114pi(jSONObject5.optLong("syncTime", 86400000L));
                    if (jSONObject5.optInt("enableEditAfterPin", 0) >= 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    AbstractC0924m0.m4082og(z14);
                }
                C26688i.f126427a.m137072g(jSONObject3);
                if (jSONObject3.has("seen_status_config")) {
                    JSONObject jSONObject6 = jSONObject3.getJSONObject("seen_status_config");
                    if (jSONObject6.optInt("enable_new_seen_status_by_last_message", 1) >= 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC0924m0.m3082Gg(z12);
                    if (jSONObject6.optInt("enable_migrate_old_seen_status", 1) >= 1) {
                        z26 = true;
                    }
                    AbstractC0924m0.m4406zg(z26);
                }
                return jSONObject3;
            } catch (JSONException e11) {
                e = e11;
                jSONObject2 = jSONObject3;
                AbstractC23350e.m122778h(e);
                return jSONObject2;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    /* renamed from: d0 */
    private static void m119120d0(JSONObject jSONObject) {
        String str;
        JSONArray optJSONArray = jSONObject.optJSONArray("jumplink_domain_901");
        if (optJSONArray != null) {
            str = optJSONArray.toString();
        } else {
            str = "";
        }
        AbstractC23309i.m120836Cp(str);
    }

    /* renamed from: e0 */
    private static void m119122e0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("list_default_avatar")) {
                C23302b.f113247a.m120527i(jSONObject.getString("list_default_avatar"), false);
            }
            if (jSONObject.has("list_default_group_avatar")) {
                C23302b.f113247a.m120527i(jSONObject.getString("list_default_group_avatar"), true);
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f0 */
    private static void m119124f0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        long j11;
        long j12;
        if (jSONObject.has("load_config") && (optJSONObject = jSONObject.optJSONObject("load_config")) != null) {
            int m96086e = AbstractC18069a.m96086e(optJSONObject, ZinstantMetaConstant.IMPRESSION_META_INTERVAL, 86400);
            if (m96086e >= 3600) {
                j11 = m96086e * 1000;
            } else {
                j11 = 86400000;
            }
            AbstractC21970a.m114739h(j11);
            int m96086e2 = AbstractC18069a.m96086e(optJSONObject, "intervalRetry", 3600);
            if (m96086e2 >= 180) {
                j12 = m96086e2 * 1000;
            } else {
                j12 = 3600000;
            }
            AbstractC21970a.m114740i(j12);
            AbstractC21970a.m114743l(AbstractC23121k5.m118605c(0, 100, AbstractC18069a.m96086e(optJSONObject, "nretry", 3)));
        }
    }

    /* renamed from: g0 */
    private static void m119126g0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject.has("mlkit_qr_scanner") && !jSONObject.isNull("mlkit_qr_scanner") && (optJSONObject = jSONObject.optJSONObject("mlkit_qr_scanner")) != null) {
            boolean z11 = false;
            if (optJSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            }
            AbstractC0924m0.m4348xg(z11);
        }
    }

    /* renamed from: h0 */
    private static void m119128h0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z11;
        boolean z12;
        boolean z13;
        if (jSONObject.has("mediastore") && (optJSONObject = jSONObject.optJSONObject("mediastore")) != null) {
            int optInt = optJSONObject.optInt("defaultMediaLayout", EnumC2381y.f9940q.ordinal());
            if (C23250w4.m119794V(optInt) && !AbstractC23309i.m122541wg()) {
                AbstractC23309i.m122591xt(optInt);
            }
            boolean z14 = false;
            if (optJSONObject.optInt("loadMoreViewFullChat") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC23309i.m120945Fn(z11);
            if (optJSONObject.has("loadMoreViewFullServer")) {
                if (optJSONObject.optInt("loadMoreViewFullServer") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC0924m0.m3846gk(z13);
            }
            if (optJSONObject.has("minPosLoadMoreViewFull")) {
                AbstractC23309i.m122628yt(optJSONObject.optInt("minPosLoadMoreViewFull"));
            }
            if (optJSONObject.has("enableSearchV2")) {
                AbstractC23309i.m121313Pl(optJSONObject.optInt("enableSearchV2"));
            }
            if (optJSONObject.has("enablePinAlbum")) {
                if (optJSONObject.optInt("enablePinAlbum") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC0924m0.m3256Mg(z12);
            }
            if (optJSONObject.has("enableDownloadAlbum")) {
                if (optJSONObject.optInt("enableDownloadAlbum") == 1) {
                    z14 = true;
                }
                AbstractC0924m0.m3842gg(z14);
            }
            C26688i.f126427a.m137073h(optJSONObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:            if (r1 < 0) goto L5;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:            if (r1 < 0) goto L11;     */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m119130i0(JSONObject jSONObject) {
        int i11;
        int i12;
        JSONObject optJSONObject = jSONObject.optJSONObject("mini_program");
        try {
            i11 = AbstractC18069a.m96086e(optJSONObject, "awareness_popup", 0);
        } catch (Exception unused) {
        }
        i12 = 0;
        AbstractC0924m0.m3611Yn(i12);
        AbstractC0924m0.m3202Kk(AbstractC18069a.m96086e(optJSONObject, "floating", 0));
        AbstractC0924m0.m3289Nk(AbstractC18069a.m96089h(optJSONObject, "apps_in_main_task"));
        C30946k.a aVar = C30946k.Companion;
        if (aVar.m150530c()) {
            aVar.m150528a().m150526x();
        }
        AbstractC0924m0.m4206sk(AbstractC18069a.m96085d(optJSONObject, "enable_menu_zinstant"));
        return;
        i11 = 0;
        AbstractC0924m0.m3553Wn(i11);
        try {
            i12 = AbstractC18069a.m96086e(optJSONObject, "awareness_popup_favorites", 0);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: j0 */
    private static void m119132j0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!jSONObject.isNull("my_cloud") && (optJSONObject = jSONObject.optJSONObject("my_cloud")) != null) {
            C21373a c21373a = C21373a.f104231a;
            c21373a.m110785H();
            c21373a.m110784E(optJSONObject);
        }
    }

    /* renamed from: k0 */
    private static void m119134k0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z11;
        boolean z12;
        JSONObject optJSONObject2;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        int i13;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        boolean z23;
        if (jSONObject.has("network") && (optJSONObject = jSONObject.optJSONObject("network")) != null) {
            int optInt = optJSONObject.optInt("wifi_notification_time", 5);
            int optInt2 = optJSONObject.optInt("wwan_notification_time", 8);
            AbstractC23309i.m121569Wi(optInt);
            AbstractC23309i.m121532Vi(optInt2);
            int i14 = 60;
            int optInt3 = optJSONObject.optInt("interval_ping", 60);
            if (optInt3 > 0) {
                i14 = optInt3;
            }
            AbstractC23309i.m121643Yi(i14 * 1000);
            boolean z24 = false;
            if (optJSONObject.optInt("old_rule_parallel_ping", 0) == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC23309i.m121680Zi(z11);
            if (optJSONObject.has("captive_portal_check_url")) {
                String optString = optJSONObject.optString("captive_portal_check_url");
                if (!TextUtils.isEmpty(optString)) {
                    AbstractC23309i.m121831di(optString);
                }
            }
            if (optJSONObject.optInt("enable_resume_upload", 1) == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC23309i.m122547wm(z12);
            if (optJSONObject.has("network_block_detect") && (optJSONObject2 = optJSONObject.optJSONObject("network_block_detect")) != null) {
                if (optJSONObject2.has("duration_check_network_block")) {
                    AbstractC23309i.m120951Ft(optJSONObject2.optLong("duration_check_network_block", 86400000L));
                }
                if (optJSONObject2.has("enable_auto_check_network")) {
                    if (optJSONObject2.optInt("enable_auto_check_network", 0) == 1) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    AbstractC23309i.m121720ak(z23);
                }
                if (optJSONObject2.has("accept_background_check")) {
                    if (optJSONObject2.optInt("accept_background_check", 0) == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    AbstractC23309i.m122283ph(z22);
                    z13 = z22;
                } else {
                    z13 = false;
                }
                if (optJSONObject2.has("accept_test_on_mobile_network")) {
                    if (optJSONObject2.optInt("accept_test_on_mobile_network", 1) == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    AbstractC23309i.m122320qh(z21);
                    z14 = z21;
                } else {
                    z14 = true;
                }
                if (optJSONObject2.has("total_check")) {
                    int optInt4 = optJSONObject2.optInt("total_check", 5);
                    AbstractC23309i.m121437Sy(optInt4);
                    i11 = optInt4;
                } else {
                    i11 = 5;
                }
                if (optJSONObject2.has("percent_fail_to_upload")) {
                    int optInt5 = optJSONObject2.optInt("percent_fail_to_upload", 50);
                    AbstractC23309i.m121248Nu(optInt5);
                    i12 = optInt5;
                } else {
                    i12 = 50;
                }
                if (optJSONObject2.has("interval_check")) {
                    int optInt6 = optJSONObject2.optInt("interval_check", 300);
                    AbstractC23309i.m122291pp(optInt6);
                    i13 = optInt6;
                } else {
                    i13 = 300;
                }
                if (optJSONObject2.has("upload_if_fail_same_network")) {
                    if (optJSONObject2.optInt("upload_if_fail_same_network", 1) == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    AbstractC23309i.m122189mz(z19);
                    z15 = z19;
                } else {
                    z15 = true;
                }
                if (optJSONObject2.has("only_accept_ip_result")) {
                    if (optJSONObject2.optInt("only_accept_ip_result", 0) == 1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    AbstractC23309i.m122666zu(z18);
                    z16 = z18;
                } else {
                    z16 = false;
                }
                if (optJSONObject2.has("upload_all_log")) {
                    if (optJSONObject2.optInt("upload_all_log", 0) == 1) {
                        z24 = true;
                    }
                    AbstractC23309i.m122075jz(z24);
                    z17 = z24;
                } else {
                    z17 = false;
                }
                NetworkHelper.m48302k().m48311h(z13, z14, i11, i12, i13, z15, z16, z17);
            }
        }
    }

    /* renamed from: l0 */
    private static void m119136l0(JSONObject jSONObject) {
        if (jSONObject.has("notification")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("notification");
            if (optJSONObject != null && optJSONObject.has("turnon_chat_notify24")) {
                AbstractC23309i.m121548Vy(optJSONObject.optInt("turnon_chat_notify24", 0));
            }
            if (optJSONObject != null && optJSONObject.has("turnon_group_notify24")) {
                AbstractC23309i.m121585Wy(optJSONObject.optInt("turnon_group_notify24"));
            }
        }
    }

    /* renamed from: m */
    public static void m119137m(Object obj, long j11) {
        m119163z(null, obj, null, j11, false, 0, false, false, true, null, false);
    }

    /* renamed from: m0 */
    private static void m119138m0(JSONObject jSONObject) {
        try {
            if (!jSONObject.isNull("page")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("page");
                if (!jSONObject2.isNull("topOutByMsgSentTimeout")) {
                    long j11 = jSONObject2.getLong("topOutByMsgSentTimeout");
                    if (j11 > 0) {
                        AbstractC23309i.m121458Ti(j11);
                    }
                }
                AbstractC23309i.m121620Xw(AbstractC18069a.m96085d(jSONObject2, "page_html"));
                if (jSONObject2.has("enable_oaprofile_html5")) {
                    boolean z11 = true;
                    if (jSONObject2.optInt("enable_oaprofile_html5") != 1) {
                        z11 = false;
                    }
                    AbstractC23309i.m121646Yl(z11);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public static boolean m119139n(final InterfaceC27218a interfaceC27218a, String str, String str2, JSONObject jSONObject, int i11, int i12, int i13) {
        int i14;
        try {
            String optString = jSONObject.optString("zotp", "");
            if (!TextUtils.isEmpty(optString)) {
                String optString2 = new JSONObject(AbstractC26389c.m135986b(AbstractC2373t.m12409g().substring(0, 16), optString)).optString("cdn", "");
                final Bundle bundle = new Bundle();
                bundle.putString("EXTRA_SESSION_TOKEN", str2);
                bundle.putString("EXTRA_NUMBER_PHONE", str);
                bundle.putString("EXTRA_DEVICE_NAME", optString2);
                if (i11 == 3) {
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                bundle.putInt("EXTRA_FORGET_PASSWORD", i14);
                bundle.putInt("EXTRA_TYPE_SOURCE", i11);
                bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", i12);
                bundle.putInt("EXTRA_SOURCE_SWITCH", i13);
                if (interfaceC27218a != null) {
                    interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.i4
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC27218a.this.mo35573l4(VerifyByAnotherDeviceView.class, bundle, 1, true);
                        }
                    });
                }
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: n0 */
    private static JSONObject m119140n0(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("recommendedLink")) {
                return null;
            }
            return jSONObject.getJSONObject("recommendedLink").optJSONObject("video");
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: o */
    public static void m119141o(BaseZaloView baseZaloView, String str, String str2, int i11, String str3, String str4, int i12, String str5, Callable callable) {
        if (baseZaloView != null) {
            baseZaloView.m78946bM(AbstractC23136l9.m118743r0(AbstractC8020f0.str_in_progress), Boolean.FALSE);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(baseZaloView, str, callable));
        c0766k.mo1544Ta(str, m119147r(), str2, i11, str3, str4, i12, AbstractC0924m0.m3736d0(), str5);
    }

    /* renamed from: o0 */
    private static void m119142o0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject.has("secrete_msg") && (optJSONObject = jSONObject.optJSONObject("secrete_msg")) != null) {
            AbstractC23309i.m120843Cw(AbstractC18069a.m96086e(optJSONObject, "expire_time", 24) * 3600 * 1000);
            AbstractC23309i.m120880Dw(AbstractC18069a.m96086e(optJSONObject, "snap_time", 10));
        }
    }

    /* renamed from: p */
    private static void m119143p(InterfaceC27218a interfaceC27218a) {
        try {
            ZaloView m92993D0 = interfaceC27218a.mo35579p().m92993D0(LoginView.class);
            if (m92993D0 instanceof LoginView) {
                ((LoginView) m92993D0).mo49315c4();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f112288a, e11);
        }
    }

    /* renamed from: p0 */
    private static void m119144p0(JSONObject jSONObject) {
        boolean z11;
        boolean z12;
        boolean z13;
        JSONObject optJSONObject;
        boolean z14;
        JSONObject optJSONObject2;
        boolean z15;
        boolean z16;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        boolean z17;
        boolean z18;
        boolean z19;
        JSONObject optJSONObject5;
        boolean z21;
        boolean z22;
        long j11;
        boolean z23;
        boolean z24;
        try {
            if (!jSONObject.isNull("social")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("social");
                AbstractC23309i.m121579Ws(AbstractC18069a.m96085d(jSONObject2, "comment_max_word"));
                if (jSONObject2.has("enablePhotoNum")) {
                    if (jSONObject2.optInt("enablePhotoNum") == 1) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    AbstractC23309i.m122214nm(z24);
                }
                if (!jSONObject2.isNull("feed_compose_max_word")) {
                    AbstractC23309i.m121837do(jSONObject2.optInt("feed_compose_max_word", AbstractC23304d.f113344W2));
                }
                if (!jSONObject2.isNull("enable_feed_translate")) {
                    if (jSONObject2.optInt("enable_feed_translate") == 1) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    AbstractC23309i.m121682Zk(z23);
                }
                long j12 = 21600000;
                if (jSONObject2.has("feed_suggest")) {
                    JSONObject optJSONObject6 = jSONObject2.optJSONObject("feed_suggest");
                    if (optJSONObject6 != null && !optJSONObject6.isNull("time_limit_suggest_link")) {
                        j11 = optJSONObject6.optLong("time_limit_suggest_link") * 1000;
                    } else {
                        j11 = 21600000;
                    }
                    AbstractC23309i.m120808By(j11);
                }
                if (jSONObject2.has("enable_sync_red_noti")) {
                    if (jSONObject2.optInt("enable_sync_red_noti") == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    AbstractC23309i.m122400sn(z22);
                }
                if (jSONObject2.has("feed_remind") && (optJSONObject5 = jSONObject2.optJSONObject("feed_remind")) != null) {
                    if (optJSONObject5.optInt("enable") == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    AbstractC23309i.m121645Yk(z21);
                    if (!optJSONObject5.isNull("time_limit_show")) {
                        j12 = optJSONObject5.optInt("time_limit_show") * 1000;
                    }
                    AbstractC23309i.m122596xy(j12);
                }
                if (jSONObject2.has("enable_anim_viewfull_diff_ratio")) {
                    if (jSONObject2.optInt("enable_anim_viewfull_diff_ratio") == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    AbstractC23309i.m122264oz(z19);
                }
                if (jSONObject2.has("enable_preload_viewfull")) {
                    if (jSONObject2.optInt("enable_preload_viewfull", 1) == 1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    AbstractC23309i.m122100km(z18);
                }
                if (jSONObject2.has("post_feed") && (optJSONObject4 = jSONObject2.optJSONObject("post_feed")) != null) {
                    String jSONObject3 = optJSONObject4.toString();
                    AbstractC23309i.m121273Oi(jSONObject3);
                    C26761p.m137741q().m137760P(jSONObject3);
                    AbstractC0924m0.m3726ck(optJSONObject4.optInt("max_photos_post", 9));
                    if (optJSONObject4.optInt("enable_compose_voice_button") == 1) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    AbstractC0924m0.m3752dg(z17);
                }
                if (jSONObject2.has("timeline_tab_switch")) {
                    AbstractC23309i.m122511vn(jSONObject2.optInt("timeline_tab_switch"));
                }
                if (jSONObject2.has("mutual_feed_switch")) {
                    AbstractC23309i.m121461Tl(jSONObject2.optInt("mutual_feed_switch"));
                }
                if (jSONObject2.has("profile") && (optJSONObject3 = jSONObject2.optJSONObject("profile")) != null) {
                    AbstractC23309i.m122507vj(optJSONObject3.optInt("default_push_avatar_feed", 1));
                    z11 = false;
                    AbstractC23309i.m122544wj(optJSONObject3.optInt("default_push_cover_feed", 0));
                } else {
                    z11 = false;
                }
                if (jSONObject2.has("album") && (optJSONObject2 = jSONObject2.optJSONObject("album")) != null) {
                    if (optJSONObject2.optInt("force_preview_theme", 1) == 1) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    AbstractC0924m0.m4202sg(z15);
                    if (optJSONObject2.optInt("enable_create", 1) == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    AbstractC0924m0.m3782eg(z16);
                }
                if (jSONObject2.has("enable_precache_keyframe")) {
                    if (jSONObject2.optInt("enable_precache_keyframe", 1) == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    AbstractC23309i.m122062jm(z14);
                }
                if (jSONObject2.has("feed_impression") && (optJSONObject = jSONObject2.optJSONObject("feed_impression")) != null) {
                    AbstractC23309i.m121913fo(optJSONObject.optLong("impression_threshold", 300L));
                    AbstractC23309i.m121951go(optJSONObject.optInt("min_visible_height_percent", 75));
                    AbstractC23309i.m121875eo(optJSONObject.optInt("relog_delay_time", 2));
                }
                if (jSONObject2.has("enable_bottom_sheet_menu")) {
                    if (jSONObject2.optInt("enable_bottom_sheet_menu", 1) == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    AbstractC0924m0.m3603Yf(z13);
                }
                if (jSONObject2.has("enable_block_setting_in_feed")) {
                    if (jSONObject2.optInt("enable_block_setting_in_feed", 1) == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC0924m0.m3516Vf(z12);
                }
                if (jSONObject2.has("enable_privacy_quick_setting")) {
                    if (jSONObject2.optInt("enable_privacy_quick_setting", 1) == 1) {
                        z11 = true;
                    }
                    AbstractC0924m0.m3517Vg(z11);
                }
                if (jSONObject2.has("feed_music")) {
                    C20791e.f102159a.m108490f(jSONObject2.getJSONObject("feed_music"), true);
                }
                if (jSONObject2.has("timeline_tab_other")) {
                    new C25432r0().m101508a(new C25432r0.a(jSONObject2.getJSONObject("timeline_tab_other").toString()));
                    C24361h0.f117593a.m127386e();
                } else {
                    C24380u.f117739a.m127509b();
                }
                if (jSONObject2.has("feed_multi_photo")) {
                    C19587j.f97307a.m102531g(jSONObject2.optJSONObject("feed_multi_photo"), true);
                }
                if (jSONObject2.has("dynamic_option_in_avatar_bts")) {
                    C18634d.f93778a.m98487m(jSONObject2.getJSONObject("dynamic_option_in_avatar_bts"), true);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: q */
    public static String m119145q(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : charArray) {
            if (c11 >= '0' && charArray[0] <= '9') {
                sb2.append(c11);
            }
        }
        return sb2.toString();
    }

    /* renamed from: q0 */
    private static void m119146q0(JSONObject jSONObject) {
        boolean z11;
        try {
            if (!jSONObject.isNull("sticker_store")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("sticker_store");
                if (jSONObject2.has("page_html")) {
                    z11 = true;
                    if (AbstractC18069a.m96085d(jSONObject2, "page_html") == 1) {
                        AbstractC23309i.m121388Rm(z11);
                        String m96089h = AbstractC18069a.m96089h(jSONObject2, "sticker_download");
                        AbstractC0924m0.m4141qf(m96089h);
                        C28644j.f132746q = m96089h;
                    }
                }
                z11 = false;
                AbstractC23309i.m121388Rm(z11);
                String m96089h2 = AbstractC18069a.m96089h(jSONObject2, "sticker_download");
                AbstractC0924m0.m4141qf(m96089h2);
                C28644j.f132746q = m96089h2;
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    public static String m119147r() {
        return AbstractC23309i.m121704a5();
    }

    /* renamed from: r0 */
    private static JSONObject m119148r0(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = null;
        try {
            if (jSONObject.has("story")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("story");
                jSONObject3 = jSONObject4.optJSONObject("video");
                JSONObject optJSONObject = jSONObject4.optJSONObject("photo");
                if (optJSONObject != null) {
                    jSONObject2.put("story", optJSONObject);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject3;
    }

    /* renamed from: s */
    private static JSONObject m119149s(JSONObject jSONObject) {
        if (jSONObject != null && !jSONObject.isNull("video")) {
            return jSONObject.optJSONObject("video");
        }
        return null;
    }

    /* renamed from: s0 */
    private static void m119150s0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        boolean z11;
        JSONObject optJSONObject2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (jSONObject.has("story") && (optJSONObject = jSONObject.optJSONObject("story")) != null) {
            if (optJSONObject.has("actionClickOnListViewer")) {
                AbstractC23309i.m122431th(AbstractC18069a.m96086e(optJSONObject, "actionClickOnListViewer", 1));
            }
            if (optJSONObject.has("reactionEmoji") && !optJSONObject.isNull("reactionEmoji") && optJSONObject.optJSONArray("reactionEmoji") != null) {
                AbstractC23309i.m121138Kv(optJSONObject.optString("reactionEmoji"));
            }
            boolean z16 = false;
            if (optJSONObject.has("keepStoryRatio")) {
                if (optJSONObject.optInt("keepStoryRatio") == 1) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AbstractC23309i.m120910Ep(z15);
            }
            if (optJSONObject.has("reactionCollapsed")) {
                if (optJSONObject.optInt("reactionCollapsed") == 1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                AbstractC23309i.m120992Gx(z14);
            }
            if (optJSONObject.has("story_thumb_shape")) {
                AbstractC23309i.m121384Ri(optJSONObject.optInt("story_thumb_shape", 0));
                AbstractC22055v0.m115147g();
                AbstractC23074g2.m118378d();
            }
            if (optJSONObject.has("enable_story_animated_viewers_animation")) {
                if (optJSONObject.optInt("enable_story_animated_viewers_animation") == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                AbstractC23309i.m121533Vj(z13);
            }
            if (optJSONObject.has("enable_story_background_status")) {
                if (optJSONObject.optInt("enable_story_background_status") == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                AbstractC23309i.m121499Um(z12);
            }
            if (optJSONObject.has("story_bar_pos")) {
                AbstractC23309i.m121347Qi(optJSONObject.optInt("story_bar_pos", 1));
                AbstractC22055v0.m115147g();
                AbstractC23074g2.m118378d();
            }
            if (optJSONObject.has("story_visible_tab")) {
                C22013a0.m114927f(optJSONObject.optInt("story_visible_tab", 0));
            }
            if (optJSONObject.has("suggestion") && (optJSONObject2 = optJSONObject.optJSONObject("suggestion")) != null) {
                AbstractC23309i.m121029Hx(optJSONObject2.toString());
                C22013a0.m114924c().m114933k();
            }
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("story_privacy");
            if (optJSONObject3 != null) {
                C24417g.f117907a.m127708k(optJSONObject3, true);
            } else {
                C24417g.f117907a.m127708k(new JSONObject(), true);
            }
            if (optJSONObject.optInt("story_music") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC0924m0.m4113ph(z11);
            if (z11) {
                AbstractC0924m0.m2995Dg(true);
            }
            if (optJSONObject.optInt("story_insets_workaround") == 1) {
                z16 = true;
            }
            AbstractC0924m0.m4320wh(z16);
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("reaction_v2");
            if (optJSONObject4 != null) {
                C22037m0.f108553a.m115041o(optJSONObject4, true);
            } else {
                C22037m0.f108553a.m115041o(new JSONObject(), true);
            }
        }
    }

    /* renamed from: t */
    public static void m119151t(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject, final int i11, String str, int i12, int i13, int i14) {
        try {
            final Bundle bundle = new Bundle();
            bundle.putString("data", jSONObject.toString());
            bundle.putString("phoneNumber", str);
            bundle.putInt("EXTRA_SRC_TYPE", i12);
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", i13);
            bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", i14);
            if (jSONObject.has("password")) {
                bundle.putString("password", jSONObject.optString("password", ""));
            }
            if (jSONObject.has("question_type")) {
                bundle.putString("question_type", jSONObject.optString("question_type", ""));
            }
            if (jSONObject.has("answer_type")) {
                bundle.putString("answer_type", jSONObject.optString("answer_type", ""));
            }
            if (jSONObject.has("answer_value")) {
                bundle.putString("answer_value", jSONObject.optString("answer_value", ""));
            }
            if (jSONObject.has("login_by_password")) {
                bundle.putInt("login_by_password", jSONObject.optInt("login_by_password", 0));
            }
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.c4
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC27218a.this.mo35581q(CaptchaView.class, bundle, i11, 1, true);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: t0 */
    private static void m119152t0(JSONObject jSONObject) {
        try {
            if (jSONObject.has("support_info")) {
                AbstractC23306f.m120583H().m110208n(jSONObject.getJSONObject("support_info").toString());
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u */
    public static void m119153u(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject, final int i11, String str, int i12, String str2) {
        try {
            final Bundle bundle = new Bundle();
            bundle.putString("data", jSONObject.toString());
            bundle.putString("phoneNumber", str);
            bundle.putInt("EXTRA_SRC_TYPE", i12);
            bundle.putBoolean("EXTRA_FROM_REGISTER_NEW", true);
            bundle.putString("EXTRA_SESSION_TOKEN", str2);
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.j4
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC27218a.this.mo35581q(CaptchaView.class, bundle, i11, 1, true);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: u0 */
    private static void m119154u0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!jSONObject.isNull("timeOnApp") && (optJSONObject = jSONObject.optJSONObject("timeOnApp")) != null) {
            int optInt = optJSONObject.optInt("numberLogSubmit");
            int optInt2 = optJSONObject.optInt("enable");
            int optInt3 = optJSONObject.optInt("minTimeSubmitLog");
            int optInt4 = optJSONObject.optInt("timeSubmitLog");
            AbstractC23309i.m121236Ni(optInt);
            AbstractC23309i.m120940Fi(optInt2);
            AbstractC23309i.m121125Ki(optInt3);
            AbstractC23309i.m121495Ui(optInt4);
        }
    }

    /* renamed from: v */
    public static void m119155v(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject, final int i11) {
        try {
            final Bundle bundle = new Bundle();
            bundle.putString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, jSONObject.getString("secureUrl"));
            bundle.putString("token", jSONObject.getString("sessionToken"));
            if (jSONObject.has("src_type")) {
                bundle.putInt("src_type", jSONObject.optInt("src_type", 0));
            }
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.l4
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC27218a.this.mo35581q(LoginSecurityQuestionWebView.class, bundle, i11, 1, true);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: v0 */
    private static void m119156v0(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("uploadConfig");
        if (optJSONObject != null) {
            AbstractC23309i.m122113kz(optJSONObject.toString());
            C24226d.m126394P().m126430V();
        }
    }

    /* renamed from: w */
    public static void m119157w(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject, final int i11, String str, String str2) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("question");
            if (optJSONObject == null) {
                return;
            }
            C26400b m136124i = C26400b.m136124i(optJSONObject);
            final Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_QUESTION", m136124i);
            bundle.putString("EXTRA_ACCOUNT", str);
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("EXTRA_PWD_TOKEN", str2);
            }
            if (jSONObject.has("EXTRA_PASSWORD")) {
                bundle.putString("EXTRA_PASSWORD", jSONObject.optString("EXTRA_PASSWORD", ""));
            }
            if (jSONObject.has("EXTRA_CAPTCHA_VALUE")) {
                bundle.putString("EXTRA_CAPTCHA_VALUE", jSONObject.optString("EXTRA_CAPTCHA_VALUE", ""));
            }
            if (jSONObject.has("EXTRA_CAPTCHA_TOKEN")) {
                bundle.putString("EXTRA_CAPTCHA_TOKEN", jSONObject.optString("EXTRA_CAPTCHA_TOKEN", ""));
            }
            if (jSONObject.has("EXTRA_FROM_SWITCH_ACCOUNT")) {
                bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", jSONObject.optInt("EXTRA_FROM_SWITCH_ACCOUNT", 0));
            }
            if (jSONObject.has("EXTRA_SOURCE_SWITCH_ACCOUNT")) {
                bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", jSONObject.optInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0));
            }
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.k4
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC27218a.this.mo35581q(JoinSecurityQuestionView.class, bundle, i11, 1, true);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: w0 */
    private static JSONObject m119158w0(JSONObject jSONObject) {
        JSONObject jSONObject2 = null;
        try {
            if (jSONObject.has("zchannel") && (jSONObject2 = jSONObject.getJSONObject("zchannel").optJSONObject("video")) != null) {
                if (!jSONObject2.has("recordVideoFreehandMinDuration")) {
                    jSONObject2.put("recordVideoFreehandMinDuration", 3);
                }
                if (!jSONObject2.has("pickedVideoMaxDuration")) {
                    jSONObject2.put("pickedVideoMaxDuration", 300);
                }
                if (!jSONObject2.has("pickedVideoMinDuration")) {
                    jSONObject2.put("pickedVideoMinDuration", 3);
                }
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject2;
    }

    /* renamed from: x */
    public static void m119159x(final InterfaceC27218a interfaceC27218a, JSONObject jSONObject, boolean z11, int i11, final boolean z12, String str, String str2, String str3, int i12, int i13) {
        try {
            int optInt = jSONObject.optInt("activationType");
            int optInt2 = jSONObject.optInt("activationNumber");
            String optString = jSONObject.optString("activationToken");
            m119105S(jSONObject, z11);
            String m121704a5 = AbstractC23309i.m121704a5();
            if (!TextUtils.isEmpty(m121704a5)) {
                AbstractC23309i.m122587xp(m121704a5.toUpperCase());
                AbstractC20887g.m109229g(125030, 125039, m121704a5.toUpperCase());
            }
            final Bundle bundle = new Bundle();
            bundle.putBoolean("isRenewAcc", z12);
            bundle.putBoolean("isManualSms", !z11);
            bundle.putInt("activationType", optInt);
            bundle.putInt("activationNumber", optInt2);
            bundle.putString("activationToken", optString);
            bundle.putString("sessionToken", str);
            bundle.putInt("EXTRA_SRC_TYPE", i11);
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", i12);
            bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", i13);
            bundle.putString("EXTRA_DEVICE_NAME", jSONObject.optString("EXTRA_DEVICE_NAME"));
            bundle.putBoolean("EXTRA_USER_HAVING_DEVICE", jSONObject.optBoolean("EXTRA_USER_HAVING_DEVICE", false));
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("phone_number", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("EXTRA_FROM_USERNAME", str3);
            }
            interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.d4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23153n4.m119095I(InterfaceC27218a.this, bundle, z12);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* renamed from: x0 */
    private static void m119160x0(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject jSONObject2;
        int optInt;
        boolean z11;
        if (jSONObject.has("zaloTracking") && !jSONObject.isNull("zaloTracking") && (optJSONArray = jSONObject.optJSONArray("zaloTracking")) != null) {
            int i11 = 0;
            int i12 = 0;
            while (i12 < optJSONArray.length()) {
                try {
                    jSONObject2 = optJSONArray.getJSONObject(i12);
                } catch (Exception e11) {
                    e = e11;
                }
                if (jSONObject2 != null && (optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11)) > 0) {
                    String optString = jSONObject2.optString("apiUrl");
                    long optLong = jSONObject2.optLong("dataExpiredTime");
                    long optLong2 = jSONObject2.optLong("minTimeSubmit");
                    int optInt2 = jSONObject2.optInt("maxRecordSubmit");
                    long optLong3 = jSONObject2.optLong("intervalSubmitLog");
                    int optInt3 = jSONObject2.optInt("numberLogSubmit");
                    int optInt4 = jSONObject2.optInt("enable", 1);
                    long optLong4 = jSONObject2.optLong("intervalGetLastKnowLocation", 21600L);
                    AbstractC23309i.m121735az(optString, optInt);
                    AbstractC23309i.m122183mt(optInt2, optInt);
                    AbstractC23309i.m122444tu(optInt3, optInt);
                    AbstractC23309i.m122211nj(optLong, optInt);
                    AbstractC23309i.m120988Gt(optLong2, optInt);
                    AbstractC23309i.m120771Ay(optLong3, optInt);
                    AbstractC23309i.m122659zn(optInt4, optInt);
                    if (optInt == 1) {
                        AbstractC23309i.m122559wy(optLong4, optInt);
                        try {
                            if (jSONObject2.optInt("enableLogLocationNeaby", 0) == 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            AbstractC23309i.m121128Kl(z11);
                        } catch (Exception e12) {
                            e = e12;
                            AbstractC23350e.m122778h(e);
                            i12++;
                            i11 = 0;
                        }
                        i12++;
                        i11 = 0;
                    }
                }
                i12++;
                i11 = 0;
            }
        }
    }

    /* renamed from: y */
    public static void m119161y(InterfaceC27218a interfaceC27218a, Object obj, String str, long j11, boolean z11, int i11, boolean z12, boolean z13) {
        m119163z(interfaceC27218a, obj, str, j11, z11, i11, z12, z13, false, null, false);
    }

    /* renamed from: y0 */
    private static void m119162y0(InterfaceC27218a interfaceC27218a) {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        interfaceC27218a.mo35573l4(LoginSuccessView.class, bundle, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0599 A[Catch: all -> 0x0049, Exception -> 0x004e, TRY_LEAVE, TryCatch #0 {Exception -> 0x004e, blocks: (B:5:0x0034, B:7:0x003d, B:9:0x0041, B:11:0x0055, B:15:0x005f, B:16:0x0071, B:19:0x007a, B:20:0x0080, B:22:0x00a2, B:24:0x00b6, B:27:0x00c5, B:28:0x00da, B:30:0x00e0, B:32:0x00e8, B:33:0x0157, B:34:0x00f2, B:36:0x010f, B:38:0x0117, B:39:0x011a, B:40:0x0163, B:42:0x0171, B:44:0x0184, B:45:0x0189, B:47:0x0194, B:50:0x019e, B:52:0x01a4, B:54:0x01aa, B:56:0x0204, B:58:0x020f, B:60:0x0218, B:62:0x0220, B:78:0x0285, B:80:0x0289, B:82:0x028f, B:83:0x0294, B:85:0x02a0, B:87:0x02a8, B:89:0x02b8, B:90:0x02bd, B:226:0x03c2, B:92:0x03ca, B:94:0x03d2, B:96:0x03e0, B:98:0x03e8, B:99:0x03ef, B:101:0x03f7, B:103:0x03fd, B:105:0x0406, B:106:0x0409, B:108:0x041e, B:110:0x0427, B:112:0x042c, B:113:0x0449, B:115:0x0460, B:117:0x057e, B:119:0x0599, B:128:0x0600, B:129:0x0611, B:139:0x0637, B:140:0x0657, B:134:0x0625, B:155:0x0467, B:161:0x049b, B:163:0x04b3, B:165:0x04d7, B:166:0x04eb, B:168:0x04f5, B:169:0x04f8, B:171:0x050f, B:173:0x0517, B:175:0x0520, B:179:0x0535, B:181:0x053f, B:183:0x0543, B:186:0x054a, B:191:0x0558, B:193:0x0562, B:194:0x0569, B:196:0x056f, B:198:0x0574, B:243:0x03bf, B:245:0x026d, B:246:0x01c7, B:248:0x01cd, B:250:0x01d5, B:252:0x01df, B:254:0x01e9, B:255:0x01f1, B:257:0x01f9, B:258:0x0201), top: B:4:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0558 A[Catch: all -> 0x0049, Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:5:0x0034, B:7:0x003d, B:9:0x0041, B:11:0x0055, B:15:0x005f, B:16:0x0071, B:19:0x007a, B:20:0x0080, B:22:0x00a2, B:24:0x00b6, B:27:0x00c5, B:28:0x00da, B:30:0x00e0, B:32:0x00e8, B:33:0x0157, B:34:0x00f2, B:36:0x010f, B:38:0x0117, B:39:0x011a, B:40:0x0163, B:42:0x0171, B:44:0x0184, B:45:0x0189, B:47:0x0194, B:50:0x019e, B:52:0x01a4, B:54:0x01aa, B:56:0x0204, B:58:0x020f, B:60:0x0218, B:62:0x0220, B:78:0x0285, B:80:0x0289, B:82:0x028f, B:83:0x0294, B:85:0x02a0, B:87:0x02a8, B:89:0x02b8, B:90:0x02bd, B:226:0x03c2, B:92:0x03ca, B:94:0x03d2, B:96:0x03e0, B:98:0x03e8, B:99:0x03ef, B:101:0x03f7, B:103:0x03fd, B:105:0x0406, B:106:0x0409, B:108:0x041e, B:110:0x0427, B:112:0x042c, B:113:0x0449, B:115:0x0460, B:117:0x057e, B:119:0x0599, B:128:0x0600, B:129:0x0611, B:139:0x0637, B:140:0x0657, B:134:0x0625, B:155:0x0467, B:161:0x049b, B:163:0x04b3, B:165:0x04d7, B:166:0x04eb, B:168:0x04f5, B:169:0x04f8, B:171:0x050f, B:173:0x0517, B:175:0x0520, B:179:0x0535, B:181:0x053f, B:183:0x0543, B:186:0x054a, B:191:0x0558, B:193:0x0562, B:194:0x0569, B:196:0x056f, B:198:0x0574, B:243:0x03bf, B:245:0x026d, B:246:0x01c7, B:248:0x01cd, B:250:0x01d5, B:252:0x01df, B:254:0x01e9, B:255:0x01f1, B:257:0x01f9, B:258:0x0201), top: B:4:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0574 A[Catch: all -> 0x0049, Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:5:0x0034, B:7:0x003d, B:9:0x0041, B:11:0x0055, B:15:0x005f, B:16:0x0071, B:19:0x007a, B:20:0x0080, B:22:0x00a2, B:24:0x00b6, B:27:0x00c5, B:28:0x00da, B:30:0x00e0, B:32:0x00e8, B:33:0x0157, B:34:0x00f2, B:36:0x010f, B:38:0x0117, B:39:0x011a, B:40:0x0163, B:42:0x0171, B:44:0x0184, B:45:0x0189, B:47:0x0194, B:50:0x019e, B:52:0x01a4, B:54:0x01aa, B:56:0x0204, B:58:0x020f, B:60:0x0218, B:62:0x0220, B:78:0x0285, B:80:0x0289, B:82:0x028f, B:83:0x0294, B:85:0x02a0, B:87:0x02a8, B:89:0x02b8, B:90:0x02bd, B:226:0x03c2, B:92:0x03ca, B:94:0x03d2, B:96:0x03e0, B:98:0x03e8, B:99:0x03ef, B:101:0x03f7, B:103:0x03fd, B:105:0x0406, B:106:0x0409, B:108:0x041e, B:110:0x0427, B:112:0x042c, B:113:0x0449, B:115:0x0460, B:117:0x057e, B:119:0x0599, B:128:0x0600, B:129:0x0611, B:139:0x0637, B:140:0x0657, B:134:0x0625, B:155:0x0467, B:161:0x049b, B:163:0x04b3, B:165:0x04d7, B:166:0x04eb, B:168:0x04f5, B:169:0x04f8, B:171:0x050f, B:173:0x0517, B:175:0x0520, B:179:0x0535, B:181:0x053f, B:183:0x0543, B:186:0x054a, B:191:0x0558, B:193:0x0562, B:194:0x0569, B:196:0x056f, B:198:0x0574, B:243:0x03bf, B:245:0x026d, B:246:0x01c7, B:248:0x01cd, B:250:0x01d5, B:252:0x01df, B:254:0x01e9, B:255:0x01f1, B:257:0x01f9, B:258:0x0201), top: B:4:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m119163z(final InterfaceC27218a interfaceC27218a, Object obj, String str, long j11, boolean z11, int i11, boolean z12, boolean z13, boolean z14, C2352i0 c2352i0, final boolean z15) {
        boolean z16;
        String str2;
        Throwable th2;
        boolean z17;
        boolean z18;
        final boolean z19;
        String str3;
        int i12;
        String sb2;
        long j12;
        int i13;
        int i14;
        ContactProfile contactProfile;
        String str4;
        boolean z21;
        String str5;
        String str6;
        final boolean z22;
        C7924a m135087t;
        TargetBackupInfo targetBackupInfo;
        JSONObject optJSONObject;
        int optInt;
        if (z14) {
            str2 = "simpleInfo";
            z16 = false;
        } else {
            z16 = z11;
            str2 = "simpleInfo";
        }
        try {
            try {
                StringBuilder sb3 = new StringBuilder();
                ContactProfile contactProfile2 = (!z16 || AbstractC23304d.f113368c0 == null) ? null : new ContactProfile(AbstractC23304d.f113368c0);
                if (contactProfile2 != null) {
                    contactProfile2.f42362N1 = AbstractC23304d.f113410m0;
                }
                if (z14) {
                    z18 = z16;
                } else {
                    if (z16) {
                        AbstractC23148n.m118852z();
                        z18 = z16;
                        AbstractC23138m0.m118773e(false, null, false, c2352i0);
                        sb3.append("Logout-");
                    } else {
                        z18 = z16;
                    }
                    AbstractC23304d.f113402k0 = "";
                }
                if (obj != null) {
                    if (!z14) {
                        AbstractC23304d.f113382f0.set(false);
                    }
                    JSONObject jSONObject = new JSONObject(((JSONObject) obj).getString("data"));
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("login:");
                    sb4.append(jSONObject);
                    if (jSONObject.has("timestamp_in_milis")) {
                        contactProfile = contactProfile2;
                        str4 = "jp_url";
                        if (C23793c.m124316k().mo124313h(jSONObject.getLong("timestamp_in_milis"), j11)) {
                            C24559a.m127933c("[RenewTime]", "LoginUtils");
                        }
                    } else {
                        contactProfile = contactProfile2;
                        str4 = "jp_url";
                    }
                    final boolean z23 = true;
                    if (!z14) {
                        CoreUtility.f89233i = "";
                        AbstractC23309i.m121757bj(0);
                        AbstractC23309i.m121728as(0L);
                        AbstractC23304d.f113431r1.set(true);
                        AbstractC23304d.f113439t1.set(true);
                    }
                    if (jSONObject.has("user_id")) {
                        String string = jSONObject.getString("user_id");
                        CoreUtility.f89233i = string;
                        if (z14) {
                            AbstractC23309i.m122135lj(MainApplication.getAppContext(), CoreUtility.f89233i);
                        } else {
                            sb3.append(string);
                            sb3.append("-");
                            String m121738b1 = AbstractC23309i.m121738b1();
                            AbstractC23309i.m122135lj(MainApplication.getAppContext(), CoreUtility.f89233i);
                            C28646l.m143320j();
                            AbstractC24743a.m128499a();
                            if (m121738b1 != null && !m121738b1.equals(CoreUtility.f89233i)) {
                                AbstractC19164e.m100523i();
                            }
                            String m119291t0 = AbstractC23160o0.m119291t0(System.currentTimeMillis());
                            C7967l.Companion.m42752g("[" + m119291t0 + "]", " Login uid: " + CoreUtility.f89233i);
                            C7967l.m42727z().m42730E();
                        }
                        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.e4
                            @Override // java.lang.Runnable
                            public final void run() {
                                C20127a.m104751b(null, false);
                            }
                        });
                    }
                    AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-1", 123132);
                    if (jSONObject.has("session_key")) {
                        CoreUtility.f89232h = jSONObject.getString("session_key");
                        AbstractC23304d.f113418o0 = 123209;
                        if (TextUtils.isEmpty(CoreUtility.f89232h)) {
                            sb3.append("1Emp-");
                        }
                    }
                    C0832n.f2924f = false;
                    C0832n.f2926h = true;
                    if (jSONObject.has("sign")) {
                        AbstractC23309i.m122225nx(jSONObject.getString("sign"));
                    }
                    if (z14) {
                        if (jSONObject.has("is_new") && jSONObject.getBoolean("is_new")) {
                            AbstractC23309i.m121139Kw(2);
                            AbstractC23057e7.m118305l(true);
                            AbstractC20887g.m109232j(CoreUtility.f89233i, 80005, "", 0L, 80000, CoreUtility.f89236l);
                            C20882b.m109134j();
                        }
                        contactProfile2 = contactProfile;
                    } else {
                        if (jSONObject.has("token")) {
                            AbstractC23304d.f113410m0 = jSONObject.getString("token");
                            if (contactProfile != null) {
                                contactProfile2 = contactProfile;
                                if (!TextUtils.isEmpty(contactProfile2.f42362N1) && contactProfile2.f42362N1.equals(AbstractC23304d.f113410m0)) {
                                    sb3.append("SameTokenOld-");
                                }
                            } else {
                                contactProfile2 = contactProfile;
                            }
                            if (TextUtils.isEmpty(AbstractC23304d.f113410m0)) {
                                sb3.append("2Emp-");
                            }
                        } else {
                            contactProfile2 = contactProfile;
                        }
                        AbstractC23309i.m121323Pv("");
                    }
                    C0832n.m2184r(jSONObject);
                    String str7 = str4;
                    if (jSONObject.has(str7)) {
                        AbstractC23309i.m120873Dp(jSONObject.optString(str7));
                    }
                    if (z14) {
                        if (CoreUtility.f89232h.equals("")) {
                            C0832n.f2926h = false;
                            C0832n.m2180l();
                            AbstractC20887g.m109232j(CoreUtility.f89233i, 9020, "", 0L, 9021, CoreUtility.f89236l);
                            C0832n.f2926h = false;
                            if (z14) {
                                return;
                            }
                            if (!C29628e.m147249E0().m93432x()) {
                                AbstractC29633j.m147365n();
                            }
                            if (AbstractC23306f.m120676j().m128396M() && AbstractC23309i.m122085k8()) {
                                return;
                            }
                            AbstractC23304d.f113431r1.set(false);
                            return;
                        }
                        z21 = z13;
                    } else {
                        C31994kb.m154233h().m154235b();
                        z21 = z13;
                        C0832n.m2179i().m2193q(jSONObject, z21);
                        AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-2", 123133);
                    }
                    String str8 = CoreUtility.f89233i;
                    if (str8 != null && str8.length() > 0) {
                        AbstractC23088h5.m118430k(CoreUtility.f89233i);
                    }
                    String optString = jSONObject.optString("iso_country_code", "");
                    if (TextUtils.isEmpty(optString) || optString.equalsIgnoreCase("null")) {
                        str5 = str;
                        str6 = "";
                    } else {
                        AbstractC23309i.m122587xp(optString);
                        str5 = str;
                        str6 = AbstractC23056e6.m118276b(str5, false, false);
                        if (TextUtils.isEmpty(str)) {
                            sb3.append("4Emp-");
                        }
                        AbstractC23309i.m120762Ap(str5, optString);
                        AbstractC20887g.m109229g(125030, 125030, optString);
                    }
                    if (!z14) {
                        try {
                            if (AbstractC23309i.m121859e9() == 1) {
                                AbstractC23309i.m121210Mt(0);
                            }
                            if (!jSONObject.isNull("profile")) {
                                ContactProfile contactProfile3 = new ContactProfile(jSONObject.getJSONObject("profile"));
                                AbstractC23304d.f113368c0 = contactProfile3;
                                if (TextUtils.isEmpty(contactProfile3.f42455y)) {
                                    sb3.append("3Emp-");
                                }
                                if (TextUtils.isEmpty(AbstractC23304d.f113368c0.f42455y) && !TextUtils.isEmpty(str6)) {
                                    AbstractC23304d.f113368c0.f42455y = str6;
                                    if (TextUtils.isEmpty(str6)) {
                                        sb3.append("5Emp-");
                                    }
                                }
                                AbstractC23304d.f113394i0 = AbstractC23304d.f113368c0.f42455y;
                                AbstractC23304d.f113414n0 = 123220;
                                if (TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                                    sb3.append("6Emp-");
                                }
                                AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                            } else if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                                AbstractC23304d.f113368c0 = new ContactProfile(CoreUtility.f89233i);
                                String str9 = str2;
                                if (!jSONObject.isNull(str9)) {
                                    JSONObject jSONObject2 = jSONObject.getJSONObject(str9);
                                    AbstractC23304d.f113368c0.f42446v = jSONObject2.optString("avatar_url");
                                    AbstractC23304d.f113368c0.f42437s = jSONObject2.optString("dname");
                                    AbstractC23304d.f113368c0.f42460z1 = jSONObject2.optString("uname");
                                    AbstractC23304d.f113368c0.f42455y = jSONObject2.optString("phoneNumber");
                                }
                                if (TextUtils.isEmpty(AbstractC23304d.f113368c0.f42455y) && !TextUtils.isEmpty(str6)) {
                                    AbstractC23304d.f113368c0.f42455y = str6;
                                }
                                AbstractC23304d.f113394i0 = AbstractC23304d.f113368c0.f42455y;
                                AbstractC23304d.f113414n0 = 123221;
                                if (TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                                    sb3.append("7Emp-");
                                }
                                AbstractC23309i.m121068Iz(AbstractC23304d.f113368c0.m40373K());
                            }
                            if (z12) {
                                AbstractC23647d.m123897g("38520");
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-3", 123134);
                    }
                    if (jSONObject.has("default_avatar")) {
                        String string2 = jSONObject.getString("default_avatar");
                        AbstractC23309i.m122359rj(string2);
                        C23302b.f113247a.m120528j(string2);
                    }
                    if (!z14) {
                        if (!jSONObject.isNull("update_status")) {
                            AbstractC23309i.m122037iz(jSONObject.optString("update_status", ""));
                        }
                        if (jSONObject.has("updateInfoUser") && !jSONObject.isNull("updateInfoUser")) {
                            AbstractC23309i.m121962gz(jSONObject.optString("updateInfoUser", ""));
                        }
                        if (str5 != null) {
                            AbstractC23309i.m121576Wp(str);
                        }
                    }
                    sb3.append("StartSaveInfo-");
                    AbstractC23309i.m122171mh();
                    sb3.append("DoneSaveInfo-");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("hidden_chat_info");
                    if (optJSONObject2 != null && (optInt = optJSONObject2.optInt("reset_count", 0)) > 0) {
                        AbstractC0924m0.m2914Am(optInt);
                    }
                    if (!z14) {
                        AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-4", 123135);
                        AbstractC0852x.m2338O(new SensitiveData("phonebook_auto_scan_on_login", "phonebook_auto_scan"));
                        C18644n.m98531l().m98556s("ManualLogin");
                    }
                    C0832n.m2179i().m2192p(jSONObject);
                    C0832n.m2179i().m2195t(jSONObject, z14);
                    C0832n.m2179i().m2194s(jSONObject);
                    if (z14) {
                        AbstractC29633j.m147365n();
                    } else {
                        C0832n.m2179i().m2191k();
                        AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-5", 123136);
                        try {
                            if (TextUtils.equals(MainApplication.getAppContext().getResources().getConfiguration().locale.getLanguage(), "my")) {
                                AbstractC23309i.m122148lw(MainApplication.getAppContext(), 1, false);
                                AbstractC19646n0.m102940V1();
                            }
                        } catch (Exception unused) {
                        }
                        String m122196n5 = AbstractC23309i.m122196n5();
                        AbstractC23309i.m122022ij(m122196n5, true);
                        AbstractC23309i.m122022ij(m122196n5, false);
                        AbstractC23309i.m122669zx(6);
                        C19669z.m103146Y().m103205T0();
                        if (z21) {
                            AbstractC23309i.m121139Kw(2);
                            AbstractC23057e7.m118305l(true);
                            AbstractC20887g.m109232j(CoreUtility.f89233i, 80005, "", 0L, 80000, CoreUtility.f89236l);
                            C20882b.m109134j();
                            AbstractC23304d.f113346X0 = 0;
                            AbstractC23309i.m122550wp(0);
                            if (interfaceC27218a != null) {
                                AbstractC0924m0.m2972Cm(0);
                                AbstractC0924m0.m3691bf("");
                                AbstractC19444a.m101694b(new Runnable() { // from class: me0.f4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC23153n4.m119097K(z15, interfaceC27218a);
                                    }
                                }, 2000L);
                            }
                        } else {
                            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                                AbstractC23304d.m120535f();
                            }
                            AbstractC23179p8.m119427m(c2352i0, "ProcessResponse-Task-6", 123137);
                            AbstractC23304d.f113346X0 = z12 ? 1 : 0;
                            AbstractC23309i.m122550wp(z12 ? 1 : 0);
                            if (AbstractC23306f.m120676j().m128396M() && (optJSONObject = jSONObject.optJSONObject("msg_backup_info")) != null && optJSONObject.optInt("found", 0) == 1) {
                                if (C26263i.m135055u().m135074b0(optJSONObject.optJSONObject("data"))) {
                                    z22 = true;
                                    if (z18 && (m135087t = C26263i.m135055u().m135087t()) != null && (targetBackupInfo = m135087t.f42886u) != null && targetBackupInfo.isValid()) {
                                        z22 = true;
                                    }
                                    boolean optBoolean = jSONObject.optBoolean("is_set_pwd", true);
                                    if (!z12 || optBoolean) {
                                        z23 = false;
                                    }
                                    if (z23) {
                                        if (C7967l.m42727z().m42734K()) {
                                            C29628e.m147249E0().m147268V0();
                                        }
                                        if (C22447s.m116046m()) {
                                            C22447s.m115996C0();
                                        }
                                    }
                                    if (interfaceC27218a != null) {
                                        z19 = z18;
                                        interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.g4
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AbstractC23153n4.m119098L(InterfaceC27218a.this, z22, z19, z23);
                                            }
                                        });
                                        AbstractC23309i.m122670zy(jSONObject.optInt("location_interval", 360) * 60 * 1000);
                                        C0832n.m2179i().m2197v();
                                        if (!z14) {
                                            AbstractC23148n.m118839m(CoreUtility.f89233i);
                                            AbstractC0924m0.m3316Oi(C23793c.m124316k().mo124314i());
                                        }
                                    }
                                }
                            }
                            z22 = false;
                            if (z18) {
                                z22 = true;
                            }
                            boolean optBoolean2 = jSONObject.optBoolean("is_set_pwd", true);
                            if (!z12) {
                            }
                            z23 = false;
                            if (z23) {
                            }
                            if (interfaceC27218a != null) {
                            }
                        }
                    }
                    z19 = z18;
                    AbstractC23309i.m122670zy(jSONObject.optInt("location_interval", 360) * 60 * 1000);
                    C0832n.m2179i().m2197v();
                    if (!z14) {
                    }
                } else {
                    z19 = z18;
                }
                if (z19) {
                    try {
                        if (contactProfile2 != null) {
                            try {
                                C0766k c0766k = new C0766k();
                                c0766k.mo1704o8(new b());
                                c0766k.mo1580Y6(contactProfile2.f42455y, contactProfile2.f42362N1, AbstractC23179p8.m119418d(contactProfile2.f42434r), i11);
                                sb3.append("callSupendAcc-");
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                sb3.append("doneFlowResumeAcc-");
                                str3 = CoreUtility.f89233i;
                                i12 = 9028;
                                sb2 = sb3.toString();
                                j12 = 0;
                                i13 = 9021;
                                i14 = CoreUtility.f89236l;
                            }
                        }
                        if (!AbstractC23179p8.m119420f(contactProfile2.f42434r)) {
                            AbstractC23179p8.m119425k();
                        }
                        AbstractC23179p8.m119416b(contactProfile2);
                        sb3.append("addUpdateAccOld-");
                        ContactProfile contactProfile4 = new ContactProfile(AbstractC23304d.f113368c0);
                        contactProfile4.f42362N1 = AbstractC23304d.f113410m0;
                        AbstractC23179p8.m119416b(contactProfile4);
                        sb3.append("addUpdateAccNew-");
                        sb3.append("doneFlowResumeAcc-");
                        str3 = CoreUtility.f89233i;
                        i12 = 9028;
                        sb2 = sb3.toString();
                        j12 = 0;
                        i13 = 9021;
                        i14 = CoreUtility.f89236l;
                        AbstractC20887g.m109232j(str3, i12, sb2, j12, i13, i14);
                    } catch (Throwable th3) {
                        sb3.append("doneFlowResumeAcc-");
                        AbstractC20887g.m109232j(CoreUtility.f89233i, 9028, sb3.toString(), 0L, 9021, CoreUtility.f89236l);
                        throw th3;
                    }
                }
                C0832n.f2926h = false;
            } catch (Throwable th4) {
                th2 = th4;
                z17 = false;
                C0832n.f2926h = z17;
                if (z14) {
                }
            }
        } catch (Exception e13) {
            try {
                e13.printStackTrace();
                C0832n.f2926h = false;
                if (z14) {
                    return;
                }
                if (!C29628e.m147249E0().m93432x()) {
                    AbstractC29633j.m147365n();
                }
                if (AbstractC23306f.m120676j().m128396M() && AbstractC23309i.m122085k8()) {
                    return;
                }
            } catch (Throwable th5) {
                z17 = false;
                th2 = th5;
                C0832n.f2926h = z17;
                if (z14) {
                    if (!C29628e.m147249E0().m93432x()) {
                        AbstractC29633j.m147365n();
                    }
                    if (!AbstractC23306f.m120676j().m128396M() || !AbstractC23309i.m122085k8()) {
                        AbstractC23304d.f113431r1.set(false);
                        throw th2;
                    }
                    throw th2;
                }
                throw th2;
            }
        }
        if (z14) {
            return;
        }
        if (!C29628e.m147249E0().m93432x()) {
            AbstractC29633j.m147365n();
        }
        if (AbstractC23306f.m120676j().m128396M() && AbstractC23309i.m122085k8()) {
            return;
        }
        AbstractC23304d.f113431r1.set(false);
    }

    /* renamed from: z0 */
    private static void m119164z0(InterfaceC27218a interfaceC27218a) {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        interfaceC27218a.mo35573l4(MainTabView.class, bundle, 1, true);
    }
}

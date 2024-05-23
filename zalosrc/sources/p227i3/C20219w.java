package p227i3;

import android.content.Context;
import com.adtima.Adtima;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p009a3.C0096a;
import p009a3.C0097b;
import p009a3.C0100e;
import p148f3.C18709a;
import p148f3.C18710b;
import p148f3.C18711c;
import p313l3.AbstractC22009b;
import p313l3.AbstractC22011d;
import p667y2.C30271h;
import p667y2.C30272i;

/* renamed from: i3.w */
/* loaded from: classes2.dex */
public final class C20219w {

    /* renamed from: c */
    public static final String f100062c = "w";

    /* renamed from: d */
    private static C20219w f100063d;

    /* renamed from: a */
    private Context f100064a;

    /* renamed from: b */
    private C0097b f100065b = null;

    private C20219w() {
        this.f100064a = null;
        this.f100064a = Adtima.SharedContext;
    }

    /* renamed from: d */
    public static C20219w m105646d() {
        if (f100063d == null) {
            f100063d = new C20219w();
        }
        return f100063d;
    }

    /* renamed from: i */
    private void m105647i(int i11) {
        try {
            ArrayList m105512d = C20215s.m105509k().m105512d(i11);
            if (m105512d == null || m105512d.size() == 0) {
                return;
            }
            Iterator it = m105512d.iterator();
            while (it.hasNext()) {
                C0096a c0096a = (C0096a) it.next();
                C30272i.m149393g(this.f100064a).m149396h(c0096a.f458a, C18709a.m98673a(c0096a));
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getABTestingTemplateFromAPI", e11);
        }
    }

    /* renamed from: a */
    public C18709a m105648a(int i11) {
        Context context;
        C18709a m149401m;
        try {
            C18709a m149401m2 = C30272i.m149393g(this.f100064a).m149401m(i11);
            if (m149401m2 == null) {
                m105647i(i11);
                context = this.f100064a;
            } else {
                if (m149401m2.f94008e + AbstractC20202f.f99831q < System.currentTimeMillis()) {
                    m105647i(i11);
                }
                context = this.f100064a;
            }
            m149401m = C30272i.m149393g(context).m149401m(i11);
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getABTestingTemplate", e11);
        }
        if (m149401m != null) {
            return m149401m;
        }
        return null;
    }

    /* renamed from: b */
    public C18709a m105649b(String str, String str2) {
        C18709a m149402n;
        try {
            m149402n = C30272i.m149393g(this.f100064a).m149402n(str, str2);
            if (m149402n == null) {
                m105654h();
                m149402n = C30272i.m149393g(this.f100064a).m149402n(str, str2);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getBannerTemplate", e11);
        }
        if (m149402n != null) {
            return m149402n;
        }
        return null;
    }

    /* renamed from: c */
    public C18710b m105650c(String str) {
        C18710b m149403q;
        try {
            m149403q = C30272i.m149393g(this.f100064a).m149403q(str);
            if (m149403q == null) {
                m105654h();
                m149403q = C30272i.m149393g(this.f100064a).m149403q(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getInterstitialTemplate", e11);
        }
        if (m149403q != null) {
            return m149403q;
        }
        return null;
    }

    /* renamed from: e */
    public void m105651e(C0097b c0097b) {
        JSONArray jSONArray;
        if (c0097b != null) {
            try {
                this.f100065b = c0097b;
                String m114895b = AbstractC22009b.m114895b(c0097b.f461b);
                C0100e m105520a = AbstractC20216t.m105520a(this.f100064a);
                if (m114895b == null || m114895b.length() <= 0 || m105520a == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(m114895b);
                JSONArray optJSONArray = jSONObject.optJSONArray("screen_size");
                if (optJSONArray != null) {
                    int i11 = m105520a.f574c == 1 ? m105520a.f572a : m105520a.f573b;
                    for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                        if (jSONObject2 != null) {
                            int optInt = jSONObject2.optInt("port_width_from");
                            int optInt2 = jSONObject2.optInt("port_width_to");
                            if (i11 >= optInt && i11 <= optInt2) {
                                jSONArray = jSONObject2.optJSONArray("banner");
                                break;
                            }
                        }
                    }
                }
                jSONArray = null;
                if (jSONArray != null) {
                    Iterator it = C18709a.m98675c(jSONArray).iterator();
                    while (it.hasNext()) {
                        C18709a c18709a = (C18709a) it.next();
                        if ((c18709a.f94004a.equals("fullpage") && c18709a.f94005b.equals("graphic")) || c18709a.f94005b.equals("video") || c18709a.f94005b.equals("html")) {
                            C30271h.m149387f(this.f100064a).m149388g(c18709a.f94004a, c18709a.f94005b, c18709a);
                        }
                    }
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("droid_config");
                if (optJSONObject != null) {
                    AbstractC20202f.f99807e = optJSONObject.optInt("ads_retry_in_fail", AbstractC20202f.f99807e);
                    AbstractC20202f.f99811g = optJSONObject.optLong("ads_cache_time", AbstractC20202f.f99811g);
                    AbstractC20202f.f99813h = optJSONObject.optBoolean("ads_schedule_1r1i", AbstractC20202f.f99813h);
                    AbstractC20202f.f99810f0 = optJSONObject.optLong("ads_interstitial_expire", AbstractC20202f.f99810f0);
                    AbstractC20202f.f99812g0 = optJSONObject.optLong("ads_rewarded_expire", AbstractC20202f.f99812g0);
                    AbstractC20202f.f99814h0 = optJSONObject.optLong("ads_check_config_delay", AbstractC20202f.f99814h0);
                    boolean z11 = AbstractC20202f.f99815i;
                    if (!z11) {
                        AbstractC20202f.f99815i = optJSONObject.optBoolean("ads_pre_download", z11);
                    }
                    AbstractC20202f.f99823m = optJSONObject.optString("ads_jump_target", AbstractC20202f.f99823m);
                    AbstractC20202f.f99825n = optJSONObject.optLong("ads_jump_delay", AbstractC20202f.f99825n);
                    AbstractC20202f.f99827o = optJSONObject.optLong("ads_resume_delay", AbstractC20202f.f99827o);
                    AbstractC20202f.f99829p = optJSONObject.optInt("ads_resume_count", AbstractC20202f.f99829p);
                    AbstractC20202f.f99786N = optJSONObject.optString("ads_android_format", AbstractC20202f.f99786N);
                    AbstractC20202f.f99833r = optJSONObject.optBoolean("ads_experiment_httpclient", AbstractC20202f.f99833r);
                    AbstractC20202f.f99777E = optJSONObject.optInt("ads_fullpage_title", AbstractC20202f.f99777E);
                    AbstractC20202f.f99778F = optJSONObject.optInt("ads_fullpage_desc", AbstractC20202f.f99778F);
                    AbstractC20202f.f99779G = optJSONObject.optInt("ads_fullpage_promo", AbstractC20202f.f99779G);
                    AbstractC20202f.f99780H = optJSONObject.optInt("ads_fullpage_cta", AbstractC20202f.f99780H);
                    AbstractC20202f.f99781I = optJSONObject.optBoolean("ads_video_mnetwork_auto_play", AbstractC20202f.f99781I);
                    AbstractC20202f.f99782J = optJSONObject.optBoolean("ads_audio_mnetwork_auto_play", AbstractC20202f.f99782J);
                    AbstractC20202f.f99783K = optJSONObject.optString("ads_audio_background", AbstractC20202f.f99783K);
                    AbstractC20202f.f99784L = optJSONObject.optString("ads_audio_skip_info", AbstractC20202f.f99784L);
                    AbstractC20202f.f99785M = optJSONObject.optString("ads_audio_no_skip_info", AbstractC20202f.f99785M);
                    AbstractC20202f.f99800a0 = Long.valueOf(optJSONObject.optLong("ads_audio_timeout_load_media", AbstractC20202f.f99800a0.longValue()));
                    AbstractC20202f.f99818j0 = optJSONObject.optBoolean("ads_iab_performance_tracking", AbstractC20202f.f99818j0);
                    AbstractC20202f.f99828o0 = optJSONObject.optBoolean("ads_ab_detector_tracking", AbstractC20202f.f99828o0);
                    AbstractC20202f.f99830p0 = optJSONObject.optBoolean("ads_new_domain_force_use", AbstractC20202f.f99830p0);
                    AbstractC20202f.f99826n0 = optJSONObject.optInt("ads_serve_domain_mode", AbstractC20202f.f99826n0);
                    AbstractC20202f.f99834r0 = optJSONObject.optLong("ads_ab_report_time", AbstractC20202f.f99834r0);
                    AbstractC20202f.f99836s0 = optJSONObject.optLong("ads_ab_recheck_time", AbstractC20202f.f99836s0);
                    AbstractC20202f.f99838t0 = optJSONObject.optLong("ads_ab_ping_delay_time", AbstractC20202f.f99838t0);
                    AbstractC20202f.f99840u0 = optJSONObject.optLong("ads_ab_detect_delay_time", AbstractC20202f.f99840u0);
                    AbstractC20202f.f99832q0 = optJSONObject.optBoolean("ads_request_encrypt", AbstractC20202f.f99832q0);
                    String packageName = this.f100064a.getPackageName();
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("ads_android_flurry");
                    if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= optJSONArray2.length()) {
                                break;
                            }
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                            String optString = jSONObject3.optString("app");
                            if (optString != null && optString.equals(packageName)) {
                                AbstractC20201e.f99772c = jSONObject3.optString("key", null);
                                AbstractC20201e.f99770a = jSONObject3.optBoolean("enable", false);
                                AbstractC20201e.f99771b = jSONObject3.optBoolean("crash", false);
                                Adtima.m18326d(f100062c, String.format("PACK: %s; KEY: %s; ENABLE: %b; CRASH: %b", packageName, AbstractC20201e.f99772c, Boolean.valueOf(AbstractC20201e.f99770a), Boolean.valueOf(AbstractC20201e.f99771b)));
                                break;
                            }
                            i13++;
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("serving_model");
                if (optJSONObject2 != null) {
                    AbstractC20202f.f99809f = optJSONObject2.optInt("ads_get_retry", AbstractC20202f.f99809f);
                    AbstractC20202f.f99806d0 = optJSONObject2.optInt("ads_request_timeout", AbstractC20202f.f99806d0);
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("iab_browser");
                if (optJSONObject3 != null) {
                    AbstractC20202f.f99820k0 = AbstractC22011d.m114910k(optJSONObject3.optJSONArray("ads_urls_out"));
                    AbstractC20202f.f99822l0 = AbstractC22011d.m114910k(optJSONObject3.optJSONArray("ads_url_in"));
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject("iab_browser_custom");
                if (optJSONObject4 != null) {
                    AbstractC20202f.f99824m0 = AbstractC22011d.m114910k(optJSONObject4.optJSONArray("ads_zalo_form"));
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("om_sdk");
                if (optJSONObject5 != null) {
                    AbstractC20202f.f99835s = optJSONObject5.optBoolean("ads_om_sdk_enable", AbstractC20202f.f99835s);
                    AbstractC20202f.f99837t = optJSONObject5.optString("ads_om_partner_name", AbstractC20202f.f99837t);
                    AbstractC20202f.f99839u = optJSONObject5.optString("ads_om_sdk_js_path", AbstractC20202f.f99839u);
                    AbstractC20202f.f99841v = optJSONObject5.optString("ads_om_sdk_validation_path", AbstractC20202f.f99841v);
                }
                JSONObject optJSONObject6 = jSONObject.optJSONObject("offline_mode");
                if (optJSONObject6 != null) {
                    AbstractC20202f.f99791S = Long.valueOf(optJSONObject6.optLong("ads_offline_downtime", AbstractC20202f.f99791S.longValue()));
                    AbstractC20202f.f99789Q = optJSONObject6.optBoolean("ads_offline_enable", AbstractC20202f.f99789Q);
                    AbstractC20202f.f99790R = optJSONObject6.optBoolean("ads_offline_tracking", AbstractC20202f.f99790R);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f100062c, "preloadTemplateAndCache", e11);
            }
        }
    }

    /* renamed from: f */
    public C18709a m105652f(String str, String str2) {
        C18709a m149390i;
        try {
            m149390i = C30271h.m149387f(this.f100064a).m149390i(str, str2);
            if (m149390i == null) {
                m105651e(this.f100065b);
                m149390i = C30271h.m149387f(this.f100064a).m149390i(str, str2);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getBannerTemplate", e11);
        }
        if (m149390i != null) {
            return m149390i;
        }
        return null;
    }

    /* renamed from: g */
    public C18711c m105653g(String str) {
        C18711c m149404r;
        try {
            m149404r = C30272i.m149393g(this.f100064a).m149404r(str);
            if (m149404r == null) {
                m105654h();
                m149404r = C30272i.m149393g(this.f100064a).m149404r(str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "getVideoRewardTemplate", e11);
        }
        if (m149404r != null) {
            return m149404r;
        }
        return null;
    }

    /* renamed from: h */
    public void m105654h() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        try {
            C0097b m105518m = C20215s.m105509k().m105518m();
            if (m105518m == null) {
                return;
            }
            String m114895b = AbstractC22009b.m114895b(m105518m.f461b);
            C0100e m105520a = AbstractC20216t.m105520a(this.f100064a);
            if (m114895b == null || m114895b.length() <= 0 || m105520a == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(m114895b);
            JSONArray optJSONArray = jSONObject.optJSONArray("screen_size");
            if (optJSONArray != null) {
                int i11 = m105520a.f574c == 1 ? m105520a.f572a : m105520a.f573b;
                for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                    if (jSONObject2 != null) {
                        int optInt = jSONObject2.optInt("port_width_from");
                        int optInt2 = jSONObject2.optInt("port_width_to");
                        if (i11 >= optInt && i11 <= optInt2) {
                            jSONArray = jSONObject2.optJSONArray("banner");
                            jSONArray2 = jSONObject2.optJSONArray("interstitial");
                            jSONArray3 = jSONObject2.optJSONArray("incentivized");
                            break;
                        }
                    }
                }
            }
            jSONArray = null;
            jSONArray2 = null;
            jSONArray3 = null;
            if (jSONArray != null && jSONArray2 != null) {
                ArrayList m98675c = C18709a.m98675c(jSONArray);
                ArrayList m98678b = C18710b.m98678b(jSONArray2);
                ArrayList m98681b = C18711c.m98681b(jSONArray3);
                Iterator it = m98675c.iterator();
                while (it.hasNext()) {
                    C18709a c18709a = (C18709a) it.next();
                    C30272i.m149393g(this.f100064a).m149399k(c18709a.f94004a, c18709a.f94005b, c18709a);
                }
                Iterator it2 = m98678b.iterator();
                while (it2.hasNext()) {
                    C18710b c18710b = (C18710b) it2.next();
                    C30272i.m149393g(this.f100064a).m149397i(c18710b.f94010a, c18710b);
                }
                Iterator it3 = m98681b.iterator();
                while (it3.hasNext()) {
                    C18711c c18711c = (C18711c) it3.next();
                    C30272i.m149393g(this.f100064a).m149398j(c18711c.f94015a, c18711c);
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("droid_config");
            if (optJSONObject != null) {
                AbstractC20202f.f99807e = optJSONObject.optInt("ads_retry_in_fail", AbstractC20202f.f99807e);
                AbstractC20202f.f99811g = optJSONObject.optLong("ads_cache_time", AbstractC20202f.f99811g);
                AbstractC20202f.f99813h = optJSONObject.optBoolean("ads_schedule_1r1i", AbstractC20202f.f99813h);
                AbstractC20202f.f99810f0 = optJSONObject.optLong("ads_interstitial_expire", AbstractC20202f.f99810f0);
                AbstractC20202f.f99812g0 = optJSONObject.optLong("ads_rewarded_expire", AbstractC20202f.f99812g0);
                AbstractC20202f.f99814h0 = optJSONObject.optLong("ads_check_config_delay", AbstractC20202f.f99814h0);
                boolean z11 = AbstractC20202f.f99815i;
                if (!z11) {
                    AbstractC20202f.f99815i = optJSONObject.optBoolean("ads_pre_download", z11);
                }
                AbstractC20202f.f99823m = optJSONObject.optString("ads_jump_target", AbstractC20202f.f99823m);
                AbstractC20202f.f99825n = optJSONObject.optLong("ads_jump_delay", AbstractC20202f.f99825n);
                AbstractC20202f.f99827o = optJSONObject.optLong("ads_resume_delay", AbstractC20202f.f99827o);
                AbstractC20202f.f99829p = optJSONObject.optInt("ads_resume_count", AbstractC20202f.f99829p);
                AbstractC20202f.f99786N = optJSONObject.optString("ads_android_format", AbstractC20202f.f99786N);
                AbstractC20202f.f99833r = optJSONObject.optBoolean("ads_experiment_httpclient", AbstractC20202f.f99833r);
                AbstractC20202f.f99843w = optJSONObject.optInt("ads_r31rect_title", AbstractC20202f.f99843w);
                AbstractC20202f.f99845x = optJSONObject.optInt("ads_r31rect_desc", AbstractC20202f.f99845x);
                AbstractC20202f.f99847y = optJSONObject.optInt("ads_r31rect_promo", AbstractC20202f.f99847y);
                AbstractC20202f.f99849z = optJSONObject.optInt("ads_r31rect_cta", AbstractC20202f.f99849z);
                AbstractC20202f.f99773A = optJSONObject.optInt("ads_medium_title", AbstractC20202f.f99773A);
                AbstractC20202f.f99774B = optJSONObject.optInt("ads_medium_desc", AbstractC20202f.f99774B);
                AbstractC20202f.f99775C = optJSONObject.optInt("ads_medium_promo", AbstractC20202f.f99775C);
                AbstractC20202f.f99776D = optJSONObject.optInt("ads_medium_cta", AbstractC20202f.f99776D);
                AbstractC20202f.f99777E = optJSONObject.optInt("ads_fullpage_title", AbstractC20202f.f99777E);
                AbstractC20202f.f99778F = optJSONObject.optInt("ads_fullpage_desc", AbstractC20202f.f99778F);
                AbstractC20202f.f99779G = optJSONObject.optInt("ads_fullpage_promo", AbstractC20202f.f99779G);
                AbstractC20202f.f99780H = optJSONObject.optInt("ads_fullpage_cta", AbstractC20202f.f99780H);
                AbstractC20202f.f99781I = optJSONObject.optBoolean("ads_video_mnetwork_auto_play", AbstractC20202f.f99781I);
                AbstractC20202f.f99782J = optJSONObject.optBoolean("ads_audio_mnetwork_auto_play", AbstractC20202f.f99782J);
                AbstractC20202f.f99783K = optJSONObject.optString("ads_audio_background", AbstractC20202f.f99783K);
                AbstractC20202f.f99784L = optJSONObject.optString("ads_audio_skip_info", AbstractC20202f.f99784L);
                AbstractC20202f.f99785M = optJSONObject.optString("ads_audio_no_skip_info", AbstractC20202f.f99785M);
                AbstractC20202f.f99800a0 = Long.valueOf(optJSONObject.optLong("ads_audio_timeout_load_media", AbstractC20202f.f99800a0.longValue()));
                AbstractC20202f.f99818j0 = optJSONObject.optBoolean("ads_iab_performance_tracking", AbstractC20202f.f99818j0);
                AbstractC20202f.f99828o0 = optJSONObject.optBoolean("ads_ab_detector_tracking", AbstractC20202f.f99828o0);
                AbstractC20202f.f99830p0 = optJSONObject.optBoolean("ads_new_domain_force_use", AbstractC20202f.f99830p0);
                AbstractC20202f.f99826n0 = optJSONObject.optInt("ads_serve_domain_mode", AbstractC20202f.f99826n0);
                AbstractC20202f.f99834r0 = optJSONObject.optLong("ads_ab_report_time", AbstractC20202f.f99834r0);
                AbstractC20202f.f99836s0 = optJSONObject.optLong("ads_ab_recheck_time", AbstractC20202f.f99836s0);
                AbstractC20202f.f99838t0 = optJSONObject.optLong("ads_ab_ping_delay_time", AbstractC20202f.f99838t0);
                AbstractC20202f.f99840u0 = optJSONObject.optLong("ads_ab_detect_delay_time", AbstractC20202f.f99840u0);
                AbstractC20202f.f99832q0 = optJSONObject.optBoolean("ads_request_encrypt", AbstractC20202f.f99832q0);
                String packageName = this.f100064a.getPackageName();
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("ads_android_flurry");
                if (optJSONArray2 != null && optJSONArray2.length() != 0) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= optJSONArray2.length()) {
                            break;
                        }
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                        String optString = jSONObject3.optString("app");
                        if (optString != null && optString.equals(packageName)) {
                            AbstractC20201e.f99772c = jSONObject3.optString("key", null);
                            AbstractC20201e.f99770a = jSONObject3.optBoolean("enable", false);
                            AbstractC20201e.f99771b = jSONObject3.optBoolean("crash", false);
                            Adtima.m18326d(f100062c, String.format("PACK: %s; KEY: %s; ENABLE: %b; CRASH: %b", packageName, AbstractC20201e.f99772c, Boolean.valueOf(AbstractC20201e.f99770a), Boolean.valueOf(AbstractC20201e.f99771b)));
                            break;
                        }
                        i13++;
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("serving_model");
            if (optJSONObject2 != null) {
                AbstractC20202f.f99809f = optJSONObject2.optInt("ads_get_retry", AbstractC20202f.f99809f);
                AbstractC20202f.f99806d0 = optJSONObject2.optInt("ads_request_timeout", AbstractC20202f.f99806d0);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("iab_browser");
            if (optJSONObject3 != null) {
                AbstractC20202f.f99820k0 = AbstractC22011d.m114910k(optJSONObject3.optJSONArray("ads_urls_out"));
                AbstractC20202f.f99822l0 = AbstractC22011d.m114910k(optJSONObject3.optJSONArray("ads_url_in"));
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("iab_browser_custom");
            if (optJSONObject4 != null) {
                AbstractC20202f.f99824m0 = AbstractC22011d.m114910k(optJSONObject4.optJSONArray("ads_zalo_form"));
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("om_sdk");
            if (optJSONObject5 != null) {
                AbstractC20202f.f99835s = optJSONObject5.optBoolean("ads_om_sdk_enable", AbstractC20202f.f99835s);
                AbstractC20202f.f99837t = optJSONObject5.optString("ads_om_partner_name", AbstractC20202f.f99837t);
                AbstractC20202f.f99839u = optJSONObject5.optString("ads_om_sdk_js_path", AbstractC20202f.f99839u);
                AbstractC20202f.f99841v = optJSONObject5.optString("ads_om_sdk_validation_path", AbstractC20202f.f99841v);
            }
            JSONObject optJSONObject6 = jSONObject.optJSONObject("offline_mode");
            if (optJSONObject6 != null) {
                AbstractC20202f.f99791S = Long.valueOf(optJSONObject6.optLong("ads_offline_downtime", AbstractC20202f.f99791S.longValue()));
                AbstractC20202f.f99789Q = optJSONObject6.optBoolean("ads_offline_enable", AbstractC20202f.f99789Q);
                AbstractC20202f.f99790R = optJSONObject6.optBoolean("ads_offline_tracking", AbstractC20202f.f99790R);
            }
            JSONObject optJSONObject7 = jSONObject.optJSONObject("network_google");
            if (optJSONObject7 != null) {
                AbstractC20202f.f99792T = optJSONObject7.optBoolean("ads_google_enable", AbstractC20202f.f99792T);
                AbstractC20202f.f99793U = Long.valueOf(optJSONObject7.optLong("ads_google_timeout", AbstractC20202f.f99793U.longValue()));
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("network_mode");
            if (optJSONObject8 != null) {
                AbstractC20202f.f99796X = optJSONObject.optString("ads_network_mode", AbstractC20202f.f99796X);
                AbstractC20202f.f99797Y = Long.valueOf(optJSONObject8.optLong("ads_network_bundle_timeout", AbstractC20202f.f99797Y.longValue()));
                AbstractC20202f.f99798Z = Long.valueOf(optJSONObject8.optLong("ads_network_preload_timeout", AbstractC20202f.f99798Z.longValue()));
            }
        } catch (Exception e11) {
            Adtima.m18329e(f100062c, "preloadTemplateAndCache", e11);
        }
    }
}

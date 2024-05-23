package p327lm;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import hh0.AbstractC20064b;
import hh0.AbstractC20066d;
import hh0.C20063a;
import ih0.C20557a;
import ih0.C20558b;
import java.util.Locale;
import kh0.C21726b;
import lh0.EnumC22488c;
import lh0.EnumC22489d;
import om.C24310c;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: lm.a */
/* loaded from: classes.dex */
public class C22521a {

    /* renamed from: a */
    String f110221a;

    /* renamed from: b */
    String f110222b;

    /* renamed from: c */
    String f110223c;

    /* renamed from: d */
    boolean f110224d;

    /* renamed from: e */
    C20557a f110225e = new C20557a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lm.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        String f110226a;

        /* renamed from: b */
        long f110227b;

        a(String str, long j11) {
            this.f110226a = str;
            this.f110227b = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lm.a$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        String f110228a;

        /* renamed from: b */
        String f110229b;

        b(String str, String str2) {
            this.f110228a = str;
            this.f110229b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public a m116472a(Context context, String str) {
        return m116473b(context, str, System.currentTimeMillis());
    }

    /* renamed from: b */
    a m116473b(Context context, String str, long j11) {
        JSONObject m116476e = m116476e(context);
        JSONObject m116477f = m116477f(context, str, j11);
        if (this.f110223c == null) {
            this.f110223c = "";
        }
        String m104295n = AbstractC20066d.m104295n(new String[]{"pl", "appId", "viewer", "device", "data", "ts", "sdkId"}, new String[]{"android", this.f110221a, this.f110222b, m116476e.toString(), m116477f.toString(), "" + j11, this.f110223c}, "@#centralize#@");
        C20558b m106847a = this.f110225e.m106847a(C20558b.a.POST, C21726b.m112130b().m112136h("centralized_http_s", "/id/mobile/android"));
        m106847a.m106850b("pl", "android");
        m106847a.m106850b("appId", this.f110221a);
        m106847a.m106850b("viewer", this.f110222b);
        m106847a.m106850b("device", m116476e.toString());
        m106847a.m106850b("data", m116477f.toString());
        m106847a.m106850b("ts", "" + j11);
        m106847a.m106850b("sig", m104295n);
        m106847a.m106850b("sdkId", this.f110223c);
        JSONObject m106851c = m106847a.m106851c();
        if (m106851c != null && m106851c.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0) {
            JSONObject jSONObject = m106851c.getJSONObject("data");
            return new a(jSONObject.optString("deviceId"), jSONObject.optLong("expiredTime") + System.currentTimeMillis());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public b m116474c(Context context) {
        JSONObject m116476e = m116476e(context);
        C20558b m106847a = this.f110225e.m106847a(C20558b.a.POST, C21726b.m112130b().m112136h("centralized_http_s", "/sdk/mobile/android"));
        m106847a.m106850b("appId", this.f110221a);
        m106847a.m106850b("sdkv", AbstractC20066d.m104288g());
        m106847a.m106850b("pl", "android");
        m106847a.m106850b("osv", AbstractC20064b.m104263m());
        m106847a.m106850b("model", AbstractC20064b.m104261k());
        m106847a.m106850b("screenSize", AbstractC20064b.m104267q(context));
        m106847a.m106850b("device", m116476e.toString());
        m106847a.m106850b("ref", C20063a.m104245n(context));
        JSONObject m106851c = m106847a.m106851c();
        if (m106851c != null && m106851c.getInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR) == 0) {
            JSONObject jSONObject = m106851c.getJSONObject("data");
            return new b(jSONObject.optString("sdkId"), jSONObject.optString("privateKey"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public JSONObject m116475d(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fs", "" + EnumC22488c.SDK.m116275c());
            jSONObject.put("sdkv", "" + AbstractC20066d.m104289h());
            jSONObject.put("av", C20063a.m104248q(context));
            jSONObject.put("an", C20063a.m104234c(context));
            jSONObject.put("plf", "" + EnumC22489d.ANDROID.m116277c());
            jSONObject.put("osv", AbstractC20064b.m104263m());
            jSONObject.put("conn", AbstractC20064b.m104262l(context));
            jSONObject.put("mno", AbstractC20064b.m104260j(context));
            jSONObject.put("mod", AbstractC20064b.m104261k());
            jSONObject.put("dId", AbstractC20064b.m104251a(context));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: e */
    JSONObject m116476e(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dId", AbstractC20064b.m104251a(context));
            jSONObject.put("aId", AbstractC20064b.m104252b(context));
            jSONObject.put("ser", AbstractC20064b.m104268r());
            jSONObject.put("mod", AbstractC20064b.m104261k());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public JSONObject m116477f(Context context, String str, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pkg", C20063a.m104243l(context));
            jSONObject.put("pl", "android");
            jSONObject.put("osv", AbstractC20064b.m104263m());
            jSONObject.put("sdkv", AbstractC20066d.m104288g());
            jSONObject.put("an", C20063a.m104234c(context));
            jSONObject.put("av", C20063a.m104248q(context));
            jSONObject.put("dId", AbstractC20064b.m104251a(context));
            jSONObject.put("aId", AbstractC20064b.m104252b(context));
            jSONObject.put("ser", AbstractC20064b.m104268r());
            jSONObject.put("mod", AbstractC20064b.m104261k());
            jSONObject.put("ss", AbstractC20064b.m104267q(context));
            jSONObject.put("mac", AbstractC20064b.m104270t(context));
            jSONObject.put("conn", AbstractC20064b.m104254d(context));
            jSONObject.put("mno", AbstractC20064b.m104260j(context));
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("sId", str);
            }
            jSONObject.put("adId", AbstractC20064b.m104251a(context));
            jSONObject.put("ins_pkg", C20063a.m104240i(context));
            if (!TextUtils.isEmpty(C20063a.m104245n(context))) {
                jSONObject.put("ref", C20063a.m104245n(context));
            }
            jSONObject.put("ins_dte", C20063a.m104239h(context));
            jSONObject.put("fst_ins_dte", C20063a.m104236e(context));
            jSONObject.put("lst_ins_dte", C20063a.m104242k(context));
            jSONObject.put("fst_run_dte", C20063a.m104237f(context));
            jSONObject.put("ts", String.valueOf(j11));
            jSONObject.put("brd", AbstractC20064b.m104253c());
            jSONObject.put("dev", Build.DEVICE);
            jSONObject.put("prd", AbstractC20064b.m104266p());
            jSONObject.put("adk_ver", Build.VERSION.SDK_INT);
            jSONObject.put("mnft", AbstractC20064b.m104257g());
            jSONObject.put("dev_type", Build.TYPE);
            jSONObject.put("avc", C20063a.m104247p(context));
            jSONObject.put("was_ins", String.valueOf(this.f110224d));
            jSONObject.put("lang", Locale.getDefault().toString());
            jSONObject.put("dpi", context.getResources().getDisplayMetrics().density);
            C24310c m104264n = AbstractC20064b.m104264n(context);
            jSONObject.put("preload", m104264n.f117392a);
            jSONObject.put("preloadDefault", C20063a.m104244m(context));
            if (!m104264n.m126955c()) {
                jSONObject.put("preloadFailed", m104264n.f117393b);
            }
            Location m104255e = AbstractC20064b.m104255e(context);
            if (m104255e != null) {
                jSONObject.put("lat", String.valueOf(m104255e.getLatitude()));
                jSONObject.put("lng", String.valueOf(m104255e.getLongitude()));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ly1 {

    /* renamed from: a */
    private final vs0 f24301a;

    /* renamed from: b */
    private final Context f24302b;

    /* renamed from: c */
    private final zzcgv f24303c;

    /* renamed from: d */
    private final dr2 f24304d;

    /* renamed from: e */
    private final Executor f24305e;

    /* renamed from: f */
    private final String f24306f;

    /* renamed from: g */
    private final vw2 f24307g;

    /* renamed from: h */
    private final or2 f24308h;

    /* renamed from: i */
    private final ys1 f24309i;

    public ly1(vs0 vs0Var, Context context, zzcgv zzcgvVar, dr2 dr2Var, Executor executor, String str, vw2 vw2Var, ys1 ys1Var) {
        this.f24301a = vs0Var;
        this.f24302b = context;
        this.f24303c = zzcgvVar;
        this.f24304d = dr2Var;
        this.f24305e = executor;
        this.f24306f = str;
        this.f24307g = vw2Var;
        this.f24308h = vs0Var.mo22613y();
        this.f24309i = ys1Var;
    }

    /* renamed from: c */
    private final tc3 m24414c(final String str, final String str2) {
        kw2 m23764a = jw2.m23764a(this.f24302b, 11);
        m23764a.zzf();
        u80 m24168a = zzt.zzf().m24168a(this.f24302b, this.f24303c, this.f24301a.mo22590B());
        o80 o80Var = r80.f27138b;
        final k80 m26871a = m24168a.m26871a("google.afma.response.normalize", o80Var, o80Var);
        tc3 m23882n = kc3.m23882n(kc3.m23882n(kc3.m23882n(kc3.m23877i(""), new qb3() { // from class: com.google.android.gms.internal.ads.iy1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return kc3.m23877i(jSONObject);
                } catch (JSONException e11) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e11.getCause())));
                }
            }
        }, this.f24305e), new qb3() { // from class: com.google.android.gms.internal.ads.jy1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return k80.this.zzb((JSONObject) obj);
            }
        }, this.f24305e), new qb3() { // from class: com.google.android.gms.internal.ads.ky1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return ly1.this.m24418b((JSONObject) obj);
            }
        }, this.f24305e);
        uw2.m27075a(m23882n, this.f24307g, m23764a);
        return m23882n;
    }

    /* renamed from: d */
    private final String m24415d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f24306f));
            }
            return jSONObject.toString();
        } catch (JSONException e11) {
            yk0.zzj("Failed to update the ad types for rendering. ".concat(e11.toString()));
            return str;
        }
    }

    /* renamed from: e */
    private static final String m24416e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tc3 m24417a() {
        Boolean bool;
        String str;
        String str2 = this.f24304d.f19398d.zzx;
        if (!TextUtils.isEmpty(str2)) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21193a6)).booleanValue()) {
                String m24416e = m24416e(str2);
                AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21323n6;
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue() && m24416e.isEmpty()) {
                    int lastIndexOf = str2.lastIndexOf("&request_id=");
                    m24416e = lastIndexOf != -1 ? str2.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(m24416e)) {
                    return kc3.m23876h(new zzekr(15, "Invalid ad string."));
                }
                String zzb = this.f24301a.mo22605q().zzb(m24416e, this.f24309i);
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    ys1 ys1Var = this.f24309i;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = Boolean.TRUE;
                            if (bool.booleanValue()) {
                                int lastIndexOf2 = str2.lastIndexOf("&");
                                String str3 = null;
                                if (lastIndexOf2 != -1) {
                                    str = str2.substring(0, lastIndexOf2);
                                } else {
                                    str = null;
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    try {
                                        byte[] decode = Base64.decode(str, 11);
                                        byte[] bytes = m24416e.getBytes("UTF-8");
                                        try {
                                            str3 = new JSONObject(zzb).getString("arek");
                                        } catch (JSONException e11) {
                                            zze.zza("Failed to get key from QueryJSONMap".concat(e11.toString()));
                                            zzt.zzo().m22945t(e11, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str2 = or2.m25247b(decode, bytes, str3, ys1Var);
                                    } catch (UnsupportedEncodingException e12) {
                                        zze.zza("Failed to decode the adResponse. ".concat(e12.toString()));
                                        zzt.zzo().m22945t(e12, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                        bool = Boolean.FALSE;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return m24414c(str2, m24415d(zzb));
                }
            }
        }
        zzc zzcVar = this.f24304d.f19398d.zzs;
        if (zzcVar != null) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21174Y5)).booleanValue()) {
                String m24416e2 = m24416e(zzcVar.zza);
                String m24416e3 = m24416e(zzcVar.zzb);
                if (!TextUtils.isEmpty(m24416e3) && m24416e2.equals(m24416e3)) {
                    this.f24301a.mo22605q().zzf(m24416e2);
                    this.f24309i.m28337a().put("rid", m24416e2);
                } else {
                    this.f24309i.m28337a().put("ridmm", "true");
                }
            }
            return m24414c(zzcVar.zza, m24415d(zzcVar.zzb));
        }
        return kc3.m23876h(new zzekr(14, "Mismatch request IDs."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ tc3 m24418b(JSONObject jSONObject) {
        return kc3.m23877i(new tq2(new qq2(this.f24304d), sq2.m26389a(new StringReader(jSONObject.toString()))));
    }
}

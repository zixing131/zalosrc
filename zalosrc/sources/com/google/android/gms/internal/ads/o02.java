package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o02 implements ju2 {

    /* renamed from: d */
    private static final Pattern f25391d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a */
    private final String f25392a;

    /* renamed from: b */
    private final kw2 f25393b;

    /* renamed from: c */
    private final vw2 f25394c;

    public o02(String str, vw2 vw2Var, kw2 kw2Var) {
        this.f25392a = str;
        this.f25394c = vw2Var;
        this.f25393b = kw2Var;
    }

    @Override // com.google.android.gms.internal.ads.ju2
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject;
        pf0 pf0Var;
        pf0 pf0Var2;
        pf0 pf0Var3;
        pf0 pf0Var4;
        pf0 pf0Var5;
        pf0 pf0Var6;
        pf0 pf0Var7;
        JSONObject jSONObject2;
        String str;
        n02 n02Var = (n02) obj;
        jSONObject = n02Var.f24968a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        pf0Var = n02Var.f24969b;
        String str2 = "";
        if (pf0Var.m25428a() == -2) {
            HashMap hashMap = new HashMap();
            pf0Var2 = n02Var.f24969b;
            if (pf0Var2.m25435h() && !TextUtils.isEmpty(this.f25392a)) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21012I0)).booleanValue()) {
                    String str3 = this.f25392a;
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = f25391d.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null) {
                                Locale locale = Locale.ROOT;
                                if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                    if (!TextUtils.isEmpty(str)) {
                                        str = str.concat("; ");
                                    }
                                    str = str.concat(group);
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", this.f25392a);
                }
            }
            pf0Var3 = n02Var.f24969b;
            if (pf0Var3.m25436i()) {
                jSONObject2 = n02Var.f24968a;
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            pf0Var4 = n02Var.f24969b;
            if (pf0Var4 != null) {
                pf0Var6 = n02Var.f24969b;
                if (!TextUtils.isEmpty(pf0Var6.m25431d())) {
                    pf0Var7 = n02Var.f24969b;
                    str2 = pf0Var7.m25431d();
                }
            }
            vw2 vw2Var = this.f25394c;
            kw2 kw2Var = this.f25393b;
            kw2Var.mo23067q(true);
            vw2Var.m27360a(kw2Var);
            pf0Var5 = n02Var.f24969b;
            return new j02(pf0Var5.m25432e(), optInt, hashMap, str2.getBytes(w43.f29782c), "");
        }
        vw2 vw2Var2 = this.f25394c;
        kw2 kw2Var2 = this.f25393b;
        kw2Var2.mo23067q(false);
        vw2Var2.m27360a(kw2Var2);
        if (pf0Var.m25428a() == 1) {
            if (pf0Var.m25433f() != null) {
                str2 = TextUtils.join(", ", pf0Var.m25433f());
                yk0.zzg(str2);
            }
            throw new zzebh(2, "Error building request URL: ".concat(String.valueOf(str2)));
        }
        throw new zzebh(1);
    }
}

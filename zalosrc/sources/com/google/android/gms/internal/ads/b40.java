package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p148f3.C18711c;
import p227i3.C20217u;

/* loaded from: classes2.dex */
public abstract class b40 {

    /* renamed from: a */
    public static final c40 f17552a = i30.f22033a;

    /* renamed from: b */
    public static final c40 f17553b = j30.f22608a;

    /* renamed from: c */
    public static final c40 f17554c = b30.f17514a;

    /* renamed from: d */
    public static final c40 f17555d = new t30();

    /* renamed from: e */
    public static final c40 f17556e = new u30();

    /* renamed from: f */
    public static final c40 f17557f = h30.f21516a;

    /* renamed from: g */
    public static final c40 f17558g = new v30();

    /* renamed from: h */
    public static final c40 f17559h = new w30();

    /* renamed from: i */
    public static final c40 f17560i = g30.f20376a;

    /* renamed from: j */
    public static final c40 f17561j = new x30();

    /* renamed from: k */
    public static final c40 f17562k = new y30();

    /* renamed from: l */
    public static final c40 f17563l = new xo0();

    /* renamed from: m */
    public static final c40 f17564m = new yo0();

    /* renamed from: n */
    public static final c40 f17565n = new a30();

    /* renamed from: o */
    public static final r40 f17566o = new r40();

    /* renamed from: p */
    public static final c40 f17567p = new z30();

    /* renamed from: q */
    public static final c40 f17568q = new a40();

    /* renamed from: r */
    public static final c40 f17569r = new k30();

    /* renamed from: s */
    public static final c40 f17570s = new l30();

    /* renamed from: t */
    public static final c40 f17571t = new m30();

    /* renamed from: u */
    public static final c40 f17572u = new n30();

    /* renamed from: v */
    public static final c40 f17573v = new o30();

    /* renamed from: w */
    public static final c40 f17574w = new p30();

    /* renamed from: x */
    public static final c40 f17575x = new q30();

    /* renamed from: y */
    public static final c40 f17576y = new r30();

    /* renamed from: a */
    public static c40 m20393a(pf1 pf1Var) {
        return new c40() { // from class: com.google.android.gms.internal.ads.f30
            public /* synthetic */ f30() {
            }

            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                zq0 zq0Var = (zq0) obj;
                b40.m20396d(map, pf1.this);
                String str = (String) map.get(C20217u.f99970o);
                if (str == null) {
                    yk0.zzj("URL missing from click GMSG.");
                } else {
                    kc3.m23886r(b40.m20394b(zq0Var, str), new s30(zq0Var), kl0.f23363a);
                }
            }
        };
    }

    /* renamed from: b */
    public static tc3 m20394b(zq0 zq0Var, String str) {
        Uri parse = Uri.parse(str);
        try {
            C4830od mo23008d = zq0Var.mo23008d();
            if (mo23008d != null && mo23008d.m25163f(parse)) {
                parse = mo23008d.m25158a(parse, zq0Var.getContext(), zq0Var.mo23737i(), zq0Var.zzk());
            }
        } catch (zzapf unused) {
            yk0.zzj("Unable to append parameter to URL: ".concat(str));
        }
        String m22026b = fj0.m22026b(parse, zq0Var.getContext());
        long longValue = ((Long) AbstractC5186xy.f30676e.m24091e()).longValue();
        if (longValue > 0 && longValue <= 223104600) {
            ac3 m20071D = ac3.m20071D(zq0Var.mo26714y0());
            c30 c30Var = c30.f18094a;
            uc3 uc3Var = kl0.f23368f;
            return kc3.m23874f(kc3.m23881m(kc3.m23874f(m20071D, Throwable.class, c30Var, uc3Var), new y43() { // from class: com.google.android.gms.internal.ads.d30

                /* renamed from: a */
                public final /* synthetic */ String f19067a;

                public /* synthetic */ d30(String m22026b2) {
                    r1 = m22026b2;
                }

                @Override // com.google.android.gms.internal.ads.y43
                public final Object apply(Object obj) {
                    String str2 = r1;
                    String str3 = (String) obj;
                    c40 c40Var = b40.f17552a;
                    if (str3 != null) {
                        if (((Boolean) AbstractC5186xy.f30677f.m24091e()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i11 = 0; i11 < 3; i11++) {
                                if (!host.endsWith(strArr[i11])) {
                                }
                            }
                        }
                        String str4 = (String) AbstractC5186xy.f30672a.m24091e();
                        String str5 = (String) AbstractC5186xy.f30673b.m24091e();
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str2.replace(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, uc3Var), Throwable.class, new y43() { // from class: com.google.android.gms.internal.ads.e30

                /* renamed from: a */
                public final /* synthetic */ String f19501a;

                public /* synthetic */ e30(String m22026b2) {
                    r1 = m22026b2;
                }

                @Override // com.google.android.gms.internal.ads.y43
                public final Object apply(Object obj) {
                    String str2 = r1;
                    Throwable th2 = (Throwable) obj;
                    c40 c40Var = b40.f17552a;
                    if (((Boolean) AbstractC5186xy.f30682k.m24091e()).booleanValue()) {
                        zzt.zzo().m22945t(th2, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, uc3Var);
        }
        return kc3.m23877i(m22026b2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:            com.google.android.gms.internal.ads.yk0.zzh("Error constructing openable urls response.", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:            com.google.android.gms.ads.internal.zzt.zzo().m22945t(r0, r8.toString());     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m20395c(as0 as0Var, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = as0Var.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString(C20217u.f99970o);
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString(C18711c.f94014e);
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e11) {
                        yk0.zzh("Error parsing the intent data.", e11);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e12) {
                            yk0.zzh("Error parsing the url: ".concat(String.valueOf(optString7)), e12);
                        }
                        boolean z11 = true;
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfo == null) {
                            z11 = false;
                        }
                        jSONObject.put(optString, z11);
                    }
                    parseUri = null;
                    boolean z112 = true;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    if (resolveInfo == null) {
                    }
                    jSONObject.put(optString, z112);
                }
                ((x60) as0Var).mo23555n("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((x60) as0Var).mo23555n("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((x60) as0Var).mo23555n("openableIntents", new JSONObject());
        }
    }

    /* renamed from: d */
    public static void m20396d(Map map, pf1 pf1Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21405v8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && pf1Var != null) {
            pf1Var.zzq();
        }
    }
}

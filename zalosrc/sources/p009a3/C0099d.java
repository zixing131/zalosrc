package p009a3;

import com.adtima.Adtima;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import org.json.JSONObject;
import p223i.AbstractC20170a;

/* renamed from: a3.d */
/* loaded from: classes2.dex */
public final class C0099d extends AbstractC20170a {

    /* renamed from: a */
    public String f547a;

    /* renamed from: j */
    public String f556j;

    /* renamed from: k */
    public String f557k;

    /* renamed from: y */
    public String f571y;

    /* renamed from: b */
    public String f548b = null;

    /* renamed from: c */
    public String f549c = null;

    /* renamed from: d */
    public String f550d = null;

    /* renamed from: e */
    public long f551e = 0;

    /* renamed from: f */
    public long f552f = 0;

    /* renamed from: g */
    public String f553g = null;

    /* renamed from: h */
    public String f554h = null;

    /* renamed from: i */
    public String f555i = null;

    /* renamed from: l */
    public String f558l = null;

    /* renamed from: m */
    public String f559m = null;

    /* renamed from: n */
    public String f560n = null;

    /* renamed from: o */
    public String f561o = null;

    /* renamed from: p */
    public String f562p = null;

    /* renamed from: q */
    public String f563q = null;

    /* renamed from: r */
    public String f564r = null;

    /* renamed from: s */
    public String f565s = null;

    /* renamed from: t */
    public String f566t = null;

    /* renamed from: u */
    public String f567u = null;

    /* renamed from: v */
    public String f568v = null;

    /* renamed from: w */
    public double f569w = 0.0d;

    /* renamed from: x */
    public double f570x = 0.0d;

    /* renamed from: c */
    public static C0099d m447c(String str, String str2, JSONObject jSONObject) {
        C0099d c0099d;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        double d11;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("adId");
                long optLong = jSONObject.optLong("adTime");
                long optLong2 = jSONObject.optLong("adExpired");
                String optString3 = jSONObject.optString("kind");
                String optString4 = jSONObject.optString("subKind");
                String optString5 = jSONObject.optString("adSize", "");
                JSONObject optJSONObject = jSONObject.optJSONObject("metaData");
                String optString6 = jSONObject.optString("tokenId");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("ext");
                if (optJSONObject2 != null) {
                    str5 = optJSONObject2.optString("payload");
                    str3 = "";
                    str4 = optJSONObject2.optString("price");
                } else {
                    str3 = "";
                    str4 = null;
                    str5 = null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("tracking");
                if (optJSONObject3 != null) {
                    str6 = str4;
                    String optString7 = optJSONObject3.optString("request");
                    String optString8 = optJSONObject3.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
                    String optString9 = optJSONObject3.optString("click");
                    String optString10 = optJSONObject3.optString("nonServing");
                    String optString11 = optJSONObject3.optString(ZinstantMetaConstant.IMPRESSION_META_NAME);
                    String optString12 = optJSONObject3.optString("activeView");
                    String optString13 = optJSONObject3.optString("conversion");
                    String optString14 = optJSONObject3.optString("feedback");
                    String optString15 = optJSONObject3.optString("bidClient");
                    str15 = optJSONObject3.optString("viewableImp");
                    str7 = optString7;
                    str3 = optString8;
                    str8 = optString9;
                    str9 = optString10;
                    str10 = optString11;
                    str11 = optString12;
                    str12 = optString13;
                    str13 = optString14;
                    str14 = optString15;
                } else {
                    str6 = str4;
                    str7 = str3;
                    str8 = str7;
                    str9 = str8;
                    str10 = str9;
                    str11 = str10;
                    str12 = str11;
                    str13 = str12;
                    str14 = str13;
                    str15 = str14;
                }
                JSONObject optJSONObject4 = jSONObject.optJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                String str17 = str7;
                String str18 = str5;
                double d12 = 0.0d;
                if (optJSONObject4 != null) {
                    str16 = str18;
                    double optDouble = optJSONObject4.optDouble("lat", 0.0d);
                    d11 = optJSONObject4.optDouble("long", 0.0d);
                    d12 = optDouble;
                } else {
                    str16 = str18;
                    d11 = 0.0d;
                }
                if (str != null && str.length() != 0 && optString2 != null && optString2.length() != 0) {
                    C0099d c0099d2 = new C0099d();
                    try {
                        c0099d2.f547a = optString;
                        c0099d2.f548b = str;
                        c0099d2.f549c = str2;
                        c0099d2.f550d = optString2;
                        c0099d2.f551e = optLong;
                        c0099d2.f552f = optLong2;
                        c0099d2.f553g = optString3;
                        c0099d2.f554h = optString4;
                        c0099d2.f568v = optString5;
                        if (optJSONObject != null) {
                            c0099d2.f555i = optJSONObject.toString();
                        }
                        c0099d2.f556j = optString6;
                        c0099d2.f557k = str16;
                        c0099d2.f558l = str17;
                        c0099d2.f559m = str3;
                        c0099d2.f560n = str8;
                        c0099d2.f561o = str9;
                        c0099d2.f562p = str10;
                        c0099d2.f563q = str11;
                        c0099d2.f564r = str12;
                        c0099d2.f565s = str13;
                        c0099d2.f566t = str14;
                        c0099d2.f567u = str15;
                        c0099d2.f569w = d12;
                        c0099d2.f570x = d11;
                        c0099d2.f571y = str6;
                        return c0099d2;
                    } catch (Exception e11) {
                        e = e11;
                        c0099d = c0099d2;
                        Adtima.m18329e("ZadsNetworkentity", "deserializeFromAPI", e);
                        return c0099d;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                c0099d = null;
            }
        }
        return null;
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: a */
    protected Object mo433a(JSONObject jSONObject) {
        return m449e(jSONObject);
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: b */
    protected JSONObject mo434b() {
        return m450f();
    }

    @Override // p223i.AbstractC20170a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0099d clone() {
        return (C0099d) super.clone();
    }

    /* renamed from: e */
    public C0099d m449e(JSONObject jSONObject) {
        C0099d c0099d;
        if (jSONObject != null) {
            try {
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("thirdMode");
                String optString3 = jSONObject.optString("thirdType");
                String optString4 = jSONObject.optString("thirdId");
                long optLong = jSONObject.optLong("thirdDuration");
                long optLong2 = jSONObject.optLong("thirdExpired");
                String optString5 = jSONObject.optString("thirdKind");
                String optString6 = jSONObject.optString("thirdSubKind");
                String optString7 = jSONObject.optString("metaData");
                String optString8 = jSONObject.optString("adSize", "");
                String optString9 = jSONObject.optString("tokenId");
                String optString10 = jSONObject.optString("payload");
                String optString11 = jSONObject.optString("thirdTrackRequest");
                String optString12 = jSONObject.optString("thirdTrackError");
                String optString13 = jSONObject.optString("thirdTrackClick");
                String optString14 = jSONObject.optString("thirdTrackNonServing");
                String optString15 = jSONObject.optString("thirdTrackImpression");
                String optString16 = jSONObject.optString("thirdTrackActiveView");
                String optString17 = jSONObject.optString("thirdTrackConversion");
                String optString18 = jSONObject.optString("thirdTrackFeedback");
                String optString19 = jSONObject.optString("thirdTrackBidClient");
                String optString20 = jSONObject.optString("thirdTrackTrueImpression");
                double optDouble = jSONObject.optDouble("latitude", 0.0d);
                double optDouble2 = jSONObject.optDouble("longitude", 0.0d);
                c0099d = null;
                try {
                    String optString21 = jSONObject.optString("price", null);
                    if (optString2 != null && optString2.length() != 0 && optString4 != null && optString4.length() != 0) {
                        C0099d c0099d2 = new C0099d();
                        try {
                            c0099d2.f547a = optString;
                            c0099d2.f548b = optString2;
                            c0099d2.f549c = optString3;
                            c0099d2.f550d = optString4;
                            c0099d2.f551e = optLong;
                            c0099d2.f552f = optLong2;
                            c0099d2.f553g = optString5;
                            c0099d2.f554h = optString6;
                            c0099d2.f555i = optString7;
                            c0099d2.f568v = optString8;
                            c0099d2.f556j = optString9;
                            c0099d2.f557k = optString10;
                            c0099d2.f558l = optString11;
                            c0099d2.f559m = optString12;
                            c0099d2.f560n = optString13;
                            c0099d2.f561o = optString14;
                            c0099d2.f562p = optString15;
                            c0099d2.f563q = optString16;
                            c0099d2.f564r = optString17;
                            c0099d2.f565s = optString18;
                            c0099d2.f566t = optString19;
                            c0099d2.f567u = optString20;
                            c0099d2.f569w = optDouble;
                            c0099d2.f570x = optDouble2;
                            c0099d2.f571y = optString21;
                            return c0099d2;
                        } catch (Exception unused) {
                            return c0099d2;
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception unused3) {
            }
            return c0099d;
        }
        c0099d = null;
        return c0099d;
    }

    /* renamed from: f */
    public JSONObject m450f() {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f547a);
                jSONObject.put("thirdMode", this.f548b);
                jSONObject.put("thirdType", this.f549c);
                jSONObject.put("thirdId", this.f550d);
                jSONObject.put("thirdDuration", this.f551e);
                jSONObject.put("thirdExpired", this.f552f);
                jSONObject.put("thirdKind", this.f553g);
                jSONObject.put("thirdSubKind", this.f554h);
                jSONObject.put("metaData", this.f555i);
                jSONObject.put("adSize", this.f568v);
                jSONObject.put("tokenId", this.f556j);
                jSONObject.put("payload", this.f557k);
                jSONObject.put("thirdTrackRequest", this.f558l);
                jSONObject.put("thirdTrackError", this.f559m);
                jSONObject.put("thirdTrackClick", this.f560n);
                jSONObject.put("thirdTrackNonServing", this.f561o);
                jSONObject.put("thirdTrackImpression", this.f562p);
                jSONObject.put("thirdTrackActiveView", this.f563q);
                jSONObject.put("thirdTrackConversion", this.f564r);
                jSONObject.put("thirdTrackFeedback", this.f565s);
                jSONObject.put("thirdTrackBidClient", this.f566t);
                jSONObject.put("thirdTrackTrueImpression", this.f567u);
                jSONObject.put("latitude", this.f569w);
                jSONObject.put("longitude", this.f570x);
                jSONObject.put("price", this.f571y);
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}

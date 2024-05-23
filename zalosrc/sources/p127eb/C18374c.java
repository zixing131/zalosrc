package p127eb;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eb.c */
/* loaded from: classes3.dex */
public class C18374c {

    /* renamed from: a */
    public int f92747a;

    /* renamed from: b */
    public int f92748b;

    /* renamed from: c */
    public int f92749c;

    /* renamed from: d */
    public int f92750d;

    /* renamed from: e */
    public int f92751e;

    /* renamed from: f */
    public int f92752f;

    /* renamed from: g */
    public int f92753g;

    /* renamed from: h */
    public int f92754h;

    /* renamed from: i */
    public int f92755i;

    /* renamed from: j */
    public int f92756j;

    /* renamed from: k */
    public int f92757k;

    /* renamed from: l */
    public int f92758l;

    /* renamed from: m */
    public int f92759m;

    /* renamed from: n */
    public int f92760n;

    /* renamed from: o */
    public int f92761o;

    /* renamed from: p */
    public int f92762p;

    /* renamed from: q */
    public int f92763q;

    /* renamed from: a */
    public boolean m97356a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f92747a = jSONObject.getInt("audioNack");
            this.f92748b = jSONObject.getInt("audioPacketRate");
            this.f92749c = jSONObject.getInt("captureWidth");
            this.f92750d = jSONObject.getInt("captureHeight");
            this.f92751e = jSONObject.getInt("encodeWidth");
            this.f92752f = jSONObject.getInt("encodeHeight");
            this.f92753g = jSONObject.getInt("captureFps");
            this.f92754h = jSONObject.getInt("encodeFps");
            this.f92755i = jSONObject.getInt("videoNack");
            this.f92756j = jSONObject.getInt("videoLoss");
            this.f92757k = jSONObject.getInt("sendBwe");
            this.f92758l = jSONObject.getInt("serverRemb");
            this.f92759m = jSONObject.getInt("videoPacketRate");
            this.f92760n = jSONObject.getInt("keyFrameEnc");
            this.f92761o = jSONObject.getInt("outputBw");
            this.f92762p = jSONObject.getInt("inputBw");
            this.f92763q = jSONObject.getInt("rtt");
            return true;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return false;
        }
    }
}

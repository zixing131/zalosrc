package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class cw1 implements yw1, kv1 {

    /* renamed from: a */
    private final kw1 f18985a;

    /* renamed from: b */
    private final zw1 f18986b;

    /* renamed from: c */
    private final lv1 f18987c;

    /* renamed from: d */
    private final xv1 f18988d;

    /* renamed from: e */
    private final jv1 f18989e;

    /* renamed from: f */
    private final xw1 f18990f;

    /* renamed from: g */
    private final String f18991g;

    /* renamed from: p */
    private boolean f19000p;

    /* renamed from: q */
    private int f19001q;

    /* renamed from: r */
    private boolean f19002r;

    /* renamed from: i */
    private final Map f18993i = new HashMap();

    /* renamed from: j */
    private final Map f18994j = new HashMap();

    /* renamed from: k */
    private final Map f18995k = new HashMap();

    /* renamed from: l */
    private String f18996l = "{}";

    /* renamed from: m */
    private String f18997m = "";

    /* renamed from: n */
    private long f18998n = Long.MAX_VALUE;

    /* renamed from: o */
    private yv1 f18999o = yv1.NONE;

    /* renamed from: s */
    private bw1 f19003s = bw1.UNKNOWN;

    /* renamed from: h */
    private final String f18992h = "afma-sdk-a-v21.3.0";

    public cw1(kw1 kw1Var, zw1 zw1Var, lv1 lv1Var, Context context, zzcgv zzcgvVar, xv1 xv1Var, xw1 xw1Var) {
        this.f18985a = kw1Var;
        this.f18986b = zw1Var;
        this.f18987c = lv1Var;
        this.f18989e = new jv1(context);
        this.f18991g = zzcgvVar.f32030p;
        this.f18988d = xv1Var;
        this.f18990f = xw1Var;
        zzt.zzs().zzg(this);
    }

    /* renamed from: p */
    private final synchronized JSONObject m21162p() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f18993i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (nv1 nv1Var : (List) entry.getValue()) {
                    if (nv1Var.m25021f()) {
                        jSONArray.put(nv1Var.m25018c());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    /* renamed from: q */
    private final void m21163q() {
        this.f19002r = true;
        this.f18988d.m28030c();
        this.f18985a.m24050b(this);
        this.f18986b.m28649c(this);
        this.f18987c.m24380c(this);
        this.f18990f.m28048d(this);
        m21169w(zzt.zzo().m22936h().zzo());
    }

    /* renamed from: r */
    private final void m21164r() {
        zzt.zzo().m22936h().zzG(m21173d());
    }

    /* renamed from: s */
    private final synchronized void m21165s(yv1 yv1Var, boolean z11) {
        try {
            if (this.f18999o == yv1Var) {
                return;
            }
            if (m21183n()) {
                m21167u();
            }
            this.f18999o = yv1Var;
            if (m21183n()) {
                m21168v();
            }
            if (z11) {
                m21164r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x000b, B:12:0x001d, B:15:0x002a, B:17:0x0039, B:23:0x002e, B:25:0x0034), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[DONT_GENERATE] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void m21166t(boolean z11, boolean z12) {
        try {
            if (this.f19000p == z11) {
                return;
            }
            this.f19000p = z11;
            if (z11) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
                    if (!zzt.zzs().zzl()) {
                    }
                }
                m21168v();
                if (!z12) {
                    m21164r();
                    return;
                }
                return;
            }
            if (!m21183n()) {
                m21167u();
            }
            if (!z12) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: u */
    private final synchronized void m21167u() {
        yv1 yv1Var = yv1.NONE;
        int ordinal = this.f18999o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.f18987c.m24378a();
            return;
        }
        this.f18986b.m28647a();
    }

    /* renamed from: v */
    private final synchronized void m21168v() {
        yv1 yv1Var = yv1.NONE;
        int ordinal = this.f18999o.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.f18987c.m24379b();
            return;
        }
        this.f18986b.m28648b();
    }

    /* renamed from: w */
    private final synchronized void m21169w(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            m21166t(jSONObject.optBoolean("isTestMode", false), false);
            m21165s(yv1.m28363b(jSONObject.optString("gesture", Image.SCALE_TYPE_NONE)), false);
            this.f18996l = jSONObject.optString("networkExtras", "{}");
            this.f18998n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final yv1 m21170a() {
        return this.f18999o;
    }

    /* renamed from: b */
    public final synchronized tc3 m21171b(String str) {
        pl0 pl0Var;
        try {
            pl0Var = new pl0();
            if (this.f18994j.containsKey(str)) {
                pl0Var.zzd((nv1) this.f18994j.get(str));
            } else {
                if (!this.f18995k.containsKey(str)) {
                    this.f18995k.put(str, new ArrayList());
                }
                ((List) this.f18995k.get(str)).add(pl0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return pl0Var;
    }

    /* renamed from: c */
    public final synchronized String m21172c() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && m21183n()) {
            if (this.f18998n < zzt.zzB().mo105913a() / 1000) {
                this.f18996l = "{}";
                this.f18998n = Long.MAX_VALUE;
                return "";
            }
            if (this.f18996l.equals("{}")) {
                return "";
            }
            return this.f18996l;
        }
        return "";
    }

    /* renamed from: d */
    public final synchronized String m21173d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f19000p);
            jSONObject.put("gesture", this.f18999o);
            if (this.f18998n > zzt.zzB().mo105913a() / 1000) {
                jSONObject.put("networkExtras", this.f18996l);
                jSONObject.put("networkExtrasExpirationSecs", this.f18998n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: e */
    public final synchronized JSONObject m21174e() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                jSONObject.put("sdkVersion", this.f18992h);
                jSONObject.put("internalSdkVersion", this.f18991g);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f18988d.m28029a());
                if (this.f18998n < zzt.zzB().mo105913a() / 1000) {
                    this.f18996l = "{}";
                }
                jSONObject.put("networkExtras", this.f18996l);
                jSONObject.put("adSlots", m21162p());
                jSONObject.put("appInfo", this.f18989e.m23758a());
                String m20555c = zzt.zzo().m22936h().zzh().m20555c();
                if (!TextUtils.isEmpty(m20555c)) {
                    jSONObject.put("cld", new JSONObject(m20555c));
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21139U7)).booleanValue() && !TextUtils.isEmpty(this.f18997m)) {
                    yk0.zze("Policy violation data: " + this.f18997m);
                    jSONObject.put("policyViolations", new JSONObject(this.f18997m));
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
                    jSONObject.put("openAction", this.f19003s);
                    jSONObject.put("gesture", this.f18999o);
                }
            } catch (JSONException e11) {
                zzt.zzo().m22944s(e11, "Inspector.toJson");
                yk0.zzk("Ad inspector encountered an error", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final synchronized void m21175f(String str, nv1 nv1Var) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && m21183n()) {
            if (this.f19001q >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20999G7)).intValue()) {
                yk0.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f18993i.containsKey(str)) {
                this.f18993i.put(str, new ArrayList());
            }
            this.f19001q++;
            ((List) this.f18993i.get(str)).add(nv1Var);
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
                return;
            }
            String m25017b = nv1Var.m25017b();
            this.f18994j.put(m25017b, nv1Var);
            if (this.f18995k.containsKey(m25017b)) {
                List list = (List) this.f18995k.get(m25017b);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((pl0) it.next()).zzd(nv1Var);
                }
                list.clear();
            }
        }
    }

    /* renamed from: g */
    public final void m21176g() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue() && zzt.zzo().m22936h().zzO()) {
            m21163q();
            return;
        }
        String zzo = zzt.zzo().m22936h().zzo();
        if (TextUtils.isEmpty(zzo)) {
            return;
        }
        try {
            if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                m21163q();
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: h */
    public final synchronized void m21177h(zzcy zzcyVar, bw1 bw1Var) {
        if (!m21183n()) {
            try {
                zzcyVar.zze(cs2.m20999d(18, null, null));
                return;
            } catch (RemoteException unused) {
                yk0.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
            try {
                zzcyVar.zze(cs2.m20999d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                yk0.zzj("Ad inspector had an internal error.");
                return;
            }
        } else {
            this.f19003s = bw1Var;
            this.f18985a.m24052d(zzcyVar, new d40(this), new o40(this.f18990f));
            return;
        }
    }

    /* renamed from: i */
    public final synchronized void m21178i(String str, long j11) {
        this.f18996l = str;
        this.f18998n = j11;
        m21164r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:            if (r2 != false) goto L24;     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21179j(boolean z11) {
        if (!this.f19002r) {
            if (z11) {
                m21163q();
                if (!this.f19000p) {
                    m21168v();
                    return;
                }
            }
            if (!m21183n()) {
                m21167u();
            }
        }
    }

    /* renamed from: k */
    public final void m21180k(yv1 yv1Var) {
        m21165s(yv1Var, true);
    }

    /* renamed from: l */
    public final synchronized void m21181l(String str) {
        this.f18997m = str;
    }

    /* renamed from: m */
    public final void m21182m(boolean z11) {
        if (!this.f19002r && z11) {
            m21163q();
        }
        m21166t(z11, true);
    }

    /* renamed from: n */
    public final synchronized boolean m21183n() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21129T7)).booleanValue()) {
            if (!this.f19000p && !zzt.zzs().zzl()) {
                return false;
            }
            return true;
        }
        return this.f19000p;
    }

    /* renamed from: o */
    public final synchronized boolean m21184o() {
        return this.f19000p;
    }
}

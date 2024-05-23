package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p148f3.C18710b;

/* loaded from: classes2.dex */
public final class ym1 {

    /* renamed from: a */
    private final Context f31021a;

    /* renamed from: b */
    private final gm1 f31022b;

    /* renamed from: c */
    private final C4830od f31023c;

    /* renamed from: d */
    private final zzcgv f31024d;

    /* renamed from: e */
    private final zza f31025e;

    /* renamed from: f */
    private final C4808ns f31026f;

    /* renamed from: g */
    private final Executor f31027g;

    /* renamed from: h */
    private final zzbls f31028h;

    /* renamed from: i */
    private final rn1 f31029i;

    /* renamed from: j */
    private final jq1 f31030j;

    /* renamed from: k */
    private final ScheduledExecutorService f31031k;

    /* renamed from: l */
    private final dp1 f31032l;

    /* renamed from: m */
    private final dt1 f31033m;

    /* renamed from: n */
    private final rv2 f31034n;

    /* renamed from: o */
    private final ox2 f31035o;

    /* renamed from: p */
    private final n22 f31036p;

    public ym1(Context context, gm1 gm1Var, C4830od c4830od, zzcgv zzcgvVar, zza zzaVar, C4808ns c4808ns, Executor executor, dr2 dr2Var, rn1 rn1Var, jq1 jq1Var, ScheduledExecutorService scheduledExecutorService, dt1 dt1Var, rv2 rv2Var, ox2 ox2Var, n22 n22Var, dp1 dp1Var) {
        this.f31021a = context;
        this.f31022b = gm1Var;
        this.f31023c = c4830od;
        this.f31024d = zzcgvVar;
        this.f31025e = zzaVar;
        this.f31026f = c4808ns;
        this.f31027g = executor;
        this.f31028h = dr2Var.f19403i;
        this.f31029i = rn1Var;
        this.f31030j = jq1Var;
        this.f31031k = scheduledExecutorService;
        this.f31033m = dt1Var;
        this.f31034n = rv2Var;
        this.f31035o = ox2Var;
        this.f31036p = n22Var;
        this.f31032l = dp1Var;
    }

    /* renamed from: i */
    public static final zzef m28249i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m28258r(optJSONObject);
    }

    /* renamed from: j */
    public static final List m28250j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return c83.m20832w();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                zzef m28258r = m28258r(optJSONArray.optJSONObject(i11));
                if (m28258r != null) {
                    arrayList.add(m28258r);
                }
            }
            return c83.m20830u(arrayList);
        }
        return c83.m20832w();
    }

    /* renamed from: k */
    private final zzq m28251k(int i11, int i12) {
        if (i11 == 0) {
            if (i12 != 0) {
                i11 = 0;
            } else {
                return zzq.zzc();
            }
        }
        return new zzq(this.f31021a, new AdSize(i11, i12));
    }

    /* renamed from: l */
    private static tc3 m28252l(tc3 tc3Var, Object obj) {
        return kc3.m23875g(tc3Var, Exception.class, new qb3(null) { // from class: com.google.android.gms.internal.ads.vm1
            public /* synthetic */ vm1(Object obj2) {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj2) {
                zze.zzb("Error during loading assets.", (Exception) obj2);
                return kc3.m23877i(null);
            }
        }, kl0.f23368f);
    }

    /* renamed from: m */
    private static tc3 m28253m(boolean z11, tc3 tc3Var, Object obj) {
        if (z11) {
            return kc3.m23882n(tc3Var, new qb3() { // from class: com.google.android.gms.internal.ads.tm1
                public /* synthetic */ tm1() {
                }

                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj2) {
                    tc3 tc3Var2 = tc3.this;
                    if (obj2 != null) {
                        return tc3Var2;
                    }
                    return kc3.m23876h(new zzekr(1, "Retrieve required value in native ad response failed."));
                }
            }, kl0.f23368f);
        }
        return m28252l(tc3Var, null);
    }

    /* renamed from: n */
    private final tc3 m28254n(JSONObject jSONObject, boolean z11) {
        if (jSONObject == null) {
            return kc3.m23877i(null);
        }
        String optString = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        if (TextUtils.isEmpty(optString)) {
            return kc3.m23877i(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z11) {
            return kc3.m23877i(new BinderC5150wz(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m28253m(jSONObject.optBoolean("require"), kc3.m23881m(this.f31022b.m22472b(optString, optDouble, optBoolean), new y43() { // from class: com.google.android.gms.internal.ads.wm1

            /* renamed from: a */
            public final /* synthetic */ String f30010a;

            /* renamed from: b */
            public final /* synthetic */ double f30011b;

            /* renamed from: c */
            public final /* synthetic */ int f30012c;

            /* renamed from: d */
            public final /* synthetic */ int f30013d;

            public /* synthetic */ wm1(String optString2, double optDouble2, int optInt3, int optInt22) {
                r1 = optString2;
                r2 = optDouble2;
                r4 = optInt3;
                r5 = optInt22;
            }

            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                String str = r1;
                return new BinderC5150wz(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), r2, r4, r5);
            }
        }, this.f31027g), null);
    }

    /* renamed from: o */
    private final tc3 m28255o(JSONArray jSONArray, boolean z11, boolean z12) {
        int i11;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z12) {
                i11 = jSONArray.length();
            } else {
                i11 = 1;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(m28254n(jSONArray.optJSONObject(i12), z11));
            }
            return kc3.m23881m(kc3.m23873e(arrayList), um1.f28987a, this.f31027g);
        }
        return kc3.m23877i(Collections.emptyList());
    }

    /* renamed from: p */
    private final tc3 m28256p(JSONObject jSONObject, iq2 iq2Var, lq2 lq2Var) {
        tc3 m26139b = this.f31029i.m26139b(jSONObject.optString("base_url"), jSONObject.optString("html"), iq2Var, lq2Var, m28251k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return kc3.m23882n(m26139b, new qb3() { // from class: com.google.android.gms.internal.ads.xm1
            public /* synthetic */ xm1() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                tc3 tc3Var = tc3.this;
                zq0 zq0Var = (zq0) obj;
                if (zq0Var != null && zq0Var.zzs() != null) {
                    return tc3Var;
                }
                throw new zzekr(1, "Retrieve video view in html5 ad response failed.");
            }
        }, kl0.f23368f);
    }

    /* renamed from: q */
    private static Integer m28257q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(C7962g.f43287r), jSONObject2.getInt(C18710b.f94009e)));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static final zzef m28258r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzef(optString, optString2);
    }

    /* renamed from: a */
    public final /* synthetic */ BinderC5075uz m28259a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer m28257q = m28257q(jSONObject, "bg_color");
        Integer m28257q2 = m28257q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new BinderC5075uz(optString, list, m28257q, m28257q2, num, optInt3 + optInt2, this.f31028h.f31898t, optBoolean);
    }

    /* renamed from: b */
    public final /* synthetic */ tc3 m28260b(zzq zzqVar, iq2 iq2Var, lq2 lq2Var, String str, String str2, Object obj) {
        zq0 m23723a = this.f31030j.m23723a(zzqVar, iq2Var, lq2Var);
        ol0 m25206c = ol0.m25206c(m23723a);
        ap1 m21520b = this.f31032l.m21520b();
        m23723a.zzP().mo23372i0(m21520b, m21520b, m21520b, m21520b, m21520b, false, null, new zzb(this.f31021a, null, null), null, null, this.f31036p, this.f31035o, this.f31033m, this.f31034n, null, m21520b, null, null);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21124T2)).booleanValue()) {
            m23723a.mo26687S("/getNativeAdViewSignals", b40.f17570s);
        }
        m23723a.mo26687S("/getNativeClickMeta", b40.f17571t);
        m23723a.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.sm1
            public /* synthetic */ sm1() {
            }

            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                ol0 ol0Var = ol0.this;
                if (z11) {
                    ol0Var.m25207d();
                } else {
                    ol0Var.zze(new zzekr(1, "Image Web View failed to load."));
                }
            }
        });
        m23723a.mo26703p0(str, str2, null);
        return m25206c;
    }

    /* renamed from: c */
    public final /* synthetic */ tc3 m28261c(String str, Object obj) {
        zzt.zzz();
        zq0 m24980a = nr0.m24980a(this.f31021a, ps0.m25531a(), "native-omid", false, false, this.f31023c, null, this.f31024d, null, null, this.f31025e, this.f31026f, null, null);
        ol0 m25206c = ol0.m25206c(m24980a);
        m24980a.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.om1
            public /* synthetic */ om1() {
            }

            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                ol0.this.m25207d();
            }
        });
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21281j4)).booleanValue()) {
            m24980a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            m24980a.loadData(str, "text/html", "UTF-8");
        }
        return m25206c;
    }

    /* renamed from: d */
    public final tc3 m28262d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return kc3.m23877i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m28253m(optJSONObject.optBoolean("require"), kc3.m23881m(m28255o(optJSONArray, false, true), new y43() { // from class: com.google.android.gms.internal.ads.pm1

            /* renamed from: b */
            public final /* synthetic */ JSONObject f26254b;

            public /* synthetic */ pm1(JSONObject optJSONObject3) {
                r2 = optJSONObject3;
            }

            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return ym1.this.m28259a(r2, (List) obj);
            }
        }, this.f31027g), null);
    }

    /* renamed from: e */
    public final tc3 m28263e(JSONObject jSONObject, String str) {
        return m28254n(jSONObject.optJSONObject(str), this.f31028h.f31895q);
    }

    /* renamed from: f */
    public final tc3 m28264f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbls zzblsVar = this.f31028h;
        return m28255o(optJSONArray, zzblsVar.f31895q, zzblsVar.f31897s);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.qm1.<init>(com.google.android.gms.internal.ads.ym1, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.internal.ads.iq2, com.google.android.gms.internal.ads.lq2, java.lang.String, java.lang.String):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: g */
    public final com.google.android.gms.internal.ads.tc3 m28265g(org.json.JSONObject r10, java.lang.String r11, com.google.android.gms.internal.ads.iq2 r12, com.google.android.gms.internal.ads.lq2 r13) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.xw r11 = com.google.android.gms.internal.ads.AbstractC4554gx.f21295k8
            com.google.android.gms.internal.ads.ex r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r11 = r0.m21823b(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r0 = 0
            if (r11 != 0) goto L18
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r0)
            return r10
        L18:
            java.lang.String r11 = "images"
            org.json.JSONArray r10 = r10.optJSONArray(r11)
            if (r10 == 0) goto L79
            int r11 = r10.length()
            if (r11 > 0) goto L27
            goto L79
        L27:
            r11 = 0
            org.json.JSONObject r10 = r10.optJSONObject(r11)
            if (r10 != 0) goto L33
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r0)
            return r10
        L33:
            java.lang.String r1 = "base_url"
            java.lang.String r7 = r10.optString(r1)
            java.lang.String r1 = "html"
            java.lang.String r8 = r10.optString(r1)
            java.lang.String r1 = "width"
            int r1 = r10.optInt(r1, r11)
            java.lang.String r2 = "height"
            int r10 = r10.optInt(r2, r11)
            com.google.android.gms.ads.internal.client.zzq r4 = r9.m28251k(r1, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L5a
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r0)
            return r10
        L5a:
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r0)
            com.google.android.gms.internal.ads.qm1 r11 = new com.google.android.gms.internal.ads.qm1
            r2 = r11
            r3 = r9
            r5 = r12
            r6 = r13
            r2.<init>()
            com.google.android.gms.internal.ads.uc3 r12 = com.google.android.gms.internal.ads.kl0.f23367e
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23882n(r10, r11, r12)
            com.google.android.gms.internal.ads.rm1 r11 = new com.google.android.gms.internal.ads.rm1
            r11.<init>()
            com.google.android.gms.internal.ads.uc3 r12 = com.google.android.gms.internal.ads.kl0.f23368f
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23882n(r10, r11, r12)
            return r10
        L79:
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ym1.m28265g(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.iq2, com.google.android.gms.internal.ads.lq2):com.google.android.gms.internal.ads.tc3");
    }

    /* renamed from: h */
    public final tc3 m28266h(JSONObject jSONObject, iq2 iq2Var, lq2 lq2Var) {
        tc3 m26138a;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return kc3.m23877i(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z11 = false;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21285j8)).booleanValue() && optJSONObject.has("html")) {
                z11 = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z11) {
                    yk0.zzj("Required field 'vast_xml' or 'html' is missing");
                    return kc3.m23877i(null);
                }
            } else if (!z11) {
                m26138a = this.f31029i.m26138a(optJSONObject);
                return m28252l(kc3.m23883o(m26138a, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21134U2)).intValue(), TimeUnit.SECONDS, this.f31031k), null);
            }
            m26138a = m28256p(optJSONObject, iq2Var, lq2Var);
            return m28252l(kc3.m23883o(m26138a, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21134U2)).intValue(), TimeUnit.SECONDS, this.f31031k), null);
        }
        return m28256p(zzg, iq2Var, lq2Var);
    }
}

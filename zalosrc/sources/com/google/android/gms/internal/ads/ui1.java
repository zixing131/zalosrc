package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20295p;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class ui1 implements dk1 {

    /* renamed from: A */
    private zzcq f28921A;

    /* renamed from: a */
    private final Context f28922a;

    /* renamed from: b */
    private final hk1 f28923b;

    /* renamed from: c */
    private final JSONObject f28924c;

    /* renamed from: d */
    private final xo1 f28925d;

    /* renamed from: e */
    private final vj1 f28926e;

    /* renamed from: f */
    private final C4830od f28927f;

    /* renamed from: g */
    private final o81 f28928g;

    /* renamed from: h */
    private final t71 f28929h;

    /* renamed from: i */
    private final nf1 f28930i;

    /* renamed from: j */
    private final iq2 f28931j;

    /* renamed from: k */
    private final zzcgv f28932k;

    /* renamed from: l */
    private final dr2 f28933l;

    /* renamed from: m */
    private final yz0 f28934m;

    /* renamed from: n */
    private final zk1 f28935n;

    /* renamed from: o */
    private final InterfaceC20285f f28936o;

    /* renamed from: p */
    private final kf1 f28937p;

    /* renamed from: q */
    private final ox2 f28938q;

    /* renamed from: r */
    private final vw2 f28939r;

    /* renamed from: t */
    private boolean f28941t;

    /* renamed from: s */
    private boolean f28940s = false;

    /* renamed from: u */
    private boolean f28942u = false;

    /* renamed from: v */
    private boolean f28943v = false;

    /* renamed from: w */
    private Point f28944w = new Point();

    /* renamed from: x */
    private Point f28945x = new Point();

    /* renamed from: y */
    private long f28946y = 0;

    /* renamed from: z */
    private long f28947z = 0;

    public ui1(Context context, hk1 hk1Var, JSONObject jSONObject, xo1 xo1Var, vj1 vj1Var, C4830od c4830od, o81 o81Var, t71 t71Var, nf1 nf1Var, iq2 iq2Var, zzcgv zzcgvVar, dr2 dr2Var, yz0 yz0Var, zk1 zk1Var, InterfaceC20285f interfaceC20285f, kf1 kf1Var, ox2 ox2Var, vw2 vw2Var) {
        this.f28922a = context;
        this.f28923b = hk1Var;
        this.f28924c = jSONObject;
        this.f28925d = xo1Var;
        this.f28926e = vj1Var;
        this.f28927f = c4830od;
        this.f28928g = o81Var;
        this.f28929h = t71Var;
        this.f28930i = nf1Var;
        this.f28931j = iq2Var;
        this.f28932k = zzcgvVar;
        this.f28933l = dr2Var;
        this.f28934m = yz0Var;
        this.f28935n = zk1Var;
        this.f28936o = interfaceC20285f;
        this.f28937p = kf1Var;
        this.f28938q = ox2Var;
        this.f28939r = vw2Var;
    }

    /* renamed from: b */
    private final String m26973b(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int m27242K = this.f28926e.m27242K();
        if (m27242K != 1) {
            if (m27242K != 2) {
                if (m27242K != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    /* renamed from: c */
    private final boolean m26974c(String str) {
        JSONObject optJSONObject = this.f28924c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final boolean m26975d() {
        return this.f28924c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: e */
    private final boolean m26976e(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z11) {
        AbstractC4205o.m19717f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f28924c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21014I2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z11);
            Context context = this.f28922a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzaw.zzb().m26117d(context, zzr.widthPixels));
                jSONObject7.put("height", zzaw.zzb().m26117d(context, zzr.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21314m7)).booleanValue()) {
                this.f28925d.m27958i("/clickRecorded", new ri1(this, null));
            } else {
                this.f28925d.m27958i("/logScionEvent", new pi1(this, null));
            }
            this.f28925d.m27958i("/nativeImpression", new ti1(this, null));
            nl0.m24944a(this.f28925d.m27953d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.f28940s) {
                this.f28940s = zzt.zzs().zzn(this.f28922a, this.f28932k.f32030p, this.f28931j.f22290D.toString(), this.f28933l.f19400f);
                return true;
            }
            return true;
        } catch (JSONException e11) {
            yk0.zzh("Unable to create impression JSON.", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: A */
    public final void mo21432A(Bundle bundle) {
        String str;
        if (bundle == null) {
            yk0.zze("Click data is null. No click is reported.");
            return;
        }
        if (!m26974c("click_reporting")) {
            yk0.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        if (bundle2 != null) {
            str = bundle2.getString("asset_id");
        } else {
            str = null;
        }
        m26980i(null, null, null, null, null, str, null, zzaw.zzb().m26121l(bundle, null), false, false);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: B */
    public final void mo21433B(zzcu zzcuVar) {
        try {
            if (this.f28942u) {
                return;
            }
            if (zzcuVar == null) {
                vj1 vj1Var = this.f28926e;
                if (vj1Var.m27250S() != null) {
                    this.f28942u = true;
                    this.f28938q.m25355c(vj1Var.m27250S().zzf(), this.f28939r);
                    zzf();
                    return;
                }
            }
            this.f28942u = true;
            this.f28938q.m25355c(zzcuVar.zzf(), this.f28939r);
            zzf();
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: C */
    public final void mo21434C(f20 f20Var) {
        if (!this.f28924c.optBoolean("custom_one_point_five_click_enabled", false)) {
            yk0.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f28935n.m28536c(f20Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: D */
    public final void mo21435D(View view, MotionEvent motionEvent, View view2) {
        this.f28944w = zzbx.zza(motionEvent, view2);
        long mo105913a = this.f28936o.mo105913a();
        this.f28947z = mo105913a;
        if (motionEvent.getAction() == 0) {
            this.f28946y = mo105913a;
            this.f28945x = this.f28944w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f28944w;
        obtain.setLocation(point.x, point.y);
        this.f28927f.m25161d(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: E */
    public final void mo21436E(String str) {
        m26980i(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: F */
    public final void mo21437F(View view, View view2, Map map, Map map2, boolean z11) {
        View view3;
        JSONObject zzd = zzbx.zzd(this.f28922a, map, map2, view2);
        JSONObject zzg = zzbx.zzg(this.f28922a, view2);
        JSONObject zzf = zzbx.zzf(view2);
        JSONObject zze = zzbx.zze(this.f28922a, view2);
        String m26973b = m26973b(view, map);
        JSONObject zzc = zzbx.zzc(m26973b, this.f28922a, this.f28945x, this.f28944w);
        if (true == ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21034K2)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        m26980i(view3, zzg, zzd, zzf, zze, m26973b, zzc, null, z11, false);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: G */
    public final void mo21438G(View view, Map map, Map map2) {
        String zzh;
        JSONObject zzd = zzbx.zzd(this.f28922a, map, map2, view);
        JSONObject zzg = zzbx.zzg(this.f28922a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.f28922a, view);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21014I2)).booleanValue()) {
            try {
                zzh = this.f28927f.m25160c().zzh(this.f28922a, view, null);
            } catch (Exception unused) {
                yk0.zzg("Exception getting data.");
            }
            m26976e(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.f28922a, this.f28931j));
        }
        zzh = null;
        m26976e(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.f28922a, this.f28931j));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: H */
    public final void mo21439H(View view, Map map) {
        this.f28944w = new Point();
        this.f28945x = new Point();
        if (view != null) {
            this.f28937p.m23937C0(view);
        }
        this.f28941t = false;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: I */
    public final void mo21440I(View view, Map map, Map map2, boolean z11) {
        if (!this.f28943v) {
            yk0.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!m26975d()) {
            yk0.zze("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject zzd = zzbx.zzd(this.f28922a, map, map2, view);
        JSONObject zzg = zzbx.zzg(this.f28922a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.f28922a, view);
        String m26973b = m26973b(null, map);
        m26980i(view, zzg, zzd, zzf, zze, m26973b, zzbx.zzc(m26973b, this.f28922a, this.f28945x, this.f28944w), null, z11, true);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: J */
    public final JSONObject mo21441J(View view, Map map, Map map2) {
        JSONObject zzd = zzbx.zzd(this.f28922a, map, map2, view);
        JSONObject zzg = zzbx.zzg(this.f28922a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.f28922a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e11) {
            yk0.zzh("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: K */
    public final void mo21442K(zzcq zzcqVar) {
        this.f28921A = zzcqVar;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: L */
    public final void mo21443L(View view) {
        if (!this.f28924c.optBoolean("custom_one_point_five_click_enabled", false)) {
            yk0.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zk1 zk1Var = this.f28935n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zk1Var);
        view.setClickable(true);
        zk1Var.f31548v = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: M */
    public final void mo21444M(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f28944w = new Point();
        this.f28945x = new Point();
        if (!this.f28941t) {
            this.f28937p.m23936B0(view);
            this.f28941t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f28934m.m28405g(this);
        boolean zzi = zzbx.zzi(this.f28932k.f32032r);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: N */
    public final boolean mo21445N(Bundle bundle) {
        if (!m26974c("impression_reporting")) {
            yk0.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m26976e(null, null, null, null, null, zzaw.zzb().m26121l(bundle, null), false);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: O */
    public final void mo21446O(Bundle bundle) {
        if (bundle == null) {
            yk0.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m26974c("touch_reporting")) {
            yk0.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f11 = bundle.getFloat("x");
        float f12 = bundle.getFloat("y");
        this.f28927f.m25160c().zzl((int) f11, (int) f12, bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: P */
    public final JSONObject mo21447P(View view, Map map, Map map2) {
        JSONObject mo21441J = mo21441J(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f28943v && m26975d()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (mo21441J != null) {
                jSONObject.put("nas", mo21441J);
            }
        } catch (JSONException e11) {
            yk0.zzh("Unable to create native click meta data JSON.", e11);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.dk1
    /* renamed from: a */
    public final void mo21448a() {
        this.f28943v = true;
    }

    /* renamed from: i */
    protected final void m26980i(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15;
        String str2;
        AbstractC4205o.m19717f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f28924c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z16 = false;
            if (this.f28923b.m22950c(this.f28926e.m27270g0()) != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            jSONObject7.put("has_custom_click_handler", z13);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f28926e.m27242K());
            jSONObject8.put("view_aware_api_used", z11);
            zzbls zzblsVar = this.f28933l.f19403i;
            if (zzblsVar != null && zzblsVar.f31900v) {
                z14 = true;
            } else {
                z14 = false;
            }
            jSONObject8.put("custom_mute_requested", z14);
            if (!this.f28926e.m27267f().isEmpty() && this.f28926e.m27250S() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            jSONObject8.put("custom_mute_enabled", z15);
            if (this.f28935n.m28534a() != null && this.f28924c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f28936o.mo105913a());
            if (this.f28943v && m26975d()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z12) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f28923b.m22950c(this.f28926e.m27270g0()) != null) {
                z16 = true;
            }
            jSONObject8.put("has_custom_click_handler", z16);
            try {
                JSONObject optJSONObject = this.f28924c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f28927f.m25160c().zze(this.f28922a, optJSONObject.optString("click_string"), view);
            } catch (Exception e11) {
                yk0.zzh("Exception obtaining click signals", e11);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21035K3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21354q7)).booleanValue() && AbstractC20295p.m105958l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21364r7)).booleanValue() && AbstractC20295p.m105958l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long mo105913a = this.f28936o.mo105913a();
            jSONObject9.put("time_from_last_touch_down", mo105913a - this.f28946y);
            jSONObject9.put("time_from_last_touch", mo105913a - this.f28947z);
            jSONObject7.put("touch_signal", jSONObject9);
            nl0.m24944a(this.f28925d.m27953d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e12) {
            yk0.zzh("Unable to create click JSON.", e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzf() {
        try {
            zzcq zzcqVar = this.f28921A;
            if (zzcqVar != null) {
                zzcqVar.zze();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzg() {
        if (!this.f28924c.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.f28935n.m28535b();
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzh() {
        this.f28925d.m27955f();
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzo() {
        AbstractC4205o.m19717f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f28924c);
            nl0.m24944a(this.f28925d.m27953d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzq() {
        m26976e(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final boolean zzz() {
        return m26975d();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.AbstractC1579n0;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p227i3.C20217u;
import p229i5.InterfaceC20296q;

/* loaded from: classes2.dex */
public abstract class ir0 extends WebViewClient implements ns0 {

    /* renamed from: R */
    public static final /* synthetic */ int f22355R = 0;

    /* renamed from: A */
    private boolean f22356A;

    /* renamed from: B */
    private boolean f22357B;

    /* renamed from: C */
    private boolean f22358C;

    /* renamed from: D */
    private boolean f22359D;

    /* renamed from: E */
    private boolean f22360E;

    /* renamed from: F */
    private zzz f22361F;

    /* renamed from: G */
    private pc0 f22362G;

    /* renamed from: H */
    private zzb f22363H;

    /* renamed from: I */
    private jc0 f22364I;

    /* renamed from: J */
    protected yh0 f22365J;

    /* renamed from: K */
    private ox2 f22366K;

    /* renamed from: L */
    private boolean f22367L;

    /* renamed from: M */
    private boolean f22368M;

    /* renamed from: N */
    private int f22369N;

    /* renamed from: O */
    private boolean f22370O;

    /* renamed from: P */
    private final HashSet f22371P;

    /* renamed from: Q */
    private View.OnAttachStateChangeListener f22372Q;

    /* renamed from: p */
    private final zq0 f22373p;

    /* renamed from: q */
    private final C4808ns f22374q;

    /* renamed from: r */
    private final HashMap f22375r;

    /* renamed from: s */
    private final Object f22376s;

    /* renamed from: t */
    private zza f22377t;

    /* renamed from: u */
    private zzo f22378u;

    /* renamed from: v */
    private ls0 f22379v;

    /* renamed from: w */
    private ms0 f22380w;

    /* renamed from: x */
    private x20 f22381x;

    /* renamed from: y */
    private z20 f22382y;

    /* renamed from: z */
    private pf1 f22383z;

    public ir0(zq0 zq0Var, C4808ns c4808ns, boolean z11) {
        pc0 pc0Var = new pc0(zq0Var, zq0Var.mo26694e(), new C4887pw(zq0Var.getContext()));
        this.f22375r = new HashMap();
        this.f22376s = new Object();
        this.f22374q = c4808ns;
        this.f22373p = zq0Var;
        this.f22358C = z11;
        this.f22362G = pc0Var;
        this.f22364I = null;
        this.f22371P = new HashSet(Arrays.asList(((String) zzay.zzc().m21823b(AbstractC4554gx.f21026J4)).split(",")));
    }

    /* renamed from: G */
    private static final boolean m23346G(boolean z11, zq0 zq0Var) {
        if (z11 && !zq0Var.mo22517p().m25539i() && !zq0Var.mo26685P().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static WebResourceResponse m23349n() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20962D0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* renamed from: o */
    private final WebResourceResponse m23350o(String str, Map map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i11 = 0;
            while (true) {
                i11++;
                if (i11 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.zzp().zze(this.f22373p.getContext(), this.f22373p.zzp().f32030p, false, httpURLConnection, false, 60000);
                        xk0 xk0Var = new xk0(null);
                        xk0Var.m27911c(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        xk0Var.m27913e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                yk0.zzj("Protocol is null");
                                WebResourceResponse m23349n = m23349n();
                                TrafficStats.clearThreadStatsTag();
                                return m23349n;
                            }
                            if (!protocol.equals("http") && !protocol.equals("https")) {
                                yk0.zzj("Unsupported scheme: " + protocol);
                                WebResourceResponse m23349n2 = m23349n();
                                TrafficStats.clearThreadStatsTag();
                                return m23349n2;
                            }
                            yk0.zze("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.zzp();
            WebResourceResponse zzM = zzs.zzM(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return zzM;
        } catch (Throwable th2) {
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    /* renamed from: r */
    public final void m23351r(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((c40) it.next()).mo19973a(this.f22373p, map);
        }
    }

    /* renamed from: t */
    private final void m23352t() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f22372Q;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f22373p).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* renamed from: z */
    public final void m23353z(View view, yh0 yh0Var, int i11) {
        if (yh0Var.zzi() && i11 > 0) {
            yh0Var.mo26963b(view);
            if (yh0Var.zzi()) {
                zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.cr0

                    /* renamed from: q */
                    public final /* synthetic */ View f18529q;

                    /* renamed from: r */
                    public final /* synthetic */ yh0 f18530r;

                    /* renamed from: s */
                    public final /* synthetic */ int f18531s;

                    public /* synthetic */ cr0(View view2, yh0 yh0Var2, int i112) {
                        r2 = view2;
                        r3 = yh0Var2;
                        r4 = i112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ir0.this.m23379n0(r2, r3, r4);
                    }
                }, 100L);
            }
        }
    }

    /* renamed from: B0 */
    public final void m23354B0(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z11;
        zzc zzcVar;
        jc0 jc0Var = this.f22364I;
        if (jc0Var != null) {
            z11 = jc0Var.m23600l();
        } else {
            z11 = false;
        }
        zzt.zzi();
        zzm.zza(this.f22373p.getContext(), adOverlayInfoParcel, !z11);
        yh0 yh0Var = this.f22365J;
        if (yh0Var != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            yh0Var.zzh(str);
        }
    }

    /* renamed from: C0 */
    public final void m23355C0(boolean z11, int i11, String str, boolean z12) {
        zza zzaVar;
        fr0 fr0Var;
        pf1 pf1Var;
        boolean mo26680M = this.f22373p.mo26680M();
        boolean m23346G = m23346G(mo26680M, this.f22373p);
        boolean z13 = true;
        if (!m23346G && z12) {
            z13 = false;
        }
        if (m23346G) {
            zzaVar = null;
        } else {
            zzaVar = this.f22377t;
        }
        if (mo26680M) {
            fr0Var = null;
        } else {
            fr0Var = new fr0(this.f22373p, this.f22378u);
        }
        x20 x20Var = this.f22381x;
        z20 z20Var = this.f22382y;
        zzz zzzVar = this.f22361F;
        zq0 zq0Var = this.f22373p;
        zzcgv zzp = zq0Var.zzp();
        if (z13) {
            pf1Var = null;
        } else {
            pf1Var = this.f22383z;
        }
        m23354B0(new AdOverlayInfoParcel(zzaVar, fr0Var, x20Var, z20Var, zzzVar, zq0Var, z11, i11, str, zzp, pf1Var));
    }

    /* renamed from: D0 */
    public final void m23356D0(boolean z11, int i11, String str, String str2, boolean z12) {
        zza zzaVar;
        fr0 fr0Var;
        pf1 pf1Var;
        boolean mo26680M = this.f22373p.mo26680M();
        boolean m23346G = m23346G(mo26680M, this.f22373p);
        boolean z13 = true;
        if (!m23346G && z12) {
            z13 = false;
        }
        if (m23346G) {
            zzaVar = null;
        } else {
            zzaVar = this.f22377t;
        }
        if (mo26680M) {
            fr0Var = null;
        } else {
            fr0Var = new fr0(this.f22373p, this.f22378u);
        }
        x20 x20Var = this.f22381x;
        z20 z20Var = this.f22382y;
        zzz zzzVar = this.f22361F;
        zq0 zq0Var = this.f22373p;
        zzcgv zzp = zq0Var.zzp();
        if (z13) {
            pf1Var = null;
        } else {
            pf1Var = this.f22383z;
        }
        m23354B0(new AdOverlayInfoParcel(zzaVar, fr0Var, x20Var, z20Var, zzzVar, zq0Var, z11, i11, str, str2, zzp, pf1Var));
    }

    /* renamed from: E0 */
    public final void m23357E0(String str, c40 c40Var) {
        synchronized (this.f22376s) {
            try {
                List list = (List) this.f22375r.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    this.f22375r.put(str, list);
                }
                list.add(c40Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: F */
    public final void mo23358F(ls0 ls0Var) {
        this.f22379v = ls0Var;
    }

    /* renamed from: F0 */
    public final void m23359F0() {
        yh0 yh0Var = this.f22365J;
        if (yh0Var != null) {
            yh0Var.zze();
            this.f22365J = null;
        }
        m23352t();
        synchronized (this.f22376s) {
            try {
                this.f22375r.clear();
                this.f22377t = null;
                this.f22378u = null;
                this.f22379v = null;
                this.f22380w = null;
                this.f22381x = null;
                this.f22382y = null;
                this.f22356A = false;
                this.f22358C = false;
                this.f22359D = false;
                this.f22361F = null;
                this.f22363H = null;
                this.f22362G = null;
                jc0 jc0Var = this.f22364I;
                if (jc0Var != null) {
                    jc0Var.m23596h(true);
                    this.f22364I = null;
                }
                this.f22366K = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: H */
    public final void mo23360H(boolean z11) {
        synchronized (this.f22376s) {
            this.f22360E = z11;
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: I */
    public final void mo23361I(int i11, int i12, boolean z11) {
        pc0 pc0Var = this.f22362G;
        if (pc0Var != null) {
            pc0Var.m25425h(i11, i12);
        }
        jc0 jc0Var = this.f22364I;
        if (jc0Var != null) {
            jc0Var.m23598j(i11, i12, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: J */
    public final void mo23362J(ms0 ms0Var) {
        this.f22380w = ms0Var;
    }

    /* renamed from: Q */
    public final ViewTreeObserver.OnGlobalLayoutListener m23363Q() {
        synchronized (this.f22376s) {
        }
        return null;
    }

    /* renamed from: V */
    public final ViewTreeObserver.OnScrollChangedListener m23364V() {
        synchronized (this.f22376s) {
        }
        return null;
    }

    /* renamed from: Y */
    public final WebResourceResponse m23365Y(String str, Map map) {
        zzbdy m27993b;
        try {
            if (((Boolean) AbstractC5260zy.f31718a.m24091e()).booleanValue() && this.f22366K != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.f22366K.m25355c(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String m22027c = fj0.m22027c(str, this.f22373p.getContext(), this.f22370O);
            if (!m22027c.equals(str)) {
                return m23350o(m22027c, map);
            }
            zzbeb m28705t = zzbeb.m28705t(Uri.parse(str));
            if (m28705t != null && (m27993b = zzt.zzc().m27993b(m28705t)) != null && m27993b.m28701M()) {
                return new WebResourceResponse("", "", m27993b.m28699J());
            }
            if (!xk0.m27903l() || !((Boolean) AbstractC5074uy.f29078b.m24091e()).booleanValue()) {
                return null;
            }
            return m23350o(str, map);
        } catch (Exception e11) {
            e = e11;
            zzt.zzo().m22945t(e, "AdWebViewClient.interceptRequest");
            return m23349n();
        } catch (NoClassDefFoundError e12) {
            e = e12;
            zzt.zzo().m22945t(e, "AdWebViewClient.interceptRequest");
            return m23349n();
        }
    }

    /* renamed from: a */
    public final void m23366a(boolean z11) {
        this.f22356A = false;
    }

    /* renamed from: b0 */
    public final void m23367b0() {
        if (this.f22379v != null && ((this.f22367L && this.f22369N <= 0) || this.f22368M || this.f22357B)) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && this.f22373p.zzo() != null) {
                AbstractC4813nx.m25029a(this.f22373p.zzo().m26788a(), this.f22373p.zzn(), "awfllc");
            }
            ls0 ls0Var = this.f22379v;
            boolean z11 = false;
            if (!this.f22368M && !this.f22357B) {
                z11 = true;
            }
            ls0Var.zza(z11);
            this.f22379v = null;
        }
        this.f22373p.mo26682N();
    }

    /* renamed from: c */
    public final void m23368c(String str, c40 c40Var) {
        synchronized (this.f22376s) {
            try {
                List list = (List) this.f22375r.get(str);
                if (list == null) {
                    return;
                }
                list.remove(c40Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m23369g(String str, InterfaceC20296q interfaceC20296q) {
        synchronized (this.f22376s) {
            try {
                List<c40> list = (List) this.f22375r.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c40 c40Var : list) {
                    if (interfaceC20296q.apply(c40Var)) {
                        arrayList.add(c40Var);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: h */
    public final boolean mo23370h() {
        boolean z11;
        synchronized (this.f22376s) {
            z11 = this.f22358C;
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: h0 */
    public final void mo23371h0(boolean z11) {
        synchronized (this.f22376s) {
            this.f22359D = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: i0 */
    public final void mo23372i0(zza zzaVar, x20 x20Var, zzo zzoVar, z20 z20Var, zzz zzzVar, boolean z11, f40 f40Var, zzb zzbVar, rc0 rc0Var, yh0 yh0Var, n22 n22Var, ox2 ox2Var, dt1 dt1Var, rv2 rv2Var, d40 d40Var, pf1 pf1Var, u40 u40Var, o40 o40Var) {
        zzb zzbVar2 = zzbVar == null ? new zzb(this.f22373p.getContext(), yh0Var, null) : zzbVar;
        this.f22364I = new jc0(this.f22373p, rc0Var);
        this.f22365J = yh0Var;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21042L0)).booleanValue()) {
            m23357E0("/adMetadata", new w20(x20Var));
        }
        if (z20Var != null) {
            m23357E0("/appEvent", new y20(z20Var));
        }
        m23357E0("/backButton", b40.f17561j);
        m23357E0("/refresh", b40.f17562k);
        m23357E0("/canOpenApp", b40.f17553b);
        m23357E0("/canOpenURLs", b40.f17552a);
        m23357E0("/canOpenIntents", b40.f17554c);
        m23357E0("/close", b40.f17555d);
        m23357E0("/customClose", b40.f17556e);
        m23357E0("/instrument", b40.f17565n);
        m23357E0("/delayPageLoaded", b40.f17567p);
        m23357E0("/delayPageClosed", b40.f17568q);
        m23357E0("/getLocationInfo", b40.f17569r);
        m23357E0("/log", b40.f17558g);
        m23357E0("/mraid", new j40(zzbVar2, this.f22364I, rc0Var));
        pc0 pc0Var = this.f22362G;
        if (pc0Var != null) {
            m23357E0("/mraidLoaded", pc0Var);
        }
        zzb zzbVar3 = zzbVar2;
        m23357E0("/open", new n40(zzbVar2, this.f22364I, n22Var, dt1Var, rv2Var));
        m23357E0("/precache", new lp0());
        m23357E0("/touch", b40.f17560i);
        m23357E0("/video", b40.f17563l);
        m23357E0("/videoMeta", b40.f17564m);
        if (n22Var != null && ox2Var != null) {
            m23357E0("/click", new c40() { // from class: com.google.android.gms.internal.ads.jr2

                /* renamed from: b */
                public final /* synthetic */ ox2 f22971b;

                /* renamed from: c */
                public final /* synthetic */ n22 f22972c;

                public /* synthetic */ jr2(ox2 ox2Var2, n22 n22Var2) {
                    r2 = ox2Var2;
                    r3 = n22Var2;
                }

                @Override // com.google.android.gms.internal.ads.c40
                /* renamed from: a */
                public final void mo19973a(Object obj, Map map) {
                    pf1 pf1Var2 = pf1.this;
                    ox2 ox2Var2 = r2;
                    n22 n22Var2 = r3;
                    zq0 zq0Var = (zq0) obj;
                    b40.m20396d(map, pf1Var2);
                    String str = (String) map.get(C20217u.f99970o);
                    if (str == null) {
                        yk0.zzj("URL missing from click GMSG.");
                    } else {
                        kc3.m23886r(b40.m20394b(zq0Var, str), new kr2(zq0Var, ox2Var2, n22Var2), kl0.f23363a);
                    }
                }
            });
            m23357E0("/httpTrack", new c40() { // from class: com.google.android.gms.internal.ads.ir2

                /* renamed from: b */
                public final /* synthetic */ n22 f22387b;

                public /* synthetic */ ir2(n22 n22Var2) {
                    r2 = n22Var2;
                }

                @Override // com.google.android.gms.internal.ads.c40
                /* renamed from: a */
                public final void mo19973a(Object obj, Map map) {
                    ox2 ox2Var2 = ox2.this;
                    n22 n22Var2 = r2;
                    qq0 qq0Var = (qq0) obj;
                    String str = (String) map.get(C20217u.f99970o);
                    if (str == null) {
                        yk0.zzj("URL missing from httpTrack GMSG.");
                    } else if (!qq0Var.mo25866b().f22334k0) {
                        ox2Var2.m25355c(str, null);
                    } else {
                        n22Var2.m24800d(new p22(zzt.zzB().mo105913a(), ((xr0) qq0Var).mo26710w().f24014b, str, 2));
                    }
                }
            });
        } else {
            m23357E0("/click", b40.m20393a(pf1Var));
            m23357E0("/httpTrack", b40.f17557f);
        }
        if (zzt.zzn().m21425z(this.f22373p.getContext())) {
            m23357E0("/logScionEvent", new i40(this.f22373p.getContext()));
        }
        if (f40Var != null) {
            m23357E0("/setInterstitialProperties", new e40(f40Var, null));
        }
        if (d40Var != null) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
                m23357E0("/inspectorNetworkExtras", d40Var);
            }
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21167X7)).booleanValue() && u40Var != null) {
            m23357E0("/shareSheet", u40Var);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue() && o40Var != null) {
            m23357E0("/inspectorOutOfContextTest", o40Var);
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21140U8)).booleanValue()) {
            m23357E0("/bindPlayStoreOverlay", b40.f17572u);
            m23357E0("/presentPlayStoreOverlay", b40.f17573v);
            m23357E0("/expandPlayStoreOverlay", b40.f17574w);
            m23357E0("/collapsePlayStoreOverlay", b40.f17575x);
            m23357E0("/closePlayStoreOverlay", b40.f17576y);
        }
        this.f22377t = zzaVar;
        this.f22378u = zzoVar;
        this.f22381x = x20Var;
        this.f22382y = z20Var;
        this.f22361F = zzzVar;
        this.f22363H = zzbVar3;
        this.f22383z = pf1Var;
        this.f22356A = z11;
        this.f22366K = ox2Var2;
    }

    /* renamed from: j */
    public final boolean m23373j() {
        boolean z11;
        synchronized (this.f22376s) {
            z11 = this.f22360E;
        }
        return z11;
    }

    /* renamed from: j0 */
    public final void m23374j0(boolean z11) {
        this.f22370O = z11;
    }

    /* renamed from: k */
    public final boolean m23375k() {
        boolean z11;
        synchronized (this.f22376s) {
            z11 = this.f22359D;
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.ns0
    /* renamed from: l */
    public final void mo23376l(int i11, int i12) {
        jc0 jc0Var = this.f22364I;
        if (jc0Var != null) {
            jc0Var.m23599k(i11, i12);
        }
    }

    /* renamed from: l0 */
    public final void m23377l0(Uri uri) {
        String str;
        String path = uri.getPath();
        List list = (List) this.f22375r.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21016I4)).booleanValue() && this.f22371P.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21036K4)).intValue()) {
                    zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    kc3.m23886r(zzt.zzp().zzb(uri), new er0(this, list, path, uri), kl0.f23367e);
                    return;
                }
            }
            zzt.zzp();
            m23351r(zzs.zzL(uri), list, path);
            return;
        }
        zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21087P5)).booleanValue() && zzt.zzo().m22934f() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ar0

                /* renamed from: p */
                public final /* synthetic */ String f17236p;

                public /* synthetic */ ar0(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = r1;
                    int i11 = ir0.f22355R;
                    zzt.zzo().m22934f().m24398e(str2);
                }
            });
        }
    }

    /* renamed from: m0 */
    public final /* synthetic */ void m23378m0() {
        this.f22373p.mo26704q0();
        zzl zzN = this.f22373p.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    /* renamed from: n0 */
    public final /* synthetic */ void m23379n0(View view, yh0 yh0Var, int i11) {
        m23353z(view, yh0Var, i11 - 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zza zzaVar = this.f22377t;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m23377l0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f22376s) {
            try {
                if (this.f22373p.mo26709v()) {
                    zze.zza("Blank page loaded, 1...");
                    this.f22373p.mo26713y();
                    return;
                }
                this.f22367L = true;
                ms0 ms0Var = this.f22380w;
                if (ms0Var != null) {
                    ms0Var.zza();
                    this.f22380w = null;
                }
                m23367b0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i11, String str, String str2) {
        this.f22357B = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zq0 zq0Var = this.f22373p;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zq0Var.mo26697f0(didCrash, rendererPriorityAtExit);
    }

    /* renamed from: s0 */
    public final void m23380s0(zzc zzcVar, boolean z11) {
        zza zzaVar;
        zzo zzoVar;
        pf1 pf1Var;
        boolean mo26680M = this.f22373p.mo26680M();
        boolean m23346G = m23346G(mo26680M, this.f22373p);
        boolean z12 = true;
        if (!m23346G && z11) {
            z12 = false;
        }
        if (m23346G) {
            zzaVar = null;
        } else {
            zzaVar = this.f22377t;
        }
        if (mo26680M) {
            zzoVar = null;
        } else {
            zzoVar = this.f22378u;
        }
        zzz zzzVar = this.f22361F;
        zzcgv zzp = this.f22373p.zzp();
        zq0 zq0Var = this.f22373p;
        if (z12) {
            pf1Var = null;
        } else {
            pf1Var = this.f22383z;
        }
        m23354B0(new AdOverlayInfoParcel(zzcVar, zzaVar, zzoVar, zzzVar, zzp, zq0Var, pf1Var));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m23365Y(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m23377l0(parse);
        } else {
            if (this.f22356A && webView == this.f22373p.mo26701m()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zzaVar = this.f22377t;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        yh0 yh0Var = this.f22365J;
                        if (yh0Var != null) {
                            yh0Var.zzh(str);
                        }
                        this.f22377t = null;
                    }
                    pf1 pf1Var = this.f22383z;
                    if (pf1Var != null) {
                        pf1Var.zzq();
                        this.f22383z = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f22373p.mo26701m().willNotDraw()) {
                try {
                    C4830od mo23008d = this.f22373p.mo23008d();
                    if (mo23008d != null && mo23008d.m25163f(parse)) {
                        Context context = this.f22373p.getContext();
                        zq0 zq0Var = this.f22373p;
                        parse = mo23008d.m25158a(parse, context, (View) zq0Var, zq0Var.zzk());
                    }
                } catch (zzapf unused) {
                    yk0.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzbVar = this.f22363H;
                if (zzbVar != null && !zzbVar.zzc()) {
                    this.f22363H.zzb(str);
                } else {
                    m23380s0(new zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                yk0.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    /* renamed from: v0 */
    public final void m23381v0(zzbr zzbrVar, n22 n22Var, dt1 dt1Var, rv2 rv2Var, String str, String str2, int i11) {
        zq0 zq0Var = this.f22373p;
        m23354B0(new AdOverlayInfoParcel(zq0Var, zq0Var.zzp(), zzbrVar, n22Var, dt1Var, rv2Var, str, str2, 14));
    }

    /* renamed from: x0 */
    public final void m23382x0(boolean z11, int i11, boolean z12) {
        zza zzaVar;
        pf1 pf1Var;
        boolean m23346G = m23346G(this.f22373p.mo26680M(), this.f22373p);
        boolean z13 = true;
        if (!m23346G && z12) {
            z13 = false;
        }
        if (m23346G) {
            zzaVar = null;
        } else {
            zzaVar = this.f22377t;
        }
        zzo zzoVar = this.f22378u;
        zzz zzzVar = this.f22361F;
        zq0 zq0Var = this.f22373p;
        zzcgv zzp = zq0Var.zzp();
        if (z13) {
            pf1Var = null;
        } else {
            pf1Var = this.f22383z;
        }
        m23354B0(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zq0Var, z11, i11, zzp, pf1Var));
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final void zzD() {
        synchronized (this.f22376s) {
            this.f22356A = false;
            this.f22358C = true;
            kl0.f23367e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.br0
                public /* synthetic */ br0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ir0.this.m23378m0();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final zzb zzd() {
        return this.f22363H;
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final void zzj() {
        C4808ns c4808ns = this.f22374q;
        if (c4808ns != null) {
            c4808ns.m24994c(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
        }
        this.f22368M = true;
        m23367b0();
        this.f22373p.destroy();
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final void zzk() {
        synchronized (this.f22376s) {
        }
        this.f22369N++;
        m23367b0();
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final void zzl() {
        this.f22369N--;
        m23367b0();
    }

    @Override // com.google.android.gms.internal.ads.ns0
    public final void zzp() {
        yh0 yh0Var = this.f22365J;
        if (yh0Var != null) {
            WebView mo26701m = this.f22373p.mo26701m();
            if (AbstractC1579n0.m7862d0(mo26701m)) {
                m23353z(mo26701m, yh0Var, 10);
                return;
            }
            m23352t();
            dr0 dr0Var = new dr0(this, yh0Var);
            this.f22372Q = dr0Var;
            ((View) this.f22373p).addOnAttachStateChangeListener(dr0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        pf1 pf1Var = this.f22383z;
        if (pf1Var != null) {
            pf1Var.zzq();
        }
    }
}

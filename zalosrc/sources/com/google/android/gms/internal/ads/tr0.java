package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.m23;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20295p;
import p229i5.InterfaceC20296q;

/* loaded from: classes2.dex */
final class tr0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zq0 {

    /* renamed from: p0 */
    public static final /* synthetic */ int f28475p0 = 0;

    /* renamed from: A */
    private boolean f28476A;

    /* renamed from: B */
    private ir0 f28477B;

    /* renamed from: C */
    private zzl f28478C;

    /* renamed from: D */
    private InterfaceC4271b f28479D;

    /* renamed from: E */
    private ps0 f28480E;

    /* renamed from: F */
    private final String f28481F;

    /* renamed from: G */
    private boolean f28482G;

    /* renamed from: H */
    private boolean f28483H;

    /* renamed from: I */
    private boolean f28484I;

    /* renamed from: J */
    private boolean f28485J;

    /* renamed from: K */
    private Boolean f28486K;

    /* renamed from: L */
    private boolean f28487L;

    /* renamed from: M */
    private final String f28488M;

    /* renamed from: N */
    private wr0 f28489N;

    /* renamed from: O */
    private boolean f28490O;

    /* renamed from: P */
    private boolean f28491P;

    /* renamed from: Q */
    private InterfaceC5187xz f28492Q;

    /* renamed from: R */
    private InterfaceC5112vz f28493R;

    /* renamed from: S */
    private InterfaceC4437dr f28494S;

    /* renamed from: T */
    private int f28495T;

    /* renamed from: U */
    private int f28496U;

    /* renamed from: V */
    private C4999sx f28497V;

    /* renamed from: W */
    private final C4999sx f28498W;

    /* renamed from: a0 */
    private C4999sx f28499a0;

    /* renamed from: b0 */
    private final C5036tx f28500b0;

    /* renamed from: c0 */
    private int f28501c0;

    /* renamed from: d0 */
    private int f28502d0;

    /* renamed from: e0 */
    private int f28503e0;

    /* renamed from: f0 */
    private zzl f28504f0;

    /* renamed from: g0 */
    private boolean f28505g0;

    /* renamed from: h0 */
    private final zzci f28506h0;

    /* renamed from: i0 */
    private int f28507i0;

    /* renamed from: j0 */
    private int f28508j0;

    /* renamed from: k0 */
    private int f28509k0;

    /* renamed from: l0 */
    private int f28510l0;

    /* renamed from: m0 */
    private Map f28511m0;

    /* renamed from: n0 */
    private final WindowManager f28512n0;

    /* renamed from: o0 */
    private final C4808ns f28513o0;

    /* renamed from: p */
    private final os0 f28514p;

    /* renamed from: q */
    private final C4830od f28515q;

    /* renamed from: r */
    private final C4592hy f28516r;

    /* renamed from: s */
    private final zzcgv f28517s;

    /* renamed from: t */
    private com.google.android.gms.ads.internal.zzl f28518t;

    /* renamed from: u */
    private final zza f28519u;

    /* renamed from: v */
    private final DisplayMetrics f28520v;

    /* renamed from: w */
    private final float f28521w;

    /* renamed from: x */
    private iq2 f28522x;

    /* renamed from: y */
    private lq2 f28523y;

    /* renamed from: z */
    private boolean f28524z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.gms.internal.ads.yr0] */
    public tr0(os0 os0Var, ps0 ps0Var, String str, boolean z11, boolean z12, C4830od c4830od, C4592hy c4592hy, zzcgv zzcgvVar, C5110vx c5110vx, com.google.android.gms.ads.internal.zzl zzlVar, zza zzaVar, C4808ns c4808ns, iq2 iq2Var, lq2 lq2Var) {
        super(os0Var);
        lq2 lq2Var2;
        this.f28524z = false;
        this.f28476A = false;
        this.f28487L = true;
        this.f28488M = "";
        this.f28507i0 = -1;
        this.f28508j0 = -1;
        this.f28509k0 = -1;
        this.f28510l0 = -1;
        this.f28514p = os0Var;
        this.f28480E = ps0Var;
        this.f28481F = str;
        this.f28484I = z11;
        this.f28515q = c4830od;
        this.f28516r = c4592hy;
        this.f28517s = zzcgvVar;
        this.f28518t = zzlVar;
        this.f28519u = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f28512n0 = windowManager;
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr(windowManager);
        this.f28520v = zzr;
        this.f28521w = zzr.density;
        this.f28513o0 = c4808ns;
        this.f28522x = iq2Var;
        this.f28523y = lq2Var;
        this.f28506h0 = new zzci(os0Var.m25249a(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e11) {
            yk0.zzh("Unable to enable Javascript.", e11);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(zzt.zzp().zzc(os0Var, zzcgvVar.f32030p));
        zzt.zzp();
        final Context context = getContext();
        zzcb.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                m23 m23Var = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(AbstractC4554gx.f20972E0)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        m26657O0();
        addJavascriptInterface(new zr0(this, new Object() { // from class: com.google.android.gms.internal.ads.yr0
        }, null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m26665W0();
        C5036tx c5036tx = new C5036tx(new C5110vx(true, "make_wv", this.f28481F));
        this.f28500b0 = c5036tx;
        c5036tx.m26788a().m27425c(null);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue() && (lq2Var2 = this.f28523y) != null && lq2Var2.f24014b != null) {
            c5036tx.m26788a().m27426d("gqi", this.f28523y.f24014b);
        }
        c5036tx.m26788a();
        C4999sx m27422f = C5110vx.m27422f();
        this.f28498W = m27422f;
        c5036tx.m26789b("native:view_create", m27422f);
        this.f28499a0 = null;
        this.f28497V = null;
        zzce.zza().zzb(os0Var);
        zzt.zzo().m22942q();
    }

    /* renamed from: O0 */
    private final synchronized void m26657O0() {
        iq2 iq2Var = this.f28522x;
        if (iq2Var != null && iq2Var.f22342o0) {
            yk0.zze("Disabling hardware acceleration on an overlay.");
            m26659Q0();
            return;
        }
        if (!this.f28484I && !this.f28480E.m25539i()) {
            yk0.zze("Enabling hardware acceleration on an AdView.");
            m26661S0();
            return;
        }
        yk0.zze("Enabling hardware acceleration on an overlay.");
        m26661S0();
    }

    /* renamed from: P0 */
    private final synchronized void m26658P0() {
        if (!this.f28505g0) {
            this.f28505g0 = true;
            zzt.zzo().m22941p();
        }
    }

    /* renamed from: Q0 */
    private final synchronized void m26659Q0() {
        try {
            if (!this.f28485J) {
                setLayerType(1, null);
            }
            this.f28485J = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: R0 */
    private final void m26660R0(boolean z11) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z11) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        mo23552V("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: S0 */
    private final synchronized void m26661S0() {
        try {
            if (this.f28485J) {
                setLayerType(0, null);
            }
            this.f28485J = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: T0 */
    private final synchronized void m26662T0(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th2) {
            zzt.zzo().m22945t(th2, "AdWebViewImpl.loadUrlUnsafe");
            yk0.zzk("Could not call loadUrl in destroy(). ", th2);
        }
    }

    /* renamed from: U0 */
    private final void m26663U0() {
        AbstractC4813nx.m25029a(this.f28500b0.m26788a(), this.f28498W, "aeh2");
    }

    /* renamed from: V0 */
    private final synchronized void m26664V0() {
        try {
            Map map = this.f28511m0;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((kp0) it.next()).release();
                }
            }
            this.f28511m0 = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: W0 */
    private final void m26665W0() {
        C5036tx c5036tx = this.f28500b0;
        if (c5036tx == null) {
            return;
        }
        C5110vx m26788a = c5036tx.m26788a();
        C4738lx m22934f = zzt.zzo().m22934f();
        if (m22934f != null) {
            m22934f.m24399f(m26788a);
        }
    }

    /* renamed from: X0 */
    private final synchronized void m26666X0() {
        Boolean m22938k = zzt.zzo().m22938k();
        this.f28486K = m22938k;
        if (m22938k == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                m26681M0(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                m26681M0(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: A */
    public final synchronized void mo26667A(zzl zzlVar) {
        this.f28478C = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: A0 */
    public final synchronized void mo26668A0(boolean z11) {
        zzl zzlVar = this.f28478C;
        if (zzlVar != null) {
            zzlVar.zzw(this.f28477B.mo23370h(), z11);
        } else {
            this.f28482G = z11;
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: B */
    public final synchronized boolean mo26669B() {
        return this.f28487L;
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: B0 */
    public final void mo21786B0(boolean z11, int i11, String str, String str2, boolean z12) {
        this.f28477B.m23356D0(z11, i11, str, str2, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: C */
    public final void mo26670C() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.l70
    /* renamed from: C0 */
    public final void mo23550C0(String str, JSONObject jSONObject) {
        mo23553c(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: D */
    public final synchronized boolean mo26671D() {
        return this.f28495T > 0;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: E */
    public final synchronized void mo26672E(boolean z11) {
        if (z11) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzl zzlVar = this.f28478C;
        if (zzlVar != null) {
            zzlVar.zzz(z11);
        }
    }

    /* renamed from: F0 */
    public final ir0 m26673F0() {
        return this.f28477B;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: G */
    public final void mo22089G(int i11) {
    }

    /* renamed from: G0 */
    final synchronized Boolean m26674G0() {
        return this.f28486K;
    }

    /* renamed from: J0 */
    protected final synchronized void m26675J0(String str, ValueCallback valueCallback) {
        if (!mo26709v()) {
            evaluateJavascript(str, null);
        } else {
            yk0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: K */
    public final synchronized void mo26676K(int i11) {
        zzl zzlVar = this.f28478C;
        if (zzlVar != null) {
            zzlVar.zzy(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K0 */
    public final void m26677K0(String str) {
        if (AbstractC20295p.m105950d()) {
            if (m26674G0() == null) {
                m26666X0();
            }
            if (m26674G0().booleanValue()) {
                m26675J0(str, null);
                return;
            } else {
                m26679L0("javascript:".concat(str));
                return;
            }
        }
        m26679L0("javascript:".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: L */
    public final void mo26678L(iq2 iq2Var, lq2 lq2Var) {
        this.f28522x = iq2Var;
        this.f28523y = lq2Var;
    }

    /* renamed from: L0 */
    protected final synchronized void m26679L0(String str) {
        if (!mo26709v()) {
            loadUrl(str);
        } else {
            yk0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: M */
    public final synchronized boolean mo26680M() {
        return this.f28484I;
    }

    /* renamed from: M0 */
    final void m26681M0(Boolean bool) {
        synchronized (this) {
            this.f28486K = bool;
        }
        zzt.zzo().m22946u(bool);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: N */
    public final void mo26682N() {
        if (this.f28499a0 == null) {
            this.f28500b0.m26788a();
            C4999sx m27422f = C5110vx.m27422f();
            this.f28499a0 = m27422f;
            this.f28500b0.m26789b("native:view_load", m27422f);
        }
    }

    /* renamed from: N0 */
    public final boolean m26683N0() {
        int i11;
        int i12;
        boolean z11 = false;
        if (!this.f28477B.mo23370h() && !this.f28477B.m23375k()) {
            return false;
        }
        zzaw.zzb();
        DisplayMetrics displayMetrics = this.f28520v;
        int m26113w = rk0.m26113w(displayMetrics, displayMetrics.widthPixels);
        zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.f28520v;
        int m26113w2 = rk0.m26113w(displayMetrics2, displayMetrics2.heightPixels);
        Activity m25249a = this.f28514p.m25249a();
        if (m25249a != null && m25249a.getWindow() != null) {
            zzt.zzp();
            int[] zzN = zzs.zzN(m25249a);
            zzaw.zzb();
            int m26113w3 = rk0.m26113w(this.f28520v, zzN[0]);
            zzaw.zzb();
            i12 = rk0.m26113w(this.f28520v, zzN[1]);
            i11 = m26113w3;
        } else {
            i11 = m26113w;
            i12 = m26113w2;
        }
        int i13 = this.f28508j0;
        if (i13 == m26113w && this.f28507i0 == m26113w2 && this.f28509k0 == i11 && this.f28510l0 == i12) {
            return false;
        }
        if (i13 != m26113w || this.f28507i0 != m26113w2) {
            z11 = true;
        }
        this.f28508j0 = m26113w;
        this.f28507i0 = m26113w2;
        this.f28509k0 = i11;
        this.f28510l0 = i12;
        new qc0(this, "").m25685e(m26113w, m26113w2, i11, i12, this.f28520v.density, this.f28512n0.getDefaultDisplay().getRotation());
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: O */
    public final synchronized void mo26684O(ps0 ps0Var) {
        this.f28480E = ps0Var;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: P */
    public final synchronized String mo26685P() {
        return this.f28481F;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: Q */
    public final void mo22090Q(int i11) {
        this.f28502d0 = i11;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: R */
    public final void mo26686R(String str, c40 c40Var) {
        ir0 ir0Var = this.f28477B;
        if (ir0Var != null) {
            ir0Var.m23368c(str, c40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: S */
    public final void mo26687S(String str, c40 c40Var) {
        ir0 ir0Var = this.f28477B;
        if (ir0Var != null) {
            ir0Var.m23357E0(str, c40Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: T */
    public final boolean mo26688T() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: U */
    public final void mo26689U(boolean z11) {
        this.f28477B.m23374j0(z11);
    }

    @Override // com.google.android.gms.internal.ads.x60
    /* renamed from: V */
    public final void mo23552V(String str, Map map) {
        try {
            mo23555n(str, zzaw.zzb().m26120k(map));
        } catch (JSONException unused) {
            yk0.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: W */
    public final void mo26690W() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: X */
    public final synchronized void mo26691X(zzl zzlVar) {
        this.f28504f0 = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: Y */
    public final void mo22091Y(int i11) {
        this.f28503e0 = i11;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: a */
    public final synchronized String mo22092a() {
        return this.f28488M;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: a0 */
    public final um0 mo22093a0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.qq0
    /* renamed from: b */
    public final iq2 mo25866b() {
        return this.f28522x;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: b0 */
    public final void mo22094b0(boolean z11, long j11) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z11) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j11));
        mo23552V("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    /* renamed from: c */
    public final void mo23553c(String str, String str2) {
        m26677K0(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: c0 */
    public final synchronized void mo26692c0(InterfaceC5112vz interfaceC5112vz) {
        this.f28493R = interfaceC5112vz;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.hs0
    /* renamed from: d */
    public final C4830od mo23008d() {
        return this.f28515q;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: d0 */
    public final void mo26693d0(int i11) {
        if (i11 == 0) {
            AbstractC4813nx.m25029a(this.f28500b0.m26788a(), this.f28498W, "aebb2");
        }
        m26663U0();
        this.f28500b0.m26788a();
        this.f28500b0.m26788a().m27426d("close_type", String.valueOf(i11));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i11));
        hashMap.put("version", this.f28517s.f32030p);
        mo23552V("onhide", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final synchronized void destroy() {
        try {
            m26665W0();
            this.f28506h0.zza();
            zzl zzlVar = this.f28478C;
            if (zzlVar != null) {
                zzlVar.zzb();
                this.f28478C.zzl();
                this.f28478C = null;
            }
            this.f28479D = null;
            this.f28477B.m23359F0();
            this.f28494S = null;
            this.f28518t = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f28483H) {
                return;
            }
            zzt.zzy().m20981j(this);
            m26664V0();
            this.f28483H = true;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21425x8)).booleanValue()) {
                zze.zza("Initiating WebView self destruct sequence in 3...");
                zze.zza("Loading blank page in WebView, 2...");
                m26662T0("about:blank");
            } else {
                zze.zza("Destroying the WebView immediately...");
                mo26713y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: e */
    public final Context mo26694e() {
        return this.f28514p.m25250b();
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: e0 */
    public final void mo26695e0(Context context) {
        this.f28514p.setBaseContext(context);
        this.f28506h0.zze(this.f28514p.m25249a());
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (mo26709v()) {
            yk0.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: f */
    public final synchronized boolean mo26696f() {
        return this.f28482G;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: f0 */
    public final boolean mo26697f0(final boolean z11, final int i11) {
        destroy();
        this.f28513o0.m24993b(new InterfaceC4771ms() { // from class: com.google.android.gms.internal.ads.qr0
            @Override // com.google.android.gms.internal.ads.InterfaceC4771ms
            /* renamed from: a */
            public final void mo20788a(C4514fu c4514fu) {
                boolean z12 = z11;
                int i12 = i11;
                int i13 = tr0.f28475p0;
                C4775mw m25022F = C4812nw.m25022F();
                if (m25022F.m24751s() != z12) {
                    m25022F.m24749q(z12);
                }
                m25022F.m24750r(i12);
                c4514fu.m22170A((C4812nw) m25022F.m25898n());
            }
        });
        this.f28513o0.m24994c(10003);
        return true;
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f28483H) {
                        this.f28477B.m23359F0();
                        zzt.zzy().m20981j(this);
                        m26664V0();
                        m26658P0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: g */
    public final void mo22095g() {
        zzl zzN = zzN();
        if (zzN != null) {
            zzN.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: g0 */
    public final synchronized void mo26698g0(InterfaceC4271b interfaceC4271b) {
        this.f28479D = interfaceC4271b;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: h */
    public final WebViewClient mo26699h() {
        return this.f28477B;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.js0
    /* renamed from: i */
    public final View mo23737i() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: k */
    public final synchronized void mo22096k() {
        InterfaceC5112vz interfaceC5112vz = this.f28493R;
        if (interfaceC5112vz != null) {
            final wn1 wn1Var = (wn1) interfaceC5112vz;
            zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.un1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        wn1.this.zzd();
                    } catch (RemoteException e11) {
                        yk0.zzl("#007 Could not call remote method.", e11);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: k0 */
    public final synchronized void mo26700k0(InterfaceC5187xz interfaceC5187xz) {
        this.f28492Q = interfaceC5187xz;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo26709v()) {
            super.loadData(str, str2, str3);
        } else {
            yk0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo26709v()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            yk0.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final synchronized void loadUrl(String str) {
        if (!mo26709v()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Throwable th2) {
                zzt.zzo().m22945t(th2, "AdWebViewImpl.loadUrl");
                yk0.zzk("Could not call loadUrl. ", th2);
                return;
            }
        }
        yk0.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: m */
    public final WebView mo26701m() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        boolean z11;
        synchronized (this) {
            z11 = c4842op.f25735j;
            this.f28490O = z11;
        }
        m26660R0(z11);
    }

    @Override // com.google.android.gms.internal.ads.x60, com.google.android.gms.internal.ads.z60
    /* renamed from: n */
    public final void mo23555n(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        yk0.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        m26677K0(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: n0 */
    public final void mo21787n0(boolean z11, int i11, String str, boolean z12) {
        this.f28477B.m23355C0(z11, i11, str, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: o0 */
    public final synchronized void mo26702o0(boolean z11) {
        this.f28487L = z11;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        ir0 ir0Var = this.f28477B;
        if (ir0Var != null) {
            ir0Var.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!mo26709v()) {
                this.f28506h0.zzc();
            }
            boolean z11 = this.f28490O;
            ir0 ir0Var = this.f28477B;
            if (ir0Var != null && ir0Var.m23375k()) {
                if (!this.f28491P) {
                    this.f28477B.m23363Q();
                    this.f28477B.m23364V();
                    this.f28491P = true;
                }
                m26683N0();
                z11 = true;
            }
            m26660R0(z11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ir0 ir0Var;
        synchronized (this) {
            try {
                if (!mo26709v()) {
                    this.f28506h0.zzd();
                }
                super.onDetachedFromWindow();
                if (this.f28491P && (ir0Var = this.f28477B) != null && ir0Var.m23375k() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.f28477B.m23363Q();
                    this.f28477B.m23364V();
                    this.f28491P = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m26660R0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.zzp();
            zzs.zzJ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            yk0.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (mo26709v()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean m26683N0 = m26683N0();
        zzl zzN = zzN();
        if (zzN != null && m26683N0) {
            zzN.zzm();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bd A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0079, B:40:0x008b, B:46:0x0085, B:49:0x0098, B:51:0x00a0, B:53:0x00b2, B:56:0x00b7, B:58:0x00d3, B:59:0x00dc, B:62:0x00d8, B:63:0x00e1, B:65:0x00e9, B:68:0x00f4, B:75:0x011a, B:77:0x0121, B:80:0x0128, B:82:0x013a, B:84:0x0148, B:87:0x0155, B:91:0x015a, B:93:0x01a5, B:94:0x01a9, B:96:0x01b0, B:101:0x01bd, B:103:0x01c3, B:104:0x01c6, B:106:0x01ca, B:107:0x01d3, B:113:0x01de), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013a A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0079, B:40:0x008b, B:46:0x0085, B:49:0x0098, B:51:0x00a0, B:53:0x00b2, B:56:0x00b7, B:58:0x00d3, B:59:0x00dc, B:62:0x00d8, B:63:0x00e1, B:65:0x00e9, B:68:0x00f4, B:75:0x011a, B:77:0x0121, B:80:0x0128, B:82:0x013a, B:84:0x0148, B:87:0x0155, B:91:0x015a, B:93:0x01a5, B:94:0x01a9, B:96:0x01b0, B:101:0x01bd, B:103:0x01c3, B:104:0x01c6, B:106:0x01ca, B:107:0x01d3, B:113:0x01de), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0079, B:40:0x008b, B:46:0x0085, B:49:0x0098, B:51:0x00a0, B:53:0x00b2, B:56:0x00b7, B:58:0x00d3, B:59:0x00dc, B:62:0x00d8, B:63:0x00e1, B:65:0x00e9, B:68:0x00f4, B:75:0x011a, B:77:0x0121, B:80:0x0128, B:82:0x013a, B:84:0x0148, B:87:0x0155, B:91:0x015a, B:93:0x01a5, B:94:0x01a9, B:96:0x01b0, B:101:0x01bd, B:103:0x01c3, B:104:0x01c6, B:106:0x01ca, B:107:0x01d3, B:113:0x01de), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i11, int i12) {
        int i13;
        ps0 ps0Var;
        boolean z11;
        boolean z12;
        int size;
        float f11;
        int i14 = 0;
        if (mo26709v()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f28484I && !this.f28480E.m25536f()) {
            if (this.f28480E.m25538h()) {
                super.onMeasure(i11, i12);
                return;
            }
            if (this.f28480E.m25540j()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21162X2)).booleanValue()) {
                    super.onMeasure(i11, i12);
                    return;
                }
                wr0 zzs = zzs();
                if (zzs != null) {
                    f11 = zzs.zze();
                } else {
                    f11 = 0.0f;
                }
                if (f11 == 0.0f) {
                    super.onMeasure(i11, i12);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i11);
                int size3 = View.MeasureSpec.getSize(i12);
                int i15 = (int) (size3 * f11);
                int i16 = (int) (size2 / f11);
                if (size3 == 0) {
                    if (i16 != 0) {
                        i15 = (int) (i16 * f11);
                        i14 = size2;
                        size3 = i16;
                        setMeasuredDimension(Math.min(i15, i14), Math.min(i16, size3));
                        return;
                    }
                    size3 = 0;
                }
                if (size2 == 0) {
                    if (i15 != 0) {
                        i16 = (int) (i15 / f11);
                        i14 = i15;
                    }
                } else {
                    i14 = size2;
                }
                setMeasuredDimension(Math.min(i15, i14), Math.min(i16, size3));
                return;
            }
            if (this.f28480E.m25537g()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21220d3)).booleanValue()) {
                    super.onMeasure(i11, i12);
                    return;
                }
                mo26687S("/contentHeight", new rr0(this));
                m26677K0("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f12 = this.f28520v.density;
                int size4 = View.MeasureSpec.getSize(i11);
                int i17 = this.f28496U;
                if (i17 != -1) {
                    size = (int) (i17 * f12);
                } else {
                    size = View.MeasureSpec.getSize(i12);
                }
                setMeasuredDimension(size4, size);
                return;
            }
            if (this.f28480E.m25539i()) {
                DisplayMetrics displayMetrics = this.f28520v;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i11);
            int size5 = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            int size6 = View.MeasureSpec.getSize(i12);
            int i18 = Integer.MAX_VALUE;
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i13 = Integer.MAX_VALUE;
                if (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) {
                    i18 = size6;
                }
                ps0Var = this.f28480E;
                if (ps0Var.f26324c <= i13 || ps0Var.f26323b > i18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21441z4)).booleanValue()) {
                    int i19 = this.f28480E.f26324c;
                    float f13 = this.f28521w;
                    if (i19 / f13 <= i13 / f13 && r4.f26323b / f13 <= i18 / f13) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 &= z12;
                }
                if (!z11) {
                    ps0 ps0Var2 = this.f28480E;
                    int i21 = ps0Var2.f26324c;
                    float f14 = this.f28521w;
                    yk0.zzj("Not enough space to show ad. Needs " + ((int) (i21 / f14)) + "x" + ((int) (ps0Var2.f26323b / f14)) + " dp, but only has " + ((int) (size5 / f14)) + "x" + ((int) (size6 / f14)) + " dp.");
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (!this.f28524z) {
                        this.f28513o0.m24994c(10001);
                        this.f28524z = true;
                        return;
                    }
                    return;
                }
                if (getVisibility() != 8) {
                    setVisibility(0);
                }
                if (!this.f28476A) {
                    this.f28513o0.m24994c(10002);
                    this.f28476A = true;
                }
                ps0 ps0Var3 = this.f28480E;
                setMeasuredDimension(ps0Var3.f26324c, ps0Var3.f26323b);
                return;
            }
            i13 = size5;
            if (mode2 != Integer.MIN_VALUE) {
            }
            i18 = size6;
            ps0Var = this.f28480E;
            if (ps0Var.f26324c <= i13) {
            }
            z11 = true;
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21441z4)).booleanValue()) {
            }
            if (!z11) {
            }
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final void onPause() {
        if (mo26709v()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e11) {
            yk0.zzh("Could not pause webview.", e11);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final void onResume() {
        if (mo26709v()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e11) {
            yk0.zzh("Could not resume webview.", e11);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f28477B.m23375k() && !this.f28477B.m23373j()) {
            synchronized (this) {
                try {
                    InterfaceC5187xz interfaceC5187xz = this.f28492Q;
                    if (interfaceC5187xz != null) {
                        interfaceC5187xz.mo20977a(motionEvent);
                    }
                } finally {
                }
            }
        } else {
            C4830od c4830od = this.f28515q;
            if (c4830od != null) {
                c4830od.m25161d(motionEvent);
            }
            C4592hy c4592hy = this.f28516r;
            if (c4592hy != null) {
                c4592hy.m23079b(motionEvent);
            }
        }
        if (mo26709v()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.gs0
    /* renamed from: p */
    public final synchronized ps0 mo22517p() {
        return this.f28480E;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: p0 */
    public final synchronized void mo26703p0(String str, String str2, String str3) {
        String str4;
        try {
            if (!mo26709v()) {
                String[] strArr = new String[1];
                String str5 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21061N);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("version", str5);
                    jSONObject.put("sdk", "Google Mobile Ads");
                    jSONObject.put("sdkVersion", "12.4.51-000");
                    str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e11) {
                    yk0.zzk("Unable to build MRAID_ENV", e11);
                    str4 = null;
                }
                strArr[0] = str4;
                super.loadDataWithBaseURL(str, fs0.m22155a(str2, strArr), "text/html", "UTF-8", null);
                return;
            }
            yk0.zzj("#004 The webview is destroyed. Ignoring action.");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    /* renamed from: q */
    public final synchronized void mo22097q(String str, kp0 kp0Var) {
        try {
            if (this.f28511m0 == null) {
                this.f28511m0 = new HashMap();
            }
            this.f28511m0.put(str, kp0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: q0 */
    public final void mo26704q0() {
        this.f28506h0.zzb();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: r */
    public final synchronized kp0 mo22098r(String str) {
        Map map = this.f28511m0;
        if (map == null) {
            return null;
        }
        return (kp0) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: r0 */
    public final synchronized void mo26705r0(boolean z11) {
        String str;
        try {
            boolean z12 = this.f28484I;
            this.f28484I = z11;
            m26657O0();
            if (z11 != z12) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21071O)).booleanValue()) {
                    if (!this.f28480E.m25539i()) {
                    }
                }
                qc0 qc0Var = new qc0(this, "");
                if (true != z11) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                qc0Var.m25687g(str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    /* renamed from: s */
    public final synchronized void mo22099s(wr0 wr0Var) {
        if (this.f28489N != null) {
            yk0.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f28489N = wr0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: s0 */
    public final void mo21788s0(zzc zzcVar, boolean z11) {
        this.f28477B.m23380s0(zzcVar, z11);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zq0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ir0) {
            this.f28477B = (ir0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (mo26709v()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e11) {
            yk0.zzh("Could not stop loading webview.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: t0 */
    public final synchronized InterfaceC4271b mo26706t0() {
        return this.f28479D;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: u */
    public final synchronized InterfaceC4437dr mo26707u() {
        return this.f28494S;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: u0 */
    public final synchronized void mo26708u0(InterfaceC4437dr interfaceC4437dr) {
        this.f28494S = interfaceC4437dr;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: v */
    public final synchronized boolean mo26709v() {
        return this.f28483H;
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: v0 */
    public final void mo21789v0(boolean z11, int i11, boolean z12) {
        this.f28477B.m23382x0(z11, i11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.xr0
    /* renamed from: w */
    public final lq2 mo26710w() {
        return this.f28523y;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: w0 */
    public final void mo26711w0(String str, InterfaceC20296q interfaceC20296q) {
        ir0 ir0Var = this.f28477B;
        if (ir0Var != null) {
            ir0Var.m23369g(str, interfaceC20296q);
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: x */
    public final synchronized void mo26712x(boolean z11) {
        zzl zzlVar;
        int i11 = this.f28495T;
        int i12 = 1;
        if (true != z11) {
            i12 = -1;
        }
        int i13 = i11 + i12;
        this.f28495T = i13;
        if (i13 <= 0 && (zzlVar = this.f28478C) != null) {
            zzlVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.es0
    /* renamed from: x0 */
    public final void mo21790x0(zzbr zzbrVar, n22 n22Var, dt1 dt1Var, rv2 rv2Var, String str, String str2, int i11) {
        this.f28477B.m23381v0(zzbrVar, n22Var, dt1Var, rv2Var, str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: y */
    public final synchronized void mo26713y() {
        zze.zza("Destroying WebView!");
        m26658P0();
        zzs.zza.post(new sr0(this));
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: y0 */
    public final tc3 mo26714y0() {
        C4592hy c4592hy = this.f28516r;
        if (c4592hy == null) {
            return kc3.m23877i(null);
        }
        return c4592hy.m23078a();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    /* renamed from: z */
    public final synchronized void mo22100z(int i11) {
        this.f28501c0 = i11;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    /* renamed from: z0 */
    public final void mo26715z0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void zzB(boolean z11) {
        this.f28477B.m23366a(false);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final synchronized InterfaceC5187xz zzM() {
        return this.f28492Q;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final synchronized zzl zzN() {
        return this.f28478C;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final synchronized zzl zzO() {
        return this.f28504f0;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final /* synthetic */ ns0 zzP() {
        return this.f28477B;
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void zzX() {
        m26663U0();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f28517s.f32030p);
        mo23552V("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zq0
    public final void zzZ() {
        if (this.f28497V == null) {
            AbstractC4813nx.m25029a(this.f28500b0.m26788a(), this.f28498W, "aes2");
            this.f28500b0.m26788a();
            C4999sx m27422f = C5110vx.m27422f();
            this.f28497V = m27422f;
            this.f28500b0.m26789b("native:view_show", m27422f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f28517s.f32030p);
        mo23552V("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.l70, com.google.android.gms.internal.ads.z60
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbn() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.f28518t;
        if (zzlVar != null) {
            zzlVar.zzbn();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbo() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.f28518t;
        if (zzlVar != null) {
            zzlVar.zzbo();
        }
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzf() {
        return this.f28503e0;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzg() {
        return this.f28502d0;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final synchronized int zzh() {
        return this.f28501c0;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzi() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final int zzj() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final Activity zzk() {
        return this.f28514p.m25249a();
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final zza zzm() {
        return this.f28519u;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final C4999sx zzn() {
        return this.f28498W;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final C5036tx zzo() {
        return this.f28500b0;
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.is0, com.google.android.gms.internal.ads.fn0
    public final zzcgv zzp() {
        return this.f28517s;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void zzq() {
        ir0 ir0Var = this.f28477B;
        if (ir0Var != null) {
            ir0Var.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zq0, com.google.android.gms.internal.ads.fn0
    public final synchronized wr0 zzs() {
        return this.f28489N;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final synchronized String zzt() {
        lq2 lq2Var = this.f28523y;
        if (lq2Var == null) {
            return null;
        }
        return lq2Var.f24014b;
    }
}

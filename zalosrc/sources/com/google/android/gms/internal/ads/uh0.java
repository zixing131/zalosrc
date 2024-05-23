package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p229i5.AbstractC20295p;
import p289k5.C21472e;

/* loaded from: classes2.dex */
public final class uh0 implements yh0 {

    /* renamed from: m */
    private static final List f28897m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f28898n = 0;

    /* renamed from: a */
    private final xx3 f28899a;

    /* renamed from: b */
    private final LinkedHashMap f28900b;

    /* renamed from: e */
    private final Context f28903e;

    /* renamed from: f */
    boolean f28904f;

    /* renamed from: g */
    private final zzcdn f28905g;

    /* renamed from: l */
    private final vh0 f28910l;

    /* renamed from: c */
    private final List f28901c = new ArrayList();

    /* renamed from: d */
    private final List f28902d = new ArrayList();

    /* renamed from: h */
    private final Object f28906h = new Object();

    /* renamed from: i */
    private HashSet f28907i = new HashSet();

    /* renamed from: j */
    private boolean f28908j = false;

    /* renamed from: k */
    private boolean f28909k = false;

    public uh0(Context context, zzcgv zzcgvVar, zzcdn zzcdnVar, String str, vh0 vh0Var, byte[] bArr) {
        AbstractC4205o.m19723l(zzcdnVar, "SafeBrowsing config is not present.");
        this.f28903e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28900b = new LinkedHashMap();
        this.f28910l = vh0Var;
        this.f28905g = zzcdnVar;
        Iterator it = zzcdnVar.f32022t.iterator();
        while (it.hasNext()) {
            this.f28907i.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.f28907i.remove("cookie".toLowerCase(Locale.ENGLISH));
        xx3 m21838F = ez3.m21838F();
        m21838F.m28068E(9);
        m21838F.m28064A(str);
        m21838F.m28076y(str);
        zx3 m20348F = ay3.m20348F();
        String str2 = this.f28905g.f32018p;
        if (str2 != null) {
            m20348F.m28667q(str2);
        }
        m21838F.m28075x((ay3) m20348F.m25898n());
        yy3 m20354F = az3.m20354F();
        m20354F.m28401s(C21472e.m111067a(this.f28903e).m111065g());
        String str3 = zzcgvVar.f32030p;
        if (str3 != null) {
            m20354F.m28399q(str3);
        }
        long m19569b = C4148b.m19567h().m19569b(this.f28903e);
        if (m19569b > 0) {
            m20354F.m28400r(m19569b);
        }
        m21838F.m28074w((az3) m20354F.m25898n());
        this.f28899a = m21838F;
    }

    @Override // com.google.android.gms.internal.ads.yh0
    /* renamed from: a */
    public final void mo26962a(String str, Map map, int i11) {
        String str2;
        String str3;
        synchronized (this.f28906h) {
            if (i11 == 3) {
                try {
                    this.f28909k = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f28900b.containsKey(str)) {
                if (i11 == 3) {
                    ((wy3) this.f28900b.get(str)).m27742v(vy3.m27438a(3));
                }
                return;
            }
            wy3 m28081G = xy3.m28081G();
            int m27438a = vy3.m27438a(i11);
            if (m27438a != 0) {
                m28081G.m27742v(m27438a);
            }
            m28081G.m27739r(this.f28900b.size());
            m28081G.m27741u(str);
            hy3 m24096F = ky3.m24096F();
            if (!this.f28907i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.f28907i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        fy3 m22644F = gy3.m22644F();
                        m22644F.m22253q(mt3.m24728K(str2));
                        m22644F.m22254r(mt3.m24728K(str3));
                        m24096F.m23081q((gy3) m22644F.m25898n());
                    }
                }
            }
            m28081G.m27740s((ky3) m24096F.m25898n());
            this.f28900b.put(str, m28081G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    @Override // com.google.android.gms.internal.ads.yh0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo26963b(View view) {
        Bitmap bitmap;
        if (!this.f28905g.f32020r || this.f28908j) {
            return;
        }
        zzt.zzp();
        final Bitmap bitmap2 = null;
        if (view != null) {
            try {
                boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                view.setDrawingCacheEnabled(true);
                Bitmap drawingCache = view.getDrawingCache();
                if (drawingCache != null) {
                    bitmap = Bitmap.createBitmap(drawingCache);
                } else {
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e11) {
                    e = e11;
                    yk0.zzh("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
            } catch (RuntimeException e12) {
                e = e12;
                bitmap = null;
            }
            if (bitmap != null) {
                try {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (width != 0 && height != 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(createBitmap);
                        view.layout(0, 0, width, height);
                        view.draw(canvas);
                        bitmap2 = createBitmap;
                    }
                    yk0.zzj("Width or height of view is zero");
                } catch (RuntimeException e13) {
                    yk0.zzh("Fail to capture the webview", e13);
                }
            } else {
                bitmap2 = bitmap;
            }
        }
        if (bitmap2 != null) {
            xh0.m27887a("Failed to capture the webview bitmap.");
        } else {
            this.f28908j = true;
            zzs.zzf(new Runnable() { // from class: com.google.android.gms.internal.ads.sh0
                @Override // java.lang.Runnable
                public final void run() {
                    uh0.this.m26965e(bitmap2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m26964c(Map map) {
        wy3 wy3Var;
        tc3 m23881m;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f28906h) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (this.f28906h) {
                                    wy3Var = (wy3) this.f28900b.get(str);
                                }
                                if (wy3Var == null) {
                                    xh0.m27887a("Cannot find the corresponding resource object for " + str);
                                } else {
                                    boolean z11 = false;
                                    for (int i11 = 0; i11 < length; i11++) {
                                        wy3Var.m27738q(optJSONArray.getJSONObject(i11).getString("threat_type"));
                                    }
                                    boolean z12 = this.f28904f;
                                    if (length > 0) {
                                        z11 = true;
                                    }
                                    this.f28904f = z11 | z12;
                                }
                            } finally {
                            }
                        }
                    }
                }
            } catch (JSONException e11) {
                if (((Boolean) AbstractC4519fz.f20341b.m24091e()).booleanValue()) {
                    yk0.zzf("Failed to get SafeBrowsing metadata", e11);
                }
                return kc3.m23876h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f28904f) {
            synchronized (this.f28906h) {
                this.f28899a.m28068E(10);
            }
        }
        boolean z13 = this.f28904f;
        if ((z13 && this.f28905g.f32024v) || ((this.f28909k && this.f28905g.f32023u) || (!z13 && this.f28905g.f32021s))) {
            synchronized (this.f28906h) {
                try {
                    Iterator it = this.f28900b.values().iterator();
                    while (it.hasNext()) {
                        this.f28899a.m28071s((xy3) ((wy3) it.next()).m25898n());
                    }
                    this.f28899a.m28069q(this.f28901c);
                    this.f28899a.m28070r(this.f28902d);
                    if (xh0.m27888b()) {
                        StringBuilder sb2 = new StringBuilder("Sending SB report\n  url: " + this.f28899a.m28066C() + "\n  clickUrl: " + this.f28899a.m28065B() + "\n  resources: \n");
                        for (xy3 xy3Var : this.f28899a.m28067D()) {
                            sb2.append("    [");
                            sb2.append(xy3Var.m28088F());
                            sb2.append("] ");
                            sb2.append(xy3Var.m28089I());
                        }
                        xh0.m27887a(sb2.toString());
                    }
                    tc3 zzb = new zzbo(this.f28903e).zzb(1, this.f28905g.f32019q, null, ((ez3) this.f28899a.m25898n()).mo27346a());
                    if (xh0.m27888b()) {
                        zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.ph0
                            @Override // java.lang.Runnable
                            public final void run() {
                                xh0.m27887a("Pinged SB successfully.");
                            }
                        }, kl0.f23363a);
                    }
                    m23881m = kc3.m23881m(zzb, new y43() { // from class: com.google.android.gms.internal.ads.qh0
                        @Override // com.google.android.gms.internal.ads.y43
                        public final Object apply(Object obj) {
                            int i12 = uh0.f28898n;
                            return null;
                        }
                    }, kl0.f23368f);
                } finally {
                }
            }
            return m23881m;
        }
        return kc3.m23877i(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void m26965e(Bitmap bitmap) {
        jt3 m24724G = mt3.m24724G();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, m24724G);
        synchronized (this.f28906h) {
            xx3 xx3Var = this.f28899a;
            py3 m26206F = ry3.m26206F();
            m26206F.m25611q(m24724G.m23751b());
            m26206F.m25612r("image/png");
            m26206F.m25613s(2);
            xx3Var.m28077z((ry3) m26206F.m25898n());
        }
    }

    @Override // com.google.android.gms.internal.ads.yh0
    public final zzcdn zza() {
        return this.f28905g;
    }

    @Override // com.google.android.gms.internal.ads.yh0
    public final void zze() {
        synchronized (this.f28906h) {
            this.f28900b.keySet();
            tc3 m23877i = kc3.m23877i(Collections.emptyMap());
            qb3 qb3Var = new qb3() { // from class: com.google.android.gms.internal.ads.rh0
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return uh0.this.m26964c((Map) obj);
                }
            };
            uc3 uc3Var = kl0.f23368f;
            tc3 m23882n = kc3.m23882n(m23877i, qb3Var, uc3Var);
            tc3 m23883o = kc3.m23883o(m23882n, 10L, TimeUnit.SECONDS, kl0.f23366d);
            kc3.m23886r(m23882n, new th0(this, m23883o), uc3Var);
            f28897m.add(m23883o);
        }
    }

    @Override // com.google.android.gms.internal.ads.yh0
    public final void zzh(String str) {
        synchronized (this.f28906h) {
            try {
                if (str == null) {
                    this.f28899a.m28072u();
                } else {
                    this.f28899a.m28073v(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yh0
    public final boolean zzi() {
        if (AbstractC20295p.m105950d() && this.f28905g.f32020r && !this.f28908j) {
            return true;
        }
        return false;
    }
}

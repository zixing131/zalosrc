package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5448jf;
import com.google.android.gms.internal.measurement.C5617te;
import com.google.android.gms.internal.measurement.C5684xd;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p230i6.AbstractC20321m;
import p230i6.AbstractC20331w;
import p230i6.EnumC20305a;
import p289k5.AbstractC21469b;
import p289k5.C21472e;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* loaded from: classes.dex */
public final class C5994g3 extends AbstractC6148u3 {

    /* renamed from: c */
    private String f34013c;

    /* renamed from: d */
    private String f34014d;

    /* renamed from: e */
    private int f34015e;

    /* renamed from: f */
    private String f34016f;

    /* renamed from: g */
    private String f34017g;

    /* renamed from: h */
    private long f34018h;

    /* renamed from: i */
    private final long f34019i;

    /* renamed from: j */
    private List f34020j;

    /* renamed from: k */
    private String f34021k;

    /* renamed from: l */
    private int f34022l;

    /* renamed from: m */
    private String f34023m;

    /* renamed from: n */
    private String f34024n;

    /* renamed from: o */
    private String f34025o;

    /* renamed from: p */
    private long f34026p;

    /* renamed from: q */
    private String f34027q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5994g3(C6127s4 c6127s4, long j11) {
        super(c6127s4);
        this.f34026p = 0L;
        this.f34027q = null;
        this.f34019i = j11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:67|68|(1:70)(2:85|(1:87))|71|72|(20:74|(1:76)(1:83)|78|79|5|(1:66)(1:9)|10|11|13|(1:15)|16|17|(1:19)(1:54)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)(1:51)|46)|52)|(2:40|41)(2:43|44))|53|(0)(0)))|4|5|(1:7)|66|10|11|13|(0)|16|17|(0)(0)|20|(0)|(0)|34|(0)|53|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01bb, code lost:            r2 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01de, code lost:            r11.f34158a.mo31033c().m31197q().m31110c("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r0), r2);     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0194 A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bf, B:30:0x01d5, B:31:0x01da, B:33:0x01d8), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01bf A[Catch: IllegalStateException -> 0x01bb, TryCatch #3 {IllegalStateException -> 0x01bb, blocks: (B:17:0x0172, B:20:0x018c, B:22:0x0194, B:25:0x01b2, B:26:0x01ae, B:28:0x01bf, B:30:0x01d5, B:31:0x01da, B:33:0x01d8), top: B:16:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b5  */
    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void mo30936k() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z11;
        int m31399x;
        List m30934y;
        String m106028c;
        String str3;
        String packageName = this.f34158a.mo31032b().getPackageName();
        PackageManager packageManager = this.f34158a.mo31032b().getPackageManager();
        int i11 = Integer.MIN_VALUE;
        String str4 = "";
        String str5 = "Unknown";
        String str6 = "unknown";
        if (packageManager == null) {
            this.f34158a.mo31033c().m31197q().m31109b("PackageManager is null, app identity information might be inaccurate. appId", C6082o3.m31193z(packageName));
        } else {
            try {
                str6 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f34158a.mo31033c().m31197q().m31109b("Error retrieving app installer package name. appId", C6082o3.m31193z(packageName));
            }
            if (str6 == null) {
                str6 = "manual_install";
            } else if ("com.android.vending".equals(str6)) {
                str6 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.f34158a.mo31032b().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                if (TextUtils.isEmpty(applicationLabel)) {
                    str2 = "Unknown";
                } else {
                    str2 = applicationLabel.toString();
                }
                try {
                    str5 = packageInfo.versionName;
                    i11 = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str5;
                    str5 = str2;
                    this.f34158a.mo31033c().m31197q().m31110c("Error retrieving package info. appId, appName", C6082o3.m31193z(packageName), str5);
                    str2 = str5;
                    str5 = str;
                    this.f34013c = packageName;
                    this.f34016f = str6;
                    this.f34014d = str5;
                    this.f34015e = i11;
                    this.f34017g = str2;
                    this.f34018h = 0L;
                    if (TextUtils.isEmpty(this.f34158a.m31382O())) {
                    }
                    z11 = false;
                    m31399x = this.f34158a.m31399x();
                    switch (m31399x) {
                    }
                    this.f34023m = "";
                    this.f34024n = "";
                    this.f34158a.mo31035f();
                    if (z11) {
                    }
                    m106028c = AbstractC20331w.m106028c(this.f34158a.mo31032b(), "google_app_id", this.f34158a.m31385R());
                    if (!TextUtils.isEmpty(m106028c)) {
                    }
                    this.f34023m = str4;
                    if (!TextUtils.isEmpty(m106028c)) {
                    }
                    if (m31399x == 0) {
                    }
                    this.f34020j = null;
                    this.f34158a.mo31035f();
                    m30934y = this.f34158a.m31401z().m30934y("analytics.safelisted_events");
                    if (m30934y != null) {
                    }
                    this.f34020j = m30934y;
                    if (packageManager == null) {
                    }
                }
                this.f34013c = packageName;
                this.f34016f = str6;
                this.f34014d = str5;
                this.f34015e = i11;
                this.f34017g = str2;
                this.f34018h = 0L;
                if (TextUtils.isEmpty(this.f34158a.m31382O()) && "am".equals(this.f34158a.m31383P())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m31399x = this.f34158a.m31399x();
                switch (m31399x) {
                    case 0:
                        this.f34158a.mo31033c().m31201u().m31108a("App measurement collection enabled");
                        break;
                    case 1:
                        this.f34158a.mo31033c().m31200t().m31108a("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        this.f34158a.mo31033c().m31201u().m31108a("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        this.f34158a.mo31033c().m31200t().m31108a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        this.f34158a.mo31033c().m31200t().m31108a("App measurement disabled via the manifest");
                        break;
                    case 5:
                        this.f34158a.mo31033c().m31201u().m31108a("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        this.f34158a.mo31033c().m31203x().m31108a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        this.f34158a.mo31033c().m31200t().m31108a("App measurement disabled via the global data collection setting");
                        break;
                    default:
                        this.f34158a.mo31033c().m31200t().m31108a("App measurement disabled due to denied storage consent");
                        break;
                }
                this.f34023m = "";
                this.f34024n = "";
                this.f34158a.mo31035f();
                if (z11) {
                    this.f34024n = this.f34158a.m31382O();
                }
                m106028c = AbstractC20331w.m106028c(this.f34158a.mo31032b(), "google_app_id", this.f34158a.m31385R());
                if (!TextUtils.isEmpty(m106028c)) {
                    str4 = m106028c;
                }
                this.f34023m = str4;
                if (!TextUtils.isEmpty(m106028c)) {
                    Context mo31032b = this.f34158a.mo31032b();
                    String m31385R = this.f34158a.m31385R();
                    AbstractC4205o.m19722k(mo31032b);
                    Resources resources = mo31032b.getResources();
                    if (TextUtils.isEmpty(m31385R)) {
                        m31385R = AbstractC20321m.m106019a(mo31032b);
                    }
                    this.f34024n = AbstractC20321m.m106020b("admob_app_id", resources, m31385R);
                }
                if (m31399x == 0) {
                    C6060m3 m31201u = this.f34158a.mo31033c().m31201u();
                    String str7 = this.f34013c;
                    if (TextUtils.isEmpty(this.f34023m)) {
                        str3 = this.f34024n;
                    } else {
                        str3 = this.f34023m;
                    }
                    m31201u.m31110c("App measurement enabled for app package, google app id", str7, str3);
                }
                this.f34020j = null;
                this.f34158a.mo31035f();
                m30934y = this.f34158a.m31401z().m30934y("analytics.safelisted_events");
                if (m30934y != null) {
                    if (m30934y.isEmpty()) {
                        this.f34158a.mo31033c().m31203x().m31108a("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = m30934y.iterator();
                        while (it.hasNext()) {
                            if (!this.f34158a.m31381N().m31332R("safelisted event", (String) it.next())) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.f34022l = AbstractC21469b.m111057a(this.f34158a.mo31032b()) ? 1 : 0;
                        return;
                    } else {
                        this.f34022l = 0;
                        return;
                    }
                }
                this.f34020j = m30934y;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.f34013c = packageName;
        this.f34016f = str6;
        this.f34014d = str5;
        this.f34015e = i11;
        this.f34017g = str2;
        this.f34018h = 0L;
        if (TextUtils.isEmpty(this.f34158a.m31382O())) {
        }
        z11 = false;
        m31399x = this.f34158a.m31399x();
        switch (m31399x) {
        }
        this.f34023m = "";
        this.f34024n = "";
        this.f34158a.mo31035f();
        if (z11) {
        }
        m106028c = AbstractC20331w.m106028c(this.f34158a.mo31032b(), "google_app_id", this.f34158a.m31385R());
        if (!TextUtils.isEmpty(m106028c)) {
        }
        this.f34023m = str4;
        if (!TextUtils.isEmpty(m106028c)) {
        }
        if (m31399x == 0) {
        }
        this.f34020j = null;
        this.f34158a.mo31035f();
        m30934y = this.f34158a.m31401z().m30934y("analytics.safelisted_events");
        if (m30934y != null) {
        }
        this.f34020j = m30934y;
        if (packageManager == null) {
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6148u3
    /* renamed from: m */
    protected final boolean mo30852m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final int m30937n() {
        m31455h();
        return this.f34022l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final int m30938o() {
        m31455h();
        return this.f34015e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzq m30939p(String str) {
        String str2;
        Class<?> loadClass;
        Object invoke;
        long m31502a;
        String str3;
        long min;
        Boolean valueOf;
        String str4;
        Boolean m30929s;
        boolean booleanValue;
        long j11;
        int i11;
        ApplicationInfo m111061c;
        mo31036g();
        String m30941r = m30941r();
        String m30942s = m30942s();
        m31455h();
        String str5 = this.f34014d;
        m31455h();
        long j12 = this.f34015e;
        m31455h();
        AbstractC4205o.m19722k(this.f34016f);
        String str6 = this.f34016f;
        this.f34158a.m31401z().m30926p();
        m31455h();
        mo31036g();
        long j13 = this.f34018h;
        if (j13 == 0) {
            C6121r9 m31381N = this.f34158a.m31381N();
            Context mo31032b = this.f34158a.mo31032b();
            String packageName = this.f34158a.mo31032b().getPackageName();
            m31381N.mo31036g();
            AbstractC4205o.m19722k(mo31032b);
            AbstractC4205o.m19718g(packageName);
            PackageManager packageManager = mo31032b.getPackageManager();
            MessageDigest m31311s = C6121r9.m31311s();
            long j14 = -1;
            if (m31311s == null) {
                m31381N.f34158a.mo31033c().m31197q().m31108a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (!m31381N.m31337W(mo31032b, packageName)) {
                            Signature[] signatureArr = C21472e.m111067a(mo31032b).m111064f(m31381N.f34158a.mo31032b().getPackageName(), 64).signatures;
                            if (signatureArr != null && signatureArr.length > 0) {
                                j14 = C6121r9.m31312s0(m31311s.digest(signatureArr[0].toByteArray()));
                            } else {
                                m31381N.f34158a.mo31033c().m31202w().m31108a("Could not get signatures");
                            }
                        } else {
                            j14 = 0;
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        m31381N.f34158a.mo31033c().m31197q().m31109b("Package name not found", e11);
                    }
                }
                j13 = 0;
                this.f34018h = j13;
            }
            j13 = j14;
            this.f34018h = j13;
        }
        long j15 = j13;
        boolean m31394n = this.f34158a.m31394n();
        boolean z11 = !this.f34158a.m31374F().f33821q;
        mo31036g();
        if (this.f34158a.m31394n()) {
            C5448jf.m29325b();
            if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33916e0)) {
                this.f34158a.mo31033c().m31201u().m31108a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = this.f34158a.mo31032b().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f34158a.mo31032b());
                    } catch (Exception unused2) {
                        this.f34158a.mo31033c().m31204y().m31108a("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.f34158a.mo31033c().m31203x().m31108a("Failed to retrieve Firebase Instance Id");
                        }
                        C6127s4 c6127s4 = this.f34158a;
                        m31502a = c6127s4.m31374F().f33809e.m31502a();
                        if (m31502a == 0) {
                            str3 = m30941r;
                            min = c6127s4.f34427G;
                        } else {
                            str3 = m30941r;
                            min = Math.min(c6127s4.f34427G, m31502a);
                        }
                        m31455h();
                        int i12 = this.f34022l;
                        boolean m30912A = this.f34158a.m31401z().m30912A();
                        C5950c4 m31374F = this.f34158a.m31374F();
                        m31374F.mo31036g();
                        boolean z12 = m31374F.m30817n().getBoolean("deferred_analytics_collection", false);
                        m31455h();
                        String str7 = this.f34024n;
                        if (this.f34158a.m31401z().m30929s("google_analytics_default_allow_ad_personalization_signals") == null) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(!r2.booleanValue());
                        }
                        long j16 = this.f34019i;
                        List list = this.f34020j;
                        String m106013h = this.f34158a.m31374F().m30819p().m106013h();
                        if (this.f34021k == null) {
                            this.f34021k = this.f34158a.m31381N().m31347p();
                        }
                        String str8 = this.f34021k;
                        C5617te.m29656b();
                        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33938p0)) {
                            mo31036g();
                            if (this.f34026p != 0) {
                                long mo105913a = this.f34158a.mo31031a().mo105913a() - this.f34026p;
                                if (this.f34025o != null && mo105913a > 86400000 && this.f34027q == null) {
                                    m30944u();
                                }
                            }
                            if (this.f34025o == null) {
                                m30944u();
                            }
                            str4 = this.f34025o;
                        } else {
                            str4 = null;
                        }
                        C5990g m31401z = this.f34158a.m31401z();
                        C6127s4 c6127s42 = m31401z.f34158a;
                        m30929s = m31401z.m30929s("google_analytics_sgtm_upload_enabled");
                        if (m30929s == null) {
                            booleanValue = false;
                        } else {
                            booleanValue = m30929s.booleanValue();
                        }
                        C5684xd.m30030b();
                        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33883F0)) {
                            C6121r9 m31381N2 = this.f34158a.m31381N();
                            String m30941r2 = m30941r();
                            try {
                                m111061c = C21472e.m111067a(m31381N2.f34158a.mo31032b()).m111061c(m30941r2, 0);
                            } catch (PackageManager.NameNotFoundException unused4) {
                                m31381N2.f34158a.mo31032b();
                                m31381N2.f34158a.mo31033c().m31197q().m31109b("PackageManager failed to find running app: app_id", m30941r2);
                                i11 = 0;
                                j11 = i11;
                                return new zzq(str3, m30942s, str5, j12, str6, 76003L, j15, str, m31394n, z11, str2, 0L, min, i12, m30912A, z12, str7, valueOf, j16, list, (String) null, m106013h, str8, str4, booleanValue, j11);
                            }
                            if (m111061c != null) {
                                i11 = m111061c.targetSdkVersion;
                                j11 = i11;
                            }
                            i11 = 0;
                            j11 = i11;
                        } else {
                            j11 = 0;
                        }
                        return new zzq(str3, m30942s, str5, j12, str6, 76003L, j15, str, m31394n, z11, str2, 0L, min, i12, m30912A, z12, str7, valueOf, j16, list, (String) null, m106013h, str8, str4, booleanValue, j11);
                    }
                    str2 = null;
                    C6127s4 c6127s43 = this.f34158a;
                    m31502a = c6127s43.m31374F().f33809e.m31502a();
                    if (m31502a == 0) {
                    }
                    m31455h();
                    int i122 = this.f34022l;
                    boolean m30912A2 = this.f34158a.m31401z().m30912A();
                    C5950c4 m31374F2 = this.f34158a.m31374F();
                    m31374F2.mo31036g();
                    boolean z122 = m31374F2.m30817n().getBoolean("deferred_analytics_collection", false);
                    m31455h();
                    String str72 = this.f34024n;
                    if (this.f34158a.m31401z().m30929s("google_analytics_default_allow_ad_personalization_signals") == null) {
                    }
                    long j162 = this.f34019i;
                    List list2 = this.f34020j;
                    String m106013h2 = this.f34158a.m31374F().m30819p().m106013h();
                    if (this.f34021k == null) {
                    }
                    String str82 = this.f34021k;
                    C5617te.m29656b();
                    if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33938p0)) {
                    }
                    C5990g m31401z2 = this.f34158a.m31401z();
                    C6127s4 c6127s422 = m31401z2.f34158a;
                    m30929s = m31401z2.m30929s("google_analytics_sgtm_upload_enabled");
                    if (m30929s == null) {
                    }
                    C5684xd.m30030b();
                    if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33883F0)) {
                    }
                    return new zzq(str3, m30942s, str5, j12, str6, 76003L, j15, str, m31394n, z11, str2, 0L, min, i122, m30912A2, z122, str72, valueOf, j162, list2, (String) null, m106013h2, str82, str4, booleanValue, j11);
                }
            }
        }
        str2 = null;
        C6127s4 c6127s432 = this.f34158a;
        m31502a = c6127s432.m31374F().f33809e.m31502a();
        if (m31502a == 0) {
        }
        m31455h();
        int i1222 = this.f34022l;
        boolean m30912A22 = this.f34158a.m31401z().m30912A();
        C5950c4 m31374F22 = this.f34158a.m31374F();
        m31374F22.mo31036g();
        boolean z1222 = m31374F22.m30817n().getBoolean("deferred_analytics_collection", false);
        m31455h();
        String str722 = this.f34024n;
        if (this.f34158a.m31401z().m30929s("google_analytics_default_allow_ad_personalization_signals") == null) {
        }
        long j1622 = this.f34019i;
        List list22 = this.f34020j;
        String m106013h22 = this.f34158a.m31374F().m30819p().m106013h();
        if (this.f34021k == null) {
        }
        String str822 = this.f34021k;
        C5617te.m29656b();
        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33938p0)) {
        }
        C5990g m31401z22 = this.f34158a.m31401z();
        C6127s4 c6127s4222 = m31401z22.f34158a;
        m30929s = m31401z22.m30929s("google_analytics_sgtm_upload_enabled");
        if (m30929s == null) {
        }
        C5684xd.m30030b();
        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33883F0)) {
        }
        return new zzq(str3, m30942s, str5, j12, str6, 76003L, j15, str, m31394n, z11, str2, 0L, min, i1222, m30912A22, z1222, str722, valueOf, j1622, list22, (String) null, m106013h22, str822, str4, booleanValue, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final String m30940q() {
        m31455h();
        return this.f34024n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final String m30941r() {
        m31455h();
        AbstractC4205o.m19722k(this.f34013c);
        return this.f34013c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final String m30942s() {
        mo31036g();
        m31455h();
        AbstractC4205o.m19722k(this.f34023m);
        return this.f34023m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final List m30943t() {
        return this.f34020j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m30944u() {
        String format;
        String str;
        mo31036g();
        if (!this.f34158a.m31374F().m30819p().m106014i(EnumC20305a.ANALYTICS_STORAGE)) {
            this.f34158a.mo31033c().m31196p().m31108a("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            this.f34158a.m31381N().m31353t().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        C6060m3 m31196p = this.f34158a.mo31033c().m31196p();
        Object[] objArr = new Object[1];
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        objArr[0] = str;
        m31196p.m31108a(String.format("Resetting session stitching token to %s", objArr));
        this.f34025o = format;
        this.f34026p = this.f34158a.mo31031a().mo105913a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m30945w(String str) {
        String str2 = this.f34027q;
        boolean z11 = false;
        if (str2 != null && !str2.equals(str)) {
            z11 = true;
        }
        this.f34027q = str;
        return z11;
    }
}

package com.google.android.gms.internal.ads;

import am.C0927o;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C1335e1;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p148f3.C18711c;
import p227i3.C20217u;
import p667y2.C30268e;

/* loaded from: classes2.dex */
public final class n40 implements c40 {

    /* renamed from: a */
    private final zzb f25016a;

    /* renamed from: b */
    private final dt1 f25017b;

    /* renamed from: c */
    private final rv2 f25018c;

    /* renamed from: e */
    private final jc0 f25020e;

    /* renamed from: f */
    private final n22 f25021f;

    /* renamed from: g */
    private com.google.android.gms.ads.internal.overlay.zzx f25022g = null;

    /* renamed from: d */
    private final cl0 f25019d = new cl0(null);

    public n40(zzb zzbVar, jc0 jc0Var, n22 n22Var, dt1 dt1Var, rv2 rv2Var) {
        this.f25016a = zzbVar;
        this.f25020e = jc0Var;
        this.f25021f = n22Var;
        this.f25017b = dt1Var;
        this.f25018c = rv2Var;
    }

    /* renamed from: b */
    public static int m24841b(Map map) {
        String str = (String) map.get(C0927o.f3427r);
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if (C18711c.f94014e.equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: c */
    static Uri m24842c(Context context, C4830od c4830od, Uri uri, View view, Activity activity) {
        if (c4830od == null) {
            return uri;
        }
        try {
            if (c4830od.m25162e(uri)) {
                return c4830od.m25158a(uri, context, view, activity);
            }
            return uri;
        } catch (zzapf unused) {
            return uri;
        } catch (Exception e11) {
            zzt.zzo().m22945t(e11, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    /* renamed from: d */
    static Uri m24843d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e11) {
            yk0.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e11);
        }
        return uri;
    }

    /* renamed from: f */
    public static boolean m24844f(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:            if (com.google.android.gms.internal.ads.m40.m24461c(r11, r5, r6, r7) == null) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:            r11 = r15;     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m24846h(zza zzaVar, Map map, boolean z11, String str, boolean z12) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo m24461c;
        boolean z13 = true;
        m24847i(true);
        zq0 zq0Var = (zq0) zzaVar;
        Context context = zq0Var.getContext();
        C4830od mo23008d = zq0Var.mo23008d();
        View mo23737i = zq0Var.mo23737i();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get(C20217u.f99970o);
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri m24843d = m24843d(m24842c(context, mo23008d, Uri.parse(str2), mo23737i, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20985F3)).booleanValue()) {
                    z13 = false;
                }
            }
            if ("http".equalsIgnoreCase(m24843d.getScheme())) {
                build = m24843d.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(m24843d.getScheme())) {
                build = m24843d.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent m24459a = m40.m24459a(m24843d, context, mo23008d, mo23737i);
            Intent m24459a2 = m40.m24459a(build, context, mo23008d, mo23737i);
            if (z13) {
                zzt.zzp();
                zzs.zzm(context, m24459a);
                zzt.zzp();
                zzs.zzm(context, m24459a2);
            }
            ResolveInfo m24462d = m40.m24462d(m24459a, arrayList, context, mo23008d, mo23737i);
            if (m24462d != null) {
                intent = m40.m24460b(m24459a, m24462d, context, mo23008d, mo23737i);
            } else {
                if (m24459a2 != null && (m24461c = m40.m24461c(m24459a2, context, mo23008d, mo23737i)) != null) {
                    intent = m40.m24460b(m24459a, m24461c, context, mo23008d, mo23737i);
                }
                if (!arrayList.isEmpty()) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i11 = 0;
                        loop0: while (i11 < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i11);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i12 = i11 + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intent = m40.m24460b(m24459a, resolveInfo, context, mo23008d, mo23737i);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent = m40.m24460b(m24459a, (ResolveInfo) arrayList.get(0), context, mo23008d, mo23737i);
                    }
                }
                intent = m24459a;
            }
        }
        if (z11 && this.f25021f != null && intent != null && m24848j(zzaVar, zq0Var.getContext(), intent.getData().toString(), str)) {
            return;
        }
        try {
            ((es0) zzaVar).mo21788s0(new zzc(intent, this.f25022g), z12);
        } catch (ActivityNotFoundException e11) {
            yk0.zzj(e11.getMessage());
        }
    }

    /* renamed from: i */
    private final void m24847i(boolean z11) {
        jc0 jc0Var = this.f25020e;
        if (jc0Var != null) {
            jc0Var.m23596h(z11);
        }
    }

    /* renamed from: j */
    private final boolean m24848j(zza zzaVar, Context context, String str, String str2) {
        boolean z11;
        boolean m22947v = zzt.zzo().m22947v(context);
        zzt.zzp();
        zzbr zzw = zzs.zzw(context);
        dt1 dt1Var = this.f25017b;
        if (dt1Var != null) {
            v22.m27130Q(context, dt1Var, this.f25018c, this.f25021f, str2, "offline_open");
        }
        zq0 zq0Var = (zq0) zzaVar;
        if (zq0Var.mo22517p().m25539i() && zq0Var.zzk() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m22947v) {
            this.f25021f.m24803o(this.f25019d, str2);
            return false;
        }
        zzt.zzp();
        if (C1335e1.m6691e(context).m6695a() && zzw != null && !z11) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21294k7)).booleanValue()) {
                if (zq0Var.mo22517p().m25539i()) {
                    v22.m27131W4(zq0Var.zzk(), null, zzw, this.f25021f, this.f25017b, this.f25018c, str2, str);
                } else {
                    ((es0) zzaVar).mo21790x0(zzw, this.f25021f, this.f25017b, this.f25018c, str2, str, 14);
                }
                dt1 dt1Var2 = this.f25017b;
                if (dt1Var2 != null) {
                    v22.m27130Q(context, dt1Var2, this.f25018c, this.f25021f, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.f25021f.m24799c(str2);
        if (this.f25017b != null) {
            HashMap hashMap = new HashMap();
            zzt.zzp();
            if (!C1335e1.m6691e(context).m6695a()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzw == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21294k7)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z11) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            v22.m27129I3(context, this.f25017b, this.f25018c, this.f25021f, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m24849k(int i11) {
        if (this.f25017b == null) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            rv2 rv2Var = this.f25018c;
            qv2 m25905b = qv2.m25905b("cct_action");
            m25905b.m25907a("cct_open_status", AbstractC4481ey.m21830a(i11));
            rv2Var.mo22194a(m25905b);
            return;
        }
        ct1 m21542a = this.f25017b.m21542a();
        m21542a.m21007b("action", "cct_action");
        m21542a.m21007b("cct_open_status", AbstractC4481ey.m21830a(i11));
        m21542a.m21012g();
    }

    @Override // com.google.android.gms.internal.ads.c40
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void mo19973a(zza zzaVar, Map map) {
        String str;
        boolean z11;
        boolean z12;
        boolean z13;
        HashMap hashMap;
        Object obj;
        zq0 zq0Var = (zq0) zzaVar;
        String m22027c = fj0.m22027c((String) map.get(C20217u.f99970o), zq0Var.getContext(), true);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            yk0.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzbVar = this.f25016a;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.f25016a.zzb(m22027c);
            return;
        }
        iq2 mo25866b = zq0Var.mo25866b();
        lq2 mo26710w = zq0Var.mo26710w();
        boolean z14 = false;
        if (mo25866b == null || mo26710w == null) {
            str = "";
            z11 = false;
        } else {
            z11 = mo25866b.f22334k0;
            str = mo26710w.f24014b;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21395u8)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) {
            z12 = false;
        } else {
            z12 = true;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zq0Var.mo26680M()) {
                yk0.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                m24847i(false);
                ((es0) zzaVar).mo21789v0(m24844f(map), m24841b(map), z12);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            m24847i(false);
            if (m22027c != null) {
                ((es0) zzaVar).mo21787n0(m24844f(map), m24841b(map), m22027c, z12);
                return;
            } else {
                ((es0) zzaVar).mo21786B0(m24844f(map), m24841b(map), (String) map.get("html"), (String) map.get("baseurl"), z12);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zq0Var.getContext();
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21005H3)).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21065N3)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                } else {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21045L3)).booleanValue()) {
                        String str3 = (String) zzay.zzc().m21823b(AbstractC4554gx.f21055M3);
                        if (!str3.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = x53.m27830c(v43.m27166b(';')).m27833d(str3).iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equals(packageName)) {
                                }
                            }
                        }
                    }
                    z14 = true;
                    break;
                }
            }
            boolean m22629g = C4555gy.m22629g(zq0Var.getContext());
            if (z14) {
                if (!m22629g) {
                    m24849k(4);
                } else {
                    m24847i(true);
                    if (TextUtils.isEmpty(m22027c)) {
                        yk0.zzj("Cannot open browser with null or empty url");
                        m24849k(7);
                        return;
                    }
                    Uri m24843d = m24843d(m24842c(zq0Var.getContext(), zq0Var.mo23008d(), Uri.parse(m22027c), zq0Var.mo23737i(), zq0Var.zzk()));
                    if (z11 && this.f25021f != null && m24848j(zzaVar, zq0Var.getContext(), m24843d.toString(), str)) {
                        return;
                    }
                    this.f25022g = new k40(this);
                    ((es0) zzaVar).mo21788s0(new zzc(null, m24843d.toString(), null, null, null, null, null, null, BinderC4273d.m19913I3(this.f25022g).asBinder(), true), z12);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            m24846h(zzaVar, map, z11, str, z12);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m24846h(zzaVar, map, z11, str, z12);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21214c7)).booleanValue()) {
                return;
            }
            m24847i(true);
            String str4 = (String) map.get("p");
            if (str4 == null) {
                yk0.zzj("Package name missing from open app action.");
                return;
            }
            if (z11 && this.f25021f != null && m24848j(zzaVar, zq0Var.getContext(), str4, str)) {
                return;
            }
            PackageManager packageManager = zq0Var.getContext().getPackageManager();
            if (packageManager == null) {
                yk0.zzj("Cannot get package manager from open app action.");
                return;
            }
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str4);
            if (launchIntentForPackage != null) {
                ((es0) zzaVar).mo21788s0(new zzc(launchIntentForPackage, this.f25022g), z12);
                return;
            }
            return;
        }
        m24847i(true);
        String str5 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str5)) {
            try {
                intent = Intent.parseUri(str5, 0);
            } catch (URISyntaxException e11) {
                yk0.zzh("Error parsing the url: ".concat(String.valueOf(str5)), e11);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri m24843d2 = m24843d(m24842c(zq0Var.getContext(), zq0Var.mo23008d(), data, zq0Var.mo23737i(), zq0Var.zzk()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21224d7)).booleanValue()) {
                        intent2.setDataAndType(m24843d2, intent2.getType());
                    }
                }
                intent2.setData(m24843d2);
            }
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21334o7)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id")) {
            z13 = true;
        } else {
            z13 = false;
        }
        HashMap hashMap2 = new HashMap();
        if (z13) {
            hashMap = hashMap2;
            obj = "p";
            this.f25022g = new l40(this, z12, zzaVar, hashMap2, map);
            z12 = false;
        } else {
            hashMap = hashMap2;
            obj = "p";
        }
        if (intent2 != null) {
            if (z11 && this.f25021f != null && m24848j(zzaVar, zq0Var.getContext(), intent2.getData().toString(), str)) {
                if (z13) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                    ((x60) zzaVar).mo23552V("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
            ((es0) zzaVar).mo21788s0(new zzc(intent2, this.f25022g), z12);
            return;
        }
        HashMap hashMap4 = hashMap;
        if (!TextUtils.isEmpty(m22027c)) {
            m22027c = m24843d(m24842c(zq0Var.getContext(), zq0Var.mo23008d(), Uri.parse(m22027c), zq0Var.mo23737i(), zq0Var.zzk())).toString();
        }
        if (z11 && this.f25021f != null && m24848j(zzaVar, zq0Var.getContext(), m22027c, str)) {
            if (z13) {
                hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                ((x60) zzaVar).mo23552V("openIntentAsync", hashMap4);
                return;
            }
            return;
        }
        ((es0) zzaVar).mo21788s0(new zzc((String) map.get("i"), m22027c, (String) map.get("m"), (String) map.get(obj), (String) map.get(C18711c.f94014e), (String) map.get("f"), (String) map.get(C30268e.f140632a), this.f25022g), z12);
    }
}

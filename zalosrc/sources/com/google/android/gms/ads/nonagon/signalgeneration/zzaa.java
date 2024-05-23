package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC4963ry;
import com.google.android.gms.internal.ads.AbstractC5184xw;
import com.google.android.gms.internal.ads.C4830od;
import com.google.android.gms.internal.ads.ac3;
import com.google.android.gms.internal.ads.br2;
import com.google.android.gms.internal.ads.de0;
import com.google.android.gms.internal.ads.f71;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.jw2;
import com.google.android.gms.internal.ads.kc3;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.kw2;
import com.google.android.gms.internal.ads.ld1;
import com.google.android.gms.internal.ads.nj0;
import com.google.android.gms.internal.ads.ox2;
import com.google.android.gms.internal.ads.pb3;
import com.google.android.gms.internal.ads.pj0;
import com.google.android.gms.internal.ads.qb3;
import com.google.android.gms.internal.ads.tc3;
import com.google.android.gms.internal.ads.uc3;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.vw2;
import com.google.android.gms.internal.ads.xo1;
import com.google.android.gms.internal.ads.xw2;
import com.google.android.gms.internal.ads.y43;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.ys1;
import com.google.android.gms.internal.ads.z53;
import com.google.android.gms.internal.ads.zr2;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaa extends pj0 {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcgv zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final vs0 zzf;
    private Context zzg;
    private final C4830od zzh;
    private final zr2 zzi;
    private final uc3 zzk;
    private final ScheduledExecutorService zzl;
    private zzcaa zzm;
    private final zzc zzq;
    private final it1 zzr;
    private final ox2 zzs;
    private ys1 zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21353q6)).booleanValue();
    private final boolean zzu = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21343p6)).booleanValue();
    private final boolean zzv = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21363r6)).booleanValue();
    private final boolean zzw = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21383t6)).booleanValue();
    private final String zzx = (String) zzay.zzc().m21823b(AbstractC4554gx.f21373s6);
    private final String zzy = (String) zzay.zzc().m21823b(AbstractC4554gx.f21393u6);
    private final String zzC = (String) zzay.zzc().m21823b(AbstractC4554gx.f21403v6);

    public zzaa(vs0 vs0Var, Context context, C4830od c4830od, zr2 zr2Var, uc3 uc3Var, ScheduledExecutorService scheduledExecutorService, it1 it1Var, ox2 ox2Var, zzcgv zzcgvVar) {
        List list;
        this.zzf = vs0Var;
        this.zzg = context;
        this.zzh = c4830od;
        this.zzi = zr2Var;
        this.zzk = uc3Var;
        this.zzl = scheduledExecutorService;
        this.zzq = vs0Var.mo22605q();
        this.zzr = it1Var;
        this.zzs = ox2Var;
        this.zzA = zzcgvVar;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21413w6)).booleanValue()) {
            this.zzD = zzX((String) zzay.zzc().m21823b(AbstractC4554gx.f21423x6));
            this.zzE = zzX((String) zzay.zzc().m21823b(AbstractC4554gx.f21433y6));
            this.zzF = zzX((String) zzay.zzc().m21823b(AbstractC4554gx.f21443z6));
            list = zzX((String) zzay.zzc().m21823b(AbstractC4554gx.f20938A6));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final ys1 ys1Var) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21193a6)).booleanValue()) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21253g6)).booleanValue()) {
            kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    zzaa.this.zzI(str, str2, ys1Var);
                }
            });
        } else {
            zzaaVar.zzq.zzd(str, str2, ys1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zzW(uri, "nas", str);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c11;
        br2 br2Var = new br2();
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f20958C6;
        if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
            if ("REWARDED".equals(str2)) {
                br2Var.m20677F().m24979a(2);
            } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
                br2Var.m20677F().m24979a(3);
            }
        }
        zzg mo22606r = this.zzf.mo22606r();
        f71 f71Var = new f71();
        f71Var.m21958c(context);
        if (str == null) {
            str = "adUnitId";
        }
        br2Var.m20681J(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        br2Var.m20693e(zzlVar);
        if (zzqVar == null) {
            if (!((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq();
            } else {
                switch (str2.hashCode()) {
                    case -1999289321:
                        if (str2.equals("NATIVE")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 543046670:
                        if (str2.equals("REWARDED")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1854800829:
                        if (str2.equals("REWARDED_INTERSTITIAL")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1951953708:
                        if (str2.equals("BANNER")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                if (c11 != 0) {
                    if (c11 != 1 && c11 != 2) {
                        if (c11 != 3) {
                            zzqVar = new com.google.android.gms.ads.internal.client.zzq();
                        } else {
                            zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
                        }
                    } else {
                        zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                    }
                } else {
                    zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
                }
            }
        }
        br2Var.m20680I(zzqVar);
        br2Var.m20686O(true);
        f71Var.m21961f(br2Var.m20695g());
        mo22606r.zza(f71Var.m21962g());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        mo22606r.zzb(new zzae(zzacVar, null));
        new ld1();
        zzh zzc2 = mo22606r.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final tc3 zzR(final String str) {
        final xo1[] xo1VarArr = new xo1[1];
        tc3 m23882n = kc3.m23882n(this.zzi.m28591a(), new qb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return zzaa.this.zzv(xo1VarArr, str, (xo1) obj);
            }
        }, this.zzk);
        m23882n.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(xo1VarArr);
            }
        }, this.zzk);
        return kc3.m23874f(kc3.m23881m((ac3) kc3.m23883o(ac3.m20071D(m23882n), ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f20998G6)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new y43() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                int i11 = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new y43() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                int i11 = zzaa.zze;
                yk0.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final InterfaceC4271b interfaceC4271b, de0 de0Var, boolean z11) {
        tc3 mo21339R;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20988F6)).booleanValue()) {
            yk0.zzj("The updating URL feature is not enabled.");
            try {
                de0Var.mo20484c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i11++;
            }
        }
        if (i11 > 1) {
            yk0.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzN(uri)) {
                yk0.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                mo21339R = kc3.m23877i(uri);
            } else {
                mo21339R = this.zzk.mo21339R(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, interfaceC4271b);
                    }
                });
                if (zzV()) {
                    mo21339R = kc3.m23882n(mo21339R, new qb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.qb3
                        public final tc3 zza(Object obj) {
                            tc3 m23881m;
                            m23881m = kc3.m23881m(r0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new y43() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.y43
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(r2, (String) obj2);
                                }
                            }, zzaa.this.zzk);
                            return m23881m;
                        }
                    }, this.zzk);
                } else {
                    yk0.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(mo21339R);
        }
        kc3.m23886r(kc3.m23873e(arrayList), new zzy(this, de0Var, z11), this.zzf.mo22592b());
    }

    private final void zzT(final List list, final InterfaceC4271b interfaceC4271b, de0 de0Var, boolean z11) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20988F6)).booleanValue()) {
            try {
                de0Var.mo20484c("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
                return;
            }
        }
        tc3 mo21339R = this.zzk.mo21339R(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, interfaceC4271b);
            }
        });
        if (zzV()) {
            mo21339R = kc3.m23882n(mo21339R, new qb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            yk0.zzi("Asset view map is empty.");
        }
        kc3.m23886r(mo21339R, new zzx(this, de0Var, z11), this.zzf.mo22592b());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzcaa zzcaaVar = this.zzm;
        if (zzcaaVar != null && (map = zzcaaVar.f31937q) != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i11 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i11) + str + "=" + str2 + "&" + uri2.substring(i11));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzX(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!z53.m28438d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ vw2 zzr(tc3 tc3Var, zzcfk zzcfkVar) {
        String str;
        if (!xw2.m28052a() || !((Boolean) AbstractC4963ry.f27410e.m24091e()).booleanValue()) {
            return null;
        }
        try {
            vw2 zzb2 = ((zzh) kc3.m23884p(tc3Var)).zzb();
            zzb2.m27363d(new ArrayList(Collections.singletonList(zzcfkVar.f32027q)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcfkVar.f32029s;
            if (zzlVar == null) {
                str = "";
            } else {
                str = zzlVar.zzp;
            }
            zzb2.m27361b(str);
            return zzb2;
        } catch (ExecutionException e11) {
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzW(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, InterfaceC4271b interfaceC4271b) throws Exception {
        String str;
        if (this.zzh.m25160c() != null) {
            str = this.zzh.m25160c().zzh(this.zzg, (View) BinderC4273d.m19914Q(interfaceC4271b), null);
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzO(uri)) {
                    yk0.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzW(uri, "ms", str));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(xo1[] xo1VarArr) {
        xo1 xo1Var = xo1VarArr[0];
        if (xo1Var != null) {
            this.zzi.m28592b(kc3.m23877i(xo1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(String str, String str2, ys1 ys1Var) {
        this.zzq.zzd(str, str2, ys1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zze(InterfaceC4271b interfaceC4271b, final zzcfk zzcfkVar, nj0 nj0Var) {
        tc3 m23877i;
        tc3 zzc2;
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        this.zzg = context;
        kw2 m23764a = jw2.m23764a(context, 22);
        m23764a.zzf();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21010H8)).booleanValue()) {
            uc3 uc3Var = kl0.f23363a;
            m23877i = uc3Var.mo21339R(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzcfkVar);
                }
            });
            zzc2 = kc3.m23882n(m23877i, new qb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.qb3
                public final tc3 zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, uc3Var);
        } else {
            zzh zzQ = zzQ(this.zzg, zzcfkVar.f32026p, zzcfkVar.f32027q, zzcfkVar.f32028r, zzcfkVar.f32029s);
            m23877i = kc3.m23877i(zzQ);
            zzc2 = zzQ.zzc();
        }
        kc3.m23886r(zzc2, new zzw(this, m23877i, zzcfkVar, nj0Var, m23764a, com.google.android.gms.ads.internal.zzt.zzB().mo105913a()), this.zzf.mo22592b());
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzf(zzcaa zzcaaVar) {
        this.zzm = zzcaaVar;
        this.zzi.m28593c(1);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzg(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        zzS(list, interfaceC4271b, de0Var, true);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzh(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        zzT(list, interfaceC4271b, de0Var, true);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(InterfaceC4271b interfaceC4271b) {
        tc3 zzc2;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21205b8)).booleanValue()) {
            return;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21215c8)).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21010H8)).booleanValue()) {
                zzc2 = kc3.m23880l(new pb3() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                    @Override // com.google.android.gms.internal.ads.pb3
                    public final tc3 zza() {
                        return zzaa.this.zzu();
                    }
                }, kl0.f23363a);
            } else {
                zzc2 = zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
            }
            kc3.m23886r(zzc2, new zzz(this), this.zzf.mo22592b());
        }
        WebView webView = (WebView) BinderC4273d.m19914Q(interfaceC4271b);
        if (webView == null) {
            yk0.zzg("The webView cannot be null.");
        } else if (this.zzp.contains(webView)) {
            yk0.zzi("This webview has already been registered.");
        } else {
            this.zzp.add(webView);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
        }
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzj(InterfaceC4271b interfaceC4271b) {
        View view;
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20988F6)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) BinderC4273d.m19914Q(interfaceC4271b);
        zzcaa zzcaaVar = this.zzm;
        if (zzcaaVar == null) {
            view = null;
        } else {
            view = zzcaaVar.f31936p;
        }
        this.zzn = zzbx.zza(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzn;
        obtain.setLocation(point.x, point.y);
        this.zzh.m25161d(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzk(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        zzS(list, interfaceC4271b, de0Var, false);
    }

    @Override // com.google.android.gms.internal.ads.qj0
    public final void zzl(List list, InterfaceC4271b interfaceC4271b, de0 de0Var) {
        zzT(list, interfaceC4271b, de0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, InterfaceC4271b interfaceC4271b) throws Exception {
        try {
            uri = this.zzh.m25158a(uri, this.zzg, (View) BinderC4273d.m19914Q(interfaceC4271b), null);
        } catch (zzapf e11) {
            yk0.zzk("", e11);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzh zzq(zzcfk zzcfkVar) throws Exception {
        return zzQ(this.zzg, zzcfkVar.f32026p, zzcfkVar.f32027q, zzcfkVar.f32028r, zzcfkVar.f32029s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ tc3 zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ tc3 zzv(xo1[] xo1VarArr, String str, xo1 xo1Var) throws Exception {
        xo1VarArr[0] = xo1Var;
        Context context = this.zzg;
        zzcaa zzcaaVar = this.zzm;
        Map map = zzcaaVar.f31937q;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzcaaVar.f31936p);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.f31936p);
        JSONObject zzf = zzbx.zzf(this.zzm.f31936p);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.f31936p);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return xo1Var.m27953d(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ tc3 zzw(final ArrayList arrayList) throws Exception {
        return kc3.m23881m(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new y43() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}

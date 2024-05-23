package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* loaded from: classes2.dex */
public final class b71 {

    /* renamed from: a */
    private final hv2 f17639a;

    /* renamed from: b */
    private final zzcgv f17640b;

    /* renamed from: c */
    private final ApplicationInfo f17641c;

    /* renamed from: d */
    private final String f17642d;

    /* renamed from: e */
    private final List f17643e;

    /* renamed from: f */
    private final PackageInfo f17644f;

    /* renamed from: g */
    private final d04 f17645g;

    /* renamed from: h */
    private final String f17646h;

    /* renamed from: i */
    private final vh2 f17647i;

    /* renamed from: j */
    private final zzg f17648j;

    public b71(hv2 hv2Var, zzcgv zzcgvVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, d04 d04Var, zzg zzgVar, String str2, vh2 vh2Var) {
        this.f17639a = hv2Var;
        this.f17640b = zzcgvVar;
        this.f17641c = applicationInfo;
        this.f17642d = str;
        this.f17643e = list;
        this.f17644f = packageInfo;
        this.f17645g = d04Var;
        this.f17646h = str2;
        this.f17647i = vh2Var;
        this.f17648j = zzgVar;
    }

    /* renamed from: a */
    public final /* synthetic */ zzcbc m20424a(tc3 tc3Var) {
        boolean z11;
        Bundle bundle = (Bundle) tc3Var.get();
        zzcgv zzcgvVar = this.f17640b;
        ApplicationInfo applicationInfo = this.f17641c;
        String str = this.f17642d;
        List list = this.f17643e;
        PackageInfo packageInfo = this.f17644f;
        String str2 = (String) ((tc3) this.f17645g.zzb()).get();
        String str3 = this.f17646h;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21313m6)).booleanValue()) {
            z11 = this.f17648j.zzP();
        } else {
            z11 = false;
        }
        return new zzcbc(bundle, zzcgvVar, applicationInfo, str, list, packageInfo, str2, str3, null, null, z11);
    }

    /* renamed from: b */
    public final tc3 m20425b() {
        hv2 hv2Var = this.f17639a;
        return qu2.m25890c(this.f17647i.m27224a(new Bundle()), bv2.SIGNALS, hv2Var).m28018a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.a71.<init>(com.google.android.gms.internal.ads.b71, com.google.android.gms.internal.ads.tc3):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: c */
    public final com.google.android.gms.internal.ads.tc3 m20426c() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.tc3 r0 = r6.m20425b()
            com.google.android.gms.internal.ads.hv2 r1 = r6.f17639a
            com.google.android.gms.internal.ads.bv2 r2 = com.google.android.gms.internal.ads.bv2.REQUEST_PARCEL
            r3 = 2
            com.google.android.gms.internal.ads.tc3[] r3 = new com.google.android.gms.internal.ads.tc3[r3]
            r4 = 0
            r3[r4] = r0
            com.google.android.gms.internal.ads.d04 r4 = r6.f17645g
            java.lang.Object r4 = r4.zzb()
            com.google.android.gms.internal.ads.tc3 r4 = (com.google.android.gms.internal.ads.tc3) r4
            r5 = 1
            r3[r5] = r4
            com.google.android.gms.internal.ads.ou2 r1 = r1.m28360a(r2, r3)
            com.google.android.gms.internal.ads.a71 r2 = new com.google.android.gms.internal.ads.a71
            r2.<init>()
            com.google.android.gms.internal.ads.xu2 r0 = r1.m25330a(r2)
            com.google.android.gms.internal.ads.lu2 r0 = r0.m28018a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b71.m20426c():com.google.android.gms.internal.ads.tc3");
    }
}

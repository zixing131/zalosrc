package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.client.zzaw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p229i5.AbstractC20291l;

/* loaded from: classes2.dex */
public final class h02 extends ef0 {

    /* renamed from: p */
    private final Context f21481p;

    /* renamed from: q */
    private final Executor f21482q;

    /* renamed from: r */
    private final uc3 f21483r;

    /* renamed from: s */
    private final xf0 f21484s;

    /* renamed from: t */
    private final fy0 f21485t;

    /* renamed from: u */
    private final ArrayDeque f21486u;

    /* renamed from: v */
    private final xw2 f21487v;

    /* renamed from: w */
    private final yf0 f21488w;

    /* renamed from: x */
    private final m02 f21489x;

    public h02(Context context, Executor executor, uc3 uc3Var, yf0 yf0Var, fy0 fy0Var, xf0 xf0Var, ArrayDeque arrayDeque, m02 m02Var, xw2 xw2Var, byte[] bArr) {
        AbstractC4554gx.m22622c(context);
        this.f21481p = context;
        this.f21482q = executor;
        this.f21483r = uc3Var;
        this.f21488w = yf0Var;
        this.f21484s = xf0Var;
        this.f21485t = fy0Var;
        this.f21486u = arrayDeque;
        this.f21489x = m02Var;
        this.f21487v = xw2Var;
    }

    /* renamed from: Z4 */
    private final synchronized e02 m22657Z4(String str) {
        Iterator it = this.f21486u.iterator();
        while (it.hasNext()) {
            e02 e02Var = (e02) it.next();
            if (e02Var.f19480d.equals(str)) {
                it.remove();
                return e02Var;
            }
        }
        return null;
    }

    /* renamed from: a5 */
    private final synchronized e02 m22658a5(String str) {
        Iterator it = this.f21486u.iterator();
        while (it.hasNext()) {
            e02 e02Var = (e02) it.next();
            if (e02Var.f19479c.equals(str)) {
                it.remove();
                return e02Var;
            }
        }
        return null;
    }

    /* renamed from: b5 */
    private static tc3 m22659b5(tc3 tc3Var, hv2 hv2Var, u80 u80Var, vw2 vw2Var, kw2 kw2Var) {
        k80 m26871a = u80Var.m26871a("AFMA_getAdDictionary", r80.f27138b, yz1.f31285a);
        uw2.m27078d(tc3Var, kw2Var);
        lu2 m28018a = hv2Var.m28361b(bv2.BUILD_URL, tc3Var).m28023f(m26871a).m28018a();
        uw2.m27077c(m28018a, vw2Var, kw2Var);
        return m28018a;
    }

    /* renamed from: c5 */
    private static tc3 m22660c5(zzcbc zzcbcVar, hv2 hv2Var, li2 li2Var) {
        rz1 rz1Var = new qb3() { // from class: com.google.android.gms.internal.ads.rz1
            public /* synthetic */ rz1() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return li2.this.mo21808b().m27224a(zzaw.zzb().m26119j((Bundle) obj));
            }
        };
        return hv2Var.m28361b(bv2.GMS_SIGNALS, kc3.m23877i(zzcbcVar.f32001p)).m28023f(rz1Var).m28022e(sz1.f28064a).m28018a();
    }

    /* renamed from: d5 */
    private final synchronized void m22661d5(e02 e02Var) {
        zzq();
        this.f21486u.addLast(e02Var);
    }

    /* renamed from: e5 */
    private final void m22662e5(tc3 tc3Var, jf0 jf0Var) {
        kc3.m23886r(kc3.m23882n(tc3Var, new qb3() { // from class: com.google.android.gms.internal.ads.b02
            public /* synthetic */ b02() {
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                kl0.f23363a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bs2

                    /* renamed from: p */
                    public final /* synthetic */ InputStream f17977p;

                    /* renamed from: q */
                    public final /* synthetic */ ParcelFileDescriptor f17978q;

                    public /* synthetic */ bs2(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor2) {
                        r1 = inputStream;
                        r2 = parcelFileDescriptor2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream = r1;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(r2);
                                try {
                                    AbstractC20291l.m105940b(inputStream, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } finally {
                                }
                            } catch (IOException unused) {
                            }
                        } finally {
                        }
                    }
                });
                return kc3.m23877i(parcelFileDescriptor);
            }
        }, kl0.f23363a), new d02(this, jf0Var), kl0.f23368f);
    }

    private final synchronized void zzq() {
        int intValue = ((Long) AbstractC4482ez.f19862c.m24091e()).intValue();
        while (this.f21486u.size() >= intValue) {
            this.f21486u.removeFirst();
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: B2 */
    public final void mo21363B2(zzcbc zzcbcVar, jf0 jf0Var) {
        m22662e5(m22664N(zzcbcVar, Binder.getCallingUid()), jf0Var);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.zz1.<init>(com.google.android.gms.internal.ads.vh2):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: I3 */
    public final com.google.android.gms.internal.ads.tc3 m22663I3(com.google.android.gms.internal.ads.zzcbc r7, int r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.l80 r0 = com.google.android.gms.ads.internal.zzt.zzf()
            android.content.Context r1 = r6.f21481p
            com.google.android.gms.internal.ads.zzcgv r2 = com.google.android.gms.internal.ads.zzcgv.m28720t()
            com.google.android.gms.internal.ads.xw2 r3 = r6.f21487v
            com.google.android.gms.internal.ads.u80 r0 = r0.m24169b(r1, r2, r3)
            com.google.android.gms.internal.ads.ky r1 = com.google.android.gms.internal.ads.AbstractC4703kz.f23650a
            java.lang.Object r1 = r1.m24091e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L2a
            java.lang.Exception r7 = new java.lang.Exception
            java.lang.String r8 = "Signal collection disabled."
            r7.<init>(r8)
            com.google.android.gms.internal.ads.tc3 r7 = com.google.android.gms.internal.ads.kc3.m23876h(r7)
            return r7
        L2a:
            com.google.android.gms.internal.ads.fy0 r1 = r6.f21485t
            com.google.android.gms.internal.ads.li2 r8 = r1.mo22252a(r7, r8)
            com.google.android.gms.internal.ads.vh2 r1 = r8.mo21807a()
            com.google.android.gms.internal.ads.o80 r2 = com.google.android.gms.internal.ads.r80.f27138b
            com.google.android.gms.internal.ads.m80 r3 = com.google.android.gms.internal.ads.r80.f27139c
            java.lang.String r4 = "google.afma.request.getSignals"
            com.google.android.gms.internal.ads.k80 r0 = r0.m26871a(r4, r2, r3)
            android.content.Context r2 = r6.f21481p
            r3 = 22
            com.google.android.gms.internal.ads.kw2 r2 = com.google.android.gms.internal.ads.jw2.m23764a(r2, r3)
            com.google.android.gms.internal.ads.hv2 r3 = r8.mo21809c()
            com.google.android.gms.internal.ads.bv2 r4 = com.google.android.gms.internal.ads.bv2.GET_SIGNALS
            android.os.Bundle r5 = r7.f32001p
            com.google.android.gms.internal.ads.tc3 r5 = com.google.android.gms.internal.ads.kc3.m23877i(r5)
            com.google.android.gms.internal.ads.xu2 r3 = r3.m28361b(r4, r5)
            com.google.android.gms.internal.ads.qw2 r4 = new com.google.android.gms.internal.ads.qw2
            r4.<init>(r2)
            com.google.android.gms.internal.ads.xu2 r3 = r3.m28022e(r4)
            com.google.android.gms.internal.ads.zz1 r4 = new com.google.android.gms.internal.ads.zz1
            r4.<init>()
            com.google.android.gms.internal.ads.xu2 r1 = r3.m28023f(r4)
            com.google.android.gms.internal.ads.bv2 r3 = com.google.android.gms.internal.ads.bv2.JS_SIGNALS
            com.google.android.gms.internal.ads.xu2 r1 = r1.m28019b(r3)
            com.google.android.gms.internal.ads.xu2 r0 = r1.m28023f(r0)
            com.google.android.gms.internal.ads.lu2 r0 = r0.m28018a()
            com.google.android.gms.internal.ads.vw2 r8 = r8.mo21810d()
            android.os.Bundle r7 = r7.f32001p
            java.lang.String r1 = "ad_types"
            java.util.ArrayList r7 = r7.getStringArrayList(r1)
            r8.m27363d(r7)
            com.google.android.gms.internal.ads.uw2.m27076b(r0, r8, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h02.m22663I3(com.google.android.gms.internal.ads.zzcbc, int):com.google.android.gms.internal.ads.tc3");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.xz1.<init>(com.google.android.gms.internal.ads.h02, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.zzcbc, com.google.android.gms.internal.ads.kw2):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: N */
    public final com.google.android.gms.internal.ads.tc3 m22664N(com.google.android.gms.internal.ads.zzcbc r9, int r10) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.ky r0 = com.google.android.gms.internal.ads.AbstractC4482ez.f19860a
            java.lang.Object r0 = r0.m24091e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Split request is disabled."
            r9.<init>(r10)
            com.google.android.gms.internal.ads.tc3 r9 = com.google.android.gms.internal.ads.kc3.m23876h(r9)
            return r9
        L1a:
            com.google.android.gms.internal.ads.zzffx r0 = r9.f32009x
            if (r0 != 0) goto L2a
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Pool configuration missing from request."
            r9.<init>(r10)
            com.google.android.gms.internal.ads.tc3 r9 = com.google.android.gms.internal.ads.kc3.m23876h(r9)
            return r9
        L2a:
            int r1 = r0.f32106t
            if (r1 == 0) goto L81
            int r0 = r0.f32107u
            if (r0 != 0) goto L33
            goto L81
        L33:
            com.google.android.gms.internal.ads.l80 r0 = com.google.android.gms.ads.internal.zzt.zzf()
            android.content.Context r1 = r8.f21481p
            com.google.android.gms.internal.ads.zzcgv r2 = com.google.android.gms.internal.ads.zzcgv.m28720t()
            com.google.android.gms.internal.ads.xw2 r3 = r8.f21487v
            com.google.android.gms.internal.ads.u80 r0 = r0.m24169b(r1, r2, r3)
            com.google.android.gms.internal.ads.fy0 r1 = r8.f21485t
            com.google.android.gms.internal.ads.li2 r10 = r1.mo22252a(r9, r10)
            com.google.android.gms.internal.ads.hv2 r1 = r10.mo21809c()
            com.google.android.gms.internal.ads.tc3 r5 = m22660c5(r9, r1, r10)
            com.google.android.gms.internal.ads.vw2 r10 = r10.mo21810d()
            android.content.Context r2 = r8.f21481p
            r3 = 9
            com.google.android.gms.internal.ads.kw2 r7 = com.google.android.gms.internal.ads.jw2.m23764a(r2, r3)
            com.google.android.gms.internal.ads.tc3 r4 = m22659b5(r5, r1, r0, r10, r7)
            com.google.android.gms.internal.ads.bv2 r10 = com.google.android.gms.internal.ads.bv2.GET_URL_AND_CACHE_KEY
            r0 = 2
            com.google.android.gms.internal.ads.tc3[] r0 = new com.google.android.gms.internal.ads.tc3[r0]
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r4
            com.google.android.gms.internal.ads.ou2 r10 = r1.m28360a(r10, r0)
            com.google.android.gms.internal.ads.xz1 r0 = new com.google.android.gms.internal.ads.xz1
            r2 = r0
            r3 = r8
            r6 = r9
            r2.<init>()
            com.google.android.gms.internal.ads.xu2 r9 = r10.m25330a(r0)
            com.google.android.gms.internal.ads.lu2 r9 = r9.m28018a()
            return r9
        L81:
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "Caching is disabled."
            r9.<init>(r10)
            com.google.android.gms.internal.ads.tc3 r9 = com.google.android.gms.internal.ads.kc3.m23876h(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h02.m22664N(com.google.android.gms.internal.ads.zzcbc, int):com.google.android.gms.internal.ads.tc3");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.uz1.<init>(com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3):void, class status: GENERATED_AND_UNLOADED
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
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: Q */
    public final com.google.android.gms.internal.ads.tc3 m22665Q(com.google.android.gms.internal.ads.zzcbc r17, int r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h02.m22665Q(com.google.android.gms.internal.ads.zzcbc, int):com.google.android.gms.internal.ads.tc3");
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: S3 */
    public final void mo21364S3(String str, jf0 jf0Var) {
        m22662e5(m22666W4(str), jf0Var);
    }

    /* renamed from: W4 */
    public final tc3 m22666W4(String str) {
        e02 m22657Z4;
        if (!((Boolean) AbstractC4482ez.f19860a.m24091e()).booleanValue()) {
            return kc3.m23876h(new Exception("Split request is disabled."));
        }
        c02 c02Var = new c02(this);
        if (((Boolean) AbstractC4482ez.f19863d.m24091e()).booleanValue()) {
            m22657Z4 = m22658a5(str);
        } else {
            m22657Z4 = m22657Z4(str);
        }
        if (m22657Z4 == null) {
            return kc3.m23876h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return kc3.m23877i(c02Var);
    }

    /* renamed from: X4 */
    public final /* synthetic */ InputStream m22667X4(tc3 tc3Var, tc3 tc3Var2, zzcbc zzcbcVar, kw2 kw2Var) {
        String m25430c = ((pf0) tc3Var.get()).m25430c();
        m22661d5(new e02((pf0) tc3Var.get(), (JSONObject) tc3Var2.get(), zzcbcVar.f32008w, m25430c, kw2Var));
        return new ByteArrayInputStream(m25430c.getBytes(w43.f29782c));
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: j3 */
    public final void mo21365j3(zzcbc zzcbcVar, jf0 jf0Var) {
        tc3 m22665Q = m22665Q(zzcbcVar, Binder.getCallingUid());
        m22662e5(m22665Q, jf0Var);
        if (((Boolean) AbstractC5149wy.f30262j.m24091e()).booleanValue()) {
            m22665Q.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.tz1
                public /* synthetic */ tz1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nl0.m24944a(h02.this.f21484s.mo27605a(), "persistFlags");
                }
            }, this.f21483r);
        } else {
            m22665Q.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.tz1
                public /* synthetic */ tz1() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nl0.m24944a(h02.this.f21484s.mo27605a(), "persistFlags");
                }
            }, this.f21482q);
        }
    }

    @Override // com.google.android.gms.internal.ads.ff0
    /* renamed from: y3 */
    public final void mo21366y3(zzcbc zzcbcVar, jf0 jf0Var) {
        m22662e5(m22663I3(zzcbcVar, Binder.getCallingUid()), jf0Var);
    }
}

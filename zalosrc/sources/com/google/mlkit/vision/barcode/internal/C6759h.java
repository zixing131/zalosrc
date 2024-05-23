package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.mlkit.common.MlKitException;
import java.util.List;
import p234ia.AbstractC20458f;
import p234ia.C20464i;
import p294ka.C21631b;
import p385oa.C24141a;
import p670y5.C30300a3;
import p670y5.C30318b1;
import p670y5.C30424gc;
import p670y5.C30499kb;
import p670y5.C30561ng;
import p670y5.C30575ob;
import p670y5.C30599pg;
import p670y5.C30618qg;
import p670y5.C30652sc;
import p670y5.C30708vb;
import p670y5.C30737x2;
import p670y5.EnumC30367dc;
import p670y5.EnumC30386ec;
import p670y5.EnumC30405fc;
import p670y5.EnumC30594pb;
import p670y5.InterfaceC30352cg;
import pa.C24701a;
import pa.C24705e;

/* renamed from: com.google.mlkit.vision.barcode.internal.h */
/* loaded from: classes3.dex */
public final class C6759h extends AbstractC20458f {

    /* renamed from: j */
    private static final C24705e f37156j = C24705e.m128288b();

    /* renamed from: k */
    static boolean f37157k = true;

    /* renamed from: d */
    private final C21631b f37158d;

    /* renamed from: e */
    private final InterfaceC6760i f37159e;

    /* renamed from: f */
    private final C30561ng f37160f;

    /* renamed from: g */
    private final C30599pg f37161g;

    /* renamed from: h */
    private final C24701a f37162h = new C24701a();

    /* renamed from: i */
    private boolean f37163i;

    public C6759h(C20464i c20464i, C21631b c21631b, InterfaceC6760i interfaceC6760i, C30561ng c30561ng) {
        AbstractC4205o.m19723l(c20464i, "MlKitContext can not be null");
        AbstractC4205o.m19723l(c21631b, "BarcodeScannerOptions can not be null");
        this.f37158d = c21631b;
        this.f37159e = interfaceC6760i;
        this.f37160f = c30561ng;
        this.f37161g = C30599pg.m149607a(c20464i.m106497b());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: y5.kg.<init>(y5.ng, y5.fc, java.lang.Object, long, com.google.mlkit.vision.barcode.internal.g):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: m */
    private final void m34578m(p670y5.EnumC30386ec r28, long r29, p385oa.C24141a r31, java.util.List r32) {
        /*
            r27 = this;
            r8 = r27
            y5.b1 r9 = new y5.b1
            r9.<init>()
            y5.b1 r10 = new y5.b1
            r10.<init>()
            if (r32 == 0) goto L35
            java.util.Iterator r0 = r32.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            la.a r1 = (la.C22166a) r1
            int r2 = r1.m115781c()
            y5.qc r2 = com.google.mlkit.vision.barcode.internal.AbstractC6753b.m34570a(r2)
            r9.m149464e(r2)
            int r1 = r1.m115784f()
            y5.rc r1 = com.google.mlkit.vision.barcode.internal.AbstractC6753b.m34571b(r1)
            r10.m149464e(r1)
            goto L12
        L35:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r18 = r0 - r29
            com.google.mlkit.vision.barcode.internal.f r11 = new com.google.mlkit.vision.barcode.internal.f
            r0 = r11
            r1 = r27
            r2 = r18
            r4 = r28
            r5 = r9
            r6 = r10
            r7 = r31
            r0.<init>()
            y5.ng r0 = r8.f37160f
            y5.fc r1 = p670y5.EnumC30405fc.ON_DEVICE_BARCODE_DETECT
            r0.m149589f(r11, r1)
            y5.y2 r0 = new y5.y2
            r0.<init>()
            r1 = r28
            r0.m149707e(r1)
            boolean r2 = com.google.mlkit.vision.barcode.internal.C6759h.f37157k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.m149708f(r2)
            ka.b r2 = r8.f37158d
            y5.wf r2 = com.google.mlkit.vision.barcode.internal.AbstractC6753b.m34572c(r2)
            r0.m149709g(r2)
            y5.e1 r2 = r9.m149466g()
            r0.m149705c(r2)
            y5.e1 r2 = r10.m149466g()
            r0.m149706d(r2)
            y5.a3 r14 = r0.m149710h()
            com.google.mlkit.vision.barcode.internal.g r0 = new com.google.mlkit.vision.barcode.internal.g
            r0.<init>(r8)
            y5.ng r12 = r8.f37160f
            y5.fc r13 = p670y5.EnumC30405fc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION
            java.util.concurrent.Executor r2 = p234ia.C20460g.m106489d()
            y5.kg r3 = new y5.kg
            r11 = r3
            r15 = r18
            r17 = r0
            r11.<init>()
            r2.execute(r3)
            long r25 = java.lang.System.currentTimeMillis()
            boolean r0 = r8.f37163i
            long r23 = r25 - r18
            y5.pg r2 = r8.f37161g
            r3 = 1
            if (r3 == r0) goto Lac
            r0 = 24301(0x5eed, float:3.4053E-41)
            r21 = 24301(0x5eed, float:3.4053E-41)
            goto Lb0
        Lac:
            r0 = 24302(0x5eee, float:3.4054E-41)
            r21 = 24302(0x5eee, float:3.4054E-41)
        Lb0:
            int r22 = r28.zza()
            r20 = r2
            r20.m149609c(r21, r22, r23, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.barcode.internal.C6759h.m34578m(y5.ec, long, oa.a, java.util.List):void");
    }

    @Override // p234ia.AbstractC20468k
    /* renamed from: b */
    public final synchronized void mo34579b() {
        this.f37163i = this.f37159e.zzc();
    }

    @Override // p234ia.AbstractC20468k
    /* renamed from: d */
    public final synchronized void mo34580d() {
        EnumC30367dc enumC30367dc;
        try {
            this.f37159e.zzb();
            f37157k = true;
            C30561ng c30561ng = this.f37160f;
            C30424gc c30424gc = new C30424gc();
            if (this.f37163i) {
                enumC30367dc = EnumC30367dc.TYPE_THICK;
            } else {
                enumC30367dc = EnumC30367dc.TYPE_THIN;
            }
            c30424gc.m149518e(enumC30367dc);
            C30652sc c30652sc = new C30652sc();
            c30652sc.m149629i(AbstractC6753b.m34572c(this.f37158d));
            c30424gc.m149520g(c30652sc.m149630j());
            c30561ng.m149587d(C30618qg.m149613d(c30424gc), EnumC30405fc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public final /* synthetic */ InterfaceC30352cg m34582j(long j11, EnumC30386ec enumC30386ec, C30318b1 c30318b1, C30318b1 c30318b12, C24141a c24141a) {
        EnumC30594pb enumC30594pb;
        EnumC30367dc enumC30367dc;
        C30652sc c30652sc = new C30652sc();
        C30708vb c30708vb = new C30708vb();
        c30708vb.m149674c(Long.valueOf(j11));
        c30708vb.m149675d(enumC30386ec);
        c30708vb.m149676e(Boolean.valueOf(f37157k));
        Boolean bool = Boolean.TRUE;
        c30708vb.m149672a(bool);
        c30708vb.m149673b(bool);
        c30652sc.m149628h(c30708vb.m149677f());
        c30652sc.m149629i(AbstractC6753b.m34572c(this.f37158d));
        c30652sc.m149625e(c30318b1.m149466g());
        c30652sc.m149626f(c30318b12.m149466g());
        int m126122g = c24141a.m126122g();
        int m128291d = f37156j.m128291d(c24141a);
        C30575ob c30575ob = new C30575ob();
        if (m126122g != -1) {
            if (m126122g != 35) {
                if (m126122g != 842094169) {
                    if (m126122g != 16) {
                        if (m126122g != 17) {
                            enumC30594pb = EnumC30594pb.UNKNOWN_FORMAT;
                        } else {
                            enumC30594pb = EnumC30594pb.NV21;
                        }
                    } else {
                        enumC30594pb = EnumC30594pb.NV16;
                    }
                } else {
                    enumC30594pb = EnumC30594pb.YV12;
                }
            } else {
                enumC30594pb = EnumC30594pb.YUV_420_888;
            }
        } else {
            enumC30594pb = EnumC30594pb.BITMAP;
        }
        c30575ob.m149595a(enumC30594pb);
        c30575ob.m149596b(Integer.valueOf(m128291d));
        c30652sc.m149627g(c30575ob.m149597d());
        C30424gc c30424gc = new C30424gc();
        if (this.f37163i) {
            enumC30367dc = EnumC30367dc.TYPE_THICK;
        } else {
            enumC30367dc = EnumC30367dc.TYPE_THIN;
        }
        c30424gc.m149518e(enumC30367dc);
        c30424gc.m149520g(c30652sc.m149630j());
        return C30618qg.m149613d(c30424gc);
    }

    /* renamed from: k */
    public final /* synthetic */ InterfaceC30352cg m34583k(C30300a3 c30300a3, int i11, C30499kb c30499kb) {
        EnumC30367dc enumC30367dc;
        C30424gc c30424gc = new C30424gc();
        if (this.f37163i) {
            enumC30367dc = EnumC30367dc.TYPE_THICK;
        } else {
            enumC30367dc = EnumC30367dc.TYPE_THIN;
        }
        c30424gc.m149518e(enumC30367dc);
        C30737x2 c30737x2 = new C30737x2();
        c30737x2.m149690a(Integer.valueOf(i11));
        c30737x2.m149692c(c30300a3);
        c30737x2.m149691b(c30499kb);
        c30424gc.m149517d(c30737x2.m149693e());
        return C30618qg.m149613d(c30424gc);
    }

    @Override // p234ia.AbstractC20458f
    /* renamed from: l */
    public final synchronized List mo34581i(C24141a c24141a) {
        EnumC30386ec enumC30386ec;
        List mo34585a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f37162h.m128271a(c24141a);
        try {
            mo34585a = this.f37159e.mo34585a(c24141a);
            m34578m(EnumC30386ec.NO_ERROR, elapsedRealtime, c24141a, mo34585a);
            f37157k = false;
        } catch (MlKitException e11) {
            if (e11.m34567a() == 14) {
                enumC30386ec = EnumC30386ec.MODEL_NOT_DOWNLOADED;
            } else {
                enumC30386ec = EnumC30386ec.UNKNOWN_ERROR;
            }
            m34578m(enumC30386ec, elapsedRealtime, c24141a, null);
            throw e11;
        }
        return mo34585a;
    }
}

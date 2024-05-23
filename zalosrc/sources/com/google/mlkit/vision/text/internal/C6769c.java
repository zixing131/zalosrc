package com.google.mlkit.vision.text.internal;

import android.os.SystemClock;
import com.google.mlkit.common.MlKitException;
import p012a6.C0271gc;
import p012a6.C0346kb;
import p012a6.C0422ob;
import p012a6.C0425oe;
import p012a6.C0427og;
import p012a6.C0433p3;
import p012a6.C0463qe;
import p012a6.C0465qg;
import p012a6.C0482re;
import p012a6.C0484rg;
import p012a6.C0490s3;
import p012a6.C0554vb;
import p012a6.EnumC0214dc;
import p012a6.EnumC0233ec;
import p012a6.EnumC0441pb;
import p012a6.InterfaceC0218dg;
import p234ia.AbstractC20458f;
import p234ia.C20464i;
import p234ia.C20471n;
import p385oa.C24141a;
import pa.C24705e;
import qa.C25202a;
import qa.InterfaceC25205d;

/* renamed from: com.google.mlkit.vision.text.internal.c */
/* loaded from: classes3.dex */
public class C6769c extends AbstractC20458f {

    /* renamed from: i */
    static boolean f37196i = true;

    /* renamed from: d */
    private final InterfaceC6776j f37198d;

    /* renamed from: e */
    private final C0427og f37199e;

    /* renamed from: f */
    private final C0465qg f37200f;

    /* renamed from: g */
    private final InterfaceC25205d f37201g;

    /* renamed from: j */
    private static final C24705e f37197j = C24705e.m128288b();

    /* renamed from: h */
    private static final C20471n f37195h = new C20471n();

    public C6769c(C0427og c0427og, InterfaceC6776j interfaceC6776j, InterfaceC25205d interfaceC25205d) {
        super(f37195h);
        this.f37199e = c0427og;
        this.f37198d = interfaceC6776j;
        this.f37200f = C0465qg.m856a(C20464i.m106493c().m106497b());
        this.f37201g = interfaceC25205d;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: a6.lg.<init>(a6.og, a6.fc, java.lang.Object, long, com.google.mlkit.vision.text.internal.n):void, class status: GENERATED_AND_UNLOADED
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
    private final void m34595m(p012a6.EnumC0233ec r24, long r25, p385oa.C24141a r27) {
        /*
            r23 = this;
            r6 = r23
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r14 = r0 - r25
            com.google.mlkit.vision.text.internal.m r7 = new com.google.mlkit.vision.text.internal.m
            r0 = r7
            r1 = r23
            r2 = r14
            r4 = r24
            r5 = r27
            r0.<init>()
            a6.og r0 = r6.f37199e
            a6.fc r1 = p012a6.EnumC0252fc.ON_DEVICE_TEXT_DETECT
            r0.m815f(r7, r1)
            a6.q3 r0 = new a6.q3
            r0.<init>()
            r1 = r24
            r0.m849a(r1)
            boolean r2 = com.google.mlkit.vision.text.internal.C6769c.f37196i
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.m850b(r2)
            a6.re r2 = new a6.re
            r2.<init>()
            qa.d r3 = r6.f37201g
            int r3 = r3.mo130464h()
            a6.se r3 = com.google.mlkit.vision.text.internal.AbstractC6767a.m34592a(r3)
            r2.m866a(r3)
            a6.ue r2 = r2.m867c()
            r0.m851c(r2)
            a6.s3 r10 = r0.m852d()
            com.google.mlkit.vision.text.internal.n r13 = new com.google.mlkit.vision.text.internal.n
            r13.<init>(r6)
            a6.og r8 = r6.f37199e
            a6.fc r9 = p012a6.EnumC0252fc.AGGREGATED_ON_DEVICE_TEXT_DETECTION
            java.util.concurrent.Executor r0 = p234ia.C20460g.m106489d()
            a6.lg r2 = new a6.lg
            r7 = r2
            r11 = r14
            r7.<init>()
            r0.execute(r2)
            long r21 = java.lang.System.currentTimeMillis()
            a6.qg r0 = r6.f37200f
            qa.d r2 = r6.f37201g
            int r17 = r2.mo130460d()
            long r19 = r21 - r14
            int r18 = r24.zza()
            r16 = r0
            r16.m858c(r17, r18, r19, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.vision.text.internal.C6769c.m34595m(a6.ec, long, oa.a):void");
    }

    @Override // p234ia.AbstractC20468k
    /* renamed from: b */
    public final synchronized void mo34579b() {
        this.f37198d.zzb();
    }

    @Override // p234ia.AbstractC20468k
    /* renamed from: d */
    public final synchronized void mo34580d() {
        f37196i = true;
        this.f37198d.zzc();
    }

    /* renamed from: j */
    public final /* synthetic */ InterfaceC0218dg m34596j(long j11, EnumC0233ec enumC0233ec, C24141a c24141a) {
        EnumC0441pb enumC0441pb;
        EnumC0214dc enumC0214dc;
        C0425oe c0425oe = new C0425oe();
        C0554vb c0554vb = new C0554vb();
        c0554vb.m890c(Long.valueOf(j11));
        c0554vb.m891d(enumC0233ec);
        c0554vb.m892e(Boolean.valueOf(f37196i));
        Boolean bool = Boolean.TRUE;
        c0554vb.m888a(bool);
        c0554vb.m889b(bool);
        c0425oe.m804d(c0554vb.m893f());
        C24705e c24705e = f37197j;
        int m128290c = c24705e.m128290c(c24141a);
        int m128291d = c24705e.m128291d(c24141a);
        C0422ob c0422ob = new C0422ob();
        if (m128290c != -1) {
            if (m128290c != 35) {
                if (m128290c != 842094169) {
                    if (m128290c != 16) {
                        if (m128290c != 17) {
                            enumC0441pb = EnumC0441pb.UNKNOWN_FORMAT;
                        } else {
                            enumC0441pb = EnumC0441pb.NV21;
                        }
                    } else {
                        enumC0441pb = EnumC0441pb.NV16;
                    }
                } else {
                    enumC0441pb = EnumC0441pb.YV12;
                }
            } else {
                enumC0441pb = EnumC0441pb.YUV_420_888;
            }
        } else {
            enumC0441pb = EnumC0441pb.BITMAP;
        }
        c0422ob.m797a(enumC0441pb);
        c0422ob.m798b(Integer.valueOf(m128291d));
        c0425oe.m803c(c0422ob.m799d());
        C0482re c0482re = new C0482re();
        c0482re.m866a(AbstractC6767a.m34592a(this.f37201g.mo130464h()));
        c0425oe.m805e(c0482re.m867c());
        C0463qe m806f = c0425oe.m806f();
        C0271gc c0271gc = new C0271gc();
        if (this.f37201g.mo130459c()) {
            enumC0214dc = EnumC0214dc.TYPE_THICK;
        } else {
            enumC0214dc = EnumC0214dc.TYPE_THIN;
        }
        c0271gc.m735e(enumC0214dc);
        c0271gc.m738h(m806f);
        return C0484rg.m868d(c0271gc);
    }

    /* renamed from: k */
    public final /* synthetic */ InterfaceC0218dg m34597k(C0490s3 c0490s3, int i11, C0346kb c0346kb) {
        EnumC0214dc enumC0214dc;
        C0271gc c0271gc = new C0271gc();
        if (this.f37201g.mo130459c()) {
            enumC0214dc = EnumC0214dc.TYPE_THICK;
        } else {
            enumC0214dc = EnumC0214dc.TYPE_THIN;
        }
        c0271gc.m735e(enumC0214dc);
        C0433p3 c0433p3 = new C0433p3();
        c0433p3.m835a(Integer.valueOf(i11));
        c0433p3.m837c(c0490s3);
        c0433p3.m836b(c0346kb);
        c0271gc.m734d(c0433p3.m838e());
        return C0484rg.m868d(c0271gc);
    }

    @Override // p234ia.AbstractC20458f
    /* renamed from: l */
    public final synchronized C25202a mo34581i(C24141a c24141a) {
        EnumC0233ec enumC0233ec;
        C25202a mo34602a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            mo34602a = this.f37198d.mo34602a(c24141a);
            m34595m(EnumC0233ec.NO_ERROR, elapsedRealtime, c24141a);
            f37196i = false;
        } catch (MlKitException e11) {
            if (e11.m34567a() == 14) {
                enumC0233ec = EnumC0233ec.MODEL_NOT_DOWNLOADED;
            } else {
                enumC0233ec = EnumC0233ec.UNKNOWN_ERROR;
            }
            m34595m(enumC0233ec, elapsedRealtime, c24141a);
            throw e11;
        }
        return mo34602a;
    }
}

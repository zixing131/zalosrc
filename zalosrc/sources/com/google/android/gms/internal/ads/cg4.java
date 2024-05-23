package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class cg4 implements tj4, ue4 {

    /* renamed from: b */
    private final Uri f18392b;

    /* renamed from: c */
    private final cb3 f18393c;

    /* renamed from: d */
    private final xf4 f18394d;

    /* renamed from: e */
    private final mm4 f18395e;

    /* renamed from: f */
    private final ya1 f18396f;

    /* renamed from: h */
    private volatile boolean f18398h;

    /* renamed from: j */
    private long f18400j;

    /* renamed from: l */
    private InterfaceC4928r f18402l;

    /* renamed from: m */
    private boolean f18403m;

    /* renamed from: n */
    final /* synthetic */ hg4 f18404n;

    /* renamed from: g */
    private final C4667k f18397g = new C4667k();

    /* renamed from: i */
    private boolean f18399i = true;

    /* renamed from: a */
    private final long f18391a = we4.m27603a();

    /* renamed from: k */
    private wo2 f18401k = m20877g(0);

    public cg4(hg4 hg4Var, Uri uri, qj2 qj2Var, xf4 xf4Var, mm4 mm4Var, ya1 ya1Var) {
        this.f18404n = hg4Var;
        this.f18392b = uri;
        this.f18393c = new cb3(qj2Var);
        this.f18394d = xf4Var;
        this.f18395e = mm4Var;
        this.f18396f = ya1Var;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ long m20872b(cg4 cg4Var) {
        return cg4Var.f18391a;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ long m20873c(cg4 cg4Var) {
        return cg4Var.f18400j;
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ wo2 m20874d(cg4 cg4Var) {
        return cg4Var.f18401k;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ cb3 m20875e(cg4 cg4Var) {
        return cg4Var.f18393c;
    }

    /* renamed from: f */
    public static /* bridge */ /* synthetic */ void m20876f(cg4 cg4Var, long j11, long j12) {
        cg4Var.f18397g.f23035a = j11;
        cg4Var.f18400j = j12;
        cg4Var.f18399i = true;
        cg4Var.f18403m = false;
    }

    /* renamed from: g */
    private final wo2 m20877g(long j11) {
        Map map;
        um2 um2Var = new um2();
        um2Var.m27003d(this.f18392b);
        um2Var.m27002c(j11);
        um2Var.m27000a(6);
        map = hg4.f21670a0;
        um2Var.m27001b(map);
        return um2Var.m27004e();
    }

    @Override // com.google.android.gms.internal.ads.ue4
    /* renamed from: a */
    public final void mo20878a(x02 x02Var) {
        long m22839y;
        long max;
        if (this.f18403m) {
            m22839y = this.f18404n.m22839y(true);
            max = Math.max(m22839y, this.f18400j);
        } else {
            max = this.f18400j;
        }
        long j11 = max;
        int m27778i = x02Var.m27778i();
        InterfaceC4928r interfaceC4928r = this.f18402l;
        interfaceC4928r.getClass();
        AbstractC4853p.m25366b(interfaceC4928r, x02Var, m27778i);
        interfaceC4928r.mo23302f(j11, 1, m27778i, 0, null);
        this.f18403m = true;
    }

    @Override // com.google.android.gms.internal.ads.tj4
    public final void zzg() {
        this.f18398h = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089 A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5 A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011c A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0130 A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[Catch: all -> 0x0027, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #2 {all -> 0x0027, blocks: (B:6:0x000b, B:8:0x001f, B:10:0x002b, B:13:0x0040, B:15:0x0046, B:20:0x007e, B:22:0x0089, B:23:0x0095, B:25:0x009f, B:26:0x00ab, B:28:0x00b5, B:29:0x00c1, B:31:0x00cb, B:32:0x00dd, B:34:0x00e7, B:36:0x00ed, B:41:0x011c, B:42:0x0123, B:44:0x0130, B:46:0x0138, B:47:0x0155, B:49:0x0170, B:50:0x0175, B:52:0x0179, B:104:0x00f5, B:108:0x010c, B:117:0x0050, B:121:0x006a), top: B:5:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[LOOP:0: B:2:0x0004->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.tj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh() {
        int i11;
        int i12;
        boolean z11;
        int i13;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z12;
        List list5;
        int i14;
        zzacm zzacmVar;
        td4 td4Var;
        zzacm zzacmVar2;
        int i15;
        int i16;
        int i17;
        long j11;
        Handler handler;
        Runnable runnable;
        zzacm zzacmVar3;
        zzacm zzacmVar4;
        C4671k3 c4671k3;
        int i18;
        int i19;
        while (!this.f18398h) {
            try {
                long j12 = this.f18397g.f23035a;
                wo2 m20877g = m20877g(j12);
                this.f18401k = m20877g;
                long mo19943d = this.f18393c.mo19943d(m20877g);
                if (mo19943d != -1) {
                    mo19943d += j12;
                    r8.f21673B.post(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE 
                          (wrap:android.os.Handler:0x0000: IGET (r8v13 com.google.android.gms.internal.ads.hg4) A[WRAPPED] (LINE:1) com.google.android.gms.internal.ads.hg4.B android.os.Handler)
                          (wrap:java.lang.Runnable:0x0004: CONSTRUCTOR 
                          (wrap:com.google.android.gms.internal.ads.hg4:0x0020: IGET (r24v0 'this' com.google.android.gms.internal.ads.cg4 A[IMMUTABLE_TYPE, THIS]) A[Catch: all -> 0x0027, WRAPPED] (LINE:33) com.google.android.gms.internal.ads.cg4.n com.google.android.gms.internal.ads.hg4)
                         A[MD:(com.google.android.gms.internal.ads.hg4):void (m), WRAPPED] (LINE:5) call: com.google.android.gms.internal.ads.ag4.<init>(com.google.android.gms.internal.ads.hg4):void type: CONSTRUCTOR)
                         VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean A[Catch: all -> 0x0027, MD:(java.lang.Runnable):boolean (c)] (LINE:8) in method: com.google.android.gms.internal.ads.cg4.zzh():void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:315)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.gms.internal.ads.ag4, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:304)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:781)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1117)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:884)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 33 more
                        */
                    /*
                        Method dump skipped, instructions count: 529
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cg4.zzh():void");
                }
            }

package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class lm1 {

    /* renamed from: a */
    private final uc3 f23982a;

    /* renamed from: b */
    private final ym1 f23983b;

    /* renamed from: c */
    private final dn1 f23984c;

    public lm1(uc3 uc3Var, ym1 ym1Var, dn1 dn1Var) {
        this.f23982a = uc3Var;
        this.f23983b = ym1Var;
        this.f23984c = dn1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.android.gms.internal.ads.km1.<init>(com.google.android.gms.internal.ads.lm1, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, org.json.JSONObject, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3, com.google.android.gms.internal.ads.tc3):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: a */
    public final com.google.android.gms.internal.ads.tc3 m24331a(com.google.android.gms.internal.ads.tq2 r16, com.google.android.gms.internal.ads.iq2 r17, org.json.JSONObject r18) {
        /*
            r15 = this;
            r12 = r15
            r0 = r16
            r1 = r17
            r7 = r18
            com.google.android.gms.internal.ads.uc3 r2 = r12.f23982a
            com.google.android.gms.internal.ads.jm1 r3 = new com.google.android.gms.internal.ads.jm1
            r3.<init>()
            com.google.android.gms.internal.ads.tc3 r2 = r2.mo21339R(r3)
            com.google.android.gms.internal.ads.ym1 r3 = r12.f23983b
            java.lang.String r4 = "images"
            com.google.android.gms.internal.ads.tc3 r3 = r3.m28264f(r7, r4)
            com.google.android.gms.internal.ads.ym1 r5 = r12.f23983b
            com.google.android.gms.internal.ads.sq2 r6 = r0.f28473b
            com.google.android.gms.internal.ads.lq2 r6 = r6.f27823b
            com.google.android.gms.internal.ads.tc3 r9 = r5.m28265g(r7, r4, r1, r6)
            com.google.android.gms.internal.ads.ym1 r4 = r12.f23983b
            java.lang.String r5 = "secondary_image"
            com.google.android.gms.internal.ads.tc3 r5 = r4.m28263e(r7, r5)
            com.google.android.gms.internal.ads.ym1 r4 = r12.f23983b
            java.lang.String r6 = "app_icon"
            com.google.android.gms.internal.ads.tc3 r4 = r4.m28263e(r7, r6)
            com.google.android.gms.internal.ads.ym1 r6 = r12.f23983b
            java.lang.String r8 = "attribution"
            com.google.android.gms.internal.ads.tc3 r6 = r6.m28262d(r7, r8)
            com.google.android.gms.internal.ads.ym1 r8 = r12.f23983b
            com.google.android.gms.internal.ads.sq2 r0 = r0.f28473b
            com.google.android.gms.internal.ads.lq2 r0 = r0.f27823b
            com.google.android.gms.internal.ads.tc3 r8 = r8.m28266h(r7, r1, r0)
            com.google.android.gms.internal.ads.ym1 r0 = r12.f23983b
            java.lang.String r1 = "enable_omid"
            boolean r1 = r7.optBoolean(r1)
            r10 = 0
            if (r1 != 0) goto L57
            com.google.android.gms.internal.ads.tc3 r0 = com.google.android.gms.internal.ads.kc3.m23877i(r10)
        L55:
            r10 = r0
            goto L85
        L57:
            java.lang.String r1 = "omid_settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 != 0) goto L64
            com.google.android.gms.internal.ads.tc3 r0 = com.google.android.gms.internal.ads.kc3.m23877i(r10)
            goto L55
        L64:
            java.lang.String r11 = "omid_html"
            java.lang.String r1 = r1.optString(r11)
            boolean r11 = android.text.TextUtils.isEmpty(r1)
            if (r11 == 0) goto L75
            com.google.android.gms.internal.ads.tc3 r0 = com.google.android.gms.internal.ads.kc3.m23877i(r10)
            goto L55
        L75:
            com.google.android.gms.internal.ads.tc3 r10 = com.google.android.gms.internal.ads.kc3.m23877i(r10)
            com.google.android.gms.internal.ads.nm1 r11 = new com.google.android.gms.internal.ads.nm1
            r11.<init>()
            com.google.android.gms.internal.ads.uc3 r0 = com.google.android.gms.internal.ads.kl0.f23367e
            com.google.android.gms.internal.ads.tc3 r0 = com.google.android.gms.internal.ads.kc3.m23882n(r10, r11, r0)
            goto L55
        L85:
            com.google.android.gms.internal.ads.dn1 r0 = r12.f23984c
            java.lang.String r1 = "custom_assets"
            com.google.android.gms.internal.ads.tc3 r11 = r0.m21506a(r7, r1)
            r0 = 9
            com.google.android.gms.internal.ads.tc3[] r0 = new com.google.android.gms.internal.ads.tc3[r0]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            r1 = 2
            r0[r1] = r9
            r1 = 3
            r0[r1] = r5
            r1 = 4
            r0[r1] = r4
            r1 = 5
            r0[r1] = r6
            r1 = 6
            r0[r1] = r8
            r1 = 7
            r0[r1] = r10
            r1 = 8
            r0[r1] = r11
            com.google.android.gms.internal.ads.jc3 r13 = com.google.android.gms.internal.ads.kc3.m23870b(r0)
            com.google.android.gms.internal.ads.km1 r14 = new com.google.android.gms.internal.ads.km1
            r0 = r14
            r1 = r15
            r7 = r18
            r0.<init>()
            com.google.android.gms.internal.ads.uc3 r0 = r12.f23982a
            com.google.android.gms.internal.ads.tc3 r0 = r13.m23601a(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lm1.m24331a(com.google.android.gms.internal.ads.tq2, com.google.android.gms.internal.ads.iq2, org.json.JSONObject):com.google.android.gms.internal.ads.tc3");
    }
}

package p705z5;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.os.AbstractC1440f;
import androidx.core.os.C1443i;
import com.google.android.gms.common.internal.C4196l;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p234ia.AbstractC20452c;
import p234ia.C20460g;
import p234ia.C20470m;
import p342m6.AbstractC22888j;

/* renamed from: z5.wb */
/* loaded from: classes2.dex */
public final class C31615wb {

    /* renamed from: k */
    private static AbstractC31476mc f145358k;

    /* renamed from: l */
    private static final AbstractC31504oc f145359l = AbstractC31504oc.m152330c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    private final String f145360a;

    /* renamed from: b */
    private final String f145361b;

    /* renamed from: c */
    private final InterfaceC31517pb f145362c;

    /* renamed from: d */
    private final C20470m f145363d;

    /* renamed from: e */
    private final AbstractC22888j f145364e;

    /* renamed from: f */
    private final AbstractC22888j f145365f;

    /* renamed from: g */
    private final String f145366g;

    /* renamed from: h */
    private final int f145367h;

    /* renamed from: i */
    private final Map f145368i = new HashMap();

    /* renamed from: j */
    private final Map f145369j = new HashMap();

    public C31615wb(Context context, C20470m c20470m, InterfaceC31517pb interfaceC31517pb, String str) {
        int i11;
        this.f145360a = context.getPackageName();
        this.f145361b = AbstractC20452c.m106484a(context);
        this.f145363d = c20470m;
        this.f145362c = interfaceC31517pb;
        C31434jc.m152279a();
        this.f145366g = str;
        this.f145364e = C20460g.m106488a().m106491b(new Callable() { // from class: z5.tb
            public /* synthetic */ CallableC31573tb() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C31615wb.this.m152360a();
            }
        });
        C20460g m106488a = C20460g.m106488a();
        c20470m.getClass();
        this.f145365f = m106488a.m106491b(new Callable() { // from class: z5.ub
            public /* synthetic */ CallableC31587ub() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C20470m.this.m106515a();
            }
        });
        AbstractC31504oc abstractC31504oc = f145359l;
        if (abstractC31504oc.containsKey(str)) {
            i11 = DynamiteModule.m19919c(context, (String) abstractC31504oc.get(str));
        } else {
            i11 = -1;
        }
        this.f145367h = i11;
    }

    /* renamed from: d */
    private static synchronized AbstractC31476mc m152359d() {
        synchronized (C31615wb.class) {
            try {
                AbstractC31476mc abstractC31476mc = f145358k;
                if (abstractC31476mc != null) {
                    return abstractC31476mc;
                }
                C1443i m7346a = AbstractC1440f.m7346a(Resources.getSystem().getConfiguration());
                C31475mb c31475mb = new C31475mb();
                for (int i11 = 0; i11 < m7346a.m7355d(); i11++) {
                    c31475mb.m152316c(AbstractC20452c.m106485b(m7346a.m7354c(i11)));
                }
                AbstractC31476mc m152317d = c31475mb.m152317d();
                f145358k = m152317d;
                return m152317d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ String m152360a() {
        return C4196l.m19698a().m19699b(this.f145366g);
    }

    /* renamed from: b */
    public final /* synthetic */ void m152361b(InterfaceC31503ob interfaceC31503ob, EnumC31360e8 enumC31360e8, String str) {
        String m106515a;
        interfaceC31503ob.mo152328b(enumC31360e8);
        String zzc = interfaceC31503ob.zzc();
        C31432ja c31432ja = new C31432ja();
        c31432ja.m152265b(this.f145360a);
        c31432ja.m152266c(this.f145361b);
        c31432ja.m152271h(m152359d());
        c31432ja.m152270g(Boolean.TRUE);
        c31432ja.m152275l(zzc);
        c31432ja.m152273j(str);
        if (this.f145365f.mo117588q()) {
            m106515a = (String) this.f145365f.mo117584m();
        } else {
            m106515a = this.f145363d.m106515a();
        }
        c31432ja.m152272i(m106515a);
        c31432ja.m152267d(10);
        c31432ja.m152274k(Integer.valueOf(this.f145367h));
        interfaceC31503ob.mo152329c(c31432ja);
        this.f145362c.mo152219a(interfaceC31503ob);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: z5.vb.<init>(z5.wb, z5.ob, z5.e8, java.lang.String):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: c */
    public final void m152362c(p705z5.C31392gc r10, p705z5.EnumC31360e8 r11) {
        /*
            r9 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.Map r2 = r9.f145368i
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto Ld
            goto L28
        Ld:
            java.util.Map r2 = r9.f145368i
            java.lang.Object r2 = r2.get(r11)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            long r2 = r0 - r2
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 30
            long r4 = r4.toMillis(r5)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L28
            return
        L28:
            java.util.Map r2 = r9.f145368i
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r11, r0)
            int r0 = r10.f144740a
            int r1 = r10.f144741b
            int r2 = r10.f144742c
            int r3 = r10.f144743d
            int r4 = r10.f144744e
            long r5 = r10.f144745f
            int r10 = r10.f144746g
            z5.w7 r7 = new z5.w7
            r7.<init>()
            r8 = -1
            if (r0 == r8) goto L67
            r8 = 35
            if (r0 == r8) goto L64
            r8 = 842094169(0x32315659, float:1.0322389E-8)
            if (r0 == r8) goto L61
            r8 = 16
            if (r0 == r8) goto L5e
            r8 = 17
            if (r0 == r8) goto L5b
            z5.r7 r0 = p705z5.EnumC31541r7.UNKNOWN_FORMAT
            goto L69
        L5b:
            z5.r7 r0 = p705z5.EnumC31541r7.NV21
            goto L69
        L5e:
            z5.r7 r0 = p705z5.EnumC31541r7.NV16
            goto L69
        L61:
            z5.r7 r0 = p705z5.EnumC31541r7.YV12
            goto L69
        L64:
            z5.r7 r0 = p705z5.EnumC31541r7.YUV_420_888
            goto L69
        L67:
            z5.r7 r0 = p705z5.EnumC31541r7.BITMAP
        L69:
            r7.m152353d(r0)
            r0 = 1
            if (r1 == r0) goto L84
            r0 = 2
            if (r1 == r0) goto L81
            r0 = 3
            if (r1 == r0) goto L7e
            r0 = 4
            if (r1 == r0) goto L7b
            z5.x7 r0 = p705z5.EnumC31625x7.ANDROID_MEDIA_IMAGE
            goto L86
        L7b:
            z5.x7 r0 = p705z5.EnumC31625x7.FILEPATH
            goto L86
        L7e:
            z5.x7 r0 = p705z5.EnumC31625x7.BYTEBUFFER
            goto L86
        L81:
            z5.x7 r0 = p705z5.EnumC31625x7.BYTEARRAY
            goto L86
        L84:
            z5.x7 r0 = p705z5.EnumC31625x7.BITMAP
        L86:
            r7.m152355f(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.m152352c(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r7.m152354e(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7.m152356g(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7.m152351b(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r7.m152357h(r10)
            z5.z7 r10 = r7.m152358j()
            z5.f8 r0 = new z5.f8
            r0.<init>()
            r0.m152232d(r10)
            z5.ob r10 = p705z5.C31629xb.m152364d(r0)
            m6.j r0 = r9.f145364e
            boolean r0 = r0.mo117588q()
            if (r0 == 0) goto Lcd
            m6.j r0 = r9.f145364e
            java.lang.Object r0 = r0.mo117584m()
            java.lang.String r0 = (java.lang.String) r0
            goto Ld7
        Lcd:
            com.google.android.gms.common.internal.l r0 = com.google.android.gms.common.internal.C4196l.m19698a()
            java.lang.String r1 = r9.f145366g
            java.lang.String r0 = r0.m19699b(r1)
        Ld7:
            java.util.concurrent.Executor r1 = p234ia.C20460g.m106489d()
            z5.vb r2 = new z5.vb
            r2.<init>()
            r1.execute(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p705z5.C31615wb.m152362c(z5.gc, z5.e8):void");
    }
}

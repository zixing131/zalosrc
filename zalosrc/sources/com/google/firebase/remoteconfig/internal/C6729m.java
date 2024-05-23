package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.installations.AbstractC6587f;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C6729m;
import com.google.firebase.remoteconfig.internal.C6732p;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p014a8.InterfaceC0650a;
import p015a9.InterfaceC0662b;
import p035b9.InterfaceC2661e;
import p229i5.InterfaceC20285f;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.InterfaceC22886i;

/* renamed from: com.google.firebase.remoteconfig.internal.m */
/* loaded from: classes3.dex */
public class C6729m {

    /* renamed from: j */
    public static final long f37011j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k */
    static final int[] f37012k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    private final InterfaceC2661e f37013a;

    /* renamed from: b */
    private final InterfaceC0662b f37014b;

    /* renamed from: c */
    private final Executor f37015c;

    /* renamed from: d */
    private final InterfaceC20285f f37016d;

    /* renamed from: e */
    private final Random f37017e;

    /* renamed from: f */
    private final C6722f f37018f;

    /* renamed from: g */
    private final ConfigFetchHttpClient f37019g;

    /* renamed from: h */
    private final C6732p f37020h;

    /* renamed from: i */
    private final Map f37021i;

    /* renamed from: com.google.firebase.remoteconfig.internal.m$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final Date f37022a;

        /* renamed from: b */
        private final int f37023b;

        /* renamed from: c */
        private final C6723g f37024c;

        /* renamed from: d */
        private final String f37025d;

        private a(Date date, int i11, C6723g c6723g, String str) {
            this.f37022a = date;
            this.f37023b = i11;
            this.f37024c = c6723g;
            this.f37025d = str;
        }

        /* renamed from: a */
        public static a m34423a(Date date, C6723g c6723g) {
            return new a(date, 1, c6723g, null);
        }

        /* renamed from: b */
        public static a m34424b(C6723g c6723g, String str) {
            return new a(c6723g.m34385g(), 0, c6723g, str);
        }

        /* renamed from: c */
        public static a m34425c(Date date) {
            return new a(date, 2, null, null);
        }

        /* renamed from: d */
        public C6723g m34426d() {
            return this.f37024c;
        }

        /* renamed from: e */
        String m34427e() {
            return this.f37025d;
        }

        /* renamed from: f */
        public int m34428f() {
            return this.f37023b;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.m$b */
    /* loaded from: classes3.dex */
    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");


        /* renamed from: p */
        private final String f37029p;

        b(String str) {
            this.f37029p = str;
        }

        /* renamed from: b */
        String m34429b() {
            return this.f37029p;
        }
    }

    public C6729m(InterfaceC2661e interfaceC2661e, InterfaceC0662b interfaceC0662b, Executor executor, InterfaceC20285f interfaceC20285f, Random random, C6722f c6722f, ConfigFetchHttpClient configFetchHttpClient, C6732p c6732p, Map map) {
        this.f37013a = interfaceC2661e;
        this.f37014b = interfaceC0662b;
        this.f37015c = executor;
        this.f37016d = interfaceC20285f;
        this.f37017e = random;
        this.f37018f = c6722f;
        this.f37019g = configFetchHttpClient;
        this.f37020h = c6732p;
        this.f37021i = map;
    }

    /* renamed from: A */
    private C6732p.a m34394A(int i11, Date date) {
        if (m34412t(i11)) {
            m34395B(date);
        }
        return this.f37020h.m34440a();
    }

    /* renamed from: B */
    private void m34395B(Date date) {
        int m34458b = this.f37020h.m34440a().m34458b() + 1;
        this.f37020h.m34450k(m34458b, new Date(date.getTime() + m34410q(m34458b)));
    }

    /* renamed from: C */
    private void m34396C(AbstractC22888j abstractC22888j, Date date) {
        if (abstractC22888j.mo117588q()) {
            this.f37020h.m34455p(date);
            return;
        }
        Exception mo117583l = abstractC22888j.mo117583l();
        if (mo117583l == null) {
            return;
        }
        if (mo117583l instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f37020h.m34456q();
        } else {
            this.f37020h.m34454o();
        }
    }

    /* renamed from: f */
    private boolean m34402f(long j11, Date date) {
        Date m34444e = this.f37020h.m34444e();
        if (m34444e.equals(C6732p.f37040e)) {
            return false;
        }
        return date.before(new Date(m34444e.getTime() + TimeUnit.SECONDS.toMillis(j11)));
    }

    /* renamed from: g */
    private FirebaseRemoteConfigServerException m34403g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        String str;
        int m34301a = firebaseRemoteConfigServerException.m34301a();
        if (m34301a != 401) {
            if (m34301a != 403) {
                if (m34301a != 429) {
                    if (m34301a != 500) {
                        switch (m34301a) {
                            case 502:
                            case 503:
                            case 504:
                                str = "The server is unavailable. Please try again later.";
                                break;
                            default:
                                str = "The server returned an unexpected error.";
                                break;
                        }
                    } else {
                        str = "There was an internal server error.";
                    }
                } else {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
            } else {
                str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            }
        } else {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.m34301a(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    /* renamed from: h */
    private String m34404h(long j11) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j11)));
    }

    /* renamed from: k */
    private a m34405k(String str, String str2, Date date, Map map) {
        try {
            a fetch = this.f37019g.fetch(this.f37019g.m34351d(), str, str2, m34411s(), this.f37020h.m34443d(), map, m34409p(), date);
            if (fetch.m34426d() != null) {
                this.f37020h.m34452m(fetch.m34426d().m34387i());
            }
            if (fetch.m34427e() != null) {
                this.f37020h.m34451l(fetch.m34427e());
            }
            this.f37020h.m34448i();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e11) {
            C6732p.a m34394A = m34394A(e11.m34301a(), date);
            if (m34418z(m34394A, e11.m34301a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(m34394A.m34457a().getTime());
            }
            throw m34403g(e11);
        }
    }

    /* renamed from: l */
    private AbstractC22888j m34406l(String str, String str2, Date date, Map map) {
        try {
            a m34405k = m34405k(str, str2, date, map);
            if (m34405k.m34428f() != 0) {
                return AbstractC22894m.m117604f(m34405k);
            }
            return this.f37018f.m34374k(m34405k.m34426d()).mo117589r(this.f37015c, new InterfaceC22886i() { // from class: com.google.firebase.remoteconfig.internal.l
                public /* synthetic */ C6728l() {
                }

                @Override // p342m6.InterfaceC22886i
                /* renamed from: a */
                public final AbstractC22888j mo33968a(Object obj) {
                    AbstractC22888j m117604f;
                    m117604f = AbstractC22894m.m117604f(C6729m.a.this);
                    return m117604f;
                }
            });
        } catch (FirebaseRemoteConfigException e11) {
            return AbstractC22894m.m117603e(e11);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.j.<init>(com.google.firebase.remoteconfig.internal.m, m6.j, m6.j, java.util.Date, java.util.Map):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: m */
    public p342m6.AbstractC22888j m34413u(p342m6.AbstractC22888j r8, long r9, java.util.Map r11) {
        /*
            r7 = this;
            java.util.Date r6 = new java.util.Date
            i5.f r0 = r7.f37016d
            long r0 = r0.mo105913a()
            r6.<init>(r0)
            boolean r8 = r8.mo117588q()
            if (r8 == 0) goto L20
            boolean r8 = r7.m34402f(r9, r6)
            if (r8 == 0) goto L20
            com.google.firebase.remoteconfig.internal.m$a r8 = com.google.firebase.remoteconfig.internal.C6729m.a.m34425c(r6)
            m6.j r8 = p342m6.AbstractC22894m.m117604f(r8)
            return r8
        L20:
            java.util.Date r8 = r7.m34408o(r6)
            if (r8 == 0) goto L41
            com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException
            long r10 = r8.getTime()
            long r0 = r6.getTime()
            long r10 = r10 - r0
            java.lang.String r10 = r7.m34404h(r10)
            long r0 = r8.getTime()
            r9.<init>(r10, r0)
            m6.j r8 = p342m6.AbstractC22894m.m117603e(r9)
            goto L69
        L41:
            b9.e r8 = r7.f37013a
            m6.j r2 = r8.mo13077f()
            b9.e r8 = r7.f37013a
            r9 = 0
            m6.j r3 = r8.mo13076a(r9)
            r8 = 2
            m6.j[] r8 = new p342m6.AbstractC22888j[r8]
            r8[r9] = r2
            r9 = 1
            r8[r9] = r3
            m6.j r8 = p342m6.AbstractC22894m.m117608j(r8)
            java.util.concurrent.Executor r9 = r7.f37015c
            com.google.firebase.remoteconfig.internal.j r10 = new com.google.firebase.remoteconfig.internal.j
            r0 = r10
            r1 = r7
            r4 = r6
            r5 = r11
            r0.<init>()
            m6.j r8 = r8.mo117581j(r9, r10)
        L69:
            java.util.concurrent.Executor r9 = r7.f37015c
            com.google.firebase.remoteconfig.internal.k r10 = new com.google.firebase.remoteconfig.internal.k
            r10.<init>()
            m6.j r8 = r8.mo117581j(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C6729m.m34413u(m6.j, long, java.util.Map):m6.j");
    }

    /* renamed from: o */
    private Date m34408o(Date date) {
        Date m34457a = this.f37020h.m34440a().m34457a();
        if (date.before(m34457a)) {
            return m34457a;
        }
        return null;
    }

    /* renamed from: p */
    private Long m34409p() {
        InterfaceC0650a interfaceC0650a = (InterfaceC0650a) this.f37014b.get();
        if (interfaceC0650a == null) {
            return null;
        }
        return (Long) interfaceC0650a.mo933d(true).get("_fot");
    }

    /* renamed from: q */
    private long m34410q(int i11) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f37012k;
        return (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f37017e.nextInt((int) r0);
    }

    /* renamed from: s */
    private Map m34411s() {
        HashMap hashMap = new HashMap();
        InterfaceC0650a interfaceC0650a = (InterfaceC0650a) this.f37014b.get();
        if (interfaceC0650a == null) {
            return hashMap;
        }
        for (Map.Entry entry : interfaceC0650a.mo933d(false).entrySet()) {
            hashMap.put((String) entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: t */
    private boolean m34412t(int i11) {
        return i11 == 429 || i11 == 502 || i11 == 503 || i11 == 504;
    }

    /* renamed from: w */
    public /* synthetic */ AbstractC22888j m34415w(AbstractC22888j abstractC22888j, AbstractC22888j abstractC22888j2, Date date, Map map, AbstractC22888j abstractC22888j3) {
        if (!abstractC22888j.mo117588q()) {
            return AbstractC22894m.m117603e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", abstractC22888j.mo117583l()));
        }
        if (!abstractC22888j2.mo117588q()) {
            return AbstractC22894m.m117603e(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", abstractC22888j2.mo117583l()));
        }
        return m34406l((String) abstractC22888j.mo117584m(), ((AbstractC6587f) abstractC22888j2.mo117584m()).mo33627b(), date, map);
    }

    /* renamed from: x */
    public /* synthetic */ AbstractC22888j m34416x(Date date, AbstractC22888j abstractC22888j) {
        m34396C(abstractC22888j, date);
        return abstractC22888j;
    }

    /* renamed from: y */
    public /* synthetic */ AbstractC22888j m34417y(Map map, AbstractC22888j abstractC22888j) {
        return m34413u(abstractC22888j, 0L, map);
    }

    /* renamed from: z */
    private boolean m34418z(C6732p.a aVar, int i11) {
        if (aVar.m34458b() > 1 || i11 == 429) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public AbstractC22888j m34419i() {
        return m34420j(this.f37020h.m34446g());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.h.<init>(com.google.firebase.remoteconfig.internal.m, long, java.util.Map):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: j */
    public p342m6.AbstractC22888j m34420j(long r5) {
        /*
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = r4.f37021i
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.google.firebase.remoteconfig.internal.m$b r2 = com.google.firebase.remoteconfig.internal.C6729m.b.BASE
            java.lang.String r2 = r2.m34429b()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            r2 = 1
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "X-Firebase-RC-Fetch-Type"
            r0.put(r2, r1)
            com.google.firebase.remoteconfig.internal.f r1 = r4.f37018f
            m6.j r1 = r1.m34371e()
            java.util.concurrent.Executor r2 = r4.f37015c
            com.google.firebase.remoteconfig.internal.h r3 = new com.google.firebase.remoteconfig.internal.h
            r3.<init>()
            m6.j r5 = r1.mo117581j(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C6729m.m34420j(long):m6.j");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.remoteconfig.internal.i.<init>(com.google.firebase.remoteconfig.internal.m, java.util.Map):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: n */
    public p342m6.AbstractC22888j m34421n(com.google.firebase.remoteconfig.internal.C6729m.b r3, int r4) {
        /*
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = r2.f37021i
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.m34429b()
            r1.append(r3)
            java.lang.String r3 = "/"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = "X-Firebase-RC-Fetch-Type"
            r0.put(r4, r3)
            com.google.firebase.remoteconfig.internal.f r3 = r2.f37018f
            m6.j r3 = r3.m34371e()
            java.util.concurrent.Executor r4 = r2.f37015c
            com.google.firebase.remoteconfig.internal.i r1 = new com.google.firebase.remoteconfig.internal.i
            r1.<init>()
            m6.j r3 = r3.mo117581j(r4, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C6729m.m34421n(com.google.firebase.remoteconfig.internal.m$b, int):m6.j");
    }

    /* renamed from: r */
    public long m34422r() {
        return this.f37020h.m34445f();
    }
}

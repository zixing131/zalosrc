package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.C6662a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p015a9.InterfaceC0662b;
import p052c8.C3358u;
import p319l9.C22152a;
import p441q9.C25197k;
import p507s9.C26185b;
import p507s9.C26188e;
import p507s9.C26189f;
import p507s9.C26190g;
import p507s9.EnumC26187d;

@Keep
/* loaded from: classes3.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC26187d applicationProcessState;
    private final C6662a configResolver;
    private final C3358u cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final C3358u gaugeManagerExecutor;
    private C6708i gaugeMetadataManager;
    private final C3358u memoryGaugeCollector;
    private String sessionId;
    private final C25197k transportManager;
    private static final C22152a logger = C22152a.m115524e();
    private static final GaugeManager instance = new GaugeManager();

    /* renamed from: com.google.firebase.perf.session.gauges.GaugeManager$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6699a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36876a;

        static {
            int[] iArr = new int[EnumC26187d.values().length];
            f36876a = iArr;
            try {
                iArr[EnumC26187d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36876a[EnumC26187d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new C3358u(new InterfaceC0662b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), C25197k.m130415k(), C6662a.m34042g(), null, new C3358u(new InterfaceC0662b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                C6702c lambda$new$0;
                lambda$new$0 = GaugeManager.lambda$new$0();
                return lambda$new$0;
            }
        }), new C3358u(new InterfaceC0662b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // p015a9.InterfaceC0662b
            public final Object get() {
                C6711l lambda$new$1;
                lambda$new$1 = GaugeManager.lambda$new$1();
                return lambda$new$1;
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC26187d enumC26187d) {
        long m34072y;
        int i11 = C6699a.f36876a[enumC26187d.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                m34072y = -1;
            } else {
                m34072y = this.configResolver.m34073z();
            }
        } else {
            m34072y = this.configResolver.m34072y();
        }
        if (C6702c.m34264f(m34072y)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return m34072y;
    }

    private C26189f getGaugeMetadata() {
        return (C26189f) C26189f.m134580R().m134585A(this.gaugeMetadataManager.m34273a()).m134586B(this.gaugeMetadataManager.m34274b()).m134587C(this.gaugeMetadataManager.m34275c()).m35109q();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC26187d enumC26187d) {
        long m34053B;
        int i11 = C6699a.f36876a[enumC26187d.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                m34053B = -1;
            } else {
                m34053B = this.configResolver.m34054C();
            }
        } else {
            m34053B = this.configResolver.m34053B();
        }
        if (C6711l.m34279e(m34053B)) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return m34053B;
    }

    public static /* synthetic */ C6702c lambda$new$0() {
        return new C6702c();
    }

    public static /* synthetic */ C6711l lambda$new$1() {
        return new C6711l();
    }

    private boolean startCollectingCpuMetrics(long j11, Timer timer) {
        if (j11 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m115525a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((C6702c) this.cpuGaugeCollector.get()).m34271k(j11, timer);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j11, Timer timer) {
        if (j11 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m115525a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((C6711l) this.memoryGaugeCollector.get()).m34286j(j11, timer);
        return true;
    }

    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, EnumC26187d enumC26187d) {
        C26190g.b m134598a0 = C26190g.m134598a0();
        while (!((C6702c) this.cpuGaugeCollector.get()).f36883a.isEmpty()) {
            m134598a0.m134607B((C26188e) ((C6702c) this.cpuGaugeCollector.get()).f36883a.poll());
        }
        while (!((C6711l) this.memoryGaugeCollector.get()).f36906b.isEmpty()) {
            m134598a0.m134606A((C26185b) ((C6711l) this.memoryGaugeCollector.get()).f36906b.poll());
        }
        m134598a0.m134609D(str);
        this.transportManager.m130429A((C26190g) m134598a0.m35109q(), enumC26187d);
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce((C6702c) this.cpuGaugeCollector.get(), (C6711l) this.memoryGaugeCollector.get(), timer);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C6708i(context);
    }

    public boolean logGaugeMetadata(String str, EnumC26187d enumC26187d) {
        if (this.gaugeMetadataManager != null) {
            this.transportManager.m130429A((C26190g) C26190g.m134598a0().m134609D(str).m134608C(getGaugeMetadata()).m35109q(), enumC26187d);
            return true;
        }
        return false;
    }

    public void startCollectingGauges(PerfSession perfSession, EnumC26187d enumC26187d) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(enumC26187d, perfSession.m34247d());
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.m115533j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String m34251h = perfSession.m34251h();
        this.sessionId = m34251h;
        this.applicationProcessState = enumC26187d;
        try {
            long j11 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e

                /* renamed from: q */
                public final /* synthetic */ String f36893q;

                /* renamed from: r */
                public final /* synthetic */ EnumC26187d f36894r;

                public /* synthetic */ RunnableC6704e(String m34251h2, EnumC26187d enumC26187d2) {
                    r2 = m34251h2;
                    r3 = enumC26187d2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    GaugeManager.this.lambda$startCollectingGauges$2(r2, r3);
                }
            }, j11, j11, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e11) {
            logger.m115533j("Unable to start collecting Gauges: " + e11.getMessage());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.google.firebase.perf.session.gauges.d.<init>(com.google.firebase.perf.session.gauges.GaugeManager, java.lang.String, s9.d):void, class status: GENERATED_AND_UNLOADED
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
    public void stopCollectingGauges() {
        /*
            r5 = this;
            java.lang.String r0 = r5.sessionId
            if (r0 != 0) goto L5
            return
        L5:
            s9.d r1 = r5.applicationProcessState
            c8.u r2 = r5.cpuGaugeCollector
            java.lang.Object r2 = r2.get()
            com.google.firebase.perf.session.gauges.c r2 = (com.google.firebase.perf.session.gauges.C6702c) r2
            r2.m34272l()
            c8.u r2 = r5.memoryGaugeCollector
            java.lang.Object r2 = r2.get()
            com.google.firebase.perf.session.gauges.l r2 = (com.google.firebase.perf.session.gauges.C6711l) r2
            r2.m34287k()
            java.util.concurrent.ScheduledFuture r2 = r5.gaugeManagerDataCollectionJob
            if (r2 == 0) goto L25
            r3 = 0
            r2.cancel(r3)
        L25:
            c8.u r2 = r5.gaugeManagerExecutor
            java.lang.Object r2 = r2.get()
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2
            com.google.firebase.perf.session.gauges.d r3 = new com.google.firebase.perf.session.gauges.d
            r3.<init>()
            r0 = 20
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.schedule(r3, r0, r4)
            r0 = 0
            r5.sessionId = r0
            s9.d r0 = p507s9.EnumC26187d.APPLICATION_PROCESS_STATE_UNKNOWN
            r5.applicationProcessState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.gauges.GaugeManager.stopCollectingGauges():void");
    }

    private static void collectGaugeMetricOnce(C6702c c6702c, C6711l c6711l, Timer timer) {
        c6702c.m34270c(timer);
        c6711l.m34285c(timer);
    }

    GaugeManager(C3358u c3358u, C25197k c25197k, C6662a c6662a, C6708i c6708i, C3358u c3358u2, C3358u c3358u3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC26187d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = c3358u;
        this.transportManager = c25197k;
        this.configResolver = c6662a;
        this.gaugeMetadataManager = c6708i;
        this.cpuGaugeCollector = c3358u2;
        this.memoryGaugeCollector = c3358u3;
    }

    private long startCollectingGauges(EnumC26187d enumC26187d, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC26187d);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC26187d);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}

package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.AbstractC6659b;
import com.google.firebase.perf.application.C6658a;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p419p9.InterfaceC24679a;
import p507s9.EnumC26187d;

@Keep
/* loaded from: classes3.dex */
public class SessionManager extends AbstractC6659b {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C6658a appStateMonitor;
    private final Set<WeakReference<InterfaceC24679a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.m34244c(), C6658a.m34003b());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.m34249f()) {
            this.gaugeManager.logGaugeMetadata(perfSession.m34251h(), EnumC26187d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC26187d enumC26187d) {
        if (this.perfSession.m34249f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.m34251h(), enumC26187d);
        }
    }

    private void startOrStopCollectingGauges(EnumC26187d enumC26187d) {
        if (this.perfSession.m34249f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, enumC26187d);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC26187d enumC26187d = EnumC26187d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC26187d);
        startOrStopCollectingGauges(enumC26187d);
    }

    @Override // com.google.firebase.perf.application.AbstractC6659b, com.google.firebase.perf.application.C6658a.b
    public void onUpdateAppState(EnumC26187d enumC26187d) {
        super.onUpdateAppState(enumC26187d);
        if (this.appStateMonitor.m34014f()) {
            return;
        }
        if (enumC26187d == EnumC26187d.FOREGROUND) {
            updatePerfSession(enumC26187d);
        } else if (!updatePerfSessionIfExpired()) {
            startOrStopCollectingGauges(enumC26187d);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC24679a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: p9.b

            /* renamed from: q */
            public final /* synthetic */ Context f118631q;

            /* renamed from: r */
            public final /* synthetic */ PerfSession f118632r;

            public /* synthetic */ RunnableC24680b(Context context2, PerfSession perfSession) {
                r2 = context2;
                r3 = perfSession;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SessionManager.this.lambda$setApplicationContext$0(r2, r3);
            }
        });
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC24679a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(EnumC26187d enumC26187d) {
        synchronized (this.clients) {
            try {
                this.perfSession = PerfSession.m34244c();
                Iterator<WeakReference<InterfaceC24679a>> it = this.clients.iterator();
                while (it.hasNext()) {
                    InterfaceC24679a interfaceC24679a = it.next().get();
                    if (interfaceC24679a != null) {
                        interfaceC24679a.mo34162a(this.perfSession);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        logGaugeMetadataIfCollectionEnabled(enumC26187d);
        startOrStopCollectingGauges(enumC26187d);
    }

    public boolean updatePerfSessionIfExpired() {
        if (this.perfSession.m34248e()) {
            updatePerfSession(this.appStateMonitor.m34011a());
            return true;
        }
        return false;
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, C6658a c6658a) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = c6658a;
        registerForAppState();
    }
}

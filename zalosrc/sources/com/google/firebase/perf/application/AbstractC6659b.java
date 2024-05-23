package com.google.firebase.perf.application;

import com.google.firebase.perf.application.C6658a;
import java.lang.ref.WeakReference;
import p507s9.EnumC26187d;

/* renamed from: com.google.firebase.perf.application.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6659b implements C6658a.b {
    private final WeakReference<C6658a.b> appStateCallback;
    private final C6658a appStateMonitor;
    private EnumC26187d currentAppState;
    private boolean isRegisteredForAppState;

    public AbstractC6659b() {
        this(C6658a.m34003b());
    }

    public EnumC26187d getAppState() {
        return this.currentAppState;
    }

    public WeakReference<C6658a.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i11) {
        this.appStateMonitor.m34013e(i11);
    }

    @Override // com.google.firebase.perf.application.C6658a.b
    public void onUpdateAppState(EnumC26187d enumC26187d) {
        EnumC26187d enumC26187d2 = this.currentAppState;
        EnumC26187d enumC26187d3 = EnumC26187d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC26187d2 == enumC26187d3) {
            this.currentAppState = enumC26187d;
        } else if (enumC26187d2 != enumC26187d && enumC26187d != enumC26187d3) {
            this.currentAppState = EnumC26187d.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.m34011a();
        this.appStateMonitor.m34018k(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (!this.isRegisteredForAppState) {
            return;
        }
        this.appStateMonitor.m34019p(this.appStateCallback);
        this.isRegisteredForAppState = false;
    }

    public AbstractC6659b(C6658a c6658a) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC26187d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = c6658a;
        this.appStateCallback = new WeakReference<>(this);
    }
}

package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p015a9.InterfaceC0662b;
import p034b8.InterfaceC2649a;
import p034b8.InterfaceC2650b;
import p034b8.InterfaceC2651c;
import p034b8.InterfaceC2652d;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3358u;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p095d8.EnumC17828m;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    static final C3358u f36406a = new C3358u(new InterfaceC0662b() { // from class: d8.c
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            ScheduledExecutorService m33486p;
            m33486p = ExecutorsRegistrar.m33486p();
            return m33486p;
        }
    });

    /* renamed from: b */
    static final C3358u f36407b = new C3358u(new InterfaceC0662b() { // from class: d8.d
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            ScheduledExecutorService m33487q;
            m33487q = ExecutorsRegistrar.m33487q();
            return m33487q;
        }
    });

    /* renamed from: c */
    static final C3358u f36408c = new C3358u(new InterfaceC0662b() { // from class: d8.e
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            ScheduledExecutorService m33488r;
            m33488r = ExecutorsRegistrar.m33488r();
            return m33488r;
        }
    });

    /* renamed from: d */
    static final C3358u f36409d = new C3358u(new InterfaceC0662b() { // from class: d8.f
        @Override // p015a9.InterfaceC0662b
        public final Object get() {
            ScheduledExecutorService m33489s;
            m33489s = ExecutorsRegistrar.m33489s();
            return m33489s;
        }
    });

    /* renamed from: i */
    private static StrictMode.ThreadPolicy m33479i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i11 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    private static ThreadFactory m33480j(String str, int i11) {
        return new ThreadFactoryC6547b(str, i11, null);
    }

    /* renamed from: k */
    private static ThreadFactory m33481k(String str, int i11, StrictMode.ThreadPolicy threadPolicy) {
        return new ThreadFactoryC6547b(str, i11, threadPolicy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m33482l(InterfaceC3342e interfaceC3342e) {
        return (ScheduledExecutorService) f36406a.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m33483m(InterfaceC3342e interfaceC3342e) {
        return (ScheduledExecutorService) f36408c.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m33484n(InterfaceC3342e interfaceC3342e) {
        return (ScheduledExecutorService) f36407b.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ Executor m33485o(InterfaceC3342e interfaceC3342e) {
        return EnumC17828m.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static /* synthetic */ ScheduledExecutorService m33486p() {
        return m33491u(Executors.newFixedThreadPool(4, m33481k("Firebase Background", 10, m33479i())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ ScheduledExecutorService m33487q() {
        return m33491u(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), m33481k("Firebase Lite", 0, m33490t())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ ScheduledExecutorService m33488r() {
        return m33491u(Executors.newCachedThreadPool(m33480j("Firebase Blocking", 11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ ScheduledExecutorService m33489s() {
        return Executors.newSingleThreadScheduledExecutor(m33480j("Firebase Scheduler", 0));
    }

    /* renamed from: t */
    private static StrictMode.ThreadPolicy m33490t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* renamed from: u */
    private static ScheduledExecutorService m33491u(ExecutorService executorService) {
        return new ScheduledExecutorServiceC6560o(executorService, (ScheduledExecutorService) f36409d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3339c.m16820d(C3338b0.m16815a(InterfaceC2649a.class, ScheduledExecutorService.class), C3338b0.m16815a(InterfaceC2649a.class, ExecutorService.class), C3338b0.m16815a(InterfaceC2649a.class, Executor.class)).m16845f(new InterfaceC3345h() { // from class: d8.g
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                ScheduledExecutorService m33482l;
                m33482l = ExecutorsRegistrar.m33482l(interfaceC3342e);
                return m33482l;
            }
        }).m16843d(), C3339c.m16820d(C3338b0.m16815a(InterfaceC2650b.class, ScheduledExecutorService.class), C3338b0.m16815a(InterfaceC2650b.class, ExecutorService.class), C3338b0.m16815a(InterfaceC2650b.class, Executor.class)).m16845f(new InterfaceC3345h() { // from class: d8.h
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                ScheduledExecutorService m33483m;
                m33483m = ExecutorsRegistrar.m33483m(interfaceC3342e);
                return m33483m;
            }
        }).m16843d(), C3339c.m16820d(C3338b0.m16815a(InterfaceC2651c.class, ScheduledExecutorService.class), C3338b0.m16815a(InterfaceC2651c.class, ExecutorService.class), C3338b0.m16815a(InterfaceC2651c.class, Executor.class)).m16845f(new InterfaceC3345h() { // from class: d8.i
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                ScheduledExecutorService m33484n;
                m33484n = ExecutorsRegistrar.m33484n(interfaceC3342e);
                return m33484n;
            }
        }).m16843d(), C3339c.m16819c(C3338b0.m16815a(InterfaceC2652d.class, Executor.class)).m16845f(new InterfaceC3345h() { // from class: d8.j
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                Executor m33485o;
                m33485o = ExecutorsRegistrar.m33485o(interfaceC3342e);
                return m33485o;
            }
        }).m16843d());
    }
}

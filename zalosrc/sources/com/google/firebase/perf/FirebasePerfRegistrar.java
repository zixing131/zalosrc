package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.AbstractC6596l;
import com.google.firebase.C6576e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.C6716c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import p034b8.InterfaceC2652d;
import p035b9.InterfaceC2661e;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p233i9.C20429b;
import p233i9.C20432e;
import p260j9.C21097a;
import p293k9.C21598a;
import p521t9.AbstractC26607h;
import p668y3.InterfaceC30281g;

@Keep
/* loaded from: classes3.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C20429b lambda$getComponents$0(C3338b0 c3338b0, InterfaceC3342e interfaceC3342e) {
        return new C20429b((C6576e) interfaceC3342e.mo16847a(C6576e.class), (AbstractC6596l) interfaceC3342e.mo16850d(AbstractC6596l.class).get(), (Executor) interfaceC3342e.mo16853g(c3338b0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C20432e providesFirebasePerformance(InterfaceC3342e interfaceC3342e) {
        interfaceC3342e.mo16847a(C20429b.class);
        return C21097a.m109625b().m109629b(new C21598a((C6576e) interfaceC3342e.mo16847a(C6576e.class), (InterfaceC2661e) interfaceC3342e.mo16847a(InterfaceC2661e.class), interfaceC3342e.mo16850d(C6716c.class), interfaceC3342e.mo16850d(InterfaceC30281g.class))).m109628a().mo109627a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3339c> getComponents() {
        final C3338b0 m16815a = C3338b0.m16815a(InterfaceC2652d.class, Executor.class);
        return Arrays.asList(C3339c.m16821e(C20432e.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16910l(C6716c.class)).m16841b(C3355r.m16909k(InterfaceC2661e.class)).m16841b(C3355r.m16910l(InterfaceC30281g.class)).m16841b(C3355r.m16909k(C20429b.class)).m16845f(new InterfaceC3345h() { // from class: i9.c
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                C20432e providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(interfaceC3342e);
                return providesFirebasePerformance;
            }
        }).m16843d(), C3339c.m16821e(C20429b.class).m16846h(EARLY_LIBRARY_NAME).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16907i(AbstractC6596l.class)).m16841b(C3355r.m16908j(m16815a)).m16844e().m16845f(new InterfaceC3345h() { // from class: i9.d
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                C20429b lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(C3338b0.this, interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16843d(), AbstractC26607h.m136567b(LIBRARY_NAME, "20.3.1"));
    }
}

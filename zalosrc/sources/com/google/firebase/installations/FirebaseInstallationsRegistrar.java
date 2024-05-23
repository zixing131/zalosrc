package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C6576e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p034b8.InterfaceC2649a;
import p034b8.InterfaceC2650b;
import p035b9.InterfaceC2661e;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p095d8.AbstractC17826k;
import p521t9.AbstractC26607h;
import p673y8.AbstractC30820h;
import p673y8.InterfaceC30821i;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC2661e lambda$getComponents$0(InterfaceC3342e interfaceC3342e) {
        return new C6584c((C6576e) interfaceC3342e.mo16847a(C6576e.class), interfaceC3342e.mo16850d(InterfaceC30821i.class), (ExecutorService) interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2649a.class, ExecutorService.class)), AbstractC17826k.m94063b((Executor) interfaceC3342e.mo16853g(C3338b0.m16815a(InterfaceC2650b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3339c> getComponents() {
        return Arrays.asList(C3339c.m16821e(InterfaceC2661e.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16907i(InterfaceC30821i.class)).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2649a.class, ExecutorService.class))).m16841b(C3355r.m16908j(C3338b0.m16815a(InterfaceC2650b.class, Executor.class))).m16845f(new InterfaceC3345h() { // from class: b9.f
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                InterfaceC2661e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16843d(), AbstractC30820h.m149906a(), AbstractC26607h.m136567b(LIBRARY_NAME, "17.1.3"));
    }
}

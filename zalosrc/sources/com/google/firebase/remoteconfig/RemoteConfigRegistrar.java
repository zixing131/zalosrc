package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C6576e;
import com.google.firebase.abt.component.C6536a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.C6716c;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p014a8.InterfaceC0650a;
import p034b8.InterfaceC2650b;
import p035b9.InterfaceC2661e;
import p052c8.C3338b0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6716c lambda$getComponents$0(C3338b0 c3338b0, InterfaceC3342e interfaceC3342e) {
        return new C6716c((Context) interfaceC3342e.mo16847a(Context.class), (ScheduledExecutorService) interfaceC3342e.mo16853g(c3338b0), (C6576e) interfaceC3342e.mo16847a(C6576e.class), (InterfaceC2661e) interfaceC3342e.mo16847a(InterfaceC2661e.class), ((C6536a) interfaceC3342e.mo16847a(C6536a.class)).m33463b("frc"), interfaceC3342e.mo16850d(InterfaceC0650a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3339c> getComponents() {
        final C3338b0 m16815a = C3338b0.m16815a(InterfaceC2650b.class, ScheduledExecutorService.class);
        return Arrays.asList(C3339c.m16821e(C6716c.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(Context.class)).m16841b(C3355r.m16908j(m16815a)).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16909k(InterfaceC2661e.class)).m16841b(C3355r.m16909k(C6536a.class)).m16841b(C3355r.m16907i(InterfaceC0650a.class)).m16845f(new InterfaceC3345h() { // from class: u9.m
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                C6716c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(C3338b0.this, interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16844e().m16843d(), AbstractC26607h.m136567b(LIBRARY_NAME, "21.3.0"));
    }
}

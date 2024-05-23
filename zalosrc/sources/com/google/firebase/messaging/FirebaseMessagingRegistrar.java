package com.google.firebase.messaging;

import androidx.annotation.Keep;
import androidx.appcompat.widget.AbstractC1158c0;
import com.google.firebase.C6576e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p035b9.InterfaceC2661e;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;
import p521t9.InterfaceC26608i;
import p636x8.InterfaceC29474d;
import p668y3.InterfaceC30281g;
import p673y8.InterfaceC30822j;
import p708z8.InterfaceC31707a;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC3342e interfaceC3342e) {
        C6576e c6576e = (C6576e) interfaceC3342e.mo16847a(C6576e.class);
        AbstractC1158c0.m5500a(interfaceC3342e.mo16847a(InterfaceC31707a.class));
        return new FirebaseMessaging(c6576e, null, interfaceC3342e.mo16850d(InterfaceC26608i.class), interfaceC3342e.mo16850d(InterfaceC30822j.class), (InterfaceC2661e) interfaceC3342e.mo16847a(InterfaceC2661e.class), (InterfaceC30281g) interfaceC3342e.mo16847a(InterfaceC30281g.class), (InterfaceC29474d) interfaceC3342e.mo16847a(InterfaceC29474d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3339c> getComponents() {
        return Arrays.asList(C3339c.m16821e(FirebaseMessaging.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16906h(InterfaceC31707a.class)).m16841b(C3355r.m16907i(InterfaceC26608i.class)).m16841b(C3355r.m16907i(InterfaceC30822j.class)).m16841b(C3355r.m16906h(InterfaceC30281g.class)).m16841b(C3355r.m16909k(InterfaceC2661e.class)).m16841b(C3355r.m16909k(InterfaceC29474d.class)).m16845f(new InterfaceC3345h() { // from class: com.google.firebase.messaging.y
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                FirebaseMessaging lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16842c().m16843d(), AbstractC26607h.m136567b(LIBRARY_NAME, "23.1.2"));
    }
}

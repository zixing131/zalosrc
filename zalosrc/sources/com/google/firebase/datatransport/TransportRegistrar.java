package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C3994a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import p010a4.C0128u;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;
import p668y3.InterfaceC30281g;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC30281g lambda$getComponents$0(InterfaceC3342e interfaceC3342e) {
        C0128u.m563f((Context) interfaceC3342e.mo16847a(Context.class));
        return C0128u.m561c().m565g(C3994a.f15796h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3339c> getComponents() {
        return Arrays.asList(C3339c.m16821e(InterfaceC30281g.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(Context.class)).m16845f(new InterfaceC3345h() { // from class: r8.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                InterfaceC30281g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16843d(), AbstractC26607h.m136567b(LIBRARY_NAME, "18.1.7"));
    }
}

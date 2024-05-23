package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.abt.component.C6536a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p014a8.InterfaceC0650a;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C6536a lambda$getComponents$0(InterfaceC3342e interfaceC3342e) {
        return new C6536a((Context) interfaceC3342e.mo16847a(Context.class), interfaceC3342e.mo16850d(InterfaceC0650a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3339c> getComponents() {
        return Arrays.asList(C3339c.m16821e(C6536a.class).m16846h(LIBRARY_NAME).m16841b(C3355r.m16909k(Context.class)).m16841b(C3355r.m16907i(InterfaceC0650a.class)).m16845f(new InterfaceC3345h() { // from class: z7.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                C6536a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(interfaceC3342e);
                return lambda$getComponents$0;
            }
        }).m16843d(), AbstractC26607h.m136567b(LIBRARY_NAME, "21.1.1"));
    }
}

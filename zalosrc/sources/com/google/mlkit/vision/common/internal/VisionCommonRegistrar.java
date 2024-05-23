package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.C6763a;
import java.util.List;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p705z5.AbstractC31476mc;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC31476mc.m152320n(C3339c.m16821e(C6763a.class).m16841b(C3355r.m16911m(C6763a.a.class)).m16845f(new InterfaceC3345h() { // from class: com.google.mlkit.vision.common.internal.d
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                return new C6763a(interfaceC3342e.mo16849c(C6763a.a.class));
            }
        }).m16843d());
    }
}

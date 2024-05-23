package com.google.mlkit.vision.text.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.text.internal.C6778l;
import java.util.List;
import p012a6.AbstractC0430p0;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p234ia.C20454d;
import p234ia.C20464i;

/* loaded from: classes.dex */
public class TextRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC0430p0.m830n(C3339c.m16821e(C6778l.class).m16841b(C3355r.m16909k(C20464i.class)).m16845f(new InterfaceC3345h() { // from class: ra.f
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                return new C6778l((C20464i) interfaceC3342e.mo16847a(C20464i.class));
            }
        }).m16843d(), C3339c.m16821e(C6777k.class).m16841b(C3355r.m16909k(C6778l.class)).m16841b(C3355r.m16909k(C20454d.class)).m16845f(new InterfaceC3345h() { // from class: com.google.mlkit.vision.text.internal.o
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                return new C6777k((C6778l) interfaceC3342e.mo16847a(C6778l.class), (C20454d) interfaceC3342e.mo16847a(C20454d.class));
            }
        }).m16843d());
    }
}

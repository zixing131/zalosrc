package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.barcode.internal.C6756e;
import java.util.List;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p234ia.C20454d;
import p234ia.C20464i;
import p670y5.AbstractC30375e1;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC30375e1.m149493m(C3339c.m16821e(C6756e.class).m16841b(C3355r.m16909k(C20464i.class)).m16845f(new InterfaceC3345h() { // from class: na.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                return new C6756e((C20464i) interfaceC3342e.mo16847a(C20464i.class));
            }
        }).m16843d(), C3339c.m16821e(C6755d.class).m16841b(C3355r.m16909k(C6756e.class)).m16841b(C3355r.m16909k(C20454d.class)).m16845f(new InterfaceC3345h() { // from class: com.google.mlkit.vision.barcode.internal.c
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                return new C6755d((C6756e) interfaceC3342e.mo16847a(C6756e.class), (C20454d) interfaceC3342e.mo16847a(C20454d.class));
            }
        }).m16843d());
    }
}

package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p153f8.C18820e;
import p153f8.InterfaceC18816a;
import p521t9.AbstractC26607h;

/* loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public InterfaceC18816a m33528b(InterfaceC3342e interfaceC3342e) {
        return C6569f.m33559f((Context) interfaceC3342e.mo16847a(Context.class), !C18820e.m98789g(r2));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3339c.m16821e(InterfaceC18816a.class).m16846h("fire-cls-ndk").m16841b(C3355r.m16909k(Context.class)).m16845f(new InterfaceC3345h() { // from class: com.google.firebase.crashlytics.ndk.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                InterfaceC18816a m33528b;
                m33528b = CrashlyticsNdkRegistrar.this.m33528b(interfaceC3342e);
                return m33528b;
            }
        }).m16844e().m16843d(), AbstractC26607h.m136567b("fire-cls-ndk", "18.3.6"));
    }
}

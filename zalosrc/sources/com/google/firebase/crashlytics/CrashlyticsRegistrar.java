package com.google.firebase.crashlytics;

import com.google.firebase.C6576e;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Arrays;
import java.util.List;
import p014a8.InterfaceC0650a;
import p035b9.InterfaceC2661e;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p153f8.InterfaceC18816a;
import p521t9.AbstractC26607h;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public FirebaseCrashlytics m33524b(InterfaceC3342e interfaceC3342e) {
        return FirebaseCrashlytics.m33525a((C6576e) interfaceC3342e.mo16847a(C6576e.class), (InterfaceC2661e) interfaceC3342e.mo16847a(InterfaceC2661e.class), interfaceC3342e.mo16855i(InterfaceC18816a.class), interfaceC3342e.mo16855i(InterfaceC0650a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C3339c.m16821e(FirebaseCrashlytics.class).m16846h("fire-cls").m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16909k(InterfaceC2661e.class)).m16841b(C3355r.m16904a(InterfaceC18816a.class)).m16841b(C3355r.m16904a(InterfaceC0650a.class)).m16845f(new InterfaceC3345h() { // from class: e8.f
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                FirebaseCrashlytics m33524b;
                m33524b = CrashlyticsRegistrar.this.m33524b(interfaceC3342e);
                return m33524b;
            }
        }).m16844e().m16843d(), AbstractC26607h.m136567b("fire-cls", "18.3.6"));
    }
}

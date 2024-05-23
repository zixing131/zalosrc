package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C6576e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p014a8.C0651b;
import p014a8.InterfaceC0650a;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p521t9.AbstractC26607h;
import p636x8.InterfaceC29474d;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C3339c> getComponents() {
        return Arrays.asList(C3339c.m16821e(InterfaceC0650a.class).m16841b(C3355r.m16909k(C6576e.class)).m16841b(C3355r.m16909k(Context.class)).m16841b(C3355r.m16909k(InterfaceC29474d.class)).m16845f(new InterfaceC3345h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                InterfaceC0650a m938h;
                m938h = C0651b.m938h((C6576e) interfaceC3342e.mo16847a(C6576e.class), (Context) interfaceC3342e.mo16847a(Context.class), (InterfaceC29474d) interfaceC3342e.mo16847a(InterfaceC29474d.class));
                return m938h;
            }
        }).m16844e().m16843d(), AbstractC26607h.m136567b("fire-analytics", "21.2.1"));
    }
}

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p664y.AbstractC30228a;

/* renamed from: com.google.android.gms.internal.ads.qz */
/* loaded from: classes2.dex */
public abstract class AbstractC4927qz {

    /* renamed from: a */
    private static final AtomicReference f27002a = new AtomicReference();

    /* renamed from: b */
    private static final AtomicReference f27003b = new AtomicReference();

    /* renamed from: c */
    static final AtomicBoolean f27004c = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC4852oz m25920a() {
        return (InterfaceC4852oz) f27002a.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC4890pz m25921b() {
        AbstractC30228a.m149044a(f27003b.get());
        return null;
    }

    /* renamed from: c */
    public static void m25922c(InterfaceC4852oz interfaceC4852oz) {
        f27002a.set(interfaceC4852oz);
    }
}

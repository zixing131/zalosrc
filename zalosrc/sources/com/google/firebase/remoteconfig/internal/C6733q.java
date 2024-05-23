package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.C6576e;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import p035b9.InterfaceC2661e;

/* renamed from: com.google.firebase.remoteconfig.internal.q */
/* loaded from: classes3.dex */
public class C6733q {

    /* renamed from: a */
    private final Set f37050a;

    /* renamed from: b */
    private final C6735s f37051b;

    /* renamed from: c */
    private final C6729m f37052c;

    /* renamed from: d */
    private final C6576e f37053d;

    /* renamed from: e */
    private final InterfaceC2661e f37054e;

    /* renamed from: f */
    private final C6722f f37055f;

    /* renamed from: g */
    private final Context f37056g;

    /* renamed from: h */
    private final String f37057h;

    /* renamed from: i */
    private final C6732p f37058i;

    /* renamed from: j */
    private final ScheduledExecutorService f37059j;

    public C6733q(C6576e c6576e, InterfaceC2661e interfaceC2661e, C6729m c6729m, C6722f c6722f, Context context, String str, C6732p c6732p, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f37050a = linkedHashSet;
        this.f37051b = new C6735s(c6576e, interfaceC2661e, c6729m, c6722f, context, str, linkedHashSet, c6732p, scheduledExecutorService);
        this.f37053d = c6576e;
        this.f37052c = c6729m;
        this.f37054e = interfaceC2661e;
        this.f37055f = c6722f;
        this.f37056g = context;
        this.f37057h = str;
        this.f37058i = c6732p;
        this.f37059j = scheduledExecutorService;
    }

    /* renamed from: a */
    private synchronized void m34461a() {
        if (!this.f37050a.isEmpty()) {
            this.f37051b.m34486B();
        }
    }

    /* renamed from: b */
    public synchronized void m34462b(boolean z11) {
        this.f37051b.m34491y(z11);
        if (!z11) {
            m34461a();
        }
    }
}

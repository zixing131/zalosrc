package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Map;
import p230i6.AbstractC20316h;

/* renamed from: com.google.android.gms.measurement.internal.r3 */
/* loaded from: classes.dex */
final class RunnableC6115r3 implements Runnable {

    /* renamed from: p */
    private final InterfaceC6104q3 f34390p;

    /* renamed from: q */
    private final int f34391q;

    /* renamed from: r */
    private final Throwable f34392r;

    /* renamed from: s */
    private final byte[] f34393s;

    /* renamed from: t */
    private final String f34394t;

    /* renamed from: u */
    private final Map f34395u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC6115r3(String str, InterfaceC6104q3 interfaceC6104q3, int i11, Throwable th2, byte[] bArr, Map map, AbstractC20316h abstractC20316h) {
        AbstractC4205o.m19722k(interfaceC6104q3);
        this.f34390p = interfaceC6104q3;
        this.f34391q = i11;
        this.f34392r = th2;
        this.f34393s = bArr;
        this.f34394t = str;
        this.f34395u = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34390p.mo30833a(this.f34394t, this.f34391q, this.f34392r, this.f34393s, this.f34395u);
    }
}

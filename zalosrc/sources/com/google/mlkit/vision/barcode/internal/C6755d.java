package com.google.mlkit.vision.barcode.internal;

import p234ia.C20454d;
import p294ka.C21631b;
import p670y5.AbstractC30770yg;

/* renamed from: com.google.mlkit.vision.barcode.internal.d */
/* loaded from: classes.dex */
public final class C6755d {

    /* renamed from: a */
    private final C6756e f37146a;

    /* renamed from: b */
    private final C20454d f37147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6755d(C6756e c6756e, C20454d c20454d) {
        this.f37146a = c6756e;
        this.f37147b = c20454d;
    }

    /* renamed from: a */
    public final BarcodeScannerImpl m34576a(C21631b c21631b) {
        return new BarcodeScannerImpl(c21631b, (C6759h) this.f37146a.m106487b(c21631b), this.f37147b.m106486a(c21631b.m111559b()), AbstractC30770yg.m149736b(AbstractC6753b.m34573d()));
    }
}

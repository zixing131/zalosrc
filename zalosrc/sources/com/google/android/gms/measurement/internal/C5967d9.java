package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.d9 */
/* loaded from: classes.dex */
public final class C5967d9 implements InterfaceC6104q3 {

    /* renamed from: a */
    final /* synthetic */ String f33866a;

    /* renamed from: b */
    final /* synthetic */ C6055l9 f33867b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5967d9(C6055l9 c6055l9, String str) {
        this.f33867b = c6055l9;
        this.f33866a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC6104q3
    /* renamed from: a */
    public final void mo30833a(String str, int i11, Throwable th2, byte[] bArr, Map map) {
        this.f33867b.m31097o(i11, th2, bArr, this.f33866a);
    }
}

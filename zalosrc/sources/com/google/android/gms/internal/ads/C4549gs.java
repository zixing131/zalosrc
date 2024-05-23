package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* renamed from: com.google.android.gms.internal.ads.gs */
/* loaded from: classes2.dex */
final class C4549gs extends PushbackInputStream {

    /* renamed from: p */
    final /* synthetic */ C4586hs f20804p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4549gs(C4586hs c4586hs, InputStream inputStream, int i11) {
        super(inputStream, 1);
        this.f20804p = c4586hs;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        C4659js.m23734e(this.f20804p.f21890r);
        super.close();
    }
}

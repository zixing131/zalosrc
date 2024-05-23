package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import jm0.InterfaceC21299i;

@Keep
/* loaded from: classes7.dex */
public abstract class NativeRequestListener {

    /* renamed from: a */
    final int f89277a;

    /* renamed from: b */
    final int f89278b;

    /* renamed from: c */
    final InterfaceC21299i f89279c;

    /* renamed from: d */
    boolean f89280d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeRequestListener(int i11, int i12, boolean z11, InterfaceC21299i interfaceC21299i) {
        this.f89277a = i11;
        this.f89278b = i12;
        this.f89279c = interfaceC21299i;
        this.f89280d = z11;
    }

    /* renamed from: a */
    public boolean m93203a() {
        return this.f89280d;
    }

    @Keep
    abstract void onProgressUpdate(int i11);

    @Keep
    abstract void onRenewComplete(byte[] bArr, long j11);

    @Keep
    abstract void onRequestComplete(byte[] bArr, int i11, long j11, long j12);

    @Keep
    abstract void onRequestFailed(int i11, byte[] bArr, int i12, long j11, long j12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeRequestListener(int i11, int i12, InterfaceC21299i interfaceC21299i) {
        this.f89280d = false;
        this.f89277a = i11;
        this.f89278b = i12;
        this.f89279c = interfaceC21299i;
    }
}

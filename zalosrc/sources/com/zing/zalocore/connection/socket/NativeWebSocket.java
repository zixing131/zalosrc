package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import ho0.AbstractC20110a;

@Keep
/* loaded from: classes7.dex */
public final class NativeWebSocket {

    /* renamed from: a */
    private final InterfaceC17521a f89316a;

    /* renamed from: b */
    private final String f89317b;

    /* renamed from: c */
    private int f89318c = 0;

    @Keep
    private long mNativeWebSocket;

    /* renamed from: com.zing.zalocore.connection.socket.NativeWebSocket$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC17521a {
        /* renamed from: D */
        void mo93266D(int i11);

        /* renamed from: a */
        void mo93267a(int i11, int i12, byte[] bArr);
    }

    public NativeWebSocket(String str, InterfaceC17521a interfaceC17521a) {
        LoaderUtils.m93165a();
        this.f89317b = str;
        this.f89316a = interfaceC17521a;
        this.mNativeWebSocket = 0L;
    }

    @Keep
    private native void nativeConnect(String str);

    @Keep
    private native void nativeDisconnect();

    @Keep
    private native void nativeSendRequest(int i11, int i12, boolean z11, byte[] bArr, Object obj);

    /* renamed from: a */
    public void m93262a() {
        if (LoaderUtils.m93166b()) {
            nativeConnect(this.f89317b);
        }
    }

    /* renamed from: b */
    public void m93263b() {
        if (LoaderUtils.m93166b()) {
            nativeDisconnect();
        }
    }

    /* renamed from: c */
    public int m93264c() {
        return this.f89318c;
    }

    /* renamed from: d */
    public void m93265d(int i11, int i12, boolean z11, byte[] bArr, NativeWSRequestListener nativeWSRequestListener) {
        if (LoaderUtils.m93166b()) {
            nativeSendRequest(i11, i12, z11, bArr, nativeWSRequestListener);
        }
    }

    protected void finalize() {
        try {
            AbstractC20110a.m104544m("finalize object:%s", this);
            m93263b();
        } finally {
            super.finalize();
        }
    }

    @Keep
    public void onReceiveData(int i11, int i12, byte[] bArr) {
        AbstractC20110a.m104544m("onReceiveData:%d - %d , length:%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(bArr.length));
        InterfaceC17521a interfaceC17521a = this.f89316a;
        if (interfaceC17521a != null) {
            interfaceC17521a.mo93267a(i11, i12, bArr);
        }
    }

    @Keep
    public void onStateChanged(int i11) {
        AbstractC20110a.m104544m("[WEBSOCKET] onStateChanged:%d", Integer.valueOf(i11));
        this.f89318c = i11;
        InterfaceC17521a interfaceC17521a = this.f89316a;
        if (interfaceC17521a != null) {
            interfaceC17521a.mo93266D(i11);
        }
    }
}

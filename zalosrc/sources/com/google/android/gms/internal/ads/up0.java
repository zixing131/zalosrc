package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class up0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f29013a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    final /* synthetic */ vp0 f29014b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public up0(vp0 vp0Var) {
        this.f29014b = vp0Var;
    }

    /* renamed from: a */
    private final Socket m27028a(Socket socket) {
        int i11;
        int i12;
        vp0 vp0Var = this.f29014b;
        i11 = vp0Var.f29441s;
        if (i11 > 0) {
            i12 = vp0Var.f29441s;
            socket.setReceiveBufferSize(i12);
        }
        this.f29014b.f29442t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) {
        Socket createSocket = this.f29013a.createSocket(str, i11);
        m27028a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f29013a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f29013a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) {
        Socket createSocket = this.f29013a.createSocket(str, i11, inetAddress, i12);
        m27028a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) {
        Socket createSocket = this.f29013a.createSocket(inetAddress, i11);
        m27028a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
        Socket createSocket = this.f29013a.createSocket(inetAddress, i11, inetAddress2, i12);
        m27028a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) {
        Socket createSocket = this.f29013a.createSocket(socket, str, i11, z11);
        m27028a(createSocket);
        return createSocket;
    }
}

package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class yn0 extends SSLSocketFactory {

    /* renamed from: a */
    final SSLSocketFactory f31041a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b */
    final /* synthetic */ zn0 f31042b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yn0(zn0 zn0Var) {
        this.f31042b = zn0Var;
    }

    /* renamed from: a */
    private final Socket m28270a(Socket socket) {
        int i11;
        int i12;
        zn0 zn0Var = this.f31042b;
        i11 = zn0Var.f31614o;
        if (i11 > 0) {
            i12 = zn0Var.f31614o;
            socket.setReceiveBufferSize(i12);
        }
        this.f31042b.f31615p.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) {
        Socket createSocket = this.f31041a.createSocket(str, i11);
        m28270a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f31041a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f31041a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) {
        Socket createSocket = this.f31041a.createSocket(str, i11, inetAddress, i12);
        m28270a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) {
        Socket createSocket = this.f31041a.createSocket(inetAddress, i11);
        m28270a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
        Socket createSocket = this.f31041a.createSocket(inetAddress, i11, inetAddress2, i12);
        m28270a(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) {
        Socket createSocket = this.f31041a.createSocket(socket, str, i11, z11);
        m28270a(createSocket);
        return createSocket;
    }
}

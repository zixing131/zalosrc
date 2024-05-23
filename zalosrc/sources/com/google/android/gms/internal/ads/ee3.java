package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes2.dex */
public final class ee3 extends kd2 {

    /* renamed from: e */
    private final byte[] f19608e;

    /* renamed from: f */
    private final DatagramPacket f19609f;

    /* renamed from: g */
    private Uri f19610g;

    /* renamed from: h */
    private DatagramSocket f19611h;

    /* renamed from: i */
    private MulticastSocket f19612i;

    /* renamed from: j */
    private InetAddress f19613j;

    /* renamed from: k */
    private boolean f19614k;

    /* renamed from: l */
    private int f19615l;

    public ee3(int i11) {
        super(true);
        byte[] bArr = new byte[ZAbstractBase.ZVU_PROCESS_FLUSH];
        this.f19608e = bArr;
        this.f19609f = new DatagramPacket(bArr, 0, ZAbstractBase.ZVU_PROCESS_FLUSH);
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        if (this.f19615l == 0) {
            try {
                DatagramSocket datagramSocket = this.f19611h;
                datagramSocket.getClass();
                datagramSocket.receive(this.f19609f);
                int length = this.f19609f.getLength();
                this.f19615l = length;
                m23893b(length);
            } catch (SocketTimeoutException e11) {
                throw new zzga(e11, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
            } catch (IOException e12) {
                throw new zzga(e12, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
            }
        }
        int length2 = this.f19609f.getLength();
        int i13 = this.f19615l;
        int min = Math.min(i13, i12);
        System.arraycopy(this.f19608e, length2 - i13, bArr, i11, min);
        this.f19615l -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        Uri uri = wo2Var.f30043a;
        this.f19610g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f19610g.getPort();
        m23895l(wo2Var);
        try {
            this.f19613j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f19613j, port);
            if (this.f19613j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f19612i = multicastSocket;
                multicastSocket.joinGroup(this.f19613j);
                this.f19611h = this.f19612i;
            } else {
                this.f19611h = new DatagramSocket(inetSocketAddress);
            }
            this.f19611h.setSoTimeout(8000);
            this.f19614k = true;
            m23896m(wo2Var);
            return -1L;
        } catch (IOException e11) {
            throw new zzga(e11, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4);
        } catch (SecurityException e12) {
            throw new zzga(e12, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f19610g;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f19610g = null;
        MulticastSocket multicastSocket = this.f19612i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f19613j;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f19612i = null;
        }
        DatagramSocket datagramSocket = this.f19611h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f19611h = null;
        }
        this.f19613j = null;
        this.f19615l = 0;
        if (this.f19614k) {
            this.f19614k = false;
            m23894k();
        }
    }
}

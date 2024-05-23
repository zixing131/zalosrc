package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;

/* loaded from: classes7.dex */
public class E2eeRequestPacket extends RequestPacket {

    /* renamed from: u */
    private int f89253u = 0;

    /* renamed from: v */
    private int f89254v = 1;

    /* renamed from: w */
    private byte f89255w = 0;

    /* renamed from: x */
    private byte f89256x = 0;

    /* renamed from: y */
    private byte f89257y = 0;

    /* renamed from: z */
    private byte f89258z = 0;

    /* renamed from: A */
    private long f89252A = 0;

    public E2eeRequestPacket() {
        this.f89337q = (byte) 1;
    }

    /* renamed from: I */
    public void m93152I(int i11) {
        this.f89253u = i11;
    }

    /* renamed from: J */
    public void m93153J(byte b11) {
        this.f89257y = b11;
    }

    /* renamed from: K */
    public void m93154K(byte b11) {
        this.f89258z = b11;
    }

    /* renamed from: L */
    public void m93155L(byte b11) {
        this.f89255w = b11;
    }

    /* renamed from: M */
    public void m93156M(byte b11) {
        this.f89256x = b11;
    }

    /* renamed from: N */
    public void m93157N(int i11) {
        this.f89254v = i11;
    }

    /* renamed from: O */
    public void m93158O(long j11) {
        this.f89252A = j11;
    }

    @Keep
    public byte gau() {
        return this.f89257y;
    }

    @Keep
    public int gedi() {
        return this.f89253u;
    }

    @Keep
    public int gesdi() {
        return this.f89254v;
    }

    @Keep
    public byte gijng() {
        return this.f89258z;
    }

    @Keep
    public byte ginpc() {
        return this.f89255w;
    }

    @Keep
    public byte giri() {
        return this.f89256x;
    }

    @Keep
    public long gts() {
        return this.f89252A;
    }
}

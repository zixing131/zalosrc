package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import java.nio.charset.StandardCharsets;

/* loaded from: classes7.dex */
public class RequestPacket {

    /* renamed from: a */
    private int f89321a;

    /* renamed from: b */
    private int f89322b;

    /* renamed from: c */
    private byte f89323c;

    /* renamed from: d */
    private int f89324d;

    /* renamed from: e */
    private byte f89325e;

    /* renamed from: f */
    private byte f89326f;

    /* renamed from: g */
    private int f89327g;

    /* renamed from: h */
    private int f89328h;

    /* renamed from: i */
    private byte f89329i;

    /* renamed from: j */
    private short f89330j;

    /* renamed from: k */
    private byte f89331k;

    /* renamed from: l */
    private int f89332l;

    /* renamed from: m */
    private int f89333m;

    /* renamed from: n */
    private byte f89334n;

    /* renamed from: o */
    private long f89335o;

    /* renamed from: p */
    private long f89336p;

    @Keep
    public byte[] params;

    /* renamed from: q */
    protected byte f89337q;

    /* renamed from: r */
    private long f89338r;

    /* renamed from: s */
    private String f89339s;

    /* renamed from: t */
    private boolean f89340t;

    public RequestPacket() {
        this.f89321a = 0;
        this.f89337q = (byte) 0;
        this.f89338r = 0L;
        this.f89340t = false;
        this.f89336p = System.currentTimeMillis();
        this.f89327g = 0;
    }

    /* renamed from: A */
    public void m93270A(long j11) {
        this.f89338r = j11;
    }

    /* renamed from: B */
    public void m93271B(int i11) {
        this.f89332l = i11;
    }

    /* renamed from: C */
    public void m93272C(int i11) {
        this.f89327g = i11;
    }

    /* renamed from: D */
    public void m93273D(int i11) {
        this.f89328h = i11;
    }

    /* renamed from: E */
    public void m93274E(byte b11) {
        this.f89329i = b11;
    }

    /* renamed from: F */
    public void m93275F(byte b11) {
        this.f89331k = b11;
    }

    /* renamed from: G */
    public void m93276G(int i11) {
        this.f89321a = i11;
    }

    /* renamed from: H */
    public void m93277H(byte b11) {
        this.f89323c = b11;
    }

    /* renamed from: a */
    public short m93278a() {
        return this.f89330j;
    }

    /* renamed from: b */
    public int m93279b() {
        return this.f89333m;
    }

    /* renamed from: c */
    public byte m93280c() {
        return this.f89334n;
    }

    /* renamed from: d */
    public int m93281d() {
        return this.f89322b;
    }

    /* renamed from: e */
    public long m93282e() {
        return this.f89335o;
    }

    /* renamed from: f */
    public boolean m93283f() {
        return this.f89340t;
    }

    /* renamed from: g */
    public byte m93284g() {
        return this.f89326f;
    }

    @Keep
    public int gdi() {
        return this.f89333m;
    }

    @Keep
    public byte gdt() {
        return this.f89334n;
    }

    @Keep
    public byte gem() {
        return this.f89337q;
    }

    @Keep
    public long ggmi() {
        return this.f89335o;
    }

    @Keep
    public int glp() {
        byte[] bArr = this.params;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    @Keep
    public short gmd() {
        return this.f89330j;
    }

    @Keep
    public byte gmt() {
        return this.f89326f;
    }

    @Keep
    public byte gna() {
        return this.f89325e;
    }

    @Keep
    public int grc() {
        return this.f89332l;
    }

    @Keep
    public long grid() {
        return this.f89336p;
    }

    @Keep
    public long grto() {
        return this.f89338r;
    }

    @Keep
    public int gsi() {
        return this.f89327g;
    }

    @Keep
    public byte gsmd() {
        return this.f89331k;
    }

    @Keep
    public int gsri() {
        return this.f89328h;
    }

    @Keep
    public byte gst() {
        return this.f89329i;
    }

    @Keep
    /* renamed from: gv */
    public byte m93285gv() {
        return this.f89323c;
    }

    /* renamed from: h */
    public byte[] m93286h() {
        return this.params;
    }

    /* renamed from: i */
    public String mo93287i() {
        byte[] bArr = this.params;
        if (bArr != null && bArr.length > 0) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return "";
    }

    /* renamed from: j */
    public long m93288j() {
        return this.f89338r;
    }

    /* renamed from: k */
    public int m93289k() {
        return this.f89332l;
    }

    /* renamed from: l */
    public int m93290l() {
        return this.f89327g;
    }

    /* renamed from: m */
    public int m93291m() {
        return this.f89328h;
    }

    /* renamed from: n */
    public byte m93292n() {
        return this.f89329i;
    }

    /* renamed from: o */
    public byte m93293o() {
        return this.f89331k;
    }

    /* renamed from: p */
    public byte m93294p() {
        return this.f89323c;
    }

    /* renamed from: q */
    public void m93295q(short s7) {
        this.f89330j = s7;
    }

    /* renamed from: r */
    public void m93296r(String str) {
        this.f89339s = str;
    }

    /* renamed from: s */
    public void m93297s(int i11) {
        this.f89333m = i11;
    }

    /* renamed from: t */
    public void m93298t(byte b11) {
        this.f89334n = b11;
    }

    /* renamed from: u */
    public void m93299u(long j11) {
        this.f89335o = j11;
    }

    /* renamed from: v */
    public void m93300v(boolean z11) {
        this.f89340t = z11;
    }

    /* renamed from: w */
    public void m93301w(byte b11) {
        this.f89326f = b11;
    }

    /* renamed from: x */
    public void m93302x(byte b11) {
        this.f89325e = b11;
    }

    /* renamed from: y */
    public void m93303y(byte[] bArr) {
        this.params = bArr;
    }

    /* renamed from: z */
    public void m93304z(long j11) {
        this.f89336p = j11;
    }

    @Keep
    public RequestPacket(int i11, int i12, int i13, int i14, int i15, int i16, int i17, byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, short s7, long j11, byte[] bArr) {
        this.f89321a = 0;
        this.f89337q = (byte) 0;
        this.f89338r = 0L;
        this.f89340t = false;
        this.f89322b = i11;
        this.f89324d = i12;
        this.f89328h = i13;
        this.f89327g = i14;
        this.f89333m = i15;
        this.f89332l = i17;
        this.f89323c = b11;
        this.f89325e = b12;
        this.f89326f = b13;
        this.f89329i = b14;
        this.f89331k = b15;
        this.f89334n = b16;
        this.f89330j = s7;
        this.f89335o = j11;
        this.params = bArr != null ? (byte[]) bArr.clone() : null;
    }
}

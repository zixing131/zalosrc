package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class pz3 implements InterfaceC5123w9 {

    /* renamed from: y */
    private static final b04 f26578y = b04.m20367b(pz3.class);

    /* renamed from: p */
    protected final String f26579p;

    /* renamed from: q */
    private InterfaceC5161x9 f26580q;

    /* renamed from: t */
    private ByteBuffer f26583t;

    /* renamed from: u */
    long f26584u;

    /* renamed from: w */
    uz3 f26586w;

    /* renamed from: v */
    long f26585v = -1;

    /* renamed from: x */
    private ByteBuffer f26587x = null;

    /* renamed from: s */
    boolean f26582s = true;

    /* renamed from: r */
    boolean f26581r = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public pz3(String str) {
        this.f26579p = str;
    }

    /* renamed from: b */
    private final synchronized void m25621b() {
        String str;
        try {
            if (!this.f26582s) {
                try {
                    b04 b04Var = f26578y;
                    String str2 = this.f26579p;
                    if (str2.length() != 0) {
                        str = "mem mapping ".concat(str2);
                    } else {
                        str = new String("mem mapping ");
                    }
                    b04Var.mo20368a(str);
                    this.f26583t = this.f26586w.mo26635U(this.f26584u, this.f26585v);
                    this.f26582s = true;
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    /* renamed from: a */
    public final void mo25622a(uz3 uz3Var, ByteBuffer byteBuffer, long j11, InterfaceC5012t9 interfaceC5012t9) {
        this.f26584u = uz3Var.zzb();
        byteBuffer.remaining();
        this.f26585v = j11;
        this.f26586w = uz3Var;
        uz3Var.mo26636j(uz3Var.zzb() + j11);
        this.f26582s = false;
        this.f26581r = false;
        m25624e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    /* renamed from: c */
    public final void mo25623c(InterfaceC5161x9 interfaceC5161x9) {
        this.f26580q = interfaceC5161x9;
    }

    /* renamed from: d */
    protected abstract void mo20040d(ByteBuffer byteBuffer);

    /* renamed from: e */
    public final synchronized void m25624e() {
        String str;
        try {
            m25621b();
            b04 b04Var = f26578y;
            String str2 = this.f26579p;
            if (str2.length() != 0) {
                str = "parsing details of ".concat(str2);
            } else {
                str = new String("parsing details of ");
            }
            b04Var.mo20368a(str);
            ByteBuffer byteBuffer = this.f26583t;
            if (byteBuffer != null) {
                this.f26581r = true;
                byteBuffer.rewind();
                mo20040d(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f26587x = byteBuffer.slice();
                }
                this.f26583t = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5123w9
    public final String zza() {
        return this.f26579p;
    }
}

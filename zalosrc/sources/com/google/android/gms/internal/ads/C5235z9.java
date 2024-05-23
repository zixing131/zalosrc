package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.z9 */
/* loaded from: classes2.dex */
public final class C5235z9 extends rz3 {

    /* renamed from: A */
    private Date f31411A;

    /* renamed from: B */
    private Date f31412B;

    /* renamed from: C */
    private long f31413C;

    /* renamed from: D */
    private long f31414D;

    /* renamed from: E */
    private double f31415E;

    /* renamed from: F */
    private float f31416F;

    /* renamed from: G */
    private c04 f31417G;

    /* renamed from: H */
    private long f31418H;

    public C5235z9() {
        super("mvhd");
        this.f31415E = 1.0d;
        this.f31416F = 1.0f;
        this.f31417G = c04.f18075j;
    }

    @Override // com.google.android.gms.internal.ads.pz3
    /* renamed from: d */
    public final void mo20040d(ByteBuffer byteBuffer) {
        m26212g(byteBuffer);
        if (m26211f() == 1) {
            this.f31411A = wz3.m27756a(AbstractC5086v9.m27190f(byteBuffer));
            this.f31412B = wz3.m27756a(AbstractC5086v9.m27190f(byteBuffer));
            this.f31413C = AbstractC5086v9.m27189e(byteBuffer);
            this.f31414D = AbstractC5086v9.m27190f(byteBuffer);
        } else {
            this.f31411A = wz3.m27756a(AbstractC5086v9.m27189e(byteBuffer));
            this.f31412B = wz3.m27756a(AbstractC5086v9.m27189e(byteBuffer));
            this.f31413C = AbstractC5086v9.m27189e(byteBuffer);
            this.f31414D = AbstractC5086v9.m27189e(byteBuffer);
        }
        this.f31415E = AbstractC5086v9.m27186b(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f31416F = ((short) ((r1[1] & 255) | ((short) ((r1[0] << 8) & 65280)))) / 256.0f;
        AbstractC5086v9.m27188d(byteBuffer);
        AbstractC5086v9.m27189e(byteBuffer);
        AbstractC5086v9.m27189e(byteBuffer);
        this.f31417G = new c04(AbstractC5086v9.m27186b(byteBuffer), AbstractC5086v9.m27186b(byteBuffer), AbstractC5086v9.m27186b(byteBuffer), AbstractC5086v9.m27186b(byteBuffer), AbstractC5086v9.m27185a(byteBuffer), AbstractC5086v9.m27185a(byteBuffer), AbstractC5086v9.m27185a(byteBuffer), AbstractC5086v9.m27186b(byteBuffer), AbstractC5086v9.m27186b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f31418H = AbstractC5086v9.m27189e(byteBuffer);
    }

    /* renamed from: h */
    public final long m28461h() {
        return this.f31414D;
    }

    /* renamed from: i */
    public final long m28462i() {
        return this.f31413C;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f31411A + ";modificationTime=" + this.f31412B + ";timescale=" + this.f31413C + ";duration=" + this.f31414D + ";rate=" + this.f31415E + ";volume=" + this.f31416F + ";matrix=" + this.f31417G + ";nextTrackId=" + this.f31418H + "]";
    }
}

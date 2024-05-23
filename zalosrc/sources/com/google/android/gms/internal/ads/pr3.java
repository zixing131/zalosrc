package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes2.dex */
public final class pr3 implements xd3 {

    /* renamed from: f */
    private static final byte[] f26315f = new byte[0];

    /* renamed from: a */
    private final sr3 f26316a;

    /* renamed from: b */
    private final String f26317b;

    /* renamed from: c */
    private final byte[] f26318c;

    /* renamed from: d */
    private final mr3 f26319d;

    /* renamed from: e */
    private final int f26320e;

    public pr3(ECPublicKey eCPublicKey, byte[] bArr, String str, int i11, mr3 mr3Var) {
        tr3.m26720d(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f26316a = new sr3(eCPublicKey);
        this.f26318c = bArr;
        this.f26317b = str;
        this.f26320e = i11;
        this.f26319d = mr3Var;
    }

    @Override // com.google.android.gms.internal.ads.xd3
    /* renamed from: a */
    public final byte[] mo20126a(byte[] bArr, byte[] bArr2) {
        rr3 m26391a = this.f26316a.m26391a(this.f26317b, this.f26318c, bArr2, this.f26319d.zza(), this.f26320e);
        byte[] m25717a = this.f26319d.mo24701b(m26391a.m26158b()).m25717a(bArr, f26315f);
        byte[] m26157a = m26391a.m26157a();
        return ByteBuffer.allocate(m26157a.length + m25717a.length).put(m26157a).put(m25717a).array();
    }
}

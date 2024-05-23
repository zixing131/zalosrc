package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.aa */
/* loaded from: classes2.dex */
public final class C4310aa extends pz3 {

    /* renamed from: z */
    ByteBuffer f16982z;

    public C4310aa(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.pz3
    /* renamed from: d */
    public final void mo20040d(ByteBuffer byteBuffer) {
        this.f16982z = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}

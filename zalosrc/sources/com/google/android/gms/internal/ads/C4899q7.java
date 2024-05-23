package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.q7 */
/* loaded from: classes2.dex */
final class C4899q7 implements InterfaceC4936r7 {

    /* renamed from: a */
    private final ByteBuffer f26666a;

    public C4899q7(ByteBuffer byteBuffer) {
        this.f26666a = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4936r7
    /* renamed from: a */
    public final void mo25668a(MessageDigest[] messageDigestArr, long j11, int i11) {
        ByteBuffer slice;
        synchronized (this.f26666a) {
            int i12 = (int) j11;
            this.f26666a.position(i12);
            this.f26666a.limit(i12 + i11);
            slice = this.f26666a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4936r7
    public final long zza() {
        return this.f26666a.capacity();
    }
}

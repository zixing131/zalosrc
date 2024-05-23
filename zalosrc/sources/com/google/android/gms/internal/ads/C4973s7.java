package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: com.google.android.gms.internal.ads.s7 */
/* loaded from: classes2.dex */
final class C4973s7 implements InterfaceC4936r7 {

    /* renamed from: a */
    private final FileChannel f27576a;

    /* renamed from: b */
    private final long f27577b;

    /* renamed from: c */
    private final long f27578c;

    public C4973s7(FileChannel fileChannel, long j11, long j12) {
        this.f27576a = fileChannel;
        this.f27577b = j11;
        this.f27578c = j12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4936r7
    /* renamed from: a */
    public final void mo25668a(MessageDigest[] messageDigestArr, long j11, int i11) {
        MappedByteBuffer map = this.f27576a.map(FileChannel.MapMode.READ_ONLY, this.f27577b + j11, i11);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4936r7
    public final long zza() {
        return this.f27578c;
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class to0 implements uz3 {

    /* renamed from: p */
    private final ByteBuffer f28447p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public to0(ByteBuffer byteBuffer) {
        this.f28447p = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    /* renamed from: A0 */
    public final int mo26634A0(ByteBuffer byteBuffer) {
        if (this.f28447p.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), this.f28447p.remaining());
        byte[] bArr = new byte[min];
        this.f28447p.get(bArr);
        byteBuffer.put(bArr);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.uz3
    /* renamed from: U */
    public final ByteBuffer mo26635U(long j11, long j12) {
        int position = this.f28447p.position();
        this.f28447p.position((int) j11);
        ByteBuffer slice = this.f28447p.slice();
        slice.limit((int) j12);
        this.f28447p.position(position);
        return slice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.uz3
    /* renamed from: j */
    public final void mo26636j(long j11) {
        this.f28447p.position((int) j11);
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long zzb() {
        return this.f28447p.position();
    }

    @Override // com.google.android.gms.internal.ads.uz3
    public final long zzc() {
        return this.f28447p.limit();
    }
}

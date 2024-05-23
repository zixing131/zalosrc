package p291k7;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: k7.a */
/* loaded from: classes3.dex */
final class C21486a implements InterfaceC21493c0 {

    /* renamed from: a */
    private final ByteBuffer f104517a;

    public C21486a(ByteBuffer byteBuffer) {
        this.f104517a = byteBuffer.slice();
    }

    @Override // p291k7.InterfaceC21493c0
    /* renamed from: a */
    public final void mo111099a(MessageDigest[] messageDigestArr, long j11, int i11) {
        ByteBuffer slice;
        synchronized (this.f104517a) {
            int i12 = (int) j11;
            this.f104517a.position(i12);
            this.f104517a.limit(i12 + i11);
            slice = this.f104517a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // p291k7.InterfaceC21493c0
    public final long zza() {
        return this.f104517a.capacity();
    }
}

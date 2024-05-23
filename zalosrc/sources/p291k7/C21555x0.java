package p291k7;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* renamed from: k7.x0 */
/* loaded from: classes3.dex */
final class C21555x0 implements InterfaceC21493c0 {

    /* renamed from: a */
    private final FileChannel f104587a;

    /* renamed from: b */
    private final long f104588b;

    /* renamed from: c */
    private final long f104589c;

    public C21555x0(FileChannel fileChannel, long j11, long j12) {
        this.f104587a = fileChannel;
        this.f104588b = j11;
        this.f104589c = j12;
    }

    @Override // p291k7.InterfaceC21493c0
    /* renamed from: a */
    public final void mo111099a(MessageDigest[] messageDigestArr, long j11, int i11) {
        MappedByteBuffer map = this.f104587a.map(FileChannel.MapMode.READ_ONLY, this.f104588b + j11, i11);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // p291k7.InterfaceC21493c0
    public final long zza() {
        return this.f104589c;
    }
}

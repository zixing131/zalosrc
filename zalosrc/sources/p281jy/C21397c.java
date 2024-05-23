package p281jy;

import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jy.c */
/* loaded from: classes4.dex */
public class C21397c extends AbstractC21396b {

    /* renamed from: b */
    private final long f104279b;

    /* renamed from: c */
    private final long f104280c;

    /* renamed from: d */
    private long f104281d;

    /* renamed from: e */
    private long f104282e;

    /* renamed from: f */
    private final AtomicBoolean f104283f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21397c(InterfaceC21399e interfaceC21399e, long j11, long j12) {
        super(interfaceC21399e);
        AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
        this.f104279b = j11;
        this.f104280c = j12;
        this.f104282e = j11;
        this.f104283f = new AtomicBoolean(false);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        if (this.f104283f.getAndSet(false)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        m110867a().mo110858P1(bArr, z11);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f104281d = currentTimeMillis2;
        this.f104282e = Math.max(Math.min(this.f104280c, currentTimeMillis2 - currentTimeMillis), this.f104279b);
        this.f104283f.set(false);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        if (m110867a().mo110861S1() && !this.f104283f.get() && System.currentTimeMillis() - this.f104281d >= this.f104282e) {
            return true;
        }
        return false;
    }
}

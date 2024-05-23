package p281jy;

import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jy.d */
/* loaded from: classes4.dex */
public class C21398d extends AbstractC21396b {

    /* renamed from: b */
    private final long f104284b;

    /* renamed from: c */
    private long f104285c;

    /* renamed from: d */
    private final AtomicBoolean f104286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21398d(InterfaceC21399e interfaceC21399e, long j11) {
        super(interfaceC21399e);
        AbstractC19074t.m100208f(interfaceC21399e, "analyzer");
        this.f104284b = j11;
        this.f104286d = new AtomicBoolean(false);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: P1 */
    public void mo110858P1(byte[] bArr, boolean z11) {
        AbstractC19074t.m100208f(bArr, "nv21Bytes");
        if (this.f104286d.getAndSet(false)) {
            return;
        }
        m110867a().mo110858P1(bArr, z11);
        this.f104285c = System.currentTimeMillis();
        this.f104286d.set(false);
    }

    @Override // p281jy.InterfaceC21399e
    /* renamed from: S1 */
    public boolean mo110861S1() {
        if (m110867a().mo110861S1() && !this.f104286d.get() && (this.f104284b == 0 || System.currentTimeMillis() - this.f104285c >= this.f104284b)) {
            return true;
        }
        return false;
    }
}

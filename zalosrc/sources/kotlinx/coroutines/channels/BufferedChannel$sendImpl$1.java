package kotlinx.coroutines.channels;

import en0.InterfaceC18511r;
import fn0.AbstractC19075u;

/* loaded from: classes7.dex */
public final class BufferedChannel$sendImpl$1 extends AbstractC19075u implements InterfaceC18511r {

    /* renamed from: q */
    public static final BufferedChannel$sendImpl$1 f106042q = new BufferedChannel$sendImpl$1();

    public BufferedChannel$sendImpl$1() {
        super(4);
    }

    @Override // en0.InterfaceC18511r
    /* renamed from: Uc */
    public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
        return m113043a((ChannelSegment) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
    }

    /* renamed from: a */
    public final Void m113043a(ChannelSegment channelSegment, int i11, Object obj, long j11) {
        throw new IllegalStateException("unexpected".toString());
    }
}

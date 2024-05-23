package kotlinx.coroutines.channels;

import en0.InterfaceC18509p;
import fn0.C19071q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends C19071q implements InterfaceC18509p {

    /* renamed from: y */
    public static final BufferedChannelKt$createSegmentFunction$1 f106062y = new BufferedChannelKt$createSegmentFunction$1();

    BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    /* renamed from: h */
    public final ChannelSegment m113073h(long j11, ChannelSegment channelSegment) {
        ChannelSegment m113070x;
        m113070x = BufferedChannelKt.m113070x(j11, channelSegment);
        return m113070x;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113073h(((Number) obj).longValue(), (ChannelSegment) obj2);
    }
}

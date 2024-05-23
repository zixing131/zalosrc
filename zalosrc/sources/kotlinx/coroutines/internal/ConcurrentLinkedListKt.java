package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;

/* loaded from: classes7.dex */
public final class ConcurrentLinkedListKt {

    /* renamed from: a */
    private static final Symbol f107350a = new Symbol("CLOSED");

    /* renamed from: b */
    public static final ConcurrentLinkedListNode m113586b(ConcurrentLinkedListNode concurrentLinkedListNode) {
        while (true) {
            Object m113591f = concurrentLinkedListNode.m113591f();
            if (m113591f == f107350a) {
                return concurrentLinkedListNode;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) m113591f;
            if (concurrentLinkedListNode2 == null) {
                if (concurrentLinkedListNode.m113597j()) {
                    return concurrentLinkedListNode;
                }
            } else {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            }
        }
    }

    /* renamed from: c */
    public static final Object m113587c(Segment segment, long j11, InterfaceC18509p interfaceC18509p) {
        while (true) {
            if (segment.f107415r < j11 || segment.mo113595h()) {
                Object m113591f = segment.m113591f();
                if (m113591f == f107350a) {
                    return SegmentOrClosed.m113705a(f107350a);
                }
                Segment segment2 = (Segment) ((ConcurrentLinkedListNode) m113591f);
                if (segment2 == null) {
                    segment2 = (Segment) interfaceC18509p.mo240pC(Long.valueOf(segment.f107415r + 1), segment);
                    if (segment.m113599l(segment2)) {
                        if (segment.mo113595h()) {
                            segment.m113598k();
                        }
                    }
                }
                segment = segment2;
            } else {
                return SegmentOrClosed.m113705a(segment);
            }
        }
    }
}

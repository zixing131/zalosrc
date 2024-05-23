package kotlinx.coroutines.channels;

import en0.InterfaceC18505l;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;
import mn0.InterfaceC23366d;

/* loaded from: classes7.dex */
public final class BufferedChannelKt {

    /* renamed from: a */
    private static final ChannelSegment f106043a = new ChannelSegment(-1, null, null, 0);

    /* renamed from: b */
    public static final int f106044b;

    /* renamed from: c */
    private static final int f106045c;

    /* renamed from: d */
    public static final Symbol f106046d;

    /* renamed from: e */
    private static final Symbol f106047e;

    /* renamed from: f */
    private static final Symbol f106048f;

    /* renamed from: g */
    private static final Symbol f106049g;

    /* renamed from: h */
    private static final Symbol f106050h;

    /* renamed from: i */
    private static final Symbol f106051i;

    /* renamed from: j */
    private static final Symbol f106052j;

    /* renamed from: k */
    private static final Symbol f106053k;

    /* renamed from: l */
    private static final Symbol f106054l;

    /* renamed from: m */
    private static final Symbol f106055m;

    /* renamed from: n */
    private static final Symbol f106056n;

    /* renamed from: o */
    private static final Symbol f106057o;

    /* renamed from: p */
    private static final Symbol f106058p;

    /* renamed from: q */
    private static final Symbol f106059q;

    /* renamed from: r */
    private static final Symbol f106060r;

    /* renamed from: s */
    private static final Symbol f106061s;

    static {
        int m113727e;
        int m113727e2;
        m113727e = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f106044b = m113727e;
        m113727e2 = SystemPropsKt__SystemProps_commonKt.m113727e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f106045c = m113727e2;
        f106046d = new Symbol("BUFFERED");
        f106047e = new Symbol("SHOULD_BUFFER");
        f106048f = new Symbol("S_RESUMING_BY_RCV");
        f106049g = new Symbol("RESUMING_BY_EB");
        f106050h = new Symbol("POISONED");
        f106051i = new Symbol("DONE_RCV");
        f106052j = new Symbol("INTERRUPTED_SEND");
        f106053k = new Symbol("INTERRUPTED_RCV");
        f106054l = new Symbol("CHANNEL_CLOSED");
        f106055m = new Symbol("SUSPEND");
        f106056n = new Symbol("SUSPEND_NO_WAITER");
        f106057o = new Symbol("FAILED");
        f106058p = new Symbol("NO_RECEIVE_RESULT");
        f106059q = new Symbol("CLOSE_HANDLER_CLOSED");
        f106060r = new Symbol("CLOSE_HANDLER_INVOKED");
        f106061s = new Symbol("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final long m113044A(int i11) {
        if (i11 == 0) {
            return 0L;
        }
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public static final boolean m113045B(CancellableContinuation cancellableContinuation, Object obj, InterfaceC18505l interfaceC18505l) {
        Object mo112544R = cancellableContinuation.mo112544R(obj, null, interfaceC18505l);
        if (mo112544R != null) {
            cancellableContinuation.mo112545U(mo112544R);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static /* synthetic */ boolean m113046C(CancellableContinuation cancellableContinuation, Object obj, InterfaceC18505l interfaceC18505l, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            interfaceC18505l = null;
        }
        return m113045B(cancellableContinuation, obj, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final long m113068v(long j11, boolean z11) {
        return (z11 ? 4611686018427387904L : 0L) + j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final long m113069w(long j11, int i11) {
        return (i11 << 60) + j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final ChannelSegment m113070x(long j11, ChannelSegment channelSegment) {
        return new ChannelSegment(j11, channelSegment, channelSegment.m113102u(), 0);
    }

    /* renamed from: y */
    public static final InterfaceC23366d m113071y() {
        return BufferedChannelKt$createSegmentFunction$1.f106062y;
    }

    /* renamed from: z */
    public static final Symbol m113072z() {
        return f106054l;
    }
}

package kotlinx.coroutines.flow;

import fn0.AbstractC19074t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import ln0.AbstractC22543l;
import um0.C27316g;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final /* synthetic */ class FlowKt__ShareKt {
    /* renamed from: a */
    public static final SharedFlow m113389a(MutableSharedFlow mutableSharedFlow) {
        return new ReadonlySharedFlow(mutableSharedFlow, null);
    }

    /* renamed from: b */
    public static final StateFlow m113390b(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:            if (r3 == 0) goto L37;     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final SharingConfig m113391c(Flow flow, int i11) {
        int m116580c;
        ChannelFlow channelFlow;
        Flow mo113262k;
        m116580c = AbstractC22543l.m116580c(i11, Channel.f106063n.m113074a());
        int i12 = m116580c - i11;
        if ((flow instanceof ChannelFlow) && (mo113262k = (channelFlow = (ChannelFlow) flow).mo113262k()) != null) {
            int i13 = channelFlow.f107193q;
            if (i13 != -3 && i13 != -2 && i13 != 0) {
                i12 = i13;
            } else if (channelFlow.f107194r != BufferOverflow.SUSPEND) {
                if (i11 == 0) {
                    i12 = 1;
                }
                i12 = 0;
            }
            return new SharingConfig(mo113262k, i12, channelFlow.f107194r, channelFlow.f107192p);
        }
        return new SharingConfig(flow, i12, BufferOverflow.SUSPEND, C27316g.f128559p);
    }

    /* renamed from: d */
    private static final Job m113392d(CoroutineScope coroutineScope, InterfaceC27315f interfaceC27315f, Flow flow, MutableSharedFlow mutableSharedFlow, SharingStarted sharingStarted, Object obj) {
        CoroutineStart coroutineStart;
        if (AbstractC19074t.m100204b(sharingStarted, SharingStarted.f107140a.m113492c())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return BuildersKt.m112530c(coroutineScope, interfaceC27315f, coroutineStart, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, obj, null));
    }

    /* renamed from: e */
    public static final SharedFlow m113393e(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i11) {
        SharingConfig m113391c = m113391c(flow, i11);
        MutableSharedFlow m113477a = SharedFlowKt.m113477a(i11, m113391c.f107137b, m113391c.f107138c);
        return new ReadonlySharedFlow(m113477a, m113392d(coroutineScope, m113391c.f107139d, m113391c.f107136a, m113477a, sharingStarted, SharedFlowKt.f107129a));
    }

    /* renamed from: f */
    public static /* synthetic */ SharedFlow m113394f(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return FlowKt.m113276L(flow, coroutineScope, sharingStarted, i11);
    }

    /* renamed from: g */
    public static final StateFlow m113395g(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SharingConfig m113391c = m113391c(flow, 1);
        MutableStateFlow m113503a = StateFlowKt.m113503a(obj);
        return new ReadonlyStateFlow(m113503a, m113392d(coroutineScope, m113391c.f107139d, m113391c.f107136a, m113503a, sharingStarted, obj));
    }
}

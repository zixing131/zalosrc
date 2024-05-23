package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

@InternalCoroutinesApi
/* loaded from: classes7.dex */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {

    /* renamed from: p */
    public final InterfaceC27315f f107192p;

    /* renamed from: q */
    public final int f107193q;

    /* renamed from: r */
    public final BufferOverflow f107194r;

    public ChannelFlow(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        this.f107192p = interfaceC27315f;
        this.f107193q = i11;
        this.f107194r = bufferOverflow;
    }

    /* renamed from: f */
    static /* synthetic */ Object m113521f(ChannelFlow channelFlow, FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m112640d = CoroutineScopeKt.m112640d(new ChannelFlow$collect$2(flowCollector, channelFlow, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112640d == m142578e) {
            return m112640d;
        }
        return C24848g0.f119245a;
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        return m113521f(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    /* renamed from: c */
    public Flow mo113437c(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        InterfaceC27315f mo112823d0 = interfaceC27315f.mo112823d0(this.f107192p);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i12 = this.f107193q;
            if (i12 != -3) {
                if (i11 != -3) {
                    if (i12 != -2) {
                        if (i11 != -2) {
                            i11 += i12;
                            if (i11 < 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i11 = i12;
            }
            bufferOverflow = this.f107194r;
        }
        if (AbstractC19074t.m100204b(mo112823d0, this.f107192p) && i11 == this.f107193q && bufferOverflow == this.f107194r) {
            return this;
        }
        return mo113259j(mo112823d0, i11, bufferOverflow);
    }

    /* renamed from: e */
    protected String mo113261e() {
        return null;
    }

    /* renamed from: g */
    public abstract Object mo113258g(ProducerScope producerScope, Continuation continuation);

    /* renamed from: j */
    protected abstract ChannelFlow mo113259j(InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow);

    /* renamed from: k */
    public Flow mo113262k() {
        return null;
    }

    /* renamed from: m */
    public final InterfaceC18509p m113522m() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    /* renamed from: n */
    public final int m113523n() {
        int i11 = this.f107193q;
        if (i11 == -3) {
            return -2;
        }
        return i11;
    }

    /* renamed from: o */
    public ReceiveChannel mo113263o(CoroutineScope coroutineScope) {
        return ProduceKt.m113189f(coroutineScope, this.f107192p, m113523n(), this.f107194r, CoroutineStart.ATOMIC, null, m113522m(), 16, null);
    }

    public String toString() {
        String m131214n0;
        ArrayList arrayList = new ArrayList(4);
        String mo113261e = mo113261e();
        if (mo113261e != null) {
            arrayList.add(mo113261e);
        }
        if (this.f107192p != C27316g.f128559p) {
            arrayList.add("context=" + this.f107192p);
        }
        if (this.f107193q != -3) {
            arrayList.add("capacity=" + this.f107193q);
        }
        if (this.f107194r != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f107194r);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(DebugStringsKt.m112647a(this));
        sb2.append('[');
        m131214n0 = AbstractC25332a0.m131214n0(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(m131214n0);
        sb2.append(']');
        return sb2.toString();
    }
}

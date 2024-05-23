package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class BroadcastChannelImpl<E> extends BufferedChannel<E> implements BroadcastChannel<E> {

    /* renamed from: B */
    private final int f105974B;

    /* renamed from: C */
    private final ReentrantLock f105975C;

    /* renamed from: D */
    private List f105976D;

    /* renamed from: E */
    private Object f105977E;

    /* renamed from: F */
    private final HashMap f105978F;

    /* loaded from: classes7.dex */
    private final class SubscriberBuffered extends BufferedChannel<E> {
        public SubscriberBuffered() {
            super(BroadcastChannelImpl.this.m112910g1(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* renamed from: d1, reason: merged with bridge method [inline-methods] */
        public boolean mo112905F(Throwable th2) {
            ReentrantLock reentrantLock = BroadcastChannelImpl.this.f105975C;
            BroadcastChannelImpl broadcastChannelImpl = BroadcastChannelImpl.this;
            reentrantLock.lock();
            try {
                broadcastChannelImpl.m112904i1(this);
                return super.mo112905F(th2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* loaded from: classes7.dex */
    private final class SubscriberConflated extends ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* renamed from: i1, reason: merged with bridge method [inline-methods] */
        public boolean mo112905F(Throwable th2) {
            BroadcastChannelImpl.this.m112904i1(this);
            return super.mo112905F(th2);
        }
    }

    public BroadcastChannelImpl(int i11) {
        super(0, null);
        List m131502j;
        Symbol symbol;
        this.f105974B = i11;
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i11 + " was specified").toString());
        }
        this.f105975C = new ReentrantLock();
        m131502j = AbstractC25368s.m131502j();
        this.f105976D = m131502j;
        symbol = BroadcastChannelKt.f105991a;
        this.f105977E = symbol;
        this.f105978F = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i1 */
    public final void m112904i1(ReceiveChannel receiveChannel) {
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            List list = this.f105976D;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj) != receiveChannel) {
                    arrayList.add(obj);
                }
            }
            this.f105976D = arrayList;
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: F */
    public boolean mo112905F(Throwable th2) {
        Symbol symbol;
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            Iterator it = this.f105976D.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).mo112905F(th2);
            }
            symbol = BroadcastChannelKt.f105991a;
            this.f105977E = symbol;
            boolean mo112905F = super.mo112905F(th2);
            reentrantLock.unlock();
            return mo112905F;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: H */
    public boolean mo112906H(Throwable th2) {
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            Iterator it = this.f105976D.iterator();
            while (it.hasNext()) {
                ((BufferedChannel) it.next()).mo112906H(th2);
            }
            List list = this.f105976D;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((BufferedChannel) obj).m113010a0()) {
                    arrayList.add(obj);
                }
            }
            this.f105976D = arrayList;
            boolean mo112906H = super.mo112906H(th2);
            reentrantLock.unlock();
            return mo112906H;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    /* renamed from: H0 */
    public void mo112907H0(SelectInstance selectInstance, Object obj) {
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            Object remove = this.f105978F.remove(selectInstance);
            if (remove != null) {
                selectInstance.mo113855d(remove);
                return;
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            reentrantLock.unlock();
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(selectInstance.getContext()), null, CoroutineStart.UNDISPATCHED, new BroadcastChannelImpl$registerSelectForSend$2(this, obj, selectInstance, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo112908S(Object obj, Continuation continuation) {
        BroadcastChannelImpl$send$1 broadcastChannelImpl$send$1;
        Object m142578e;
        int i11;
        BroadcastChannelImpl<E> broadcastChannelImpl;
        Object obj2;
        Iterator it;
        if (continuation instanceof BroadcastChannelImpl$send$1) {
            broadcastChannelImpl$send$1 = (BroadcastChannelImpl$send$1) continuation;
            int i12 = broadcastChannelImpl$send$1.f105990x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                broadcastChannelImpl$send$1.f105990x = i12 - Integer.MIN_VALUE;
                Object obj3 = broadcastChannelImpl$send$1.f105988v;
                m142578e = AbstractC28298d.m142578e();
                i11 = broadcastChannelImpl$send$1.f105990x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) broadcastChannelImpl$send$1.f105987u;
                        Object obj4 = broadcastChannelImpl$send$1.f105986t;
                        broadcastChannelImpl = (BroadcastChannelImpl) broadcastChannelImpl$send$1.f105985s;
                        AbstractC24862s.m129228b(obj3);
                        if (((Boolean) obj3).booleanValue() && broadcastChannelImpl.mo112909T()) {
                            throw broadcastChannelImpl.m113007Y();
                        }
                        obj2 = obj4;
                        if (it.hasNext()) {
                            BufferedChannel bufferedChannel = (BufferedChannel) it.next();
                            broadcastChannelImpl$send$1.f105985s = broadcastChannelImpl;
                            broadcastChannelImpl$send$1.f105986t = obj2;
                            broadcastChannelImpl$send$1.f105987u = it;
                            broadcastChannelImpl$send$1.f105990x = 1;
                            Object mo113003N0 = bufferedChannel.mo113003N0(obj2, broadcastChannelImpl$send$1);
                            if (mo113003N0 == m142578e) {
                                return m142578e;
                            }
                            obj4 = obj2;
                            obj3 = mo113003N0;
                            if (((Boolean) obj3).booleanValue()) {
                            }
                            obj2 = obj4;
                            if (it.hasNext()) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj3);
                    ReentrantLock reentrantLock = this.f105975C;
                    reentrantLock.lock();
                    try {
                        if (!mo112909T()) {
                            if (this.f105974B == -1) {
                                this.f105977E = obj;
                            }
                            List list = this.f105976D;
                            reentrantLock.unlock();
                            broadcastChannelImpl = this;
                            obj2 = obj;
                            it = list.iterator();
                            if (it.hasNext()) {
                            }
                        } else {
                            throw m113007Y();
                        }
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
            }
        }
        broadcastChannelImpl$send$1 = new BroadcastChannelImpl$send$1(this, continuation);
        Object obj32 = broadcastChannelImpl$send$1.f105988v;
        m142578e = AbstractC28298d.m142578e();
        i11 = broadcastChannelImpl$send$1.f105990x;
        if (i11 == 0) {
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: T */
    public boolean mo112909T() {
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            return super.mo112909T();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: g1 */
    public final int m112910g1() {
        return this.f105974B;
    }

    /* renamed from: h1 */
    public final Object m112911h1() {
        Symbol symbol;
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            if (mo112909T()) {
                Throwable m113005V = m113005V();
                if (m113005V == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw m113005V;
            }
            Object obj = this.f105977E;
            symbol = BroadcastChannelKt.f105991a;
            if (obj != symbol) {
                Object obj2 = this.f105977E;
                reentrantLock.unlock();
                return obj2;
            }
            throw new IllegalStateException("No value".toString());
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    /* renamed from: m */
    public ReceiveChannel mo112900m() {
        Channel subscriberBuffered;
        Symbol symbol;
        List m131223w0;
        Symbol symbol2;
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            if (this.f105974B == -1) {
                subscriberBuffered = new SubscriberConflated();
            } else {
                subscriberBuffered = new SubscriberBuffered();
            }
            if (mo112909T()) {
                Object obj = this.f105977E;
                symbol2 = BroadcastChannelKt.f105991a;
                if (obj == symbol2) {
                    subscriberBuffered.mo112906H(m113005V());
                    reentrantLock.unlock();
                    return subscriberBuffered;
                }
            }
            Object obj2 = this.f105977E;
            symbol = BroadcastChannelKt.f105991a;
            if (obj2 != symbol) {
                subscriberBuffered.mo112912p(m112911h1());
            }
            m131223w0 = AbstractC25332a0.m131223w0(this.f105976D, subscriberBuffered);
            this.f105976D = m131223w0;
            reentrantLock.unlock();
            return subscriberBuffered;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: p */
    public Object mo112912p(Object obj) {
        ReentrantLock reentrantLock = this.f105975C;
        reentrantLock.lock();
        try {
            if (mo112909T()) {
                return super.mo112912p(obj);
            }
            List list = this.f105976D;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((BufferedChannel) it.next()).mo113004R0()) {
                        return ChannelResult.f106070b.m113092b();
                    }
                }
            }
            if (this.f105974B == -1) {
                this.f105977E = obj;
            }
            Iterator it2 = this.f105976D.iterator();
            while (it2.hasNext()) {
                ((BufferedChannel) it2.next()).mo112912p(obj);
            }
            return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public String toString() {
        Symbol symbol;
        String str;
        String m131214n0;
        StringBuilder sb2 = new StringBuilder();
        Object obj = this.f105977E;
        symbol = BroadcastChannelKt.f105991a;
        if (obj != symbol) {
            str = "CONFLATED_ELEMENT=" + this.f105977E + "; ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        m131214n0 = AbstractC25332a0.m131214n0(this.f105976D, ";", "<", ">", 0, null, null, 56, null);
        sb2.append(m131214n0);
        return sb2.toString();
    }
}

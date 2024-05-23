package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.selects.SelectClause1;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public interface ReceiveChannel<E> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        /* renamed from: a */
        public static /* synthetic */ void m113193a(ReceiveChannel receiveChannel, CancellationException cancellationException, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    cancellationException = null;
                }
                receiveChannel.mo113009a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object m113194b(ReceiveChannel receiveChannel, Continuation continuation) {
            ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            Object m142578e;
            int i11;
            Object mo113021z;
            if (continuation instanceof ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (ReceiveChannel$receiveOrNull$1) continuation;
                int i12 = receiveChannel$receiveOrNull$1.f106304t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.f106304t = i12 - Integer.MIN_VALUE;
                    Object obj = receiveChannel$receiveOrNull$1.f106303s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = receiveChannel$receiveOrNull$1.f106304t;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                            mo113021z = ((ChannelResult) obj).m113090k();
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        receiveChannel$receiveOrNull$1.f106304t = 1;
                        mo113021z = receiveChannel.mo113021z(receiveChannel$receiveOrNull$1);
                        if (mo113021z == m142578e) {
                            return m142578e;
                        }
                    }
                    return ChannelResult.m113085f(mo113021z);
                }
            }
            receiveChannel$receiveOrNull$1 = new ReceiveChannel$receiveOrNull$1(continuation);
            Object obj2 = receiveChannel$receiveOrNull$1.f106303s;
            m142578e = AbstractC28298d.m142578e();
            i11 = receiveChannel$receiveOrNull$1.f106304t;
            if (i11 == 0) {
            }
            return ChannelResult.m113085f(mo113021z);
        }
    }

    /* renamed from: a */
    void mo113009a(CancellationException cancellationException);

    ChannelIterator iterator();

    /* renamed from: u */
    SelectClause1 mo113016u();

    /* renamed from: w */
    SelectClause1 mo113017w();

    /* renamed from: x */
    Object mo113019x();

    /* renamed from: z */
    Object mo113021z(Continuation continuation);
}

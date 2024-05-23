package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

@ObsoleteCoroutinesApi
/* loaded from: classes7.dex */
public interface BroadcastChannel<E> extends SendChannel<E> {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: a */
    void mo112899a(CancellationException cancellationException);

    /* renamed from: m */
    ReceiveChannel mo112900m();
}

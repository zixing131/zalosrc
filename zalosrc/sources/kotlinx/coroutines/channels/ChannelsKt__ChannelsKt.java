package kotlinx.coroutines.channels;

import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.channels.ChannelResult;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class ChannelsKt__ChannelsKt {
    /* renamed from: a */
    public static final Object m113130a(SendChannel sendChannel, Object obj) {
        Object m112536b;
        Object mo112912p = sendChannel.mo112912p(obj);
        if (mo112912p instanceof ChannelResult.Failed) {
            m112536b = BuildersKt__BuildersKt.m112536b(null, new ChannelsKt__ChannelsKt$trySendBlocking$2(sendChannel, obj, null), 1, null);
            return ((ChannelResult) m112536b).m113090k();
        }
        return ChannelResult.f106070b.m113093c(C24848g0.f119245a);
    }
}

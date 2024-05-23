package kotlinx.coroutines.channels;

import java.util.Collection;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes7.dex */
public final class ChannelsKt {
    /* renamed from: b */
    public static final void m113108b(ReceiveChannel receiveChannel, Throwable th2) {
        ChannelsKt__Channels_commonKt.m113133a(receiveChannel, th2);
    }

    /* renamed from: s */
    public static final Object m113125s(ReceiveChannel receiveChannel, SendChannel sendChannel, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.m113154r(receiveChannel, sendChannel, continuation);
    }

    /* renamed from: t */
    public static final Object m113126t(ReceiveChannel receiveChannel, Collection collection, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.m113155s(receiveChannel, collection, continuation);
    }

    /* renamed from: u */
    public static final Object m113127u(ReceiveChannel receiveChannel, Continuation continuation) {
        return ChannelsKt__Channels_commonKt.m113136d(receiveChannel, continuation);
    }

    /* renamed from: v */
    public static final Object m113128v(ReceiveChannel receiveChannel, Map map, Continuation continuation) {
        return ChannelsKt__DeprecatedKt.m113156t(receiveChannel, map, continuation);
    }

    /* renamed from: w */
    public static final Object m113129w(SendChannel sendChannel, Object obj) {
        return ChannelsKt__ChannelsKt.m113130a(sendChannel, obj);
    }
}

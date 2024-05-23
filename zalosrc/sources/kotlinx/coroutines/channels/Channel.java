package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes7.dex */
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {

    /* renamed from: n */
    public static final Factory f106063n = Factory.f106064a;

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes7.dex */
    public static final class Factory {

        /* renamed from: a */
        static final /* synthetic */ Factory f106064a = new Factory();

        /* renamed from: b */
        private static final int f106065b = SystemPropsKt.m113714b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Factory() {
        }

        /* renamed from: a */
        public final int m113074a() {
            return f106065b;
        }
    }
}

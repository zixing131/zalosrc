package fg0;

import fn0.AbstractC19074t;

/* renamed from: fg0.b */
/* loaded from: classes6.dex */
public final class C18929b extends ThreadFactoryC18928a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18929b(String str) {
        super(str);
        AbstractC19074t.m100208f(str, "poolName");
    }

    @Override // fg0.ThreadFactoryC18928a, java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "r");
        Thread newThread = super.newThread(runnable);
        newThread.setPriority(10);
        return newThread;
    }
}

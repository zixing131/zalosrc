package cg0;

import ag0.InterfaceC0806b1;
import fg0.ThreadFactoryC18928a;
import fn0.AbstractC19074t;

/* renamed from: cg0.d */
/* loaded from: classes6.dex */
public final class C3464d implements InterfaceC0806b1 {

    /* renamed from: a */
    private final ThreadFactoryC18928a f14557a = new ThreadFactoryC18928a("NewThreadExecutor");

    @Override // ag0.InterfaceC0806b1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo2040a(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "task");
        this.f14557a.newThread(runnable).start();
    }
}

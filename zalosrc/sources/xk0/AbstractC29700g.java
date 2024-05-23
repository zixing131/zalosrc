package xk0;

import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.InterfaceC28285g;
import vk0.InterfaceC28286h;

/* renamed from: xk0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC29700g implements InterfaceC29697d {

    /* renamed from: a */
    private final InterfaceC28285g f137156a;

    /* renamed from: b */
    private final InterfaceC28286h f137157b;

    public AbstractC29700g(InterfaceC28285g interfaceC28285g, InterfaceC28286h interfaceC28286h) {
        AbstractC19074t.m100208f(interfaceC28285g, "info");
        AbstractC19074t.m100208f(interfaceC28286h, "request");
        this.f137156a = interfaceC28285g;
        this.f137157b = interfaceC28286h;
    }

    @Override // xk0.InterfaceC29697d
    /* renamed from: a */
    public final Object mo18187a(Continuation continuation) {
        return this.f137157b.mo142530a(continuation);
    }
}

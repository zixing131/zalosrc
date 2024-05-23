package il0;

import fn0.AbstractC19074t;
import java.util.concurrent.ExecutorService;
import wk0.InterfaceC29082b;

/* renamed from: il0.c */
/* loaded from: classes7.dex */
public final class C20607c implements InterfaceC29082b {

    /* renamed from: a */
    private final ExecutorService f101349a;

    public C20607c(ExecutorService executorService) {
        AbstractC19074t.m100208f(executorService, "executorService");
        this.f101349a = executorService;
    }

    @Override // wk0.InterfaceC29082b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo107243a(C20608d c20608d) {
        AbstractC19074t.m100208f(c20608d, "block");
        this.f101349a.submit(c20608d);
    }
}

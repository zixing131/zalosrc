package p664y;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p664y.AbstractAsyncTaskC30232e;

/* renamed from: y.f */
/* loaded from: classes2.dex */
public class C30233f implements AbstractAsyncTaskC30232e.a {

    /* renamed from: a */
    private final BlockingQueue f140434a;

    /* renamed from: b */
    private final ThreadPoolExecutor f140435b;

    /* renamed from: c */
    private final ArrayDeque f140436c = new ArrayDeque();

    /* renamed from: d */
    private AbstractAsyncTaskC30232e f140437d = null;

    public C30233f() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f140434a = linkedBlockingQueue;
        this.f140435b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: b */
    private void m149087b() {
        AbstractAsyncTaskC30232e abstractAsyncTaskC30232e = (AbstractAsyncTaskC30232e) this.f140436c.poll();
        this.f140437d = abstractAsyncTaskC30232e;
        if (abstractAsyncTaskC30232e != null) {
            abstractAsyncTaskC30232e.m149082b(this.f140435b);
        }
    }

    @Override // p664y.AbstractAsyncTaskC30232e.a
    /* renamed from: a */
    public void mo149084a(AbstractAsyncTaskC30232e abstractAsyncTaskC30232e) {
        this.f140437d = null;
        m149087b();
    }

    /* renamed from: c */
    public void m149088c(AbstractAsyncTaskC30232e abstractAsyncTaskC30232e) {
        abstractAsyncTaskC30232e.m149083c(this);
        this.f140436c.add(abstractAsyncTaskC30232e);
        if (this.f140437d == null) {
            m149087b();
        }
    }
}

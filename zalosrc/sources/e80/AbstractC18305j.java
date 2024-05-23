package e80;

import ag0.AbstractC0837p0;
import com.zing.zalo.control.MediaStoreItem;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pm0.C24848g0;

/* renamed from: e80.j */
/* loaded from: classes6.dex */
public abstract class AbstractC18305j {

    /* renamed from: a */
    private final List f92586a;

    /* renamed from: b */
    private final List f92587b;

    /* renamed from: c */
    private int f92588c;

    /* renamed from: d */
    private boolean f92589d;

    /* renamed from: e */
    private boolean f92590e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e80.j$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        private final MediaStoreItem f92591a;

        /* renamed from: b */
        private boolean f92592b;

        /* renamed from: c */
        private boolean f92593c;

        public a(MediaStoreItem mediaStoreItem) {
            AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
            this.f92591a = mediaStoreItem;
        }

        /* renamed from: a */
        public final MediaStoreItem m97214a() {
            return this.f92591a;
        }

        /* renamed from: b */
        public final boolean m97215b() {
            return this.f92593c;
        }

        /* renamed from: c */
        public final void m97216c(boolean z11) {
            this.f92592b = z11;
        }

        /* renamed from: d */
        public final void m97217d(boolean z11) {
            this.f92593c = z11;
        }
    }

    public AbstractC18305j(List list) {
        AbstractC19074t.m100208f(list, "items");
        this.f92586a = list;
        this.f92588c = -1;
        this.f92587b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f92587b.add(new a((MediaStoreItem) it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m97206i(AbstractC18305j abstractC18305j) {
        AbstractC19074t.m100208f(abstractC18305j, "this$0");
        synchronized (abstractC18305j) {
            int i11 = abstractC18305j.f92588c + 1;
            abstractC18305j.f92588c = i11;
            if (i11 >= abstractC18305j.f92587b.size()) {
                abstractC18305j.mo97186f();
            } else {
                abstractC18305j.mo97187g((a) abstractC18305j.f92587b.get(abstractC18305j.f92588c));
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: b */
    public final List m97207b() {
        return this.f92586a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final List m97208c() {
        return this.f92587b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m97209d() {
        return this.f92589d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean m97210e() {
        return this.f92590e;
    }

    /* renamed from: f */
    protected abstract void mo97186f();

    /* renamed from: g */
    protected abstract void mo97187g(a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m97211h() {
        if (this.f92590e) {
            return;
        }
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: e80.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC18305j.m97206i(AbstractC18305j.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final void m97212j(boolean z11) {
        this.f92589d = z11;
    }

    /* renamed from: k */
    public final void m97213k() {
        m97211h();
    }
}

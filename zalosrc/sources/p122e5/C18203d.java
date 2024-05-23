package p122e5;

import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p669y4.InterfaceC30285b;

/* renamed from: e5.d */
/* loaded from: classes2.dex */
public final class C18203d {

    /* renamed from: a */
    private final List f92393a;

    /* renamed from: b */
    private final Executor f92394b;

    /* renamed from: c */
    private final boolean f92395c;

    /* renamed from: e5.d$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        private final List f92396a = new ArrayList();

        /* renamed from: b */
        private boolean f92397b = true;

        /* renamed from: c */
        private Executor f92398c;

        /* renamed from: a */
        public a m97011a(InterfaceC30285b interfaceC30285b) {
            this.f92396a.add(interfaceC30285b);
            return this;
        }

        /* renamed from: b */
        public C18203d m97012b() {
            return new C18203d(this.f92396a, null, this.f92398c, this.f92397b, null);
        }
    }

    /* synthetic */ C18203d(List list, InterfaceC18200a interfaceC18200a, Executor executor, boolean z11, AbstractC18206g abstractC18206g) {
        AbstractC4205o.m19723l(list, "APIs must not be null.");
        AbstractC4205o.m19713b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            AbstractC4205o.m19723l(interfaceC18200a, "Listener must not be null when listener executor is set.");
        }
        this.f92393a = list;
        this.f92394b = executor;
        this.f92395c = z11;
    }

    /* renamed from: d */
    public static a m97006d() {
        return new a();
    }

    /* renamed from: a */
    public List m97007a() {
        return this.f92393a;
    }

    /* renamed from: b */
    public InterfaceC18200a m97008b() {
        return null;
    }

    /* renamed from: c */
    public Executor m97009c() {
        return this.f92394b;
    }

    /* renamed from: e */
    public final boolean m97010e() {
        return this.f92395c;
    }
}

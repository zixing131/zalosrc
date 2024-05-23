package dg0;

import android.os.Handler;
import android.os.Looper;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: dg0.b */
/* loaded from: classes.dex */
public abstract class AbstractC17927b {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f90496a;

    /* renamed from: dg0.b$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f90497q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C17926a mo12V4() {
            return c.f90499b.m94537a();
        }
    }

    /* renamed from: dg0.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final InterfaceC17929d m94535a() {
            return (InterfaceC17929d) AbstractC17927b.f90496a.getValue();
        }

        /* renamed from: b */
        public final InterfaceC17929d m94536b() {
            return m94535a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dg0.b$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f90499b = new c();

        /* renamed from: a */
        private static final C17926a f90498a = new C17926a(new Handler(Looper.getMainLooper()));

        private c() {
        }

        /* renamed from: a */
        public final C17926a m94537a() {
            return f90498a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f90497q);
        f90496a = m129210a;
    }

    /* renamed from: b */
    public static final InterfaceC17929d m94533b() {
        return Companion.m94536b();
    }
}

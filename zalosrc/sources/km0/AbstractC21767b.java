package km0;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import p620wt.AbstractC29229d;
import p620wt.InterfaceC29228c;

/* renamed from: km0.b */
/* loaded from: classes.dex */
public abstract class AbstractC21767b {

    /* renamed from: a */
    public static final a f105718a = new a(null);

    /* renamed from: b */
    private static final InterfaceC29228c f105719b;

    /* renamed from: c */
    private static final InterfaceC29228c f105720c;

    /* renamed from: km0.b$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC21766a m112296a() {
            return (InterfaceC21766a) AbstractC21767b.f105720c.getValue();
        }

        /* renamed from: b */
        public final InterfaceC29228c m112297b() {
            return AbstractC21767b.f105719b;
        }

        private a() {
        }
    }

    /* renamed from: km0.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f105721q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21766a mo12V4() {
            return new C21768c();
        }
    }

    static {
        InterfaceC29228c m145982a = AbstractC29229d.m145982a(b.f105721q);
        f105719b = m145982a;
        f105720c = m145982a;
    }

    /* renamed from: c */
    public static final InterfaceC21766a m112295c() {
        return f105718a.m112296a();
    }
}

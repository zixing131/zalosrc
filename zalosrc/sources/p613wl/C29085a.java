package p613wl;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

/* renamed from: wl.a */
/* loaded from: classes3.dex */
public final class C29085a {

    /* renamed from: a */
    public static final C29085a f134890a = new C29085a();

    /* renamed from: b */
    private static final AbstractC27323a f134891b = AbstractC27336n.m139941b(null, b.f134895q, 1, null);

    /* renamed from: c */
    private static final InterfaceC24854k f134892c;

    /* renamed from: wl.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f134893q = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wl.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33041a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C33041a f134894q = new C33041a();

            C33041a() {
                super(1);
            }

            /* renamed from: a */
            public final void m145317a(C27326d c27326d) {
                AbstractC19074t.m100208f(c27326d, "$this$Json");
                c27326d.m139881f(true);
                c27326d.m139878c(true);
                c27326d.m139882g(true);
                c27326d.m139880e(false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m145317a((C27326d) obj);
                return C24848g0.f119245a;
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC27323a mo12V4() {
            return AbstractC27336n.m139941b(null, C33041a.f134894q, 1, null);
        }
    }

    /* renamed from: wl.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f134895q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m145318a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145318a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f134893q);
        f134892c = m129210a;
    }

    private C29085a() {
    }

    /* renamed from: a */
    public final AbstractC27323a m145314a() {
        return (AbstractC27323a) f134892c.getValue();
    }

    /* renamed from: b */
    public final AbstractC27323a m145315b() {
        return f134891b;
    }
}

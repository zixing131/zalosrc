package p320ld;

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

/* renamed from: ld.b */
/* loaded from: classes3.dex */
public final class C22430b {

    /* renamed from: a */
    public static final C22430b f109737a = new C22430b();

    /* renamed from: b */
    private static final AbstractC27323a f109738b = AbstractC27336n.m139941b(null, b.f109742q, 1, null);

    /* renamed from: c */
    private static final InterfaceC24854k f109739c;

    /* renamed from: ld.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f109740q = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ld.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32882a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32882a f109741q = new C32882a();

            C32882a() {
                super(1);
            }

            /* renamed from: a */
            public final void m115868a(C27326d c27326d) {
                AbstractC19074t.m100208f(c27326d, "$this$Json");
                c27326d.m139881f(true);
                c27326d.m139878c(true);
                c27326d.m139882g(true);
                c27326d.m139880e(false);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m115868a((C27326d) obj);
                return C24848g0.f119245a;
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC27323a mo12V4() {
            return AbstractC27336n.m139941b(null, C32882a.f109741q, 1, null);
        }
    }

    /* renamed from: ld.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final b f109742q = new b();

        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m115869a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
            c27326d.m139878c(true);
            c27326d.m139882g(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m115869a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f109740q);
        f109739c = m129210a;
    }

    private C22430b() {
    }

    /* renamed from: a */
    public final AbstractC27323a m115866a() {
        return f109738b;
    }
}

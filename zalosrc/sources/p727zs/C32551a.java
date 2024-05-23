package p727zs;

import at.C2334a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.coroutines.flow.Flow;
import p348mi.AbstractC23310j;

/* renamed from: zs.a */
/* loaded from: classes4.dex */
public final class C32551a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C2334a f150428a;

    /* renamed from: zs.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC23310j {

        /* renamed from: zs.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C33079a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C33079a f150429q = new C33079a();

            C33079a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C32551a mo12V4() {
                return new C32551a(new C2334a());
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C33079a.f150429q);
        }
    }

    public C32551a(C2334a c2334a) {
        AbstractC19074t.m100208f(c2334a, "manageGroupAPI");
        this.f150428a = c2334a;
    }

    /* renamed from: a */
    public final Flow m157626a(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupId");
        return this.f150428a.m12289a(str, i11, z11);
    }
}

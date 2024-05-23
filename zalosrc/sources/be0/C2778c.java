package be0;

import be0.C2778c;
import dg0.InterfaceC17929d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p363nh.C23744a;

/* renamed from: be0.c */
/* loaded from: classes4.dex */
public final class C2778c extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC17929d f11034a;

    /* renamed from: be0.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: be0.c$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f11035a;

        public b(String str) {
            AbstractC19074t.m100208f(str, "conversationId");
            this.f11035a = str;
        }

        /* renamed from: a */
        public final String m13387a() {
            return this.f11035a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC19074t.m100204b(this.f11035a, ((b) obj).f11035a);
        }

        public int hashCode() {
            return this.f11035a.hashCode();
        }

        public String toString() {
            return "Params(conversationId=" + this.f11035a + ")";
        }

        public /* synthetic */ b(String str, int i11, AbstractC19060k abstractC19060k) {
            this((i11 & 1) != 0 ? "" : str);
        }
    }

    public C2778c(InterfaceC17929d interfaceC17929d) {
        AbstractC19074t.m100208f(interfaceC17929d, "schedulers");
        this.f11034a = interfaceC17929d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m13385e(b bVar) {
        AbstractC19074t.m100208f(bVar, "$params");
        if (bVar.m13387a().length() > 0) {
            C23744a.Companion.m124119a().m124116d(4, bVar.m13387a());
        } else {
            C23744a.Companion.m124119a().m124116d(4, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(final b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        this.f11034a.mo94529c("REFRESH_CURRENT_MESSAGE_LIST" + bVar.m13387a(), new Runnable() { // from class: be0.b
            @Override // java.lang.Runnable
            public final void run() {
                C2778c.m13385e(C2778c.b.this);
            }
        }, 300L);
    }
}

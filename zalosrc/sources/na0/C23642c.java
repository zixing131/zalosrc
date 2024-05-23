package na0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: na0.c */
/* loaded from: classes6.dex */
public final class C23642c {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f114528b;

    /* renamed from: a */
    private final InterfaceC23640a f114529a;

    /* renamed from: na0.c$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f114530q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23642c mo12V4() {
            return c.f114531a.m123886a();
        }
    }

    /* renamed from: na0.c$b */
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23642c m123885a() {
            return (C23642c) C23642c.f114528b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: na0.c$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f114531a = new c();

        /* renamed from: b */
        private static final C23642c f114532b = new C23642c(new C23641b());

        private c() {
        }

        /* renamed from: a */
        public final C23642c m123886a() {
            return f114532b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f114530q);
        f114528b = m129210a;
    }

    public C23642c(InterfaceC23640a interfaceC23640a) {
        AbstractC19074t.m100208f(interfaceC23640a, "apiHelper");
        this.f114529a = interfaceC23640a;
    }

    /* renamed from: b */
    public static final C23642c m123882b() {
        return Companion.m123885a();
    }

    /* renamed from: c */
    public final void m123883c(List list, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(list, "listPrivacySetting");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        this.f114529a.mo123880a(list, interfaceC18505l, interfaceC18509p);
    }
}

package p617wp;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p185gc.AbstractC19384h;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p582vp.C28567c;

/* renamed from: wp.c */
/* loaded from: classes4.dex */
public final class C29186c extends AbstractC19384h {

    /* renamed from: a */
    private final C28567c f135207a;

    /* renamed from: b */
    private final InterfaceC26357f f135208b;

    /* renamed from: wp.c$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f135209a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "userId");
            this.f135209a = str;
        }

        /* renamed from: a */
        public final String m145707a() {
            return this.f135209a;
        }
    }

    /* renamed from: wp.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ a f135210q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f135210q = aVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Start executing use case: " + this.f135210q;
        }
    }

    /* renamed from: wp.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ boolean f135211q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11) {
            super(0);
            this.f135211q = z11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return "Executed success. Emitting result: " + this.f135211q;
        }
    }

    public C29186c() {
        this(null, null, 3, null);
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: c */
    public Boolean mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f135208b.mo135685a("SETTING_INLINE", "USE_CASE_GET_STATUS_FOLLOW_NOTIFICATION_NEW_FEED", new b(aVar));
        int m142982e = this.f135207a.m142982e();
        boolean z11 = false;
        if (m142982e != 0 && (m142982e == 1 || m142982e != 2 || !this.f135207a.m142981d().contains(aVar.m145707a()))) {
            z11 = true;
        }
        this.f135208b.mo135685a("SETTING_INLINE", "USE_CASE_GET_STATUS_FOLLOW_NOTIFICATION_NEW_FEED", new c(z11));
        return Boolean.valueOf(z11);
    }

    public /* synthetic */ C29186c(C28567c c28567c, InterfaceC26357f interfaceC26357f, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C28567c.a.m142987c(C28567c.Companion, null, null, null, 7, null) : c28567c, (i11 & 2) != 0 ? C26359h.f125209a : interfaceC26357f);
    }

    public C29186c(C28567c c28567c, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28567c, "repository");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f135207a = c28567c;
        this.f135208b = interfaceC26357f;
    }
}

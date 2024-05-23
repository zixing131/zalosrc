package p582vp;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import kotlin.coroutines.Continuation;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;

/* renamed from: vp.c */
/* loaded from: classes4.dex */
public final class C28567c {
    public static final a Companion = new a(null);

    /* renamed from: d */
    private static volatile C28567c f132555d;

    /* renamed from: a */
    private final C28565a f132556a;

    /* renamed from: b */
    private final C28566b f132557b;

    /* renamed from: c */
    private final InterfaceC26357f f132558c;

    /* renamed from: vp.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final C28567c m142986a(C28565a c28565a, C28566b c28566b, InterfaceC26357f interfaceC26357f) {
            if (interfaceC26357f == null) {
                interfaceC26357f = C26359h.f125209a;
            }
            if (c28565a == null) {
                c28565a = new C28565a(interfaceC26357f);
            }
            if (c28566b == null) {
                c28566b = new C28566b(interfaceC26357f);
            }
            return new C28567c(c28565a, c28566b, interfaceC26357f);
        }

        /* renamed from: c */
        public static /* synthetic */ C28567c m142987c(a aVar, C28565a c28565a, C28566b c28566b, InterfaceC26357f interfaceC26357f, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c28565a = null;
            }
            if ((i11 & 2) != 0) {
                c28566b = null;
            }
            if ((i11 & 4) != 0) {
                interfaceC26357f = null;
            }
            return aVar.m142988b(c28565a, c28566b, interfaceC26357f);
        }

        /* renamed from: b */
        public final C28567c m142988b(C28565a c28565a, C28566b c28566b, InterfaceC26357f interfaceC26357f) {
            C28567c c28567c = C28567c.f132555d;
            if (c28567c == null) {
                synchronized (this) {
                    c28567c = C28567c.f132555d;
                    if (c28567c == null) {
                        C28567c m142986a = C28567c.Companion.m142986a(c28565a, c28566b, interfaceC26357f);
                        C28567c.f132555d = m142986a;
                        c28567c = m142986a;
                    }
                }
            }
            return c28567c;
        }
    }

    /* renamed from: vp.c$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ long f132559q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j11) {
            super(0);
            this.f132559q = j11;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "notificationId: " + this.f132559q;
        }
    }

    /* renamed from: vp.c$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f132560q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "";
        }
    }

    /* renamed from: vp.c$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f132561q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "";
        }
    }

    /* renamed from: vp.c$e */
    /* loaded from: classes4.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f132562q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f132562q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "feedId: " + this.f132562q;
        }
    }

    /* renamed from: vp.c$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f132563q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str) {
            super(0);
            this.f132563q = str;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "feedId: " + this.f132563q;
        }
    }

    /* renamed from: vp.c$g */
    /* loaded from: classes4.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f132564q;

        /* renamed from: r */
        final /* synthetic */ List f132565r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i11, List list) {
            super(0);
            this.f132564q = i11;
            this.f132565r = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Type: " + this.f132564q + " - List unfollow: " + this.f132565r;
        }
    }

    public C28567c(C28565a c28565a, C28566b c28566b, InterfaceC26357f interfaceC26357f) {
        AbstractC19074t.m100208f(c28565a, "settingFeedNotificationAPI");
        AbstractC19074t.m100208f(c28566b, "settingFeedNotificationLocalDataSource");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        this.f132556a = c28565a;
        this.f132557b = c28566b;
        this.f132558c = interfaceC26357f;
    }

    /* renamed from: c */
    public final Object m142980c(long j11, Continuation continuation) {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_DELETE_NOTIFICATION", new b(j11));
        return this.f132556a.m142950b(j11, continuation);
    }

    /* renamed from: d */
    public final List m142981d() {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_GET_LIST_UNFOLLOW_NOTIFICATION_NEW_FEED", c.f132560q);
        return this.f132557b.m142970a();
    }

    /* renamed from: e */
    public final int m142982e() {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_GET_TYPE_SETTING_NOTIFICATION_NEW_FEED", d.f132561q);
        return this.f132557b.m142971b();
    }

    /* renamed from: f */
    public final Object m142983f(String str, Continuation continuation) {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_SUBSCRIBE_FEED", new e(str));
        return C28565a.m142948d(this.f132556a, str, 0, continuation, 2, null);
    }

    /* renamed from: g */
    public final Object m142984g(String str, Continuation continuation) {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_UNSUBSCRIBE_FEED", new f(str));
        return C28565a.m142949f(this.f132556a, str, 0, continuation, 2, null);
    }

    /* renamed from: h */
    public final Object m142985h(int i11, List list, Continuation continuation) {
        this.f132558c.mo135685a("SETTING_INLINE", "REPO_UPDATE_SETTING_NEW_FEED_NOTIFICATION", new g(i11, list));
        return this.f132556a.m142953g(i11, list, continuation);
    }
}

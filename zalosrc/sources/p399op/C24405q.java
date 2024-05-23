package p399op;

import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import on0.AbstractC24341v;
import p426pp.C24898a;
import p426pp.C24899b;
import p426pp.C24901d;
import p426pp.C24902e;
import p426pp.C24903f;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: op.q */
/* loaded from: classes4.dex */
public final class C24405q implements InterfaceC24391c, InterfaceC24392d, InterfaceC24396h, InterfaceC24397i, InterfaceC24395g, InterfaceC24393e {
    public static final a Companion = new a(null);

    /* renamed from: v */
    private static volatile C24405q f117825v;

    /* renamed from: p */
    private final InterfaceC24391c f117826p;

    /* renamed from: q */
    private final InterfaceC24392d f117827q;

    /* renamed from: r */
    private final InterfaceC24396h f117828r;

    /* renamed from: s */
    private final InterfaceC24397i f117829s;

    /* renamed from: t */
    private final InterfaceC24395g f117830t;

    /* renamed from: u */
    private final InterfaceC24393e f117831u;

    /* renamed from: op.q$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24405q m127651a() {
            C24405q c24405q = C24405q.f117825v;
            if (c24405q == null) {
                synchronized (this) {
                    c24405q = new C24405q(new C24398j(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), new C24399k(), new C24406r(null, 1, null), new C24407s(), new C24404p(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0), new C24400l());
                    C24405q.f117825v = c24405q;
                }
            }
            return c24405q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f117832s;

        /* renamed from: t */
        Object f117833t;

        /* renamed from: u */
        Object f117834u;

        /* renamed from: v */
        /* synthetic */ Object f117835v;

        /* renamed from: x */
        int f117837x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117835v = obj;
            this.f117837x |= Integer.MIN_VALUE;
            return C24405q.this.m127647v(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24902e f117838q;

        /* renamed from: r */
        final /* synthetic */ C24898a f117839r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C24902e c24902e, C24898a c24898a) {
            super(0);
            this.f117838q = c24902e;
            this.f117839r = c24898a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117838q.m129490f() + " load api " + this.f117839r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C24902e f117840q;

        /* renamed from: r */
        final /* synthetic */ C24898a f117841r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C24902e c24902e, C24898a c24898a) {
            super(0);
            this.f117840q = c24902e;
            this.f117841r = c24898a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117840q.m129490f() + "  not in cache " + this.f117841r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f117842s;

        /* renamed from: t */
        Object f117843t;

        /* renamed from: u */
        /* synthetic */ Object f117844u;

        /* renamed from: w */
        int f117846w;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117844u = obj;
            this.f117846w |= Integer.MIN_VALUE;
            return C24405q.this.mo127588f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117847q;

        /* renamed from: r */
        final /* synthetic */ C24902e f117848r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, C24902e c24902e) {
            super(0);
            this.f117847q = str;
            this.f117848r = c24902e;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117847q + " get from cache " + this.f117848r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117849q;

        /* renamed from: r */
        final /* synthetic */ C24902e f117850r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, C24902e c24902e) {
            super(0);
            this.f117849q = str;
            this.f117850r = c24902e;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117849q + " load api " + this.f117850r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f117851s;

        /* renamed from: t */
        Object f117852t;

        /* renamed from: u */
        /* synthetic */ Object f117853u;

        /* renamed from: w */
        int f117855w;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117853u = obj;
            this.f117855w |= Integer.MIN_VALUE;
            return C24405q.this.mo127590i(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117856q;

        /* renamed from: r */
        final /* synthetic */ C24903f f117857r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, C24903f c24903f) {
            super(0);
            this.f117856q = str;
            this.f117857r = c24903f;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117856q + " get from cache " + this.f117857r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117858q;

        /* renamed from: r */
        final /* synthetic */ C24903f f117859r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, C24903f c24903f) {
            super(0);
            this.f117858q = str;
            this.f117859r = c24903f;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f117858q + " load api " + this.f117859r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC29096d {

        /* renamed from: s */
        Object f117860s;

        /* renamed from: t */
        /* synthetic */ Object f117861t;

        /* renamed from: v */
        int f117863v;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117861t = obj;
            this.f117863v |= Integer.MIN_VALUE;
            return C24405q.this.m127648w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC29096d {

        /* renamed from: s */
        Object f117864s;

        /* renamed from: t */
        Object f117865t;

        /* renamed from: u */
        /* synthetic */ Object f117866u;

        /* renamed from: w */
        int f117868w;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117866u = obj;
            this.f117868w |= Integer.MIN_VALUE;
            return C24405q.this.m127649y(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC29096d {

        /* renamed from: s */
        Object f117869s;

        /* renamed from: t */
        Object f117870t;

        /* renamed from: u */
        /* synthetic */ Object f117871u;

        /* renamed from: w */
        int f117873w;

        m(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117871u = obj;
            this.f117873w |= Integer.MIN_VALUE;
            return C24405q.this.m127650z(null, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117874q;

        /* renamed from: r */
        final /* synthetic */ C24899b f117875r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, C24899b c24899b) {
            super(0);
            this.f117874q = str;
            this.f117875r = c24899b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "keyword " + this.f117874q + " load api " + this.f117875r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: op.q$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ String f117876q;

        /* renamed from: r */
        final /* synthetic */ C24899b f117877r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, C24899b c24899b) {
            super(0);
            this.f117876q = str;
            this.f117877r = c24899b;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "keyword " + this.f117876q + " from cache " + this.f117877r;
        }
    }

    public C24405q(InterfaceC24391c interfaceC24391c, InterfaceC24392d interfaceC24392d, InterfaceC24396h interfaceC24396h, InterfaceC24397i interfaceC24397i, InterfaceC24395g interfaceC24395g, InterfaceC24393e interfaceC24393e) {
        AbstractC19074t.m100208f(interfaceC24391c, "musicAPI");
        AbstractC19074t.m100208f(interfaceC24392d, "musicCache");
        AbstractC19074t.m100208f(interfaceC24396h, "musicResultCache");
        AbstractC19074t.m100208f(interfaceC24397i, "musicStreamingCache");
        AbstractC19074t.m100208f(interfaceC24395g, "musicLyricCache");
        AbstractC19074t.m100208f(interfaceC24393e, "musicCategoryCache");
        this.f117826p = interfaceC24391c;
        this.f117827q = interfaceC24392d;
        this.f117828r = interfaceC24396h;
        this.f117829s = interfaceC24397i;
        this.f117830t = interfaceC24395g;
        this.f117831u = interfaceC24393e;
    }

    /* renamed from: x */
    public static final C24405q m127646x() {
        return Companion.m127651a();
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: a */
    public Object mo127586a(Continuation continuation) {
        return this.f117826p.mo127586a(continuation);
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: b */
    public Object mo127587b(int i11, int i12, Continuation continuation) {
        return this.f117826p.mo127587b(i11, i12, continuation);
    }

    @Override // p399op.InterfaceC24393e
    /* renamed from: c */
    public List mo127595c() {
        return this.f117831u.mo127595c();
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: d */
    public C24899b mo127605d(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return this.f117828r.mo127605d(str);
    }

    @Override // p399op.InterfaceC24392d
    /* renamed from: e */
    public C24902e mo127593e(String str) {
        AbstractC19074t.m100208f(str, "songId");
        return this.f117827q.mo127593e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p399op.InterfaceC24391c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo127588f(String str, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        C24405q c24405q;
        boolean m127128x;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f117846w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f117846w = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f117844u;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f117846w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str = (String) eVar.f117843t;
                        c24405q = (C24405q) eVar.f117842s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C24902e mo127593e = this.f117827q.mo127593e(str);
                    if (mo127593e != null) {
                        m127128x = AbstractC24341v.m127128x(mo127593e.m129493i());
                        if (!m127128x) {
                            C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SONG_INFO", new f(str, mo127593e));
                            return mo127593e;
                        }
                    }
                    InterfaceC24391c interfaceC24391c = this.f117826p;
                    eVar.f117842s = this;
                    eVar.f117843t = str;
                    eVar.f117846w = 1;
                    obj = interfaceC24391c.mo127588f(str, eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24405q = this;
                }
                C24902e c24902e = (C24902e) obj;
                C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SONG_INFO", new g(str, c24902e));
                c24405q.f117827q.mo127594p(c24902e);
                return c24902e;
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f117844u;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f117846w;
        if (i11 == 0) {
        }
        C24902e c24902e2 = (C24902e) obj2;
        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SONG_INFO", new g(str, c24902e2));
        c24405q.f117827q.mo127594p(c24902e2);
        return c24902e2;
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: g */
    public boolean mo127606g(String str) {
        AbstractC19074t.m100208f(str, "keyword");
        return this.f117828r.mo127606g(str);
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: h */
    public Object mo127589h(String str, int i11, Continuation continuation) {
        return this.f117826p.mo127589h(str, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p399op.InterfaceC24391c
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo127590i(String str, String str2, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i11;
        C24405q c24405q;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i12 = hVar.f117855w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                hVar.f117855w = i12 - Integer.MIN_VALUE;
                Object obj = hVar.f117853u;
                m142578e = AbstractC28298d.m142578e();
                i11 = hVar.f117855w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        str = (String) hVar.f117852t;
                        c24405q = (C24405q) hVar.f117851s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C24903f mo127608r = this.f117829s.mo127608r(str);
                    if (mo127608r != null && mo127608r.m129504g()) {
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LINK_STREAMING", new i(str, mo127608r));
                        return mo127608r;
                    }
                    InterfaceC24391c interfaceC24391c = this.f117826p;
                    hVar.f117851s = this;
                    hVar.f117852t = str;
                    hVar.f117855w = 1;
                    obj = interfaceC24391c.mo127590i(str, str2, hVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24405q = this;
                }
                C24903f c24903f = (C24903f) obj;
                C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LINK_STREAMING", new j(str, c24903f));
                c24405q.f117829s.mo127609t(c24903f);
                return c24903f;
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f117853u;
        m142578e = AbstractC28298d.m142578e();
        i11 = hVar.f117855w;
        if (i11 == 0) {
        }
        C24903f c24903f2 = (C24903f) obj2;
        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LINK_STREAMING", new j(str, c24903f2));
        c24405q.f117829s.mo127609t(c24903f2);
        return c24903f2;
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: j */
    public Object mo127591j(int i11, Continuation continuation) {
        return this.f117826p.mo127591j(i11, continuation);
    }

    @Override // p399op.InterfaceC24396h
    /* renamed from: k */
    public void mo127607k(C24899b c24899b) {
        AbstractC19074t.m100208f(c24899b, "searchResult");
        this.f117828r.mo127607k(c24899b);
    }

    @Override // p399op.InterfaceC24391c
    /* renamed from: l */
    public Object mo127592l(String str, Continuation continuation) {
        return this.f117826p.mo127592l(str, continuation);
    }

    @Override // p399op.InterfaceC24393e
    /* renamed from: m */
    public void mo127596m(C24901d c24901d) {
        AbstractC19074t.m100208f(c24901d, "songCategory");
        this.f117831u.mo127596m(c24901d);
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: n */
    public void mo127602n(C24898a c24898a) {
        AbstractC19074t.m100208f(c24898a, "lyric");
        this.f117830t.mo127602n(c24898a);
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: o */
    public void mo127603o() {
        this.f117830t.mo127603o();
    }

    @Override // p399op.InterfaceC24392d
    /* renamed from: p */
    public void mo127594p(C24902e c24902e) {
        AbstractC19074t.m100208f(c24902e, "song");
        this.f117827q.mo127594p(c24902e);
    }

    @Override // p399op.InterfaceC24395g
    /* renamed from: q */
    public C24898a mo127604q(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        return this.f117830t.mo127604q(str);
    }

    @Override // p399op.InterfaceC24397i
    /* renamed from: r */
    public C24903f mo127608r(String str) {
        AbstractC19074t.m100208f(str, "idSong");
        return this.f117829s.mo127608r(str);
    }

    @Override // p399op.InterfaceC24397i
    /* renamed from: t */
    public void mo127609t(C24903f c24903f) {
        AbstractC19074t.m100208f(c24903f, "songStreaming");
        this.f117829s.mo127609t(c24903f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127647v(C24902e c24902e, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C24405q c24405q;
        C24902e c24902e2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f117837x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f117837x = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f117835v;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f117837x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24902e = (C24902e) bVar.f117834u;
                        c24902e2 = (C24902e) bVar.f117833t;
                        c24405q = (C24405q) bVar.f117832s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C24898a mo127604q = this.f117830t.mo127604q(c24902e.m129490f());
                    if (mo127604q != null) {
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LYRIC", new c(c24902e, mo127604q));
                        return mo127604q;
                    }
                    InterfaceC24391c interfaceC24391c = this.f117826p;
                    String m129491g = c24902e.m129491g();
                    bVar.f117832s = this;
                    bVar.f117833t = c24902e;
                    bVar.f117834u = c24902e;
                    bVar.f117837x = 1;
                    obj = interfaceC24391c.mo127592l(m129491g, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24405q = this;
                    c24902e2 = c24902e;
                }
                C24898a c24898a = new C24898a(c24902e, (List) obj);
                c24405q.f117830t.mo127602n(c24898a);
                C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LYRIC", new d(c24902e2, c24898a));
                return c24898a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f117835v;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f117837x;
        if (i11 == 0) {
        }
        C24898a c24898a2 = new C24898a(c24902e, (List) obj2);
        c24405q.f117830t.mo127602n(c24898a2);
        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_LYRIC", new d(c24902e2, c24898a2));
        return c24898a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061 A[LOOP:0: B:11:0x005b->B:13:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d A[LOOP:1: B:16:0x0077->B:18:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127648w(Continuation continuation) {
        k kVar;
        Object m142578e;
        int i11;
        C24405q c24405q;
        Iterator it;
        Iterator it2;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i12 = kVar.f117863v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f117863v = i12 - Integer.MIN_VALUE;
                Object obj = kVar.f117861t;
                m142578e = AbstractC28298d.m142578e();
                i11 = kVar.f117863v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24405q = (C24405q) kVar.f117860s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List mo127595c = this.f117831u.mo127595c();
                    if (mo127595c == null) {
                        InterfaceC24391c interfaceC24391c = this.f117826p;
                        kVar.f117860s = this;
                        kVar.f117863v = 1;
                        obj = interfaceC24391c.mo127586a(kVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c24405q = this;
                    } else {
                        return mo127595c;
                    }
                }
                C24408t c24408t = (C24408t) obj;
                it = c24408t.m127663b().iterator();
                while (it.hasNext()) {
                    c24405q.f117827q.mo127594p((C24902e) it.next());
                }
                it2 = c24408t.m127662a().iterator();
                while (it2.hasNext()) {
                    c24405q.f117831u.mo127596m((C24901d) it2.next());
                }
                return c24408t.m127662a();
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f117861t;
        m142578e = AbstractC28298d.m142578e();
        i11 = kVar.f117863v;
        if (i11 == 0) {
        }
        C24408t c24408t2 = (C24408t) obj2;
        it = c24408t2.m127663b().iterator();
        while (it.hasNext()) {
        }
        it2 = c24408t2.m127662a().iterator();
        while (it2.hasNext()) {
        }
        return c24408t2.m127662a();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[LOOP:0: B:11:0x0078->B:13:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127649y(C24901d c24901d, Continuation continuation) {
        l lVar;
        Object m142578e;
        int i11;
        C24405q c24405q;
        Iterator it;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i12 = lVar.f117868w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f117868w = i12 - Integer.MIN_VALUE;
                Object obj = lVar.f117866u;
                m142578e = AbstractC28298d.m142578e();
                i11 = lVar.f117868w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c24901d = (C24901d) lVar.f117865t;
                        c24405q = (C24405q) lVar.f117864s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!c24901d.m129479e()) {
                        return c24901d;
                    }
                    InterfaceC24391c interfaceC24391c = this.f117826p;
                    int m129480f = c24901d.m129480f();
                    int m129482h = c24901d.m129482h() + 1;
                    lVar.f117864s = this;
                    lVar.f117865t = c24901d;
                    lVar.f117868w = 1;
                    obj = interfaceC24391c.mo127587b(m129480f, m129482h, lVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24405q = this;
                }
                C24409u c24409u = (C24409u) obj;
                C24901d m129477b = c24901d.m129477b(c24409u.m127666c(), c24409u.m127665b(), c24409u.m127664a());
                it = c24409u.m127666c().iterator();
                while (it.hasNext()) {
                    c24405q.f117827q.mo127594p((C24902e) it.next());
                }
                c24405q.f117831u.mo127596m(m129477b);
                return m129477b;
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.f117866u;
        m142578e = AbstractC28298d.m142578e();
        i11 = lVar.f117868w;
        if (i11 == 0) {
        }
        C24409u c24409u2 = (C24409u) obj2;
        C24901d m129477b2 = c24901d.m129477b(c24409u2.m127666c(), c24409u2.m127665b(), c24409u2.m127664a());
        it = c24409u2.m127666c().iterator();
        while (it.hasNext()) {
        }
        c24405q.f117831u.mo127596m(m129477b2);
        return m129477b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b A[LOOP:0: B:11:0x0085->B:13:0x008b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127650z(String str, int i11, boolean z11, Continuation continuation) {
        m mVar;
        Object m142578e;
        int i12;
        C24405q c24405q;
        Iterator it;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i13 = mVar.f117873w;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f117873w = i13 - Integer.MIN_VALUE;
                Object obj = mVar.f117871u;
                m142578e = AbstractC28298d.m142578e();
                i12 = mVar.f117873w;
                if (i12 == 0) {
                    if (i12 == 1) {
                        str = (String) mVar.f117870t;
                        c24405q = (C24405q) mVar.f117869s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!z11 && this.f117828r.mo127606g(str)) {
                        C24899b mo127605d = this.f117828r.mo127605d(str);
                        AbstractC19074t.m100205c(mo127605d);
                        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SEARCH", new n(str, mo127605d));
                        return mo127605d;
                    }
                    InterfaceC24391c interfaceC24391c = this.f117826p;
                    mVar.f117869s = this;
                    mVar.f117870t = str;
                    mVar.f117873w = 1;
                    obj = interfaceC24391c.mo127589h(str, i11, mVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24405q = this;
                }
                C24899b c24899b = (C24899b) obj;
                C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SEARCH", new o(str, c24899b));
                it = c24899b.m129471b().iterator();
                while (it.hasNext()) {
                    c24405q.f117827q.mo127594p((C24902e) it.next());
                }
                c24405q.f117828r.mo127607k(c24899b);
                return c24899b;
            }
        }
        mVar = new m(continuation);
        Object obj2 = mVar.f117871u;
        m142578e = AbstractC28298d.m142578e();
        i12 = mVar.f117873w;
        if (i12 == 0) {
        }
        C24899b c24899b2 = (C24899b) obj2;
        C26359h.f125209a.mo135685a("FEED_MUSIC", "REPO_GET_SEARCH", new o(str, c24899b2));
        it = c24899b2.m129471b().iterator();
        while (it.hasNext()) {
        }
        c24405q.f117828r.mo127607k(c24899b2);
        return c24899b2;
    }
}

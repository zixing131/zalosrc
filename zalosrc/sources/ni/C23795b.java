package ni;

import com.zing.zalo.p062db.C7959d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.Map;
import p348mi.AbstractC23306f;
import p393oi.C24272e;
import p393oi.InterfaceC24271d;
import p423pi.C24764f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: ni.b */
/* loaded from: classes3.dex */
public final class C23795b {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static final InterfaceC24854k f115002b;

    /* renamed from: a */
    private final InterfaceC24271d f115003a;

    /* renamed from: ni.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f115004q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23795b mo12V4() {
            return c.f115005a.m124344a();
        }
    }

    /* renamed from: ni.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23795b m124343a() {
            return (C23795b) C23795b.f115002b.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ni.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f115005a = new c();

        /* renamed from: b */
        private static final C23795b f115006b;

        static {
            C7959d m120589J = AbstractC23306f.m120589J();
            AbstractC19074t.m100207e(m120589J, "provideDatabaseChatHelper(...)");
            f115006b = new C23795b(new C24272e(m120589J));
        }

        private c() {
        }

        /* renamed from: a */
        public final C23795b m124344a() {
            return f115006b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f115004q);
        f115002b = m129210a;
    }

    public C23795b(InterfaceC24271d interfaceC24271d) {
        AbstractC19074t.m100208f(interfaceC24271d, "localSource");
        this.f115003a = interfaceC24271d;
    }

    /* renamed from: c */
    public static final C23795b m124335c() {
        return Companion.m124343a();
    }

    /* renamed from: b */
    public final Map m124336b(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "date");
        return this.f115003a.mo126739e(str, i11, str2);
    }

    /* renamed from: d */
    public final void m124337d(int i11, String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(hashMap, "logList");
        this.f115003a.mo126738d(i11, str, hashMap);
    }

    /* renamed from: e */
    public final void m124338e(int i11, String str, String str2, C24764f c24764f) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(c24764f, "threadInfoLog");
        this.f115003a.mo126737c(i11, str, str2, c24764f);
    }

    /* renamed from: f */
    public final void m124339f(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "date");
        this.f115003a.mo126735a(str, i11, str2);
    }

    /* renamed from: g */
    public final void m124340g(int i11, String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(hashMap, "threadInfoLog");
        this.f115003a.mo126740f(i11, str, hashMap);
    }

    /* renamed from: h */
    public final void m124341h(int i11, String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(hashMap, "threadInfoLog");
        this.f115003a.mo126736b(i11, str, hashMap);
    }
}

package p605wc;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.AbstractC4019a;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23244v8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sc.C26220b;

/* renamed from: wc.b */
/* loaded from: classes3.dex */
public final class C28910b {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private static final InterfaceC24854k f133836a;

    /* renamed from: wc.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f133837q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C28910b mo12V4() {
            return c.f133838a.m144417a();
        }
    }

    /* renamed from: wc.b$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28910b m144416a() {
            return (C28910b) C28910b.f133836a.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wc.b$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f133838a = new c();

        /* renamed from: b */
        private static final C28910b f133839b = new C28910b();

        private c() {
        }

        /* renamed from: a */
        public final C28910b m144417a() {
            return f133839b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f133837q);
        f133836a = m129210a;
    }

    /* renamed from: d */
    public static final C28910b m144412d() {
        return Companion.m144416a();
    }

    /* renamed from: b */
    public final void m144413b(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "token");
        C26220b.m134826i("SMLGoogleAuthProvider", "clearToken(): " + AbstractC23244v8.m119735E(str, 30), null, 4, null);
        AbstractC4019a.m19027a(context, str);
    }

    /* renamed from: c */
    public final String m144414c(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "accountName");
        String m19028c = AbstractC4019a.m19028c(context, new Account(str, "com.google"), "oauth2: https://www.googleapis.com/auth/drive.appdata");
        AbstractC19074t.m100207e(m19028c, "getToken(...)");
        return m19028c;
    }
}

package p605wc;

import android.content.Intent;
import androidx.work.AbstractC2144f;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.IOException;
import me0.AbstractC23244v8;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p185gc.AbstractC19384h;
import sc.C26220b;

/* renamed from: wc.c */
/* loaded from: classes3.dex */
public final class C28911c extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C28910b f133840a;

    /* renamed from: wc.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wc.c$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133841a;

        /* renamed from: b */
        private final int f133842b;

        /* renamed from: c */
        private final String f133843c;

        /* renamed from: d */
        private final boolean f133844d;

        public b(String str, int i11, String str2, boolean z11) {
            AbstractC19074t.m100208f(str, "token");
            AbstractC19074t.m100208f(str2, "accountName");
            this.f133841a = str;
            this.f133842b = i11;
            this.f133843c = str2;
            this.f133844d = z11;
        }

        /* renamed from: a */
        public final String m144419a() {
            return this.f133843c;
        }

        /* renamed from: b */
        public final boolean m144420b() {
            return this.f133844d;
        }

        /* renamed from: c */
        public final String m144421c() {
            return this.f133841a;
        }

        /* renamed from: d */
        public final int m144422d() {
            return this.f133842b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f133841a, bVar.f133841a) && this.f133842b == bVar.f133842b && AbstractC19074t.m100204b(this.f133843c, bVar.f133843c) && this.f133844d == bVar.f133844d;
        }

        public int hashCode() {
            return (((((this.f133841a.hashCode() * 31) + this.f133842b) * 31) + this.f133843c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f133844d);
        }

        public String toString() {
            return "Params(token=" + this.f133841a + ", tokenState=" + this.f133842b + ", accountName=" + this.f133843c + ", forceRefresh=" + this.f133844d + ")";
        }

        public /* synthetic */ b(String str, int i11, String str2, boolean z11, int i12, AbstractC19060k abstractC19060k) {
            this(str, i11, str2, (i12 & 8) != 0 ? false : z11);
        }
    }

    /* renamed from: wc.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f133845a;

        /* renamed from: b */
        private final int f133846b;

        /* renamed from: c */
        private final Intent f133847c;

        public c(String str, int i11, Intent intent) {
            AbstractC19074t.m100208f(str, "token");
            this.f133845a = str;
            this.f133846b = i11;
            this.f133847c = intent;
        }

        /* renamed from: a */
        public final Intent m144423a() {
            return this.f133847c;
        }

        /* renamed from: b */
        public final String m144424b() {
            return this.f133845a;
        }

        /* renamed from: c */
        public final int m144425c() {
            return this.f133846b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC19074t.m100204b(this.f133845a, cVar.f133845a) && this.f133846b == cVar.f133846b && AbstractC19074t.m100204b(this.f133847c, cVar.f133847c);
        }

        public int hashCode() {
            int hashCode = ((this.f133845a.hashCode() * 31) + this.f133846b) * 31;
            Intent intent = this.f133847c;
            return hashCode + (intent == null ? 0 : intent.hashCode());
        }

        public String toString() {
            return "Result(token=" + this.f133845a + ", tokenState=" + this.f133846b + ", authRecoverIntent=" + this.f133847c + ")";
        }

        public /* synthetic */ c(String str, int i11, Intent intent, int i12, AbstractC19060k abstractC19060k) {
            this(str, i11, (i12 & 4) != 0 ? null : intent);
        }
    }

    public C28911c(C28910b c28910b) {
        AbstractC19074t.m100208f(c28910b, "googleAuthProvider");
        this.f133840a = c28910b;
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: c */
    public c mo13388b(b bVar) {
        String str;
        int i11;
        int i12;
        String m144414c;
        AbstractC19074t.m100208f(bVar, "params");
        String m144419a = bVar.m144419a();
        boolean m144420b = bVar.m144420b();
        String m144421c = bVar.m144421c();
        int m144422d = bVar.m144422d();
        if (m144419a.length() == 0) {
            return new c("", 4, null, 4, null);
        }
        int i13 = 4;
        C26220b.m134826i("SMLRefreshGoogleAuthToken", "Check refresh Google Auth token: currToken=" + AbstractC23244v8.m119735E(m144421c, 30) + ", currTokenState=" + m144422d + ", accountName=" + AbstractC23244v8.m119735E(m144419a, 10) + ", forceRefresh=" + m144420b, null, 4, null);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                try {
                    try {
                        try {
                            if (m144421c.length() == 0) {
                                m144414c = this.f133840a.m144414c(MainApplication.Companion.m35500c(), m144419a);
                            } else {
                                if (m144422d != 0 || m144420b) {
                                    C26220b.m134826i("SMLRefreshGoogleAuthToken", "Clear token!", null, 4, null);
                                    this.f133840a.m144413b(MainApplication.Companion.m35500c(), m144421c);
                                }
                                m144414c = this.f133840a.m144414c(MainApplication.Companion.m35500c(), m144419a);
                            }
                            m144421c = m144414c;
                            C26220b.m134826i("SMLRefreshGoogleAuthToken", "Token refreshed: " + AbstractC23244v8.m119735E(m144421c, 30), null, 4, null);
                            C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), 0);
                            str = m144421c;
                            i11 = 0;
                        } catch (IOException e11) {
                            AbstractC23350e.m122776f("SMLRefreshGoogleAuthToken", e11);
                            if (!C23055e5.m118273h(false, 1, null)) {
                                i13 = 1;
                            }
                            C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), i13);
                            str = m144421c;
                            i11 = i13;
                        }
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f("SMLRefreshGoogleAuthToken", e12);
                        C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), 4);
                        str = m144421c;
                        i11 = 4;
                    }
                } catch (UserRecoverableAuthException e13) {
                    AbstractC23350e.m122776f("SMLRefreshGoogleAuthToken", e13);
                    i12 = 2;
                    try {
                        c cVar = new c("", 2, e13.m19026a());
                        C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), 2);
                        return cVar;
                    } catch (Throwable th2) {
                        th = th2;
                        C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), i12);
                        throw th;
                    }
                }
            } catch (GoogleAuthException e14) {
                AbstractC23350e.m122776f("SMLRefreshGoogleAuthToken", e14);
                C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), 3);
                str = m144421c;
                i11 = 3;
            }
            return new c(str, i11, null, 4, null);
        } catch (Throwable th3) {
            th = th3;
            i12 = 0;
            C26220b.f124587a.m134841C(currentTimeMillis, System.currentTimeMillis(), i12);
            throw th;
        }
    }
}

package me0;

import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gm0.AbstractC19512f;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import li.AbstractC22490a;
import mm0.AbstractC23354i;
import on0.C24321d;
import p371nv.C23952g;

/* renamed from: me0.a4 */
/* loaded from: classes.dex */
public final class C23010a4 {

    /* renamed from: a */
    public static final C23010a4 f111960a = new C23010a4();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: me0.a4$a */
    /* loaded from: classes.dex */
    public @interface a {
        public static final C32894a Companion = C32894a.f111961a;

        /* renamed from: me0.a4$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32894a {

            /* renamed from: a */
            static final /* synthetic */ C32894a f111961a = new C32894a();

            /* renamed from: b */
            private static int f111962b;

            private C32894a() {
            }

            /* renamed from: a */
            public final int m117976a() {
                return f111962b;
            }
        }
    }

    /* renamed from: me0.a4$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC20110a.b {
        public static final a Companion = new a(null);

        /* renamed from: me0.a4$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ho0.AbstractC20110a.b
        /* renamed from: g */
        public String mo104568g(String str, Object[] objArr) {
            AbstractC19074t.m100208f(str, "message");
            AbstractC19074t.m100208f(objArr, "args");
            try {
                return super.mo104568g(str, objArr);
            } catch (Exception unused) {
                return "formatMessage error: " + str;
            }
        }
    }

    /* renamed from: me0.a4$c */
    /* loaded from: classes.dex */
    public static final class c extends b {
        c() {
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: n */
        public void mo104555n(int i11, String str, String str2, Throwable th2) {
            Throwable th3;
            AbstractC19074t.m100208f(str2, "message");
            if (i11 >= 6) {
                if (str2.length() == 0) {
                    th3 = th2;
                } else {
                    th3 = null;
                }
                C23952g.m125343h(i11, str, str2, th3);
            }
            if (i11 == 9) {
                try {
                    AbstractC22490a.m116280c(i11, str, str2);
                } catch (Exception unused) {
                    return;
                }
            }
            if (th2 != null && i11 >= 6) {
                AbstractC22490a.m116282e(th2);
            }
        }
    }

    private C23010a4() {
    }

    /* renamed from: a */
    public final void m117973a(int i11) {
        try {
            if (i11 == a.Companion.m117976a()) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                String uuid = AbstractC23020b3.m118021b(MainApplication.Companion.m35500c()).toString();
                AbstractC19074t.m100207e(uuid, "toString(...)");
                Charset charset = C24321d.f117408b;
                byte[] bytes = uuid.getBytes(charset);
                AbstractC19074t.m100207e(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                byte[] bytes2 = "salt for file InstallationUniqueId".getBytes(charset);
                AbstractC19074t.m100207e(bytes2, "getBytes(...)");
                messageDigest.update(bytes2);
                String m101985d = AbstractC19512f.m101985d(messageDigest.digest());
                String m104866a0 = AbstractC20130d.m104866a0();
                AbstractC19074t.m100207e(m104866a0, "getLogInternalStorageDirectory(...)");
                AbstractC19074t.m100205c(m101985d);
                C23952g.m125349o(m104866a0, m101985d);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m117974b() {
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.m104565y();
        if (AbstractC23354i.m122791a()) {
            aVar.m104563w(new c());
        }
    }

    /* renamed from: c */
    public final void m117975c() {
        AbstractC20110a.f98889a.m104565y();
        if (AbstractC23354i.m122791a()) {
            C23952g.f115926a.m125350m(200);
            C23952g.m125344i("Process start at " + MainApplication.Companion.m35505h() + " - pre-setup logger at " + System.currentTimeMillis());
        }
    }
}

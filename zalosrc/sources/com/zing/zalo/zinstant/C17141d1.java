package com.zing.zalo.zinstant;

import android.content.Context;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.leveldb.exception.LevelDBIOException;
import com.zing.zalo.preferences.C9050b;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.File;
import me0.AbstractC23020b3;
import me0.AbstractC23238v2;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import p363nh.C23750d;
import pj0.InterfaceC24791q;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zinstant.d1 */
/* loaded from: classes.dex */
public final class C17141d1 implements InterfaceC24791q {

    /* renamed from: a */
    private final Object f87635a = new Object();

    /* renamed from: b */
    private C9050b f87636b;

    /* renamed from: c */
    private final InterfaceC24854k f87637c;

    /* renamed from: com.zing.zalo.zinstant.d1$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f87638q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context mo12V4() {
            Context m91742a = AbstractC17158i1.m91742a();
            if (m91742a == null) {
                return MainApplication.Companion.m35500c();
            }
            return m91742a;
        }
    }

    public C17141d1() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f87638q);
        this.f87637c = m129210a;
    }

    /* renamed from: j */
    private final String m91645j(String str) {
        File file = new File(m91658i().getNoBackupFilesDir(), "/zinstant/leveldb-prefs/" + str + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String path = file.getPath();
        AbstractC19074t.m100207e(path, "getPath(...)");
        return path;
    }

    /* renamed from: k */
    private final String m91646k(String str) {
        boolean m127128x;
        m127128x = AbstractC24341v.m127128x(str);
        if (m127128x) {
            return str;
        }
        String m122788d = AbstractC23352g.m122788d(m91647l() + str);
        AbstractC19074t.m100207e(m122788d, "md5(...)");
        return m122788d;
    }

    /* renamed from: l */
    private final String m91647l() {
        String uuid = AbstractC23020b3.m118021b(m91658i()).toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
        return uuid;
    }

    /* renamed from: m */
    private final void m91648m(Throwable th2) {
        AbstractC20110a.f98889a.mo104552e(th2);
    }

    /* renamed from: o */
    private final void m91649o() {
        boolean m127128x;
        boolean m127128x2;
        if (this.f87636b == null) {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                synchronized (this.f87635a) {
                    if (this.f87636b == null) {
                        String str2 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str2, "currentUserUid");
                        String m91646k = m91646k(str2);
                        m127128x2 = AbstractC24341v.m127128x(m91646k);
                        if (m127128x2) {
                            this.f87636b = null;
                            return;
                        }
                        String m91645j = m91645j(m91646k);
                        try {
                            this.f87636b = C9050b.m48455n(m91646k, m91645j);
                        } catch (Exception e11) {
                            if ((e11 instanceof LevelDBIOException) && !((LevelDBIOException) e11).isLockByPid() && AbstractC23238v2.m119722g(m91645j) < 512000) {
                                MainApplication.C6895a c6895a = MainApplication.Companion;
                                C23750d c23750d = new C23750d(c6895a.m35500c());
                                c23750d.m124165v0("other");
                                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo).m6870W(c6895a.m35500c().getText(AbstractC8020f0.str_error_full_sdcard_more_descriptive)).mo6894v(c6895a.m35500c().getText(AbstractC8020f0.str_error_full_sdcard_more_descriptive)).m6892t("").mo6860M(false).mo6895w(c6895a.m35500c().getText(AbstractC8020f0.app_name));
                                c23750d.m124147b0();
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: a */
    public long mo91650a(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                return c9050b.mo48440a(str);
            }
            return j11;
        } catch (Throwable th2) {
            m91648m(th2);
            return j11;
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: b */
    public String mo91651b(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "defaultValue");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                String mo48444e = c9050b.mo48444e(str);
                if (mo48444e != null) {
                    return mo48444e;
                }
                return str2;
            }
            return str2;
        } catch (Throwable th2) {
            m91648m(th2);
            return str2;
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: c */
    public void mo91652c(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                c9050b.mo48447h(str, j11);
            }
        } catch (Throwable th2) {
            m91648m(th2);
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: d */
    public boolean mo91653d(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                return c9050b.mo48446g(str);
            }
            return z11;
        } catch (Throwable th2) {
            m91648m(th2);
            return z11;
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: e */
    public void mo91654e(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "value");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                c9050b.mo48442c(str, str2);
            }
        } catch (Throwable th2) {
            m91648m(th2);
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: f */
    public void mo91655f(String str) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                c9050b.m48468v(str);
            }
        } catch (Throwable th2) {
            m91648m(th2);
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: g */
    public boolean mo91656g(String str) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b == null) {
                return false;
            }
            return c9050b.mo48445f(str);
        } catch (Throwable th2) {
            m91648m(th2);
            return false;
        }
    }

    @Override // pj0.InterfaceC24791q
    /* renamed from: h */
    public void mo91657h(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        try {
            m91649o();
            C9050b c9050b = this.f87636b;
            if (c9050b != null) {
                c9050b.mo48448i(str, z11);
            }
        } catch (Throwable th2) {
            m91648m(th2);
        }
    }

    /* renamed from: i */
    public final Context m91658i() {
        return (Context) this.f87637c.getValue();
    }

    /* renamed from: n */
    public final void m91659n() {
        this.f87636b = null;
    }
}

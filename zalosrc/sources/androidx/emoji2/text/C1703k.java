package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.AbstractC1432p;
import androidx.core.os.AbstractC1452r;
import androidx.core.provider.AbstractC1460g;
import androidx.core.provider.C1458e;
import androidx.core.util.AbstractC1487i;
import androidx.emoji2.text.C1698f;
import androidx.emoji2.text.C1703k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.k */
/* loaded from: classes2.dex */
public class C1703k extends C1698f.c {

    /* renamed from: k */
    private static final a f6872k = new a();

    /* renamed from: androidx.emoji2.text.k$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        public Typeface m8728a(Context context, AbstractC1460g.b bVar) {
            return AbstractC1460g.m7402a(context, null, new AbstractC1460g.b[]{bVar});
        }

        /* renamed from: b */
        public AbstractC1460g.a m8729b(Context context, C1458e c1458e) {
            return AbstractC1460g.m7403b(context, null, c1458e);
        }

        /* renamed from: c */
        public void m8730c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.k$b */
    /* loaded from: classes2.dex */
    public static class b implements C1698f.h {

        /* renamed from: a */
        private final Context f6873a;

        /* renamed from: b */
        private final C1458e f6874b;

        /* renamed from: c */
        private final a f6875c;

        /* renamed from: d */
        private final Object f6876d = new Object();

        /* renamed from: e */
        private Handler f6877e;

        /* renamed from: f */
        private Executor f6878f;

        /* renamed from: g */
        private ThreadPoolExecutor f6879g;

        /* renamed from: h */
        C1698f.i f6880h;

        /* renamed from: i */
        private ContentObserver f6881i;

        /* renamed from: j */
        private Runnable f6882j;

        b(Context context, C1458e c1458e, a aVar) {
            AbstractC1487i.m7493h(context, "Context cannot be null");
            AbstractC1487i.m7493h(c1458e, "FontRequest cannot be null");
            this.f6873a = context.getApplicationContext();
            this.f6874b = c1458e;
            this.f6875c = aVar;
        }

        /* renamed from: b */
        private void m8731b() {
            synchronized (this.f6876d) {
                try {
                    this.f6880h = null;
                    ContentObserver contentObserver = this.f6881i;
                    if (contentObserver != null) {
                        this.f6875c.m8730c(this.f6873a, contentObserver);
                        this.f6881i = null;
                    }
                    Handler handler = this.f6877e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f6882j);
                    }
                    this.f6877e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f6879g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f6878f = null;
                    this.f6879g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: e */
        private AbstractC1460g.b m8732e() {
            try {
                AbstractC1460g.a m8729b = this.f6875c.m8729b(this.f6873a, this.f6874b);
                if (m8729b.m7407c() == 0) {
                    AbstractC1460g.b[] m7406b = m8729b.m7406b();
                    if (m7406b != null && m7406b.length != 0) {
                        return m7406b[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + m8729b.m7407c() + ")");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("provider not found", e11);
            }
        }

        @Override // androidx.emoji2.text.C1698f.h
        /* renamed from: a */
        public void mo8653a(C1698f.i iVar) {
            AbstractC1487i.m7493h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f6876d) {
                this.f6880h = iVar;
            }
            m8734d();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m8733c() {
            synchronized (this.f6876d) {
                try {
                    if (this.f6880h == null) {
                        return;
                    }
                    try {
                        AbstractC1460g.b m8732e = m8732e();
                        int m7409b = m8732e.m7409b();
                        if (m7409b == 2) {
                            synchronized (this.f6876d) {
                            }
                        }
                        if (m7409b == 0) {
                            try {
                                AbstractC1452r.m7366a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                Typeface m8728a = this.f6875c.m8728a(this.f6873a, m8732e);
                                ByteBuffer m7305f = AbstractC1432p.m7305f(this.f6873a, null, m8732e.m7411d());
                                if (m7305f != null && m8728a != null) {
                                    C1706n m8745b = C1706n.m8745b(m8728a, m7305f);
                                    AbstractC1452r.m7367b();
                                    synchronized (this.f6876d) {
                                        try {
                                            C1698f.i iVar = this.f6880h;
                                            if (iVar != null) {
                                                iVar.mo8656b(m8745b);
                                            }
                                        } finally {
                                        }
                                    }
                                    m8731b();
                                    return;
                                }
                                throw new RuntimeException("Unable to open file.");
                            } catch (Throwable th2) {
                                AbstractC1452r.m7367b();
                                throw th2;
                            }
                        }
                        throw new RuntimeException("fetchFonts result is not OK. (" + m7409b + ")");
                    } catch (Throwable th3) {
                        synchronized (this.f6876d) {
                            try {
                                C1698f.i iVar2 = this.f6880h;
                                if (iVar2 != null) {
                                    iVar2.mo8655a(th3);
                                }
                                m8731b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        /* renamed from: d */
        void m8734d() {
            synchronized (this.f6876d) {
                try {
                    if (this.f6880h == null) {
                        return;
                    }
                    if (this.f6878f == null) {
                        ThreadPoolExecutor m8659b = AbstractC1695c.m8659b("emojiCompat");
                        this.f6879g = m8659b;
                        this.f6878f = m8659b;
                    }
                    this.f6878f.execute(new Runnable() { // from class: androidx.emoji2.text.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1703k.b.this.m8733c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: f */
        public void m8735f(Executor executor) {
            synchronized (this.f6876d) {
                this.f6878f = executor;
            }
        }
    }

    public C1703k(Context context, C1458e c1458e) {
        super(new b(context, c1458e, f6872k));
    }

    /* renamed from: g */
    public C1703k m8727g(Executor executor) {
        ((b) m8697a()).m8735f(executor);
        return this;
    }
}

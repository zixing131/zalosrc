package p147f2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.io.File;
import java.util.UUID;
import p119e2.C18177b;
import p119e2.C18179d;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;
import p147f2.C18698d;
import p177g2.C19204a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: f2.d */
/* loaded from: classes.dex */
public final class C18698d implements InterfaceC18183h {

    /* renamed from: w */
    public static final a f93927w = new a(null);

    /* renamed from: p */
    private final Context f93928p;

    /* renamed from: q */
    private final String f93929q;

    /* renamed from: r */
    private final InterfaceC18183h.a f93930r;

    /* renamed from: s */
    private final boolean f93931s;

    /* renamed from: t */
    private final boolean f93932t;

    /* renamed from: u */
    private final InterfaceC24854k f93933u;

    /* renamed from: v */
    private boolean f93934v;

    /* renamed from: f2.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private C18697c f93935a;

        public b(C18697c c18697c) {
            this.f93935a = c18697c;
        }

        /* renamed from: a */
        public final C18697c m98614a() {
            return this.f93935a;
        }

        /* renamed from: b */
        public final void m98615b(C18697c c18697c) {
            this.f93935a = c18697c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f2.d$c */
    /* loaded from: classes.dex */
    public static final class c extends SQLiteOpenHelper {

        /* renamed from: w */
        public static final C32820c f93936w = new C32820c(null);

        /* renamed from: p */
        private final Context f93937p;

        /* renamed from: q */
        private final b f93938q;

        /* renamed from: r */
        private final InterfaceC18183h.a f93939r;

        /* renamed from: s */
        private final boolean f93940s;

        /* renamed from: t */
        private boolean f93941t;

        /* renamed from: u */
        private final C19204a f93942u;

        /* renamed from: v */
        private boolean f93943v;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f2.d$c$a */
        /* loaded from: classes.dex */
        public static final class a extends RuntimeException {

            /* renamed from: p */
            private final b f93944p;

            /* renamed from: q */
            private final Throwable f93945q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th2) {
                super(th2);
                AbstractC19074t.m100208f(bVar, "callbackName");
                AbstractC19074t.m100208f(th2, "cause");
                this.f93944p = bVar;
                this.f93945q = th2;
            }

            /* renamed from: a */
            public final b m98622a() {
                return this.f93944p;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f93945q;
            }
        }

        /* renamed from: f2.d$c$b */
        /* loaded from: classes2.dex */
        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: f2.d$c$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32820c {
            private C32820c() {
            }

            public /* synthetic */ C32820c(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final C18697c m98624a(b bVar, SQLiteDatabase sQLiteDatabase) {
                AbstractC19074t.m100208f(bVar, "refHolder");
                AbstractC19074t.m100208f(sQLiteDatabase, "sqLiteDatabase");
                C18697c m98614a = bVar.m98614a();
                if (m98614a == null || !m98614a.m98605c(sQLiteDatabase)) {
                    C18697c c18697c = new C18697c(sQLiteDatabase);
                    bVar.m98615b(c18697c);
                    return c18697c;
                }
                return m98614a;
            }
        }

        /* renamed from: f2.d$c$d */
        /* loaded from: classes2.dex */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f93952a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f93952a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b bVar, final InterfaceC18183h.a aVar, boolean z11) {
            super(context, str, null, aVar.f92343a, new DatabaseErrorHandler() { // from class: f2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C18698d.c.m98617b(InterfaceC18183h.a.this, bVar, sQLiteDatabase);
                }
            });
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(bVar, "dbRef");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f93937p = context;
            this.f93938q = bVar;
            this.f93939r = aVar;
            this.f93940s = z11;
            if (str == null) {
                str = UUID.randomUUID().toString();
                AbstractC19074t.m100207e(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            AbstractC19074t.m100207e(cacheDir, "context.cacheDir");
            this.f93942u = new C19204a(str, cacheDir, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m98617b(InterfaceC18183h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(aVar, "$callback");
            AbstractC19074t.m100208f(bVar, "$dbRef");
            C32820c c32820c = f93936w;
            AbstractC19074t.m100207e(sQLiteDatabase, "dbObj");
            aVar.m96927c(c32820c.m98624a(bVar, sQLiteDatabase));
        }

        /* renamed from: f */
        private final SQLiteDatabase m98618f(boolean z11) {
            if (z11) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                AbstractC19074t.m100207e(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            AbstractC19074t.m100207e(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        /* renamed from: h */
        private final SQLiteDatabase m98619h(boolean z11) {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f93937p.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid database parent file, not a directory: ");
                    sb2.append(parentFile);
                }
            }
            try {
                return m98618f(z11);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return m98618f(z11);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i11 = d.f93952a[aVar.m98622a().ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3) {
                                    if (i11 != 4) {
                                        if (!(cause instanceof SQLiteException)) {
                                            throw cause;
                                        }
                                    } else {
                                        throw cause;
                                    }
                                } else {
                                    throw cause;
                                }
                            } else {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else if (th2 instanceof SQLiteException) {
                        if (databaseName == null || !this.f93940s) {
                            throw th2;
                        }
                    } else {
                        throw th2;
                    }
                    this.f93937p.deleteDatabase(databaseName);
                    try {
                        return m98618f(z11);
                    } catch (a e11) {
                        throw e11.getCause();
                    }
                }
            }
        }

        /* renamed from: c */
        public final InterfaceC18182g m98620c(boolean z11) {
            boolean z12;
            try {
                C19204a c19204a = this.f93942u;
                if (!this.f93943v && getDatabaseName() != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c19204a.m100668b(z12);
                this.f93941t = false;
                SQLiteDatabase m98619h = m98619h(z11);
                if (this.f93941t) {
                    close();
                    InterfaceC18182g m98620c = m98620c(z11);
                    this.f93942u.m100669d();
                    return m98620c;
                }
                C18697c m98621d = m98621d(m98619h);
                this.f93942u.m100669d();
                return m98621d;
            } catch (Throwable th2) {
                this.f93942u.m100669d();
                throw th2;
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                C19204a.m100667c(this.f93942u, false, 1, null);
                super.close();
                this.f93938q.m98615b(null);
                this.f93943v = false;
            } finally {
                this.f93942u.m100669d();
            }
        }

        /* renamed from: d */
        public final C18697c m98621d(SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(sQLiteDatabase, "sqLiteDatabase");
            return f93936w.m98624a(this.f93938q, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(sQLiteDatabase, "db");
            try {
                this.f93939r.mo387b(m98621d(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f93939r.mo388d(m98621d(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            AbstractC19074t.m100208f(sQLiteDatabase, "db");
            this.f93941t = true;
            try {
                this.f93939r.mo389e(m98621d(sQLiteDatabase), i11, i12);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            AbstractC19074t.m100208f(sQLiteDatabase, "db");
            if (!this.f93941t) {
                try {
                    this.f93939r.mo390f(m98621d(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f93943v = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
            AbstractC19074t.m100208f(sQLiteDatabase, "sqLiteDatabase");
            this.f93941t = true;
            try {
                this.f93939r.mo391g(m98621d(sQLiteDatabase), i11, i12);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: f2.d$d */
    /* loaded from: classes.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c mo12V4() {
            c cVar;
            if (Build.VERSION.SDK_INT >= 23 && C18698d.this.f93929q != null && C18698d.this.f93931s) {
                cVar = new c(C18698d.this.f93928p, new File(C18179d.m96922a(C18698d.this.f93928p), C18698d.this.f93929q).getAbsolutePath(), new b(null), C18698d.this.f93930r, C18698d.this.f93932t);
            } else {
                cVar = new c(C18698d.this.f93928p, C18698d.this.f93929q, new b(null), C18698d.this.f93930r, C18698d.this.f93932t);
            }
            C18177b.m96919f(cVar, C18698d.this.f93934v);
            return cVar;
        }
    }

    public C18698d(Context context, String str, InterfaceC18183h.a aVar, boolean z11, boolean z12) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "callback");
        this.f93928p = context;
        this.f93929q = str;
        this.f93930r = aVar;
        this.f93931s = z11;
        this.f93932t = z12;
        m129210a = AbstractC24856m.m129210a(new d());
        this.f93933u = m129210a;
    }

    /* renamed from: i */
    private final c m98613i() {
        return (c) this.f93933u.getValue();
    }

    @Override // p119e2.InterfaceC18183h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f93933u.mo9375b()) {
            m98613i().close();
        }
    }

    @Override // p119e2.InterfaceC18183h
    public String getDatabaseName() {
        return this.f93929q;
    }

    @Override // p119e2.InterfaceC18183h
    /* renamed from: p0 */
    public InterfaceC18182g mo187p0() {
        return m98613i().m98620c(true);
    }

    @Override // p119e2.InterfaceC18183h
    public void setWriteAheadLoggingEnabled(boolean z11) {
        if (this.f93933u.mo9375b()) {
            C18177b.m96919f(m98613i(), z11);
        }
        this.f93934v = z11;
    }
}

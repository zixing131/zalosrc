package p119e2;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Pair;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24341v;

/* renamed from: e2.h */
/* loaded from: classes.dex */
public interface InterfaceC18183h extends Closeable {

    /* renamed from: e2.h$a */
    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: b */
        public static final C32812a f92342b = new C32812a(null);

        /* renamed from: a */
        public final int f92343a;

        /* renamed from: e2.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32812a {
            private C32812a() {
            }

            public /* synthetic */ C32812a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public a(int i11) {
            this.f92343a = i11;
        }

        /* renamed from: a */
        private final void m96926a(String str) {
            boolean m127126v;
            int i11;
            boolean z11;
            m127126v = AbstractC24341v.m127126v(str, ":memory:", true);
            if (!m127126v) {
                int length = str.length() - 1;
                int i12 = 0;
                boolean z12 = false;
                while (i12 <= length) {
                    if (!z12) {
                        i11 = i12;
                    } else {
                        i11 = length;
                    }
                    if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z12) {
                        if (!z11) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i12, length + 1).toString().length() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("deleting the database file: ");
                    sb2.append(str);
                    try {
                        C18177b.m96916c(new File(str));
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo387b(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
        }

        /* renamed from: c */
        public void m96927c(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Corruption reported by sqlite on database: ");
            sb2.append(interfaceC18182g);
            sb2.append(".path");
            if (!interfaceC18182g.isOpen()) {
                String mo198m = interfaceC18182g.mo198m();
                if (mo198m != null) {
                    m96926a(mo198m);
                    return;
                }
                return;
            }
            List list = null;
            try {
                try {
                    list = interfaceC18182g.mo195g();
                } finally {
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            AbstractC19074t.m100207e(obj, "p.second");
                            m96926a((String) obj);
                        }
                    } else {
                        String mo198m2 = interfaceC18182g.mo198m();
                        if (mo198m2 != null) {
                            m96926a(mo198m2);
                        }
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                interfaceC18182g.close();
            } catch (IOException unused2) {
            }
        }

        /* renamed from: d */
        public abstract void mo388d(InterfaceC18182g interfaceC18182g);

        /* renamed from: e */
        public abstract void mo389e(InterfaceC18182g interfaceC18182g, int i11, int i12);

        /* renamed from: f */
        public void mo390f(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
        }

        /* renamed from: g */
        public abstract void mo391g(InterfaceC18182g interfaceC18182g, int i11, int i12);
    }

    /* renamed from: e2.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f */
        public static final C32813b f92344f = new C32813b(null);

        /* renamed from: a */
        public final Context f92345a;

        /* renamed from: b */
        public final String f92346b;

        /* renamed from: c */
        public final a f92347c;

        /* renamed from: d */
        public final boolean f92348d;

        /* renamed from: e */
        public final boolean f92349e;

        /* renamed from: e2.h$b$a */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private final Context f92350a;

            /* renamed from: b */
            private String f92351b;

            /* renamed from: c */
            private a f92352c;

            /* renamed from: d */
            private boolean f92353d;

            /* renamed from: e */
            private boolean f92354e;

            public a(Context context) {
                AbstractC19074t.m100208f(context, "context");
                this.f92350a = context;
            }

            /* renamed from: a */
            public a m96929a(boolean z11) {
                this.f92354e = z11;
                return this;
            }

            /* renamed from: b */
            public b m96930b() {
                String str;
                a aVar = this.f92352c;
                if (aVar != null) {
                    if (this.f92353d && ((str = this.f92351b) == null || str.length() == 0)) {
                        throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                    }
                    return new b(this.f92350a, this.f92351b, aVar, this.f92353d, this.f92354e);
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
            }

            /* renamed from: c */
            public a m96931c(a aVar) {
                AbstractC19074t.m100208f(aVar, "callback");
                this.f92352c = aVar;
                return this;
            }

            /* renamed from: d */
            public a m96932d(String str) {
                this.f92351b = str;
                return this;
            }

            /* renamed from: e */
            public a m96933e(boolean z11) {
                this.f92353d = z11;
                return this;
            }
        }

        /* renamed from: e2.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32813b {
            private C32813b() {
            }

            public /* synthetic */ C32813b(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final a m96934a(Context context) {
                AbstractC19074t.m100208f(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a aVar, boolean z11, boolean z12) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f92345a = context;
            this.f92346b = str;
            this.f92347c = aVar;
            this.f92348d = z11;
            this.f92349e = z12;
        }

        /* renamed from: a */
        public static final a m96928a(Context context) {
            return f92344f.m96934a(context);
        }
    }

    /* renamed from: e2.h$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        InterfaceC18183h mo232a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    /* renamed from: p0 */
    InterfaceC18182g mo187p0();

    void setWriteAheadLoggingEnabled(boolean z11);
}

package p008a2;

import android.database.Cursor;
import bn0.AbstractC2933b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import p028b2.AbstractC2494c;
import p119e2.C18176a;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;

/* renamed from: a2.y */
/* loaded from: classes.dex */
public class C0088y extends InterfaceC18183h.a {

    /* renamed from: g */
    public static final a f412g = new a(null);

    /* renamed from: c */
    private C0069h f413c;

    /* renamed from: d */
    private final b f414d;

    /* renamed from: e */
    private final String f415e;

    /* renamed from: f */
    private final String f416f;

    /* renamed from: a2.y$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m392a(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
            Cursor mo200q0 = interfaceC18182g.mo200q0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z11 = false;
                if (mo200q0.moveToFirst()) {
                    if (mo200q0.getInt(0) == 0) {
                        z11 = true;
                    }
                }
                AbstractC2933b.m13890a(mo200q0, null);
                return z11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(mo200q0, th2);
                    throw th3;
                }
            }
        }

        /* renamed from: b */
        public final boolean m393b(InterfaceC18182g interfaceC18182g) {
            AbstractC19074t.m100208f(interfaceC18182g, "db");
            Cursor mo200q0 = interfaceC18182g.mo200q0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z11 = false;
                if (mo200q0.moveToFirst()) {
                    if (mo200q0.getInt(0) != 0) {
                        z11 = true;
                    }
                }
                AbstractC2933b.m13890a(mo200q0, null);
                return z11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(mo200q0, th2);
                    throw th3;
                }
            }
        }
    }

    /* renamed from: a2.y$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        public final int f417a;

        public b(int i11) {
            this.f417a = i11;
        }

        /* renamed from: a */
        public abstract void mo394a(InterfaceC18182g interfaceC18182g);

        /* renamed from: b */
        public abstract void mo395b(InterfaceC18182g interfaceC18182g);

        /* renamed from: c */
        public abstract void mo396c(InterfaceC18182g interfaceC18182g);

        /* renamed from: d */
        public abstract void mo397d(InterfaceC18182g interfaceC18182g);

        /* renamed from: e */
        public abstract void mo398e(InterfaceC18182g interfaceC18182g);

        /* renamed from: f */
        public abstract void mo399f(InterfaceC18182g interfaceC18182g);

        /* renamed from: g */
        public abstract c mo400g(InterfaceC18182g interfaceC18182g);
    }

    /* renamed from: a2.y$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        public final boolean f418a;

        /* renamed from: b */
        public final String f419b;

        public c(boolean z11, String str) {
            this.f418a = z11;
            this.f419b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088y(C0069h c0069h, b bVar, String str, String str2) {
        super(bVar.f417a);
        AbstractC19074t.m100208f(c0069h, "configuration");
        AbstractC19074t.m100208f(bVar, "delegate");
        AbstractC19074t.m100208f(str, "identityHash");
        AbstractC19074t.m100208f(str2, "legacyHash");
        this.f413c = c0069h;
        this.f414d = bVar;
        this.f415e = str;
        this.f416f = str2;
    }

    /* renamed from: h */
    private final void m384h(InterfaceC18182g interfaceC18182g) {
        String str;
        if (f412g.m393b(interfaceC18182g)) {
            Cursor mo188B0 = interfaceC18182g.mo188B0(new C18176a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (mo188B0.moveToFirst()) {
                    str = mo188B0.getString(0);
                } else {
                    str = null;
                }
                AbstractC2933b.m13890a(mo188B0, null);
                if (!AbstractC19074t.m100204b(this.f415e, str) && !AbstractC19074t.m100204b(this.f416f, str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.f415e + ", found: " + str);
                }
                return;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC2933b.m13890a(mo188B0, th2);
                    throw th3;
                }
            }
        }
        c mo400g = this.f414d.mo400g(interfaceC18182g);
        if (mo400g.f418a) {
            this.f414d.mo398e(interfaceC18182g);
            m386j(interfaceC18182g);
        } else {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo400g.f419b);
        }
    }

    /* renamed from: i */
    private final void m385i(InterfaceC18182g interfaceC18182g) {
        interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private final void m386j(InterfaceC18182g interfaceC18182g) {
        m385i(interfaceC18182g);
        interfaceC18182g.mo201u(C0087x.m383a(this.f415e));
    }

    @Override // p119e2.InterfaceC18183h.a
    /* renamed from: b */
    public void mo387b(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        super.mo387b(interfaceC18182g);
    }

    @Override // p119e2.InterfaceC18183h.a
    /* renamed from: d */
    public void mo388d(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        boolean m392a = f412g.m392a(interfaceC18182g);
        this.f414d.mo394a(interfaceC18182g);
        if (!m392a) {
            c mo400g = this.f414d.mo400g(interfaceC18182g);
            if (!mo400g.f418a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + mo400g.f419b);
            }
        }
        m386j(interfaceC18182g);
        this.f414d.mo396c(interfaceC18182g);
    }

    @Override // p119e2.InterfaceC18183h.a
    /* renamed from: e */
    public void mo389e(InterfaceC18182g interfaceC18182g, int i11, int i12) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        mo391g(interfaceC18182g, i11, i12);
    }

    @Override // p119e2.InterfaceC18183h.a
    /* renamed from: f */
    public void mo390f(InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        super.mo390f(interfaceC18182g);
        m384h(interfaceC18182g);
        this.f414d.mo397d(interfaceC18182g);
        this.f413c = null;
    }

    @Override // p119e2.InterfaceC18183h.a
    /* renamed from: g */
    public void mo391g(InterfaceC18182g interfaceC18182g, int i11, int i12) {
        List m379d;
        AbstractC19074t.m100208f(interfaceC18182g, "db");
        C0069h c0069h = this.f413c;
        if (c0069h != null && (m379d = c0069h.f287d.m379d(i11, i12)) != null) {
            this.f414d.mo399f(interfaceC18182g);
            Iterator it = m379d.iterator();
            while (it.hasNext()) {
                ((AbstractC2494c) it.next()).mo11714a(interfaceC18182g);
            }
            c mo400g = this.f414d.mo400g(interfaceC18182g);
            if (mo400g.f418a) {
                this.f414d.mo398e(interfaceC18182g);
                m386j(interfaceC18182g);
                return;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + mo400g.f419b);
            }
        }
        C0069h c0069h2 = this.f413c;
        if (c0069h2 != null && !c0069h2.m255a(i11, i12)) {
            this.f414d.mo395b(interfaceC18182g);
            this.f414d.mo394a(interfaceC18182g);
            return;
        }
        throw new IllegalStateException("A migration from " + i11 + " to " + i12 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}

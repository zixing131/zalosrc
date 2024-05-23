package p228i4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.t0 */
/* loaded from: classes.dex */
public final class C20263t0 extends SQLiteOpenHelper {

    /* renamed from: r */
    private static final String f100153r = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: s */
    static int f100154s = 5;

    /* renamed from: t */
    private static final a f100155t;

    /* renamed from: u */
    private static final a f100156u;

    /* renamed from: v */
    private static final a f100157v;

    /* renamed from: w */
    private static final a f100158w;

    /* renamed from: x */
    private static final a f100159x;

    /* renamed from: y */
    private static final List f100160y;

    /* renamed from: p */
    private final int f100161p;

    /* renamed from: q */
    private boolean f100162q;

    /* renamed from: i4.t0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo105826a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: i4.o0
            @Override // p228i4.C20263t0.a
            /* renamed from: a */
            public final void mo105826a(SQLiteDatabase sQLiteDatabase) {
                C20263t0.m105833i(sQLiteDatabase);
            }
        };
        f100155t = aVar;
        a aVar2 = new a() { // from class: i4.p0
            @Override // p228i4.C20263t0.a
            /* renamed from: a */
            public final void mo105826a(SQLiteDatabase sQLiteDatabase) {
                C20263t0.m105834o(sQLiteDatabase);
            }
        };
        f100156u = aVar2;
        a aVar3 = new a() { // from class: i4.q0
            @Override // p228i4.C20263t0.a
            /* renamed from: a */
            public final void mo105826a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f100157v = aVar3;
        a aVar4 = new a() { // from class: i4.r0
            @Override // p228i4.C20263t0.a
            /* renamed from: a */
            public final void mo105826a(SQLiteDatabase sQLiteDatabase) {
                C20263t0.m105836r(sQLiteDatabase);
            }
        };
        f100158w = aVar4;
        a aVar5 = new a() { // from class: i4.s0
            @Override // p228i4.C20263t0.a
            /* renamed from: a */
            public final void mo105826a(SQLiteDatabase sQLiteDatabase) {
                C20263t0.m105837s(sQLiteDatabase);
            }
        };
        f100159x = aVar5;
        f100160y = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20263t0(Context context, String str, int i11) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i11);
        this.f100162q = false;
        this.f100161p = i11;
    }

    /* renamed from: h */
    private void m105832h(SQLiteDatabase sQLiteDatabase) {
        if (!this.f100162q) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m105833i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static /* synthetic */ void m105834o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m105836r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m105837s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f100153r);
    }

    /* renamed from: t */
    private void m105838t(SQLiteDatabase sQLiteDatabase, int i11) {
        m105832h(sQLiteDatabase);
        m105839v(sQLiteDatabase, 0, i11);
    }

    /* renamed from: v */
    private void m105839v(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        List list = f100160y;
        if (i12 <= list.size()) {
            while (i11 < i12) {
                ((a) f100160y.get(i11)).mo105826a(sQLiteDatabase);
                i11++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i11 + " to " + i12 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f100162q = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m105838t(sQLiteDatabase, this.f100161p);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m105838t(sQLiteDatabase, i12);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m105832h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        m105832h(sQLiteDatabase);
        m105839v(sQLiteDatabase, i11, i12);
    }
}

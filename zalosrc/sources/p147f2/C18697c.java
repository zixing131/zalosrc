package p147f2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.List;
import p119e2.C18176a;
import p119e2.C18177b;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18185j;
import p119e2.InterfaceC18186k;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public final class C18697c implements InterfaceC18182g {

    /* renamed from: r */
    public static final a f93921r = new a(null);

    /* renamed from: s */
    private static final String[] f93922s = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: t */
    private static final String[] f93923t = new String[0];

    /* renamed from: p */
    private final SQLiteDatabase f93924p;

    /* renamed from: q */
    private final List f93925q;

    /* renamed from: f2.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: f2.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18185j f93926q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18185j interfaceC18185j) {
            super(4);
            this.f93926q = interfaceC18185j;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: a */
        public final SQLiteCursor mo49340Uc(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            InterfaceC18185j interfaceC18185j = this.f93926q;
            AbstractC19074t.m100205c(sQLiteQuery);
            interfaceC18185j.mo403b(new C18701g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C18697c(SQLiteDatabase sQLiteDatabase) {
        AbstractC19074t.m100208f(sQLiteDatabase, "delegate");
        this.f93924p = sQLiteDatabase;
        this.f93925q = sQLiteDatabase.getAttachedDbs();
    }

    /* renamed from: d */
    public static final Cursor m98603d(InterfaceC18511r interfaceC18511r, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC19074t.m100208f(interfaceC18511r, "$tmp0");
        return (Cursor) interfaceC18511r.mo49340Uc(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* renamed from: f */
    public static final Cursor m98604f(InterfaceC18185j interfaceC18185j, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AbstractC19074t.m100208f(interfaceC18185j, "$query");
        AbstractC19074t.m100205c(sQLiteQuery);
        interfaceC18185j.mo403b(new C18701g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: B0 */
    public Cursor mo188B0(InterfaceC18185j interfaceC18185j) {
        AbstractC19074t.m100208f(interfaceC18185j, "query");
        Cursor rawQueryWithFactory = this.f93924p.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: f2.b
            public /* synthetic */ C18696b() {
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m98603d;
                m98603d = C18697c.m98603d(InterfaceC18511r.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return m98603d;
            }
        }, interfaceC18185j.mo402a(), f93923t, null);
        AbstractC19074t.m100207e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: C */
    public void mo189C(String str, Object[] objArr) {
        AbstractC19074t.m100208f(str, "sql");
        AbstractC19074t.m100208f(objArr, "bindArgs");
        this.f93924p.execSQL(str, objArr);
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: D */
    public void mo190D() {
        this.f93924p.beginTransactionNonExclusive();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: H */
    public Cursor mo191H(InterfaceC18185j interfaceC18185j, CancellationSignal cancellationSignal) {
        AbstractC19074t.m100208f(interfaceC18185j, "query");
        SQLiteDatabase sQLiteDatabase = this.f93924p;
        String mo402a = interfaceC18185j.mo402a();
        String[] strArr = f93923t;
        AbstractC19074t.m100205c(cancellationSignal);
        return C18177b.m96918e(sQLiteDatabase, mo402a, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: f2.a
            public /* synthetic */ C18695a() {
            }

            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor m98604f;
                m98604f = C18697c.m98604f(InterfaceC18185j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return m98604f;
            }
        });
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: b0 */
    public InterfaceC18186k mo193b0(String str) {
        AbstractC19074t.m100208f(str, "sql");
        SQLiteStatement compileStatement = this.f93924p.compileStatement(str);
        AbstractC19074t.m100207e(compileStatement, "delegate.compileStatement(sql)");
        return new C18702h(compileStatement);
    }

    /* renamed from: c */
    public final boolean m98605c(SQLiteDatabase sQLiteDatabase) {
        AbstractC19074t.m100208f(sQLiteDatabase, "sqLiteDatabase");
        return AbstractC19074t.m100204b(this.f93924p, sQLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f93924p.close();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: e */
    public void mo194e() {
        this.f93924p.beginTransaction();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: g */
    public List mo195g() {
        return this.f93925q;
    }

    @Override // p119e2.InterfaceC18182g
    public boolean isOpen() {
        return this.f93924p.isOpen();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: k */
    public void mo196k() {
        this.f93924p.setTransactionSuccessful();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: l */
    public void mo197l() {
        this.f93924p.endTransaction();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: m */
    public String mo198m() {
        return this.f93924p.getPath();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: m0 */
    public int mo199m0(String str, int i11, ContentValues contentValues, String str2, Object[] objArr) {
        int length;
        String str3;
        AbstractC19074t.m100208f(str, "table");
        AbstractC19074t.m100208f(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            if (objArr == null) {
                length = size;
            } else {
                length = objArr.length + size;
            }
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(f93922s[i11]);
            sb2.append(str);
            sb2.append(" SET ");
            int i12 = 0;
            for (String str4 : contentValues.keySet()) {
                if (i12 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(str4);
                objArr2[i12] = contentValues.get(str4);
                sb2.append("=?");
                i12++;
            }
            if (objArr != null) {
                for (int i13 = size; i13 < length; i13++) {
                    objArr2[i13] = objArr[i13 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            AbstractC19074t.m100207e(sb3, "StringBuilder().apply(builderAction).toString()");
            InterfaceC18186k mo193b0 = mo193b0(sb3);
            C18176a.f92334r.m96913b(mo193b0, objArr2);
            return mo193b0.mo223w();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: q0 */
    public Cursor mo200q0(String str) {
        AbstractC19074t.m100208f(str, "query");
        return mo188B0(new C18176a(str));
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: u */
    public void mo201u(String str) {
        AbstractC19074t.m100208f(str, "sql");
        this.f93924p.execSQL(str);
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: v0 */
    public boolean mo202v0() {
        return this.f93924p.inTransaction();
    }

    @Override // p119e2.InterfaceC18182g
    /* renamed from: x0 */
    public boolean mo203x0() {
        return C18177b.m96917d(this.f93924p);
    }
}

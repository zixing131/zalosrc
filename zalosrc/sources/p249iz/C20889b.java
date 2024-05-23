package p249iz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bn0.AbstractC2933b;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p334lz.AbstractC22690b;
import p334lz.AbstractC22691c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: iz.b */
/* loaded from: classes4.dex */
public final class C20889b extends SQLiteOpenHelper implements InterfaceC20888a {

    /* renamed from: A */
    private final int f102633A;

    /* renamed from: p */
    private String f102634p;

    /* renamed from: q */
    private final int f102635q;

    /* renamed from: r */
    private final int f102636r;

    /* renamed from: s */
    private final int f102637s;

    /* renamed from: t */
    private final int f102638t;

    /* renamed from: u */
    private final int f102639u;

    /* renamed from: v */
    private final int f102640v;

    /* renamed from: w */
    private final int f102641w;

    /* renamed from: x */
    private final int f102642x;

    /* renamed from: y */
    private final int f102643y;

    /* renamed from: z */
    private final int f102644z;

    /* renamed from: iz.b$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102645t;

        /* renamed from: v */
        final /* synthetic */ JSONArray f102647v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONArray jSONArray, Continuation continuation) {
            super(2, continuation);
            this.f102647v = jSONArray;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f102647v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:            if (r10.moveToFirst() != false) goto L49;     */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:            r5 = r10.getString(r10.getColumnIndexOrThrow("key_lv0"));        r6 = r10.getString(r10.getColumnIndexOrThrow("value_lv0"));        r7 = r10.getInt(r10.getColumnIndexOrThrow("key_type"));        fn0.AbstractC19074t.m100207e(r6, "value");        r2.put(r5, r3.m109263K(r6, r7));     */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:            r5 = move-exception;     */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:            p334lz.AbstractC22691c.m117366c(r5);     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Cursor rawQuery;
            AbstractC28298d.m142578e();
            if (this.f102645t == 0) {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                SQLiteDatabase readableDatabase = C20889b.this.getReadableDatabase();
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                int length = this.f102647v.length();
                if (length > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        Object obj2 = this.f102647v.get(i11);
                        if (obj2 != null) {
                            String str = (String) obj2;
                            if (i12 > 1) {
                                sb2.append(",");
                            }
                            sb2.append('\'' + str + '\'');
                            if (i12 >= length) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                String str2 = "select * from remote_config_table where key_lv0 in (" + ((Object) sb2) + ") and user_id = '" + C20889b.this.f102634p + '\'';
                AbstractC22691c.m117364a(AbstractC19074t.m100216n("\tSqliteDb#getLv0Keys() ", str2));
                try {
                    rawQuery = readableDatabase.rawQuery(str2, null);
                    C20889b c20889b = C20889b.this;
                    if (rawQuery != null) {
                        try {
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC2933b.m13890a(rawQuery, th2);
                                throw th3;
                            }
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(rawQuery, null);
                } catch (Exception e11) {
                    AbstractC22691c.m117366c(e11);
                }
                AbstractC22691c.m117364a(AbstractC19074t.m100216n("\tSqliteDb#getLv0Keys() result: ", jSONObject));
                AbstractC22691c.m117364a("\tSqliteDb#getLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return jSONObject;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            if (!rawQuery.moveToNext()) {
                C24848g0 c24848g02 = C24848g0.f119245a;
                AbstractC2933b.m13890a(rawQuery, null);
                AbstractC22691c.m117364a(AbstractC19074t.m100216n("\tSqliteDb#getLv0Keys() result: ", jSONObject));
                AbstractC22691c.m117364a("\tSqliteDb#getLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                return jSONObject;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.b$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102648t;

        /* renamed from: v */
        final /* synthetic */ JSONObject f102650v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f102650v = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f102650v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102648t == 0) {
                AbstractC24862s.m129228b(obj);
                C20889b.this.m109262J(this.f102650v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.b$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102651t;

        /* renamed from: v */
        final /* synthetic */ Map f102653v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Map map, Continuation continuation) {
            super(2, continuation);
            this.f102653v = map;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f102653v, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:            return pm0.C24848g0.f119245a;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:            if (r7.isOpen() == false) goto L17;     */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:            p334lz.AbstractC22691c.m117364a("\tSqliteDb#removeAllLv0KeysAndSaveConfig() in " + (java.lang.System.currentTimeMillis() - r0) + " ms");     */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102651t == 0) {
                AbstractC24862s.m129228b(obj);
                long currentTimeMillis = System.currentTimeMillis();
                SQLiteDatabase writableDatabase = C20889b.this.getWritableDatabase();
                try {
                    try {
                        writableDatabase.beginTransaction();
                        C20889b.this.m109264L();
                        C20889b.this.m109267O(this.f102653v);
                        writableDatabase.setTransactionSuccessful();
                    } catch (Exception e11) {
                        AbstractC20887g.m109244v(101014, null, 2, null);
                        AbstractC22691c.m117366c(e11);
                    }
                } finally {
                    if (writableDatabase.isOpen()) {
                        writableDatabase.endTransaction();
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: iz.b$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f102654t;

        /* renamed from: v */
        final /* synthetic */ Map f102656v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Map map, Continuation continuation) {
            super(2, continuation);
            this.f102656v = map;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f102656v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102654t == 0) {
                AbstractC24862s.m129228b(obj);
                C20889b.this.m109266N(this.f102656v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20889b(Context context, String str) {
        super(context, "remote_config", (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "currentUid");
        this.f102634p = str;
        this.f102635q = 1;
        this.f102636r = 2;
        this.f102637s = 3;
        this.f102638t = 4;
        this.f102639u = 5;
        this.f102640v = 6;
        this.f102641w = 7;
        this.f102642x = 8;
        this.f102643y = 9;
        this.f102644z = 10;
        this.f102633A = 11;
    }

    /* renamed from: A */
    private final void m109258A(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("delete from remote_config_table where key_lv0 = '" + str + "' and user_id = '" + this.f102634p + '\'');
    }

    /* renamed from: E */
    private final String m109259E(SQLiteDatabase sQLiteDatabase, List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i11++;
            if (i11 > 1) {
                sb2.append(",");
            }
            sb2.append('\'' + str + '\'');
        }
        String str2 = "delete from remote_config_table where key_lv0 in (" + ((Object) sb2) + ") and user_id = '" + this.f102634p + '\'';
        sQLiteDatabase.execSQL(str2);
        return str2;
    }

    /* renamed from: F */
    private final int m109260F(Object obj) {
        if (obj instanceof Boolean) {
            return this.f102635q;
        }
        if (obj instanceof Byte) {
            return this.f102636r;
        }
        if (obj instanceof Character) {
            return this.f102637s;
        }
        if (obj instanceof Double) {
            return this.f102638t;
        }
        if (obj instanceof Float) {
            return this.f102639u;
        }
        if (obj instanceof Integer) {
            return this.f102640v;
        }
        if (obj instanceof Long) {
            return this.f102641w;
        }
        if (obj instanceof Short) {
            return this.f102642x;
        }
        if (obj instanceof String) {
            return this.f102643y;
        }
        if (obj instanceof JSONArray) {
            return this.f102644z;
        }
        if (obj instanceof JSONObject) {
            return this.f102633A;
        }
        return this.f102643y;
    }

    /* renamed from: G */
    private final void m109261G(SQLiteDatabase sQLiteDatabase, String str, Object obj) {
        if (obj == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("user_id", this.f102634p);
        contentValues.put("key_lv0", str);
        contentValues.put("value_lv0", obj.toString());
        contentValues.put("key_type", Integer.valueOf(m109260F(obj)));
        sQLiteDatabase.insert("remote_config_table", null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:            if (r2.isOpen() != false) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:            r2.endTransaction();     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:            p334lz.AbstractC22691c.m117364a("\tSqliteDb#mergeAndSaveConfig() in " + (java.lang.System.currentTimeMillis() - r0) + " ms");     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:            if (r2.isOpen() == false) goto L58;     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109262J(JSONObject jSONObject) {
        int m127172a0;
        String str;
        String str2;
        Cursor rawQuery;
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            try {
                writableDatabase.beginTransaction();
                Iterator<String> keys = jSONObject.keys();
                AbstractC19074t.m100207e(keys, "customConfig.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj2 = jSONObject.get(next);
                    AbstractC19074t.m100207e(next, "key");
                    m127172a0 = AbstractC24342w.m127172a0(next, '.', 0, false, 6, null);
                    if (m127172a0 > 0) {
                        str = next.substring(0, m127172a0);
                        AbstractC19074t.m100207e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = next;
                    }
                    if (m127172a0 > 0) {
                        str2 = next.substring(m127172a0 + 1);
                        AbstractC19074t.m100207e(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        str2 = "";
                    }
                    try {
                        rawQuery = writableDatabase.rawQuery("select * from remote_config_table where key_lv0 = '" + ((Object) str) + "' and user_id = '" + this.f102634p + '\'', null);
                    } catch (Exception e11) {
                        AbstractC22691c.m117366c(e11);
                    }
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0) {
                                rawQuery.moveToFirst();
                                do {
                                    try {
                                        String string = rawQuery.getString(rawQuery.getColumnIndexOrThrow("key_lv0"));
                                        String string2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("value_lv0"));
                                        int i11 = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("key_type"));
                                        AbstractC19074t.m100207e(string2, "dbValue");
                                        Object m109263K = m109263K(string2, i11);
                                        if (i11 == this.f102633A) {
                                            AbstractC19074t.m100207e(obj2, "value");
                                            obj = AbstractC22690b.m117363f((JSONObject) m109263K, str2, obj2);
                                        } else {
                                            obj = obj2;
                                        }
                                        AbstractC19074t.m100207e(writableDatabase, "db");
                                        AbstractC19074t.m100207e(string, "dbKey");
                                        m109258A(writableDatabase, string);
                                        m109261G(writableDatabase, string, obj);
                                    } catch (Exception e12) {
                                        AbstractC22691c.m117366c(e12);
                                    }
                                } while (rawQuery.moveToNext());
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                AbstractC2933b.m13890a(rawQuery, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                                break;
                            } catch (Throwable th3) {
                                AbstractC2933b.m13890a(rawQuery, th2);
                                throw th3;
                                break;
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(next, obj2);
                    JSONObject m117362e = AbstractC22690b.m117362e(jSONObject2);
                    AbstractC19074t.m100207e(writableDatabase, "db");
                    AbstractC19074t.m100207e(str, "keyLv0");
                    m109261G(writableDatabase, str, m117362e.get(str));
                    C24848g0 c24848g02 = C24848g0.f119245a;
                    AbstractC2933b.m13890a(rawQuery, null);
                }
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e13) {
                AbstractC20887g.m109244v(101020, null, 2, null);
                AbstractC22691c.m117366c(e13);
            }
        } catch (Throwable th4) {
            if (writableDatabase.isOpen()) {
                writableDatabase.endTransaction();
            }
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final Object m109263K(String str, int i11) {
        Object jSONObject;
        char m127210i1;
        if (i11 == this.f102635q) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (i11 == this.f102636r) {
            return Byte.valueOf(Byte.parseByte(str));
        }
        if (i11 == this.f102637s) {
            m127210i1 = AbstractC24344y.m127210i1(str);
            return Character.valueOf(m127210i1);
        }
        if (i11 == this.f102638t) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (i11 == this.f102639u) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (i11 == this.f102640v) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (i11 == this.f102641w) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (i11 == this.f102642x) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (i11 != this.f102643y) {
            if (i11 == this.f102644z) {
                jSONObject = new JSONArray(str);
            } else if (i11 == this.f102633A) {
                jSONObject = new JSONObject(str);
            } else {
                return str;
            }
            return jSONObject;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m109264L() {
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            AbstractC19074t.m100207e(writableDatabase, "db");
            AbstractC22691c.m117364a("\tSqliteDb#removeAllLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms with sql=\"" + m109275y(writableDatabase) + '\"');
        } catch (Exception e11) {
            AbstractC20887g.m109244v(101015, null, 2, null);
            AbstractC22691c.m117366c(e11);
        }
    }

    /* renamed from: M */
    private final void m109265M(List list) {
        if (list.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            AbstractC19074t.m100207e(writableDatabase, "db");
            AbstractC22691c.m117364a("\tSqliteDb#removeLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms with sql=\"" + m109259E(writableDatabase, list) + '\"');
        } catch (Exception e11) {
            AbstractC20887g.m109244v(101018, null, 2, null);
            AbstractC22691c.m117366c(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:            if (r2.isOpen() == false) goto L15;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:            p334lz.AbstractC22691c.m117364a("\tSqliteDb#removeLv0KeysAndSaveConfig() in " + (java.lang.System.currentTimeMillis() - r0) + " ms");     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:            return;     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m109266N(Map map) {
        List m131185M0;
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            try {
                writableDatabase.beginTransaction();
                m131185M0 = AbstractC25332a0.m131185M0(map.keySet());
                m109265M(m131185M0);
                m109267O(map);
                writableDatabase.setTransactionSuccessful();
            } catch (Exception e11) {
                AbstractC20887g.m109244v(101017, null, 2, null);
                AbstractC22691c.m117366c(e11);
            }
        } finally {
            if (writableDatabase.isOpen()) {
                writableDatabase.endTransaction();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final void m109267O(Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                AbstractC19074t.m100207e(writableDatabase, "db");
                m109261G(writableDatabase, str, value);
            }
        } catch (Exception e11) {
            AbstractC20887g.m109244v(101016, null, 2, null);
            AbstractC22691c.m117366c(e11);
        }
        AbstractC22691c.m117364a("\tSqliteDb#saveConfig() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
    }

    /* renamed from: v */
    private final void m109274v(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("create table if not exists remote_config_table (id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,key_lv0 TEXT NOT NULL,value_lv0 TEXT NOT NULL,key_type INTEGER )");
        }
    }

    /* renamed from: y */
    private final String m109275y(SQLiteDatabase sQLiteDatabase) {
        String str = "delete from remote_config_table where user_id = '" + this.f102634p + '\'';
        sQLiteDatabase.execSQL(str);
        return str;
    }

    @Override // p249iz.InterfaceC20888a
    /* renamed from: f */
    public Object mo109252f(JSONObject jSONObject, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new b(jSONObject, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:            if (r2.moveToFirst() != false) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:            r6 = r2.getString(r2.getColumnIndexOrThrow("key_lv0"));        r7 = r2.getString(r2.getColumnIndexOrThrow("value_lv0"));        r8 = r2.getInt(r2.getColumnIndexOrThrow("key_type"));        fn0.AbstractC19074t.m100207e(r6, "key");        fn0.AbstractC19074t.m100207e(r7, "value");        r3.put(r6, m109263K(r7, r8));     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:            p334lz.AbstractC22691c.m117366c(r6);     */
    @Override // p249iz.InterfaceC20888a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map mo109253h() {
        Cursor rawQuery;
        long currentTimeMillis = System.currentTimeMillis();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "select * from remote_config_table where user_id = '" + this.f102634p + '\'';
        try {
            rawQuery = readableDatabase.rawQuery(str, null);
            if (rawQuery != null) {
                try {
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC2933b.m13890a(rawQuery, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC2933b.m13890a(rawQuery, null);
        } catch (Exception e11) {
            AbstractC22691c.m117366c(e11);
        }
        AbstractC22691c.m117364a("\tSqliteDb#getAllLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms with sql=\"" + str + '\"');
        return linkedHashMap;
        if (!rawQuery.moveToNext()) {
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC2933b.m13890a(rawQuery, null);
            AbstractC22691c.m117364a("\tSqliteDb#getAllLv0Keys() in " + (System.currentTimeMillis() - currentTimeMillis) + " ms with sql=\"" + str + '\"');
            return linkedHashMap;
        }
    }

    @Override // p249iz.InterfaceC20888a
    /* renamed from: i */
    public Object mo109254i(Map map, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new c(map, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20888a
    /* renamed from: o */
    public void mo109255o(Map map) {
        AbstractC19074t.m100208f(map, "level0Pairs");
        m109266N(map);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m109274v(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    @Override // p249iz.InterfaceC20888a
    /* renamed from: q */
    public Object mo109256q(Map map, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new d(map, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // p249iz.InterfaceC20888a
    /* renamed from: r */
    public Object mo109257r(JSONArray jSONArray, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new a(jSONArray, null), continuation);
    }
}

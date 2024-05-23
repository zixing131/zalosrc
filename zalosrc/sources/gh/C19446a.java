package gh;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import bn0.AbstractC2933b;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p102dh.C17931a;
import p210hh.C20060c;
import p210hh.C20061d;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: gh.a */
/* loaded from: classes3.dex */
public final class C19446a extends SQLiteOpenHelper {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final InterfaceC24854k f96526q;

    /* renamed from: p */
    private final SQLiteDatabase f96527p;

    /* renamed from: gh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: gh.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32828a {

            /* renamed from: a */
            public static final C32828a f96528a = new C32828a();

            /* renamed from: b */
            private static final C19446a f96529b;

            static {
                C19446a c19446a = new C19446a(MainApplication.Companion.m35500c());
                c19446a.m101704f();
                c19446a.m101705h();
                c19446a.m101706i();
                f96529b = c19446a;
            }

            private C32828a() {
            }

            /* renamed from: a */
            public final C19446a m101718a() {
                return f96529b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19446a m101717a() {
            return (C19446a) C19446a.f96526q.getValue();
        }
    }

    /* renamed from: gh.a$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f96530q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C19446a mo12V4() {
            return a.C32828a.f96528a.m101718a();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f96530q);
        f96526q = m129210a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19446a(Context context) {
        super(context, "chat_tag", (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC19074t.m100208f(context, "context");
        this.f96527p = context.openOrCreateDatabase("chat_tag", 0, null);
    }

    /* renamed from: A */
    public static final C19446a m101699A() {
        return Companion.m101717a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m101704f() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m101709G("db_version") && (sQLiteDatabase = this.f96527p) != null) {
                sQLiteDatabase.execSQL("create table db_version (version)");
                sQLiteDatabase.execSQL("insert into db_version values (0)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m101705h() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m101709G("chat_tag_info") && (sQLiteDatabase = this.f96527p) != null) {
                sQLiteDatabase.execSQL("create table chat_tag_info (user_id, id, chat_tag_info, color, emoji, offset, created_time)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m101706i() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m101709G("chat_tag_item") && (sQLiteDatabase = this.f96527p) != null) {
                sQLiteDatabase.execSQL("create table chat_tag_item (user_id, tag_id, thread_id, thread_type, time_add)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
    }

    /* renamed from: E */
    public final synchronized int m101707E(List list) {
        int i11;
        String str;
        AbstractC19074t.m100208f(list, "listChatTagItem");
        i11 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f96527p;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.beginTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C20061d c20061d = (C20061d) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("user_id", CoreUtility.f89233i);
                        contentValues.put("tag_id", Integer.valueOf(c20061d.m104223b()));
                        contentValues.put("thread_id", c20061d.m104224c());
                        contentValues.put("thread_type", Byte.valueOf(c20061d.m104225d()));
                        contentValues.put("time_add", Long.valueOf(c20061d.m104226e()));
                        if (sQLiteDatabase.insert("chat_tag_item", null, contentValues) >= 0) {
                            i11++;
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = this.f96527p;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Exception e11) {
                    e = e11;
                    str = "ChatTagDatabaseHelper";
                    AbstractC23350e.m122776f(str, e);
                    return i11;
                }
            } finally {
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e12);
            try {
                SQLiteDatabase sQLiteDatabase3 = this.f96527p;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.endTransaction();
                }
            } catch (Exception e13) {
                e = e13;
                str = "ChatTagDatabaseHelper";
                AbstractC23350e.m122776f(str, e);
                return i11;
            }
        }
        return i11;
    }

    /* renamed from: F */
    public final synchronized void m101708F(List list) {
        String str;
        AbstractC19074t.m100208f(list, "listChatTagInfo");
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f96527p;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.beginTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C20060c c20060c = (C20060c) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("user_id", CoreUtility.f89233i);
                        contentValues.put("id", Integer.valueOf(c20060c.m104215d()));
                        contentValues.put("chat_tag_info", c20060c.m104216e());
                        contentValues.put("color", c20060c.m104212a());
                        contentValues.put("emoji", c20060c.m104214c());
                        contentValues.put("offset", Integer.valueOf(c20060c.m104218g()));
                        contentValues.put("created_time", Long.valueOf(c20060c.m104213b()));
                        if (sQLiteDatabase.update("chat_tag_info", contentValues, "user_id='" + CoreUtility.f89233i + "' and id=" + c20060c.m104215d(), new String[0]) == 0) {
                            sQLiteDatabase.insert("chat_tag_info", null, contentValues);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = this.f96527p;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Exception e11) {
                    e = e11;
                    str = "ChatTagDatabaseHelper";
                    AbstractC23350e.m122776f(str, e);
                }
            } finally {
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e12);
            try {
                SQLiteDatabase sQLiteDatabase3 = this.f96527p;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.endTransaction();
                }
            } catch (Exception e13) {
                e = e13;
                str = "ChatTagDatabaseHelper";
                AbstractC23350e.m122776f(str, e);
            }
        }
    }

    /* renamed from: G */
    public final boolean m101709G(String str) {
        AbstractC19074t.m100208f(str, "tableName");
        boolean z11 = false;
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
                if (rawQuery != null) {
                    AbstractC19074t.m100205c(rawQuery);
                    try {
                        if (rawQuery.getCount() > 0) {
                            z11 = true;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC2933b.m13890a(rawQuery, null);
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
        return z11;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        SQLiteDatabase sQLiteDatabase = this.f96527p;
        if (sQLiteDatabase != null) {
            synchronized (sQLiteDatabase) {
                sQLiteDatabase.close();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
        super.close();
    }

    /* renamed from: o */
    public final synchronized int m101710o() {
        int i11;
        i11 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                i11 = sQLiteDatabase.delete("chat_tag_info", "user_id='" + CoreUtility.f89233i + "'", new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
        return i11;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    /* renamed from: q */
    public final synchronized int m101711q() {
        int i11;
        i11 = 0;
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                i11 = sQLiteDatabase.delete("chat_tag_item", "user_id='" + CoreUtility.f89233i + "'", new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
        return i11;
    }

    /* renamed from: r */
    public final synchronized void m101712r(List list) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(list, "listTagIdDelete");
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                m127114D = AbstractC24341v.m127114D(list.toString(), "[", "", false, 4, null);
                m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                sQLiteDatabase.delete("chat_tag_info", "user_id='" + CoreUtility.f89233i + "' and id in (" + m127114D2 + ")", new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
    }

    /* renamed from: s */
    public final synchronized int m101713s(List list) {
        int i11;
        Exception e11;
        String str;
        AbstractC19074t.m100208f(list, "listChatTagItem");
        i11 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f96527p;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.beginTransaction();
                    Iterator it = list.iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        try {
                            C20061d c20061d = (C20061d) it.next();
                            i12 += sQLiteDatabase.delete("chat_tag_item", "user_id='" + CoreUtility.f89233i + "' and thread_id='" + c20061d.m104224c() + "' and tag_id=" + c20061d.m104223b(), new String[0]);
                        } catch (Exception e12) {
                            e = e12;
                            i11 = i12;
                            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e);
                            try {
                                SQLiteDatabase sQLiteDatabase2 = this.f96527p;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.endTransaction();
                                }
                            } catch (Exception e13) {
                                e11 = e13;
                                str = "ChatTagDatabaseHelper";
                                AbstractC23350e.m122776f(str, e11);
                                return i11;
                            }
                            return i11;
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    i11 = i12;
                }
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.f96527p;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.endTransaction();
                    }
                } catch (Exception e14) {
                    e11 = e14;
                    str = "ChatTagDatabaseHelper";
                    AbstractC23350e.m122776f(str, e11);
                    return i11;
                }
            } finally {
            }
        } catch (Exception e15) {
            e = e15;
        }
        return i11;
    }

    /* renamed from: t */
    public final synchronized void m101714t(List list) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(list, "listTagIdDelete");
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                m127114D = AbstractC24341v.m127114D(list.toString(), "[", "", false, 4, null);
                m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                sQLiteDatabase.delete("chat_tag_item", "user_id='" + CoreUtility.f89233i + "' and tag_id in (" + m127114D2 + ")", new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
    }

    /* renamed from: v */
    public final HashMap m101715v() {
        HashMap hashMap = new HashMap();
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select * from chat_tag_item where user_id='" + CoreUtility.f89233i + "'", new String[0]);
                if (rawQuery != null) {
                    AbstractC19074t.m100205c(rawQuery);
                    try {
                        if (rawQuery.getCount() > 0) {
                            int columnIndex = rawQuery.getColumnIndex("tag_id");
                            int columnIndex2 = rawQuery.getColumnIndex("thread_id");
                            int columnIndex3 = rawQuery.getColumnIndex("thread_type");
                            int columnIndex4 = rawQuery.getColumnIndex("time_add");
                            rawQuery.moveToFirst();
                            do {
                                int i11 = rawQuery.getInt(columnIndex);
                                String string = rawQuery.getString(columnIndex2);
                                byte b11 = (byte) rawQuery.getInt(columnIndex3);
                                long j11 = rawQuery.getLong(columnIndex4);
                                AbstractC19074t.m100205c(string);
                                C20061d c20061d = new C20061d(i11, string, b11, j11);
                                String m104222a = c20061d.m104222a();
                                HashMap hashMap2 = (HashMap) hashMap.get(m104222a);
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                }
                                hashMap2.put(Integer.valueOf(i11), c20061d);
                                hashMap.put(m104222a, hashMap2);
                            } while (rawQuery.moveToNext());
                        }
                        AbstractC2933b.m13890a(rawQuery, null);
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(C17931a.Companion.m94571b(), e11);
        }
        return hashMap;
    }

    /* renamed from: y */
    public final HashMap m101716y() {
        String str;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        try {
            SQLiteDatabase sQLiteDatabase = this.f96527p;
            if (sQLiteDatabase != null) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("select * from chat_tag_info where user_id='" + CoreUtility.f89233i + "' order by offset", new String[0]);
                if (rawQuery != null) {
                    AbstractC19074t.m100205c(rawQuery);
                    try {
                        if (rawQuery.getCount() > 0) {
                            int columnIndex = rawQuery.getColumnIndex("id");
                            int columnIndex2 = rawQuery.getColumnIndex("chat_tag_info");
                            int columnIndex3 = rawQuery.getColumnIndex("color");
                            int columnIndex4 = rawQuery.getColumnIndex("emoji");
                            int columnIndex5 = rawQuery.getColumnIndex("offset");
                            int columnIndex6 = rawQuery.getColumnIndex("created_time");
                            rawQuery.moveToFirst();
                            while (true) {
                                int i11 = rawQuery.getInt(columnIndex);
                                String string = rawQuery.getString(columnIndex2);
                                if (string == null) {
                                    str = "";
                                } else {
                                    AbstractC19074t.m100205c(string);
                                    str = string;
                                }
                                String string2 = rawQuery.getString(columnIndex3);
                                if (string2 == null) {
                                    str2 = "";
                                } else {
                                    AbstractC19074t.m100205c(string2);
                                    str2 = string2;
                                }
                                String string3 = rawQuery.getString(columnIndex4);
                                if (string3 == null) {
                                    str3 = "";
                                } else {
                                    AbstractC19074t.m100205c(string3);
                                    str3 = string3;
                                }
                                int i12 = columnIndex;
                                hashMap.put(Integer.valueOf(i11), new C20060c(i11, str, str2, str3, rawQuery.getInt(columnIndex5), rawQuery.getLong(columnIndex6), null, 64, null));
                                if (!rawQuery.moveToNext()) {
                                    break;
                                }
                                columnIndex = i12;
                            }
                        }
                        AbstractC2933b.m13890a(rawQuery, null);
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ChatTagDatabaseHelper", e11);
        }
        return hashMap;
    }
}

package p102dh;

import am.AbstractC0924m0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.zing.zalo.MainApplication;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p130eh.C18430a;
import p130eh.C18431b;
import p405ov.C24559a;
import pm0.C24848g0;
import vg.C28211v5;

/* renamed from: dh.a */
/* loaded from: classes3.dex */
public final class C17931a extends SQLiteOpenHelper {
    public static final a Companion = new a(null);

    /* renamed from: q */
    private static final String f90525q;

    /* renamed from: r */
    private static volatile C17931a f90526r;

    /* renamed from: p */
    private final SQLiteDatabase f90527p;

    /* renamed from: dh.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C17931a m94570a() {
            if (C17931a.f90526r == null) {
                synchronized (C17931a.class) {
                    try {
                        if (C17931a.f90526r == null) {
                            C17931a c17931a = new C17931a(MainApplication.Companion.m35500c());
                            c17931a.m94560i();
                            c17931a.m94562q();
                            c17931a.m94561o();
                            C17931a.f90526r = c17931a;
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            C17931a c17931a2 = C17931a.f90526r;
            AbstractC19074t.m100205c(c17931a2);
            return c17931a2;
        }

        /* renamed from: b */
        public final String m94571b() {
            return C17931a.f90525q;
        }
    }

    static {
        String simpleName = C17931a.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f90525q = simpleName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17931a(Context context) {
        super(context, "conversation_label", (SQLiteDatabase.CursorFactory) null, 1);
        AbstractC19074t.m100208f(context, "context");
        this.f90527p = context.openOrCreateDatabase("conversation_label", 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final void m94560i() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m94564E("db_version") && (sQLiteDatabase = this.f90527p) != null) {
                sQLiteDatabase.execSQL("create table db_version (version)");
                sQLiteDatabase.execSQL("insert into db_version values (0)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90525q, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m94561o() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m94564E("conversation_label_info") && (sQLiteDatabase = this.f90527p) != null) {
                sQLiteDatabase.execSQL("create table conversation_label_info (user_id, thread_id, label_id)");
                AbstractC0924m0.m3229Li(0L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90525q, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m94562q() {
        SQLiteDatabase sQLiteDatabase;
        try {
            if (!m94564E("label_info") && (sQLiteDatabase = this.f90527p) != null) {
                sQLiteDatabase.execSQL("create table label_info (user_id, label_id, vi_title, en_title, label_index, has_new_msg)");
                AbstractC0924m0.m3229Li(0L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90525q, e11);
        }
    }

    /* renamed from: A */
    public final void m94563A(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listLabelInfo");
        try {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.f90527p;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C18431b c18431b = (C18431b) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user_id", CoreUtility.f89233i);
                            contentValues.put("label_id", Integer.valueOf(c18431b.m97665c()));
                            contentValues.put("vi_title", c18431b.m97667e().m142158d("vi"));
                            contentValues.put("en_title", c18431b.m97667e().m142158d("en"));
                            contentValues.put("label_index", Integer.valueOf(c18431b.m97666d()));
                            contentValues.put("has_new_msg", c18431b.m97664b());
                            if (sQLiteDatabase.update("label_info", contentValues, "user_id='" + CoreUtility.f89233i + "' and label_id=" + c18431b.m97665c(), new String[0]) == 0) {
                                sQLiteDatabase.insert("label_info", null, contentValues);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.f90527p;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = this.f90527p;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f90525q, e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f(f90525q, e12);
                SQLiteDatabase sQLiteDatabase4 = this.f90527p;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.endTransaction();
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f90525q, e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:            if (r1 == null) goto L19;     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m94564E(String str) {
        AbstractC19074t.m100208f(str, "tableName");
        boolean z11 = false;
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f90527p;
                if (sQLiteDatabase != null) {
                    cursor = sQLiteDatabase.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
                    if (cursor != null) {
                        if (cursor.getCount() > 0) {
                            z11 = true;
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f90525q, e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        SQLiteDatabase sQLiteDatabase = this.f90527p;
        if (sQLiteDatabase != null) {
            synchronized (sQLiteDatabase) {
                sQLiteDatabase.close();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
        super.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC19074t.m100208f(sQLiteDatabase, "db");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        AbstractC19074t.m100208f(sQLiteDatabase, "db");
    }

    /* renamed from: r */
    public final void m94565r(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listConversationLabelInfo");
        try {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.f90527p;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C18430a c18430a = (C18430a) it.next();
                            sQLiteDatabase.delete("conversation_label_info", "user_id='" + CoreUtility.f89233i + "' and thread_id='" + c18430a.m97662b() + "' and label_id=" + c18430a.m97661a(), new String[0]);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.f90527p;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f90525q, e11);
                    SQLiteDatabase sQLiteDatabase3 = this.f90527p;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.endTransaction();
                    }
                }
            } catch (Throwable th2) {
                try {
                    SQLiteDatabase sQLiteDatabase4 = this.f90527p;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.endTransaction();
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122776f(f90525q, e12);
                }
                throw th2;
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f90525q, e13);
        }
    }

    /* renamed from: s */
    public final void m94566s(ArrayList arrayList) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(arrayList, "listLabelInfo");
        try {
            SQLiteDatabase sQLiteDatabase = this.f90527p;
            if (sQLiteDatabase != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((C18431b) it.next()).m97665c()));
                }
                String obj = arrayList2.toString();
                AbstractC19074t.m100207e(obj, "toString(...)");
                m127114D = AbstractC24341v.m127114D(obj, "[", "", false, 4, null);
                m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                sQLiteDatabase.delete("label_info", "user_id='" + CoreUtility.f89233i + "' and label_id in (" + m127114D2 + ")", new String[0]);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f90525q, e11);
        }
    }

    /* renamed from: t */
    public final HashMap m94567t() {
        String str;
        Collection values;
        StringBuilder sb2;
        HashMap hashMap = new HashMap();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f90527p;
                if (sQLiteDatabase != null) {
                    cursor = sQLiteDatabase.rawQuery("select * from conversation_label_info where user_id='" + CoreUtility.f89233i + "'", new String[0]);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("label_id");
                        int columnIndex2 = cursor.getColumnIndex("thread_id");
                        cursor.moveToFirst();
                        do {
                            int i11 = cursor.getInt(columnIndex);
                            String string = cursor.getString(columnIndex2);
                            HashMap hashMap2 = (HashMap) hashMap.get(Integer.valueOf(i11));
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            AbstractC19074t.m100205c(string);
                            hashMap2.put(string, new C18430a(string, i11));
                            hashMap.put(Integer.valueOf(i11), hashMap2);
                        } while (cursor.moveToNext());
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                str = CoreUtility.f89233i;
                values = hashMap.values();
                sb2 = new StringBuilder();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f90525q, e11);
                if (cursor != null) {
                    cursor.close();
                }
                str = CoreUtility.f89233i;
                values = hashMap.values();
                sb2 = new StringBuilder();
            }
            sb2.append("getAllConversationLabelInfo from DB uid = ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(values);
            C24559a.m127933c("[ConversationLabel]", sb2.toString());
            return hashMap;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            C24559a.m127933c("[ConversationLabel]", "getAllConversationLabelInfo from DB uid = " + CoreUtility.f89233i + ", " + hashMap.values());
            throw th2;
        }
    }

    /* renamed from: v */
    public final LinkedHashMap m94568v() {
        String str;
        StringBuilder sb2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.f90527p;
                if (sQLiteDatabase != null) {
                    cursor = sQLiteDatabase.rawQuery("select * from label_info where user_id='" + CoreUtility.f89233i + "' order by label_index", new String[0]);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("label_id");
                        int columnIndex2 = cursor.getColumnIndex("vi_title");
                        int columnIndex3 = cursor.getColumnIndex("en_title");
                        int columnIndex4 = cursor.getColumnIndex("label_index");
                        int columnIndex5 = cursor.getColumnIndex("has_new_msg");
                        cursor.moveToFirst();
                        while (true) {
                            int i11 = cursor.getInt(columnIndex);
                            String string = cursor.getString(columnIndex2);
                            String string2 = cursor.getString(columnIndex3);
                            int i12 = cursor.getInt(columnIndex4);
                            String string3 = cursor.getString(columnIndex5);
                            int i13 = columnIndex;
                            C28211v5.a aVar = C28211v5.Companion;
                            AbstractC19074t.m100205c(string);
                            AbstractC19074t.m100205c(string2);
                            C28211v5 m142160b = aVar.m142160b(string, string2);
                            Integer valueOf = Integer.valueOf(i11);
                            AbstractC19074t.m100205c(string3);
                            linkedHashMap.put(valueOf, new C18431b(i11, m142160b, i12, string3));
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            columnIndex = i13;
                        }
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                str = CoreUtility.f89233i;
                sb2 = new StringBuilder();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f90525q, e11);
                if (cursor != null) {
                    cursor.close();
                }
                str = CoreUtility.f89233i;
                sb2 = new StringBuilder();
            }
            sb2.append("getAllLabelInfo from DB uid = ");
            sb2.append(str);
            sb2.append(", listLabelInfo = ");
            sb2.append(linkedHashMap);
            C24559a.m127933c("[ConversationLabel]", sb2.toString());
            return linkedHashMap;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            C24559a.m127933c("[ConversationLabel]", "getAllLabelInfo from DB uid = " + CoreUtility.f89233i + ", listLabelInfo = " + linkedHashMap);
            throw th2;
        }
    }

    /* renamed from: y */
    public final void m94569y(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listConversationLabelInfo");
        try {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.f90527p;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C18430a c18430a = (C18430a) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("user_id", CoreUtility.f89233i);
                            contentValues.put("thread_id", c18430a.m97662b());
                            contentValues.put("label_id", Integer.valueOf(c18430a.m97661a()));
                            if (sQLiteDatabase.update("conversation_label_info", contentValues, "user_id='" + CoreUtility.f89233i + "' and thread_id='" + c18430a.m97662b() + "' and label_id=" + c18430a.m97661a(), new String[0]) == 0) {
                                sQLiteDatabase.insert("conversation_label_info", null, contentValues);
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                    }
                    SQLiteDatabase sQLiteDatabase2 = this.f90527p;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = this.f90527p;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f(f90525q, e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f(f90525q, e12);
                SQLiteDatabase sQLiteDatabase4 = this.f90527p;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.endTransaction();
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f(f90525q, e13);
        }
    }
}

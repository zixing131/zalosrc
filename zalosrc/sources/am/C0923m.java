package am;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import p348mi.AbstractC23304d;
import qm0.AbstractC25332a0;

/* renamed from: am.m */
/* loaded from: classes3.dex */
public final class C0923m extends SQLiteOpenHelper {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private static C0923m f3420p;

    /* renamed from: am.m$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C0923m m2889a() {
            return C0923m.f3420p;
        }

        /* renamed from: b */
        public final void m2890b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            C0923m.f3420p = new C0923m(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0923m(Context context) {
        super(context, "zalo_mini_program", (SQLiteDatabase.CursorFactory) null, 2);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m2884c(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists app_permission_setting_table (id INTEGER PRIMARY KEY AUTOINCREMENT,user_id TEXT NOT NULL,app_id TEXT NOT NULL,permission_id TEXT NOT NULL, consent_type INTEGER DEFAULT 1, client_handle INTEGER DEFAULT 1  )");
    }

    /* renamed from: i */
    public static /* synthetic */ void m2885i(C0923m c0923m, String str, ArrayList arrayList, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        c0923m.m2888h(str, arrayList, z11);
    }

    /* renamed from: d */
    public final C0903c0 m2886d(String str, String str2) {
        AbstractC19074t.m100208f(str, "appId");
        AbstractC19074t.m100208f(str2, "permissionId");
        Cursor rawQuery = getReadableDatabase().rawQuery("select * from app_permission_setting_table where user_id = " + AbstractC23304d.f113368c0.f42434r + " and app_id = \"" + str + "\" and permission_id = \"" + str2 + "\" limit 1", null);
        if (rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            String string = rawQuery.getString(rawQuery.getColumnIndex("app_id"));
            AbstractC19074t.m100207e(string, "getString(...)");
            String string2 = rawQuery.getString(rawQuery.getColumnIndex("permission_id"));
            AbstractC19074t.m100207e(string2, "getString(...)");
            return new C0903c0(string, string2, rawQuery.getInt(rawQuery.getColumnIndex("consent_type")), rawQuery.getInt(rawQuery.getColumnIndex("client_handle")));
        }
        rawQuery.close();
        return null;
    }

    /* renamed from: f */
    public final void m2887f(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "appId");
        AbstractC19074t.m100208f(str2, "permissionId");
        getWritableDatabase().execSQL("update app_permission_setting_table set consent_type = " + i11 + " where user_id = " + AbstractC23304d.f113368c0.f42434r + " AND app_id = \"" + str + "\" and permission_id = \"" + str2 + "\"");
    }

    /* renamed from: h */
    public final void m2888h(String str, ArrayList arrayList, boolean z11) {
        String m131214n0;
        String str2;
        AbstractC19074t.m100208f(str, "mAppId");
        AbstractC19074t.m100208f(arrayList, "permissionList");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            try {
                writableDatabase.beginTransaction();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add("'" + ((C0903c0) it.next()).m2793c() + "'");
                }
                m131214n0 = AbstractC25332a0.m131214n0(arrayList2, ",", null, null, 0, null, null, 62, null);
                if (z11) {
                    str2 = "";
                } else {
                    str2 = " and permission_id in (" + m131214n0 + ")";
                }
                writableDatabase.execSQL("delete from app_permission_setting_table where user_id = " + AbstractC23304d.f113368c0.f42434r + " and app_id = " + str + " " + str2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0903c0 c0903c0 = (C0903c0) it2.next();
                    arrayList3.add("( \"" + AbstractC23304d.f113368c0.f42434r + "\",\"" + str + "\", \"" + c0903c0.m2793c() + "\", " + c0903c0.m2792b() + ", " + c0903c0.m2791a() + ")");
                }
                writableDatabase.execSQL("insert into app_permission_setting_table (user_id, app_id, permission_id, consent_type, client_handle) values " + TextUtils.join(",", arrayList3));
                writableDatabase.setTransactionSuccessful();
                if (!writableDatabase.isOpen()) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("MiniProgramDB").mo104552e(e11);
                if (!writableDatabase.isOpen()) {
                    return;
                }
            }
            writableDatabase.endTransaction();
        } catch (Throwable th2) {
            if (writableDatabase.isOpen()) {
                writableDatabase.endTransaction();
            }
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            m2884c(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 < 2 && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("ALTER TABLE app_permission_setting_table ADD client_handle INTEGER DEFAULT 1 ");
        }
    }
}

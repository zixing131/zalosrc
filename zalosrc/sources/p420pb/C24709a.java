package p420pb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import gm0.AbstractC19509c;
import ho0.AbstractC20110a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p361nb.AbstractC23660q;
import p361nb.AbstractC23668y;
import p361nb.C23643a;
import p361nb.C23648e;
import p361nb.C23650g;
import p361nb.C23665v;
import p361nb.C23669z;
import p371nv.C23952g;

/* renamed from: pb.a */
/* loaded from: classes.dex */
public class C24709a extends SQLiteOpenHelper {

    /* renamed from: q */
    private static final String f118678q = "a";

    /* renamed from: r */
    private static volatile C24709a f118679r;

    /* renamed from: p */
    private SQLiteDatabase f118680p;

    private C24709a(Context context) {
        super(context, "zalo_action_log.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f118680p = getWritableDatabase();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x001a -> B:7:0x0029). Please report as a decompilation issue!!! */
    /* renamed from: L */
    private boolean m128294L(String str) {
        boolean z11 = true;
        Cursor cursor = null;
        try {
            try {
                try {
                    cursor = this.f118680p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME= ? ", new String[]{str});
                    if (cursor.getCount() == 0) {
                        z11 = false;
                    }
                    cursor.close();
                } catch (Throwable th2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return z11;
    }

    /* renamed from: c */
    private void m128295c() {
        if (!m128294L("event_log_new")) {
            this.f118680p.execSQL("CREATE TABLE event_log_new (id INTEGER PRIMARY KEY AUTOINCREMENT, action_name, action_source, status, elapsed_time, param)");
        }
    }

    /* renamed from: d */
    private void m128296d() {
        if (!m128294L("time_on_app_info")) {
            this.f118680p.execSQL("create table time_on_app_info (currentUserUid, type, duration, network_start_type, socket_status, source_type, time_start_session, time_gen_log)");
        }
    }

    /* renamed from: f */
    private void m128297f() {
        this.f118680p.execSQL(String.format("create table if not exists %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)", "zalo_tracking_info_v3", "currentUserUid", "time", ZinstantMetaConstant.IMPRESSION_META_TYPE, "sub_type", "source", "param1", "param2", "param3", "param4", "param5", "param6", "param7", "param8", "param9", "param10"));
    }

    /* renamed from: r */
    private void m128298r(String str) {
        try {
            this.f118680p.execSQL("drop table if exists '" + str + "'");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            C23952g.m125345j(f118678q, "dropTableIfExist. Table: " + str + ". Exception: " + e11.toString());
        }
    }

    /* renamed from: t */
    public static C24709a m128299t(Context context) {
        if (f118679r == null) {
            synchronized (C24709a.class) {
                try {
                    if (f118679r == null) {
                        C24709a c24709a = new C24709a(context);
                        if (c24709a.m128294L("event_log")) {
                            c24709a.m128314q();
                        }
                        c24709a.m128295c();
                        c24709a.m128296d();
                        c24709a.m128298r("zalo_tracking_info");
                        c24709a.m128298r("zalo_tracking_info_2");
                        c24709a.m128298r("db_version");
                        c24709a.m128297f();
                        f118679r = c24709a;
                    }
                } finally {
                }
            }
        }
        return f118679r;
    }

    /* renamed from: A */
    public List m128300A() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
                cursor = this.f118680p.rawQuery("SELECT DISTINCT action_name, action_source FROM event_log_new", null);
                while (cursor.moveToNext()) {
                    arrayList.add(new C23650g(cursor.getString(cursor.getColumnIndex("action_name")), cursor.getString(cursor.getColumnIndex("action_source"))));
                }
                cursor.close();
            } catch (Exception e12) {
                e12.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0105 A[LOOP:0: B:15:0x0079->B:37:0x0105, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[EDGE_INSN: B:38:0x0113->B:63:0x0113 BREAK  A[LOOP:0: B:15:0x0079->B:37:0x0105], SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m128301E(int i11, int i12) {
        Cursor rawQuery;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C23665v c23665v;
        int i18;
        long j11;
        int i19;
        int i21;
        int i22;
        long j12;
        long j13;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                            throw th2;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            throw th2;
                        }
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Exception e13) {
            AbstractC23350e.m122774d(f118678q, e13.toString());
            if (cursor != null) {
                cursor.close();
            }
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return arrayList;
        }
        if (i11 > 0) {
            rawQuery = this.f118680p.rawQuery("SELECT * FROM time_on_app_info WHERE currentUserUid = ? LIMIT ? ", new String[]{CoreUtility.f89233i, String.valueOf(i11)});
        } else {
            rawQuery = this.f118680p.rawQuery("SELECT * FROM time_on_app_info WHERE currentUserUid = ? ", new String[]{CoreUtility.f89233i});
        }
        cursor = rawQuery;
        if (cursor != null && cursor.moveToFirst()) {
            cursor.getColumnIndex("currentUserUid");
            int columnIndex = cursor.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            int columnIndex2 = cursor.getColumnIndex("duration");
            int columnIndex3 = cursor.getColumnIndex("network_start_type");
            int columnIndex4 = cursor.getColumnIndex("socket_status");
            int columnIndex5 = cursor.getColumnIndex("source_type");
            int columnIndex6 = cursor.getColumnIndex("time_start_session");
            int columnIndex7 = cursor.getColumnIndex("time_gen_log");
            while (true) {
                try {
                    c23665v = new C23665v();
                    if (columnIndex != -1) {
                        i18 = cursor.getInt(columnIndex);
                    } else {
                        i18 = 0;
                    }
                    if (columnIndex2 != -1) {
                        i13 = columnIndex;
                        j11 = cursor.getLong(columnIndex2);
                    } else {
                        i13 = columnIndex;
                        j11 = 0;
                    }
                    if (columnIndex3 != -1) {
                        try {
                            i19 = cursor.getInt(columnIndex3);
                        } catch (Exception e14) {
                            e = e14;
                            i14 = columnIndex2;
                            i15 = columnIndex3;
                            i16 = columnIndex4;
                            i17 = columnIndex5;
                            e.printStackTrace();
                            if (cursor.moveToNext()) {
                            }
                        }
                    } else {
                        i19 = 0;
                    }
                    if (columnIndex4 != -1) {
                        i21 = cursor.getInt(columnIndex4);
                    } else {
                        i21 = 0;
                    }
                    if (columnIndex5 != -1) {
                        i22 = cursor.getInt(columnIndex5);
                    } else {
                        i22 = 0;
                    }
                    if (columnIndex6 != -1) {
                        i14 = columnIndex2;
                        i15 = columnIndex3;
                        j12 = cursor.getLong(columnIndex6);
                    } else {
                        i14 = columnIndex2;
                        i15 = columnIndex3;
                        j12 = 0;
                    }
                    if (columnIndex7 != -1) {
                        try {
                            i16 = columnIndex4;
                            i17 = columnIndex5;
                            j13 = cursor.getLong(columnIndex7);
                        } catch (Exception e15) {
                            e = e15;
                            i16 = columnIndex4;
                            i17 = columnIndex5;
                            e.printStackTrace();
                            if (cursor.moveToNext()) {
                            }
                        }
                    } else {
                        i16 = columnIndex4;
                        i17 = columnIndex5;
                        j13 = 0;
                    }
                } catch (Exception e16) {
                    e = e16;
                    i13 = columnIndex;
                }
                try {
                    c23665v.f114654a = i18;
                    c23665v.f114640i = j11;
                    c23665v.f114641j = i19;
                    c23665v.f114642k = i21;
                    c23665v.f114657d = i22;
                    c23665v.f114643l = j12;
                    c23665v.f114656c = j13;
                    arrayList.add(c23665v);
                } catch (Exception e17) {
                    e = e17;
                    e.printStackTrace();
                    if (cursor.moveToNext()) {
                    }
                }
                if (cursor.moveToNext()) {
                    break;
                }
                columnIndex = i13;
                columnIndex4 = i16;
                columnIndex2 = i14;
                columnIndex3 = i15;
                columnIndex5 = i17;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* renamed from: F */
    public void m128302F() {
        ArrayList<C23643a> arrayList;
        try {
            try {
                try {
                    List list = AbstractC23660q.f114615a;
                    synchronized (list) {
                        arrayList = new ArrayList(list);
                        list.clear();
                    }
                    this.f118680p.beginTransaction();
                    SQLiteStatement compileStatement = this.f118680p.compileStatement("INSERT INTO event_log_new ( action_name, action_source, status, elapsed_time,  param) VALUES (?, ?, ?, ?, ?)");
                    for (C23643a c23643a : arrayList) {
                        compileStatement.bindString(1, c23643a.f114533a);
                        compileStatement.bindString(2, c23643a.f114534b);
                        compileStatement.bindString(3, String.valueOf(c23643a.f114537e));
                        compileStatement.bindLong(4, c23643a.f114538f);
                        compileStatement.bindString(5, c23643a.f114539g);
                        compileStatement.execute();
                    }
                    compileStatement.close();
                    this.f118680p.setTransactionSuccessful();
                    if (this.f118680p.isOpen()) {
                        this.f118680p.endTransaction();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    if (this.f118680p.isOpen()) {
                        this.f118680p.endTransaction();
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } catch (Throwable th2) {
            try {
                if (this.f118680p.isOpen()) {
                    this.f118680p.endTransaction();
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
            throw th2;
        }
    }

    /* renamed from: G */
    public void m128303G(C23665v c23665v) {
        if (c23665v == null) {
            return;
        }
        System.currentTimeMillis();
        try {
            if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("currentUserUid", CoreUtility.f89233i);
                contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(c23665v.f114654a));
                contentValues.put("duration", String.valueOf(c23665v.f114640i));
                contentValues.put("network_start_type", String.valueOf(c23665v.f114641j));
                contentValues.put("socket_status", String.valueOf(c23665v.f114642k));
                contentValues.put("source_type", String.valueOf(c23665v.f114657d));
                contentValues.put("time_start_session", String.valueOf(c23665v.f114643l));
                contentValues.put("time_gen_log", String.valueOf(c23665v.f114656c));
                if (this.f118680p.update("time_on_app_info", contentValues, "time_gen_log = ? ", new String[]{String.valueOf(c23665v.f114656c)}) == 0) {
                    this.f118680p.insert("time_on_app_info", null, contentValues);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public long m128304J(C23648e c23648e) {
        long j11;
        String str;
        String[] strArr;
        long update;
        if (c23648e == null || TextUtils.isEmpty(CoreUtility.f89233i)) {
            return -1L;
        }
        System.currentTimeMillis();
        ContentValues contentValues = new ContentValues();
        try {
            try {
                c23648e.f114656c = C23793c.m124316k().mo124314i();
                c23648e.mo123890f();
                contentValues.put("currentUserUid", CoreUtility.f89233i);
                contentValues.put("time", String.valueOf(c23648e.f114656c));
                contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(c23648e.f114654a));
                contentValues.put("sub_type", String.valueOf(c23648e.f114655b));
                contentValues.put("source", String.valueOf(c23648e.f114657d));
                int i11 = c23648e.f114658e;
                int i12 = 0;
                while (i12 < i11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("param");
                    int i13 = i12 + 1;
                    sb2.append(i13);
                    contentValues.put(sb2.toString(), c23648e.f114659f[i12]);
                    i12 = i13;
                }
                if (c23648e.m123921n() > 0) {
                    str = "currentUserUid = ? AND type = ? AND sub_type = ? AND param2 = ? AND param4 = ? AND CAST(param5 AS integer) > 0";
                    strArr = new String[]{CoreUtility.f89233i, String.valueOf(c23648e.f114654a), String.valueOf(c23648e.f114655b), c23648e.m123916i(), c23648e.m123920m()};
                } else {
                    str = "currentUserUid = ? AND type = ? AND time = ? AND sub_type = ? AND param2 = ? AND param4 = ? AND CAST(param5 AS integer) = 0";
                    strArr = new String[]{CoreUtility.f89233i, String.valueOf(c23648e.f114654a), String.valueOf(c23648e.f114656c), String.valueOf(c23648e.f114655b), c23648e.m123916i(), c23648e.m123920m()};
                }
                update = this.f118680p.update("zalo_tracking_info_v3", contentValues, str, strArr);
                AbstractC20110a.m104541j("ActionLogV2 update row effected = " + update, new Object[0]);
                if (update == 0) {
                    j11 = this.f118680p.insert("zalo_tracking_info_v3", null, contentValues);
                } else {
                    j11 = -1;
                }
            } catch (Throwable th2) {
                AbstractC23668y.m123998g(c23648e, true);
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            j11 = -1;
        }
        try {
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
            AbstractC23668y.m123998g(c23648e, true);
            return j11;
        }
        if (update > 0) {
            int m123995d = AbstractC23668y.m123995d(c23648e.f114654a);
            if (m123995d == 0) {
                AbstractC23668y.m123997f(c23648e.f114654a, m123995d + 1);
            }
        } else {
            if (j11 >= 0) {
                AbstractC20110a.m104541j("ActionLogV2 insert posInsert = " + j11, new Object[0]);
                AbstractC23668y.m123997f(c23648e.f114654a, AbstractC23668y.m123995d(c23648e.f114654a) + 1);
            }
            AbstractC23668y.m123998g(c23648e, true);
            return j11;
        }
        AbstractC23668y.m123998g(c23648e, true);
        return j11;
    }

    /* renamed from: K */
    public long m128305K(C23669z c23669z) {
        long j11 = -1;
        if (c23669z != null && !TextUtils.isEmpty(CoreUtility.f89233i)) {
            System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            try {
                c23669z.f114656c = C23793c.m124316k().mo124314i();
                c23669z.mo123890f();
                contentValues.put("currentUserUid", CoreUtility.f89233i);
                contentValues.put("time", String.valueOf(c23669z.f114656c));
                contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(c23669z.f114654a));
                contentValues.put("sub_type", String.valueOf(c23669z.f114655b));
                contentValues.put("source", String.valueOf(c23669z.f114657d));
                int i11 = c23669z.f114658e;
                int i12 = 0;
                while (i12 < i11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("param");
                    int i13 = i12 + 1;
                    sb2.append(i13);
                    contentValues.put(sb2.toString(), c23669z.f114659f[i12]);
                    i12 = i13;
                }
                long update = this.f118680p.update("zalo_tracking_info_v3", contentValues, "currentUserUid = ? AND type = ? AND time = ? AND sub_type = ? ", new String[]{CoreUtility.f89233i, String.valueOf(c23669z.f114654a), String.valueOf(c23669z.f114656c), String.valueOf(c23669z.f114655b)});
                if (update == 0) {
                    j11 = this.f118680p.insert("zalo_tracking_info_v3", null, contentValues);
                }
                if (update <= 0 && j11 >= 0) {
                    AbstractC23668y.m123997f(c23669z.f114654a, AbstractC23668y.m123995d(c23669z.f114654a) + 1);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return j11;
    }

    /* renamed from: M */
    public int m128306M(C23665v c23665v, ArrayList arrayList) {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122774d(f118678q, e11.toString());
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return 0;
        }
        if (c23665v != null) {
            arrayList2.add(String.valueOf(c23665v.f114656c));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(String.valueOf(((C23665v) arrayList.get(i12)).f114656c));
            }
        }
        if (!arrayList2.isEmpty()) {
            i11 = this.f118680p.delete("time_on_app_info", " currentUserUid = ? AND time_gen_log IN " + ("('" + TextUtils.join("','", arrayList2) + "')"), new String[]{CoreUtility.f89233i});
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("removeTimeOnAppInfoByTimeGenLog: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" - num: ");
        sb2.append(i11);
        return i11;
    }

    /* renamed from: N */
    public int m128307N(ArrayList arrayList) {
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        SparseArray sparseArray = new SparseArray();
        int i12 = 0;
        try {
        } catch (Exception e11) {
            e = e11;
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return 0;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            C23669z c23669z = (C23669z) arrayList.get(i13);
            String valueOf = String.valueOf(c23669z.f114656c);
            ArrayList arrayList2 = (ArrayList) sparseArray.get(c23669z.f114654a);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                sparseArray.put(c23669z.f114654a, arrayList2);
            }
            arrayList2.add(valueOf);
            if (c23669z.f114654a == 13) {
                AbstractC23668y.m123996e((C23648e) c23669z);
            }
        }
        int size = sparseArray.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            try {
                int keyAt = sparseArray.keyAt(i15);
                ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i15);
                if (!arrayList3.isEmpty()) {
                    int delete = this.f118680p.delete("zalo_tracking_info_v3", " currentUserUid = ? AND type = ? AND time IN " + ("('" + TextUtils.join("','", arrayList3) + "')"), new String[]{CoreUtility.f89233i, String.valueOf(keyAt)});
                    i14 += delete;
                    int m123995d = AbstractC23668y.m123995d(keyAt);
                    if (m123995d >= delete) {
                        i11 = m123995d - delete;
                    } else {
                        i11 = 0;
                    }
                    AbstractC23668y.m123997f(keyAt, i11);
                }
            } catch (Exception e12) {
                e = e12;
                i12 = i14;
                AbstractC23350e.m122774d(f118678q, e.toString());
                i14 = i12;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("removeTimeOnAppInfoByTimeGenLogAndType: ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                sb2.append(" - num: ");
                sb2.append(i14);
                return i14;
            }
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append("removeTimeOnAppInfoByTimeGenLogAndType: ");
        sb22.append(System.currentTimeMillis() - currentTimeMillis);
        sb22.append(" - num: ");
        sb22.append(i14);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0142 A[Catch: Exception -> 0x014c, TRY_ENTER, TryCatch #3 {Exception -> 0x014c, blocks: (B:11:0x0142, B:13:0x0148, B:44:0x015e, B:46:0x0164), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[SYNTHETIC] */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m128308O(long j11, String str) {
        Throwable th2;
        Cursor cursor;
        Cursor query;
        String string;
        try {
            if (j11 < 0) {
                return;
            }
            try {
                query = this.f118680p.query("zalo_tracking_info_v3", new String[]{"currentUserUid", "time", ZinstantMetaConstant.IMPRESSION_META_TYPE, "sub_type", "source", "param1"}, "rowid = ?", new String[]{String.valueOf(j11)}, null, null, null);
            } catch (Exception e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th3) {
                th2 = th3;
                cursor = null;
            }
            if (query != null) {
                try {
                } catch (Exception e12) {
                    e = e12;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (query.moveToFirst()) {
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("currentUserUid");
                    int columnIndexOrThrow2 = query.getColumnIndexOrThrow("time");
                    int columnIndexOrThrow3 = query.getColumnIndexOrThrow(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    int columnIndexOrThrow4 = query.getColumnIndexOrThrow("sub_type");
                    int columnIndexOrThrow5 = query.getColumnIndexOrThrow("source");
                    int columnIndexOrThrow6 = query.getColumnIndexOrThrow("param1");
                    int i11 = query.getInt(columnIndexOrThrow3);
                    int i12 = query.getInt(columnIndexOrThrow4);
                    if (i11 == 1 && i12 == 4) {
                        try {
                            query.getString(columnIndexOrThrow);
                            query.getString(columnIndexOrThrow2);
                            query.getString(columnIndexOrThrow5);
                            string = query.getString(columnIndexOrThrow6);
                        } catch (Exception e13) {
                            e = e13;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        if (!TextUtils.isEmpty(string)) {
                            byte[] m101978a = AbstractC19509c.m101978a(string);
                            byte[] m89297a = Utils.m89297a(2);
                            JSONObject jSONObject = new JSONObject(new String(AbstractC17527f.m93445i(m101978a, m89297a), "UTF-8"));
                            jSONObject.put("PUBLIC_IP_ADDRESS", str);
                            String jSONObject2 = jSONObject.toString();
                            if (!TextUtils.isEmpty(jSONObject2)) {
                                jSONObject2 = AbstractC19509c.m101979b(AbstractC17527f.m93445i(jSONObject2.getBytes(StandardCharsets.UTF_8), m89297a));
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("currentUserUid", query.getString(columnIndexOrThrow));
                            contentValues.put("time", query.getString(columnIndexOrThrow2));
                            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, query.getString(columnIndexOrThrow3));
                            contentValues.put("sub_type", query.getString(columnIndexOrThrow4));
                            contentValues.put("source", query.getString(columnIndexOrThrow5));
                            contentValues.put("param1", jSONObject2);
                            try {
                                long update = this.f118680p.update("zalo_tracking_info_v3", contentValues, "rowid = ?", new String[]{String.valueOf(j11)});
                                if (update > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("public ip updated rowId=");
                                    sb2.append(j11);
                                    sb2.append(" rowEffect=");
                                    sb2.append(update);
                                }
                            } catch (Exception e14) {
                                e = e14;
                                cursor = query;
                                try {
                                    AbstractC23350e.m122778h(e);
                                    if (cursor != null) {
                                        if (!cursor.isClosed()) {
                                            cursor.close();
                                        }
                                        return;
                                    }
                                    return;
                                } catch (Throwable th6) {
                                    th2 = th6;
                                    if (cursor == null) {
                                        try {
                                            if (!cursor.isClosed()) {
                                                cursor.close();
                                                throw th2;
                                            }
                                            throw th2;
                                        } catch (Exception e15) {
                                            AbstractC23350e.m122778h(e15);
                                            throw th2;
                                        }
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                th2 = th;
                                cursor = query;
                                if (cursor == null) {
                                }
                            }
                            if (query != null) {
                                if (!query.isClosed()) {
                                    query.close();
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (query != null) {
                    }
                }
            }
            if (query != null) {
            }
        } catch (Exception e16) {
            AbstractC23350e.m122778h(e16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:            if (r3.f118680p.isOpen() != false) goto L14;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:            r3.f118680p.endTransaction();     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:            if (r3.f118680p.isOpen() == false) goto L19;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m128309a(List list) {
        long j11 = -1;
        try {
            try {
                this.f118680p.beginTransaction();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j11 = m128305K((C23669z) it.next());
                }
                this.f118680p.setTransactionSuccessful();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            if (this.f118680p.isOpen()) {
                this.f118680p.endTransaction();
            }
            throw th2;
        }
    }

    /* renamed from: b */
    public void m128310b() {
        try {
            this.f118680p.delete("event_log_new", null, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f118680p) {
            try {
                SQLiteDatabase sQLiteDatabase = this.f118680p;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.close();
    }

    /* renamed from: h */
    public int m128311h(long j11) {
        int i11;
        try {
            int delete = this.f118680p.delete("zalo_tracking_info_v3", " currentUserUid = ? AND cast(type as number) = ? AND ((cast(param5 as number) = 0 AND cast(time as number) < ?) OR (cast(param5 as number) > 0 AND cast(param5 as number) < ?)) ", new String[]{CoreUtility.f89233i, String.valueOf(13), String.valueOf(j11), String.valueOf(j11)});
            int m123995d = AbstractC23668y.m123995d(13);
            if (m123995d >= delete) {
                i11 = m123995d - delete;
            } else {
                i11 = 0;
            }
            AbstractC23668y.m123997f(13, i11);
            AbstractC20110a.m104542k(8, "ActionLogV2 deleteExpireZaloActionLogV2: type(%d) - count(%d) - time(%d)", 13, Integer.valueOf(delete), Long.valueOf(j11));
            return delete;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public int m128312i(long j11, int i11) {
        int i12;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteExpireZaloTrackingLog: ");
            sb2.append(i11);
            int delete = this.f118680p.delete("zalo_tracking_info_v3", " currentUserUid = ? AND cast(type as number) = ? AND cast(time as number) < ? ", new String[]{CoreUtility.f89233i, String.valueOf(i11), String.valueOf(j11)});
            int m123995d = AbstractC23668y.m123995d(i11);
            if (m123995d >= delete) {
                i12 = m123995d - delete;
            } else {
                i12 = 0;
            }
            AbstractC23668y.m123997f(i11, i12);
            AbstractC20110a.m104542k(8, "deleteOverSizeTrackingInfo: type(%d) - count(%d) - time(%d)", Integer.valueOf(i11), Integer.valueOf(delete), Long.valueOf(j11));
            return delete;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0194 A[Catch: all -> 0x0132, Exception -> 0x0181, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x0132, blocks: (B:96:0x0127, B:94:0x013f, B:84:0x0148, B:85:0x0164, B:17:0x0194, B:92:0x0161), top: B:95:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01eb A[Catch: Exception -> 0x01ef, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ef, blocks: (B:23:0x01eb, B:34:0x021a), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021a A[Catch: Exception -> 0x01ef, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ef, blocks: (B:23:0x01eb, B:34:0x021a), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b A[LOOP:0: B:63:0x009c->B:87:0x016b, LOOP_END] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m128313o(long j11) {
        String str;
        Throwable th2;
        Cursor rawQuery;
        String str2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j12;
        int i19;
        int i21;
        int i22;
        long j13;
        String string;
        int i23;
        C24709a c24709a = this;
        String str3 = "deleteOverSizeTimeOnAppInfo: ";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    str = "deleteOverSizeTimeOnAppInfo: ";
                }
            } catch (Exception e11) {
                e = e11;
                str = "deleteOverSizeTimeOnAppInfo: ";
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteOverSizeTimeOnAppInfo: ");
            sb2.append(0);
            return arrayList;
        }
        if (j11 > 2) {
            try {
                rawQuery = c24709a.f118680p.rawQuery("select rowid, currentUserUid, type, duration, network_start_type, socket_status, source_type, time_start_session, time_gen_log FROM time_on_app_info WHERE currentUserUid = ? ORDER BY rowid DESC LIMIT ? ", new String[]{CoreUtility.f89233i, String.valueOf(j11 / 2)});
            } catch (Throwable th4) {
                th2 = th4;
                str = str3;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(0);
                if (cursor == null) {
                    try {
                        cursor.close();
                        throw th2;
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        throw th2;
                    }
                }
                throw th2;
            }
        } else {
            rawQuery = c24709a.f118680p.rawQuery("select rowid, currentUserUid, type, duration, network_start_type, socket_status, source_type, time_start_session, time_gen_log FROM time_on_app_info WHERE currentUserUid = ? ORDER BY rowid DESC", new String[]{CoreUtility.f89233i});
        }
        cursor = rawQuery;
        try {
            if (cursor != null) {
                try {
                    try {
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str3;
                        th2 = th;
                        str = str2;
                        StringBuilder sb32 = new StringBuilder();
                        sb32.append(str);
                        sb32.append(0);
                        if (cursor == null) {
                        }
                    }
                } catch (Exception e14) {
                    e = e14;
                    str2 = "deleteOverSizeTimeOnAppInfo: ";
                    str = str2;
                    try {
                        AbstractC23350e.m122774d(f118678q, e.toString());
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return arrayList;
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        StringBuilder sb322 = new StringBuilder();
                        sb322.append(str);
                        sb322.append(0);
                        if (cursor == null) {
                        }
                    }
                }
                if (cursor.moveToFirst()) {
                    int columnIndex = cursor.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    int columnIndex2 = cursor.getColumnIndex("duration");
                    int columnIndex3 = cursor.getColumnIndex("network_start_type");
                    int columnIndex4 = cursor.getColumnIndex("socket_status");
                    int columnIndex5 = cursor.getColumnIndex("source_type");
                    int columnIndex6 = cursor.getColumnIndex("time_start_session");
                    int columnIndex7 = cursor.getColumnIndex("time_gen_log");
                    int columnIndex8 = cursor.getColumnIndex("rowid");
                    while (true) {
                        try {
                            C23665v c23665v = new C23665v();
                            if (columnIndex != -1) {
                                i18 = cursor.getInt(columnIndex);
                            } else {
                                i18 = 0;
                            }
                            long j14 = 0;
                            if (columnIndex2 != -1) {
                                i11 = columnIndex;
                                i12 = columnIndex2;
                                j12 = cursor.getLong(columnIndex2);
                            } else {
                                i11 = columnIndex;
                                i12 = columnIndex2;
                                j12 = 0;
                            }
                            if (columnIndex3 != -1) {
                                try {
                                    i13 = columnIndex3;
                                    i19 = cursor.getInt(columnIndex3);
                                } catch (Exception e15) {
                                    e = e15;
                                    str2 = str3;
                                    i13 = columnIndex3;
                                    i14 = columnIndex4;
                                    i15 = columnIndex5;
                                    i16 = columnIndex6;
                                    i17 = columnIndex7;
                                    try {
                                        e.printStackTrace();
                                        if (cursor.moveToNext()) {
                                        }
                                        break;
                                        if (arrayList2.isEmpty()) {
                                        }
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str2);
                                        sb5.append(i23);
                                        if (cursor != null) {
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        str = str2;
                                        AbstractC23350e.m122774d(f118678q, e.toString());
                                        StringBuilder sb42 = new StringBuilder();
                                        sb42.append(str);
                                        sb42.append(0);
                                        if (cursor != null) {
                                        }
                                        return arrayList;
                                    }
                                    return arrayList;
                                }
                            } else {
                                i13 = columnIndex3;
                                i19 = 0;
                            }
                            if (columnIndex4 != -1) {
                                try {
                                    i14 = columnIndex4;
                                    i21 = cursor.getInt(columnIndex4);
                                } catch (Exception e17) {
                                    e = e17;
                                    str2 = str3;
                                    i14 = columnIndex4;
                                    i15 = columnIndex5;
                                    i16 = columnIndex6;
                                    i17 = columnIndex7;
                                    e.printStackTrace();
                                    if (cursor.moveToNext()) {
                                    }
                                    break;
                                    if (arrayList2.isEmpty()) {
                                    }
                                    StringBuilder sb52 = new StringBuilder();
                                    sb52.append(str2);
                                    sb52.append(i23);
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            } else {
                                i14 = columnIndex4;
                                i21 = 0;
                            }
                            if (columnIndex5 != -1) {
                                try {
                                    i15 = columnIndex5;
                                    i22 = cursor.getInt(columnIndex5);
                                } catch (Exception e18) {
                                    e = e18;
                                    str2 = str3;
                                    i15 = columnIndex5;
                                    i16 = columnIndex6;
                                    i17 = columnIndex7;
                                    e.printStackTrace();
                                    if (cursor.moveToNext()) {
                                    }
                                    break;
                                    if (arrayList2.isEmpty()) {
                                    }
                                    StringBuilder sb522 = new StringBuilder();
                                    sb522.append(str2);
                                    sb522.append(i23);
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            } else {
                                i15 = columnIndex5;
                                i22 = 0;
                            }
                            if (columnIndex6 != -1) {
                                try {
                                    str2 = str3;
                                    j13 = cursor.getLong(columnIndex6);
                                } catch (Exception e19) {
                                    e = e19;
                                    str2 = str3;
                                    i16 = columnIndex6;
                                    i17 = columnIndex7;
                                    e.printStackTrace();
                                    if (cursor.moveToNext()) {
                                    }
                                    break;
                                    if (arrayList2.isEmpty()) {
                                    }
                                    StringBuilder sb5222 = new StringBuilder();
                                    sb5222.append(str2);
                                    sb5222.append(i23);
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            } else {
                                str2 = str3;
                                j13 = 0;
                            }
                            if (columnIndex7 != -1) {
                                try {
                                    try {
                                        j14 = cursor.getLong(columnIndex7);
                                    } catch (Exception e21) {
                                        e = e21;
                                        i16 = columnIndex6;
                                        i17 = columnIndex7;
                                        e.printStackTrace();
                                        if (cursor.moveToNext()) {
                                        }
                                        break;
                                        if (arrayList2.isEmpty()) {
                                        }
                                        StringBuilder sb52222 = new StringBuilder();
                                        sb52222.append(str2);
                                        sb52222.append(i23);
                                        if (cursor != null) {
                                        }
                                        return arrayList;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    th2 = th;
                                    str = str2;
                                    StringBuilder sb3222 = new StringBuilder();
                                    sb3222.append(str);
                                    sb3222.append(0);
                                    if (cursor == null) {
                                    }
                                }
                            }
                            i16 = columnIndex6;
                            i17 = columnIndex7;
                            long j15 = j14;
                            if (columnIndex8 != -1) {
                                try {
                                    string = cursor.getString(columnIndex8);
                                } catch (Exception e22) {
                                    e = e22;
                                    e.printStackTrace();
                                    if (cursor.moveToNext()) {
                                    }
                                    break;
                                    if (arrayList2.isEmpty()) {
                                    }
                                    StringBuilder sb522222 = new StringBuilder();
                                    sb522222.append(str2);
                                    sb522222.append(i23);
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            } else {
                                string = "";
                            }
                            c23665v.f114654a = i18;
                            c23665v.f114640i = j12;
                            c23665v.f114641j = i19;
                            c23665v.f114642k = i21;
                            c23665v.f114657d = i22;
                            c23665v.f114643l = j13;
                            c23665v.f114656c = j15;
                            arrayList.add(c23665v);
                            arrayList2.add(string);
                        } catch (Exception e23) {
                            e = e23;
                            str2 = str3;
                            i11 = columnIndex;
                            i12 = columnIndex2;
                        }
                        if (cursor.moveToNext()) {
                            c24709a = this;
                            columnIndex = i11;
                            columnIndex2 = i12;
                            columnIndex3 = i13;
                            columnIndex4 = i14;
                            columnIndex5 = i15;
                            str3 = str2;
                            columnIndex6 = i16;
                            columnIndex7 = i17;
                        }
                        break;
                    }
                    if (arrayList2.isEmpty()) {
                        try {
                            i23 = this.f118680p.delete("time_on_app_info", " currentUserUid = ? AND rowid NOT IN " + ("('" + TextUtils.join("','", arrayList2) + "')"), new String[]{CoreUtility.f89233i});
                        } catch (Exception e24) {
                            e = e24;
                            str = str2;
                            AbstractC23350e.m122774d(f118678q, e.toString());
                            StringBuilder sb422 = new StringBuilder();
                            sb422.append(str);
                            sb422.append(0);
                            if (cursor != null) {
                            }
                            return arrayList;
                        } catch (Throwable th8) {
                            th = th8;
                            th2 = th;
                            str = str2;
                            StringBuilder sb32222 = new StringBuilder();
                            sb32222.append(str);
                            sb32222.append(0);
                            if (cursor == null) {
                            }
                        }
                    } else {
                        i23 = 0;
                    }
                    StringBuilder sb5222222 = new StringBuilder();
                    sb5222222.append(str2);
                    sb5222222.append(i23);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
            }
            break;
            if (arrayList2.isEmpty()) {
            }
            StringBuilder sb52222222 = new StringBuilder();
            sb52222222.append(str2);
            sb52222222.append(i23);
            if (cursor != null) {
            }
            return arrayList;
        } catch (Throwable th9) {
            th = th9;
            str = str2;
            th2 = th;
            StringBuilder sb322222 = new StringBuilder();
            sb322222.append(str);
            sb322222.append(0);
            if (cursor == null) {
            }
        }
        str2 = "deleteOverSizeTimeOnAppInfo: ";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
        if (i11 == 3 && i12 > 3) {
            try {
                sQLiteDatabase.execSQL("drop table if exists 'zalo_tracking_info_v3'");
            } catch (Exception e11) {
                C23952g.m125345j(f118678q, "Drop table: zalo_tracking_info_v3. Exception: " + e11.toString());
            }
        }
    }

    /* renamed from: q */
    public void m128314q() {
        try {
            this.f118680p.execSQL("delete from event_log");
            this.f118680p.execSQL("drop table if exists event_log");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[Catch: all -> 0x023a, Exception -> 0x0244, SYNTHETIC, TRY_LEAVE, TryCatch #19 {Exception -> 0x0244, all -> 0x023a, blocks: (B:59:0x024d, B:99:0x0222, B:107:0x026b, B:108:0x0282), top: B:58:0x024d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02a5 A[Catch: Exception -> 0x02e3, TryCatch #19 {Exception -> 0x02e3, blocks: (B:16:0x029f, B:18:0x02a5, B:20:0x02e7, B:68:0x02fb, B:70:0x0301, B:72:0x033a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02e7 A[Catch: Exception -> 0x02e3, TRY_LEAVE, TryCatch #19 {Exception -> 0x02e3, blocks: (B:16:0x029f, B:18:0x02a5, B:20:0x02e7, B:68:0x02fb, B:70:0x0301, B:72:0x033a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0254 A[LOOP:0: B:28:0x0144->B:61:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0253 A[EDGE_INSN: B:62:0x0253->B:63:0x0253 BREAK  A[LOOP:0: B:28:0x0144->B:61:0x0254], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0347 A[Catch: Exception -> 0x037f, TryCatch #10 {Exception -> 0x037f, blocks: (B:77:0x0341, B:79:0x0347, B:81:0x0383), top: B:76:0x0341 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0383 A[Catch: Exception -> 0x037f, TRY_LEAVE, TryCatch #10 {Exception -> 0x037f, blocks: (B:77:0x0341, B:79:0x0347, B:81:0x0383), top: B:76:0x0341 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0220 A[ADDED_TO_REGION] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m128315s(int i11, int i12) {
        String str;
        Throwable th2;
        Cursor cursor;
        Throwable th3;
        Cursor rawQuery;
        String str2;
        String str3;
        String str4;
        C23669z c23669z;
        int i13;
        int i14;
        int i15;
        int i16;
        Throwable th4;
        boolean z11;
        int i17;
        long j11;
        int i18;
        String str5 = "Delete invalid tracking log v2:  numRowDeleted=";
        String str6 = "zalo_tracking_info_v3";
        String str7 = "currentUserUid = ? AND type = ? AND time in (%s)";
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                try {
                } catch (Throwable th5) {
                    str = "currentUserUid = ? AND type = ? AND time in (%s)";
                    th2 = th5;
                    cursor = null;
                }
            } catch (Exception e11) {
                e = e11;
                str = "currentUserUid = ? AND type = ? AND time in (%s)";
                cursor = null;
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f118678q, e12);
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            try {
                if (!arrayList2.isEmpty()) {
                    int delete = this.f118680p.delete("zalo_tracking_info_v3", String.format(Locale.US, "currentUserUid = ? AND type = ? AND time in (%s)", arrayList2.toString().replace("[", "").replace("]", "")), new String[]{CoreUtility.f89233i, String.valueOf(i12)});
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Delete invalid tracking log v2:  numRowDeleted=");
                    sb2.append(delete);
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f(f118678q, e13);
            }
            return arrayList;
        }
        try {
            if (i11 > 0) {
                if (i12 > 0) {
                    if (i12 != 13) {
                        rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? AND type = ? LIMIT ? ", new String[]{CoreUtility.f89233i, String.valueOf(i12), String.valueOf(i11)});
                    } else {
                        rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? AND type = ? AND (param5 IS NULL OR CAST(param5 AS number) <= ?) LIMIT ? ", new String[]{CoreUtility.f89233i, String.valueOf(i12), String.valueOf(System.currentTimeMillis()), String.valueOf(i11)});
                    }
                } else {
                    rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? LIMIT ? ", new String[]{CoreUtility.f89233i, String.valueOf(i11)});
                }
            } else if (i12 > 0) {
                if (i12 != 13) {
                    rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? AND type = ? ", new String[]{CoreUtility.f89233i, String.valueOf(i12)});
                } else {
                    rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? AND type = ? AND (param5 IS NULL OR CAST(param5 AS number) <= ?)", new String[]{CoreUtility.f89233i, String.valueOf(i12), String.valueOf(System.currentTimeMillis())});
                }
            } else {
                rawQuery = this.f118680p.rawQuery("SELECT * FROM zalo_tracking_info_v3 WHERE currentUserUid = ? ", new String[]{CoreUtility.f89233i});
                cursor = rawQuery;
                if (cursor != null) {
                    try {
                    } catch (Exception e14) {
                        e = e14;
                        str = "currentUserUid = ? AND type = ? AND time in (%s)";
                    } catch (Throwable th6) {
                        th2 = th6;
                        str = "currentUserUid = ? AND type = ? AND time in (%s)";
                    }
                    if (cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("time");
                        int columnIndex2 = cursor.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        int columnIndex3 = cursor.getColumnIndex("sub_type");
                        int columnIndex4 = cursor.getColumnIndex("source");
                        str2 = "Delete invalid tracking log v2:  numRowDeleted=";
                        C23669z c23669z2 = null;
                        while (true) {
                            if (columnIndex2 != -1) {
                                try {
                                    try {
                                        i13 = columnIndex2;
                                        i14 = cursor.getInt(columnIndex2);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        str3 = str6;
                                        str4 = str7;
                                        c23669z = c23669z2;
                                        th4 = th;
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    str3 = str6;
                                    str4 = str7;
                                    i13 = columnIndex2;
                                    i15 = columnIndex4;
                                    i16 = columnIndex3;
                                    c23669z = c23669z2;
                                    try {
                                        String str8 = f118678q;
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Invalid tracking log: ");
                                        sb3.append(c23669z);
                                        AbstractC23350e.m122776f(str8, e);
                                        if (i12 == 13) {
                                        }
                                        c23669z2 = c23669z;
                                        if (!cursor.moveToNext()) {
                                        }
                                    } catch (Throwable th8) {
                                        th4 = th8;
                                        z11 = true;
                                        if (!z11) {
                                            if (i12 == 13) {
                                                if (c23669z != null) {
                                                    arrayList2.add("'" + c23669z.f114656c + "'");
                                                    throw th4;
                                                }
                                                throw th4;
                                            }
                                            throw th4;
                                        }
                                        throw th4;
                                    }
                                }
                            } else {
                                i13 = columnIndex2;
                                i14 = 0;
                            }
                            if (columnIndex3 != -1) {
                                try {
                                    i16 = columnIndex3;
                                    i17 = cursor.getInt(columnIndex3);
                                } catch (Exception e16) {
                                    e = e16;
                                    str3 = str6;
                                    str4 = str7;
                                    i15 = columnIndex4;
                                    i16 = columnIndex3;
                                    c23669z = c23669z2;
                                    String str82 = f118678q;
                                    StringBuilder sb32 = new StringBuilder();
                                    sb32.append("Invalid tracking log: ");
                                    sb32.append(c23669z);
                                    AbstractC23350e.m122776f(str82, e);
                                    if (i12 == 13) {
                                    }
                                    c23669z2 = c23669z;
                                    if (!cursor.moveToNext()) {
                                    }
                                }
                            } else {
                                i16 = columnIndex3;
                                i17 = 0;
                            }
                            if (columnIndex != -1) {
                                try {
                                    j11 = cursor.getLong(columnIndex);
                                } catch (Exception e17) {
                                    e = e17;
                                    str3 = str6;
                                    str4 = str7;
                                    i15 = columnIndex4;
                                    c23669z = c23669z2;
                                    String str822 = f118678q;
                                    StringBuilder sb322 = new StringBuilder();
                                    sb322.append("Invalid tracking log: ");
                                    sb322.append(c23669z);
                                    AbstractC23350e.m122776f(str822, e);
                                    if (i12 == 13) {
                                        arrayList2.add("'" + c23669z.f114656c + "'");
                                    }
                                    c23669z2 = c23669z;
                                    if (!cursor.moveToNext()) {
                                    }
                                }
                            } else {
                                j11 = 0;
                            }
                            str3 = str6;
                            str4 = str7;
                            long j12 = j11;
                            if (columnIndex4 != -1) {
                                try {
                                    try {
                                        i15 = columnIndex4;
                                        i18 = cursor.getInt(columnIndex4);
                                    } catch (Throwable th9) {
                                        th4 = th9;
                                        c23669z = c23669z2;
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    i15 = columnIndex4;
                                    c23669z = c23669z2;
                                    String str8222 = f118678q;
                                    StringBuilder sb3222 = new StringBuilder();
                                    sb3222.append("Invalid tracking log: ");
                                    sb3222.append(c23669z);
                                    AbstractC23350e.m122776f(str8222, e);
                                    if (i12 == 13 && c23669z != null) {
                                        arrayList2.add("'" + c23669z.f114656c + "'");
                                    }
                                    c23669z2 = c23669z;
                                    if (!cursor.moveToNext()) {
                                    }
                                }
                            } else {
                                i15 = columnIndex4;
                                i18 = 0;
                            }
                            try {
                                try {
                                    c23669z = C23669z.m123999b(i14, i17, i18);
                                    try {
                                        c23669z.f114654a = i14;
                                        c23669z.f114655b = i17;
                                        c23669z.f114656c = j12;
                                        c23669z.f114657d = i18;
                                        int i19 = 0;
                                        while (i19 < c23669z.f114658e) {
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("param");
                                            int i21 = i19 + 1;
                                            sb4.append(i21);
                                            int columnIndex5 = cursor.getColumnIndex(sb4.toString());
                                            if (columnIndex5 != -1) {
                                                c23669z.f114659f[i19] = cursor.getString(columnIndex5);
                                            }
                                            i19 = i21;
                                        }
                                        c23669z.mo123889c();
                                        if (c23669z.f114654a > 0) {
                                            arrayList.add(c23669z);
                                            if (i11 == 0) {
                                                AbstractC23668y.m123997f(i14, AbstractC23668y.m123995d(i14) + 1);
                                            }
                                        }
                                    } catch (Exception e19) {
                                        e = e19;
                                        String str82222 = f118678q;
                                        StringBuilder sb32222 = new StringBuilder();
                                        sb32222.append("Invalid tracking log: ");
                                        sb32222.append(c23669z);
                                        AbstractC23350e.m122776f(str82222, e);
                                        if (i12 == 13) {
                                        }
                                        c23669z2 = c23669z;
                                        if (!cursor.moveToNext()) {
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        th4 = th;
                                        z11 = false;
                                        if (!z11) {
                                        }
                                    }
                                } catch (Exception e21) {
                                    e = e21;
                                    c23669z = c23669z2;
                                    String str822222 = f118678q;
                                    StringBuilder sb322222 = new StringBuilder();
                                    sb322222.append("Invalid tracking log: ");
                                    sb322222.append(c23669z);
                                    AbstractC23350e.m122776f(str822222, e);
                                    if (i12 == 13) {
                                    }
                                    c23669z2 = c23669z;
                                    if (!cursor.moveToNext()) {
                                    }
                                }
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                                columnIndex2 = i13;
                                columnIndex3 = i16;
                                columnIndex4 = i15;
                                str7 = str4;
                                str6 = str3;
                            } catch (Exception e22) {
                                e = e22;
                                str5 = str2;
                                str = str4;
                                str6 = str3;
                                try {
                                    AbstractC23350e.m122776f(f118678q, e);
                                    if (!arrayList2.isEmpty()) {
                                        int delete2 = this.f118680p.delete(str6, String.format(Locale.US, str, arrayList2.toString().replace("[", "").replace("]", "")), new String[]{CoreUtility.f89233i, String.valueOf(i12)});
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str5);
                                        sb5.append(delete2);
                                    }
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return arrayList;
                                } catch (Throwable th11) {
                                    th3 = th11;
                                    th2 = th3;
                                    try {
                                        if (!arrayList2.isEmpty()) {
                                        }
                                        if (cursor != null) {
                                        }
                                    } catch (Exception e23) {
                                        AbstractC23350e.m122776f(f118678q, e23);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th12) {
                                th2 = th12;
                                str5 = str2;
                                str = str4;
                                str6 = str3;
                                if (!arrayList2.isEmpty()) {
                                }
                                if (cursor != null) {
                                }
                            }
                            c23669z2 = c23669z;
                        }
                        if (!arrayList2.isEmpty()) {
                            int delete3 = this.f118680p.delete(str3, String.format(Locale.US, str4, arrayList2.toString().replace("[", "").replace("]", "")), new String[]{CoreUtility.f89233i, String.valueOf(i12)});
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str2);
                            sb6.append(delete3);
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return arrayList;
                    }
                }
                str2 = "Delete invalid tracking log v2:  numRowDeleted=";
                str3 = "zalo_tracking_info_v3";
                str4 = "currentUserUid = ? AND type = ? AND time in (%s)";
                if (!arrayList2.isEmpty()) {
                }
                if (cursor != null) {
                }
                return arrayList;
            }
            cursor = rawQuery;
            if (cursor != null) {
            }
            str2 = "Delete invalid tracking log v2:  numRowDeleted=";
            str3 = "zalo_tracking_info_v3";
            str4 = "currentUserUid = ? AND type = ? AND time in (%s)";
            if (!arrayList2.isEmpty()) {
            }
            if (cursor != null) {
            }
            return arrayList;
        } catch (Throwable th13) {
            th3 = th13;
            str = "currentUserUid = ? AND type = ? AND time in (%s)";
            cursor = null;
            th2 = th3;
            if (!arrayList2.isEmpty()) {
                int delete4 = this.f118680p.delete(str6, String.format(Locale.US, str, arrayList2.toString().replace("[", "").replace("]", "")), new String[]{CoreUtility.f89233i, String.valueOf(i12)});
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str5);
                sb7.append(delete4);
            }
            if (cursor != null) {
                cursor.close();
                throw th2;
            }
            throw th2;
        }
    }

    /* renamed from: v */
    public List m128316v() {
        List<C23650g> m128300A = m128300A();
        for (C23650g c23650g : m128300A) {
            List<C23643a> m128317y = m128317y(c23650g.m123945a(), c23650g.m123951g(), 200);
            int size = m128317y.size();
            StringBuilder sb2 = new StringBuilder("");
            boolean z11 = true;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (C23643a c23643a : m128317y) {
                if (!c23643a.f114537e) {
                    i12++;
                }
                int i15 = (int) c23643a.f114538f;
                if (z11 || i15 < i13) {
                    i13 = i15;
                }
                if (i15 > i14) {
                    i14 = i15;
                }
                i11 += i15;
                if (z11) {
                    sb2.append(i15);
                    z11 = false;
                } else {
                    sb2.append(";");
                    sb2.append(i15);
                }
            }
            if (m128317y.size() > 0) {
                i11 /= m128317y.size();
            }
            c23650g.m123958n(size);
            c23650g.m123954j(i12);
            c23650g.m123956l(i13);
            c23650g.m123955k(i14);
            c23650g.m123953i(i11);
            c23650g.m123957m(sb2.toString());
        }
        return m128300A;
    }

    /* renamed from: y */
    public List m128317y(String str, String str2, int i11) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
                cursor = this.f118680p.rawQuery("SELECT  id, action_name, action_source, status, elapsed_time, param FROM event_log_new WHERE action_name = ? AND action_source = ? ORDER BY id DESC limit ?", new String[]{str, str2, i11 + ""});
                while (cursor.moveToNext()) {
                    arrayList.add(new C23643a(cursor.getString(cursor.getColumnIndex("action_name")), cursor.getString(cursor.getColumnIndex("action_source")), cursor.getLong(cursor.getColumnIndex("elapsed_time")), cursor.getString(cursor.getColumnIndex("status")).equals("true"), cursor.getString(cursor.getColumnIndex("param"))));
                }
                cursor.close();
            } catch (Exception e12) {
                e12.printStackTrace();
                if (cursor != null) {
                    cursor.close();
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
    }
}

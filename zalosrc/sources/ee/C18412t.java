package ee;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import ge.C19409a;
import ge.C19411c;
import ge.C19416h;
import ge.C19418j;
import ge.C19421m;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23149n0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ee.t */
/* loaded from: classes3.dex */
public class C18412t extends SQLiteOpenHelper {

    /* renamed from: p */
    private final SQLiteDatabase f92860p;

    /* renamed from: ee.t$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static C18412t f92861a = new C18412t(MainApplication.getAppContext());
    }

    public C18412t(Context context) {
        super(context, "zalo_calendar", (SQLiteDatabase.CursorFactory) null, 1);
        this.f92860p = context.openOrCreateDatabase("zalo_calendar", 0, null);
        m97568c();
        m97569d();
        m97571h();
        m97570f();
        int m97572t = m97572t();
        if (6 > m97572t) {
            m97567K(m97572t);
        }
    }

    /* renamed from: F */
    public static C18412t m97566F() {
        return a.f92861a;
    }

    /* renamed from: K */
    private void m97567K(int i11) {
        try {
            if (i11 < 2) {
                try {
                    AbstractC23149n0.m118853a(this.f92860p, "calendar_event_v9", "repeatInfo");
                    i11 = 2;
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    this.f92860p.execSQL("update db_version set version = " + i11 + " where 1");
                    return;
                }
            }
            if (i11 < 3) {
                AbstractC23149n0.m118853a(this.f92860p, "calendar_event_v9", "allDay");
                AbstractC23149n0.m118853a(this.f92860p, "calendar_event_v9", "orgStartTime");
                AbstractC23149n0.m118853a(this.f92860p, "calendar_event_v9", "orgEndTime");
                i11 = 3;
            }
            if (i11 < 4) {
                AbstractC23149n0.m118853a(this.f92860p, "calendar_event_v9", "attend");
            }
            this.f92860p.execSQL("update db_version set version = 6 where 1");
        } catch (Throwable th2) {
            this.f92860p.execSQL("update db_version set version = " + i11 + " where 1");
            throw th2;
        }
    }

    /* renamed from: c */
    private void m97568c() {
        if (!m97576J("db_version")) {
            this.f92860p.execSQL("create table db_version (version)");
            this.f92860p.execSQL("insert into db_version values (0)");
        }
    }

    /* renamed from: d */
    private void m97569d() {
        if (!m97576J("calendar_event_v9")) {
            this.f92860p.execSQL("create table calendar_event_v9 (currentUserUid, eventId, startTime, endTime, orgStartTime, orgEndTime, allDay, createTime, modifiedTime, remind, repeat, repeatInfo, calendarType, title, desc, creatorType, creatorProfile, ownerType, ownerId, eventType, eventData, eventStyle, responseSummary, attendees, location, attend)");
        }
    }

    /* renamed from: f */
    private void m97570f() {
        if (!m97576J("event_alarm_manager_v1")) {
            this.f92860p.execSQL("create table event_alarm_manager_v1 (currentUserUid, alarmId, eventId, startTime, remindTime)");
        }
    }

    /* renamed from: h */
    private void m97571h() {
        if (!m97576J("mute_calendar_v1")) {
            this.f92860p.execSQL("create table mute_calendar_v1 (currentUserUid, targetId, createdTime, duration, muteType)");
        }
    }

    /* renamed from: t */
    private int m97572t() {
        int columnIndex;
        int i11 = 0;
        try {
            Cursor rawQuery = this.f92860p.rawQuery("select version from db_version", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst() && (columnIndex = rawQuery.getColumnIndex("version")) >= 0) {
                        i11 = rawQuery.getInt(columnIndex);
                    }
                } finally {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return i11;
    }

    /* renamed from: A */
    public ArrayList m97573A(long j11, long j12) {
        return m97574E("(cast(startTime as LONG) >= " + j11 + " and cast(startTime as LONG) <= " + j12 + ") or (cast(startTime as LONG) = 0 and cast(createTime as LONG) >= " + j11 + " and cast(createTime as LONG) <= " + j12 + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02df A[LOOP:0: B:16:0x00db->B:101:0x02df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02fb A[EDGE_INSN: B:102:0x02fb->B:5:0x02fb BREAK  A[LOOP:0: B:16:0x00db->B:101:0x02df], SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m97574E(String str) {
        Throwable th2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C19411c c19411c;
        int i17;
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = this.f92860p.rawQuery("select * from calendar_event_v9 where (currentUserUid = '" + CoreUtility.f89233i + "' and (" + str + "))", new String[0]);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        int columnIndex = rawQuery.getColumnIndex("eventId");
                        int columnIndex2 = rawQuery.getColumnIndex("startTime");
                        int columnIndex3 = rawQuery.getColumnIndex("endTime");
                        int columnIndex4 = rawQuery.getColumnIndex("orgStartTime");
                        int columnIndex5 = rawQuery.getColumnIndex("orgEndTime");
                        int columnIndex6 = rawQuery.getColumnIndex("allDay");
                        int columnIndex7 = rawQuery.getColumnIndex("createTime");
                        int columnIndex8 = rawQuery.getColumnIndex("modifiedTime");
                        int columnIndex9 = rawQuery.getColumnIndex("remind");
                        int columnIndex10 = rawQuery.getColumnIndex("repeat");
                        int columnIndex11 = rawQuery.getColumnIndex("repeatInfo");
                        int columnIndex12 = rawQuery.getColumnIndex("calendarType");
                        int columnIndex13 = rawQuery.getColumnIndex("title");
                        ArrayList arrayList2 = arrayList;
                        try {
                            int columnIndex14 = rawQuery.getColumnIndex("desc");
                            int columnIndex15 = rawQuery.getColumnIndex("creatorType");
                            int columnIndex16 = rawQuery.getColumnIndex("creatorProfile");
                            int columnIndex17 = rawQuery.getColumnIndex("ownerType");
                            int columnIndex18 = rawQuery.getColumnIndex("ownerId");
                            int columnIndex19 = rawQuery.getColumnIndex("eventType");
                            int columnIndex20 = rawQuery.getColumnIndex("eventData");
                            int columnIndex21 = rawQuery.getColumnIndex("eventStyle");
                            int columnIndex22 = rawQuery.getColumnIndex(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                            int columnIndex23 = rawQuery.getColumnIndex("attend");
                            rawQuery.moveToFirst();
                            while (true) {
                                try {
                                    c19411c = new C19411c();
                                    i11 = columnIndex23;
                                } catch (Exception e11) {
                                    e = e11;
                                    i11 = columnIndex23;
                                }
                                try {
                                    c19411c.f96261a = rawQuery.getString(columnIndex);
                                    i12 = columnIndex13;
                                } catch (Exception e12) {
                                    e = e12;
                                    i12 = columnIndex13;
                                    i13 = columnIndex;
                                    arrayList = arrayList2;
                                    i14 = columnIndex15;
                                    i15 = columnIndex20;
                                    i16 = columnIndex12;
                                    AbstractC20110a.m104539h(e);
                                    if (!rawQuery.moveToNext()) {
                                    }
                                }
                                try {
                                    c19411c.f96262b = rawQuery.getLong(columnIndex2);
                                    c19411c.f96263c = rawQuery.getLong(columnIndex3);
                                    c19411c.f96264d = rawQuery.getLong(columnIndex4);
                                    c19411c.f96265e = rawQuery.getLong(columnIndex5);
                                    c19411c.f96266f = rawQuery.getInt(columnIndex6);
                                    c19411c.f96267g = rawQuery.getLong(columnIndex7);
                                    c19411c.f96268h = rawQuery.getLong(columnIndex8);
                                    String string = rawQuery.getString(columnIndex9);
                                    if (!TextUtils.isEmpty(string)) {
                                        try {
                                            JSONArray jSONArray = new JSONArray(string);
                                            c19411c.f96269i = new int[jSONArray.length()];
                                            i13 = columnIndex;
                                            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                                                try {
                                                    c19411c.f96269i[i18] = jSONArray.getInt(i18);
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    arrayList = arrayList2;
                                                    i14 = columnIndex15;
                                                    i15 = columnIndex20;
                                                    i16 = columnIndex12;
                                                    AbstractC20110a.m104539h(e);
                                                    if (!rawQuery.moveToNext()) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            arrayList = arrayList2;
                                            try {
                                                rawQuery.close();
                                                throw th2;
                                            } catch (Throwable th4) {
                                                th2.addSuppressed(th4);
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        i13 = columnIndex;
                                    }
                                    String string2 = rawQuery.getString(columnIndex10);
                                    if (!TextUtils.isEmpty(string2)) {
                                        c19411c.f96270j = new JSONArray(string2);
                                    }
                                    String string3 = rawQuery.getString(columnIndex11);
                                    if (!TextUtils.isEmpty(string3)) {
                                        c19411c.f96271k = new C19411c.c(string3);
                                    }
                                    c19411c.f96272l = rawQuery.getInt(columnIndex12);
                                    try {
                                        c19411c.f96273m = rawQuery.getString(i12);
                                        i17 = columnIndex14;
                                    } catch (Exception e14) {
                                        e = e14;
                                        i12 = i12;
                                    }
                                    try {
                                        c19411c.f96274n = rawQuery.getString(i17);
                                        i12 = i12;
                                        int i19 = columnIndex15;
                                        try {
                                            c19411c.f96276p = rawQuery.getInt(i19);
                                            columnIndex14 = i17;
                                            int i21 = columnIndex16;
                                            try {
                                                String string4 = rawQuery.getString(i21);
                                                if (!TextUtils.isEmpty(string4)) {
                                                    columnIndex16 = i21;
                                                    try {
                                                        jSONObject = new JSONObject(string4);
                                                        i16 = columnIndex12;
                                                        try {
                                                            i14 = i19;
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            i14 = i19;
                                                            arrayList = arrayList2;
                                                            i15 = columnIndex20;
                                                            AbstractC20110a.m104539h(e);
                                                            if (!rawQuery.moveToNext()) {
                                                            }
                                                        }
                                                    } catch (Exception e16) {
                                                        e = e16;
                                                        i16 = columnIndex12;
                                                        i14 = i19;
                                                        arrayList = arrayList2;
                                                        i15 = columnIndex20;
                                                        AbstractC20110a.m104539h(e);
                                                        if (!rawQuery.moveToNext()) {
                                                        }
                                                    }
                                                    try {
                                                        c19411c.f96275o = new InviteContactProfile(jSONObject.optString("id"), jSONObject.optString("avt"), jSONObject.optString("dpn"));
                                                    } catch (Exception e17) {
                                                        e = e17;
                                                        arrayList = arrayList2;
                                                        i15 = columnIndex20;
                                                        AbstractC20110a.m104539h(e);
                                                        if (!rawQuery.moveToNext()) {
                                                        }
                                                    }
                                                } else {
                                                    columnIndex16 = i21;
                                                    i16 = columnIndex12;
                                                    i14 = i19;
                                                }
                                                int i22 = columnIndex17;
                                                try {
                                                    c19411c.f96277q = rawQuery.getInt(i22);
                                                    int i23 = columnIndex18;
                                                    try {
                                                        c19411c.f96278r = rawQuery.getString(i23);
                                                        int i24 = columnIndex19;
                                                        try {
                                                            c19411c.f96279s = rawQuery.getInt(i24);
                                                            columnIndex17 = i22;
                                                            i15 = columnIndex20;
                                                            try {
                                                                String string5 = rawQuery.getString(i15);
                                                                if (!TextUtils.isEmpty(string5)) {
                                                                    c19411c.f96280t = string5;
                                                                    columnIndex18 = i23;
                                                                    try {
                                                                        columnIndex19 = i24;
                                                                    } catch (Exception e18) {
                                                                        e = e18;
                                                                        columnIndex19 = i24;
                                                                        arrayList = arrayList2;
                                                                        AbstractC20110a.m104539h(e);
                                                                        if (!rawQuery.moveToNext()) {
                                                                        }
                                                                    }
                                                                    try {
                                                                        c19411c.f96281u = new C19411c.a(new JSONObject(string5));
                                                                    } catch (Exception e19) {
                                                                        e = e19;
                                                                        arrayList = arrayList2;
                                                                        AbstractC20110a.m104539h(e);
                                                                        if (!rawQuery.moveToNext()) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    columnIndex18 = i23;
                                                                    columnIndex19 = i24;
                                                                }
                                                                int i25 = columnIndex21;
                                                                try {
                                                                    String string6 = rawQuery.getString(i25);
                                                                    if (!TextUtils.isEmpty(string6)) {
                                                                        columnIndex21 = i25;
                                                                        c19411c.f96282v = new C19411c.b(new JSONObject(string6));
                                                                    } else {
                                                                        columnIndex21 = i25;
                                                                    }
                                                                    int i26 = columnIndex22;
                                                                    try {
                                                                        String string7 = rawQuery.getString(i26);
                                                                        if (!TextUtils.isEmpty(string7)) {
                                                                            columnIndex22 = i26;
                                                                            c19411c.f96284x = new C19418j(new JSONObject(string7));
                                                                        } else {
                                                                            columnIndex22 = i26;
                                                                        }
                                                                        try {
                                                                            String string8 = rawQuery.getString(i11);
                                                                            if (!TextUtils.isEmpty(string8)) {
                                                                                i11 = i11;
                                                                                c19411c.f96285y = new C19409a(new JSONObject(string8));
                                                                            } else {
                                                                                i11 = i11;
                                                                            }
                                                                            arrayList = arrayList2;
                                                                        } catch (Exception e21) {
                                                                            e = e21;
                                                                            i11 = i11;
                                                                            arrayList = arrayList2;
                                                                            AbstractC20110a.m104539h(e);
                                                                            if (!rawQuery.moveToNext()) {
                                                                            }
                                                                        }
                                                                        try {
                                                                            arrayList.add(c19411c);
                                                                        } catch (Exception e22) {
                                                                            e = e22;
                                                                            AbstractC20110a.m104539h(e);
                                                                            if (!rawQuery.moveToNext()) {
                                                                            }
                                                                        }
                                                                    } catch (Exception e23) {
                                                                        e = e23;
                                                                        columnIndex22 = i26;
                                                                    }
                                                                } catch (Exception e24) {
                                                                    e = e24;
                                                                    columnIndex21 = i25;
                                                                }
                                                            } catch (Exception e25) {
                                                                e = e25;
                                                                columnIndex18 = i23;
                                                            }
                                                        } catch (Exception e26) {
                                                            e = e26;
                                                            columnIndex17 = i22;
                                                            columnIndex18 = i23;
                                                            columnIndex19 = i24;
                                                            arrayList = arrayList2;
                                                            i15 = columnIndex20;
                                                            AbstractC20110a.m104539h(e);
                                                            if (!rawQuery.moveToNext()) {
                                                            }
                                                        }
                                                    } catch (Exception e27) {
                                                        e = e27;
                                                        columnIndex17 = i22;
                                                        columnIndex18 = i23;
                                                    }
                                                } catch (Exception e28) {
                                                    e = e28;
                                                    columnIndex17 = i22;
                                                }
                                            } catch (Exception e29) {
                                                e = e29;
                                                columnIndex16 = i21;
                                            }
                                        } catch (Exception e31) {
                                            e = e31;
                                            columnIndex14 = i17;
                                        }
                                    } catch (Exception e32) {
                                        e = e32;
                                        i12 = i12;
                                        columnIndex14 = i17;
                                        arrayList = arrayList2;
                                        i14 = columnIndex15;
                                        i15 = columnIndex20;
                                        i16 = columnIndex12;
                                        AbstractC20110a.m104539h(e);
                                        if (!rawQuery.moveToNext()) {
                                        }
                                    }
                                } catch (Exception e33) {
                                    e = e33;
                                    i13 = columnIndex;
                                    arrayList = arrayList2;
                                    i14 = columnIndex15;
                                    i15 = columnIndex20;
                                    i16 = columnIndex12;
                                    AbstractC20110a.m104539h(e);
                                    if (!rawQuery.moveToNext()) {
                                    }
                                }
                                if (!rawQuery.moveToNext()) {
                                    break;
                                }
                                arrayList2 = arrayList;
                                columnIndex20 = i15;
                                columnIndex12 = i16;
                                columnIndex23 = i11;
                                columnIndex13 = i12;
                                columnIndex = i13;
                                columnIndex15 = i14;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            arrayList = arrayList2;
                            th2 = th;
                            rawQuery.close();
                            throw th2;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e34) {
            AbstractC20110a.m104539h(e34);
        }
        return arrayList;
    }

    /* renamed from: G */
    public ArrayList m97575G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Cursor cursor = null;
        try {
            if (arrayList != null) {
                try {
                    try {
                        if (arrayList.size() > 0) {
                            StringBuilder sb2 = new StringBuilder("(");
                            sb2.append("'");
                            sb2.append((String) arrayList.get(0));
                            sb2.append("'");
                            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                                sb2.append(", ");
                                sb2.append("'");
                                sb2.append((String) arrayList.get(i11));
                                sb2.append("'");
                            }
                            sb2.append(")");
                            cursor = this.f92860p.rawQuery("select * from mute_calendar_v1 where (currentUserUid = '" + CoreUtility.f89233i + "' and targetId IN " + sb2.toString() + ")", new String[0]);
                            if (cursor != null && cursor.getCount() > 0) {
                                int columnIndex = cursor.getColumnIndex("targetId");
                                int columnIndex2 = cursor.getColumnIndex("muteType");
                                int columnIndex3 = cursor.getColumnIndex("createdTime");
                                int columnIndex4 = cursor.getColumnIndex("duration");
                                cursor.moveToFirst();
                                do {
                                    try {
                                        C19421m c19421m = new C19421m();
                                        c19421m.f96356a = cursor.getString(columnIndex);
                                        c19421m.f96357b = cursor.getInt(columnIndex2);
                                        c19421m.f96358c = cursor.getLong(columnIndex3);
                                        c19421m.f96359d = cursor.getLong(columnIndex4);
                                        arrayList2.add(c19421m);
                                    } catch (Exception e11) {
                                        AbstractC20110a.m104539h(e11);
                                    }
                                } while (cursor.moveToNext());
                            }
                        }
                    } catch (Exception e12) {
                        AbstractC20110a.m104539h(e12);
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (Throwable th2) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e13) {
                            AbstractC20110a.m104539h(e13);
                        }
                    }
                    throw th2;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Exception e14) {
            AbstractC20110a.m104539h(e14);
        }
        return arrayList2;
    }

    /* renamed from: J */
    public boolean m97576J(String str) {
        boolean z11 = true;
        try {
            Cursor rawQuery = this.f92860p.rawQuery("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() == 0) {
                        z11 = false;
                    }
                } finally {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return z11;
    }

    /* renamed from: L */
    public void m97577L(ArrayList arrayList) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        try {
            try {
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C19411c c19411c = (C19411c) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("currentUserUid", CoreUtility.f89233i);
                            contentValues.put("eventId", c19411c.f96261a);
                            contentValues.put("startTime", Long.valueOf(c19411c.f96262b));
                            contentValues.put("endTime", Long.valueOf(c19411c.f96263c));
                            contentValues.put("orgStartTime", Long.valueOf(c19411c.f96264d));
                            contentValues.put("orgEndTime", Long.valueOf(c19411c.f96265e));
                            contentValues.put("allDay", Integer.valueOf(c19411c.f96266f));
                            contentValues.put("createTime", Long.valueOf(c19411c.f96267g));
                            contentValues.put("modifiedTime", Long.valueOf(c19411c.f96268h));
                            JSONArray jSONArray = new JSONArray();
                            if (c19411c.f96269i != null) {
                                int i11 = 0;
                                while (true) {
                                    int[] iArr = c19411c.f96269i;
                                    if (i11 >= iArr.length) {
                                        break;
                                    }
                                    jSONArray.put(iArr[i11]);
                                    i11++;
                                }
                            }
                            contentValues.put("remind", jSONArray.toString());
                            JSONArray jSONArray2 = c19411c.f96270j;
                            if (jSONArray2 != null) {
                                contentValues.put("repeat", jSONArray2.toString());
                            }
                            C19411c.c cVar = c19411c.f96271k;
                            if (cVar != null) {
                                contentValues.put("repeatInfo", cVar.m101543a().toString());
                            }
                            contentValues.put("calendarType", Integer.valueOf(c19411c.f96272l));
                            contentValues.put("title", c19411c.f96273m);
                            contentValues.put("desc", c19411c.f96274n);
                            contentValues.put("creatorType", Integer.valueOf(c19411c.f96276p));
                            InviteContactProfile inviteContactProfile = c19411c.f96275o;
                            if (inviteContactProfile != null) {
                                contentValues.put("creatorProfile", inviteContactProfile.m40487w1().toString());
                            }
                            contentValues.put("ownerType", Integer.valueOf(c19411c.f96277q));
                            contentValues.put("ownerId", c19411c.f96278r);
                            contentValues.put("eventType", Integer.valueOf(c19411c.f96279s));
                            String str = c19411c.f96280t;
                            if (str != null) {
                                contentValues.put("eventData", str);
                            } else {
                                C19411c.a aVar = c19411c.f96281u;
                                if (aVar != null) {
                                    contentValues.put("eventData", aVar.m101534a().toString());
                                }
                            }
                            C19411c.b bVar = c19411c.f96282v;
                            if (bVar != null) {
                                contentValues.put("eventStyle", bVar.m101542a().toString());
                            }
                            C19418j c19418j = c19411c.f96284x;
                            if (c19418j != null) {
                                contentValues.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, c19418j.m101555e().toString());
                            }
                            ArrayList arrayList2 = c19411c.f96283w;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                contentValues.put("attendees", "");
                            }
                            C19409a c19409a = c19411c.f96285y;
                            if (c19409a != null) {
                                contentValues.put("attend", c19409a.m101524a().toString());
                            }
                            if (this.f92860p.update("calendar_event_v9", contentValues, "currentUserUid = ? and eventId = ? and cast(startTime as LONG) = ?", new String[]{CoreUtility.f89233i, c19411c.f96261a, c19411c.f96262b + ""}) == 0) {
                                this.f92860p.insert("calendar_event_v9", null, contentValues);
                            }
                        }
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f92860p.isOpen()) {
                            this.f92860p.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                if (this.f92860p.isOpen()) {
                    this.f92860p.endTransaction();
                }
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: M */
    public void m97578M(ArrayList arrayList) {
        try {
            try {
                if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                    return;
                }
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C19416h c19416h = (C19416h) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("currentUserUid", CoreUtility.f89233i);
                            contentValues.put("alarmId", Integer.valueOf(c19416h.f96334a));
                            contentValues.put("eventId", c19416h.f96335b);
                            contentValues.put("startTime", Long.valueOf(c19416h.f96336c));
                            contentValues.put("remindTime", Long.valueOf(c19416h.f96337d));
                            if (this.f92860p.update("event_alarm_manager_v1", contentValues, "alarmId = ?", new String[]{c19416h.f96334a + ""}) == 0) {
                                this.f92860p.insert("event_alarm_manager_v1", null, contentValues);
                            }
                        }
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Throwable th2) {
            try {
                if (this.f92860p.isOpen()) {
                    this.f92860p.endTransaction();
                }
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
            }
            throw th2;
        }
    }

    /* renamed from: N */
    public void m97579N(ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                return;
            }
            try {
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C19421m c19421m = (C19421m) it.next();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("currentUserUid", CoreUtility.f89233i);
                            contentValues.put("targetId", c19421m.f96356a);
                            contentValues.put("muteType", Integer.valueOf(c19421m.f96357b));
                            contentValues.put("createdTime", Long.valueOf(c19421m.f96358c));
                            contentValues.put("duration", Long.valueOf(c19421m.f96359d));
                            if (this.f92860p.update("mute_calendar_v1", contentValues, "currentUserUid = ? and targetId = ? and cast(muteType as INT) = ?", new String[]{CoreUtility.f89233i, c19421m.f96356a, "" + c19421m.f96357b}) == 0) {
                                this.f92860p.insert("mute_calendar_v1", null, contentValues);
                            }
                        }
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Exception e12) {
                    AbstractC20110a.m104539h(e12);
                }
                throw th2;
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: a */
    public void m97580a() {
        try {
            this.f92860p.delete("calendar_event_v9", null, null);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b */
    public void m97581b() {
        try {
            try {
                try {
                    this.f92860p.beginTransaction();
                    this.f92860p.delete("event_alarm_manager_v1", null, null);
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Throwable th2) {
            try {
                if (this.f92860p.isOpen()) {
                    this.f92860p.endTransaction();
                }
            } catch (Exception e13) {
                AbstractC20110a.m104539h(e13);
            }
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f92860p) {
            this.f92860p.close();
        }
        super.close();
    }

    /* renamed from: i */
    public void m97582i(ArrayList arrayList) {
        if (!TextUtils.isEmpty(CoreUtility.f89233i) && arrayList != null) {
            try {
                if (arrayList.size() > 0) {
                    StringBuilder sb2 = new StringBuilder("(");
                    sb2.append("'");
                    sb2.append((String) arrayList.get(0));
                    sb2.append("'");
                    for (int i11 = 1; i11 < arrayList.size(); i11++) {
                        sb2.append(", ");
                        sb2.append("'");
                        sb2.append((String) arrayList.get(i11));
                        sb2.append("'");
                    }
                    sb2.append(")");
                    this.f92860p.delete("calendar_event_v9", "currentUserUid = ? and eventId IN " + ((Object) sb2), new String[]{CoreUtility.f89233i});
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: o */
    public void m97583o(ArrayList arrayList) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        try {
            try {
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            C1483e c1483e = (C1483e) arrayList.get(i11);
                            this.f92860p.delete("calendar_event_v9", "currentUserUid = ? and eventId = ? and cast(startTime as LONG) = ?", new String[]{CoreUtility.f89233i, (String) c1483e.f6374a, c1483e.f6375b + ""});
                        }
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f92860p.isOpen()) {
                            this.f92860p.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
            if (this.f92860p.isOpen()) {
                this.f92860p.endTransaction();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i11, int i12) {
    }

    /* renamed from: q */
    public void m97584q(ArrayList arrayList) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        try {
            try {
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null && arrayList.size() > 0) {
                        StringBuilder sb2 = new StringBuilder("(");
                        sb2.append("'");
                        sb2.append(arrayList.get(0));
                        sb2.append("'");
                        for (int i11 = 1; i11 < arrayList.size(); i11++) {
                            sb2.append(", ");
                            sb2.append("'");
                            sb2.append(arrayList.get(i11));
                            sb2.append("'");
                        }
                        sb2.append(")");
                        this.f92860p.delete("event_alarm_manager_v1", "currentUserUid = ? and alarmId IN " + sb2.toString(), new String[]{CoreUtility.f89233i});
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f92860p.isOpen()) {
                            this.f92860p.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
                if (this.f92860p.isOpen()) {
                    this.f92860p.endTransaction();
                }
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
        }
    }

    /* renamed from: r */
    public void m97585r(String str) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        try {
            this.f92860p.delete("calendar_event_v9", "currentUserUid = ? and ownerId = ?", new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: s */
    public void m97586s(ArrayList arrayList) {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        try {
            try {
                try {
                    this.f92860p.beginTransaction();
                    if (arrayList != null) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            C1483e c1483e = (C1483e) arrayList.get(i11);
                            this.f92860p.delete("mute_calendar_v1", "currentUserUid = ? and targetId = ? and cast(muteType as INT) = ?", new String[]{CoreUtility.f89233i, (String) c1483e.f6374a, c1483e.f6375b + ""});
                        }
                    }
                    this.f92860p.setTransactionSuccessful();
                    if (this.f92860p.isOpen()) {
                        this.f92860p.endTransaction();
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f92860p.isOpen()) {
                            this.f92860p.endTransaction();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.m104539h(e12);
            }
        } catch (Exception e13) {
            AbstractC20110a.m104539h(e13);
            if (this.f92860p.isOpen()) {
                this.f92860p.endTransaction();
            }
        }
    }

    /* renamed from: v */
    public ArrayList m97587v() {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor rawQuery = this.f92860p.rawQuery("select * from event_alarm_manager_v1 where (currentUserUid = '" + CoreUtility.f89233i + "')", new String[0]);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() > 0) {
                        int columnIndex = rawQuery.getColumnIndex("alarmId");
                        int columnIndex2 = rawQuery.getColumnIndex("eventId");
                        int columnIndex3 = rawQuery.getColumnIndex("startTime");
                        int columnIndex4 = rawQuery.getColumnIndex("remindTime");
                        rawQuery.moveToFirst();
                        do {
                            try {
                                arrayList.add(new C19416h(rawQuery.getInt(columnIndex), rawQuery.getString(columnIndex2), rawQuery.getLong(columnIndex3), rawQuery.getLong(columnIndex4)));
                            } catch (Exception e11) {
                                AbstractC20110a.m104539h(e11);
                            }
                        } while (rawQuery.moveToNext());
                    }
                } catch (Throwable th2) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
        }
        return arrayList;
    }

    /* renamed from: y */
    public ArrayList m97588y(int i11, String str, int i12) {
        return m97574E("ownerType = " + i11 + " and ownerId = '" + str + "' and eventType = " + i12);
    }
}

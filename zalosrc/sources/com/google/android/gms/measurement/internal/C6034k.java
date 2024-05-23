package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.measurement.C5283a3;
import com.google.android.gms.internal.measurement.C5300b3;
import com.google.android.gms.internal.measurement.C5317c3;
import com.google.android.gms.internal.measurement.C5334d3;
import com.google.android.gms.internal.measurement.C5346df;
import com.google.android.gms.internal.measurement.C5436j3;
import com.google.android.gms.internal.measurement.C5453k3;
import com.google.android.gms.internal.measurement.C5454k4;
import com.google.android.gms.internal.measurement.C5471l4;
import com.google.android.gms.internal.measurement.C5539p4;
import com.google.android.gms.internal.measurement.C5547pc;
import com.google.android.gms.internal.measurement.C5617te;
import com.google.android.gms.internal.measurement.C5641v4;
import com.google.android.gms.internal.measurement.C5658w4;
import com.google.android.gms.internal.measurement.C5684xd;
import com.google.android.gms.internal.measurement.C5690y2;
import com.google.android.gms.internal.measurement.C5707z2;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p008a2.C0061d;
import p230i6.AbstractC20325q;
import p230i6.AbstractC20326r;
import p230i6.AbstractC20327s;
import p230i6.AbstractC20331w;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes.dex */
public final class C6034k extends AbstractC6208z8 {

    /* renamed from: f */
    private static final String[] f34121f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f34122g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f34123h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};

    /* renamed from: i */
    private static final String[] f34124i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f34125j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f34126k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f34127l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f34128m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C6023j f34129d;

    /* renamed from: e */
    private final C6164v8 f34130e;

    public C6034k(C6055l9 c6055l9) {
        super(c6055l9);
        this.f34130e = new C6164v8(this.f34158a.mo31031a());
        this.f34158a.m31401z();
        this.f34129d = new C6023j(this, this.f34158a.mo31032b(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m30976H(ContentValues contentValues, String str, Object obj) {
        AbstractC4205o.m19718g("value");
        AbstractC4205o.m19722k(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m30977I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m30988P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j11 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j11;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e11) {
                this.f34158a.mo31033c().m31197q().m31110c("Database error", str, e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: K */
    private final long m30978K(String str, String[] strArr, long j11) {
        Cursor cursor = null;
        try {
            try {
                cursor = m30988P().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j12 = cursor.getLong(0);
                    cursor.close();
                    return j12;
                }
                cursor.close();
                return j11;
            } catch (SQLiteException e11) {
                this.f34158a.mo31033c().m31197q().m31110c("Database error", str, e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x007c: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:125), block:B:108:0x007c */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: G */
    public final void m30982G(String str, long j11, long j12, C6033j9 c6033j9) {
        ?? r42;
        Cursor cursor;
        String[] strArr;
        Cursor rawQuery;
        String string;
        String str2;
        String[] strArr2;
        String[] strArr3;
        AbstractC4205o.m19722k(c6033j9);
        mo31036g();
        m31504h();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m30988P = m30988P();
                r42 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r42 != 0) {
                        if (j12 != -1) {
                            strArr3 = new String[]{String.valueOf(j12), String.valueOf(j11)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j11)};
                        }
                        if (j12 != -1) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = m30988P.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            str3 = rawQuery.getString(0);
                            string = rawQuery.getString(1);
                            rawQuery.close();
                        }
                    } else {
                        if (j12 != -1) {
                            strArr = new String[]{null, String.valueOf(j12)};
                        } else {
                            strArr = new String[]{null};
                        }
                        if (j12 != -1) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = m30988P.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        String str6 = str5;
                        Cursor query = m30988P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f34158a.mo31033c().m31197q().m31109b("Raw event metadata record is missing. appId", C6082o3.m31193z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C5658w4 c5658w4 = (C5658w4) ((C5641v4) C6077n9.m31151C(C5658w4.m29872R1(), query.getBlob(0))).m29557k();
                                    if (query.moveToNext()) {
                                        this.f34158a.mo31033c().m31202w().m31109b("Get multiple raw event metadata records, expected one. appId", C6082o3.m31193z(str3));
                                    }
                                    query.close();
                                    AbstractC4205o.m19722k(c5658w4);
                                    c6033j9.f34116a = c5658w4;
                                    if (j12 != -1) {
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{str3, str6, String.valueOf(j12)};
                                    } else {
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{str3, str6};
                                    }
                                    Cursor query2 = m30988P.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr2, null, null, "rowid", null);
                                    if (!query2.moveToFirst()) {
                                        this.f34158a.mo31033c().m31202w().m31109b("Raw event data disappeared while in transaction. appId", C6082o3.m31193z(str3));
                                        query2.close();
                                        return;
                                    }
                                    do {
                                        long j13 = query2.getLong(0);
                                        try {
                                            C5454k4 c5454k4 = (C5454k4) C6077n9.m31151C(C5471l4.m29382E(), query2.getBlob(3));
                                            c5454k4.m29356x(query2.getString(1));
                                            c5454k4.m29343B(query2.getLong(2));
                                            if (!c6033j9.m30969a(j13, (C5471l4) c5454k4.m29557k())) {
                                                query2.close();
                                                return;
                                            }
                                        } catch (IOException e11) {
                                            this.f34158a.mo31033c().m31197q().m31110c("Data loss. Failed to merge raw event. appId", C6082o3.m31193z(str3), e11);
                                        }
                                    } while (query2.moveToNext());
                                    query2.close();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    r42 = str6;
                                    this.f34158a.mo31033c().m31197q().m31110c("Data loss. Error selecting raw event. appId", C6082o3.m31193z(str3), e);
                                    if (r42 != 0) {
                                        r42.close();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor2 = str6;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e13) {
                                this.f34158a.mo31033c().m31197q().m31110c("Data loss. Failed to merge raw event metadata. appId", C6082o3.m31193z(str3), e13);
                                query.close();
                            }
                        } catch (SQLiteException e14) {
                            e = e14;
                            str6 = query;
                        } catch (Throwable th3) {
                            th = th3;
                            str6 = query;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        r42 = cursor3;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                }
            } catch (SQLiteException e17) {
                e = e17;
                r42 = 0;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            cursor2 = cursor;
        }
    }

    /* renamed from: J */
    public final int m30983J(String str, String str2) {
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31504h();
        try {
            return m30988P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31111d("Error deleting conditional property", C6082o3.m31193z(str), this.f34158a.m31372D().m30966f(str2), e11);
            return 0;
        }
    }

    /* renamed from: L */
    public final long m30984L(String str, String str2) {
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g("first_open_count");
        mo31036g();
        m31504h();
        SQLiteDatabase m30988P = m30988P();
        m30988P.beginTransaction();
        long j11 = 0;
        try {
            try {
                long m30978K = m30978K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (m30978K == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m30988P.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.f34158a.mo31033c().m31197q().m31110c("Failed to insert column (got -1). appId", C6082o3.m31193z(str), "first_open_count");
                        return -1L;
                    }
                    m30978K = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + m30978K));
                    if (m30988P.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.f34158a.mo31033c().m31197q().m31110c("Failed to update column (got 0). appId", C6082o3.m31193z(str), "first_open_count");
                        return -1L;
                    }
                    m30988P.setTransactionSuccessful();
                    return m30978K;
                } catch (SQLiteException e11) {
                    e = e11;
                    j11 = m30978K;
                    this.f34158a.mo31033c().m31197q().m31111d("Error inserting column. appId", C6082o3.m31193z(str), "first_open_count", e);
                    m30988P.endTransaction();
                    return j11;
                }
            } finally {
                m30988P.endTransaction();
            }
        } catch (SQLiteException e12) {
            e = e12;
        }
    }

    /* renamed from: M */
    public final long m30985M() {
        return m30978K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: N */
    public final long m30986N() {
        return m30978K("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: O */
    public final long m30987O(String str) {
        AbstractC4205o.m19718g(str);
        return m30978K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: P */
    public final SQLiteDatabase m30988P() {
        mo31036g();
        try {
            return this.f34129d.getWritableDatabase();
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31202w().m31109b("Error opening database", e11);
            throw e11;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:58:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dc  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m30989Q(String str) {
        Cursor cursor;
        Cursor cursor2;
        mo31036g();
        m31504h();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m30988P().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
            } catch (SQLiteException e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    this.f34158a.mo31033c().m31201u().m31108a("Default event parameters not found");
                    cursor.close();
                    return null;
                }
                try {
                    C5471l4 c5471l4 = (C5471l4) ((C5454k4) C6077n9.m31151C(C5471l4.m29382E(), cursor.getBlob(0))).m29557k();
                    this.f34628b.m31085g0();
                    List<C5539p4> m29399I = c5471l4.m29399I();
                    Bundle bundle = new Bundle();
                    for (C5539p4 c5539p4 : m29399I) {
                        String m29518G = c5539p4.m29518G();
                        if (c5539p4.m29521U()) {
                            bundle.putDouble(m29518G, c5539p4.m29514A());
                        } else if (c5539p4.m29522V()) {
                            bundle.putFloat(m29518G, c5539p4.m29515B());
                        } else if (c5539p4.m29525Y()) {
                            bundle.putString(m29518G, c5539p4.m29519H());
                        } else if (c5539p4.m29523W()) {
                            bundle.putLong(m29518G, c5539p4.m29517D());
                        }
                    }
                    cursor.close();
                    return bundle;
                } catch (IOException e12) {
                    this.f34158a.mo31033c().m31197q().m31110c("Failed to retrieve default event parameters. appId", C6082o3.m31193z(str), e12);
                    cursor.close();
                    return null;
                }
            } catch (SQLiteException e13) {
                e = e13;
                this.f34158a.mo31033c().m31197q().m31109b("Error selecting default event parameters", e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02c3  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6084o5 m30990R(String str) {
        Cursor cursor;
        boolean z11;
        boolean z12;
        long j11;
        boolean z13;
        long j12;
        AbstractC4205o.m19718g(str);
        mo31036g();
        m31504h();
        Cursor cursor2 = null;
        try {
            z11 = false;
            cursor = m30988P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        try {
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                C6084o5 c6084o5 = new C6084o5(this.f34628b.m31079c0(), str);
                c6084o5.m31247i(cursor.getString(0));
                c6084o5.m31268x(cursor.getString(1));
                c6084o5.m31211G(cursor.getString(2));
                c6084o5.m31207C(cursor.getLong(3));
                c6084o5.m31208D(cursor.getLong(4));
                c6084o5.m31206B(cursor.getLong(5));
                c6084o5.m31251k(cursor.getString(6));
                c6084o5.m31249j(cursor.getString(7));
                c6084o5.m31269y(cursor.getLong(8));
                c6084o5.m31264t(cursor.getLong(9));
                if (cursor.isNull(10) || cursor.getInt(10) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c6084o5.m31209E(z12);
                c6084o5.m31263s(cursor.getLong(11));
                c6084o5.m31261q(cursor.getLong(12));
                c6084o5.m31260p(cursor.getLong(13));
                c6084o5.m31257n(cursor.getLong(14));
                c6084o5.m31255m(cursor.getLong(15));
                c6084o5.m31266v(cursor.getLong(16));
                if (cursor.isNull(17)) {
                    j11 = -2147483648L;
                } else {
                    j11 = cursor.getInt(17);
                }
                c6084o5.m31253l(j11);
                c6084o5.m31267w(cursor.getString(18));
                c6084o5.m31259o(cursor.getLong(19));
                c6084o5.m31262r(cursor.getLong(20));
                c6084o5.m31270z(cursor.getString(21));
                if (cursor.isNull(23) || cursor.getInt(23) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                c6084o5.m31245h(z13);
                c6084o5.m31243g(cursor.getString(24));
                if (cursor.isNull(25)) {
                    j12 = 0;
                } else {
                    j12 = cursor.getLong(25);
                }
                c6084o5.m31265u(j12);
                if (!cursor.isNull(26)) {
                    c6084o5.m31212H(Arrays.asList(cursor.getString(26).split(",", -1)));
                }
                C5617te.m29656b();
                if (this.f34158a.m31401z().m30913B(str, AbstractC5972e3.f33940q0) || this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33936o0)) {
                    c6084o5.m31213I(cursor.getString(28));
                }
                C5346df.m29069b();
                if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33944s0)) {
                    if (!cursor.isNull(29) && cursor.getInt(29) != 0) {
                        z11 = true;
                    }
                    c6084o5.m31214J(z11);
                }
                C5684xd.m30030b();
                if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33885G0)) {
                    c6084o5.m31215K(cursor.getLong(30));
                }
                c6084o5.m31239e();
                if (cursor.moveToNext()) {
                    this.f34158a.mo31033c().m31197q().m31109b("Got multiple records for app, expected one. appId", C6082o3.m31193z(str));
                }
                cursor.close();
                return c6084o5;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            this.f34158a.mo31033c().m31197q().m31110c("Error querying app. appId", C6082o3.m31193z(str), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0157  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac m30991S(String str, String str2) {
        Cursor cursor;
        boolean z11;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31504h();
        Cursor cursor2 = null;
        try {
            cursor = m30988P().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        try {
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                String string = cursor.getString(0);
                if (string == null) {
                    string = "";
                }
                String str3 = string;
                Object m30996Y = m30996Y(cursor, 1);
                if (cursor.getInt(2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                String string2 = cursor.getString(3);
                long j11 = cursor.getLong(4);
                C6077n9 m31085g0 = this.f34628b.m31085g0();
                byte[] blob = cursor.getBlob(5);
                Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                zzac zzacVar = new zzac(str, str3, new zzli(str2, cursor.getLong(8), m30996Y, str3), cursor.getLong(6), z11, string2, (zzaw) m31085g0.m31180z(blob, creator), j11, (zzaw) this.f34628b.m31085g0().m31180z(cursor.getBlob(7), creator), cursor.getLong(9), (zzaw) this.f34628b.m31085g0().m31180z(cursor.getBlob(10), creator));
                if (cursor.moveToNext()) {
                    this.f34158a.mo31033c().m31197q().m31110c("Got multiple records for conditional property, expected one", C6082o3.m31193z(str), this.f34158a.m31372D().m30966f(str2));
                }
                cursor.close();
                return zzacVar;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            this.f34158a.mo31033c().m31197q().m31111d("Error querying conditional property", C6082o3.m31193z(str), this.f34158a.m31372D().m30966f(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
    }

    /* renamed from: T */
    public final C6012i m30992T(long j11, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return m30993U(j11, str, 1L, false, false, z13, false, z15);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6012i m30993U(long j11, String str, long j12, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Cursor cursor;
        SQLiteDatabase m30988P;
        Cursor query;
        AbstractC4205o.m19718g(str);
        mo31036g();
        m31504h();
        String[] strArr = {str};
        C6012i c6012i = new C6012i();
        try {
            m30988P = m30988P();
            query = m30988P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (!query.moveToFirst()) {
                this.f34158a.mo31033c().m31202w().m31109b("Not updating daily counts, app is not known. appId", C6082o3.m31193z(str));
                query.close();
                return c6012i;
            }
            if (query.getLong(0) == j11) {
                c6012i.f34073b = query.getLong(1);
                c6012i.f34072a = query.getLong(2);
                c6012i.f34074c = query.getLong(3);
                c6012i.f34075d = query.getLong(4);
                c6012i.f34076e = query.getLong(5);
            }
            if (z11) {
                c6012i.f34073b += j12;
            }
            if (z12) {
                c6012i.f34072a += j12;
            }
            if (z13) {
                c6012i.f34074c += j12;
            }
            if (z14) {
                c6012i.f34075d += j12;
            }
            if (z15) {
                c6012i.f34076e += j12;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("day", Long.valueOf(j11));
            contentValues.put("daily_public_events_count", Long.valueOf(c6012i.f34072a));
            contentValues.put("daily_events_count", Long.valueOf(c6012i.f34073b));
            contentValues.put("daily_conversions_count", Long.valueOf(c6012i.f34074c));
            contentValues.put("daily_error_events_count", Long.valueOf(c6012i.f34075d));
            contentValues.put("daily_realtime_events_count", Long.valueOf(c6012i.f34076e));
            m30988P.update("apps", contentValues, "app_id=?", strArr);
            query.close();
            return c6012i;
        } catch (SQLiteException e12) {
            e = e12;
            cursor = query;
            try {
                this.f34158a.mo31033c().m31197q().m31110c("Error updating daily counts. appId", C6082o3.m31193z(str), e);
                if (cursor != null) {
                    cursor.close();
                }
                return c6012i;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6100q m30994V(String str, String str2) {
        Cursor cursor;
        boolean z11;
        long j11;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Boolean bool;
        long j12;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31504h();
        C0061d.c cVar = 0;
        try {
            try {
                z11 = false;
                cursor = m30988P().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (SQLiteException e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cVar != 0) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                long j13 = cursor.getLong(0);
                long j14 = cursor.getLong(1);
                long j15 = cursor.getLong(2);
                if (cursor.isNull(3)) {
                    j11 = 0;
                } else {
                    j11 = cursor.getLong(3);
                }
                if (cursor.isNull(4)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(cursor.getLong(4));
                }
                if (cursor.isNull(5)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(cursor.getLong(5));
                }
                if (cursor.isNull(6)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(cursor.getLong(6));
                }
                if (!cursor.isNull(7)) {
                    if (cursor.getLong(7) == 1) {
                        z11 = true;
                    }
                    bool = Boolean.valueOf(z11);
                } else {
                    bool = null;
                }
                if (cursor.isNull(8)) {
                    j12 = 0;
                } else {
                    j12 = cursor.getLong(8);
                }
                C6100q c6100q = new C6100q(str, str2, j13, j14, j12, j15, j11, valueOf, valueOf2, valueOf3, bool);
                if (cursor.moveToNext()) {
                    this.f34158a.mo31033c().m31197q().m31109b("Got multiple records for event aggregates, expected one. appId", C6082o3.m31193z(str));
                }
                cursor.close();
                return c6100q;
            } catch (SQLiteException e12) {
                e = e12;
                this.f34158a.mo31033c().m31197q().m31111d("Error querying events. appId", C6082o3.m31193z(str), this.f34158a.m31372D().m30964d(str2), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cVar = "current_bundle_count";
            if (cVar != 0) {
                cVar.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:123), block:B:27:0x007a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6099p9 m30995X(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31504h();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m30988P().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            } catch (SQLiteException e11) {
                e = e11;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor3 != null) {
                }
                throw th;
            }
            try {
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return null;
                }
                long j11 = cursor.getLong(0);
                Object m30996Y = m30996Y(cursor, 1);
                if (m30996Y == null) {
                    cursor.close();
                    return null;
                }
                C6099p9 c6099p9 = new C6099p9(str, cursor.getString(2), str2, j11, m30996Y);
                if (cursor.moveToNext()) {
                    this.f34158a.mo31033c().m31197q().m31109b("Got multiple records for user property, expected one. appId", C6082o3.m31193z(str));
                }
                cursor.close();
                return c6099p9;
            } catch (SQLiteException e12) {
                e = e12;
                this.f34158a.mo31033c().m31197q().m31111d("Error querying user property. appId", C6082o3.m31193z(str), this.f34158a.m31372D().m30966f(str2), e);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* renamed from: Y */
    final Object m30996Y(Cursor cursor, int i11) {
        int type = cursor.getType(i11);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f34158a.mo31033c().m31197q().m31109b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f34158a.mo31033c().m31197q().m31108a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i11);
                }
                return Double.valueOf(cursor.getDouble(i11));
            }
            return Long.valueOf(cursor.getLong(i11));
        }
        this.f34158a.mo31033c().m31197q().m31108a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m30997Z() {
        SQLiteException e11;
        Cursor cursor;
        SQLiteDatabase m30988P = m30988P();
        ?? r12 = 0;
        try {
            try {
                cursor = m30988P.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            } catch (SQLiteException e12) {
                e11 = e12;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (r12 != 0) {
                }
                throw th;
            }
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return null;
            } catch (SQLiteException e13) {
                e11 = e13;
                this.f34158a.mo31033c().m31197q().m31109b("Database error getting next bundle app id", e11);
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
        } catch (Throwable th3) {
            r12 = m30988P;
            th = th3;
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
    }

    /* renamed from: a0 */
    public final List m30998a0(String str, String str2, String str3) {
        AbstractC4205o.m19718g(str);
        mo31036g();
        m31504h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return m30999b0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:            r3 = r41.f34158a.mo31033c().m31197q();        r41.f34158a.m31401z();        r3.m31109b("Read more than the max allowed conditional properties, ignoring extra", 1000);     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192  */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m30999b0(String str, String[] strArr) {
        Cursor cursor;
        int i11;
        Cursor query;
        int i12;
        boolean z11;
        mo31036g();
        m31504h();
        ArrayList arrayList = new ArrayList();
        try {
            this.f34158a.m31401z();
            i11 = 4;
            query = m30988P().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
        } catch (SQLiteException e11) {
            e = e11;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        try {
            if (query.moveToFirst()) {
                while (true) {
                    int size = arrayList.size();
                    this.f34158a.m31401z();
                    if (size >= 1000) {
                        break;
                    }
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    String string3 = query.getString(2);
                    Object m30996Y = m30996Y(query, 3);
                    if (query.getInt(i11) != 0) {
                        i12 = 5;
                        z11 = true;
                    } else {
                        i12 = 5;
                        z11 = false;
                    }
                    String string4 = query.getString(i12);
                    long j11 = query.getLong(6);
                    C6077n9 m31085g0 = this.f34628b.m31085g0();
                    byte[] blob = query.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) m31085g0.m31180z(blob, creator);
                    arrayList.add(new zzac(string, string2, new zzli(string3, query.getLong(10), m30996Y, string2), query.getLong(8), z11, string4, zzawVar, j11, (zzaw) this.f34628b.m31085g0().m31180z(query.getBlob(9), creator), query.getLong(11), (zzaw) this.f34628b.m31085g0().m31180z(query.getBlob(12), creator)));
                    if (!query.moveToNext()) {
                        break;
                    }
                    i11 = 4;
                }
                query.close();
                return arrayList;
            }
            query.close();
            return arrayList;
        } catch (SQLiteException e12) {
            e = e12;
            cursor = query;
            try {
                this.f34158a.mo31033c().m31197q().m31109b("Error querying conditional user property value", e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = query;
            if (cursor != null) {
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List m31000c0(String str) {
        AbstractC4205o.m19718g(str);
        mo31036g();
        m31504h();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f34158a.m31401z();
                cursor = m30988P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j11 = cursor.getLong(2);
                    Object m30996Y = m30996Y(cursor, 3);
                    if (m30996Y == null) {
                        this.f34158a.mo31033c().m31197q().m31109b("Read invalid user property value, ignoring it. appId", C6082o3.m31193z(str));
                    } else {
                        arrayList.add(new C6099p9(str, str2, string, j11, m30996Y));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e11) {
                this.f34158a.mo31033c().m31197q().m31110c("Error querying user properties. appId", C6082o3.m31193z(str), e11);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:            r0 = r20.f34158a.mo31033c().m31197q();        r20.f34158a.m31401z();        r0.m31109b("Read more than the max allowed user properties, ignoring excess", 1000);     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m31001d0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        AbstractC4205o.m19718g(str);
        mo31036g();
        m31504h();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb2 = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb2.append(" and origin=?");
                        } catch (SQLiteException e11) {
                            e = e11;
                            cursor = null;
                            try {
                                this.f34158a.mo31033c().m31197q().m31111d("(2)Error querying user properties", C6082o3.m31193z(str), str4, e);
                                List emptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return emptyList;
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    } else {
                        str4 = str2;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb2.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String sb3 = sb2.toString();
                    this.f34158a.m31401z();
                    Cursor query = m30988P().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
                    try {
                        if (!query.moveToFirst()) {
                            query.close();
                            return arrayList;
                        }
                        while (true) {
                            int size = arrayList.size();
                            this.f34158a.m31401z();
                            if (size >= 1000) {
                                break;
                            }
                            String string = query.getString(0);
                            long j11 = query.getLong(1);
                            Object m30996Y = m30996Y(query, 2);
                            str4 = query.getString(3);
                            if (m30996Y == null) {
                                this.f34158a.mo31033c().m31197q().m31111d("(2)Read invalid user property value, ignoring it", C6082o3.m31193z(str), str4, str3);
                            } else {
                                arrayList.add(new C6099p9(str, str4, string, j11, m30996Y));
                            }
                            if (!query.moveToNext()) {
                                break;
                            }
                        }
                        query.close();
                        return arrayList;
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursor = query;
                        this.f34158a.mo31033c().m31197q().m31111d("(2)Error querying user properties", C6082o3.m31193z(str), str4, e);
                        List emptyList2 = Collections.emptyList();
                        if (cursor != null) {
                        }
                        return emptyList2;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = query;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    str4 = str2;
                    cursor = null;
                    this.f34158a.mo31033c().m31197q().m31111d("(2)Error querying user properties", C6082o3.m31193z(str), str4, e);
                    List emptyList22 = Collections.emptyList();
                    if (cursor != null) {
                    }
                    return emptyList22;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
        } catch (SQLiteException e14) {
            e = e14;
        }
    }

    /* renamed from: e0 */
    public final void m31002e0() {
        m31504h();
        m30988P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void m31003f0() {
        m31504h();
        m30988P().endTransaction();
    }

    /* renamed from: g0 */
    public final void m31004g0(List list) {
        mo31036g();
        m31504h();
        AbstractC4205o.m19722k(list);
        AbstractC4205o.m19724m(list.size());
        if (!m31014t()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (m30977I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.f34158a.mo31033c().m31202w().m31108a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            m30988P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31109b("Error incrementing retry count. error", e11);
        }
    }

    /* renamed from: h0 */
    public final void m31005h0() {
        mo31036g();
        m31504h();
        if (m31014t()) {
            long m31502a = this.f34628b.m31083e0().f34039e.m31502a();
            long mo105914b = this.f34158a.mo31031a().mo105914b();
            long abs = Math.abs(mo105914b - m31502a);
            this.f34158a.m31401z();
            if (abs > ((Long) AbstractC5972e3.f33872A.m30827a(null)).longValue()) {
                this.f34628b.m31083e0().f34039e.m31503b(mo105914b);
                mo31036g();
                m31504h();
                if (m31014t()) {
                    SQLiteDatabase m30988P = m30988P();
                    String valueOf = String.valueOf(this.f34158a.mo31031a().mo105913a());
                    this.f34158a.m31401z();
                    int delete = m30988P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(C5990g.m30910h())});
                    if (delete > 0) {
                        this.f34158a.mo31033c().m31201u().m31109b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        return false;
    }

    /* renamed from: l */
    public final void m31006l(String str, String str2) {
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        mo31036g();
        m31504h();
        try {
            m30988P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31111d("Error deleting user property. appId", C6082o3.m31193z(str), this.f34158a.m31372D().m30966f(str2), e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:            r9 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:            r9 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:            r0 = r23.f34158a.mo31033c().m31202w();        r9 = com.google.android.gms.measurement.internal.C6082o3.m31193z(r24);        r11 = java.lang.Integer.valueOf(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:            if (r12.m28919P() == false) goto L249;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:            r20 = java.lang.Integer.valueOf(r12.m28910B());     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:            r0.m31111d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));        r21 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:            r20 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:            r21 = r7;        r0 = r0.m30102H().iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:            if (r0.hasNext() == false) goto L362;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:            r3 = (com.google.android.gms.internal.measurement.C5453k3) r0.next();        m31504h();        mo31036g();        com.google.android.gms.common.internal.AbstractC4205o.m19718g(r24);        com.google.android.gms.common.internal.AbstractC4205o.m19722k(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:            if (r3.m29336E().isEmpty() == false) goto L276;     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f3, code lost:            r7 = r3.m29188f();        r11 = new android.content.ContentValues();        r11.put("app_id", r24);        r11.put("audience_id", java.lang.Integer.valueOf(r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030a, code lost:            if (r3.m29340J() == false) goto L279;     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030c, code lost:            r12 = java.lang.Integer.valueOf(r3.m29334A());     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0316, code lost:            r11.put("filter_id", r12);        r22 = r0;        r11.put("property_name", r3.m29336E());     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0328, code lost:            if (r3.m29341L() == false) goto L283;     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032a, code lost:            r0 = java.lang.Boolean.valueOf(r3.m29339I());     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0334, code lost:            r11.put("session_scoped", r0);        r11.put("data", r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0348, code lost:            if (m30988P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L291;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0360, code lost:            r0 = r22;     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034a, code lost:            r23.f34158a.mo31033c().m31197q().m31109b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r24));     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x035e, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0364, code lost:            r23.f34158a.mo31033c().m31197q().m31110c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r24), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0333, code lost:            r0 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0315, code lost:            r12 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:            r0 = r23.f34158a.mo31033c().m31202w();        r8 = com.google.android.gms.measurement.internal.C6082o3.m31193z(r24);        r9 = java.lang.Integer.valueOf(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:            if (r3.m29340J() == false) goto L274;     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:            r3 = java.lang.Integer.valueOf(r3.m29334A());     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ea, code lost:            r0.m31111d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e9, code lost:            r3 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:            r11 = r0.m30102H().iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:            if (r11.hasNext() == false) goto L347;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:            if (((com.google.android.gms.internal.measurement.C5453k3) r11.next()).m29340J() != false) goto L355;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:            r23.f34158a.mo31033c().m31202w().m31110c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r24), java.lang.Integer.valueOf(r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:            r11 = r0.m30101G().iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:            if (r11.hasNext() == false) goto L357;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:            r12 = (com.google.android.gms.internal.measurement.C5300b3) r11.next();        m31504h();        mo31036g();        com.google.android.gms.common.internal.AbstractC4205o.m19718g(r24);        com.google.android.gms.common.internal.AbstractC4205o.m19722k(r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:            if (r12.m28913G().isEmpty() == false) goto L251;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:            r3 = r12.m29188f();        r21 = r7;        r7 = new android.content.ContentValues();        r7.put("app_id", r24);        r7.put("audience_id", java.lang.Integer.valueOf(r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:            if (r12.m28919P() == false) goto L254;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:            r9 = java.lang.Integer.valueOf(r12.m28910B());     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:            r7.put("filter_id", r9);        r7.put("event_name", r12.m28913G());     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:            if (r12.m28920Q() == false) goto L258;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:            r9 = java.lang.Boolean.valueOf(r12.m28917N());     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:            r7.put("session_scoped", r9);        r7.put("data", r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:            if (m30988P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L359;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:            r23.f34158a.mo31033c().m31197q().m31109b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r24));     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:            r7 = r21;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:            r23.f34158a.mo31033c().m31197q().m31110c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C6082o3.m31193z(r24), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0377, code lost:            m31504h();        mo31036g();        com.google.android.gms.common.internal.AbstractC4205o.m19718g(r24);        r0 = m30988P();        r9 = r17;        r0.delete("property_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});        r0.delete("event_filters", r9, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});        r17 = r9;     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a7, code lost:            r7 = r21;     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31007m(String str, List list) {
        Integer num;
        boolean z11;
        String str2 = "app_id=? and audience_id=?";
        AbstractC4205o.m19722k(list);
        int i11 = 0;
        while (i11 < list.size()) {
            C5690y2 c5690y2 = (C5690y2) ((C5707z2) list.get(i11)).m29649i();
            if (c5690y2.m30036o() != 0) {
                int i12 = 0;
                while (i12 < c5690y2.m30036o()) {
                    C5283a3 c5283a3 = (C5283a3) c5690y2.m30040s(i12).m29649i();
                    C5283a3 c5283a32 = (C5283a3) c5283a3.clone();
                    String m106025b = AbstractC20325q.m106025b(c5283a3.m28864s());
                    if (m106025b != null) {
                        c5283a32.m28861p(m106025b);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i13 = 0;
                    while (i13 < c5283a3.m28860o()) {
                        C5334d3 m28863r = c5283a3.m28863r(i13);
                        C5283a3 c5283a33 = c5283a3;
                        String str3 = str2;
                        String m106027b = AbstractC20331w.m106027b(m28863r.m29048E(), AbstractC20326r.f100299a, AbstractC20326r.f100300b);
                        if (m106027b != null) {
                            C5317c3 c5317c3 = (C5317c3) m28863r.m29649i();
                            c5317c3.m28965o(m106027b);
                            c5283a32.m28862q(i13, (C5334d3) c5317c3.m29557k());
                            z11 = true;
                        }
                        i13++;
                        c5283a3 = c5283a33;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z11) {
                        c5690y2.m30038q(i12, c5283a32);
                        list.set(i11, (C5707z2) c5690y2.m29557k());
                    }
                    i12++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (c5690y2.m30037p() != 0) {
                for (int i14 = 0; i14 < c5690y2.m30037p(); i14++) {
                    C5453k3 m30041u = c5690y2.m30041u(i14);
                    String m106027b2 = AbstractC20331w.m106027b(m30041u.m29336E(), AbstractC20327s.f100303a, AbstractC20327s.f100304b);
                    if (m106027b2 != null) {
                        C5436j3 c5436j3 = (C5436j3) m30041u.m29649i();
                        c5436j3.m29271o(m106027b2);
                        c5690y2.m30039r(i14, c5436j3);
                        list.set(i11, (C5707z2) c5690y2.m29557k());
                    }
                }
            }
            i11++;
            str2 = str5;
        }
        String str6 = str2;
        m31504h();
        mo31036g();
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(list);
        SQLiteDatabase m30988P = m30988P();
        m30988P.beginTransaction();
        try {
            m31504h();
            mo31036g();
            AbstractC4205o.m19718g(str);
            SQLiteDatabase m30988P2 = m30988P();
            m30988P2.delete("property_filters", "app_id=?", new String[]{str});
            m30988P2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5707z2 c5707z2 = (C5707z2) it.next();
                m31504h();
                mo31036g();
                AbstractC4205o.m19718g(str);
                AbstractC4205o.m19722k(c5707z2);
                if (!c5707z2.m30103L()) {
                    this.f34158a.mo31033c().m31202w().m31109b("Audience with no ID. appId", C6082o3.m31193z(str));
                } else {
                    int m30096A = c5707z2.m30096A();
                    Iterator it2 = c5707z2.m30101G().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((C5300b3) it2.next()).m28919P()) {
                                this.f34158a.mo31033c().m31202w().m31110c("Event filter with no ID. Audience definition ignored. appId, audienceId", C6082o3.m31193z(str), Integer.valueOf(m30096A));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C5707z2 c5707z22 = (C5707z2) it3.next();
                if (c5707z22.m30103L()) {
                    num = Integer.valueOf(c5707z22.m30096A());
                } else {
                    num = null;
                }
                arrayList.add(num);
            }
            AbstractC4205o.m19718g(str);
            m31504h();
            mo31036g();
            SQLiteDatabase m30988P3 = m30988P();
            try {
                long m30977I = m30977I("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min(ZAbstractBase.ZVU_PROCESS_FLUSH, this.f34158a.m31401z().m30924n(str, AbstractC5972e3.f33886H)));
                if (m30977I > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList.size()) {
                            Integer num2 = (Integer) arrayList.get(i15);
                            if (num2 == null) {
                                break;
                            }
                            arrayList2.add(Integer.toString(num2.intValue()));
                            i15++;
                        } else {
                            m30988P3.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                            break;
                        }
                    }
                }
            } catch (SQLiteException e11) {
                this.f34158a.mo31033c().m31197q().m31110c("Database error querying filters. appId", C6082o3.m31193z(str), e11);
            }
            m30988P.setTransactionSuccessful();
            m30988P.endTransaction();
        } catch (Throwable th2) {
            m30988P.endTransaction();
            throw th2;
        }
    }

    /* renamed from: n */
    public final void m31008n() {
        m31504h();
        m30988P().setTransactionSuccessful();
    }

    /* renamed from: o */
    public final void m31009o(C6084o5 c6084o5) {
        AbstractC4205o.m19722k(c6084o5);
        mo31036g();
        m31504h();
        String m31248i0 = c6084o5.m31248i0();
        AbstractC4205o.m19722k(m31248i0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m31248i0);
        contentValues.put("app_instance_id", c6084o5.m31250j0());
        contentValues.put("gmp_app_id", c6084o5.m31258n0());
        contentValues.put("resettable_device_id_hash", c6084o5.m31233b());
        contentValues.put("last_bundle_index", Long.valueOf(c6084o5.m31236c0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c6084o5.m31238d0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c6084o5.m31234b0()));
        contentValues.put("app_version", c6084o5.m31254l0());
        contentValues.put("app_store", c6084o5.m31252k0());
        contentValues.put("gmp_version", Long.valueOf(c6084o5.m31232a0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c6084o5.m31228X()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c6084o5.m31217M()));
        contentValues.put("day", Long.valueOf(c6084o5.m31227W()));
        contentValues.put("daily_public_events_count", Long.valueOf(c6084o5.m31225U()));
        contentValues.put("daily_events_count", Long.valueOf(c6084o5.m31224T()));
        contentValues.put("daily_conversions_count", Long.valueOf(c6084o5.m31222R()));
        contentValues.put("config_fetched_time", Long.valueOf(c6084o5.m31221Q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c6084o5.m31230Z()));
        contentValues.put("app_version_int", Long.valueOf(c6084o5.m31220P()));
        contentValues.put("firebase_instance_id", c6084o5.m31256m0());
        contentValues.put("daily_error_events_count", Long.valueOf(c6084o5.m31223S()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c6084o5.m31226V()));
        contentValues.put("health_monitor_sample", c6084o5.m31231a());
        c6084o5.m31205A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c6084o5.m31216L()));
        contentValues.put("admob_app_id", c6084o5.m31244g0());
        contentValues.put("dynamite_version", Long.valueOf(c6084o5.m31229Y()));
        contentValues.put("session_stitching_token", c6084o5.m31235c());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c6084o5.m31219O()));
        contentValues.put("target_os_version", Long.valueOf(c6084o5.m31240e0()));
        List m31237d = c6084o5.m31237d();
        if (m31237d != null) {
            if (m31237d.isEmpty()) {
                this.f34158a.mo31033c().m31202w().m31109b("Safelisted events should not be an empty list. appId", m31248i0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m31237d));
            }
        }
        C5547pc.m29536b();
        if (this.f34158a.m31401z().m30913B(null, AbstractC5972e3.f33932m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m30988P = m30988P();
            if (m30988P.update("apps", contentValues, "app_id = ?", new String[]{m31248i0}) == 0 && m30988P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to insert/update app (got -1). appId", C6082o3.m31193z(m31248i0));
            }
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31110c("Error storing app. appId", C6082o3.m31193z(m31248i0), e11);
        }
    }

    /* renamed from: p */
    public final void m31010p(C6100q c6100q) {
        Long l11;
        AbstractC4205o.m19722k(c6100q);
        mo31036g();
        m31504h();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c6100q.f34343a);
        contentValues.put("name", c6100q.f34344b);
        contentValues.put("lifetime_count", Long.valueOf(c6100q.f34345c));
        contentValues.put("current_bundle_count", Long.valueOf(c6100q.f34346d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c6100q.f34348f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c6100q.f34349g));
        contentValues.put("last_bundled_day", c6100q.f34350h);
        contentValues.put("last_sampled_complex_event_id", c6100q.f34351i);
        contentValues.put("last_sampling_rate", c6100q.f34352j);
        contentValues.put("current_session_count", Long.valueOf(c6100q.f34347e));
        Boolean bool = c6100q.f34353k;
        if (bool != null && bool.booleanValue()) {
            l11 = 1L;
        } else {
            l11 = null;
        }
        contentValues.put("last_exempt_from_sampling", l11);
        try {
            if (m30988P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to insert/update event aggregates (got -1). appId", C6082o3.m31193z(c6100q.f34343a));
            }
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31110c("Error storing event aggregates. appId", C6082o3.m31193z(c6100q.f34343a), e11);
        }
    }

    /* renamed from: q */
    public final boolean m31011q() {
        if (m30977I("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m31012r() {
        if (m30977I("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m31013s() {
        if (m30977I("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    protected final boolean m31014t() {
        Context mo31032b = this.f34158a.mo31032b();
        this.f34158a.m31401z();
        return mo31032b.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: u */
    public final boolean m31015u(String str, Long l11, long j11, C5471l4 c5471l4) {
        mo31036g();
        m31504h();
        AbstractC4205o.m19722k(c5471l4);
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19722k(l11);
        byte[] m29188f = c5471l4.m29188f();
        this.f34158a.mo31033c().m31201u().m31110c("Saving complex main event, appId, data size", this.f34158a.m31372D().m30964d(str), Integer.valueOf(m29188f.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l11);
        contentValues.put("children_to_process", Long.valueOf(j11));
        contentValues.put("main_event", m29188f);
        try {
            if (m30988P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to insert complex main event (got -1). appId", C6082o3.m31193z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31110c("Error storing complex main event. appId", C6082o3.m31193z(str), e11);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean m31016w(zzac zzacVar) {
        AbstractC4205o.m19722k(zzacVar);
        mo31036g();
        m31504h();
        String str = zzacVar.f34664p;
        AbstractC4205o.m19722k(str);
        if (m30995X(str, zzacVar.f34666r.f34681q) == null) {
            long m30977I = m30977I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f34158a.m31401z();
            if (m30977I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.f34665q);
        contentValues.put("name", zzacVar.f34666r.f34681q);
        m30976H(contentValues, "value", AbstractC4205o.m19722k(zzacVar.f34666r.m31514t()));
        contentValues.put("active", Boolean.valueOf(zzacVar.f34668t));
        contentValues.put("trigger_event_name", zzacVar.f34669u);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f34671w));
        contentValues.put("timed_out_event", this.f34158a.m31381N().m31340e0(zzacVar.f34670v));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f34667s));
        contentValues.put("triggered_event", this.f34158a.m31381N().m31340e0(zzacVar.f34672x));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.f34666r.f34682r));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f34673y));
        contentValues.put("expired_event", this.f34158a.m31381N().m31340e0(zzacVar.f34674z));
        try {
            if (m30988P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to insert/update conditional user property (got -1)", C6082o3.m31193z(str));
                return true;
            }
            return true;
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31110c("Error storing conditional user property", C6082o3.m31193z(str), e11);
            return true;
        }
    }

    /* renamed from: x */
    public final boolean m31017x(C6099p9 c6099p9) {
        AbstractC4205o.m19722k(c6099p9);
        mo31036g();
        m31504h();
        if (m30995X(c6099p9.f34338a, c6099p9.f34340c) == null) {
            if (C6121r9.m31301Z(c6099p9.f34340c)) {
                if (m30977I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c6099p9.f34338a}) >= this.f34158a.m31401z().m30925o(c6099p9.f34338a, AbstractC5972e3.f33888I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c6099p9.f34340c)) {
                long m30977I = m30977I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c6099p9.f34338a, c6099p9.f34339b});
                this.f34158a.m31401z();
                if (m30977I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c6099p9.f34338a);
        contentValues.put("origin", c6099p9.f34339b);
        contentValues.put("name", c6099p9.f34340c);
        contentValues.put("set_timestamp", Long.valueOf(c6099p9.f34341d));
        m30976H(contentValues, "value", c6099p9.f34342e);
        try {
            if (m30988P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f34158a.mo31033c().m31197q().m31109b("Failed to insert/update user property (got -1). appId", C6082o3.m31193z(c6099p9.f34338a));
                return true;
            }
            return true;
        } catch (SQLiteException e11) {
            this.f34158a.mo31033c().m31197q().m31110c("Error storing user property. appId", C6082o3.m31193z(c6099p9.f34338a), e11);
            return true;
        }
    }
}

package p304ks;

import am.AbstractC0924m0;
import am.C0918j0;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import bn0.AbstractC2933b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23138m0;
import me0.AbstractC23149n0;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import p248iy.AbstractC20887g;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.C24848g0;

/* renamed from: ks.d */
/* loaded from: classes.dex */
public final class C21918d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0918j0 f107760a;

    /* renamed from: b */
    private final InterfaceC29232g f107761b;

    /* renamed from: c */
    private final Object f107762c;

    /* renamed from: ks.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ks.d$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {
        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11;
            try {
                z11 = C21918d.this.m114241s("contact_profile_zalo");
                C21923i.m114291c("isExistOldTblContactProfileFriend=" + z11);
            } catch (Exception e11) {
                C21923i.m114289a(e11);
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C21918d(C0918j0 c0918j0) {
        AbstractC19074t.m100208f(c0918j0, "db");
        this.f107760a = c0918j0;
        this.f107761b = AbstractC29233h.m145990a(new b());
        this.f107762c = new Object();
    }

    /* renamed from: b */
    private final void m114234b(String str, String str2, String str3) {
        List<String> m114238j = m114238j();
        if (!m114238j.isEmpty()) {
            for (String str4 : m114238j) {
                if (str4.length() > 0) {
                    if (str2.length() == 0) {
                        AbstractC23149n0.m118853a(this.f107760a.m2867h(), str4, str);
                    } else {
                        AbstractC23149n0.m118855c(this.f107760a.m2867h(), str4, str, str2, str3);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private final void m114235c(String str, String str2, String str3) {
        if (m114253r()) {
            if (str2.length() == 0) {
                AbstractC23149n0.m118853a(this.f107760a.m2867h(), "contact_profile_zalo", str);
            } else {
                AbstractC23149n0.m118855c(this.f107760a.m2867h(), "contact_profile_zalo", str, str2, str3);
            }
        }
    }

    /* renamed from: d */
    private final void m114236d(String str, String str2, String str3) {
        m114235c(str, str2, str3);
        m114234b(str, str2, str3);
    }

    /* renamed from: e */
    static /* synthetic */ void m114237e(C21918d c21918d, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        c21918d.m114236d(str, str2, str3);
    }

    /* renamed from: j */
    private final List m114238j() {
        ArrayList arrayList = new ArrayList();
        Cursor m2873n = this.f107760a.m2873n("SELECT name FROM sqlite_master WHERE type = 'table' AND name LIKE 'contact_profile_friend_%'", null);
        if (m2873n != null) {
            try {
                if (m2873n.getCount() > 0) {
                    m2873n.moveToFirst();
                    do {
                        String string = m2873n.getString(0);
                        if (string != null && string.length() != 0) {
                            AbstractC19074t.m100205c(string);
                            arrayList.add(string);
                        }
                    } while (m2873n.moveToNext());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(m2873n, null);
            } finally {
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static /* synthetic */ String m114239m(C21918d c21918d, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c21918d.m114249l(z11);
    }

    /* renamed from: n */
    private final String m114240n(String str) {
        if (str.length() > 0) {
            return "contact_profile_friend_" + str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:            if (r1 == null) goto L17;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m114241s(String str) {
        boolean z11 = false;
        Cursor cursor = null;
        try {
            try {
                cursor = this.f107760a.m2873n("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'", null);
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        z11 = true;
                    }
                }
            } catch (Exception e11) {
                C21923i.m114289a(e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: A */
    public final int m114242A(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str3, "tableName");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("phone", "");
            return this.f107760a.m2876q(str3, contentValues, " uid = ? and phone = ? ", new String[]{str, str2});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            return 0;
        }
    }

    /* renamed from: B */
    public final int m114243B(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str3, "tableName");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("phone", str2);
            return this.f107760a.m2876q(str3, contentValues, " uid = ? ", new String[]{str});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            return 0;
        }
    }

    /* renamed from: f */
    public final int m114244f(List list, String str) {
        AbstractC19074t.m100208f(list, "listUid");
        AbstractC19074t.m100208f(str, "tableName");
        try {
            if (list.isEmpty()) {
                return 0;
            }
            return this.f107760a.m2863d(str, " uid IN " + ("('" + TextUtils.join("','", list) + "')"), new String[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            return 0;
        }
    }

    /* renamed from: g */
    public final String m114245g(String str) {
        AbstractC19074t.m100208f(str, "currentUid");
        if (!TextUtils.isEmpty(str)) {
            String m114240n = m114240n(str);
            synchronized (this.f107762c) {
                try {
                    if (!m114241s(m114240n)) {
                        this.f107760a.m2865f("create table " + m114240n + " (uid primary key, dpn, usr, avt, ged, dob, phone, stt, cover, last_action, receive_type, timestamp, voice_url, type, detail_url, version_profile, group_msg, param1, param2, param3, isActive INTEGER, isZaloFriend INTEGER, typeProfile INTEGER, common_flag INTEGER DEFAULT 0, ex_data_1, username, avt_full, blacklist_info, globalId, account_type INTEGER, business_account, block_view_chat, dob_ts INTEGER, add_friend_description)");
                        if (m114241s(m114240n)) {
                            C21923i.m114291c("Create table success: " + m114240n);
                            AbstractC0924m0.m3761dp(true);
                        } else {
                            C21923i.m114291c("Create table fail: " + m114240n);
                            m114240n = "";
                        }
                    } else if (!AbstractC0924m0.m3020Ec()) {
                        AbstractC0924m0.m3761dp(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return m114240n;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* renamed from: h */
    public final void m114246h() {
        long currentTimeMillis;
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                currentTimeMillis2 = new StringBuilder();
            }
            if (!m114253r()) {
                return;
            }
            int m2863d = this.f107760a.m2863d("contact_profile_zalo", "1", null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("count: ");
            sb2.append(m2863d);
            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
            currentTimeMillis2 = new StringBuilder();
            currentTimeMillis2.append("cleanContactProfileLogout: ");
            currentTimeMillis2.append(currentTimeMillis);
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 80027, "", 0L, 80010, CoreUtility.f89236l);
        } finally {
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("cleanContactProfileLogout: ");
            sb3.append(currentTimeMillis3);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 80027, "", 0L, 80010, CoreUtility.f89236l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x038d, code lost:            if (r5 == null) goto L153;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x038f, code lost:            r5.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a0, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x039d, code lost:            if (r5 == null) goto L153;     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x01c2: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:451), block:B:201:0x01c2 */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035a A[LOOP:0: B:20:0x011b->B:89:0x035a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038d A[EDGE_INSN: B:90:0x038d->B:6:0x038d BREAK  A[LOOP:0: B:20:0x011b->B:89:0x035a], SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m114247i(String str) {
        Cursor cursor;
        String str2;
        ArrayList arrayList;
        Cursor cursor2;
        Cursor cursor3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        ContactProfile contactProfile;
        int i26;
        int i27;
        String str3;
        int i28;
        String string;
        String str4;
        int i29;
        String string2;
        AbstractC19074t.m100208f(str, "tableName");
        ArrayList arrayList2 = new ArrayList();
        try {
            try {
                cursor2 = this.f107760a.m2873n("select uid, dpn, usr, avt, ged, dob, phone, stt, cover, last_action, receive_type, timestamp, voice_url, type, detail_url, version_profile, group_msg, isActive, isZaloFriend, typeProfile, common_flag, username, avt_full, blacklist_info, globalId, account_type, business_account, add_friend_description, dob_ts from " + str + " where typeProfile = ? and uid <> ? and uid <> ? order by cast(last_action as number) desc LIMIT ?", new String[]{"1", "68386082", CoreUtility.f89233i, "3"});
                if (cursor2 != null) {
                    try {
                        if (cursor2.getCount() > 0) {
                            int columnIndex = cursor2.getColumnIndex("uid");
                            int columnIndex2 = cursor2.getColumnIndex("dpn");
                            int columnIndex3 = cursor2.getColumnIndex("usr");
                            int columnIndex4 = cursor2.getColumnIndex("avt");
                            int columnIndex5 = cursor2.getColumnIndex("ged");
                            int columnIndex6 = cursor2.getColumnIndex("dob");
                            int columnIndex7 = cursor2.getColumnIndex("phone");
                            int columnIndex8 = cursor2.getColumnIndex("stt");
                            int columnIndex9 = cursor2.getColumnIndex("cover");
                            int columnIndex10 = cursor2.getColumnIndex("last_action");
                            int columnIndex11 = cursor2.getColumnIndex("receive_type");
                            int columnIndex12 = cursor2.getColumnIndex("timestamp");
                            String str5 = "DatabaseFriendHelper";
                            try {
                                int columnIndex13 = cursor2.getColumnIndex("voice_url");
                                ArrayList arrayList3 = arrayList2;
                                try {
                                    int columnIndex14 = cursor2.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                                    int columnIndex15 = cursor2.getColumnIndex("detail_url");
                                    int columnIndex16 = cursor2.getColumnIndex("version_profile");
                                    int columnIndex17 = cursor2.getColumnIndex("group_msg");
                                    int columnIndex18 = cursor2.getColumnIndex("isActive");
                                    cursor2.getColumnIndex("isZaloFriend");
                                    int i31 = columnIndex13;
                                    int columnIndex19 = cursor2.getColumnIndex("typeProfile");
                                    int i32 = columnIndex12;
                                    int columnIndex20 = cursor2.getColumnIndex("common_flag");
                                    int columnIndex21 = cursor2.getColumnIndex("username");
                                    int columnIndex22 = cursor2.getColumnIndex("avt_full");
                                    int columnIndex23 = cursor2.getColumnIndex("blacklist_info");
                                    int columnIndex24 = cursor2.getColumnIndex("globalId");
                                    int columnIndex25 = cursor2.getColumnIndex("account_type");
                                    int columnIndex26 = cursor2.getColumnIndex("business_account");
                                    int columnIndex27 = cursor2.getColumnIndex("add_friend_description");
                                    int columnIndex28 = cursor2.getColumnIndex("dob_ts");
                                    cursor2.moveToFirst();
                                    while (true) {
                                        try {
                                            i26 = columnIndex28;
                                            try {
                                                contactProfile = new ContactProfile(cursor2.getString(columnIndex));
                                                contactProfile.f42437s = cursor2.getString(columnIndex2);
                                                contactProfile.f42443u = cursor2.getString(columnIndex3);
                                                contactProfile.f42446v = cursor2.getString(columnIndex4);
                                                contactProfile.f42455y = cursor2.getString(columnIndex7);
                                                contactProfile.f42458z = cursor2.getString(columnIndex8);
                                                i11 = columnIndex;
                                                i12 = columnIndex2;
                                                try {
                                                    contactProfile.f42336F = 1000 * cursor2.getLong(columnIndex10);
                                                    contactProfile.f42382U0 = cursor2.getInt(columnIndex18);
                                                    contactProfile.f42425n1 = cursor2.getInt(columnIndex19);
                                                    contactProfile.f42449w = cursor2.getInt(columnIndex5);
                                                    contactProfile.f42452x = cursor2.getString(columnIndex6);
                                                    contactProfile.f42324B = cursor2.getString(columnIndex9);
                                                    contactProfile.f42339G = cursor2.getInt(columnIndex11);
                                                    i27 = i32;
                                                    try {
                                                        contactProfile.f42330D = cursor2.getLong(i27);
                                                        i13 = i31;
                                                        try {
                                                            contactProfile.f42321A = cursor2.getString(i13);
                                                            i15 = columnIndex14;
                                                            i16 = columnIndex19;
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            i15 = columnIndex14;
                                                            i16 = columnIndex19;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        i15 = columnIndex14;
                                                        i16 = columnIndex19;
                                                        i18 = i27;
                                                        i13 = i31;
                                                        i19 = columnIndex20;
                                                        i14 = columnIndex21;
                                                        i21 = columnIndex11;
                                                        arrayList = arrayList3;
                                                        i17 = columnIndex17;
                                                        i22 = columnIndex16;
                                                        i23 = columnIndex15;
                                                        i24 = columnIndex18;
                                                        i25 = i26;
                                                        str2 = str5;
                                                        try {
                                                            AbstractC23350e.m122776f(str2, e);
                                                            if (!cursor2.moveToNext()) {
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            AbstractC23350e.m122776f(str2, e);
                                                        }
                                                    }
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    i15 = columnIndex14;
                                                    i16 = columnIndex19;
                                                    i13 = i31;
                                                    i18 = i32;
                                                }
                                                try {
                                                    contactProfile.f42352K0 = cursor2.getInt(i15);
                                                    int i33 = columnIndex15;
                                                    i24 = columnIndex18;
                                                    try {
                                                        contactProfile.f42355L0 = cursor2.getString(i33);
                                                        int i34 = columnIndex16;
                                                        i23 = i33;
                                                        try {
                                                            contactProfile.f42385V0 = cursor2.getInt(i34);
                                                            int i35 = columnIndex17;
                                                            i22 = i34;
                                                            try {
                                                                contactProfile.f42453x0 = cursor2.getInt(i35);
                                                                i17 = i35;
                                                                str3 = "";
                                                                i28 = columnIndex21;
                                                                if (i28 != -1) {
                                                                    try {
                                                                        string = cursor2.getString(i28);
                                                                    } catch (Exception e15) {
                                                                        e = e15;
                                                                        i14 = i28;
                                                                        i18 = i27;
                                                                        str2 = str5;
                                                                        i19 = columnIndex20;
                                                                        i25 = i26;
                                                                        i21 = columnIndex11;
                                                                        arrayList = arrayList3;
                                                                        AbstractC23350e.m122776f(str2, e);
                                                                        if (!cursor2.moveToNext()) {
                                                                        }
                                                                    }
                                                                } else {
                                                                    string = str3;
                                                                }
                                                            } catch (Exception e16) {
                                                                e = e16;
                                                                i17 = i35;
                                                                i18 = i27;
                                                                i19 = columnIndex20;
                                                                i14 = columnIndex21;
                                                            }
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            i18 = i27;
                                                            i17 = columnIndex17;
                                                            i19 = columnIndex20;
                                                            i14 = columnIndex21;
                                                            i22 = i34;
                                                            i21 = columnIndex11;
                                                        }
                                                    } catch (Exception e18) {
                                                        e = e18;
                                                        i17 = columnIndex17;
                                                        i19 = columnIndex20;
                                                        i14 = columnIndex21;
                                                        i25 = i26;
                                                        i21 = columnIndex11;
                                                        arrayList = arrayList3;
                                                        i22 = columnIndex16;
                                                        i23 = i33;
                                                        i18 = i27;
                                                    }
                                                } catch (Exception e19) {
                                                    e = e19;
                                                    i18 = i27;
                                                    i17 = columnIndex17;
                                                    i19 = columnIndex20;
                                                    i14 = columnIndex21;
                                                    i21 = columnIndex11;
                                                    arrayList = arrayList3;
                                                    i22 = columnIndex16;
                                                    i23 = columnIndex15;
                                                    i24 = columnIndex18;
                                                    i25 = i26;
                                                    str2 = str5;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (!cursor2.moveToNext()) {
                                                    }
                                                }
                                            } catch (Exception e21) {
                                                e = e21;
                                                i11 = columnIndex;
                                                i12 = columnIndex2;
                                                i13 = i31;
                                                i14 = columnIndex21;
                                                i15 = columnIndex14;
                                                i16 = columnIndex19;
                                                i17 = columnIndex17;
                                                i18 = i32;
                                                i19 = columnIndex20;
                                            }
                                        } catch (Exception e22) {
                                            e = e22;
                                            i11 = columnIndex;
                                            i12 = columnIndex2;
                                            i13 = i31;
                                            i14 = columnIndex21;
                                            i15 = columnIndex14;
                                            i16 = columnIndex19;
                                            i17 = columnIndex17;
                                            i18 = i32;
                                            i19 = columnIndex20;
                                            i21 = columnIndex11;
                                            arrayList = arrayList3;
                                            i22 = columnIndex16;
                                            i23 = columnIndex15;
                                            i24 = columnIndex18;
                                            i25 = columnIndex28;
                                        }
                                        try {
                                            contactProfile.f42460z1 = string;
                                            if (i28 != -1) {
                                                int i36 = columnIndex22;
                                                try {
                                                    columnIndex22 = i36;
                                                    str4 = cursor2.getString(i36);
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    columnIndex22 = i36;
                                                    i14 = i28;
                                                    i18 = i27;
                                                    str2 = str5;
                                                    i19 = columnIndex20;
                                                    i25 = i26;
                                                    i21 = columnIndex11;
                                                    arrayList = arrayList3;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (!cursor2.moveToNext()) {
                                                    }
                                                }
                                            } else {
                                                str4 = str3;
                                            }
                                            contactProfile.f42323A1 = str4;
                                            if (columnIndex20 >= 0) {
                                                i14 = i28;
                                                i29 = columnIndex20;
                                                i21 = columnIndex11;
                                                try {
                                                    contactProfile.m40399b1(cursor2.getLong(i29));
                                                } catch (Exception e24) {
                                                    e = e24;
                                                    i19 = i29;
                                                    i18 = i27;
                                                    str2 = str5;
                                                    arrayList = arrayList3;
                                                    i25 = i26;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (!cursor2.moveToNext()) {
                                                    }
                                                }
                                            } else {
                                                i14 = i28;
                                                i29 = columnIndex20;
                                                i21 = columnIndex11;
                                            }
                                            int i37 = columnIndex23;
                                            if (i37 != -1) {
                                                try {
                                                    str3 = cursor2.getString(i37);
                                                } catch (Exception e25) {
                                                    e = e25;
                                                    i19 = i29;
                                                    columnIndex23 = i37;
                                                    i18 = i27;
                                                    str2 = str5;
                                                    arrayList = arrayList3;
                                                    i25 = i26;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (!cursor2.moveToNext()) {
                                                    }
                                                }
                                            }
                                            try {
                                                contactProfile.m40428s1(str3);
                                                i19 = i29;
                                                int i38 = columnIndex24;
                                                if (i38 > -1) {
                                                    try {
                                                        contactProfile.m40407h1(cursor2.getString(i38));
                                                    } catch (Exception e26) {
                                                        e = e26;
                                                        columnIndex23 = i37;
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                        str2 = str5;
                                                        arrayList = arrayList3;
                                                        i25 = i26;
                                                        AbstractC23350e.m122776f(str2, e);
                                                        if (!cursor2.moveToNext()) {
                                                        }
                                                    }
                                                }
                                                columnIndex23 = i37;
                                                int i39 = columnIndex25;
                                                if (i39 > -1) {
                                                    try {
                                                        contactProfile.f42361N0 = cursor2.getInt(i39);
                                                    } catch (Exception e27) {
                                                        e = e27;
                                                        columnIndex25 = i39;
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                        str2 = str5;
                                                        arrayList = arrayList3;
                                                        i25 = i26;
                                                        AbstractC23350e.m122776f(str2, e);
                                                        if (!cursor2.moveToNext()) {
                                                        }
                                                    }
                                                }
                                                columnIndex25 = i39;
                                                int i41 = columnIndex26;
                                                if (i41 > -1) {
                                                    try {
                                                        contactProfile.f42364O0 = cursor2.getString(i41);
                                                    } catch (Exception e28) {
                                                        e = e28;
                                                        columnIndex26 = i41;
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                        str2 = str5;
                                                        arrayList = arrayList3;
                                                        i25 = i26;
                                                        AbstractC23350e.m122776f(str2, e);
                                                        if (!cursor2.moveToNext()) {
                                                        }
                                                    }
                                                }
                                                columnIndex26 = i41;
                                                int i42 = columnIndex27;
                                                if (i42 > -1) {
                                                    try {
                                                        string2 = cursor2.getString(i42);
                                                    } catch (Exception e29) {
                                                        e = e29;
                                                        columnIndex27 = i42;
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                        str2 = str5;
                                                        arrayList = arrayList3;
                                                        i25 = i26;
                                                        AbstractC23350e.m122776f(str2, e);
                                                        if (!cursor2.moveToNext()) {
                                                        }
                                                    }
                                                } else {
                                                    string2 = null;
                                                }
                                                try {
                                                    contactProfile.f42367P0 = string2;
                                                    columnIndex27 = i42;
                                                    i25 = i26;
                                                    if (i25 > -1) {
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                        try {
                                                            contactProfile.f42400b0 = cursor2.getLong(i25);
                                                        } catch (Exception e31) {
                                                            e = e31;
                                                            str2 = str5;
                                                            arrayList = arrayList3;
                                                            AbstractC23350e.m122776f(str2, e);
                                                            if (!cursor2.moveToNext()) {
                                                            }
                                                        }
                                                    } else {
                                                        columnIndex24 = i38;
                                                        i18 = i27;
                                                    }
                                                    arrayList = arrayList3;
                                                    try {
                                                        arrayList.add(contactProfile);
                                                        str2 = str5;
                                                    } catch (Exception e32) {
                                                        e = e32;
                                                        str2 = str5;
                                                        AbstractC23350e.m122776f(str2, e);
                                                        if (!cursor2.moveToNext()) {
                                                        }
                                                    }
                                                } catch (Exception e33) {
                                                    e = e33;
                                                    columnIndex27 = i42;
                                                    columnIndex24 = i38;
                                                    i18 = i27;
                                                    arrayList = arrayList3;
                                                    i25 = i26;
                                                    str2 = str5;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (!cursor2.moveToNext()) {
                                                    }
                                                }
                                            } catch (Exception e34) {
                                                e = e34;
                                                i19 = i29;
                                                columnIndex23 = i37;
                                            }
                                        } catch (Exception e35) {
                                            e = e35;
                                            i14 = i28;
                                            i18 = i27;
                                            i19 = columnIndex20;
                                            i25 = i26;
                                            i21 = columnIndex11;
                                            arrayList = arrayList3;
                                            str2 = str5;
                                            AbstractC23350e.m122776f(str2, e);
                                            if (!cursor2.moveToNext()) {
                                            }
                                        }
                                        if (!cursor2.moveToNext()) {
                                            break;
                                        }
                                        arrayList3 = arrayList;
                                        str5 = str2;
                                        columnIndex11 = i21;
                                        columnIndex21 = i14;
                                        columnIndex28 = i25;
                                        columnIndex18 = i24;
                                        columnIndex15 = i23;
                                        columnIndex16 = i22;
                                        columnIndex17 = i17;
                                        columnIndex20 = i19;
                                        i32 = i18;
                                        i31 = i13;
                                        columnIndex = i11;
                                        columnIndex19 = i16;
                                        columnIndex14 = i15;
                                        columnIndex2 = i12;
                                    }
                                } catch (Exception e36) {
                                    e = e36;
                                    str2 = str5;
                                    arrayList = arrayList3;
                                }
                            } catch (Exception e37) {
                                e = e37;
                                arrayList = arrayList2;
                                str2 = str5;
                            }
                        }
                    } catch (Exception e38) {
                        e = e38;
                        str2 = "DatabaseFriendHelper";
                        arrayList = arrayList2;
                    }
                }
                arrayList = arrayList2;
            } catch (Exception e39) {
                e = e39;
                str2 = "DatabaseFriendHelper";
                arrayList = arrayList2;
                cursor2 = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                if (cursor != null) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = cursor3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final String m114248k() {
        return m114239m(this, false, 1, null);
    }

    /* renamed from: l */
    public final String m114249l(boolean z11) {
        String str;
        String str2;
        String m118775b = AbstractC23138m0.Companion.m118775b();
        if (TextUtils.isEmpty(m118775b)) {
            if (!m114253r()) {
                return null;
            }
        } else {
            if (!AbstractC0924m0.m3020Ec()) {
                try {
                    str = m114245g(m118775b);
                } catch (Exception e11) {
                    AbstractC23350e.m122775e("ZFriend", "Friend", e11);
                    str = "";
                }
            } else {
                str = m114240n(m118775b);
            }
            if (TextUtils.isEmpty(str)) {
                if (m118775b.length() == 0) {
                    str2 = "empty";
                } else {
                    str2 = "not empty";
                }
                C21923i.m114289a(new Exception("Fail to create table NEW, currentUserUid is " + str2));
                if (!m114253r()) {
                    return null;
                }
            } else if (z11 || AbstractC0924m0.m3538W8() || !m114253r()) {
                return str;
            }
        }
        return "contact_profile_zalo";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(51:23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(4:41|42|43|(10:44|45|46|(2:215|216)(1:48)|49|50|(2:208|209)(1:52)|53|(3:55|56|57)(1:201)|58))|(5:174|175|(1:177)(1:194)|178|(35:180|181|182|183|(33:185|186|187|188|62|(2:168|169)|64|(2:166|167)|66|67|(2:153|154)|69|70|71|72|(2:145|146)|74|(2:140|141)|76|(2:135|136)|78|(3:126|127|(11:129|81|82|83|(3:85|86|87)(1:121)|88|89|90|91|92|(1:95)(1:94)))|80|81|82|83|(0)(0)|88|89|90|91|92|(0)(0))|61|62|(0)|64|(0)|66|67|(0)|69|70|71|72|(0)|74|(0)|76|(0)|78|(0)|80|81|82|83|(0)(0)|88|89|90|91|92|(0)(0)))|60|61|62|(0)|64|(0)|66|67|(0)|69|70|71|72|(0)|74|(0)|76|(0)|78|(0)|80|81|82|83|(0)(0)|88|89|90|91|92|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x031a, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x031d, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x031e, code lost:            r34 = r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0328, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0329, code lost:            r29 = r1;     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x03b5 A[Catch: Exception -> 0x03b9, TRY_ENTER, TRY_LEAVE, TryCatch #31 {Exception -> 0x03b9, blocks: (B:7:0x03b5, B:100:0x03cc), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x037e A[LOOP:0: B:23:0x0126->B:94:0x037e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b3 A[EDGE_INSN: B:95:0x03b3->B:6:0x03b3 BREAK  A[LOOP:0: B:23:0x0126->B:94:0x037e], SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m114250o(String str) {
        String str2;
        Throwable th2;
        Cursor cursor;
        Throwable th3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        ContactProfile contactProfile;
        int i23;
        String str3;
        String string;
        String string2;
        int i24;
        int i25;
        int i26;
        String str4;
        boolean m127126v;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        String string3;
        int i34;
        AbstractC19074t.m100208f(str, "tableName");
        ArrayList arrayList = new ArrayList();
        try {
            try {
                cursor = this.f107760a.m2873n("select uid, dpn, usr, avt, ged, dob, phone, stt, cover, last_action, receive_type, timestamp, voice_url, type, detail_url, version_profile, group_msg, isActive, isZaloFriend, typeProfile, common_flag, username, avt_full, param1, param2, blacklist_info, globalId, account_type, business_account, block_view_chat, add_friend_description, dob_ts from " + str + " where typeProfile = ?", new String[]{"1"});
            } catch (Exception e11) {
                e = e11;
                str2 = "DatabaseFriendHelper";
                cursor = null;
            } catch (Throwable th4) {
                str2 = "DatabaseFriendHelper";
                th2 = th4;
                cursor = null;
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(str2, e12);
        }
        if (cursor != null) {
            try {
            } catch (Exception e13) {
                e = e13;
                str2 = "DatabaseFriendHelper";
            } catch (Throwable th5) {
                th3 = th5;
                str2 = "DatabaseFriendHelper";
            }
            if (cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("uid");
                int columnIndex2 = cursor.getColumnIndex("dpn");
                int columnIndex3 = cursor.getColumnIndex("usr");
                int columnIndex4 = cursor.getColumnIndex("avt");
                int columnIndex5 = cursor.getColumnIndex("ged");
                int columnIndex6 = cursor.getColumnIndex("dob");
                int columnIndex7 = cursor.getColumnIndex("phone");
                int columnIndex8 = cursor.getColumnIndex("stt");
                int columnIndex9 = cursor.getColumnIndex("cover");
                int columnIndex10 = cursor.getColumnIndex("last_action");
                int columnIndex11 = cursor.getColumnIndex("receive_type");
                int columnIndex12 = cursor.getColumnIndex("timestamp");
                String str5 = "DatabaseFriendHelper";
                try {
                    try {
                        int columnIndex13 = cursor.getColumnIndex("voice_url");
                        ArrayList arrayList2 = arrayList;
                        try {
                            int columnIndex14 = cursor.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                            int columnIndex15 = cursor.getColumnIndex("detail_url");
                            int columnIndex16 = cursor.getColumnIndex("version_profile");
                            int columnIndex17 = cursor.getColumnIndex("group_msg");
                            int columnIndex18 = cursor.getColumnIndex("isActive");
                            cursor.getColumnIndex("isZaloFriend");
                            int i35 = columnIndex13;
                            int columnIndex19 = cursor.getColumnIndex("typeProfile");
                            int i36 = columnIndex12;
                            int columnIndex20 = cursor.getColumnIndex("common_flag");
                            int columnIndex21 = cursor.getColumnIndex("username");
                            int columnIndex22 = cursor.getColumnIndex("param1");
                            int columnIndex23 = cursor.getColumnIndex("param2");
                            int columnIndex24 = cursor.getColumnIndex("avt_full");
                            int columnIndex25 = cursor.getColumnIndex("blacklist_info");
                            int columnIndex26 = cursor.getColumnIndex("globalId");
                            int columnIndex27 = cursor.getColumnIndex("account_type");
                            int columnIndex28 = cursor.getColumnIndex("business_account");
                            int columnIndex29 = cursor.getColumnIndex("block_view_chat");
                            int columnIndex30 = cursor.getColumnIndex("add_friend_description");
                            int columnIndex31 = cursor.getColumnIndex("dob_ts");
                            cursor.moveToFirst();
                            int i37 = columnIndex31;
                            while (true) {
                                try {
                                    try {
                                        contactProfile = new ContactProfile(cursor.getString(columnIndex));
                                        contactProfile.f42437s = cursor.getString(columnIndex2);
                                        contactProfile.f42443u = cursor.getString(columnIndex3);
                                        contactProfile.f42446v = cursor.getString(columnIndex4);
                                        contactProfile.f42455y = cursor.getString(columnIndex7);
                                        contactProfile.f42458z = cursor.getString(columnIndex8);
                                        i12 = columnIndex;
                                        i13 = columnIndex2;
                                        try {
                                            contactProfile.f42336F = 1000 * cursor.getLong(columnIndex10);
                                            contactProfile.f42382U0 = cursor.getInt(columnIndex18);
                                            contactProfile.f42425n1 = cursor.getInt(columnIndex19);
                                            contactProfile.f42449w = cursor.getInt(columnIndex5);
                                            contactProfile.f42452x = cursor.getString(columnIndex6);
                                            contactProfile.f42324B = cursor.getString(columnIndex9);
                                            contactProfile.f42339G = cursor.getInt(columnIndex11);
                                            i16 = columnIndex19;
                                            i14 = i36;
                                            try {
                                                contactProfile.f42330D = cursor.getLong(i14);
                                                int i38 = i35;
                                                try {
                                                    contactProfile.f42321A = cursor.getString(i38);
                                                    i35 = i38;
                                                    int i39 = columnIndex14;
                                                    try {
                                                        contactProfile.f42352K0 = cursor.getInt(i39);
                                                        columnIndex14 = i39;
                                                        int i41 = columnIndex15;
                                                        try {
                                                            contactProfile.f42355L0 = cursor.getString(i41);
                                                            columnIndex15 = i41;
                                                            i23 = columnIndex16;
                                                        } catch (Exception e14) {
                                                            e = e14;
                                                            columnIndex15 = i41;
                                                        }
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        columnIndex14 = i39;
                                                    }
                                                } catch (Exception e16) {
                                                    e = e16;
                                                    i35 = i38;
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            i16 = columnIndex19;
                                            i11 = columnIndex18;
                                            arrayList = arrayList2;
                                            i14 = i36;
                                            i15 = columnIndex24;
                                            i19 = i37;
                                            i17 = columnIndex17;
                                            i18 = columnIndex22;
                                            i21 = columnIndex20;
                                            i22 = columnIndex10;
                                            str2 = str5;
                                            try {
                                                try {
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                } catch (Throwable th6) {
                                                    th3 = th6;
                                                    th2 = th3;
                                                    if (cursor != null) {
                                                    }
                                                }
                                            } catch (Exception e19) {
                                                e = e19;
                                                AbstractC23350e.m122776f(str2, e);
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                return arrayList;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th2 = th7;
                                        str2 = str5;
                                        if (cursor != null) {
                                            try {
                                                cursor.close();
                                                throw th2;
                                            } catch (Exception e21) {
                                                AbstractC23350e.m122776f(str2, e21);
                                                throw th2;
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Exception e22) {
                                    e = e22;
                                    i11 = columnIndex18;
                                    i12 = columnIndex;
                                    i13 = columnIndex2;
                                    arrayList = arrayList2;
                                    i14 = i36;
                                    i15 = columnIndex24;
                                    i16 = columnIndex19;
                                    i17 = columnIndex17;
                                }
                                try {
                                    contactProfile.f42385V0 = cursor.getInt(i23);
                                    columnIndex16 = i23;
                                    int i42 = columnIndex17;
                                    try {
                                        contactProfile.f42453x0 = cursor.getInt(i42);
                                        str3 = "";
                                        i17 = i42;
                                        i11 = columnIndex18;
                                        int i43 = columnIndex21;
                                        if (i43 <= -1) {
                                            string = "";
                                        } else {
                                            try {
                                                string = cursor.getString(i43);
                                            } catch (Exception e23) {
                                                e = e23;
                                                columnIndex21 = i43;
                                                arrayList = arrayList2;
                                                i18 = columnIndex22;
                                                i15 = columnIndex24;
                                                i19 = i37;
                                                i21 = columnIndex20;
                                                i22 = columnIndex10;
                                                str2 = str5;
                                                AbstractC23350e.m122776f(str2, e);
                                                if (cursor.moveToNext()) {
                                                }
                                            }
                                        }
                                        contactProfile.f42460z1 = string;
                                        columnIndex21 = i43;
                                        int i44 = columnIndex24;
                                        if (i44 <= -1) {
                                            string2 = "";
                                        } else {
                                            try {
                                                string2 = cursor.getString(i44);
                                            } catch (Exception e24) {
                                                e = e24;
                                                i15 = i44;
                                                arrayList = arrayList2;
                                                i18 = columnIndex22;
                                                i19 = i37;
                                                i21 = columnIndex20;
                                                i22 = columnIndex10;
                                                str2 = str5;
                                                AbstractC23350e.m122776f(str2, e);
                                                if (cursor.moveToNext()) {
                                                }
                                            }
                                        }
                                        contactProfile.f42323A1 = string2;
                                        if (columnIndex20 >= 0) {
                                            i15 = i44;
                                            i24 = columnIndex20;
                                            i22 = columnIndex10;
                                            try {
                                                contactProfile.m40399b1(cursor.getLong(i24));
                                            } catch (Exception e25) {
                                                e = e25;
                                                str2 = str5;
                                                arrayList = arrayList2;
                                                i18 = columnIndex22;
                                                i21 = i24;
                                                i19 = i37;
                                                AbstractC23350e.m122776f(str2, e);
                                                if (cursor.moveToNext()) {
                                                }
                                            }
                                        } else {
                                            i15 = i44;
                                            i24 = columnIndex20;
                                            i22 = columnIndex10;
                                        }
                                        i25 = columnIndex22;
                                    } catch (Exception e26) {
                                        e = e26;
                                        i17 = i42;
                                        i11 = columnIndex18;
                                    }
                                } catch (Exception e27) {
                                    e = e27;
                                    columnIndex16 = i23;
                                    i11 = columnIndex18;
                                    arrayList = arrayList2;
                                    i17 = columnIndex17;
                                    i18 = columnIndex22;
                                    i15 = columnIndex24;
                                    i19 = i37;
                                    i21 = columnIndex20;
                                    i22 = columnIndex10;
                                    str2 = str5;
                                    AbstractC23350e.m122776f(str2, e);
                                    if (cursor.moveToNext()) {
                                    }
                                }
                                if (i25 > -1) {
                                    try {
                                        if (TextUtils.isEmpty(cursor.getString(i25))) {
                                            str4 = "";
                                        } else {
                                            str4 = cursor.getString(i25);
                                        }
                                    } catch (Exception e28) {
                                        e = e28;
                                        i21 = i24;
                                    }
                                    if (!TextUtils.isEmpty(str4)) {
                                        i21 = i24;
                                        try {
                                            m127126v = AbstractC24341v.m127126v(str4, "null", true);
                                        } catch (Exception e29) {
                                            e = e29;
                                            i26 = i25;
                                            i27 = columnIndex29;
                                            try {
                                                e.printStackTrace();
                                                columnIndex29 = i27;
                                                i28 = columnIndex25;
                                                if (i28 > -1) {
                                                }
                                                contactProfile.m40428s1(str3);
                                                columnIndex25 = i28;
                                                i29 = columnIndex26;
                                                if (i29 > -1) {
                                                }
                                                columnIndex26 = i29;
                                                i31 = columnIndex27;
                                                if (i31 > -1) {
                                                }
                                                columnIndex27 = i31;
                                                i32 = columnIndex28;
                                                if (i32 > -1) {
                                                }
                                                columnIndex28 = i32;
                                                i33 = columnIndex30;
                                                if (i33 > -1) {
                                                }
                                                string3 = null;
                                                contactProfile.f42367P0 = string3;
                                                columnIndex30 = i33;
                                                i19 = i37;
                                                if (i19 <= -1) {
                                                }
                                                arrayList = arrayList2;
                                                arrayList.add(contactProfile);
                                                str2 = str5;
                                            } catch (Exception e31) {
                                                e = e31;
                                                columnIndex29 = i27;
                                                i18 = i26;
                                                arrayList = arrayList2;
                                                i19 = i37;
                                                str2 = str5;
                                                AbstractC23350e.m122776f(str2, e);
                                                if (cursor.moveToNext()) {
                                                }
                                            }
                                            if (cursor.moveToNext()) {
                                            }
                                        }
                                        if (!m127126v) {
                                            AbstractC19074t.m100205c(str4);
                                            i26 = i25;
                                            try {
                                                contactProfile.f42347I1 = Long.parseLong(str4);
                                                i34 = columnIndex23;
                                                if (i34 > -1) {
                                                    try {
                                                        contactProfile.f42394Y0 = cursor.getInt(i34);
                                                    } catch (Exception e32) {
                                                        e = e32;
                                                        columnIndex23 = i34;
                                                        i27 = columnIndex29;
                                                        e.printStackTrace();
                                                        columnIndex29 = i27;
                                                        i28 = columnIndex25;
                                                        if (i28 > -1) {
                                                        }
                                                        contactProfile.m40428s1(str3);
                                                        columnIndex25 = i28;
                                                        i29 = columnIndex26;
                                                        if (i29 > -1) {
                                                        }
                                                        columnIndex26 = i29;
                                                        i31 = columnIndex27;
                                                        if (i31 > -1) {
                                                        }
                                                        columnIndex27 = i31;
                                                        i32 = columnIndex28;
                                                        if (i32 > -1) {
                                                        }
                                                        columnIndex28 = i32;
                                                        i33 = columnIndex30;
                                                        if (i33 > -1) {
                                                        }
                                                        string3 = null;
                                                        contactProfile.f42367P0 = string3;
                                                        columnIndex30 = i33;
                                                        i19 = i37;
                                                        if (i19 <= -1) {
                                                        }
                                                        arrayList = arrayList2;
                                                        arrayList.add(contactProfile);
                                                        str2 = str5;
                                                        if (cursor.moveToNext()) {
                                                        }
                                                    }
                                                }
                                                columnIndex23 = i34;
                                                i27 = columnIndex29;
                                                if (i27 > -1) {
                                                    try {
                                                        contactProfile.f42415i1 = cursor.getInt(i27);
                                                    } catch (Exception e33) {
                                                        e = e33;
                                                        e.printStackTrace();
                                                        columnIndex29 = i27;
                                                        i28 = columnIndex25;
                                                        if (i28 > -1) {
                                                        }
                                                        contactProfile.m40428s1(str3);
                                                        columnIndex25 = i28;
                                                        i29 = columnIndex26;
                                                        if (i29 > -1) {
                                                        }
                                                        columnIndex26 = i29;
                                                        i31 = columnIndex27;
                                                        if (i31 > -1) {
                                                        }
                                                        columnIndex27 = i31;
                                                        i32 = columnIndex28;
                                                        if (i32 > -1) {
                                                        }
                                                        columnIndex28 = i32;
                                                        i33 = columnIndex30;
                                                        if (i33 > -1) {
                                                        }
                                                        string3 = null;
                                                        contactProfile.f42367P0 = string3;
                                                        columnIndex30 = i33;
                                                        i19 = i37;
                                                        if (i19 <= -1) {
                                                        }
                                                        arrayList = arrayList2;
                                                        arrayList.add(contactProfile);
                                                        str2 = str5;
                                                        if (cursor.moveToNext()) {
                                                        }
                                                    }
                                                }
                                                contactProfile.m40427r1();
                                            } catch (Exception e34) {
                                                e = e34;
                                                i27 = columnIndex29;
                                                e.printStackTrace();
                                                columnIndex29 = i27;
                                                i28 = columnIndex25;
                                                if (i28 > -1) {
                                                }
                                                contactProfile.m40428s1(str3);
                                                columnIndex25 = i28;
                                                i29 = columnIndex26;
                                                if (i29 > -1) {
                                                }
                                                columnIndex26 = i29;
                                                i31 = columnIndex27;
                                                if (i31 > -1) {
                                                }
                                                columnIndex27 = i31;
                                                i32 = columnIndex28;
                                                if (i32 > -1) {
                                                }
                                                columnIndex28 = i32;
                                                i33 = columnIndex30;
                                                if (i33 > -1) {
                                                }
                                                string3 = null;
                                                contactProfile.f42367P0 = string3;
                                                columnIndex30 = i33;
                                                i19 = i37;
                                                if (i19 <= -1) {
                                                }
                                                arrayList = arrayList2;
                                                arrayList.add(contactProfile);
                                                str2 = str5;
                                                if (cursor.moveToNext()) {
                                                }
                                            }
                                            columnIndex29 = i27;
                                            i28 = columnIndex25;
                                            if (i28 > -1) {
                                                try {
                                                    str3 = cursor.getString(i28);
                                                } catch (Exception e35) {
                                                    e = e35;
                                                    columnIndex25 = i28;
                                                    i18 = i26;
                                                    str2 = str5;
                                                    arrayList = arrayList2;
                                                    i19 = i37;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                }
                                            }
                                            contactProfile.m40428s1(str3);
                                            columnIndex25 = i28;
                                            i29 = columnIndex26;
                                            if (i29 > -1) {
                                                try {
                                                    contactProfile.m40407h1(cursor.getString(i29));
                                                } catch (Exception e36) {
                                                    e = e36;
                                                    columnIndex26 = i29;
                                                    i18 = i26;
                                                    str2 = str5;
                                                    arrayList = arrayList2;
                                                    i19 = i37;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                }
                                            }
                                            columnIndex26 = i29;
                                            i31 = columnIndex27;
                                            if (i31 > -1) {
                                                try {
                                                    contactProfile.f42361N0 = cursor.getInt(i31);
                                                } catch (Exception e37) {
                                                    e = e37;
                                                    columnIndex27 = i31;
                                                    i18 = i26;
                                                    str2 = str5;
                                                    arrayList = arrayList2;
                                                    i19 = i37;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                }
                                            }
                                            columnIndex27 = i31;
                                            i32 = columnIndex28;
                                            if (i32 > -1) {
                                                try {
                                                    contactProfile.f42364O0 = cursor.getString(i32);
                                                } catch (Exception e38) {
                                                    e = e38;
                                                    columnIndex28 = i32;
                                                    i18 = i26;
                                                    str2 = str5;
                                                    arrayList = arrayList2;
                                                    i19 = i37;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                }
                                            }
                                            columnIndex28 = i32;
                                            i33 = columnIndex30;
                                            if (i33 > -1) {
                                                try {
                                                } catch (Exception e39) {
                                                    e = e39;
                                                    columnIndex30 = i33;
                                                    i18 = i26;
                                                    str2 = str5;
                                                    arrayList = arrayList2;
                                                    i19 = i37;
                                                    AbstractC23350e.m122776f(str2, e);
                                                    if (cursor.moveToNext()) {
                                                    }
                                                }
                                                if (!cursor.isNull(i33)) {
                                                    string3 = cursor.getString(i33);
                                                    contactProfile.f42367P0 = string3;
                                                    columnIndex30 = i33;
                                                    i19 = i37;
                                                    if (i19 <= -1) {
                                                        i18 = i26;
                                                        try {
                                                            contactProfile.f42400b0 = cursor.getLong(i19);
                                                        } catch (Exception e41) {
                                                            e = e41;
                                                            str2 = str5;
                                                            arrayList = arrayList2;
                                                            AbstractC23350e.m122776f(str2, e);
                                                            if (cursor.moveToNext()) {
                                                            }
                                                        }
                                                    } else {
                                                        i18 = i26;
                                                    }
                                                    arrayList = arrayList2;
                                                    arrayList.add(contactProfile);
                                                    str2 = str5;
                                                    if (cursor.moveToNext()) {
                                                        break;
                                                    }
                                                    i37 = i19;
                                                    arrayList2 = arrayList;
                                                    str5 = str2;
                                                    columnIndex19 = i16;
                                                    columnIndex10 = i22;
                                                    columnIndex20 = i21;
                                                    columnIndex18 = i11;
                                                    columnIndex24 = i15;
                                                    columnIndex2 = i13;
                                                    columnIndex22 = i18;
                                                    columnIndex17 = i17;
                                                    i36 = i14;
                                                    columnIndex = i12;
                                                }
                                            }
                                            string3 = null;
                                            contactProfile.f42367P0 = string3;
                                            columnIndex30 = i33;
                                            i19 = i37;
                                            if (i19 <= -1) {
                                            }
                                            arrayList = arrayList2;
                                            arrayList.add(contactProfile);
                                            str2 = str5;
                                            if (cursor.moveToNext()) {
                                            }
                                        }
                                        i26 = i25;
                                        i34 = columnIndex23;
                                        if (i34 > -1) {
                                        }
                                        columnIndex23 = i34;
                                        i27 = columnIndex29;
                                        if (i27 > -1) {
                                        }
                                        contactProfile.m40427r1();
                                        columnIndex29 = i27;
                                        i28 = columnIndex25;
                                        if (i28 > -1) {
                                        }
                                        contactProfile.m40428s1(str3);
                                        columnIndex25 = i28;
                                        i29 = columnIndex26;
                                        if (i29 > -1) {
                                        }
                                        columnIndex26 = i29;
                                        i31 = columnIndex27;
                                        if (i31 > -1) {
                                        }
                                        columnIndex27 = i31;
                                        i32 = columnIndex28;
                                        if (i32 > -1) {
                                        }
                                        columnIndex28 = i32;
                                        i33 = columnIndex30;
                                        if (i33 > -1) {
                                        }
                                        string3 = null;
                                        contactProfile.f42367P0 = string3;
                                        columnIndex30 = i33;
                                        i19 = i37;
                                        if (i19 <= -1) {
                                        }
                                        arrayList = arrayList2;
                                        arrayList.add(contactProfile);
                                        str2 = str5;
                                        if (cursor.moveToNext()) {
                                        }
                                    }
                                }
                                i21 = i24;
                                i26 = i25;
                                i34 = columnIndex23;
                                if (i34 > -1) {
                                }
                                columnIndex23 = i34;
                                i27 = columnIndex29;
                                if (i27 > -1) {
                                }
                                contactProfile.m40427r1();
                                columnIndex29 = i27;
                                i28 = columnIndex25;
                                if (i28 > -1) {
                                }
                                contactProfile.m40428s1(str3);
                                columnIndex25 = i28;
                                i29 = columnIndex26;
                                if (i29 > -1) {
                                }
                                columnIndex26 = i29;
                                i31 = columnIndex27;
                                if (i31 > -1) {
                                }
                                columnIndex27 = i31;
                                i32 = columnIndex28;
                                if (i32 > -1) {
                                }
                                columnIndex28 = i32;
                                i33 = columnIndex30;
                                if (i33 > -1) {
                                }
                                string3 = null;
                                contactProfile.f42367P0 = string3;
                                columnIndex30 = i33;
                                i19 = i37;
                                if (i19 <= -1) {
                                }
                                arrayList = arrayList2;
                                arrayList.add(contactProfile);
                                str2 = str5;
                                if (cursor.moveToNext()) {
                                }
                            }
                        } catch (Exception e42) {
                            e = e42;
                            str2 = str5;
                            arrayList = arrayList2;
                        }
                    } catch (Throwable th8) {
                        th3 = th8;
                        str2 = str5;
                        th2 = th3;
                        if (cursor != null) {
                        }
                    }
                } catch (Exception e43) {
                    e = e43;
                    str2 = str5;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return arrayList;
            }
        }
        str2 = "DatabaseFriendHelper";
        if (cursor != null) {
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(4:7|8|(21:9|10|11|12|13|14|15|16|17|18|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|32|33)|34)|4|5) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x025f, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0260, code lost:            r3 = r6;     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m114251p(List list, boolean z11, int i11, boolean z12, String str) {
        String str2;
        Throwable th2;
        String str3;
        String str4;
        long j11;
        Iterator it;
        String str5 = "toString(...)";
        String str6 = "currentUserUid";
        AbstractC19074t.m100208f(list, "friendList");
        AbstractC19074t.m100208f(str, "tableName");
        StringBuilder sb2 = new StringBuilder();
        long j12 = 0;
        try {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.f107760a.m2860a();
                sb2.append(" Size: ");
                sb2.append(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    try {
                        try {
                            ContactProfile contactProfile = (ContactProfile) it2.next();
                            try {
                                ContentValues contentValues = new ContentValues();
                                it = it2;
                                try {
                                    contentValues.put("dpn", contactProfile.f42437s);
                                    contentValues.put("usr", contactProfile.f42443u);
                                    contentValues.put("username", contactProfile.f42460z1);
                                    contentValues.put("avt_full", contactProfile.f42323A1);
                                    contentValues.put("avt", contactProfile.f42446v);
                                    contentValues.put("ged", String.valueOf(contactProfile.f42449w));
                                    contentValues.put("phone", contactProfile.f42455y);
                                    contentValues.put("stt", contactProfile.f42458z);
                                    j11 = j12;
                                    try {
                                        str3 = str5;
                                        str4 = str6;
                                        try {
                                            try {
                                                contentValues.put("last_action", String.valueOf(contactProfile.f42336F / 1000));
                                                contentValues.put("isActive", Integer.valueOf(contactProfile.f42382U0));
                                                contentValues.put("timestamp", String.valueOf(currentTimeMillis));
                                                contentValues.put("isZaloFriend", (Integer) 1);
                                                contentValues.put("typeProfile", (Integer) 1);
                                                if (contactProfile.m40362D0()) {
                                                    contentValues.put("common_flag", Long.valueOf(contactProfile.m40369I()));
                                                }
                                                contentValues.put("uid", contactProfile.f42434r);
                                                contentValues.put("ged", String.valueOf(contactProfile.f42449w));
                                                contentValues.put("dob", contactProfile.f42452x);
                                                contentValues.put("cover", contactProfile.f42324B);
                                                contentValues.put("receive_type", String.valueOf(contactProfile.f42339G));
                                                contentValues.put("voice_url", contactProfile.f42321A);
                                                contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(contactProfile.f42352K0));
                                                contentValues.put("detail_url", contactProfile.f42355L0);
                                                contentValues.put("version_profile", String.valueOf(contactProfile.f42385V0));
                                                contentValues.put("group_msg", String.valueOf(contactProfile.f42453x0));
                                                contentValues.put("param1", String.valueOf(contactProfile.f42347I1));
                                                contentValues.put("param2", "");
                                                contentValues.put("param3", "");
                                                if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                                                    contentValues.put("blacklist_info", contactProfile.f42383U1);
                                                }
                                                if (!TextUtils.isEmpty(contactProfile.m40386S())) {
                                                    contentValues.put("globalId", contactProfile.m40386S());
                                                }
                                                contentValues.put("account_type", Integer.valueOf(contactProfile.f42361N0));
                                                if (!TextUtils.isEmpty(contactProfile.f42364O0)) {
                                                    contentValues.put("business_account", contactProfile.f42364O0);
                                                }
                                                contentValues.put("block_view_chat", Integer.valueOf(contactProfile.f42415i1));
                                                contentValues.put("add_friend_description", contactProfile.f42367P0);
                                                contentValues.put("dob_ts", Long.valueOf(contactProfile.f42400b0));
                                                j12 = this.f107760a.m2869j(str, null, contentValues, 5);
                                                it2 = it;
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                str5 = str3;
                                                str2 = str4;
                                                try {
                                                    this.f107760a.m2864e();
                                                } catch (Exception e11) {
                                                    AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
                                                    sb2.append(e11.toString());
                                                }
                                                String str7 = CoreUtility.f89233i;
                                                AbstractC19074t.m100207e(str7, str2);
                                                String sb3 = sb2.toString();
                                                AbstractC19074t.m100207e(sb3, str5);
                                                AbstractC20887g.m109232j(str7, i11, sb3, 0L, 80010, CoreUtility.f89236l);
                                                throw th2;
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            try {
                                                sb2.append(e.toString());
                                                AbstractC23350e.m122776f("DatabaseFriendHelper", e);
                                                it2 = it;
                                                j12 = j11;
                                                str5 = str3;
                                                str6 = str4;
                                            } catch (Exception e13) {
                                                e = e13;
                                                j12 = j11;
                                                str5 = str3;
                                                str2 = str4;
                                                try {
                                                    sb2.append(e.toString());
                                                    AbstractC23350e.m122776f("DatabaseFriendHelper", e);
                                                    try {
                                                        this.f107760a.m2864e();
                                                    } catch (Exception e14) {
                                                        AbstractC23350e.m122776f("DatabaseFriendHelper", e14);
                                                        sb2.append(e14.toString());
                                                    }
                                                    String str8 = CoreUtility.f89233i;
                                                    AbstractC19074t.m100207e(str8, str2);
                                                    String sb4 = sb2.toString();
                                                    AbstractC19074t.m100207e(sb4, str5);
                                                    AbstractC20887g.m109232j(str8, i11, sb4, 0L, 80010, CoreUtility.f89236l);
                                                    return j12;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    th2 = th;
                                                    this.f107760a.m2864e();
                                                    String str72 = CoreUtility.f89233i;
                                                    AbstractC19074t.m100207e(str72, str2);
                                                    String sb32 = sb2.toString();
                                                    AbstractC19074t.m100207e(sb32, str5);
                                                    AbstractC20887g.m109232j(str72, i11, sb32, 0L, 80010, CoreUtility.f89236l);
                                                    throw th2;
                                                }
                                            }
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        str3 = str5;
                                        str4 = str6;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    str3 = str5;
                                    str4 = str6;
                                    j11 = j12;
                                    sb2.append(e.toString());
                                    AbstractC23350e.m122776f("DatabaseFriendHelper", e);
                                    it2 = it;
                                    j12 = j11;
                                    str5 = str3;
                                    str6 = str4;
                                }
                            } catch (Exception e17) {
                                e = e17;
                                str3 = str5;
                                str4 = str6;
                                it = it2;
                            }
                            str5 = str3;
                            str6 = str4;
                        } catch (Throwable th5) {
                            str4 = str6;
                            th2 = th5;
                            str2 = str4;
                            this.f107760a.m2864e();
                            String str722 = CoreUtility.f89233i;
                            AbstractC19074t.m100207e(str722, str2);
                            String sb322 = sb2.toString();
                            AbstractC19074t.m100207e(sb322, str5);
                            AbstractC20887g.m109232j(str722, i11, sb322, 0L, 80010, CoreUtility.f89236l);
                            throw th2;
                        }
                    } catch (Exception e18) {
                        e = e18;
                        str4 = str6;
                        str2 = str4;
                        sb2.append(e.toString());
                        AbstractC23350e.m122776f("DatabaseFriendHelper", e);
                        this.f107760a.m2864e();
                        String str82 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str82, str2);
                        String sb42 = sb2.toString();
                        AbstractC19074t.m100207e(sb42, str5);
                        AbstractC20887g.m109232j(str82, i11, sb42, 0L, 80010, CoreUtility.f89236l);
                        return j12;
                    }
                }
                str3 = str5;
                str4 = str6;
                j11 = j12;
                if (z11) {
                    int m2863d = this.f107760a.m2863d(str, "timestamp!=?", new String[]{String.valueOf(currentTimeMillis)});
                    sb2.append(" - num effect delete: ");
                    sb2.append(m2863d);
                }
                try {
                    this.f107760a.m2875p();
                    try {
                        this.f107760a.m2864e();
                    } catch (Exception e19) {
                        AbstractC23350e.m122776f("DatabaseFriendHelper", e19);
                        sb2.append(e19.toString());
                    }
                    String str9 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str9, str4);
                    String sb5 = sb2.toString();
                    AbstractC19074t.m100207e(sb5, str3);
                    AbstractC20887g.m109232j(str9, i11, sb5, 0L, 80010, CoreUtility.f89236l);
                    return j11;
                } catch (Exception e21) {
                    e = e21;
                    str5 = str3;
                    str2 = str4;
                    j12 = j11;
                    sb2.append(e.toString());
                    AbstractC23350e.m122776f("DatabaseFriendHelper", e);
                    this.f107760a.m2864e();
                    String str822 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str822, str2);
                    String sb422 = sb2.toString();
                    AbstractC19074t.m100207e(sb422, str5);
                    AbstractC20887g.m109232j(str822, i11, sb422, 0L, 80010, CoreUtility.f89236l);
                    return j12;
                } catch (Throwable th6) {
                    th = th6;
                    str5 = str3;
                    str2 = str4;
                    th2 = th;
                    this.f107760a.m2864e();
                    String str7222 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str7222, str2);
                    String sb3222 = sb2.toString();
                    AbstractC19074t.m100207e(sb3222, str5);
                    AbstractC20887g.m109232j(str7222, i11, sb3222, 0L, 80010, CoreUtility.f89236l);
                    throw th2;
                }
            } catch (Throwable th7) {
                th = th7;
                str2 = str6;
            }
        } catch (Exception e22) {
            e = e22;
            str2 = "currentUserUid";
        }
    }

    /* renamed from: q */
    public final long m114252q(ContactProfile contactProfile, String str) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        AbstractC19074t.m100208f(str, "tableName");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("dpn", contactProfile.f42437s);
            contentValues.put("usr", contactProfile.f42443u);
            contentValues.put("username", contactProfile.f42460z1);
            contentValues.put("avt_full", contactProfile.f42323A1);
            contentValues.put("avt", contactProfile.f42446v);
            contentValues.put("ged", String.valueOf(contactProfile.f42449w));
            contentValues.put("phone", contactProfile.f42455y);
            contentValues.put("stt", contactProfile.f42458z);
            contentValues.put("last_action", String.valueOf(contactProfile.f42336F / 1000));
            contentValues.put("isActive", Integer.valueOf(contactProfile.f42382U0));
            contentValues.put("timestamp", String.valueOf(contactProfile.f42330D));
            contentValues.put("isZaloFriend", (Integer) 1);
            contentValues.put("typeProfile", (Integer) 1);
            if (contactProfile.m40362D0()) {
                contentValues.put("common_flag", Long.valueOf(contactProfile.m40369I()));
            }
            contentValues.put("uid", contactProfile.f42434r);
            contentValues.put("ged", String.valueOf(contactProfile.f42449w));
            contentValues.put("dob", contactProfile.f42452x);
            contentValues.put("cover", contactProfile.f42324B);
            contentValues.put("receive_type", String.valueOf(contactProfile.f42339G));
            contentValues.put("voice_url", contactProfile.f42321A);
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, String.valueOf(contactProfile.f42352K0));
            contentValues.put("detail_url", contactProfile.f42355L0);
            contentValues.put("version_profile", String.valueOf(contactProfile.f42385V0));
            contentValues.put("group_msg", String.valueOf(contactProfile.f42453x0));
            contentValues.put("param1", "");
            contentValues.put("param2", "");
            contentValues.put("param3", "");
            if (!TextUtils.isEmpty(contactProfile.f42383U1)) {
                contentValues.put("blacklist_info", contactProfile.f42383U1);
            }
            if (!TextUtils.isEmpty(contactProfile.m40386S())) {
                contentValues.put("globalId", contactProfile.m40386S());
            }
            contentValues.put("account_type", Integer.valueOf(contactProfile.f42361N0));
            if (!TextUtils.isEmpty(contactProfile.f42364O0)) {
                contentValues.put("business_account", contactProfile.f42364O0);
            }
            contentValues.put("block_view_chat", Integer.valueOf(contactProfile.f42415i1));
            contentValues.put("add_friend_description", contactProfile.f42367P0);
            contentValues.put("dob_ts", Long.valueOf(contactProfile.f42400b0));
            return this.f107760a.m2869j(str, null, contentValues, 5);
        } catch (Exception e11) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 80021, e11.toString(), 0L, 80010, CoreUtility.f89236l);
            String str3 = contactProfile.f42434r;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insertZaloFriend - error : ");
            sb2.append(str3);
            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            return 0L;
        }
    }

    /* renamed from: r */
    public final boolean m114253r() {
        return ((Boolean) this.f107761b.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:            if (r0 == null) goto L17;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m114254t(String str, String str2) {
        AbstractC19074t.m100208f(str2, "tableName");
        Cursor cursor = null;
        boolean z11 = false;
        try {
            try {
                cursor = this.f107760a.m2873n("select uid from " + str2 + " where uid = ? and typeProfile = ? LIMIT 1", new String[]{str, "1"});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        z11 = true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: u */
    public final boolean m114255u(String str) {
        boolean m127120J;
        AbstractC19074t.m100208f(str, "tableName");
        if (!AbstractC19074t.m100204b(str, "contact_profile_zalo")) {
            m127120J = AbstractC24341v.m127120J(str, "contact_profile_friend_", false, 2, null);
            if (!m127120J) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public final void m114256v() {
        m114236d("add_friend_description", "Text", null);
    }

    /* renamed from: w */
    public final void m114257w() {
        m114237e(this, "dob_ts", null, null, 6, null);
    }

    /* renamed from: x */
    public final void m114258x() {
        this.f107761b.reset();
    }

    /* renamed from: y */
    public final int m114259y(String str, String str2) {
        AbstractC19074t.m100208f(str2, "tableName");
        try {
            return this.f107760a.m2863d(str2, " uid = ? ", new String[]{str});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
            return 0;
        }
    }

    /* renamed from: z */
    public final long m114260z(List list, String str) {
        AbstractC19074t.m100208f(str, "tableName");
        List list2 = list;
        long j11 = 0;
        if (list2 == null || list2.isEmpty()) {
            return 0L;
        }
        try {
            try {
                try {
                    this.f107760a.m2860a();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C1483e c1483e = (C1483e) it.next();
                        try {
                            String str2 = (String) c1483e.f6374a;
                            String str3 = (String) c1483e.f6375b;
                            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("phone", str3);
                                j11 = this.f107760a.m2876q(str, contentValues, " uid = ? ", new String[]{str2});
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f("DatabaseFriendHelper", e11);
                        }
                    }
                    this.f107760a.m2875p();
                    this.f107760a.m2864e();
                } catch (Throwable th2) {
                    try {
                        this.f107760a.m2864e();
                    } catch (Exception e12) {
                        AbstractC23350e.m122776f("DatabaseFriendHelper", e12);
                    }
                    throw th2;
                }
            } catch (Exception e13) {
                AbstractC23350e.m122776f("DatabaseFriendHelper", e13);
                this.f107760a.m2864e();
            }
        } catch (Exception e14) {
            AbstractC23350e.m122776f("DatabaseFriendHelper", e14);
        }
        return j11;
    }
}

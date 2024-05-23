package p142ey;

import ag0.C0824j;
import am.AbstractC0939u;
import am.C0918j0;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import mm0.AbstractC23350e;
import p716zh.C31973j5;
import pm0.C24848g0;

/* renamed from: ey.c */
/* loaded from: classes.dex */
public final class C18633c {

    /* renamed from: a */
    public static final C18633c f93770a = new C18633c();

    /* renamed from: b */
    private static final Map f93771b = new LinkedHashMap();

    /* renamed from: c */
    private static boolean f93772c;

    /* renamed from: d */
    private static boolean f93773d;

    /* renamed from: ey.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ long f93774a;

        a(long j11) {
            this.f93774a = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int m2863d = C7960e.m41971c6().m42200M6().m2863d("tbl_old_thread_name_v1", "current_user_uid = ? AND CAST(ts AS NUMBER) < ?", new String[]{CoreUtility.f89233i, String.valueOf(this.f93774a)});
            long j11 = this.f93774a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteObsoleteOldThreadName beforeTimestamp= ");
            sb2.append(j11);
            sb2.append(", count= ");
            sb2.append(m2863d);
        }
    }

    /* renamed from: ey.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f93775a;

        b(String str) {
            this.f93775a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int m2863d = C7960e.m41971c6().m42200M6().m2863d("tbl_old_thread_name_v1", "current_user_uid = ? AND thread_id = ?", new String[]{CoreUtility.f89233i, this.f93775a});
            String str = this.f93775a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deleteOldThreadName threadId= ");
            sb2.append(str);
            sb2.append(", count= ");
            sb2.append(m2863d);
        }
    }

    /* renamed from: ey.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f93776a;

        /* renamed from: b */
        final /* synthetic */ String f93777b;

        c(String str, String str2) {
            this.f93776a = str;
            this.f93777b = str2;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_user_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", this.f93776a);
            contentValues.put("old_thread_name", this.f93777b);
            contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
            long m2868i = m42200M6.m2868i("tbl_old_thread_name_v1", null, contentValues);
            String str = this.f93776a;
            String str2 = this.f93777b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("insertOldThreadName threadId= ");
            sb2.append(str);
            sb2.append(", oldName= ");
            sb2.append(str2);
            sb2.append(", rowId= ");
            sb2.append(m2868i);
        }
    }

    private C18633c() {
    }

    /* renamed from: c */
    private final void m98466c(long j11) {
        C0824j.m2153b(new a(j11));
    }

    /* renamed from: e */
    private final void m98467e(String str) {
        Map map = f93771b;
        synchronized (map) {
        }
        C0824j.m2153b(new b(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:            return r2;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:            if (r12 == null) goto L49;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map m98468f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursor = null;
        try {
            try {
                cursor = C7960e.m41971c6().m42200M6().m2871l("tbl_old_thread_name_v1", new String[]{"thread_id", "old_thread_name"}, "current_user_uid = ?", new String[]{CoreUtility.f89233i}, null, null, null);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("thread_id");
                    int columnIndex2 = cursor.getColumnIndex("old_thread_name");
                    cursor.moveToFirst();
                    do {
                        String string = cursor.getString(columnIndex);
                        String string2 = cursor.getString(columnIndex2);
                        ContactProfile contactProfile = new ContactProfile(string);
                        contactProfile.f42437s = string2;
                        AbstractC19074t.m100205c(string);
                        linkedHashMap.put(string, contactProfile);
                    } while (cursor.moveToNext());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: h */
    private final void m98469h(String str, String str2) {
        Map map = f93771b;
        synchronized (map) {
            ContactProfile contactProfile = new ContactProfile(str);
            contactProfile.f42437s = str2;
            map.put(str, contactProfile);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C0824j.m2153b(new c(str, str2));
    }

    /* renamed from: i */
    private final void m98470i() {
        Map map = f93771b;
        synchronized (map) {
            try {
                if (!f93773d) {
                    f93773d = true;
                    f93770a.m98466c(System.currentTimeMillis() - 1209600000);
                }
                if (f93772c) {
                    return;
                }
                map.putAll(f93770a.m98468f());
                f93772c = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public final void m98471a(C31973j5 c31973j5, String str) {
        if (c31973j5 == null) {
            return;
        }
        String m153781r = c31973j5.m153781r();
        String m153793y = c31973j5.m153793y();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkGroupNameUpdated gid= ");
        sb2.append(m153781r);
        sb2.append(", oldName= ");
        sb2.append(str);
        sb2.append(", newName= ");
        sb2.append(m153793y);
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(c31973j5.m153793y(), str)) {
            String str2 = "group_" + c31973j5.m153781r();
            AbstractC19074t.m100205c(str);
            m98469h(str2, str);
        }
    }

    /* renamed from: b */
    public final void m98472b() {
        try {
            C7960e m41971c6 = C7960e.m41971c6();
            C0918j0 m42200M6 = m41971c6.m42200M6();
            if (!m41971c6.m42075B9("tbl_old_thread_name_v1")) {
                m42200M6.m2865f("CREATE TABLE tbl_old_thread_name_v1 (current_user_uid, thread_id, old_thread_name, ts, UNIQUE(current_user_uid, thread_id) ON CONFLICT REPLACE)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: d */
    public final void m98473d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC19074t.m100205c(str);
        m98467e("group_" + str);
    }

    /* renamed from: g */
    public final String m98474g(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        m98470i();
        ContactProfile contactProfile = (ContactProfile) f93771b.get(str);
        if (contactProfile != null) {
            return contactProfile.f42437s;
        }
        return null;
    }
}

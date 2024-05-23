package p393oi;

import am.C0918j0;
import android.content.ContentValues;
import android.database.Cursor;
import bn0.AbstractC2933b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p423pi.C24763e;
import qm0.AbstractC25368s;

/* renamed from: oi.c */
/* loaded from: classes.dex */
public final class C24270c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0918j0 f117222a;

    /* renamed from: oi.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C24270c(C0918j0 c0918j0) {
        AbstractC19074t.m100208f(c0918j0, "db");
        this.f117222a = c0918j0;
    }

    /* renamed from: d */
    private final C24763e m126728d(Cursor cursor) {
        try {
            int i11 = cursor.getInt(cursor.getColumnIndexOrThrow("from_uid"));
            int i12 = cursor.getInt(cursor.getColumnIndexOrThrow("thread_id"));
            int i13 = cursor.getInt(cursor.getColumnIndexOrThrow("dest_type"));
            long j11 = cursor.getLong(cursor.getColumnIndexOrThrow("id"));
            long j12 = cursor.getLong(cursor.getColumnIndexOrThrow("client_msg_id"));
            int i14 = cursor.getInt(cursor.getColumnIndexOrThrow("platform"));
            String string = cursor.getString(cursor.getColumnIndexOrThrow("device_id"));
            long j13 = cursor.getLong(cursor.getColumnIndexOrThrow("created_action_time"));
            AbstractC19074t.m100205c(string);
            return new C24763e(i11, i12, i13, j11, j12, i14, string, j13);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseSyncActionMediaHelper", e11);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:            if (r1.moveToFirst() != false) goto L7;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            r2 = m126728d(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:            if (r2 == null) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:            r0.add(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:            if (r1.moveToNext() != false) goto L31;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m126729a() {
        List m131502j;
        ArrayList arrayList = new ArrayList();
        try {
            Cursor m2871l = this.f117222a.m2871l("sync_action_media", null, "sync_flag = ?", new String[]{"0"}, null, null, null);
            if (m2871l != null) {
                try {
                } finally {
                }
            }
            AbstractC2933b.m13890a(m2871l, null);
            return arrayList;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseSyncActionMediaHelper", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: b */
    public final void m126730b(C24763e c24763e, boolean z11) {
        int i11;
        AbstractC19074t.m100208f(c24763e, "item");
        try {
            if (m126731c(c24763e.m128716b())) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("from_uid", Integer.valueOf(c24763e.m128720f()));
            contentValues.put("thread_id", Integer.valueOf(c24763e.m128723i()));
            contentValues.put("dest_type", Integer.valueOf(c24763e.m128718d()));
            contentValues.put("id", Long.valueOf(c24763e.m128721g()));
            contentValues.put("client_msg_id", Long.valueOf(c24763e.m128716b()));
            contentValues.put("platform", Integer.valueOf(c24763e.m128722h()));
            contentValues.put("device_id", c24763e.m128719e());
            contentValues.put("created_action_time", Long.valueOf(c24763e.m128717c()));
            if (z11) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            contentValues.put("sync_flag", Integer.valueOf(i11));
            this.f117222a.m2868i("sync_action_media", null, contentValues);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c */
    public final boolean m126731c(long j11) {
        boolean z11;
        try {
            Cursor m2871l = this.f117222a.m2871l("sync_action_media", null, "client_msg_id = ?", new String[]{String.valueOf(j11)}, null, null, null);
            if (m2871l != null) {
                try {
                    if (m2871l.moveToFirst()) {
                        z11 = true;
                        AbstractC2933b.m13890a(m2871l, null);
                        return z11;
                    }
                } finally {
                }
            }
            z11 = false;
            AbstractC2933b.m13890a(m2871l, null);
            return z11;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseSyncActionMediaHelper", e11);
            return false;
        }
    }

    /* renamed from: e */
    public final void m126732e(long j11, long j12) {
        try {
            this.f117222a.m2863d("sync_action_media", "created_action_time < ?", new String[]{String.valueOf(j11 - j12)});
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: f */
    public final void m126733f(long j11) {
        try {
            this.f117222a.m2863d("sync_action_media", "client_msg_id = ?", new String[]{String.valueOf(j11)});
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    public final void m126734g(long j11, int i11) {
        String[] strArr = {String.valueOf(j11)};
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_flag", Integer.valueOf(i11));
        try {
            this.f117222a.m2876q("sync_action_media", contentValues, "client_msg_id = ?", strArr);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}

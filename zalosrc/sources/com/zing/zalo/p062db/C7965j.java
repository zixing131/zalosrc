package com.zing.zalo.p062db;

import am.AbstractC0910f0;
import am.AbstractC0937t;
import am.C0896a;
import am.C0916i0;
import am.C0941v;
import am.InterfaceC0947y;
import am.InterfaceC0949z;
import android.content.ContentValues;
import android.content.Context;
import bm.C2845c;
import cn0.AbstractC3601a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.AbstractC7963h;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import me0.AbstractC23152n3;
import me0.AbstractC23193r0;
import me0.AbstractC23238v2;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23306f;
import p405ov.C24559a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.db.j */
/* loaded from: classes.dex */
public final class C7965j {
    public static final b Companion = new b(null);

    /* renamed from: c */
    private static final InterfaceC24854k f43363c;

    /* renamed from: a */
    private InterfaceC0947y f43364a;

    /* renamed from: b */
    private final c f43365b;

    /* renamed from: com.zing.zalo.db.j$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43366q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7965j mo12V4() {
            return new C7965j(MainApplication.Companion.m35500c(), null);
        }
    }

    /* renamed from: com.zing.zalo.db.j$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7965j m42695a() {
            return (C7965j) C7965j.f43363c.getValue();
        }
    }

    /* renamed from: com.zing.zalo.db.j$c */
    /* loaded from: classes.dex */
    public static final class c extends C0941v {
        c() {
        }

        @Override // am.C0941v, am.InterfaceC0911g
        /* renamed from: a */
        public void mo2831a(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
            AbstractC20887g.m109217D(19851, null, 2, null);
            AbstractC23350e.m122774d("RestorableDatabaseHelper", "DB corrupted, restore");
            super.mo2831a(interfaceC0947y, sQLiteException);
            C7965j.this.m42692n();
            AbstractC23152n3.m118985A0(null);
            AbstractC23193r0.m119508q();
        }

        @Override // am.C0941v, am.InterfaceC0911g
        /* renamed from: b */
        public void mo2832b(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
            AbstractC20887g.m109244v(19852, null, 2, null);
            super.mo2832b(interfaceC0947y, sQLiteException);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f43366q);
        f43363c = m129210a;
    }

    public /* synthetic */ C7965j(Context context, AbstractC19060k abstractC19060k) {
        this(context);
    }

    /* renamed from: d */
    private final void m42679d(InterfaceC0947y interfaceC0947y) {
        InterfaceC0949z mo2777u = interfaceC0947y.mo2777u("select 1");
        if (mo2777u != null && mo2777u.getColumnCount() > 0) {
            try {
                mo2777u.close();
                return;
            } catch (SQLiteException e11) {
                AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
                return;
            }
        }
        throw new SQLiteException(-1, "Can not open db file " + interfaceC0947y.mo2856w());
    }

    /* renamed from: e */
    private final void m42680e() {
        try {
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null && AbstractC0910f0.m2830a(interfaceC0947y, "db_version")) {
                interfaceC0947y.mo2857x("create table db_version (version)");
                interfaceC0947y.mo2857x("insert into db_version values (1)");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: f */
    private final void m42681f() {
        try {
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null && AbstractC0910f0.m2830a(interfaceC0947y, "e2ee_sent_messages")) {
                interfaceC0947y.mo2857x("CREATE TABLE e2ee_sent_messages (current_uid TEXT, client_message_id TEXT, owner_id TEXT, sender_id TEXT, device_id INTEGER, retry_key TEXT, ts INTEGER, is_received INTEGER DEFAULT 0, replace_sender_by_receiver INTEGER DEFAULT 1, PRIMARY KEY (current_uid, client_message_id, owner_id, sender_id, device_id))");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: g */
    private final void m42682g() {
        if (this.f43364a == null) {
            return;
        }
        try {
            m42680e();
            m42681f();
            int m42683i = m42683i();
            if (1 > m42683i) {
                m42685l(m42683i);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: i */
    private final int m42683i() {
        int i11 = 0;
        try {
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "select version from %s", Arrays.copyOf(new Object[]{"db_version"}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(format);
                if (mo2777u.next()) {
                    i11 = mo2777u.getInt(mo2777u.getColumnIndex("version"));
                }
                mo2777u.close();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
        return i11;
    }

    /* renamed from: k */
    public static final C7965j m42684k() {
        return Companion.m42695a();
    }

    /* renamed from: l */
    private final void m42685l(int i11) {
        if (i11 < 1) {
            try {
                try {
                    m42686m();
                    i11 = 1;
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
                }
            } finally {
                m42687o(i11);
            }
        }
    }

    /* renamed from: m */
    private final void m42686m() {
        InterfaceC0947y interfaceC0947y = this.f43364a;
        if (interfaceC0947y != null) {
            AbstractC0937t.m4451b(interfaceC0947y, "e2ee_sent_messages", "replace_sender_by_receiver", "INTEGER", "0");
        }
        C24559a.m127933c("RestorableDatabaseHelper", "Migrated db version 1");
    }

    /* renamed from: o */
    private final void m42687o(int i11) {
        try {
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "update %s set %s = %s where 1", Arrays.copyOf(new Object[]{"db_version", "version", Integer.valueOf(i11)}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                interfaceC0947y.mo2774n(format);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: b */
    public final void m42688b(MessageId messageId, String str, int i11, String str2, long j11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "receiverId");
        AbstractC19074t.m100208f(str2, "retryKey");
        if (this.f43364a == null) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_uid", CoreUtility.f89233i);
            contentValues.put("client_message_id", messageId.m41044h());
            contentValues.put("owner_id", messageId.m41048l());
            contentValues.put("sender_id", str);
            contentValues.put("device_id", Integer.valueOf(i11));
            contentValues.put("retry_key", str2);
            contentValues.put("ts", Long.valueOf(j11));
            contentValues.put("replace_sender_by_receiver", (Integer) 1);
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                interfaceC0947y.mo2771C("e2ee_sent_messages", null, contentValues);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: c */
    public final boolean m42689c() {
        C24848g0 c24848g0;
        C24559a.m127933c("RestorableDatabaseHelper", "Backup database zalo_restorable.db...");
        boolean z11 = false;
        try {
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                m42679d(interfaceC0947y);
                File file = new File(new File(interfaceC0947y.mo2856w()).getParent(), "zalo_restorable_backup.db");
                if (interfaceC0947y instanceof C0896a) {
                    ((C0896a) interfaceC0947y).m41423a(file.getPath());
                } else if (interfaceC0947y instanceof C0916i0) {
                    ((C0916i0) interfaceC0947y).m2844c(file.getPath());
                }
                C24559a.m127933c("RestorableDatabaseHelper", "Backup database zalo_restorable.db SUCCESS");
                z11 = true;
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122775e("RestorableDatabaseHelper", "Backup database zalo_restorable.db FAILED", e11);
        }
        if (c24848g0 == null) {
            throw new Exception("Restorable database is null.");
        }
        return z11;
    }

    /* renamed from: h */
    public final void m42690h() {
        if (this.f43364a == null) {
            return;
        }
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s < ? ", Arrays.copyOf(new Object[]{"ts"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                interfaceC0947y.mo2770B("e2ee_sent_messages", format, new String[]{String.valueOf(AbstractC23306f.m120579F1().mo124314i() - 1209600000)});
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: j */
    public final AbstractC7963h m42691j(MessageId messageId, String str, String str2) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "receiverId");
        AbstractC19074t.m100208f(str2, "retryKey");
        AbstractC7963h abstractC7963h = AbstractC7963h.b.f43359a;
        InterfaceC0947y interfaceC0947y = this.f43364a;
        if (interfaceC0947y != null && interfaceC0947y != null) {
            try {
                InterfaceC0949z mo2775p = interfaceC0947y.mo2775p("select * from e2ee_sent_messages where current_uid = ? and client_message_id = ? and owner_id = ? and (replace_sender_by_receiver = 0 or sender_id = ?) and retry_key = ? and ts > ?", CoreUtility.f89233i, messageId.m41044h(), messageId.m41048l(), str, str2, Long.valueOf(AbstractC23306f.m120579F1().mo124314i() - 1209600000));
                if (mo2775p != null) {
                    try {
                        if (mo2775p.next()) {
                            if (mo2775p.getInt(mo2775p.getColumnIndex("is_received")) == 1) {
                                abstractC7963h = AbstractC7963h.a.f43358a;
                            } else {
                                abstractC7963h = AbstractC7963h.c.f43360a;
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC3601a.m18219a(mo2775p, null);
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
            }
        }
        if ((abstractC7963h instanceof AbstractC7963h.b) && C7959d.Companion.m41850e().m41700F1(messageId, str2)) {
            return AbstractC7963h.c.f43360a;
        }
        return abstractC7963h;
    }

    /* renamed from: n */
    public final void m42692n() {
        String path;
        C24559a.m127933c("RestorableDatabaseHelper", "Restore database...");
        try {
            MainApplication.C6895a c6895a = MainApplication.Companion;
            C0896a c0896a = new C0896a(c6895a.m35500c(), "zalo_restorable_backup.db");
            c0896a.mo2851m();
            m42679d(c0896a);
            c0896a.close();
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                path = interfaceC0947y.mo2856w();
                if (path == null) {
                }
                File file = new File(path);
                AbstractC23238v2.m119717b(new File(file.getParent(), "zalo_restorable_backup.db"), file);
            }
            path = c6895a.m35500c().getDatabasePath("zalo_restorable.db").getPath();
            File file2 = new File(path);
            AbstractC23238v2.m119717b(new File(file2.getParent(), "zalo_restorable_backup.db"), file2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    /* renamed from: p */
    public final void m42693p(MessageId messageId, String str, int i11) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "receiverId");
        if (this.f43364a == null) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_received", (Integer) 1);
            InterfaceC0947y interfaceC0947y = this.f43364a;
            if (interfaceC0947y != null) {
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                interfaceC0947y.mo2776q("e2ee_sent_messages", contentValues, "current_uid = ? and client_message_id = ? and owner_id = ? and (replace_sender_by_receiver = 1 and sender_id = ? or device_id = 0) and device_id = ?", new String[]{str2, messageId.m41044h(), messageId.m41048l(), str, String.valueOf(i11)});
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("RestorableDatabaseHelper", e11);
        }
    }

    private C7965j(Context context) {
        c cVar = new c();
        this.f43365b = cVar;
        try {
            C0896a c0896a = new C0896a(context, "zalo_restorable.db", cVar);
            c0896a.mo2851m();
            m42679d(c0896a);
            this.f43364a = c0896a;
        } catch (Exception e11) {
            AbstractC20887g.m109244v(19850, null, 2, null);
            AbstractC23350e.m122775e("RestorableDatabaseHelper", "Create custom db failed", e11);
            try {
                C0916i0 c0916i0 = new C0916i0(context, "zalo_restorable.db", this.f43365b);
                c0916i0.mo2851m();
                m42679d(c0916i0);
                this.f43364a = c0916i0;
                C24559a.m127933c("RestorableDatabaseHelper", "Create stock db SUCCESS");
                AbstractC20887g.m109217D(19853, null, 2, null);
            } catch (Exception e12) {
                AbstractC23350e.m122775e("RestorableDatabaseHelper", "Create stock db failed", e12);
                AbstractC20887g.m109244v(19853, null, 2, null);
                AbstractC23350e.m122776f("RestorableDatabaseHelper", e12);
            }
        }
        m42682g();
        C2845c.f11343a.m13732a();
    }
}

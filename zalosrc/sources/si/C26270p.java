package si;

import am.AbstractC0924m0;
import am.AbstractC0937t;
import com.zing.zalo.backuprestore.exception.BackupRestoreException;
import com.zing.zalo.p062db.BackupRestoreUtils;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7966k;
import com.zing.zalo.p062db.SQLiteDatabase;
import com.zing.zalo.p062db.SQLiteException;
import com.zing.zalo.p062db.SQLiteStatement;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import p297kd.C21690e;
import p348mi.AbstractC23309i;
import p443qc.EnumC25220d;
import sc.C26220b;

/* renamed from: si.p */
/* loaded from: classes3.dex */
public final class C26270p implements InterfaceC26269o {
    public static final a Companion = new a(null);

    /* renamed from: si.p$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: G */
    private final void m135135G(SQLiteDatabase sQLiteDatabase) {
        AbstractC0937t.m4451b(sQLiteDatabase, "chats", "sequenseId", "INTEGER", "0");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("SELECT %s, %s FROM %s ORDER BY %s ASC", Arrays.copyOf(new Object[]{"rowid", "ts", "chats", "rowid"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        C7966k mo2777u = sQLiteDatabase.mo2777u(format);
        if (mo2777u == null) {
            C26220b.m134832o("createSequenseIdColumn(): WTF with sequenseId?");
            return;
        }
        int columnIndex = mo2777u.getColumnIndex("rowid");
        int columnIndex2 = mo2777u.getColumnIndex("ts");
        sQLiteDatabase.mo2845e();
        long j11 = 0;
        while (mo2777u.next()) {
            long j12 = mo2777u.getLong(columnIndex);
            long j13 = mo2777u.getLong(columnIndex2);
            if (j13 > j11) {
                j11 = j13;
            } else {
                j11++;
            }
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format2 = String.format(Locale.US, "UPDATE %s SET %s = %d WHERE %s = %d", Arrays.copyOf(new Object[]{"chats", "sequenseId", Long.valueOf(j11), "rowid", Long.valueOf(j12)}, 5));
            AbstractC19074t.m100207e(format2, "format(...)");
            sQLiteDatabase.mo2774n(format2);
        }
        sQLiteDatabase.mo2849k();
        sQLiteDatabase.mo2850l();
        try {
            mo2777u.close();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m135136H(SQLiteDatabase sQLiteDatabase) {
        Throwable th2;
        SQLiteStatement sQLiteStatement;
        long j11;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("SELECT COUNT(*) AS count FROM %s WHERE %s IS NULL OR %s = 0", Arrays.copyOf(new Object[]{"chats", "sequenseId", "sequenseId"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        long j12 = 1;
        ?? r12 = 0;
        SQLiteStatement sQLiteStatement2 = null;
        try {
            try {
                SQLiteStatement mo2853r = sQLiteDatabase.mo2853r(format);
                try {
                    j11 = AbstractC0937t.m4457h(mo2853r, null);
                    try {
                        AbstractC19074t.m100205c(mo2853r);
                        mo2853r.close();
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e11);
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    sQLiteStatement2 = mo2853r;
                    AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e);
                    try {
                        AbstractC19074t.m100205c(sQLiteStatement2);
                        sQLiteStatement2.close();
                    } catch (Exception e13) {
                        AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e13);
                    }
                    j11 = 1;
                    r12 = 0;
                    if (j11 <= 0) {
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    sQLiteStatement = mo2853r;
                    try {
                        AbstractC19074t.m100205c(sQLiteStatement);
                        sQLiteStatement.close();
                        throw th2;
                    } catch (Exception e14) {
                        AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e14);
                        throw th2;
                    }
                }
            } catch (SQLiteException e15) {
                e = e15;
            }
            r12 = 0;
            if (j11 <= 0) {
                C19067n0 c19067n02 = C19067n0.f94947a;
                String format2 = String.format("SELECT %s, %s FROM %s WHERE %s IS NULL OR %s = 0 ORDER BY %s ASC", Arrays.copyOf(new Object[]{"rowid", "ts", "chats", "sequenseId", "sequenseId", "rowid"}, 6));
                AbstractC19074t.m100207e(format2, "format(...)");
                C7966k mo2777u = sQLiteDatabase.mo2777u(format2);
                try {
                    if (mo2777u != null) {
                        try {
                            try {
                                int columnIndex = mo2777u.getColumnIndex("rowid");
                                int columnIndex2 = mo2777u.getColumnIndex("ts");
                                sQLiteDatabase.mo2845e();
                                long j13 = 0;
                                while (mo2777u.next()) {
                                    long j14 = mo2777u.getLong(columnIndex);
                                    long j15 = mo2777u.getLong(columnIndex2);
                                    if (j15 > j13) {
                                        j13 = j15;
                                    } else {
                                        j13 += j12;
                                    }
                                    C19067n0 c19067n03 = C19067n0.f94947a;
                                    String format3 = String.format(Locale.US, "UPDATE %s SET %s = %d WHERE %s = %d", Arrays.copyOf(new Object[]{"chats", "sequenseId", Long.valueOf(j13), "rowid", Long.valueOf(j14)}, 5));
                                    AbstractC19074t.m100207e(format3, "format(...)");
                                    sQLiteDatabase.mo2774n(format3);
                                    j12 = 1;
                                }
                                sQLiteDatabase.mo2849k();
                                sQLiteDatabase.mo2850l();
                                mo2777u.close();
                            } finally {
                            }
                        } catch (SQLiteException e16) {
                            AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e16);
                            sQLiteDatabase.mo2850l();
                            mo2777u.close();
                        }
                    }
                } catch (Exception e17) {
                    AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e17);
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            sQLiteStatement = r12;
        }
    }

    @Override // si.InterfaceC26269o
    /* renamed from: A */
    public void mo135103A(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3149Ip(str);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: B */
    public long mo135104B() {
        return AbstractC0924m0.m3300O2();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: C */
    public void mo135105C(int i11) {
        AbstractC0924m0.m4177rl(i11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: D */
    public void mo135106D() {
        AbstractC0924m0.m4415zp(AbstractC0924m0.m3246M6() + 1);
        AbstractC0924m0.m3259Mj(System.currentTimeMillis());
    }

    @Override // si.InterfaceC26269o
    /* renamed from: E */
    public int mo135107E() {
        return AbstractC0924m0.m3159J6();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: F */
    public int mo135108F() {
        return AbstractC0924m0.m4331x();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: a */
    public void mo135109a(long j11) {
        AbstractC23309i.m122515vr(j11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: b */
    public long mo135110b() {
        return AbstractC0924m0.m4008m2();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: c */
    public long mo135111c() {
        return AbstractC0924m0.m3390R5();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: d */
    public boolean mo135112d() {
        return AbstractC23309i.m121678Zg();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: e */
    public void mo135113e(String str) {
        AbstractC19074t.m100208f(str, "data");
        AbstractC0924m0.m3786ek(str);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: f */
    public void mo135114f(int i11) {
        AbstractC0924m0.m4328wp(i11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: g */
    public void mo135115g(String str) {
        AbstractC19074t.m100208f(str, "signature");
        C7959d.Companion.m41850e().m41757V2(str);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: h */
    public int mo135116h() {
        return AbstractC0924m0.m3246M6();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: i */
    public void mo135117i(String str) {
        AbstractC19074t.m100208f(str, "jsonString");
        AbstractC23309i.m121658Yx(str);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: j */
    public String mo135118j() {
        return C7959d.Companion.m41850e().m41687B1();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: k */
    public int mo135119k() {
        return AbstractC0924m0.m3591Y3();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: l */
    public long mo135120l() {
        return AbstractC23309i.m121594X6();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: m */
    public String mo135121m() {
        String m3449T6 = AbstractC0924m0.m3449T6();
        AbstractC19074t.m100207e(m3449T6, "getTotalBackupPhotoByEmail(...)");
        return m3449T6;
    }

    @Override // si.InterfaceC26269o
    /* renamed from: n */
    public void mo135122n(int i11) {
        AbstractC0924m0.m3780ee(i11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: o */
    public void mo135123o(EnumC25220d enumC25220d) {
        AbstractC19074t.m100208f(enumC25220d, "config");
        AbstractC0924m0.m3584Xp(enumC25220d.m130485c());
    }

    @Override // si.InterfaceC26269o
    /* renamed from: p */
    public void mo135124p(boolean z11) {
        AbstractC23309i.m122486uz(z11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: q */
    public EnumC25220d mo135125q() {
        return EnumC25220d.Companion.m130486a(AbstractC0924m0.m3773e7());
    }

    @Override // si.InterfaceC26269o
    /* renamed from: r */
    public void mo135126r(int i11) {
        AbstractC0924m0.m3400Rf(i11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: s */
    public long mo135127s() {
        return AbstractC0924m0.m3825g();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: t */
    public String mo135128t(String str) {
        SQLiteDatabase sQLiteDatabase;
        AbstractC19074t.m100208f(str, "dbFilePath");
        File file = new File(str);
        if (file.exists()) {
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase3 = new SQLiteDatabase(file);
                    try {
                        sQLiteDatabase3.mo2851m();
                        if (AbstractC0937t.m4455f(sQLiteDatabase3, "chat_content") && AbstractC0937t.m4455f(sQLiteDatabase3, "new_messages_2")) {
                            sQLiteDatabase3.close();
                            String str2 = str + ".exp";
                            int convertAndroidDbtoCross = BackupRestoreUtils.convertAndroidDbtoCross(str, str2, CoreUtility.f89233i, 0L, 0);
                            if (convertAndroidDbtoCross == 1) {
                                if (AbstractC23041d2.m118194A(str2)) {
                                    sQLiteDatabase = new SQLiteDatabase(new File(str2));
                                    sQLiteDatabase.mo2851m();
                                    str = str2;
                                } else {
                                    throw new BackupRestoreException(-300, "Pre-process DB failed: Convert Android DB to Cross DB success but output not exist");
                                }
                            } else {
                                throw new BackupRestoreException(convertAndroidDbtoCross - 300, "Pre-process DB failed: Convert Android DB to Cross DB failed");
                            }
                        } else {
                            sQLiteDatabase = sQLiteDatabase3;
                        }
                        if (AbstractC0937t.m4455f(sQLiteDatabase, "chats") && AbstractC0937t.m4455f(sQLiteDatabase, "threads")) {
                            if (!AbstractC0937t.m4454e(sQLiteDatabase, "chats", "sequenseId")) {
                                m135135G(sQLiteDatabase);
                            } else {
                                m135136H(sQLiteDatabase);
                            }
                            try {
                                if (sQLiteDatabase.isOpen()) {
                                    sQLiteDatabase.close();
                                }
                            } catch (SQLiteException e11) {
                                AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e11);
                            }
                            return str;
                        }
                        throw new BackupRestoreException(2, "Pre-process DB failed: File not contain table [chats] or [threads]");
                    } catch (SQLiteException e12) {
                        e = e12;
                        AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e);
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String format = String.format("Pre-process DB failed: (%d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(e.m41426a()), e.m41427b()}, 2));
                        AbstractC19074t.m100207e(format, "format(...)");
                        throw new BackupRestoreException(format);
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        if (sQLiteDatabase2 != null) {
                            try {
                                if (sQLiteDatabase2.isOpen()) {
                                    sQLiteDatabase2.close();
                                }
                            } catch (SQLiteException e13) {
                                AbstractC23350e.m122776f("SMLBackupRestoreLocalDataSource", e13);
                            }
                        }
                        throw th;
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new BackupRestoreException(1, "Pre-process DB failed: File not exist");
        }
    }

    @Override // si.InterfaceC26269o
    /* renamed from: u */
    public void mo135129u(long j11) {
        AbstractC0924m0.m3995lj(j11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: v */
    public String mo135130v() {
        String m3829g3 = AbstractC0924m0.m3829g3();
        AbstractC19074t.m100207e(m3829g3, "getListDeviceInfo(...)");
        return m3829g3;
    }

    @Override // si.InterfaceC26269o
    /* renamed from: w */
    public int mo135131w() {
        return AbstractC0924m0.m3269N0();
    }

    @Override // si.InterfaceC26269o
    /* renamed from: x */
    public void mo135132x(long j11) {
        AbstractC0924m0.m4240to(j11);
    }

    @Override // si.InterfaceC26269o
    /* renamed from: y */
    public C21690e mo135133y() {
        return C21690e.Companion.m111901a(AbstractC23309i.m120971Gc());
    }

    @Override // si.InterfaceC26269o
    /* renamed from: z */
    public void mo135134z(long j11) {
        AbstractC0924m0.m3253Md(j11);
    }
}

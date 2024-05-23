package com.zing.zalo.p062db;

import am.AbstractC0937t;
import am.C0945x;
import am.InterfaceC0947y;
import android.text.TextUtils;
import cm.C3594a;
import com.zing.zalo.backuprestore.exception.BackupRestoreException;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fg0.ThreadFactoryC18928a;
import hm.InterfaceC20091a;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me0.AbstractC23195r2;
import mm0.AbstractC23350e;
import p056cj.InterfaceC3534b;
import p297kd.C21688c;
import p297kd.C21690e;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p461qu.AbstractC25495a;
import si.C26263i;
import xd0.C29594j;

/* renamed from: com.zing.zalo.db.a */
/* loaded from: classes3.dex */
public class C7955a {

    /* renamed from: a */
    private final SQLiteDatabase f43189a;

    /* renamed from: b */
    private final List f43190b;

    /* renamed from: c */
    private volatile int f43191c;

    /* renamed from: d */
    private final int f43192d;

    /* renamed from: e */
    private volatile int f43193e;

    /* renamed from: f */
    private volatile int f43194f;

    /* renamed from: g */
    private final ThreadPoolExecutor f43195g;

    /* renamed from: l */
    private final int f43200l;

    /* renamed from: h */
    private volatile boolean f43196h = false;

    /* renamed from: i */
    private volatile int f43197i = 0;

    /* renamed from: j */
    private volatile int f43198j = 0;

    /* renamed from: k */
    private volatile boolean f43199k = false;

    /* renamed from: m */
    private final Object f43201m = new Object();

    /* renamed from: n */
    private final String f43202n = String.format("SELECT * FROM %s WHERE %s = ? AND %s = ? ORDER BY rowid DESC LIMIT ?, ?", "chats", "ownerType", "ownerId");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.db.a$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20091a {

        /* renamed from: a */
        final /* synthetic */ long f43203a;

        /* renamed from: b */
        final /* synthetic */ List f43204b;

        /* renamed from: c */
        final /* synthetic */ TargetBackupInfo f43205c;

        /* renamed from: d */
        final /* synthetic */ C21690e f43206d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC20091a f43207e;

        a(long j11, List list, TargetBackupInfo targetBackupInfo, C21690e c21690e, InterfaceC20091a interfaceC20091a) {
            this.f43203a = j11;
            this.f43204b = list;
            this.f43205c = targetBackupInfo;
            this.f43206d = c21690e;
            this.f43207e = interfaceC20091a;
        }

        @Override // hm.InterfaceC20091a
        /* renamed from: a */
        public void mo41472a() {
            AbstractC20110a.m104542k(8, "insertDataFromCross-preload-time=" + (System.currentTimeMillis() - this.f43203a), new Object[0]);
            C7955a.this.m41465v(this.f43204b.size());
            Iterator it = this.f43204b.iterator();
            while (it.hasNext()) {
                C7955a.this.f43195g.execute(new b((C3594a) it.next(), this.f43205c, this.f43206d, this.f43207e, true));
            }
        }

        @Override // hm.InterfaceC20091a
        /* renamed from: b */
        public void mo41473b(String str, int i11) {
            this.f43207e.mo41473b(str, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.db.a$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: p */
        private final C3594a f43209p;

        /* renamed from: q */
        private final TargetBackupInfo f43210q;

        /* renamed from: r */
        private final C21690e f43211r;

        /* renamed from: s */
        private final InterfaceC20091a f43212s;

        /* renamed from: t */
        private final boolean f43213t;

        public b(C3594a c3594a, TargetBackupInfo targetBackupInfo, C21690e c21690e, InterfaceC20091a interfaceC20091a, boolean z11) {
            this.f43209p = c3594a;
            this.f43210q = targetBackupInfo;
            this.f43211r = c21690e;
            this.f43212s = interfaceC20091a;
            this.f43213t = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ContactProfile contactProfile = new ContactProfile(this.f43209p);
                while (true) {
                    if (C7955a.this.f43199k) {
                        AbstractC20110a.m104542k(8, "Thread is cancelled 1: " + this.f43209p.f15179f + ", " + Thread.currentThread().getName(), new Object[0]);
                        break;
                    }
                    C7955a c7955a = C7955a.this;
                    int m41468z = c7955a.m41468z(this.f43209p, this.f43210q, contactProfile, c7955a.f43200l);
                    C7955a.this.m41442B(m41468z, this.f43211r);
                    if (!this.f43213t || m41468z <= 0) {
                        break;
                    }
                }
                if (!C7955a.this.f43199k) {
                    C7955a.this.m41463t(this.f43212s, this.f43213t);
                    return;
                }
                AbstractC20110a.m104542k(8, "Thread is cancelled 2: " + this.f43209p.f15179f + ", " + Thread.currentThread().getName(), new Object[0]);
            } catch (BackupRestoreException e11) {
                C7955a.this.m41464u(this.f43212s, e11.getMessage(), e11.m37266a());
            } catch (Exception e12) {
                C7955a.this.m41464u(this.f43212s, e12.getMessage(), -1);
            }
        }
    }

    public C7955a(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(file);
            this.f43189a = sQLiteDatabase;
            sQLiteDatabase.mo2851m();
            m41455k();
            m41466w();
            m41457m();
            this.f43190b = m41461r();
            this.f43192d = m41460q();
            this.f43191c = 0;
            this.f43193e = 0;
            this.f43194f = 0;
            ThreadPoolExecutor m41456l = m41456l();
            this.f43195g = m41456l;
            this.f43200l = Math.min(450 / m41456l.getCorePoolSize(), 150);
            return;
        }
        AbstractC23350e.m122774d("CrossDatabaseHelper", str + "is not exist");
        throw new SQLiteException(0, str + " is not exist.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public void m41442B(int i11, C21690e c21690e) {
        boolean z11;
        if (i11 > 0) {
            synchronized (this.f43201m) {
                try {
                    this.f43191c += i11;
                    this.f43193e = (this.f43191c * 100) / this.f43192d;
                    if (this.f43193e > this.f43194f) {
                        this.f43194f = this.f43193e;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                try {
                    C21688c.m111827j().m111841D(7, 2, this.f43193e, c21690e);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }
    }

    /* renamed from: C */
    private synchronized void m41443C(C3594a c3594a) {
        this.f43189a.mo2778v("UPDATE threads SET offset = ?, sync_status = ? WHERE ownerId = ? AND userId = ?", String.valueOf(c3594a.f15182i), String.valueOf(c3594a.f15183j), String.valueOf(c3594a.f15175b), String.valueOf(c3594a.f15174a));
    }

    /* renamed from: D */
    private void m41444D(C3594a c3594a, boolean z11) {
        if (c3594a.f15184k < 5000 && !z11) {
            return;
        }
        c3594a.f15184k = 0;
        c3594a.f15183j = z11 ? 1 : 0;
        m41443C(c3594a);
    }

    /* renamed from: i */
    public static void m41453i(InterfaceC0947y interfaceC0947y, String str, String str2, String str3, String str4) {
        try {
            interfaceC0947y.mo2857x("ALTER TABLE " + str + " ADD " + str2 + " " + str3 + " DEFAULT " + str4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    private void m41454j() {
        if (this.f43189a.isOpen()) {
        } else {
            throw new SQLiteException(0, "DBCross is invalid.");
        }
    }

    /* renamed from: k */
    private void m41455k() {
        AutoCloseable autoCloseable = null;
        try {
            C7966k mo2777u = this.f43189a.mo2777u(String.format("select count(*) from %s", "threads"));
            if (mo2777u != null && mo2777u.getColumnCount() > 0) {
                mo2777u.close();
                C7966k mo2777u2 = this.f43189a.mo2777u(String.format("select count(*) from %s", "chats"));
                if (mo2777u2 != null && mo2777u2.getColumnCount() > 0) {
                    mo2777u2.close();
                    this.f43189a.mo2774n(String.format("delete from %s where %s + 0 < 0 ", "threads", "ownerId"));
                    mo2777u2.close();
                    return;
                }
                throw new SQLiteException(0, "DBCrossPlatform query fail");
            }
            throw new SQLiteException(0, "DBCrossPlatform query fail");
        } catch (Throwable th2) {
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th2;
        }
    }

    /* renamed from: l */
    private ThreadPoolExecutor m41456l() {
        int min = Math.min(Math.max(C20128b.m104770q(), 0), 3);
        AbstractC20110a.m104542k(8, "createExecutorInsertMsg-poolSize=" + min, new Object[0]);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(min, min, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC18928a("RestoreMsgInsertDB"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: m */
    private void m41457m() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f43189a.mo2857x("CREATE INDEX IF NOT EXISTS ownerType_ownerId_idx ON chats (ownerType, ownerId)");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        AbstractC20110a.m104542k(8, "createIndexForColumn(). Indexed column ownerType, ownerId of table chats, Time=" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
    }

    /* renamed from: o */
    private synchronized ArrayList m41458o(long j11, int i11, int i12, int i13, int i14, long j12) {
        ArrayList arrayList;
        m41454j();
        arrayList = new ArrayList();
        C7966k c7966k = null;
        try {
            c7966k = this.f43189a.mo2775p(this.f43202n, Integer.valueOf(i11), Long.valueOf(j11), Integer.valueOf(i12), Integer.valueOf(i13));
            if (c7966k != null) {
                while (c7966k.next()) {
                    arrayList.add(new C17945a0(c7966k, i14, j12));
                }
            }
        } finally {
            if (c7966k != null) {
                c7966k.close();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.zing.zalo.db.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* renamed from: p */
    public static long m41459p(String str, SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Exception e11;
        SQLiteDatabase sQLiteDatabase3;
        long j11 = -1;
        try {
            if (sQLiteDatabase == null) {
                ?? r22 = 0;
                try {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            return -1L;
                        }
                        File file = new File(str);
                        if (!file.exists()) {
                            return -1L;
                        }
                        sQLiteDatabase3 = new SQLiteDatabase(file);
                        try {
                            sQLiteDatabase3.mo2851m();
                            sQLiteDatabase2 = sQLiteDatabase3;
                        } catch (Exception e12) {
                            e11 = e12;
                            AbstractC20110a.m104539h(e11);
                            if (sQLiteDatabase == null && sQLiteDatabase3 != null) {
                                sQLiteDatabase3.close();
                            }
                            return j11;
                        }
                    } catch (Exception e13) {
                        e11 = e13;
                        sQLiteDatabase3 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteDatabase == null) {
                            try {
                                r22.close();
                            } catch (SQLiteException e14) {
                                AbstractC20110a.m104539h(e14);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r22 = str;
                    if (sQLiteDatabase == null && r22 != 0) {
                        r22.close();
                    }
                    throw th;
                }
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
            }
            try {
                C7966k mo2777u = sQLiteDatabase2.mo2777u(String.format("SELECT MIN(ts) as min_ts FROM %s WHERE ts NOT NULL AND ts != ''", "chats"));
                if (mo2777u != null) {
                    try {
                        if (mo2777u.next()) {
                            j11 = mo2777u.getLong(mo2777u.getColumnIndex("min_ts"));
                        }
                    } catch (Throwable th4) {
                        try {
                            mo2777u.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (mo2777u != null) {
                    mo2777u.close();
                }
            } catch (SQLiteException e15) {
                AbstractC20110a.m104539h(e15);
            }
            if (sQLiteDatabase == null) {
                sQLiteDatabase2.close();
            }
        } catch (SQLiteException e16) {
            AbstractC20110a.m104539h(e16);
        }
        return j11;
    }

    /* renamed from: q */
    private int m41460q() {
        m41454j();
        C7966k c7966k = null;
        try {
            try {
                c7966k = this.f43189a.mo2777u(String.format("SELECT count(*) as count FROM %s ", "chats"));
                if (c7966k != null && c7966k.next()) {
                    int i11 = c7966k.getInt(c7966k.getColumnIndex("count"));
                    try {
                        c7966k.close();
                    } catch (SQLiteException e11) {
                        AbstractC20110a.m104539h(e11);
                    }
                    return i11;
                }
                if (c7966k != null) {
                    try {
                        c7966k.close();
                    } catch (SQLiteException e12) {
                        AbstractC20110a.m104539h(e12);
                    }
                }
                return 50000;
            } catch (Exception e13) {
                AbstractC20110a.m104538g("Exception when get count mes restore.Mes: %s", e13.getMessage());
                if (c7966k != null) {
                    try {
                        c7966k.close();
                    } catch (SQLiteException e14) {
                        AbstractC20110a.m104539h(e14);
                    }
                }
                return 50000;
            }
        } catch (Throwable th2) {
            if (c7966k != null) {
                try {
                    c7966k.close();
                } catch (SQLiteException e15) {
                    AbstractC20110a.m104539h(e15);
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0133  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ArrayList m41461r() {
        int[] iArr;
        char c11;
        char c12;
        m41454j();
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        C7966k c7966k = null;
        try {
            c7966k = this.f43189a.mo2777u(String.format("select * from %s order by rowid desc", "threads"));
            c11 = 2;
            c12 = 3;
            iArr = new int[]{c7966k.getColumnIndex("userId"), c7966k.getColumnIndex("ownerId"), c7966k.getColumnIndex("ownerType"), c7966k.getColumnIndex("ts"), c7966k.getColumnIndex("fromId"), c7966k.getColumnIndex("displayName"), c7966k.getColumnIndex("msg"), c7966k.getColumnIndex("attach"), c7966k.getColumnIndex("offset"), c7966k.getColumnIndex("sync_status")};
        } catch (Throwable th2) {
            if (c7966k != null) {
            }
            throw th2;
        }
        while (c7966k.next()) {
            C3594a c3594a = new C3594a();
            c3594a.f15176c = c7966k.getInt(iArr[c11]);
            c3594a.f15177d = c7966k.getLong(iArr[c12]);
            c3594a.f15179f = c7966k.getString(iArr[5]);
            c3594a.f15180g = c7966k.getString(iArr[6]);
            c3594a.f15181h = c7966k.getString(iArr[7]);
            int i11 = iArr[8];
            if (i11 >= 0 && iArr[9] >= 0) {
                c3594a.f15182i = c7966k.getInt(i11);
                c3594a.f15183j = c7966k.getInt(iArr[9]);
                try {
                    c3594a.f15174a = Long.parseLong(c7966k.getString(iArr[0]));
                    c3594a.f15175b = Long.parseLong(c7966k.getString(iArr[1]));
                    c3594a.f15178e = 0L;
                    String string = c7966k.getString(iArr[4]);
                    if (!TextUtils.isEmpty(string)) {
                        c3594a.f15178e = Long.parseLong(string);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104535d("parse fromId error ....... %s", e11.getMessage());
                }
                arrayList.add(c3594a);
                c11 = 2;
                c12 = 3;
            } else {
                throw new SQLiteException(-1, "Two column offset & sync_status not exit !!!");
            }
            if (c7966k != null) {
                c7966k.close();
            }
            throw th2;
        }
        c7966k.close();
        AbstractC20110a.m104535d("Time - getThreadsChat:%d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.zing.zalo.db.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.zing.zalo.db.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* renamed from: s */
    public static int m41462s(String str, SQLiteDatabase sQLiteDatabase) {
        ?? r12;
        Exception e11;
        SQLiteDatabase sQLiteDatabase2;
        int i11 = 0;
        try {
            if (sQLiteDatabase == null) {
                r12 = 0;
                r12 = 0;
                try {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            return 0;
                        }
                        File file = new File(str);
                        if (!file.exists()) {
                            return 0;
                        }
                        sQLiteDatabase2 = new SQLiteDatabase(file);
                        try {
                            sQLiteDatabase2.mo2851m();
                            r12 = sQLiteDatabase2;
                        } catch (Exception e12) {
                            e11 = e12;
                            AbstractC20110a.m104539h(e11);
                            if (sQLiteDatabase == null && sQLiteDatabase2 != null) {
                                sQLiteDatabase2.close();
                            }
                            return i11;
                        }
                    } catch (Exception e13) {
                        SQLiteDatabase sQLiteDatabase3 = r12;
                        e11 = e13;
                        sQLiteDatabase2 = sQLiteDatabase3;
                        AbstractC20110a.m104539h(e11);
                        if (sQLiteDatabase == null) {
                            sQLiteDatabase2.close();
                        }
                        return i11;
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteDatabase == null) {
                            try {
                                r12.close();
                            } catch (SQLiteException e14) {
                                AbstractC20110a.m104539h(e14);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r12 = str;
                    if (sQLiteDatabase == null && r12 != 0) {
                        r12.close();
                    }
                    throw th;
                }
            } else {
                r12 = sQLiteDatabase;
            }
            try {
                C7966k mo2777u = r12.mo2777u(String.format("SELECT COUNT(*) as count FROM %s WHERE ownerId != '' AND ownerId NOT NULL", "chats"));
                if (mo2777u != null) {
                    try {
                        if (mo2777u.next()) {
                            i11 = mo2777u.getInt(mo2777u.getColumnIndex("count"));
                        }
                    } catch (Throwable th4) {
                        try {
                            mo2777u.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (mo2777u != null) {
                    mo2777u.close();
                }
            } catch (SQLiteException e15) {
                AbstractC20110a.m104539h(e15);
            }
            if (sQLiteDatabase == null) {
                r12.close();
            }
        } catch (SQLiteException e16) {
            AbstractC20110a.m104539h(e16);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m41463t(InterfaceC20091a interfaceC20091a, boolean z11) {
        synchronized (this.f43201m) {
            this.f43197i++;
        }
        if (this.f43197i == this.f43198j) {
            interfaceC20091a.mo41472a();
            if (z11 && !this.f43195g.isShutdown()) {
                this.f43195g.shutdownNow();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m41464u(InterfaceC20091a interfaceC20091a, String str, int i11) {
        try {
            synchronized (this.f43201m) {
                try {
                    if (this.f43196h) {
                        return;
                    }
                    AbstractC20110a.m104542k(8, "handleFailInsertData", new Object[0]);
                    this.f43196h = true;
                    this.f43199k = true;
                    interfaceC20091a.mo41473b(str, i11);
                    if (!this.f43195g.isShutdown()) {
                        this.f43195g.shutdownNow();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m41465v(int i11) {
        synchronized (this.f43201m) {
            this.f43197i = 0;
            this.f43198j = i11;
        }
    }

    /* renamed from: w */
    private void m41466w() {
        if (this.f43189a.isOpen()) {
            this.f43189a.mo2774n(String.format("DELETE FROM %s WHERE %s != '%s' OR %s is null OR %s = ''", "chats", "userId", CoreUtility.f89233i, "ownerId", "ownerId"));
            this.f43189a.mo2774n(String.format("DELETE FROM %s WHERE %s != '%s' OR %s is null OR %s = ''", "threads", "userId", CoreUtility.f89233i, "ownerId", "ownerId"));
            if (!m41467y("threads")) {
                return;
            }
            if (!AbstractC0937t.m4454e(this.f43189a, "threads", "offset")) {
                m41453i(this.f43189a, "threads", "offset", "INTEGER", "0");
            }
            if (!AbstractC0937t.m4454e(this.f43189a, "threads", "sync_status")) {
                m41453i(this.f43189a, "threads", "sync_status", "INTEGER", "0");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:            if (r1 == null) goto L18;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:            if (r1.next() == false) goto L12;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:            return r0;     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m41467y(String str) {
        boolean z11 = true;
        C7966k c7966k = null;
        try {
            try {
                c7966k = this.f43189a.mo2777u("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'");
                if (c7966k != null) {
                }
                z11 = false;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        } finally {
            if (c7966k != null) {
                c7966k.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public int m41468z(C3594a c3594a, TargetBackupInfo targetBackupInfo, ContactProfile contactProfile, int i11) {
        boolean z11;
        if (c3594a.m18207b()) {
            return 0;
        }
        if (!C26263i.m135055u().m135069I()) {
            try {
                ArrayList m41458o = m41458o(c3594a.f15175b, c3594a.f15176c, c3594a.f15182i, i11, contactProfile.f42428p, targetBackupInfo.m40952h());
                if (m41458o.size() > 0) {
                    Collections.reverse(m41458o);
                    c3594a.f15182i += m41458o.size();
                    c3594a.f15184k += m41458o.size();
                    if (String.valueOf(c3594a.f15174a).equals(CoreUtility.f89233i)) {
                        AbstractC23306f.m120677j0().m101509a(new C29594j.a(CoreUtility.f89233i, contactProfile.mo2478b(), m41458o, InterfaceC3534b.a.f14894a));
                    } else {
                        throw new BackupRestoreException("Insert msg to main DB failed: Current user is logout or changed");
                    }
                }
                if (m41458o.size() < i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m41444D(c3594a, z11);
                AbstractC20110a.m104535d("insertMesOfThreadtoMain count:%s", Integer.valueOf(m41458o.size()));
                return m41458o.size();
            } catch (SQLiteException e11) {
                AbstractC20110a.m104539h(e11);
                if (e11.m41426a() != 21) {
                    return 0;
                }
                throw new BackupRestoreException("Insert msg to main DB failed: SQLite error code 21");
            } catch (Exception e12) {
                if (!(e12 instanceof BackupRestoreException)) {
                    AbstractC20110a.m104539h(e12);
                    return 0;
                }
                throw ((BackupRestoreException) e12);
            }
        }
        throw new BackupRestoreException("Insert msg to main DB failed: interrupted");
    }

    /* renamed from: A */
    public boolean m41469A(TargetBackupInfo targetBackupInfo, C21690e c21690e, InterfaceC20091a interfaceC20091a, long j11) {
        if (this.f43190b.isEmpty()) {
            AbstractC20110a.m104542k(8, "mListConversationCross-empty data", new Object[0]);
            return false;
        }
        C0945x m116067y0 = C22447s.m116067y0(c21690e, targetBackupInfo.m40961q());
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.f43190b.size(); i11++) {
            C3594a c3594a = (C3594a) this.f43190b.get(i11);
            if (c3594a.m18208c() && !AbstractC25495a.m132078c(c3594a.m18206a()) && AbstractC23195r2.m119524k(c3594a, m116067y0)) {
                arrayList.add(c3594a);
            }
        }
        if (arrayList.isEmpty()) {
            AbstractC20110a.m104542k(8, "listConversationFilterInsert-empty data", new Object[0]);
            return false;
        }
        AbstractC20110a.m104542k(8, "triggerInsertDataToMainChat-thread=" + arrayList.size() + ", msg=" + this.f43192d, new Object[0]);
        m41465v(arrayList.size());
        a aVar = new a(j11, arrayList, targetBackupInfo, c21690e, interfaceC20091a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f43195g.execute(new b((C3594a) it.next(), targetBackupInfo, c21690e, aVar, false));
        }
        return true;
    }

    protected void finalize() {
        if (m41471x()) {
            m41470n();
        }
        super.finalize();
    }

    /* renamed from: n */
    public void m41470n() {
        m41454j();
        this.f43189a.mo2840A();
    }

    /* renamed from: x */
    public boolean m41471x() {
        return this.f43189a.isOpen();
    }
}

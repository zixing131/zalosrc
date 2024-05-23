package com.zing.zalo.p062db;

import am.AbstractC0900b0;
import am.AbstractC0937t;
import am.C0941v;
import am.InterfaceC0911g;
import am.InterfaceC0947y;
import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.NativeLoader;
import com.zing.zalocore.CoreUtility;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class SQLiteDatabase implements InterfaceC0947y {

    /* renamed from: m */
    private static final String[] f43167m = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: n */
    private static boolean f43168n;

    /* renamed from: a */
    private final String f43169a;

    /* renamed from: b */
    private String f43170b;

    /* renamed from: c */
    private long f43171c;

    /* renamed from: d */
    private boolean f43172d;

    /* renamed from: e */
    private boolean f43173e;

    /* renamed from: f */
    private InterfaceC0911g f43174f;

    /* renamed from: g */
    private long f43175g;

    /* renamed from: h */
    private final C7954b f43176h;

    /* renamed from: i */
    private long f43177i;

    /* renamed from: j */
    private long f43178j;

    /* renamed from: k */
    private long f43179k;

    /* renamed from: l */
    private boolean f43180l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.db.SQLiteDatabase$a */
    /* loaded from: classes3.dex */
    public class C7953a implements FileFilter {

        /* renamed from: a */
        final /* synthetic */ String f43181a;

        C7953a(String str) {
            this.f43181a = str;
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.getName().startsWith(this.f43181a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.db.SQLiteDatabase$b */
    /* loaded from: classes.dex */
    public static class C7954b extends ReentrantLock {
        C7954b(boolean z11) {
            super(z11);
        }

        /* renamed from: a */
        public String m41425a() {
            Thread owner = getOwner();
            if (owner == null) {
                return "none";
            }
            return String.valueOf(owner.getId());
        }

        @Override // java.util.concurrent.locks.ReentrantLock
        public Thread getOwner() {
            return super.getOwner();
        }
    }

    static {
        m41403I();
        f43168n = false;
    }

    public SQLiteDatabase(Context context, String str, InterfaceC0911g interfaceC0911g) {
        this.f43172d = false;
        this.f43176h = new C7954b(true);
        this.f43177i = 0L;
        this.f43178j = 0L;
        this.f43179k = 0L;
        this.f43180l = true;
        File databasePath = context.getDatabasePath(str);
        String path = databasePath.getPath();
        this.f43169a = path;
        this.f43170b = new File(path).getParent();
        databasePath.getParentFile().mkdirs();
        this.f43174f = interfaceC0911g == null ? new C0941v() : interfaceC0911g;
    }

    /* renamed from: G */
    private boolean m41402G(String str, List list, Map map) {
        SQLiteStatement m41408b = m41408b(str, list, map);
        int mo2784f = m41408b.mo2784f();
        m41408b.close();
        if (mo2784f != 101) {
            m41419Q(mo2784f, m41414H(), str);
        }
        m41406M(str);
        return true;
    }

    /* renamed from: I */
    public static void m41403I() {
        try {
            if (!f43168n) {
                f43168n = true;
                NativeLoader.m89238q(CoreUtility.getAppContext(), EnumC16739a.f84858A);
            }
        } catch (Throwable th2) {
            AbstractC0900b0.m2788d("SQLiteDatabase", th2);
        }
    }

    /* renamed from: K */
    private void m41404K(String str, boolean z11) {
        if (Thread.holdsLock(this)) {
            AbstractC0900b0.m2789e("SQLiteDatabase", "don't lock() while in a synchronized method");
        }
        m41421T();
        if (!z11 && !this.f43180l) {
            return;
        }
        SystemClock.uptimeMillis();
        boolean z12 = false;
        while (!z12) {
            try {
                z12 = this.f43176h.tryLock(30L, TimeUnit.SECONDS);
                if (!z12) {
                    AbstractC0900b0.m2789e("SQLiteDatabase", "database lock has not been available for 30 sec. Current Owner of the lock is " + this.f43176h.m41425a() + ". Continuing to wait in thread: " + Thread.currentThread().getId());
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: L */
    private void m41405L(String str) {
        m41404K(str, true);
    }

    /* renamed from: M */
    private void m41406M(String str) {
    }

    /* renamed from: R */
    private void m41407R() {
        this.f43176h.unlock();
    }

    /* renamed from: b */
    private SQLiteStatement m41408b(String str, List list, Map map) {
        SQLiteStatement mo2853r = mo2853r(str);
        int i11 = 1;
        int m41433l = mo2853r.m41433l() + 1;
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                int m41439r = mo2853r.m41439r(":" + str2);
                if (m41439r > 0) {
                    mo2853r.mo2783e(m41439r, map.get(str2));
                    i11++;
                }
            }
        } else if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo2853r.mo2783e(i11, it.next());
                i11++;
            }
        }
        if (i11 != m41433l) {
            int close = mo2853r.close();
            if (close != 0) {
                m41418P(close, lastErrorMessage(this.f43171c));
            }
            m41419Q(21, "The bind count is not correct for the number of variables", str);
        }
        return mo2853r;
    }

    @Deprecated
    private native long backupDB(long j11, String str, String str2, int i11, int i12, int i13, int[] iArr, String[] strArr);

    private native long backupDBNoEnCrypt(long j11, String str, int i11, int[] iArr, String[] strArr);

    private native void beginTransaction(long j11);

    /* renamed from: c */
    private SQLiteStatement m41409c(String str, Object[] objArr) {
        SQLiteStatement mo2853r = mo2853r(str);
        int i11 = 1;
        int m41433l = mo2853r.m41433l() + 1;
        if (objArr != null && objArr.length > 0) {
            int length = objArr.length;
            int i12 = 0;
            while (i12 < length) {
                mo2853r.mo2783e(i11, objArr[i12]);
                i12++;
                i11++;
            }
        }
        if (i11 != m41433l) {
            int close = mo2853r.close();
            if (close != 0) {
                m41418P(close, lastErrorMessage(this.f43171c));
            }
            m41419Q(21, "The bind count is not correct for the number of variables", str);
        }
        return mo2853r;
    }

    private native int close(long j11);

    private native void commitTransaction(long j11);

    /* renamed from: d */
    public static boolean m41410d(File file) {
        boolean z11;
        if (file != null) {
            File file2 = new File(file.getPath() + "-shm");
            if (file2.exists()) {
                z11 = file2.delete();
            } else {
                file2.delete();
                z11 = false;
            }
            File file3 = new File(file.getPath() + "-wal");
            if (file3.exists()) {
                return z11 | file3.delete();
            }
            file3.delete();
            return z11;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    private native int exec(long j11, String str, String[] strArr);

    /* renamed from: f */
    public static boolean m41411f(File file) {
        boolean delete;
        if (file != null) {
            if (!file.exists()) {
                file.delete();
                delete = true;
            } else {
                delete = file.delete();
            }
            File file2 = new File(file.getPath() + "-journal");
            if (file2.exists()) {
                delete |= file2.delete();
            } else {
                file2.delete();
            }
            File file3 = new File(file.getPath() + "-shm");
            if (file3.exists()) {
                delete |= file3.delete();
            } else {
                file3.delete();
            }
            File file4 = new File(file.getPath() + "-wal");
            if (file4.exists()) {
                delete |= file4.delete();
            } else {
                file4.delete();
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                File[] listFiles = parentFile.listFiles(new C7953a(file.getName() + "-mj"));
                if (listFiles != null) {
                    for (File file5 : listFiles) {
                        delete |= file5.delete();
                    }
                }
            }
            return delete;
        }
        throw new IllegalArgumentException("file must not be null");
    }

    /* renamed from: j */
    private C7966k m41412j(String str, List list, Map map) {
        C7966k c7966k = new C7966k(this, m41408b(str, list, map));
        m41406M(str);
        return c7966k;
    }

    private native String lastErrorMessage(long j11);

    private native long lastInsertId(long j11);

    private native long open(String str, int i11, int[] iArr, String[] strArr);

    private native long prepare(long j11, String str, int[] iArr);

    @Deprecated
    private native int restoreDB(String str, String str2, String str3, String[] strArr);

    @Deprecated
    private native int restoreDBNoEnCrypt(String str, String str2, String[] strArr);

    private native void rollbackTransaction(long j11);

    private native void setTempDir(String str);

    @Override // am.InterfaceC0947y
    /* renamed from: A */
    public boolean mo2840A() {
        if (close(this.f43171c) != 0) {
            return false;
        }
        this.f43171c = 0L;
        return true;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: B */
    public int mo2770B(String str, String str2, String[] strArr) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DELETE FROM ");
        sb2.append(str);
        if (!TextUtils.isEmpty(str2)) {
            str3 = " WHERE " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        SQLiteStatement m41409c = m41409c(sb2.toString(), strArr);
        try {
            return m41409c.mo2779a();
        } finally {
            m41409c.close();
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: C */
    public long mo2771C(String str, String str2, ContentValues contentValues) {
        try {
            return mo2855t(str, str2, contentValues, 0);
        } catch (SQLiteException e11) {
            AbstractC0900b0.m2787c("SQLiteDatabase", "Error inserting " + contentValues, e11);
            return -1L;
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: D */
    public void mo2841D(int i11) {
        String[] strArr = new String[1];
        String str = "PRAGMA soft_heap_limit=" + i11;
        int exec = exec(this.f43171c, str, strArr);
        if (exec == 0) {
        } else {
            throw new SQLiteException(exec, strArr[0], str);
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C7966k mo2775p(String str, Object... objArr) {
        List asList;
        if (objArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
        }
        return m41424i(str, asList);
    }

    /* renamed from: F */
    public boolean m41413F(String str, List list) {
        return m41402G(str, list, null);
    }

    /* renamed from: H */
    public String m41414H() {
        return lastErrorMessage(this.f43171c);
    }

    /* renamed from: J */
    public boolean m41415J() {
        return this.f43176h.isHeldByCurrentThread();
    }

    /* renamed from: N */
    public void m41416N(int i11) {
        int[] iArr = new int[1];
        String[] strArr = new String[1];
        long open = open(this.f43169a, i11, iArr, strArr);
        int i12 = iArr[0];
        if (i12 != 0 || open == 0 || strArr[0] != null) {
            m41418P(i12, strArr[0]);
        }
        this.f43171c = open;
        setTempDir(this.f43170b);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public SQLiteStatement mo2853r(String str) {
        int[] iArr = new int[1];
        long prepare = prepare(this.f43171c, str, iArr);
        int i11 = iArr[0];
        if (i11 != 0 || prepare == 0) {
            m41419Q(i11, lastErrorMessage(this.f43171c), str);
        }
        return new SQLiteStatement(this.f43171c, prepare);
    }

    /* renamed from: P */
    public final void m41418P(int i11, String str) {
        m41419Q(i11, str, null);
    }

    /* renamed from: Q */
    public final void m41419Q(int i11, String str, String str2) {
        if (i11 != 11 && i11 != 26) {
            SQLiteException sQLiteException = new SQLiteException(i11, str, str2);
            this.f43174f.mo2832b(this, sQLiteException);
            throw sQLiteException;
        }
        SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = new SQLiteDatabaseCorruptException(i11, str, str2);
        this.f43174f.mo2831a(this, sQLiteDatabaseCorruptException);
        throw sQLiteDatabaseCorruptException;
    }

    /* renamed from: S */
    public int m41420S(String str, ContentValues contentValues, String str2, String[] strArr, int i11) {
        int length;
        String str3;
        if (contentValues != null && contentValues.size() != 0) {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("UPDATE ");
            sb2.append(f43167m[i11]);
            sb2.append(str);
            sb2.append(" SET ");
            int size = contentValues.size();
            if (strArr == null) {
                length = size;
            } else {
                length = strArr.length + size;
            }
            Object[] objArr = new Object[length];
            Iterator<Map.Entry<String, Object>> it = contentValues.valueSet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (i12 > 0) {
                    str3 = ",";
                } else {
                    str3 = "";
                }
                sb2.append(str3);
                sb2.append(key);
                objArr[i12] = contentValues.get(key);
                sb2.append("=?");
                i12++;
            }
            if (strArr != null) {
                for (int i13 = size; i13 < length; i13++) {
                    objArr[i13] = strArr[i13 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            SQLiteStatement m41409c = m41409c(sb2.toString(), objArr);
            try {
                return m41409c.mo2779a();
            } finally {
                m41409c.close();
            }
        }
        throw new IllegalArgumentException("Empty values");
    }

    /* renamed from: T */
    void m41421T() {
        if (isOpen()) {
            return;
        }
        throw new IllegalStateException("database " + this.f43169a + " already closed");
    }

    /* renamed from: U */
    void m41422U() {
        m41421T();
        if (this.f43180l && !m41415J()) {
            throw new IllegalStateException("Don't have database lock!");
        }
    }

    /* renamed from: a */
    public void m41423a(String str) {
        int[] iArr = new int[1];
        String[] strArr = new String[1];
        backupDBNoEnCrypt(this.f43171c, str, 6, iArr, strArr);
        if (iArr[0] == 0 && strArr[0] != null) {
            throw new SQLiteException(iArr[0], strArr[0]);
        }
    }

    public native int abort(String str);

    @Override // am.InterfaceC0947y
    public boolean close() {
        int close = close(this.f43171c);
        if (close != 0) {
            m41418P(close, lastErrorMessage(this.f43171c));
        }
        this.f43171c = 0L;
        return true;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: e */
    public void mo2845e() {
        m41421T();
        m41405L("BEGIN;");
        try {
            if (this.f43176h.getHoldCount() > 1) {
                if (!this.f43172d) {
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                AbstractC0900b0.m2789e("SQLiteDatabase", "beginTransaction() failed");
                throw illegalStateException;
            }
            beginTransaction(this.f43171c);
            this.f43175g = SystemClock.uptimeMillis();
            this.f43173e = true;
            this.f43172d = false;
        } catch (Throwable th2) {
            m41407R();
            throw th2;
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: g */
    public List mo2846g() {
        HashSet hashSet = new HashSet();
        hashSet.add(mo2856w());
        return Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    @Override // am.InterfaceC0947y
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C7966k mo2777u(String str) {
        return mo2775p(str, null);
    }

    /* renamed from: i */
    public C7966k m41424i(String str, List list) {
        return m41412j(str, list, null);
    }

    @Override // am.InterfaceC0947y
    public boolean isOpen() {
        return this.f43171c != 0;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: k */
    public void mo2849k() {
        m41421T();
        if (this.f43176h.isHeldByCurrentThread()) {
            if (!this.f43172d) {
                this.f43172d = true;
                return;
            }
            throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
        }
        throw new IllegalStateException("no transaction pending");
    }

    @Override // am.InterfaceC0947y
    /* renamed from: l */
    public void mo2850l() {
        m41422U();
        try {
            if (this.f43172d) {
                this.f43172d = false;
            } else {
                this.f43173e = false;
            }
            if (this.f43176h.getHoldCount() != 1) {
                m41407R();
                return;
            }
            if (this.f43173e) {
                commitTransaction(this.f43171c);
            } else {
                try {
                    rollbackTransaction(this.f43171c);
                    AbstractC0900b0.m2786b("SQLiteDatabase", "endTransaction - rollbackTransaction - " + this.f43171c);
                } catch (Throwable unused) {
                    AbstractC0900b0.m2786b("SQLiteDatabase", "exception during rollback, maybe the DB previously performed an auto-rollback");
                }
            }
            m41407R();
        } catch (Throwable th2) {
            m41407R();
            throw th2;
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: m */
    public void mo2851m() {
        m41416N(6);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: n */
    public boolean mo2774n(String str) {
        return mo2778v(str, null);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: o */
    public int mo2852o() {
        return Long.valueOf(AbstractC0937t.m4456g(this, "PRAGMA locking_mode;", null)).intValue();
    }

    @Override // am.InterfaceC0947y
    /* renamed from: q */
    public int mo2776q(String str, ContentValues contentValues, String str2, String[] strArr) {
        return m41420S(str, contentValues, str2, strArr, 0);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: s */
    public void mo2854s() {
        String[] strArr = new String[1];
        int exec = exec(this.f43171c, "PRAGMA journal_mode=WAL;", strArr);
        if (exec == 0) {
            mo2857x("PRAGMA synchronous=1;");
            mo2857x("PRAGMA wal_autocheckpoint=100;");
            mo2857x("PRAGMA wal_checkpoint;");
            return;
        }
        throw new SQLiteException(exec, strArr[0], "PRAGMA journal_mode=WAL;");
    }

    @Override // am.InterfaceC0947y
    /* renamed from: t */
    public long mo2855t(String str, String str2, ContentValues contentValues, int i11) {
        int i12;
        Object[] objArr;
        String str3;
        String str4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT");
        sb2.append(f43167m[i11]);
        sb2.append(" INTO ");
        sb2.append(str);
        sb2.append('(');
        if (contentValues != null && contentValues.size() > 0) {
            i12 = contentValues.size();
        } else {
            i12 = 0;
        }
        if (i12 > 0) {
            objArr = new Object[i12];
            Iterator<Map.Entry<String, Object>> it = contentValues.valueSet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (i13 > 0) {
                    str4 = ",";
                } else {
                    str4 = "";
                }
                sb2.append(str4);
                sb2.append(key);
                objArr[i13] = contentValues.get(key);
                i13++;
            }
            sb2.append(')');
            sb2.append(" VALUES (");
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 > 0) {
                    str3 = ",?";
                } else {
                    str3 = "?";
                }
                sb2.append(str3);
            }
        } else {
            sb2.append(str2 + ") VALUES (NULL");
            objArr = null;
        }
        sb2.append(')');
        SQLiteStatement m41409c = m41409c(sb2.toString(), objArr);
        try {
            return m41409c.mo2780b();
        } finally {
            m41409c.close();
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: v */
    public boolean mo2778v(String str, Object... objArr) {
        List asList;
        if (objArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
        }
        return m41413F(str, asList);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: w */
    public String mo2856w() {
        return this.f43169a;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: x */
    public void mo2857x(String str) {
        String[] strArr = new String[1];
        int exec = exec(this.f43171c, str, strArr);
        if (exec != 0) {
            m41419Q(exec, strArr[0], str);
        }
        m41406M(str);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: y */
    public boolean mo2858y() {
        int[] iArr = new int[1];
        String[] strArr = new String[1];
        long open = open(this.f43169a, 6, iArr, strArr);
        if (iArr[0] != 0 || open == 0 || strArr[0] != null) {
            return false;
        }
        this.f43171c = open;
        setTempDir(this.f43170b);
        return true;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: z */
    public void mo2859z(InterfaceC0911g interfaceC0911g) {
        if (interfaceC0911g != null) {
            this.f43174f = interfaceC0911g;
        }
    }

    public SQLiteDatabase(Context context, String str) {
        this(context, str, null);
    }

    public SQLiteDatabase(File file) {
        this.f43172d = false;
        this.f43176h = new C7954b(true);
        this.f43177i = 0L;
        this.f43178j = 0L;
        this.f43179k = 0L;
        this.f43180l = true;
        this.f43169a = file.getPath();
        this.f43170b = file.getParent();
        file.getParentFile().mkdirs();
        this.f43174f = new C0941v();
    }
}

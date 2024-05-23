package am;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.zing.zalo.p062db.SQLiteException;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: am.i0 */
/* loaded from: classes3.dex */
public class C0916i0 implements InterfaceC0947y {

    /* renamed from: g */
    private static final String[] f3407g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: a */
    private final Context f3408a;

    /* renamed from: b */
    private final String f3409b;

    /* renamed from: c */
    private final String f3410c;

    /* renamed from: d */
    private final File f3411d;

    /* renamed from: e */
    InterfaceC0911g f3412e;

    /* renamed from: f */
    private SQLiteDatabase f3413f;

    public C0916i0(Context context, String str, InterfaceC0911g interfaceC0911g) {
        this.f3410c = str;
        this.f3408a = context;
        File databasePath = context.getDatabasePath(str);
        this.f3411d = databasePath;
        this.f3409b = databasePath.getPath();
        this.f3412e = interfaceC0911g == null ? new C0941v() : interfaceC0911g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m2833E(SQLiteDatabase sQLiteDatabase) {
        InterfaceC0911g interfaceC0911g = this.f3412e;
        if (interfaceC0911g != null) {
            interfaceC0911g.mo2831a(this, null);
        }
    }

    /* renamed from: F */
    private void m2834F(String str) {
    }

    /* renamed from: d */
    private InterfaceC0897a0 m2837d(String str, List list) {
        InterfaceC0897a0 mo2853r = mo2853r(str);
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            int i11 = 1;
            while (it.hasNext()) {
                mo2853r.mo2783e(i11, it.next());
                i11++;
            }
        }
        return mo2853r;
    }

    /* renamed from: f */
    private InterfaceC0897a0 m2838f(String str, Object[] objArr) {
        InterfaceC0897a0 mo2853r = mo2853r(str);
        if (objArr != null && objArr.length > 0) {
            int length = objArr.length;
            int i11 = 1;
            int i12 = 0;
            while (i12 < length) {
                mo2853r.mo2783e(i11, objArr[i12]);
                i12++;
                i11++;
            }
        }
        return mo2853r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m2839j(SQLiteDatabase sQLiteDatabase) {
        InterfaceC0911g interfaceC0911g = this.f3412e;
        if (interfaceC0911g != null) {
            interfaceC0911g.mo2831a(this, null);
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: A */
    public boolean mo2840A() {
        try {
            this.f3413f.close();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        this.f3413f = null;
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
        InterfaceC0897a0 m2838f = m2838f(sb2.toString(), strArr);
        try {
            return m2838f.mo2779a();
        } finally {
            m2838f.close();
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: C */
    public long mo2771C(String str, String str2, ContentValues contentValues) {
        try {
            return mo2855t(str, str2, contentValues, 0);
        } catch (SQLiteException e11) {
            AbstractC0900b0.m2787c("DBStockWrapper", "Error inserting " + contentValues, e11);
            return -1L;
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: D */
    public void mo2841D(int i11) {
    }

    /* renamed from: G */
    public void m2842G(int i11) {
        String str;
        if (TextUtils.isEmpty(this.f3410c)) {
            str = ":memory:";
        } else {
            str = this.f3409b;
        }
        this.f3413f = SQLiteDatabase.openDatabase(str, null, i11, new DatabaseErrorHandler() { // from class: am.g0
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                C0916i0.this.m2839j(sQLiteDatabase);
            }
        });
    }

    /* renamed from: H */
    public int m2843H(String str, ContentValues contentValues, String str2, String[] strArr, int i11) {
        int length;
        String str3;
        if (contentValues != null && contentValues.size() != 0) {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("UPDATE ");
            sb2.append(f3407g[i11]);
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
            InterfaceC0897a0 m2838f = m2838f(sb2.toString(), objArr);
            try {
                return m2838f.mo2779a();
            } finally {
                m2838f.close();
            }
        }
        throw new IllegalArgumentException("Empty values");
    }

    /* renamed from: c */
    public void m2844c(String str) {
        throw new UnsupportedOperationException("unsupported backupDatabaseNoEncrypt - " + this.f3410c);
    }

    @Override // am.InterfaceC0947y
    public boolean close() {
        this.f3413f.close();
        return true;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: e */
    public void mo2845e() {
        this.f3413f.beginTransaction();
    }

    @Override // am.InterfaceC0947y
    /* renamed from: g */
    public List mo2846g() {
        HashSet hashSet = new HashSet();
        hashSet.add(mo2856w());
        return Arrays.asList((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    /* renamed from: h */
    public InterfaceC0949z m2847h(String str, List list) {
        String[] strArr;
        String str2;
        if (list != null && list.size() > 0) {
            strArr = new String[list.size()];
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = "";
                }
                strArr[i11] = str2;
                i11 = i12;
            }
        } else {
            strArr = null;
        }
        C0920k0 c0920k0 = new C0920k0(this.f3413f.rawQuery(str, strArr));
        m2834F(str);
        return c0920k0;
    }

    /* renamed from: i */
    public boolean m2848i(String str, List list) {
        InterfaceC0897a0 m2837d = m2837d(str, list);
        int mo2784f = m2837d.mo2784f();
        m2837d.close();
        m2834F(str);
        if (mo2784f != 101) {
            return true;
        }
        return false;
    }

    @Override // am.InterfaceC0947y
    public boolean isOpen() {
        SQLiteDatabase sQLiteDatabase = this.f3413f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        return false;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: k */
    public void mo2849k() {
        this.f3413f.setTransactionSuccessful();
    }

    @Override // am.InterfaceC0947y
    /* renamed from: l */
    public void mo2850l() {
        this.f3413f.endTransaction();
    }

    @Override // am.InterfaceC0947y
    /* renamed from: m */
    public void mo2851m() {
        m2842G(268435456);
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
    /* renamed from: p */
    public InterfaceC0949z mo2775p(String str, Object... objArr) {
        List asList;
        if (objArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
        }
        return m2847h(str, asList);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: q */
    public int mo2776q(String str, ContentValues contentValues, String str2, String[] strArr) {
        return m2843H(str, contentValues, str2, strArr, 0);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: r */
    public InterfaceC0897a0 mo2853r(String str) {
        return new C0922l0(this.f3413f.compileStatement(str));
    }

    @Override // am.InterfaceC0947y
    /* renamed from: s */
    public void mo2854s() {
        this.f3413f.enableWriteAheadLogging();
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
        sb2.append(f3407g[i11]);
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
        InterfaceC0897a0 m2838f = m2838f(sb2.toString(), objArr);
        try {
            return m2838f.mo2780b();
        } finally {
            m2838f.close();
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: u */
    public InterfaceC0949z mo2777u(String str) {
        return mo2775p(str, null);
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
        return m2848i(str, asList);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: w */
    public String mo2856w() {
        return this.f3409b;
    }

    @Override // am.InterfaceC0947y
    /* renamed from: x */
    public void mo2857x(String str) {
        this.f3413f.execSQL(str);
        m2834F(str);
    }

    @Override // am.InterfaceC0947y
    /* renamed from: y */
    public boolean mo2858y() {
        try {
            this.f3413f = this.f3408a.openOrCreateDatabase(this.f3410c, 0, null, new DatabaseErrorHandler() { // from class: am.h0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    C0916i0.this.m2833E(sQLiteDatabase);
                }
            });
            return true;
        } catch (Exception e11) {
            AbstractC0900b0.m2788d("DBStockWrapper", e11);
            return false;
        }
    }

    @Override // am.InterfaceC0947y
    /* renamed from: z */
    public void mo2859z(InterfaceC0911g interfaceC0911g) {
        if (interfaceC0911g != null) {
            this.f3412e = interfaceC0911g;
        }
    }
}

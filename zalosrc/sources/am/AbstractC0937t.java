package am;

import android.text.TextUtils;
import com.zing.zalo.p062db.C7966k;
import com.zing.zalo.p062db.SQLiteDatabase;

/* renamed from: am.t */
/* loaded from: classes.dex */
public abstract class AbstractC0937t {
    /* renamed from: a */
    public static void m4450a(InterfaceC0947y interfaceC0947y, String str, String str2) {
        if (!m4454e(interfaceC0947y, str, str2)) {
            interfaceC0947y.mo2857x("ALTER TABLE " + str + " ADD " + str2);
            return;
        }
        AbstractC0900b0.m2785a("DatabaseUtils", "addColumnToTable(). Already exists column " + str2 + " in table " + str);
    }

    /* renamed from: b */
    public static void m4451b(InterfaceC0947y interfaceC0947y, String str, String str2, String str3, String str4) {
        if (!m4454e(interfaceC0947y, str, str2)) {
            interfaceC0947y.mo2857x("ALTER TABLE " + str + " ADD " + str2 + " " + str3 + " DEFAULT " + str4);
            return;
        }
        AbstractC0900b0.m2785a("DatabaseUtils", "addColumnToTable(). Already exists column " + str2 + " in table " + str);
    }

    /* renamed from: c */
    public static void m4452c(InterfaceC0947y interfaceC0947y, String str, String str2) {
        interfaceC0947y.mo2857x("CREATE INDEX IF NOT EXISTS " + str2 + "_idx ON " + str + " (" + str2 + ")");
    }

    /* renamed from: d */
    public static void m4453d(InterfaceC0947y interfaceC0947y, String str) {
        interfaceC0947y.mo2857x("DROP INDEX IF EXISTS " + str + "_idx");
    }

    /* renamed from: e */
    public static boolean m4454e(InterfaceC0947y interfaceC0947y, String str, String str2) {
        InterfaceC0949z interfaceC0949z = null;
        boolean z11 = false;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
                interfaceC0949z = interfaceC0947y.mo2777u("SELECT * FROM " + str + " LIMIT 0");
                if (interfaceC0949z != null) {
                    if (interfaceC0949z.getColumnIndex(str2) != -1) {
                        z11 = true;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
            }
            if (interfaceC0949z != null) {
                interfaceC0949z.close();
            }
            return z11;
        } catch (Throwable th2) {
            if (interfaceC0949z != null) {
                try {
                    interfaceC0949z.close();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b A[DONT_GENERATE] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4455f(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z11;
        C7966k c7966k = null;
        try {
            c7966k = sQLiteDatabase.mo2777u("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'");
            if (c7966k != null) {
                if (c7966k.next()) {
                    z11 = true;
                    return z11;
                }
            }
            z11 = false;
            return z11;
        } finally {
            if (c7966k != null) {
                c7966k.close();
            }
        }
    }

    /* renamed from: g */
    public static long m4456g(InterfaceC0947y interfaceC0947y, String str, String[] strArr) {
        InterfaceC0897a0 mo2853r = interfaceC0947y.mo2853r(str);
        try {
            return m4457h(mo2853r, strArr);
        } finally {
            mo2853r.close();
        }
    }

    /* renamed from: h */
    public static long m4457h(InterfaceC0897a0 interfaceC0897a0, String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                interfaceC0897a0.mo2781c(length, strArr[length - 1]);
            }
        }
        return interfaceC0897a0.mo2782d();
    }

    /* renamed from: i */
    public static int m4458i(InterfaceC0949z interfaceC0949z, String str, int i11) {
        int columnIndex = interfaceC0949z.getColumnIndex(str);
        if (columnIndex == -1) {
            return i11;
        }
        String string = interfaceC0949z.getString(columnIndex);
        if (!TextUtils.isEmpty(string)) {
            return Integer.parseInt(string);
        }
        return i11;
    }
}

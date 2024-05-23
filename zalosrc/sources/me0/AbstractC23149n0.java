package me0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mm0.AbstractC23350e;
import p716zh.C31944h6;

/* renamed from: me0.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC23149n0 {
    /* renamed from: a */
    public static void m118853a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        if (!m118857e(sQLiteDatabase, str, str2)) {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD " + str2);
            AbstractC20110a.m104543l("DBUtils").mo104556o(8, "addColumnToTable(). Added column " + str2 + " into table " + str, new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addColumnToTable(). Already exists column ");
        sb2.append(str2);
        sb2.append(" in table ");
        sb2.append(str);
    }

    /* renamed from: b */
    public static void m118854b(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        if (!m118857e(sQLiteDatabase, str, str2)) {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD " + str2 + " " + str3);
            AbstractC20110a.m104543l("DBUtils").mo104556o(8, "addColumnToTable(). Added column " + str2 + "(" + str3 + ") into table " + str, new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addColumnToTable(). Already exists column ");
        sb2.append(str2);
        sb2.append(" in table ");
        sb2.append(str);
    }

    /* renamed from: c */
    public static void m118855c(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        if (!m118857e(sQLiteDatabase, str, str2)) {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " ADD " + str2 + " " + str3 + " DEFAULT " + str4);
            AbstractC20110a.m104543l("DBUtils").mo104556o(8, "addColumnToTable(). Added column " + str2 + "(" + str3 + ") into table " + str + ", default value " + str4, new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("addColumnToTable(). Already exists column ");
        sb2.append(str2);
        sb2.append(" in table ");
        sb2.append(str);
    }

    /* renamed from: d */
    public static String m118856d(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (!str.isEmpty()) {
                    str2 = " AND " + str2;
                }
                sb2.append(str2);
                str = sb2.toString();
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:            return r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:            if (r0 == null) goto L43;     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m118857e(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        Cursor cursor = null;
        boolean z11 = false;
        try {
            try {
                cursor = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                if (cursor != null) {
                    if (cursor.getColumnIndex(str2) != -1) {
                        z11 = true;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DBUtils", e11);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: f */
    public static StringBuilder m118858f(StackTraceElement[] stackTraceElementArr, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            if (z11) {
                if (stackTraceElementArr.length > 5) {
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[3].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[4].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[5].toString());
                    if (z12 && stackTraceElementArr.length > 6) {
                        sb2.append("|");
                        sb2.append("at ");
                        sb2.append(stackTraceElementArr[6].toString());
                    }
                } else if (stackTraceElementArr.length > 4) {
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[2].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[3].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[4].toString());
                }
            } else if (stackTraceElementArr.length > 3) {
                sb2.append("at ");
                sb2.append(stackTraceElementArr[3].toString());
            }
        }
        return sb2;
    }

    /* renamed from: g */
    public static StringBuilder m118859g(StackTraceElement[] stackTraceElementArr, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            if (z11) {
                if (stackTraceElementArr.length > 11) {
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[9].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[10].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[11].toString());
                } else if (stackTraceElementArr.length > 4) {
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[2].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[3].toString());
                    sb2.append("|");
                    sb2.append("at ");
                    sb2.append(stackTraceElementArr[4].toString());
                }
            } else if (stackTraceElementArr.length > 9) {
                sb2.append("at ");
                sb2.append(stackTraceElementArr[9].toString());
            }
        }
        return sb2;
    }

    /* renamed from: h */
    public static List m118860h(SQLiteDatabase sQLiteDatabase, String str) {
        ArrayList arrayList = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select * from " + str + " limit 1", null);
            if (rawQuery != null) {
                try {
                    arrayList = new ArrayList(Arrays.asList(rawQuery.getColumnNames()));
                } finally {
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (Exception e11) {
            e11.getMessage();
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: i */
    public static String m118861i(String str, Iterable iterable) {
        return m118862j(str, iterable, false, false);
    }

    /* renamed from: j */
    public static String m118862j(String str, Iterable iterable, boolean z11, boolean z12) {
        String str2;
        if (!z12) {
            str2 = " IN ";
        } else {
            str2 = " NOT IN ";
        }
        if (z11) {
            return "(" + str + str2 + "('" + TextUtils.join("','", iterable) + "'))";
        }
        return "(" + str + str2 + "(" + TextUtils.join(",", iterable) + "))";
    }

    /* renamed from: k */
    public static String m118863k(String str) {
        String str2 = "lower(" + str + ") LIKE '%http:%' OR lower(" + str + ") LIKE '%https:%' OR lower(" + str + ") LIKE '%www.%'";
        List m153551q = C31944h6.m153551q();
        if (m153551q == null) {
            return str + " != '' AND (" + str2 + ")";
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < m153551q.size(); i11++) {
            sb2.append("lower(");
            sb2.append(str);
            sb2.append(") LIKE '%.");
            sb2.append((String) m153551q.get(i11));
            sb2.append("%'");
            if (i11 < m153551q.size() - 1) {
                sb2.append(" OR ");
            }
        }
        return str + " != '' AND (" + str2 + " OR " + ((Object) sb2) + ")";
    }

    /* renamed from: l */
    public static boolean m118864l(String str) {
        return str.toLowerCase().startsWith("select");
    }

    /* renamed from: m */
    public static boolean m118865m(String str) {
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("insert") && !lowerCase.startsWith("update") && !lowerCase.startsWith("delete")) {
            return false;
        }
        return true;
    }
}

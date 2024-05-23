package p046c2;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import on0.AbstractC24341v;
import p148f3.C18711c;
import qm0.AbstractC25358n;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3205a {
    /* renamed from: a */
    public static final Cursor m16299a(Cursor cursor) {
        AbstractC19074t.m100208f(cursor, C18711c.f94014e);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                int columnCount = cursor.getColumnCount();
                for (int i11 = 0; i11 < columnCount; i11++) {
                    int type = cursor.getType(i11);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type == 4) {
                                        objArr[i11] = cursor.getBlob(i11);
                                    } else {
                                        throw new IllegalStateException();
                                    }
                                } else {
                                    objArr[i11] = cursor.getString(i11);
                                }
                            } else {
                                objArr[i11] = Double.valueOf(cursor.getDouble(i11));
                            }
                        } else {
                            objArr[i11] = Long.valueOf(cursor.getLong(i11));
                        }
                    } else {
                        objArr[i11] = null;
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC2933b.m13890a(cursor, null);
            return matrixCursor;
        } finally {
        }
    }

    /* renamed from: b */
    private static final int m16300b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        AbstractC19074t.m100207e(columnNames, "columnNames");
        return m16301c(columnNames, str);
    }

    /* renamed from: c */
    public static final int m16301c(String[] strArr, String str) {
        boolean m127125u;
        boolean m127125u2;
        AbstractC19074t.m100208f(strArr, "columnNames");
        AbstractC19074t.m100208f(str, "name");
        String str2 = '.' + str;
        String str3 = '.' + str + '`';
        int length = strArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str4 = strArr[i11];
            int i13 = i12 + 1;
            if (str4.length() >= str.length() + 2) {
                m127125u = AbstractC24341v.m127125u(str4, str2, false, 2, null);
                if (m127125u) {
                    return i12;
                }
                if (str4.charAt(0) == '`') {
                    m127125u2 = AbstractC24341v.m127125u(str4, str3, false, 2, null);
                    if (m127125u2) {
                        return i12;
                    }
                } else {
                    continue;
                }
            }
            i11++;
            i12 = i13;
        }
        return -1;
    }

    /* renamed from: d */
    public static final int m16302d(Cursor cursor, String str) {
        AbstractC19074t.m100208f(cursor, C18711c.f94014e);
        AbstractC19074t.m100208f(str, "name");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex('`' + str + '`');
        if (columnIndex2 < 0) {
            return m16300b(cursor, str);
        }
        return columnIndex2;
    }

    /* renamed from: e */
    public static final int m16303e(Cursor cursor, String str) {
        String str2;
        AbstractC19074t.m100208f(cursor, C18711c.f94014e);
        AbstractC19074t.m100208f(str, "name");
        int m16302d = m16302d(cursor, str);
        if (m16302d >= 0) {
            return m16302d;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            AbstractC19074t.m100207e(columnNames, "c.columnNames");
            str2 = AbstractC25358n.m131375W(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}

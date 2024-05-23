package p046c2;

import android.database.Cursor;
import bn0.AbstractC2933b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p046c2.C3209e;
import p119e2.InterfaceC18182g;
import p148f3.C18711c;
import qm0.AbstractC25332a0;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;
import qm0.AbstractC25366r;
import qm0.AbstractC25377w0;

/* renamed from: c2.f */
/* loaded from: classes2.dex */
public abstract class AbstractC3210f {
    /* renamed from: a */
    private static final Map m16320a(InterfaceC18182g interfaceC18182g, String str) {
        Map m131398c;
        Map m131397b;
        boolean z11;
        Map m131404i;
        Cursor mo200q0 = interfaceC18182g.mo200q0("PRAGMA table_info(`" + str + "`)");
        try {
            if (mo200q0.getColumnCount() <= 0) {
                m131404i = AbstractC25363p0.m131404i();
                AbstractC2933b.m13890a(mo200q0, null);
                return m131404i;
            }
            int columnIndex = mo200q0.getColumnIndex("name");
            int columnIndex2 = mo200q0.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            int columnIndex3 = mo200q0.getColumnIndex("notnull");
            int columnIndex4 = mo200q0.getColumnIndex("pk");
            int columnIndex5 = mo200q0.getColumnIndex("dflt_value");
            m131398c = AbstractC25361o0.m131398c();
            while (mo200q0.moveToNext()) {
                String string = mo200q0.getString(columnIndex);
                String string2 = mo200q0.getString(columnIndex2);
                if (mo200q0.getInt(columnIndex3) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = mo200q0.getInt(columnIndex4);
                String string3 = mo200q0.getString(columnIndex5);
                AbstractC19074t.m100207e(string, "name");
                AbstractC19074t.m100207e(string2, ZinstantMetaConstant.IMPRESSION_META_TYPE);
                m131398c.put(string, new C3209e.a(string, string2, z11, i11, string3, 2));
            }
            m131397b = AbstractC25361o0.m131397b(m131398c);
            AbstractC2933b.m13890a(mo200q0, null);
            return m131397b;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2933b.m13890a(mo200q0, th2);
                throw th3;
            }
        }
    }

    /* renamed from: b */
    private static final List m16321b(Cursor cursor) {
        List m131494c;
        List m131492a;
        List m131175C0;
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        m131494c = AbstractC25366r.m131494c();
        while (cursor.moveToNext()) {
            int i11 = cursor.getInt(columnIndex);
            int i12 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            AbstractC19074t.m100207e(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            AbstractC19074t.m100207e(string2, "cursor.getString(toColumnIndex)");
            m131494c.add(new C3209e.d(i11, i12, string, string2));
        }
        m131492a = AbstractC25366r.m131492a(m131494c);
        m131175C0 = AbstractC25332a0.m131175C0(m131492a);
        return m131175C0;
    }

    /* renamed from: c */
    private static final Set m16322c(InterfaceC18182g interfaceC18182g, String str) {
        Set m131536b;
        Set m131535a;
        Cursor mo200q0 = interfaceC18182g.mo200q0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = mo200q0.getColumnIndex("id");
            int columnIndex2 = mo200q0.getColumnIndex("seq");
            int columnIndex3 = mo200q0.getColumnIndex("table");
            int columnIndex4 = mo200q0.getColumnIndex("on_delete");
            int columnIndex5 = mo200q0.getColumnIndex("on_update");
            List m16321b = m16321b(mo200q0);
            mo200q0.moveToPosition(-1);
            m131536b = AbstractC25377w0.m131536b();
            while (mo200q0.moveToNext()) {
                if (mo200q0.getInt(columnIndex2) == 0) {
                    int i11 = mo200q0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<C3209e.d> arrayList3 = new ArrayList();
                    for (Object obj : m16321b) {
                        if (((C3209e.d) obj).m16318d() == i11) {
                            arrayList3.add(obj);
                        }
                    }
                    for (C3209e.d dVar : arrayList3) {
                        arrayList.add(dVar.m16317c());
                        arrayList2.add(dVar.m16319e());
                    }
                    String string = mo200q0.getString(columnIndex3);
                    AbstractC19074t.m100207e(string, "cursor.getString(tableColumnIndex)");
                    String string2 = mo200q0.getString(columnIndex4);
                    AbstractC19074t.m100207e(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = mo200q0.getString(columnIndex5);
                    AbstractC19074t.m100207e(string3, "cursor.getString(onUpdateColumnIndex)");
                    m131536b.add(new C3209e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            m131535a = AbstractC25377w0.m131535a(m131536b);
            AbstractC2933b.m13890a(mo200q0, null);
            return m131535a;
        } finally {
        }
    }

    /* renamed from: d */
    private static final C3209e.e m16323d(InterfaceC18182g interfaceC18182g, String str, boolean z11) {
        List m131185M0;
        List m131185M02;
        String str2;
        Cursor mo200q0 = interfaceC18182g.mo200q0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = mo200q0.getColumnIndex("seqno");
            int columnIndex2 = mo200q0.getColumnIndex("cid");
            int columnIndex3 = mo200q0.getColumnIndex("name");
            int columnIndex4 = mo200q0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (mo200q0.moveToNext()) {
                    if (mo200q0.getInt(columnIndex2) >= 0) {
                        int i11 = mo200q0.getInt(columnIndex);
                        String string = mo200q0.getString(columnIndex3);
                        if (mo200q0.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i11);
                        AbstractC19074t.m100207e(string, "columnName");
                        treeMap.put(valueOf, string);
                        treeMap2.put(Integer.valueOf(i11), str2);
                    }
                }
                Collection values = treeMap.values();
                AbstractC19074t.m100207e(values, "columnsMap.values");
                m131185M0 = AbstractC25332a0.m131185M0(values);
                Collection values2 = treeMap2.values();
                AbstractC19074t.m100207e(values2, "ordersMap.values");
                m131185M02 = AbstractC25332a0.m131185M0(values2);
                C3209e.e eVar = new C3209e.e(str, z11, m131185M0, m131185M02);
                AbstractC2933b.m13890a(mo200q0, null);
                return eVar;
            }
            AbstractC2933b.m13890a(mo200q0, null);
            return null;
        } finally {
        }
    }

    /* renamed from: e */
    private static final Set m16324e(InterfaceC18182g interfaceC18182g, String str) {
        Set m131536b;
        Set m131535a;
        Cursor mo200q0 = interfaceC18182g.mo200q0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = mo200q0.getColumnIndex("name");
            int columnIndex2 = mo200q0.getColumnIndex("origin");
            int columnIndex3 = mo200q0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                m131536b = AbstractC25377w0.m131536b();
                while (mo200q0.moveToNext()) {
                    if (AbstractC19074t.m100204b(C18711c.f94014e, mo200q0.getString(columnIndex2))) {
                        String string = mo200q0.getString(columnIndex);
                        boolean z11 = true;
                        if (mo200q0.getInt(columnIndex3) != 1) {
                            z11 = false;
                        }
                        AbstractC19074t.m100207e(string, "name");
                        C3209e.e m16323d = m16323d(interfaceC18182g, string, z11);
                        if (m16323d == null) {
                            AbstractC2933b.m13890a(mo200q0, null);
                            return null;
                        }
                        m131536b.add(m16323d);
                    }
                }
                m131535a = AbstractC25377w0.m131535a(m131536b);
                AbstractC2933b.m13890a(mo200q0, null);
                return m131535a;
            }
            AbstractC2933b.m13890a(mo200q0, null);
            return null;
        } finally {
        }
    }

    /* renamed from: f */
    public static final C3209e m16325f(InterfaceC18182g interfaceC18182g, String str) {
        AbstractC19074t.m100208f(interfaceC18182g, "database");
        AbstractC19074t.m100208f(str, "tableName");
        return new C3209e(str, m16320a(interfaceC18182g, str), m16322c(interfaceC18182g, str), m16324e(interfaceC18182g, str));
    }
}

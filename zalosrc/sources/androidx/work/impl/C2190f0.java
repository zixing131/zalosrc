package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import ln0.AbstractC22543l;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25361o0;
import qm0.AbstractC25363p0;

/* renamed from: androidx.work.impl.f0 */
/* loaded from: classes.dex */
public final class C2190f0 {

    /* renamed from: a */
    public static final C2190f0 f9250a = new C2190f0();

    private C2190f0() {
    }

    /* renamed from: c */
    private final File m11689c(Context context) {
        return new File(C2154a.f9155a.m11581a(context), "androidx.work.workdb");
    }

    /* renamed from: d */
    public static final void m11690d(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC19074t.m100208f(context, "context");
        C2190f0 c2190f0 = f9250a;
        File m11692b = c2190f0.m11692b(context);
        if (Build.VERSION.SDK_INT >= 23 && m11692b.exists()) {
            AbstractC2253u m11895e = AbstractC2253u.m11895e();
            str = AbstractC2199g0.f9280a;
            m11895e.mo11898a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : c2190f0.m11693e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        AbstractC2253u m11895e2 = AbstractC2253u.m11895e();
                        str4 = AbstractC2199g0.f9280a;
                        m11895e2.mo11905k(str4, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str2 = "Migrated " + file + "to " + file2;
                    } else {
                        str2 = "Renaming " + file + " to " + file2 + " failed";
                    }
                    AbstractC2253u m11895e3 = AbstractC2253u.m11895e();
                    str3 = AbstractC2199g0.f9280a;
                    m11895e3.mo11898a(str3, str2);
                }
            }
        }
    }

    /* renamed from: a */
    public final File m11691a(Context context) {
        AbstractC19074t.m100208f(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            return m11692b(context);
        }
        return m11689c(context);
    }

    /* renamed from: b */
    public final File m11692b(Context context) {
        AbstractC19074t.m100208f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        AbstractC19074t.m100207e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    /* renamed from: e */
    public final Map m11693e(Context context) {
        Map m131404i;
        String[] strArr;
        int m131400e;
        int m116580c;
        Map m131410o;
        AbstractC19074t.m100208f(context, "context");
        if (Build.VERSION.SDK_INT < 23) {
            m131404i = AbstractC25363p0.m131404i();
            return m131404i;
        }
        File m11692b = m11692b(context);
        File m11691a = m11691a(context);
        strArr = AbstractC2199g0.f9281b;
        m131400e = AbstractC25361o0.m131400e(strArr.length);
        m116580c = AbstractC22543l.m116580c(m131400e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m116580c);
        for (String str : strArr) {
            C24860q m129235a = AbstractC24866w.m129235a(new File(m11692b.getPath() + str), new File(m11691a.getPath() + str));
            linkedHashMap.put(m129235a.m129215c(), m129235a.m129216d());
        }
        m131410o = AbstractC25363p0.m131410o(linkedHashMap, AbstractC24866w.m129235a(m11692b, m11691a));
        return m131410o;
    }
}

package p360n9;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p319l9.C22152a;
import p476r9.EnumC25694b;
import p476r9.EnumC25695c;
import p507s9.C26192i;

/* renamed from: n9.e */
/* loaded from: classes3.dex */
public abstract class AbstractC23631e {
    /* renamed from: a */
    private static List m123875a(C26192i c26192i, Context context) {
        ArrayList arrayList = new ArrayList();
        if (c26192i.mo134694i()) {
            arrayList.add(new C23630d(c26192i.mo134695j()));
        }
        if (c26192i.mo134692c()) {
            arrayList.add(new C23629c(c26192i.mo134693e(), context));
        }
        if (c26192i.m134690R()) {
            arrayList.add(new C23627a(c26192i.m134689Q()));
        }
        if (c26192i.mo134691a()) {
            arrayList.add(new C23628b(c26192i.mo134696k()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m123876b(C26192i c26192i, Context context) {
        List m123875a = m123875a(c26192i, context);
        if (m123875a.isEmpty()) {
            C22152a.m115524e().m115525a("No validators found for PerfMetric.");
            return false;
        }
        Iterator it = m123875a.iterator();
        while (it.hasNext()) {
            if (!((AbstractC23631e) it.next()).mo123851c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m123877d(String str, String str2) {
        if (str != null && str.length() != 0) {
            if (str2 != null && str2.length() != 0) {
                if (str.length() <= 40) {
                    if (str2.length() <= 100) {
                        if (str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
                            return;
                        } else {
                            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
                        }
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
            }
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        throw new IllegalArgumentException("Attribute key must not be null or empty");
    }

    /* renamed from: e */
    public static String m123878e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC25694b enumC25694b : EnumC25694b.values()) {
            if (enumC25694b.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    /* renamed from: f */
    public static String m123879f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC25695c enumC25695c : EnumC25695c.values()) {
            if (enumC25695c.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    /* renamed from: c */
    public abstract boolean mo123851c();
}

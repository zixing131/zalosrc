package p631x3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: x3.e */
/* loaded from: classes2.dex */
public abstract class AbstractC29304e {
    /* renamed from: a */
    public static List m146402a(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: b */
    public static void m146403b(List list, Comparator comparator) {
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, comparator);
        }
    }
}

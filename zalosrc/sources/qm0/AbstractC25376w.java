package qm0;

import fn0.AbstractC19074t;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.w */
/* loaded from: classes.dex */
public abstract class AbstractC25376w extends AbstractC25374v {
    /* renamed from: v */
    public static void m131533v(List list) {
        AbstractC19074t.m100208f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: w */
    public static void m131534w(List list, Comparator comparator) {
        AbstractC19074t.m100208f(list, "<this>");
        AbstractC19074t.m100208f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

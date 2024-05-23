package androidx.core.widget;

import android.widget.ListView;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes2.dex */
public abstract class AbstractC1637i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static boolean m8399a(ListView listView, int i11) {
            return listView.canScrollList(i11);
        }

        /* renamed from: b */
        static void m8400b(ListView listView, int i11) {
            listView.scrollListBy(i11);
        }
    }

    /* renamed from: a */
    public static boolean m8397a(ListView listView, int i11) {
        return a.m8399a(listView, i11);
    }

    /* renamed from: b */
    public static void m8398b(ListView listView, int i11) {
        a.m8400b(listView, i11);
    }
}

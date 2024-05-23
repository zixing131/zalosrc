package androidx.emoji2.text;

import android.os.Build;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes2.dex */
abstract class AbstractC1700h {

    /* renamed from: androidx.emoji2.text.h$a */
    /* loaded from: classes2.dex */
    private static class a {
        /* renamed from: a */
        static Set<int[]> m8707a() {
            return b.m8708a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.h$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static Set m8708a() {
            try {
                Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
                if (invoke == null) {
                    return Collections.emptySet();
                }
                Set set = (Set) invoke;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof int[])) {
                        return Collections.emptySet();
                    }
                }
                return set;
            } catch (Throwable unused) {
                return Collections.emptySet();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Set m8706a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.m8707a();
        }
        return b.m8708a();
    }
}

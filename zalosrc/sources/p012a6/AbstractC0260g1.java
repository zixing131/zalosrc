package p012a6;

import java.util.Map;

/* renamed from: a6.g1 */
/* loaded from: classes2.dex */
public abstract class AbstractC0260g1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m723a(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m724b(Map map, Object obj) {
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}

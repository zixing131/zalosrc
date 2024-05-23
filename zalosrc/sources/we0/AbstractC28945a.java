package we0;

import java.util.List;
import ve0.AbstractC27992a;

/* renamed from: we0.a */
/* loaded from: classes4.dex */
public abstract class AbstractC28945a {
    /* renamed from: a */
    public static boolean m144588a(int i11) {
        List list = (List) AbstractC27992a.m141026a().get(Integer.valueOf(i11));
        if (list != null && !list.contains("001")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m144589b(String str) {
        return !str.equals("001");
    }
}

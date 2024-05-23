package lb;

import android.text.TextUtils;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: lb.f */
/* loaded from: classes3.dex */
public abstract class AbstractC22393f {
    /* renamed from: a */
    public static C22392e m115809a() {
        try {
            String m121752be = AbstractC23309i.m121752be();
            if (!TextUtils.isEmpty(m121752be)) {
                return C22392e.m115806a(new JSONObject(m121752be));
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }
}

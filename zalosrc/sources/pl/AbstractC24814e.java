package pl;

import android.content.Context;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;

/* renamed from: pl.e */
/* loaded from: classes3.dex */
public abstract class AbstractC24814e {
    /* renamed from: a */
    public static final C24813d m129015a(Context context, String str) {
        AbstractC19074t.m100208f(context, "<this>");
        AbstractC19074t.m100208f(str, "userUid");
        return new C24813d(context, str);
    }

    /* renamed from: b */
    public static /* synthetic */ C24813d m129016b(Context context, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
        }
        return m129015a(context, str);
    }
}

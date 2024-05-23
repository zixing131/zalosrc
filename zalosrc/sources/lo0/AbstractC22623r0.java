package lo0;

import android.content.Context;
import android.content.res.Resources;
import com.zing.zalo.AbstractC8020f0;

/* renamed from: lo0.r0 */
/* loaded from: classes7.dex */
public abstract class AbstractC22623r0 {
    /* renamed from: a */
    public static int m117004a(int i11) {
        int i12 = AbstractC8020f0.str_call_end_call_status;
        return i11 == -3 ? AbstractC8020f0.str_call_busy_call_status : i11 == -4 ? AbstractC8020f0.str_call_decline_call_status : i11 == -5 ? AbstractC8020f0.call_state_cannot_receive_call : i11 == -16 ? AbstractC8020f0.str_call_timeout_ring_call_status : (i11 >= 0 || i11 == -13) ? i12 : AbstractC8020f0.call_state_cannot_connect;
    }

    /* renamed from: b */
    public static String m117005b(Context context, int i11, int i12) {
        Resources resources = context.getResources();
        if (i11 != 401) {
            if (i11 == 403) {
                if (i12 != 1 && i12 != 3) {
                    if (i12 == 5) {
                        return resources.getString(AbstractC8020f0.user_cant_receive_call);
                    }
                } else {
                    return resources.getString(AbstractC8020f0.status_user_is_busy);
                }
            }
            return resources.getString(AbstractC8020f0.error_unknown);
        }
        if (i12 != 2) {
            if (i12 != 3 && i12 != 4) {
                return null;
            }
            return resources.getString(AbstractC8020f0.error_user_not_online);
        }
        return resources.getString(AbstractC8020f0.error_user_not_online);
    }
}

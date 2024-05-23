package tj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19074t;

/* renamed from: tj.f */
/* loaded from: classes3.dex */
public abstract class AbstractC26714f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m137367d(String str, String str2) {
        if (str.length() > 0 && str2 != null && str2.length() != 0 && AbstractC19074t.m100204b(str, str2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m137368e(String str, String str2) {
        if (str.length() > 0 && str2 != null && str2.length() != 0 && !AbstractC19074t.m100204b(str, str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m137369f(MessageId messageId) {
        if (messageId == null || !messageId.m41059z()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m137370g(String str) {
        if (str != null && str.length() != 0 && !AbstractC19074t.m100204b(str, "0")) {
            return true;
        }
        return false;
    }
}

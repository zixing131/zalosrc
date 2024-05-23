package p056cj;

import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17981m0;
import dj.C17990p0;
import dj.C18009w0;
import fn0.AbstractC19074t;
import k30.C21459a;

/* renamed from: cj.d */
/* loaded from: classes3.dex */
public abstract class AbstractC3536d {
    /* renamed from: a */
    public static final String m17979a(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "<this>");
        if (AbstractC19074t.m100204b(messageId.m41048l(), "204278670")) {
            return "204278670";
        }
        if (messageId.m41057x()) {
            return String.valueOf(messageId.m41049m());
        }
        if (AbstractC19074t.m100204b(messageId.m41050n(), CoreUtility.f89233i)) {
            return messageId.m41048l();
        }
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        return str;
    }

    /* renamed from: b */
    public static final int m17980b(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "<this>");
        if (c17945a0.m94847A6()) {
            return 6;
        }
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m17981c(C17945a0 c17945a0) {
        long j11;
        String m94983Q3;
        AbstractC19074t.m100208f(c17945a0, "<this>");
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 != null) {
            if (c17945a0.m94871D7()) {
                C18009w0 c18009w0 = (C18009w0) m94929K2;
                String mo95598f = c18009w0.mo95598f();
                AbstractC19074t.m100207e(mo95598f, "getUrlHD(...)");
                if (mo95598f.length() == 0) {
                    j11 = c18009w0.m95776l();
                } else {
                    j11 = c18009w0.m95781o();
                }
            } else if (c17945a0.m95306y8()) {
                j11 = ((C17961f1) m94929K2).m95453G();
            } else if (c17945a0.m95276v6()) {
                j11 = ((C17990p0) m94929K2).f91113B;
            } else if (c17945a0.m95316z8()) {
                j11 = ((C17964g1) m94929K2).m95531h();
            } else if (c17945a0.m95120e6()) {
                j11 = ((C17981m0) m94929K2).f91076D;
            }
            if (j11 <= 0) {
                return j11;
            }
            if (!c17945a0.m95240r6()) {
                return 0L;
            }
            if (c17945a0.m95306y8()) {
                m94983Q3 = c17945a0.m95177k5();
            } else {
                m94983Q3 = c17945a0.m94983Q3();
            }
            AbstractC19074t.m100205c(m94983Q3);
            return C21459a.m111042k(m94983Q3);
        }
        j11 = 0;
        if (j11 <= 0) {
        }
    }
}

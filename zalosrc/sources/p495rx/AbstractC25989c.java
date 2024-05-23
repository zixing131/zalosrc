package p495rx;

import com.zing.zalo.control.C7904b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import p348mi.AbstractC23306f;

/* renamed from: rx.c */
/* loaded from: classes4.dex */
public abstract class AbstractC25989c {
    /* renamed from: a */
    public static final boolean m133908a(C7904b c7904b) {
        MessageId messageId;
        AbstractC19074t.m100208f(c7904b, "topicInfo");
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (c7904b.f42729a != 2 || (messageId = c7904b.f42747s) == null || c7904b.f42748t != null) {
            return false;
        }
        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
        if (m2635r == null) {
            c7904b.f42748t = "";
            return true;
        }
        if (m2635r.m94871D7()) {
            c7904b.f42748t = m2635r.m94983Q3();
        } else if (m2635r.m95306y8()) {
            c7904b.f42748t = m2635r.m95266u2();
        } else if (m2635r.m95276v6()) {
            c7904b.f42748t = m2635r.m95266u2();
        }
        if (c7904b.f42748t == null) {
            c7904b.f42748t = "";
        }
        return true;
    }
}

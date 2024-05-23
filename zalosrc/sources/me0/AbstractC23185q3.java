package me0;

import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import java.util.Map;
import p348mi.AbstractC23304d;
import p363nh.C23744a;

/* renamed from: me0.q3 */
/* loaded from: classes4.dex */
public abstract class AbstractC23185q3 {
    /* renamed from: a */
    public static void m119469a(String str) {
        try {
            AbstractC23304d.f113448v2.remove(str);
            C23744a.m124114c().m124116d(29, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m119470b(String str, MessageId messageId) {
        try {
            Map map = AbstractC23304d.f113448v2;
            C17945a0 c17945a0 = (C17945a0) map.get(str);
            if (c17945a0 != null && c17945a0.m95135f9(messageId)) {
                map.remove(str);
                C23744a.m124114c().m124116d(29, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m119471c(String str) {
        try {
            Map map = AbstractC23304d.f113448v2;
            if (map.containsKey(str)) {
                map.remove(str);
                C23744a.m124114c().m124116d(29, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public static String m119472d(long j11) {
        int i11 = (int) (j11 / 1000);
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        if (i14 > 0) {
            return String.format("%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12));
        }
        return String.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12));
    }
}

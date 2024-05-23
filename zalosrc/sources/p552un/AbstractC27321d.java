package p552un;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.C23212s8;

/* renamed from: un.d */
/* loaded from: classes4.dex */
public abstract class AbstractC27321d {
    /* renamed from: a */
    public static final int m139863a(int i11) {
        return i11 == 1 ? AbstractC16803z.bg_btn_suggest_feed_2 : AbstractC16803z.bg_btn_suggest_feed;
    }

    /* renamed from: b */
    public static final int m139864b(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        if (i11 == 1) {
            return C23212s8.m119607o(context, AbstractC16781w.feed_ads_text_color_2);
        }
        return C23212s8.m119607o(context, AbstractC16781w.feed_ads_text_color);
    }

    /* renamed from: c */
    public static final void m139865c(C22126c0 c22126c0, String str) {
        int i11;
        AbstractC19074t.m100208f(c22126c0, "<this>");
        AbstractC19074t.m100208f(str, "text");
        if (str.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c22126c0.mo44614b1(i11);
        c22126c0.m111959G1(str);
    }
}

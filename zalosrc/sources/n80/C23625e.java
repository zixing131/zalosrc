package n80;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.zdesign.component.C16979g1;
import fn0.AbstractC19074t;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: n80.e */
/* loaded from: classes6.dex */
public final class C23625e extends C16716d {

    /* renamed from: M0 */
    private final C21697g f114498M0;

    /* renamed from: N0 */
    private final C21697g f114499N0;

    /* renamed from: O0 */
    private final C16979g1 f114500O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23625e(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 16.0f);
        C16979g1 c16979g1 = new C16979g1(context);
        c16979g1.m89087B0(AbstractC16803z.scan_qr_text_result_background);
        c16979g1.m89106L().m89031O(m118712h).m89028L(-1, -2);
        m89001g1(c16979g1);
        this.f114500O0 = c16979g1;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC2808b.f150821b60));
        c22126c0.mo111964L1(AbstractC23136l9.m118712h(context, 13.0f));
        c22126c0.m89106L().m89028L(-1, -2).m89032P(m118712h, m118712h, m118712h, 0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m111953A1(1);
        c16979g1.m89001g1(c22126c0);
        this.f114498M0 = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m111962J1(C23212s8.m119606n(AbstractC2807a.text_01));
        c22126c02.mo111964L1(AbstractC23136l9.m118712h(context, 15.0f));
        c22126c02.m111980v1(truncateAt);
        c22126c02.m89106L().m89028L(-1, -2).m89023G(c22126c0).m89032P(m118712h, AbstractC23136l9.m118712h(context, 8.0f), m118712h, m118712h);
        c16979g1.m89001g1(c22126c02);
        this.f114499N0 = c22126c02;
        m89106L().m89028L(-1, -2);
    }

    /* renamed from: o1 */
    public final C16979g1 m123844o1() {
        return this.f114500O0;
    }

    /* renamed from: p1 */
    public final C21697g m123845p1() {
        return this.f114498M0;
    }

    /* renamed from: q1 */
    public final C21697g m123846q1() {
        return this.f114499N0;
    }
}

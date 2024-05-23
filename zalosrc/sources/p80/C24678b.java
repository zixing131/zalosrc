package p80;

import android.content.Context;
import android.text.Layout;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;

/* renamed from: p80.b */
/* loaded from: classes6.dex */
public final class C24678b extends C16716d {

    /* renamed from: M0 */
    private final C22122a0 f118625M0;

    /* renamed from: N0 */
    private final C22122a0 f118626N0;

    /* renamed from: O0 */
    private final C22122a0 f118627O0;

    /* renamed from: P0 */
    private final C22126c0 f118628P0;

    /* renamed from: Q0 */
    private final C22126c0 f118629Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24678b(Context context, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        super(context);
        float f11;
        float f12;
        float f13;
        float f14;
        int i11;
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 3.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 10.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 15.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h5 = AbstractC23136l9.m118712h(context, 40.0f);
        if (num != null) {
            f11 = num.intValue();
        } else {
            f11 = 420.0f;
        }
        int m118712h6 = AbstractC23136l9.m118712h(context, f11);
        if (num2 != null) {
            f12 = num2.intValue();
        } else {
            f12 = 640.0f;
        }
        int m118712h7 = AbstractC23136l9.m118712h(context, f12);
        if (num3 != null) {
            f13 = num3.intValue();
        } else {
            f13 = 238.0f;
        }
        int m118712h8 = AbstractC23136l9.m118712h(context, f13);
        if (num4 != null) {
            f14 = num4.intValue();
        } else {
            f14 = 64.0f;
        }
        int m118712h9 = AbstractC23136l9.m118712h(context, f14);
        int i12 = (m118712h * 2) + m118712h9;
        if (num5 != null) {
            i11 = num5.intValue();
        } else {
            i11 = (((m118712h7 / 2) - (m118712h8 / 2)) / 2) - (i12 / 2);
        }
        m89106L().m89028L(m118712h6, m118712h7);
        C22122a0 c22122a0 = new C22122a0(context);
        c22122a0.m89106L().m89028L(-1, -1);
        this.f118625M0 = c22122a0;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(i12, i12).m89036T(i11).m89026J(true);
        c16716d.m89087B0(AbstractC16803z.bg_circle_avatar_custom_noti);
        C22122a0 c22122a02 = new C22122a0(context);
        c22122a02.m89106L().m89025I(true).m89028L(m118712h9, m118712h9);
        c16716d.m89001g1(c22122a02);
        this.f118626N0 = c22122a02;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(m118712h4);
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.Light_TextColor1));
        c22126c0.m111953A1(1);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c22126c0.m111961I1(alignment);
        c22126c0.m89106L().m89023G(c16716d).m89028L(-1, -2).m89032P(m118712h5, m118712h2, m118712h5, 0);
        this.f118628P0 = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.mo111964L1(m118712h3);
        c22126c02.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.Light_TextColor2));
        c22126c02.m111953A1(1);
        c22126c02.m111961I1(alignment);
        c22126c02.m89106L().m89023G(c22126c0).m89028L(-1, -2).m89032P(m118712h5, m118712h, m118712h5, 0);
        this.f118629Q0 = c22126c02;
        C22122a0 c22122a03 = new C22122a0(context);
        c22122a03.m89106L().m89025I(true).m89028L(m118712h8, m118712h8);
        this.f118627O0 = c22122a03;
        m89001g1(c22122a0);
        m89001g1(c16716d);
        m89001g1(c22126c0);
        m89001g1(c22126c02);
        m89001g1(c22122a03);
    }
}

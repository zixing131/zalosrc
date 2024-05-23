package p80;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: p80.a */
/* loaded from: classes6.dex */
public final class C24677a extends C16716d {

    /* renamed from: M0 */
    private final C22129e f118622M0;

    /* renamed from: N0 */
    private final C22126c0 f118623N0;

    /* renamed from: O0 */
    private final C22126c0 f118624O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24677a(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        int m118712h2 = AbstractC23136l9.m118712h(context, 14.0f);
        int m118712h3 = AbstractC23136l9.m118712h(context, 16.0f);
        int m118712h4 = AbstractC23136l9.m118712h(context, 32.0f);
        int m118712h5 = AbstractC23136l9.m118712h(context, 48.0f);
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        int m119607o2 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        m89106L().m89028L(-1, -2);
        C22129e c22129e = new C22129e(context, m118712h5);
        c22129e.m89106L().m89028L(m118712h5, m118712h5).m89032P(m118712h3, m118712h3, 0, 0);
        this.f118622M0 = c22129e;
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(m118712h3);
        c22126c0.mo111965M1(1);
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m89106L().m89028L(-1, -2);
        c22126c0.m111962J1(m119607o);
        this.f118623N0 = c22126c0;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.mo111964L1(m118712h2);
        c22126c02.mo111965M1(0);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m89106L().m89028L(-1, -2).m89036T(m118712h).m89023G(c22126c0);
        c22126c02.m111962J1(m119607o2);
        this.f118624O0 = c22126c02;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2).m89027K(true).m89032P(m118712h3, m118712h3, m118712h4, m118712h3).m89054h0(c22129e);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        m89001g1(c22129e);
        m89001g1(c16716d);
    }

    /* renamed from: o1 */
    public final C22129e m128235o1() {
        return this.f118622M0;
    }

    /* renamed from: p1 */
    public final C22126c0 m128236p1() {
        return this.f118623N0;
    }

    /* renamed from: q1 */
    public final C22126c0 m128237q1() {
        return this.f118624O0;
    }
}

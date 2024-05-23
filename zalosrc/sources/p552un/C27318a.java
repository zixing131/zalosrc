package p552un;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import bo.C3025q0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p304ks.C21927m;
import p354n3.C23528a;

/* renamed from: un.a */
/* loaded from: classes4.dex */
public final class C27318a extends C16716d {

    /* renamed from: M0 */
    private C11850a f128563M0;

    /* renamed from: N0 */
    private C22126c0 f128564N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27318a(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f128563M0 = new C11850a(context);
        this.f128564N0 = new C22126c0(context);
        C11850a c11850a = this.f128563M0;
        c11850a.m89106L().m89060k0(-2).m89030N(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(6.0f)).m89027K(true);
        c11850a.m65869e2(5);
        c11850a.m65866b2(AbstractC23136l9.m118742r(12.0f));
        m89001g1(this.f128563M0);
        C22126c0 c22126c0 = this.f128564N0;
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89054h0(this.f128563M0);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        c22126c0.mo111965M1(1);
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        c22126c0.m111982x1(false);
        m89001g1(this.f128564N0);
    }

    /* renamed from: o1 */
    public final void m139857o1(C3025q0.d dVar, String str, C23528a c23528a) {
        int i11;
        AbstractC19074t.m100208f(dVar, "suggestItem");
        AbstractC19074t.m100208f(str, "uidFrom");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        m89106L().m89040X(AbstractC23136l9.m118742r(0.0f));
        String str2 = dVar.f12179j;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = dVar.f12180k;
        if (str4 != null) {
            str3 = str4;
        }
        int i12 = AbstractC16803z.bg_btn_suggest_feed;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        int m139864b = AbstractC27321d.m139864b(context, dVar.f12183n);
        int m139863a = AbstractC27321d.m139863a(dVar.f12183n);
        int i13 = dVar.f12185p;
        boolean z11 = false;
        if (i13 != 0) {
            if (i13 != 1 && i13 != 2 && i13 != 3 && i13 != 4) {
                z11 = true;
            } else {
                if (AbstractC19074t.m100204b(str2, "action.follow.oa")) {
                    if (C21927m.m114302u().m114318P(str)) {
                        str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_already_followed);
                        AbstractC19074t.m100207e(str3, "getString(...)");
                        z11 = true;
                    }
                    m89106L().m89040X(AbstractC23136l9.m118742r(135.0f));
                } else {
                    z11 = true;
                }
                this.f128564N0.m111962J1(m139864b);
                this.f128564N0.mo111964L1(AbstractC23136l9.m118742r(14.0f));
            }
        } else {
            i12 = AbstractC16803z.bg_btn_type2_small;
            C22126c0 c22126c0 = this.f128564N0;
            c22126c0.m111963K1(AbstractC23136l9.m118645D(c22126c0.getContext(), AbstractC16803z.bg_btn_type2_text));
            if (AbstractC19074t.m100204b(str2, "action.follow.oa") && C21927m.m114302u().m114318P(str)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            mo44614b1(i11);
        }
        m89087B0(i12);
        AbstractC27321d.m139865c(this.f128564N0, str3);
        if (z11) {
            this.f128563M0.m111923t1(new PorterDuffColorFilter(m139864b, PorterDuff.Mode.SRC_IN));
            C11850a c11850a = this.f128563M0;
            String str5 = dVar.f12182m;
            AbstractC19074t.m100207e(str5, "mBtnIconUrl");
            m139858p1(c11850a, c23528a, str5);
        } else {
            this.f128563M0.mo44614b1(8);
        }
        m89087B0(m139863a);
    }

    /* renamed from: p1 */
    public final void m139858p1(C22122a0 c22122a0, C23528a c23528a, String str) {
        int i11;
        AbstractC19074t.m100208f(c22122a0, "<this>");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC19074t.m100208f(str, "iconUrl");
        if (str.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c22122a0.mo44614b1(i11);
        c22122a0.m115376H1(c23528a, str, C23278z2.m120128g0(), 10);
    }
}

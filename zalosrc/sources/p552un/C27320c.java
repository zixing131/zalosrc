package p552un;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* renamed from: un.c */
/* loaded from: classes4.dex */
public final class C27320c extends C16716d {

    /* renamed from: M0 */
    private C11850a f128567M0;

    /* renamed from: N0 */
    private C22126c0 f128568N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27320c(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f128567M0 = new C11850a(context);
        this.f128568N0 = new C22126c0(context);
        C11850a c11850a = this.f128567M0;
        c11850a.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118742r(8.0f));
        c11850a.m65869e2(4);
        c11850a.m65866b2(AbstractC23136l9.m118742r(10.0f));
        m89001g1(this.f128567M0);
        C22126c0 c22126c0 = this.f128568N0;
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89054h0(this.f128567M0).m89070w(this.f128567M0);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c0.m111953A1(2);
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        m89001g1(this.f128568N0);
    }

    /* renamed from: o1 */
    public final void m139861o1(String str, String str2, C23528a c23528a) {
        AbstractC19074t.m100208f(str, "text");
        AbstractC19074t.m100208f(str2, "iconUrl");
        AbstractC19074t.m100208f(c23528a, "aQuery");
        AbstractC27321d.m139865c(this.f128568N0, str);
        m139862p1(this.f128567M0, c23528a, str2);
    }

    /* renamed from: p1 */
    public final void m139862p1(C22122a0 c22122a0, C23528a c23528a, String str) {
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
        c22122a0.m115376H1(c23528a, str, C23278z2.m120106Y(), 10);
    }
}

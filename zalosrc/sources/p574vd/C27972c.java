package p574vd;

import android.content.Context;
import android.text.Layout;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import fn0.AbstractC19074t;
import java.util.Calendar;
import java.util.GregorianCalendar;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p480rd.AbstractC25732c;
import sd.C26231b;

/* renamed from: vd.c */
/* loaded from: classes3.dex */
public final class C27972c extends C16716d {

    /* renamed from: M0 */
    private C22126c0 f130413M0;

    /* renamed from: N0 */
    private C22126c0 f130414N0;

    /* renamed from: O0 */
    private C16716d f130415O0;

    /* renamed from: P0 */
    private final Calendar f130416P0;

    /* renamed from: Q0 */
    private final int f130417Q0;

    /* renamed from: R0 */
    private final int f130418R0;

    /* renamed from: S0 */
    private final int f130419S0;

    /* renamed from: T0 */
    private final int f130420T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27972c(Context context) {
        super(context);
        int i11;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        this.f130416P0 = new GregorianCalendar();
        this.f130417Q0 = C23212s8.m119607o(context, AbstractC2807a.section_label);
        int m119607o = C23212s8.m119607o(context, AbstractC2807a.text_02);
        this.f130418R0 = m119607o;
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.f150816b10;
        } else {
            i11 = AbstractC2808b.f150824b90;
        }
        this.f130419S0 = AbstractC23136l9.m118641B(context, i11);
        if (C23212s8.m119603k()) {
            i12 = AbstractC2808b.ng10;
        } else {
            i12 = AbstractC2808b.ng80;
        }
        int m118641B = AbstractC23136l9.m118641B(context, i12);
        this.f130420T0 = m118641B;
        m89106L().m89028L(-1, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo89161z0(m118641B);
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.mo111965M1(1);
        c22126c0.m89106L().m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112576o).m89028L(-1, -2);
        this.f130414N0 = c22126c0;
        C16716d c16716d = new C16716d(context);
        c16716d.mo89161z0(C23212s8.m119607o(context, AbstractC2807a.ui_background));
        c16716d.m89106L().m89028L(-1, -2).m89041Y(AbstractC23222t7.f112514B).m89023G(this.f130414N0);
        this.f130415O0 = c16716d;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89028L(-1, -2).m89025I(true);
        c22126c02.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_birthday_hub_empty_event_day));
        c22126c02.mo111964L1(AbstractC23222t7.f112582r);
        c22126c02.m111961I1(Layout.Alignment.ALIGN_CENTER);
        c22126c02.m111962J1(m119607o);
        this.f130413M0 = c22126c02;
        this.f130415O0.m89001g1(c22126c02);
        m89001g1(this.f130414N0);
        m89001g1(this.f130415O0);
    }

    /* renamed from: o1 */
    public final void m140970o1(AbstractC25732c.b bVar) {
        String m119195H;
        AbstractC19074t.m100208f(bVar, "itemData");
        try {
            Calendar calendar = Calendar.getInstance();
            this.f130416P0.setTimeInMillis(bVar.m132831b());
            String str = "";
            if (AbstractC23160o0.m119233a(this.f130416P0, calendar) == 0) {
                str = "" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_today) + " • ";
                this.f130414N0.m111962J1(this.f130417Q0);
                this.f130414N0.mo111965M1(1);
                this.f130414N0.mo89161z0(this.f130419S0);
            } else {
                this.f130414N0.m111962J1(this.f130418R0);
                this.f130414N0.mo111965M1(0);
                this.f130414N0.mo89161z0(this.f130420T0);
            }
            if (AbstractC23160o0.m119236b(this.f130416P0, calendar) != 0) {
                C26231b c26231b = C26231b.f124604a;
                Calendar calendar2 = this.f130416P0;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m119195H = c26231b.m134870g(calendar2, context);
            } else {
                m119195H = AbstractC23160o0.m119195H(this.f130416P0, true, false, false, false);
            }
            this.f130414N0.m111959G1(str + m119195H);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }
}

package p574vd;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Calendar;
import java.util.GregorianCalendar;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p480rd.AbstractC25732c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import sd.C26231b;

/* renamed from: vd.i */
/* loaded from: classes3.dex */
public final class C27978i extends C16716d {

    /* renamed from: M0 */
    private C22126c0 f130434M0;

    /* renamed from: N0 */
    private final int f130435N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f130436O0;

    /* renamed from: P0 */
    private final int f130437P0;

    /* renamed from: Q0 */
    private final int f130438Q0;

    /* renamed from: R0 */
    private final Calendar f130439R0;

    /* renamed from: vd.i$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f130440q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f130440q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(C23212s8.m119607o(this.f130440q, AbstractC21196a.TextColor2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27978i(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        int i11;
        int i12;
        AbstractC19074t.m100208f(context, "context");
        this.f130435N0 = C23212s8.m119607o(context, AbstractC2807a.section_label);
        m129210a = AbstractC24856m.m129210a(new a(context));
        this.f130436O0 = m129210a;
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.f150816b10;
        } else {
            i11 = AbstractC2808b.f150824b90;
        }
        this.f130437P0 = AbstractC23136l9.m118641B(context, i11);
        if (C23212s8.m119603k()) {
            i12 = AbstractC2808b.ng10;
        } else {
            i12 = AbstractC2808b.ng80;
        }
        int m118641B = AbstractC23136l9.m118641B(context, i12);
        this.f130438Q0 = m118641B;
        this.f130439R0 = new GregorianCalendar();
        m89106L().m89028L(-1, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.mo111965M1(1);
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        c22126c0.m111953A1(1);
        c22126c0.m89106L().m89028L(-1, -2).m89042Z(AbstractC23222t7.f112586t, AbstractC23222t7.f112576o, AbstractC23222t7.f112586t, AbstractC23222t7.f112576o);
        this.f130434M0 = c22126c0;
        m89001g1(c22126c0);
        mo89161z0(m118641B);
    }

    /* renamed from: p1 */
    private final int m140979p1() {
        return ((Number) this.f130436O0.getValue()).intValue();
    }

    /* renamed from: o1 */
    public final void m140980o1(AbstractC25732c abstractC25732c) {
        String m119195H;
        AbstractC19074t.m100208f(abstractC25732c, "data");
        try {
            Calendar calendar = Calendar.getInstance();
            this.f130439R0.setTimeInMillis(abstractC25732c.m132831b());
            String str = "";
            if (AbstractC23160o0.m119233a(this.f130439R0, calendar) == 0) {
                str = "" + AbstractC23136l9.m118743r0(AbstractC8020f0.str_today) + " • ";
                this.f130434M0.m111962J1(this.f130435N0);
                this.f130434M0.mo111965M1(1);
                mo89161z0(this.f130437P0);
            } else {
                this.f130434M0.m111962J1(m140979p1());
                this.f130434M0.mo111965M1(0);
                mo89161z0(this.f130438Q0);
            }
            if (AbstractC23160o0.m119236b(this.f130439R0, calendar) != 0) {
                C26231b c26231b = C26231b.f124604a;
                Calendar calendar2 = this.f130439R0;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m119195H = c26231b.m134870g(calendar2, context);
            } else {
                m119195H = AbstractC23160o0.m119195H(this.f130439R0, true, false, false, false);
            }
            this.f130434M0.m111959G1(str + m119195H);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }
}

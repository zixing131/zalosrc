package p574vd;

import android.content.Context;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uidrawing.C16716d;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.GregorianCalendar;
import java.util.Locale;
import l80.C22126c0;
import l80.C22138m;
import me0.AbstractC23136l9;
import me0.AbstractC23188q6;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p480rd.AbstractC25732c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: vd.h */
/* loaded from: classes3.dex */
public final class C27977h extends C16716d {

    /* renamed from: M0 */
    private C22126c0 f130429M0;

    /* renamed from: N0 */
    private C22138m f130430N0;

    /* renamed from: O0 */
    private C23528a f130431O0;

    /* renamed from: P0 */
    private final InterfaceC24854k f130432P0;

    /* renamed from: vd.h$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f130433q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] mo12V4() {
            return AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27977h(Context context) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        m129210a = AbstractC24856m.m129210a(a.f130433q);
        this.f130432P0 = m129210a;
        this.f130431O0 = new C23528a(context);
        m89106L().m89028L(-1, AbstractC23222t7.f112591v0);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(AbstractC23222t7.f112598z);
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.white));
        c22126c0.mo111965M1(1);
        c22126c0.m89106L().m89072y(Boolean.TRUE).m89033Q(AbstractC23222t7.f112586t).m89034R(AbstractC23222t7.f112586t).m89028L(-2, -2);
        this.f130429M0 = c22126c0;
        C22138m c22138m = new C22138m(context, AbstractC23222t7.f112591v0, 2.0f);
        this.f130430N0 = c22138m;
        m89001g1(c22138m);
        m89001g1(this.f130429M0);
    }

    /* renamed from: p1 */
    private final String[] m140975p1() {
        Object value = this.f130432P0.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (String[]) value;
    }

    /* renamed from: o1 */
    public final void m140976o1(AbstractC25732c.g gVar) {
        AbstractC19074t.m100208f(gVar, "data");
        try {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(gVar.m132831b());
            C22126c0 c22126c0 = this.f130429M0;
            String str = m140975p1()[gregorianCalendar.get(2)];
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
            c22126c0.m111959G1(upperCase);
            this.f130430N0.m115471o1((String) AbstractC23188q6.m119484b().get(gregorianCalendar.get(2) % AbstractC23188q6.m119484b().size()));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: q1 */
    public final void m140977q1(int i11, int i12) {
        this.f130430N0.m115472p1(i11, i12);
    }
}

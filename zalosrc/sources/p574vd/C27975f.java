package p574vd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.C17023o;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23139m1;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p480rd.AbstractC25731b;
import p480rd.AbstractC25732c;
import qm0.AbstractC25366r;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: vd.f */
/* loaded from: classes3.dex */
public final class C27975f extends C16959c0 {

    /* renamed from: k1 */
    private final C16716d f130424k1;

    /* renamed from: l1 */
    private final C16971e f130425l1;

    /* renamed from: m1 */
    private final C16977g f130426m1;

    /* renamed from: n1 */
    private final C17023o f130427n1;

    /* renamed from: o1 */
    private a f130428o1;

    /* renamed from: vd.f$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo139370a(ContactProfile contactProfile);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27975f(Context context) {
        super(context);
        Drawable m139658a;
        AbstractC19074t.m100208f(context, "context");
        m89106L().m89028L(-1, -2);
        EnumC16980h enumC16980h = EnumC16980h.SIZE_24;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-2, -2).m89036T(AbstractC23136l9.m118712h(context, 6));
        this.f130424k1 = c16716d;
        C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_40);
        this.f130425l1 = c16971e;
        C16974f c16974f = new C16974f(context);
        c16974f.m90974x(EnumC16991i.CUSTOM);
        c16974f.m90971u(enumC16980h);
        if (C23212s8.m119603k()) {
            m139658a = C27280g.m139658a(context, AbstractC16803z.icn_birthday_round);
        } else {
            m139658a = C27280g.m139658a(context, AbstractC16803z.ic_birthday_round_dark);
        }
        c16974f.m90967q(m139658a);
        C16977g c16977g = new C16977g(context);
        c16977g.m89106L().m89023G(c16971e).m89054h0(c16971e).m89036T(-C27276c.m139649b(context, enumC16980h.m90985c() - 6)).m89034R(-C27276c.m139649b(context, enumC16980h.m90985c() - 6));
        c16977g.m90983u1(c16974f);
        this.f130426m1 = c16977g;
        c16716d.m89001g1(c16971e);
        c16716d.m89001g1(c16977g);
        m90814p1(c16716d);
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        m90823z1(enumC16952b0);
        m90809K1(true);
        m90807I1(2);
        C17023o c17023o = new C17023o(context);
        c17023o.setIdTracking("BIRTHDAY_HUB_ICON_OPEN_CSC");
        c17023o.m89106L().m89028L(-2, -2);
        c17023o.m91110o1(AbstractC2814h.ButtonSmall_Secondary);
        c17023o.m91112r1(C27280g.m139658a(context, AbstractC2810d.zds_ic_chat_line_16));
        this.f130427n1 = c17023o;
        m90816r1(c17023o);
        m90810L1(enumC16952b0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m140972Q1(C27975f c27975f, AbstractC25731b abstractC25731b, C16719g c16719g) {
        AbstractC19074t.m100208f(c27975f, "this$0");
        AbstractC19074t.m100208f(abstractC25731b, "$eventInfo");
        a aVar = c27975f.f130428o1;
        if (aVar != null) {
            aVar.mo139370a(((AbstractC25731b.a) abstractC25731b).m132829g());
        }
    }

    /* renamed from: P1 */
    public final void m140973P1(AbstractC25732c.d dVar) {
        List m131496e;
        String format;
        int i11;
        AbstractC19074t.m100208f(dVar, "itemData");
        try {
            final AbstractC25731b m132833c = dVar.m132833c();
            if (m132833c instanceof AbstractC25731b.a) {
                C16971e c16971e = this.f130425l1;
                m131496e = AbstractC25366r.m131496e(((AbstractC25731b.a) m132833c).m132829g().f42434r);
                c16971e.mo90887O1(m131496e);
                if (AbstractC19074t.m100204b(CoreUtility.f89233i, ((AbstractC25731b.a) m132833c).m132829g().f42434r)) {
                    format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_birthday_hub_event_birthday_yourself_prefix_title);
                    AbstractC19074t.m100205c(format);
                } else {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_birthday_hub_event_birthday_friend_prefix_title);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    format = String.format(m118743r0, Arrays.copyOf(new Object[]{C23139m1.f112256a.m118800q(((AbstractC25731b.a) m132833c).m132829g())}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                }
                m90805G1(format);
                m90800B1("");
                C17023o c17023o = this.f130427n1;
                if (AbstractC19074t.m100204b(CoreUtility.f89233i, ((AbstractC25731b.a) m132833c).m132829g().f42434r)) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                c17023o.mo44614b1(i11);
                c17023o.mo89109M0(new C16719g.c() { // from class: vd.e
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C27975f.m140972Q1(C27975f.this, m132833c, c16719g);
                    }
                });
                if (dVar.m132834d()) {
                    m90812N1(true);
                    m90799A1(AbstractC23136l9.m118712h(getContext(), 78.0f), 0, 0, 0);
                } else {
                    m90812N1(false);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: R1 */
    public final void m140974R1(a aVar) {
        this.f130428o1 = aVar;
    }
}

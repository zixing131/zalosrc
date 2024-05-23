package n60;

import android.content.Context;
import android.view.ViewGroup;
import androidx.work.AbstractC2144f;
import com.zing.zalo.p077ui.chat.C11621p0;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.zdesign.component.TooltipView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qi0.C25297f;
import qi0.EnumC25293b;
import sa0.C26209i;

/* renamed from: n60.i */
/* loaded from: classes5.dex */
public abstract class AbstractC23596i {

    /* renamed from: a */
    private final ViewGroup f114433a;

    /* renamed from: b */
    private final C11621p0 f114434b;

    /* renamed from: c */
    private TooltipView f114435c;

    /* renamed from: d */
    private final InterfaceC24854k f114436d;

    /* renamed from: e */
    private int f114437e;

    /* renamed from: f */
    private a f114438f;

    /* renamed from: g */
    private C13306b f114439g;

    /* renamed from: n60.i$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo123720a();
    }

    /* renamed from: n60.i$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final CharSequence f114440a;

        /* renamed from: b */
        private final String f114441b;

        /* renamed from: c */
        private final CharSequence f114442c;

        /* renamed from: d */
        private final C26209i f114443d;

        /* renamed from: e */
        private final CharSequence f114444e;

        /* renamed from: f */
        private final boolean f114445f;

        /* renamed from: g */
        private final int f114446g;

        public b(CharSequence charSequence, String str, CharSequence charSequence2, C26209i c26209i, CharSequence charSequence3, boolean z11, int i11) {
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(charSequence2, "description");
            AbstractC19074t.m100208f(c26209i, "tipTarget");
            AbstractC19074t.m100208f(charSequence3, "ctaText");
            this.f114440a = charSequence;
            this.f114441b = str;
            this.f114442c = charSequence2;
            this.f114443d = c26209i;
            this.f114444e = charSequence3;
            this.f114445f = z11;
            this.f114446g = i11;
        }

        /* renamed from: a */
        public final int m123721a() {
            return this.f114446g;
        }

        /* renamed from: b */
        public final CharSequence m123722b() {
            return this.f114444e;
        }

        /* renamed from: c */
        public final CharSequence m123723c() {
            return this.f114442c;
        }

        /* renamed from: d */
        public final boolean m123724d() {
            return this.f114445f;
        }

        /* renamed from: e */
        public final String m123725e() {
            return this.f114441b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f114440a, bVar.f114440a) && AbstractC19074t.m100204b(this.f114441b, bVar.f114441b) && AbstractC19074t.m100204b(this.f114442c, bVar.f114442c) && AbstractC19074t.m100204b(this.f114443d, bVar.f114443d) && AbstractC19074t.m100204b(this.f114444e, bVar.f114444e) && this.f114445f == bVar.f114445f && this.f114446g == bVar.f114446g;
        }

        /* renamed from: f */
        public final C26209i m123726f() {
            return this.f114443d;
        }

        /* renamed from: g */
        public final CharSequence m123727g() {
            return this.f114440a;
        }

        public int hashCode() {
            return (((((((((((this.f114440a.hashCode() * 31) + this.f114441b.hashCode()) * 31) + this.f114442c.hashCode()) * 31) + this.f114443d.hashCode()) * 31) + this.f114444e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f114445f)) * 31) + this.f114446g;
        }

        public String toString() {
            CharSequence charSequence = this.f114440a;
            String str = this.f114441b;
            CharSequence charSequence2 = this.f114442c;
            C26209i c26209i = this.f114443d;
            CharSequence charSequence3 = this.f114444e;
            return "WalkThroughData(title=" + ((Object) charSequence) + ", tipCat=" + str + ", description=" + ((Object) charSequence2) + ", tipTarget=" + c26209i + ", ctaText=" + ((Object) charSequence3) + ", showCta=" + this.f114445f + ", cornerRadius=" + this.f114446g + ")";
        }

        public /* synthetic */ b(CharSequence charSequence, String str, CharSequence charSequence2, C26209i c26209i, CharSequence charSequence3, boolean z11, int i11, int i12, AbstractC19060k abstractC19060k) {
            this(charSequence, str, charSequence2, c26209i, (i12 & 16) != 0 ? "" : charSequence3, (i12 & 32) != 0 ? true : z11, (i12 & 64) != 0 ? 0 : i11);
        }
    }

    /* renamed from: n60.i$c */
    /* loaded from: classes5.dex */
    public static final class c implements TooltipView.InterfaceC16938b {
        c() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            if (AbstractC23596i.this.m123713e() != AbstractC23596i.this.m123716h().size() - 1) {
                AbstractC23596i.this.m123710l();
                return;
            }
            a m123714f = AbstractC23596i.this.m123714f();
            if (m123714f != null) {
                m123714f.mo123720a();
            }
        }
    }

    /* renamed from: n60.i$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f114448q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public AbstractC23596i(ViewGroup viewGroup, C11621p0 c11621p0) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(viewGroup, "parentView");
        AbstractC19074t.m100208f(c11621p0, "chatViewHolder");
        this.f114433a = viewGroup;
        this.f114434b = c11621p0;
        m129210a = AbstractC24856m.m129210a(d.f114448q);
        this.f114436d = m129210a;
    }

    /* renamed from: c */
    private final C25297f m123709c(TooltipView tooltipView, b bVar) {
        C25297f m130959a = C25297f.Companion.m130959a(tooltipView.getContext());
        m130959a.m130933g0(bVar.m123727g().toString());
        m130959a.m130927d0(bVar.m123723c().toString());
        m130959a.m130911Q(bVar.m123722b().toString());
        m130959a.m130925c0(bVar.m123726f().f124546a);
        m130959a.m130921a0(bVar.m123726f().f124547b);
        m130959a.m130920Z(true);
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130943l0(0);
        m130959a.m130923b0(bVar.m123721a());
        return m130959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m123710l() {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(this.f114437e + 1, m123716h().size() - 1);
        this.f114437e = m116584g;
        mo123711b();
    }

    /* renamed from: b */
    public void mo123711b() {
        int i11 = this.f114437e;
        if (i11 >= 0 && i11 < m123716h().size()) {
            b bVar = (b) m123716h().get(this.f114437e);
            TooltipView tooltipView = this.f114435c;
            if (tooltipView != null) {
                this.f114433a.removeView(tooltipView);
            }
            Context context = this.f114433a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TooltipView tooltipView2 = new TooltipView(context);
            this.f114435c = tooltipView2;
            AbstractC19074t.m100205c(tooltipView2);
            tooltipView2.setIdTracking("my_cloud_tooltip");
            TooltipView tooltipView3 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView3);
            tooltipView3.setTooltipId(bVar.m123725e());
            TooltipView tooltipView4 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView4);
            C25297f m123709c = m123709c(tooltipView4, bVar);
            if (bVar.m123724d()) {
                m123709c.m130911Q(bVar.m123722b().toString());
                TooltipView tooltipView5 = this.f114435c;
                AbstractC19074t.m100205c(tooltipView5);
                tooltipView5.setButtonRightIdTracking("my_cloud_tooltip_right_button");
            }
            TooltipView tooltipView6 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView6);
            tooltipView6.setConfigs(m123709c);
            if (this.f114439g == null) {
                C13306b c13306b = new C13306b(this.f114433a.getContext());
                this.f114439g = c13306b;
                AbstractC19074t.m100205c(c13306b);
                c13306b.m74687C(this.f114433a);
            }
            TooltipView tooltipView7 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView7);
            C13306b c13306b2 = this.f114439g;
            AbstractC19074t.m100205c(c13306b2);
            tooltipView7.setTooltipManager(c13306b2);
            TooltipView tooltipView8 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView8);
            tooltipView8.setOnTooltipFinishedListener(new c());
            TooltipView tooltipView9 = this.f114435c;
            AbstractC19074t.m100205c(tooltipView9);
            tooltipView9.m90733c0();
        }
    }

    /* renamed from: d */
    public final C11621p0 m123712d() {
        return this.f114434b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final int m123713e() {
        return this.f114437e;
    }

    /* renamed from: f */
    public final a m123714f() {
        return this.f114438f;
    }

    /* renamed from: g */
    public final ViewGroup m123715g() {
        return this.f114433a;
    }

    /* renamed from: h */
    public final List m123716h() {
        return (List) this.f114436d.getValue();
    }

    /* renamed from: i */
    public abstract void mo123717i();

    /* renamed from: j */
    public final void m123718j(a aVar) {
        this.f114438f = aVar;
    }

    /* renamed from: k */
    public void mo123719k() {
        mo123717i();
        mo123711b();
    }
}

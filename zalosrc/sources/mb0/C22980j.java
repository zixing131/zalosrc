package mb0;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.AbstractC1599s0;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.zdesign.component.TooltipView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import nn0.AbstractC23906o;
import nn0.InterfaceC23898g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qi0.C25297f;
import qi0.EnumC25293b;
import sa0.C26209i;

/* renamed from: mb0.j */
/* loaded from: classes6.dex */
public final class C22980j {

    /* renamed from: a */
    private final ViewGroup f111729a;

    /* renamed from: b */
    private TooltipView f111730b;

    /* renamed from: c */
    private final InterfaceC24854k f111731c;

    /* renamed from: d */
    private int f111732d;

    /* renamed from: e */
    private C13306b f111733e;

    /* renamed from: mb0.j$a */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a */
        private final CharSequence f111734a;

        /* renamed from: b */
        private final String f111735b;

        /* renamed from: c */
        private final int f111736c;

        /* renamed from: d */
        private final CharSequence f111737d;

        /* renamed from: e */
        private final C26209i f111738e;

        /* renamed from: f */
        private final boolean f111739f;

        /* renamed from: g */
        private final int f111740g;

        /* renamed from: h */
        private final boolean f111741h;

        public a(CharSequence charSequence, String str, int i11, CharSequence charSequence2, C26209i c26209i, boolean z11, int i12, boolean z12) {
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(charSequence2, "description");
            AbstractC19074t.m100208f(c26209i, "tipTarget");
            this.f111734a = charSequence;
            this.f111735b = str;
            this.f111736c = i11;
            this.f111737d = charSequence2;
            this.f111738e = c26209i;
            this.f111739f = z11;
            this.f111740g = i12;
            this.f111741h = z12;
        }

        /* renamed from: a */
        public final int m117729a() {
            return this.f111740g;
        }

        /* renamed from: b */
        public final CharSequence m117730b() {
            return this.f111737d;
        }

        /* renamed from: c */
        public final boolean m117731c() {
            return this.f111739f;
        }

        /* renamed from: d */
        public final boolean m117732d() {
            return this.f111741h;
        }

        /* renamed from: e */
        public final String m117733e() {
            return this.f111735b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f111734a, aVar.f111734a) && AbstractC19074t.m100204b(this.f111735b, aVar.f111735b) && this.f111736c == aVar.f111736c && AbstractC19074t.m100204b(this.f111737d, aVar.f111737d) && AbstractC19074t.m100204b(this.f111738e, aVar.f111738e) && this.f111739f == aVar.f111739f && this.f111740g == aVar.f111740g && this.f111741h == aVar.f111741h;
        }

        /* renamed from: f */
        public final C26209i m117734f() {
            return this.f111738e;
        }

        /* renamed from: g */
        public final int m117735g() {
            return this.f111736c;
        }

        /* renamed from: h */
        public final CharSequence m117736h() {
            return this.f111734a;
        }

        public int hashCode() {
            return (((((((((((((this.f111734a.hashCode() * 31) + this.f111735b.hashCode()) * 31) + this.f111736c) * 31) + this.f111737d.hashCode()) * 31) + this.f111738e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f111739f)) * 31) + this.f111740g) * 31) + AbstractC2144f.m11520a(this.f111741h);
        }

        public String toString() {
            CharSequence charSequence = this.f111734a;
            String str = this.f111735b;
            int i11 = this.f111736c;
            CharSequence charSequence2 = this.f111737d;
            return "WalkThroughData(title=" + ((Object) charSequence) + ", tipCat=" + str + ", tipType=" + i11 + ", description=" + ((Object) charSequence2) + ", tipTarget=" + this.f111738e + ", passEventThroughTarget=" + this.f111739f + ", cornerRadius=" + this.f111740g + ", showDim=" + this.f111741h + ")";
        }

        public /* synthetic */ a(CharSequence charSequence, String str, int i11, CharSequence charSequence2, C26209i c26209i, boolean z11, int i12, boolean z12, int i13, AbstractC19060k abstractC19060k) {
            this((i13 & 1) != 0 ? "" : charSequence, str, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? "" : charSequence2, c26209i, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? true : z12);
        }
    }

    /* renamed from: mb0.j$b */
    /* loaded from: classes6.dex */
    public static final class b implements TooltipView.InterfaceC16938b {
        b() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            C22980j.this.m117727g();
        }
    }

    /* renamed from: mb0.j$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f111743q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public C22980j(ViewGroup viewGroup) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f111729a = viewGroup;
        m129210a = AbstractC24856m.m129210a(c.f111743q);
        this.f111731c = m129210a;
    }

    /* renamed from: b */
    private final void m117723b() {
        int i11 = this.f111732d;
        if (i11 >= 0 && i11 < m117725d().size()) {
            a aVar = (a) m117725d().get(this.f111732d);
            TooltipView tooltipView = this.f111730b;
            if (tooltipView != null) {
                this.f111729a.removeView(tooltipView);
            }
            Context context = this.f111729a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TooltipView tooltipView2 = new TooltipView(context);
            tooltipView2.setIdTracking("tool_tip_expand_reaction_picker");
            tooltipView2.setTooltipId(aVar.m117733e());
            tooltipView2.setConfigs(m117724c(tooltipView2, aVar));
            if (this.f111733e == null) {
                C13306b c13306b = new C13306b(this.f111729a.getContext());
                c13306b.m74687C(this.f111729a);
                this.f111733e = c13306b;
            }
            C13306b c13306b2 = this.f111733e;
            AbstractC19074t.m100205c(c13306b2);
            tooltipView2.setTooltipManager(c13306b2);
            tooltipView2.setOnTooltipFinishedListener(new b());
            this.f111730b = tooltipView2;
            tooltipView2.m90733c0();
            TooltipView tooltipView3 = this.f111730b;
            if (tooltipView3 != null && tooltipView3.isShown()) {
                AbstractC0924m0.m4023mh(false);
            }
        }
    }

    /* renamed from: c */
    private final C25297f m117724c(TooltipView tooltipView, a aVar) {
        C25297f m130959a = C25297f.Companion.m130959a(tooltipView.getContext());
        m130959a.m130933g0(aVar.m117736h().toString());
        m130959a.m130927d0(aVar.m117730b().toString());
        m130959a.m130925c0(aVar.m117734f().f124546a);
        m130959a.m130921a0(aVar.m117734f().f124547b);
        m130959a.m130917W(aVar.m117731c());
        m130959a.m130920Z(aVar.m117732d());
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130943l0(aVar.m117735g());
        m130959a.m130923b0(aVar.m117729a());
        return m130959a;
    }

    /* renamed from: d */
    private final List m117725d() {
        return (List) this.f111731c.getValue();
    }

    /* renamed from: e */
    private final void m117726e() {
        Object m125021j;
        if (!AbstractC0924m0.m4136qa()) {
            return;
        }
        m117725d().clear();
        View findViewById = this.f111729a.findViewById(AbstractC6918a0.recycle_view);
        if (findViewById != null && (findViewById instanceof ListView)) {
            ListView listView = (ListView) findViewById;
            View childAt = listView.getChildAt(1);
            if (childAt != null) {
                AbstractC19074t.m100205c(childAt);
                InterfaceC23898g m8177a = AbstractC1599s0.m8177a(childAt);
                if (m8177a != null) {
                    m125021j = AbstractC23906o.m125021j(m8177a, 1);
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_tip_choose_reaction_expand_picker);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    C26209i c26209i = new C26209i((View) m125021j);
                    c26209i.f124547b = new Rect(AbstractC23222t7.f112552c, 0, c26209i.f124546a.getWidth(), c26209i.f124546a.getHeight());
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    m117725d().add(new a(m118743r0, "tip.choose_reaction.expand_picker", 0, "", c26209i, false, AbstractC23222t7.f112576o, false, 164, null));
                }
            }
            ArrayList<View> arrayList = new ArrayList<>();
            View childAt2 = listView.getChildAt(0);
            if (childAt2 != null) {
                childAt2.findViewsWithText(arrayList, AbstractC23136l9.m118743r0(AbstractC8020f0.str_action_edit_default_reaction_list), 1);
            }
            if (!arrayList.isEmpty()) {
                View view = arrayList.get(0);
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_tool_tip_edit_favorittes_list_reaction);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                C26209i c26209i2 = new C26209i(view);
                c26209i2.f124547b = new Rect(0, AbstractC23222t7.f112552c, c26209i2.f124546a.getWidth() - AbstractC23222t7.f112552c, c26209i2.f124546a.getHeight() + AbstractC23222t7.f112556e);
                C24848g0 c24848g02 = C24848g0.f119245a;
                m117725d().add(new a(m118743r02, "tip.entrypoint_edit.favorites_reaction", 0, "", c26209i2, false, AbstractC23222t7.f112576o, false, 164, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m117727g() {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(this.f111732d + 1, m117725d().size() - 1);
        this.f111732d = m116584g;
        m117723b();
    }

    /* renamed from: f */
    public final void m117728f() {
        m117726e();
        m117723b();
    }
}

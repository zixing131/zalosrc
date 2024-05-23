package t70;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.AbstractC2144f;
import com.zing.zalo.p077ui.showcase.C13306b;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zlottie.widget.LottieImageView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qi0.C25292a;
import qi0.C25297f;
import qi0.EnumC25293b;
import sa0.C26209i;

/* renamed from: t70.e2 */
/* loaded from: classes5.dex */
public abstract class AbstractC26518e2 {

    /* renamed from: a */
    private final ViewGroup f125766a;

    /* renamed from: b */
    private TooltipView f125767b;

    /* renamed from: c */
    private final InterfaceC24854k f125768c;

    /* renamed from: d */
    private int f125769d;

    /* renamed from: e */
    private C13306b f125770e;

    /* renamed from: t70.e2$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final CharSequence f125771a;

        /* renamed from: b */
        private final String f125772b;

        /* renamed from: c */
        private final int f125773c;

        /* renamed from: d */
        private final CharSequence f125774d;

        /* renamed from: e */
        private final C26209i f125775e;

        /* renamed from: f */
        private final boolean f125776f;

        /* renamed from: g */
        private final int f125777g;

        /* renamed from: h */
        private final CharSequence f125778h;

        /* renamed from: i */
        private final boolean f125779i;

        /* renamed from: j */
        private final View.OnClickListener f125780j;

        /* renamed from: k */
        private final CharSequence f125781k;

        /* renamed from: l */
        private final boolean f125782l;

        /* renamed from: m */
        private final View.OnClickListener f125783m;

        /* renamed from: n */
        private final boolean f125784n;

        /* renamed from: o */
        private final LottieImageView f125785o;

        public a(CharSequence charSequence, String str, int i11, CharSequence charSequence2, C26209i c26209i, boolean z11, int i12, CharSequence charSequence3, boolean z12, View.OnClickListener onClickListener, CharSequence charSequence4, boolean z13, View.OnClickListener onClickListener2, boolean z14, LottieImageView lottieImageView) {
            AbstractC19074t.m100208f(charSequence, "title");
            AbstractC19074t.m100208f(str, "tipCat");
            AbstractC19074t.m100208f(charSequence2, "description");
            AbstractC19074t.m100208f(c26209i, "tipTarget");
            AbstractC19074t.m100208f(charSequence3, "ctaTextLeft");
            AbstractC19074t.m100208f(charSequence4, "ctaTextRight");
            this.f125771a = charSequence;
            this.f125772b = str;
            this.f125773c = i11;
            this.f125774d = charSequence2;
            this.f125775e = c26209i;
            this.f125776f = z11;
            this.f125777g = i12;
            this.f125778h = charSequence3;
            this.f125779i = z12;
            this.f125780j = onClickListener;
            this.f125781k = charSequence4;
            this.f125782l = z13;
            this.f125783m = onClickListener2;
            this.f125784n = z14;
            this.f125785o = lottieImageView;
        }

        /* renamed from: a */
        public final int m136491a() {
            return this.f125777g;
        }

        /* renamed from: b */
        public final CharSequence m136492b() {
            return this.f125778h;
        }

        /* renamed from: c */
        public final CharSequence m136493c() {
            return this.f125781k;
        }

        /* renamed from: d */
        public final CharSequence m136494d() {
            return this.f125774d;
        }

        /* renamed from: e */
        public final View.OnClickListener m136495e() {
            return this.f125780j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f125771a, aVar.f125771a) && AbstractC19074t.m100204b(this.f125772b, aVar.f125772b) && this.f125773c == aVar.f125773c && AbstractC19074t.m100204b(this.f125774d, aVar.f125774d) && AbstractC19074t.m100204b(this.f125775e, aVar.f125775e) && this.f125776f == aVar.f125776f && this.f125777g == aVar.f125777g && AbstractC19074t.m100204b(this.f125778h, aVar.f125778h) && this.f125779i == aVar.f125779i && AbstractC19074t.m100204b(this.f125780j, aVar.f125780j) && AbstractC19074t.m100204b(this.f125781k, aVar.f125781k) && this.f125782l == aVar.f125782l && AbstractC19074t.m100204b(this.f125783m, aVar.f125783m) && this.f125784n == aVar.f125784n && AbstractC19074t.m100204b(this.f125785o, aVar.f125785o);
        }

        /* renamed from: f */
        public final LottieImageView m136496f() {
            return this.f125785o;
        }

        /* renamed from: g */
        public final boolean m136497g() {
            return this.f125776f;
        }

        /* renamed from: h */
        public final View.OnClickListener m136498h() {
            return this.f125783m;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((((this.f125771a.hashCode() * 31) + this.f125772b.hashCode()) * 31) + this.f125773c) * 31) + this.f125774d.hashCode()) * 31) + this.f125775e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f125776f)) * 31) + this.f125777g) * 31) + this.f125778h.hashCode()) * 31) + AbstractC2144f.m11520a(this.f125779i)) * 31;
            View.OnClickListener onClickListener = this.f125780j;
            int hashCode2 = (((((hashCode + (onClickListener == null ? 0 : onClickListener.hashCode())) * 31) + this.f125781k.hashCode()) * 31) + AbstractC2144f.m11520a(this.f125782l)) * 31;
            View.OnClickListener onClickListener2 = this.f125783m;
            int hashCode3 = (((hashCode2 + (onClickListener2 == null ? 0 : onClickListener2.hashCode())) * 31) + AbstractC2144f.m11520a(this.f125784n)) * 31;
            LottieImageView lottieImageView = this.f125785o;
            return hashCode3 + (lottieImageView != null ? lottieImageView.hashCode() : 0);
        }

        /* renamed from: i */
        public final boolean m136499i() {
            return this.f125779i;
        }

        /* renamed from: j */
        public final boolean m136500j() {
            return this.f125782l;
        }

        /* renamed from: k */
        public final boolean m136501k() {
            return this.f125784n;
        }

        /* renamed from: l */
        public final String m136502l() {
            return this.f125772b;
        }

        /* renamed from: m */
        public final C26209i m136503m() {
            return this.f125775e;
        }

        /* renamed from: n */
        public final int m136504n() {
            return this.f125773c;
        }

        /* renamed from: o */
        public final CharSequence m136505o() {
            return this.f125771a;
        }

        public String toString() {
            CharSequence charSequence = this.f125771a;
            String str = this.f125772b;
            int i11 = this.f125773c;
            CharSequence charSequence2 = this.f125774d;
            C26209i c26209i = this.f125775e;
            boolean z11 = this.f125776f;
            int i12 = this.f125777g;
            CharSequence charSequence3 = this.f125778h;
            boolean z12 = this.f125779i;
            View.OnClickListener onClickListener = this.f125780j;
            CharSequence charSequence4 = this.f125781k;
            return "WalkThroughData(title=" + ((Object) charSequence) + ", tipCat=" + str + ", tipType=" + i11 + ", description=" + ((Object) charSequence2) + ", tipTarget=" + c26209i + ", passEventThroughTarget=" + z11 + ", cornerRadius=" + i12 + ", ctaTextLeft=" + ((Object) charSequence3) + ", showCtaLeft=" + z12 + ", leftCtaListener=" + onClickListener + ", ctaTextRight=" + ((Object) charSequence4) + ", showCtaRight=" + this.f125782l + ", rightCtaListener=" + this.f125783m + ", showDim=" + this.f125784n + ", lottieImageView=" + this.f125785o + ")";
        }

        public /* synthetic */ a(CharSequence charSequence, String str, int i11, CharSequence charSequence2, C26209i c26209i, boolean z11, int i12, CharSequence charSequence3, boolean z12, View.OnClickListener onClickListener, CharSequence charSequence4, boolean z13, View.OnClickListener onClickListener2, boolean z14, LottieImageView lottieImageView, int i13, AbstractC19060k abstractC19060k) {
            this((i13 & 1) != 0 ? "" : charSequence, str, (i13 & 4) != 0 ? 0 : i11, charSequence2, c26209i, (i13 & 32) != 0 ? false : z11, (i13 & 64) != 0 ? 0 : i12, (i13 & 128) != 0 ? "" : charSequence3, (i13 & 256) != 0 ? false : z12, (i13 & 512) != 0 ? null : onClickListener, (i13 & 1024) != 0 ? "" : charSequence4, (i13 & ZVideoUtilMetadata.FF_PROFILE_H264_INTRA) != 0 ? true : z13, (i13 & 4096) != 0 ? null : onClickListener2, (i13 & 8192) != 0 ? true : z14, (i13 & 16384) != 0 ? null : lottieImageView);
        }
    }

    /* renamed from: t70.e2$b */
    /* loaded from: classes5.dex */
    public static final class b implements TooltipView.InterfaceC16938b {
        b() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            AbstractC26518e2.this.m136490i();
        }
    }

    /* renamed from: t70.e2$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f125787q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            return new ArrayList();
        }
    }

    public AbstractC26518e2(ViewGroup viewGroup) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f125766a = viewGroup;
        m129210a = AbstractC24856m.m129210a(c.f125787q);
        this.f125768c = m129210a;
    }

    /* renamed from: b */
    private final C25297f m136482b(TooltipView tooltipView, a aVar) {
        C25297f m130959a = C25297f.Companion.m130959a(tooltipView.getContext());
        m130959a.m130933g0(aVar.m136505o().toString());
        m130959a.m130927d0(aVar.m136494d().toString());
        m130959a.m130911Q(aVar.m136493c().toString());
        m130959a.m130910P(aVar.m136492b().toString());
        m130959a.m130925c0(aVar.m136503m().f124546a);
        m130959a.m130921a0(aVar.m136503m().f124547b);
        m130959a.m130917W(aVar.m136497g());
        m130959a.m130920Z(aVar.m136501k());
        m130959a.m130912R(EnumC25293b.RECTANGLE);
        m130959a.m130943l0(aVar.m136504n());
        m130959a.m130923b0(aVar.m136491a());
        LottieImageView m136496f = aVar.m136496f();
        if (m136496f != null) {
            C25292a c25292a = C25292a.f121281a;
            c25292a.m130873f(aVar.m136502l());
            C25292a.a m130871d = c25292a.m130871d();
            if (m130871d != null) {
                m130871d.m130888m(2);
                m130871d.m130890o(238);
                m130871d.m130885j(134);
            }
            m130959a.m130914T(c25292a);
            m130959a.m130913S(m136496f);
        }
        return m130959a;
    }

    /* renamed from: a */
    public void mo136483a() {
        int i11 = this.f125769d;
        if (i11 >= 0 && i11 < m136487f().size()) {
            a aVar = (a) m136487f().get(this.f125769d);
            TooltipView tooltipView = this.f125767b;
            if (tooltipView != null) {
                this.f125766a.removeView(tooltipView);
            }
            Context context = this.f125766a.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TooltipView tooltipView2 = new TooltipView(context);
            tooltipView2.setIdTracking("my_cloud_tooltip");
            tooltipView2.setTooltipId(aVar.m136502l());
            C25297f m136482b = m136482b(tooltipView2, aVar);
            if (aVar.m136499i()) {
                m136482b.m130910P(aVar.m136492b().toString());
                tooltipView2.setButtonLeftIdTracking("tab_msg_tooltip_left_button");
            }
            if (aVar.m136500j()) {
                m136482b.m130911Q(aVar.m136493c().toString());
                tooltipView2.setButtonRightIdTracking("tab_msg_tooltip_right_button");
            }
            tooltipView2.setConfigs(m136482b);
            if (this.f125770e == null) {
                C13306b c13306b = new C13306b(this.f125766a.getContext());
                c13306b.m74687C(this.f125766a);
                this.f125770e = c13306b;
            }
            C13306b c13306b2 = this.f125770e;
            AbstractC19074t.m100205c(c13306b2);
            tooltipView2.setTooltipManager(c13306b2);
            tooltipView2.setOnTooltipFinishedListener(new b());
            View.OnClickListener m136495e = aVar.m136495e();
            if (m136495e != null) {
                tooltipView2.setButtonLeftClickListener(m136495e);
            }
            View.OnClickListener m136498h = aVar.m136498h();
            if (m136498h != null) {
                tooltipView2.setButtonRightClickListener(m136498h);
            }
            this.f125767b = tooltipView2;
            tooltipView2.m90733c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final int m136484c() {
        return this.f125769d;
    }

    /* renamed from: d */
    public final ViewGroup m136485d() {
        return this.f125766a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final TooltipView m136486e() {
        return this.f125767b;
    }

    /* renamed from: f */
    public final List m136487f() {
        return (List) this.f125768c.getValue();
    }

    /* renamed from: g */
    public abstract void mo136488g();

    /* renamed from: h */
    public void mo136489h() {
        mo136488g();
        mo136483a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final void m136490i() {
        int m116584g;
        m116584g = AbstractC22543l.m116584g(this.f125769d + 1, m136487f().size() - 1);
        this.f125769d = m116584g;
        mo136483a();
    }
}

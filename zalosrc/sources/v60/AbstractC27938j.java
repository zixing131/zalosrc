package v60;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.TooltipView;
import com.zing.zalo.zdesign.component.tab.ZdsTabBar;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p162fh.C18932a;
import sa0.C26209i;
import t70.AbstractC26518e2;

/* renamed from: v60.j */
/* loaded from: classes5.dex */
public abstract class AbstractC27938j extends AbstractC26518e2 {

    /* renamed from: f */
    private a f130243f;

    /* renamed from: g */
    private boolean f130244g;

    /* renamed from: h */
    private boolean f130245h;

    /* renamed from: v60.j$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo68401a();

        /* renamed from: b */
        void mo68402b();
    }

    /* renamed from: v60.j$b */
    /* loaded from: classes5.dex */
    public static final class b implements TooltipView.InterfaceC16938b {
        b() {
        }

        @Override // com.zing.zalo.zdesign.component.TooltipView.InterfaceC16938b
        /* renamed from: a */
        public void mo66113a(TooltipView tooltipView, int i11, int i12, boolean z11) {
            if (AbstractC27938j.this.m136484c() == 0 && !AbstractC27938j.this.m140791p()) {
                a aVar = AbstractC27938j.this.f130243f;
                if (aVar != null) {
                    aVar.mo68401a();
                    return;
                }
                return;
            }
            if (AbstractC27938j.this.m136484c() != AbstractC27938j.this.m136487f().size() - 1 || !AbstractC27938j.this.m140791p() || !AbstractC27938j.this.f130245h) {
                AbstractC27938j.this.m136490i();
                return;
            }
            a aVar2 = AbstractC27938j.this.f130243f;
            if (aVar2 != null) {
                aVar2.mo68402b();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC27938j(ViewGroup viewGroup) {
        super(viewGroup);
        AbstractC19074t.m100208f(viewGroup, "parentView");
        this.f130245h = true;
    }

    /* renamed from: o */
    private final LottieImageView m140789o(Context context, int i11) {
        LottieImageView lottieImageView = new LottieImageView(context);
        lottieImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        lottieImageView.setAutoRepeatMode(C17291a.g.INFINITE);
        lottieImageView.m92148C(i11, false);
        lottieImageView.m92155v();
        return lottieImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m140790q(AbstractC27938j abstractC27938j, View view) {
        AbstractC19074t.m100208f(abstractC27938j, "this$0");
        abstractC27938j.f130245h = false;
    }

    @Override // t70.AbstractC26518e2
    /* renamed from: a */
    public void mo136483a() {
        super.mo136483a();
        TooltipView m136486e = m136486e();
        if (m136486e != null) {
            m136486e.setOnTooltipFinishedListener(new b());
        }
    }

    @Override // t70.AbstractC26518e2
    /* renamed from: g */
    public void mo136488g() {
        ZdsTabBar zdsTabBar;
        int i11;
        int i12;
        C18932a c18932a = C18932a.f94442a;
        if (!c18932a.m99184h()) {
            return;
        }
        m136487f().clear();
        View findViewById = m136485d().findViewById(AbstractC6918a0.iv_filter);
        if (findViewById == null) {
            return;
        }
        C26209i c26209i = new C26209i(findViewById);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_onboarding_chat_tag_filter);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cta_onboarding_chat_tag_filter);
        int i13 = AbstractC23222t7.f112576o;
        Context context = m136485d().getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        LottieImageView m140789o = m140789o(context, AbstractC8012e0.anim_lottie_tip_chat_tag);
        AbstractC19074t.m100205c(m118743r0);
        AbstractC19074t.m100205c(m118743r02);
        m136487f().add(new AbstractC26518e2.a(null, "tip.explore.chattag.filter", 0, m118743r0, c26209i, false, i13, null, false, null, m118743r02, false, null, false, m140789o, 15269, null));
        if (!c18932a.m99182f() || (zdsTabBar = (ZdsTabBar) m136485d().findViewById(AbstractC6918a0.tab_bar)) == null) {
            return;
        }
        int[] iArr = new int[2];
        View m91304O = zdsTabBar.m91304O(zdsTabBar.getTabItemCount() - 1);
        if (m91304O != null) {
            m91304O.getLocationInWindow(iArr);
        }
        int i14 = iArr[0];
        if (m91304O != null) {
            i11 = m91304O.getWidth();
        } else {
            i11 = 0;
        }
        int i15 = i14 + i11;
        if (m91304O != null) {
            i12 = m91304O.getHeight();
        } else {
            i12 = 0;
        }
        C26209i c26209i2 = new C26209i(zdsTabBar);
        c26209i2.f124547b = new Rect(0, 0, i15, i12);
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_desc_onboarding_chat_label_tab);
        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cta_onboarding_chat_label_tab_left);
        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_cta_onboarding_chat_label_tab);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: v60.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC27938j.m140790q(AbstractC27938j.this, view);
            }
        };
        int i16 = AbstractC23222t7.f112576o;
        AbstractC19074t.m100205c(m118743r03);
        AbstractC19074t.m100205c(m118743r04);
        AbstractC19074t.m100205c(m118743r05);
        m136487f().add(new AbstractC26518e2.a(null, "tip.explore.chatlabel.tab", 0, m118743r03, c26209i2, false, i16, m118743r04, false, onClickListener, m118743r05, false, null, false, null, 31013, null));
        this.f130244g = true;
    }

    @Override // t70.AbstractC26518e2
    /* renamed from: h */
    public void mo136489h() {
        try {
            super.mo136489h();
            C18932a.f94442a.m99191q();
            if (!AbstractC0924m0.m3107Hc()) {
                AbstractC0924m0.m3120Hp(true);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    public final boolean m140791p() {
        return this.f130244g;
    }

    /* renamed from: r */
    public final void m140792r(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f130243f = aVar;
    }
}

package com.zing.zalo.p077ui.widget.reaction;

import ac.C0697c0;
import ac.C0732w;
import ac.InterfaceC0733x;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.AbstractC1579n0;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.PagerSlidingTabStrip;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import com.zing.zalo.p077ui.widget.reaction.ZDSReactionDetailItemView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import lb0.C22423y;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p266jg.AbstractC21244b;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p392oh.C24265l;
import p500s1.C26088c;
import ph.C24751d;
import ph.C24753f;

/* loaded from: classes6.dex */
public class ReactionDetailView extends BottomPickerView implements ReactionPickerView.InterfaceC13747a, InterfaceC0733x {

    /* renamed from: U0 */
    C13750a f71107U0;

    /* renamed from: V0 */
    LinearLayout f71108V0;

    /* renamed from: W0 */
    RelativeLayout f71109W0;

    /* renamed from: X0 */
    ReactionPickerView f71110X0;

    /* renamed from: Y0 */
    C17945a0 f71111Y0;

    /* renamed from: a1 */
    int f71113a1;

    /* renamed from: Z0 */
    C24751d f71112Z0 = null;

    /* renamed from: b1 */
    ReactionDetailView f71114b1 = this;

    /* renamed from: oL */
    private String m76794oL() {
        int i11 = this.f71113a1;
        return i11 != 0 ? (i11 == 2 || i11 == 4) ? "total_reaction_viewfull" : "" : "total_reaction_msg_bubble";
    }

    /* renamed from: pL */
    public static ReactionDetailView m76795pL(Context context, C17945a0 c17945a0, C24751d c24751d, ZDSReactionDetailItemView.InterfaceC13749a interfaceC13749a, int i11) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        ReactionDetailView reactionDetailView = new ReactionDetailView();
        reactionDetailView.mo60305zK(m78535kL);
        reactionDetailView.f71107U0 = new C13750a(context, c24751d, interfaceC13749a);
        reactionDetailView.f71111Y0 = c17945a0;
        reactionDetailView.f71112Z0 = c24751d;
        reactionDetailView.f71113a1 = i11;
        return reactionDetailView;
    }

    /* renamed from: qL */
    private void m76796qL(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        if (AbstractC21244b.m110054d(this.f71114b1.getContext())) {
            linearLayout.getLayoutParams().height = AbstractC23309i.m122007i5(getContext());
        } else {
            linearLayout.getLayoutParams().height = (int) (AbstractC23136l9.m118713h0() * 0.4d);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C0697c0.Companion.m1052f(this, "src", m76794oL());
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: G8 */
    public void mo62725G8(C24753f c24753f, String str) {
        boolean z11;
        C17945a0 c17945a0 = this.f71111Y0;
        int i11 = this.f71113a1;
        boolean z12 = false;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC19646n0.m102899I(c24753f, c17945a0, i11, z11);
        C0732w m1189a = C0732w.Companion.m1189a();
        String m128595h = c24753f.m128595h();
        C17945a0 c17945a02 = this.f71111Y0;
        if (this.f71113a1 == 0) {
            z12 = true;
        }
        m1189a.m1187q("reaction_send", str, null, C22423y.m115852c(m128595h, c17945a02, z12));
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, sc0.InterfaceC26227e
    /* renamed from: GH */
    public Animator mo76797GH() {
        try {
            if (this.f71108V0 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f83659I0, "alpha", 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.f71108V0, "translationY", r3.getHeight(), 0.0f));
            ReactionPickerView reactionPickerView = this.f71110X0;
            if (reactionPickerView != null) {
                arrayList.add(ObjectAnimator.ofFloat(reactionPickerView, "translationY", -reactionPickerView.getMeasuredHeight(), 0.0f));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new C26088c());
            return animatorSet;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: Rp */
    public void mo62726Rp() {
        boolean z11;
        C17945a0 c17945a0 = this.f71111Y0;
        if (this.f71113a1 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC19646n0.m103004m2(c17945a0, z11);
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.e
    /* renamed from: Tv */
    public void mo12457Tv(InterfaceC17463d interfaceC17463d) {
        ZDSReactionDetailItemView.InterfaceC13749a interfaceC13749a;
        super.mo12457Tv(interfaceC17463d);
        C13750a c13750a = this.f71107U0;
        if (c13750a != null && (interfaceC13749a = c13750a.f71193t) != null) {
            interfaceC13749a.mo60329b(null);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: WE */
    public void mo62727WE(String str) {
        try {
            this.f71114b1.dismiss();
            if (this.f71111Y0 != null) {
                C23744a.m124114c().m124116d(75, this.f71111Y0.m95029V3(), str);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, sc0.InterfaceC26227e
    /* renamed from: ef */
    public Animator mo76798ef() {
        try {
            if (this.f71108V0 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f83659I0, "alpha", 1.0f, 0.0f));
            LinearLayout linearLayout = this.f71108V0;
            arrayList.add(ObjectAnimator.ofFloat(linearLayout, "translationY", AbstractC1579n0.m7836S(linearLayout), this.f71108V0.getHeight()));
            ReactionPickerView reactionPickerView = this.f71110X0;
            if (reactionPickerView != null) {
                arrayList.add(ObjectAnimator.ofFloat(reactionPickerView, "translationY", 0.0f, -reactionPickerView.getMeasuredHeight()));
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getCloseAnimator: reactionContainerView height= ");
                sb2.append(this.f71109W0.getHeight());
                if (this.f71110X0 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getCloseAnimator: reactionView height= ");
                    sb3.append(this.f71110X0.getHeight());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("getCloseAnimator: contentView height= ");
                sb4.append(this.f71108V0.getHeight());
                StringBuilder sb5 = new StringBuilder();
                sb5.append("getCloseAnimator: contentView translationY= ");
                sb5.append(AbstractC1579n0.m7836S(this.f71108V0));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new C26088c());
            return animatorSet;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return null;
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ReactionDetailScreen";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.reaction_detail_view;
    }

    /* renamed from: nL */
    void m76799nL() {
        C24753f m128570n;
        if (this.f71110X0 != null) {
            return;
        }
        String str = null;
        try {
            C24751d c24751d = this.f71112Z0;
            if (c24751d != null && (m128570n = c24751d.m128570n(Integer.parseInt(CoreUtility.f89233i))) != null) {
                str = m128570n.m128595h();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        String str2 = str;
        if (C24265l.m126676s().m126699o().m128545c()) {
            this.f71110X0 = new ReactionPickerInContextMenuView(this.f71114b1.getContext(), -1, false, str2, this, m76794oL());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            layoutParams.setMargins(0, 0, 0, AbstractC23136l9.m118742r(5.0f));
            this.f71109W0.addView(this.f71110X0, layoutParams);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            if (view.getId() == AbstractC6918a0.reaction_container_view) {
                this.f71114b1.dismiss();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m76796qL(this.f71108V0);
    }

    @Override // com.zing.zalo.p077ui.widget.reaction.ReactionPickerView.InterfaceC13747a
    /* renamed from: p2 */
    public void mo62730p2() {
        this.f71114b1.dismiss();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            LinearLayout linearLayout = (LinearLayout) this.f83659I0.findViewById(AbstractC6918a0.content_view);
            this.f71108V0 = linearLayout;
            m76796qL(linearLayout);
            RelativeLayout relativeLayout = (RelativeLayout) this.f83659I0.findViewById(AbstractC6918a0.reaction_container_view);
            this.f71109W0 = relativeLayout;
            relativeLayout.setOnClickListener(this);
            if (this.f71111Y0 != null && !C24265l.m126676s().m126698n().isEmpty()) {
                m76799nL();
            }
            ViewPager viewPager = (ViewPager) this.f83659I0.findViewById(AbstractC6918a0.pager);
            viewPager.setAdapter(this.f71107U0);
            PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) this.f83659I0.findViewById(AbstractC6918a0.tabs);
            pagerSlidingTabStrip.setHorizontalScrollBarEnabled(false);
            pagerSlidingTabStrip.setViewPager(viewPager);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}

package com.zing.zalo.p077ui.zviews;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2983h3;
import c30.C3255n;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.FeedItemBase;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.chat.widget.searchinline.C11815a;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import g30.AbstractC19215a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p500s1.C26087b;
import p615wn.C29106b;
import p716zh.C31902e9;

/* loaded from: classes6.dex */
public class SuggestChatLayout extends FeedItemBase {

    /* renamed from: A0 */
    private C11815a.g f78070A0;

    /* renamed from: B0 */
    private Animation f78071B0;

    /* renamed from: C0 */
    private FeedBaseAdapter.InterfaceC8021a f78072C0;

    /* renamed from: D0 */
    private boolean f78073D0;

    /* renamed from: r0 */
    final int f78074r0;

    /* renamed from: s0 */
    private RelativeLayout f78075s0;

    /* renamed from: t0 */
    private RecyclingImageView f78076t0;

    /* renamed from: u0 */
    private RobotoTextView f78077u0;

    /* renamed from: v0 */
    private FeedRecyclerView f78078v0;

    /* renamed from: w0 */
    private LinearLayoutManager f78079w0;

    /* renamed from: x0 */
    private C11815a f78080x0;

    /* renamed from: y0 */
    private Context f78081y0;

    /* renamed from: z0 */
    private C2983h3 f78082z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestChatLayout$a */
    /* loaded from: classes6.dex */
    public class C15136a implements FeedRecyclerView.InterfaceC8863b {
        C15136a() {
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: a */
        public void mo43265a() {
            if (SuggestChatLayout.this.f78072C0 != null) {
                SuggestChatLayout.this.f78072C0.mo43239v(false);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: b */
        public void mo43266b() {
            if (SuggestChatLayout.this.f78072C0 != null) {
                SuggestChatLayout.this.f78072C0.mo43239v(true);
            }
        }

        @Override // com.zing.zalo.feed.uicontrols.FeedRecyclerView.InterfaceC8863b
        /* renamed from: c */
        public void mo43267c() {
            if (SuggestChatLayout.this.f78072C0 != null) {
                SuggestChatLayout.this.f78072C0.mo43239v(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestChatLayout$b */
    /* loaded from: classes6.dex */
    public class C15137b extends RecyclerView.AbstractC1887n {
        C15137b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int m118742r = AbstractC23136l9.m118742r(5.0f);
            rect.right = m118742r;
            rect.left = m118742r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestChatLayout$c */
    /* loaded from: classes6.dex */
    public class C15138c extends RecyclerView.AbstractC1892s {
        C15138c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                if (C3255n.m16555f()) {
                    SuggestChatLayout.this.f78080x0.m65704v0(false);
                    try {
                        int m10127i = SuggestChatLayout.this.f78079w0.m10127i();
                        for (int i12 = 0; i12 < m10127i; i12++) {
                            RecyclerView.AbstractC1876c0 m9902v0 = SuggestChatLayout.this.f78078v0.m9902v0(i12);
                            if (m9902v0 instanceof C11815a.e) {
                                AbstractC23350e.m122772b(i12 + " initSuggestBannerListView - itemCountInLayout - " + m9902v0.f7784p.getClass(), new Object[0]);
                                ((C11815a.e) m9902v0).m65707i0();
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                if (SuggestChatLayout.this.f78072C0 != null) {
                    SuggestChatLayout.this.f78072C0.mo43241x(false);
                    return;
                }
                return;
            }
            if (C3255n.m16555f()) {
                SuggestChatLayout.this.f78080x0.m65704v0(true);
                if (SuggestChatLayout.this.f78072C0 != null) {
                    SuggestChatLayout.this.f78072C0.mo43241x(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SuggestChatLayout$d */
    /* loaded from: classes6.dex */
    public class C15139d implements C11815a.g {
        C15139d() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: I2 */
        public void mo56865I2(C31902e9 c31902e9) {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: a */
        public boolean mo56866a() {
            if (SuggestChatLayout.this.f78078v0.getScrollState() != 0) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: b */
        public void mo56867b() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: c */
        public void mo56868c() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: d */
        public void mo56869d(C31902e9 c31902e9, int i11, int i12, int i13) {
            if (SuggestChatLayout.this.f78072C0 != null && (SuggestChatLayout.this.f78072C0 instanceof FeedBaseAdapter.InterfaceC8024b0)) {
                ((FeedBaseAdapter.InterfaceC8024b0) SuggestChatLayout.this.f78072C0).mo43252z0(c31902e9, SuggestChatLayout.this.f78082z0.m14141a(), SuggestChatLayout.this.f78082z0.m14143c());
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: e */
        public void mo56870e() {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: f */
        public void mo56871f(C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a) {
        }

        @Override // com.zing.zalo.p077ui.chat.widget.searchinline.C11815a.g
        /* renamed from: i3 */
        public void mo56872i3(C31902e9 c31902e9) {
        }
    }

    public SuggestChatLayout(Context context) {
        super(context);
        this.f78074r0 = AbstractC23136l9.m118742r(60.0f);
        this.f78073D0 = false;
        this.f78081y0 = context;
        this.f78071B0 = AnimationUtils.loadAnimation(context, AbstractC10919t.fade_in);
    }

    /* renamed from: U */
    private void m84858U() {
        this.f78070A0 = new C15139d();
    }

    /* renamed from: X */
    private void m84859X() {
        try {
            if (!this.f78073D0) {
                return;
            }
            if (m84862W()) {
                int childCount = this.f78078v0.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = this.f78078v0.getChildAt(i11);
                    childAt.setTranslationX(this.f78078v0.getWidth());
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, "translationX", 0.0f);
                    ofFloat.setStartDelay(i11 * 50);
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(new C26087b());
                animatorSet.start();
                this.f78073D0 = false;
                return;
            }
            this.f78078v0.clearAnimation();
            this.f78078v0.startAnimation(this.f78071B0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: T */
    public void m84860T(C2983h3 c2983h3, FeedBaseAdapter.InterfaceC8021a interfaceC8021a) {
        this.f78082z0 = c2983h3;
        this.f78072C0 = interfaceC8021a;
        try {
            int i11 = 8;
            if (c2983h3.m14144d() != null && this.f78082z0.m14144d().f146629a != null && !this.f78082z0.m14144d().f146629a.isEmpty()) {
                AbstractC23136l9.m118747s1(this.f78075s0, 0, false);
                if (this.f78082z0.m14142b() != null) {
                    RobotoTextView robotoTextView = this.f78077u0;
                    if (robotoTextView != null) {
                        if (!TextUtils.isEmpty(this.f78082z0.m14142b().f94571a)) {
                            i11 = 0;
                        }
                        robotoTextView.setVisibility(i11);
                        this.f78077u0.setText(this.f78082z0.m14142b().f94571a);
                    }
                    if (this.f78076t0 != null && !TextUtils.isEmpty(this.f78082z0.m14142b().f94572b)) {
                        ((C23528a) this.f44295e0.m123612r(this.f78076t0)).m123619y(this.f78082z0.m14142b().f94572b, C23278z2.m120106Y(), 10);
                    }
                } else {
                    this.f78077u0.setVisibility(8);
                }
                this.f78080x0.m65705w0(this.f78082z0.m14144d().f146629a);
                m84859X();
                return;
            }
            AbstractC23136l9.m118747s1(this.f78075s0, 8, this.f78082z0.m14145e());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public void m84861V(View view, int i11) {
        this.f78075s0 = (RelativeLayout) view.findViewById(AbstractC6918a0.rl_suggest_chat);
        this.f78076t0 = (RecyclingImageView) view.findViewById(AbstractC6918a0.imv_decor);
        this.f78077u0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_hint);
        this.f78078v0 = (FeedRecyclerView) view.findViewById(AbstractC6918a0.lv_suggest_sticker);
        AbstractC23136l9.m118747s1(this.f78075s0, 8, false);
        NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f78081y0);
        this.f78079w0 = noPredictiveItemAnimLinearLayoutMngr;
        noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
        this.f78078v0.setLayoutManager(this.f78079w0);
        this.f78078v0.setOverScrollMode(2);
        this.f78078v0.setCatchTouchEventListener(new C15136a());
        this.f78078v0.m9816A(new C15137b());
        m84858U();
        C11815a c11815a = new C11815a(this.f78081y0, 1, this.f78070A0, "SUGGEST_VIEW_MAIN_APP_");
        this.f78080x0 = c11815a;
        this.f78078v0.setAdapter(c11815a);
        this.f78078v0.m9826E(new C15138c());
        super.mo43688p(this.f78081y0, i11);
        this.f78073D0 = true;
    }

    /* renamed from: W */
    boolean m84862W() {
        try {
            int childCount = this.f78078v0.getChildCount();
            if (childCount > 0) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (this.f78078v0.getChildAt(i11).getWidth() < this.f78074r0) {
                        return false;
                    }
                }
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBase
    /* renamed from: j */
    public void mo43686j(C29106b c29106b) {
    }

    public SuggestChatLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78074r0 = AbstractC23136l9.m118742r(60.0f);
        this.f78073D0 = false;
    }
}

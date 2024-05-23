package com.zing.zalo.adapters;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import androidx.recyclerview.widget.RecyclerView;
import cd0.C3429h;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.StoryBarItemImageView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Iterator;
import l30.AbstractC22055v0;
import l30.C22052u;
import me0.C23212s8;
import p354n3.C23528a;
import p716zh.C31980jc;
import p716zh.C32123ta;
import vg.AbstractC28025b8;

/* renamed from: com.zing.zalo.adapters.c9 */
/* loaded from: classes3.dex */
public class C7033c9 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    int f38434r;

    /* renamed from: s */
    String f38435s;

    /* renamed from: t */
    C23528a f38436t;

    /* renamed from: u */
    AbstractC22055v0.l f38437u;

    /* renamed from: v */
    AbstractC7220t8 f38438v;

    /* renamed from: w */
    boolean f38439w;

    /* renamed from: x */
    int f38440x;

    /* renamed from: y */
    ArrayList f38441y = new ArrayList();

    /* renamed from: com.zing.zalo.adapters.c9$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 implements AbstractC22055v0.i {

        /* renamed from: R */
        static int[] f38442R = {AbstractC16803z.icn_story_camera, AbstractC16803z.icn_story_video_call, AbstractC16803z.icn_story_pen};

        /* renamed from: I */
        public View f38443I;

        /* renamed from: J */
        public C3429h f38444J;

        /* renamed from: K */
        public StoryBarItemImageView f38445K;

        /* renamed from: L */
        TextView f38446L;

        /* renamed from: M */
        public RecyclingImageView f38447M;

        /* renamed from: N */
        public RecyclingImageView f38448N;

        /* renamed from: O */
        int f38449O;

        /* renamed from: P */
        boolean f38450P;

        /* renamed from: Q */
        Animator f38451Q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.c9$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C32697a extends AnimatorListenerAdapter {
            C32697a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                a aVar = a.this;
                int i11 = aVar.f38449O + 1;
                aVar.f38449O = i11;
                int[] iArr = a.f38442R;
                int length = i11 % iArr.length;
                aVar.f38449O = length;
                aVar.f38448N.setImageResource(iArr[length]);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.c9$a$b */
        /* loaded from: classes3.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            boolean f38453p = false;

            b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                this.f38453p = true;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                try {
                    if (!this.f38453p) {
                        Animator animator2 = a.this.f38451Q;
                        if (animator2 != null) {
                            animator2.start();
                        }
                    } else {
                        AbstractC1579n0.m7845W0(a.this.f38448N, 1.0f);
                        AbstractC1579n0.m7847X0(a.this.f38448N, 1.0f);
                        a aVar = a.this;
                        aVar.f38449O = 0;
                        aVar.f38448N.setImageResource(a.f38442R[0]);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public a(View view, int i11) {
            super(view);
            int i12;
            int i13;
            int i14;
            this.f38443I = view;
            this.f38444J = C3429h.m17214l(view.findViewById(AbstractC6918a0.story_populate_root_layout));
            this.f38446L = (TextView) view.findViewById(AbstractC6918a0.tv_story_populate_add_empty);
            RecyclingImageView recyclingImageView = (RecyclingImageView) view.findViewById(AbstractC6918a0.ic_story_add_bg);
            this.f38447M = recyclingImageView;
            if (recyclingImageView instanceof RoundCornerImageView) {
                if (AbstractC22055v0.m115154n() == 1) {
                    i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                    i13 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_height);
                    i14 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_item_circle_corner_radius);
                } else if (AbstractC22055v0.m115154n() == 0) {
                    i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width_profile);
                    i13 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_height_profile);
                    i14 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_item_roundrect_corner_radius);
                } else if (AbstractC22055v0.m115154n() == 2) {
                    i12 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_large_roundrect_width_profile);
                    i13 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_large_roundrect_height_profile);
                    i14 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_item_large_roundrect_corner_radius);
                } else {
                    i12 = 0;
                    i13 = 0;
                    i14 = 0;
                }
                ViewGroup.LayoutParams layoutParams = this.f38447M.getLayoutParams();
                layoutParams.width = i12;
                layoutParams.height = i13;
                this.f38447M.setLayoutParams(layoutParams);
                ((RoundCornerImageView) this.f38447M).setRoundRadius(i14);
                RecyclingImageView recyclingImageView2 = this.f38447M;
                ((RoundCornerImageView) recyclingImageView2).setRoundCornerColor(C23212s8.m119607o(recyclingImageView2.getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
            }
            this.f38448N = (RecyclingImageView) view.findViewById(AbstractC6918a0.ic_story_add_icon);
            if (i11 == 1) {
                view.findViewById(AbstractC6918a0.story_populate_btn_add_root).setBackgroundColor(0);
            }
            RecyclingImageView recyclingImageView3 = this.f38444J.f14377q;
            if (recyclingImageView3 instanceof StoryBarItemImageView) {
                StoryBarItemImageView storyBarItemImageView = (StoryBarItemImageView) recyclingImageView3;
                this.f38445K = storyBarItemImageView;
                storyBarItemImageView.setHasSeenAll(true);
                this.f38445K.setShape(AbstractC22055v0.m115154n());
                this.f38445K.setPadding(0);
            }
        }

        @Override // l30.AbstractC22055v0.j
        public int getPopulatePosition() {
            return this.f38444J.getPopulatePosition();
        }

        @Override // l30.AbstractC22055v0.j
        public C16719g getThumbModule() {
            return null;
        }

        @Override // l30.AbstractC22055v0.j
        public int getThumbRoundCorner() {
            return this.f38444J.getThumbRoundCorner();
        }

        @Override // l30.AbstractC22055v0.j
        public View getThumbView() {
            return this.f38444J.getThumbView();
        }

        /* renamed from: i0 */
        public void m35947i0() {
            try {
                if (AbstractC22055v0.m115117G()) {
                    RecyclingImageView recyclingImageView = this.f38448N;
                    if (recyclingImageView != null) {
                        recyclingImageView.setImageResource(f38442R[this.f38449O]);
                        return;
                    }
                    return;
                }
                if (AbstractC22055v0.m115154n() == 2) {
                    Animator animator = this.f38451Q;
                    if (animator != null && animator.isRunning()) {
                        return;
                    }
                    RecyclingImageView recyclingImageView2 = this.f38448N;
                    if (recyclingImageView2 != null) {
                        AbstractC1579n0.m7845W0(recyclingImageView2, 1.0f);
                        AbstractC1579n0.m7847X0(this.f38448N, 1.0f);
                        this.f38448N.setImageResource(f38442R[this.f38449O]);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f38448N, "scaleX", 1.0f, 0.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f38448N, "scaleY", 1.0f, 0.0f);
                    animatorSet.addListener(new C32697a());
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(350L);
                    animatorSet.setStartDelay(1000L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f38448N, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f38448N, "scaleY", 0.0f, 1.0f));
                    animatorSet2.setDuration(350L);
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    animatorSet3.play(animatorSet).before(animatorSet2);
                    animatorSet3.addListener(new b());
                    this.f38451Q = animatorSet3;
                    this.f38450P = true;
                    animatorSet3.start();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: j0 */
        public void m35948j0() {
            try {
                if (AbstractC22055v0.m115154n() == 2) {
                    this.f38450P = false;
                    Animator animator = this.f38451Q;
                    if (animator != null) {
                        animator.cancel();
                        this.f38451Q = null;
                    }
                    AbstractC1579n0.m7845W0(this.f38448N, 1.0f);
                    AbstractC1579n0.m7847X0(this.f38448N, 1.0f);
                    this.f38448N.setImageResource(f38442R[this.f38449O]);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // l30.AbstractC22055v0.i
        /* renamed from: n */
        public void mo17225n(C32123ta c32123ta, C23528a c23528a) {
            C3429h c3429h = this.f38444J;
            if (c3429h != null) {
                c3429h.mo17225n(c32123ta, c23528a);
            }
            StoryBarItemImageView storyBarItemImageView = this.f38445K;
            if (storyBarItemImageView != null) {
                boolean z11 = true;
                if (AbstractC22055v0.m115154n() != 1) {
                    z11 = false;
                }
                storyBarItemImageView.setShouldDrawOutLine(z11);
            }
        }
    }

    public C7033c9(int i11, boolean z11, C23528a c23528a, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        this.f38439w = false;
        this.f38440x = 0;
        this.f38434r = i11;
        this.f38436t = c23528a;
        this.f38437u = lVar;
        this.f38438v = abstractC7220t8;
        this.f38439w = z11;
        this.f38440x = z11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m35939O(a aVar, View view) {
        AbstractC22055v0.l lVar = this.f38437u;
        if (lVar != null) {
            lVar.mo48298a(aVar.f38444J);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m35940P(C32123ta c32123ta, a aVar, View view) {
        AbstractC22055v0.l lVar = this.f38437u;
        if (lVar != null) {
            C3429h c3429h = aVar.f38444J;
            lVar.mo82050b(c32123ta, c3429h, c3429h);
        }
    }

    /* renamed from: N */
    public int m35941N(C32123ta c32123ta) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = -1;
            try {
                if (i12 < this.f38441y.size()) {
                    if (TextUtils.equals(((C32123ta) this.f38441y.get(i12)).f148138h, c32123ta.f148138h)) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (i12 >= 0) {
            try {
                return i12 + this.f38440x;
            } catch (Exception e12) {
                e = e12;
                i11 = i12;
                e.printStackTrace();
                return i11;
            }
        }
        return i12;
    }

    /* renamed from: Q */
    public void m35942Q() {
        m35946U();
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo9990A(final a aVar, int i11) {
        try {
            int m9931C = aVar.m9931C();
            if (m9931C != 0 && m9931C != 1) {
                final C32123ta c32123ta = (C32123ta) this.f38441y.get(i11 - this.f38440x);
                aVar.mo17225n(c32123ta, this.f38436t);
                StoryBarItemImageView storyBarItemImageView = aVar.f38445K;
                if (storyBarItemImageView != null) {
                    storyBarItemImageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.b9
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C7033c9.this.m35940P(c32123ta, aVar, view);
                        }
                    });
                    return;
                }
                return;
            }
            AbstractC22055v0.m115129S(AbstractC28025b8.m141453i("tip.timeline.createstory"), false, this.f38436t, aVar.f38447M, aVar.f38448N);
            TextView textView = aVar.f38446L;
            if (textView != null) {
                if (m9931C == 1) {
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            aVar.m35947i0();
            aVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C7033c9.this.m35939O(aVar, view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        if (i11 == 0) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_populate_bar_btn_add, viewGroup, false);
        } else if (i11 == 1) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_populate_bar_btn_add_empty, viewGroup, false);
        } else {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.story_populate_bar_normal_item, viewGroup, false);
        }
        a aVar = new a(inflate, i11);
        aVar.f38444J.m17193f(this.f38434r);
        return aVar;
    }

    /* renamed from: T */
    public void m35945T(String str) {
        this.f38435s = str;
        m35942Q();
    }

    /* renamed from: U */
    void m35946U() {
        this.f38441y.clear();
        C31980jc m115161u = AbstractC22055v0.m115161u(this.f38435s);
        if (m115161u != null) {
            if (TextUtils.equals(CoreUtility.f89233i, this.f38435s)) {
                C22052u.m115085y().m115100t(m115161u);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = m115161u.f147032y;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C32123ta c32123ta = (C32123ta) it.next();
                    if (c32123ta != null && !arrayList.contains(c32123ta.f148138h)) {
                        this.f38441y.add(c32123ta);
                        arrayList.add(c32123ta.f148138h);
                    }
                }
            }
            ArrayList arrayList3 = m115161u.f147031x;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C32123ta c32123ta2 = (C32123ta) it2.next();
                    if (c32123ta2 != null && !arrayList.contains(c32123ta2.f148138h)) {
                        this.f38441y.add(c32123ta2);
                        arrayList.add(c32123ta2.f148138h);
                    }
                }
            }
        }
        AbstractC22055v0.m115138a0(this.f38441y, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int i11 = this.f38440x;
        ArrayList arrayList = this.f38441y;
        if (arrayList != null) {
            return i11 + arrayList.size();
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        try {
            int i12 = this.f38440x;
            if (i11 - i12 >= 0 && i11 - i12 < this.f38441y.size()) {
                return Long.parseLong(((C32123ta) this.f38441y.get(i11 - this.f38440x)).f148138h);
            }
            return 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 == 0 && this.f38439w) {
            ArrayList arrayList = this.f38441y;
            if (arrayList != null && !arrayList.isEmpty()) {
                return 0;
            }
            return 1;
        }
        return 2;
    }
}

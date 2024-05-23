package p491rq;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bo.C2961d1;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.feed.components.GlowingReddot;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import is.AbstractC20814p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p368nq.C23927b;
import p491rq.C25954b;
import pm0.AbstractC24866w;
import qm0.AbstractC25363p0;

/* renamed from: rq.b */
/* loaded from: classes4.dex */
public final class C25954b extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private C23528a f123831r;

    /* renamed from: s */
    private List f123832s;

    /* renamed from: t */
    private FeedBaseAdapter.InterfaceC8049z f123833t;

    /* renamed from: u */
    private Context f123834u;

    /* renamed from: v */
    private int f123835v;

    /* renamed from: rq.b$a */
    /* loaded from: classes4.dex */
    public final class a extends b {

        /* renamed from: I */
        private AspectRatioImageView f123836I;

        /* renamed from: J */
        private RobotoTextView f123837J;

        /* renamed from: K */
        private RobotoTextView f123838K;

        /* renamed from: L */
        private GlowingReddot f123839L;

        /* renamed from: M */
        private boolean f123840M;

        /* renamed from: N */
        private TrackingRelativeLayout f123841N;

        /* renamed from: O */
        private final Map f123842O;

        /* renamed from: P */
        final /* synthetic */ C25954b f123843P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C25954b c25954b, View view) {
            super(view);
            Map m131407l;
            AbstractC19074t.m100208f(view, "itemView");
            this.f123843P = c25954b;
            m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123844q.m133707c()), "profile_quick_access_my_photo"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123850w.m133707c()), "profile_quick_access_story_archive"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123848u.m133707c()), "profile_quick_access_memory"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123847t.m133707c()), "profile_quick_access_most_comment"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123846s.m133707c()), "profile_quick_access_most_favourite"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123845r.m133707c()), "profile_quick_access_my_video"), AbstractC24866w.m129235a(Integer.valueOf(EnumC25955c.f123849v.m133707c()), "profile_quick_access_list_album"));
            this.f123842O = m131407l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m133701m0(C25954b c25954b, C23927b c23927b, View view) {
            AbstractC19074t.m100208f(c25954b, "this$0");
            AbstractC19074t.m100208f(c23927b, "$quickAccessItem");
            if (c25954b.m133696P() != null) {
                FeedBaseAdapter.InterfaceC8049z m133696P = c25954b.m133696P();
                AbstractC19074t.m100205c(m133696P);
                m133696P.mo43277a0(c23927b);
            }
        }

        /* renamed from: n0 */
        private final void m133702n0(boolean z11) {
            GlowingReddot glowingReddot = this.f123839L;
            if (glowingReddot != null && z11 && !this.f123840M) {
                AbstractC19074t.m100205c(glowingReddot);
                glowingReddot.m44426f(4000L);
                this.f123840M = true;
            }
        }

        @Override // p491rq.C25954b.b
        /* renamed from: i0 */
        public void mo133703i0(final C23927b c23927b, int i11) {
            String m108599D;
            int i12;
            TrackingRelativeLayout trackingRelativeLayout;
            AbstractC19074t.m100208f(c23927b, "quickAccessItem");
            if (!TextUtils.isEmpty(c23927b.f115600d)) {
                ((C23528a) this.f123843P.m133695O().m123612r(this.f123836I)).m123618x(c23927b.f115600d, C23278z2.m120146o0());
            }
            RobotoTextView robotoTextView = this.f123837J;
            AbstractC19074t.m100205c(robotoTextView);
            robotoTextView.setText(c23927b.f115603g);
            int i13 = c23927b.f115601e;
            if (i13 < 0) {
                m108599D = "0";
            } else {
                m108599D = AbstractC20814p0.m108599D(i13);
                AbstractC19074t.m100205c(m108599D);
            }
            RobotoTextView robotoTextView2 = this.f123838K;
            AbstractC19074t.m100205c(robotoTextView2);
            robotoTextView2.setText(m108599D);
            RobotoTextView robotoTextView3 = this.f123838K;
            AbstractC19074t.m100205c(robotoTextView3);
            int i14 = 0;
            if (c23927b.f115606j) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            robotoTextView3.setVisibility(i12);
            GlowingReddot glowingReddot = this.f123839L;
            AbstractC19074t.m100205c(glowingReddot);
            if (!c23927b.f115604h) {
                i14 = 8;
            }
            glowingReddot.setVisibility(i14);
            m133702n0(c23927b.f115605i);
            if (this.f123843P.f123835v == 1 && (trackingRelativeLayout = this.f123841N) != null) {
                AbstractC19074t.m100205c(trackingRelativeLayout);
                if (trackingRelativeLayout.getLayoutParams() != null) {
                    int m118742r = AbstractC23136l9.m118742r(16.0f);
                    int m118742r2 = AbstractC23136l9.m118742r(16.0f);
                    int m118742r3 = AbstractC23136l9.m118742r(8.0f);
                    TrackingRelativeLayout trackingRelativeLayout2 = this.f123841N;
                    AbstractC19074t.m100205c(trackingRelativeLayout2);
                    trackingRelativeLayout2.getLayoutParams().width = (((AbstractC23136l9.m118722k0() - m118742r2) - m118742r) - m118742r3) / 2;
                }
            }
            TrackingRelativeLayout trackingRelativeLayout3 = this.f123841N;
            if (trackingRelativeLayout3 != null) {
                String str = (String) this.f123842O.get(Integer.valueOf(c23927b.f115607k));
                if (str == null) {
                    str = "profile_quick_access_other_" + c23927b.f115607k;
                }
                trackingRelativeLayout3.setIdTracking(str);
            }
            TrackingRelativeLayout trackingRelativeLayout4 = this.f123841N;
            if (trackingRelativeLayout4 != null) {
                final C25954b c25954b = this.f123843P;
                trackingRelativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: rq.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C25954b.a.m133701m0(C25954b.this, c23927b, view);
                    }
                });
            }
        }

        @Override // p491rq.C25954b.b
        /* renamed from: j0 */
        public void mo133704j0(View view) {
            AbstractC19074t.m100208f(view, "itemView");
            this.f123836I = (AspectRatioImageView) view.findViewById(AbstractC6918a0.quick_access_icon);
            this.f123837J = (RobotoTextView) view.findViewById(AbstractC6918a0.quick_access_title);
            this.f123838K = (RobotoTextView) view.findViewById(AbstractC6918a0.quick_access_photo_count);
            this.f123839L = (GlowingReddot) view.findViewById(AbstractC6918a0.glowing_reddot);
            this.f123841N = (TrackingRelativeLayout) view.findViewById(AbstractC6918a0.parent_container);
            m133705k0(this.f123839L);
        }
    }

    /* renamed from: rq.b$b */
    /* loaded from: classes4.dex */
    public static abstract class b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            mo133704j0(view);
        }

        /* renamed from: i0 */
        public abstract void mo133703i0(C23927b c23927b, int i11);

        /* renamed from: j0 */
        public abstract void mo133704j0(View view);

        /* renamed from: k0 */
        protected final void m133705k0(GlowingReddot glowingReddot) {
            if (glowingReddot != null) {
                glowingReddot.m44424c(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118641B(glowingReddot.getContext(), AbstractC16801x.white), ZAbstractBase.ZVU_PROCESS_FLUSH, 0, 1, 3, 300);
                glowingReddot.setTopLayerSize(AbstractC23136l9.m118742r(6.0f));
                glowingReddot.setTopLayerColor(Color.parseColor("#ff565d"));
                glowingReddot.setBottomLayerSize(AbstractC23136l9.m118742r(8.0f));
                glowingReddot.setBottomLayerColor(AbstractC23136l9.m118641B(glowingReddot.getContext(), AbstractC16801x.white_50));
            }
        }
    }

    public C25954b(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "mAQuery");
        this.f123831r = c23528a;
        this.f123832s = new ArrayList();
    }

    /* renamed from: M */
    public final int m133693M() {
        try {
            if (!this.f123832s.isEmpty()) {
                int size = this.f123832s.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (TextUtils.equals(((C23927b) this.f123832s.get(i11)).f115598b, "action.open.memorylist")) {
                        return i11;
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1;
        }
    }

    /* renamed from: N */
    public final int m133694N() {
        try {
            if (!this.f123832s.isEmpty()) {
                int size = this.f123832s.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (TextUtils.equals(((C23927b) this.f123832s.get(i11)).f115598b, "action.open.story_archive")) {
                        return i11;
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: O */
    public final C23528a m133695O() {
        return this.f123831r;
    }

    /* renamed from: P */
    public final FeedBaseAdapter.InterfaceC8049z m133696P() {
        return this.f123833t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        bVar.mo133703i0((C23927b) this.f123832s.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f123834u = viewGroup.getContext();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.profile_item_quick_access_layout, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        return new a(this, inflate);
    }

    /* renamed from: S */
    public final void m133699S(C2961d1 c2961d1, FeedBaseAdapter.InterfaceC8049z interfaceC8049z) {
        AbstractC19074t.m100208f(c2961d1, "feedProfileQuickAccessData");
        if (c2961d1.f11676a == null) {
            return;
        }
        this.f123832s = new ArrayList(c2961d1.f11676a);
        this.f123833t = interfaceC8049z;
        this.f123835v = c2961d1.m14019a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f123832s.size();
    }
}

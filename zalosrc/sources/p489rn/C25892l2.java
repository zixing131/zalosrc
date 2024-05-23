package p489rn;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.AbstractC2144f;
import com.zing.zalo.AbstractC16803z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import p489rn.C25892l2;
import p649xl.C30016r8;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: rn.l2 */
/* loaded from: classes4.dex */
public final class C25892l2 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private List f123514r;

    /* renamed from: s */
    private a f123515s;

    /* renamed from: t */
    private int f123516t;

    /* renamed from: rn.l2$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo39420a(int i11, c cVar);
    }

    /* renamed from: rn.l2$b */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.AbstractC1876c0 {
        public static final a Companion = new a(null);

        /* renamed from: I */
        private final C30016r8 f123517I;

        /* renamed from: J */
        private final int f123518J;

        /* renamed from: rn.l2$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m133552a(ViewGroup viewGroup, int i11) {
                AbstractC19074t.m100208f(viewGroup, "parent");
                C30016r8 m148447c = C30016r8.m148447c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                AbstractC19074t.m100207e(m148447c, "inflate(...)");
                return new b(m148447c, i11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C30016r8 c30016r8, int i11) {
            super(c30016r8.getRoot());
            AbstractC19074t.m100208f(c30016r8, "binding");
            this.f123517I = c30016r8;
            this.f123518J = i11;
        }

        /* renamed from: i0 */
        public final void m133551i0(c cVar, int i11, View.OnClickListener onClickListener) {
            boolean z11;
            int i12;
            int i13;
            int i14;
            AbstractC19074t.m100208f(onClickListener, "onItemClickListener");
            int i15 = 8;
            if (cVar != null) {
                if (cVar.m133553a() == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i12 = AbstractC16803z.bg_story_effect_highlight;
                } else {
                    i12 = AbstractC16803z.bg_story_effect_normal;
                }
                if (z11) {
                    i13 = AbstractC23222t7.f112528I;
                } else {
                    i13 = AbstractC23222t7.f112522F;
                }
                if (z11) {
                    i14 = -16777216;
                } else {
                    i14 = -1;
                }
                int m133554b = cVar.m133554b();
                this.f123517I.f139219r.setBackgroundResource(i12);
                this.f123517I.f139218q.setImageResource(m133554b);
                this.f123517I.f139218q.setColorFilter(i14, PorterDuff.Mode.SRC_IN);
                ViewGroup.LayoutParams layoutParams = this.f123517I.f139218q.getLayoutParams();
                layoutParams.width = i13;
                layoutParams.height = i13;
                this.f123517I.f139218q.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.f123517I.f139221t.getLayoutParams();
                layoutParams2.width = i13;
                layoutParams2.height = i13;
                this.f123517I.f139221t.setLayoutParams(layoutParams2);
                FrameLayout frameLayout = this.f123517I.f139220s;
                if (cVar.m133555c()) {
                    i15 = 0;
                }
                AbstractC23136l9.m118744r1(frameLayout, i15);
                this.f7784p.setOnClickListener(onClickListener);
                return;
            }
            AbstractC23136l9.m118744r1(this.f123517I.f139220s, 8);
            this.f7784p.setOnClickListener(null);
        }
    }

    /* renamed from: rn.l2$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final int f123519a;

        /* renamed from: b */
        private final int f123520b;

        /* renamed from: c */
        private boolean f123521c;

        public c(int i11, int i12, boolean z11) {
            this.f123519a = i11;
            this.f123520b = i12;
            this.f123521c = z11;
        }

        /* renamed from: a */
        public final int m133553a() {
            return this.f123519a;
        }

        /* renamed from: b */
        public final int m133554b() {
            return this.f123520b;
        }

        /* renamed from: c */
        public final boolean m133555c() {
            return this.f123521c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f123519a == cVar.f123519a && this.f123520b == cVar.f123520b && this.f123521c == cVar.f123521c;
        }

        public int hashCode() {
            return (((this.f123519a * 31) + this.f123520b) * 31) + AbstractC2144f.m11520a(this.f123521c);
        }

        public String toString() {
            return "StoryMusicEffectData(id=" + this.f123519a + ", imageResourceId=" + this.f123520b + ", isLoading=" + this.f123521c + ")";
        }
    }

    public C25892l2(List list, a aVar) {
        AbstractC19074t.m100208f(list, "effects");
        AbstractC19074t.m100208f(aVar, "listener");
        this.f123514r = list;
        this.f123515s = aVar;
        this.f123516t = -1;
    }

    /* renamed from: N */
    public static final void m133542N(C25892l2 c25892l2) {
        AbstractC19074t.m100208f(c25892l2, "this$0");
        c25892l2.m10008p();
    }

    /* renamed from: Q */
    public static final void m133543Q(C25892l2 c25892l2, int i11, c cVar, View view) {
        AbstractC19074t.m100208f(c25892l2, "this$0");
        c25892l2.m133545O(i11, cVar);
    }

    /* renamed from: U */
    private final void m133544U(int i11) {
        this.f123516t = i11;
        AbstractC19444a.m101695c(new Runnable() { // from class: rn.j2
            public /* synthetic */ RunnableC25884j2() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25892l2.m133542N(C25892l2.this);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        c cVar;
        Object m131207g0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        List list = this.f123514r;
        if (list != null) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            cVar = (c) m131207g0;
        } else {
            cVar = null;
        }
        if (abstractC1876c0 instanceof b) {
            ((b) abstractC1876c0).m133551i0(cVar, this.f123516t, new View.OnClickListener() { // from class: rn.k2

                /* renamed from: q */
                public final /* synthetic */ int f123503q;

                /* renamed from: r */
                public final /* synthetic */ C25892l2.c f123504r;

                public /* synthetic */ ViewOnClickListenerC25888k2(int i112, C25892l2.c cVar2) {
                    r2 = i112;
                    r3 = cVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C25892l2.m133543Q(C25892l2.this, r2, r3, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        return b.Companion.m133552a(viewGroup, mo10003k());
    }

    /* renamed from: O */
    public final void m133545O(int i11, c cVar) {
        if (cVar != null) {
            m133544U(cVar.m133553a());
            a aVar = this.f123515s;
            if (aVar != null) {
                aVar.mo39420a(i11, cVar);
            }
        }
    }

    /* renamed from: P */
    public final c m133546P(int i11) {
        Object m131207g0;
        List list = this.f123514r;
        if (list != null) {
            m131207g0 = AbstractC25332a0.m131207g0(list, i11);
            return (c) m131207g0;
        }
        return null;
    }

    /* renamed from: R */
    public final int m133547R() {
        m133544U(-1);
        return this.f123516t;
    }

    /* renamed from: S */
    public final void m133548S(List list) {
        this.f123514r = list;
    }

    /* renamed from: T */
    public final int m133549T(int i11) {
        m133544U(i11);
        List list = this.f123514r;
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                if (((c) obj).m133553a() == i11) {
                    return i12;
                }
                i12 = i13;
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: V */
    public final int m133550V() {
        c cVar;
        int i11;
        int i12;
        Object m131207g0;
        List list = this.f123514r;
        int i13 = 0;
        c cVar2 = null;
        if (list != null) {
            cVar = null;
            i11 = -1;
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC25368s.m131509q();
                }
                c cVar3 = (c) obj;
                if (cVar3.m133553a() == this.f123516t) {
                    i11 = i14;
                    cVar = cVar3;
                }
                i14 = i15;
            }
        } else {
            cVar = null;
            i11 = -1;
        }
        if (i11 == -1) {
            List list2 = this.f123514r;
            if (list2 != null) {
                m131207g0 = AbstractC25332a0.m131207g0(list2, 0);
                cVar2 = (c) m131207g0;
            }
            cVar = cVar2;
        } else {
            i13 = i11;
        }
        if (cVar != null) {
            i12 = cVar.m133553a();
        } else {
            i12 = this.f123516t;
        }
        m133544U(i12);
        return i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f123514r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }
}

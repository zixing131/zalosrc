package v20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.DecorBackgroundRowView;
import com.zing.zalo.feed.uicontrols.TypographyView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31984k1;

/* renamed from: v20.e */
/* loaded from: classes5.dex */
public class C27477e extends RecyclerView.AbstractC1880g {

    /* renamed from: A */
    public static final int f129229A = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: B */
    public static final int f129230B = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: C */
    public static final int f129231C;

    /* renamed from: D */
    public static final int f129232D;

    /* renamed from: E */
    public static final int f129233E;

    /* renamed from: F */
    public static int f129234F;

    /* renamed from: G */
    public static int f129235G;

    /* renamed from: H */
    public static int f129236H;

    /* renamed from: I */
    public static int f129237I;

    /* renamed from: r */
    private List f129238r;

    /* renamed from: s */
    private final LayoutInflater f129239s;

    /* renamed from: t */
    private final Context f129240t;

    /* renamed from: u */
    b f129241u;

    /* renamed from: v */
    a f129242v;

    /* renamed from: y */
    d f129245y;

    /* renamed from: w */
    private boolean f129243w = false;

    /* renamed from: x */
    private C31890dc f129244x = null;

    /* renamed from: z */
    boolean f129246z = false;

    /* renamed from: v20.e$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo103701a(C31890dc c31890dc);
    }

    /* renamed from: v20.e$b */
    /* loaded from: classes5.dex */
    public interface b {
        /* renamed from: a */
        void mo78503a(C31890dc c31890dc, int i11);

        /* renamed from: b */
        void mo78504b(C31890dc c31890dc, int i11);
    }

    /* renamed from: v20.e$c */
    /* loaded from: classes5.dex */
    public class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        TypographyView f129247I;

        /* renamed from: J */
        DecorBackgroundRowView f129248J;

        /* renamed from: K */
        RobotoTextView f129249K;

        public c(View view, int i11) {
            super(view);
            m140553i0(view, i11);
        }

        /* renamed from: i0 */
        void m140553i0(View view, int i11) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.bgCateTitle);
                        this.f129249K = robotoTextView;
                        if (C27477e.this.f129246z) {
                            robotoTextView.setTextColor(AbstractC23136l9.m118641B(view.getContext(), AbstractC16801x.white_70));
                            return;
                        }
                        return;
                    }
                    return;
                }
                DecorBackgroundRowView decorBackgroundRowView = (DecorBackgroundRowView) view.findViewById(AbstractC6918a0.bgGraphyView);
                this.f129248J = decorBackgroundRowView;
                decorBackgroundRowView.m47291d(view.getContext());
                return;
            }
            TypographyView typographyView = (TypographyView) view.findViewById(AbstractC6918a0.typographyView);
            this.f129247I = typographyView;
            typographyView.m47324a(view.getContext());
        }
    }

    /* renamed from: v20.e$d */
    /* loaded from: classes5.dex */
    public enum d {
        TYPO_FEED,
        BG_FEED
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        f129231C = m118742r;
        f129232D = AbstractC23136l9.m118742r(66.0f);
        int m118742r2 = AbstractC23136l9.m118742r(120.0f);
        f129233E = m118742r2;
        f129234F = 4;
        f129235G = m118742r;
        f129236H = m118742r2;
        f129237I = m118742r;
    }

    public C27477e(Context context, d dVar) {
        this.f129240t = context;
        this.f129239s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f129245y = dVar;
        m140534S();
        m9999J(true);
    }

    /* renamed from: S */
    private void m140534S() {
        try {
            int m118722k0 = AbstractC23136l9.m118722k0();
            for (int i11 = f129232D; i11 <= f129233E; i11 += f129229A) {
                int i12 = m118722k0 / i11;
                int i13 = (m118722k0 - (i12 * i11)) / (i12 + 1);
                while (i13 < f129231C) {
                    int i14 = i12 - 1;
                    i13 = (m118722k0 - (i14 * i11)) / i12;
                    i12 = i14;
                }
                if (i13 <= f129230B) {
                    f129236H = i11;
                    f129234F = i12;
                    f129235G = i13;
                    f129237I = i13;
                    return;
                }
            }
            int i15 = f129232D;
            f129236H = i15;
            int i16 = f129231C;
            f129235G = i16;
            int i17 = m118722k0 / i15;
            int i18 = m118722k0 - (i15 * i17);
            int i19 = i16 * (i17 + 1);
            while (i18 < i19) {
                i17--;
                i18 = m118722k0 - (f129236H * i17);
            }
            f129234F = i17;
            f129237I = (i18 - (f129235G * (i17 - 2))) / 2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ void m140535T(C31890dc c31890dc, int i11, View view) {
        try {
            m140551f0(c31890dc);
            if (c31890dc.m153250u()) {
                b bVar = this.f129241u;
                if (bVar != null) {
                    bVar.mo78504b(c31890dc, i11);
                }
            } else {
                b bVar2 = this.f129241u;
                if (bVar2 != null) {
                    bVar2.mo78503a(c31890dc, i11);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m140536U(C31890dc c31890dc) {
        m140551f0(c31890dc);
        a aVar = this.f129242v;
        if (aVar != null) {
            aVar.mo103701a(c31890dc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m140537V() {
        try {
            m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    protected C31984k1 m140538O(int i11) {
        List list = this.f129238r;
        if (list != null && i11 >= 0 && i11 < list.size()) {
            return (C31984k1) this.f129238r.get(i11);
        }
        return null;
    }

    /* renamed from: P */
    public List m140539P() {
        return this.f129238r;
    }

    /* renamed from: Q */
    public int m140540Q(C31890dc c31890dc) {
        try {
            if (this.f129238r != null) {
                for (int i11 = 0; i11 < this.f129238r.size(); i11++) {
                    if (((C31984k1) this.f129238r.get(i11)).m153941a(c31890dc)) {
                        return i11;
                    }
                }
                return -1;
            }
            return -1;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return -1;
        }
    }

    /* renamed from: R */
    public C31890dc m140541R() {
        return this.f129244x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, final int i11) {
        C31984k1 m140538O = m140538O(i11);
        try {
            int mo10005m = mo10005m(i11);
            if (mo10005m != 1) {
                if (mo10005m != 2) {
                    if (mo10005m == 3) {
                        cVar.f129249K.setText(m140538O.f147079c.f147938b);
                    }
                } else {
                    cVar.f129248J.m47292f(m140538O, this.f129243w, this.f129244x);
                    cVar.f129248J.setListener(new DecorBackgroundRowView.InterfaceC8854a() { // from class: v20.d
                        @Override // com.zing.zalo.feed.uicontrols.DecorBackgroundRowView.InterfaceC8854a
                        /* renamed from: a */
                        public final void mo47293a(C31890dc c31890dc) {
                            C27477e.this.m140536U(c31890dc);
                        }
                    });
                }
            } else if (m140538O != null) {
                final C31890dc m153943c = m140538O.m153943c();
                cVar.f129247I.m47325b(m153943c, this.f129243w, this.f129244x);
                cVar.f129247I.setOnClickListener(new View.OnClickListener() { // from class: v20.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C27477e.this.m140535T(m153943c, i11, view);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    inflate = this.f129239s.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                } else {
                    inflate = this.f129239s.inflate(AbstractC7409c0.bg_cate_title_view, viewGroup, false);
                    int i12 = f129237I;
                    inflate.setPadding(i12, 0, i12, 0);
                }
            } else {
                inflate = this.f129239s.inflate(AbstractC7409c0.bg_graphy_item_view, viewGroup, false);
            }
        } else {
            inflate = this.f129239s.inflate(AbstractC7409c0.typo_graphy_item_view, viewGroup, false);
        }
        return new c(inflate, i11);
    }

    /* renamed from: Y */
    public void m140544Y(int i11, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, boolean z11) {
        if (linearLayoutManager != null && recyclerView != null) {
            try {
                View mo9732P = linearLayoutManager.mo9732P(i11);
                if (mo9732P != null) {
                    int width = (recyclerView.getWidth() - mo9732P.getWidth()) / 2;
                    int left = mo9732P.getLeft();
                    if (z11) {
                        recyclerView.m9845O1(left - width, 0);
                    } else {
                        recyclerView.scrollBy(left - width, 0);
                    }
                } else if (z11) {
                    recyclerView.mo9854S1(i11);
                } else {
                    recyclerView.m9837K1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: Z */
    public void m140545Z(int i11, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, boolean z11) {
        if (linearLayoutManager != null && recyclerView != null) {
            try {
                View mo9732P = linearLayoutManager.mo9732P(i11);
                if (mo9732P != null) {
                    int height = (recyclerView.getHeight() - mo9732P.getHeight()) / 2;
                    int top = mo9732P.getTop();
                    if (z11) {
                        recyclerView.m9845O1(0, top - height);
                    } else {
                        recyclerView.scrollBy(0, top - height);
                    }
                } else if (z11) {
                    recyclerView.mo9854S1(i11);
                } else {
                    recyclerView.m9837K1(i11);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: a0 */
    public void m140546a0(C31890dc c31890dc, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, boolean z11) {
        try {
            if (this.f129238r != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f129238r.size()) {
                        if (((C31984k1) this.f129238r.get(i11)).m153943c().f146495a == c31890dc.f146495a) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    m140544Y(i11, recyclerView, linearLayoutManager, z11);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: b0 */
    public void m140547b0(a aVar) {
        this.f129242v = aVar;
    }

    /* renamed from: c0 */
    public void m140548c0(List list) {
        d dVar = this.f129245y;
        if (dVar == d.TYPO_FEED) {
            this.f129238r = C31845ac.m152996J().m153075z(list);
        } else if (dVar == d.BG_FEED) {
            this.f129238r = C31845ac.m152996J().m153073y(list);
        }
    }

    /* renamed from: d0 */
    public void m140549d0(boolean z11) {
        this.f129246z = z11;
    }

    /* renamed from: e0 */
    public void m140550e0(boolean z11) {
        this.f129243w = z11;
    }

    /* renamed from: f0 */
    public void m140551f0(C31890dc c31890dc) {
        this.f129244x = c31890dc;
        AbstractC19444a.m101694b(new Runnable() { // from class: v20.b
            @Override // java.lang.Runnable
            public final void run() {
                C27477e.this.m140537V();
            }
        }, 200L);
    }

    /* renamed from: g0 */
    public void m140552g0(b bVar) {
        this.f129241u = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f129238r;
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            C31984k1 m140538O = m140538O(i11);
            if (m140538O == null) {
                return 0;
            }
            int i12 = m140538O.f147077a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        return 0;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0;
        }
    }
}

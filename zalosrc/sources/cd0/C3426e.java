package cd0;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.adapters.C7253w8;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.story.component.StoryBarBtnAdd;
import com.zing.zalo.story.component.StoryBarStoryItem;
import i40.AbstractC20279i;
import is.AbstractC20826v0;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22021e0;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;
import p716zh.C31980jc;
import p716zh.C32123ta;
import vg.AbstractC28065f8;
import zl0.AbstractC32232i;

/* renamed from: cd0.e */
/* loaded from: classes4.dex */
public class C3426e extends AbstractC3423b {

    /* renamed from: l */
    private final C7253w8 f14390l;

    /* renamed from: m */
    private final AbstractC22055v0.l f14391m;

    /* renamed from: n */
    private final RobotoTextView f14392n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cd0.e$a */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.AbstractC1887n {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            RecyclerView.AbstractC1876c0 m9897o0 = recyclerView.m9897o0(view);
            if (AbstractC22055v0.m115153m() == 2) {
                if (m9897o0 != null && m9897o0.m9929A() == 0 && m9897o0.m9931C() != 12 && m9897o0.m9931C() != 22 && m9897o0.m9931C() != 32) {
                    rect.left = AbstractC32232i.m155453a(12.0f);
                }
                rect.right = AbstractC32232i.m155453a(8.0f);
            }
        }
    }

    public C3426e(View view, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        super(view, abstractC7220t8);
        this.f14392n = (RobotoTextView) view.findViewById(AbstractC6918a0.story_bar_title);
        this.f14391m = lVar;
        this.f14367d.m9816A(new a());
        AbstractC20826v0.m108780Q0(this.f14367d);
        C7253w8 c7253w8 = new C7253w8(this.f14370g, lVar, abstractC7220t8);
        this.f14390l = c7253w8;
        c7253w8.m9999J(true);
        this.f14367d.setAdapter(c7253w8);
        m17203v(C22021e0.f108429m);
        m17206y();
    }

    /* renamed from: q */
    public static View m17196q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(AbstractC7409c0.story_bar, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: e */
    public void mo17197e(C31980jc c31980jc) {
        int m36996O = this.f14390l.m36996O(c31980jc);
        int i11 = this.f14372i;
        if (i11 == m36996O) {
            this.f14366c.m9721B2(i11, AbstractC23136l9.m118742r(8.0f));
            return;
        }
        this.f14372i = m36996O;
        if (m36996O != -1) {
            this.f14366c.m9721B2(m36996O, AbstractC23136l9.m118742r(8.0f));
        }
        AbstractC22055v0.j jVar = this.f14373j;
        if (jVar != null) {
            if (jVar.getThumbView() != null) {
                this.f14373j.getThumbView().setVisibility(0);
            }
            this.f14373j = null;
            this.f14369f = null;
        }
        m17190o(m36996O);
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: f */
    public void mo17198f(C31980jc c31980jc, C32123ta c32123ta) {
        C7253w8.a aVar;
        StoryBarStoryItem storyBarStoryItem;
        C7253w8.a aVar2;
        StoryBarStoryItem storyBarStoryItem2;
        C31980jc m36994M = this.f14390l.m36994M();
        int m36996O = this.f14390l.m36996O(m36994M);
        int m36996O2 = this.f14390l.m36996O(c31980jc);
        this.f14390l.m37003W(c31980jc);
        if (m36996O2 >= 0 && (aVar2 = (C7253w8.a) this.f14367d.m9900t0(m36996O2)) != null && (storyBarStoryItem2 = aVar2.f39801J) != null) {
            storyBarStoryItem2.m56591c(c31980jc, m36994M, this.f14391m);
        }
        if (m36996O >= 0 && m36996O != m36996O2 && (aVar = (C7253w8.a) this.f14367d.m9900t0(m36996O)) != null && (storyBarStoryItem = aVar.f39801J) != null) {
            storyBarStoryItem.m56591c(m36994M, m36994M, this.f14391m);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cd0.AbstractC3423b
    /* renamed from: k */
    public void mo17186k(int i11) {
        boolean z11;
        super.mo17186k(i11);
        if (i11 == 0) {
            AbstractC23647d.m123906p("4915001");
            AbstractC23647d.m123893c();
            int m10127i = this.f14366c.m10127i();
            int m9745c2 = this.f14366c.m9745c2();
            C7253w8 c7253w8 = this.f14390l;
            if (c7253w8 != null && c7253w8.mo10005m(m9745c2) == this.f14390l.m36995N(4)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m10127i - 1 <= m9745c2 && C22021e0.m114963p().f108434b && !C22021e0.m114963p().f108436d && !z11) {
                C7253w8 c7253w82 = this.f14390l;
                if (c7253w82 != null) {
                    c7253w82.m37001U(10002);
                }
                AbstractC7220t8 abstractC7220t8 = this.f14371h;
                if (abstractC7220t8 != null) {
                    abstractC7220t8.mo36733a(false);
                }
            }
        }
    }

    @Override // cd0.AbstractC3423b
    /* renamed from: l */
    public void mo17187l() {
        try {
            int min = Math.min(this.f14366c.m9745c2(), C22021e0.f108429m.size());
            for (int m9740Y1 = this.f14366c.m9740Y1(); m9740Y1 < min; m9740Y1++) {
                AbstractC28065f8.m141534d((C31980jc) C22021e0.f108429m.get(m9740Y1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cd0.AbstractC3423b
    /* renamed from: p */
    public void mo17191p() {
        C7253w8.a aVar;
        StoryBarBtnAdd storyBarBtnAdd;
        View view;
        super.mo17191p();
        if (this.f14368e == null && this.f14367d.isShown() && (aVar = (C7253w8.a) this.f14367d.m9900t0(0)) != null && (storyBarBtnAdd = aVar.f39800I) != null && (view = storyBarBtnAdd.f55084y) != null) {
            AbstractC20279i.a m105893a = AbstractC20279i.m105893a(view);
            int width = m105893a.f100223b + (m105893a.f100225d / 2) + aVar.f7784p.getWidth();
            int i11 = m105893a.f100224c + (m105893a.f100226e / 2);
            if (width > 0 && i11 > 0) {
                this.f14368e = new Point(width, i11);
            }
        }
    }

    /* renamed from: r */
    public StoryBarBtnAdd m17199r() {
        C7253w8.a aVar;
        RecyclerView recyclerView = this.f14367d;
        if (recyclerView != null && (aVar = (C7253w8.a) recyclerView.m9900t0(0)) != null) {
            return aVar.f39800I;
        }
        return null;
    }

    /* renamed from: s */
    public int m17200s(C31980jc c31980jc) {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            return c7253w8.m36996O(c31980jc);
        }
        return -1;
    }

    /* renamed from: t */
    public void m17201t() {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            c7253w8.m10008p();
        }
    }

    /* renamed from: u */
    public void m17202u(int i11) {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            c7253w8.m37001U(i11);
        }
    }

    /* renamed from: v */
    public void m17203v(List list) {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            c7253w8.m37002V(list);
        }
    }

    /* renamed from: w */
    public void m17204w(C31980jc c31980jc) {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            c7253w8.m37003W(c31980jc);
        }
    }

    /* renamed from: x */
    public void m17205x() {
        C7253w8 c7253w8 = this.f14390l;
        if (c7253w8 != null) {
            c7253w8.m37004X();
        }
    }

    /* renamed from: y */
    public void m17206y() {
        if (C22013a0.m114925d() == 1) {
            AbstractC23136l9.m118744r1(this.f14392n, 8);
            RecyclerView recyclerView = this.f14367d;
            if (recyclerView != null) {
                recyclerView.setPadding(AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(3.0f), AbstractC23136l9.m118742r(0.0f));
                ViewGroup.LayoutParams layoutParams = this.f14367d.getLayoutParams();
                int m118742r = AbstractC23136l9.m118742r(8.0f);
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, m118742r);
                } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, m118742r);
                } else if (layoutParams instanceof RecyclerView.LayoutParams) {
                    ((RecyclerView.LayoutParams) layoutParams).setMargins(0, 0, 0, m118742r);
                }
            }
        }
    }
}

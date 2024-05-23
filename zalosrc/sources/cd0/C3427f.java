package cd0;

import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.AbstractC7220t8;
import com.zing.zalo.adapters.C7033c9;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import i40.AbstractC20279i;
import l30.AbstractC22055v0;
import p716zh.C31980jc;
import p716zh.C32123ta;

/* renamed from: cd0.f */
/* loaded from: classes4.dex */
public class C3427f extends AbstractC3423b {

    /* renamed from: l */
    private final C7033c9 f14394l;

    public C3427f(int i11, boolean z11, View view, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        super(view, abstractC7220t8);
        C7033c9 c7033c9 = new C7033c9(i11, z11, this.f14364a, lVar, abstractC7220t8);
        this.f14394l = c7033c9;
        c7033c9.m9999J(true);
        this.f14367d.setAdapter(c7033c9);
    }

    /* renamed from: r */
    public static View m17207r(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(AbstractC7409c0.story_bar_populate, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.StoryDetailsView.AbstractC15101b0
    /* renamed from: f */
    public void mo17198f(C31980jc c31980jc, C32123ta c32123ta) {
        int m35941N = this.f14394l.m35941N(c32123ta);
        if (this.f14372i == m35941N) {
            return;
        }
        this.f14372i = m35941N;
        int m9740Y1 = this.f14366c.m9740Y1();
        int m9745c2 = this.f14366c.m9745c2();
        int i11 = this.f14372i;
        if (i11 != -1 && (i11 < m9740Y1 || i11 > m9745c2)) {
            this.f14366c.mo9756v1(i11);
        }
        AbstractC22055v0.j jVar = this.f14373j;
        if (jVar != null) {
            if (jVar.getThumbView() != null) {
                this.f14373j.getThumbView().setVisibility(0);
            }
            this.f14373j = null;
            this.f14369f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cd0.AbstractC3423b
    /* renamed from: p */
    public void mo17191p() {
        RecyclingImageView recyclingImageView;
        AbstractC20279i.a m105893a;
        super.mo17191p();
        if (this.f14367d.isShown()) {
            int i11 = 0;
            C7033c9.a aVar = (C7033c9.a) this.f14367d.m9900t0(0);
            if (aVar != null && aVar.f38444J != null && (recyclingImageView = aVar.f38447M) != null && (m105893a = AbstractC20279i.m105893a(recyclingImageView)) != null) {
                if (AbstractC22055v0.m115154n() == 1) {
                    i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_cirle_width);
                } else if (AbstractC22055v0.m115154n() == 0) {
                    i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_roundrect_width_profile);
                } else if (AbstractC22055v0.m115154n() == 2) {
                    i11 = MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_bar_thumb_large_roundrect_width_profile);
                }
                int dimensionPixelSize = m105893a.f100223b + (m105893a.f100225d / 2) + i11 + (MainApplication.getAppContext().getResources().getDimensionPixelSize(AbstractC16802y.story_populate_bar_horizontal_padding_small) * 2);
                int i12 = m105893a.f100224c + (m105893a.f100226e / 2);
                if (dimensionPixelSize > 0 && i12 > 0) {
                    this.f14368e = new Point(dimensionPixelSize, i12);
                }
            }
        }
    }

    /* renamed from: q */
    public C7033c9.a m17208q() {
        try {
            RecyclerView recyclerView = this.f14367d;
            if (recyclerView != null) {
                return (C7033c9.a) recyclerView.m9900t0(0);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: s */
    public int m17209s(C32123ta c32123ta) {
        C7033c9 c7033c9 = this.f14394l;
        if (c7033c9 != null) {
            return c7033c9.m35941N(c32123ta);
        }
        return -1;
    }

    /* renamed from: t */
    public void m17210t() {
        C7033c9 c7033c9 = this.f14394l;
        if (c7033c9 != null) {
            c7033c9.m35942Q();
        }
    }

    /* renamed from: u */
    public void m17211u(String str) {
        C7033c9 c7033c9 = this.f14394l;
        if (c7033c9 != null) {
            c7033c9.m35945T(str);
        }
    }

    /* renamed from: v */
    public void m17212v(FeedRecyclerView.InterfaceC8863b interfaceC8863b) {
        RecyclerView recyclerView = this.f14367d;
        if (recyclerView instanceof FeedRecyclerView) {
            ((FeedRecyclerView) recyclerView).setCatchTouchEventListener(interfaceC8863b);
        }
    }
}

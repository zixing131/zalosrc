package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import bo.C3000l0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import p354n3.C23528a;

/* loaded from: classes4.dex */
public abstract class FeedItemSuggestBaseModulesView extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    C8323l1 f44753f0;

    /* renamed from: g0 */
    protected int f44754g0;

    /* renamed from: h0 */
    protected C23528a f44755h0;

    /* renamed from: i0 */
    protected C3000l0 f44756i0;

    /* renamed from: j0 */
    protected C8393t4 f44757j0;

    public FeedItemSuggestBaseModulesView(Context context) {
        super(context);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        try {
            this.f44755h0 = new C23528a(context);
            this.f44754g0 = i11;
            if (i11 == 4) {
                setFeedItemFooterVisibility(8);
                setLayoutSuggestHeaderVisibility(8);
                setLayoutSuggestFeedHeaderTagVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setAdsLocationVisibility(int i11) {
        C16716d c16716d;
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null && (c16716d = c8393t4.f45736X0) != null) {
            c16716d.mo44614b1(i11);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setFeedContent(C3000l0 c3000l0) {
        this.f44756i0 = c3000l0;
    }

    public void setFeedItemFooterVisibility(int i11) {
        C8323l1 c8323l1 = this.f44753f0;
        if (c8323l1 != null) {
            c8323l1.mo44614b1(i11);
        }
    }

    public void setLayoutSuggestFeedHeaderTagVisibility(int i11) {
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null) {
            c8393t4.m44883q1(i11);
        }
    }

    public void setLayoutSuggestHeaderVisibility(int i11) {
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null) {
            c8393t4.m44884r1(i11);
        }
    }

    public void setOnFeedMenuClickListener(View.OnClickListener onClickListener) {
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null) {
            c8393t4.m44886t1(onClickListener);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOnFooterClickListener(C16719g.c cVar) {
        C8323l1 c8323l1 = this.f44753f0;
        if (c8323l1 != null) {
            c8323l1.mo89109M0(cVar);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOnProfileClickListener(C16719g.c cVar) {
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null) {
            c8393t4.m44887u1(cVar);
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOnRecentlyLikeClickListener(C16719g.c cVar) {
        C8323l1 c8323l1 = this.f44753f0;
        if (c8323l1 != null) {
            c8323l1.m44771X1(cVar);
        }
    }

    public void setOnSuggestLocationClickListener(C16719g.c cVar) {
        C8393t4 c8393t4 = this.f44757j0;
        if (c8393t4 != null) {
            c8393t4.m44888v1(cVar);
        }
    }

    public FeedItemSuggestBaseModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

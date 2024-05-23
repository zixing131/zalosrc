package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.stickerpanel.TrendingGifView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f4 */
/* loaded from: classes3.dex */
public final class C29796f4 implements InterfaceC22715a {

    /* renamed from: p */
    private final TrendingGifView f137736p;

    /* renamed from: q */
    public final TrendingGifView f137737q;

    private C29796f4(TrendingGifView trendingGifView, TrendingGifView trendingGifView2) {
        this.f137736p = trendingGifView;
        this.f137737q = trendingGifView2;
    }

    /* renamed from: a */
    public static C29796f4 m147933a(View view) {
        if (view != null) {
            TrendingGifView trendingGifView = (TrendingGifView) view;
            return new C29796f4(trendingGifView, trendingGifView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29796f4 m147934c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.gif_grid_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147933a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TrendingGifView getRoot() {
        return this.f137736p;
    }
}

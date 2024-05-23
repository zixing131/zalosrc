package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.mediastore.common.MediaStoreMediaHeaderView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v5 */
/* loaded from: classes3.dex */
public final class C30081v5 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139656p;

    /* renamed from: q */
    public final MultiStateView f139657q;

    /* renamed from: r */
    public final RecyclerView f139658r;

    /* renamed from: s */
    public final MediaStoreMediaHeaderView f139659s;

    private C30081v5(RelativeLayout relativeLayout, MultiStateView multiStateView, RecyclerView recyclerView, MediaStoreMediaHeaderView mediaStoreMediaHeaderView) {
        this.f139656p = relativeLayout;
        this.f139657q = multiStateView;
        this.f139658r = recyclerView;
        this.f139659s = mediaStoreMediaHeaderView;
    }

    /* renamed from: a */
    public static C30081v5 m148607a(View view) {
        int i11 = AbstractC6918a0.multi_state;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.recycler_view;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.sticky_header_container;
                MediaStoreMediaHeaderView mediaStoreMediaHeaderView = (MediaStoreMediaHeaderView) AbstractC22716b.m117526a(view, i11);
                if (mediaStoreMediaHeaderView != null) {
                    return new C30081v5((RelativeLayout) view, multiStateView, recyclerView, mediaStoreMediaHeaderView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30081v5 m148608c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_media_store_page, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148607a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f139656p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.SearchField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.cb */
/* loaded from: classes3.dex */
public final class C29749cb implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137426p;

    /* renamed from: q */
    public final MultiStateView f137427q;

    /* renamed from: r */
    public final RecyclerView f137428r;

    /* renamed from: s */
    public final SearchField f137429s;

    /* renamed from: t */
    public final ZdsActionBar f137430t;

    private C29749cb(LinearLayout linearLayout, MultiStateView multiStateView, RecyclerView recyclerView, SearchField searchField, ZdsActionBar zdsActionBar) {
        this.f137426p = linearLayout;
        this.f137427q = multiStateView;
        this.f137428r = recyclerView;
        this.f137429s = searchField;
        this.f137430t = zdsActionBar;
    }

    /* renamed from: a */
    public static C29749cb m147816a(View view) {
        int i11 = AbstractC6918a0.multi_state;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.rvCountry;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.searchField;
                SearchField searchField = (SearchField) AbstractC22716b.m117526a(view, i11);
                if (searchField != null) {
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C29749cb((LinearLayout) view, multiStateView, recyclerView, searchField, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29749cb m147817c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.select_country_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147816a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137426p;
    }
}

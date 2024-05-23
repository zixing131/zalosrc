package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x9 */
/* loaded from: classes3.dex */
public final class C30119x9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139926p;

    /* renamed from: q */
    public final RobotoTextView f139927q;

    /* renamed from: r */
    public final RelativeLayout f139928r;

    /* renamed from: s */
    public final RelativeLayout f139929s;

    /* renamed from: t */
    public final RecyclingImageView f139930t;

    /* renamed from: u */
    public final FeedRecyclerView f139931u;

    /* renamed from: v */
    public final RobotoTextView f139932v;

    private C30119x9(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclingImageView recyclingImageView, FeedRecyclerView feedRecyclerView, RobotoTextView robotoTextView2) {
        this.f139926p = relativeLayout;
        this.f139927q = robotoTextView;
        this.f139928r = relativeLayout2;
        this.f139929s = relativeLayout3;
        this.f139930t = recyclingImageView;
        this.f139931u = feedRecyclerView;
        this.f139932v = robotoTextView2;
    }

    /* renamed from: a */
    public static C30119x9 m148695a(View view) {
        int i11 = AbstractC6918a0.btnAction;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.content;
            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout != null) {
                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                i11 = AbstractC6918a0.icn_close;
                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView != null) {
                    i11 = AbstractC6918a0.recyclerView;
                    FeedRecyclerView feedRecyclerView = (FeedRecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (feedRecyclerView != null) {
                        i11 = AbstractC6918a0.title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C30119x9(relativeLayout2, robotoTextView, relativeLayout, relativeLayout2, recyclingImageView, feedRecyclerView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30119x9 m148696c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_theme_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148695a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139926p;
    }
}

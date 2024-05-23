package q10;

import android.view.View;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionItem;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.FollowSuggestionVideoLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.p */
/* loaded from: classes5.dex */
public final class C25041p implements InterfaceC22715a {

    /* renamed from: p */
    private final FollowSuggestionItem f120169p;

    /* renamed from: q */
    public final OverScrollableRecyclerView f120170q;

    /* renamed from: r */
    public final FollowSuggestionVideoLayout f120171r;

    /* renamed from: s */
    public final SimpleShadowTextView f120172s;

    /* renamed from: t */
    public final SimpleShadowTextView f120173t;

    private C25041p(FollowSuggestionItem followSuggestionItem, OverScrollableRecyclerView overScrollableRecyclerView, FollowSuggestionVideoLayout followSuggestionVideoLayout, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2) {
        this.f120169p = followSuggestionItem;
        this.f120170q = overScrollableRecyclerView;
        this.f120171r = followSuggestionVideoLayout;
        this.f120172s = simpleShadowTextView;
        this.f120173t = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25041p m129911a(View view) {
        int i11 = AbstractC27409d.lstChannel;
        OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
        if (overScrollableRecyclerView != null) {
            i11 = AbstractC27409d.lytVideo;
            FollowSuggestionVideoLayout followSuggestionVideoLayout = (FollowSuggestionVideoLayout) AbstractC22716b.m117526a(view, i11);
            if (followSuggestionVideoLayout != null) {
                i11 = AbstractC27409d.txtMessage;
                SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView != null) {
                    i11 = AbstractC27409d.txtTitle;
                    SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                    if (simpleShadowTextView2 != null) {
                        return new C25041p((FollowSuggestionItem) view, overScrollableRecyclerView, followSuggestionVideoLayout, simpleShadowTextView, simpleShadowTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public FollowSuggestionItem getRoot() {
        return this.f120169p;
    }
}

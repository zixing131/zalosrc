package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.snaper.LivestreamVideoLayout;
import com.zing.zalo.shortvideo.p072ui.view.LivestreamPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.e2 */
/* loaded from: classes5.dex */
public final class C25002e2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LivestreamPageLayout f119886p;

    /* renamed from: q */
    public final CommentBox f119887q;

    /* renamed from: r */
    public final OverScrollableRecyclerView f119888r;

    /* renamed from: s */
    public final FrameLayout f119889s;

    /* renamed from: t */
    public final LoadingLayout f119890t;

    /* renamed from: u */
    public final LivestreamPageLayout f119891u;

    /* renamed from: v */
    public final LivestreamVideoLayout f119892v;

    private C25002e2(LivestreamPageLayout livestreamPageLayout, CommentBox commentBox, OverScrollableRecyclerView overScrollableRecyclerView, FrameLayout frameLayout, LoadingLayout loadingLayout, LivestreamPageLayout livestreamPageLayout2, LivestreamVideoLayout livestreamVideoLayout) {
        this.f119886p = livestreamPageLayout;
        this.f119887q = commentBox;
        this.f119888r = overScrollableRecyclerView;
        this.f119889s = frameLayout;
        this.f119890t = loadingLayout;
        this.f119891u = livestreamPageLayout2;
        this.f119892v = livestreamVideoLayout;
    }

    /* renamed from: a */
    public static C25002e2 m129801a(View view) {
        int i11 = AbstractC27409d.boxComment;
        CommentBox commentBox = (CommentBox) AbstractC22716b.m117526a(view, i11);
        if (commentBox != null) {
            i11 = AbstractC27409d.lstVideo;
            OverScrollableRecyclerView overScrollableRecyclerView = (OverScrollableRecyclerView) AbstractC22716b.m117526a(view, i11);
            if (overScrollableRecyclerView != null) {
                i11 = AbstractC27409d.lytContent;
                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout != null) {
                    i11 = AbstractC27409d.lytLoading;
                    LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                    if (loadingLayout != null) {
                        LivestreamPageLayout livestreamPageLayout = (LivestreamPageLayout) view;
                        i11 = AbstractC27409d.lytVideo;
                        LivestreamVideoLayout livestreamVideoLayout = (LivestreamVideoLayout) AbstractC22716b.m117526a(view, i11);
                        if (livestreamVideoLayout != null) {
                            return new C25002e2(livestreamPageLayout, commentBox, overScrollableRecyclerView, frameLayout, loadingLayout, livestreamPageLayout, livestreamVideoLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25002e2 m129802c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_livestream, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129801a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LivestreamPageLayout getRoot() {
        return this.f119886p;
    }
}

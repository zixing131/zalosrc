package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.view.CommentLayout;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.ListClickableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.c1 */
/* loaded from: classes5.dex */
public final class C24993c1 implements InterfaceC22715a {

    /* renamed from: p */
    private final CommentLayout f119808p;

    /* renamed from: q */
    public final CommentBox f119809q;

    /* renamed from: r */
    public final View f119810r;

    /* renamed from: s */
    public final FrameLayout f119811s;

    /* renamed from: t */
    public final ListClickableRecyclerView f119812t;

    /* renamed from: u */
    public final CommentLayout f119813u;

    /* renamed from: v */
    public final LoadingLayout f119814v;

    /* renamed from: w */
    public final SimpleShadowTextView f119815w;

    private C24993c1(CommentLayout commentLayout, CommentBox commentBox, View view, FrameLayout frameLayout, ListClickableRecyclerView listClickableRecyclerView, CommentLayout commentLayout2, LoadingLayout loadingLayout, SimpleShadowTextView simpleShadowTextView) {
        this.f119808p = commentLayout;
        this.f119809q = commentBox;
        this.f119810r = view;
        this.f119811s = frameLayout;
        this.f119812t = listClickableRecyclerView;
        this.f119813u = commentLayout2;
        this.f119814v = loadingLayout;
        this.f119815w = simpleShadowTextView;
    }

    /* renamed from: a */
    public static C24993c1 m129775a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.boxComment;
        CommentBox commentBox = (CommentBox) AbstractC22716b.m117526a(view, i11);
        if (commentBox != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dimContent))) != null) {
            i11 = AbstractC27409d.flComment;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC27409d.lstComment;
                ListClickableRecyclerView listClickableRecyclerView = (ListClickableRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (listClickableRecyclerView != null) {
                    CommentLayout commentLayout = (CommentLayout) view;
                    i11 = AbstractC27409d.lytLoading;
                    LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                    if (loadingLayout != null) {
                        i11 = AbstractC27409d.txtTitle;
                        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView != null) {
                            return new C24993c1(commentLayout, commentBox, m117526a, frameLayout, listClickableRecyclerView, commentLayout, loadingLayout, simpleShadowTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24993c1 m129776c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_comment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129775a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public CommentLayout getRoot() {
        return this.f119808p;
    }
}

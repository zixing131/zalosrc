package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.suggestcomment.SuggestCommentView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ud */
/* loaded from: classes3.dex */
public final class C30072ud implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139602p;

    /* renamed from: q */
    public final RecyclingImageView f139603q;

    /* renamed from: r */
    public final RelativeLayout f139604r;

    /* renamed from: s */
    public final SuggestCommentView f139605s;

    private C30072ud(FrameLayout frameLayout, RecyclingImageView recyclingImageView, RelativeLayout relativeLayout, SuggestCommentView suggestCommentView) {
        this.f139602p = frameLayout;
        this.f139603q = recyclingImageView;
        this.f139604r = relativeLayout;
        this.f139605s = suggestCommentView;
    }

    /* renamed from: a */
    public static C30072ud m148588a(View view) {
        int i11 = AbstractC6918a0.btn_comment_icon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.btn_comment_mini;
            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout != null) {
                i11 = AbstractC6918a0.comment_bar;
                SuggestCommentView suggestCommentView = (SuggestCommentView) AbstractC22716b.m117526a(view, i11);
                if (suggestCommentView != null) {
                    return new C30072ud((FrameLayout) view, recyclingImageView, relativeLayout, suggestCommentView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30072ud m148589c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.timeline_feed_comment_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148588a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139602p;
    }
}

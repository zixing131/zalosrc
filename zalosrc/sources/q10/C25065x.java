package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LiveCommentItemView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.FitUsernameTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.x */
/* loaded from: classes5.dex */
public final class C25065x implements InterfaceC22715a {

    /* renamed from: p */
    private final LiveCommentItemView f120402p;

    /* renamed from: q */
    public final AvatarImageView f120403q;

    /* renamed from: r */
    public final SimpleShadowTextView f120404r;

    /* renamed from: s */
    public final SimpleShadowTextView f120405s;

    /* renamed from: t */
    public final FitUsernameTextView f120406t;

    private C25065x(LiveCommentItemView liveCommentItemView, AvatarImageView avatarImageView, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, FitUsernameTextView fitUsernameTextView) {
        this.f120402p = liveCommentItemView;
        this.f120403q = avatarImageView;
        this.f120404r = simpleShadowTextView;
        this.f120405s = simpleShadowTextView2;
        this.f120406t = fitUsernameTextView;
    }

    /* renamed from: a */
    public static C25065x m129968a(View view) {
        int i11 = AbstractC27409d.aivAvatar;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.tagAuthor;
            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView != null) {
                i11 = AbstractC27409d.txtContent;
                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView2 != null) {
                    i11 = AbstractC27409d.txtName;
                    FitUsernameTextView fitUsernameTextView = (FitUsernameTextView) AbstractC22716b.m117526a(view, i11);
                    if (fitUsernameTextView != null) {
                        return new C25065x((LiveCommentItemView) view, avatarImageView, simpleShadowTextView, simpleShadowTextView2, fitUsernameTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25065x m129969c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_livestream_comment, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129968a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LiveCommentItemView getRoot() {
        return this.f120402p;
    }
}

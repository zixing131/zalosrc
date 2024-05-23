package q10;

import android.view.View;
import android.widget.ImageView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.HashTagVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.RoundedImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.t */
/* loaded from: classes5.dex */
public final class C25053t implements InterfaceC22715a {

    /* renamed from: p */
    private final HashTagVideoItem f120283p;

    /* renamed from: q */
    public final AvatarImageView f120284q;

    /* renamed from: r */
    public final ImageView f120285r;

    /* renamed from: s */
    public final RoundedImageView f120286s;

    /* renamed from: t */
    public final EllipsizedTextView f120287t;

    /* renamed from: u */
    public final UsernameTextView f120288u;

    /* renamed from: v */
    public final SimpleShadowTextView f120289v;

    /* renamed from: w */
    public final View f120290w;

    /* renamed from: x */
    public final SimpleShadowTextView f120291x;

    private C25053t(HashTagVideoItem hashTagVideoItem, AvatarImageView avatarImageView, ImageView imageView, RoundedImageView roundedImageView, EllipsizedTextView ellipsizedTextView, UsernameTextView usernameTextView, SimpleShadowTextView simpleShadowTextView, View view, SimpleShadowTextView simpleShadowTextView2) {
        this.f120283p = hashTagVideoItem;
        this.f120284q = avatarImageView;
        this.f120285r = imageView;
        this.f120286s = roundedImageView;
        this.f120287t = ellipsizedTextView;
        this.f120288u = usernameTextView;
        this.f120289v = simpleShadowTextView;
        this.f120290w = view;
        this.f120291x = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25053t m129936a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.avatarUser;
        AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
        if (avatarImageView != null) {
            i11 = AbstractC27409d.icoStatus;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.ivCover;
                RoundedImageView roundedImageView = (RoundedImageView) AbstractC22716b.m117526a(view, i11);
                if (roundedImageView != null) {
                    i11 = AbstractC27409d.tvDes;
                    EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                    if (ellipsizedTextView != null) {
                        i11 = AbstractC27409d.tvNameUser;
                        UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                        if (usernameTextView != null) {
                            i11 = AbstractC27409d.tvViewCount;
                            SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                            if (simpleShadowTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.vieOverlay))) != null) {
                                i11 = AbstractC27409d.vieStatus;
                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView2 != null) {
                                    return new C25053t((HashTagVideoItem) view, avatarImageView, imageView, roundedImageView, ellipsizedTextView, usernameTextView, simpleShadowTextView, m117526a, simpleShadowTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public HashTagVideoItem getRoot() {
        return this.f120283p;
    }
}

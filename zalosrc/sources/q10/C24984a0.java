package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.UsernameTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.a0 */
/* loaded from: classes5.dex */
public final class C24984a0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f119710p;

    /* renamed from: q */
    public final RobotoButton f119711q;

    /* renamed from: r */
    public final AvatarImageView f119712r;

    /* renamed from: s */
    public final EllipsizedTextView f119713s;

    /* renamed from: t */
    public final UsernameTextView f119714t;

    /* renamed from: u */
    public final EllipsizedTextView f119715u;

    private C24984a0(LinearLayout linearLayout, RobotoButton robotoButton, AvatarImageView avatarImageView, EllipsizedTextView ellipsizedTextView, UsernameTextView usernameTextView, EllipsizedTextView ellipsizedTextView2) {
        this.f119710p = linearLayout;
        this.f119711q = robotoButton;
        this.f119712r = avatarImageView;
        this.f119713s = ellipsizedTextView;
        this.f119714t = usernameTextView;
        this.f119715u = ellipsizedTextView2;
    }

    /* renamed from: a */
    public static C24984a0 m129750a(View view) {
        int i11 = AbstractC27409d.btnFollow;
        RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
        if (robotoButton != null) {
            i11 = AbstractC27409d.ivAvatar;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                i11 = AbstractC27409d.tvAlias;
                EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                if (ellipsizedTextView != null) {
                    i11 = AbstractC27409d.tvName;
                    UsernameTextView usernameTextView = (UsernameTextView) AbstractC22716b.m117526a(view, i11);
                    if (usernameTextView != null) {
                        i11 = AbstractC27409d.tvStat;
                        EllipsizedTextView ellipsizedTextView2 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                        if (ellipsizedTextView2 != null) {
                            return new C24984a0((LinearLayout) view, robotoButton, avatarImageView, ellipsizedTextView, usernameTextView, ellipsizedTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24984a0 m129751c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_search_channel, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129750a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f119710p;
    }
}

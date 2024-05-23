package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j6 */
/* loaded from: classes3.dex */
public final class C29870j6 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138269p;

    /* renamed from: q */
    public final RobotoTextView f138270q;

    /* renamed from: r */
    public final AvatarImageView f138271r;

    /* renamed from: s */
    public final FrameLayout f138272s;

    /* renamed from: t */
    public final View f138273t;

    private C29870j6(FrameLayout frameLayout, RobotoTextView robotoTextView, AvatarImageView avatarImageView, FrameLayout frameLayout2, View view) {
        this.f138269p = frameLayout;
        this.f138270q = robotoTextView;
        this.f138271r = avatarImageView;
        this.f138272s = frameLayout2;
        this.f138273t = view;
    }

    /* renamed from: a */
    public static C29870j6 m148115a(View view) {
        int i11 = AbstractC6918a0.btnGoToUpdateProfile;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.buddy_dp;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = AbstractC6918a0.sep_layoutNeedToUpdateProfile;
                View m117526a = AbstractC22716b.m117526a(view, i11);
                if (m117526a != null) {
                    return new C29870j6(frameLayout, robotoTextView, avatarImageView, frameLayout, m117526a);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29870j6 m148116c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_need_to_update_profile, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148115a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138269p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.xa */
/* loaded from: classes3.dex */
public final class C30120xa implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139933p;

    /* renamed from: q */
    public final FrameLayout f139934q;

    /* renamed from: r */
    public final ZAppCompatImageView f139935r;

    /* renamed from: s */
    public final AvatarImageView f139936s;

    /* renamed from: t */
    public final AvatarImageView f139937t;

    /* renamed from: u */
    public final AvatarImageView f139938u;

    /* renamed from: v */
    public final View f139939v;

    /* renamed from: w */
    public final RobotoTextView f139940w;

    private C30120xa(LinearLayout linearLayout, FrameLayout frameLayout, ZAppCompatImageView zAppCompatImageView, AvatarImageView avatarImageView, AvatarImageView avatarImageView2, AvatarImageView avatarImageView3, View view, RobotoTextView robotoTextView) {
        this.f139933p = linearLayout;
        this.f139934q = frameLayout;
        this.f139935r = zAppCompatImageView;
        this.f139936s = avatarImageView;
        this.f139937t = avatarImageView2;
        this.f139938u = avatarImageView3;
        this.f139939v = view;
        this.f139940w = robotoTextView;
    }

    /* renamed from: a */
    public static C30120xa m148698a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.fl_mini_avatar;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.ic_birthday_hub;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.img_avt_1;
                AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                if (avatarImageView != null) {
                    i11 = AbstractC6918a0.img_avt_2;
                    AvatarImageView avatarImageView2 = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                    if (avatarImageView2 != null) {
                        i11 = AbstractC6918a0.img_avt_3;
                        AvatarImageView avatarImageView3 = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                        if (avatarImageView3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.reddot))) != null) {
                            i11 = AbstractC6918a0.tv_cnt_see_more_avt;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                return new C30120xa((LinearLayout) view, frameLayout, zAppCompatImageView, avatarImageView, avatarImageView2, avatarImageView3, m117526a, robotoTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30120xa m148699c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.row_birthday_hub_friend_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148698a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139933p;
    }
}

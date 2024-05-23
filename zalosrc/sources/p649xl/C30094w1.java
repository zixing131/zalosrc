package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w1 */
/* loaded from: classes3.dex */
public final class C30094w1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139749p;

    /* renamed from: q */
    public final AppCompatImageView f139750q;

    /* renamed from: r */
    public final RobotoTextView f139751r;

    /* renamed from: s */
    public final GroupAvatarView f139752s;

    /* renamed from: t */
    public final RobotoTextView f139753t;

    /* renamed from: u */
    public final RelativeLayout f139754u;

    /* renamed from: v */
    public final LinearLayout f139755v;

    /* renamed from: w */
    public final AppCompatImageView f139756w;

    /* renamed from: x */
    public final AppCompatImageView f139757x;

    /* renamed from: y */
    public final FrameLayout f139758y;

    /* renamed from: z */
    public final C29922m4 f139759z;

    private C30094w1(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, GroupAvatarView groupAvatarView, RobotoTextView robotoTextView2, RelativeLayout relativeLayout2, LinearLayout linearLayout, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, FrameLayout frameLayout, C29922m4 c29922m4) {
        this.f139749p = relativeLayout;
        this.f139750q = appCompatImageView;
        this.f139751r = robotoTextView;
        this.f139752s = groupAvatarView;
        this.f139753t = robotoTextView2;
        this.f139754u = relativeLayout2;
        this.f139755v = linearLayout;
        this.f139756w = appCompatImageView2;
        this.f139757x = appCompatImageView3;
        this.f139758y = frameLayout;
        this.f139759z = c29922m4;
    }

    /* renamed from: a */
    public static C30094w1 m148636a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_retry_upload_avatar;
        AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (appCompatImageView != null) {
            i11 = AbstractC6918a0.chat_contact_desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.chat_contact_image;
                GroupAvatarView groupAvatarView = (GroupAvatarView) AbstractC22716b.m117526a(view, i11);
                if (groupAvatarView != null) {
                    i11 = AbstractC6918a0.chat_contact_name;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i11 = AbstractC6918a0.group_name_container;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.ic_change_avatar;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (appCompatImageView2 != null) {
                                i11 = AbstractC6918a0.ic_VipStatus;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                if (appCompatImageView3 != null) {
                                    i11 = AbstractC6918a0.layout_avatar;
                                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                    if (frameLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.pb_upload_avatar))) != null) {
                                        return new C30094w1(relativeLayout, appCompatImageView, robotoTextView, groupAvatarView, robotoTextView2, relativeLayout, linearLayout, appCompatImageView2, appCompatImageView3, frameLayout, C29922m4.m148235a(m117526a));
                                    }
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
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139749p;
    }
}

package q10;

import android.view.View;
import android.widget.ImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.widget.EditProfileLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.e1 */
/* loaded from: classes5.dex */
public final class C25001e1 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f119869A;

    /* renamed from: B */
    public final EllipsizedTextView f119870B;

    /* renamed from: C */
    public final RobotoTextView f119871C;

    /* renamed from: D */
    public final EllipsizedTextView f119872D;

    /* renamed from: E */
    public final EllipsizedTextView f119873E;

    /* renamed from: F */
    public final RobotoTextView f119874F;

    /* renamed from: p */
    private final EditProfileLayout f119875p;

    /* renamed from: q */
    public final View f119876q;

    /* renamed from: r */
    public final View f119877r;

    /* renamed from: s */
    public final AvatarImageView f119878s;

    /* renamed from: t */
    public final ImageView f119879t;

    /* renamed from: u */
    public final ImageView f119880u;

    /* renamed from: v */
    public final ImageView f119881v;

    /* renamed from: w */
    public final ImageView f119882w;

    /* renamed from: x */
    public final ImageView f119883x;

    /* renamed from: y */
    public final View f119884y;

    /* renamed from: z */
    public final EllipsizedTextView f119885z;

    private C25001e1(EditProfileLayout editProfileLayout, View view, View view2, AvatarImageView avatarImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, View view3, EllipsizedTextView ellipsizedTextView, RobotoTextView robotoTextView, EllipsizedTextView ellipsizedTextView2, RobotoTextView robotoTextView2, EllipsizedTextView ellipsizedTextView3, EllipsizedTextView ellipsizedTextView4, RobotoTextView robotoTextView3) {
        this.f119875p = editProfileLayout;
        this.f119876q = view;
        this.f119877r = view2;
        this.f119878s = avatarImageView;
        this.f119879t = imageView;
        this.f119880u = imageView2;
        this.f119881v = imageView3;
        this.f119882w = imageView4;
        this.f119883x = imageView5;
        this.f119884y = view3;
        this.f119885z = ellipsizedTextView;
        this.f119869A = robotoTextView;
        this.f119870B = ellipsizedTextView2;
        this.f119871C = robotoTextView2;
        this.f119872D = ellipsizedTextView3;
        this.f119873E = ellipsizedTextView4;
        this.f119874F = robotoTextView3;
    }

    /* renamed from: a */
    public static C25001e1 m129799a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC27409d.dividerID;
        View m117526a3 = AbstractC22716b.m117526a(view, i11);
        if (m117526a3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dividerName))) != null) {
            i11 = AbstractC27409d.ivAvatar;
            AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
            if (avatarImageView != null) {
                i11 = AbstractC27409d.ivCamera;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC27409d.ivCopy;
                    ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView2 != null) {
                        i11 = AbstractC27409d.ivEditID;
                        ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView3 != null) {
                            i11 = AbstractC27409d.ivEditName;
                            ImageView imageView4 = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView4 != null) {
                                i11 = AbstractC27409d.ivEdtBio;
                                ImageView imageView5 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView5 != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.overlay))) != null) {
                                    i11 = AbstractC27409d.tvBio;
                                    EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                    if (ellipsizedTextView != null) {
                                        i11 = AbstractC27409d.tvBioTitle;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            i11 = AbstractC27409d.tvChannelName;
                                            EllipsizedTextView ellipsizedTextView2 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                            if (ellipsizedTextView2 != null) {
                                                i11 = AbstractC27409d.tvChannelNameTitle;
                                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView2 != null) {
                                                    i11 = AbstractC27409d.tvID;
                                                    EllipsizedTextView ellipsizedTextView3 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (ellipsizedTextView3 != null) {
                                                        i11 = AbstractC27409d.tvIDFull;
                                                        EllipsizedTextView ellipsizedTextView4 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (ellipsizedTextView4 != null) {
                                                            i11 = AbstractC27409d.tvIdTitle;
                                                            RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView3 != null) {
                                                                return new C25001e1((EditProfileLayout) view, m117526a3, m117526a, avatarImageView, imageView, imageView2, imageView3, imageView4, imageView5, m117526a2, ellipsizedTextView, robotoTextView, ellipsizedTextView2, robotoTextView2, ellipsizedTextView3, ellipsizedTextView4, robotoTextView3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    /* renamed from: b */
    public EditProfileLayout getRoot() {
        return this.f119875p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.aa */
/* loaded from: classes3.dex */
public final class C29712aa implements InterfaceC22715a {

    /* renamed from: A */
    public final RelativeLayout f137231A;

    /* renamed from: B */
    public final RobotoTextView f137232B;

    /* renamed from: C */
    public final RobotoTextView f137233C;

    /* renamed from: p */
    private final RelativeLayout f137234p;

    /* renamed from: q */
    public final LinearLayout f137235q;

    /* renamed from: r */
    public final FrameLayout f137236r;

    /* renamed from: s */
    public final RobotoTextView f137237s;

    /* renamed from: t */
    public final RobotoTextView f137238t;

    /* renamed from: u */
    public final ImageView f137239u;

    /* renamed from: v */
    public final ImageView f137240v;

    /* renamed from: w */
    public final LinearLayout f137241w;

    /* renamed from: x */
    public final RelativeLayout f137242x;

    /* renamed from: y */
    public final RelativeLayout f137243y;

    /* renamed from: z */
    public final LinearLayout f137244z;

    private C29712aa(RelativeLayout relativeLayout, LinearLayout linearLayout, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, LinearLayout linearLayout3, RelativeLayout relativeLayout4, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f137234p = relativeLayout;
        this.f137235q = linearLayout;
        this.f137236r = frameLayout;
        this.f137237s = robotoTextView;
        this.f137238t = robotoTextView2;
        this.f137239u = imageView;
        this.f137240v = imageView2;
        this.f137241w = linearLayout2;
        this.f137242x = relativeLayout2;
        this.f137243y = relativeLayout3;
        this.f137244z = linearLayout3;
        this.f137231A = relativeLayout4;
        this.f137232B = robotoTextView3;
        this.f137233C = robotoTextView4;
    }

    /* renamed from: a */
    public static C29712aa m147728a(View view) {
        int i11 = AbstractC6918a0.bottom_sheet_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.bottom_sheet_header;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.desc_edit_album;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.desc_edit_privacy;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        i11 = AbstractC6918a0.icon_edit_album;
                        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView != null) {
                            i11 = AbstractC6918a0.icon_edit_privacy;
                            ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView2 != null) {
                                i11 = AbstractC6918a0.layout_delete_album;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = AbstractC6918a0.layout_edit_album;
                                    RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                    if (relativeLayout != null) {
                                        i11 = AbstractC6918a0.layout_edit_privacy;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                        if (relativeLayout2 != null) {
                                            i11 = AbstractC6918a0.layout_edit_theme;
                                            LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout3 != null) {
                                                RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                                i11 = AbstractC6918a0.text_edit_album;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.text_edit_privacy;
                                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView4 != null) {
                                                        return new C29712aa(relativeLayout3, linearLayout, frameLayout, robotoTextView, robotoTextView2, imageView, imageView2, linearLayout2, relativeLayout, relativeLayout2, linearLayout3, relativeLayout3, robotoTextView3, robotoTextView4);
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

    /* renamed from: c */
    public static C29712aa m147729c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_edit_album_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147728a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137234p;
    }
}

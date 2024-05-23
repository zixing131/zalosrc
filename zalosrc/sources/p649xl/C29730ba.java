package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.DynamicRatioFrameLayout;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Divider;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ba */
/* loaded from: classes3.dex */
public final class C29730ba implements InterfaceC22715a {

    /* renamed from: A */
    public final AspectRatioImageView f137330A;

    /* renamed from: B */
    public final LinearLayout f137331B;

    /* renamed from: C */
    public final RobotoTextView f137332C;

    /* renamed from: D */
    public final RobotoTextView f137333D;

    /* renamed from: E */
    public final RobotoTextView f137334E;

    /* renamed from: F */
    public final RobotoTextView f137335F;

    /* renamed from: p */
    private final RelativeLayout f137336p;

    /* renamed from: q */
    public final DynamicRatioFrameLayout f137337q;

    /* renamed from: r */
    public final RobotoTextView f137338r;

    /* renamed from: s */
    public final AspectRatioImageView f137339s;

    /* renamed from: t */
    public final AspectRatioImageView f137340t;

    /* renamed from: u */
    public final LinearLayout f137341u;

    /* renamed from: v */
    public final Divider f137342v;

    /* renamed from: w */
    public final RelativeLayout f137343w;

    /* renamed from: x */
    public final RobotoTextView f137344x;

    /* renamed from: y */
    public final LinearLayout f137345y;

    /* renamed from: z */
    public final AspectRatioImageView f137346z;

    private C29730ba(RelativeLayout relativeLayout, DynamicRatioFrameLayout dynamicRatioFrameLayout, RobotoTextView robotoTextView, AspectRatioImageView aspectRatioImageView, AspectRatioImageView aspectRatioImageView2, LinearLayout linearLayout, Divider divider, RelativeLayout relativeLayout2, RobotoTextView robotoTextView2, LinearLayout linearLayout2, AspectRatioImageView aspectRatioImageView3, AspectRatioImageView aspectRatioImageView4, LinearLayout linearLayout3, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6) {
        this.f137336p = relativeLayout;
        this.f137337q = dynamicRatioFrameLayout;
        this.f137338r = robotoTextView;
        this.f137339s = aspectRatioImageView;
        this.f137340t = aspectRatioImageView2;
        this.f137341u = linearLayout;
        this.f137342v = divider;
        this.f137343w = relativeLayout2;
        this.f137344x = robotoTextView2;
        this.f137345y = linearLayout2;
        this.f137346z = aspectRatioImageView3;
        this.f137330A = aspectRatioImageView4;
        this.f137331B = linearLayout3;
        this.f137332C = robotoTextView3;
        this.f137333D = robotoTextView4;
        this.f137334E = robotoTextView5;
        this.f137335F = robotoTextView6;
    }

    /* renamed from: a */
    public static C29730ba m147773a(View view) {
        int i11 = AbstractC6918a0.decor_container;
        DynamicRatioFrameLayout dynamicRatioFrameLayout = (DynamicRatioFrameLayout) AbstractC22716b.m117526a(view, i11);
        if (dynamicRatioFrameLayout != null) {
            i11 = AbstractC6918a0.desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.dot_sep;
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                if (aspectRatioImageView != null) {
                    i11 = AbstractC6918a0.icon_drop_down;
                    AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                    if (aspectRatioImageView2 != null) {
                        i11 = AbstractC6918a0.layout_detail;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.line_separator;
                            Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
                            if (divider != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i11 = AbstractC6918a0.number_photo;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.privacy_container;
                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout2 != null) {
                                        i11 = AbstractC6918a0.privacy_icon;
                                        AspectRatioImageView aspectRatioImageView3 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                                        if (aspectRatioImageView3 != null) {
                                            i11 = AbstractC6918a0.privacy_icon_top;
                                            AspectRatioImageView aspectRatioImageView4 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                                            if (aspectRatioImageView4 != null) {
                                                i11 = AbstractC6918a0.privacy_layout;
                                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout3 != null) {
                                                    i11 = AbstractC6918a0.privacy_text;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView3 != null) {
                                                        i11 = AbstractC6918a0.title;
                                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView4 != null) {
                                                            i11 = AbstractC6918a0.tv_privacy_info;
                                                            RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView5 != null) {
                                                                i11 = AbstractC6918a0.tv_privacy_info_top;
                                                                RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                if (robotoTextView6 != null) {
                                                                    return new C29730ba(relativeLayout, dynamicRatioFrameLayout, robotoTextView, aspectRatioImageView, aspectRatioImageView2, linearLayout, divider, relativeLayout, robotoTextView2, linearLayout2, aspectRatioImageView3, aspectRatioImageView4, linearLayout3, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29730ba m147774c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_header_album_detail, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147773a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137336p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.ChangeableHeightView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n7 */
/* loaded from: classes3.dex */
public final class C29943n7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138767p;

    /* renamed from: q */
    public final Button f138768q;

    /* renamed from: r */
    public final LinearLayout f138769r;

    /* renamed from: s */
    public final RelativeLayout f138770s;

    /* renamed from: t */
    public final AspectRatioImageView f138771t;

    /* renamed from: u */
    public final LinearLayout f138772u;

    /* renamed from: v */
    public final ChangeableHeightView f138773v;

    /* renamed from: w */
    public final ChangeableHeightView f138774w;

    /* renamed from: x */
    public final RobotoTextView f138775x;

    /* renamed from: y */
    public final RobotoTextView f138776y;

    private C29943n7(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, RelativeLayout relativeLayout, AspectRatioImageView aspectRatioImageView, LinearLayout linearLayout3, ChangeableHeightView changeableHeightView, ChangeableHeightView changeableHeightView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f138767p = linearLayout;
        this.f138768q = button;
        this.f138769r = linearLayout2;
        this.f138770s = relativeLayout;
        this.f138771t = aspectRatioImageView;
        this.f138772u = linearLayout3;
        this.f138773v = changeableHeightView;
        this.f138774w = changeableHeightView2;
        this.f138775x = robotoTextView;
        this.f138776y = robotoTextView2;
    }

    /* renamed from: a */
    public static C29943n7 m148278a(View view) {
        int i11 = AbstractC6918a0.buttonEmptyAction;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.content;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.extraViewContainer;
                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout != null) {
                    i11 = AbstractC6918a0.illustration;
                    AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                    if (aspectRatioImageView != null) {
                        LinearLayout linearLayout2 = (LinearLayout) view;
                        i11 = AbstractC6918a0.padding_view_bottom;
                        ChangeableHeightView changeableHeightView = (ChangeableHeightView) AbstractC22716b.m117526a(view, i11);
                        if (changeableHeightView != null) {
                            i11 = AbstractC6918a0.padding_view_top;
                            ChangeableHeightView changeableHeightView2 = (ChangeableHeightView) AbstractC22716b.m117526a(view, i11);
                            if (changeableHeightView2 != null) {
                                i11 = AbstractC6918a0.tv_recommend;
                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView != null) {
                                    i11 = AbstractC6918a0.tv_title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView2 != null) {
                                        return new C29943n7(linearLayout2, button, linearLayout, relativeLayout, aspectRatioImageView, linearLayout2, changeableHeightView, changeableHeightView2, robotoTextView, robotoTextView2);
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
    public static C29943n7 m148279c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_timeline_empty_content_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148278a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138767p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x1 */
/* loaded from: classes3.dex */
public final class C30111x1 implements InterfaceC22715a {

    /* renamed from: p */
    private final ScrollView f139865p;

    /* renamed from: q */
    public final Button f139866q;

    /* renamed from: r */
    public final Button f139867r;

    /* renamed from: s */
    public final ZAppCompatImageView f139868s;

    /* renamed from: t */
    public final LinearLayout f139869t;

    /* renamed from: u */
    public final ScrollView f139870u;

    /* renamed from: v */
    public final RobotoTextView f139871v;

    /* renamed from: w */
    public final RobotoTextView f139872w;

    /* renamed from: x */
    public final RobotoTextView f139873x;

    /* renamed from: y */
    public final RobotoTextView f139874y;

    private C30111x1(ScrollView scrollView, Button button, Button button2, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout, ScrollView scrollView2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4) {
        this.f139865p = scrollView;
        this.f139866q = button;
        this.f139867r = button2;
        this.f139868s = zAppCompatImageView;
        this.f139869t = linearLayout;
        this.f139870u = scrollView2;
        this.f139871v = robotoTextView;
        this.f139872w = robotoTextView2;
        this.f139873x = robotoTextView3;
        this.f139874y = robotoTextView4;
    }

    /* renamed from: a */
    public static C30111x1 m148674a(View view) {
        int i11 = AbstractC6918a0.rolled_media_btn_primary;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.rolled_media_btn_tertiary;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.rolled_media_imv_illus;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.rolled_media_ll_hint_container;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        ScrollView scrollView = (ScrollView) view;
                        i11 = AbstractC6918a0.rolled_media_tv_hint_title;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.rolled_media_tv_learn_more;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.rolled_media_tv_message;
                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView3 != null) {
                                    i11 = AbstractC6918a0.rolled_media_tv_title;
                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView4 != null) {
                                        return new C30111x1(scrollView, button, button2, zAppCompatImageView, linearLayout, scrollView, robotoTextView, robotoTextView2, robotoTextView3, robotoTextView4);
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
    public static C30111x1 m148675c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.chat_rolled_media_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148674a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f139865p;
    }
}

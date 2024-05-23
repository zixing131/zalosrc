package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.e1 */
/* loaded from: classes3.dex */
public final class C29775e1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137628p;

    /* renamed from: q */
    public final ZAppCompatImageView f137629q;

    /* renamed from: r */
    public final ZAppCompatImageView f137630r;

    /* renamed from: s */
    public final ListItemSetting f137631s;

    /* renamed from: t */
    public final LinearLayout f137632t;

    /* renamed from: u */
    public final LinearLayout f137633u;

    /* renamed from: v */
    public final RobotoTextView f137634v;

    /* renamed from: w */
    public final RobotoTextView f137635w;

    private C29775e1(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, ZAppCompatImageView zAppCompatImageView2, ListItemSetting listItemSetting, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f137628p = linearLayout;
        this.f137629q = zAppCompatImageView;
        this.f137630r = zAppCompatImageView2;
        this.f137631s = listItemSetting;
        this.f137632t = linearLayout2;
        this.f137633u = linearLayout3;
        this.f137634v = robotoTextView;
        this.f137635w = robotoTextView2;
    }

    /* renamed from: a */
    public static C29775e1 m147879a(View view) {
        int i11 = AbstractC6918a0.img_1;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.img_2;
            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView2 != null) {
                i11 = AbstractC6918a0.itemSetting;
                ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting != null) {
                    i11 = AbstractC6918a0.layout_img_1;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.layout_img_2;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC6918a0.tvHint1;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                i11 = AbstractC6918a0.tvHint2;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    return new C29775e1((LinearLayout) view, zAppCompatImageView, zAppCompatImageView2, listItemSetting, linearLayout, linearLayout2, robotoTextView, robotoTextView2);
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
    public static C29775e1 m147880c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_switch_setting_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147879a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137628p;
    }
}

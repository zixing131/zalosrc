package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.uicontrol.ViewPagerCustomSwipeable;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u8 */
/* loaded from: classes3.dex */
public final class C30067u8 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139566p;

    /* renamed from: q */
    public final CustomEditText f139567q;

    /* renamed from: r */
    public final LinearLayout f139568r;

    /* renamed from: s */
    public final ViewPagerCustomSwipeable f139569s;

    private C30067u8(LinearLayout linearLayout, CustomEditText customEditText, LinearLayout linearLayout2, ViewPagerCustomSwipeable viewPagerCustomSwipeable) {
        this.f139566p = linearLayout;
        this.f139567q = customEditText;
        this.f139568r = linearLayout2;
        this.f139569s = viewPagerCustomSwipeable;
    }

    /* renamed from: a */
    public static C30067u8 m148574a(View view) {
        int i11 = AbstractC6918a0.input_search;
        CustomEditText customEditText = (CustomEditText) AbstractC22716b.m117526a(view, i11);
        if (customEditText != null) {
            i11 = AbstractC6918a0.tab_layout;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.view_pager;
                ViewPagerCustomSwipeable viewPagerCustomSwipeable = (ViewPagerCustomSwipeable) AbstractC22716b.m117526a(view, i11);
                if (viewPagerCustomSwipeable != null) {
                    return new C30067u8((LinearLayout) view, customEditText, linearLayout, viewPagerCustomSwipeable);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30067u8 m148575c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.my_cloud_message_picker_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148574a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139566p;
    }
}

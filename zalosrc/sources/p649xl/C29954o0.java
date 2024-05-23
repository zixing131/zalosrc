package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o0 */
/* loaded from: classes3.dex */
public final class C29954o0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138841p;

    /* renamed from: q */
    public final ListItemSetting f138842q;

    /* renamed from: r */
    public final ListItemSetting f138843r;

    /* renamed from: s */
    public final ListItemSetting f138844s;

    /* renamed from: t */
    public final RobotoTextView f138845t;

    private C29954o0(LinearLayout linearLayout, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, RobotoTextView robotoTextView) {
        this.f138841p = linearLayout;
        this.f138842q = listItemSetting;
        this.f138843r = listItemSetting2;
        this.f138844s = listItemSetting3;
        this.f138845t = robotoTextView;
    }

    /* renamed from: a */
    public static C29954o0 m148298a(View view) {
        int i11 = AbstractC6918a0.itemSetting1;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemSetting2;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemSetting3;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.tvHint;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C29954o0((LinearLayout) view, listItemSetting, listItemSetting2, listItemSetting3, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29954o0 m148299c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_check_setting_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148298a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138841p;
    }
}

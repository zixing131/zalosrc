package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s0 */
/* loaded from: classes3.dex */
public final class C30025s0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139274p;

    /* renamed from: q */
    public final ListItemSetting f139275q;

    /* renamed from: r */
    public final ListItemSetting f139276r;

    /* renamed from: s */
    public final NestedScrollView f139277s;

    /* renamed from: t */
    public final RobotoTextView f139278t;

    private C30025s0(LinearLayout linearLayout, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, NestedScrollView nestedScrollView, RobotoTextView robotoTextView) {
        this.f139274p = linearLayout;
        this.f139275q = listItemSetting;
        this.f139276r = listItemSetting2;
        this.f139277s = nestedScrollView;
        this.f139278t = robotoTextView;
    }

    /* renamed from: a */
    public static C30025s0 m148467a(View view) {
        int i11 = AbstractC6918a0.itemEnglish;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemVietnamese;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.scrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                if (nestedScrollView != null) {
                    i11 = AbstractC6918a0.tvTitle;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        return new C30025s0((LinearLayout) view, listItemSetting, listItemSetting2, nestedScrollView, robotoTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30025s0 m148468c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_language_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148467a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139274p;
    }
}

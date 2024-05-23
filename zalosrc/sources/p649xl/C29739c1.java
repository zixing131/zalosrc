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

/* renamed from: xl.c1 */
/* loaded from: classes3.dex */
public final class C29739c1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137378p;

    /* renamed from: q */
    public final ListItemSetting f137379q;

    /* renamed from: r */
    public final ListItemSetting f137380r;

    /* renamed from: s */
    public final ListItemSetting f137381s;

    /* renamed from: t */
    public final NestedScrollView f137382t;

    /* renamed from: u */
    public final RobotoTextView f137383u;

    private C29739c1(LinearLayout linearLayout, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, NestedScrollView nestedScrollView, RobotoTextView robotoTextView) {
        this.f137378p = linearLayout;
        this.f137379q = listItemSetting;
        this.f137380r = listItemSetting2;
        this.f137381s = listItemSetting3;
        this.f137382t = nestedScrollView;
        this.f137383u = robotoTextView;
    }

    /* renamed from: a */
    public static C29739c1 m147794a(View view) {
        int i11 = AbstractC6918a0.itemDoNotDisclose;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemFemale;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemMale;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.scrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                    if (nestedScrollView != null) {
                        i11 = AbstractC6918a0.tvTitle;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            return new C29739c1((LinearLayout) view, listItemSetting, listItemSetting2, listItemSetting3, nestedScrollView, robotoTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29739c1 m147795c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_select_gender_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147794a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137378p;
    }
}

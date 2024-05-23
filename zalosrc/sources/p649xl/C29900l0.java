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
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l0 */
/* loaded from: classes3.dex */
public final class C29900l0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138533p;

    /* renamed from: q */
    public final Button f138534q;

    /* renamed from: r */
    public final ListItemSetting f138535r;

    /* renamed from: s */
    public final ListItemSetting f138536s;

    /* renamed from: t */
    public final ListItemSetting f138537t;

    /* renamed from: u */
    public final ListItemSetting f138538u;

    /* renamed from: v */
    public final ListItemSetting f138539v;

    /* renamed from: w */
    public final NestedScrollView f138540w;

    /* renamed from: x */
    public final RobotoTextView f138541x;

    private C29900l0(LinearLayout linearLayout, Button button, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, NestedScrollView nestedScrollView, RobotoTextView robotoTextView) {
        this.f138533p = linearLayout;
        this.f138534q = button;
        this.f138535r = listItemSetting;
        this.f138536s = listItemSetting2;
        this.f138537t = listItemSetting3;
        this.f138538u = listItemSetting4;
        this.f138539v = listItemSetting5;
        this.f138540w = nestedScrollView;
        this.f138541x = robotoTextView;
    }

    /* renamed from: a */
    public static C29900l0 m148181a(View view) {
        int i11 = AbstractC6918a0.btnApply;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.itemBlockCall;
            ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting != null) {
                i11 = AbstractC6918a0.itemBlockFeed;
                ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting2 != null) {
                    i11 = AbstractC6918a0.itemBlockMsg;
                    ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting3 != null) {
                        i11 = AbstractC6918a0.itemHideFeed;
                        ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting4 != null) {
                            i11 = AbstractC6918a0.itemSessionFeed;
                            ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting5 != null) {
                                i11 = AbstractC6918a0.scrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                                if (nestedScrollView != null) {
                                    i11 = AbstractC6918a0.tvTitle;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null) {
                                        return new C29900l0((LinearLayout) view, button, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, nestedScrollView, robotoTextView);
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
    public static C29900l0 m148182c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_block_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148181a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f138533p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.ProgressBar;
import com.zing.zalo.zdesign.component.SearchField;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t0 */
/* loaded from: classes3.dex */
public final class C30042t0 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139355A;

    /* renamed from: p */
    private final FrameLayout f139356p;

    /* renamed from: q */
    public final LinearLayout f139357q;

    /* renamed from: r */
    public final RecyclerView f139358r;

    /* renamed from: s */
    public final Button f139359s;

    /* renamed from: t */
    public final ProgressBar f139360t;

    /* renamed from: u */
    public final RobotoTextView f139361u;

    /* renamed from: v */
    public final RobotoTextView f139362v;

    /* renamed from: w */
    public final ListItem f139363w;

    /* renamed from: x */
    public final ListItem f139364x;

    /* renamed from: y */
    public final SearchField f139365y;

    /* renamed from: z */
    public final KeyboardFrameLayout f139366z;

    private C30042t0(FrameLayout frameLayout, LinearLayout linearLayout, RecyclerView recyclerView, Button button, ProgressBar progressBar, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ListItem listItem, ListItem listItem2, SearchField searchField, KeyboardFrameLayout keyboardFrameLayout, RobotoTextView robotoTextView3) {
        this.f139356p = frameLayout;
        this.f139357q = linearLayout;
        this.f139358r = recyclerView;
        this.f139359s = button;
        this.f139360t = progressBar;
        this.f139361u = robotoTextView;
        this.f139362v = robotoTextView2;
        this.f139363w = listItem;
        this.f139364x = listItem2;
        this.f139365y = searchField;
        this.f139366z = keyboardFrameLayout;
        this.f139355A = robotoTextView3;
    }

    /* renamed from: a */
    public static C30042t0 m148505a(View view) {
        int i11 = AbstractC6918a0.confirm_leave_container;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.group_members;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.ic_back_to_select_owner;
                Button button = (Button) AbstractC22716b.m117526a(view, i11);
                if (button != null) {
                    i11 = AbstractC6918a0.ic_loading;
                    ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
                    if (progressBar != null) {
                        i11 = AbstractC6918a0.leave_group_select_owner_title;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            i11 = AbstractC6918a0.leave_group_silently_bottom_sheet_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.opt_prevent_add_again;
                                ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
                                if (listItem != null) {
                                    i11 = AbstractC6918a0.opt_silent_leave;
                                    ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                                    if (listItem2 != null) {
                                        i11 = AbstractC6918a0.search_members;
                                        SearchField searchField = (SearchField) AbstractC22716b.m117526a(view, i11);
                                        if (searchField != null) {
                                            i11 = AbstractC6918a0.select_owner_container;
                                            KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) AbstractC22716b.m117526a(view, i11);
                                            if (keyboardFrameLayout != null) {
                                                i11 = AbstractC6918a0.text_error;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    return new C30042t0((FrameLayout) view, linearLayout, recyclerView, button, progressBar, robotoTextView, robotoTextView2, listItem, listItem2, searchField, keyboardFrameLayout, robotoTextView3);
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
    public static C30042t0 m148506c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_leave_group_confirm_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148505a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139356p;
    }
}

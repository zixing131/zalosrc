package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.x0 */
/* loaded from: classes3.dex */
public final class C30110x0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139859p;

    /* renamed from: q */
    public final ListItemSetting f139860q;

    /* renamed from: r */
    public final ListItemSetting f139861r;

    /* renamed from: s */
    public final ListItemSetting f139862s;

    /* renamed from: t */
    public final ListItemSetting f139863t;

    /* renamed from: u */
    public final ListItemSetting f139864u;

    private C30110x0(LinearLayout linearLayout, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5) {
        this.f139859p = linearLayout;
        this.f139860q = listItemSetting;
        this.f139861r = listItemSetting2;
        this.f139862s = listItemSetting3;
        this.f139863t = listItemSetting4;
        this.f139864u = listItemSetting5;
    }

    /* renamed from: a */
    public static C30110x0 m148671a(View view) {
        int i11 = AbstractC6918a0.itemAlias;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemBlock;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemDelete;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemFavorite;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemProfile;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            return new C30110x0((LinearLayout) view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30110x0 m148672c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_menu_tab_contact_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148671a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139859p;
    }
}

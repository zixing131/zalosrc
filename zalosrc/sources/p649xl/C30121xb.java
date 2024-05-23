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

/* renamed from: xl.xb */
/* loaded from: classes3.dex */
public final class C30121xb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139941p;

    /* renamed from: q */
    public final ListItemSetting f139942q;

    /* renamed from: r */
    public final ListItemSetting f139943r;

    /* renamed from: s */
    public final ListItemSetting f139944s;

    /* renamed from: t */
    public final ListItemSetting f139945t;

    /* renamed from: u */
    public final ListItemSetting f139946u;

    /* renamed from: v */
    public final ListItemSetting f139947v;

    /* renamed from: w */
    public final LinearLayout f139948w;

    private C30121xb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, LinearLayout linearLayout) {
        this.f139941p = view;
        this.f139942q = listItemSetting;
        this.f139943r = listItemSetting2;
        this.f139944s = listItemSetting3;
        this.f139945t = listItemSetting4;
        this.f139946u = listItemSetting5;
        this.f139947v = listItemSetting6;
        this.f139948w = linearLayout;
    }

    /* renamed from: a */
    public static C30121xb m148701a(View view) {
        int i11 = AbstractC6918a0.itemAllowFriendSearchPhone;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemContact;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemGroup;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemQRCode;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemSuggest;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemUsername;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.layoutAllowStrangerAddFriend;
                                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout != null) {
                                    return new C30121xb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30121xb m148702b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_manage_source_friend_view, viewGroup);
            return m148701a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139941p;
    }
}

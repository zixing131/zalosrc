package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.vb */
/* loaded from: classes3.dex */
public final class C30087vb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139699p;

    /* renamed from: q */
    public final ListItemSetting f139700q;

    /* renamed from: r */
    public final ListItemSetting f139701r;

    /* renamed from: s */
    public final ListItemSetting f139702s;

    private C30087vb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3) {
        this.f139699p = view;
        this.f139700q = listItemSetting;
        this.f139701r = listItemSetting2;
        this.f139702s = listItemSetting3;
    }

    /* renamed from: a */
    public static C30087vb m148624a(View view) {
        int i11 = AbstractC6918a0.itemBirthday;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.item_notify_friend_my_birthday;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.item_notify_me_about_friend_birthday;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    return new C30087vb(view, listItemSetting, listItemSetting2, listItemSetting3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30087vb m148625b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_manage_birthday, viewGroup);
            return m148624a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139699p;
    }
}

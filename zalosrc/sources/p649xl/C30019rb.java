package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.rb */
/* loaded from: classes3.dex */
public final class C30019rb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139230p;

    /* renamed from: q */
    public final ListItemSetting f139231q;

    /* renamed from: r */
    public final ListItemSetting f139232r;

    /* renamed from: s */
    public final ListItemSetting f139233s;

    /* renamed from: t */
    public final ListItemSetting f139234t;

    private C30019rb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4) {
        this.f139230p = view;
        this.f139231q = listItemSetting;
        this.f139232r = listItemSetting2;
        this.f139233s = listItemSetting3;
        this.f139234t = listItemSetting4;
    }

    /* renamed from: a */
    public static C30019rb m148455a(View view) {
        int i11 = AbstractC6918a0.itemAutoFriend;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemShowContact;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemSourceFriend;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemUpdateContact;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        return new C30019rb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30019rb m148456b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_contact_v2_view, viewGroup);
            return m148455a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139230p;
    }
}

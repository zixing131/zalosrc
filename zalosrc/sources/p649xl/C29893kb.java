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

/* renamed from: xl.kb */
/* loaded from: classes3.dex */
public final class C29893kb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138488p;

    /* renamed from: q */
    public final ListItemSetting f138489q;

    /* renamed from: r */
    public final ListItemSetting f138490r;

    /* renamed from: s */
    public final ListItemSetting f138491s;

    /* renamed from: t */
    public final ListItemSetting f138492t;

    /* renamed from: u */
    public final LinearLayout f138493u;

    /* renamed from: v */
    public final RobotoTextView f138494v;

    private C29893kb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, LinearLayout linearLayout, RobotoTextView robotoTextView) {
        this.f138488p = view;
        this.f138489q = listItemSetting;
        this.f138490r = listItemSetting2;
        this.f138491s = listItemSetting3;
        this.f138492t = listItemSetting4;
        this.f138493u = linearLayout;
        this.f138494v = robotoTextView;
    }

    /* renamed from: a */
    public static C29893kb m148170a(View view) {
        int i11 = AbstractC6918a0.itemDoNotShow;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemNotifyFriendAboutMyBirthday;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemShowFull;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemShowOnlyDayMonth;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.layout_setting_birthday;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.section_label_notification;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                return new C29893kb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, linearLayout, robotoTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29893kb m148171b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_birthday, viewGroup);
            return m148170a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138488p;
    }
}

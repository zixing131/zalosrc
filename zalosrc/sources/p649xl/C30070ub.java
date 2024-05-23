package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ub */
/* loaded from: classes3.dex */
public final class C30070ub implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139581p;

    /* renamed from: q */
    public final ListItemSetting f139582q;

    /* renamed from: r */
    public final ListItemSetting f139583r;

    private C30070ub(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2) {
        this.f139581p = view;
        this.f139582q = listItemSetting;
        this.f139583r = listItemSetting2;
    }

    /* renamed from: a */
    public static C30070ub m148583a(View view) {
        int i11 = AbstractC6918a0.itemSettingEn;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemSettingVn;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                return new C30070ub(view, listItemSetting, listItemSetting2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30070ub m148584b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_language_v2_view, viewGroup);
            return m148583a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139581p;
    }
}

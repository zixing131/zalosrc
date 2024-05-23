package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.tb */
/* loaded from: classes3.dex */
public final class C30053tb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139470p;

    /* renamed from: q */
    public final ListItemSetting f139471q;

    /* renamed from: r */
    public final ListItemSetting f139472r;

    private C30053tb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2) {
        this.f139470p = view;
        this.f139471q = listItemSetting;
        this.f139472r = listItemSetting2;
    }

    /* renamed from: a */
    public static C30053tb m148539a(View view) {
        int i11 = AbstractC6918a0.itemFontSystem;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemFontZalo;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                return new C30053tb(view, listItemSetting, listItemSetting2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30053tb m148540b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_font_view, viewGroup);
            return m148539a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139470p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.sb */
/* loaded from: classes3.dex */
public final class C30036sb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f139331p;

    /* renamed from: q */
    public final ListItemSetting f139332q;

    /* renamed from: r */
    public final ListItemSetting f139333r;

    /* renamed from: s */
    public final ListItemSetting f139334s;

    /* renamed from: t */
    public final ListItemSetting f139335t;

    /* renamed from: u */
    public final ListItemSetting f139336u;

    /* renamed from: v */
    public final ListItemSetting f139337v;

    /* renamed from: w */
    public final ListItemSetting f139338w;

    /* renamed from: x */
    public final ListItemSetting f139339x;

    /* renamed from: y */
    public final RobotoTextView f139340y;

    private C30036sb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, RobotoTextView robotoTextView) {
        this.f139331p = view;
        this.f139332q = listItemSetting;
        this.f139333r = listItemSetting2;
        this.f139334s = listItemSetting3;
        this.f139335t = listItemSetting4;
        this.f139336u = listItemSetting5;
        this.f139337v = listItemSetting6;
        this.f139338w = listItemSetting7;
        this.f139339x = listItemSetting8;
        this.f139340y = robotoTextView;
    }

    /* renamed from: a */
    public static C30036sb m148497a(View view) {
        int i11 = AbstractC6918a0.itemAllow10Feed;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAllowComment;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemAllowViewPhoto;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemSetting1;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemSetting2;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemSetting3;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemSetting4;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.itemSetting5;
                                    ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting8 != null) {
                                        i11 = AbstractC6918a0.tv_section_setting_ba;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            return new C30036sb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, robotoTextView);
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

    /* renamed from: b */
    public static C30036sb m148498b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_feed_privacy_view, viewGroup);
            return m148497a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139331p;
    }
}

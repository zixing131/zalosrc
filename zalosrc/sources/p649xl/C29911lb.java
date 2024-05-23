package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.lb */
/* loaded from: classes3.dex */
public final class C29911lb implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138596p;

    /* renamed from: q */
    public final ListItemSetting f138597q;

    /* renamed from: r */
    public final ListItemSetting f138598r;

    /* renamed from: s */
    public final ListItemSetting f138599s;

    /* renamed from: t */
    public final ListItemSetting f138600t;

    /* renamed from: u */
    public final ListItemSetting f138601u;

    private C29911lb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5) {
        this.f138596p = view;
        this.f138597q = listItemSetting;
        this.f138598r = listItemSetting2;
        this.f138599s = listItemSetting3;
        this.f138600t = listItemSetting4;
        this.f138601u = listItemSetting5;
    }

    /* renamed from: a */
    public static C29911lb m148211a(View view) {
        int i11 = AbstractC6918a0.itemBlockCall;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemBlockFeed;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemBlockMessage;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemBlockStory;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemHideFeed;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            return new C29911lb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29911lb m148212b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_block_and_hide_view, viewGroup);
            return m148211a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138596p;
    }
}

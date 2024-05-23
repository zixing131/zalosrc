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

/* renamed from: xl.kc */
/* loaded from: classes3.dex */
public final class C29894kc implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138495p;

    /* renamed from: q */
    public final ListItemSetting f138496q;

    /* renamed from: r */
    public final ListItemSetting f138497r;

    /* renamed from: s */
    public final ListItemSetting f138498s;

    /* renamed from: t */
    public final ListItemSetting f138499t;

    /* renamed from: u */
    public final LinearLayout f138500u;

    private C29894kc(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, LinearLayout linearLayout) {
        this.f138495p = view;
        this.f138496q = listItemSetting;
        this.f138497r = listItemSetting2;
        this.f138498s = listItemSetting3;
        this.f138499t = listItemSetting4;
        this.f138500u = linearLayout;
    }

    /* renamed from: a */
    public static C29894kc m148172a(View view) {
        int i11 = AbstractC6918a0.itemAutoParseBankCardCSC;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAutoQRPhoto;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemJumpLinkWithWeb;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemJumpLinkWithZalo;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.layoutSessionJumpLink;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            return new C29894kc(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29894kc m148173b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_utilities_view, viewGroup);
            return m148172a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138495p;
    }
}

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

/* renamed from: xl.zb */
/* loaded from: classes3.dex */
public final class C30155zb implements InterfaceC22715a {

    /* renamed from: A */
    public final ListItemSetting f140132A;

    /* renamed from: B */
    public final LinearLayout f140133B;

    /* renamed from: p */
    private final View f140134p;

    /* renamed from: q */
    public final ListItemSetting f140135q;

    /* renamed from: r */
    public final ListItemSetting f140136r;

    /* renamed from: s */
    public final ListItemSetting f140137s;

    /* renamed from: t */
    public final ListItemSetting f140138t;

    /* renamed from: u */
    public final ListItemSetting f140139u;

    /* renamed from: v */
    public final ListItemSetting f140140v;

    /* renamed from: w */
    public final ListItemSetting f140141w;

    /* renamed from: x */
    public final ListItemSetting f140142x;

    /* renamed from: y */
    public final ListItemSetting f140143y;

    /* renamed from: z */
    public final ListItemSetting f140144z;

    private C30155zb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9, ListItemSetting listItemSetting10, ListItemSetting listItemSetting11, LinearLayout linearLayout) {
        this.f140134p = view;
        this.f140135q = listItemSetting;
        this.f140136r = listItemSetting2;
        this.f140137s = listItemSetting3;
        this.f140138t = listItemSetting4;
        this.f140139u = listItemSetting5;
        this.f140140v = listItemSetting6;
        this.f140141w = listItemSetting7;
        this.f140142x = listItemSetting8;
        this.f140143y = listItemSetting9;
        this.f140144z = listItemSetting10;
        this.f140132A = listItemSetting11;
        this.f140133B = linearLayout;
    }

    /* renamed from: a */
    public static C30155zb m148785a(View view) {
        int i11 = AbstractC6918a0.itemCallIncoming;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemNotiBirthday;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemNotiChat11;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemNotiFeed;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemNotiGroup;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemNotiInApp;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemNotiSystem;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.itemOffNotiCall;
                                    ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting8 != null) {
                                        i11 = AbstractC6918a0.itemPreviewChat11;
                                        ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting9 != null) {
                                            i11 = AbstractC6918a0.itemSound;
                                            ListItemSetting listItemSetting10 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                            if (listItemSetting10 != null) {
                                                i11 = AbstractC6918a0.itemVibrate;
                                                ListItemSetting listItemSetting11 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                if (listItemSetting11 != null) {
                                                    i11 = AbstractC6918a0.layoutSessionCall;
                                                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                    if (linearLayout != null) {
                                                        return new C30155zb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, listItemSetting9, listItemSetting10, listItemSetting11, linearLayout);
                                                    }
                                                }
                                            }
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
    public static C30155zb m148786b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_notification_v2_view, viewGroup);
            return m148785a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f140134p;
    }
}

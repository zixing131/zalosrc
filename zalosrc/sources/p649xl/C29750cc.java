package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.cc */
/* loaded from: classes3.dex */
public final class C29750cc implements InterfaceC22715a {

    /* renamed from: A */
    public final ListItemSetting f137431A;

    /* renamed from: p */
    private final View f137432p;

    /* renamed from: q */
    public final ListItemSetting f137433q;

    /* renamed from: r */
    public final ListItemSetting f137434r;

    /* renamed from: s */
    public final ListItemSetting f137435s;

    /* renamed from: t */
    public final ListItemSetting f137436t;

    /* renamed from: u */
    public final ListItemSetting f137437u;

    /* renamed from: v */
    public final ListItemSetting f137438v;

    /* renamed from: w */
    public final ListItemSetting f137439w;

    /* renamed from: x */
    public final ListItemSetting f137440x;

    /* renamed from: y */
    public final ListItemSetting f137441y;

    /* renamed from: z */
    public final ListItemSetting f137442z;

    private C29750cc(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9, ListItemSetting listItemSetting10, ListItemSetting listItemSetting11) {
        this.f137432p = view;
        this.f137433q = listItemSetting;
        this.f137434r = listItemSetting2;
        this.f137435s = listItemSetting3;
        this.f137436t = listItemSetting4;
        this.f137437u = listItemSetting5;
        this.f137438v = listItemSetting6;
        this.f137439w = listItemSetting7;
        this.f137440x = listItemSetting8;
        this.f137441y = listItemSetting9;
        this.f137442z = listItemSetting10;
        this.f137431A = listItemSetting11;
    }

    /* renamed from: a */
    public static C29750cc m147819a(View view) {
        int i11 = AbstractC6918a0.itemAllowCall;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAllowComment;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemAllowMsg;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemApp;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemAutoFriend;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemBirthday;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemBlockAndHide;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.itemSeenMsg;
                                    ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting8 != null) {
                                        i11 = AbstractC6918a0.itemSourceFriend;
                                        ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting9 != null) {
                                            i11 = AbstractC6918a0.itemStatus;
                                            ListItemSetting listItemSetting10 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                            if (listItemSetting10 != null) {
                                                i11 = AbstractC6918a0.itemUtilities;
                                                ListItemSetting listItemSetting11 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                if (listItemSetting11 != null) {
                                                    return new C29750cc(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, listItemSetting9, listItemSetting10, listItemSetting11);
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
    public static C29750cc m147820b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_private_view, viewGroup);
            return m147819a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137432p;
    }
}

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

/* renamed from: xl.qb */
/* loaded from: classes3.dex */
public final class C30001qb implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139120A;

    /* renamed from: B */
    public final RobotoTextView f139121B;

    /* renamed from: C */
    public final RobotoTextView f139122C;

    /* renamed from: D */
    public final View f139123D;

    /* renamed from: E */
    public final View f139124E;

    /* renamed from: F */
    public final View f139125F;

    /* renamed from: p */
    private final View f139126p;

    /* renamed from: q */
    public final ListItemSetting f139127q;

    /* renamed from: r */
    public final ListItemSetting f139128r;

    /* renamed from: s */
    public final ListItemSetting f139129s;

    /* renamed from: t */
    public final ListItemSetting f139130t;

    /* renamed from: u */
    public final ListItemSetting f139131u;

    /* renamed from: v */
    public final ListItemSetting f139132v;

    /* renamed from: w */
    public final ListItemSetting f139133w;

    /* renamed from: x */
    public final ListItemSetting f139134x;

    /* renamed from: y */
    public final ListItemSetting f139135y;

    /* renamed from: z */
    public final LinearLayout f139136z;

    private C30001qb(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9, LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, View view2, View view3, View view4) {
        this.f139126p = view;
        this.f139127q = listItemSetting;
        this.f139128r = listItemSetting2;
        this.f139129s = listItemSetting3;
        this.f139130t = listItemSetting4;
        this.f139131u = listItemSetting5;
        this.f139132v = listItemSetting6;
        this.f139133w = listItemSetting7;
        this.f139134x = listItemSetting8;
        this.f139135y = listItemSetting9;
        this.f139136z = linearLayout;
        this.f139120A = robotoTextView;
        this.f139121B = robotoTextView2;
        this.f139122C = robotoTextView3;
        this.f139123D = view2;
        this.f139124E = view3;
        this.f139125F = view4;
    }

    /* renamed from: a */
    public static C30001qb m148412a(View view) {
        View m117526a;
        View m117526a2;
        View m117526a3;
        int i11 = AbstractC6918a0.itemAllowCall;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemBlockCall;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemBubbleCallInChat;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemCallIncoming;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemMiniVideo;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemOffNotiCall;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemPopupMissCall;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.itemRingBackTone;
                                    ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting8 != null) {
                                        i11 = AbstractC6918a0.itemRingtone;
                                        ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting9 != null) {
                                            i11 = AbstractC6918a0.layoutSessionCall;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC6918a0.sessionCallVideo;
                                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView != null) {
                                                    i11 = AbstractC6918a0.sessionHistoryCall;
                                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView2 != null) {
                                                        i11 = AbstractC6918a0.sessionRingtone;
                                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView3 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.splitCallVideo))) != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.splitHistoryCall))) != null && (m117526a3 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.splitRingtone))) != null) {
                                                            return new C30001qb(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, listItemSetting9, linearLayout, robotoTextView, robotoTextView2, robotoTextView3, m117526a, m117526a2, m117526a3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C30001qb m148413b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_call_v2_view, viewGroup);
            return m148412a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f139126p;
    }
}

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

/* renamed from: xl.ic */
/* loaded from: classes3.dex */
public final class C29858ic implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138190p;

    /* renamed from: q */
    public final ListItemSetting f138191q;

    /* renamed from: r */
    public final ListItemSetting f138192r;

    /* renamed from: s */
    public final ListItemSetting f138193s;

    /* renamed from: t */
    public final ListItemSetting f138194t;

    /* renamed from: u */
    public final ListItemSetting f138195u;

    /* renamed from: v */
    public final ListItemSetting f138196v;

    /* renamed from: w */
    public final ListItemSetting f138197w;

    /* renamed from: x */
    public final RobotoTextView f138198x;

    /* renamed from: y */
    public final View f138199y;

    /* renamed from: z */
    public final RobotoTextView f138200z;

    private C29858ic(View view, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, RobotoTextView robotoTextView, View view2, RobotoTextView robotoTextView2) {
        this.f138190p = view;
        this.f138191q = listItemSetting;
        this.f138192r = listItemSetting2;
        this.f138193s = listItemSetting3;
        this.f138194t = listItemSetting4;
        this.f138195u = listItemSetting5;
        this.f138196v = listItemSetting6;
        this.f138197w = listItemSetting7;
        this.f138198x = robotoTextView;
        this.f138199y = view2;
        this.f138200z = robotoTextView2;
    }

    /* renamed from: a */
    public static C29858ic m148085a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.itemAutoPlayMusic;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAutoPlayVideo;
            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting2 != null) {
                i11 = AbstractC6918a0.itemFilterTimeline;
                ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting3 != null) {
                    i11 = AbstractC6918a0.itemHideFeed;
                    ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting4 != null) {
                        i11 = AbstractC6918a0.itemStoryBlock;
                        ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting5 != null) {
                            i11 = AbstractC6918a0.itemSuggestStickerComment;
                            ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting6 != null) {
                                i11 = AbstractC6918a0.itemTimelineBlock;
                                ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting7 != null) {
                                    i11 = AbstractC6918a0.section_utility;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.section_utility_bottom_padding))) != null) {
                                        i11 = AbstractC6918a0.sessionPrivacy;
                                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView2 != null) {
                                            return new C29858ic(view, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, robotoTextView, m117526a, robotoTextView2);
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
    public static C29858ic m148086b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_timeline_v2_view, viewGroup);
            return m148085a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138190p;
    }
}

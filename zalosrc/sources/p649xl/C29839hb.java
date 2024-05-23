package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.hb */
/* loaded from: classes3.dex */
public final class C29839hb implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f138030A;

    /* renamed from: B */
    public final RobotoTextView f138031B;

    /* renamed from: C */
    public final ListItemSetting f138032C;

    /* renamed from: D */
    public final ListItemSetting f138033D;

    /* renamed from: p */
    private final View f138034p;

    /* renamed from: q */
    public final ListItemSetting f138035q;

    /* renamed from: r */
    public final Avatar f138036r;

    /* renamed from: s */
    public final ListItemSetting f138037s;

    /* renamed from: t */
    public final ListItemSetting f138038t;

    /* renamed from: u */
    public final ListItemSetting f138039u;

    /* renamed from: v */
    public final ListItemSetting f138040v;

    /* renamed from: w */
    public final ListItemSetting f138041w;

    /* renamed from: x */
    public final ListItemSetting f138042x;

    /* renamed from: y */
    public final TrackingRelativeLayout f138043y;

    /* renamed from: z */
    public final AppCompatImageView f138044z;

    private C29839hb(View view, ListItemSetting listItemSetting, Avatar avatar, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, TrackingRelativeLayout trackingRelativeLayout, AppCompatImageView appCompatImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9) {
        this.f138034p = view;
        this.f138035q = listItemSetting;
        this.f138036r = avatar;
        this.f138037s = listItemSetting2;
        this.f138038t = listItemSetting3;
        this.f138039u = listItemSetting4;
        this.f138040v = listItemSetting5;
        this.f138041w = listItemSetting6;
        this.f138042x = listItemSetting7;
        this.f138043y = trackingRelativeLayout;
        this.f138044z = appCompatImageView;
        this.f138030A = robotoTextView;
        this.f138031B = robotoTextView2;
        this.f138032C = listItemSetting8;
        this.f138033D = listItemSetting9;
    }

    /* renamed from: a */
    public static C29839hb m148041a(View view) {
        int i11 = AbstractC6918a0.item2fa;
        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
        if (listItemSetting != null) {
            i11 = AbstractC6918a0.itemAvatar;
            Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
            if (avatar != null) {
                i11 = AbstractC6918a0.itemChangePassword;
                ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting2 != null) {
                    i11 = AbstractC6918a0.itemChangePhone;
                    ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting3 != null) {
                        i11 = AbstractC6918a0.itemDeleteAccount;
                        ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting4 != null) {
                            i11 = AbstractC6918a0.itemLoginHistory;
                            ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting5 != null) {
                                i11 = AbstractC6918a0.itemMyQR;
                                ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting6 != null) {
                                    i11 = AbstractC6918a0.itemPasscode;
                                    ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting7 != null) {
                                        i11 = AbstractC6918a0.itemProfile;
                                        TrackingRelativeLayout trackingRelativeLayout = (TrackingRelativeLayout) AbstractC22716b.m117526a(view, i11);
                                        if (trackingRelativeLayout != null) {
                                            i11 = AbstractC6918a0.itemProfileChevron;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC22716b.m117526a(view, i11);
                                            if (appCompatImageView != null) {
                                                i11 = AbstractC6918a0.itemProfileSessionTitle;
                                                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView != null) {
                                                    i11 = AbstractC6918a0.itemProfileUserName;
                                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView2 != null) {
                                                        i11 = AbstractC6918a0.itemSecurityCheckup;
                                                        ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                        if (listItemSetting8 != null) {
                                                            i11 = AbstractC6918a0.itemVerifyAccount;
                                                            ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                            if (listItemSetting9 != null) {
                                                                return new C29839hb(view, listItemSetting, avatar, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, trackingRelativeLayout, appCompatImageView, robotoTextView, robotoTextView2, listItemSetting8, listItemSetting9);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29839hb m148042b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_account_and_security_v2_view, viewGroup);
            return m148041a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138034p;
    }
}

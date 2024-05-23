package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zinstant.ZaloZinstantLayout;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.a */
/* loaded from: classes3.dex */
public final class C29701a implements InterfaceC22715a {

    /* renamed from: A */
    public final ListItemSetting f137158A;

    /* renamed from: B */
    public final RelativeLayout f137159B;

    /* renamed from: C */
    public final ListItemSetting f137160C;

    /* renamed from: D */
    public final ListItemSetting f137161D;

    /* renamed from: E */
    public final ListItemSetting f137162E;

    /* renamed from: F */
    public final ScrollView f137163F;

    /* renamed from: G */
    public final RobotoTextView f137164G;

    /* renamed from: H */
    public final ZaloZinstantLayout f137165H;

    /* renamed from: p */
    private final View f137166p;

    /* renamed from: q */
    public final Button f137167q;

    /* renamed from: r */
    public final View f137168r;

    /* renamed from: s */
    public final LinearLayout f137169s;

    /* renamed from: t */
    public final LinearLayout f137170t;

    /* renamed from: u */
    public final LinearLayout f137171u;

    /* renamed from: v */
    public final LinearLayout f137172v;

    /* renamed from: w */
    public final LinearLayout f137173w;

    /* renamed from: x */
    public final LinearLayout f137174x;

    /* renamed from: y */
    public final LinearLayout f137175y;

    /* renamed from: z */
    public final ListItemSetting f137176z;

    private C29701a(View view, Button button, View view2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, RelativeLayout relativeLayout, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ScrollView scrollView, RobotoTextView robotoTextView, ZaloZinstantLayout zaloZinstantLayout) {
        this.f137166p = view;
        this.f137167q = button;
        this.f137168r = view2;
        this.f137169s = linearLayout;
        this.f137170t = linearLayout2;
        this.f137171u = linearLayout3;
        this.f137172v = linearLayout4;
        this.f137173w = linearLayout5;
        this.f137174x = linearLayout6;
        this.f137175y = linearLayout7;
        this.f137176z = listItemSetting;
        this.f137158A = listItemSetting2;
        this.f137159B = relativeLayout;
        this.f137160C = listItemSetting3;
        this.f137161D = listItemSetting4;
        this.f137162E = listItemSetting5;
        this.f137163F = scrollView;
        this.f137164G = robotoTextView;
        this.f137165H = zaloZinstantLayout;
    }

    /* renamed from: a */
    public static C29701a m147697a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_disable_dev_tools;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.dev_tools_separator_item))) != null) {
            i11 = AbstractC6918a0.ll_autodownload_tools;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.ll_backuprestore_tools;
                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout2 != null) {
                    i11 = AbstractC6918a0.ll_chat_tools;
                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout3 != null) {
                        i11 = AbstractC6918a0.ll_platform_tools;
                        LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout4 != null) {
                            i11 = AbstractC6918a0.ll_social_tools;
                            LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout5 != null) {
                                i11 = AbstractC6918a0.ll_storage_tools;
                                LinearLayout linearLayout6 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout6 != null) {
                                    i11 = AbstractC6918a0.ll_zalo_cloud_tools;
                                    LinearLayout linearLayout7 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout7 != null) {
                                        i11 = AbstractC6918a0.rl_all_feature;
                                        ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting != null) {
                                            i11 = AbstractC6918a0.rl_contact_support;
                                            ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                            if (listItemSetting2 != null) {
                                                i11 = AbstractC6918a0.rl_dev_tools_switch;
                                                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                if (relativeLayout != null) {
                                                    i11 = AbstractC6918a0.rl_policy_about;
                                                    ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                    if (listItemSetting3 != null) {
                                                        i11 = AbstractC6918a0.rl_send_email;
                                                        ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                        if (listItemSetting4 != null) {
                                                            i11 = AbstractC6918a0.rl_version;
                                                            ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                            if (listItemSetting5 != null) {
                                                                i11 = AbstractC6918a0.sv_all_dev_tools;
                                                                ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                                                                if (scrollView != null) {
                                                                    i11 = AbstractC6918a0.tv_dev_tools;
                                                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                    if (robotoTextView != null) {
                                                                        i11 = AbstractC6918a0.zl_whatnews;
                                                                        ZaloZinstantLayout zaloZinstantLayout = (ZaloZinstantLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (zaloZinstantLayout != null) {
                                                                            return new C29701a(view, button, m117526a, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, listItemSetting, listItemSetting2, relativeLayout, listItemSetting3, listItemSetting4, listItemSetting5, scrollView, robotoTextView, zaloZinstantLayout);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: b */
    public static C29701a m147698b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.about_view, viewGroup);
            return m147697a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f137166p;
    }
}

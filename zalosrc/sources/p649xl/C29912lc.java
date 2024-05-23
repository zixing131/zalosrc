package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.lc */
/* loaded from: classes3.dex */
public final class C29912lc implements InterfaceC22715a {

    /* renamed from: A */
    public final ListItemSetting f138602A;

    /* renamed from: B */
    public final ListItemSetting f138603B;

    /* renamed from: C */
    public final ListItemSetting f138604C;

    /* renamed from: D */
    public final ListItemSetting f138605D;

    /* renamed from: E */
    public final FrameLayout f138606E;

    /* renamed from: F */
    public final ListItemSetting f138607F;

    /* renamed from: p */
    private final View f138608p;

    /* renamed from: q */
    public final Button f138609q;

    /* renamed from: r */
    public final ListItemSetting f138610r;

    /* renamed from: s */
    public final ListItemSetting f138611s;

    /* renamed from: t */
    public final ListItemSetting f138612t;

    /* renamed from: u */
    public final ListItemSetting f138613u;

    /* renamed from: v */
    public final ListItemSetting f138614v;

    /* renamed from: w */
    public final ListItemSetting f138615w;

    /* renamed from: x */
    public final ListItemSetting f138616x;

    /* renamed from: y */
    public final ListItemSetting f138617y;

    /* renamed from: z */
    public final ListItemSetting f138618z;

    private C29912lc(View view, Button button, ListItemSetting listItemSetting, ListItemSetting listItemSetting2, ListItemSetting listItemSetting3, ListItemSetting listItemSetting4, ListItemSetting listItemSetting5, ListItemSetting listItemSetting6, ListItemSetting listItemSetting7, ListItemSetting listItemSetting8, ListItemSetting listItemSetting9, ListItemSetting listItemSetting10, ListItemSetting listItemSetting11, ListItemSetting listItemSetting12, ListItemSetting listItemSetting13, FrameLayout frameLayout, ListItemSetting listItemSetting14) {
        this.f138608p = view;
        this.f138609q = button;
        this.f138610r = listItemSetting;
        this.f138611s = listItemSetting2;
        this.f138612t = listItemSetting3;
        this.f138613u = listItemSetting4;
        this.f138614v = listItemSetting5;
        this.f138615w = listItemSetting6;
        this.f138616x = listItemSetting7;
        this.f138617y = listItemSetting8;
        this.f138618z = listItemSetting9;
        this.f138602A = listItemSetting10;
        this.f138603B = listItemSetting11;
        this.f138604C = listItemSetting12;
        this.f138605D = listItemSetting13;
        this.f138606E = frameLayout;
        this.f138607F = listItemSetting14;
    }

    /* renamed from: a */
    public static C29912lc m148213a(View view) {
        int i11 = AbstractC6918a0.btnLogout;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.itemAbout;
            ListItemSetting listItemSetting = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
            if (listItemSetting != null) {
                i11 = AbstractC6918a0.itemAccountAndSecurity;
                ListItemSetting listItemSetting2 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                if (listItemSetting2 != null) {
                    i11 = AbstractC6918a0.itemBackupAndRestore;
                    ListItemSetting listItemSetting3 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                    if (listItemSetting3 != null) {
                        i11 = AbstractC6918a0.itemCall;
                        ListItemSetting listItemSetting4 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                        if (listItemSetting4 != null) {
                            i11 = AbstractC6918a0.itemContact;
                            ListItemSetting listItemSetting5 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                            if (listItemSetting5 != null) {
                                i11 = AbstractC6918a0.itemMessage;
                                ListItemSetting listItemSetting6 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                if (listItemSetting6 != null) {
                                    i11 = AbstractC6918a0.itemNotification;
                                    ListItemSetting listItemSetting7 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                    if (listItemSetting7 != null) {
                                        i11 = AbstractC6918a0.itemPrivacy;
                                        ListItemSetting listItemSetting8 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                        if (listItemSetting8 != null) {
                                            i11 = AbstractC6918a0.itemStorage;
                                            ListItemSetting listItemSetting9 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                            if (listItemSetting9 != null) {
                                                i11 = AbstractC6918a0.itemSupport;
                                                ListItemSetting listItemSetting10 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                if (listItemSetting10 != null) {
                                                    i11 = AbstractC6918a0.itemSwitchAccount;
                                                    ListItemSetting listItemSetting11 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                    if (listItemSetting11 != null) {
                                                        i11 = AbstractC6918a0.itemTheme;
                                                        ListItemSetting listItemSetting12 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                        if (listItemSetting12 != null) {
                                                            i11 = AbstractC6918a0.itemTimeline;
                                                            ListItemSetting listItemSetting13 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                            if (listItemSetting13 != null) {
                                                                i11 = AbstractC6918a0.layoutBtnLogout;
                                                                FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (frameLayout != null) {
                                                                    i11 = AbstractC6918a0.zCloud;
                                                                    ListItemSetting listItemSetting14 = (ListItemSetting) AbstractC22716b.m117526a(view, i11);
                                                                    if (listItemSetting14 != null) {
                                                                        return new C29912lc(view, button, listItemSetting, listItemSetting2, listItemSetting3, listItemSetting4, listItemSetting5, listItemSetting6, listItemSetting7, listItemSetting8, listItemSetting9, listItemSetting10, listItemSetting11, listItemSetting12, listItemSetting13, frameLayout, listItemSetting14);
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
    public static C29912lc m148214b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.setting_v2_view, viewGroup);
            return m148213a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138608p;
    }
}

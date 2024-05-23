package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h9 */
/* loaded from: classes3.dex */
public final class C29837h9 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138017p;

    /* renamed from: q */
    public final Avatar f138018q;

    /* renamed from: r */
    public final Button f138019r;

    /* renamed from: s */
    public final ListItem f138020s;

    /* renamed from: t */
    public final ListItem f138021t;

    /* renamed from: u */
    public final ListItem f138022u;

    /* renamed from: v */
    public final ZdsActionBar f138023v;

    private C29837h9(FrameLayout frameLayout, Avatar avatar, Button button, ListItem listItem, ListItem listItem2, ListItem listItem3, ZdsActionBar zdsActionBar) {
        this.f138017p = frameLayout;
        this.f138018q = avatar;
        this.f138019r = button;
        this.f138020s = listItem;
        this.f138021t = listItem2;
        this.f138022u = listItem3;
        this.f138023v = zdsActionBar;
    }

    /* renamed from: a */
    public static C29837h9 m148035a(View view) {
        int i11 = AbstractC6918a0.avatar;
        Avatar avatar = (Avatar) AbstractC22716b.m117526a(view, i11);
        if (avatar != null) {
            i11 = AbstractC6918a0.btnEditInformation;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.itemBirthday;
                ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem != null) {
                    i11 = AbstractC6918a0.itemGender;
                    ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                    if (listItem2 != null) {
                        i11 = AbstractC6918a0.itemZaloName;
                        ListItem listItem3 = (ListItem) AbstractC22716b.m117526a(view, i11);
                        if (listItem3 != null) {
                            i11 = AbstractC6918a0.zds_action_bar;
                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                            if (zdsActionBar != null) {
                                return new C29837h9((FrameLayout) view, avatar, button, listItem, listItem2, listItem3, zdsActionBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29837h9 m148036c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.personal_information_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148035a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138017p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o5 */
/* loaded from: classes3.dex */
public final class C29959o5 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138859p;

    /* renamed from: q */
    public final RobotoTextView f138860q;

    /* renamed from: r */
    public final ZAppCompatImageView f138861r;

    /* renamed from: s */
    public final ListItem f138862s;

    /* renamed from: t */
    public final ListItem f138863t;

    /* renamed from: u */
    public final Button f138864u;

    /* renamed from: v */
    public final FrameLayout f138865v;

    private C29959o5(FrameLayout frameLayout, RobotoTextView robotoTextView, ZAppCompatImageView zAppCompatImageView, ListItem listItem, ListItem listItem2, Button button, FrameLayout frameLayout2) {
        this.f138859p = frameLayout;
        this.f138860q = robotoTextView;
        this.f138861r = zAppCompatImageView;
        this.f138862s = listItem;
        this.f138863t = listItem2;
        this.f138864u = button;
        this.f138865v = frameLayout2;
    }

    /* renamed from: a */
    public static C29959o5 m148313a(View view) {
        int i11 = AbstractC6918a0.footer_jump_link;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.icn_slide_hint;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                i11 = AbstractC6918a0.item_setting_web;
                ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem != null) {
                    i11 = AbstractC6918a0.item_setting_zalo;
                    ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                    if (listItem2 != null) {
                        i11 = AbstractC6918a0.open_link;
                        Button button = (Button) AbstractC22716b.m117526a(view, i11);
                        if (button != null) {
                            i11 = AbstractC6918a0.popup_content_container;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                return new C29959o5((FrameLayout) view, robotoTextView, zAppCompatImageView, listItem, listItem2, button, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29959o5 m148314c(LayoutInflater layoutInflater) {
        return m148315d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29959o5 m148315d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_jump_link_setting_bottom_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148313a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138859p;
    }
}

package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.vc */
/* loaded from: classes3.dex */
public final class C30088vc implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139703p;

    /* renamed from: q */
    public final Button f139704q;

    /* renamed from: r */
    public final FrameLayout f139705r;

    /* renamed from: s */
    public final LinearLayout f139706s;

    /* renamed from: t */
    public final C29715ad f139707t;

    /* renamed from: u */
    public final RobotoTextView f139708u;

    private C30088vc(FrameLayout frameLayout, Button button, FrameLayout frameLayout2, LinearLayout linearLayout, C29715ad c29715ad, RobotoTextView robotoTextView) {
        this.f139703p = frameLayout;
        this.f139704q = button;
        this.f139705r = frameLayout2;
        this.f139706s = linearLayout;
        this.f139707t = c29715ad;
        this.f139708u = robotoTextView;
    }

    /* renamed from: a */
    public static C30088vc m148626a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_story_ads_cta;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            i11 = AbstractC6918a0.story_ads_caption_cta_layout;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.story_bottom_input_message))) != null) {
                C29715ad m147737a = C29715ad.m147737a(m117526a);
                i11 = AbstractC6918a0.tv_story_ads_desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C30088vc(frameLayout, button, frameLayout, linearLayout, m147737a, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139703p;
    }
}

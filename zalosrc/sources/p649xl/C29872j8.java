package p649xl;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.rounedlayout.RelativeRoundedLayout;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j8 */
/* loaded from: classes3.dex */
public final class C29872j8 implements InterfaceC22715a {

    /* renamed from: A */
    public final RelativeLayout f138278A;

    /* renamed from: B */
    public final FrameLayout f138279B;

    /* renamed from: C */
    public final ViewStub f138280C;

    /* renamed from: p */
    private final RelativeLayout f138281p;

    /* renamed from: q */
    public final RelativeLayout f138282q;

    /* renamed from: r */
    public final RelativeRoundedLayout f138283r;

    /* renamed from: s */
    public final Button f138284s;

    /* renamed from: t */
    public final TextView f138285t;

    /* renamed from: u */
    public final RecyclingImageView f138286u;

    /* renamed from: v */
    public final RelativeLayout f138287v;

    /* renamed from: w */
    public final FrameLayout f138288w;

    /* renamed from: x */
    public final ImageButton f138289x;

    /* renamed from: y */
    public final TextView f138290y;

    /* renamed from: z */
    public final Button f138291z;

    private C29872j8(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeRoundedLayout relativeRoundedLayout, Button button, TextView textView, RecyclingImageView recyclingImageView, RelativeLayout relativeLayout3, FrameLayout frameLayout, ImageButton imageButton, TextView textView2, Button button2, RelativeLayout relativeLayout4, FrameLayout frameLayout2, ViewStub viewStub) {
        this.f138281p = relativeLayout;
        this.f138282q = relativeLayout2;
        this.f138283r = relativeRoundedLayout;
        this.f138284s = button;
        this.f138285t = textView;
        this.f138286u = recyclingImageView;
        this.f138287v = relativeLayout3;
        this.f138288w = frameLayout;
        this.f138289x = imageButton;
        this.f138290y = textView2;
        this.f138291z = button2;
        this.f138278A = relativeLayout4;
        this.f138279B = frameLayout2;
        this.f138280C = viewStub;
    }

    /* renamed from: a */
    public static C29872j8 m148118a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.contentView;
        RelativeRoundedLayout relativeRoundedLayout = (RelativeRoundedLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeRoundedLayout != null) {
            i11 = AbstractC6918a0.mp_dialog_accept_bt;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.mp_dialog_app_description;
                TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                if (textView != null) {
                    i11 = AbstractC6918a0.mp_dialog_app_icon;
                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView != null) {
                        i11 = AbstractC6918a0.mp_dialog_app_icon_container;
                        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout2 != null) {
                            i11 = AbstractC6918a0.mp_dialog_app_icon_view;
                            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout != null) {
                                i11 = AbstractC6918a0.mp_dialog_app_info;
                                ImageButton imageButton = (ImageButton) AbstractC22716b.m117526a(view, i11);
                                if (imageButton != null) {
                                    i11 = AbstractC6918a0.mp_dialog_app_name;
                                    TextView textView2 = (TextView) AbstractC22716b.m117526a(view, i11);
                                    if (textView2 != null) {
                                        i11 = AbstractC6918a0.mp_dialog_cancel_bt;
                                        Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                                        if (button2 != null) {
                                            i11 = AbstractC6918a0.mp_dialog_container;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                            if (relativeLayout3 != null) {
                                                i11 = AbstractC6918a0.mp_dialog_content;
                                                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                                                if (frameLayout2 != null) {
                                                    i11 = AbstractC6918a0.mp_permission_policy_viewstub;
                                                    ViewStub viewStub = (ViewStub) AbstractC22716b.m117526a(view, i11);
                                                    if (viewStub != null) {
                                                        return new C29872j8(relativeLayout, relativeLayout, relativeRoundedLayout, button, textView, recyclingImageView, relativeLayout2, frameLayout, imageButton, textView2, button2, relativeLayout3, frameLayout2, viewStub);
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

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138281p;
    }
}

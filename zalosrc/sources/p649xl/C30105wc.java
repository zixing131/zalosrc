package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.wc */
/* loaded from: classes3.dex */
public final class C30105wc implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139832p;

    /* renamed from: q */
    public final Button f139833q;

    /* renamed from: r */
    public final Button f139834r;

    /* renamed from: s */
    public final RecyclingImageView f139835s;

    /* renamed from: t */
    public final RobotoTextView f139836t;

    /* renamed from: u */
    public final RobotoTextView f139837u;

    private C30105wc(FrameLayout frameLayout, Button button, Button button2, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139832p = frameLayout;
        this.f139833q = button;
        this.f139834r = button2;
        this.f139835s = recyclingImageView;
        this.f139836t = robotoTextView;
        this.f139837u = robotoTextView2;
    }

    /* renamed from: a */
    public static C30105wc m148663a(View view) {
        int i11 = AbstractC6918a0.btn_cta_empty;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_story_archive_create_story;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.icn_empty;
                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView != null) {
                    i11 = AbstractC6918a0.tv_empty_desc;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.tv_empty_title;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            return new C30105wc((FrameLayout) view, button, button2, recyclingImageView, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30105wc m148664c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_archive_empty_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148663a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139832p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TextArea;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q9 */
/* loaded from: classes3.dex */
public final class C29999q9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139104p;

    /* renamed from: q */
    public final RobotoTextView f139105q;

    /* renamed from: r */
    public final TextField f139106r;

    /* renamed from: s */
    public final TextArea f139107s;

    /* renamed from: t */
    public final TextField f139108t;

    /* renamed from: u */
    public final LinearLayout f139109u;

    /* renamed from: v */
    public final RobotoTextView f139110v;

    /* renamed from: w */
    public final HorizontalScrollView f139111w;

    /* renamed from: x */
    public final TextField f139112x;

    /* renamed from: y */
    public final LinearLayout f139113y;

    /* renamed from: z */
    public final ZdsActionBar f139114z;

    private C29999q9(RelativeLayout relativeLayout, RobotoTextView robotoTextView, TextField textField, TextArea textArea, TextField textField2, LinearLayout linearLayout, RobotoTextView robotoTextView2, HorizontalScrollView horizontalScrollView, TextField textField3, LinearLayout linearLayout2, ZdsActionBar zdsActionBar) {
        this.f139104p = relativeLayout;
        this.f139105q = robotoTextView;
        this.f139106r = textField;
        this.f139107s = textArea;
        this.f139108t = textField2;
        this.f139109u = linearLayout;
        this.f139110v = robotoTextView2;
        this.f139111w = horizontalScrollView;
        this.f139112x = textField3;
        this.f139113y = linearLayout2;
        this.f139114z = zdsActionBar;
    }

    /* renamed from: a */
    public static C29999q9 m148406a(View view) {
        int i11 = AbstractC6918a0.btn_delete;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.product_catalog_text_field;
            TextField textField = (TextField) AbstractC22716b.m117526a(view, i11);
            if (textField != null) {
                i11 = AbstractC6918a0.product_description_text_area;
                TextArea textArea = (TextArea) AbstractC22716b.m117526a(view, i11);
                if (textArea != null) {
                    i11 = AbstractC6918a0.product_name_text_field;
                    TextField textField2 = (TextField) AbstractC22716b.m117526a(view, i11);
                    if (textField2 != null) {
                        i11 = AbstractC6918a0.product_photo_container;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.product_photo_section_title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView2 != null) {
                                i11 = AbstractC6918a0.product_photos_scroll_view;
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AbstractC22716b.m117526a(view, i11);
                                if (horizontalScrollView != null) {
                                    i11 = AbstractC6918a0.product_price_text_field;
                                    TextField textField3 = (TextField) AbstractC22716b.m117526a(view, i11);
                                    if (textField3 != null) {
                                        i11 = AbstractC6918a0.scroll_content;
                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout2 != null) {
                                            i11 = AbstractC6918a0.zds_action_bar;
                                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                            if (zdsActionBar != null) {
                                                return new C29999q9((RelativeLayout) view, robotoTextView, textField, textArea, textField2, linearLayout, robotoTextView2, horizontalScrollView, textField3, linearLayout2, zdsActionBar);
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

    /* renamed from: c */
    public static C29999q9 m148407c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_product_creating_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148406a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139104p;
    }
}

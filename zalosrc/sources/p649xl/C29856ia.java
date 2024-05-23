package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TextArea;
import com.zing.zalo.zdesign.component.TextField;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ia */
/* loaded from: classes3.dex */
public final class C29856ia implements InterfaceC22715a {

    /* renamed from: p */
    private final KeyboardFrameLayout f138171p;

    /* renamed from: q */
    public final RobotoTextView f138172q;

    /* renamed from: r */
    public final RelativeLayout f138173r;

    /* renamed from: s */
    public final ZAppCompatImageView f138174s;

    /* renamed from: t */
    public final TextField f138175t;

    /* renamed from: u */
    public final TextArea f138176u;

    /* renamed from: v */
    public final ZAppCompatImageView f138177v;

    /* renamed from: w */
    public final RecyclingImageView f138178w;

    /* renamed from: x */
    public final ZdsActionBar f138179x;

    private C29856ia(KeyboardFrameLayout keyboardFrameLayout, RobotoTextView robotoTextView, RelativeLayout relativeLayout, ZAppCompatImageView zAppCompatImageView, TextField textField, TextArea textArea, ZAppCompatImageView zAppCompatImageView2, RecyclingImageView recyclingImageView, ZdsActionBar zdsActionBar) {
        this.f138171p = keyboardFrameLayout;
        this.f138172q = robotoTextView;
        this.f138173r = relativeLayout;
        this.f138174s = zAppCompatImageView;
        this.f138175t = textField;
        this.f138176u = textArea;
        this.f138177v = zAppCompatImageView2;
        this.f138178w = recyclingImageView;
        this.f138179x = zdsActionBar;
    }

    /* renamed from: a */
    public static C29856ia m148079a(View view) {
        int i11 = AbstractC6918a0.btn_delete;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.btn_upload;
            RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
            if (relativeLayout != null) {
                i11 = AbstractC6918a0.ic_add_attachment;
                ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                if (zAppCompatImageView != null) {
                    i11 = AbstractC6918a0.keyword_input_field;
                    TextField textField = (TextField) AbstractC22716b.m117526a(view, i11);
                    if (textField != null) {
                        i11 = AbstractC6918a0.message_input_field;
                        TextArea textArea = (TextArea) AbstractC22716b.m117526a(view, i11);
                        if (textArea != null) {
                            i11 = AbstractC6918a0.remove_attachment_btn;
                            ZAppCompatImageView zAppCompatImageView2 = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                            if (zAppCompatImageView2 != null) {
                                i11 = AbstractC6918a0.thumb_image;
                                RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                if (recyclingImageView != null) {
                                    i11 = AbstractC6918a0.zds_action_bar;
                                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                    if (zdsActionBar != null) {
                                        return new C29856ia((KeyboardFrameLayout) view, robotoTextView, relativeLayout, zAppCompatImageView, textField, textArea, zAppCompatImageView2, recyclingImageView, zdsActionBar);
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
    public static C29856ia m148080c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.quick_message_creating_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148079a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f138171p;
    }
}

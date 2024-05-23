package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.custom.PhotoToggleButton;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r1 */
/* loaded from: classes3.dex */
public final class C30009r1 implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f139170A;

    /* renamed from: B */
    public final RobotoTextView f139171B;

    /* renamed from: C */
    public final RobotoTextView f139172C;

    /* renamed from: D */
    public final RobotoTextView f139173D;

    /* renamed from: E */
    public final RobotoTextView f139174E;

    /* renamed from: F */
    public final LinearLayout f139175F;

    /* renamed from: p */
    private final KeyboardFrameLayout f139176p;

    /* renamed from: q */
    public final RecyclingImageView f139177q;

    /* renamed from: r */
    public final RobotoTextView f139178r;

    /* renamed from: s */
    public final EditTextWithContextMenu f139179s;

    /* renamed from: t */
    public final RecyclingImageView f139180t;

    /* renamed from: u */
    public final View f139181u;

    /* renamed from: v */
    public final RelativeLayout f139182v;

    /* renamed from: w */
    public final LinearLayout f139183w;

    /* renamed from: x */
    public final LinearLayout f139184x;

    /* renamed from: y */
    public final PhotoToggleButton f139185y;

    /* renamed from: z */
    public final NestedScrollView f139186z;

    private C30009r1(KeyboardFrameLayout keyboardFrameLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, EditTextWithContextMenu editTextWithContextMenu, RecyclingImageView recyclingImageView2, View view, RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, PhotoToggleButton photoToggleButton, NestedScrollView nestedScrollView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RobotoTextView robotoTextView6, LinearLayout linearLayout3) {
        this.f139176p = keyboardFrameLayout;
        this.f139177q = recyclingImageView;
        this.f139178r = robotoTextView;
        this.f139179s = editTextWithContextMenu;
        this.f139180t = recyclingImageView2;
        this.f139181u = view;
        this.f139182v = relativeLayout;
        this.f139183w = linearLayout;
        this.f139184x = linearLayout2;
        this.f139185y = photoToggleButton;
        this.f139186z = nestedScrollView;
        this.f139170A = robotoTextView2;
        this.f139171B = robotoTextView3;
        this.f139172C = robotoTextView4;
        this.f139173D = robotoTextView5;
        this.f139174E = robotoTextView6;
        this.f139175F = linearLayout3;
    }

    /* renamed from: a */
    public static C30009r1 m148426a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_remove_alias;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.btn_save;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.edit_alias;
                EditTextWithContextMenu editTextWithContextMenu = (EditTextWithContextMenu) AbstractC22716b.m117526a(view, i11);
                if (editTextWithContextMenu != null) {
                    i11 = AbstractC6918a0.icn_header_close;
                    RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_edt))) != null) {
                        i11 = AbstractC6918a0.ll_header;
                        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout != null) {
                            i11 = AbstractC6918a0.ll_main_content;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                i11 = AbstractC6918a0.main_action_container;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = AbstractC6918a0.pcb_save_to_phonebook;
                                    PhotoToggleButton photoToggleButton = (PhotoToggleButton) AbstractC22716b.m117526a(view, i11);
                                    if (photoToggleButton != null) {
                                        i11 = AbstractC6918a0.scroll_container;
                                        NestedScrollView nestedScrollView = (NestedScrollView) AbstractC22716b.m117526a(view, i11);
                                        if (nestedScrollView != null) {
                                            i11 = AbstractC6918a0.tv_count_chars;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView2 != null) {
                                                i11 = AbstractC6918a0.tv_header_title;
                                                RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                if (robotoTextView3 != null) {
                                                    i11 = AbstractC6918a0.tv_save_to_phonebook;
                                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView4 != null) {
                                                        i11 = AbstractC6918a0.tv_suggest_contact_name;
                                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView5 != null) {
                                                            i11 = AbstractC6918a0.txt_error_msg;
                                                            RobotoTextView robotoTextView6 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                            if (robotoTextView6 != null) {
                                                                i11 = AbstractC6918a0.update_to_phonebook_container;
                                                                LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (linearLayout3 != null) {
                                                                    return new C30009r1((KeyboardFrameLayout) view, recyclingImageView, robotoTextView, editTextWithContextMenu, recyclingImageView2, m117526a, relativeLayout, linearLayout, linearLayout2, photoToggleButton, nestedScrollView, robotoTextView2, robotoTextView3, robotoTextView4, robotoTextView5, robotoTextView6, linearLayout3);
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

    /* renamed from: c */
    public static C30009r1 m148427c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_alias_bottom_sheet_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148426a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f139176p;
    }
}

package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.oa */
/* loaded from: classes3.dex */
public final class C29964oa implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138884p;

    /* renamed from: q */
    public final RobotoTextView f138885q;

    /* renamed from: r */
    public final ListItem f138886r;

    /* renamed from: s */
    public final ListItem f138887s;

    /* renamed from: t */
    public final Button f138888t;

    /* renamed from: u */
    public final LinearLayout f138889u;

    /* renamed from: v */
    public final LinearLayout f138890v;

    /* renamed from: w */
    public final RobotoTextView f138891w;

    /* renamed from: x */
    public final RobotoTextView f138892x;

    /* renamed from: y */
    public final ZdsActionBar f138893y;

    private C29964oa(LinearLayout linearLayout, RobotoTextView robotoTextView, ListItem listItem, ListItem listItem2, Button button, LinearLayout linearLayout2, LinearLayout linearLayout3, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, ZdsActionBar zdsActionBar) {
        this.f138884p = linearLayout;
        this.f138885q = robotoTextView;
        this.f138886r = listItem;
        this.f138887s = listItem2;
        this.f138888t = button;
        this.f138889u = linearLayout2;
        this.f138890v = linearLayout3;
        this.f138891w = robotoTextView2;
        this.f138892x = robotoTextView3;
        this.f138893y = zdsActionBar;
    }

    /* renamed from: a */
    public static C29964oa m148328a(View view) {
        int i11 = AbstractC6918a0.attachment_desc;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.attachment_messages;
            ListItem listItem = (ListItem) AbstractC22716b.m117526a(view, i11);
            if (listItem != null) {
                i11 = AbstractC6918a0.attachment_photos;
                ListItem listItem2 = (ListItem) AbstractC22716b.m117526a(view, i11);
                if (listItem2 != null) {
                    i11 = AbstractC6918a0.btn_attachment_done;
                    Button button = (Button) AbstractC22716b.m117526a(view, i11);
                    if (button != null) {
                        i11 = AbstractC6918a0.ll_layout_photo;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.ll_report_reason;
                            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout2 != null) {
                                i11 = AbstractC6918a0.report_name_uid;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    i11 = AbstractC6918a0.report_reason;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView3 != null) {
                                        i11 = AbstractC6918a0.zds_action_bar;
                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                        if (zdsActionBar != null) {
                                            return new C29964oa((LinearLayout) view, robotoTextView, listItem, listItem2, button, linearLayout, linearLayout2, robotoTextView2, robotoTextView3, zdsActionBar);
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
    public static C29964oa m148329c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.report_attachment_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148328a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138884p;
    }
}

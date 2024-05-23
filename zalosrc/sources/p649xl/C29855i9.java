package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RecyclerViewWithMaxHeight;
import com.zing.zalo.p077ui.widget.ReminderEventItemView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i9 */
/* loaded from: classes3.dex */
public final class C29855i9 implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f138158A;

    /* renamed from: B */
    public final ReminderEventItemView f138159B;

    /* renamed from: p */
    private final LinearLayout f138160p;

    /* renamed from: q */
    public final RobotoTextView f138161q;

    /* renamed from: r */
    public final RobotoTextView f138162r;

    /* renamed from: s */
    public final LinearLayout f138163s;

    /* renamed from: t */
    public final LinearLayout f138164t;

    /* renamed from: u */
    public final LinearLayout f138165u;

    /* renamed from: v */
    public final RobotoTextView f138166v;

    /* renamed from: w */
    public final RobotoTextView f138167w;

    /* renamed from: x */
    public final RecyclerViewWithMaxHeight f138168x;

    /* renamed from: y */
    public final LinearLayout f138169y;

    /* renamed from: z */
    public final LinearLayout f138170z;

    private C29855i9(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RobotoTextView robotoTextView3, RobotoTextView robotoTextView4, RecyclerViewWithMaxHeight recyclerViewWithMaxHeight, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, ReminderEventItemView reminderEventItemView) {
        this.f138160p = linearLayout;
        this.f138161q = robotoTextView;
        this.f138162r = robotoTextView2;
        this.f138163s = linearLayout2;
        this.f138164t = linearLayout3;
        this.f138165u = linearLayout4;
        this.f138166v = robotoTextView3;
        this.f138167w = robotoTextView4;
        this.f138168x = recyclerViewWithMaxHeight;
        this.f138169y = linearLayout5;
        this.f138170z = linearLayout6;
        this.f138158A = linearLayout7;
        this.f138159B = reminderEventItemView;
    }

    /* renamed from: a */
    public static C29855i9 m148076a(View view) {
        int i11 = AbstractC6918a0.action_open_group_board;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.action_open_group_calendar;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.collapse_btn;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i11 = AbstractC6918a0.edit_pinboard_btn;
                    LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout3 != null) {
                        i11 = AbstractC6918a0.empty_pinboard;
                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView3 != null) {
                            i11 = AbstractC6918a0.empty_upcoming_event;
                            RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView4 != null) {
                                i11 = AbstractC6918a0.list_pin_board;
                                RecyclerViewWithMaxHeight recyclerViewWithMaxHeight = (RecyclerViewWithMaxHeight) AbstractC22716b.m117526a(view, i11);
                                if (recyclerViewWithMaxHeight != null) {
                                    i11 = AbstractC6918a0.main_layout;
                                    LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                    if (linearLayout4 != null) {
                                        i11 = AbstractC6918a0.section_pin_board;
                                        LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout5 != null) {
                                            i11 = AbstractC6918a0.section_upcoming_events;
                                            LinearLayout linearLayout6 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout6 != null) {
                                                i11 = AbstractC6918a0.upcoming_event;
                                                ReminderEventItemView reminderEventItemView = (ReminderEventItemView) AbstractC22716b.m117526a(view, i11);
                                                if (reminderEventItemView != null) {
                                                    return new C29855i9(linearLayout2, robotoTextView, robotoTextView2, linearLayout, linearLayout2, linearLayout3, robotoTextView3, robotoTextView4, recyclerViewWithMaxHeight, linearLayout4, linearLayout5, linearLayout6, reminderEventItemView);
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
    public static C29855i9 m148077c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.pin_board_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148076a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138160p;
    }
}

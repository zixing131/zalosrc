package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.RadioButton;
import com.zing.zalo.zdesign.component.TextArea;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.i */
/* loaded from: classes3.dex */
public final class C29845i implements InterfaceC22715a {

    /* renamed from: A */
    public final LinearLayout f138076A;

    /* renamed from: B */
    public final RadioButton f138077B;

    /* renamed from: C */
    public final LinearLayout f138078C;

    /* renamed from: D */
    public final RadioButton f138079D;

    /* renamed from: E */
    public final LinearLayout f138080E;

    /* renamed from: F */
    public final RadioButton f138081F;

    /* renamed from: G */
    public final LinearLayout f138082G;

    /* renamed from: H */
    public final RadioButton f138083H;

    /* renamed from: I */
    public final LinearLayout f138084I;

    /* renamed from: J */
    public final RadioButton f138085J;

    /* renamed from: K */
    public final RobotoTextView f138086K;

    /* renamed from: L */
    public final ZdsActionBar f138087L;

    /* renamed from: p */
    private final LinearLayout f138088p;

    /* renamed from: q */
    public final RobotoTextView f138089q;

    /* renamed from: r */
    public final TextArea f138090r;

    /* renamed from: s */
    public final RobotoTextView f138091s;

    /* renamed from: t */
    public final RobotoTextView f138092t;

    /* renamed from: u */
    public final LinearLayout f138093u;

    /* renamed from: v */
    public final RadioButton f138094v;

    /* renamed from: w */
    public final LinearLayout f138095w;

    /* renamed from: x */
    public final RadioButton f138096x;

    /* renamed from: y */
    public final LinearLayout f138097y;

    /* renamed from: z */
    public final RadioButton f138098z;

    private C29845i(LinearLayout linearLayout, RobotoTextView robotoTextView, TextArea textArea, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, LinearLayout linearLayout2, RadioButton radioButton, LinearLayout linearLayout3, RadioButton radioButton2, LinearLayout linearLayout4, RadioButton radioButton3, LinearLayout linearLayout5, RadioButton radioButton4, LinearLayout linearLayout6, RadioButton radioButton5, LinearLayout linearLayout7, RadioButton radioButton6, LinearLayout linearLayout8, RadioButton radioButton7, LinearLayout linearLayout9, RadioButton radioButton8, RobotoTextView robotoTextView4, ZdsActionBar zdsActionBar) {
        this.f138088p = linearLayout;
        this.f138089q = robotoTextView;
        this.f138090r = textArea;
        this.f138091s = robotoTextView2;
        this.f138092t = robotoTextView3;
        this.f138093u = linearLayout2;
        this.f138094v = radioButton;
        this.f138095w = linearLayout3;
        this.f138096x = radioButton2;
        this.f138097y = linearLayout4;
        this.f138098z = radioButton3;
        this.f138076A = linearLayout5;
        this.f138077B = radioButton4;
        this.f138078C = linearLayout6;
        this.f138079D = radioButton5;
        this.f138080E = linearLayout7;
        this.f138081F = radioButton6;
        this.f138082G = linearLayout8;
        this.f138083H = radioButton7;
        this.f138084I = linearLayout9;
        this.f138085J = radioButton8;
        this.f138086K = robotoTextView4;
        this.f138087L = zdsActionBar;
    }

    /* renamed from: a */
    public static C29845i m148050a(View view) {
        int i11 = AbstractC6918a0.btn_delete;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.content_input_text;
            TextArea textArea = (TextArea) AbstractC22716b.m117526a(view, i11);
            if (textArea != null) {
                i11 = AbstractC6918a0.receiver_friends_exclude_desc;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.receiver_friends_include_desc;
                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView3 != null) {
                        i11 = AbstractC6918a0.receiver_option_all_friends;
                        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout != null) {
                            i11 = AbstractC6918a0.receiver_option_all_friends_radio_btn;
                            RadioButton radioButton = (RadioButton) AbstractC22716b.m117526a(view, i11);
                            if (radioButton != null) {
                                i11 = AbstractC6918a0.receiver_option_friends_exclude;
                                LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                if (linearLayout2 != null) {
                                    i11 = AbstractC6918a0.receiver_option_friends_exclude_radio_btn;
                                    RadioButton radioButton2 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                    if (radioButton2 != null) {
                                        i11 = AbstractC6918a0.receiver_option_friends_include;
                                        LinearLayout linearLayout3 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                        if (linearLayout3 != null) {
                                            i11 = AbstractC6918a0.receiver_option_friends_include_radio_btn;
                                            RadioButton radioButton3 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                            if (radioButton3 != null) {
                                                i11 = AbstractC6918a0.receiver_option_strangers;
                                                LinearLayout linearLayout4 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                if (linearLayout4 != null) {
                                                    i11 = AbstractC6918a0.receiver_option_strangers_radio_btn;
                                                    RadioButton radioButton4 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                    if (radioButton4 != null) {
                                                        i11 = AbstractC6918a0.time_option_1200_1330;
                                                        LinearLayout linearLayout5 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                        if (linearLayout5 != null) {
                                                            i11 = AbstractC6918a0.time_option_1200_1330_radio_btn;
                                                            RadioButton radioButton5 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                            if (radioButton5 != null) {
                                                                i11 = AbstractC6918a0.time_option_1800_0730;
                                                                LinearLayout linearLayout6 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                if (linearLayout6 != null) {
                                                                    i11 = AbstractC6918a0.time_option_1800_0730_radio_btn;
                                                                    RadioButton radioButton6 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                                    if (radioButton6 != null) {
                                                                        i11 = AbstractC6918a0.time_option_all_day;
                                                                        LinearLayout linearLayout7 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                        if (linearLayout7 != null) {
                                                                            i11 = AbstractC6918a0.time_option_all_day_radio_btn;
                                                                            RadioButton radioButton7 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                                            if (radioButton7 != null) {
                                                                                i11 = AbstractC6918a0.time_option_custom;
                                                                                LinearLayout linearLayout8 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                                if (linearLayout8 != null) {
                                                                                    i11 = AbstractC6918a0.time_option_custom_radio_btn;
                                                                                    RadioButton radioButton8 = (RadioButton) AbstractC22716b.m117526a(view, i11);
                                                                                    if (radioButton8 != null) {
                                                                                        i11 = AbstractC6918a0.time_option_custom_subtitle;
                                                                                        RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                                                        if (robotoTextView4 != null) {
                                                                                            i11 = AbstractC6918a0.zds_action_bar;
                                                                                            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                                                                            if (zdsActionBar != null) {
                                                                                                return new C29845i((LinearLayout) view, robotoTextView, textArea, robotoTextView2, robotoTextView3, linearLayout, radioButton, linearLayout2, radioButton2, linearLayout3, radioButton3, linearLayout4, radioButton4, linearLayout5, radioButton5, linearLayout6, radioButton6, linearLayout7, radioButton7, linearLayout8, radioButton8, robotoTextView4, zdsActionBar);
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
    public static C29845i m148051c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.auto_reply_creating_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148050a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138088p;
    }
}

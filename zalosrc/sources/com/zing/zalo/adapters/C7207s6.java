package com.zing.zalo.adapters;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7207s6;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.DecorModuleView;
import com.zing.zalo.p077ui.moduleview.search.SeeMoreModuleView;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uidrawing.ModulesView;
import ea0.C18333g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p716zh.C32020m7;
import q80.C25182u;

/* renamed from: com.zing.zalo.adapters.s6 */
/* loaded from: classes3.dex */
public class C7207s6 extends RecyclerView.AbstractC1880g implements SeeMoreModuleView.InterfaceC12457a {

    /* renamed from: F */
    public d f39501F;

    /* renamed from: r */
    List f39507r = new ArrayList();

    /* renamed from: s */
    List f39508s = new ArrayList();

    /* renamed from: t */
    List f39509t = new ArrayList();

    /* renamed from: u */
    List f39510u = new ArrayList();

    /* renamed from: v */
    List f39511v = new ArrayList();

    /* renamed from: w */
    List f39512w = new ArrayList();

    /* renamed from: x */
    List f39513x = new ArrayList();

    /* renamed from: y */
    List f39514y = new ArrayList();

    /* renamed from: z */
    List f39515z = new ArrayList();

    /* renamed from: A */
    List f39496A = new ArrayList();

    /* renamed from: B */
    List f39497B = new ArrayList();

    /* renamed from: C */
    List f39498C = new ArrayList();

    /* renamed from: D */
    List f39499D = new ArrayList();

    /* renamed from: E */
    List f39500E = new ArrayList();

    /* renamed from: G */
    boolean f39502G = false;

    /* renamed from: H */
    public boolean f39503H = false;

    /* renamed from: I */
    boolean f39504I = false;

    /* renamed from: K */
    boolean f39506K = false;

    /* renamed from: J */
    C23528a f39505J = new C23528a(MainApplication.getAppContext());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.s6$a */
    /* loaded from: classes3.dex */
    public class a extends e {

        /* renamed from: J */
        public ModulesView f39516J;

        public a(ModulesView modulesView, Context context) {
            super(modulesView, context);
            this.f39516J = modulesView;
        }

        @Override // com.zing.zalo.adapters.C7207s6.e
        /* renamed from: i0 */
        public void mo36668i0(C32020m7 c32020m7, int i11, int i12) {
            super.mo36668i0(c32020m7, i11, i12);
            try {
                super.mo36668i0(c32020m7, i11, i12);
                ModulesView modulesView = this.f39516J;
                if (modulesView instanceof SeeMoreModuleView) {
                    ((SeeMoreModuleView) modulesView).m69926V(c32020m7, C7207s6.this.f39502G, i11);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.s6$b */
    /* loaded from: classes3.dex */
    public class b extends e {

        /* renamed from: J */
        private final C25182u f39518J;

        /* renamed from: K */
        private final ColorStateList f39519K;

        /* renamed from: L */
        private final ColorStateList f39520L;

        public b(View view, C25182u c25182u) {
            super(view, view.getContext());
            this.f39519K = AbstractC23136l9.m118643C(AbstractC16801x.bg_btn_type1_text);
            this.f39520L = AbstractC23136l9.m118643C(AbstractC16801x.bg_btn_type2_text);
            this.f39518J = c25182u;
        }

        @Override // com.zing.zalo.adapters.C7207s6.e
        /* renamed from: i0 */
        public void mo36668i0(C32020m7 c32020m7, int i11, int i12) {
            C25182u c25182u = this.f39518J;
            C7207s6 c7207s6 = C7207s6.this;
            C18333g1.m97276k(c25182u, c7207s6, c32020m7, i12, c7207s6.f39503H, c7207s6.f39502G, i11, this.f39519K, this.f39520L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.s6$c */
    /* loaded from: classes3.dex */
    public class c extends e {

        /* renamed from: J */
        public TextView f39522J;

        /* renamed from: K */
        public TextView f39523K;

        /* renamed from: L */
        public TextView f39524L;

        /* renamed from: M */
        public TextView f39525M;

        /* renamed from: N */
        public ProgressBar f39526N;

        /* renamed from: O */
        public View f39527O;

        /* renamed from: P */
        public AvatarImageView f39528P;

        /* renamed from: Q */
        public RobotoTextView f39529Q;

        /* renamed from: R */
        public RobotoTextView f39530R;

        /* renamed from: S */
        public View f39531S;

        /* renamed from: T */
        public View f39532T;

        /* renamed from: U */
        public RobotoTextView f39533U;

        /* renamed from: V */
        public View f39534V;

        /* renamed from: W */
        public View f39535W;

        /* renamed from: X */
        public View f39536X;

        /* renamed from: Y */
        public View f39537Y;

        public c(View view, Context context, int i11) {
            super(view, context);
            if (i11 == 0) {
                this.f39522J = (TextView) view.findViewById(AbstractC6918a0.title_label);
                this.f39523K = (TextView) view.findViewById(AbstractC6918a0.title_funtion);
                return;
            }
            if (i11 == 3) {
                this.f39527O = view.findViewById(AbstractC6918a0.extra_view_item_end);
                return;
            }
            if (i11 != 5 && i11 != 8 && i11 != 9 && i11 != 11) {
                if (i11 == 4) {
                    this.f39524L = (TextView) view.findViewById(AbstractC6918a0.empty_contact_result);
                    return;
                }
                if (i11 == 6) {
                    this.f39525M = (TextView) view.findViewById(AbstractC6918a0.empty_oa_error);
                    this.f39526N = (ProgressBar) view.findViewById(AbstractC6918a0.holoCircularProgressBar);
                    return;
                } else {
                    if (i11 == 7) {
                        this.f39532T = view.findViewById(AbstractC6918a0.separate_line_complete_word);
                        this.f39534V = view.findViewById(AbstractC6918a0.extra_item_topview);
                        this.f39535W = view.findViewById(AbstractC6918a0.extra_item_endview);
                        this.f39536X = view.findViewById(AbstractC6918a0.extra_item_next_section);
                        this.f39537Y = view.findViewById(AbstractC6918a0.ic_jump_search);
                        this.f39533U = (RobotoTextView) view.findViewById(AbstractC6918a0.name_hint_word);
                        return;
                    }
                    return;
                }
            }
            this.f39529Q = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
            this.f39530R = (RobotoTextView) view.findViewById(AbstractC6918a0.description_oa);
            this.f39528P = (AvatarImageView) view.findViewById(AbstractC6918a0.buddy_dp);
            this.f39531S = view.findViewById(AbstractC6918a0.icon_next);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public /* synthetic */ void m36671l0(View view) {
            C7207s6.this.f39501F.mo36677PE();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public /* synthetic */ void m36672m0(String str, View view) {
            C7207s6.this.f39501F.mo36676Jo(str);
        }

        @Override // com.zing.zalo.adapters.C7207s6.e
        /* renamed from: i0 */
        public void mo36668i0(C32020m7 c32020m7, int i11, int i12) {
            RobotoTextView robotoTextView;
            View view;
            int i13;
            int i14;
            int i15;
            TextView textView;
            super.mo36668i0(c32020m7, i11, i12);
            ContactProfile contactProfile = c32020m7.f147411b;
            int i16 = 8;
            if (i12 == 0) {
                this.f39523K.setVisibility(8);
                if (contactProfile.f42434r.equals("-1")) {
                    this.f39522J.setText(contactProfile.f42437s);
                    if (contactProfile.f42407e1) {
                        this.f39523K.setVisibility(8);
                        return;
                    }
                    this.f39523K.setText(this.f39539I.getString(AbstractC8020f0.label_clear_history_search_contact));
                    this.f39523K.setVisibility(0);
                    this.f39523K.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.t6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C7207s6.c.this.m36671l0(view2);
                        }
                    });
                    return;
                }
                if (contactProfile.f42434r.equals("-22")) {
                    this.f39522J.setText(this.f39539I.getString(AbstractC8020f0.label_section_suggest_oa));
                    return;
                }
                if (!contactProfile.f42434r.equals("-3") && !contactProfile.f42434r.equals("-17") && !contactProfile.f42434r.equals("-20")) {
                    if (contactProfile.f42434r.equals("-4")) {
                        this.f39522J.setText(this.f39539I.getString(AbstractC8020f0.zalopagemsg_title));
                        return;
                    } else {
                        if (contactProfile.f42434r.equals("-12")) {
                            this.f39522J.setText(this.f39539I.getString(AbstractC8020f0.search_msg_title));
                            return;
                        }
                        return;
                    }
                }
                this.f39522J.setText(contactProfile.f42437s);
                return;
            }
            if (i12 == 6) {
                if (contactProfile != null && (textView = this.f39525M) != null && this.f39526N != null) {
                    if (contactProfile.f42407e1) {
                        textView.setVisibility(0);
                        this.f39526N.setVisibility(8);
                        return;
                    } else {
                        textView.setVisibility(8);
                        this.f39526N.setVisibility(0);
                        return;
                    }
                }
                return;
            }
            if (i12 == 4) {
                TextView textView2 = this.f39524L;
                if (textView2 != null) {
                    textView2.setText(contactProfile.f42437s);
                    return;
                }
                return;
            }
            if (i12 == 7) {
                View view2 = this.f39532T;
                if (view2 != null) {
                    if (contactProfile.f42405d1) {
                        i15 = 0;
                    } else {
                        i15 = 8;
                    }
                    view2.setVisibility(i15);
                }
                View view3 = this.f39535W;
                if (view3 != null) {
                    if (contactProfile.f42405d1) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    view3.setVisibility(i14);
                }
                View view4 = this.f39536X;
                if (view4 != null) {
                    if (contactProfile.f42405d1) {
                        i13 = 0;
                    } else {
                        i13 = 8;
                    }
                    view4.setVisibility(i13);
                }
                View view5 = this.f39534V;
                if (view5 != null) {
                    if (contactProfile.f42407e1) {
                        i16 = 0;
                    }
                    view5.setVisibility(i16);
                }
                RobotoTextView robotoTextView2 = this.f39533U;
                if (robotoTextView2 != null) {
                    robotoTextView2.setText(contactProfile.f42437s);
                }
                View view6 = this.f39537Y;
                if (view6 != null) {
                    final String str = contactProfile.f42437s;
                    view6.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.u6
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view7) {
                            C7207s6.c.this.m36672m0(str, view7);
                        }
                    });
                    return;
                }
                return;
            }
            if (i12 != 5 && i12 != 8 && i12 != 9 && i12 != 11) {
                if (i12 == 3 && (view = this.f39527O) != null) {
                    if (contactProfile.f42405d1) {
                        i16 = 0;
                    }
                    view.setVisibility(i16);
                    return;
                }
                return;
            }
            if (i12 == 11) {
                if (this.f39529Q != null) {
                    int length = MainApplication.getAppContext().getString(AbstractC8020f0.str_title_find_username).replace("%s", "").length();
                    int length2 = c32020m7.f147425p.length() + length;
                    SpannableString spannableString = new SpannableString(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_title_find_username), c32020m7.f147425p));
                    if (length >= 0 && length < length2 && length2 <= spannableString.length()) {
                        spannableString.setSpan(new StyleSpan(1), length, length2, 33);
                    }
                    this.f39529Q.setText(spannableString);
                }
                RobotoTextView robotoTextView3 = this.f39530R;
                if (robotoTextView3 != null) {
                    robotoTextView3.setText(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_des_find_username), c32020m7.f147425p));
                    this.f39530R.setVisibility(0);
                }
                AvatarImageView avatarImageView = this.f39528P;
                if (avatarImageView != null) {
                    avatarImageView.setImageResource(AbstractC16803z.ava_tag_username);
                }
                View view7 = this.f39531S;
                if (view7 != null) {
                    view7.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f39529Q != null) {
                if (contactProfile.f42399a1.isEmpty()) {
                    this.f39529Q.setText(contactProfile.m40383Q(true, false).trim());
                } else {
                    SpannableString spannableString2 = new SpannableString(contactProfile.m40383Q(true, false).trim());
                    for (int i17 = 0; i17 < contactProfile.f42399a1.size() - 1; i17 += 2) {
                        try {
                            if (((Integer) contactProfile.f42399a1.get(i17)).intValue() >= 0) {
                                int i18 = i17 + 1;
                                if (((Integer) contactProfile.f42399a1.get(i18)).intValue() > ((Integer) contactProfile.f42399a1.get(i17)).intValue()) {
                                    spannableString2.setSpan(new StyleSpan(1), ((Integer) contactProfile.f42399a1.get(i17)).intValue(), ((Integer) contactProfile.f42399a1.get(i18)).intValue(), 33);
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    this.f39529Q.setText(spannableString2);
                }
            }
            AvatarImageView avatarImageView2 = this.f39528P;
            if (avatarImageView2 != null) {
                if (i12 == 5) {
                    avatarImageView2.setImageResource(AbstractC16803z.ic_add_zalopage);
                } else {
                    avatarImageView2.setImageResource(AbstractC16803z.ava_search_autohint);
                }
            }
            if (!TextUtils.isEmpty(contactProfile.m40378N()) && (robotoTextView = this.f39530R) != null) {
                robotoTextView.setText(contactProfile.m40378N());
                this.f39530R.setVisibility(0);
            } else {
                RobotoTextView robotoTextView4 = this.f39530R;
                if (robotoTextView4 != null) {
                    robotoTextView4.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.s6$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: CI */
        String mo36673CI();

        /* renamed from: Dr */
        void mo36674Dr(C32020m7 c32020m7, int i11, int i12, boolean z11);

        /* renamed from: F9 */
        void mo36675F9(C32020m7 c32020m7, int i11, boolean z11, boolean z12, boolean z13);

        /* renamed from: Jo */
        void mo36676Jo(String str);

        /* renamed from: PE */
        void mo36677PE();

        /* renamed from: Pl */
        void mo36678Pl(C32020m7 c32020m7, int i11, View view);

        /* renamed from: qk */
        boolean mo36679qk(C32020m7 c32020m7, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.s6$e */
    /* loaded from: classes3.dex */
    public static class e extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public Context f39539I;

        public e(View view, Context context) {
            super(view);
            this.f39539I = context;
        }

        /* renamed from: i0 */
        public void mo36668i0(C32020m7 c32020m7, int i11, int i12) {
        }
    }

    public C7207s6(d dVar) {
        this.f39501F = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m36656S(C32020m7 c32020m7, int i11, View view) {
        d dVar = this.f39501F;
        if (dVar != null) {
            dVar.mo36675F9(c32020m7, i11, false, true, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ boolean m36657T(C32020m7 c32020m7, int i11, View view) {
        d dVar = this.f39501F;
        if (dVar == null) {
            return false;
        }
        return dVar.mo36679qk(c32020m7, i11, false);
    }

    /* renamed from: N */
    public b m36658N(ViewGroup viewGroup, C23528a c23528a) {
        DecorModuleView decorModuleView = new DecorModuleView(viewGroup.getContext(), new C25182u(viewGroup.getContext(), c23528a));
        return new b(decorModuleView, (C25182u) decorModuleView.getModule());
    }

    /* renamed from: O */
    public List m36659O() {
        try {
            return new ArrayList(this.f39507r);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: P */
    public C32020m7 m36660P(int i11) {
        if (this.f39506K) {
            if (this.f39504I) {
                if (i11 < this.f39510u.size()) {
                    return (C32020m7) this.f39510u.get(i11);
                }
                if (i11 < this.f39508s.size() + this.f39510u.size()) {
                    return (C32020m7) this.f39508s.get(i11 - this.f39510u.size());
                }
                if (i11 < this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
                    return (C32020m7) this.f39509t.get((i11 - this.f39508s.size()) - this.f39510u.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
                    return (C32020m7) this.f39507r.get(((i11 - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39510u.size() + this.f39508s.size() + this.f39511v.size()) {
                    return (C32020m7) this.f39511v.get((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                    return (C32020m7) this.f39513x.get(((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                    return (C32020m7) this.f39512w.get((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                    return (C32020m7) this.f39514y.get(((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
                }
                if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size() + this.f39515z.size()) {
                    return (C32020m7) this.f39515z.get((((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size()) - this.f39514y.size());
                }
                return null;
            }
            if (i11 < this.f39510u.size()) {
                return (C32020m7) this.f39510u.get(i11);
            }
            if (i11 < this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39508s.get(i11 - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39507r.get((i11 - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39509t.get(((i11 - this.f39507r.size()) - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39510u.size() + this.f39508s.size() + this.f39511v.size()) {
                return (C32020m7) this.f39511v.get((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39513x.get(((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39512w.get((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39514y.get(((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size() + this.f39515z.size()) {
                return (C32020m7) this.f39515z.get((((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size()) - this.f39514y.size());
            }
            return null;
        }
        if (this.f39504I) {
            if (i11 < this.f39510u.size()) {
                return (C32020m7) this.f39510u.get(i11);
            }
            if (i11 < this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39508s.get(i11 - this.f39510u.size());
            }
            if (i11 < this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39509t.get((i11 - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
                return (C32020m7) this.f39507r.get(((i11 - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39510u.size() + this.f39508s.size() + this.f39511v.size()) {
                return (C32020m7) this.f39511v.get((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39512w.get(((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39513x.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39513x.get((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39513x.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
                return (C32020m7) this.f39514y.get(((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39512w.size()) - this.f39513x.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
            }
            if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size() + this.f39515z.size()) {
                return (C32020m7) this.f39515z.get((((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size()) - this.f39514y.size());
            }
            return null;
        }
        if (i11 < this.f39510u.size()) {
            return (C32020m7) this.f39510u.get(i11);
        }
        if (i11 < this.f39508s.size() + this.f39510u.size()) {
            return (C32020m7) this.f39508s.get(i11 - this.f39510u.size());
        }
        if (i11 < this.f39507r.size() + this.f39508s.size() + this.f39510u.size()) {
            return (C32020m7) this.f39507r.get((i11 - this.f39508s.size()) - this.f39510u.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39508s.size() + this.f39510u.size()) {
            return (C32020m7) this.f39509t.get(((i11 - this.f39507r.size()) - this.f39508s.size()) - this.f39510u.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39510u.size() + this.f39508s.size() + this.f39511v.size()) {
            return (C32020m7) this.f39511v.get((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
            return (C32020m7) this.f39512w.get(((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39513x.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
            return (C32020m7) this.f39513x.get((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39513x.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size()) {
            return (C32020m7) this.f39514y.get(((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39512w.size()) - this.f39513x.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size());
        }
        if (i11 < this.f39507r.size() + this.f39509t.size() + this.f39513x.size() + this.f39512w.size() + this.f39514y.size() + this.f39508s.size() + this.f39510u.size() + this.f39511v.size() + this.f39515z.size()) {
            return (C32020m7) this.f39515z.get((((((((i11 - this.f39507r.size()) - this.f39509t.size()) - this.f39513x.size()) - this.f39512w.size()) - this.f39508s.size()) - this.f39510u.size()) - this.f39511v.size()) - this.f39514y.size());
        }
        return null;
    }

    /* renamed from: Q */
    int m36661Q(C32020m7 c32020m7, int i11) {
        ContactProfile contactProfile;
        if (c32020m7 != null && (contactProfile = c32020m7.f147411b) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            if (!c32020m7.f147411b.f42434r.equals("-1") && !c32020m7.f147411b.f42434r.equals("-22") && !c32020m7.f147411b.f42434r.equals("-3") && !c32020m7.f147411b.f42434r.equals("-4") && !c32020m7.f147411b.f42434r.equals("-12") && !c32020m7.f147411b.f42434r.equals("-17") && !c32020m7.f147411b.f42434r.equals("-20")) {
                if (!c32020m7.f147411b.f42434r.equals("-5") && !c32020m7.f147411b.f42434r.equals("-18") && !c32020m7.f147411b.f42434r.equals("-6") && !c32020m7.f147411b.f42434r.equals("-13") && !c32020m7.f147411b.f42434r.equals("-21")) {
                    if (c32020m7.f147411b.f42434r.equals("-7")) {
                        return 3;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-23")) {
                        return 4;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-9")) {
                        return 5;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-14")) {
                        return 8;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-15")) {
                        return 9;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-10")) {
                        return 6;
                    }
                    if (c32020m7.f147411b.f42434r.equals("-11")) {
                        return 7;
                    }
                    if (c32020m7.f147426q) {
                        return 11;
                    }
                    if (m36662R(c32020m7)) {
                        return 10;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        return 2;
    }

    /* renamed from: R */
    boolean m36662R(C32020m7 c32020m7) {
        if (c32020m7.f147430u == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void mo9990A(e eVar, final int i11) {
        int mo10005m = mo10005m(i11);
        try {
            eVar.f7784p.getContext();
            final C32020m7 m36660P = m36660P(i11);
            if (m36660P != null && m36660P.f147411b != null) {
                eVar.mo36668i0(m36660P, i11, mo10005m);
                eVar.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.q6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7207s6.this.m36656S(m36660P, i11, view);
                    }
                });
                eVar.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.r6
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean m36657T;
                        m36657T = C7207s6.this.m36657T(m36660P, i11, view);
                        return m36657T;
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23126l.m118629c("SearchGlobalAdapter getView: " + e11.toString());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public e mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (i11 != 2 && i11 != 10) {
            if (i11 == 0) {
                return new c(from.inflate(AbstractC7409c0.header_row_global_search, viewGroup, false), context, i11);
            }
            if (i11 == 3) {
                return new c(from.inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false), context, i11);
            }
            if (i11 == 1) {
                return new a(new SeeMoreModuleView(context, this), context);
            }
            if (i11 != 5 && i11 != 8 && i11 != 9 && i11 != 11) {
                if (i11 == 4) {
                    return new c(from.inflate(AbstractC7409c0.item_empty_contact_result_global_search, viewGroup, false), context, i11);
                }
                if (i11 == 6) {
                    return new c(from.inflate(AbstractC7409c0.loading_get_oa_global_search, viewGroup, false), context, i11);
                }
                if (i11 == 7) {
                    return new c(from.inflate(AbstractC7409c0.jump_search_oa_global_search, viewGroup, false), context, i11);
                }
                return null;
            }
            return new c(from.inflate(AbstractC7409c0.item_empty_oa_result_global_search, viewGroup, false), context, i11);
        }
        return m36658N(viewGroup, this.f39505J);
    }

    /* renamed from: W */
    public void m36665W(List list) {
        if (list != null) {
            this.f39507r = new ArrayList(list);
            this.f39504I = false;
        } else {
            this.f39507r = new ArrayList();
        }
        Iterator it = this.f39507r.iterator();
        while (it.hasNext()) {
            ((C32020m7) it.next()).f147430u = 1;
        }
    }

    /* renamed from: X */
    public void m36666X(boolean z11) {
        this.f39502G = z11;
    }

    @Override // com.zing.zalo.p077ui.moduleview.search.SeeMoreModuleView.InterfaceC12457a
    /* renamed from: h */
    public List mo36667h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("-5")) {
            return this.f39496A;
        }
        if (str.equals("-6")) {
            return this.f39498C;
        }
        if (str.equals("-13")) {
            return this.f39499D;
        }
        if (str.equals("-18")) {
            return this.f39497B;
        }
        if (!str.equals("-21")) {
            return null;
        }
        return this.f39500E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39510u.size() + this.f39508s.size() + this.f39507r.size() + this.f39509t.size() + this.f39512w.size() + this.f39513x.size() + this.f39514y.size() + this.f39511v.size() + this.f39515z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m36661Q(m36660P(i11), i11);
    }
}

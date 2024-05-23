package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7225u2;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.EnumC17020n;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;
import p716zh.C32077q6;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* renamed from: com.zing.zalo.adapters.u2 */
/* loaded from: classes3.dex */
public final class C7225u2 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final a f39606r;

    /* renamed from: s */
    private List f39607s;

    /* renamed from: com.zing.zalo.adapters.u2$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: aA */
        void mo36741aA();

        /* renamed from: eA */
        void mo36742eA();

        /* renamed from: vp */
        void mo36743vp(C32077q6 c32077q6);
    }

    /* renamed from: com.zing.zalo.adapters.u2$b */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public RobotoTextView f39608I;

        /* renamed from: J */
        public AppCompatImageView f39609J;

        /* renamed from: K */
        public AppCompatImageView f39610K;

        /* renamed from: L */
        public RobotoTextView f39611L;

        /* renamed from: M */
        public Button f39612M;

        /* renamed from: N */
        final /* synthetic */ C7225u2 f39613N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7225u2 c7225u2, View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39613N = c7225u2;
            m36756s0(view, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m36747m0(C7225u2 c7225u2, C32077q6 c32077q6, View view) {
            AbstractC19074t.m100208f(c7225u2, "this$0");
            c7225u2.m36737L().mo36743vp(c32077q6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public static final void m36748t0(C7225u2 c7225u2, View view) {
            AbstractC19074t.m100208f(c7225u2, "this$0");
            c7225u2.m36737L().mo36742eA();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u0 */
        public static final void m36749u0(C7225u2 c7225u2, View view) {
            AbstractC19074t.m100208f(c7225u2, "this$0");
            c7225u2.m36737L().mo36741aA();
        }

        /* renamed from: l0 */
        public final void m36750l0(final C32077q6 c32077q6, int i11) {
            float f11;
            int i12;
            if (i11 == C32077q6.f147697A) {
                View view = this.f7784p;
                AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.ListItem");
                ListItem listItem = (ListItem) view;
                listItem.setIdTracking("HISTORY_LOGIN_ITEM");
                if (c32077q6 != null) {
                    if (c32077q6.f147721n != 0) {
                        m36752o0().setVisibility(0);
                        AppCompatImageView m36752o0 = m36752o0();
                        Context context = m36752o0().getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        m36752o0.setImageDrawable(C27280g.m139660c(context, c32077q6.f147721n, AbstractC2807a.icon_02));
                    } else {
                        m36752o0().setVisibility(4);
                    }
                    String str = c32077q6.f147708a;
                    AbstractC19074t.m100207e(str, "dName");
                    listItem.setTitle(str);
                    String str2 = c32077q6.f147726s;
                    if (str2 != null && str2.length() != 0) {
                        Badge badgeTitle = listItem.getBadgeTitle();
                        String str3 = c32077q6.f147726s;
                        AbstractC19074t.m100207e(str3, "labelText");
                        String upperCase = str3.toUpperCase(Locale.ROOT);
                        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                        badgeTitle.setBadgeText(upperCase);
                        Drawable background = listItem.getBadgeTitle().getBackground();
                        Context context2 = listItem.getBadgeTitle().getContext();
                        if (c32077q6.f147725r == 1) {
                            i12 = AbstractC2808b.skb60;
                        } else {
                            i12 = AbstractC2808b.f150839y60;
                        }
                        background.setTint(AbstractC23136l9.m118641B(context2, i12));
                        listItem.getBadgeTitle().setVisibility(0);
                    } else {
                        listItem.getBadgeTitle().setVisibility(8);
                    }
                    String str4 = c32077q6.f147727t;
                    AbstractC19074t.m100207e(str4, "loginMethod");
                    listItem.setSubtitle(str4);
                    if (c32077q6.f147712e == 2) {
                        m36754q0().setText(c32077q6.f147711d);
                    } else {
                        String m119226W0 = AbstractC23160o0.m119226W0(c32077q6.f147728u, false, true);
                        AbstractC19074t.m100207e(m119226W0, "getTimestampUntilNowShortFormat(...)");
                        C19067n0 c19067n0 = C19067n0.f94947a;
                        String format = String.format("%s • %s", Arrays.copyOf(new Object[]{c32077q6.f147711d, m119226W0}, 2));
                        AbstractC19074t.m100207e(format, "format(...)");
                        SpannableString spannableString = new SpannableString(format);
                        spannableString.setSpan(new StyleSpan(1), spannableString.length() - m119226W0.length(), spannableString.length(), 33);
                        m36754q0().setText(spannableString);
                    }
                    AppCompatImageView m36753p0 = m36753p0();
                    Context context3 = this.f7784p.getContext();
                    AbstractC19074t.m100207e(context3, "getContext(...)");
                    m36753p0.setImageDrawable(C27280g.m139660c(context3, AbstractC23322a.zds_ic_more_horizontal_line_24, AbstractC21196a.TextColor1));
                    listItem.m90592m(c32077q6.f147722o);
                    if (c32077q6.f147723p) {
                        f11 = 64.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    listItem.m90591l(AbstractC23136l9.m118742r(f11), 0, 0, 0);
                    final C7225u2 c7225u2 = this.f39613N;
                    listItem.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            C7225u2.b.m36747m0(C7225u2.this, c32077q6, view2);
                        }
                    });
                    return;
                }
                return;
            }
            String str5 = null;
            if (i11 == C32077q6.f147698B) {
                RobotoTextView m36755r0 = m36755r0();
                if (c32077q6 != null) {
                    str5 = c32077q6.f147708a;
                }
                m36755r0.setText(str5);
                return;
            }
            if (i11 == C32077q6.f147701E) {
                Button m36751n0 = m36751n0();
                if (c32077q6 != null) {
                    str5 = c32077q6.f147708a;
                }
                m36751n0.setText(str5);
                return;
            }
            if (i11 == C32077q6.f147702F) {
                View view2 = this.f7784p;
                AbstractC19074t.m100206d(view2, "null cannot be cast to non-null type com.zing.zalo.zdesign.component.Button");
                Button button = (Button) view2;
                if (c32077q6 != null) {
                    str5 = c32077q6.f147708a;
                }
                button.setText(str5);
            }
        }

        /* renamed from: n0 */
        public final Button m36751n0() {
            Button button = this.f39612M;
            if (button != null) {
                return button;
            }
            AbstractC19074t.m100223u("btnLogoutAll");
            return null;
        }

        /* renamed from: o0 */
        public final AppCompatImageView m36752o0() {
            AppCompatImageView appCompatImageView = this.f39609J;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AbstractC19074t.m100223u("iconLeft");
            return null;
        }

        /* renamed from: p0 */
        public final AppCompatImageView m36753p0() {
            AppCompatImageView appCompatImageView = this.f39610K;
            if (appCompatImageView != null) {
                return appCompatImageView;
            }
            AbstractC19074t.m100223u("iconRight");
            return null;
        }

        /* renamed from: q0 */
        public final RobotoTextView m36754q0() {
            RobotoTextView robotoTextView = this.f39611L;
            if (robotoTextView != null) {
                return robotoTextView;
            }
            AbstractC19074t.m100223u("tvDes");
            return null;
        }

        /* renamed from: r0 */
        public final RobotoTextView m36755r0() {
            RobotoTextView robotoTextView = this.f39608I;
            if (robotoTextView != null) {
                return robotoTextView;
            }
            AbstractC19074t.m100223u("tvName");
            return null;
        }

        /* renamed from: s0 */
        public final void m36756s0(View view, int i11) {
            AbstractC19074t.m100208f(view, "itemView");
            if (i11 == C32077q6.f147697A) {
                m36758w0(new AppCompatImageView(view.getContext()));
                m36752o0().setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                m36759x0(new AppCompatImageView(view.getContext()));
                m36753p0().setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                Context context = view.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                m36760y0(new RobotoTextView(context));
                m36754q0().setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
                Context context2 = view.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                new C26708g(m36754q0()).m137319a(C26705d.m137293a(context2, AbstractC2814h.t_small));
                m36754q0().setTextColor(C23212s8.m119607o(view.getContext(), AbstractC21196a.TextColor2));
                ListItem listItem = (ListItem) view;
                listItem.m90587c(m36752o0());
                listItem.m90586b(m36754q0());
                listItem.m90589e(m36753p0());
                return;
            }
            if (i11 == C32077q6.f147698B) {
                View findViewById = view.findViewById(AbstractC6918a0.title_label);
                AbstractC19074t.m100207e(findViewById, "findViewById(...)");
                m36761z0((RobotoTextView) findViewById);
                return;
            }
            if (i11 == C32077q6.f147701E) {
                Context context3 = view.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                Button button = new Button(context3);
                final C7225u2 c7225u2 = this.f39613N;
                button.setIdTracking("HISTORY_LOGIN_BTN_LOGOUT_ALL");
                button.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                button.m90539c(AbstractC2814h.ButtonMedium_SecondaryNeutral);
                Context context4 = view.getContext();
                AbstractC19074t.m100207e(context4, "getContext(...)");
                button.setSupportiveIcon(C27280g.m139658a(context4, AbstractC23322a.zds_ic_leave_line_24));
                button.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.w2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7225u2.b.m36748t0(C7225u2.this, view2);
                    }
                });
                m36757v0(button);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                int m118742r = AbstractC23136l9.m118742r(16.0f);
                view.setPadding(m118742r, m118742r, m118742r, m118742r);
                ((FrameLayout) view).addView(m36751n0());
                return;
            }
            if (i11 == C32077q6.f147702F) {
                Button button2 = (Button) view;
                button2.setIdTracking("HISTORY_LOGIN_BTN_SEE_ALL");
                button2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                button2.setPadding(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
                button2.setBackgroundColor(C23212s8.m119607o(button2.getContext(), AbstractC2807a.list_item_background));
                button2.m90539c(AbstractC2814h.ButtonMedium_TertiaryNeutral);
                button2.setSupportiveIconPosition(EnumC17020n.TRAILING);
                Context context5 = button2.getContext();
                AbstractC19074t.m100207e(context5, "getContext(...)");
                button2.setSupportiveIcon(C27280g.m139658a(context5, AbstractC23322a.zds_ic_arrow_right_line_24));
                final C7225u2 c7225u22 = this.f39613N;
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7225u2.b.m36749u0(C7225u2.this, view2);
                    }
                });
            }
        }

        /* renamed from: v0 */
        public final void m36757v0(Button button) {
            AbstractC19074t.m100208f(button, "<set-?>");
            this.f39612M = button;
        }

        /* renamed from: w0 */
        public final void m36758w0(AppCompatImageView appCompatImageView) {
            AbstractC19074t.m100208f(appCompatImageView, "<set-?>");
            this.f39609J = appCompatImageView;
        }

        /* renamed from: x0 */
        public final void m36759x0(AppCompatImageView appCompatImageView) {
            AbstractC19074t.m100208f(appCompatImageView, "<set-?>");
            this.f39610K = appCompatImageView;
        }

        /* renamed from: y0 */
        public final void m36760y0(RobotoTextView robotoTextView) {
            AbstractC19074t.m100208f(robotoTextView, "<set-?>");
            this.f39611L = robotoTextView;
        }

        /* renamed from: z0 */
        public final void m36761z0(RobotoTextView robotoTextView) {
            AbstractC19074t.m100208f(robotoTextView, "<set-?>");
            this.f39608I = robotoTextView;
        }
    }

    public C7225u2(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        this.f39606r = aVar;
    }

    /* renamed from: L */
    public final a m36737L() {
        return this.f39606r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        C32077q6 c32077q6;
        AbstractC19074t.m100208f(bVar, "holder");
        if (i11 >= 0 && i11 < mo10003k()) {
            List list = this.f39607s;
            if (list != null) {
                c32077q6 = (C32077q6) list.get(i11);
            } else {
                c32077q6 = null;
            }
            bVar.m36750l0(c32077q6, mo10005m(i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == C32077q6.f147697A) {
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new b(this, new ListItem(context), i11);
        }
        if (i11 == C32077q6.f147698B) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.session_title_row, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
            return new b(this, inflate, i11);
        }
        if (i11 == C32077q6.f147701E) {
            return new b(this, new FrameLayout(viewGroup.getContext()), i11);
        }
        if (i11 == C32077q6.f147702F) {
            Context context2 = viewGroup.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            return new b(this, new Button(context2), i11);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false);
        AbstractC19074t.m100207e(inflate2, "inflate(...)");
        return new b(this, inflate2, i11);
    }

    /* renamed from: O */
    public final void m36740O(List list) {
        AbstractC19074t.m100208f(list, "list");
        this.f39607s = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f39607s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C32077q6 c32077q6;
        List list = this.f39607s;
        if (list != null) {
            c32077q6 = (C32077q6) list.get(i11);
        } else {
            c32077q6 = null;
        }
        if (c32077q6 != null) {
            return c32077q6.f147715h;
        }
        return C32077q6.f147699C;
    }
}

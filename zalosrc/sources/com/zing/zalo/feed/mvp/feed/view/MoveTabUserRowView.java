package com.zing.zalo.feed.mvp.feed.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi0.AbstractC2811e;
import bi0.AbstractC2814h;
import bo.InterfaceC3045u2;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserRowView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import p425po.C24886h;
import p649xl.C29708a6;
import qm0.AbstractC25366r;

/* loaded from: classes4.dex */
public final class MoveTabUserRowView extends LinearLayout {

    /* renamed from: p */
    private C29708a6 f46265p;

    /* renamed from: q */
    private Avatar f46266q;

    /* renamed from: r */
    private ButtonWithProgress f46267r;

    /* renamed from: s */
    private InterfaceC3045u2 f46268s;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.MoveTabUserRowView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C8566a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46269a;

        static {
            int[] iArr = new int[C24886h.d.values().length];
            try {
                iArr[C24886h.d.f119410q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C24886h.d.f119409p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C24886h.d.f119411r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46269a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserRowView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m45658n(context);
    }

    /* renamed from: e */
    private final void m45648e(final C24886h c24886h) {
        List m131496e;
        Avatar avatar = this.f46266q;
        Avatar avatar2 = null;
        if (avatar == null) {
            AbstractC19074t.m100223u("avatar");
            avatar = null;
        }
        m131496e = AbstractC25366r.m131496e(c24886h.m129403e());
        avatar.m90480p(m131496e);
        Avatar avatar3 = this.f46266q;
        if (avatar3 == null) {
            AbstractC19074t.m100223u("avatar");
        } else {
            avatar2 = avatar3;
        }
        avatar2.setOnClickListener(new View.OnClickListener() { // from class: xo.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoveTabUserRowView.m45649f(MoveTabUserRowView.this, c24886h, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m45649f(MoveTabUserRowView moveTabUserRowView, C24886h c24886h, View view) {
        AbstractC19074t.m100208f(moveTabUserRowView, "this$0");
        AbstractC19074t.m100208f(c24886h, "$data");
        InterfaceC3045u2 interfaceC3045u2 = moveTabUserRowView.f46268s;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new C24886h.a(c24886h));
        }
    }

    /* renamed from: g */
    private final void m45650g(ButtonWithProgress buttonWithProgress) {
        buttonWithProgress.m90547h(false);
        buttonWithProgress.getButton().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_move_tab_feed_button_add));
        buttonWithProgress.getButton().m90539c(AbstractC2814h.ButtonSmall_Secondary);
    }

    /* renamed from: h */
    private final void m45651h(ButtonWithProgress buttonWithProgress) {
        buttonWithProgress.m90547h(true);
    }

    /* renamed from: i */
    private final void m45652i(ButtonWithProgress buttonWithProgress) {
        buttonWithProgress.m90547h(false);
        buttonWithProgress.getButton().setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_move_tab_feed_button_remove));
        buttonWithProgress.getButton().m90539c(AbstractC2814h.ButtonSmall_SecondaryNeutral);
    }

    /* renamed from: j */
    private final void m45653j(C29708a6 c29708a6, final C24886h c24886h) {
        c29708a6.f137214q.setTitle(c24886h.m129400b());
        RobotoTextView robotoTextView = (RobotoTextView) c29708a6.f137214q.findViewById(AbstractC2811e.title_list_item);
        if (robotoTextView != null) {
            robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: xo.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoveTabUserRowView.m45654k(MoveTabUserRowView.this, c24886h, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m45654k(MoveTabUserRowView moveTabUserRowView, C24886h c24886h, View view) {
        AbstractC19074t.m100208f(moveTabUserRowView, "this$0");
        AbstractC19074t.m100208f(c24886h, "$data");
        InterfaceC3045u2 interfaceC3045u2 = moveTabUserRowView.f46268s;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new C24886h.c(c24886h));
        }
    }

    /* renamed from: l */
    private final void m45655l(final C24886h c24886h) {
        int i11 = C8566a.f46269a[c24886h.m129401c().ordinal()];
        ButtonWithProgress buttonWithProgress = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ButtonWithProgress buttonWithProgress2 = this.f46267r;
                    if (buttonWithProgress2 == null) {
                        AbstractC19074t.m100223u("button");
                        buttonWithProgress2 = null;
                    }
                    m45651h(buttonWithProgress2);
                }
            } else {
                ButtonWithProgress buttonWithProgress3 = this.f46267r;
                if (buttonWithProgress3 == null) {
                    AbstractC19074t.m100223u("button");
                    buttonWithProgress3 = null;
                }
                m45652i(buttonWithProgress3);
            }
        } else {
            ButtonWithProgress buttonWithProgress4 = this.f46267r;
            if (buttonWithProgress4 == null) {
                AbstractC19074t.m100223u("button");
                buttonWithProgress4 = null;
            }
            m45650g(buttonWithProgress4);
        }
        ButtonWithProgress buttonWithProgress5 = this.f46267r;
        if (buttonWithProgress5 == null) {
            AbstractC19074t.m100223u("button");
        } else {
            buttonWithProgress = buttonWithProgress5;
        }
        buttonWithProgress.setOnClickListener(new View.OnClickListener() { // from class: xo.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MoveTabUserRowView.m45656m(MoveTabUserRowView.this, c24886h, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m45656m(MoveTabUserRowView moveTabUserRowView, C24886h c24886h, View view) {
        AbstractC19074t.m100208f(moveTabUserRowView, "this$0");
        AbstractC19074t.m100208f(c24886h, "$data");
        InterfaceC3045u2 interfaceC3045u2 = moveTabUserRowView.f46268s;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new C24886h.b(c24886h));
        }
    }

    /* renamed from: d */
    public final void m45657d(C24886h c24886h) {
        if (c24886h == null) {
            return;
        }
        C29708a6 c29708a6 = this.f46265p;
        if (c29708a6 == null) {
            AbstractC19074t.m100223u("binding");
            c29708a6 = null;
        }
        m45648e(c24886h);
        m45653j(c29708a6, c24886h);
        m45655l(c24886h);
    }

    public final InterfaceC3045u2 getListener() {
        return this.f46268s;
    }

    /* renamed from: n */
    public final void m45658n(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C29708a6 m147718c = C29708a6.m147718c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147718c, "inflate(...)");
        this.f46265p = m147718c;
        Avatar avatar = new Avatar(context);
        this.f46266q = avatar;
        avatar.setIdTracking("timeline_manage_user_tab_other_user_info_avatar");
        C29708a6 c29708a6 = this.f46265p;
        C29708a6 c29708a62 = null;
        if (c29708a6 == null) {
            AbstractC19074t.m100223u("binding");
            c29708a6 = null;
        }
        ListItem listItem = c29708a6.f137214q;
        Avatar avatar2 = this.f46266q;
        if (avatar2 == null) {
            AbstractC19074t.m100223u("avatar");
            avatar2 = null;
        }
        listItem.m90587c(avatar2);
        ButtonWithProgress buttonWithProgress = new ButtonWithProgress(context);
        this.f46267r = buttonWithProgress;
        buttonWithProgress.setIdTracking("button_manage_move_tab_user");
        ButtonWithProgress buttonWithProgress2 = this.f46267r;
        if (buttonWithProgress2 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress2 = null;
        }
        buttonWithProgress2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        ButtonWithProgress buttonWithProgress3 = this.f46267r;
        if (buttonWithProgress3 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress3 = null;
        }
        m45650g(buttonWithProgress3);
        ButtonWithProgress buttonWithProgress4 = this.f46267r;
        if (buttonWithProgress4 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress4 = null;
        }
        buttonWithProgress4.measure(0, 0);
        ButtonWithProgress buttonWithProgress5 = this.f46267r;
        if (buttonWithProgress5 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress5 = null;
        }
        int measuredWidth = buttonWithProgress5.getMeasuredWidth();
        ButtonWithProgress buttonWithProgress6 = this.f46267r;
        if (buttonWithProgress6 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress6 = null;
        }
        m45652i(buttonWithProgress6);
        ButtonWithProgress buttonWithProgress7 = this.f46267r;
        if (buttonWithProgress7 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress7 = null;
        }
        buttonWithProgress7.measure(0, 0);
        ButtonWithProgress buttonWithProgress8 = this.f46267r;
        if (buttonWithProgress8 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress8 = null;
        }
        int max = Math.max(measuredWidth, buttonWithProgress8.getMeasuredWidth());
        ButtonWithProgress buttonWithProgress9 = this.f46267r;
        if (buttonWithProgress9 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress9 = null;
        }
        buttonWithProgress9.getLayoutParams().width = max;
        C29708a6 c29708a63 = this.f46265p;
        if (c29708a63 == null) {
            AbstractC19074t.m100223u("binding");
            c29708a63 = null;
        }
        ListItem listItem2 = c29708a63.f137214q;
        ButtonWithProgress buttonWithProgress10 = this.f46267r;
        if (buttonWithProgress10 == null) {
            AbstractC19074t.m100223u("button");
            buttonWithProgress10 = null;
        }
        listItem2.m90589e(buttonWithProgress10);
        C29708a6 c29708a64 = this.f46265p;
        if (c29708a64 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29708a62 = c29708a64;
        }
        c29708a62.f137214q.m90592m(false);
    }

    public final void setListener(InterfaceC3045u2 interfaceC3045u2) {
        this.f46268s = interfaceC3045u2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveTabUserRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m45658n(context);
    }
}

package com.zing.zalo.zview.actionbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.actionbar.ActionBar;
import zl0.AbstractC32232i;

/* loaded from: classes7.dex */
public class ActionBarMenu extends LinearLayout {

    /* renamed from: p */
    protected ActionBar f88828p;

    public ActionBarMenu(Context context, ActionBar actionBar) {
        super(context);
        setOrientation(0);
        this.f88828p = actionBar;
    }

    /* renamed from: v */
    public void m92731v(View view) {
        ActionBar.C17431a c17431a;
        m92753w();
        ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) view;
        if (actionBarMenuItem.m92777m()) {
            ActionBar actionBar = this.f88828p;
            if (actionBar != null && (c17431a = actionBar.f88827z) != null && c17431a.mo66911a()) {
                actionBarMenuItem.m92770D();
            }
        } else if (actionBarMenuItem.m92778p()) {
            this.f88828p.m92722s(actionBarMenuItem.m92769C());
        }
        m92735A(((Integer) view.getTag()).intValue());
    }

    /* renamed from: x */
    public /* synthetic */ void m92732x(View view) {
        m92735A(((Integer) view.getTag()).intValue());
    }

    /* renamed from: y */
    public /* synthetic */ void m92733y(View view) {
        m92735A(((Integer) view.getTag()).intValue());
    }

    /* renamed from: z */
    public /* synthetic */ void m92734z(View view) {
        m92735A(((Integer) view.getTag()).intValue());
    }

    /* renamed from: A */
    public void m92735A(int i11) {
        ActionBar.C17431a c17431a = this.f88828p.f88827z;
        if (c17431a != null) {
            c17431a.mo46831b(i11);
        }
    }

    /* renamed from: B */
    public void m92736B(boolean z11, String str) {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.m92778p()) {
                    if (z11) {
                        this.f88828p.m92722s(actionBarMenuItem.m92769C());
                    }
                    actionBarMenuItem.getSearchField().setText(str);
                    actionBarMenuItem.getSearchField().setSelection(str.length());
                    return;
                }
            }
        }
    }

    /* renamed from: C */
    public void m92737C() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).m92772F();
            }
        }
    }

    /* renamed from: e */
    public ActionBarMenuItem m92738e(int i11, int i12) {
        return m92739f(i11, i12, this.f88828p.f88826y);
    }

    /* renamed from: f */
    public ActionBarMenuItem m92739f(int i11, int i12, int i13) {
        return m92741h(i11, i12, i13, null, AbstractC32232i.m155453a(48.0f));
    }

    /* renamed from: g */
    public ActionBarMenuItem m92740g(int i11, int i12, int i13, int i14, Drawable drawable, int i15) {
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(getContext(), this, i12, i14);
        actionBarMenuItem.setTag(Integer.valueOf(i11));
        if (drawable != null) {
            actionBarMenuItem.f88859w.setImageDrawable(drawable);
        } else {
            actionBarMenuItem.f88859w.setImageResource(i13);
        }
        actionBarMenuItem.f88859w.setId(i11);
        actionBarMenuItem.f88859w.setBackgroundResource(AbstractC17466e.item_actionbar_background_ripple);
        addView(actionBarMenuItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuItem.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = i15;
        actionBarMenuItem.setLayoutParams(layoutParams);
        actionBarMenuItem.setOnClickListener(new ViewOnClickListenerC17441c(this));
        return actionBarMenuItem;
    }

    /* renamed from: h */
    public ActionBarMenuItem m92741h(int i11, int i12, int i13, Drawable drawable, int i14) {
        return m92740g(i11, AbstractC17470g.action_bar_item, i12, i13, drawable, i14);
    }

    /* renamed from: i */
    public ActionBarMenuItem m92742i(int i11, Drawable drawable) {
        return m92741h(i11, 0, this.f88828p.f88826y, drawable, AbstractC32232i.m155453a(48.0f));
    }

    /* renamed from: j */
    public ActionBarMenuItem m92743j(int i11, Drawable drawable, int i12) {
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(getContext(), this, this.f88828p.f88826y);
        actionBarMenuItem.setTag(Integer.valueOf(i11));
        actionBarMenuItem.f88859w.setImageDrawable(drawable);
        actionBarMenuItem.f88859w.setId(i11);
        addView(actionBarMenuItem, i12);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuItem.getLayoutParams();
        layoutParams.height = -1;
        actionBarMenuItem.setLayoutParams(layoutParams);
        actionBarMenuItem.f88859w.setBackgroundResource(AbstractC17466e.item_actionbar_background_ripple);
        actionBarMenuItem.setOnClickListener(new ViewOnClickListenerC17441c(this));
        return actionBarMenuItem;
    }

    /* renamed from: k */
    public View m92744k(int i11, int i12) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i12, (ViewGroup) null);
        inflate.setId(i11);
        inflate.setTag(Integer.valueOf(i11));
        addView(inflate);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.gravity = 16;
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.b
            public /* synthetic */ ViewOnClickListenerC17440b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionBarMenu.this.m92732x(view);
            }
        });
        return inflate;
    }

    /* renamed from: l */
    public View m92745l(int i11, int i12, int i13) {
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(i12, (ViewGroup) null);
        inflate.setTag(Integer.valueOf(i11));
        addView(inflate);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.weight = i13;
        layoutParams.gravity = 16;
        inflate.setLayoutParams(layoutParams);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.d
            public /* synthetic */ ViewOnClickListenerC17442d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActionBarMenu.this.m92733y(view);
            }
        });
        return inflate;
    }

    /* renamed from: m */
    public void m92746m(int i11, View view, LinearLayout.LayoutParams layoutParams) {
        view.setId(i11);
        view.setTag(Integer.valueOf(i11));
        addView(view);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.gravity = 16;
        layoutParams2.setMargins(layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
        view.setLayoutParams(layoutParams2);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.e
            public /* synthetic */ ViewOnClickListenerC17443e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ActionBarMenu.this.m92734z(view2);
            }
        });
    }

    /* renamed from: n */
    public ActionBarMenuItem m92747n(int i11, int i12, int i13) {
        return m92740g(i11, i12, i13, this.f88828p.f88826y, null, AbstractC32232i.m155453a(48.0f));
    }

    /* renamed from: p */
    public ActionBarMenuItem m92748p(int i11, int i12, Drawable drawable) {
        return m92740g(i11, i12, 0, this.f88828p.f88826y, drawable, AbstractC32232i.m155453a(48.0f));
    }

    /* renamed from: q */
    public ActionBarMenuItem m92749q(int i11, int i12, int i13) {
        return m92741h(i11, i12, this.f88828p.f88826y, null, i13);
    }

    /* renamed from: r */
    public void m92750r() {
        m92753w();
        removeAllViews();
    }

    /* renamed from: s */
    public void m92751s() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionBarMenuItem) {
                ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) childAt;
                if (actionBarMenuItem.m92778p()) {
                    this.f88828p.m92722s(actionBarMenuItem.m92769C());
                    return;
                }
            }
        }
    }

    /* renamed from: u */
    public ActionBarMenuItem m92752u(int i11) {
        View findViewWithTag = findViewWithTag(Integer.valueOf(i11));
        if (findViewWithTag instanceof ActionBarMenuItem) {
            return (ActionBarMenuItem) findViewWithTag;
        }
        return null;
    }

    /* renamed from: w */
    public void m92753w() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionBarMenuItem) {
                ((ActionBarMenuItem) childAt).m92775k();
            }
        }
    }
}

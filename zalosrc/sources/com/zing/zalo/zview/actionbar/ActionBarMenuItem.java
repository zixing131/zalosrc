package com.zing.zalo.zview.actionbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.zview.AbstractC17450b;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.actionbar.ActionBarPopupWindow;
import com.zing.zalo.zview.widget.FrameLayoutFixed;
import zl0.AbstractC32226c;
import zl0.AbstractC32232i;
import zl0.AbstractC32234k;

/* loaded from: classes7.dex */
public class ActionBarMenuItem extends FrameLayoutFixed {

    /* renamed from: A */
    Rect f88829A;

    /* renamed from: B */
    int[] f88830B;

    /* renamed from: C */
    Runnable f88831C;

    /* renamed from: D */
    boolean f88832D;

    /* renamed from: E */
    int f88833E;

    /* renamed from: F */
    int f88834F;

    /* renamed from: G */
    InterfaceC17434c f88835G;

    /* renamed from: H */
    boolean f88836H;

    /* renamed from: I */
    boolean f88837I;

    /* renamed from: J */
    public boolean f88838J;

    /* renamed from: K */
    Handler f88839K;

    /* renamed from: L */
    int f88840L;

    /* renamed from: M */
    Paint f88841M;

    /* renamed from: N */
    int f88842N;

    /* renamed from: O */
    int f88843O;

    /* renamed from: P */
    int f88844P;

    /* renamed from: Q */
    boolean f88845Q;

    /* renamed from: R */
    int f88846R;

    /* renamed from: S */
    int f88847S;

    /* renamed from: T */
    int f88848T;

    /* renamed from: U */
    int f88849U;

    /* renamed from: V */
    boolean f88850V;

    /* renamed from: W */
    Drawable f88851W;

    /* renamed from: a0 */
    Drawable f88852a0;

    /* renamed from: q */
    ActionBarPopupWindow.ActionBarPopupWindowLayout f88853q;

    /* renamed from: r */
    ActionBarMenu f88854r;

    /* renamed from: s */
    ActionBarPopupWindow f88855s;

    /* renamed from: t */
    PopupWindow.OnDismissListener f88856t;

    /* renamed from: u */
    EditText f88857u;

    /* renamed from: v */
    ImageView f88858v;

    /* renamed from: w */
    protected ImageView f88859w;

    /* renamed from: x */
    FrameLayout f88860x;

    /* renamed from: y */
    boolean f88861y;

    /* renamed from: z */
    C17435d f88862z;

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarMenuItem$a */
    /* loaded from: classes7.dex */
    class ActionModeCallbackC17432a implements ActionMode.Callback {
        ActionModeCallbackC17432a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarMenuItem$b */
    /* loaded from: classes7.dex */
    class C17433b implements TextWatcher {
        C17433b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            float f11;
            ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
            C17435d c17435d = actionBarMenuItem.f88862z;
            if (c17435d != null) {
                c17435d.mo65079f(actionBarMenuItem.f88857u);
            }
            ImageView imageView = ActionBarMenuItem.this.f88858v;
            if (imageView != null) {
                if (charSequence != null && charSequence.length() != 0) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.6f;
                }
                AbstractC1579n0.m7805C0(imageView, f11);
            }
        }
    }

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarMenuItem$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC17434c {
        /* renamed from: a */
        void mo87298a();
    }

    /* renamed from: com.zing.zalo.zview.actionbar.ActionBarMenuItem$d */
    /* loaded from: classes7.dex */
    public static class C17435d {
        /* renamed from: a */
        public boolean m92782a() {
            return true;
        }

        /* renamed from: b */
        public void mo69246b() {
        }

        /* renamed from: c */
        public void mo65077c() {
        }

        /* renamed from: d */
        public void mo65078d() {
        }

        /* renamed from: e */
        public void m92783e(EditText editText) {
        }

        /* renamed from: f */
        public abstract void mo65079f(EditText editText);
    }

    public ActionBarMenuItem(Context context, ActionBarMenu actionBarMenu, int i11) {
        this(context, actionBarMenu, AbstractC17470g.action_bar_item, i11);
    }

    /* renamed from: n */
    private void m92760n() {
        if (this.f88853q == null) {
            this.f88829A = new Rect();
            this.f88830B = new int[2];
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
            this.f88853q = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.zview.actionbar.j
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m92762r;
                    m92762r = ActionBarMenuItem.this.m92762r(view, motionEvent);
                    return m92762r;
                }
            });
            this.f88853q.setOnDispatchKeyEventListener(new ActionBarPopupWindow.InterfaceC17438c() { // from class: com.zing.zalo.zview.actionbar.k
                @Override // com.zing.zalo.zview.actionbar.ActionBarPopupWindow.InterfaceC17438c
                /* renamed from: a */
                public final void mo92792a(KeyEvent keyEvent) {
                    ActionBarMenuItem.this.m92763s(keyEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m92761q(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            if (this.f88837I) {
                return;
            }
            this.f88837I = true;
            this.f88855s.m92785b(this.f88836H);
        }
        ActionBarMenu actionBarMenu = this.f88854r;
        if (actionBarMenu != null) {
            actionBarMenu.m92735A(((Integer) view.getTag()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ boolean m92762r(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = this.f88855s) != null && actionBarPopupWindow.isShowing()) {
            view.getHitRect(this.f88829A);
            if (!this.f88829A.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.f88855s.dismiss();
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m92763s(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.f88855s) != null && actionBarPopupWindow.isShowing()) {
            this.f88855s.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ boolean m92764u(TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 3) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        AbstractC32232i.m155458f(this.f88857u);
        C17435d c17435d = this.f88862z;
        if (c17435d != null) {
            c17435d.m92783e(this.f88857u);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m92765v(View view) {
        this.f88862z.mo69246b();
        if (TextUtils.isEmpty(this.f88857u.getText())) {
            ActionBarMenu actionBarMenu = this.f88854r;
            if (actionBarMenu != null) {
                actionBarMenu.m92751s();
                return;
            }
            return;
        }
        this.f88857u.setText("");
        AbstractC32232i.m155464l(this.f88857u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ boolean m92766w(View view, int i11, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (i11 == 82 && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 1 && (actionBarPopupWindow = this.f88855s) != null && actionBarPopupWindow.isShowing()) {
            this.f88855s.dismiss();
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public ActionBarMenuItem m92767A(C17435d c17435d) {
        this.f88862z = c17435d;
        return this;
    }

    /* renamed from: B */
    public ActionBarMenuItem m92768B(boolean z11, boolean z12, int i11, int i12) {
        if (this.f88854r == null) {
            return this;
        }
        if (z11 && this.f88860x == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f88860x = frameLayout;
            int i13 = 0;
            this.f88854r.addView(frameLayout, 0);
            this.f88860x.setBackgroundResource(AbstractC17466e.ab_bg_textfield_search_default);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f88860x.getLayoutParams();
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
            layoutParams.height = -2;
            layoutParams.gravity = 16;
            layoutParams.leftMargin = AbstractC32232i.m155453a(6.0f);
            layoutParams.rightMargin = AbstractC32232i.m155453a(8.0f);
            this.f88860x.setLayoutParams(layoutParams);
            this.f88860x.setVisibility(8);
            EditTextWithContextMenu editTextWithContextMenu = new EditTextWithContextMenu(getContext());
            this.f88857u = editTextWithContextMenu;
            editTextWithContextMenu.setId(AbstractC17468f.search_src_text);
            this.f88857u.setTextSize(1, 16.0f);
            this.f88857u.setHintTextColor(-2565928);
            this.f88857u.setTextColor(-12696501);
            this.f88857u.setSingleLine(true);
            this.f88857u.setBackgroundResource(0);
            this.f88857u.setPadding(0, 0, 0, 0);
            this.f88857u.setInputType(this.f88857u.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.f88857u.setCustomSelectionActionModeCallback(new ActionModeCallbackC17432a());
            }
            this.f88857u.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.zview.actionbar.f
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
                    boolean m92764u;
                    m92764u = ActionBarMenuItem.this.m92764u(textView, i14, keyEvent);
                    return m92764u;
                }
            });
            this.f88857u.addTextChangedListener(new C17433b());
            if (i12 > 0) {
                AbstractC32234k.m155469a(this.f88857u, i12);
            }
            this.f88857u.setImeOptions(33554435);
            this.f88857u.setTextIsSelectable(false);
            this.f88860x.addView(this.f88857u);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f88857u.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.gravity = 16;
            layoutParams2.height = AbstractC32232i.m155453a(30.0f);
            if (z12) {
                i13 = AbstractC32232i.m155453a(48.0f);
            }
            layoutParams2.rightMargin = i13;
            this.f88857u.setLayoutParams(layoutParams2);
            if (z12) {
                ImageView imageView = new ImageView(getContext());
                this.f88858v = imageView;
                imageView.setImageResource(i11);
                this.f88858v.setScaleType(ImageView.ScaleType.CENTER);
                this.f88858v.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ActionBarMenuItem.this.m92765v(view);
                    }
                });
                this.f88860x.addView(this.f88858v);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f88858v.getLayoutParams();
                layoutParams3.width = AbstractC32232i.m155453a(48.0f);
                layoutParams3.gravity = 21;
                layoutParams3.height = -1;
                this.f88858v.setLayoutParams(layoutParams3);
            }
        }
        this.f88861y = z11;
        return this;
    }

    /* renamed from: C */
    public boolean m92769C() {
        FrameLayout frameLayout = this.f88860x;
        if (frameLayout == null) {
            return false;
        }
        if (frameLayout.getVisibility() == 0) {
            C17435d c17435d = this.f88862z;
            if (c17435d == null || (c17435d != null && c17435d.m92782a())) {
                this.f88860x.setVisibility(8);
                setVisibility(0);
                AbstractC32232i.m155458f(this.f88857u);
                C17435d c17435d2 = this.f88862z;
                if (c17435d2 != null) {
                    c17435d2.mo65077c();
                }
            }
            return false;
        }
        this.f88860x.setVisibility(0);
        setVisibility(8);
        this.f88857u.setText("");
        this.f88857u.requestFocus();
        if (this.f88838J) {
            AbstractC32232i.m155464l(this.f88857u);
        }
        C17435d c17435d3 = this.f88862z;
        if (c17435d3 != null) {
            c17435d3.mo65078d();
            return true;
        }
        return true;
    }

    /* renamed from: D */
    public void m92770D() {
        if (this.f88853q == null) {
            return;
        }
        Runnable runnable = this.f88831C;
        if (runnable != null) {
            this.f88839K.removeCallbacks(runnable);
            this.f88831C = null;
        }
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.f88855s.dismiss();
            return;
        }
        boolean z11 = false;
        if (this.f88855s == null) {
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.f88853q, -2, -2);
            this.f88855s = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationStyle(0);
            this.f88855s.setOutsideTouchable(true);
            this.f88855s.setClippingEnabled(true);
            this.f88855s.setInputMethodMode(2);
            this.f88855s.setSoftInputMode(0);
            this.f88855s.getContentView().setFocusableInTouchMode(true);
            this.f88855s.getContentView().setOnKeyListener(new View.OnKeyListener() { // from class: com.zing.zalo.zview.actionbar.i
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                    boolean m92766w;
                    m92766w = ActionBarMenuItem.this.m92766w(view, i11, keyEvent);
                    return m92766w;
                }
            });
            PopupWindow.OnDismissListener onDismissListener = this.f88856t;
            if (onDismissListener != null) {
                this.f88855s.setOnDismissListener(onDismissListener);
            }
        }
        this.f88837I = false;
        this.f88855s.setFocusable(true);
        if (this.f88853q.getMeasuredWidth() == 0) {
            z11 = true;
        }
        m92771E(true, z11);
        this.f88855s.m92787d();
        InterfaceC17434c interfaceC17434c = this.f88835G;
        if (interfaceC17434c != null) {
            interfaceC17434c.mo87298a();
        }
    }

    /* renamed from: E */
    void m92771E(boolean z11, boolean z12) {
        int i11;
        if (this.f88832D) {
            getLocationOnScreen(this.f88830B);
            int measuredHeight = (this.f88830B[1] - this.f88840L) + getMeasuredHeight();
            int i12 = this.f88833E;
            int i13 = measuredHeight - i12;
            i11 = -i12;
            if (i13 < 0) {
                i11 -= i13;
            }
        } else {
            ActionBarMenu actionBarMenu = this.f88854r;
            if (actionBarMenu != null && this.f88834F == 0) {
                i11 = this.f88854r.getTop() + (-actionBarMenu.f88828p.getMeasuredHeight());
            } else {
                i11 = -getMeasuredHeight();
            }
        }
        int i14 = i11;
        if (z11) {
            this.f88853q.m92790c();
        }
        if (this.f88834F == 0) {
            if (this.f88832D) {
                if (z11) {
                    this.f88855s.showAsDropDown(this, (-this.f88853q.getMeasuredWidth()) + getMeasuredWidth(), i14);
                }
                if (z12) {
                    this.f88855s.update(this, (-this.f88853q.getMeasuredWidth()) + getMeasuredWidth(), i14, -1, -1);
                    return;
                }
                return;
            }
            ActionBarMenu actionBarMenu2 = this.f88854r;
            if (actionBarMenu2 != null) {
                ActionBar actionBar = actionBarMenu2.f88828p;
                if (z11) {
                    this.f88855s.showAsDropDown(actionBar, ((getLeft() + this.f88854r.getLeft()) + getMeasuredWidth()) - this.f88853q.getMeasuredWidth(), i14);
                }
                if (z12) {
                    this.f88855s.update(actionBar, ((getLeft() + this.f88854r.getLeft()) + getMeasuredWidth()) - this.f88853q.getMeasuredWidth(), i14, -1, -1);
                    return;
                }
                return;
            }
            if (getParent() != null) {
                View view = (View) getParent();
                if (z11) {
                    this.f88855s.showAsDropDown(view, ((view.getMeasuredWidth() - this.f88853q.getMeasuredWidth()) - getLeft()) - view.getLeft(), i14);
                }
                if (z12) {
                    this.f88855s.update(view, ((view.getMeasuredWidth() - this.f88853q.getMeasuredWidth()) - getLeft()) - view.getLeft(), i14, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (z11) {
            this.f88855s.showAsDropDown(this, -AbstractC32232i.m155453a(8.0f), i14);
        }
        if (z12) {
            this.f88855s.update(this, -AbstractC32232i.m155453a(8.0f), i14, -1, -1);
        }
    }

    /* renamed from: F */
    public void m92772F() {
        int i11 = this.f88840L;
        int m155409h = AbstractC32226c.m155409h(getRootView());
        this.f88840L = m155409h;
        if (m155409h != i11) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        boolean drawChild = super.drawChild(canvas, view, j11);
        if (view == this.f88859w) {
            try {
                Drawable drawable = this.f88852a0;
                if (drawable != null) {
                    drawable.draw(canvas);
                    Drawable drawable2 = this.f88852a0;
                    int i11 = this.f88842N;
                    drawable2.setBounds((i11 / 2) - 10, (i11 / 2) - 10, (i11 / 2) + 10, (i11 / 2) + 10);
                }
                Drawable drawable3 = this.f88851W;
                if (drawable3 != null) {
                    drawable3.draw(canvas);
                    Drawable drawable4 = this.f88851W;
                    int i12 = this.f88842N;
                    int i13 = this.f88846R;
                    int i14 = this.f88844P;
                    int i15 = this.f88847S;
                    drawable4.setBounds((i12 - i13) - i14, i15 - i14, (i12 - i13) + i14, i15 + i14);
                }
                if (this.f88845Q) {
                    this.f88841M.setColor(this.f88848T);
                    canvas.drawCircle(this.f88842N - this.f88846R, this.f88847S, this.f88844P, this.f88841M);
                } else if (this.f88850V) {
                    this.f88841M.setColor(this.f88849U);
                    canvas.drawCircle(this.f88842N - this.f88846R, this.f88847S, this.f88844P, this.f88841M);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return drawChild;
    }

    public View getClearButton() {
        return this.f88858v;
    }

    public ImageView getIconView() {
        return this.f88859w;
    }

    public ActionBarMenu getParentMenu() {
        return this.f88854r;
    }

    public ActionBarPopupWindow.ActionBarPopupWindowLayout getPopupLayout() {
        return this.f88853q;
    }

    public EditText getSearchField() {
        return this.f88857u;
    }

    /* renamed from: i */
    public void m92773i(View view) {
        m92760n();
        this.f88853q.setShowedFromBottom(this.f88832D);
        this.f88853q.addView(view);
        this.f88833E += AbstractC32232i.m155453a(48.0f);
    }

    /* renamed from: j */
    public View m92774j(View view) {
        m92760n();
        this.f88853q.setShowedFromBottom(this.f88832D);
        this.f88853q.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = AbstractC32232i.m155453a(48.0f);
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.zview.actionbar.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ActionBarMenuItem.this.m92761q(view2);
            }
        });
        this.f88833E += layoutParams.height;
        return view;
    }

    /* renamed from: k */
    public void m92775k() {
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.f88855s.dismiss();
        }
    }

    /* renamed from: l */
    public void m92776l() {
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing() || this.f88837I) {
            return;
        }
        this.f88837I = true;
        this.f88855s.m92785b(this.f88836H);
    }

    /* renamed from: m */
    public boolean m92777m() {
        return this.f88853q != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m92772F();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            m92771E(false, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.widget.FrameLayoutFixed, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        this.f88842N = View.MeasureSpec.getSize(i11);
        this.f88843O = View.MeasureSpec.getSize(i12);
        super.onMeasure(i11, i12);
    }

    /* renamed from: p */
    public boolean m92778p() {
        return this.f88861y;
    }

    public void setEnableGreenDot(boolean z11) {
        this.f88850V = z11;
        invalidate();
    }

    public void setEnableNoti(boolean z11) {
        this.f88845Q = z11;
        invalidate();
    }

    public void setGlowingBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.f88852a0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.f88852a0 = drawable;
            invalidate();
        }
    }

    public void setGlowingDrawable(Drawable drawable) {
        Drawable drawable2 = this.f88851W;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable.setCallback(this);
            }
            this.f88851W = drawable;
            invalidate();
        }
    }

    public void setIcon(int i11) {
        this.f88859w.setImageResource(i11);
    }

    public void setMenuItemListener(InterfaceC17434c interfaceC17434c) {
        this.f88835G = interfaceC17434c;
    }

    public void setNotiRedotMarginRight(int i11) {
        this.f88846R = i11;
    }

    public void setNotiRedotMarginTop(int i11) {
        this.f88847S = i11;
    }

    public void setRedDotColor(int i11) {
        this.f88848T = i11;
    }

    public void setReddotRadius(int i11) {
        this.f88844P = i11;
    }

    public void setShowFromBottom(boolean z11) {
        this.f88832D = z11;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.f88853q;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setShowedFromBottom(z11);
        }
    }

    public void setSubMenuDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f88856t = onDismissListener;
        ActionBarPopupWindow actionBarPopupWindow = this.f88855s;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.setOnDismissListener(onDismissListener);
        }
    }

    public void setSubMenuOpenSide(int i11) {
        this.f88834F = i11;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f88851W && drawable != this.f88852a0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public void m92779x() {
        ActionBarMenu actionBarMenu;
        FrameLayout frameLayout = this.f88860x;
        if (frameLayout != null && frameLayout.getVisibility() != 0 && (actionBarMenu = this.f88854r) != null) {
            actionBarMenu.f88828p.m92722s(m92769C());
        }
    }

    /* renamed from: y */
    public void m92780y() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.f88853q;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.m92789b();
        }
    }

    /* renamed from: z */
    public void m92781z(View view) {
        this.f88853q.removeView(view);
    }

    public ActionBarMenuItem(Context context, ActionBarMenu actionBarMenu, int i11, int i12) {
        super(context);
        this.f88861y = false;
        this.f88833E = AbstractC32232i.m155453a(16.0f);
        this.f88834F = 0;
        this.f88836H = true;
        this.f88838J = true;
        this.f88839K = new Handler(Looper.getMainLooper());
        this.f88840L = AbstractC17484n.Companion.m92931b();
        this.f88844P = AbstractC32232i.m155453a(4.0f);
        this.f88845Q = false;
        this.f88846R = AbstractC32232i.m155453a(12.0f);
        this.f88847S = AbstractC32232i.m155453a(20.0f);
        this.f88850V = false;
        if (i12 > 0) {
            setBackgroundResource(i12);
        }
        this.f88854r = actionBarMenu;
        ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this, false);
        this.f88859w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.f88859w.setDuplicateParentStateEnabled(true);
        addView(this.f88859w);
        ViewGroup.LayoutParams layoutParams = this.f88859w.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.f88859w.setLayoutParams(layoutParams);
        setWillNotDraw(false);
        this.f88841M = new Paint(1);
        this.f88848T = AbstractC32232i.m155465m(context, AbstractC17450b.NotificationColor1);
        this.f88849U = AbstractC32232i.m155465m(context, AbstractC17450b.NotificationColor2);
    }

    public void setIcon(Drawable drawable) {
        this.f88859w.setImageDrawable(drawable);
    }
}

package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.C1211t1;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1078k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: A */
    private Context f3931A;

    /* renamed from: B */
    private boolean f3932B;

    /* renamed from: C */
    private Drawable f3933C;

    /* renamed from: D */
    private boolean f3934D;

    /* renamed from: E */
    private LayoutInflater f3935E;

    /* renamed from: F */
    private boolean f3936F;

    /* renamed from: p */
    private C1074g f3937p;

    /* renamed from: q */
    private ImageView f3938q;

    /* renamed from: r */
    private RadioButton f3939r;

    /* renamed from: s */
    private TextView f3940s;

    /* renamed from: t */
    private CheckBox f3941t;

    /* renamed from: u */
    private TextView f3942u;

    /* renamed from: v */
    private ImageView f3943v;

    /* renamed from: w */
    private ImageView f3944w;

    /* renamed from: x */
    private LinearLayout f3945x;

    /* renamed from: y */
    private Drawable f3946y;

    /* renamed from: z */
    private int f3947z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m4981a(View view) {
        m4982c(view, -1);
    }

    /* renamed from: c */
    private void m4982c(View view, int i11) {
        LinearLayout linearLayout = this.f3945x;
        if (linearLayout != null) {
            linearLayout.addView(view, i11);
        } else {
            addView(view, i11);
        }
    }

    /* renamed from: d */
    private void m4983d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC19184g.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f3941t = checkBox;
        m4981a(checkBox);
    }

    /* renamed from: f */
    private void m4984f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC19184g.abc_list_menu_item_icon, (ViewGroup) this, false);
        this.f3938q = imageView;
        m4982c(imageView, 0);
    }

    /* renamed from: g */
    private void m4985g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC19184g.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f3939r = radioButton;
        m4981a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f3935E == null) {
            this.f3935E = LayoutInflater.from(getContext());
        }
        return this.f3935E;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        int i11;
        ImageView imageView = this.f3943v;
        if (imageView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3944w;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3944w.getLayoutParams();
            rect.top += this.f3944w.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: b */
    public void mo4971b(C1074g c1074g, int i11) {
        int i12;
        this.f3937p = c1074g;
        if (c1074g.isVisible()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setVisibility(i12);
        setTitle(c1074g.m5111i(this));
        setCheckable(c1074g.isCheckable());
        m4986h(c1074g.m5103A(), c1074g.m5109g());
        setIcon(c1074g.getIcon());
        setEnabled(c1074g.isEnabled());
        setSubMenuArrowVisible(c1074g.hasSubMenu());
        setContentDescription(c1074g.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    /* renamed from: e */
    public boolean mo4974e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1078k.a
    public C1074g getItemData() {
        return this.f3937p;
    }

    /* renamed from: h */
    public void m4986h(boolean z11, char c11) {
        int i11;
        if (z11 && this.f3937p.m5103A()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        if (i11 == 0) {
            this.f3942u.setText(this.f3937p.m5110h());
        }
        if (this.f3942u.getVisibility() != i11) {
            this.f3942u.setVisibility(i11);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        AbstractC1579n0.m7807D0(this, this.f3946y);
        TextView textView = (TextView) findViewById(AbstractC19183f.title);
        this.f3940s = textView;
        int i11 = this.f3947z;
        if (i11 != -1) {
            textView.setTextAppearance(this.f3931A, i11);
        }
        this.f3942u = (TextView) findViewById(AbstractC19183f.shortcut);
        ImageView imageView = (ImageView) findViewById(AbstractC19183f.submenuarrow);
        this.f3943v = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3933C);
        }
        this.f3944w = (ImageView) findViewById(AbstractC19183f.group_divider);
        this.f3945x = (LinearLayout) findViewById(AbstractC19183f.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f3938q != null && this.f3932B) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3938q.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        View view;
        if (!z11 && this.f3939r == null && this.f3941t == null) {
            return;
        }
        if (this.f3937p.m5115m()) {
            if (this.f3939r == null) {
                m4985g();
            }
            compoundButton = this.f3939r;
            view = this.f3941t;
        } else {
            if (this.f3941t == null) {
                m4983d();
            }
            compoundButton = this.f3941t;
            view = this.f3939r;
        }
        if (z11) {
            compoundButton.setChecked(this.f3937p.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f3941t;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f3939r;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if (this.f3937p.m5115m()) {
            if (this.f3939r == null) {
                m4985g();
            }
            compoundButton = this.f3939r;
        } else {
            if (this.f3941t == null) {
                m4983d();
            }
            compoundButton = this.f3941t;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.f3936F = z11;
        this.f3932B = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        int i11;
        ImageView imageView = this.f3944w;
        if (imageView != null) {
            if (!this.f3934D && z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z11;
        if (!this.f3937p.m5128z() && !this.f3936F) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && !this.f3932B) {
            return;
        }
        ImageView imageView = this.f3938q;
        if (imageView == null && drawable == null && !this.f3932B) {
            return;
        }
        if (imageView == null) {
            m4984f();
        }
        if (drawable == null && !this.f3932B) {
            this.f3938q.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f3938q;
        if (!z11) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f3938q.getVisibility() != 0) {
            this.f3938q.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f3940s.setText(charSequence);
            if (this.f3940s.getVisibility() != 0) {
                this.f3940s.setVisibility(0);
                return;
            }
            return;
        }
        if (this.f3940s.getVisibility() != 8) {
            this.f3940s.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        C1211t1 m5716v = C1211t1.m5716v(getContext(), attributeSet, AbstractC19187j.MenuView, i11, 0);
        this.f3946y = m5716v.m5723g(AbstractC19187j.MenuView_android_itemBackground);
        this.f3947z = m5716v.m5730n(AbstractC19187j.MenuView_android_itemTextAppearance, -1);
        this.f3932B = m5716v.m5717a(AbstractC19187j.MenuView_preserveIconSpacing, false);
        this.f3931A = context;
        this.f3933C = m5716v.m5723g(AbstractC19187j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC19178a.dropDownListViewStyle, 0);
        this.f3934D = obtainStyledAttributes.hasValue(0);
        m5716v.m5736w();
        obtainStyledAttributes.recycle();
    }
}

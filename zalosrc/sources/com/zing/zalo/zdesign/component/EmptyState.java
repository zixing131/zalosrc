package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ui0.C27276c;
import ui0.C27279f;

/* loaded from: classes7.dex */
public class EmptyState extends LinearLayout implements InterfaceC16976f1 {

    /* renamed from: A */
    private CharSequence f86262A;

    /* renamed from: p */
    private C25808b f86263p;

    /* renamed from: q */
    private int f86264q;

    /* renamed from: r */
    private RecyclingImageView f86265r;

    /* renamed from: s */
    private Drawable f86266s;

    /* renamed from: t */
    private RobotoTextView f86267t;

    /* renamed from: u */
    private RobotoTextView f86268u;

    /* renamed from: v */
    private FrameLayout f86269v;

    /* renamed from: w */
    private LinearLayout f86270w;

    /* renamed from: x */
    private Button f86271x;

    /* renamed from: y */
    private Button f86272y;

    /* renamed from: z */
    private CharSequence f86273z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90565a(AttributeSet attributeSet, int i11, int i12) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.EmptyState, i11, i12);
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…tyleRes\n                )");
            String string = obtainStyledAttributes.getString(AbstractC2815i.EmptyState_trackingId);
            String string2 = obtainStyledAttributes.getString(AbstractC2815i.EmptyState_title);
            String str = "";
            if (string2 == null) {
                string2 = "";
            }
            setTitle(string2);
            String string3 = obtainStyledAttributes.getString(AbstractC2815i.EmptyState_desc);
            if (string3 != null) {
                str = string3;
            }
            setDesc(str);
            this.f86266s = obtainStyledAttributes.getDrawable(AbstractC2815i.EmptyState_illustration);
            this.f86264q = obtainStyledAttributes.getInt(AbstractC2815i.EmptyState_empty_state_level, 0);
            if (string != null && string.length() != 0) {
                setIdTracking(string);
            }
            obtainStyledAttributes.recycle();
            setIllustration(this.f86266s);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m90566b(EmptyState emptyState, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            emptyState.m90565a(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: c */
    private final void m90567c() {
        int i11;
        int i12;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        int i13 = 24;
        int m139649b = C27276c.m139649b(context, 24);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        int m139649b2 = C27276c.m139649b(context2, 80);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams.height = -1;
        int i14 = 8;
        int i15 = 16;
        if (this.f86264q == EnumC16942a0.SECTION.m90758c()) {
            Context context3 = getContext();
            AbstractC19074t.m100207e(context3, "context");
            m139649b2 = C27276c.m139649b(context3, 24);
            layoutParams.height = -2;
            i11 = m139649b2;
            i13 = 16;
            i12 = 8;
            i14 = 4;
        } else {
            i11 = 0;
            i12 = 16;
            i15 = 24;
        }
        setLayoutParams(layoutParams);
        setPadding(m139649b, m139649b2, m139649b, i11);
        RobotoTextView robotoTextView = this.f86267t;
        Context context4 = getContext();
        AbstractC19074t.m100207e(context4, "context");
        robotoTextView.setPadding(0, 0, 0, C27276c.m139649b(context4, i14));
        C27279f c27279f = C27279f.f128337a;
        RecyclingImageView recyclingImageView = this.f86265r;
        C27279f.b bVar = C27279f.b.BOTTOM;
        c27279f.m139651a(recyclingImageView, i13, bVar);
        c27279f.m139651a(this.f86269v, i12, C27279f.b.TOP);
        c27279f.m139651a(this.f86270w, i15, bVar);
    }

    public final Button getButton() {
        return this.f86271x;
    }

    public final Button getButton2nd() {
        return this.f86272y;
    }

    public final CharSequence getDesc() {
        return this.f86262A;
    }

    public final RobotoTextView getDescTextView() {
        return this.f86268u;
    }

    public final RecyclingImageView getIllusImageView() {
        return this.f86265r;
    }

    public final CharSequence getTitle() {
        return this.f86273z;
    }

    public final RobotoTextView getTitleTextView() {
        return this.f86267t;
    }

    public final void setDesc(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86262A = charSequence;
        this.f86268u.setText(charSequence);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86263p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    public final void setIllustration(Drawable drawable) {
        if (drawable == null) {
            this.f86265r.setVisibility(8);
        }
        this.f86265r.setVisibility(0);
        this.f86265r.setImageDrawable(drawable);
    }

    public final void setLevel(EnumC16942a0 enumC16942a0) {
        AbstractC19074t.m100208f(enumC16942a0, "value");
        if (this.f86264q != enumC16942a0.m90758c()) {
            this.f86264q = enumC16942a0.m90758c();
            m90567c();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86273z = charSequence;
        this.f86267t.setText(charSequence);
        RobotoTextView robotoTextView = this.f86267t;
        if (this.f86273z.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86263p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyState(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86273z = "";
        this.f86262A = "";
        this.f86263p = new C25808b(new WeakReference(this));
        LayoutInflater.from(context).inflate(AbstractC2812f.layout_empty_state_zds, this);
        View findViewById = findViewById(AbstractC2811e.empty_state_illus);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.empty_state_illus)");
        this.f86265r = (RecyclingImageView) findViewById;
        View findViewById2 = findViewById(AbstractC2811e.empty_state_title);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.empty_state_title)");
        this.f86267t = (RobotoTextView) findViewById2;
        View findViewById3 = findViewById(AbstractC2811e.empty_state_description);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.empty_state_description)");
        this.f86268u = (RobotoTextView) findViewById3;
        View findViewById4 = findViewById(AbstractC2811e.empty_state_slot);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.empty_state_slot)");
        this.f86269v = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(AbstractC2811e.empty_state_content);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.empty_state_content)");
        this.f86270w = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(AbstractC2811e.empty_state_button);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.empty_state_button)");
        this.f86271x = (Button) findViewById6;
        View findViewById7 = findViewById(AbstractC2811e.empty_state_button_2nd);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.empty_state_button_2nd)");
        this.f86272y = (Button) findViewById7;
        if (getBackground() == null) {
            setBackground(AbstractC2816j.Companion.m13594c(context, AbstractC2807a.layer_background));
        }
        m90566b(this, attributeSet, i11, 0, 4, null);
        m90567c();
    }

    public final void setIllustration(int i11) {
        this.f86265r.setVisibility(0);
        this.f86265r.setImageResource(i11);
    }
}

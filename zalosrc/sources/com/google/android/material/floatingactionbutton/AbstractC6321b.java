package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.AbstractC1487i;
import java.util.ArrayList;
import java.util.List;
import p382o6.AbstractC24041a;
import p382o6.AbstractC24042b;
import p382o6.C24048h;

/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6321b implements InterfaceC6325f {

    /* renamed from: a */
    private final Context f35330a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f35331b;

    /* renamed from: c */
    private final ArrayList f35332c = new ArrayList();

    /* renamed from: d */
    private final C6320a f35333d;

    /* renamed from: e */
    private C24048h f35334e;

    /* renamed from: f */
    private C24048h f35335f;

    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes3.dex */
    public class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(AbstractC24041a.m125910a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f35289U.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6321b.this.f35331b.f35289U.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f11) {
            int colorForState = extendedFloatingActionButton.f35289U.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC6321b.this.f35331b.f35289U.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (AbstractC24041a.m125910a(0.0f, Color.alpha(colorForState) / 255.0f, f11.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f11.floatValue() == 1.0f) {
                extendedFloatingActionButton.m32300G(extendedFloatingActionButton.f35289U);
            } else {
                extendedFloatingActionButton.m32300G(valueOf);
            }
        }
    }

    public AbstractC6321b(ExtendedFloatingActionButton extendedFloatingActionButton, C6320a c6320a) {
        this.f35331b = extendedFloatingActionButton;
        this.f35330a = extendedFloatingActionButton.getContext();
        this.f35333d = c6320a;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: a */
    public void mo32318a() {
        this.f35333d.m32361b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: c */
    public void mo32324c() {
        this.f35333d.m32361b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: d */
    public C24048h mo32364d() {
        return this.f35335f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: e */
    public final void mo32365e(C24048h c24048h) {
        this.f35335f = c24048h;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: h */
    public AnimatorSet mo32322h() {
        return m32367l(m32368m());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    /* renamed from: i */
    public final List mo32366i() {
        return this.f35332c;
    }

    /* renamed from: l */
    public AnimatorSet m32367l(C24048h c24048h) {
        ArrayList arrayList = new ArrayList();
        if (c24048h.m125931j("opacity")) {
            arrayList.add(c24048h.m125927f("opacity", this.f35331b, View.ALPHA));
        }
        if (c24048h.m125931j("scale")) {
            arrayList.add(c24048h.m125927f("scale", this.f35331b, View.SCALE_Y));
            arrayList.add(c24048h.m125927f("scale", this.f35331b, View.SCALE_X));
        }
        if (c24048h.m125931j("width")) {
            arrayList.add(c24048h.m125927f("width", this.f35331b, ExtendedFloatingActionButton.f35272W));
        }
        if (c24048h.m125931j("height")) {
            arrayList.add(c24048h.m125927f("height", this.f35331b, ExtendedFloatingActionButton.f35273a0));
        }
        if (c24048h.m125931j("paddingStart")) {
            arrayList.add(c24048h.m125927f("paddingStart", this.f35331b, ExtendedFloatingActionButton.f35274b0));
        }
        if (c24048h.m125931j("paddingEnd")) {
            arrayList.add(c24048h.m125927f("paddingEnd", this.f35331b, ExtendedFloatingActionButton.f35275c0));
        }
        if (c24048h.m125931j("labelOpacity")) {
            arrayList.add(c24048h.m125927f("labelOpacity", this.f35331b, new a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC24042b.m125913a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final C24048h m32368m() {
        C24048h c24048h = this.f35335f;
        if (c24048h != null) {
            return c24048h;
        }
        if (this.f35334e == null) {
            this.f35334e = C24048h.m125925d(this.f35330a, mo32321g());
        }
        return (C24048h) AbstractC1487i.m7492g(this.f35334e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC6325f
    public void onAnimationStart(Animator animator) {
        this.f35333d.m32362c(animator);
    }
}

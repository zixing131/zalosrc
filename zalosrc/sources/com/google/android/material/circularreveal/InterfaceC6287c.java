package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.google.android.material.circularreveal.C6286b;
import p539u6.AbstractC27041a;

/* renamed from: com.google.android.material.circularreveal.c */
/* loaded from: classes3.dex */
public interface InterfaceC6287c extends C6286b.a {

    /* renamed from: com.google.android.material.circularreveal.c$b */
    /* loaded from: classes3.dex */
    public static class b implements TypeEvaluator {

        /* renamed from: b */
        public static final TypeEvaluator f35231b = new b();

        /* renamed from: a */
        private final e f35232a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f11, e eVar, e eVar2) {
            this.f35232a.m32248b(AbstractC27041a.m139199d(eVar.f35235a, eVar2.f35235a, f11), AbstractC27041a.m139199d(eVar.f35236b, eVar2.f35236b, f11), AbstractC27041a.m139199d(eVar.f35237c, eVar2.f35237c, f11));
            return this.f35232a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$c */
    /* loaded from: classes3.dex */
    public static class c extends Property {

        /* renamed from: a */
        public static final Property f35233a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC6287c interfaceC6287c) {
            return interfaceC6287c.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC6287c interfaceC6287c, e eVar) {
            interfaceC6287c.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$d */
    /* loaded from: classes3.dex */
    public static class d extends Property {

        /* renamed from: a */
        public static final Property f35234a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC6287c interfaceC6287c) {
            return Integer.valueOf(interfaceC6287c.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC6287c interfaceC6287c, Integer num) {
            interfaceC6287c.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.c$e */
    /* loaded from: classes3.dex */
    public static class e {

        /* renamed from: a */
        public float f35235a;

        /* renamed from: b */
        public float f35236b;

        /* renamed from: c */
        public float f35237c;

        private e() {
        }

        /* renamed from: a */
        public boolean m32247a() {
            return this.f35237c == Float.MAX_VALUE;
        }

        /* renamed from: b */
        public void m32248b(float f11, float f12, float f13) {
            this.f35235a = f11;
            this.f35236b = f12;
            this.f35237c = f13;
        }

        /* renamed from: c */
        public void m32249c(e eVar) {
            m32248b(eVar.f35235a, eVar.f35236b, eVar.f35237c);
        }

        public e(float f11, float f12, float f13) {
            this.f35235a = f11;
            this.f35236b = f12;
            this.f35237c = f13;
        }

        public e(e eVar) {
            this(eVar.f35235a, eVar.f35236b, eVar.f35237c);
        }
    }

    /* renamed from: a */
    void mo32220a();

    /* renamed from: b */
    void mo32221b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i11);

    void setRevealInfo(e eVar);
}

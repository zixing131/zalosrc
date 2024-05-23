package p382o6;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p665y0.C30245g;

/* renamed from: o6.h */
/* loaded from: classes3.dex */
public class C24048h {

    /* renamed from: a */
    private final C30245g f116371a = new C30245g();

    /* renamed from: b */
    private final C30245g f116372b = new C30245g();

    /* renamed from: a */
    private static void m125922a(C24048h c24048h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c24048h.m125933l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c24048h.m125934m(objectAnimator.getPropertyName(), C24049i.m125935b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    /* renamed from: b */
    private PropertyValuesHolder[] m125923b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i11 = 0; i11 < propertyValuesHolderArr.length; i11++) {
            propertyValuesHolderArr2[i11] = propertyValuesHolderArr[i11].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: c */
    public static C24048h m125924c(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        if (typedArray.hasValue(i11) && (resourceId = typedArray.getResourceId(i11, 0)) != 0) {
            return m125925d(context, resourceId);
        }
        return null;
    }

    /* renamed from: d */
    public static C24048h m125925d(Context context, int i11) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (loadAnimator instanceof AnimatorSet) {
                return m125926e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m125926e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i11));
            return null;
        }
    }

    /* renamed from: e */
    private static C24048h m125926e(List list) {
        C24048h c24048h = new C24048h();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m125922a(c24048h, (Animator) list.get(i11));
        }
        return c24048h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24048h)) {
            return false;
        }
        return this.f116371a.equals(((C24048h) obj).f116371a);
    }

    /* renamed from: f */
    public ObjectAnimator m125927f(String str, Object obj, Property property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, m125928g(str));
        ofPropertyValuesHolder.setProperty(property);
        m125929h(str).m125937a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] m125928g(String str) {
        if (m125931j(str)) {
            return m125923b((PropertyValuesHolder[]) this.f116372b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C24049i m125929h(String str) {
        if (m125932k(str)) {
            return (C24049i) this.f116371a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f116371a.hashCode();
    }

    /* renamed from: i */
    public long m125930i() {
        int size = this.f116371a.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C24049i c24049i = (C24049i) this.f116371a.m149167o(i11);
            j11 = Math.max(j11, c24049i.m125938c() + c24049i.m125939d());
        }
        return j11;
    }

    /* renamed from: j */
    public boolean m125931j(String str) {
        if (this.f116372b.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m125932k(String str) {
        if (this.f116371a.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void m125933l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f116372b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void m125934m(String str, C24049i c24049i) {
        this.f116371a.put(str, c24049i);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f116371a + "}\n";
    }
}

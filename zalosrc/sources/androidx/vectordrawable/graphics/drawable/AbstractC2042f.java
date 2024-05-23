package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.AbstractC1404k;
import androidx.core.graphics.AbstractC1424h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.vectordrawable.graphics.drawable.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2042f {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.f$a */
    /* loaded from: classes2.dex */
    public static class a implements TypeEvaluator {

        /* renamed from: a */
        private AbstractC1424h.b[] f8665a;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC1424h.b[] evaluate(float f11, AbstractC1424h.b[] bVarArr, AbstractC1424h.b[] bVarArr2) {
            if (AbstractC1424h.m7241b(bVarArr, bVarArr2)) {
                if (!AbstractC1424h.m7241b(this.f8665a, bVarArr)) {
                    this.f8665a = AbstractC1424h.m7245f(bVarArr);
                }
                for (int i11 = 0; i11 < bVarArr.length; i11++) {
                    this.f8665a[i11].m7254d(bVarArr[i11], bVarArr2[i11], f11);
                }
                return this.f8665a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* renamed from: a */
    private static Animator m11051a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f11) {
        return m11052b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animator m11052b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i11, float f11) {
        int i12;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i12 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        valueAnimator = m11064n(context, resources, theme, attributeSet, f11, xmlPullParser);
                    } else if (name.equals("animator")) {
                        valueAnimator = m11062l(context, resources, theme, attributeSet, null, f11, xmlPullParser);
                    } else {
                        if (name.equals("set")) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8643h);
                            m11052b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, AbstractC1404k.m7111g(m7115k, xmlPullParser, "ordering", 0, 0), f11);
                            m7115k.recycle();
                            valueAnimator = animatorSet2;
                        } else if (name.equals("propertyValuesHolder")) {
                            PropertyValuesHolder[] m11066p = m11066p(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                            if (m11066p != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(m11066p);
                            }
                            i12 = 1;
                        } else {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        if (animatorSet != null && i12 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    if (animatorSet != null) {
                        if (arrayList == null) {
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i12] = (Animator) it.next();
                i12++;
            }
            if (i11 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    /* renamed from: c */
    private static Keyframe m11053c(Keyframe keyframe, float f11) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f11);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f11);
        }
        return Keyframe.ofObject(f11);
    }

    /* renamed from: d */
    private static void m11054d(Keyframe[] keyframeArr, float f11, int i11, int i12) {
        float f12 = f11 / ((i12 - i11) + 2);
        while (i11 <= i12) {
            keyframeArr[i11].setFraction(keyframeArr[i11 - 1].getFraction() + f12);
            i11++;
        }
    }

    /* renamed from: e */
    private static PropertyValuesHolder m11055e(TypedArray typedArray, int i11, int i12, int i13, String str) {
        boolean z11;
        int i14;
        boolean z12;
        int i15;
        boolean z13;
        C2043g c2043g;
        int i16;
        int i17;
        int i18;
        float f11;
        PropertyValuesHolder ofFloat;
        float f12;
        float f13;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i12);
        if (peekValue != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i14 = peekValue.type;
        } else {
            i14 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i13);
        if (peekValue2 != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i15 = peekValue2.type;
        } else {
            i15 = 0;
        }
        if (i11 == 4) {
            if ((z11 && m11058h(i14)) || (z12 && m11058h(i15))) {
                i11 = 3;
            } else {
                i11 = 0;
            }
        }
        if (i11 == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (i11 == 2) {
            String string = typedArray.getString(i12);
            String string2 = typedArray.getString(i13);
            AbstractC1424h.b[] m7243d = AbstractC1424h.m7243d(string);
            AbstractC1424h.b[] m7243d2 = AbstractC1424h.m7243d(string2);
            if (m7243d == null && m7243d2 == null) {
                return null;
            }
            if (m7243d != null) {
                a aVar = new a();
                if (m7243d2 != null) {
                    if (AbstractC1424h.m7241b(m7243d, m7243d2)) {
                        ofObject = PropertyValuesHolder.ofObject(str, aVar, m7243d, m7243d2);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, aVar, m7243d);
                }
                return ofObject;
            }
            if (m7243d2 == null) {
                return null;
            }
            return PropertyValuesHolder.ofObject(str, new a(), m7243d2);
        }
        if (i11 == 3) {
            c2043g = C2043g.m11071a();
        } else {
            c2043g = null;
        }
        if (z13) {
            if (z11) {
                if (i14 == 5) {
                    f12 = typedArray.getDimension(i12, 0.0f);
                } else {
                    f12 = typedArray.getFloat(i12, 0.0f);
                }
                if (z12) {
                    if (i15 == 5) {
                        f13 = typedArray.getDimension(i13, 0.0f);
                    } else {
                        f13 = typedArray.getFloat(i13, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f12, f13);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f12);
                }
            } else {
                if (i15 == 5) {
                    f11 = typedArray.getDimension(i13, 0.0f);
                } else {
                    f11 = typedArray.getFloat(i13, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f11);
            }
            propertyValuesHolder = ofFloat;
        } else if (z11) {
            if (i14 == 5) {
                i17 = (int) typedArray.getDimension(i12, 0.0f);
            } else if (m11058h(i14)) {
                i17 = typedArray.getColor(i12, 0);
            } else {
                i17 = typedArray.getInt(i12, 0);
            }
            if (z12) {
                if (i15 == 5) {
                    i18 = (int) typedArray.getDimension(i13, 0.0f);
                } else if (m11058h(i15)) {
                    i18 = typedArray.getColor(i13, 0);
                } else {
                    i18 = typedArray.getInt(i13, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i17, i18);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i17);
            }
        } else if (z12) {
            if (i15 == 5) {
                i16 = (int) typedArray.getDimension(i13, 0.0f);
            } else if (m11058h(i15)) {
                i16 = typedArray.getColor(i13, 0);
            } else {
                i16 = typedArray.getInt(i13, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i16);
        }
        if (propertyValuesHolder != null && c2043g != null) {
            propertyValuesHolder.setEvaluator(c2043g);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    /* renamed from: f */
    private static int m11056f(TypedArray typedArray, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z12 = true;
        if (peekValue != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i13 = peekValue.type;
        } else {
            i13 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i12);
        if (peekValue2 == null) {
            z12 = false;
        }
        if (z12) {
            i14 = peekValue2.type;
        } else {
            i14 = 0;
        }
        if ((!z11 || !m11058h(i13)) && (!z12 || !m11058h(i14))) {
            return 0;
        }
        return 3;
    }

    /* renamed from: g */
    private static int m11057g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8645j);
        int i11 = 0;
        TypedValue m7116l = AbstractC1404k.m7116l(m7115k, xmlPullParser, "value", 0);
        if (m7116l != null && m11058h(m7116l.type)) {
            i11 = 3;
        }
        m7115k.recycle();
        return i11;
    }

    /* renamed from: h */
    private static boolean m11058h(int i11) {
        return i11 >= 28 && i11 <= 31;
    }

    /* renamed from: i */
    public static Animator m11059i(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i11);
        }
        return m11060j(context, context.getResources(), context.getTheme(), i11);
    }

    /* renamed from: j */
    public static Animator m11060j(Context context, Resources resources, Resources.Theme theme, int i11) {
        return m11061k(context, resources, theme, i11, 1.0f);
    }

    /* renamed from: k */
    public static Animator m11061k(Context context, Resources resources, Resources.Theme theme, int i11, float f11) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i11);
                    return m11051a(context, resources, theme, xmlResourceParser, f11);
                } catch (XmlPullParserException e11) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                    notFoundException.initCause(e11);
                    throw notFoundException;
                }
            } catch (IOException e12) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i11));
                notFoundException2.initCause(e12);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: l */
    private static ValueAnimator m11062l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f11, XmlPullParser xmlPullParser) {
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8642g);
        TypedArray m7115k2 = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8646k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m11067q(valueAnimator, m7115k, m7115k2, f11, xmlPullParser);
        int m7112h = AbstractC1404k.m7112h(m7115k, xmlPullParser, "interpolator", 0, 0);
        if (m7112h > 0) {
            valueAnimator.setInterpolator(AbstractC2041e.m11050a(context, m7112h));
        }
        m7115k.recycle();
        if (m7115k2 != null) {
            m7115k2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: m */
    private static Keyframe m11063m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i11, XmlPullParser xmlPullParser) {
        boolean z11;
        Keyframe ofInt;
        TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8645j);
        float m7110f = AbstractC1404k.m7110f(m7115k, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m7116l = AbstractC1404k.m7116l(m7115k, xmlPullParser, "value", 0);
        if (m7116l != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i11 == 4) {
            if (z11 && m11058h(m7116l.type)) {
                i11 = 3;
            } else {
                i11 = 0;
            }
        }
        if (z11) {
            if (i11 != 0) {
                if (i11 != 1 && i11 != 3) {
                    ofInt = null;
                } else {
                    ofInt = Keyframe.ofInt(m7110f, AbstractC1404k.m7111g(m7115k, xmlPullParser, "value", 0, 0));
                }
            } else {
                ofInt = Keyframe.ofFloat(m7110f, AbstractC1404k.m7110f(m7115k, xmlPullParser, "value", 0, 0.0f));
            }
        } else if (i11 == 0) {
            ofInt = Keyframe.ofFloat(m7110f);
        } else {
            ofInt = Keyframe.ofInt(m7110f);
        }
        int m7112h = AbstractC1404k.m7112h(m7115k, xmlPullParser, "interpolator", 1, 0);
        if (m7112h > 0) {
            ofInt.setInterpolator(AbstractC2041e.m11050a(context, m7112h));
        }
        m7115k.recycle();
        return ofInt;
    }

    /* renamed from: n */
    private static ObjectAnimator m11064n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f11, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m11062l(context, resources, theme, attributeSet, objectAnimator, f11, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: o */
    private static PropertyValuesHolder m11065o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i11) {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i11 == 4) {
                    i11 = m11057g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m11063m = m11063m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i11, xmlPullParser);
                if (m11063m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m11063m);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m11053c(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m11053c(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i12 = 0; i12 < size; i12++) {
                Keyframe keyframe3 = keyframeArr[i12];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i12 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i13 = size - 1;
                        if (i12 == i13) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i14 = i12;
                            for (int i15 = i12 + 1; i15 < i13 && keyframeArr[i15].getFraction() < 0.0f; i15++) {
                                i14 = i15;
                            }
                            m11054d(keyframeArr, keyframeArr[i14 + 1].getFraction() - keyframeArr[i12 - 1].getFraction(), i12, i14);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i11 == 3) {
                propertyValuesHolder.setEvaluator(C2043g.m11071a());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: p */
    private static PropertyValuesHolder[] m11066p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m7115k = AbstractC1404k.m7115k(resources, theme, attributeSet, AbstractC2037a.f8644i);
                    String m7113i = AbstractC1404k.m7113i(m7115k, xmlPullParser, "propertyName", 3);
                    int m7111g = AbstractC1404k.m7111g(m7115k, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m11065o = m11065o(context, resources, theme, xmlPullParser, m7113i, m7111g);
                    if (m11065o == null) {
                        m11065o = m11055e(m7115k, m7111g, 0, 1, m7113i);
                    }
                    if (m11065o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m11065o);
                    }
                    m7115k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i11 = 0; i11 < size; i11++) {
                propertyValuesHolderArr[i11] = (PropertyValuesHolder) arrayList.get(i11);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: q */
    private static void m11067q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f11, XmlPullParser xmlPullParser) {
        long m7111g = AbstractC1404k.m7111g(typedArray, xmlPullParser, "duration", 1, 300);
        long m7111g2 = AbstractC1404k.m7111g(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m7111g3 = AbstractC1404k.m7111g(typedArray, xmlPullParser, "valueType", 7, 4);
        if (AbstractC1404k.m7114j(xmlPullParser, "valueFrom") && AbstractC1404k.m7114j(xmlPullParser, "valueTo")) {
            if (m7111g3 == 4) {
                m7111g3 = m11056f(typedArray, 5, 6);
            }
            PropertyValuesHolder m11055e = m11055e(typedArray, m7111g3, 5, 6, "");
            if (m11055e != null) {
                valueAnimator.setValues(m11055e);
            }
        }
        valueAnimator.setDuration(m7111g);
        valueAnimator.setStartDelay(m7111g2);
        valueAnimator.setRepeatCount(AbstractC1404k.m7111g(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(AbstractC1404k.m7111g(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m11068r(valueAnimator, typedArray2, m7111g3, f11, xmlPullParser);
        }
    }

    /* renamed from: r */
    private static void m11068r(ValueAnimator valueAnimator, TypedArray typedArray, int i11, float f11, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m7113i = AbstractC1404k.m7113i(typedArray, xmlPullParser, "pathData", 1);
        if (m7113i != null) {
            String m7113i2 = AbstractC1404k.m7113i(typedArray, xmlPullParser, "propertyXName", 2);
            String m7113i3 = AbstractC1404k.m7113i(typedArray, xmlPullParser, "propertyYName", 3);
            if (i11 != 2) {
            }
            if (m7113i2 == null && m7113i3 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            m11069s(AbstractC1424h.m7244e(m7113i), objectAnimator, f11 * 0.5f, m7113i2, m7113i3);
            return;
        }
        objectAnimator.setPropertyName(AbstractC1404k.m7113i(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: s */
    private static void m11069s(Path path, ObjectAnimator objectAnimator, float f11, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f12 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f13 = 0.0f;
        do {
            f13 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f13));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f13 / f11)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f14 = f13 / (min - 1);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i11 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f12 - ((Float) arrayList.get(i12)).floatValue(), fArr3, null);
            fArr[i11] = fArr3[0];
            fArr2[i11] = fArr3[1];
            f12 += f14;
            int i13 = i12 + 1;
            if (i13 < arrayList.size() && f12 > ((Float) arrayList.get(i13)).floatValue()) {
                pathMeasure2.nextContour();
                i12 = i13;
            }
            i11++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }
}

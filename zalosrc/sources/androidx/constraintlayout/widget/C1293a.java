package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes2.dex */
public class C1293a {

    /* renamed from: a */
    private boolean f5595a;

    /* renamed from: b */
    String f5596b;

    /* renamed from: c */
    private b f5597c;

    /* renamed from: d */
    private int f5598d;

    /* renamed from: e */
    private float f5599e;

    /* renamed from: f */
    private String f5600f;

    /* renamed from: g */
    boolean f5601g;

    /* renamed from: h */
    private int f5602h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5603a;

        static {
            int[] iArr = new int[b.values().length];
            f5603a = iArr;
            try {
                iArr[b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5603a[b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5603a[b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5603a[b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5603a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5603a[b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5603a[b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5603a[b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes2.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C1293a(String str, b bVar, Object obj, boolean z11) {
        this.f5596b = str;
        this.f5597c = bVar;
        this.f5595a = z11;
        m6411j(obj);
    }

    /* renamed from: a */
    public static HashMap m6402a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C1293a c1293a = (C1293a) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new C1293a(c1293a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new C1293a(c1293a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (NoSuchMethodException e12) {
                e12.printStackTrace();
            } catch (InvocationTargetException e13) {
                e13.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: h */
    public static void m6403h(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC1298f.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == AbstractC1298f.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == AbstractC1298f.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z11 = true;
            } else if (index == AbstractC1298f.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == AbstractC1298f.CustomAttribute_customColorValue) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC1298f.CustomAttribute_customColorDrawableValue) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == AbstractC1298f.CustomAttribute_customPixelDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == AbstractC1298f.CustomAttribute_customDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC1298f.CustomAttribute_customFloatValue) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == AbstractC1298f.CustomAttribute_customIntegerValue) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == AbstractC1298f.CustomAttribute_customStringValue) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == AbstractC1298f.CustomAttribute_customReference) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C1293a(str, bVar2, obj, z11));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0045. Please report as an issue. */
    /* renamed from: i */
    public static void m6404i(View view, HashMap hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            C1293a c1293a = (C1293a) hashMap.get(str2);
            if (!c1293a.f5595a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                switch (a.f5603a[c1293a.f5597c.ordinal()]) {
                    case 1:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c1293a.f5598d));
                        break;
                    case 2:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(c1293a.f5601g));
                        break;
                    case 3:
                        cls.getMethod(str, CharSequence.class).invoke(view, c1293a.f5600f);
                        break;
                    case 4:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c1293a.f5602h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c1293a.f5602h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(c1293a.f5598d));
                        break;
                    case 7:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c1293a.f5599e));
                        break;
                    case 8:
                        cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(c1293a.f5599e));
                        break;
                }
            } catch (IllegalAccessException e11) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str2);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                e11.printStackTrace();
            } catch (NoSuchMethodException e12) {
                e12.getMessage();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(str2);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(str);
            } catch (InvocationTargetException e13) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(" Custom Attribute \"");
                sb5.append(str2);
                sb5.append("\" not found on ");
                sb5.append(cls.getName());
                e13.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public String m6405b() {
        return this.f5596b;
    }

    /* renamed from: c */
    public b m6406c() {
        return this.f5597c;
    }

    /* renamed from: d */
    public float m6407d() {
        switch (a.f5603a[this.f5597c.ordinal()]) {
            case 2:
                if (this.f5601g) {
                    return 1.0f;
                }
                return 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f5598d;
            case 7:
                return this.f5599e;
            case 8:
                return this.f5599e;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: e */
    public void m6408e(float[] fArr) {
        float f11;
        switch (a.f5603a[this.f5597c.ordinal()]) {
            case 2:
                if (this.f5601g) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                fArr[0] = f11;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i11 = (this.f5602h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f5598d;
                return;
            case 7:
                fArr[0] = this.f5599e;
                return;
            case 8:
                fArr[0] = this.f5599e;
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public boolean m6409f() {
        int i11 = a.f5603a[this.f5597c.ordinal()];
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int m6410g() {
        int i11 = a.f5603a[this.f5597c.ordinal()];
        if (i11 == 4 || i11 == 5) {
            return 4;
        }
        return 1;
    }

    /* renamed from: j */
    public void m6411j(Object obj) {
        switch (a.f5603a[this.f5597c.ordinal()]) {
            case 1:
            case 6:
                this.f5598d = ((Integer) obj).intValue();
                return;
            case 2:
                this.f5601g = ((Boolean) obj).booleanValue();
                return;
            case 3:
                this.f5600f = (String) obj;
                return;
            case 4:
            case 5:
                this.f5602h = ((Integer) obj).intValue();
                return;
            case 7:
                this.f5599e = ((Float) obj).floatValue();
                return;
            case 8:
                this.f5599e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public C1293a(C1293a c1293a, Object obj) {
        this.f5595a = false;
        this.f5596b = c1293a.f5596b;
        this.f5597c = c1293a.f5597c;
        m6411j(obj);
    }
}

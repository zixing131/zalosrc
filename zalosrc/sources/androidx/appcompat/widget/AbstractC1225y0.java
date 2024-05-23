package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.graphics.drawable.InterfaceC1417d;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.lang.reflect.Field;
import p224i0.AbstractC20176e;

/* renamed from: androidx.appcompat.widget.y0 */
/* loaded from: classes.dex */
public abstract class AbstractC1225y0 {

    /* renamed from: a */
    private static final int[] f4760a = {R.attr.state_checked};

    /* renamed from: b */
    private static final int[] f4761b = new int[0];

    /* renamed from: c */
    public static final Rect f4762c = new Rect();

    /* renamed from: d */
    private static Class f4763d;

    static {
        try {
            f4763d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static boolean m5769a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m5769a(drawable2)) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        if (drawable instanceof InterfaceC1417d) {
            return m5769a(((InterfaceC1417d) drawable).mo7221a());
        }
        if (drawable instanceof AbstractC20176e) {
            return m5769a(((AbstractC20176e) drawable).m105255a());
        }
        if (drawable instanceof ScaleDrawable) {
            return m5769a(((ScaleDrawable) drawable).getDrawable());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m5770b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m5771c(drawable);
        }
    }

    /* renamed from: c */
    private static void m5771c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f4761b);
        } else {
            drawable.setState(f4760a);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m5772d(Drawable drawable) {
        char c11;
        Insets opticalInsets;
        int i11;
        int i12;
        int i13;
        int i14;
        if (Build.VERSION.SDK_INT >= 29) {
            opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            i11 = opticalInsets.left;
            rect.left = i11;
            i12 = opticalInsets.right;
            rect.right = i12;
            i13 = opticalInsets.top;
            rect.top = i13;
            i14 = opticalInsets.bottom;
            rect.bottom = i14;
            return rect;
        }
        if (f4763d != null) {
            try {
                Drawable m7199q = AbstractC1414a.m7199q(drawable);
                Object invoke = m7199q.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(m7199q, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    for (Field field : f4763d.getFields()) {
                        String name = field.getName();
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                    if (c11 == 3) {
                                        rect2.bottom = field.getInt(invoke);
                                    }
                                } else {
                                    rect2.right = field.getInt(invoke);
                                }
                            } else {
                                rect2.top = field.getInt(invoke);
                            }
                        } else {
                            rect2.left = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
            }
        }
        return f4762c;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m5773e(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

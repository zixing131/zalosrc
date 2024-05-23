package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.C1202q1;
import androidx.core.view.AbstractC1579n0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p175g0.AbstractC19187j;
import p310l0.C21983d;
import p665y0.C30245g;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes2.dex */
public class C1061k {

    /* renamed from: b */
    private static final Class[] f3845b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f3846c = {R.attr.onClick};

    /* renamed from: d */
    private static final String[] f3847d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e */
    private static final C30245g f3848e = new C30245g();

    /* renamed from: a */
    private final Object[] f3849a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.k$a */
    /* loaded from: classes2.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: p */
        private final View f3850p;

        /* renamed from: q */
        private final String f3851q;

        /* renamed from: r */
        private Method f3852r;

        /* renamed from: s */
        private Context f3853s;

        public a(View view, String str) {
            this.f3850p = view;
            this.f3851q = str;
        }

        /* renamed from: a */
        private void m4916a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f3851q, View.class)) != null) {
                        this.f3852r = method;
                        this.f3853s = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id2 = this.f3850p.getId();
            if (id2 == -1) {
                str = "";
            } else {
                str = " with id '" + this.f3850p.getContext().getResources().getResourceEntryName(id2) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f3851q + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f3850p.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f3852r == null) {
                m4916a(this.f3850p.getContext());
            }
            try {
                this.f3852r.invoke(this.f3853s, view);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("Could not execute method for android:onClick", e12);
            }
        }
    }

    /* renamed from: a */
    private void m4895a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && AbstractC1579n0.m7850Z(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3846c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m4896r(Context context, String str, String str2) {
        String str3;
        C30245g c30245g = f3848e;
        Constructor constructor = (Constructor) c30245g.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3845b);
            c30245g.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f3849a);
    }

    /* renamed from: s */
    private View m4897s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f3849a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i11 = 0;
                while (true) {
                    String[] strArr = f3847d;
                    if (i11 >= strArr.length) {
                        return null;
                    }
                    View m4896r = m4896r(context, str, strArr[i11]);
                    if (m4896r != null) {
                        return m4896r;
                    }
                    i11++;
                }
            } else {
                return m4896r(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f3849a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m4898t(Context context, AttributeSet attributeSet, boolean z11, boolean z12) {
        int i11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.View, 0, 0);
        if (z11) {
            i11 = obtainStyledAttributes.getResourceId(AbstractC19187j.View_android_theme, 0);
        } else {
            i11 = 0;
        }
        if (z12 && i11 == 0) {
            i11 = obtainStyledAttributes.getResourceId(AbstractC19187j.View_theme, 0);
        }
        obtainStyledAttributes.recycle();
        if (i11 != 0) {
            if (!(context instanceof C21983d) || ((C21983d) context).m114801c() != i11) {
                return new C21983d(context, i11);
            }
            return context;
        }
        return context;
    }

    /* renamed from: u */
    private void m4899u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: b */
    protected AppCompatAutoCompleteTextView mo4900b(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: c */
    protected AppCompatButton mo4901c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* renamed from: d */
    protected AppCompatCheckBox mo4902d(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* renamed from: e */
    protected AppCompatCheckedTextView m4903e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* renamed from: f */
    protected AppCompatEditText m4904f(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* renamed from: g */
    protected AppCompatImageButton m4905g(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* renamed from: h */
    protected AppCompatImageView m4906h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* renamed from: i */
    protected AppCompatMultiAutoCompleteTextView m4907i(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* renamed from: j */
    protected AppCompatRadioButton mo4908j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* renamed from: k */
    protected AppCompatRatingBar m4909k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* renamed from: l */
    protected AppCompatSeekBar m4910l(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    /* renamed from: m */
    protected AppCompatSpinner m4911m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* renamed from: n */
    protected AppCompatTextView mo4912n(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* renamed from: o */
    protected AppCompatToggleButton m4913o(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    /* renamed from: p */
    protected View m4914p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final View m4915q(View view, String str, Context context, AttributeSet attributeSet, boolean z11, boolean z12, boolean z13, boolean z14) {
        Context context2;
        View m4909k;
        if (z11 && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z12 || z13) {
            context2 = m4898t(context2, attributeSet, z12, z13);
        }
        if (z14) {
            context2 = C1202q1.m5687b(context2);
        }
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c11 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c11 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c11 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c11 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c11 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c11 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c11 = '\r';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                m4909k = m4909k(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 1:
                m4909k = m4903e(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 2:
                m4909k = m4907i(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 3:
                m4909k = mo4912n(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 4:
                m4909k = m4905g(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 5:
                m4909k = m4910l(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 6:
                m4909k = m4911m(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 7:
                m4909k = mo4908j(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case '\b':
                m4909k = m4913o(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case '\t':
                m4909k = m4906h(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case '\n':
                m4909k = mo4900b(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case 11:
                m4909k = mo4902d(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case '\f':
                m4909k = m4904f(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            case '\r':
                m4909k = mo4901c(context2, attributeSet);
                m4899u(m4909k, str);
                break;
            default:
                m4909k = m4914p(context2, str, attributeSet);
                break;
        }
        if (m4909k == null && context != context2) {
            m4909k = m4897s(context2, str, attributeSet);
        }
        if (m4909k != null) {
            m4895a(m4909k, attributeSet);
        }
        return m4909k;
    }
}

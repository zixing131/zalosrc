package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.AbstractC1475n;
import androidx.core.util.AbstractC1487i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.l */
/* loaded from: classes.dex */
public abstract class AbstractC1640l {

    /* renamed from: androidx.core.widget.l$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static boolean m8427a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m8428b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m8429c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.l$b */
    /* loaded from: classes2.dex */
    public static class b {
        /* renamed from: a */
        static Drawable[] m8430a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m8431b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m8432c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m8433d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m8434e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m8435f(TextView textView, int i11, int i12, int i13, int i14) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
        }

        /* renamed from: g */
        static void m8436g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m8437h(View view, int i11) {
            view.setTextDirection(i11);
        }
    }

    /* renamed from: androidx.core.widget.l$c */
    /* loaded from: classes2.dex */
    public static class c {
        /* renamed from: a */
        static int m8438a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m8439b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m8440c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m8441d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m8442e(TextView textView, int i11) {
            textView.setBreakStrategy(i11);
        }

        /* renamed from: f */
        static void m8443f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m8444g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m8445h(TextView textView, int i11) {
            textView.setHyphenationFrequency(i11);
        }
    }

    /* renamed from: androidx.core.widget.l$d */
    /* loaded from: classes2.dex */
    public static class d {
        /* renamed from: a */
        static DecimalFormatSymbols m8446a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.l$e */
    /* loaded from: classes2.dex */
    public static class e {
        /* renamed from: a */
        static String[] m8447a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m8448b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m8449c(TextView textView, int i11) {
            textView.setFirstBaselineToTopHeight(i11);
        }
    }

    /* renamed from: androidx.core.widget.l$f */
    /* loaded from: classes2.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f6675a;

        /* renamed from: b */
        private final TextView f6676b;

        /* renamed from: c */
        private Class f6677c;

        /* renamed from: d */
        private Method f6678d;

        /* renamed from: e */
        private boolean f6679e;

        /* renamed from: f */
        private boolean f6680f = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f6675a = callback;
            this.f6676b = textView;
        }

        /* renamed from: a */
        private Intent m8450a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m8451b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m8450a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m8453d(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List m8452c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m8450a(), 0)) {
                if (m8454e(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        private boolean m8453d(TextView textView) {
            if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private boolean m8454e(ResolveInfo resolveInfo, Context context) {
            int checkSelfPermission;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str != null) {
                checkSelfPermission = context.checkSelfPermission(str);
                if (checkSelfPermission == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private void m8455f(Menu menu) {
            Method declaredMethod;
            Context context = this.f6676b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f6680f) {
                this.f6680f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f6677c = cls;
                    this.f6678d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f6679e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f6677c = null;
                    this.f6678d = null;
                    this.f6679e = false;
                }
            }
            try {
                if (this.f6679e && this.f6677c.isInstance(menu)) {
                    declaredMethod = this.f6678d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List m8452c = m8452c(context, packageManager);
                for (int i11 = 0; i11 < m8452c.size(); i11++) {
                    ResolveInfo resolveInfo = (ResolveInfo) m8452c.get(i11);
                    menu.add(0, 0, i11 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m8451b(resolveInfo, this.f6676b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f6675a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f6675a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f6675a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m8455f(menu);
            return this.f6675a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m8410a(TextView textView) {
        return b.m8430a(textView);
    }

    /* renamed from: b */
    public static int m8411b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m8412c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m8413d(TextView textView) {
        return a.m8428b(textView);
    }

    /* renamed from: e */
    private static int m8414e(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        if (textDirectionHeuristic != textDirectionHeuristic3) {
            return 1;
        }
        return 7;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m8415f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(e.m8447a(d.m8446a(b.m8433d(textView)))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (b.m8431b(textView) != 1) {
            z11 = false;
        }
        switch (b.m8432c(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                if (z11) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    /* renamed from: g */
    public static AbstractC1475n.a m8416g(TextView textView) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            return new AbstractC1475n.a(e.m8448b(textView));
        }
        AbstractC1475n.a.C32627a c32627a = new AbstractC1475n.a.C32627a(new TextPaint(textView.getPaint()));
        if (i11 >= 23) {
            c32627a.m7462b(c.m8438a(textView));
            c32627a.m7463c(c.m8441d(textView));
        }
        c32627a.m7464d(m8415f(textView));
        return c32627a.m7461a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static void m8417h(TextView textView, ColorStateList colorStateList) {
        AbstractC1487i.m7492g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m8443f(textView, colorStateList);
        } else if (textView instanceof InterfaceC1642n) {
            ((InterfaceC1642n) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m8418i(TextView textView, PorterDuff.Mode mode) {
        AbstractC1487i.m7492g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m8444g(textView, mode);
        } else if (textView instanceof InterfaceC1642n) {
            ((InterfaceC1642n) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: j */
    public static void m8419j(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        b.m8434e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: k */
    public static void m8420k(TextView textView, int i11) {
        int i12;
        AbstractC1487i.m7489d(i11);
        if (Build.VERSION.SDK_INT >= 28) {
            e.m8449c(textView, i11);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.m8427a(textView)) {
            i12 = fontMetricsInt.top;
        } else {
            i12 = fontMetricsInt.ascent;
        }
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), i11 + i12, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: l */
    public static void m8421l(TextView textView, int i11) {
        int i12;
        AbstractC1487i.m7489d(i11);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (a.m8427a(textView)) {
            i12 = fontMetricsInt.bottom;
        } else {
            i12 = fontMetricsInt.descent;
        }
        if (i11 > Math.abs(i12)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i11 - i12);
        }
    }

    /* renamed from: m */
    public static void m8422m(TextView textView, int i11) {
        AbstractC1487i.m7489d(i11);
        if (i11 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i11 - r0, 1.0f);
        }
    }

    /* renamed from: n */
    public static void m8423n(TextView textView, AbstractC1475n abstractC1475n) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m8416g(textView);
        throw null;
    }

    /* renamed from: o */
    public static void m8424o(TextView textView, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i11);
        } else {
            textView.setTextAppearance(textView.getContext(), i11);
        }
    }

    /* renamed from: p */
    public static void m8425p(TextView textView, AbstractC1475n.a aVar) {
        int i11 = Build.VERSION.SDK_INT;
        b.m8437h(textView, m8414e(aVar.m7459d()));
        if (i11 < 23) {
            float textScaleX = aVar.m7460e().getTextScaleX();
            textView.getPaint().set(aVar.m7460e());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.m7460e());
        c.m8442e(textView, aVar.m7457b());
        c.m8445h(textView, aVar.m7458c());
    }

    /* renamed from: q */
    public static ActionMode.Callback m8426q(TextView textView, ActionMode.Callback callback) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 <= 27 && !(callback instanceof f) && callback != null) {
            return new f(callback, textView);
        }
        return callback;
    }
}

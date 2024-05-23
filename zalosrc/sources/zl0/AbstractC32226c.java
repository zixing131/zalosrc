package zl0;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import ho0.AbstractC20110a;
import java.lang.reflect.Field;
import p542ub.InterfaceC27218a;

/* renamed from: zl0.c */
/* loaded from: classes.dex */
public abstract class AbstractC32226c {

    /* renamed from: a */
    private static Rect f148626a = new Rect();

    /* renamed from: zl0.c$a */
    /* loaded from: classes7.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ View f148627p;

        /* renamed from: q */
        final /* synthetic */ b f148628q;

        a(View view, b bVar) {
            this.f148627p = view;
            this.f148628q = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f148627p.getViewTreeObserver().removeOnPreDrawListener(this);
            AbstractC32226c.m155404c(this.f148627p, this.f148628q);
            return false;
        }
    }

    /* renamed from: zl0.c$b */
    /* loaded from: classes7.dex */
    public static class b {

        /* renamed from: j */
        public final View f148638j;

        /* renamed from: a */
        public boolean f148629a = true;

        /* renamed from: b */
        public boolean f148630b = false;

        /* renamed from: c */
        public boolean f148631c = false;

        /* renamed from: d */
        public boolean f148632d = false;

        /* renamed from: e */
        public boolean f148633e = false;

        /* renamed from: f */
        public int f148634f = 0;

        /* renamed from: g */
        public int f148635g = 0;

        /* renamed from: h */
        public int f148636h = 0;

        /* renamed from: i */
        public int f148637i = 0;

        /* renamed from: k */
        public boolean f148639k = true;

        /* renamed from: l */
        public boolean f148640l = false;

        public b(View view) {
            this.f148638j = view;
        }

        /* renamed from: a */
        public void m155416a(int i11, int i12, int i13, int i14) {
            this.f148634f = i11;
            this.f148635g = i12;
            this.f148636h = i13;
            this.f148637i = i14;
        }
    }

    /* renamed from: b */
    public static void m155403b(b bVar, boolean z11) {
        View view = bVar.f148638j;
        if (view == null) {
            return;
        }
        if (z11) {
            m155404c(view, bVar);
        } else {
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m155404c(View view, b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i11;
        int max;
        int max2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (bVar != null && view != null && view.getVisibility() != 8) {
            int[] iArr = new int[2];
            if (bVar.f148640l) {
                view.getLocationInWindow(iArr);
            }
            int i17 = 0;
            int i18 = iArr[0];
            int i19 = iArr[1];
            Rect rect = null;
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            } else {
                marginLayoutParams = null;
            }
            if (bVar.f148639k) {
                i18 -= view.getPaddingLeft();
                i11 = view.getPaddingTop();
            } else {
                if (marginLayoutParams != null) {
                    i18 -= marginLayoutParams.leftMargin;
                    i11 = marginLayoutParams.topMargin;
                }
                if (i18 < 0) {
                    i18 = 0;
                }
                if (i19 < 0) {
                    i19 = 0;
                }
                View rootView = view.getRootView();
                int width = rootView.getWidth();
                int height = rootView.getHeight();
                Rect m155407f = m155407f(rootView);
                if (Build.VERSION.SDK_INT >= 26) {
                    rect = AbstractC32229f.m155440l(rootView);
                }
                if (rect == null) {
                    rect = new Rect();
                }
                if (!bVar.f148629a) {
                    max = rect.left;
                    i12 = rect.top;
                    i13 = rect.right;
                    max2 = rect.bottom;
                } else {
                    max = Math.max(m155407f.left, rect.left);
                    int max3 = Math.max(m155407f.top, rect.top);
                    int max4 = Math.max(m155407f.right, rect.right);
                    max2 = Math.max(m155407f.bottom, rect.bottom);
                    i12 = max3;
                    i13 = max4;
                }
                if (!bVar.f148630b) {
                    if (i18 < max) {
                        i14 = max - i18;
                    }
                    i14 = 0;
                } else if (bVar.f148639k) {
                    i14 = view.getPaddingLeft();
                } else {
                    if (marginLayoutParams != null) {
                        i14 = marginLayoutParams.leftMargin;
                    }
                    i14 = 0;
                }
                if (!bVar.f148631c) {
                    if (i19 < i12) {
                        i15 = i12 - i19;
                    }
                    i15 = 0;
                } else if (bVar.f148639k) {
                    i15 = view.getPaddingTop();
                } else {
                    if (marginLayoutParams != null) {
                        i15 = marginLayoutParams.topMargin;
                    }
                    i15 = 0;
                }
                int width2 = i18 + view.getWidth();
                int height2 = i19 + view.getHeight();
                int paddingLeft = width2 + (i14 - view.getPaddingLeft());
                int paddingTop = height2 + (i15 - view.getPaddingTop());
                if (!bVar.f148632d) {
                    int i21 = width - i13;
                    if (paddingLeft > i21) {
                        i16 = paddingLeft - i21;
                    }
                    i16 = 0;
                } else if (bVar.f148639k) {
                    i16 = view.getPaddingRight();
                } else {
                    if (marginLayoutParams != null) {
                        i16 = marginLayoutParams.rightMargin;
                    }
                    i16 = 0;
                }
                if (!bVar.f148633e) {
                    int i22 = height - max2;
                    if (paddingTop > i22) {
                        i17 = paddingTop - i22;
                    }
                } else if (bVar.f148639k) {
                    i17 = view.getPaddingBottom();
                } else if (marginLayoutParams != null) {
                    i17 = marginLayoutParams.bottomMargin;
                }
                int i23 = i14 + bVar.f148634f;
                int i24 = i15 + bVar.f148635g;
                int i25 = i16 + bVar.f148636h;
                int i26 = i17 + bVar.f148637i;
                if (!bVar.f148639k) {
                    view.setPadding(i23, i24, i25, i26);
                    return;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = i23;
                    marginLayoutParams.topMargin = i24;
                    marginLayoutParams.rightMargin = i25;
                    marginLayoutParams.bottomMargin = i26;
                    view.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            i19 -= i11;
            if (i18 < 0) {
            }
            if (i19 < 0) {
            }
            View rootView2 = view.getRootView();
            int width3 = rootView2.getWidth();
            int height3 = rootView2.getHeight();
            Rect m155407f2 = m155407f(rootView2);
            if (Build.VERSION.SDK_INT >= 26) {
            }
            if (rect == null) {
            }
            if (!bVar.f148629a) {
            }
            if (!bVar.f148630b) {
            }
            if (!bVar.f148631c) {
            }
            int width22 = i18 + view.getWidth();
            int height22 = i19 + view.getHeight();
            int paddingLeft2 = width22 + (i14 - view.getPaddingLeft());
            int paddingTop2 = height22 + (i15 - view.getPaddingTop());
            if (!bVar.f148632d) {
            }
            if (!bVar.f148633e) {
            }
            int i232 = i14 + bVar.f148634f;
            int i242 = i15 + bVar.f148635g;
            int i252 = i16 + bVar.f148636h;
            int i262 = i17 + bVar.f148637i;
            if (!bVar.f148639k) {
            }
        }
    }

    /* renamed from: d */
    public static int m155405d(InterfaceC27218a interfaceC27218a) {
        if (m155415n(interfaceC27218a)) {
            return m155411j(interfaceC27218a).top;
        }
        return 0;
    }

    /* renamed from: e */
    public static Insets m155406e(View view) {
        Insets insets;
        WindowInsets rootWindowInsets;
        Insets systemGestureInsets;
        Insets insets2;
        if (view == null || Build.VERSION.SDK_INT < 29) {
            insets = Insets.NONE;
            return insets;
        }
        rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            insets2 = Insets.NONE;
            return insets2;
        }
        systemGestureInsets = rootWindowInsets.getSystemGestureInsets();
        AbstractC20110a.m104535d("getSystemGestureInsets: %s", systemGestureInsets);
        return systemGestureInsets;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:            r5 = r5.getRootWindowInsets();     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Rect m155407f(View view) {
        WindowInsets rootWindowInsets;
        if (view == null) {
            return f148626a;
        }
        Rect rect = null;
        try {
            if (Build.VERSION.SDK_INT >= 23 && rootWindowInsets != null) {
                rect = new Rect(rootWindowInsets.getSystemWindowInsetLeft(), rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), rootWindowInsets.getSystemWindowInsetBottom());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (rect == null) {
            AbstractC17484n.b bVar = AbstractC17484n.Companion;
            return new Rect(0, bVar.m92931b(), 0, bVar.m92930a());
        }
        return rect;
    }

    /* renamed from: g */
    public static int m155408g(View view) {
        if (view == null) {
            return 0;
        }
        return m155410i(view).bottom;
    }

    /* renamed from: h */
    public static int m155409h(View view) {
        if (view == null) {
            return 0;
        }
        return m155410i(view).top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Rect m155410i(View view) {
        Rect rect;
        WindowInsets rootWindowInsets;
        if (view == null) {
            return f148626a;
        }
        Rect rect2 = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null) {
                rect = new Rect(rootWindowInsets.getStableInsetLeft(), rootWindowInsets.getStableInsetTop(), rootWindowInsets.getStableInsetRight(), rootWindowInsets.getStableInsetBottom());
            }
            if (rect2 == null) {
                AbstractC17484n.b bVar = AbstractC17484n.Companion;
                return new Rect(0, bVar.m92931b(), 0, bVar.m92930a());
            }
            return rect2;
        }
        Field declaredField = View.class.getDeclaredField("mAttachInfo");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(view);
        if (obj != null) {
            Field declaredField2 = obj.getClass().getDeclaredField("mStableInsets");
            declaredField2.setAccessible(true);
            rect = new Rect((Rect) declaredField2.get(obj));
        }
        if (rect2 == null) {
        }
        rect2 = rect;
        if (rect2 == null) {
        }
    }

    /* renamed from: j */
    public static Rect m155411j(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a != null && interfaceC27218a.mo35570g0() != null) {
            return m155410i(interfaceC27218a.mo35570g0().getRootView());
        }
        AbstractC17484n.b bVar = AbstractC17484n.Companion;
        return new Rect(0, bVar.m92931b(), 0, bVar.m92930a());
    }

    /* renamed from: k */
    public static boolean m155412k(View view) {
        int i11;
        int i12;
        if (view == null || Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Insets m155406e = m155406e(view);
        i11 = m155406e.left;
        if (i11 > 0) {
            i12 = m155406e.right;
            if (i12 <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static void m155413l(ZaloView zaloView, ActionBar actionBar) {
        if (zaloView != null && actionBar != null) {
            actionBar.setOccupyStatusBar(m155414m(zaloView));
        }
    }

    /* renamed from: m */
    public static boolean m155414m(ZaloView zaloView) {
        if (zaloView.m92692wK().mo35576n3()) {
            return true;
        }
        if (AbstractC32229f.m155448t(zaloView.getContext())) {
            if (zaloView.m92651WI().getConfiguration().orientation != 2) {
                return true;
            }
        } else {
            Rect m155440l = AbstractC32229f.m155440l(zaloView.m92656bJ());
            if (m155440l != null && m155440l.top > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m155415n(InterfaceC27218a interfaceC27218a) {
        return !interfaceC27218a.mo35567d1();
    }
}

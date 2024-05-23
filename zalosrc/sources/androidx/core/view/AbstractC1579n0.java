package androidx.core.view;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.util.AbstractC1487i;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.C1492a1;
import androidx.core.view.C1580n1;
import androidx.core.view.accessibility.C1507g0;
import androidx.core.view.accessibility.InterfaceC1513j0;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p176g1.AbstractC19201c;
import p664y.AbstractC30228a;
import p665y0.C30245g;

/* renamed from: androidx.core.view.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC1579n0 {

    /* renamed from: c */
    private static Method f6504c;

    /* renamed from: d */
    private static Field f6505d;

    /* renamed from: f */
    private static ThreadLocal f6507f;

    /* renamed from: a */
    private static final AtomicInteger f6502a = new AtomicInteger(1);

    /* renamed from: b */
    private static WeakHashMap f6503b = null;

    /* renamed from: e */
    private static boolean f6506e = false;

    /* renamed from: g */
    private static final int[] f6508g = {AbstractC19201c.accessibility_custom_action_0, AbstractC19201c.accessibility_custom_action_1, AbstractC19201c.accessibility_custom_action_2, AbstractC19201c.accessibility_custom_action_3, AbstractC19201c.accessibility_custom_action_4, AbstractC19201c.accessibility_custom_action_5, AbstractC19201c.accessibility_custom_action_6, AbstractC19201c.accessibility_custom_action_7, AbstractC19201c.accessibility_custom_action_8, AbstractC19201c.accessibility_custom_action_9, AbstractC19201c.accessibility_custom_action_10, AbstractC19201c.accessibility_custom_action_11, AbstractC19201c.accessibility_custom_action_12, AbstractC19201c.accessibility_custom_action_13, AbstractC19201c.accessibility_custom_action_14, AbstractC19201c.accessibility_custom_action_15, AbstractC19201c.accessibility_custom_action_16, AbstractC19201c.accessibility_custom_action_17, AbstractC19201c.accessibility_custom_action_18, AbstractC19201c.accessibility_custom_action_19, AbstractC19201c.accessibility_custom_action_20, AbstractC19201c.accessibility_custom_action_21, AbstractC19201c.accessibility_custom_action_22, AbstractC19201c.accessibility_custom_action_23, AbstractC19201c.accessibility_custom_action_24, AbstractC19201c.accessibility_custom_action_25, AbstractC19201c.accessibility_custom_action_26, AbstractC19201c.accessibility_custom_action_27, AbstractC19201c.accessibility_custom_action_28, AbstractC19201c.accessibility_custom_action_29, AbstractC19201c.accessibility_custom_action_30, AbstractC19201c.accessibility_custom_action_31};

    /* renamed from: h */
    private static final InterfaceC1559i0 f6509h = new InterfaceC1559i0() { // from class: androidx.core.view.m0
        @Override // androidx.core.view.InterfaceC1559i0
        /* renamed from: a */
        public final C1538d mo7776a(C1538d c1538d) {
            C1538d m7877i0;
            m7877i0 = AbstractC1579n0.m7877i0(c1538d);
            return m7877i0;
        }
    };

    /* renamed from: i */
    private static final e f6510i = new e();

    /* renamed from: androidx.core.view.n0$a */
    /* loaded from: classes2.dex */
    public class a extends f {
        a(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        @Override // androidx.core.view.AbstractC1579n0.f
        /* renamed from: e */
        public Boolean mo7915c(View view) {
            return Boolean.valueOf(q.m8023d(view));
        }
    }

    /* renamed from: androidx.core.view.n0$b */
    /* loaded from: classes2.dex */
    public class b extends f {
        b(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        @Override // androidx.core.view.AbstractC1579n0.f
        /* renamed from: e */
        public CharSequence mo7915c(View view) {
            return q.m8021b(view);
        }
    }

    /* renamed from: androidx.core.view.n0$c */
    /* loaded from: classes2.dex */
    public class c extends f {
        c(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        @Override // androidx.core.view.AbstractC1579n0.f
        /* renamed from: e */
        public CharSequence mo7915c(View view) {
            return s.m8033a(view);
        }
    }

    /* renamed from: androidx.core.view.n0$d */
    /* loaded from: classes2.dex */
    public class d extends f {
        d(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        @Override // androidx.core.view.AbstractC1579n0.f
        /* renamed from: e */
        public Boolean mo7915c(View view) {
            return Boolean.valueOf(q.m8022c(view));
        }
    }

    /* renamed from: androidx.core.view.n0$e */
    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: p */
        private final WeakHashMap f6511p = new WeakHashMap();

        e() {
        }

        /* renamed from: a */
        private void m7920a(View view, boolean z11) {
            boolean z12;
            int i11;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 != z12) {
                if (z12) {
                    i11 = 16;
                } else {
                    i11 = 32;
                }
                AbstractC1579n0.m7880j0(view, i11);
                this.f6511p.put(view, Boolean.valueOf(z12));
            }
        }

        /* renamed from: b */
        private void m7921b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f6511p.entrySet()) {
                    m7920a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m7921b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.n0$f */
    /* loaded from: classes2.dex */
    public static abstract class f {

        /* renamed from: a */
        private final int f6512a;

        /* renamed from: b */
        private final Class f6513b;

        /* renamed from: c */
        private final int f6514c;

        /* renamed from: d */
        private final int f6515d;

        f(int i11, Class cls, int i12) {
            this(i11, cls, 0, i12);
        }

        /* renamed from: a */
        private boolean m7922a() {
            return true;
        }

        /* renamed from: b */
        private boolean m7923b() {
            return Build.VERSION.SDK_INT >= this.f6514c;
        }

        /* renamed from: c */
        abstract Object mo7915c(View view);

        /* renamed from: d */
        Object m7924d(View view) {
            if (m7923b()) {
                return mo7915c(view);
            }
            if (m7922a()) {
                Object tag = view.getTag(this.f6512a);
                if (this.f6513b.isInstance(tag)) {
                    return tag;
                }
                return null;
            }
            return null;
        }

        f(int i11, Class cls, int i12, int i13) {
            this.f6512a = i11;
            this.f6513b = cls;
            this.f6515d = i12;
            this.f6514c = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$g */
    /* loaded from: classes2.dex */
    public static class g {
        /* renamed from: a */
        static boolean m7925a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: androidx.core.view.n0$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        static AccessibilityNodeProvider m7926a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        static boolean m7927b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        static int m7928c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        static int m7929d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        static int m7930e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        static ViewParent m7931f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        static int m7932g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        static boolean m7933h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        static boolean m7934i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        static boolean m7935j(View view, int i11, Bundle bundle) {
            return view.performAccessibilityAction(i11, bundle);
        }

        /* renamed from: k */
        static void m7936k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        static void m7937l(View view, int i11, int i12, int i13, int i14) {
            view.postInvalidateOnAnimation(i11, i12, i13, i14);
        }

        /* renamed from: m */
        static void m7938m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        static void m7939n(View view, Runnable runnable, long j11) {
            view.postOnAnimationDelayed(runnable, j11);
        }

        /* renamed from: o */
        static void m7940o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        static void m7941p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        static void m7942q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        static void m7943r(View view, boolean z11) {
            view.setHasTransientState(z11);
        }

        /* renamed from: s */
        static void m7944s(View view, int i11) {
            view.setImportantForAccessibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$i */
    /* loaded from: classes2.dex */
    public static class i {
        /* renamed from: a */
        static int m7945a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        static Display m7946b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        static int m7947c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        static int m7948d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        static int m7949e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        static int m7950f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        static boolean m7951g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        static void m7952h(View view, int i11) {
            view.setLabelFor(i11);
        }

        /* renamed from: i */
        static void m7953i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        static void m7954j(View view, int i11) {
            view.setLayoutDirection(i11);
        }

        /* renamed from: k */
        static void m7955k(View view, int i11, int i12, int i13, int i14) {
            view.setPaddingRelative(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$j */
    /* loaded from: classes2.dex */
    public static class j {
        /* renamed from: a */
        static Rect m7956a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        static boolean m7957b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        static void m7958c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: androidx.core.view.n0$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        static int m7959a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        static boolean m7960b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        static boolean m7961c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        static boolean m7962d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        static void m7963e(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i11);
        }

        /* renamed from: f */
        static void m7964f(View view, int i11) {
            view.setAccessibilityLiveRegion(i11);
        }

        /* renamed from: g */
        static void m7965g(AccessibilityEvent accessibilityEvent, int i11) {
            accessibilityEvent.setContentChangeTypes(i11);
        }
    }

    /* renamed from: androidx.core.view.n0$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        static WindowInsets m7966a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        static WindowInsets m7967b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        static void m7968c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: androidx.core.view.n0$m */
    /* loaded from: classes.dex */
    public static class m {

        /* renamed from: androidx.core.view.n0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C1580n1 f6516a = null;

            /* renamed from: b */
            final /* synthetic */ View f6517b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC1551g0 f6518c;

            a(View view, InterfaceC1551g0 interfaceC1551g0) {
                this.f6517b = view;
                this.f6518c = interfaceC1551g0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1580n1 m8048z = C1580n1.m8048z(windowInsets, view);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    m.m7969a(windowInsets, this.f6517b);
                    if (m8048z.equals(this.f6516a)) {
                        return this.f6518c.mo4846c(view, m8048z).m8071x();
                    }
                }
                this.f6516a = m8048z;
                C1580n1 mo4846c = this.f6518c.mo4846c(view, m8048z);
                if (i11 >= 30) {
                    return mo4846c.m8071x();
                }
                AbstractC1579n0.m7910x0(view);
                return mo4846c.m8071x();
            }
        }

        /* renamed from: a */
        static void m7969a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC19201c.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C1580n1 m7970b(View view, C1580n1 c1580n1, Rect rect) {
            WindowInsets m8071x = c1580n1.m8071x();
            if (m8071x != null) {
                return C1580n1.m8048z(view.computeSystemWindowInsets(m8071x, rect), view);
            }
            rect.setEmpty();
            return c1580n1;
        }

        /* renamed from: c */
        static boolean m7971c(View view, float f11, float f12, boolean z11) {
            return view.dispatchNestedFling(f11, f12, z11);
        }

        /* renamed from: d */
        static boolean m7972d(View view, float f11, float f12) {
            return view.dispatchNestedPreFling(f11, f12);
        }

        /* renamed from: e */
        static boolean m7973e(View view, int i11, int i12, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i11, i12, iArr, iArr2);
        }

        /* renamed from: f */
        static boolean m7974f(View view, int i11, int i12, int i13, int i14, int[] iArr) {
            return view.dispatchNestedScroll(i11, i12, i13, i14, iArr);
        }

        /* renamed from: g */
        static ColorStateList m7975g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        static PorterDuff.Mode m7976h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        static float m7977i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C1580n1 m7978j(View view) {
            return C1580n1.a.m8072a(view);
        }

        /* renamed from: k */
        static String m7979k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        static float m7980l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        static float m7981m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        static boolean m7982n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        static boolean m7983o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        static boolean m7984p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        static void m7985q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        static void m7986r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        static void m7987s(View view, float f11) {
            view.setElevation(f11);
        }

        /* renamed from: t */
        static void m7988t(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        /* renamed from: u */
        static void m7989u(View view, InterfaceC1551g0 interfaceC1551g0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC19201c.tag_on_apply_window_listener, interfaceC1551g0);
            }
            if (interfaceC1551g0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC19201c.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC1551g0));
            }
        }

        /* renamed from: v */
        static void m7990v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        static void m7991w(View view, float f11) {
            view.setTranslationZ(f11);
        }

        /* renamed from: x */
        static void m7992x(View view, float f11) {
            view.setZ(f11);
        }

        /* renamed from: y */
        static boolean m7993y(View view, int i11) {
            return view.startNestedScroll(i11);
        }

        /* renamed from: z */
        static void m7994z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n0$n */
    /* loaded from: classes.dex */
    public static class n {
        /* renamed from: a */
        public static C1580n1 m7995a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1580n1 m8047y = C1580n1.m8047y(rootWindowInsets);
            m8047y.m8069v(m8047y);
            m8047y.m8052d(view.getRootView());
            return m8047y;
        }

        /* renamed from: b */
        static int m7996b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        static void m7997c(View view, int i11) {
            view.setScrollIndicators(i11);
        }

        /* renamed from: d */
        static void m7998d(View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$o */
    /* loaded from: classes2.dex */
    public static class o {
        /* renamed from: a */
        static void m7999a(View view) {
            view.cancelDragAndDrop();
        }

        /* renamed from: b */
        static void m8000b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        /* renamed from: c */
        static void m8001c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        /* renamed from: d */
        static void m8002d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        /* renamed from: e */
        static boolean m8003e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i11) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i11);
        }

        /* renamed from: f */
        static void m8004f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$p */
    /* loaded from: classes.dex */
    public static class p {
        /* renamed from: a */
        static void m8005a(View view, Collection<View> collection, int i11) {
            view.addKeyboardNavigationClusters(collection, i11);
        }

        /* renamed from: b */
        static int m8006b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        static int m8007c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        static boolean m8008d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        static boolean m8009e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        static boolean m8010f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        static boolean m8011g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        static View m8012h(View view, View view2, int i11) {
            return view.keyboardNavigationClusterSearch(view2, i11);
        }

        /* renamed from: i */
        static boolean m8013i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        static void m8014j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        static void m8015k(View view, boolean z11) {
            view.setFocusedByDefault(z11);
        }

        /* renamed from: l */
        static void m8016l(View view, int i11) {
            view.setImportantForAutofill(i11);
        }

        /* renamed from: m */
        static void m8017m(View view, boolean z11) {
            view.setKeyboardNavigationCluster(z11);
        }

        /* renamed from: n */
        static void m8018n(View view, int i11) {
            view.setNextClusterForwardId(i11);
        }

        /* renamed from: o */
        static void m8019o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: androidx.core.view.n0$q */
    /* loaded from: classes2.dex */
    public static class q {
        /* renamed from: a */
        static void m8020a(View view, v vVar) {
            C30245g c30245g = (C30245g) view.getTag(AbstractC19201c.tag_unhandled_key_listeners);
            if (c30245g == null) {
                c30245g = new C30245g();
                view.setTag(AbstractC19201c.tag_unhandled_key_listeners, c30245g);
            }
            Objects.requireNonNull(vVar);
            View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC1583o0 = new View.OnUnhandledKeyEventListener(vVar) { // from class: androidx.core.view.o0
                public /* synthetic */ ViewOnUnhandledKeyEventListenerC1583o0(AbstractC1579n0.v vVar2) {
                }

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            c30245g.put(vVar2, viewOnUnhandledKeyEventListenerC1583o0);
            view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC1583o0);
        }

        /* renamed from: b */
        static CharSequence m8021b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        static boolean m8022c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        static boolean m8023d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        static void m8024e(View view, v vVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C30245g c30245g = (C30245g) view.getTag(AbstractC19201c.tag_unhandled_key_listeners);
            if (c30245g != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c30245g.get(vVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        /* renamed from: f */
        static <T> T m8025f(View view, int i11) {
            return (T) view.requireViewById(i11);
        }

        /* renamed from: g */
        static void m8026g(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        /* renamed from: h */
        static void m8027h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        static void m8028i(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    /* renamed from: androidx.core.view.n0$r */
    /* loaded from: classes.dex */
    public static class r {
        /* renamed from: a */
        static View.AccessibilityDelegate m8029a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        static List<Rect> m8030b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        static void m8031c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }

        /* renamed from: d */
        static void m8032d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: androidx.core.view.n0$s */
    /* loaded from: classes2.dex */
    public static class s {
        /* renamed from: a */
        static CharSequence m8033a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static C1593q2 m8034b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return C1593q2.m8143d(windowInsetsController);
            }
            return null;
        }

        /* renamed from: c */
        static void m8035c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.n0$t */
    /* loaded from: classes2.dex */
    public static final class t {
        /* renamed from: a */
        public static String[] m8036a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C1538d m8037b(View view, C1538d c1538d) {
            ContentInfo m7742k = c1538d.m7742k();
            ContentInfo performReceiveContent = view.performReceiveContent(m7742k);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == m7742k) {
                return c1538d;
            }
            return C1538d.m7735l(performReceiveContent);
        }

        /* renamed from: c */
        public static void m8038c(View view, String[] strArr, InterfaceC1555h0 interfaceC1555h0) {
            if (interfaceC1555h0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new u(interfaceC1555h0));
            }
        }
    }

    /* renamed from: androidx.core.view.n0$u */
    /* loaded from: classes2.dex */
    public static final class u implements OnReceiveContentListener {

        /* renamed from: a */
        private final InterfaceC1555h0 f6519a;

        u(InterfaceC1555h0 interfaceC1555h0) {
            this.f6519a = interfaceC1555h0;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1538d m7735l = C1538d.m7735l(contentInfo);
            C1538d mo7772a = this.f6519a.mo7772a(view, m7735l);
            if (mo7772a == null) {
                return null;
            }
            if (mo7772a == m7735l) {
                return contentInfo;
            }
            return mo7772a.m7742k();
        }
    }

    /* renamed from: androidx.core.view.n0$v */
    /* loaded from: classes2.dex */
    public interface v {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.n0$w */
    /* loaded from: classes2.dex */
    public static class w {

        /* renamed from: d */
        private static final ArrayList f6520d = new ArrayList();

        /* renamed from: a */
        private WeakHashMap f6521a = null;

        /* renamed from: b */
        private SparseArray f6522b = null;

        /* renamed from: c */
        private WeakReference f6523c = null;

        w() {
        }

        /* renamed from: a */
        static w m8039a(View view) {
            w wVar = (w) view.getTag(AbstractC19201c.tag_unhandled_key_event_manager);
            if (wVar == null) {
                w wVar2 = new w();
                view.setTag(AbstractC19201c.tag_unhandled_key_event_manager, wVar2);
                return wVar2;
            }
            return wVar;
        }

        /* renamed from: c */
        private View m8040c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f6521a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m8040c = m8040c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m8040c != null) {
                            return m8040c;
                        }
                    }
                }
                if (m8042e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray m8041d() {
            if (this.f6522b == null) {
                this.f6522b = new SparseArray();
            }
            return this.f6522b;
        }

        /* renamed from: e */
        private boolean m8042e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC19201c.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                AbstractC30228a.m149044a(arrayList.get(size));
                throw null;
            }
            return false;
        }

        /* renamed from: g */
        private void m8043g() {
            WeakHashMap weakHashMap = this.f6521a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f6520d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f6521a == null) {
                        this.f6521a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f6520d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f6521a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f6521a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        boolean m8044b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m8043g();
            }
            View m8040c = m8040c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m8040c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m8041d().put(keyCode, new WeakReference(m8040c));
                }
            }
            if (m8040c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        boolean m8045f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int indexOfKey;
            WeakReference weakReference2 = this.f6523c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f6523c = new WeakReference(keyEvent);
            SparseArray m8041d = m8041d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m8041d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference) m8041d.valueAt(indexOfKey);
                m8041d.removeAt(indexOfKey);
            } else {
                weakReference = null;
            }
            if (weakReference == null) {
                weakReference = (WeakReference) m8041d.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && AbstractC1579n0.m7862d0(view)) {
                m8042e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static float m7800A(View view) {
        return m.m7977i(view);
    }

    /* renamed from: A0 */
    public static void m7801A0(View view, C1490a c1490a) {
        View.AccessibilityDelegate m7508d;
        if (c1490a == null && (m7893p(view) instanceof C1490a.a)) {
            c1490a = new C1490a();
        }
        if (c1490a == null) {
            m7508d = null;
        } else {
            m7508d = c1490a.m7508d();
        }
        view.setAccessibilityDelegate(m7508d);
    }

    /* renamed from: B */
    private static Rect m7802B() {
        if (f6507f == null) {
            f6507f = new ThreadLocal();
        }
        Rect rect = (Rect) f6507f.get();
        if (rect == null) {
            rect = new Rect();
            f6507f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: B0 */
    public static void m7803B0(View view, int i11) {
        k.m7964f(view, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    private static InterfaceC1559i0 m7804C(View view) {
        if (view instanceof InterfaceC1559i0) {
            return (InterfaceC1559i0) view;
        }
        return f6509h;
    }

    /* renamed from: C0 */
    public static void m7805C0(View view, float f11) {
        view.setAlpha(f11);
    }

    /* renamed from: D */
    public static boolean m7806D(View view) {
        return h.m7927b(view);
    }

    /* renamed from: D0 */
    public static void m7807D0(View view, Drawable drawable) {
        h.m7942q(view, drawable);
    }

    /* renamed from: E */
    public static int m7808E(View view) {
        return h.m7928c(view);
    }

    /* renamed from: E0 */
    public static void m7809E0(View view, ColorStateList colorStateList) {
        boolean z11;
        int i11 = Build.VERSION.SDK_INT;
        m.m7985q(view, colorStateList);
        if (i11 == 21) {
            Drawable background = view.getBackground();
            if (m.m7975g(view) == null && m.m7976h(view) == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (background != null && z11) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.m7942q(view, background);
            }
        }
    }

    /* renamed from: F */
    public static int m7810F(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return p.m8006b(view);
        }
        return 0;
    }

    /* renamed from: F0 */
    public static void m7811F0(View view, PorterDuff.Mode mode) {
        boolean z11;
        int i11 = Build.VERSION.SDK_INT;
        m.m7986r(view, mode);
        if (i11 == 21) {
            Drawable background = view.getBackground();
            if (m.m7975g(view) == null && m.m7976h(view) == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (background != null && z11) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.m7942q(view, background);
            }
        }
    }

    /* renamed from: G */
    public static int m7812G(View view) {
        return i.m7948d(view);
    }

    /* renamed from: G0 */
    public static void m7813G0(ViewGroup viewGroup, boolean z11) {
        if (f6504c == null) {
            try {
                f6504c = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f6504c.setAccessible(true);
        }
        try {
            f6504c.invoke(viewGroup, Boolean.valueOf(z11));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    /* renamed from: H */
    public static int m7814H(View view) {
        return h.m7929d(view);
    }

    /* renamed from: H0 */
    public static void m7815H0(View view, Rect rect) {
        j.m7958c(view, rect);
    }

    /* renamed from: I */
    public static int m7816I(View view) {
        return h.m7930e(view);
    }

    /* renamed from: I0 */
    public static void m7817I0(View view, float f11) {
        m.m7987s(view, f11);
    }

    /* renamed from: J */
    public static int m7818J(View view) {
        return i.m7949e(view);
    }

    /* renamed from: J0 */
    public static void m7819J0(View view, boolean z11) {
        view.setFitsSystemWindows(z11);
    }

    /* renamed from: K */
    public static int m7820K(View view) {
        return i.m7950f(view);
    }

    /* renamed from: K0 */
    public static void m7821K0(View view, boolean z11) {
        h.m7943r(view, z11);
    }

    /* renamed from: L */
    public static ViewParent m7822L(View view) {
        return h.m7931f(view);
    }

    /* renamed from: L0 */
    public static void m7823L0(View view, int i11) {
        h.m7944s(view, i11);
    }

    /* renamed from: M */
    public static C1580n1 m7824M(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return n.m7995a(view);
        }
        return m.m7978j(view);
    }

    /* renamed from: M0 */
    public static void m7825M0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            p.m8016l(view, i11);
        }
    }

    /* renamed from: N */
    public static float m7826N(View view) {
        return view.getScaleX();
    }

    /* renamed from: N0 */
    public static void m7827N0(View view, Paint paint) {
        i.m7953i(view, paint);
    }

    /* renamed from: O */
    public static float m7828O(View view) {
        return view.getScaleY();
    }

    /* renamed from: O0 */
    public static void m7829O0(View view, int i11, Paint paint) {
        view.setLayerType(i11, paint);
    }

    /* renamed from: P */
    public static CharSequence m7830P(View view) {
        return (CharSequence) m7878i1().m7924d(view);
    }

    /* renamed from: P0 */
    public static void m7831P0(View view, boolean z11) {
        m.m7988t(view, z11);
    }

    /* renamed from: Q */
    public static String m7832Q(View view) {
        return m.m7979k(view);
    }

    /* renamed from: Q0 */
    public static void m7833Q0(View view, InterfaceC1551g0 interfaceC1551g0) {
        m.m7989u(view, interfaceC1551g0);
    }

    /* renamed from: R */
    public static float m7834R(View view) {
        return view.getTranslationX();
    }

    /* renamed from: R0 */
    public static void m7835R0(View view, String[] strArr, InterfaceC1555h0 interfaceC1555h0) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 31) {
            t.m8038c(view, strArr, interfaceC1555h0);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z12 = false;
        if (interfaceC1555h0 != null) {
            if (strArr != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC1487i.m7487b(z11, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (strArr[i11].startsWith("*")) {
                    z12 = true;
                    break;
                }
                i11++;
            }
            AbstractC1487i.m7487b(!z12, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(AbstractC19201c.tag_on_receive_content_mime_types, strArr);
        view.setTag(AbstractC19201c.tag_on_receive_content_listener, interfaceC1555h0);
    }

    /* renamed from: S */
    public static float m7836S(View view) {
        return view.getTranslationY();
    }

    /* renamed from: S0 */
    public static void m7837S0(View view, int i11, int i12, int i13, int i14) {
        i.m7955k(view, i11, i12, i13, i14);
    }

    /* renamed from: T */
    public static float m7838T(View view) {
        return m.m7980l(view);
    }

    /* renamed from: T0 */
    public static void m7839T0(View view, float f11) {
        view.setPivotX(f11);
    }

    /* renamed from: U */
    public static C1593q2 m7840U(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return s.m8034b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return AbstractC1623z0.m8280a(window, view);
            }
        }
        return null;
    }

    /* renamed from: U0 */
    public static void m7841U0(View view, float f11) {
        view.setPivotY(f11);
    }

    /* renamed from: V */
    public static int m7842V(View view) {
        return h.m7932g(view);
    }

    /* renamed from: V0 */
    public static void m7843V0(View view, C1567k0 c1567k0) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (c1567k0 != null) {
                obj = c1567k0.m7786a();
            } else {
                obj = null;
            }
            o.m8002d(view, AbstractC1571l0.m7793a(obj));
        }
    }

    /* renamed from: W */
    public static float m7844W(View view) {
        return view.getX();
    }

    /* renamed from: W0 */
    public static void m7845W0(View view, float f11) {
        view.setScaleX(f11);
    }

    /* renamed from: X */
    public static float m7846X(View view) {
        return view.getY();
    }

    /* renamed from: X0 */
    public static void m7847X0(View view, float f11) {
        view.setScaleY(f11);
    }

    /* renamed from: Y */
    public static float m7848Y(View view) {
        return m.m7981m(view);
    }

    /* renamed from: Y0 */
    public static void m7849Y0(View view, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.m7998d(view, i11, i12);
        }
    }

    /* renamed from: Z */
    public static boolean m7850Z(View view) {
        return g.m7925a(view);
    }

    /* renamed from: Z0 */
    public static void m7851Z0(View view, String str) {
        m.m7990v(view, str);
    }

    /* renamed from: a0 */
    public static boolean m7853a0(View view) {
        return h.m7933h(view);
    }

    /* renamed from: a1 */
    public static void m7854a1(View view, float f11) {
        view.setTranslationX(f11);
    }

    /* renamed from: b */
    private static f m7855b() {
        return new d(AbstractC19201c.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static boolean m7856b0(View view) {
        return h.m7934i(view);
    }

    /* renamed from: b1 */
    public static void m7857b1(View view, float f11) {
        view.setTranslationY(f11);
    }

    /* renamed from: c */
    public static int m7858c(View view, CharSequence charSequence, InterfaceC1513j0 interfaceC1513j0) {
        int m7905v = m7905v(view, charSequence);
        if (m7905v != -1) {
            m7861d(view, new C1507g0.a(m7905v, charSequence, interfaceC1513j0));
        }
        return m7905v;
    }

    /* renamed from: c0 */
    public static boolean m7859c0(View view) {
        Boolean bool = (Boolean) m7855b().m7924d(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    public static void m7860c1(View view, float f11) {
        m.m7991w(view, f11);
    }

    /* renamed from: d */
    private static void m7861d(View view, C1507g0.a aVar) {
        m7887m(view);
        m7906v0(aVar.m7657b(), view);
        m7901t(view).add(aVar);
        m7880j0(view, 0);
    }

    /* renamed from: d0 */
    public static boolean m7862d0(View view) {
        return k.m7960b(view);
    }

    /* renamed from: d1 */
    private static void m7863d1(View view) {
        if (m7808E(view) == 0) {
            m7823L0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m7808E((View) parent) == 4) {
                m7823L0(view, 2);
                return;
            }
        }
    }

    /* renamed from: e */
    public static C1611v0 m7864e(View view) {
        if (f6503b == null) {
            f6503b = new WeakHashMap();
        }
        C1611v0 c1611v0 = (C1611v0) f6503b.get(view);
        if (c1611v0 == null) {
            C1611v0 c1611v02 = new C1611v0(view);
            f6503b.put(view, c1611v02);
            return c1611v02;
        }
        return c1611v0;
    }

    /* renamed from: e0 */
    public static boolean m7865e0(View view) {
        return k.m7961c(view);
    }

    /* renamed from: e1 */
    public static void m7866e1(View view, C1492a1.b bVar) {
        C1492a1.m7518d(view, bVar);
    }

    /* renamed from: f */
    public static boolean m7867f(View view, int i11) {
        return view.canScrollVertically(i11);
    }

    /* renamed from: f0 */
    public static boolean m7868f0(View view) {
        return m.m7984p(view);
    }

    /* renamed from: f1 */
    public static void m7869f1(View view, float f11) {
        view.setX(f11);
    }

    /* renamed from: g */
    private static void m7870g(View view, int i11) {
        view.offsetLeftAndRight(i11);
        if (view.getVisibility() == 0) {
            m7884k1(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m7884k1((View) parent);
            }
        }
    }

    /* renamed from: g0 */
    public static boolean m7871g0(View view) {
        return i.m7951g(view);
    }

    /* renamed from: g1 */
    public static void m7872g1(View view, float f11) {
        view.setY(f11);
    }

    /* renamed from: h */
    private static void m7873h(View view, int i11) {
        view.offsetTopAndBottom(i11);
        if (view.getVisibility() == 0) {
            m7884k1(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m7884k1((View) parent);
            }
        }
    }

    /* renamed from: h0 */
    public static boolean m7874h0(View view) {
        Boolean bool = (Boolean) m7914z0().m7924d(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: h1 */
    public static void m7875h1(View view, float f11) {
        m.m7992x(view, f11);
    }

    /* renamed from: i */
    public static C1580n1 m7876i(View view, C1580n1 c1580n1, Rect rect) {
        return m.m7970b(view, c1580n1, rect);
    }

    /* renamed from: i0 */
    public static /* synthetic */ C1538d m7877i0(C1538d c1538d) {
        return c1538d;
    }

    /* renamed from: i1 */
    private static f m7878i1() {
        return new c(AbstractC19201c.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: j */
    public static C1580n1 m7879j(View view, C1580n1 c1580n1) {
        WindowInsets m8071x = c1580n1.m8071x();
        if (m8071x != null) {
            WindowInsets m7966a = l.m7966a(view, m8071x);
            if (!m7966a.equals(m8071x)) {
                return C1580n1.m8048z(m7966a, view);
            }
        }
        return c1580n1;
    }

    /* renamed from: j0 */
    static void m7880j0(View view, int i11) {
        boolean z11;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m7899s(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = 32;
        if (m7897r(view) == 0 && !z11) {
            if (i11 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                k.m7965g(obtain, i11);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m7899s(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m7963e(view.getParent(), view, view, i11);
                    return;
                } catch (AbstractMethodError unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(view.getParent().getClass().getSimpleName());
                    sb2.append(" does not fully implement ViewParent");
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z11) {
            i12 = ZVideoUtilMetadata.FF_PROFILE_H264_INTRA;
        }
        obtain2.setEventType(i12);
        k.m7965g(obtain2, i11);
        if (z11) {
            obtain2.getText().add(m7899s(view));
            m7863d1(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    /* renamed from: j1 */
    public static void m7881j1(View view) {
        m.m7994z(view);
    }

    /* renamed from: k */
    public static boolean m7882k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m8039a(view).m8044b(view, keyEvent);
    }

    /* renamed from: k0 */
    public static void m7883k0(View view, int i11) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i11);
            return;
        }
        Rect m7802B = m7802B();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m7802B.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z11 = !m7802B.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z11 = false;
        }
        m7870g(view, i11);
        if (z11 && m7802B.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m7802B);
        }
    }

    /* renamed from: k1 */
    private static void m7884k1(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: l */
    public static boolean m7885l(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return w.m8039a(view).m8045f(keyEvent);
    }

    /* renamed from: l0 */
    public static void m7886l0(View view, int i11) {
        boolean z11;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i11);
            return;
        }
        Rect m7802B = m7802B();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m7802B.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z11 = !m7802B.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z11 = false;
        }
        m7873h(view, i11);
        if (z11 && m7802B.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m7802B);
        }
    }

    /* renamed from: m */
    static void m7887m(View view) {
        C1490a m7891o = m7891o(view);
        if (m7891o == null) {
            m7891o = new C1490a();
        }
        m7801A0(view, m7891o);
    }

    /* renamed from: m0 */
    public static C1580n1 m7888m0(View view, C1580n1 c1580n1) {
        WindowInsets m8071x = c1580n1.m8071x();
        if (m8071x != null) {
            WindowInsets m7967b = l.m7967b(view, m8071x);
            if (!m7967b.equals(m8071x)) {
                return C1580n1.m8048z(m7967b, view);
            }
        }
        return c1580n1;
    }

    /* renamed from: n */
    public static int m7889n() {
        return i.m7945a();
    }

    /* renamed from: n0 */
    public static void m7890n0(View view, C1507g0 c1507g0) {
        view.onInitializeAccessibilityNodeInfo(c1507g0.m7598H0());
    }

    /* renamed from: o */
    public static C1490a m7891o(View view) {
        View.AccessibilityDelegate m7893p = m7893p(view);
        if (m7893p == null) {
            return null;
        }
        if (m7893p instanceof C1490a.a) {
            return ((C1490a.a) m7893p).f6384a;
        }
        return new C1490a(m7893p);
    }

    /* renamed from: o0 */
    private static f m7892o0() {
        return new b(AbstractC19201c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: p */
    private static View.AccessibilityDelegate m7893p(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return r.m8029a(view);
        }
        return m7895q(view);
    }

    /* renamed from: p0 */
    public static boolean m7894p0(View view, int i11, Bundle bundle) {
        return h.m7935j(view, i11, bundle);
    }

    /* renamed from: q */
    private static View.AccessibilityDelegate m7895q(View view) {
        if (f6506e) {
            return null;
        }
        if (f6505d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6505d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6506e = true;
                return null;
            }
        }
        try {
            Object obj = f6505d.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f6506e = true;
            return null;
        }
    }

    /* renamed from: q0 */
    public static C1538d m7896q0(View view, C1538d c1538d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("performReceiveContent: ");
            sb2.append(c1538d);
            sb2.append(", view=");
            sb2.append(view.getClass().getSimpleName());
            sb2.append("[");
            sb2.append(view.getId());
            sb2.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return t.m8037b(view, c1538d);
        }
        InterfaceC1555h0 interfaceC1555h0 = (InterfaceC1555h0) view.getTag(AbstractC19201c.tag_on_receive_content_listener);
        if (interfaceC1555h0 != null) {
            C1538d mo7772a = interfaceC1555h0.mo7772a(view, c1538d);
            if (mo7772a == null) {
                return null;
            }
            return m7804C(view).mo7776a(mo7772a);
        }
        return m7804C(view).mo7776a(c1538d);
    }

    /* renamed from: r */
    public static int m7897r(View view) {
        return k.m7959a(view);
    }

    /* renamed from: r0 */
    public static void m7898r0(View view) {
        h.m7936k(view);
    }

    /* renamed from: s */
    public static CharSequence m7899s(View view) {
        return (CharSequence) m7892o0().m7924d(view);
    }

    /* renamed from: s0 */
    public static void m7900s0(View view, Runnable runnable) {
        h.m7938m(view, runnable);
    }

    /* renamed from: t */
    private static List m7901t(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC19201c.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(AbstractC19201c.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: t0 */
    public static void m7902t0(View view, Runnable runnable, long j11) {
        h.m7939n(view, runnable, j11);
    }

    /* renamed from: u */
    public static float m7903u(View view) {
        return view.getAlpha();
    }

    /* renamed from: u0 */
    public static void m7904u0(View view, int i11) {
        m7906v0(i11, view);
        m7880j0(view, 0);
    }

    /* renamed from: v */
    private static int m7905v(View view, CharSequence charSequence) {
        boolean z11;
        List m7901t = m7901t(view);
        for (int i11 = 0; i11 < m7901t.size(); i11++) {
            if (TextUtils.equals(charSequence, ((C1507g0.a) m7901t.get(i11)).m7658c())) {
                return ((C1507g0.a) m7901t.get(i11)).m7657b();
            }
        }
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int[] iArr = f6508g;
            if (i12 >= iArr.length || i13 != -1) {
                break;
            }
            int i14 = iArr[i12];
            boolean z12 = true;
            for (int i15 = 0; i15 < m7901t.size(); i15++) {
                if (((C1507g0.a) m7901t.get(i15)).m7657b() != i14) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 &= z11;
            }
            if (z12) {
                i13 = i14;
            }
            i12++;
        }
        return i13;
    }

    /* renamed from: v0 */
    private static void m7906v0(int i11, View view) {
        List m7901t = m7901t(view);
        for (int i12 = 0; i12 < m7901t.size(); i12++) {
            if (((C1507g0.a) m7901t.get(i12)).m7657b() == i11) {
                m7901t.remove(i12);
                return;
            }
        }
    }

    /* renamed from: w */
    public static ColorStateList m7907w(View view) {
        return m.m7975g(view);
    }

    /* renamed from: w0 */
    public static void m7908w0(View view, C1507g0.a aVar, CharSequence charSequence, InterfaceC1513j0 interfaceC1513j0) {
        if (interfaceC1513j0 == null && charSequence == null) {
            m7904u0(view, aVar.m7657b());
        } else {
            m7861d(view, aVar.m7656a(charSequence, interfaceC1513j0));
        }
    }

    /* renamed from: x */
    public static PorterDuff.Mode m7909x(View view) {
        return m.m7976h(view);
    }

    /* renamed from: x0 */
    public static void m7910x0(View view) {
        l.m7968c(view);
    }

    /* renamed from: y */
    public static Rect m7911y(View view) {
        return j.m7956a(view);
    }

    /* renamed from: y0 */
    public static void m7912y0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            r.m8031c(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    /* renamed from: z */
    public static Display m7913z(View view) {
        return i.m7946b(view);
    }

    /* renamed from: z0 */
    private static f m7914z0() {
        return new a(AbstractC19201c.tag_screen_reader_focusable, Boolean.class, 28);
    }
}

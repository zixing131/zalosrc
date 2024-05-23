package ui0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import fn0.AbstractC19074t;

/* renamed from: ui0.f */
/* loaded from: classes7.dex */
public final class C27279f {

    /* renamed from: a */
    public static final C27279f f128337a = new C27279f();

    /* renamed from: ui0.f$a */
    /* loaded from: classes7.dex */
    public enum a {
        NAVIGATION_BAR_HEIGHT("navigation_bar_height"),
        STATUS_BAR_HEIGHT("status_bar_height");


        /* renamed from: p */
        private final String f128341p;

        a(String str) {
            this.f128341p = str;
        }

        /* renamed from: c */
        public final String m139656c() {
            return this.f128341p;
        }
    }

    /* renamed from: ui0.f$b */
    /* loaded from: classes7.dex */
    public enum b {
        LEFT(0),
        TOP(1),
        RIGHT(2),
        BOTTOM(3);


        /* renamed from: p */
        private final int f128347p;

        b(int i11) {
            this.f128347p = i11;
        }
    }

    /* renamed from: ui0.f$c */
    /* loaded from: classes7.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f128348a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f128348a = iArr;
        }
    }

    private C27279f() {
    }

    /* renamed from: a */
    public final void m139651a(View view, int i11, b bVar) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(bVar, "direction");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            int i12 = c.f128348a[bVar.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 == 4) {
                            Context context = view.getContext();
                            AbstractC19074t.m100207e(context, "view.context");
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C27276c.m139649b(context, i11);
                        }
                    } else {
                        Context context2 = view.getContext();
                        AbstractC19074t.m100207e(context2, "view.context");
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = C27276c.m139649b(context2, i11);
                    }
                } else {
                    Context context3 = view.getContext();
                    AbstractC19074t.m100207e(context3, "view.context");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C27276c.m139649b(context3, i11);
                }
            } else {
                Context context4 = view.getContext();
                AbstractC19074t.m100207e(context4, "view.context");
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = C27276c.m139649b(context4, i11);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final int m139652b(Context context, a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "resource");
        Resources resources = context.getResources();
        int identifier = context.getResources().getIdentifier(aVar.m139656c(), "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean m139653c(View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (view == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        if (motionEvent.getRawX() <= i11 || motionEvent.getRawX() >= i11 + view.getWidth() || motionEvent.getRawY() <= i12 || motionEvent.getRawY() >= i12 + view.getHeight()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m139654d(View view, MotionEvent motionEvent, Rect rect, boolean z11) {
        int i11;
        int width;
        int height;
        int i12;
        int i13;
        int width2;
        int height2;
        int i14;
        AbstractC19074t.m100208f(motionEvent, "event");
        if (view == null) {
            return false;
        }
        Rect rect2 = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            view.getGlobalVisibleRect(rect2);
            if (rect != null && z11) {
                i14 = rect2.left + rect.left;
                i13 = rect2.top + rect.top;
                width2 = rect.width() + i14;
                height2 = rect.height() + i13;
            } else {
                int i15 = rect2.left;
                i13 = rect2.top;
                width2 = view.getWidth() + i15;
                height2 = view.getHeight() + i13;
                i14 = i15;
            }
            Rect rect3 = new Rect(i14, i13, width2, height2);
            if (motionEvent.getX() <= rect3.left || motionEvent.getX() >= rect3.right || motionEvent.getY() <= rect3.top || motionEvent.getY() >= rect3.bottom) {
                return false;
            }
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (rect != null && z11) {
            i12 = iArr[0] + rect.left;
            i11 = iArr[1] + rect.top;
            width = rect.width() + i12;
            height = rect.height() + i11;
        } else {
            int i16 = iArr[0];
            i11 = iArr[1];
            width = view.getWidth() + i16;
            height = view.getHeight() + i11;
            i12 = i16;
        }
        Rect rect4 = new Rect(i12, i11, width, height);
        if (motionEvent.getRawX() <= rect4.left || motionEvent.getRawX() >= rect4.right || motionEvent.getRawY() <= rect4.top || motionEvent.getRawY() >= rect4.bottom) {
            return false;
        }
        return true;
    }
}

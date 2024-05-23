package com.zing.p058v4.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.C1580n1;
import androidx.core.view.InterfaceC1551g0;
import androidx.core.view.accessibility.C1507g0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "ViewPager";
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private int mActivePointerId;
    AbstractC6881a mAdapter;
    private List<InterfaceC6874i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private boolean mDragInGutterEnabled;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private InterfaceC6875j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C6872g> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private C6878m mObserver;
    private int mOffscreenPageLimit;
    private InterfaceC6875j mOnPageChangeListener;
    private List<InterfaceC6875j> mOnPageChangeListeners;
    private InterfaceC6876k mOnPageSelectedDirectlyListener;
    private int mPageMargin;
    private InterfaceC6877l mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C6872g mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<C6872g> COMPARATOR = new C6866a();
    private static final Interpolator sInterpolator = new InterpolatorC6867b();
    private static final C6880o sPositionComparator = new C6880o();

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f37718a;

        /* renamed from: b */
        public int f37719b;

        /* renamed from: c */
        float f37720c;

        /* renamed from: d */
        boolean f37721d;

        /* renamed from: e */
        int f37722e;

        /* renamed from: f */
        int f37723f;

        public LayoutParams() {
            super(-1, -1);
            this.f37720c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f37720c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f37719b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6865a();

        /* renamed from: r */
        int f37724r;

        /* renamed from: s */
        Parcelable f37725s;

        /* renamed from: t */
        ClassLoader f37726t;

        /* renamed from: com.zing.v4.view.ViewPager$SavedState$a */
        /* loaded from: classes3.dex */
        class C6865a implements Parcelable.ClassLoaderCreator {
            C6865a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f37724r + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f37724r);
            parcel.writeParcelable(this.f37725s, i11);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f37724r = parcel.readInt();
            this.f37725s = parcel.readParcelable(classLoader);
            this.f37726t = classLoader;
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$a */
    /* loaded from: classes.dex */
    class C6866a implements Comparator {
        C6866a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C6872g c6872g, C6872g c6872g2) {
            return c6872g.f37733b - c6872g2.f37733b;
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$b */
    /* loaded from: classes.dex */
    class InterpolatorC6867b implements Interpolator {
        InterpolatorC6867b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.v4.view.ViewPager$c */
    /* loaded from: classes.dex */
    public class RunnableC6868c implements Runnable {
        RunnableC6868c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$d */
    /* loaded from: classes.dex */
    public class C6869d implements InterfaceC1551g0 {

        /* renamed from: a */
        private final Rect f37728a = new Rect();

        C6869d() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            C1580n1 m7888m0 = AbstractC1579n0.m7888m0(view, c1580n1);
            if (m7888m0.m8064q()) {
                return m7888m0;
            }
            Rect rect = this.f37728a;
            rect.left = m7888m0.m8059k();
            rect.top = m7888m0.m8061m();
            rect.right = m7888m0.m8060l();
            rect.bottom = m7888m0.m8058j();
            int childCount = ViewPager.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                C1580n1 m7879j = AbstractC1579n0.m7879j(ViewPager.this.getChildAt(i11), m7888m0);
                rect.left = Math.min(m7879j.m8059k(), rect.left);
                rect.top = Math.min(m7879j.m8061m(), rect.top);
                rect.right = Math.min(m7879j.m8060l(), rect.right);
                rect.bottom = Math.min(m7879j.m8058j(), rect.bottom);
            }
            return m7888m0.m8066s(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$e */
    /* loaded from: classes3.dex */
    public class RunnableC6870e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f37730p;

        RunnableC6870e(int i11) {
            this.f37730p = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.m35315n(this.f37730p);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.zing.v4.view.ViewPager$f */
    /* loaded from: classes3.dex */
    public @interface InterfaceC6871f {
    }

    /* renamed from: com.zing.v4.view.ViewPager$g */
    /* loaded from: classes.dex */
    public static class C6872g {

        /* renamed from: a */
        Object f37732a;

        /* renamed from: b */
        int f37733b;

        /* renamed from: c */
        boolean f37734c;

        /* renamed from: d */
        float f37735d;

        /* renamed from: e */
        float f37736e;

        C6872g() {
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$h */
    /* loaded from: classes.dex */
    public class C6873h extends C1490a {
        C6873h() {
        }

        /* renamed from: n */
        private boolean m35327n() {
            AbstractC6881a abstractC6881a = ViewPager.this.mAdapter;
            if (abstractC6881a != null && abstractC6881a.mo35335g() > 1) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: f */
        public void mo7509f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC6881a abstractC6881a;
            super.mo7509f(view, accessibilityEvent);
            accessibilityEvent.setClassName("ViewPager");
            accessibilityEvent.setScrollable(m35327n());
            if (accessibilityEvent.getEventType() == 4096 && (abstractC6881a = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(abstractC6881a.mo35335g());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7619d0("ViewPager");
            c1507g0.m7653y0(m35327n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                c1507g0.m7612a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                c1507g0.m7612a(8192);
            }
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: j */
        public boolean mo7513j(View view, int i11, Bundle bundle) {
            if (super.mo7513j(view, i11, bundle)) {
                return true;
            }
            if (i11 != 4096) {
                if (i11 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            }
            if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
            return true;
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$i */
    /* loaded from: classes3.dex */
    public interface InterfaceC6874i {
        /* renamed from: a */
        void mo35301a(ViewPager viewPager, AbstractC6881a abstractC6881a, AbstractC6881a abstractC6881a2);
    }

    /* renamed from: com.zing.v4.view.ViewPager$j */
    /* loaded from: classes3.dex */
    public interface InterfaceC6875j {
        void onPageScrollStateChanged(int i11);

        void onPageScrolled(int i11, float f11, int i12);

        void onPageSelected(int i11);
    }

    /* renamed from: com.zing.v4.view.ViewPager$k */
    /* loaded from: classes3.dex */
    public interface InterfaceC6876k {
        /* renamed from: a */
        void mo35328a(int i11, int i12);

        /* renamed from: b */
        boolean mo35329b(int i11, View view, int i12, View view2, Runnable runnable);
    }

    /* renamed from: com.zing.v4.view.ViewPager$l */
    /* loaded from: classes3.dex */
    public interface InterfaceC6877l {
        /* renamed from: a */
        void mo35330a(View view, float f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.v4.view.ViewPager$m */
    /* loaded from: classes.dex */
    public class C6878m extends DataSetObserver {
        C6878m() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$n */
    /* loaded from: classes3.dex */
    public static class C6879n implements InterfaceC6875j {
        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageScrolled(int i11, float f11, int i12) {
        }

        @Override // com.zing.p058v4.view.ViewPager.InterfaceC6875j
        public void onPageSelected(int i11) {
        }
    }

    /* renamed from: com.zing.v4.view.ViewPager$o */
    /* loaded from: classes.dex */
    public static class C6880o implements Comparator {
        C6880o() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z11 = layoutParams.f37718a;
            if (z11 != layoutParams2.f37718a) {
                if (z11) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.f37722e - layoutParams2.f37722e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C6872g();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mDragInGutterEnabled = true;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mEndScrollRunnable = new RunnableC6868c();
        this.mScrollState = 0;
        initViewPager();
    }

    /* renamed from: a */
    private void m35302a(C6872g c6872g, int i11, C6872g c6872g2) {
        float f11;
        float f12;
        float f13;
        int i12;
        int i13;
        C6872g c6872g3;
        C6872g c6872g4;
        int mo35335g = this.mAdapter.mo35335g();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f11 = this.mPageMargin / clientWidth;
        } else {
            f11 = 0.0f;
        }
        if (c6872g2 != null) {
            int i14 = c6872g2.f37733b;
            int i15 = c6872g.f37733b;
            if (i14 < i15) {
                float f14 = c6872g2.f37736e + c6872g2.f37735d + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= c6872g.f37733b && i17 < this.mItems.size()) {
                    C6872g c6872g5 = this.mItems.get(i17);
                    while (true) {
                        c6872g4 = c6872g5;
                        if (i16 <= c6872g4.f37733b || i17 >= this.mItems.size() - 1) {
                            break;
                        }
                        i17++;
                        c6872g5 = this.mItems.get(i17);
                    }
                    while (i16 < c6872g4.f37733b) {
                        f14 += this.mAdapter.mo35338j(i16) + f11;
                        i16++;
                    }
                    c6872g4.f37736e = f14;
                    f14 += c6872g4.f37735d + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.mItems.size() - 1;
                float f15 = c6872g2.f37736e;
                while (true) {
                    i14--;
                    if (i14 < c6872g.f37733b || size < 0) {
                        break;
                    }
                    C6872g c6872g6 = this.mItems.get(size);
                    while (true) {
                        c6872g3 = c6872g6;
                        if (i14 >= c6872g3.f37733b || size <= 0) {
                            break;
                        }
                        size--;
                        c6872g6 = this.mItems.get(size);
                    }
                    while (i14 > c6872g3.f37733b) {
                        f15 -= this.mAdapter.mo35338j(i14) + f11;
                        i14--;
                    }
                    f15 -= c6872g3.f37735d + f11;
                    c6872g3.f37736e = f15;
                }
            }
        }
        int size2 = this.mItems.size();
        float f16 = c6872g.f37736e;
        int i18 = c6872g.f37733b;
        int i19 = i18 - 1;
        if (i18 == 0) {
            f12 = f16;
        } else {
            f12 = -3.4028235E38f;
        }
        this.mFirstOffset = f12;
        int i21 = mo35335g - 1;
        if (i18 == i21) {
            f13 = (c6872g.f37735d + f16) - 1.0f;
        } else {
            f13 = Float.MAX_VALUE;
        }
        this.mLastOffset = f13;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            C6872g c6872g7 = this.mItems.get(i22);
            while (true) {
                i13 = c6872g7.f37733b;
                if (i19 <= i13) {
                    break;
                }
                f16 -= this.mAdapter.mo35338j(i19) + f11;
                i19--;
            }
            f16 -= c6872g7.f37735d + f11;
            c6872g7.f37736e = f16;
            if (i13 == 0) {
                this.mFirstOffset = f16;
            }
            i22--;
            i19--;
        }
        float f17 = c6872g.f37736e + c6872g.f37735d + f11;
        int i23 = c6872g.f37733b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            C6872g c6872g8 = this.mItems.get(i24);
            while (true) {
                i12 = c6872g8.f37733b;
                if (i23 >= i12) {
                    break;
                }
                f17 += this.mAdapter.mo35338j(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.mLastOffset = (c6872g8.f37735d + f17) - 1.0f;
            }
            c6872g8.f37736e = f17;
            f17 += c6872g8.f37735d + f11;
            i24++;
            i23++;
        }
    }

    /* renamed from: b */
    private void m35303b(boolean z11) {
        boolean z12;
        if (this.mScrollState == 2) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m35315n(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            C6872g c6872g = this.mItems.get(i11);
            if (c6872g.f37734c) {
                c6872g.f37734c = false;
                z12 = true;
            }
        }
        if (z12) {
            if (z11) {
                AbstractC1579n0.m7900s0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    /* renamed from: c */
    private int m35304c(int i11, float f11, int i12, int i13) {
        float f12;
        if (Math.abs(i13) > this.mFlingDistance && Math.abs(i12) > this.mMinimumVelocity) {
            if (i12 <= 0) {
                i11++;
            }
        } else {
            if (i11 >= this.mCurItem) {
                f12 = 0.4f;
            } else {
                f12 = 0.6f;
            }
            i11 += (int) (f11 + f12);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).f37733b, Math.min(i11, this.mItems.get(r4.size() - 1).f37733b));
        }
        return i11;
    }

    /* renamed from: d */
    private void m35305d(int i11, float f11, int i12) {
        InterfaceC6875j interfaceC6875j = this.mOnPageChangeListener;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageScrolled(i11, f11, i12);
        }
        List<InterfaceC6875j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                InterfaceC6875j interfaceC6875j2 = this.mOnPageChangeListeners.get(i13);
                if (interfaceC6875j2 != null) {
                    interfaceC6875j2.onPageScrolled(i11, f11, i12);
                }
            }
        }
        InterfaceC6875j interfaceC6875j3 = this.mInternalPageChangeListener;
        if (interfaceC6875j3 != null) {
            interfaceC6875j3.onPageScrolled(i11, f11, i12);
        }
    }

    /* renamed from: e */
    private void m35306e(int i11) {
        InterfaceC6875j interfaceC6875j = this.mOnPageChangeListener;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageSelected(i11);
        }
        List<InterfaceC6875j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC6875j interfaceC6875j2 = this.mOnPageChangeListeners.get(i12);
                if (interfaceC6875j2 != null) {
                    interfaceC6875j2.onPageSelected(i11);
                }
            }
        }
        InterfaceC6875j interfaceC6875j3 = this.mInternalPageChangeListener;
        if (interfaceC6875j3 != null) {
            interfaceC6875j3.onPageSelected(i11);
        }
    }

    /* renamed from: f */
    private void m35307f(int i11) {
        InterfaceC6875j interfaceC6875j = this.mOnPageChangeListener;
        if (interfaceC6875j != null) {
            interfaceC6875j.onPageScrollStateChanged(i11);
        }
        List<InterfaceC6875j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                InterfaceC6875j interfaceC6875j2 = this.mOnPageChangeListeners.get(i12);
                if (interfaceC6875j2 != null) {
                    interfaceC6875j2.onPageScrollStateChanged(i11);
                }
            }
        }
        InterfaceC6875j interfaceC6875j3 = this.mInternalPageChangeListener;
        if (interfaceC6875j3 != null) {
            interfaceC6875j3.onPageScrollStateChanged(i11);
        }
    }

    /* renamed from: g */
    private void m35308g(boolean z11) {
        int i11;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (z11) {
                i11 = this.mPageTransformerLayerType;
            } else {
                i11 = 0;
            }
            getChildAt(i12).setLayerType(i11, null);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m35309h() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* renamed from: i */
    private Rect m35310i(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: j */
    private C6872g m35311j() {
        float f11;
        float f12;
        int i11;
        int clientWidth = getClientWidth();
        float f13 = 0.0f;
        if (clientWidth > 0) {
            f11 = getScrollX() / clientWidth;
        } else {
            f11 = 0.0f;
        }
        if (clientWidth > 0) {
            f12 = this.mPageMargin / clientWidth;
        } else {
            f12 = 0.0f;
        }
        C6872g c6872g = null;
        float f14 = 0.0f;
        int i12 = -1;
        int i13 = 0;
        boolean z11 = true;
        while (i13 < this.mItems.size()) {
            C6872g c6872g2 = this.mItems.get(i13);
            if (!z11 && c6872g2.f37733b != (i11 = i12 + 1)) {
                c6872g2 = this.mTempItem;
                c6872g2.f37736e = f13 + f14 + f12;
                c6872g2.f37733b = i11;
                c6872g2.f37735d = this.mAdapter.mo35338j(i11);
                i13--;
            }
            C6872g c6872g3 = c6872g2;
            f13 = c6872g3.f37736e;
            float f15 = c6872g3.f37735d + f13 + f12;
            if (!z11 && f11 < f13) {
                return c6872g;
            }
            if (f11 >= f15 && i13 != this.mItems.size() - 1) {
                int i14 = c6872g3.f37733b;
                float f16 = c6872g3.f37735d;
                i13++;
                z11 = false;
                i12 = i14;
                f14 = f16;
                c6872g = c6872g3;
            } else {
                return c6872g3;
            }
        }
        return c6872g;
    }

    /* renamed from: k */
    private static boolean m35312k(View view) {
        if (view.getClass().getAnnotation(InterfaceC6871f.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private boolean m35313l(float f11, float f12) {
        if (this.mDragInGutterEnabled) {
            return false;
        }
        if ((f11 >= this.mGutterSize || f12 <= 0.0f) && (f11 <= getWidth() - this.mGutterSize || f12 >= 0.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private void m35314m(MotionEvent motionEvent) {
        int i11;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i11);
            this.mActivePointerId = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: n */
    public boolean m35315n(int i11) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C6872g m35311j = m35311j();
        if (m35311j != null) {
            int clientWidth = getClientWidth();
            int i12 = this.mPageMargin;
            int i13 = clientWidth + i12;
            float f11 = clientWidth;
            int i14 = m35311j.f37733b;
            float f12 = ((i11 / f11) - m35311j.f37736e) / (m35311j.f37735d + (i12 / f11));
            this.mCalledSuper = false;
            onPageScrolled(i14, f12, (int) (i13 * f12));
        }
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: p */
    private boolean m35316p(float f11) {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.mItems.size() == 0) {
            return false;
        }
        float f12 = this.mLastMotionX - f11;
        this.mLastMotionX = f11;
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.mFirstOffset * clientWidth;
        float f14 = this.mLastOffset * clientWidth;
        C6872g c6872g = this.mItems.get(0);
        ArrayList<C6872g> arrayList = this.mItems;
        C6872g c6872g2 = arrayList.get(arrayList.size() - 1);
        if (c6872g.f37733b != 0) {
            f13 = c6872g.f37736e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (c6872g2.f37733b != this.mAdapter.mo35335g() - 1) {
            f14 = c6872g2.f37736e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.mLeftEdge.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.mRightEdge.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.mLastMotionX += scrollX - i11;
        scrollTo(i11, getScrollY());
        m35315n(i11);
        return z13;
    }

    /* renamed from: q */
    private void m35317q(int i11, int i12, int i13, int i14) {
        float f11;
        if (i12 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
            return;
        }
        C6872g infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f11 = Math.min(infoForPosition.f37736e, this.mLastOffset);
        } else {
            f11 = 0.0f;
        }
        int paddingLeft = (int) (f11 * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            m35303b(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    /* renamed from: r */
    private void m35318r() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i11).getLayoutParams()).f37718a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    /* renamed from: s */
    private void m35319s(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.mScrollingCacheEnabled != z11) {
            this.mScrollingCacheEnabled = z11;
        }
    }

    /* renamed from: u */
    private boolean m35320u() {
        this.mActivePointerId = -1;
        m35309h();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private void m35321v(int i11, int i12, boolean z11, int i13, boolean z12) {
        int i14;
        C6872g infoForPosition = infoForPosition(i11);
        if (infoForPosition != null) {
            i14 = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f37736e, this.mLastOffset)));
        } else {
            i14 = 0;
        }
        InterfaceC6876k interfaceC6876k = this.mOnPageSelectedDirectlyListener;
        if (interfaceC6876k != null) {
            interfaceC6876k.mo35328a(i11, i12);
        }
        if (z11) {
            smoothScrollTo(i14, 0, i13);
            if (z12) {
                m35306e(i11);
                return;
            }
            return;
        }
        if (this.mOnPageSelectedDirectlyListener != null) {
            if (z12) {
                m35306e(i11);
            }
            m35303b(false);
            scrollTo(i14, 0);
            if (i11 != i12) {
                infoForPosition(i12);
                if (!this.mOnPageSelectedDirectlyListener.mo35329b(i11, childForPosition(i11), i12, childForPosition(i12), new RunnableC6870e(i14))) {
                    m35315n(i14);
                    return;
                }
                return;
            }
            m35315n(i14);
            return;
        }
        if (z12) {
            m35306e(i11);
        }
        m35303b(false);
        scrollTo(i14, 0);
        m35315n(i14);
    }

    /* renamed from: w */
    private void m35322w() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.mDrawingOrderedChildren.add(getChildAt(i11));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        C6872g infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f37733b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    C6872g addNewItem(int i11, int i12) {
        C6872g c6872g = new C6872g();
        c6872g.f37733b = i11;
        c6872g.f37732a = this.mAdapter.mo35339k(this, i11);
        c6872g.f37735d = this.mAdapter.mo35338j(i11);
        if (i12 >= 0 && i12 < this.mItems.size()) {
            this.mItems.add(i12, c6872g);
        } else {
            this.mItems.add(c6872g);
        }
        return c6872g;
    }

    public void addOnAdapterChangeListener(InterfaceC6874i interfaceC6874i) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC6874i);
    }

    public void addOnPageChangeListener(InterfaceC6875j interfaceC6875j) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC6875j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C6872g infoForChild;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f37733b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean m35312k = layoutParams2.f37718a | m35312k(view);
        layoutParams2.f37718a = m35312k;
        if (this.mInLayout) {
            if (!m35312k) {
                layoutParams2.f37721d = true;
                addViewInLayout(view, i11, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i11, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean arrowScroll(int i11) {
        View findNextFocus;
        boolean pageLeft;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("arrowScroll tried to find focus based on non-child current focused view ");
                sb3.append(sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i11 == 17) {
                    int i12 = m35310i(this.mTempRect, findNextFocus).left;
                    int i13 = m35310i(this.mTempRect, findFocus).left;
                    if (findFocus != null && i12 >= i13) {
                        pageLeft = pageLeft();
                    } else {
                        pageLeft = findNextFocus.requestFocus();
                    }
                } else {
                    if (i11 == 66) {
                        int i14 = m35310i(this.mTempRect, findNextFocus).left;
                        int i15 = m35310i(this.mTempRect, findFocus).left;
                        if (findFocus != null && i14 <= i15) {
                            pageLeft = pageRight();
                        } else {
                            pageLeft = findNextFocus.requestFocus();
                        }
                    }
                    pageLeft = false;
                }
            } else if (i11 == 17 && i11 != 1) {
                if (i11 == 66 || i11 == 2) {
                    pageLeft = pageRight();
                }
                pageLeft = false;
            } else {
                pageLeft = pageLeft();
            }
            if (pageLeft) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i11));
            }
            return pageLeft;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i11);
        if (findNextFocus == null) {
        }
        if (i11 == 17) {
        }
        pageLeft = pageLeft();
        if (pageLeft) {
        }
        return pageLeft;
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z11 && view.canScrollHorizontally(-i11)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i11 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i11 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    View childForPosition(int i11) {
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            C6872g infoForChild = infoForChild(childAt);
            if (infoForChild != null && infoForChild.f37733b == i11) {
                return childAt;
            }
        }
        return null;
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC6875j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!m35315n(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            AbstractC1579n0.m7898r0(this);
            return;
        }
        m35303b(true);
    }

    void dataSetChanged() {
        boolean z11;
        int mo35335g = this.mAdapter.mo35335g();
        this.mExpectedAdapterCount = mo35335g;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < mo35335g) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.mCurItem;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.mItems.size()) {
            C6872g c6872g = this.mItems.get(i12);
            int mo35336h = this.mAdapter.mo35336h(c6872g.f37732a);
            if (mo35336h != -1) {
                if (mo35336h == -2) {
                    this.mItems.remove(i12);
                    i12--;
                    if (!z12) {
                        this.mAdapter.mo35349u(this);
                        z12 = true;
                    }
                    this.mAdapter.mo35332d(this, c6872g.f37733b, c6872g.f37732a);
                    int i13 = this.mCurItem;
                    if (i13 == c6872g.f37733b) {
                        i11 = Math.max(0, Math.min(i13, mo35335g - 1));
                    }
                } else {
                    int i14 = c6872g.f37733b;
                    if (i14 != mo35336h) {
                        if (i14 == this.mCurItem) {
                            i11 = mo35336h;
                        }
                        c6872g.f37733b = mo35336h;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.mAdapter.mo35334f(this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i15).getLayoutParams();
                if (!layoutParams.f37718a) {
                    layoutParams.f37720c = 0.0f;
                }
            }
            setCurrentItemInternal(i11, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C6872g infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f37733b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        AbstractC6881a abstractC6881a;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (abstractC6881a = this.mAdapter) == null || abstractC6881a.mo35335g() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
            return;
        }
        if (!this.mLeftEdge.isFinished()) {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
            this.mLeftEdge.setSize(height, width);
            z11 = this.mLeftEdge.draw(canvas);
            canvas.restoreToCount(save);
        } else {
            z11 = false;
        }
        if (!this.mRightEdge.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
            this.mRightEdge.setSize(height2, width2);
            z11 |= this.mRightEdge.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z11) {
            AbstractC1579n0.m7898r0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C6872g m35311j = m35311j();
                if (m35311j != null) {
                    setCurrentItemInternal(m35304c(m35311j.f37733b, ((scrollX / clientWidth) - m35311j.f37736e) / m35311j.f37735d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
                }
            }
            m35309h();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return pageRight();
                    }
                    return arrowScroll(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f11) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f11;
            float scrollX = getScrollX() - f11;
            float clientWidth = getClientWidth();
            float f12 = this.mFirstOffset * clientWidth;
            float f13 = this.mLastOffset * clientWidth;
            C6872g c6872g = this.mItems.get(0);
            C6872g c6872g2 = this.mItems.get(r4.size() - 1);
            if (c6872g.f37733b != 0) {
                f12 = c6872g.f37736e * clientWidth;
            }
            if (c6872g2.f37733b != this.mAdapter.mo35335g() - 1) {
                f13 = c6872g2.f37736e * clientWidth;
            }
            if (scrollX < f12) {
                scrollX = f12;
            } else if (scrollX > f13) {
                scrollX = f13;
            }
            int i11 = (int) scrollX;
            this.mLastMotionX += scrollX - i11;
            scrollTo(i11, getScrollY());
            m35315n(i11);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC6881a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        if (this.mDrawingOrder == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i12).getLayoutParams()).f37723f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    C6872g infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    C6872g infoForChild(View view) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            C6872g c6872g = this.mItems.get(i11);
            if (this.mAdapter.mo35340l(view, c6872g.f37732a)) {
                return c6872g;
            }
        }
        return null;
    }

    C6872g infoForPosition(int i11) {
        for (int i12 = 0; i12 < this.mItems.size(); i12++) {
            C6872g c6872g = this.mItems.get(i12);
            if (c6872g.f37733b == i11) {
                return c6872g;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f11);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f11);
        this.mCloseEnough = (int) (2.0f * f11);
        this.mDefaultGutterSize = (int) (f11 * 16.0f);
        AbstractC1579n0.m7801A0(this, new C6873h());
        if (AbstractC1579n0.m7808E(this) == 0) {
            AbstractC1579n0.m7823L0(this, 1);
        }
        AbstractC1579n0.m7833Q0(this, new C6869d());
    }

    public boolean isDragInGutterEnabled() {
        return this.mDragInGutterEnabled;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f13 = this.mPageMargin / width;
            int i12 = 0;
            C6872g c6872g = this.mItems.get(0);
            float f14 = c6872g.f37736e;
            int size = this.mItems.size();
            int i13 = c6872g.f37733b;
            int i14 = this.mItems.get(size - 1).f37733b;
            while (i13 < i14) {
                while (true) {
                    i11 = c6872g.f37733b;
                    if (i13 <= i11 || i12 >= size) {
                        break;
                    }
                    i12++;
                    c6872g = this.mItems.get(i12);
                }
                if (i13 == i11) {
                    float f15 = c6872g.f37736e;
                    float f16 = c6872g.f37735d;
                    f11 = (f15 + f16) * width;
                    f14 = f15 + f16 + f13;
                } else {
                    float mo35338j = this.mAdapter.mo35338j(i13);
                    f11 = (f14 + mo35338j) * width;
                    f14 += mo35338j + f13;
                }
                if (this.mPageMargin + f11 > scrollX) {
                    f12 = f13;
                    this.mMarginDrawable.setBounds(Math.round(f11), this.mTopPageBounds, Math.round(this.mPageMargin + f11), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f12 = f13;
                }
                if (f11 <= scrollX + r2) {
                    i13++;
                    f13 = f12;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f11;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        m35314m(motionEvent);
                    }
                } else {
                    int i11 = this.mActivePointerId;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        float x11 = motionEvent.getX(findPointerIndex);
                        float f12 = x11 - this.mLastMotionX;
                        float abs = Math.abs(f12);
                        float y11 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y11 - this.mInitialMotionY);
                        if (f12 != 0.0f && !m35313l(this.mLastMotionX, f12) && canScroll(this, false, (int) f12, (int) x11, (int) y11)) {
                            this.mLastMotionX = x11;
                            this.mLastMotionY = y11;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i12 = this.mTouchSlop;
                        if (abs > i12 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            m35319s(true);
                            setScrollState(1);
                            if (f12 > 0.0f) {
                                f11 = this.mInitialMotionX + this.mTouchSlop;
                            } else {
                                f11 = this.mInitialMotionX - this.mTouchSlop;
                            }
                            this.mLastMotionX = f11;
                            this.mLastMotionY = y11;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i12) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && m35316p(x11)) {
                            AbstractC1579n0.m7898r0(this);
                        }
                    }
                }
            } else {
                float x12 = motionEvent.getX();
                this.mInitialMotionX = x12;
                this.mLastMotionX = x12;
                float y12 = motionEvent.getY();
                this.mInitialMotionY = y12;
                this.mLastMotionY = y12;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    m35319s(true);
                    setScrollState(1);
                } else {
                    m35303b(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        m35320u();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C6872g infoForChild;
        int max;
        int i15;
        int max2;
        int i16;
        int childCount = getChildCount();
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i19 = 0;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37718a) {
                    int i22 = layoutParams.f37719b;
                    int i23 = i22 & 7;
                    int i24 = i22 & 112;
                    if (i23 != 1) {
                        if (i23 != 3) {
                            if (i23 != 5) {
                                i15 = paddingLeft;
                            } else {
                                max = (i17 - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i15 = childAt.getMeasuredWidth() + paddingLeft;
                        }
                        if (i24 == 16) {
                            if (i24 != 48) {
                                if (i24 != 80) {
                                    i16 = paddingTop;
                                } else {
                                    max2 = (i18 - paddingBottom) - childAt.getMeasuredHeight();
                                    paddingBottom += childAt.getMeasuredHeight();
                                }
                            } else {
                                i16 = childAt.getMeasuredHeight() + paddingTop;
                            }
                            int i25 = paddingLeft + scrollX;
                            childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                            i19++;
                            paddingTop = i16;
                            paddingLeft = i15;
                        } else {
                            max2 = Math.max((i18 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i26 = max2;
                        i16 = paddingTop;
                        paddingTop = i26;
                        int i252 = paddingLeft + scrollX;
                        childAt.layout(i252, paddingTop, childAt.getMeasuredWidth() + i252, paddingTop + childAt.getMeasuredHeight());
                        i19++;
                        paddingTop = i16;
                        paddingLeft = i15;
                    } else {
                        max = Math.max((i17 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i27 = max;
                    i15 = paddingLeft;
                    paddingLeft = i27;
                    if (i24 == 16) {
                    }
                    int i262 = max2;
                    i16 = paddingTop;
                    paddingTop = i262;
                    int i2522 = paddingLeft + scrollX;
                    childAt.layout(i2522, paddingTop, childAt.getMeasuredWidth() + i2522, paddingTop + childAt.getMeasuredHeight());
                    i19++;
                    paddingTop = i16;
                    paddingLeft = i15;
                }
            }
        }
        int i28 = (i17 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f37718a && (infoForChild = infoForChild(childAt2)) != null) {
                    float f11 = i28;
                    int i31 = ((int) (infoForChild.f37736e * f11)) + paddingLeft;
                    if (layoutParams2.f37721d) {
                        layoutParams2.f37721d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f11 * layoutParams2.f37720c), 1073741824), View.MeasureSpec.makeMeasureSpec((i18 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i31, paddingTop, childAt2.getMeasuredWidth() + i31, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.mTopPageBounds = paddingTop;
        this.mBottomPageBounds = i18 - paddingBottom;
        this.mDecorChildCount = i19;
        if (this.mFirstLayout) {
            int i32 = this.mCurItem;
            m35321v(i32, i32, false, 0, false);
        }
        this.mFirstLayout = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i11, int i12) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        setMeasuredDimension(View.getDefaultSize(0, i11), View.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            boolean z12 = true;
            int i17 = 1073741824;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f37718a) {
                int i18 = layoutParams2.f37719b;
                int i19 = i18 & 7;
                int i21 = i18 & 112;
                if (i21 != 48 && i21 != 80) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i19 != 3 && i19 != 5) {
                    z12 = false;
                }
                int i22 = Integer.MIN_VALUE;
                if (z11) {
                    i22 = 1073741824;
                } else if (z12) {
                    i13 = 1073741824;
                    i14 = ((ViewGroup.LayoutParams) layoutParams2).width;
                    if (i14 == -2) {
                        if (i14 == -1) {
                            i14 = paddingLeft;
                        }
                        i22 = 1073741824;
                    } else {
                        i14 = paddingLeft;
                    }
                    i15 = ((ViewGroup.LayoutParams) layoutParams2).height;
                    if (i15 == -2) {
                        if (i15 == -1) {
                            i15 = measuredHeight;
                        }
                    } else {
                        i15 = measuredHeight;
                        i17 = i13;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i22), View.MeasureSpec.makeMeasureSpec(i15, i17));
                    if (!z11) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z12) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i13 = Integer.MIN_VALUE;
                i14 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i14 == -2) {
                }
                i15 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i15 == -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, i22), View.MeasureSpec.makeMeasureSpec(i15, i17));
                if (!z11) {
                }
            }
            i16++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f37718a)) {
                float f11 = paddingLeft;
                if (layoutParams != null) {
                    f11 *= layoutParams.f37720c;
                }
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824), makeMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onPageScrolled(int i11, float f11, int i12) {
        int max;
        int i13;
        int left;
        if (this.mDecorChildCount > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f37718a) {
                    int i15 = layoutParams.f37719b & 7;
                    if (i15 != 1) {
                        if (i15 != 3) {
                            if (i15 != 5) {
                                i13 = paddingLeft;
                            } else {
                                max = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                            }
                        } else {
                            i13 = childAt.getWidth() + paddingLeft;
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i13;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i13 = paddingLeft;
                    paddingLeft = i16;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i13;
                }
            }
        }
        m35305d(i11, f11, i12);
        if (this.mPageTransformer != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!((LayoutParams) childAt2.getLayoutParams()).f37718a) {
                    this.mPageTransformer.mo35330a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.mCalledSuper = true;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        int i14;
        C6872g infoForChild;
        int childCount = getChildCount();
        if ((i11 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i14 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
            i14 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f37733b == this.mCurItem && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i14;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m8457a());
        AbstractC6881a abstractC6881a = this.mAdapter;
        if (abstractC6881a != null) {
            abstractC6881a.mo35343o(savedState.f37725s, savedState.f37726t);
            setCurrentItemInternal(savedState.f37724r, false, true);
        } else {
            this.mRestoredCurItem = savedState.f37724r;
            this.mRestoredAdapterState = savedState.f37725s;
            this.mRestoredClassLoader = savedState.f37726t;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f37724r = this.mCurItem;
        AbstractC6881a abstractC6881a = this.mAdapter;
        if (abstractC6881a != null) {
            savedState.f37725s = abstractC6881a.mo35344p();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.mPageMargin;
            m35317q(i11, i13, i15, i15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0140  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC6881a abstractC6881a;
        boolean m35320u;
        float f11;
        if (this.mFakeDragging) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (abstractC6881a = this.mAdapter) == null || abstractC6881a.mo35335g() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                m35314m(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        int i11 = this.mCurItem;
                        m35321v(i11, i11, true, 0, false);
                        m35320u = m35320u();
                        if (m35320u) {
                            AbstractC1579n0.m7898r0(this);
                        }
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            m35320u = m35320u();
                            if (m35320u) {
                            }
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.mLastMotionX);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                m35319s(true);
                                float f12 = this.mInitialMotionX;
                                if (x11 - f12 > 0.0f) {
                                    f11 = f12 + this.mTouchSlop;
                                } else {
                                    f11 = f12 - this.mTouchSlop;
                                }
                                this.mLastMotionX = f11;
                                this.mLastMotionY = y11;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        m35320u = m35316p(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                        if (m35320u) {
                        }
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C6872g m35311j = m35311j();
                if (m35311j != null) {
                    float f13 = clientWidth;
                    setCurrentItemInternal(m35304c(m35311j.f37733b, ((scrollX / f13) - m35311j.f37736e) / (m35311j.f37735d + (this.mPageMargin / f13)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                }
                m35320u = m35320u();
                if (m35320u) {
                }
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x12 = motionEvent.getX();
            this.mInitialMotionX = x12;
            this.mLastMotionX = x12;
            float y12 = motionEvent.getY();
            this.mInitialMotionY = y12;
            this.mLastMotionY = y12;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        return true;
    }

    boolean pageLeft() {
        int i11 = this.mCurItem;
        if (i11 > 0) {
            setCurrentItem(i11 - 1, true);
            return true;
        }
        return false;
    }

    boolean pageRight() {
        AbstractC6881a abstractC6881a = this.mAdapter;
        if (abstractC6881a != null && this.mCurItem < abstractC6881a.mo35335g() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(InterfaceC6874i interfaceC6874i) {
        List<InterfaceC6874i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC6874i);
        }
    }

    public void removeOnPageChangeListener(InterfaceC6875j interfaceC6875j) {
        List<InterfaceC6875j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC6875j);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC6881a abstractC6881a) {
        AbstractC6881a abstractC6881a2 = this.mAdapter;
        if (abstractC6881a2 != null) {
            abstractC6881a2.m35347s(null);
            this.mAdapter.mo35349u(this);
            for (int i11 = 0; i11 < this.mItems.size(); i11++) {
                C6872g c6872g = this.mItems.get(i11);
                this.mAdapter.mo35332d(this, c6872g.f37733b, c6872g.f37732a);
            }
            this.mAdapter.mo35334f(this);
            this.mItems.clear();
            m35318r();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        AbstractC6881a abstractC6881a3 = this.mAdapter;
        this.mAdapter = abstractC6881a;
        this.mExpectedAdapterCount = 0;
        if (abstractC6881a != null) {
            if (this.mObserver == null) {
                this.mObserver = new C6878m();
            }
            this.mAdapter.m35347s(this.mObserver);
            this.mPopulatePending = false;
            boolean z11 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.mo35335g();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.mo35343o(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z11) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC6874i> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.mAdapterChangeListeners.get(i12).mo35301a(this, abstractC6881a3, abstractC6881a);
            }
        }
    }

    public void setCurrentItem(int i11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12) {
        setCurrentItemInternal(i11, z11, z12, 0);
    }

    public void setDragInGutterEnabled(boolean z11) {
        this.mDragInGutterEnabled = z11;
    }

    public InterfaceC6875j setInternalPageChangeListener(InterfaceC6875j interfaceC6875j) {
        InterfaceC6875j interfaceC6875j2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC6875j;
        return interfaceC6875j2;
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Requested offscreen page limit ");
            sb2.append(i11);
            sb2.append(" too small; defaulting to ");
            sb2.append(1);
            i11 = 1;
        }
        if (i11 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i11;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC6875j interfaceC6875j) {
        this.mOnPageChangeListener = interfaceC6875j;
    }

    public void setOnPageSelectedDireclyListener(InterfaceC6876k interfaceC6876k) {
        this.mOnPageSelectedDirectlyListener = interfaceC6876k;
    }

    public void setPageMargin(int i11) {
        int i12 = this.mPageMargin;
        this.mPageMargin = i11;
        int width = getWidth();
        m35317q(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z11, InterfaceC6877l interfaceC6877l) {
        setPageTransformer(z11, interfaceC6877l, 2);
    }

    void setScrollState(int i11) {
        boolean z11;
        if (this.mScrollState == i11) {
            return;
        }
        this.mScrollState = i11;
        if (this.mPageTransformer != null) {
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m35308g(z11);
        }
        m35307f(i11);
    }

    void smoothScrollTo(int i11, int i12, int i13) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            m35303b(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i17;
        float distanceInfluenceForSnapDuration = f12 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f11)) * f12);
        int abs2 = Math.abs(i13);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i15) / ((f11 * this.mAdapter.mo35338j(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i14, scrollY, i15, i16, min);
        AbstractC1579n0.m7898r0(this);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:            if (r9 == r10) goto L212;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:            r8 = null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void populate(int i11) {
        C6872g c6872g;
        String hexString;
        C6872g c6872g2;
        C6872g infoForChild;
        C6872g c6872g3;
        int i12 = this.mCurItem;
        if (i12 != i11) {
            c6872g = infoForPosition(i12);
            this.mCurItem = i11;
        } else {
            c6872g = null;
        }
        if (this.mAdapter == null) {
            m35322w();
            return;
        }
        if (this.mPopulatePending) {
            m35322w();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.mAdapter.mo35349u(this);
        int i13 = this.mOffscreenPageLimit;
        int max = Math.max(0, this.mCurItem - i13);
        int mo35335g = this.mAdapter.mo35335g();
        int min = Math.min(mo35335g - 1, this.mCurItem + i13);
        if (mo35335g == this.mExpectedAdapterCount) {
            int i14 = 0;
            while (true) {
                if (i14 >= this.mItems.size()) {
                    break;
                }
                c6872g2 = this.mItems.get(i14);
                int i15 = c6872g2.f37733b;
                int i16 = this.mCurItem;
                if (i15 < i16) {
                    i14++;
                }
            }
            if (c6872g2 == null && mo35335g > 0) {
                c6872g2 = addNewItem(this.mCurItem, i14);
            }
            if (c6872g2 != null) {
                int i17 = i14 - 1;
                C6872g c6872g4 = i17 >= 0 ? this.mItems.get(i17) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - c6872g2.f37735d) + (getPaddingLeft() / clientWidth);
                float f11 = 0.0f;
                for (int i18 = this.mCurItem - 1; i18 >= 0; i18--) {
                    if (f11 >= paddingLeft && i18 < max) {
                        if (c6872g4 == null) {
                            break;
                        }
                        if (i18 == c6872g4.f37733b && !c6872g4.f37734c) {
                            this.mItems.remove(i17);
                            this.mAdapter.mo35332d(this, i18, c6872g4.f37732a);
                            i17--;
                            i14--;
                            if (i17 >= 0) {
                                c6872g3 = this.mItems.get(i17);
                                c6872g4 = c6872g3;
                            }
                            c6872g3 = null;
                            c6872g4 = c6872g3;
                        }
                    } else if (c6872g4 != null && i18 == c6872g4.f37733b) {
                        f11 += c6872g4.f37735d;
                        i17--;
                        if (i17 >= 0) {
                            c6872g3 = this.mItems.get(i17);
                            c6872g4 = c6872g3;
                        }
                        c6872g3 = null;
                        c6872g4 = c6872g3;
                    } else {
                        f11 += addNewItem(i18, i17 + 1).f37735d;
                        i14++;
                        if (i17 >= 0) {
                            c6872g3 = this.mItems.get(i17);
                            c6872g4 = c6872g3;
                        }
                        c6872g3 = null;
                        c6872g4 = c6872g3;
                    }
                }
                float f12 = c6872g2.f37735d;
                int i19 = i14 + 1;
                if (f12 < 2.0f) {
                    C6872g c6872g5 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i21 = this.mCurItem;
                    while (true) {
                        i21++;
                        if (i21 >= mo35335g) {
                            break;
                        }
                        if (f12 >= paddingRight && i21 > min) {
                            if (c6872g5 == null) {
                                break;
                            }
                            if (i21 == c6872g5.f37733b && !c6872g5.f37734c) {
                                this.mItems.remove(i19);
                                this.mAdapter.mo35332d(this, i21, c6872g5.f37732a);
                                if (i19 < this.mItems.size()) {
                                    c6872g5 = this.mItems.get(i19);
                                }
                            }
                        } else if (c6872g5 != null && i21 == c6872g5.f37733b) {
                            f12 += c6872g5.f37735d;
                            i19++;
                            if (i19 < this.mItems.size()) {
                                c6872g5 = this.mItems.get(i19);
                            }
                        } else {
                            C6872g addNewItem = addNewItem(i21, i19);
                            i19++;
                            f12 += addNewItem.f37735d;
                            c6872g5 = i19 < this.mItems.size() ? this.mItems.get(i19) : null;
                        }
                    }
                }
                m35302a(c6872g2, i14, c6872g);
                this.mAdapter.mo35346r(this, this.mCurItem, c6872g2.f37732a);
            }
            this.mAdapter.mo35334f(this);
            int childCount = getChildCount();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt = getChildAt(i22);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f37723f = i22;
                if (!layoutParams.f37718a && layoutParams.f37720c == 0.0f && (infoForChild = infoForChild(childAt)) != null) {
                    layoutParams.f37720c = infoForChild.f37735d;
                    layoutParams.f37722e = infoForChild.f37733b;
                }
            }
            m35322w();
            if (hasFocus()) {
                View findFocus = findFocus();
                C6872g infoForAnyChild = findFocus != null ? infoForAnyChild(findFocus) : null;
                if (infoForAnyChild == null || infoForAnyChild.f37733b != this.mCurItem) {
                    for (int i23 = 0; i23 < getChildCount(); i23++) {
                        View childAt2 = getChildAt(i23);
                        C6872g infoForChild2 = infoForChild(childAt2);
                        if (infoForChild2 != null && infoForChild2.f37733b == this.mCurItem && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        try {
            hexString = getResources().getResourceName(getId());
        } catch (Resources.NotFoundException unused) {
            hexString = Integer.toHexString(getId());
        }
        throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + mo35335g + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
    }

    public void setCurrentItem(int i11, boolean z11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, z11, false);
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12, int i12) {
        int i13;
        AbstractC6881a abstractC6881a = this.mAdapter;
        if (abstractC6881a != null && abstractC6881a.mo35335g() > 0) {
            if (!z12 && this.mCurItem == i11 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i11 < 0) {
                i13 = 0;
            } else {
                if (i11 >= this.mAdapter.mo35335g()) {
                    i11 = this.mAdapter.mo35335g() - 1;
                }
                i13 = i11;
            }
            int i14 = this.mOffscreenPageLimit;
            int i15 = this.mCurItem;
            if (i13 > i15 + i14 || i13 < i15 - i14) {
                for (int i16 = 0; i16 < this.mItems.size(); i16++) {
                    this.mItems.get(i16).f37734c = true;
                }
            }
            int i17 = this.mCurItem;
            boolean z13 = i17 != i13;
            if (this.mFirstLayout) {
                this.mCurItem = i13;
                if (z13) {
                    m35306e(i13);
                }
                requestLayout();
                return;
            }
            populate(i13);
            m35321v(i13, i17, z11, i12, z13);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z11, InterfaceC6877l interfaceC6877l, int i11) {
        boolean z12 = interfaceC6877l != null;
        boolean z13 = z12 != (this.mPageTransformer != null);
        this.mPageTransformer = interfaceC6877l;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            this.mDrawingOrder = z11 ? 2 : 1;
            this.mPageTransformerLayerType = i11;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z13) {
            populate();
        }
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(AbstractC1388a.m6964f(getContext(), i11));
    }
}

package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.C1070c;
import androidx.appcompat.view.menu.C1072e;
import androidx.appcompat.view.menu.InterfaceC1077j;
import androidx.appcompat.view.menu.InterfaceC1078k;
import androidx.appcompat.widget.AbstractC1152a2;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C1167f;
import androidx.appcompat.widget.C1211t1;
import androidx.appcompat.widget.C1229z1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC1204r0;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.AbstractC1324b;
import androidx.core.app.AbstractC1360o;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1401h;
import androidx.core.util.AbstractC1482d;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1606u;
import androidx.core.view.AbstractC1610v;
import androidx.core.view.AbstractC1617x0;
import androidx.core.view.C1580n1;
import androidx.core.view.C1611v0;
import androidx.core.view.InterfaceC1551g0;
import androidx.core.widget.AbstractC1638j;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19180c;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19184g;
import p175g0.AbstractC19186i;
import p175g0.AbstractC19187j;
import p193h0.AbstractC19694b;
import p310l0.AbstractC21981b;
import p310l0.AbstractWindowCallbackC21992m;
import p310l0.C21983d;
import p310l0.C21984e;
import p310l0.C21985f;
import p310l0.C21986g;
import p665y0.C30245g;

/* loaded from: classes2.dex */
public class AppCompatDelegateImpl extends AbstractC1053c implements C1072e.a, LayoutInflater.Factory2 {

    /* renamed from: p0 */
    private static final C30245g f3740p0 = new C30245g();

    /* renamed from: q0 */
    private static final boolean f3741q0 = false;

    /* renamed from: r0 */
    private static final int[] f3742r0 = {R.attr.windowBackground};

    /* renamed from: s0 */
    private static final boolean f3743s0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: t0 */
    private static final boolean f3744t0 = true;

    /* renamed from: A */
    private InterfaceC1204r0 f3745A;

    /* renamed from: B */
    private C1039f f3746B;

    /* renamed from: C */
    private C1050q f3747C;

    /* renamed from: D */
    AbstractC21981b f3748D;

    /* renamed from: E */
    ActionBarContextView f3749E;

    /* renamed from: F */
    PopupWindow f3750F;

    /* renamed from: G */
    Runnable f3751G;

    /* renamed from: H */
    C1611v0 f3752H;

    /* renamed from: I */
    private boolean f3753I;

    /* renamed from: J */
    private boolean f3754J;

    /* renamed from: K */
    ViewGroup f3755K;

    /* renamed from: L */
    private TextView f3756L;

    /* renamed from: M */
    private View f3757M;

    /* renamed from: N */
    private boolean f3758N;

    /* renamed from: O */
    private boolean f3759O;

    /* renamed from: P */
    boolean f3760P;

    /* renamed from: Q */
    boolean f3761Q;

    /* renamed from: R */
    boolean f3762R;

    /* renamed from: S */
    boolean f3763S;

    /* renamed from: T */
    boolean f3764T;

    /* renamed from: U */
    private boolean f3765U;

    /* renamed from: V */
    private PanelFeatureState[] f3766V;

    /* renamed from: W */
    private PanelFeatureState f3767W;

    /* renamed from: X */
    private boolean f3768X;

    /* renamed from: Y */
    private boolean f3769Y;

    /* renamed from: Z */
    private boolean f3770Z;

    /* renamed from: a0 */
    private boolean f3771a0;

    /* renamed from: b0 */
    boolean f3772b0;

    /* renamed from: c0 */
    private int f3773c0;

    /* renamed from: d0 */
    private int f3774d0;

    /* renamed from: e0 */
    private boolean f3775e0;

    /* renamed from: f0 */
    private boolean f3776f0;

    /* renamed from: g0 */
    private AbstractC1043j f3777g0;

    /* renamed from: h0 */
    private AbstractC1043j f3778h0;

    /* renamed from: i0 */
    boolean f3779i0;

    /* renamed from: j0 */
    int f3780j0;

    /* renamed from: k0 */
    private final Runnable f3781k0;

    /* renamed from: l0 */
    private boolean f3782l0;

    /* renamed from: m0 */
    private Rect f3783m0;

    /* renamed from: n0 */
    private Rect f3784n0;

    /* renamed from: o0 */
    private C1061k f3785o0;

    /* renamed from: s */
    final Object f3786s;

    /* renamed from: t */
    final Context f3787t;

    /* renamed from: u */
    Window f3788u;

    /* renamed from: v */
    private C1041h f3789v;

    /* renamed from: w */
    final InterfaceC1052b f3790w;

    /* renamed from: x */
    ActionBar f3791x;

    /* renamed from: y */
    MenuInflater f3792y;

    /* renamed from: z */
    private CharSequence f3793z;

    /* loaded from: classes2.dex */
    public static final class PanelFeatureState {

        /* renamed from: a */
        int f3794a;

        /* renamed from: b */
        int f3795b;

        /* renamed from: c */
        int f3796c;

        /* renamed from: d */
        int f3797d;

        /* renamed from: e */
        int f3798e;

        /* renamed from: f */
        int f3799f;

        /* renamed from: g */
        ViewGroup f3800g;

        /* renamed from: h */
        View f3801h;

        /* renamed from: i */
        View f3802i;

        /* renamed from: j */
        C1072e f3803j;

        /* renamed from: k */
        C1070c f3804k;

        /* renamed from: l */
        Context f3805l;

        /* renamed from: m */
        boolean f3806m;

        /* renamed from: n */
        boolean f3807n;

        /* renamed from: o */
        boolean f3808o;

        /* renamed from: p */
        public boolean f3809p;

        /* renamed from: q */
        boolean f3810q = false;

        /* renamed from: r */
        boolean f3811r;

        /* renamed from: s */
        Bundle f3812s;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes2.dex */
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C1033a();

            /* renamed from: p */
            int f3813p;

            /* renamed from: q */
            boolean f3814q;

            /* renamed from: r */
            Bundle f3815r;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            /* loaded from: classes2.dex */
            class C1033a implements Parcelable.ClassLoaderCreator {
                C1033a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m4842a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m4842a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public SavedState[] newArray(int i11) {
                    return new SavedState[i11];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m4842a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f3813p = parcel.readInt();
                boolean z11 = true;
                if (parcel.readInt() != 1) {
                    z11 = false;
                }
                savedState.f3814q = z11;
                if (z11) {
                    savedState.f3815r = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                parcel.writeInt(this.f3813p);
                parcel.writeInt(this.f3814q ? 1 : 0);
                if (this.f3814q) {
                    parcel.writeBundle(this.f3815r);
                }
            }
        }

        PanelFeatureState(int i11) {
            this.f3794a = i11;
        }

        /* renamed from: a */
        InterfaceC1078k m4838a(InterfaceC1077j.a aVar) {
            if (this.f3803j == null) {
                return null;
            }
            if (this.f3804k == null) {
                C1070c c1070c = new C1070c(this.f3805l, AbstractC19184g.abc_list_menu_item_layout);
                this.f3804k = c1070c;
                c1070c.mo4993h(aVar);
                this.f3803j.m5074b(this.f3804k);
            }
            return this.f3804k.m5030b(this.f3800g);
        }

        /* renamed from: b */
        public boolean m4839b() {
            if (this.f3801h == null) {
                return false;
            }
            if (this.f3802i == null && this.f3804k.m5029a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        void m4840c(C1072e c1072e) {
            C1070c c1070c;
            C1072e c1072e2 = this.f3803j;
            if (c1072e == c1072e2) {
                return;
            }
            if (c1072e2 != null) {
                c1072e2.m5063Q(this.f3804k);
            }
            this.f3803j = c1072e;
            if (c1072e != null && (c1070c = this.f3804k) != null) {
                c1072e.m5074b(c1070c);
            }
        }

        /* renamed from: d */
        void m4841d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(AbstractC19178a.actionBarPopupTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                newTheme.applyStyle(i11, true);
            }
            newTheme.resolveAttribute(AbstractC19178a.panelMenuListTheme, typedValue, true);
            int i12 = typedValue.resourceId;
            if (i12 != 0) {
                newTheme.applyStyle(i12, true);
            } else {
                newTheme.applyStyle(AbstractC19186i.Theme_AppCompat_CompactMenu, true);
            }
            C21983d c21983d = new C21983d(context, 0);
            c21983d.getTheme().setTo(newTheme);
            this.f3805l = c21983d;
            TypedArray obtainStyledAttributes = c21983d.obtainStyledAttributes(AbstractC19187j.AppCompatTheme);
            this.f3795b = obtainStyledAttributes.getResourceId(AbstractC19187j.AppCompatTheme_panelBackground, 0);
            this.f3799f = obtainStyledAttributes.getResourceId(AbstractC19187j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    /* loaded from: classes2.dex */
    public class RunnableC1034a implements Runnable {
        RunnableC1034a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f3780j0 & 1) != 0) {
                appCompatDelegateImpl.m4802U(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f3780j0 & 4096) != 0) {
                appCompatDelegateImpl2.m4802U(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f3779i0 = false;
            appCompatDelegateImpl3.f3780j0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    /* loaded from: classes2.dex */
    public class C1035b implements InterfaceC1551g0 {
        C1035b() {
        }

        @Override // androidx.core.view.InterfaceC1551g0
        /* renamed from: c */
        public C1580n1 mo4846c(View view, C1580n1 c1580n1) {
            int m8061m = c1580n1.m8061m();
            int m4796L0 = AppCompatDelegateImpl.this.m4796L0(c1580n1, null);
            if (m8061m != m4796L0) {
                c1580n1 = c1580n1.m8066s(c1580n1.m8059k(), m4796L0, c1580n1.m8060l(), c1580n1.m8058j());
            }
            return AbstractC1579n0.m7888m0(view, c1580n1);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    /* loaded from: classes2.dex */
    public class C1036c implements ContentFrameLayout.InterfaceC1111a {
        C1036c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1111a
        /* renamed from: a */
        public void mo4847a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC1111a
        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.m4800S();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    /* loaded from: classes2.dex */
    public class RunnableC1037d implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d$a */
        /* loaded from: classes2.dex */
        class a extends AbstractC1617x0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1614w0
            /* renamed from: b */
            public void mo4848b(View view) {
                AppCompatDelegateImpl.this.f3749E.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f3752H.m8222j(null);
                AppCompatDelegateImpl.this.f3752H = null;
            }

            @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
            /* renamed from: c */
            public void mo4849c(View view) {
                AppCompatDelegateImpl.this.f3749E.setVisibility(0);
            }
        }

        RunnableC1037d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f3750F.showAtLocation(appCompatDelegateImpl.f3749E, 55, 0, 0);
            AppCompatDelegateImpl.this.m4803V();
            if (AppCompatDelegateImpl.this.m4789D0()) {
                AppCompatDelegateImpl.this.f3749E.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f3752H = AbstractC1579n0.m7864e(appCompatDelegateImpl2.f3749E).m8215b(1.0f);
                AppCompatDelegateImpl.this.f3752H.m8222j(new a());
                return;
            }
            AppCompatDelegateImpl.this.f3749E.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f3749E.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    /* loaded from: classes2.dex */
    public class C1038e extends AbstractC1617x0 {
        C1038e() {
        }

        @Override // androidx.core.view.InterfaceC1614w0
        /* renamed from: b */
        public void mo4848b(View view) {
            AppCompatDelegateImpl.this.f3749E.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f3752H.m8222j(null);
            AppCompatDelegateImpl.this.f3752H = null;
        }

        @Override // androidx.core.view.AbstractC1617x0, androidx.core.view.InterfaceC1614w0
        /* renamed from: c */
        public void mo4849c(View view) {
            AppCompatDelegateImpl.this.f3749E.setVisibility(0);
            AppCompatDelegateImpl.this.f3749E.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f3749E.getParent() instanceof View) {
                AbstractC1579n0.m7910x0((View) AppCompatDelegateImpl.this.f3749E.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    /* loaded from: classes2.dex */
    public final class C1039f implements InterfaceC1077j.a {
        C1039f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: c */
        public void mo4850c(C1072e c1072e, boolean z11) {
            AppCompatDelegateImpl.this.m4795L(c1072e);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: d */
        public boolean mo4851d(C1072e c1072e) {
            Window.Callback m4812f0 = AppCompatDelegateImpl.this.m4812f0();
            if (m4812f0 != null) {
                m4812f0.onMenuOpened(108, c1072e);
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    /* loaded from: classes2.dex */
    public class C1040g implements AbstractC21981b.a {

        /* renamed from: a */
        private AbstractC21981b.a f3823a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g$a */
        /* loaded from: classes2.dex */
        class a extends AbstractC1617x0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC1614w0
            /* renamed from: b */
            public void mo4848b(View view) {
                AppCompatDelegateImpl.this.f3749E.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f3750F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f3749E.getParent() instanceof View) {
                    AbstractC1579n0.m7910x0((View) AppCompatDelegateImpl.this.f3749E.getParent());
                }
                AppCompatDelegateImpl.this.f3749E.removeAllViews();
                AppCompatDelegateImpl.this.f3752H.m8222j(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f3752H = null;
                AbstractC1579n0.m7910x0(appCompatDelegateImpl2.f3755K);
            }
        }

        public C1040g(AbstractC21981b.a aVar) {
            this.f3823a = aVar;
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: a */
        public boolean mo4852a(AbstractC21981b abstractC21981b, MenuItem menuItem) {
            return this.f3823a.mo4852a(abstractC21981b, menuItem);
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: b */
        public boolean mo4853b(AbstractC21981b abstractC21981b, Menu menu) {
            return this.f3823a.mo4853b(abstractC21981b, menu);
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: c */
        public boolean mo4854c(AbstractC21981b abstractC21981b, Menu menu) {
            AbstractC1579n0.m7910x0(AppCompatDelegateImpl.this.f3755K);
            return this.f3823a.mo4854c(abstractC21981b, menu);
        }

        @Override // p310l0.AbstractC21981b.a
        /* renamed from: d */
        public void mo4855d(AbstractC21981b abstractC21981b) {
            this.f3823a.mo4855d(abstractC21981b);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f3750F != null) {
                appCompatDelegateImpl.f3788u.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f3751G);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f3749E != null) {
                appCompatDelegateImpl2.m4803V();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f3752H = AbstractC1579n0.m7864e(appCompatDelegateImpl3.f3749E).m8215b(0.0f);
                AppCompatDelegateImpl.this.f3752H.m8222j(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            InterfaceC1052b interfaceC1052b = appCompatDelegateImpl4.f3790w;
            if (interfaceC1052b != null) {
                interfaceC1052b.mo4747f(appCompatDelegateImpl4.f3748D);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f3748D = null;
            AbstractC1579n0.m7910x0(appCompatDelegateImpl5.f3755K);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    /* loaded from: classes2.dex */
    public class C1042i extends AbstractC1043j {

        /* renamed from: c */
        private final PowerManager f3827c;

        C1042i(Context context) {
            super();
            this.f3827c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: b */
        IntentFilter mo4857b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: c */
        public int mo4858c() {
            if (this.f3827c.isPowerSaveMode()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: d */
        public void mo4859d() {
            AppCompatDelegateImpl.this.m4791F();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    /* loaded from: classes2.dex */
    public abstract class AbstractC1043j {

        /* renamed from: a */
        private BroadcastReceiver f3829a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j$a */
        /* loaded from: classes2.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC1043j.this.mo4859d();
            }
        }

        AbstractC1043j() {
        }

        /* renamed from: a */
        void m4860a() {
            BroadcastReceiver broadcastReceiver = this.f3829a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f3787t.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f3829a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo4857b();

        /* renamed from: c */
        abstract int mo4858c();

        /* renamed from: d */
        abstract void mo4859d();

        /* renamed from: e */
        void m4861e() {
            m4860a();
            IntentFilter mo4857b = mo4857b();
            if (mo4857b != null && mo4857b.countActions() != 0) {
                if (this.f3829a == null) {
                    this.f3829a = new a();
                }
                AppCompatDelegateImpl.this.f3787t.registerReceiver(this.f3829a, mo4857b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    /* loaded from: classes2.dex */
    public class C1044k extends AbstractC1043j {

        /* renamed from: c */
        private final C1064n f3832c;

        C1044k(C1064n c1064n) {
            super();
            this.f3832c = c1064n;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: b */
        IntentFilter mo4857b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: c */
        public int mo4858c() {
            if (this.f3832c.m4929d()) {
                return 2;
            }
            return 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AbstractC1043j
        /* renamed from: d */
        public void mo4859d() {
            AppCompatDelegateImpl.this.m4791F();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    /* loaded from: classes2.dex */
    public static class C1045l {
        /* renamed from: a */
        static void m4862a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11 = configuration.densityDpi;
            int i12 = configuration2.densityDpi;
            if (i11 != i12) {
                configuration3.densityDpi = i12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    /* loaded from: classes2.dex */
    public static class C1046m {
        /* renamed from: a */
        static void m4863a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    /* loaded from: classes2.dex */
    public static class C1047n {
        /* renamed from: a */
        static void m4864a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            i11 = configuration.colorMode;
            int i19 = i11 & 3;
            i12 = configuration2.colorMode;
            if (i19 != (i12 & 3)) {
                i17 = configuration3.colorMode;
                i18 = configuration2.colorMode;
                configuration3.colorMode = i17 | (i18 & 3);
            }
            i13 = configuration.colorMode;
            int i21 = i13 & 12;
            i14 = configuration2.colorMode;
            if (i21 != (i14 & 12)) {
                i15 = configuration3.colorMode;
                i16 = configuration2.colorMode;
                configuration3.colorMode = i15 | (i16 & 12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    /* loaded from: classes2.dex */
    private static class C1048o {
        /* renamed from: a */
        static void m4865a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    /* loaded from: classes2.dex */
    public class C1049p extends ContentFrameLayout {
        public C1049p(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m4866b(int i11, int i12) {
            if (i11 >= -5 && i12 >= -5 && i11 <= getWidth() + 5 && i12 <= getHeight() + 5) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.m4801T(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m4866b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                AppCompatDelegateImpl.this.m4797N(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i11) {
            setBackgroundDrawable(AbstractC19694b.m103336d(getContext(), i11));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    /* loaded from: classes2.dex */
    public final class C1050q implements InterfaceC1077j.a {
        C1050q() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: c */
        public void mo4850c(C1072e c1072e, boolean z11) {
            boolean z12;
            C1072e mo5053F = c1072e.mo5053F();
            if (mo5053F != c1072e) {
                z12 = true;
            } else {
                z12 = false;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z12) {
                c1072e = mo5053F;
            }
            PanelFeatureState m4804Y = appCompatDelegateImpl.m4804Y(c1072e);
            if (m4804Y != null) {
                if (z12) {
                    AppCompatDelegateImpl.this.m4794K(m4804Y.f3794a, m4804Y, mo5053F);
                    AppCompatDelegateImpl.this.m4798O(m4804Y, true);
                } else {
                    AppCompatDelegateImpl.this.m4798O(m4804Y, z11);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1077j.a
        /* renamed from: d */
        public boolean mo4851d(C1072e c1072e) {
            Window.Callback m4812f0;
            if (c1072e == c1072e.mo5053F()) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                if (appCompatDelegateImpl.f3760P && (m4812f0 = appCompatDelegateImpl.m4812f0()) != null && !AppCompatDelegateImpl.this.f3772b0) {
                    m4812f0.onMenuOpened(108, c1072e);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, InterfaceC1052b interfaceC1052b) {
        this(activity, null, interfaceC1052b, activity);
    }

    /* renamed from: A0 */
    private boolean m4754A0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z11;
        InterfaceC1204r0 interfaceC1204r0;
        int i11;
        boolean z12;
        InterfaceC1204r0 interfaceC1204r02;
        InterfaceC1204r0 interfaceC1204r03;
        if (this.f3772b0) {
            return false;
        }
        if (panelFeatureState.f3806m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f3767W;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            m4798O(panelFeatureState2, false);
        }
        Window.Callback m4812f0 = m4812f0();
        if (m4812f0 != null) {
            panelFeatureState.f3802i = m4812f0.onCreatePanelView(panelFeatureState.f3794a);
        }
        int i12 = panelFeatureState.f3794a;
        if (i12 != 0 && i12 != 108) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 && (interfaceC1204r03 = this.f3745A) != null) {
            interfaceC1204r03.mo5173f();
        }
        if (panelFeatureState.f3802i == null) {
            if (z11) {
                m4836y0();
            }
            C1072e c1072e = panelFeatureState.f3803j;
            if (c1072e == null || panelFeatureState.f3811r) {
                if (c1072e == null && (!m4778j0(panelFeatureState) || panelFeatureState.f3803j == null)) {
                    return false;
                }
                if (z11 && this.f3745A != null) {
                    if (this.f3746B == null) {
                        this.f3746B = new C1039f();
                    }
                    this.f3745A.mo5171d(panelFeatureState.f3803j, this.f3746B);
                }
                panelFeatureState.f3803j.m5085h0();
                if (!m4812f0.onCreatePanelMenu(panelFeatureState.f3794a, panelFeatureState.f3803j)) {
                    panelFeatureState.m4840c(null);
                    if (z11 && (interfaceC1204r0 = this.f3745A) != null) {
                        interfaceC1204r0.mo5171d(null, this.f3746B);
                    }
                    return false;
                }
                panelFeatureState.f3811r = false;
            }
            panelFeatureState.f3803j.m5085h0();
            Bundle bundle = panelFeatureState.f3812s;
            if (bundle != null) {
                panelFeatureState.f3803j.m5064R(bundle);
                panelFeatureState.f3812s = null;
            }
            if (!m4812f0.onPreparePanel(0, panelFeatureState.f3802i, panelFeatureState.f3803j)) {
                if (z11 && (interfaceC1204r02 = this.f3745A) != null) {
                    interfaceC1204r02.mo5171d(null, this.f3746B);
                }
                panelFeatureState.f3803j.m5083g0();
                return false;
            }
            if (keyEvent != null) {
                i11 = keyEvent.getDeviceId();
            } else {
                i11 = -1;
            }
            if (KeyCharacterMap.load(i11).getKeyboardType() != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            panelFeatureState.f3809p = z12;
            panelFeatureState.f3803j.setQwertyMode(z12);
            panelFeatureState.f3803j.m5083g0();
        }
        panelFeatureState.f3806m = true;
        panelFeatureState.f3807n = false;
        this.f3767W = panelFeatureState;
        return true;
    }

    /* renamed from: B0 */
    private void m4755B0(boolean z11) {
        InterfaceC1204r0 interfaceC1204r0 = this.f3745A;
        if (interfaceC1204r0 != null && interfaceC1204r0.mo5168a() && (!ViewConfiguration.get(this.f3787t).hasPermanentMenuKey() || this.f3745A.mo5174g())) {
            Window.Callback m4812f0 = m4812f0();
            if (this.f3745A.mo5172e() && z11) {
                this.f3745A.mo5169b();
                if (!this.f3772b0) {
                    m4812f0.onPanelClosed(108, m4809d0(0, true).f3803j);
                    return;
                }
                return;
            }
            if (m4812f0 != null && !this.f3772b0) {
                if (this.f3779i0 && (this.f3780j0 & 1) != 0) {
                    this.f3788u.getDecorView().removeCallbacks(this.f3781k0);
                    this.f3781k0.run();
                }
                PanelFeatureState m4809d0 = m4809d0(0, true);
                C1072e c1072e = m4809d0.f3803j;
                if (c1072e != null && !m4809d0.f3811r && m4812f0.onPreparePanel(0, m4809d0.f3802i, c1072e)) {
                    m4812f0.onMenuOpened(108, m4809d0.f3803j);
                    this.f3745A.mo5170c();
                    return;
                }
                return;
            }
            return;
        }
        PanelFeatureState m4809d02 = m4809d0(0, true);
        m4809d02.f3810q = true;
        m4798O(m4809d02, false);
        m4783x0(m4809d02, null);
    }

    /* renamed from: C0 */
    private int m4756C0(int i11) {
        if (i11 == 8) {
            return 108;
        }
        if (i11 == 9) {
            return 109;
        }
        return i11;
    }

    /* renamed from: E0 */
    private boolean m4757E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f3788u.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || AbstractC1579n0.m7862d0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: G */
    private boolean m4758G(boolean z11) {
        if (this.f3772b0) {
            return false;
        }
        int m4763J = m4763J();
        boolean m4764J0 = m4764J0(m4819n0(this.f3787t, m4763J), z11);
        if (m4763J == 0) {
            m4774c0(this.f3787t).m4861e();
        } else {
            AbstractC1043j abstractC1043j = this.f3777g0;
            if (abstractC1043j != null) {
                abstractC1043j.m4860a();
            }
        }
        if (m4763J == 3) {
            m4773b0(this.f3787t).m4861e();
        } else {
            AbstractC1043j abstractC1043j2 = this.f3778h0;
            if (abstractC1043j2 != null) {
                abstractC1043j2.m4860a();
            }
        }
        return m4764J0;
    }

    /* renamed from: H */
    private void m4759H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f3755K.findViewById(R.id.content);
        View decorView = this.f3788u.getDecorView();
        contentFrameLayout.m5270a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f3787t.obtainStyledAttributes(AbstractC19187j.AppCompatTheme);
        obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(AbstractC19187j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: H0 */
    private void m4760H0() {
        if (!this.f3754J) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: I */
    private void m4761I(Window window) {
        if (this.f3788u == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C1041h)) {
                C1041h c1041h = new C1041h(callback);
                this.f3789v = c1041h;
                window.setCallback(c1041h);
                C1211t1 m5715u = C1211t1.m5715u(this.f3787t, null, f3742r0);
                Drawable m5724h = m5715u.m5724h(0);
                if (m5724h != null) {
                    window.setBackgroundDrawable(m5724h);
                }
                m5715u.m5736w();
                this.f3788u = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I0 */
    private AppCompatActivity m4762I0() {
        for (Context context = this.f3787t; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: J */
    private int m4763J() {
        int i11 = this.f3773c0;
        if (i11 == -100) {
            return AbstractC1053c.m4880j();
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m4764J0(int i11, boolean z11) {
        boolean z12;
        Configuration m4768P = m4768P(this.f3787t, i11, null);
        boolean m4780l0 = m4780l0();
        int i12 = this.f3787t.getResources().getConfiguration().uiMode & 48;
        int i13 = m4768P.uiMode & 48;
        boolean z13 = true;
        if (i12 != i13 && z11 && !m4780l0 && this.f3769Y && (f3743s0 || this.f3770Z)) {
            Object obj = this.f3786s;
            if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                AbstractC1324b.m6639v((Activity) this.f3786s);
                z12 = true;
                if (z12 && i12 != i13) {
                    m4765K0(i13, m4780l0, null);
                } else {
                    z13 = z12;
                }
                if (z13) {
                    Object obj2 = this.f3786s;
                    if (obj2 instanceof AppCompatActivity) {
                        ((AppCompatActivity) obj2).m4740B2(i11);
                    }
                }
                return z13;
            }
        }
        z12 = false;
        if (z12) {
        }
        z13 = z12;
        if (z13) {
        }
        return z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K0 */
    private void m4765K0(int i11, boolean z11, Configuration configuration) {
        Resources resources = this.f3787t.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i11 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 26) {
            AbstractC1062l.m4917a(resources);
        }
        int i13 = this.f3774d0;
        if (i13 != 0) {
            this.f3787t.setTheme(i13);
            if (i12 >= 23) {
                this.f3787t.getTheme().applyStyle(this.f3774d0, true);
            }
        }
        if (z11) {
            Object obj = this.f3786s;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC1801w) {
                    if (((InterfaceC1801w) activity).getLifecycle().mo9336b().m9345c(AbstractC1785o.b.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f3771a0) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: M */
    private void m4766M() {
        AbstractC1043j abstractC1043j = this.f3777g0;
        if (abstractC1043j != null) {
            abstractC1043j.m4860a();
        }
        AbstractC1043j abstractC1043j2 = this.f3778h0;
        if (abstractC1043j2 != null) {
            abstractC1043j2.m4860a();
        }
    }

    /* renamed from: M0 */
    private void m4767M0(View view) {
        int m6961c;
        if ((AbstractC1579n0.m7842V(view) & 8192) != 0) {
            m6961c = AbstractC1388a.m6961c(this.f3787t, AbstractC19180c.abc_decor_view_status_guard_light);
        } else {
            m6961c = AbstractC1388a.m6961c(this.f3787t, AbstractC19180c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(m6961c);
    }

    /* renamed from: P */
    private Configuration m4768P(Context context, int i11, Configuration configuration) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            } else {
                i12 = 32;
            }
        } else {
            i12 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i12 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: Q */
    private ViewGroup m4769Q() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f3787t.obtainStyledAttributes(AbstractC19187j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(AbstractC19187j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(AbstractC19187j.AppCompatTheme_windowNoTitle, false)) {
                mo4837z(1);
            } else if (obtainStyledAttributes.getBoolean(AbstractC19187j.AppCompatTheme_windowActionBar, false)) {
                mo4837z(108);
            }
            if (obtainStyledAttributes.getBoolean(AbstractC19187j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo4837z(109);
            }
            if (obtainStyledAttributes.getBoolean(AbstractC19187j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo4837z(10);
            }
            this.f3763S = obtainStyledAttributes.getBoolean(AbstractC19187j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m4771X();
            this.f3788u.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f3787t);
            if (!this.f3764T) {
                if (this.f3763S) {
                    viewGroup = (ViewGroup) from.inflate(AbstractC19184g.abc_dialog_title_material, (ViewGroup) null);
                    this.f3761Q = false;
                    this.f3760P = false;
                } else if (this.f3760P) {
                    TypedValue typedValue = new TypedValue();
                    this.f3787t.getTheme().resolveAttribute(AbstractC19178a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C21983d(this.f3787t, typedValue.resourceId);
                    } else {
                        context = this.f3787t;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(AbstractC19184g.abc_screen_toolbar, (ViewGroup) null);
                    InterfaceC1204r0 interfaceC1204r0 = (InterfaceC1204r0) viewGroup.findViewById(AbstractC19183f.decor_content_parent);
                    this.f3745A = interfaceC1204r0;
                    interfaceC1204r0.setWindowCallback(m4812f0());
                    if (this.f3761Q) {
                        this.f3745A.mo5175h(109);
                    }
                    if (this.f3758N) {
                        this.f3745A.mo5175h(2);
                    }
                    if (this.f3759O) {
                        this.f3745A.mo5175h(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f3762R ? (ViewGroup) from.inflate(AbstractC19184g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(AbstractC19184g.abc_screen_simple, (ViewGroup) null);
            }
            if (viewGroup != null) {
                AbstractC1579n0.m7833Q0(viewGroup, new C1035b());
                if (this.f3745A == null) {
                    this.f3756L = (TextView) viewGroup.findViewById(AbstractC19183f.title);
                }
                AbstractC1152a2.m5460c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC19183f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f3788u.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f3788u.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C1036c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3760P + ", windowActionBarOverlay: " + this.f3761Q + ", android:windowIsFloating: " + this.f3763S + ", windowActionModeOverlay: " + this.f3762R + ", windowNoTitle: " + this.f3764T + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: W */
    private void m4770W() {
        if (!this.f3754J) {
            this.f3755K = m4769Q();
            CharSequence m4810e0 = m4810e0();
            if (!TextUtils.isEmpty(m4810e0)) {
                InterfaceC1204r0 interfaceC1204r0 = this.f3745A;
                if (interfaceC1204r0 != null) {
                    interfaceC1204r0.setWindowTitle(m4810e0);
                } else if (m4836y0() != null) {
                    m4836y0().mo4707s(m4810e0);
                } else {
                    TextView textView = this.f3756L;
                    if (textView != null) {
                        textView.setText(m4810e0);
                    }
                }
            }
            m4759H();
            m4835w0(this.f3755K);
            this.f3754J = true;
            PanelFeatureState m4809d0 = m4809d0(0, false);
            if (!this.f3772b0) {
                if (m4809d0 == null || m4809d0.f3803j == null) {
                    m4779k0(108);
                }
            }
        }
    }

    /* renamed from: X */
    private void m4771X() {
        if (this.f3788u == null) {
            Object obj = this.f3786s;
            if (obj instanceof Activity) {
                m4761I(((Activity) obj).getWindow());
            }
        }
        if (this.f3788u != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Z */
    private static Configuration m4772Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f11 = configuration.fontScale;
            float f12 = configuration2.fontScale;
            if (f11 != f12) {
                configuration3.fontScale = f12;
            }
            int i11 = configuration.mcc;
            int i12 = configuration2.mcc;
            if (i11 != i12) {
                configuration3.mcc = i12;
            }
            int i13 = configuration.mnc;
            int i14 = configuration2.mnc;
            if (i13 != i14) {
                configuration3.mnc = i14;
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 24) {
                C1046m.m4863a(configuration, configuration2, configuration3);
            } else if (!AbstractC1482d.m7475a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i16 = configuration.touchscreen;
            int i17 = configuration2.touchscreen;
            if (i16 != i17) {
                configuration3.touchscreen = i17;
            }
            int i18 = configuration.keyboard;
            int i19 = configuration2.keyboard;
            if (i18 != i19) {
                configuration3.keyboard = i19;
            }
            int i21 = configuration.keyboardHidden;
            int i22 = configuration2.keyboardHidden;
            if (i21 != i22) {
                configuration3.keyboardHidden = i22;
            }
            int i23 = configuration.navigation;
            int i24 = configuration2.navigation;
            if (i23 != i24) {
                configuration3.navigation = i24;
            }
            int i25 = configuration.navigationHidden;
            int i26 = configuration2.navigationHidden;
            if (i25 != i26) {
                configuration3.navigationHidden = i26;
            }
            int i27 = configuration.orientation;
            int i28 = configuration2.orientation;
            if (i27 != i28) {
                configuration3.orientation = i28;
            }
            int i29 = configuration.screenLayout & 15;
            int i31 = configuration2.screenLayout;
            if (i29 != (i31 & 15)) {
                configuration3.screenLayout |= i31 & 15;
            }
            int i32 = configuration.screenLayout & 192;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 192)) {
                configuration3.screenLayout |= i33 & 192;
            }
            int i34 = configuration.screenLayout & 48;
            int i35 = configuration2.screenLayout;
            if (i34 != (i35 & 48)) {
                configuration3.screenLayout |= i35 & 48;
            }
            int i36 = configuration.screenLayout & 768;
            int i37 = configuration2.screenLayout;
            if (i36 != (i37 & 768)) {
                configuration3.screenLayout |= i37 & 768;
            }
            if (i15 >= 26) {
                C1047n.m4864a(configuration, configuration2, configuration3);
            }
            int i38 = configuration.uiMode & 15;
            int i39 = configuration2.uiMode;
            if (i38 != (i39 & 15)) {
                configuration3.uiMode |= i39 & 15;
            }
            int i41 = configuration.uiMode & 48;
            int i42 = configuration2.uiMode;
            if (i41 != (i42 & 48)) {
                configuration3.uiMode |= i42 & 48;
            }
            int i43 = configuration.screenWidthDp;
            int i44 = configuration2.screenWidthDp;
            if (i43 != i44) {
                configuration3.screenWidthDp = i44;
            }
            int i45 = configuration.screenHeightDp;
            int i46 = configuration2.screenHeightDp;
            if (i45 != i46) {
                configuration3.screenHeightDp = i46;
            }
            int i47 = configuration.smallestScreenWidthDp;
            int i48 = configuration2.smallestScreenWidthDp;
            if (i47 != i48) {
                configuration3.smallestScreenWidthDp = i48;
            }
            C1045l.m4862a(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: b0 */
    private AbstractC1043j m4773b0(Context context) {
        if (this.f3778h0 == null) {
            this.f3778h0 = new C1042i(context);
        }
        return this.f3778h0;
    }

    /* renamed from: c0 */
    private AbstractC1043j m4774c0(Context context) {
        if (this.f3777g0 == null) {
            this.f3777g0 = new C1044k(C1064n.m4924a(context));
        }
        return this.f3777g0;
    }

    /* renamed from: g0 */
    private void m4775g0() {
        m4770W();
        if (this.f3760P && this.f3791x == null) {
            Object obj = this.f3786s;
            if (obj instanceof Activity) {
                this.f3791x = new C1065o((Activity) this.f3786s, this.f3761Q);
            } else if (obj instanceof Dialog) {
                this.f3791x = new C1065o((Dialog) this.f3786s);
            }
            ActionBar actionBar = this.f3791x;
            if (actionBar != null) {
                actionBar.mo4705q(this.f3782l0);
            }
        }
    }

    /* renamed from: h0 */
    private boolean m4776h0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f3802i;
        if (view != null) {
            panelFeatureState.f3801h = view;
            return true;
        }
        if (panelFeatureState.f3803j == null) {
            return false;
        }
        if (this.f3747C == null) {
            this.f3747C = new C1050q();
        }
        View view2 = (View) panelFeatureState.m4838a(this.f3747C);
        panelFeatureState.f3801h = view2;
        if (view2 != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m4777i0(PanelFeatureState panelFeatureState) {
        panelFeatureState.m4841d(m4806a0());
        panelFeatureState.f3800g = new C1049p(panelFeatureState.f3805l);
        panelFeatureState.f3796c = 81;
        return true;
    }

    /* renamed from: j0 */
    private boolean m4778j0(PanelFeatureState panelFeatureState) {
        Resources.Theme theme;
        Context context = this.f3787t;
        int i11 = panelFeatureState.f3794a;
        if ((i11 == 0 || i11 == 108) && this.f3745A != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(AbstractC19178a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(AbstractC19178a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(AbstractC19178a.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C21983d c21983d = new C21983d(context, 0);
                c21983d.getTheme().setTo(theme);
                context = c21983d;
            }
        }
        C1072e c1072e = new C1072e(context);
        c1072e.mo5068V(this);
        panelFeatureState.m4840c(c1072e);
        return true;
    }

    /* renamed from: k0 */
    private void m4779k0(int i11) {
        this.f3780j0 = (1 << i11) | this.f3780j0;
        if (!this.f3779i0) {
            AbstractC1579n0.m7900s0(this.f3788u.getDecorView(), this.f3781k0);
            this.f3779i0 = true;
        }
    }

    /* renamed from: l0 */
    private boolean m4780l0() {
        int i11;
        boolean z11;
        if (!this.f3776f0 && (this.f3786s instanceof Activity)) {
            PackageManager packageManager = this.f3787t.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 29) {
                    i11 = 269221888;
                } else if (i12 >= 24) {
                    i11 = 786432;
                } else {
                    i11 = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f3787t, this.f3786s.getClass()), i11);
                if (activityInfo != null && (activityInfo.configChanges & 512) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f3775e0 = z11;
            } catch (PackageManager.NameNotFoundException unused) {
                this.f3775e0 = false;
            }
        }
        this.f3776f0 = true;
        return this.f3775e0;
    }

    /* renamed from: q0 */
    private boolean m4781q0(int i11, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState m4809d0 = m4809d0(i11, true);
            if (!m4809d0.f3808o) {
                return m4754A0(m4809d0, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:            if (m4754A0(r2, r6) != false) goto L72;     */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m4782t0(int i11, KeyEvent keyEvent) {
        AudioManager audioManager;
        InterfaceC1204r0 interfaceC1204r0;
        if (this.f3748D != null) {
            return false;
        }
        boolean z11 = true;
        PanelFeatureState m4809d0 = m4809d0(i11, true);
        if (i11 == 0 && (interfaceC1204r0 = this.f3745A) != null && interfaceC1204r0.mo5168a() && !ViewConfiguration.get(this.f3787t).hasPermanentMenuKey()) {
            if (!this.f3745A.mo5172e()) {
                if (!this.f3772b0 && m4754A0(m4809d0, keyEvent)) {
                    z11 = this.f3745A.mo5170c();
                }
                z11 = false;
            } else {
                z11 = this.f3745A.mo5169b();
            }
        } else {
            boolean z12 = m4809d0.f3808o;
            if (!z12 && !m4809d0.f3807n) {
                if (m4809d0.f3806m) {
                    if (m4809d0.f3811r) {
                        m4809d0.f3806m = false;
                    }
                    m4783x0(m4809d0, keyEvent);
                }
                z11 = false;
            } else {
                m4798O(m4809d0, true);
                z11 = z12;
            }
        }
        if (z11 && (audioManager = (AudioManager) this.f3787t.getApplicationContext().getSystemService("audio")) != null) {
            audioManager.playSoundEffect(0);
        }
        return z11;
    }

    /* renamed from: x0 */
    private void m4783x0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i11;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f3808o && !this.f3772b0) {
            if (panelFeatureState.f3794a == 0 && (this.f3787t.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
            Window.Callback m4812f0 = m4812f0();
            if (m4812f0 != null && !m4812f0.onMenuOpened(panelFeatureState.f3794a, panelFeatureState.f3803j)) {
                m4798O(panelFeatureState, true);
                return;
            }
            WindowManager windowManager = (WindowManager) this.f3787t.getSystemService("window");
            if (windowManager == null || !m4754A0(panelFeatureState, keyEvent)) {
                return;
            }
            ViewGroup viewGroup = panelFeatureState.f3800g;
            if (viewGroup != null && !panelFeatureState.f3810q) {
                View view = panelFeatureState.f3802i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i11 = -1;
                    panelFeatureState.f3807n = false;
                    WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i11, -2, panelFeatureState.f3797d, panelFeatureState.f3798e, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 8519680, -3);
                    layoutParams2.gravity = panelFeatureState.f3796c;
                    layoutParams2.windowAnimations = panelFeatureState.f3799f;
                    windowManager.addView(panelFeatureState.f3800g, layoutParams2);
                    panelFeatureState.f3808o = true;
                }
            } else {
                if (viewGroup == null) {
                    if (!m4777i0(panelFeatureState) || panelFeatureState.f3800g == null) {
                        return;
                    }
                } else if (panelFeatureState.f3810q && viewGroup.getChildCount() > 0) {
                    panelFeatureState.f3800g.removeAllViews();
                }
                if (m4776h0(panelFeatureState) && panelFeatureState.m4839b()) {
                    ViewGroup.LayoutParams layoutParams3 = panelFeatureState.f3801h.getLayoutParams();
                    if (layoutParams3 == null) {
                        layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.f3800g.setBackgroundResource(panelFeatureState.f3795b);
                    ViewParent parent = panelFeatureState.f3801h.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.f3801h);
                    }
                    panelFeatureState.f3800g.addView(panelFeatureState.f3801h, layoutParams3);
                    if (!panelFeatureState.f3801h.hasFocus()) {
                        panelFeatureState.f3801h.requestFocus();
                    }
                } else {
                    panelFeatureState.f3810q = true;
                    return;
                }
            }
            i11 = -2;
            panelFeatureState.f3807n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i11, -2, panelFeatureState.f3797d, panelFeatureState.f3798e, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 8519680, -3);
            layoutParams22.gravity = panelFeatureState.f3796c;
            layoutParams22.windowAnimations = panelFeatureState.f3799f;
            windowManager.addView(panelFeatureState.f3800g, layoutParams22);
            panelFeatureState.f3808o = true;
        }
    }

    /* renamed from: z0 */
    private boolean m4784z0(PanelFeatureState panelFeatureState, int i11, KeyEvent keyEvent, int i12) {
        C1072e c1072e;
        boolean z11 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f3806m || m4754A0(panelFeatureState, keyEvent)) && (c1072e = panelFeatureState.f3803j) != null) {
            z11 = c1072e.performShortcut(i11, keyEvent, i12);
        }
        if (z11 && (i12 & 1) == 0 && this.f3745A == null) {
            m4798O(panelFeatureState, true);
        }
        return z11;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: A */
    public void mo4785A(int i11) {
        m4770W();
        ViewGroup viewGroup = (ViewGroup) this.f3755K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3787t).inflate(i11, viewGroup);
        this.f3789v.m114830a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: B */
    public void mo4786B(View view) {
        m4770W();
        ViewGroup viewGroup = (ViewGroup) this.f3755K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3789v.m114830a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: C */
    public void mo4787C(View view, ViewGroup.LayoutParams layoutParams) {
        m4770W();
        ViewGroup viewGroup = (ViewGroup) this.f3755K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3789v.m114830a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: D */
    public void mo4788D(int i11) {
        this.f3774d0 = i11;
    }

    /* renamed from: D0 */
    final boolean m4789D0() {
        ViewGroup viewGroup;
        if (this.f3754J && (viewGroup = this.f3755K) != null && AbstractC1579n0.m7865e0(viewGroup)) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: E */
    public final void mo4790E(CharSequence charSequence) {
        this.f3793z = charSequence;
        InterfaceC1204r0 interfaceC1204r0 = this.f3745A;
        if (interfaceC1204r0 != null) {
            interfaceC1204r0.setWindowTitle(charSequence);
            return;
        }
        if (m4836y0() != null) {
            m4836y0().mo4707s(charSequence);
            return;
        }
        TextView textView = this.f3756L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: F */
    public boolean m4791F() {
        return m4758G(true);
    }

    /* renamed from: F0 */
    public AbstractC21981b m4792F0(AbstractC21981b.a aVar) {
        InterfaceC1052b interfaceC1052b;
        if (aVar != null) {
            AbstractC21981b abstractC21981b = this.f3748D;
            if (abstractC21981b != null) {
                abstractC21981b.mo4954c();
            }
            C1040g c1040g = new C1040g(aVar);
            ActionBar mo4816m = mo4816m();
            if (mo4816m != null) {
                AbstractC21981b mo4708t = mo4816m.mo4708t(c1040g);
                this.f3748D = mo4708t;
                if (mo4708t != null && (interfaceC1052b = this.f3790w) != null) {
                    interfaceC1052b.mo4741D0(mo4708t);
                }
            }
            if (this.f3748D == null) {
                this.f3748D = m4793G0(c1040g);
            }
            return this.f3748D;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    AbstractC21981b m4793G0(AbstractC21981b.a aVar) {
        AbstractC21981b abstractC21981b;
        Context context;
        AbstractC21981b abstractC21981b2;
        InterfaceC1052b interfaceC1052b;
        m4803V();
        AbstractC21981b abstractC21981b3 = this.f3748D;
        if (abstractC21981b3 != null) {
            abstractC21981b3.mo4954c();
        }
        if (!(aVar instanceof C1040g)) {
            aVar = new C1040g(aVar);
        }
        InterfaceC1052b interfaceC1052b2 = this.f3790w;
        if (interfaceC1052b2 != null && !this.f3772b0) {
            try {
                abstractC21981b = interfaceC1052b2.mo4749n(aVar);
            } catch (AbstractMethodError unused) {
            }
            if (abstractC21981b == null) {
                this.f3748D = abstractC21981b;
            } else {
                boolean z11 = true;
                if (this.f3749E == null) {
                    if (this.f3763S) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = this.f3787t.getTheme();
                        theme.resolveAttribute(AbstractC19178a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme newTheme = this.f3787t.getResources().newTheme();
                            newTheme.setTo(theme);
                            newTheme.applyStyle(typedValue.resourceId, true);
                            context = new C21983d(this.f3787t, 0);
                            context.getTheme().setTo(newTheme);
                        } else {
                            context = this.f3787t;
                        }
                        this.f3749E = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC19178a.actionModePopupWindowStyle);
                        this.f3750F = popupWindow;
                        AbstractC1638j.m8402b(popupWindow, 2);
                        this.f3750F.setContentView(this.f3749E);
                        this.f3750F.setWidth(-1);
                        context.getTheme().resolveAttribute(AbstractC19178a.actionBarSize, typedValue, true);
                        this.f3749E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        this.f3750F.setHeight(-2);
                        this.f3751G = new RunnableC1037d();
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) this.f3755K.findViewById(AbstractC19183f.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(m4806a0()));
                            this.f3749E = (ActionBarContextView) viewStubCompat.m5445a();
                        }
                    }
                }
                if (this.f3749E != null) {
                    m4803V();
                    this.f3749E.m5157k();
                    Context context2 = this.f3749E.getContext();
                    ActionBarContextView actionBarContextView = this.f3749E;
                    if (this.f3750F != null) {
                        z11 = false;
                    }
                    C21984e c21984e = new C21984e(context2, actionBarContextView, aVar, z11);
                    if (aVar.mo4853b(c21984e, c21984e.mo4956e())) {
                        c21984e.mo4960k();
                        this.f3749E.m5155h(c21984e);
                        this.f3748D = c21984e;
                        if (m4789D0()) {
                            this.f3749E.setAlpha(0.0f);
                            C1611v0 m8215b = AbstractC1579n0.m7864e(this.f3749E).m8215b(1.0f);
                            this.f3752H = m8215b;
                            m8215b.m8222j(new C1038e());
                        } else {
                            this.f3749E.setAlpha(1.0f);
                            this.f3749E.setVisibility(0);
                            this.f3749E.sendAccessibilityEvent(32);
                            if (this.f3749E.getParent() instanceof View) {
                                AbstractC1579n0.m7910x0((View) this.f3749E.getParent());
                            }
                        }
                        if (this.f3750F != null) {
                            this.f3788u.getDecorView().post(this.f3751G);
                        }
                    } else {
                        this.f3748D = null;
                    }
                }
            }
            abstractC21981b2 = this.f3748D;
            if (abstractC21981b2 != null && (interfaceC1052b = this.f3790w) != null) {
                interfaceC1052b.mo4741D0(abstractC21981b2);
            }
            return this.f3748D;
        }
        abstractC21981b = null;
        if (abstractC21981b == null) {
        }
        abstractC21981b2 = this.f3748D;
        if (abstractC21981b2 != null) {
            interfaceC1052b.mo4741D0(abstractC21981b2);
        }
        return this.f3748D;
    }

    /* renamed from: K */
    void m4794K(int i11, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i11 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f3766V;
                if (i11 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i11];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f3803j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f3808o) && !this.f3772b0) {
            this.f3789v.m114830a().onPanelClosed(i11, menu);
        }
    }

    /* renamed from: L */
    void m4795L(C1072e c1072e) {
        if (this.f3765U) {
            return;
        }
        this.f3765U = true;
        this.f3745A.mo5179l();
        Window.Callback m4812f0 = m4812f0();
        if (m4812f0 != null && !this.f3772b0) {
            m4812f0.onPanelClosed(108, c1072e);
        }
        this.f3765U = false;
    }

    /* renamed from: L0 */
    final int m4796L0(C1580n1 c1580n1, Rect rect) {
        int i11;
        boolean z11;
        int m8059k;
        int m8060l;
        boolean z12;
        int i12 = 0;
        if (c1580n1 != null) {
            i11 = c1580n1.m8061m();
        } else if (rect != null) {
            i11 = rect.top;
        } else {
            i11 = 0;
        }
        ActionBarContextView actionBarContextView = this.f3749E;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3749E.getLayoutParams();
            boolean z13 = true;
            if (this.f3749E.isShown()) {
                if (this.f3783m0 == null) {
                    this.f3783m0 = new Rect();
                    this.f3784n0 = new Rect();
                }
                Rect rect2 = this.f3783m0;
                Rect rect3 = this.f3784n0;
                if (c1580n1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c1580n1.m8059k(), c1580n1.m8061m(), c1580n1.m8060l(), c1580n1.m8058j());
                }
                AbstractC1152a2.m5458a(this.f3755K, rect2, rect3);
                int i13 = rect2.top;
                int i14 = rect2.left;
                int i15 = rect2.right;
                C1580n1 m7824M = AbstractC1579n0.m7824M(this.f3755K);
                if (m7824M == null) {
                    m8059k = 0;
                } else {
                    m8059k = m7824M.m8059k();
                }
                if (m7824M == null) {
                    m8060l = 0;
                } else {
                    m8060l = m7824M.m8060l();
                }
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    z12 = false;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    z12 = true;
                }
                if (i13 > 0 && this.f3757M == null) {
                    View view = new View(this.f3787t);
                    this.f3757M = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m8059k;
                    layoutParams.rightMargin = m8060l;
                    this.f3755K.addView(this.f3757M, -1, layoutParams);
                } else {
                    View view2 = this.f3757M;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != m8059k || marginLayoutParams2.rightMargin != m8060l) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = m8059k;
                            marginLayoutParams2.rightMargin = m8060l;
                            this.f3757M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f3757M;
                if (view3 == null) {
                    z13 = false;
                }
                if (z13 && view3.getVisibility() != 0) {
                    m4767M0(this.f3757M);
                }
                if (!this.f3762R && z13) {
                    i11 = 0;
                }
                z11 = z13;
                z13 = z12;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z11 = false;
            } else {
                z11 = false;
                z13 = false;
            }
            if (z13) {
                this.f3749E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z11 = false;
        }
        View view4 = this.f3757M;
        if (view4 != null) {
            if (!z11) {
                i12 = 8;
            }
            view4.setVisibility(i12);
        }
        return i11;
    }

    /* renamed from: N */
    void m4797N(int i11) {
        m4798O(m4809d0(i11, true), true);
    }

    /* renamed from: O */
    void m4798O(PanelFeatureState panelFeatureState, boolean z11) {
        ViewGroup viewGroup;
        InterfaceC1204r0 interfaceC1204r0;
        if (z11 && panelFeatureState.f3794a == 0 && (interfaceC1204r0 = this.f3745A) != null && interfaceC1204r0.mo5172e()) {
            m4795L(panelFeatureState.f3803j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f3787t.getSystemService("window");
        if (windowManager != null && panelFeatureState.f3808o && (viewGroup = panelFeatureState.f3800g) != null) {
            windowManager.removeView(viewGroup);
            if (z11) {
                m4794K(panelFeatureState.f3794a, panelFeatureState, null);
            }
        }
        panelFeatureState.f3806m = false;
        panelFeatureState.f3807n = false;
        panelFeatureState.f3808o = false;
        panelFeatureState.f3801h = null;
        panelFeatureState.f3810q = true;
        if (this.f3767W == panelFeatureState) {
            this.f3767W = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: R */
    public View m4799R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z11;
        boolean z12 = false;
        if (this.f3785o0 == null) {
            String string = this.f3787t.obtainStyledAttributes(AbstractC19187j.AppCompatTheme).getString(AbstractC19187j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f3785o0 = new C1061k();
            } else {
                try {
                    this.f3785o0 = (C1061k) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to instantiate custom view inflater ");
                    sb2.append(string);
                    sb2.append(". Falling back to default.");
                    this.f3785o0 = new C1061k();
                }
            }
        }
        boolean z13 = f3741q0;
        if (z13) {
            if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z12 = true;
                }
            } else {
                z12 = m4757E0((ViewParent) view);
            }
            z11 = z12;
        } else {
            z11 = false;
        }
        return this.f3785o0.m4915q(view, str, context, attributeSet, z11, z13, true, C1229z1.m5794b());
    }

    /* renamed from: S */
    void m4800S() {
        C1072e c1072e;
        InterfaceC1204r0 interfaceC1204r0 = this.f3745A;
        if (interfaceC1204r0 != null) {
            interfaceC1204r0.mo5179l();
        }
        if (this.f3750F != null) {
            this.f3788u.getDecorView().removeCallbacks(this.f3751G);
            if (this.f3750F.isShowing()) {
                try {
                    this.f3750F.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f3750F = null;
        }
        m4803V();
        PanelFeatureState m4809d0 = m4809d0(0, false);
        if (m4809d0 != null && (c1072e = m4809d0.f3803j) != null) {
            c1072e.close();
        }
    }

    /* renamed from: T */
    boolean m4801T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f3786s;
        if (((obj instanceof AbstractC1606u.a) || (obj instanceof AbstractDialogC1060j)) && (decorView = this.f3788u.getDecorView()) != null && AbstractC1606u.m8206d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f3789v.m114830a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return m4823p0(keyCode, keyEvent);
        }
        return m4828s0(keyCode, keyEvent);
    }

    /* renamed from: U */
    void m4802U(int i11) {
        PanelFeatureState m4809d0;
        PanelFeatureState m4809d02 = m4809d0(i11, true);
        if (m4809d02.f3803j != null) {
            Bundle bundle = new Bundle();
            m4809d02.f3803j.m5066T(bundle);
            if (bundle.size() > 0) {
                m4809d02.f3812s = bundle;
            }
            m4809d02.f3803j.m5085h0();
            m4809d02.f3803j.clear();
        }
        m4809d02.f3811r = true;
        m4809d02.f3810q = true;
        if ((i11 == 108 || i11 == 0) && this.f3745A != null && (m4809d0 = m4809d0(0, false)) != null) {
            m4809d0.f3806m = false;
            m4754A0(m4809d0, null);
        }
    }

    /* renamed from: V */
    void m4803V() {
        C1611v0 c1611v0 = this.f3752H;
        if (c1611v0 != null) {
            c1611v0.m8216c();
        }
    }

    /* renamed from: Y */
    PanelFeatureState m4804Y(Menu menu) {
        int i11;
        PanelFeatureState[] panelFeatureStateArr = this.f3766V;
        if (panelFeatureStateArr != null) {
            i11 = panelFeatureStateArr.length;
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i12];
            if (panelFeatureState != null && panelFeatureState.f3803j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.C1072e.a
    /* renamed from: a */
    public boolean mo4805a(C1072e c1072e, MenuItem menuItem) {
        PanelFeatureState m4804Y;
        Window.Callback m4812f0 = m4812f0();
        if (m4812f0 != null && !this.f3772b0 && (m4804Y = m4804Y(c1072e.mo5053F())) != null) {
            return m4812f0.onMenuItemSelected(m4804Y.f3794a, menuItem);
        }
        return false;
    }

    /* renamed from: a0 */
    final Context m4806a0() {
        Context context;
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null) {
            context = mo4816m.mo4698j();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f3787t;
        }
        return context;
    }

    @Override // androidx.appcompat.view.menu.C1072e.a
    /* renamed from: b */
    public void mo4807b(C1072e c1072e) {
        m4755B0(true);
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: d */
    public void mo4808d(View view, ViewGroup.LayoutParams layoutParams) {
        m4770W();
        ((ViewGroup) this.f3755K.findViewById(R.id.content)).addView(view, layoutParams);
        this.f3789v.m114830a().onContentChanged();
    }

    /* renamed from: d0 */
    protected PanelFeatureState m4809d0(int i11, boolean z11) {
        PanelFeatureState[] panelFeatureStateArr = this.f3766V;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i11) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i11 + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f3766V = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i11];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i11);
            panelFeatureStateArr[i11] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    /* renamed from: e0 */
    final CharSequence m4810e0() {
        Object obj = this.f3786s;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f3793z;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: f */
    public Context mo4811f(Context context) {
        this.f3769Y = true;
        int m4819n0 = m4819n0(context, m4763J());
        Configuration configuration = null;
        if (f3744t0 && (context instanceof ContextThemeWrapper)) {
            try {
                C1048o.m4865a((ContextThemeWrapper) context, m4768P(context, m4819n0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C21983d) {
            try {
                ((C21983d) context).m114800a(m4768P(context, m4819n0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f3743s0) {
            return super.mo4811f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m4772Z(configuration2, configuration3);
            }
            Configuration m4768P = m4768P(context, m4819n0, configuration);
            C21983d c21983d = new C21983d(context, AbstractC19186i.Theme_AppCompat_Empty);
            c21983d.m114800a(m4768P);
            try {
                if (context.getTheme() != null) {
                    AbstractC1401h.f.m7102a(c21983d.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            return super.mo4811f(c21983d);
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException("Application failed to obtain resources from itself", e11);
        }
    }

    /* renamed from: f0 */
    final Window.Callback m4812f0() {
        return this.f3788u.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: i */
    public View mo4813i(int i11) {
        m4770W();
        return this.f3788u.findViewById(i11);
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: k */
    public int mo4814k() {
        return this.f3773c0;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: l */
    public MenuInflater mo4815l() {
        Context context;
        if (this.f3792y == null) {
            m4775g0();
            ActionBar actionBar = this.f3791x;
            if (actionBar != null) {
                context = actionBar.mo4698j();
            } else {
                context = this.f3787t;
            }
            this.f3792y = new C21986g(context);
        }
        return this.f3792y;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: m */
    public ActionBar mo4816m() {
        m4775g0();
        return this.f3791x;
    }

    /* renamed from: m0 */
    public boolean m4817m0() {
        return this.f3753I;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: n */
    public void mo4818n() {
        LayoutInflater from = LayoutInflater.from(this.f3787t);
        if (from.getFactory() == null) {
            AbstractC1610v.m8211a(from, this);
        } else {
            boolean z11 = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    /* renamed from: n0 */
    int m4819n0(Context context, int i11) {
        Object systemService;
        if (i11 == -100) {
            return -1;
        }
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        return m4773b0(context).mo4858c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23) {
                    systemService = context.getApplicationContext().getSystemService((Class<Object>) UiModeManager.class);
                    if (((UiModeManager) systemService).getNightMode() == 0) {
                        return -1;
                    }
                }
                return m4774c0(context).mo4858c();
            }
        }
        return i11;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: o */
    public void mo4820o() {
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null && mo4816m.m4699k()) {
            return;
        }
        m4779k0(0);
    }

    /* renamed from: o0 */
    boolean m4821o0() {
        AbstractC21981b abstractC21981b = this.f3748D;
        if (abstractC21981b != null) {
            abstractC21981b.mo4954c();
            return true;
        }
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null && mo4816m.mo4695g()) {
            return true;
        }
        return false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m4799R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: p */
    public void mo4822p(Configuration configuration) {
        ActionBar mo4816m;
        if (this.f3760P && this.f3754J && (mo4816m = mo4816m()) != null) {
            mo4816m.mo4700l(configuration);
        }
        C1167f.m5528b().m5535g(this.f3787t);
        m4758G(false);
    }

    /* renamed from: p0 */
    boolean m4823p0(int i11, KeyEvent keyEvent) {
        boolean z11 = true;
        if (i11 != 4) {
            if (i11 == 82) {
                m4781q0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z11 = false;
            }
            this.f3768X = z11;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: q */
    public void mo4824q(Bundle bundle) {
        String str;
        this.f3769Y = true;
        m4758G(false);
        m4771X();
        Object obj = this.f3786s;
        if (obj instanceof Activity) {
            try {
                str = AbstractC1360o.m6789c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar m4836y0 = m4836y0();
                if (m4836y0 == null) {
                    this.f3782l0 = true;
                } else {
                    m4836y0.mo4705q(true);
                }
            }
            AbstractC1053c.m4877c(this);
        }
        this.f3770Z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4825r() {
        ActionBar actionBar;
        if (this.f3786s instanceof Activity) {
            AbstractC1053c.m4881x(this);
        }
        if (this.f3779i0) {
            this.f3788u.getDecorView().removeCallbacks(this.f3781k0);
        }
        this.f3771a0 = false;
        this.f3772b0 = true;
        if (this.f3773c0 != -100) {
            Object obj = this.f3786s;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f3740p0.put(this.f3786s.getClass().getName(), Integer.valueOf(this.f3773c0));
                actionBar = this.f3791x;
                if (actionBar != null) {
                    actionBar.m4701m();
                }
                m4766M();
            }
        }
        f3740p0.remove(this.f3786s.getClass().getName());
        actionBar = this.f3791x;
        if (actionBar != null) {
        }
        m4766M();
    }

    /* renamed from: r0 */
    boolean m4826r0(int i11, KeyEvent keyEvent) {
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null && mo4816m.mo4702n(i11, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f3767W;
        if (panelFeatureState != null && m4784z0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            PanelFeatureState panelFeatureState2 = this.f3767W;
            if (panelFeatureState2 != null) {
                panelFeatureState2.f3807n = true;
            }
            return true;
        }
        if (this.f3767W == null) {
            PanelFeatureState m4809d0 = m4809d0(0, true);
            m4754A0(m4809d0, keyEvent);
            boolean m4784z0 = m4784z0(m4809d0, keyEvent.getKeyCode(), keyEvent, 1);
            m4809d0.f3806m = false;
            if (m4784z0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: s */
    public void mo4827s(Bundle bundle) {
        m4770W();
    }

    /* renamed from: s0 */
    boolean m4828s0(int i11, KeyEvent keyEvent) {
        if (i11 != 4) {
            if (i11 == 82) {
                m4782t0(0, keyEvent);
                return true;
            }
        } else {
            boolean z11 = this.f3768X;
            this.f3768X = false;
            PanelFeatureState m4809d0 = m4809d0(0, false);
            if (m4809d0 != null && m4809d0.f3808o) {
                if (!z11) {
                    m4798O(m4809d0, true);
                }
                return true;
            }
            if (m4821o0()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: t */
    public void mo4829t() {
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null) {
            mo4816m.mo4706r(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: u */
    public void mo4830u(Bundle bundle) {
    }

    /* renamed from: u0 */
    void m4831u0(int i11) {
        ActionBar mo4816m;
        if (i11 == 108 && (mo4816m = mo4816m()) != null) {
            mo4816m.mo4696h(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: v */
    public void mo4832v() {
        this.f3771a0 = true;
        m4791F();
    }

    /* renamed from: v0 */
    void m4833v0(int i11) {
        if (i11 == 108) {
            ActionBar mo4816m = mo4816m();
            if (mo4816m != null) {
                mo4816m.mo4696h(false);
                return;
            }
            return;
        }
        if (i11 == 0) {
            PanelFeatureState m4809d0 = m4809d0(i11, true);
            if (m4809d0.f3808o) {
                m4798O(m4809d0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: w */
    public void mo4834w() {
        this.f3771a0 = false;
        ActionBar mo4816m = mo4816m();
        if (mo4816m != null) {
            mo4816m.mo4706r(false);
        }
    }

    /* renamed from: w0 */
    void m4835w0(ViewGroup viewGroup) {
    }

    /* renamed from: y0 */
    final ActionBar m4836y0() {
        return this.f3791x;
    }

    @Override // androidx.appcompat.app.AbstractC1053c
    /* renamed from: z */
    public boolean mo4837z(int i11) {
        int m4756C0 = m4756C0(i11);
        if (this.f3764T && m4756C0 == 108) {
            return false;
        }
        if (this.f3760P && m4756C0 == 1) {
            this.f3760P = false;
        }
        if (m4756C0 != 1) {
            if (m4756C0 != 2) {
                if (m4756C0 != 5) {
                    if (m4756C0 != 10) {
                        if (m4756C0 != 108) {
                            if (m4756C0 != 109) {
                                return this.f3788u.requestFeature(m4756C0);
                            }
                            m4760H0();
                            this.f3761Q = true;
                            return true;
                        }
                        m4760H0();
                        this.f3760P = true;
                        return true;
                    }
                    m4760H0();
                    this.f3762R = true;
                    return true;
                }
                m4760H0();
                this.f3759O = true;
                return true;
            }
            m4760H0();
            this.f3758N = true;
            return true;
        }
        m4760H0();
        this.f3764T = true;
        return true;
    }

    public AppCompatDelegateImpl(Dialog dialog, InterfaceC1052b interfaceC1052b) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC1052b, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    /* loaded from: classes2.dex */
    public class C1041h extends AbstractWindowCallbackC21992m {
        C1041h(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m4856b(ActionMode.Callback callback) {
            C21985f.a aVar = new C21985f.a(AppCompatDelegateImpl.this.f3787t, callback);
            AbstractC21981b m4792F0 = AppCompatDelegateImpl.this.m4792F0(aVar);
            if (m4792F0 != null) {
                return aVar.m114804e(m4792F0);
            }
            return null;
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!AppCompatDelegateImpl.this.m4801T(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !AppCompatDelegateImpl.this.m4826r0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i11, Menu menu) {
            if (i11 == 0 && !(menu instanceof C1072e)) {
                return false;
            }
            return super.onCreatePanelMenu(i11, menu);
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public boolean onMenuOpened(int i11, Menu menu) {
            super.onMenuOpened(i11, menu);
            AppCompatDelegateImpl.this.m4831u0(i11);
            return true;
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public void onPanelClosed(int i11, Menu menu) {
            super.onPanelClosed(i11, menu);
            AppCompatDelegateImpl.this.m4833v0(i11);
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public boolean onPreparePanel(int i11, View view, Menu menu) {
            C1072e c1072e;
            if (menu instanceof C1072e) {
                c1072e = (C1072e) menu;
            } else {
                c1072e = null;
            }
            if (i11 == 0 && c1072e == null) {
                return false;
            }
            if (c1072e != null) {
                c1072e.m5081e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i11, view, menu);
            if (c1072e != null) {
                c1072e.m5081e0(false);
            }
            return onPreparePanel;
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i11) {
            C1072e c1072e;
            PanelFeatureState m4809d0 = AppCompatDelegateImpl.this.m4809d0(0, true);
            if (m4809d0 != null && (c1072e = m4809d0.f3803j) != null) {
                super.onProvideKeyboardShortcuts(list, c1072e, i11);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i11);
            }
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.m4817m0()) {
                return m4856b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override // p310l0.AbstractWindowCallbackC21992m, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i11) {
            if (AppCompatDelegateImpl.this.m4817m0() && i11 == 0) {
                return m4856b(callback);
            }
            return super.onWindowStartingActionMode(callback, i11);
        }
    }

    private AppCompatDelegateImpl(Context context, Window window, InterfaceC1052b interfaceC1052b, Object obj) {
        AppCompatActivity m4762I0;
        this.f3752H = null;
        this.f3753I = true;
        this.f3773c0 = -100;
        this.f3781k0 = new RunnableC1034a();
        this.f3787t = context;
        this.f3790w = interfaceC1052b;
        this.f3786s = obj;
        if (this.f3773c0 == -100 && (obj instanceof Dialog) && (m4762I0 = m4762I0()) != null) {
            this.f3773c0 = m4762I0.m4751p2().mo4814k();
        }
        if (this.f3773c0 == -100) {
            C30245g c30245g = f3740p0;
            Integer num = (Integer) c30245g.get(obj.getClass().getName());
            if (num != null) {
                this.f3773c0 = num.intValue();
                c30245g.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            m4761I(window);
        }
        C1167f.m5530h();
    }
}

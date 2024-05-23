package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.os.AbstractC1435a;
import androidx.core.view.accessibility.InterfaceC1513j0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p176g1.AbstractC19201c;
import p664y.AbstractC30228a;

/* renamed from: androidx.core.view.accessibility.g0 */
/* loaded from: classes2.dex */
public class C1507g0 {

    /* renamed from: d */
    private static int f6418d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f6419a;

    /* renamed from: b */
    public int f6420b = -1;

    /* renamed from: c */
    private int f6421c = -1;

    /* renamed from: androidx.core.view.accessibility.g0$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: A */
        public static final a f6422A;

        /* renamed from: B */
        public static final a f6423B;

        /* renamed from: C */
        public static final a f6424C;

        /* renamed from: D */
        public static final a f6425D;

        /* renamed from: E */
        public static final a f6426E;

        /* renamed from: F */
        public static final a f6427F;

        /* renamed from: G */
        public static final a f6428G;

        /* renamed from: H */
        public static final a f6429H;

        /* renamed from: I */
        public static final a f6430I;

        /* renamed from: J */
        public static final a f6431J;

        /* renamed from: K */
        public static final a f6432K;

        /* renamed from: L */
        public static final a f6433L;

        /* renamed from: M */
        public static final a f6434M;

        /* renamed from: N */
        public static final a f6435N;

        /* renamed from: O */
        public static final a f6436O;

        /* renamed from: P */
        public static final a f6437P;

        /* renamed from: Q */
        public static final a f6438Q;

        /* renamed from: R */
        public static final a f6439R;

        /* renamed from: S */
        public static final a f6440S;

        /* renamed from: T */
        public static final a f6441T;

        /* renamed from: U */
        public static final a f6442U;

        /* renamed from: e */
        public static final a f6443e = new a(1, null);

        /* renamed from: f */
        public static final a f6444f = new a(2, null);

        /* renamed from: g */
        public static final a f6445g = new a(4, null);

        /* renamed from: h */
        public static final a f6446h = new a(8, null);

        /* renamed from: i */
        public static final a f6447i = new a(16, null);

        /* renamed from: j */
        public static final a f6448j = new a(32, null);

        /* renamed from: k */
        public static final a f6449k = new a(64, null);

        /* renamed from: l */
        public static final a f6450l = new a(128, null);

        /* renamed from: m */
        public static final a f6451m = new a(256, (CharSequence) null, InterfaceC1513j0.b.class);

        /* renamed from: n */
        public static final a f6452n = new a(512, (CharSequence) null, InterfaceC1513j0.b.class);

        /* renamed from: o */
        public static final a f6453o = new a(1024, (CharSequence) null, InterfaceC1513j0.c.class);

        /* renamed from: p */
        public static final a f6454p = new a(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, (CharSequence) null, InterfaceC1513j0.c.class);

        /* renamed from: q */
        public static final a f6455q = new a(4096, null);

        /* renamed from: r */
        public static final a f6456r = new a(8192, null);

        /* renamed from: s */
        public static final a f6457s = new a(16384, null);

        /* renamed from: t */
        public static final a f6458t = new a(32768, null);

        /* renamed from: u */
        public static final a f6459u = new a(65536, null);

        /* renamed from: v */
        public static final a f6460v = new a(131072, (CharSequence) null, InterfaceC1513j0.g.class);

        /* renamed from: w */
        public static final a f6461w = new a(262144, null);

        /* renamed from: x */
        public static final a f6462x = new a(524288, null);

        /* renamed from: y */
        public static final a f6463y = new a(ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE, null);

        /* renamed from: z */
        public static final a f6464z = new a(2097152, (CharSequence) null, InterfaceC1513j0.h.class);

        /* renamed from: a */
        final Object f6465a;

        /* renamed from: b */
        private final int f6466b;

        /* renamed from: c */
        private final Class f6467c;

        /* renamed from: d */
        protected final InterfaceC1513j0 f6468d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction37;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction38;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction39;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction40;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction41 = null;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23) {
                accessibilityAction40 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction40;
            } else {
                accessibilityAction = null;
            }
            f6422A = new a(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
            if (i11 >= 23) {
                accessibilityAction39 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction39;
            } else {
                accessibilityAction2 = null;
            }
            f6423B = new a(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC1513j0.e.class);
            if (i11 >= 23) {
                accessibilityAction38 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction38;
            } else {
                accessibilityAction3 = null;
            }
            f6424C = new a(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
            if (i11 >= 23) {
                accessibilityAction37 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction37;
            } else {
                accessibilityAction4 = null;
            }
            f6425D = new a(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
            if (i11 >= 23) {
                accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction36;
            } else {
                accessibilityAction5 = null;
            }
            f6426E = new a(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
            if (i11 >= 23) {
                accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction35;
            } else {
                accessibilityAction6 = null;
            }
            f6427F = new a(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
            if (i11 >= 29) {
                accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction34;
            } else {
                accessibilityAction7 = null;
            }
            f6428G = new a(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
            if (i11 >= 29) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction33;
            } else {
                accessibilityAction8 = null;
            }
            f6429H = new a(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
            if (i11 >= 29) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction32;
            } else {
                accessibilityAction9 = null;
            }
            f6430I = new a(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
            if (i11 >= 29) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction31;
            } else {
                accessibilityAction10 = null;
            }
            f6431J = new a(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
            if (i11 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction30;
            } else {
                accessibilityAction11 = null;
            }
            f6432K = new a(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
            if (i11 >= 24) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction29;
            } else {
                accessibilityAction12 = null;
            }
            f6433L = new a(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, InterfaceC1513j0.f.class);
            if (i11 >= 26) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction28;
            } else {
                accessibilityAction13 = null;
            }
            f6434M = new a(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, InterfaceC1513j0.d.class);
            if (i11 >= 28) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction27;
            } else {
                accessibilityAction14 = null;
            }
            f6435N = new a(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i11 >= 28) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction26;
            } else {
                accessibilityAction15 = null;
            }
            f6436O = new a(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i11 >= 30) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction25;
            } else {
                accessibilityAction16 = null;
            }
            f6437P = new a(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i11 >= 30) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction17 = accessibilityAction24;
            } else {
                accessibilityAction17 = null;
            }
            f6438Q = new a(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
            if (i11 >= 32) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction18 = accessibilityAction23;
            } else {
                accessibilityAction18 = null;
            }
            f6439R = new a(accessibilityAction18, R.id.ALT, null, null, null);
            if (i11 >= 32) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction19 = accessibilityAction22;
            } else {
                accessibilityAction19 = null;
            }
            f6440S = new a(accessibilityAction19, R.id.CTRL, null, null, null);
            if (i11 >= 32) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction20 = accessibilityAction21;
            } else {
                accessibilityAction20 = null;
            }
            f6441T = new a(accessibilityAction20, R.id.FUNCTION, null, null, null);
            if (i11 >= 33) {
                accessibilityAction41 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f6442U = new a(accessibilityAction41, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i11, CharSequence charSequence) {
            this(null, i11, charSequence, null, null);
        }

        /* renamed from: a */
        public a m7656a(CharSequence charSequence, InterfaceC1513j0 interfaceC1513j0) {
            return new a(null, this.f6466b, charSequence, interfaceC1513j0, this.f6467c);
        }

        /* renamed from: b */
        public int m7657b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6465a).getId();
        }

        /* renamed from: c */
        public CharSequence m7658c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f6465a).getLabel();
        }

        /* renamed from: d */
        public boolean m7659d(View view, Bundle bundle) {
            String name;
            if (this.f6468d == null) {
                return false;
            }
            Class cls = this.f6467c;
            if (cls != null) {
                try {
                    AbstractC30228a.m149044a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception unused) {
                    Class cls2 = this.f6467c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to execute command with argument class ViewCommandArgument: ");
                    sb2.append(name);
                }
            }
            return this.f6468d.mo7681a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f6465a;
            if (obj2 == null) {
                if (aVar.f6465a != null) {
                    return false;
                }
                return true;
            }
            if (!obj2.equals(aVar.f6465a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f6465a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i11, CharSequence charSequence, InterfaceC1513j0 interfaceC1513j0) {
            this(null, i11, charSequence, interfaceC1513j0, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i11, CharSequence charSequence, Class cls) {
            this(null, i11, charSequence, null, cls);
        }

        a(Object obj, int i11, CharSequence charSequence, InterfaceC1513j0 interfaceC1513j0, Class cls) {
            this.f6466b = i11;
            this.f6468d = interfaceC1513j0;
            if (obj == null) {
                this.f6465a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
            } else {
                this.f6465a = obj;
            }
            this.f6467c = cls;
        }
    }

    /* renamed from: androidx.core.view.accessibility.g0$b */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a */
        final Object f6469a;

        b(Object obj) {
            this.f6469a = obj;
        }

        /* renamed from: a */
        public static b m7660a(int i11, int i12, boolean z11) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11));
        }

        /* renamed from: b */
        public static b m7661b(int i11, int i12, boolean z11, int i13) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
        }
    }

    /* renamed from: androidx.core.view.accessibility.g0$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        final Object f6470a;

        c(Object obj) {
            this.f6470a = obj;
        }

        /* renamed from: a */
        public static c m7662a(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
        }
    }

    /* renamed from: androidx.core.view.accessibility.g0$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        final Object f6471a;

        d(Object obj) {
            this.f6471a = obj;
        }

        /* renamed from: a */
        public static d m7663a(int i11, float f11, float f12, float f13) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i11, f11, f12, f13));
        }
    }

    private C1507g0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f6419a = accessibilityNodeInfo;
    }

    /* renamed from: A */
    private boolean m7569A() {
        return !m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: B */
    private int m7570B(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i11)).get())) {
                    return sparseArray.keyAt(i11);
                }
            }
        }
        int i12 = f6418d;
        f6418d = i12 + 1;
        return i12;
    }

    /* renamed from: I0 */
    public static C1507g0 m7571I0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C1507g0(accessibilityNodeInfo);
    }

    /* renamed from: P */
    public static C1507g0 m7572P() {
        return m7571I0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: Q */
    public static C1507g0 m7573Q(View view) {
        return m7571I0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: R */
    public static C1507g0 m7574R(C1507g0 c1507g0) {
        return m7571I0(AccessibilityNodeInfo.obtain(c1507g0.f6419a));
    }

    /* renamed from: V */
    private void m7575V(View view) {
        SparseArray m7584w = m7584w(view);
        if (m7584w != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < m7584w.size(); i11++) {
                if (((WeakReference) m7584w.valueAt(i11)).get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                m7584w.remove(((Integer) arrayList.get(i12)).intValue());
            }
        }
    }

    /* renamed from: X */
    private void m7576X(int i11, boolean z11) {
        Bundle m7642s = m7642s();
        if (m7642s != null) {
            int i12 = m7642s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i11);
            if (!z11) {
                i11 = 0;
            }
            m7642s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i11 | i12);
        }
    }

    /* renamed from: e */
    private void m7577e(ClickableSpan clickableSpan, Spanned spanned, int i11) {
        m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i11));
    }

    /* renamed from: g */
    private void m7578g() {
        this.f6419a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f6419a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f6419a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f6419a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: h */
    private List m7579h(String str) {
        ArrayList<Integer> integerArrayList = this.f6419a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f6419a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: j */
    private static String m7580j(int i11) {
        if (i11 == 1) {
            return "ACTION_FOCUS";
        }
        if (i11 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i11) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return "ACTION_CLICK";
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case ZVideoUtilMetadata.FF_PROFILE_H264_INTRA /* 2048 */:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i11) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i11) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i11) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m7581l(int i11) {
        Bundle m7642s = m7642s();
        if (m7642s == null || (m7642s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) != i11) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static ClickableSpan[] m7582q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: u */
    private SparseArray m7583u(View view) {
        SparseArray m7584w = m7584w(view);
        if (m7584w == null) {
            SparseArray sparseArray = new SparseArray();
            view.setTag(AbstractC19201c.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m7584w;
    }

    /* renamed from: w */
    private SparseArray m7584w(View view) {
        return (SparseArray) view.getTag(AbstractC19201c.tag_accessibility_clickable_spans);
    }

    /* renamed from: A0 */
    public void m7585A0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6419a.setShowingHintText(z11);
        } else {
            m7576X(4, z11);
        }
    }

    /* renamed from: B0 */
    public void m7586B0(View view) {
        this.f6421c = -1;
        this.f6419a.setSource(view);
    }

    /* renamed from: C */
    public boolean m7587C() {
        return this.f6419a.isAccessibilityFocused();
    }

    /* renamed from: C0 */
    public void m7588C0(View view, int i11) {
        this.f6421c = i11;
        this.f6419a.setSource(view, i11);
    }

    /* renamed from: D */
    public boolean m7589D() {
        return this.f6419a.isCheckable();
    }

    /* renamed from: D0 */
    public void m7590D0(CharSequence charSequence) {
        if (AbstractC1435a.m7335b()) {
            this.f6419a.setStateDescription(charSequence);
        } else {
            this.f6419a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: E */
    public boolean m7591E() {
        return this.f6419a.isChecked();
    }

    /* renamed from: E0 */
    public void m7592E0(CharSequence charSequence) {
        this.f6419a.setText(charSequence);
    }

    /* renamed from: F */
    public boolean m7593F() {
        return this.f6419a.isClickable();
    }

    /* renamed from: F0 */
    public void m7594F0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f6419a.setTraversalAfter(view);
        }
    }

    /* renamed from: G */
    public boolean m7595G() {
        return this.f6419a.isEnabled();
    }

    /* renamed from: G0 */
    public void m7596G0(boolean z11) {
        this.f6419a.setVisibleToUser(z11);
    }

    /* renamed from: H */
    public boolean m7597H() {
        return this.f6419a.isFocusable();
    }

    /* renamed from: H0 */
    public AccessibilityNodeInfo m7598H0() {
        return this.f6419a;
    }

    /* renamed from: I */
    public boolean m7599I() {
        return this.f6419a.isFocused();
    }

    /* renamed from: J */
    public boolean m7600J() {
        return this.f6419a.isLongClickable();
    }

    /* renamed from: K */
    public boolean m7601K() {
        return this.f6419a.isPassword();
    }

    /* renamed from: L */
    public boolean m7602L() {
        return this.f6419a.isScrollable();
    }

    /* renamed from: M */
    public boolean m7603M() {
        return this.f6419a.isSelected();
    }

    /* renamed from: N */
    public boolean m7604N() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f6419a.isShowingHintText();
            return isShowingHintText;
        }
        return m7581l(4);
    }

    /* renamed from: O */
    public boolean m7605O() {
        return this.f6419a.isVisibleToUser();
    }

    /* renamed from: S */
    public boolean m7606S(int i11, Bundle bundle) {
        return this.f6419a.performAction(i11, bundle);
    }

    /* renamed from: T */
    public void m7607T() {
        this.f6419a.recycle();
    }

    /* renamed from: U */
    public boolean m7608U(a aVar) {
        return this.f6419a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6465a);
    }

    /* renamed from: W */
    public void m7609W(boolean z11) {
        this.f6419a.setAccessibilityFocused(z11);
    }

    /* renamed from: Y */
    public void m7610Y(Rect rect) {
        this.f6419a.setBoundsInParent(rect);
    }

    /* renamed from: Z */
    public void m7611Z(Rect rect) {
        this.f6419a.setBoundsInScreen(rect);
    }

    /* renamed from: a */
    public void m7612a(int i11) {
        this.f6419a.addAction(i11);
    }

    /* renamed from: a0 */
    public void m7613a0(boolean z11) {
        this.f6419a.setCanOpenPopup(z11);
    }

    /* renamed from: b */
    public void m7614b(a aVar) {
        this.f6419a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f6465a);
    }

    /* renamed from: b0 */
    public void m7615b0(boolean z11) {
        this.f6419a.setCheckable(z11);
    }

    /* renamed from: c */
    public void m7616c(View view) {
        this.f6419a.addChild(view);
    }

    /* renamed from: c0 */
    public void m7617c0(boolean z11) {
        this.f6419a.setChecked(z11);
    }

    /* renamed from: d */
    public void m7618d(View view, int i11) {
        this.f6419a.addChild(view, i11);
    }

    /* renamed from: d0 */
    public void m7619d0(CharSequence charSequence) {
        this.f6419a.setClassName(charSequence);
    }

    /* renamed from: e0 */
    public void m7620e0(boolean z11) {
        this.f6419a.setClickable(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1507g0)) {
            return false;
        }
        C1507g0 c1507g0 = (C1507g0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6419a;
        if (accessibilityNodeInfo == null) {
            if (c1507g0.f6419a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c1507g0.f6419a)) {
            return false;
        }
        if (this.f6421c == c1507g0.f6421c && this.f6420b == c1507g0.f6420b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m7621f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m7578g();
            m7575V(view);
            ClickableSpan[] m7582q = m7582q(charSequence);
            if (m7582q != null && m7582q.length > 0) {
                m7642s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC19201c.accessibility_action_clickable_span);
                SparseArray m7583u = m7583u(view);
                for (int i11 = 0; i11 < m7582q.length; i11++) {
                    int m7570B = m7570B(m7582q[i11], m7583u);
                    m7583u.put(m7570B, new WeakReference(m7582q[i11]));
                    m7577e(m7582q[i11], (Spanned) charSequence, m7570B);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void m7622f0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6419a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f6469a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: g0 */
    public void m7623g0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6419a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f6470a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: h0 */
    public void m7624h0(CharSequence charSequence) {
        this.f6419a.setContentDescription(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f6419a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List m7625i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f6419a.getActionList();
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new a(actionList.get(i11)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m7626i0(boolean z11) {
        this.f6419a.setEnabled(z11);
    }

    /* renamed from: j0 */
    public void m7627j0(CharSequence charSequence) {
        this.f6419a.setError(charSequence);
    }

    /* renamed from: k */
    public int m7628k() {
        return this.f6419a.getActions();
    }

    /* renamed from: k0 */
    public void m7629k0(boolean z11) {
        this.f6419a.setFocusable(z11);
    }

    /* renamed from: l0 */
    public void m7630l0(boolean z11) {
        this.f6419a.setFocused(z11);
    }

    /* renamed from: m */
    public void m7631m(Rect rect) {
        this.f6419a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m7632m0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6419a.setHeading(z11);
        } else {
            m7576X(2, z11);
        }
    }

    /* renamed from: n */
    public void m7633n(Rect rect) {
        this.f6419a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m7634n0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f6419a.setHintText(charSequence);
        } else {
            this.f6419a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: o */
    public int m7635o() {
        return this.f6419a.getChildCount();
    }

    /* renamed from: o0 */
    public void m7636o0(boolean z11) {
        this.f6419a.setLongClickable(z11);
    }

    /* renamed from: p */
    public CharSequence m7637p() {
        return this.f6419a.getClassName();
    }

    /* renamed from: p0 */
    public void m7638p0(int i11) {
        this.f6419a.setMaxTextLength(i11);
    }

    /* renamed from: q0 */
    public void m7639q0(int i11) {
        this.f6419a.setMovementGranularities(i11);
    }

    /* renamed from: r */
    public CharSequence m7640r() {
        return this.f6419a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m7641r0(CharSequence charSequence) {
        this.f6419a.setPackageName(charSequence);
    }

    /* renamed from: s */
    public Bundle m7642s() {
        return this.f6419a.getExtras();
    }

    /* renamed from: s0 */
    public void m7643s0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6419a.setPaneTitle(charSequence);
        } else {
            this.f6419a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: t */
    public int m7644t() {
        return this.f6419a.getMovementGranularities();
    }

    /* renamed from: t0 */
    public void m7645t0(View view) {
        this.f6420b = -1;
        this.f6419a.setParent(view);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m7631m(rect);
        sb2.append("; boundsInParent: " + rect);
        m7633n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m7647v());
        sb2.append("; className: ");
        sb2.append(m7637p());
        sb2.append("; text: ");
        sb2.append(m7650x());
        sb2.append("; contentDescription: ");
        sb2.append(m7640r());
        sb2.append("; viewId: ");
        sb2.append(m7654z());
        sb2.append("; uniqueId: ");
        sb2.append(m7652y());
        sb2.append("; checkable: ");
        sb2.append(m7589D());
        sb2.append("; checked: ");
        sb2.append(m7591E());
        sb2.append("; focusable: ");
        sb2.append(m7597H());
        sb2.append("; focused: ");
        sb2.append(m7599I());
        sb2.append("; selected: ");
        sb2.append(m7603M());
        sb2.append("; clickable: ");
        sb2.append(m7593F());
        sb2.append("; longClickable: ");
        sb2.append(m7600J());
        sb2.append("; enabled: ");
        sb2.append(m7595G());
        sb2.append("; password: ");
        sb2.append(m7601K());
        sb2.append("; scrollable: " + m7602L());
        sb2.append("; [");
        List m7625i = m7625i();
        for (int i11 = 0; i11 < m7625i.size(); i11++) {
            a aVar = (a) m7625i.get(i11);
            String m7580j = m7580j(aVar.m7657b());
            if (m7580j.equals("ACTION_UNKNOWN") && aVar.m7658c() != null) {
                m7580j = aVar.m7658c().toString();
            }
            sb2.append(m7580j);
            if (i11 != m7625i.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public void m7646u0(View view, int i11) {
        this.f6420b = i11;
        this.f6419a.setParent(view, i11);
    }

    /* renamed from: v */
    public CharSequence m7647v() {
        return this.f6419a.getPackageName();
    }

    /* renamed from: v0 */
    public void m7648v0(d dVar) {
        this.f6419a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f6471a);
    }

    /* renamed from: w0 */
    public void m7649w0(CharSequence charSequence) {
        this.f6419a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: x */
    public CharSequence m7650x() {
        if (m7569A()) {
            List m7579h = m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List m7579h2 = m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List m7579h3 = m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List m7579h4 = m7579h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f6419a.getText(), 0, this.f6419a.getText().length()));
            for (int i11 = 0; i11 < m7579h.size(); i11++) {
                spannableString.setSpan(new C1494a(((Integer) m7579h4.get(i11)).intValue(), this, m7642s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m7579h.get(i11)).intValue(), ((Integer) m7579h2.get(i11)).intValue(), ((Integer) m7579h3.get(i11)).intValue());
            }
            return spannableString;
        }
        return this.f6419a.getText();
    }

    /* renamed from: x0 */
    public void m7651x0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f6419a.setScreenReaderFocusable(z11);
        } else {
            m7576X(1, z11);
        }
    }

    /* renamed from: y */
    public String m7652y() {
        String uniqueId;
        if (AbstractC1435a.m7336c()) {
            uniqueId = this.f6419a.getUniqueId();
            return uniqueId;
        }
        return this.f6419a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: y0 */
    public void m7653y0(boolean z11) {
        this.f6419a.setScrollable(z11);
    }

    /* renamed from: z */
    public String m7654z() {
        return this.f6419a.getViewIdResourceName();
    }

    /* renamed from: z0 */
    public void m7655z0(boolean z11) {
        this.f6419a.setSelected(z11);
    }
}

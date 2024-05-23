package i40;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.animation.AnimationTarget;

/* renamed from: i40.i */
/* loaded from: classes5.dex */
public abstract class AbstractC20279i {

    /* renamed from: i40.i$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        public View f100222a;

        /* renamed from: b */
        public int f100223b;

        /* renamed from: c */
        public int f100224c;

        /* renamed from: d */
        public int f100225d;

        /* renamed from: e */
        public int f100226e;

        /* renamed from: f */
        public int f100227f;

        /* renamed from: g */
        public int f100228g;

        /* renamed from: h */
        public int f100229h;

        /* renamed from: i */
        public int f100230i;

        /* renamed from: j */
        public int f100231j;

        /* renamed from: k */
        public int f100232k;

        /* renamed from: l */
        public int f100233l;

        /* renamed from: m */
        public int f100234m;

        /* renamed from: n */
        public int f100235n;
    }

    /* renamed from: a */
    public static a m105893a(View view) {
        int[] iArr = new int[2];
        a aVar = null;
        try {
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            int height = view.getHeight();
            a aVar2 = new a();
            try {
                aVar2.f100222a = view;
                aVar2.f100223b = iArr[0];
                aVar2.f100224c = iArr[1];
                aVar2.f100225d = width;
                aVar2.f100226e = height;
                aVar2.f100227f = view.getLeft();
                aVar2.f100228g = view.getRight();
                aVar2.f100229h = view.getTop();
                aVar2.f100230i = view.getBottom();
                aVar2.f100231j = view.getPaddingLeft();
                aVar2.f100232k = view.getPaddingRight();
                aVar2.f100233l = view.getPaddingTop();
                aVar2.f100234m = view.getPaddingBottom();
                return aVar2;
            } catch (Exception e11) {
                e = e11;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: b */
    public static a m105894b(C16719g c16719g) {
        a aVar = null;
        try {
            int m89096G = c16719g.m89096G();
            int m89098H = c16719g.m89098H();
            ViewGroup m89119T = c16719g.m89119T();
            if (m89119T != null) {
                int[] iArr = new int[2];
                m89119T.getLocationOnScreen(iArr);
                m89096G += iArr[0];
                m89098H += iArr[1];
            }
            int m89114P = c16719g.m89114P();
            int m89112O = c16719g.m89112O();
            int i11 = m89096G + m89114P;
            int i12 = m89098H + m89112O;
            a aVar2 = new a();
            try {
                aVar2.f100222a = null;
                aVar2.f100223b = m89096G;
                aVar2.f100224c = m89098H;
                aVar2.f100225d = m89114P;
                aVar2.f100226e = m89112O;
                aVar2.f100227f = m89096G;
                aVar2.f100228g = i11;
                aVar2.f100229h = m89098H;
                aVar2.f100230i = i12;
                aVar2.f100231j = c16719g.m89106L().f84716l;
                aVar2.f100232k = c16719g.m89106L().f84718n;
                aVar2.f100233l = c16719g.m89106L().f84717m;
                aVar2.f100234m = c16719g.m89106L().f84719o;
                return aVar2;
            } catch (Exception e11) {
                e = e11;
                aVar = aVar2;
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: c */
    public static a m105895c(AnimationTarget animationTarget) {
        Rect animTargetLocationOnScreen;
        a aVar;
        a aVar2 = null;
        try {
            animTargetLocationOnScreen = animationTarget.getAnimTargetLocationOnScreen();
            aVar = new a();
        } catch (Exception e11) {
            e = e11;
        }
        try {
            aVar.f100223b = animTargetLocationOnScreen.left;
            aVar.f100224c = animTargetLocationOnScreen.top;
            aVar.f100225d = animTargetLocationOnScreen.width();
            aVar.f100226e = animTargetLocationOnScreen.height();
            aVar.f100227f = animTargetLocationOnScreen.left;
            aVar.f100228g = animTargetLocationOnScreen.right;
            aVar.f100229h = animTargetLocationOnScreen.top;
            aVar.f100230i = animTargetLocationOnScreen.bottom;
            return aVar;
        } catch (Exception e12) {
            e = e12;
            aVar2 = aVar;
            e.printStackTrace();
            return aVar2;
        }
    }

    /* renamed from: d */
    public static float m105896d(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }
}

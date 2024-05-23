package fb0;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.C1421e;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1580n1;
import com.zing.zalo.p077ui.widget.ImeFrameLayout;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.utils.systemui.AbstractC16768f;
import com.zing.zalo.utils.systemui.C16772j;
import fn0.AbstractC19074t;
import java.util.Arrays;

/* renamed from: fb0.a */
/* loaded from: classes6.dex */
public final class C18865a {

    /* renamed from: a */
    public static final C18865a f94189a = new C18865a();

    private C18865a() {
    }

    /* renamed from: a */
    public static final void m98888a(View view, View... viewArr) {
        AbstractC19074t.m100208f(view, "rootView");
        AbstractC19074t.m100208f(viewArr, "topViews");
        if (Build.VERSION.SDK_INT >= 30) {
            f94189a.m98889b(true, view, (View[]) Arrays.copyOf(viewArr, viewArr.length));
        }
    }

    /* renamed from: b */
    private final void m98889b(boolean z11, View view, View... viewArr) {
        C1421e c1421e;
        C18866b c18866b;
        C18867c c18867c;
        int i11;
        int i12;
        C1580n1 m89433s = AbstractC16768f.m89489a(view).m89433s();
        if (m89433s == null || (c1421e = m89433s.m8054f(C1580n1.m.m8118f())) == null) {
            c1421e = C1421e.f6229e;
        }
        AbstractC19074t.m100205c(c1421e);
        if (z11) {
            if (c1421e.f6233d == 0) {
                i12 = C1580n1.m.m8116d();
            } else {
                i12 = 0;
            }
            c18866b = new C18866b(i12, C1580n1.m.m8114b());
        } else {
            c18866b = null;
        }
        AbstractC1579n0.m7866e1(view, c18866b);
        C16772j m89534a = C16772j.Companion.m89534a(view);
        if (m89534a != null) {
            m89534a.m89528t(c18866b);
        }
        for (View view2 : viewArr) {
            if (z11) {
                if (c1421e.f6233d == 0) {
                    i11 = C1580n1.m.m8118f();
                } else {
                    i11 = 0;
                }
                c18867c = new C18867c(view2, i11, C1580n1.m.m8114b(), 0, 8, null);
            } else {
                c18867c = null;
            }
            AbstractC1579n0.m7866e1(view2, c18867c);
        }
        if (!z11) {
            for (View view3 : viewArr) {
                view3.setTranslationX(0.0f);
                view3.setTranslationY(0.0f);
            }
            view.setPadding(0, 0, 0, 0);
            view.requestApplyInsets();
        }
    }

    /* renamed from: d */
    public static final void m98890d(View view, View... viewArr) {
        AbstractC19074t.m100208f(view, "rootView");
        AbstractC19074t.m100208f(viewArr, "topViews");
        f94189a.m98889b(false, view, (View[]) Arrays.copyOf(viewArr, viewArr.length));
    }

    /* renamed from: c */
    public final boolean m98891c(KeyboardFrameLayout keyboardFrameLayout) {
        if ((keyboardFrameLayout instanceof ImeFrameLayout) && ((ImeFrameLayout) keyboardFrameLayout).m75758u()) {
            return true;
        }
        return false;
    }
}

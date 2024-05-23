package th;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zview.AbstractC17466e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p392oh.C24265l;

/* renamed from: th.c */
/* loaded from: classes3.dex */
public abstract class AbstractC26682c {

    /* renamed from: a */
    public static final int f126381a = AbstractC23136l9.m118742r(28.0f);

    /* renamed from: b */
    public static final int f126382b = AbstractC23136l9.m118742r(1.0f);

    /* renamed from: c */
    public static final int f126383c = AbstractC23136l9.m118742r(5.0f);

    /* renamed from: d */
    static int f126384d = -1;

    /* renamed from: e */
    private static Drawable f126385e;

    /* renamed from: f */
    private static ColorStateList f126386f;

    /* renamed from: g */
    private static Drawable f126387g;

    /* renamed from: h */
    private static Drawable f126388h;

    /* renamed from: i */
    private static Drawable f126389i;

    /* renamed from: a */
    public static void m137037a(int i11) {
        if (f126384d != i11) {
            f126384d = i11;
            m137038b();
        }
    }

    /* renamed from: b */
    private static void m137038b() {
        f126385e = null;
        f126386f = null;
        f126387g = null;
        f126388h = null;
        f126389i = null;
    }

    /* renamed from: c */
    public static Drawable m137039c(Context context) {
        if (f126389i == null) {
            f126389i = AbstractC1388a.m6964f(context, AbstractC17466e.transparent);
        }
        return f126389i;
    }

    /* renamed from: d */
    public static ColorStateList m137040d(Context context) {
        if (f126386f == null) {
            f126386f = ColorStateList.valueOf(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        }
        return f126386f;
    }

    /* renamed from: e */
    public static Drawable m137041e(Context context) {
        if (f126385e == null) {
            f126385e = AbstractC1388a.m6964f(context, AbstractC16803z.icn_react_default);
            if (C24265l.m126676s().m126682D()) {
                f126385e.setTintList(m137040d(context));
            }
        }
        return f126385e;
    }

    /* renamed from: f */
    public static Drawable m137042f(Context context) {
        if (f126388h == null) {
            f126388h = C23212s8.m119609q(context, AbstractC16781w.ReactionDetailBackgroundDrawable);
        }
        return f126388h;
    }

    /* renamed from: g */
    public static Drawable m137043g(Context context) {
        if (f126387g == null) {
            f126387g = C23212s8.m119609q(context, AbstractC16781w.ReactionButtonBackgroundDrawable);
        }
        return f126387g;
    }
}

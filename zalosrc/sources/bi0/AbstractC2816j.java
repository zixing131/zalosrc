package bi0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* renamed from: bi0.j */
/* loaded from: classes.dex */
public abstract class AbstractC2816j {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final String f11296a = "ThemeUtils";

    /* renamed from: bi0.j$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final int m13592a(Context context, int i11) {
            AbstractC19074t.m100208f(context, "context");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…es(intArrayOf(attrResId))");
            try {
                return obtainStyledAttributes.getColor(0, 0);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return 0;
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: b */
        public final ColorStateList m13593b(Context context, int i11) {
            AbstractC19074t.m100208f(context, "context");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i11});
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…es(intArrayOf(attrResId))");
            try {
                try {
                    return obtainStyledAttributes.getColorStateList(0);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    obtainStyledAttributes.recycle();
                    return null;
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: c */
        public final Drawable m13594c(Context context, int i11) {
            AbstractC19074t.m100208f(context, "context");
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i11});
            AbstractC19074t.m100207e(obtainStyledAttributes, "context.theme.obtainStyl…es(intArrayOf(attrResId))");
            try {
                try {
                    return obtainStyledAttributes.getDrawable(0);
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    obtainStyledAttributes.recycle();
                    return null;
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}

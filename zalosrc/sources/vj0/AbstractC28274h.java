package vj0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.zing.zalo.zinstant.AbstractC17158i1;
import com.zing.zalo.zinstant.zom.text.ZOMParagraph;
import nk0.AbstractC23831i0;
import nk0.C23828h0;

/* renamed from: vj0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC28274h {

    /* renamed from: vj0.h$a */
    /* loaded from: classes7.dex */
    public static class a {
        /* renamed from: a */
        public static int m142465a(int i11) {
            if (i11 != 1) {
                return i11 != 2 ? 8388611 : 8388613;
            }
            return 17;
        }
    }

    /* renamed from: a */
    public static int m142461a() {
        if (AbstractC17158i1.m91746e() == 1) {
            return -16777216;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m142462b() {
        if (AbstractC17158i1.m91746e() == 1) {
            return -12303292;
        }
        return -3355444;
    }

    /* renamed from: c */
    public static Layout m142463c(ZOMParagraph zOMParagraph, float f11, int i11, float f12, int i12, int i13, float f13, float f14, float f15, int i14) {
        return m142464d(new C28269c(), C23828h0.m124552c(zOMParagraph), f11, i11, f12, i12, i13, f13, f14, f15, i14);
    }

    /* renamed from: d */
    public static Layout m142464d(C28269c c28269c, SpannableStringBuilder spannableStringBuilder, float f11, int i11, float f12, int i12, int i13, float f13, float f14, float f15, int i14) {
        Layout.Alignment alignment;
        c28269c.m142417j(m142461a());
        c28269c.m142416i(spannableStringBuilder);
        if (i13 != 1) {
            if (i13 != 2) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        c28269c.m142411d(alignment);
        c28269c.m142419l(f13);
        c28269c.m142420m(f14);
        c28269c.m142414g(f15);
        c28269c.m142412e(TextUtils.TruncateAt.END);
        if (AbstractC23831i0.m124563a(spannableStringBuilder)) {
            i14 = 1;
        } else if (i14 <= 0) {
            i14 = Integer.MAX_VALUE;
        }
        c28269c.m142415h(i14);
        c28269c.m142421n(Math.round(f11), i11);
        c28269c.m142413f(Math.round(f12), i12);
        return c28269c.m142410a();
    }
}

package p716zh;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.AbstractC1423g;
import androidx.emoji2.text.C1698f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: zh.m1 */
/* loaded from: classes.dex */
public final class C32014m1 implements C1698f.e {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final ThreadLocal f147332b = new ThreadLocal();

    /* renamed from: a */
    private final TextPaint f147333a;

    /* renamed from: zh.m1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final StringBuilder m154323b() {
            if (C32014m1.f147332b.get() == null) {
                C32014m1.f147332b.set(new StringBuilder());
            }
            return (StringBuilder) C32014m1.f147332b.get();
        }
    }

    public C32014m1() {
        TextPaint textPaint = new TextPaint();
        this.f147333a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.C1698f.e
    /* renamed from: a */
    public boolean mo8676a(CharSequence charSequence, int i11, int i12, int i13) {
        StringBuilder m154323b;
        AbstractC19074t.m100208f(charSequence, "charSequence");
        int i14 = Build.VERSION.SDK_INT;
        if ((i14 < 23 && i13 > i14) || (m154323b = Companion.m154323b()) == null) {
            return false;
        }
        m154323b.setLength(0);
        while (i11 < i12) {
            m154323b.append(charSequence.charAt(i11));
            i11++;
        }
        return AbstractC1423g.m7237a(this.f147333a, m154323b.toString());
    }
}

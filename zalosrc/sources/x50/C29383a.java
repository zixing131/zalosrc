package x50;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* renamed from: x50.a */
/* loaded from: classes5.dex */
public final class C29383a {
    public static final a Companion = new a(null);

    /* renamed from: j */
    private static final int f135880j = AbstractC23222t7.f112540S;

    /* renamed from: a */
    private Drawable.Callback f135881a;

    /* renamed from: b */
    private float f135882b;

    /* renamed from: c */
    private long f135883c;

    /* renamed from: d */
    private long f135884d;

    /* renamed from: e */
    private final int f135885e;

    /* renamed from: f */
    private Drawable f135886f;

    /* renamed from: g */
    private final int f135887g;

    /* renamed from: h */
    private final int f135888h;

    /* renamed from: i */
    private final int f135889i;

    /* renamed from: x50.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C29383a(Drawable.Callback callback) {
        AbstractC19074t.m100208f(callback, "listener");
        this.f135881a = callback;
        this.f135885e = AbstractC23136l9.m118722k0();
        this.f135886f = AbstractC11531v0.Companion.m62545W();
        int i11 = AbstractC23222t7.f112514B;
        this.f135887g = i11;
        this.f135888h = i11;
        this.f135889i = i11 + (f135880j * 2);
    }

    /* renamed from: c */
    private final void m146521c() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.f135883c;
        this.f135883c = currentTimeMillis;
        long j12 = (this.f135884d + j11) % 1500;
        this.f135884d = j12;
        this.f135882b = ((float) (360 * j12)) / 1500.0f;
        Drawable.Callback callback = this.f135881a;
        Drawable drawable = this.f135886f;
        AbstractC19074t.m100205c(drawable);
        callback.invalidateDrawable(drawable);
    }

    /* renamed from: a */
    public final void m146522a(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.save();
        Drawable drawable = this.f135886f;
        if (drawable != null) {
            int i11 = this.f135885e;
            int i12 = this.f135887g;
            int i13 = f135880j;
            drawable.setBounds((i11 - i12) / 2, i13, (i11 + i12) / 2, this.f135888h + i13);
            canvas.save();
            canvas.rotate(this.f135882b, drawable.getBounds().centerX(), drawable.getBounds().centerY());
            drawable.draw(canvas);
            canvas.restore();
            m146521c();
        }
        canvas.restore();
    }

    /* renamed from: b */
    public final int m146523b() {
        return this.f135889i;
    }
}

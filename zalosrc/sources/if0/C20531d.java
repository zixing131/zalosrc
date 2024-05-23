package if0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.chatrow.C11528u0;
import com.zing.zalo.p077ui.widget.C13694n1;
import com.zing.zalo.p077ui.widget.C13699o1;
import com.zing.zalo.p077ui.widget.C13704p1;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import l80.C22130e0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import ti0.C26703b;
import ti0.C26705d;
import vg.C28227x3;

/* renamed from: if0.d */
/* loaded from: classes5.dex */
public final class C20531d {
    public static final b Companion = new b(null);

    /* renamed from: g */
    private static final int f100850g = AbstractC23222t7.f112562h;

    /* renamed from: h */
    private static final InterfaceC29232g f100851h = AbstractC29233h.m145991b(C11528u0.f59384a.m62030a(), a.f100859q);

    /* renamed from: i */
    private static final Rect f100852i = new Rect();

    /* renamed from: a */
    private final View f100853a;

    /* renamed from: b */
    private final C22130e0 f100854b;

    /* renamed from: c */
    private final String f100855c;

    /* renamed from: d */
    private float f100856d;

    /* renamed from: e */
    private float f100857e;

    /* renamed from: f */
    private int f100858f;

    /* renamed from: if0.d$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f100859q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13704p1 mo12V4() {
            Context m35500c = MainApplication.Companion.m35500c();
            C13704p1 c13704p1 = new C13704p1(1);
            C26703b m137293a = C26705d.m137293a(m35500c, AbstractC2814h.t_small);
            Float m137292s = m137293a.m137292s();
            if (m137292s != null) {
                c13704p1.setTextSize(m137292s.floatValue());
            }
            C13694n1 m137282i = m137293a.m137282i();
            if (m137282i != null) {
                c13704p1.setTypeface(C13699o1.f70798a.m76486a(m35500c, m137282i.m76440b(), Integer.valueOf(m137282i.m76446h())));
            }
            c13704p1.setColor(C23212s8.m119607o(m35500c, AbstractC2807a.text_tertiary));
            return c13704p1;
        }
    }

    /* renamed from: if0.d$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C13704p1 m106682b() {
            return (C13704p1) C20531d.f100851h.getValue();
        }
    }

    public C20531d(View view) {
        AbstractC19074t.m100208f(view, "parent");
        this.f100853a = view;
        C22130e0 c22130e0 = new C22130e0(view.getContext());
        c22130e0.m115445g1(C23212s8.m119607o(c22130e0.getContext(), AbstractC2807a.icon_tertiary));
        this.f100854b = c22130e0;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_voice_to_text_processing);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        this.f100855c = m118743r0;
    }

    /* renamed from: b */
    public final void m106678b(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        float f11 = this.f100858f;
        int save = canvas.save();
        canvas.translate(0.0f, f11);
        try {
            this.f100854b.mo44775o0(canvas);
            canvas.restoreToCount(save);
            canvas.drawText(this.f100855c, this.f100856d, this.f100857e, Companion.m106682b());
            this.f100853a.invalidate();
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    /* renamed from: c */
    public final C28227x3 m106679c() {
        this.f100854b.mo44180q0(0, 0, 0, 0);
        C13704p1 m106682b = Companion.m106682b();
        String str = this.f100855c;
        int length = str.length();
        Rect rect = f100852i;
        m106682b.getTextBounds(str, 0, length, rect);
        int max = Math.max(this.f100854b.m89108M(), rect.height());
        this.f100858f = (max - this.f100854b.m89110N()) / 2;
        this.f100857e = rect.height() - rect.bottom;
        float m89110N = this.f100854b.m89110N() + f100850g;
        this.f100856d = m89110N;
        return new C28227x3((int) (m89110N + rect.width()), max);
    }
}

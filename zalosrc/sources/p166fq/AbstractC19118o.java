package p166fq;

import android.animation.AnimatorSet;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19074t;
import java.util.Locale;
import on0.AbstractC24342w;

/* renamed from: fq.o */
/* loaded from: classes4.dex */
public abstract class AbstractC19118o {

    /* renamed from: a */
    private final InterfaceC19110g f95132a;

    /* renamed from: b */
    private boolean f95133b;

    /* renamed from: c */
    private boolean f95134c;

    /* renamed from: d */
    private AnimatorSet f95135d;

    public AbstractC19118o(InterfaceC19110g interfaceC19110g, boolean z11) {
        AbstractC19074t.m100208f(interfaceC19110g, "current");
        this.f95132a = interfaceC19110g;
        this.f95133b = z11;
        this.f95134c = true;
        this.f95135d = new AnimatorSet();
    }

    /* renamed from: a */
    public abstract void mo100372a(LyricRender lyricRender);

    /* renamed from: b */
    public final void m100373b() {
        this.f95134c = false;
    }

    /* renamed from: c */
    public final boolean m100374c() {
        return this.f95133b;
    }

    /* renamed from: d */
    public final AnimatorSet m100375d() {
        return this.f95135d;
    }

    /* renamed from: e */
    public final InterfaceC19110g m100376e() {
        return this.f95132a;
    }

    /* renamed from: f */
    public final boolean m100377f() {
        return this.f95134c;
    }

    /* renamed from: g */
    public final void m100378g() {
        this.f95134c = false;
        this.f95135d.cancel();
        this.f95135d.removeAllListeners();
    }

    /* renamed from: h */
    public final void m100379h() {
        this.f95134c = true;
    }

    /* renamed from: i */
    public final void m100380i(boolean z11) {
        CharSequence m127168X0;
        String obj;
        String valueOf;
        String obj2 = this.f95132a.mo97626m().toString();
        Locale locale = Locale.ROOT;
        if (z11) {
            obj = obj2.toUpperCase(locale);
            AbstractC19074t.m100207e(obj, "toUpperCase(...)");
        } else {
            String lowerCase = obj2.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            m127168X0 = AbstractC24342w.m127168X0(lowerCase);
            obj = m127168X0.toString();
            if (obj.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = obj.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    String valueOf2 = String.valueOf(charAt);
                    AbstractC19074t.m100206d(valueOf2, "null cannot be cast to non-null type java.lang.String");
                    valueOf = valueOf2.toUpperCase(locale);
                    AbstractC19074t.m100207e(valueOf, "toUpperCase(...)");
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = obj.substring(1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                sb2.append(substring);
                obj = sb2.toString();
            }
        }
        this.f95132a.mo97624i(obj);
        this.f95133b = z11;
    }

    /* renamed from: j */
    public final void m100381j(AnimatorSet animatorSet) {
        AbstractC19074t.m100208f(animatorSet, "<set-?>");
        this.f95135d = animatorSet;
    }
}

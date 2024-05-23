package pk0;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.zing.zalo.zinstant.InterfaceC17139d;
import com.zing.zalo.zinstant.zom.model.config.DataExtrasConfig;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import nk0.AbstractC23825g0;
import nk0.InterfaceC23860v;
import ok0.InterfaceC24286c;
import ok0.InterfaceC24288e;
import ok0.InterfaceC24289f;
import org.json.JSONObject;
import qk0.InterfaceC25305a;
import qk0.InterfaceC25307c;
import qk0.InterfaceC25316l;
import uk0.C27291e;

/* renamed from: pk0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC24805d extends AbstractC24807f {

    /* renamed from: h */
    private final InterfaceC24803b f119064h = new a();

    /* renamed from: i */
    private final InterfaceC24808g f119065i = new b();

    /* renamed from: pk0.d$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC24804c {
        a() {
        }

        @Override // pk0.AbstractC24804c, pk0.InterfaceC24803b
        /* renamed from: a */
        public boolean mo128869a(AbstractC23825g0 abstractC23825g0, int i11, String str, InterfaceC24288e interfaceC24288e) {
            InterfaceC23860v zinstantHandler;
            InterfaceC24289f mo92024c;
            AbstractC19074t.m100208f(abstractC23825g0, "node");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC24288e, "callback");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null && (zinstantHandler = mo124652f.getZinstantHandler()) != null && (mo92024c = zinstantHandler.mo92024c()) != null) {
                mo92024c.mo107173b(new InterfaceC24289f.a(i11, str), interfaceC24288e);
                return true;
            }
            return false;
        }

        @Override // pk0.AbstractC24804c, pk0.InterfaceC24803b
        /* renamed from: b */
        public boolean mo128870b(AbstractC23825g0 abstractC23825g0, int i11, String str, InterfaceC24286c interfaceC24286c) {
            InterfaceC23860v zinstantHandler;
            InterfaceC24289f mo92024c;
            AbstractC19074t.m100208f(abstractC23825g0, "node");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC24286c, "animationDrawableCallback");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null && (zinstantHandler = mo124652f.getZinstantHandler()) != null && (mo92024c = zinstantHandler.mo92024c()) != null) {
                InterfaceC24289f.a aVar = new InterfaceC24289f.a(i11, str);
                aVar.m126795a(abstractC23825g0.m131007J().mWidth, abstractC23825g0.m131007J().mHeight);
                mo92024c.mo107174c(aVar, interfaceC24286c);
                return true;
            }
            return false;
        }

        @Override // pk0.AbstractC24804c, pk0.InterfaceC24803b
        /* renamed from: c */
        public boolean mo128871c(AbstractC23825g0 abstractC23825g0, String str, InterfaceC24288e interfaceC24288e, int i11, boolean z11) {
            InterfaceC23860v zinstantHandler;
            InterfaceC24289f mo92024c;
            JSONObject jSONObject;
            AbstractC19074t.m100208f(abstractC23825g0, "node");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC24288e, "bitmapCallback");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null && (zinstantHandler = mo124652f.getZinstantHandler()) != null && (mo92024c = zinstantHandler.mo92024c()) != null) {
                DataExtrasConfig dataExtrasConfig = abstractC23825g0.f115124y;
                if (dataExtrasConfig != null) {
                    jSONObject = dataExtrasConfig.mAppConfig;
                } else {
                    jSONObject = null;
                }
                mo92024c.mo107175d(str, interfaceC24288e, i11, z11, jSONObject);
                return true;
            }
            return false;
        }
    }

    /* renamed from: pk0.d$b */
    /* loaded from: classes7.dex */
    public static final class b implements InterfaceC24808g {
        b() {
        }

        @Override // pk0.InterfaceC24808g
        public void invalidate() {
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.invalidate();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            AbstractC19074t.m100208f(drawable, "who");
            invalidate();
        }

        @Override // pk0.InterfaceC24808g
        /* renamed from: o */
        public void mo128878o(AbstractC23825g0 abstractC23825g0, InterfaceC25307c.a aVar) {
            AbstractC19074t.m100208f(abstractC23825g0, "node");
            AbstractC19074t.m100208f(aVar, "callback");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.mo91516o(abstractC23825g0, aVar);
            } else {
                InterfaceC25307c.a.b.m130964a(aVar, null, 1, null);
            }
        }

        @Override // pk0.InterfaceC24808g
        public void postInvalidate() {
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.postInvalidate();
            }
        }

        @Override // pk0.InterfaceC24808g
        public void requestLayout() {
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.requestLayout();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
            AbstractC19074t.m100208f(drawable, "who");
            AbstractC19074t.m100208f(runnable, "what");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.mo91511b(drawable, runnable, j11);
            }
        }

        @Override // pk0.InterfaceC24808g
        /* renamed from: t */
        public boolean mo128879t(C27291e c27291e) {
            AbstractC19074t.m100208f(c27291e, "interaction");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                return mo124652f.mo91518t(c27291e);
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AbstractC19074t.m100208f(drawable, "who");
            AbstractC19074t.m100208f(runnable, "what");
            InterfaceC25316l mo124652f = AbstractC24805d.this.mo124652f();
            if (mo124652f != null) {
                mo124652f.m91489D(drawable, runnable);
            }
        }
    }

    @Override // pk0.AbstractC24807f, pk0.InterfaceC24806e
    /* renamed from: a */
    public InterfaceC25305a mo128873a() {
        InterfaceC25305a interfaceC25305a;
        InterfaceC23860v zinstantHandler;
        InterfaceC25316l mo124652f = mo124652f();
        if (mo124652f != null && (zinstantHandler = mo124652f.getZinstantHandler()) != null) {
            interfaceC25305a = zinstantHandler.mo92022a();
        } else {
            interfaceC25305a = null;
        }
        if (interfaceC25305a == null) {
            return super.mo128873a();
        }
        return interfaceC25305a;
    }

    @Override // pk0.AbstractC24807f, pk0.InterfaceC24806e
    /* renamed from: b */
    public InterfaceC17139d mo128874b() {
        InterfaceC17139d interfaceC17139d;
        InterfaceC23860v zinstantHandler;
        InterfaceC25316l mo124652f = mo124652f();
        if (mo124652f != null && (zinstantHandler = mo124652f.getZinstantHandler()) != null) {
            interfaceC17139d = zinstantHandler.mo92023b();
        } else {
            interfaceC17139d = null;
        }
        if (interfaceC17139d == null) {
            return super.mo128874b();
        }
        return interfaceC17139d;
    }

    @Override // pk0.AbstractC24807f
    /* renamed from: e */
    public Rect mo128875e() {
        Rect rect;
        InterfaceC25316l mo124652f = mo124652f();
        if (mo124652f != null) {
            rect = mo124652f.getVisibleRect();
        } else {
            rect = null;
        }
        if (rect == null) {
            return super.mo128875e();
        }
        return rect;
    }

    /* renamed from: f */
    public abstract InterfaceC25316l mo124652f();

    /* renamed from: g */
    public InterfaceC24808g m128876g() {
        return this.f119065i;
    }

    /* renamed from: h */
    public InterfaceC24803b m128877h() {
        return this.f119064h;
    }
}

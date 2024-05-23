package p139eq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import au.C2365p;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import e90.C18310c;
import e90.C18311d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gq.C19581d;
import l80.C22122a0;
import me0.AbstractC23265y;
import me0.C23212s8;
import me0.C23278z2;
import p041bu.C3142a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23310j;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ru.C25978a;
import ui0.C27280g;
import vg.AbstractC28236y3;

/* renamed from: eq.a */
/* loaded from: classes4.dex */
public final class C18565a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final float f93301a;

    /* renamed from: b */
    private int f93302b;

    /* renamed from: c */
    private int f93303c;

    /* renamed from: d */
    private int f93304d;

    /* renamed from: e */
    private int f93305e;

    /* renamed from: eq.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC23310j {

        /* renamed from: eq.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C32818a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32818a f93306q = new C32818a();

            C32818a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C18565a mo12V4() {
                return new C18565a(null);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C32818a.f93306q);
        }
    }

    /* renamed from: eq.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ String f93307c;

        /* renamed from: d */
        final /* synthetic */ Context f93308d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18505l f93309e;

        b(String str, Context context, InterfaceC18505l interfaceC18505l) {
            this.f93307c = str;
            this.f93308d = context;
            this.f93309e = interfaceC18505l;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            Bitmap bitmap;
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            if (c3979l != null && bitmap != null) {
                Bitmap m12381f = C2365p.m12377i(C25978a.m133807a()).m12382h(200.0f).m12381f(bitmap);
                C3142a m120703q = AbstractC23306f.m120703q();
                String str2 = this.f93307c;
                AbstractC19074t.m100205c(m12381f);
                m120703q.m15821f(str2, m12381f);
                Drawable m142198i = AbstractC28236y3.m142198i(this.f93308d, m12381f);
                if (m142198i != null) {
                    this.f93309e.mo205i9(m142198i);
                }
            }
        }
    }

    /* renamed from: eq.a$c */
    /* loaded from: classes4.dex */
    public static final class c extends C22122a0.d {

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f93311d;

        /* renamed from: eq.a$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements C18310c.a {

            /* renamed from: a */
            final /* synthetic */ C18565a f93312a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC18505l f93313b;

            a(C18565a c18565a, InterfaceC18505l interfaceC18505l) {
                this.f93312a = c18565a;
                this.f93313b = interfaceC18505l;
            }

            @Override // e90.C18310c.a
            /* renamed from: a */
            public void mo88380a(String str, C18311d c18311d) {
                GradientDrawable gradientDrawable;
                if (c18311d != null) {
                    this.f93312a.m98025m(c18311d.m97233a(2), c18311d.m97233a(4));
                    if (C23212s8.m119603k()) {
                        gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{this.f93312a.m98033l(), this.f93312a.m98031j()});
                    } else {
                        gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{this.f93312a.m98032k(), this.f93312a.m98030i()});
                    }
                    this.f93313b.mo205i9(gradientDrawable);
                }
            }
        }

        c(InterfaceC18505l interfaceC18505l) {
            this.f93311d = interfaceC18505l;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            Bitmap bitmap;
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            if (str != null && str.length() > 0 && bitmap != null) {
                C18310c.f92602a.m97230d(str, C18565a.this.f93301a, bitmap, new a(C18565a.this, this.f93311d));
            }
        }
    }

    /* renamed from: eq.a$d */
    /* loaded from: classes4.dex */
    public static final class d extends C22122a0.d {

        /* renamed from: c */
        final /* synthetic */ String f93314c;

        /* renamed from: d */
        final /* synthetic */ Context f93315d;

        /* renamed from: e */
        final /* synthetic */ Drawable f93316e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC18505l f93317f;

        d(String str, Context context, Drawable drawable, InterfaceC18505l interfaceC18505l) {
            this.f93314c = str;
            this.f93315d = context;
            this.f93316e = drawable;
            this.f93317f = interfaceC18505l;
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            Bitmap bitmap;
            Drawable drawable;
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                AbstractC23306f.m120703q().m15821f(this.f93314c, bitmap);
                drawable = AbstractC28236y3.m142198i(this.f93315d, bitmap);
            } else {
                drawable = this.f93316e;
            }
            if (drawable != null) {
                this.f93317f.mo205i9(drawable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eq.a$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f93318q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.f93318q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23528a mo12V4() {
            return new C23528a(this.f93318q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eq.a$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f93319q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.f93319q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22122a0 mo12V4() {
            return new C22122a0(this.f93319q);
        }
    }

    public /* synthetic */ C18565a(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: f */
    private static final C22122a0 m98023f(InterfaceC24854k interfaceC24854k) {
        return (C22122a0) interfaceC24854k.getValue();
    }

    /* renamed from: g */
    private static final C23528a m98024g(InterfaceC24854k interfaceC24854k) {
        return (C23528a) interfaceC24854k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m98025m(int i11, int i12) {
        this.f93302b = AbstractC23265y.m120022i(i11, 179);
        this.f93303c = AbstractC23265y.m120022i(i12, 179);
        this.f93304d = AbstractC23265y.m120022i(i11, 179);
        this.f93305e = AbstractC23265y.m120022i(i12, 179);
    }

    /* renamed from: c */
    public final void m98026c(Context context, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18505l, "onLoaded");
        Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.bg_music_feed_item_compose);
        if (m139658a != null) {
            interfaceC18505l.mo205i9(m139658a);
        }
    }

    /* renamed from: d */
    public final void m98027d(int i11, int i12, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18505l, "onLoaded");
        interfaceC18505l.mo205i9(new GradientDrawable(GradientDrawable.Orientation.TR_BL, new int[]{i11, i12}));
    }

    /* renamed from: e */
    public final void m98028e(Context context, String str, int i11, InterfaceC18505l interfaceC18505l) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC18505l, "onLoaded");
        String str2 = str + i11;
        Bitmap m15819d = AbstractC23306f.m120703q().m15819d(str2);
        if (m15819d == null || m15819d.isRecycled()) {
            m129210a = AbstractC24856m.m129210a(new f(context));
            m129210a2 = AbstractC24856m.m129210a(new e(context));
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 3) {
                        C24003n m120063C0 = C23278z2.m120063C0();
                        boolean m125696L2 = C23999j.m125696L2(str, m120063C0);
                        Drawable m139658a = C27280g.m139658a(context, C19581d.f97279a.m102497t(str));
                        if (!m125696L2 && m139658a != null) {
                            interfaceC18505l.mo205i9(m139658a);
                        }
                        m98023f(m129210a).m115381O1(m98024g(m129210a2), str, m120063C0, new d(str2, context, m139658a, interfaceC18505l));
                        return;
                    }
                    return;
                }
                m98023f(m129210a).m115381O1(m98024g(m129210a2), str, C23278z2.m120126f0(), new c(interfaceC18505l));
                return;
            }
            m98023f(m129210a).m115381O1(m98024g(m129210a2), str, C23278z2.m120126f0(), new b(str2, context, interfaceC18505l));
            return;
        }
        Object m142198i = AbstractC28236y3.m142198i(context, m15819d);
        if (m142198i != null) {
            interfaceC18505l.mo205i9(m142198i);
        }
    }

    /* renamed from: h */
    public final void m98029h(Context context, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18505l, "onLoaded");
        Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.bg_transparent);
        if (m139658a != null) {
            interfaceC18505l.mo205i9(m139658a);
        }
    }

    /* renamed from: i */
    public final int m98030i() {
        return this.f93305e;
    }

    /* renamed from: j */
    public final int m98031j() {
        return this.f93303c;
    }

    /* renamed from: k */
    public final int m98032k() {
        return this.f93304d;
    }

    /* renamed from: l */
    public final int m98033l() {
        return this.f93302b;
    }

    private C18565a() {
        this.f93301a = 0.2f;
    }
}

package p109ds;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16971e;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p691yr.C31060j;
import p691yr.C31063m;
import qm0.AbstractC25332a0;
import vl0.AbstractC28292b;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: ds.c */
/* loaded from: classes4.dex */
public final class C18064c extends C16716d {

    /* renamed from: M0 */
    private final int f91448M0;

    /* renamed from: ds.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends c {

        /* renamed from: M0 */
        private final C16716d f91449M0;

        /* renamed from: N0 */
        private final C16971e f91450N0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            C16716d c16716d = new C16716d(context);
            C16718f m89106L = c16716d.m89106L();
            int i11 = AbstractC23222t7.f112522F;
            m89106L.m89028L(i11, i11);
            this.f91449M0 = c16716d;
            c16716d.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.feed_top_reaction_info_emoji_default_background));
            C16971e c16971e = new C16971e(context, EnumC16949e.SIZE_24);
            this.f91450N0 = c16971e;
            c16971e.m89106L().m89025I(true);
            c16716d.m89001g1(c16971e);
            m89001g1(c16716d);
        }

        /* renamed from: q1 */
        public final void m96031q1(String str, C31063m.a aVar) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(aVar, "viewMode");
            this.f91450N0.m90886N1(str);
            if (aVar == C31063m.a.f143210p) {
                C16718f m89106L = this.f91449M0.m89106L();
                int i11 = AbstractC23222t7.f112514B;
                m89106L.m89028L(i11, i11);
                m96033o1(this.f91449M0, AbstractC23136l9.m118641B(getContext(), AbstractC28292b.ng80));
                m96034p1(this.f91449M0, 0, Color.parseColor("#0D0D0D"));
                return;
            }
            if (aVar == C31063m.a.f143214t) {
                m96034p1(this.f91449M0, AbstractC23222t7.f112552c, C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
            }
        }
    }

    /* renamed from: ds.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends c {

        /* renamed from: M0 */
        private final C16716d f91451M0;

        /* renamed from: N0 */
        private final C21693c f91452N0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            C16716d c16716d = new C16716d(context);
            C16718f m89106L = c16716d.m89106L();
            int i11 = AbstractC23222t7.f112522F;
            m89106L.m89028L(i11, i11).m89041Y(AbstractC23222t7.f112552c);
            this.f91451M0 = c16716d;
            c16716d.m89085A0(AbstractC23136l9.m118665N(context, AbstractC16803z.feed_top_reaction_info_emoji_default_background));
            C21693c c21693c = new C21693c(context);
            c21693c.m111929z1(6);
            C16718f m89106L2 = c21693c.m89106L();
            int i12 = AbstractC23222t7.f112582r;
            m89106L2.m89028L(i12, i12).m89025I(true);
            this.f91452N0 = c21693c;
            c16716d.m89001g1(c21693c);
            m89001g1(c16716d);
        }

        /* renamed from: q1 */
        public final void m96032q1(int i11, C31063m.a aVar) {
            AbstractC19074t.m100208f(aVar, "viewMode");
            C21693c c21693c = this.f91452N0;
            C31060j c31060j = C31060j.f143193a;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            c21693c.mo111925v1(C31060j.m150906E(c31060j, i11, context, null, 4, null));
            if (aVar == C31063m.a.f143210p) {
                C16718f m89106L = this.f91451M0.m89106L();
                int i12 = AbstractC23222t7.f112514B;
                m89106L.m89028L(i12, i12);
                m96033o1(this.f91451M0, AbstractC23136l9.m118641B(getContext(), AbstractC28292b.ng80));
                m96034p1(this.f91451M0, 0, Color.parseColor("#0D0D0D"));
                return;
            }
            if (aVar == C31063m.a.f143214t) {
                m96034p1(this.f91451M0, AbstractC23222t7.f112552c, C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor));
            }
        }
    }

    /* renamed from: ds.c$c */
    /* loaded from: classes4.dex */
    public static abstract class c extends C16716d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
        }

        /* renamed from: o1 */
        public final void m96033o1(C16719g c16719g, int i11) {
            AbstractC19074t.m100208f(c16719g, "view");
            Drawable mutate = c16719g.m89094F().mutate();
            AbstractC19074t.m100207e(mutate, "mutate(...)");
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setColor(i11);
            }
        }

        /* renamed from: p1 */
        public final void m96034p1(C16719g c16719g, int i11, int i12) {
            AbstractC19074t.m100208f(c16719g, "view");
            Drawable mutate = c16719g.m89094F().mutate();
            AbstractC19074t.m100207e(mutate, "mutate(...)");
            if (mutate instanceof GradientDrawable) {
                ((GradientDrawable) mutate).setStroke(i11, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ds.c$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: p */
        public static final d f91453p = new d("AVATAR", 0);

        /* renamed from: q */
        public static final d f91454q = new d("EMOJI", 1);

        /* renamed from: r */
        private static final /* synthetic */ d[] f91455r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f91456s;

        static {
            d[] m96035b = m96035b();
            f91455r = m96035b;
            f91456s = AbstractC30166b.m148796a(m96035b);
        }

        private d(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ d[] m96035b() {
            return new d[]{f91453p, f91454q};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f91455r.clone();
        }
    }

    /* renamed from: ds.c$e */
    /* loaded from: classes4.dex */
    public static abstract class e {

        /* renamed from: a */
        private final d f91457a;

        public e(d dVar) {
            AbstractC19074t.m100208f(dVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f91457a = dVar;
        }
    }

    /* renamed from: ds.c$f */
    /* loaded from: classes4.dex */
    public static final class f extends e {

        /* renamed from: b */
        private final ContactProfile f91458b;

        /* renamed from: c */
        private final C31063m.a f91459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ContactProfile contactProfile, C31063m.a aVar) {
            super(d.f91453p);
            AbstractC19074t.m100208f(contactProfile, "contactProfile");
            AbstractC19074t.m100208f(aVar, "viewMode");
            this.f91458b = contactProfile;
            this.f91459c = aVar;
        }

        /* renamed from: a */
        public final ContactProfile m96036a() {
            return this.f91458b;
        }

        /* renamed from: b */
        public final C31063m.a m96037b() {
            return this.f91459c;
        }
    }

    /* renamed from: ds.c$g */
    /* loaded from: classes4.dex */
    public static final class g extends e {

        /* renamed from: b */
        private final int f91460b;

        /* renamed from: c */
        private final C31063m.a f91461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i11, C31063m.a aVar) {
            super(d.f91454q);
            AbstractC19074t.m100208f(aVar, "viewMode");
            this.f91460b = i11;
            this.f91461c = aVar;
        }

        /* renamed from: a */
        public final int m96038a() {
            return this.f91460b;
        }

        /* renamed from: b */
        public final C31063m.a m96039b() {
            return this.f91461c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18064c(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f91448M0 = C31060j.f143193a.m150948w();
    }

    /* renamed from: o1 */
    private final void m96029o1(List list) {
        List m131179G0;
        List<C16719g> m131225y0;
        List m131225y02;
        m89003j1();
        m131179G0 = AbstractC25332a0.m131179G0(list, this.f91448M0);
        ArrayList arrayList = new ArrayList();
        int size = m131179G0.size();
        for (int i11 = 0; i11 < size; i11++) {
            e eVar = (e) m131179G0.get(i11);
            if (eVar instanceof f) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                a aVar = new a(context);
                aVar.m89106L().m89028L(-2, -2);
                f fVar = (f) eVar;
                String str = fVar.m96036a().f42446v;
                if (str != null && str.length() != 0) {
                    String str2 = fVar.m96036a().f42446v;
                    AbstractC19074t.m100207e(str2, "avt");
                    aVar.m96031q1(str2, fVar.m96037b());
                    arrayList.add(aVar);
                }
            } else if (eVar instanceof g) {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                b bVar = new b(context2);
                bVar.m89106L().m89028L(-2, -2);
                g gVar = (g) eVar;
                bVar.m96032q1(gVar.m96038a(), gVar.m96039b());
                arrayList.add(bVar);
            }
        }
        m131225y0 = AbstractC25332a0.m131225y0(arrayList);
        C16719g c16719g = null;
        for (C16719g c16719g2 : m131225y0) {
            if (c16719g != null) {
                c16719g2.m89106L().m89049e0(c16719g).m89035S(AbstractC23222t7.f112562h * (-1));
            }
            c16719g = c16719g2;
        }
        m131225y02 = AbstractC25332a0.m131225y0(arrayList);
        m89002h1(m131225y02);
    }

    /* renamed from: p1 */
    public final void m96030p1(List list) {
        AbstractC19074t.m100208f(list, "items");
        m96029o1(list);
    }
}

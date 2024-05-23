package p425po;

import bo.InterfaceC3058y;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import p425po.AbstractC24888j;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: po.f */
/* loaded from: classes4.dex */
public abstract class AbstractC24884f extends AbstractC24888j {

    /* renamed from: e */
    private final String f119388e;

    /* renamed from: f */
    private final String f119389f;

    /* renamed from: g */
    private final AbstractC24888j.a f119390g;

    /* renamed from: h */
    private c f119391h;

    /* renamed from: i */
    private final String f119392i;

    /* renamed from: po.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3058y {

        /* renamed from: a */
        private final AbstractC24884f f119393a;

        public a(AbstractC24884f abstractC24884f) {
            AbstractC19074t.m100208f(abstractC24884f, "data");
            this.f119393a = abstractC24884f;
        }

        /* renamed from: a */
        public final AbstractC24884f m129396a() {
            return this.f119393a;
        }
    }

    /* renamed from: po.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC3058y {

        /* renamed from: a */
        private final AbstractC24884f f119394a;

        public b(AbstractC24884f abstractC24884f) {
            AbstractC19074t.m100208f(abstractC24884f, "data");
            this.f119394a = abstractC24884f;
        }

        /* renamed from: a */
        public final AbstractC24884f m129397a() {
            return this.f119394a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: po.f$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: p */
        public static final c f119395p = new c("NORMAL", 0);

        /* renamed from: q */
        public static final c f119396q = new c("EXPAND", 1);

        /* renamed from: r */
        public static final c f119397r = new c("COLLAPSE", 2);

        /* renamed from: s */
        private static final /* synthetic */ c[] f119398s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f119399t;

        static {
            c[] m129398b = m129398b();
            f119398s = m129398b;
            f119399t = AbstractC30166b.m148796a(m129398b);
        }

        private c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m129398b() {
            return new c[]{f119395p, f119396q, f119397r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f119398s.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC24884f(String str, String str2, AbstractC24888j.a aVar, c cVar, String str3) {
        super(str, aVar, str3);
        AbstractC19074t.m100208f(str, "title");
        AbstractC19074t.m100208f(str2, ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
        AbstractC19074t.m100208f(aVar, "sectionType");
        AbstractC19074t.m100208f(cVar, "expandableState");
        AbstractC19074t.m100208f(str3, "tag");
        this.f119388e = str;
        this.f119389f = str2;
        this.f119390g = aVar;
        this.f119391h = cVar;
        this.f119392i = str3;
    }

    @Override // p425po.AbstractC24888j
    /* renamed from: b */
    public AbstractC24888j.a mo129391b() {
        return this.f119390g;
    }

    @Override // p425po.AbstractC24888j
    /* renamed from: c */
    public abstract String mo129392c();

    /* renamed from: e */
    public abstract c mo129393e();

    /* renamed from: f */
    public abstract String mo129394f();

    /* renamed from: g */
    public abstract void mo129395g(c cVar);
}

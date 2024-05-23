package p578vk;

import ai.C0862b;
import ai.InterfaceC0861a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p612wk.AbstractC29076h;
import p716zh.C31862c;
import p716zh.C32058p1;
import tk.InterfaceC26722a;

/* renamed from: vk.a */
/* loaded from: classes3.dex */
public abstract class AbstractC28275a implements InterfaceC26722a {

    /* renamed from: vk.a$a */
    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: vk.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C33013a implements a {

            /* renamed from: a */
            public static final C33013a f131882a = new C33013a();

            private C33013a() {
            }
        }

        /* renamed from: vk.a$a$b */
        /* loaded from: classes3.dex */
        public static final class b implements a {

            /* renamed from: a */
            public static final b f131883a = new b();

            private b() {
            }
        }
    }

    /* renamed from: vk.a$a0 */
    /* loaded from: classes3.dex */
    public static final class a0 extends AbstractC28275a {

        /* renamed from: a */
        private final C17244x0 f131884a;

        /* renamed from: b */
        private final String f131885b;

        /* renamed from: c */
        private final String f131886c;

        /* renamed from: d */
        private final List f131887d;

        /* renamed from: e */
        private final List f131888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(C17244x0 c17244x0, String str, String str2, List list, List list2) {
            super(null);
            AbstractC19074t.m100208f(list, "keywordList");
            AbstractC19074t.m100208f(list2, "oaList");
            this.f131884a = c17244x0;
            this.f131885b = str;
            this.f131886c = str2;
            this.f131887d = list;
            this.f131888e = list2;
        }

        /* renamed from: a */
        public final C17244x0 m142466a() {
            return this.f131884a;
        }

        /* renamed from: b */
        public final String m142467b() {
            return this.f131885b;
        }

        /* renamed from: c */
        public final String m142468c() {
            return this.f131886c;
        }

        /* renamed from: d */
        public final List m142469d() {
            return this.f131888e;
        }
    }

    /* renamed from: vk.a$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends c {

        /* renamed from: e */
        private j f131889e;

        /* renamed from: f */
        private final C32058p1 f131890f;

        public /* synthetic */ b(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar, AbstractC19060k abstractC19060k) {
            this(interfaceC0861a, charSequence, str, jVar, c32058p1, aVar);
        }

        /* renamed from: e */
        public final C32058p1 m142470e() {
            return this.f131890f;
        }

        /* renamed from: f */
        public final j m142471f() {
            return this.f131889e;
        }

        /* renamed from: g */
        public final void m142472g(j jVar) {
            AbstractC19074t.m100208f(jVar, "<set-?>");
            this.f131889e = jVar;
        }

        private b(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar) {
            super(interfaceC0861a, charSequence, str, aVar, null);
            this.f131889e = jVar;
            this.f131890f = c32058p1;
        }
    }

    /* renamed from: vk.a$c */
    /* loaded from: classes3.dex */
    public static abstract class c extends AbstractC28275a {

        /* renamed from: a */
        private final InterfaceC0861a f131891a;

        /* renamed from: b */
        private final CharSequence f131892b;

        /* renamed from: c */
        private final String f131893c;

        /* renamed from: d */
        private final a f131894d;

        public /* synthetic */ c(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, a aVar, AbstractC19060k abstractC19060k) {
            this(interfaceC0861a, charSequence, str, aVar);
        }

        /* renamed from: a */
        public final a m142473a() {
            return this.f131894d;
        }

        /* renamed from: b */
        public final String m142474b() {
            return this.f131893c;
        }

        /* renamed from: c */
        public final InterfaceC0861a m142475c() {
            return this.f131891a;
        }

        /* renamed from: d */
        public final CharSequence m142476d() {
            return this.f131892b;
        }

        private c(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, a aVar) {
            super(null);
            this.f131891a = interfaceC0861a;
            this.f131892b = charSequence;
            this.f131893c = str;
            this.f131894d = aVar;
        }
    }

    /* renamed from: vk.a$d */
    /* loaded from: classes3.dex */
    public static final class d extends c {

        /* renamed from: e */
        private final j f131895e;

        /* renamed from: f */
        private final int f131896f;

        /* renamed from: g */
        private boolean f131897g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, int i11, boolean z11, a aVar) {
            super(interfaceC0861a, charSequence, str, aVar, null);
            AbstractC19074t.m100208f(interfaceC0861a, "data");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(str, "avt");
            AbstractC19074t.m100208f(jVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(aVar, "avatarType");
            this.f131895e = jVar;
            this.f131896f = i11;
            this.f131897g = z11;
        }

        /* renamed from: e */
        public final int m142477e() {
            return this.f131896f;
        }

        /* renamed from: f */
        public final j m142478f() {
            return this.f131895e;
        }

        /* renamed from: g */
        public final boolean m142479g() {
            return this.f131897g;
        }

        /* renamed from: h */
        public final void m142480h(boolean z11) {
            this.f131897g = z11;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ d(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, int i11, boolean z11, a aVar, int i12, AbstractC19060k abstractC19060k) {
            this(interfaceC0861a, charSequence, str, jVar, i11, z11, r8);
            a aVar2;
            if ((i12 & 64) != 0) {
                aVar2 = !(interfaceC0861a instanceof C0862b) ? a.C33013a.f131882a : a.b.f131883a;
            } else {
                aVar2 = aVar;
            }
        }
    }

    /* renamed from: vk.a$e */
    /* loaded from: classes3.dex */
    public static abstract class e extends AbstractC28275a {

        /* renamed from: a */
        private final int f131898a;

        /* renamed from: b */
        private final int f131899b;

        /* renamed from: vk.a$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends e {

            /* renamed from: c */
            public static final a f131900c = new a();

            private a() {
                super(AbstractC16803z.illus_emptystate_list, AbstractC8020f0.str_empty_contact_result, null);
            }
        }

        /* renamed from: vk.a$e$b */
        /* loaded from: classes3.dex */
        public static final class b extends e {

            /* renamed from: c */
            public static final b f131901c = new b();

            private b() {
                super(AbstractC16803z.illus_emptystate_list, AbstractC8020f0.str_search_global_pre_state_no_search_history, null);
            }
        }

        /* renamed from: vk.a$e$c */
        /* loaded from: classes3.dex */
        public static final class c extends e {

            /* renamed from: c */
            public static final c f131902c = new c();

            private c() {
                super(AbstractC16803z.ic_gs_off_history, AbstractC8020f0.str_search_global_pre_state_empty_off_history, null);
            }
        }

        public /* synthetic */ e(int i11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, i12);
        }

        /* renamed from: a */
        public final int m142481a() {
            return this.f131898a;
        }

        /* renamed from: b */
        public final int m142482b() {
            return this.f131899b;
        }

        private e(int i11, int i12) {
            super(null);
            this.f131898a = i11;
            this.f131899b = i12;
        }
    }

    /* renamed from: vk.a$f */
    /* loaded from: classes3.dex */
    public interface f {

        /* renamed from: vk.a$f$a */
        /* loaded from: classes3.dex */
        public static final class a implements f {

            /* renamed from: a */
            public static final a f131903a = new a();

            private a() {
            }
        }

        /* renamed from: vk.a$f$b */
        /* loaded from: classes3.dex */
        public static final class b implements f {

            /* renamed from: a */
            public static final b f131904a = new b();

            private b() {
            }
        }

        /* renamed from: vk.a$f$c */
        /* loaded from: classes3.dex */
        public static final class c implements f {

            /* renamed from: a */
            public static final c f131905a = new c();

            private c() {
            }
        }

        /* renamed from: vk.a$f$d */
        /* loaded from: classes3.dex */
        public static final class d implements f {

            /* renamed from: a */
            public static final d f131906a = new d();

            private d() {
            }
        }

        /* renamed from: vk.a$f$e */
        /* loaded from: classes3.dex */
        public static final class e implements f {

            /* renamed from: a */
            public static final e f131907a = new e();

            private e() {
            }
        }
    }

    /* renamed from: vk.a$g */
    /* loaded from: classes3.dex */
    public static final class g extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar) {
            super(interfaceC0861a, charSequence, str, jVar, c32058p1, aVar, null);
            AbstractC19074t.m100208f(interfaceC0861a, "data");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(str, "avt");
            AbstractC19074t.m100208f(jVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(aVar, "avatarType");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ g(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar, int i11, AbstractC19060k abstractC19060k) {
            this(interfaceC0861a, charSequence, str, r4, r5, aVar);
            j jVar2 = (i11 & 8) != 0 ? j.a.f131918a : jVar;
            C32058p1 c32058p12 = (i11 & 16) != 0 ? null : c32058p1;
            if ((i11 & 32) != 0) {
                aVar = !(interfaceC0861a instanceof C0862b) ? a.C33013a.f131882a : a.b.f131883a;
            }
        }
    }

    /* renamed from: vk.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC28275a {

        /* renamed from: a */
        private final String f131908a;

        /* renamed from: b */
        private final CharSequence f131909b;

        /* renamed from: c */
        private j f131910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, CharSequence charSequence, j jVar) {
            super(null);
            AbstractC19074t.m100208f(str, "data");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(jVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f131908a = str;
            this.f131909b = charSequence;
            this.f131910c = jVar;
        }

        /* renamed from: a */
        public final String m142483a() {
            return this.f131908a;
        }

        /* renamed from: b */
        public final CharSequence m142484b() {
            return this.f131909b;
        }

        /* renamed from: c */
        public final j m142485c() {
            return this.f131910c;
        }

        /* renamed from: d */
        public final void m142486d(j jVar) {
            AbstractC19074t.m100208f(jVar, "<set-?>");
            this.f131910c = jVar;
        }

        public /* synthetic */ h(String str, CharSequence charSequence, j jVar, int i11, AbstractC19060k abstractC19060k) {
            this(str, charSequence, (i11 & 4) != 0 ? j.a.f131918a : jVar);
        }
    }

    /* renamed from: vk.a$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC28275a {

        /* renamed from: a */
        private final List f131911a;

        /* renamed from: b */
        private final l f131912b;

        /* renamed from: c */
        private final int f131913c;

        /* renamed from: d */
        private final int f131914d;

        /* renamed from: e */
        private final int f131915e;

        /* renamed from: f */
        private final int f131916f;

        /* renamed from: g */
        private boolean f131917g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List list, l lVar, int i11, int i12, int i13, int i14, boolean z11) {
            super(null);
            AbstractC19074t.m100208f(list, "data");
            AbstractC19074t.m100208f(lVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f131911a = list;
            this.f131912b = lVar;
            this.f131913c = i11;
            this.f131914d = i12;
            this.f131915e = i13;
            this.f131916f = i14;
            this.f131917g = z11;
        }

        /* renamed from: a */
        public final List m142487a() {
            return this.f131911a;
        }

        /* renamed from: b */
        public final int m142488b() {
            return this.f131916f;
        }

        /* renamed from: c */
        public final int m142489c() {
            return this.f131913c;
        }

        /* renamed from: d */
        public final int m142490d() {
            return this.f131915e;
        }

        /* renamed from: e */
        public final int m142491e() {
            return this.f131914d;
        }

        /* renamed from: f */
        public final l m142492f() {
            return this.f131912b;
        }

        /* renamed from: g */
        public final boolean m142493g() {
            return this.f131917g;
        }

        /* renamed from: h */
        public final void m142494h(boolean z11) {
            this.f131917g = z11;
        }

        public /* synthetic */ i(List list, l lVar, int i11, int i12, int i13, int i14, boolean z11, int i15, AbstractC19060k abstractC19060k) {
            this(list, lVar, (i15 & 4) != 0 ? 0 : i11, (i15 & 8) != 0 ? 0 : i12, (i15 & 16) != 0 ? 0 : i13, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? false : z11);
        }
    }

    /* renamed from: vk.a$j */
    /* loaded from: classes3.dex */
    public interface j {

        /* renamed from: vk.a$j$a */
        /* loaded from: classes3.dex */
        public static final class a implements j {

            /* renamed from: a */
            public static final a f131918a = new a();

            private a() {
            }
        }

        /* renamed from: vk.a$j$b */
        /* loaded from: classes3.dex */
        public static final class b implements j {

            /* renamed from: a */
            public static final b f131919a = new b();

            private b() {
            }
        }

        /* renamed from: vk.a$j$c */
        /* loaded from: classes3.dex */
        public static final class c implements j {

            /* renamed from: a */
            public static final c f131920a = new c();

            private c() {
            }
        }
    }

    /* renamed from: vk.a$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC28275a {

        /* renamed from: a */
        private final CharSequence f131921a;

        /* renamed from: b */
        private final f f131922b;

        /* renamed from: c */
        private final int f131923c;

        /* renamed from: d */
        private final int f131924d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(CharSequence charSequence, f fVar, int i11, int i12) {
            super(null);
            AbstractC19074t.m100208f(charSequence, "data");
            AbstractC19074t.m100208f(fVar, "typeFunction");
            this.f131921a = charSequence;
            this.f131922b = fVar;
            this.f131923c = i11;
            this.f131924d = i12;
        }

        /* renamed from: a */
        public final CharSequence m142495a() {
            return this.f131921a;
        }

        /* renamed from: b */
        public final int m142496b() {
            return this.f131924d;
        }

        /* renamed from: c */
        public final int m142497c() {
            return this.f131923c;
        }

        /* renamed from: d */
        public final f m142498d() {
            return this.f131922b;
        }
    }

    /* renamed from: vk.a$l */
    /* loaded from: classes3.dex */
    public interface l {

        /* renamed from: vk.a$l$a */
        /* loaded from: classes3.dex */
        public static final class a implements l {

            /* renamed from: a */
            public static final a f131925a = new a();

            private a() {
            }
        }

        /* renamed from: vk.a$l$b */
        /* loaded from: classes3.dex */
        public static final class b implements l {

            /* renamed from: a */
            public static final b f131926a = new b();

            private b() {
            }
        }
    }

    /* renamed from: vk.a$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC28275a {

        /* renamed from: a */
        public static final m f131927a = new m();

        private m() {
            super(null);
        }
    }

    /* renamed from: vk.a$n */
    /* loaded from: classes3.dex */
    public static final class n extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar) {
            super(interfaceC0861a, charSequence, str, jVar, c32058p1, aVar, null);
            AbstractC19074t.m100208f(interfaceC0861a, "data");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(str, "avt");
            AbstractC19074t.m100208f(jVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(aVar, "avatarType");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ n(InterfaceC0861a interfaceC0861a, CharSequence charSequence, String str, j jVar, C32058p1 c32058p1, a aVar, int i11, AbstractC19060k abstractC19060k) {
            this(interfaceC0861a, charSequence, str, r4, r5, aVar);
            j jVar2 = (i11 & 8) != 0 ? j.a.f131918a : jVar;
            C32058p1 c32058p12 = (i11 & 16) != 0 ? null : c32058p1;
            if ((i11 & 32) != 0) {
                aVar = !(interfaceC0861a instanceof C0862b) ? a.C33013a.f131882a : a.b.f131883a;
            }
        }
    }

    /* renamed from: vk.a$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC28275a {

        /* renamed from: a */
        private final AbstractC29076h f131928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(AbstractC29076h abstractC29076h) {
            super(null);
            AbstractC19074t.m100208f(abstractC29076h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f131928a = abstractC29076h;
        }

        /* renamed from: a */
        public final AbstractC29076h m142499a() {
            return this.f131928a;
        }
    }

    /* renamed from: vk.a$p */
    /* loaded from: classes3.dex */
    public static final class p extends q {
        public p(int i11) {
            super(i11, 0, null);
        }
    }

    /* renamed from: vk.a$q */
    /* loaded from: classes3.dex */
    public static abstract class q extends AbstractC28275a {

        /* renamed from: a */
        private final int f131929a;

        /* renamed from: b */
        private final int f131930b;

        public /* synthetic */ q(int i11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, i12);
        }

        /* renamed from: a */
        public final int m142500a() {
            return this.f131929a;
        }

        /* renamed from: b */
        public final int m142501b() {
            return this.f131930b;
        }

        private q(int i11, int i12) {
            super(null);
            this.f131929a = i11;
            this.f131930b = i12;
        }
    }

    /* renamed from: vk.a$r */
    /* loaded from: classes3.dex */
    public static final class r extends q {
        public r(int i11) {
            super(i11, 4, null);
        }
    }

    /* renamed from: vk.a$s */
    /* loaded from: classes3.dex */
    public static final class s extends q {
        public s(int i11) {
            super(i11, 3, null);
        }
    }

    /* renamed from: vk.a$t */
    /* loaded from: classes3.dex */
    public static final class t extends q {
        public t(int i11) {
            super(i11, 2, null);
        }
    }

    /* renamed from: vk.a$u */
    /* loaded from: classes3.dex */
    public static abstract class u extends AbstractC28275a {

        /* renamed from: a */
        private final int f131931a;

        /* renamed from: b */
        private final int f131932b;

        public /* synthetic */ u(int i11, int i12, AbstractC19060k abstractC19060k) {
            this(i11, i12);
        }

        /* renamed from: a */
        public final int m142502a() {
            return this.f131932b;
        }

        /* renamed from: b */
        public final int m142503b() {
            return this.f131931a;
        }

        private u(int i11, int i12) {
            super(null);
            this.f131931a = i11;
            this.f131932b = i12;
        }
    }

    /* renamed from: vk.a$v */
    /* loaded from: classes3.dex */
    public static final class v extends u {

        /* renamed from: c */
        public static final v f131933c = new v();

        private v() {
            super(AbstractC8020f0.str_add, AbstractC16803z.ic_gs_add_quick_access, null);
        }
    }

    /* renamed from: vk.a$w */
    /* loaded from: classes3.dex */
    public static final class w extends u {

        /* renamed from: c */
        public static final w f131934c = new w();

        private w() {
            super(AbstractC8020f0.str_action_edit, AbstractC16803z.ic_gs_edit_quick_access, null);
        }
    }

    /* renamed from: vk.a$x */
    /* loaded from: classes3.dex */
    public static final class x extends AbstractC28275a {

        /* renamed from: a */
        private final boolean f131935a;

        /* renamed from: b */
        private final y f131936b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(boolean z11, y yVar) {
            super(null);
            AbstractC19074t.m100208f(yVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f131935a = z11;
            this.f131936b = yVar;
        }

        /* renamed from: a */
        public final y m142504a() {
            return this.f131936b;
        }

        /* renamed from: b */
        public final boolean m142505b() {
            return this.f131935a;
        }
    }

    /* renamed from: vk.a$y */
    /* loaded from: classes3.dex */
    public static abstract class y {

        /* renamed from: a */
        private final int f131937a;

        /* renamed from: vk.a$y$a */
        /* loaded from: classes3.dex */
        public static final class a extends y {

            /* renamed from: b */
            public static final a f131938b = new a();

            private a() {
                super(AbstractC8020f0.str_search_global_pre_state_save_searched_contacts, null);
            }
        }

        /* renamed from: vk.a$y$b */
        /* loaded from: classes3.dex */
        public static final class b extends y {

            /* renamed from: b */
            public static final b f131939b = new b();

            private b() {
                super(AbstractC8020f0.str_search_global_pre_state_save_searched_queries, null);
            }
        }

        /* renamed from: vk.a$y$c */
        /* loaded from: classes3.dex */
        public static final class c extends y {

            /* renamed from: b */
            public static final c f131940b = new c();

            private c() {
                super(AbstractC8020f0.str_search_global_pre_state_show_quick_access, null);
            }
        }

        public /* synthetic */ y(int i11, AbstractC19060k abstractC19060k) {
            this(i11);
        }

        /* renamed from: a */
        public final int m142506a() {
            return this.f131937a;
        }

        private y(int i11) {
            this.f131937a = i11;
        }
    }

    /* renamed from: vk.a$z */
    /* loaded from: classes3.dex */
    public static final class z extends AbstractC28275a {

        /* renamed from: a */
        private final C31862c f131941a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(C31862c c31862c) {
            super(null);
            AbstractC19074t.m100208f(c31862c, "data");
            this.f131941a = c31862c;
        }

        /* renamed from: a */
        public final C31862c m142507a() {
            return this.f131941a;
        }
    }

    private AbstractC28275a() {
    }

    public /* synthetic */ AbstractC28275a(AbstractC19060k abstractC19060k) {
        this();
    }
}

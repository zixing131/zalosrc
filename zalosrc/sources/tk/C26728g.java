package tk;

import android.text.SpannableStringBuilder;
import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: tk.g */
/* loaded from: classes3.dex */
public final class C26728g {

    /* renamed from: a */
    private final InterfaceC24854k f126758a;

    /* renamed from: b */
    private final InterfaceC24854k f126759b;

    /* renamed from: c */
    private final InterfaceC24854k f126760c;

    /* renamed from: d */
    private final C26727f f126761d;

    /* renamed from: tk.g$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f126762q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26727f mo12V4() {
            return new C26727f(AbstractC8020f0.str_search_global_have_sent_friend_invitation, null, 2, null);
        }
    }

    /* renamed from: tk.g$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f126763q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26727f mo12V4() {
            return new C26727f(AbstractC8020f0.str_strangers_in_phone_book, null, 2, null);
        }
    }

    /* renamed from: tk.g$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f126764q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C26727f mo12V4() {
            return new C26727f(AbstractC8020f0.str_search_global_want_to_be_friend, null, 2, null);
        }
    }

    public C26728g() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(a.f126762q);
        this.f126758a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f126764q);
        this.f126759b = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(b.f126763q);
        this.f126760c = m129210a3;
        this.f126761d = new C26727f(0, new SpannableStringBuilder());
    }

    /* renamed from: a */
    public final C26727f m137465a(String str) {
        AbstractC19074t.m100208f(str, "groupName");
        int i11 = AbstractC8020f0.str_des_stranger_in_group;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_stranger_in_group);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        return new C26727f(i11, new SpannableStringBuilder(format));
    }

    /* renamed from: b */
    public final C26727f m137466b() {
        return this.f126761d;
    }

    /* renamed from: c */
    public final C26727f m137467c() {
        return (C26727f) this.f126758a.getValue();
    }

    /* renamed from: d */
    public final C26727f m137468d() {
        return (C26727f) this.f126760c.getValue();
    }

    /* renamed from: e */
    public final C26727f m137469e() {
        return (C26727f) this.f126759b.getValue();
    }
}

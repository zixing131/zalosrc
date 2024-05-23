package z10;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.Iterator;
import java.util.List;
import mj0.AbstractC23322a;
import p338m2.InterfaceC22715a;
import pm0.C24848g0;
import q10.C24984a0;
import qm0.AbstractC25358n;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import u20.C26980a;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27411f;
import v00.AbstractC27413h;
import v00.C27417l;
import z10.C31155b0;

/* renamed from: z10.c0 */
/* loaded from: classes5.dex */
public final class C31157c0 extends AbstractC31153a0 {

    /* renamed from: u */
    private Section f143657u;

    /* renamed from: v */
    private a f143658v;

    /* renamed from: w */
    private final Channel f143659w;

    /* renamed from: z10.c0$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54774a(LoadMoreInfo loadMoreInfo);

        /* renamed from: b */
        void mo54775b(Channel channel);

        /* renamed from: c */
        void mo54776c(Channel channel, boolean z11);
    }

    /* renamed from: z10.c0$b */
    /* loaded from: classes5.dex */
    public final class b extends C31155b0.a {

        /* renamed from: I */
        private final C24984a0 f143660I;

        /* renamed from: J */
        final /* synthetic */ C31157c0 f143661J;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(C31157c0 c31157c0, C24984a0 c24984a0) {
            super(r2);
            AbstractC19074t.m100208f(c24984a0, "binding");
            this.f143661J = c31157c0;
            LinearLayout root = c24984a0.getRoot();
            AbstractC19074t.m100207e(root, "getRoot(...)");
            this.f143660I = c24984a0;
        }

        @Override // z10.C31155b0.a
        /* renamed from: i0 */
        public void mo151476i0(Object obj) {
            Channel channel;
            long m50782t;
            AbstractC19074t.m100208f(obj, "data");
            String str = null;
            if (obj instanceof Channel) {
                channel = (Channel) obj;
            } else {
                channel = null;
            }
            if (channel != null) {
                C31157c0 c31157c0 = this.f143661J;
                this.f7784p.setTag(channel);
                this.f143660I.f119712r.setAvatar(channel);
                this.f143660I.f119714t.setText(channel.m50775o());
                this.f143660I.f119714t.setVerifiedIcon(channel.m50725F());
                String m50752b = channel.m50752b();
                if (m50752b != null && m50752b.length() != 0) {
                    this.f143660I.f119713s.setText(channel.m50752b());
                    EllipsizedTextView ellipsizedTextView = this.f143660I.f119713s;
                    AbstractC19074t.m100207e(ellipsizedTextView, "tvAlias");
                    AbstractC26112n.m134431w0(ellipsizedTextView);
                } else {
                    this.f143660I.f119713s.setText("");
                    EllipsizedTextView ellipsizedTextView2 = this.f143660I.f119713s;
                    AbstractC19074t.m100207e(ellipsizedTextView2, "tvAlias");
                    AbstractC26112n.m134367H(ellipsizedTextView2);
                }
                long j11 = 0;
                if (channel.m50782t() <= 0) {
                    m50782t = 0;
                } else {
                    m50782t = channel.m50782t();
                }
                if (channel.m50777p() > 0) {
                    j11 = channel.m50777p();
                }
                View view = this.f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                String m134363D = AbstractC26112n.m134363D(view, AbstractC27411f.zch_page_search_item_channel_stats_video, m50782t, AbstractC26105g.m134334a(channel.m50782t()));
                View view2 = this.f7784p;
                AbstractC19074t.m100207e(view2, "itemView");
                this.f143660I.f119715u.setText(m134363D + AbstractC26112n.m134363D(view2, AbstractC27411f.zch_page_search_item_channel_stats_follower, j11, AbstractC26105g.m134334a(channel.m50777p())));
                Channel m151511U = c31157c0.m151511U();
                if (m151511U != null) {
                    str = m151511U.m50769l();
                }
                if (AbstractC19074t.m100204b(str, channel.m50769l())) {
                    RobotoButton robotoButton = this.f143660I.f119711q;
                    AbstractC19074t.m100207e(robotoButton, "btnFollow");
                    AbstractC26112n.m134367H(robotoButton);
                } else {
                    RobotoButton robotoButton2 = this.f143660I.f119711q;
                    AbstractC19074t.m100207e(robotoButton2, "btnFollow");
                    AbstractC26112n.m134431w0(robotoButton2);
                }
                m151519k0(channel);
            }
        }

        /* renamed from: k0 */
        public final void m151519k0(Channel channel) {
            if (channel == null) {
                return;
            }
            if (channel.m50741Q()) {
                RobotoButton robotoButton = this.f143660I.f119711q;
                SpannableString spannableString = new SpannableString(" ");
                Context context = this.f7784p.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                spannableString.setSpan(new C26980a(context, AbstractC23322a.zch_ic_check_solid_16, 0, 4, null), 0, 1, 17);
                robotoButton.setText(spannableString);
                this.f143660I.f119711q.setBackgroundResource(AbstractC27408c.zch_bg_button_outline);
                this.f143660I.f119711q.setTag(Boolean.TRUE);
                return;
            }
            this.f143660I.f119711q.setTag(Boolean.FALSE);
            RobotoButton robotoButton2 = this.f143660I.f119711q;
            View view = this.f7784p;
            AbstractC19074t.m100207e(view, "itemView");
            robotoButton2.setText(AbstractC26112n.m134366G(view, AbstractC27413h.zch_item_video_follow, new Object[0]));
            this.f143660I.f119711q.setBackgroundResource(AbstractC27408c.zch_bg_button_active_blue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.c0$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c extends C19071q implements InterfaceC18510q {

        /* renamed from: y */
        public static final c f143662y = new c();

        c() {
            super(3, C24984a0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zing/zalo/shortvideo/databinding/ZchItemSearchChannelBinding;", 0);
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            return m151520h((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }

        /* renamed from: h */
        public final C24984a0 m151520h(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(layoutInflater, "p0");
            return C24984a0.m129751c(layoutInflater, viewGroup, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.c0$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ b f143663q;

        /* renamed from: r */
        final /* synthetic */ C31157c0 f143664r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, C31157c0 c31157c0) {
            super(1);
            this.f143663q = bVar;
            this.f143664r = c31157c0;
        }

        /* renamed from: a */
        public final void m151521a(View view) {
            Channel channel;
            a m151509S;
            AbstractC19074t.m100208f(view, "it");
            Object tag = this.f143663q.f7784p.getTag();
            if (tag instanceof Channel) {
                channel = (Channel) tag;
            } else {
                channel = null;
            }
            if (channel != null && (m151509S = this.f143664r.m151509S()) != null) {
                m151509S.mo54775b(channel);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151521a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.c0$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        /* renamed from: a */
        public final void m151522a(View view) {
            View view2;
            Object obj;
            AbstractC19074t.m100208f(view, "it");
            Object parent = view.getParent();
            Channel channel = null;
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                obj = view2.getTag();
            } else {
                obj = null;
            }
            if (obj instanceof Channel) {
                channel = (Channel) obj;
            }
            if (channel != null) {
                C31157c0 c31157c0 = C31157c0.this;
                boolean z11 = !AbstractC19074t.m100204b(view.getTag(), Boolean.TRUE);
                a m151509S = c31157c0.m151509S();
                if (m151509S != null) {
                    m151509S.mo54776c(channel, z11);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151522a((View) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ C31157c0(Section section, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null) : section);
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        a aVar = this.f143658v;
        if (aVar == null || (m51171p = this.f143657u.m51171p()) == null) {
            return;
        }
        aVar.mo54774a(m51171p);
    }

    /* renamed from: R */
    public final void m151508R() {
        this.f143657u = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        m10008p();
    }

    /* renamed from: S */
    public final a m151509S() {
        return this.f143658v;
    }

    /* renamed from: T */
    public final Section m151510T() {
        return this.f143657u;
    }

    /* renamed from: U */
    public final Channel m151511U() {
        return this.f143659w;
    }

    /* renamed from: V */
    public final void m151512V(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            Channel channel = (Channel) this.f143657u.m51168m().get(i11);
            if (AbstractC19074t.m100204b(channel.m50769l(), str)) {
                channel.m50770l0(true);
                m10010r(i11, "true");
                return;
            }
        }
    }

    /* renamed from: W */
    public final void m151513W(String str) {
        AbstractC19074t.m100208f(str, "key");
        int mo10003k = mo10003k();
        for (int i11 = 0; i11 < mo10003k; i11++) {
            Channel channel = (Channel) this.f143657u.m51168m().get(i11);
            if (AbstractC19074t.m100204b(channel.m50769l(), str)) {
                channel.m50770l0(false);
                m10010r(i11, "false");
                return;
            }
        }
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        super.mo9990A(bVar, i11);
        bVar.mo151476i0(this.f143657u.m51168m().get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo9991B(b bVar, int i11, List list) {
        boolean m131390w;
        AbstractC19074t.m100208f(bVar, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        if (list.isEmpty()) {
            super.mo9991B(bVar, i11, list);
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m131390w = AbstractC25358n.m131390w(new String[]{"true", "false"}, it.next());
            if (m131390w) {
                bVar.m151519k0((Channel) this.f143657u.m51168m().get(i11));
            } else {
                super.mo9991B(bVar, i11, list);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        InterfaceC22715a m134373N = AbstractC26112n.m134373N(viewGroup, c.f143662y, false, 2, null);
        AbstractC19074t.m100205c(m134373N);
        b bVar = new b(this, (C24984a0) m134373N);
        View view = bVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        AbstractC26112n.m134407k0(view, new d(bVar, this));
        View findViewById = bVar.f7784p.findViewById(AbstractC27409d.btnFollow);
        AbstractC19074t.m100205c(findViewById);
        AbstractC26112n.m134407k0(findViewById, new e());
        return bVar;
    }

    /* renamed from: a0 */
    public final void m151517a0(a aVar) {
        this.f143658v = aVar;
    }

    /* renamed from: b0 */
    public final void m151518b0(Section section) {
        AbstractC19074t.m100208f(section, "<set-?>");
        this.f143657u = section;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f143657u.m51168m().size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31157c0(Section section) {
        super(10);
        AbstractC19074t.m100208f(section, "data");
        this.f143657u = section;
        this.f143659w = C27417l.f129055a.m140377a();
    }
}
